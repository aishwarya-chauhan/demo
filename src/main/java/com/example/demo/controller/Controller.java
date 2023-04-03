package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/retry")
public class Controller {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getItems(@RequestHeader(value = "retryCount", required = false) String number) throws InterruptedException {
        Thread.sleep(10000);
       // return new ResponseEntity<>("Bad", HttpStatus.SERVICE_UNAVAILABLE);
        return new ResponseEntity<>("Good", HttpStatus.OK);
    }

}
