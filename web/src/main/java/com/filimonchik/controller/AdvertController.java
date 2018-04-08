package com.filimonchik.controller;

/**
 * Created by Lera on 10.04.2017.
 */
import com.filimonchik.bean.Advert;
import com.filimonchik.service.IAdvertService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Contacts controller.
 */
@Controller
public class AdvertController {

    @Autowired
    private IAdvertService advertService;
    private static final Logger logger = Logger.getLogger(AdvertController.class);

    /**
     * Return link to contacts page.
     * @return - link
     */
    @RequestMapping(value = "/advert")
    public String advertPage() {
        return "advert";
    }

    @RequestMapping(value = "/advert", method = RequestMethod.POST)
    public String Advertsement(
                         @RequestParam(value = "Color", required = false, defaultValue = "") String color,
                         @RequestParam(value = "Carbody", required = false, defaultValue = "") String carbody,
                         @RequestParam(value = "Description", required = false, defaultValue = "") String description,
                         @RequestParam(value = "Style", required = false, defaultValue = "") String style,
//                         @RequestParam(value = "User_id", required = false, defaultValue = "") String user_id,
                         Model model) {
        if (StringUtils.isEmpty(carbody) ||
                StringUtils.isEmpty(color) ||
                StringUtils.isEmpty(description)|| StringUtils.isEmpty(style)) {
      return "advert";

        }

//        logger.info(String.format("Tries to create advert : %s : %s : %s : %s",carbody, color, description, style));

        if (carbody.matches(Advert.Carbody_REGEX) && color.matches(Advert.Color_REGEX)&& description.matches(Advert.Description_REGEX)&& style.matches(Advert.Style_REGEX)) {
            advertService.createAdvert(carbody, color, description, style);
            return "index";

        }
        //Validation

        else {
            model.addAttribute("answer", "Incorrect data entered");
        }
        return "advert";
    }

}