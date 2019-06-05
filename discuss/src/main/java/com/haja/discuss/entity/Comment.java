package com.haja.discuss.entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long cid;
    Long did;
    String text;

    public Comment() {
    }

    public Comment(Long did, String text) {
        this.did = did;
        this.text = text;
    }

    public Comment(String did, String text) {
        this.did = Long.valueOf(did);
        this.text = text;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", did=" + did +
                ", text='" + text + '\'' +
                '}';
    }
}
