package com.czb.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    Intent intent;
    private EditText usernameEdit;
    private EditText paswordEdit;
    private Button login;

    public EditText getUsernameEdit() {
        return usernameEdit;
    }

    public EditText getPaswordEdit() {
        return paswordEdit;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usernameEdit = findViewById(R.id.username);
        paswordEdit= findViewById(R.id.pasword);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String username = usernameEdit.getText().toString();
                String password = paswordEdit.getText().toString();

                if ((username.equals("admin")&&password.equals("123456"))||username.equals("shadiao")&&password.equals("meicuo")){
                    intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("a",username);
                    intent.putExtra("b",password);
                    startActivity(intent);
                    finish();
                }else
                    Toast.makeText(LoginActivity.this,"输入错误，请重新输入",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
