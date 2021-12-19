package com.example.app_popang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class android_main03 extends AppCompatActivity {

    Button sendBtn, receiveBtn, locationBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_main03);

        sendBtn = (Button) findViewById(R.id.button1);
        receiveBtn = (Button) findViewById(R.id.button2);
        locationBtn = (Button) findViewById(R.id.button_cont);

        //발송하기 버튼 클릭
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(android_main03.this, send_input_info04.class);
                startActivity(intent1);
                finish();
            }
        });

        //수령확인 버튼 클릭
//        receiveBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent(android_main03.this, send_info_img06.class);
//                startActivity(intent2);
//            }
//        });
    }
}