package com.bignerdranch.android.geoquiz;

/**
 * Created by slb on 2016/11/26.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId) {

        mTextResId = textResId;
    }

    public Question(int mTextResId, boolean answerTrue){
        mTextResId = mTextResId;
        mAnswerTrue = answerTrue;


    }
}
