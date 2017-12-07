package com.example.lenovo.Penang_Tourism;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Lenovo on 3/12/2017.
 */

public class Spots {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Spots(){
        mId=UUID.randomUUID();
        mDate= new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setId(UUID id) {
        mId = id;
    }
}
