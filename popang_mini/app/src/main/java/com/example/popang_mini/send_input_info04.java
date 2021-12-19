package com.example.popang_mini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class send_input_info04 extends AppCompatActivity {

    Button send_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_input_info04);

        send_btn = (Button) findViewById(R.id.send_btn);

        //등록 버튼 클릭 시 수행
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(send_input_info04.this, send_info_correct05.class);
                startActivity(intent3);
            }
        });
    }
}
