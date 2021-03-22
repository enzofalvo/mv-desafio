package com.enzofalvo.mvchallenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mvchallangeController {
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        return new ModelAndView("index");
    }
}
