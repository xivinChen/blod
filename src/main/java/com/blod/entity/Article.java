package com.blod.entity;

import java.util.Date;

public class Article {
    private Integer artId;

    private String artTitle;

    private String artUsername;

    private Date artDate;

    private Integer artReadnumber;

    private Integer artDianzan;

    private String artImage;

    private Integer artCtgId;

    private String artDesc;

    private String artContent;

    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    public String getArtUsername() {
        return artUsername;
    }

    public void setArtUsername(String artUsername) {
        this.artUsername = artUsername == null ? null : artUsername.trim();
    }

    public Date getArtDate() {
        return artDate;
    }

    public void setArtDate(Date artDate) {
        this.artDate = artDate;
    }

    public Integer getArtReadnumber() {
        return artReadnumber;
    }

    public void setArtReadnumber(Integer artReadnumber) {
        this.artReadnumber = artReadnumber;
    }

    public Integer getArtDianzan() {
        return artDianzan;
    }

    public void setArtDianzan(Integer artDianzan) {
        this.artDianzan = artDianzan;
    }

    public String getArtImage() {
        return artImage;
    }

    public void setArtImage(String artImage) {
        this.artImage = artImage == null ? null : artImage.trim();
    }

    public Integer getArtCtgId() {
        return artCtgId;
    }

    public void setArtCtgId(Integer artCtgId) {
        this.artCtgId = artCtgId;
    }

    public String getArtDesc() {
        return artDesc;
    }

    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc == null ? null : artDesc.trim();
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent == null ? null : artContent.trim();
    }
}