package com.example.demo.models.request.topic;

import org.hibernate.validator.constraints.Length;
import java.time.LocalDate;

public class TopicRequest {

    @Length(min = 5, max = 50)
    private String name;

    private LocalDate startDate;

    private LocalDate endDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
