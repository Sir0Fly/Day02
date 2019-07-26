package com.example.yaoyufei.day02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yaoyufei.day02.buider.MyComputer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyComputer buid = new MyComputer.Buider().color("兰").name("机械师").price(8000f).buid();
        System.out.println(buid.toString());
    }
}
