package com.example.demo.model.response.topic;

import com.example.demo.model.pagination.PageSearch;
import com.example.demo.model.validation.alphabetic.Alphabetic;

public class TopicSearch extends PageSearch {

    @Alphabetic
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
