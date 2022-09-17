package com.example.learnandroid.learnjava.loginmvp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.learnandroid.R;
import com.example.learnandroid.learnjava.loginmvp.model.MvpLoginModel;
import com.example.learnandroid.learnjava.loginmvp.model.User;
import com.example.learnandroid.learnjava.loginmvp.presenter.MvpLoginPresenter;

import java.util.Objects;

public class MvpLoginActivity extends AppCompatActivity implements View.OnClickListener, MvpLoginModel.LoginView {

    MvpLoginPresenter mvpLoginPresenter;
    ProgressDialog progressDialog;
    AppCompatEditText email_edittext, password_edittext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_login_activity);

        doStart();

    }

    private void doStart() {
        mvpLoginPresenter = new MvpLoginPresenter(this);
        email_edittext = findViewById(R.id.email_edittext);
        password_edittext = findViewById(R.id.password_edittext);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading ...");
    }

    @Override
    public void showDialog() {
        progressDialog.show();
    }

    @Override
    public void hideDialog() {
        progressDialog.hide();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "its OK", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, "email or password incorrect", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.onLoginBtn) {

            User user = new User();
            user.setEmail(Objects.requireNonNull(email_edittext.getText()).toString()).setPassword(Objects.requireNonNull(password_edittext.getText()).toString());
            mvpLoginPresenter.doLogin(user);
        }

    }
}
