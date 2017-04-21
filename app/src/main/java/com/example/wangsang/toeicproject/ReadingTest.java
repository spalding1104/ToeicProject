package com.example.wangsang.toeicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by WANGSANG on 2017/04/08.
 */

public class ReadingTest extends AppCompatActivity {

    private Button part5;
    private Button part6;
    private Button part7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reading_test);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        part5 = (Button) findViewById(R.id.btnPart5);
        part6 = (Button) findViewById(R.id.btnPart6);
        part7 = (Button) findViewById(R.id.btnPart7);

        part5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReadingTest.this, ReadingContent.class));
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
