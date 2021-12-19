package com.example.popang_mini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class send_info_correct05 extends AppCompatActivity {

    Button alertBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_info_correct05);

        alertBtn = (Button) findViewById(R.id.button_cont);

        //수령인에게 알림 버튼 클릭시 수행
        alertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(send_info_correct05.this, send_info_img06.class);
                startActivity(intent);
            }
        });

    }
}
