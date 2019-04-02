package com.izol.caripom;

/**
 * Created by IZOL on 3/10/2019.
 */

public class Objek {
    private String mObjekName;
    private String mKetObjek;
    private int mImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Objek(String objekName, String ketObjek) {
        mObjekName = objekName;
        mKetObjek = ketObjek;
    }

    public Objek(String objekName, String ketObjek, int imageResource) {
        mObjekName = objekName;
        mKetObjek = ketObjek;
        mImageResourceId = imageResource;
    }

    public String getObjekName() {
        return mObjekName;
    }

    public String getKetObjek() {
        return mKetObjek;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
