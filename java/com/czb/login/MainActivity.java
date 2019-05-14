package com.czb.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Offline = findViewById(R.id.offine);

        Intent i = getIntent();
        String userdata = i.getStringExtra("a");
        TextView usertext = findViewById(R.id.usertext);
        usertext.setText("账号："+userdata);

        String passworddata = i.getStringExtra("b");
        TextView passwordtext = findViewById(R.id.paswordtext);
        passwordtext.setText("密码："+passworddata);

        Offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.czb.login.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }

}
