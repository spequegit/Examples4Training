package com.speque.springsecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecure {
    @GetMapping("/hi")
    public String sayHallo(){
        return "<H1>Hi Motherfucker!</H1>";
    }
}
