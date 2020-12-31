package com.world_tech_point.worldwide_knowledge.quizContainers;

public class ContentQuestionModel {

    private String mQuestion;
    private String mOption1;
    private String mOption2;
    private String mOption3;
    private String mOption4;
    private String mAnswer;

    public ContentQuestionModel(String mQuestion, String mOption1, String mOption2, String mOption3, String mOption4, String mAnswer) {
        this.mQuestion = mQuestion;
        this.mOption1 = mOption1;
        this.mOption2 = mOption2;
        this.mOption3 = mOption3;
        this.mOption4 = mOption4;
        this.mAnswer = mAnswer;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public String getmOption1() {
        return mOption1;
    }

    public void setmOption1(String mOption1) {
        this.mOption1 = mOption1;
    }

    public String getmOption2() {
        return mOption2;
    }

    public void setmOption2(String mOption2) {
        this.mOption2 = mOption2;
    }

    public String getmOption3() {
        return mOption3;
    }

    public void setmOption3(String mOption3) {
        this.mOption3 = mOption3;
    }

    public String getmOption4() {
        return mOption4;
    }

    public void setmOption4(String mOption4) {
        this.mOption4 = mOption4;
    }

    public String getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }
}
