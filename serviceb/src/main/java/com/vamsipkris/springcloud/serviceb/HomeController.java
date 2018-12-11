package com.vamsipkris.springcloud.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vamsikrishna on 11/12/18.
 */
@RestController
@RequestMapping("/rest")
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String home() {
        String ret="Service B: Message from Service A: ";
        String msgFromA = restTemplate.getForObject("http://servicea/rest/hello",String.class);
        return ret + msgFromA;
    }
}
