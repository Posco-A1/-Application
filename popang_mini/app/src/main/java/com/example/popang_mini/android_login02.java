package com.example.popang_mini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class android_login02 extends AppCompatActivity {

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_login02);

        loginBtn = (Button) findViewById(R.id.button_cont);

        //로그인 버튼 클릭 시 다음 화면으로 이동
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android_login02.this, android_main03.class);
                startActivity(intent);
            }
        });
    }
}
