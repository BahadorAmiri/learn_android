package com.example.learnandroid.learnkotlin.learnmvp.presenter

import android.util.Log
import com.example.learnandroid.learnkotlin.learnmvp.interfaces.MvpKotlinInterfaces

class MvpKotlinPresenter(var mvpKotlinInterfaces: MvpKotlinInterfaces) : MvpKotlinInterfaces {
    override fun onSuccess() {
        for (i in 0..9) {
            Log.d("newTAG", "onSuccess:   " + i)
        }
    }

    override fun onFailure() {
        for (i in 0..9) {
            Log.d("newTAG", "onFailure:    " + i)
        }
    }
}