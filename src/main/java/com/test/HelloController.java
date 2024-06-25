package com.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/HelloWorld")
    String home() {
        return "Hello World from HelloController !";
    }


}
