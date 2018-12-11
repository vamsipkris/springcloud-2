package com.vamsipkris.springcloud.servicea;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vamsikrishna on 11/12/18.
 */
@RestController
@RequestMapping("/rest")
public class HomeController {
    @RequestMapping("/hello")
    public String home() {
        return "Hello I am Service A";
    }
}
