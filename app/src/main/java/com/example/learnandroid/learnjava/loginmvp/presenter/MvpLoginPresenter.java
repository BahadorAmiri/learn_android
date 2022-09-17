package com.example.learnandroid.learnjava.loginmvp.presenter;

import android.os.Handler;

import com.example.learnandroid.learnjava.loginmvp.model.MvpLoginModel;
import com.example.learnandroid.learnjava.loginmvp.model.User;

public class MvpLoginPresenter implements MvpLoginModel.PresenterImpl {

    MvpLoginModel.LoginView loginView;

    public MvpLoginPresenter(MvpLoginModel.LoginView loginView) {
        this.loginView = loginView;
    }


    @Override
    public void doLogin(User user) {

        loginView.showDialog();

        new Handler().postDelayed(() -> {

            if (user.getEmail().equals("bahador@gmail.com") && user.getPassword().equals("1234"))
                onSuccess();
            else
                onFailure();

        }, 2000);

    }

    @Override
    public void onSuccess() {
        loginView.hideDialog();
        loginView.onSuccess();
    }

    @Override
    public void onFailure() {
        loginView.hideDialog();
        loginView.onFailure();
    }
}
