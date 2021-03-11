package com.ibvisuals.mybroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcast1 extends BroadcastReceiver {
    public CustomBroadcast1(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"First Receiver called",Toast.LENGTH_SHORT).show();
    }
}