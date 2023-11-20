package com.example.uke47temperatur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    private Temp temp = new Temp();

    @GetMapping("/")
    public int returnTemp(@RequestParam String month) {
        return temp.getTemp(month);
    }
}
