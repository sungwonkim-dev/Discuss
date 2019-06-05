package com.haja.discuss.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discussion")
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long did;
    private Long id;

    private String writer;
    private String title;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Discussion() {
    }

    public Discussion(Long id, String writer, String title, String content, Date created) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Discussion{" +
                "did=" + did +
                ", id=" + id +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}
