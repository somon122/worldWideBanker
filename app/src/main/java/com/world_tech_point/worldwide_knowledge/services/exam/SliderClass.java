package com.world_tech_point.worldwide_knowledge.services.exam;

public class SliderClass {

    private int mImage;
    private String mTitle;
    private String mDesc;
    private String mBtnTitle;

    public SliderClass() {
    }

    public SliderClass(int mImage, String mTitle, String mDesc, String mBtnTitle) {
        this.mImage = mImage;
        this.mTitle = mTitle;
        this.mDesc = mDesc;
        this.mBtnTitle = mBtnTitle;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public String getmBtnTitle() {
        return mBtnTitle;
    }
}
