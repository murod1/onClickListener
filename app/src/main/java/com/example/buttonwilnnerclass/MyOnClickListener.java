package com.example.buttonwilnnerclass;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
    this.mainActivity = mainActivity;

    }
    public void onClick(View v){
    mainActivity.mTextView1.setText("You Checked Murod's Button!");
    }
}
