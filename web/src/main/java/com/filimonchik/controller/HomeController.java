package com.filimonchik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Class implements functionality of Spring controller
 * which is responsible for home page of web-site
 *
 * @author Dmitry V
 * @version 1.0
 */
@Controller
public class HomeController {

    /**
     * Method returns view with home page
     *
     * @return view
     */
    @RequestMapping(value = {"/", "/homePage"}, method = RequestMethod.GET)
    public String showHomePage() {
        return "homePage";
    }
}
