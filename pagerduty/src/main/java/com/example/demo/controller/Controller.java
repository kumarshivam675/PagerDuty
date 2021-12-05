package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Value("${sms.alert.url}")
    private String smsAlertURL;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

//    @RequestMapping(value ="createTeam")
//    public String createTeam(@RequestParam String id, @RequestParam String name) {
//        return id + " " + name;
//    }

    @RequestMapping(value ="createTeam")
    public String createTeam(@RequestBody String body) {
        //parse json
        //create POJO
        //run validation
        //store into DB
        //return success or failure or teamID
        return body;
    }

    @RequestMapping(value ="raiseAlert")
    public String raiseAlert(@RequestParam String id) {
        //fetch all developers of the team
        // pick one randomly
        //raise alert

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(smsAlertURL, String.class);

        return result;
    }

}
