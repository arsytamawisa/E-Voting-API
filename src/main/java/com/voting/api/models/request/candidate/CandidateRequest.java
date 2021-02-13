package com.example.demo.models.request.candidate;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

public class CandidateRequest {

    @Length(min = 2, max = 100)
    private String name;

    @NotNull
    private Integer topicId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "CandidateRequest{" +
                "name='" + name + '\'' +
                ", topicId=" + topicId +
                '}';
    }
}
