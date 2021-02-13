package com.example.demo.entities;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(length = 50)
    private String elector;

//    @ManyToOne
//    @JoinColumn(name = "topic_id")
//    private Topic topicId;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "election_date", nullable = false)
    private LocalDateTime electionDate;



    @PrePersist
    public void prePresist() {
        this.electionDate = LocalDateTime.now();
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

//    public Topic getTopicId() {
//        return topicId;
//    }
//
//    public void setTopicId(Topic topicId) {
//        this.topicId = topicId;
//    }


    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public LocalDateTime getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(LocalDateTime electionDate) {
        this.electionDate = electionDate;
    }

    @Override
    public String toString() {
        return "Election{" +
                "id=" + id +
                ", elector='" + elector + '\'' +
                ", candidateId=" + candidate +
                ", electionDate=" + electionDate +
                '}';
    }
}
