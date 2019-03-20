package com.neoware.neowareevents.controller;

import com.neoware.neowareevents.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mkarki
 */
@RestController
@RequestMapping(value = "/events")
public class EventsController {

    private final Producer producer;

    @Autowired
    EventsController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }
}
