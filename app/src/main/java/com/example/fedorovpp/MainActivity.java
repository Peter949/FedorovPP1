package com.example.fedorovpp;
//Открытие приложения, начальная загрузка экрана, которая длится 2 секунды и открывает другое activity
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    //При создании открывается activity_main и идет таймер 2 секунды на загрузку.
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Sign_in.class);
                startActivity(intent);
            }
        };
        timer.schedule(timerTask, 2000L);
    }
}