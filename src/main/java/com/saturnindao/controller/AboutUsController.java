package com.saturnindao.controller;
/* Created by Saturnin Dao on 10/12/2021 12:15 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class AboutUsController {

    static Logger logger = Logger.getLogger(AboutUsController.class.getName());

    @RequestMapping("/about-us")
    public String displayFullDetails(){
        logger.log(Level.INFO,"Tentative d'affichage de l'a-propos");
        return "";
    }
}
