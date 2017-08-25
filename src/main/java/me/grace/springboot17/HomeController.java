package me.grace.springboot17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return"index";
    }

    @RequestMapping("/login")
    public String logon(){
        return"login";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
