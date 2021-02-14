package com.example.demo.model.request.topic;

import com.example.demo.model.pagination.PageSearch;

public class TopicSearch extends PageSearch {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
