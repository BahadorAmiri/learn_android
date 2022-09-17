package com.example.learnandroid.learnjava.learnmvp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.learnandroid.R;
import com.example.learnandroid.learnjava.learnmvp.interfaces.MvpJavaInterfaces;
import com.example.learnandroid.learnjava.learnmvp.presenter.MvpJavaPresenter;

public class MvpJavaActivity extends AppCompatActivity implements MvpJavaInterfaces {

    MvpJavaPresenter mvpMainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mvpMainPresenter = new MvpJavaPresenter(this);

        getData();

    }

    private void getData() {

        /*   get data from server  */
//        ...
//        ...
//        ...
//        ...

        boolean isTrue = true;

        if ( isTrue ) {
            onSuccess();
        } else {
            onFailure();
        }

    }

    @Override
    public void onSuccess() {
        mvpMainPresenter.onSuccess();
    }

    @Override
    public void onFailure() {
        mvpMainPresenter.onFailure();
    }
}
