package com.example.datou.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2,text3;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);

        text1=(TextView) findViewById(R.id.EditText01);
        text2=(TextView) findViewById(R.id.EditText02);
        text3=(TextView) findViewById(R.id.TextView03);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text1.getText().toString().equals("")||text2.getText().toString().equals(""))
                    text3.setText("信息不全");
                else
                    if(text1.getText().toString().equals("fyf"))
                        if(text2.getText().toString().equals("05"))
                            text3.setText("登录成功");
                        else
                            text3.setText("密码错误");
                    else
                        text3.setText("用户不存在");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
                text3.setText("");
            }
        });
    }


}
