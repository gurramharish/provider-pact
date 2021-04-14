package com.hans.datevalidator.controller;

import com.hans.datevalidator.DateResponse;
import com.hans.datevalidator.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/provider/validDate")
    public DateResponse getValidDate(@RequestParam(name = "date") String date) {
        return dateService.getValidDate(date);
    }

    @GetMapping("/provider/sayHello")
    public String sayHello(@RequestParam(name = "date") String date) {
        return "{name: 'Hello'}";
    }
}
