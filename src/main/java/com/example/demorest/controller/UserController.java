package com.example.demorest.controller;

import com.example.demorest.domain.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
@RequestMapping("/api")
public class UserController {

    private RestTemplate restTemplate = new RestTemplate();


    @RequestMapping( value = "/user/info", method = RequestMethod.GET)
    public User getUser() {
        String resourceUrl = "https://api.github.com/users/octocat";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<User> entity = new HttpEntity<User>(headers);
        ResponseEntity<User> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, User.class);

        return response.getBody();
    }
}
