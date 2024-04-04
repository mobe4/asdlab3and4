package com.example.asdlab34;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/","elibrary","/elibrary/home"})
    public String displayHomePge(){
        return "home/index";
    }
}
