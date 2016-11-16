package com.yjb.udacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String title = "";
        switch (view.getId()) {
            case R.id.button:
                title = mButton1.getText().toString().trim();
                break;
            case R.id.button2:
                title = mButton2.getText().toString().trim();
                break;
            case R.id.button3:
                title = mButton3.getText().toString().trim();
                break;
            case R.id.button4:
                title = mButton4.getText().toString().trim();
                break;
            case R.id.button5:
                title = mButton5.getText().toString().trim();
                break;
        }
        toast(title);
    }

    private void toast(String toastString) {
        Toast.makeText(this, "启动应用：" + toastString, Toast.LENGTH_SHORT).show();
    }
}
