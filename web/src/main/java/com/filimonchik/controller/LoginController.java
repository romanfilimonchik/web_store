package com.filimonchik.controller;

import com.filimonchik.bean.User;
import com.filimonchik.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Contacts controller.
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService userService;
    private static final Logger logger = Logger.getLogger(LoginController.class);

    /**
     * Return link to signUp page.
     *
     * @return - link
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    /**
     * Login command
     * @param login - login
     * @param password - password
     * @param session - HttpSession
     * @return - link
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@RequestParam("Login") String login,
                          @RequestParam("Password") String password,
                          HttpSession session) {
        if (StringUtils.isEmpty(login) || StringUtils.isEmpty(password)) {
            //Clear the answer
            session.removeAttribute("answer");
            return "login";
        }
        logger.info(String.format("Tries to enter: %s", login));
        //check data with regex
        if (login.matches(User.LOGIN_REGEX) && password.matches(User.PASSWORD_REGEX)) {
            //if alright then go to main page
            if (checkInDB(login, password, session)) {
                return "index";
            }
        }
        //else show the message
        session.setAttribute("answer", "Login or Password are not correct");
        return "login";
    }

    /**
     * Check data in db
     *
     * @param login    - login
     * @param password - password
     * @param session  - HttpSession
     * @return - true if such user is exist
     */
    private boolean checkInDB(String login, String password, HttpSession session) {
        User user = userService.get(login);
        if (user == null) {
            return false;
        }
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {

            session.setAttribute("user", user);
            logger.info("Entered: " + user);
            return true;
        } else {
            return false;
        }
    }
}