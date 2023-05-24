package ru.belosludtsev.practice15.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class Home{
    @GetMapping()
    public String home(){
        return "home";
    }
}
