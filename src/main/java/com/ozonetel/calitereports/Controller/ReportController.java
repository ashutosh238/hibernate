/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozonetel.calitereports.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sharma
 */
@Controller
public class ReportController {
    @RequestMapping(value="/search",method=RequestMethod.GET)
    public String login(String username,String password){
        System.out.println("Im INside rest Service");
        return "SUCCESS";
    }
}
