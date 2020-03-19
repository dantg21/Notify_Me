package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.MenuApp.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_2 = "com.example.android.MenuApp.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_3= "com.example.android.MenuApp.extra.MESSAGE";

    private EditText breakfast_message;
    private EditText lunch_message;
    private EditText dinner_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        breakfast_message = findViewById(R.id.editText2);
        lunch_message = findViewById(R.id.editText3);
        dinner_message = findViewById(R.id.editText4);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, DisplayMenu.class);
        String message_breakfast = breakfast_message.getText().toString();
        String message_lunch = lunch_message.getText().toString();
        String message_dinner = dinner_message.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message_breakfast);
        intent.putExtra(EXTRA_MESSAGE_2, message_lunch);
        intent.putExtra(EXTRA_MESSAGE_3, message_dinner);
        startActivity(intent);
    }
}
