package com.example.TicketTrain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("availabletrains")
    public String index(){
        return "availabletrains.html";
    }

}
