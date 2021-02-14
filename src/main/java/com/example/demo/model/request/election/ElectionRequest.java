package com.example.demo.model.request.election;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

public class ElectionRequest {

    @Length(min = 2, max = 100)
    private String elector;

    @NotNull
    private Integer candidateId;

    @NotNull
    private Integer topicId;


    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getElector() {
        return elector;
    }

    public void setElector(String elector) {
        this.elector = elector;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    @Override
    public String toString() {
        return "ElectionRequest{" +
                "elector='" + elector + '\'' +
                ", candidateId=" + candidateId +
                ", topicId=" + topicId +
                '}';
    }
}
