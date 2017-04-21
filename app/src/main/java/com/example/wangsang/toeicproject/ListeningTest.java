package com.example.wangsang.toeicproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

/**
 * Created by WANGSANG on 2017/04/08.
 */

public class ListeningTest extends AppCompatActivity {

    private Button part1;
    private Button part2;
    private Button part3;
    private Button part4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listening_test);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        part1 = (Button) findViewById(R.id.btnPart1);
        part2 = (Button) findViewById(R.id.btnPart2);
        part3 = (Button) findViewById(R.id.btnPart3);
        part4 = (Button) findViewById(R.id.btnPart4);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
