package com.ws.insumak.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.insumak.model.TravelCalculation;

@RestController
public class TravelController {

    @PostMapping("/calculate")
    public String calculatePremium(@RequestBody TravelCalculation travelDetails) {
        double premium = travelDetails.calculateCoverage();
        return "The calculated premium is: " + premium + "den.";
    }

}
