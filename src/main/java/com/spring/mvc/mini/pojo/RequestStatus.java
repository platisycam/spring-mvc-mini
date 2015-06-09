package com.spring.mvc.mini.pojo;

import java.util.Date;

public class RequestStatus {

    int id;
    Date submitDate;
    Date commitDate;
    Date holdDate;
    ObjectClassesType objectClassesType;
    UserInfo userinfo;
    StatusType status;
    String comments;

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public Date getHoldDate() {
        return holdDate;
    }

    public void setHoldDate(Date holdDate) {
        this.holdDate = holdDate;
    }

    public UserInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInfo userinfo) {
        this.userinfo = userinfo;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public ObjectClassesType getObjectClassesType() {
        return objectClassesType;
    }

    public void setObjectClassesType(ObjectClassesType objectClassesType) {
        this.objectClassesType = objectClassesType;
    }

    public int getmocrid() {
        return id;
    }

    public void setmocrid(int mocrid) {
        this.id = mocrid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "RequestStatus [id=" + id + ", submitDate="
                + submitDate + ", commitDate=" + commitDate + ", holdDate="
                + holdDate + ", enrichObjectClassListType=" + objectClassesType
                + ", userinfo=" + userinfo + ", status=" + status
                + ", comments=" + comments + "]";
    }
}
