package com.example.learnandroid.learnkotlin.learnmvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnandroid.R
import com.example.learnandroid.learnkotlin.learnmvp.interfaces.MvpKotlinInterfaces
import com.example.learnandroid.learnkotlin.learnmvp.presenter.MvpKotlinPresenter

class MvpKotlinActivity : AppCompatActivity(), MvpKotlinInterfaces {

    lateinit var mvpKotlinPresenter: MvpKotlinPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpKotlinPresenter = MvpKotlinPresenter(this);

        var isTrue: Boolean = false;

        if (isTrue) {
            onSuccess()
        } else {
            onFailure()
        }

    }

    override fun onSuccess() {
        mvpKotlinPresenter.onSuccess()
    }

    override fun onFailure() {
        mvpKotlinPresenter.onFailure()
    }

}