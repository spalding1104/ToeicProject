package com.example.wangsang.toeicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by WANGSANG on 2017/04/15.
 */

public class Result  extends AppCompatActivity {

    private TextView txvScore;
    private TextView txvEvaluate;
    private Button btnTryAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txvScore = (TextView) findViewById(R.id.txvScore);
        txvEvaluate = (TextView) findViewById(R.id.txvEvaluate);
        btnTryAgain = (Button) findViewById(R.id.btnTry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("mykey");

        txvScore.setText("Your score: " + score + " out of " + new QuestionAdapter().getQuestions().length );
        if(score == 4){
            txvEvaluate.setText("You're the true fan of Liverpool FC. We're so proud of you, A.Quốc. This is a gift for you: XV-802");
        } else{txvEvaluate.setText("You're D.Hưng from 5 moutains");}

        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result.this, ReadingContent.class));
                Result.this.finish();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
