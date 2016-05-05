package com.example.adam.criminalintent;

import java.util.UUID;

/**
 * Created by Adam on 2016-05-04.
 */
public class Crime {



    UUID mId;



    String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
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
}
