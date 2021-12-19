package com.example.popang_mini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class send_info_img06 extends AppCompatActivity {

    Button callBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        callBtn = (Button) findViewById(R.id.button_cont);

        //로봇호출출
        callBtn.seOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(send_info_img06.this, android_main03.class);
                startActivity(intent);
            }
        });
    }
}
