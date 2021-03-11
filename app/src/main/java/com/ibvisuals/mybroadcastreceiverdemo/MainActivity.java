package com.ibvisuals.mybroadcastreceiverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callInbuilt(View view) {


    }

    public void callCustom(View view) {
        Intent i1 = new Intent();
        i1.setAction("com.ibvisuals.mybroadcastreceiverdemo");
        i1.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i1);

    }
}