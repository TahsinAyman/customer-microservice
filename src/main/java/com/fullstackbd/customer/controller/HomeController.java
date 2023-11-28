package com.fullstackbd.customer.controller;

import com.fullstackbd.customer.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    /**
     * This Is the home url of customer microservice
     *
     * @method GET
     * @url /
     * @status_code 202
     * @return Message
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Message home() {
        return Message
                .builder()
                .message("Welcome to Spring boot customer microservice")
                .statusCode(HttpStatus.OK.value())
                .build();
    }
}
