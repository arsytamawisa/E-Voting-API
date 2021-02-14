package com.example.demo.model.response.candidate;

import com.example.demo.model.response.topic.TopicResponse;

public class CandidateResponse {
    private Integer id;
    private String name;
    private TopicResponse topic;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopicResponse getTopic() {
        return topic;
    }

    public void setTopic(TopicResponse topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "CandidateResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topic=" + topic +
                '}';
    }
}
