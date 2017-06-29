package com.itss.shops.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    private static final long serialVersionUID = -1369947388623925839L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", length = 19)
    private Date createdTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_time", length = 19)
    private Date updatedTime;

    @PrePersist
    public void prePersist() {
        createdTime = updatedTime = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        updatedTime = new Date();
    }

}
