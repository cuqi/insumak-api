package com.ws.insumak.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TravelCalculation {
    
    
    private LocalDate startDate;
    private LocalDate endDate;
    private int coverage;
    // 1 - VISA
    // 2 - KLASIK
    // 3 - KLASIK + 
    // 4 - Ekonomik
    // 5 - Ekonomik +

    public TravelCalculation() {}

    public TravelCalculation(LocalDate startDate, LocalDate endDate, int coverage) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.coverage = coverage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }

    public double calculateCoverage() {
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        double multiplier;
        switch (coverage) {
            case 1:
                multiplier = 123;
                break;
            case 2:
                multiplier = 130;
                break;
            case 3:
                multiplier = 140;
                break;
            case 4:
                multiplier = 150;
                break;
            case 5:
                multiplier = 155;
                break;
            default:
                throw new IllegalArgumentException("Invalid coverage type: " + coverage);
        }
        return days * multiplier;
    }
    
    
}
