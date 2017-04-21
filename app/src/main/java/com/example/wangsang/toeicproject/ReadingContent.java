package com.example.wangsang.toeicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by WANGSANG on 2017/04/14.
 */

public class ReadingContent extends AppCompatActivity {

    QuestionAdapter mQuestionAdapter= new QuestionAdapter();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private int mScore = 0;
    private int mQuestionNumber = 0;
    private String mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reading_content);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mQuestionView = (TextView) findViewById(R.id.txvQuestion);

        mButtonChoice1= (Button) findViewById(R.id.btnChoice1);
        mButtonChoice2= (Button) findViewById(R.id.btnChoice2);
        mButtonChoice3= (Button) findViewById(R.id.btnChoice3);
        mButtonChoice4= (Button) findViewById(R.id.btnChoice4);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice1.getText()== mAnswer){
                    Toast.makeText(ReadingContent.this,"correct",Toast.LENGTH_SHORT).show();
                    mScore++;
                    intentResult(mQuestionNumber,mScore);
                } else {
                    Toast.makeText(ReadingContent.this,"wrong",Toast.LENGTH_SHORT).show();
                    intentResult(mQuestionNumber,mScore);
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice2.getText()== mAnswer){
                    Toast.makeText(ReadingContent.this,"correct",Toast.LENGTH_SHORT).show();
                    mScore++;
                    intentResult(mQuestionNumber,mScore);
                } else {
                    Toast.makeText(ReadingContent.this,"wrong",Toast.LENGTH_SHORT).show();
                    intentResult(mQuestionNumber,mScore);
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice3.getText()==mAnswer){
                    Toast.makeText(ReadingContent.this,"correct",Toast.LENGTH_SHORT).show();
                    mScore++;
                    intentResult(mQuestionNumber,mScore);
                } else {
                    Toast.makeText(ReadingContent.this,"wrong",Toast.LENGTH_SHORT).show();
                    intentResult(mQuestionNumber,mScore);
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice4.getText()==mAnswer){
                    Toast.makeText(ReadingContent.this,"correct",Toast.LENGTH_LONG).show();
                    mScore++;
                    intentResult(mQuestionNumber,mScore);
                } else {
                    Toast.makeText(ReadingContent.this,"wrong",Toast.LENGTH_LONG).show();
                    intentResult(mQuestionNumber,mScore);
                }
            }
        });
    }

    public void updateQuestion(){
        mQuestionView.setText(mQuestionAdapter.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionAdapter.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionAdapter.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionAdapter.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionAdapter.getChoice4(mQuestionNumber));

        mAnswer = mQuestionAdapter.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    public void intentResult(int mQuestionNumber, int mScore){
        if(mQuestionNumber ==mQuestionAdapter.getQuestions().length){
            Intent intent = new Intent(ReadingContent.this, Result.class);
            Bundle bundle = new Bundle();
            bundle.putInt("mykey", mScore);
            intent.putExtras(bundle);
            ReadingContent.this.finish();
            startActivity(intent);
        }else {updateQuestion();}
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
