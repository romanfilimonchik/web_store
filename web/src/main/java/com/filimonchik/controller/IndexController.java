package com.filimonchik.controller;

import com.filimonchik.bean.Advert;
import com.filimonchik.service.IAdvertService;
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
public class IndexController {

    @Autowired
    private IAdvertService advertService;
    private static final Logger logger = Logger.getLogger(IndexController.class);
    /**
     * Return link to contacts page.
     * @return - link
     */
    @RequestMapping(value = "/index")
    public String indexPage(Model model) {

        List<Advert> adverts = advertService.getAll();
        logger.error("Adverts: " + adverts);
        model.addAttribute("adverts", adverts);
        logger.error("ModelAttribute: " + adverts);

        return "index";
    }
}