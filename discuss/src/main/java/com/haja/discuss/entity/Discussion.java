package com.haja.discuss.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discussion")
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long did;

    private String uid;
    private String writer;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Discussion(){}
    public Discussion(String uid, String writer, String content, Date created) {
        this.uid = uid;
        this.writer = writer;
        this.content = content;
        this.created = created;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Discussion{" +
                "did=" + did +
                ", uid='" + uid + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
