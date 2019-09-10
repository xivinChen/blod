package com.blod.entity;

public class Critique {
    private Integer ctId;

    private Integer ctArtId;

    private String ctTime;

    private String ctUsername;

    private String ctEmail;

    private String ctContent;

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getCtArtId() {
        return ctArtId;
    }

    public void setCtArtId(Integer ctArtId) {
        this.ctArtId = ctArtId;
    }

    public String getCtTime() {
        return ctTime;
    }

    public void setCtTime(String ctTime) {
        this.ctTime = ctTime == null ? null : ctTime.trim();
    }

    public String getCtUsername() {
        return ctUsername;
    }

    public void setCtUsername(String ctUsername) {
        this.ctUsername = ctUsername == null ? null : ctUsername.trim();
    }

    public String getCtEmail() {
        return ctEmail;
    }

    public void setCtEmail(String ctEmail) {
        this.ctEmail = ctEmail == null ? null : ctEmail.trim();
    }

    public String getCtContent() {
        return ctContent;
    }

    public void setCtContent(String ctContent) {
        this.ctContent = ctContent == null ? null : ctContent.trim();
    }
}