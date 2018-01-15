package com.example.sunmin.accountbook;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sunmin on 2018/1/5.
 */

public class Account {
    private UUID mId;
    private String mTailNo;
    private Boolean mBank;
    private String mOwner;
    private Date mDate;


    public Account(){

        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTailNo() {
        return mTailNo;
    }

    public void setTailNo(String tailNo) {
        mTailNo = tailNo;
    }

    public Boolean getBank() {
        return mBank;
    }

    public void setBank(Boolean bank) {
        mBank = bank;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }
}
