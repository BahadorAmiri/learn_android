package com.example.learnandroid.learnjava.learnmvp.presenter;

import android.util.Log;

import com.example.learnandroid.learnjava.learnmvp.interfaces.MvpJavaInterfaces;

public class MvpJavaPresenter implements MvpJavaInterfaces {

    MvpJavaInterfaces mvpJavaInterfaces;

    public MvpJavaPresenter(MvpJavaInterfaces mvpJavaInterfaces) {
        this.mvpJavaInterfaces = mvpJavaInterfaces;
    }

    @Override
    public void onSuccess() {
        for (int i = 0; i < 10; i++) {
            Log.d("newTAG", "onSuccess:    " + i);
        }
    }

    @Override
    public void onFailure() {
        for (int i = 0; i < 10; i++) {
            Log.d("newTAG", "onFailure:    " + i);
        }
    }
}
