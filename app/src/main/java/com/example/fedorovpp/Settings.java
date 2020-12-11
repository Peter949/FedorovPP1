package com.example.fedorovpp;
//Экран настроек пользователя
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity implements View.OnClickListener
{
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        back = findViewById(R.id.set);
        back.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        //Intent intent = new Intent(this, Map.class);
        //startActivity(intent);
    }
}