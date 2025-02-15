package com.scaler.productservicenov24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/sayHello/{name}/{numberOfTimes}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("numberOfTimes") int numberOfTimes) {
        String response = "";
        for(int i = 0; i < numberOfTimes; i++) {
            String s = "Hello " + name + "!<br>";
            response += s;
        }
        return response;
    }

    @GetMapping("/sayGoodBye")
    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
