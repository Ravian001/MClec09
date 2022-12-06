package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv1 = findViewById(R.id.textView1);


        Intent intent = getIntent();
//textViewReceiveMessage.setText(intent.getStringExtra("WelcomeMessage"));
       // String number = intent.getStringExtra("tv");
        //tv1.setText(Integer.toString(number));
       // tv1.setText(number);


      /*  Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            //The key argument here must match that used in the other activity

            tv1.setText(value);
        }
*/


//textViewReceiveMessage.setText(intent.getStringExtra("WelcomeMessage"));
      
        String num = intent.getStringExtra("abc");
        tv1.setText(num);



    }
}