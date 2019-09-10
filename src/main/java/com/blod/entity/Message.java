package com.blod.entity;

public class Message {
    private Long msgId;

    private String msgUsername;

    private String msgTime;

    private String msgName;

    private String msgEmail;

    private String msgContent;

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getMsgUsername() {
        return msgUsername;
    }

    public void setMsgUsername(String msgUsername) {
        this.msgUsername = msgUsername == null ? null : msgUsername.trim();
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime == null ? null : msgTime.trim();
    }

    public String getMsgName() {
        return msgName;
    }

    public void setMsgName(String msgName) {
        this.msgName = msgName == null ? null : msgName.trim();
    }

    public String getMsgEmail() {
        return msgEmail;
    }

    public void setMsgEmail(String msgEmail) {
        this.msgEmail = msgEmail == null ? null : msgEmail.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }
}