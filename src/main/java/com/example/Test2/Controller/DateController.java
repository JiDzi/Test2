package com.example.Test2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateController {
        @GetMapping("/time")
        public LocalTime getTime(){
            return LocalTime.now();
        }
}
