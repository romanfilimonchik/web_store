package com.filimonchik.controller;


import com.filimonchik.bean.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Logout controller
 */
@Controller
public class LogoutController {
    private static Logger logger = Logger.getLogger(LogoutController.class);

    /**
     * Do logout
     * @param session - HttpSession
     * @return - link
     */
    @RequestMapping("/logout")
    public String execute(HttpSession session) {
        User user = (User) session.getAttribute("user");
        logger.info("logout: " + user.getLogin());
        session.invalidate();
        return "homePage";
    }
}
