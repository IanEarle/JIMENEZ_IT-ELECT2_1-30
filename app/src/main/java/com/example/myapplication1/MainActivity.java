package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//import javax.swing.text.html.HTML;

//import sun.rmi.runtime.Log;

public class MainActivity extends AppCompatActivity
{
    String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.v(tag, "This is a verbose log.");
        Log.d(tag, "This is a debug log.");
        Log.i(tag, "This is an info log.");
        Log.w(tag, "This is a warning log.");
        Log.e(tag, "This is an error log.");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i(tag,"Button Clicked!");
                Intent intent = new Intent(MainActivity.this, MainActivity2Linear.class);
                startActivity(intent);


            }
        });

    }
}