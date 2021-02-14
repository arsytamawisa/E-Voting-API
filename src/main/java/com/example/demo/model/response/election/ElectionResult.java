package com.example.demo.model.response.election;


public class ElectionResult {
    private Integer id;
    private String name;
    private Integer totalVote;


    public ElectionResult(Integer id, String name, Integer totalVote) {
        this.id = id;
        this.name = name;
        this.totalVote = totalVote;
    }

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

    public Integer getTotalVote() {
        return totalVote;
    }

    public void setTotalVote(Integer totalVote) {
        this.totalVote = totalVote;
    }

    @Override
    public String toString() {
        return "ElectionResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalVote=" + totalVote +
                '}';
    }
}
