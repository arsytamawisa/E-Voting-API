package com.example.demo.models.request.election;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

public class ElectionRequest {

    @Length(min = 2, max = 100)
    private String elector;

    @NotNull
    private Integer candidateId;


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
                '}';
    }
}
