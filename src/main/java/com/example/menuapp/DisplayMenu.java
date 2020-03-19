package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_menu);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_3);

        TextView textView = findViewById(R.id.break_dis);
        TextView textview2 = findViewById(R.id.lunch_dis);
        TextView textView3 = findViewById(R.id.dinner_dis);

        textview2.setText(message2);
        textView3.setText(message3);
        textView.setText(message);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
