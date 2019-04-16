package com.baidu.entity;

public class TbCriminal {
    private Integer cid;

    private String criminalName;

    private String cardNo;

    private Integer criminalAge;

    private String criminalSex;

    private String criminalDesc;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCriminalName() {
        return criminalName;
    }

    public void setCriminalName(String criminalName) {
        this.criminalName = criminalName == null ? null : criminalName.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Integer getCriminalAge() {
        return criminalAge;
    }

    public void setCriminalAge(Integer criminalAge) {
        this.criminalAge = criminalAge;
    }

    public String getCriminalSex() {
        return criminalSex;
    }

    public void setCriminalSex(String criminalSex) {
        this.criminalSex = criminalSex == null ? null : criminalSex.trim();
    }

    public String getCriminalDesc() {
        return criminalDesc;
    }

    public void setCriminalDesc(String criminalDesc) {
        this.criminalDesc = criminalDesc == null ? null : criminalDesc.trim();
    }
}