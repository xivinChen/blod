package com.blod.entity;

import java.util.Date;

public class Dianzan {
    private Integer ckId;

    private String ckArtId;

    private String ckIp;

    private Date ckTime;

    public Integer getCkId() {
        return ckId;
    }

    public void setCkId(Integer ckId) {
        this.ckId = ckId;
    }

    public String getCkArtId() {
        return ckArtId;
    }

    public void setCkArtId(String ckArtId) {
        this.ckArtId = ckArtId == null ? null : ckArtId.trim();
    }

    public String getCkIp() {
        return ckIp;
    }

    public void setCkIp(String ckIp) {
        this.ckIp = ckIp == null ? null : ckIp.trim();
    }

    public Date getCkTime() {
        return ckTime;
    }

    public void setCkTime(Date ckTime) {
        this.ckTime = ckTime;
    }
}