package com.haja.discuss.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "count")
public class Count {

    @Id
    private Long did;
    private int visited;
    private int recommended;

    public Count() {
    }

    public Count(Long did) {
        this.did = did;
    }

    public Count(Long did, int visited, int recommended) {
        this.did = did;
        this.visited = visited;
        this.recommended = recommended;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getRecommended() {
        return recommended;
    }

    public void setRecommended(int recommended) {
        this.recommended = recommended;
    }

    @Override
    public String toString() {
        return "Count{" +
                "did=" + did +
                ", visited=" + visited +
                ", recommended=" + recommended +
                '}';
    }
}
