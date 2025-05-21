package com.arsoft.databindingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.arsoft.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person("Jack", "jack@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        activityMainBinding.setPerson(p1);

        // Binding the Handler for Click Events
        myClickHandler = new MyClickHandler(this);
        activityMainBinding.setClickHandler(myClickHandler);


    }
}