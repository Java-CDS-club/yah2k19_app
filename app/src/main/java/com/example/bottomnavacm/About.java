package com.example.bottomnavacm;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        textView1 = (TextView) findViewById(R.id.head);
        textView2 = (TextView) findViewById(R.id.para);


    }
}
