package com.example.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String getDemo(){
        return ("<h1>This is demo</h1>");
    }

    @GetMapping("/one")
    public String getDemoOne(){
        return ("<h1>This is demo One</h1>");
    }

    @GetMapping("/two")
    public String getDemoTwo(){
        return ("<h1>This is demo Two</h1>");
    }

    @GetMapping("/three")
    public String getDemoThree(){
        return ("<h1>This is demo Three</h1>");
    }
}
