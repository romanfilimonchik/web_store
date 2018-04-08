package com.filimonchik.controller;

import com.filimonchik.bean.User;
import com.filimonchik.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Contacts controller.
 */
@Controller
public class ShowUsersController {

    @Autowired
    private IUserService userService;
    private static final Logger logger = Logger.getLogger(ShowUsersController.class);

    /**
     * Return link to contacts page.
     * @return - link
     */
    @RequestMapping(value = "/showusers")
    public String showUsersPage(Model model) {

        List<User> users = userService.getAll();
        logger.error("Users: " + users);
        model.addAttribute("users", users);
        logger.error("ModelAttribute: " + users);
        return "showusers";
    }
}
