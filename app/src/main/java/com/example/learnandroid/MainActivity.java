package com.example.learnandroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.learnandroid.databinding.ActivityMainBinding;
import com.example.learnandroid.learnjava.loginmvp.model.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User().setEmail("bahador@gmail.com").setPassword("1234");
        activityMainBinding.setUserData(user);

    }
}
