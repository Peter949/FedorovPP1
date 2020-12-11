package com.example.fedorovpp;
//Экран истории пользователя
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity implements View.OnClickListener
{
    ImageView back;
    @Override
    //Открытие активити history при обращении к нему и вернуться с помощью функции onClick, которая работает объектной переменной back
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        back = findViewById(R.id.his);
        back.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.his:
            {
                //Intent intent = new Intent(this, Map.class);
                //startActivity(intent);
            }
        }
    }
}