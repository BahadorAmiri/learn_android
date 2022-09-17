package com.example.learnandroid.learnjava.loginmvp.model;

public interface MvpLoginModel {

    interface LoginView {
        void showDialog();

        void hideDialog();

        void onSuccess();

        void onFailure();
    }

    interface PresenterImpl {
        void doLogin(User user);

        void onSuccess();

        void onFailure();
    }

}