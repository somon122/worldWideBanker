package com.world_tech_point.worldwide_knowledge.work_places.short_question;

public class ThreeItemModel {


    private String mQuestion;
    private String mAns;
    private String mMoreQ;


    public ThreeItemModel(String mQuestion, String mAns, String mMoreQ) {
        this.mQuestion = mQuestion;
        this.mAns = mAns;
        this.mMoreQ = mMoreQ;
    }

    public ThreeItemModel(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public ThreeItemModel(String mQuestion, String mAns) {
        this.mQuestion = mQuestion;
        this.mAns = mAns;
    }


    public String getmQuestion() {
        return mQuestion;
    }

    public String getmAns() {
        return mAns;
    }

    public String getmMoreQ() {
        return mMoreQ;
    }
}
