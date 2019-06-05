package com.haja.discuss.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interested")
public class Interested {

    @Id
    Long iid;
    Long uid;
    Long did;


    public Interested(Long iid, Long uid, Long did) {
        this.iid = iid;
        this.uid = uid;
        this.did = did;
    }

    public Interested(Long uid, Long did) {
        this.uid = uid;
        this.did = did;
    }

    public Interested() {
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Interested{" +
                "uid=" + uid +
                ", did=" + did +
                '}';
    }
}
