package com.example.demo.model.response.election;

import java.time.LocalDateTime;

public class ElectionResponse {
    private Integer id;
    private String elector;
    private Integer candidateId;
    private Integer topicId;
    private LocalDateTime electionDate;

    public ElectionResponse(Integer id, String elector, Integer candidateId, Integer topicId, LocalDateTime electionDate) {
        this.id = id;
        this.elector = elector;
        this.candidateId = candidateId;
        this.topicId = topicId;
        this.electionDate = electionDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(LocalDateTime electionDate) {
        this.electionDate = electionDate;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "ElectionResponse{" +
                "id=" + id +
                ", elector='" + elector + '\'' +
                ", candidateId=" + candidateId +
                ", electionDate=" + electionDate +
                '}';
    }
}