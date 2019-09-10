package com.blod.entity;

public class Articlecategory {
    private Integer ctgId;

    private String ctgName;

    private String ctgDesc;

    public Integer getCtgId() {
        return ctgId;
    }

    public void setCtgId(Integer ctgId) {
        this.ctgId = ctgId;
    }

    public String getCtgName() {
        return ctgName;
    }

    public void setCtgName(String ctgName) {
        this.ctgName = ctgName == null ? null : ctgName.trim();
    }

    public String getCtgDesc() {
        return ctgDesc;
    }

    public void setCtgDesc(String ctgDesc) {
        this.ctgDesc = ctgDesc == null ? null : ctgDesc.trim();
    }
}