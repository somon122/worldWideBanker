package com.world_tech_point.worldwide_knowledge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;

public class ResultActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
           startActivity(new Intent(ResultActivity.this,MainActivity.class));
           finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ResultActivity.this,MainActivity.class));
        finish();
    }

    TextView totalRightTV,totalWrongTV,resultStatusTV,totalQuizTV;
    String totalRight=null,totalWrong=null,totalQuiz=null, type=null;
    LinearLayout passGreeting, failGreeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Toolbar toolbar = findViewById(R.id.resultToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ShimmerFrameLayout container = findViewById(R.id.shimmer_view_container_result);
        container.startShimmer();
        passGreeting = findViewById(R.id.resultPassGreeting);
        failGreeting = findViewById(R.id.resultFailGreeting);

        totalRightTV = findViewById(R.id.totalRightAns);
        totalWrongTV = findViewById(R.id.totalWrongAns);
        resultStatusTV = findViewById(R.id.resultStatus);
        totalQuizTV = findViewById(R.id.totalQuiz);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            totalQuiz = bundle.getString("totalQuiz");
            type = bundle.getString("type");
            totalRight = bundle.getString("totalRight");
            totalWrong = bundle.getString("totalWrong");
            totalWrongTV.setText(totalWrong);
            totalQuizTV.setText(totalQuiz);
            totalRightTV.setText(totalRight);
            greetingStatus(Integer.parseInt(totalQuiz),Integer.parseInt(totalRight));
            titleSet(type);
        }
    }

    private void titleSet(String type) {
        if (type.equals("Exam")){
            setTitle("Exam Result");
        }else if (type.equals("Quiz")){
            setTitle("Quiz Result");
        }

    }

    private void greetingStatus(int totalQuiz, int totalRight) {

        int getNum = (totalQuiz *40)/100;
        if (totalRight >= getNum){
            resultStatusTV.setText("Pass");
            passGreeting.setVisibility(View.VISIBLE);
        }else if (totalRight < getNum){
            resultStatusTV.setText("Fail");
            failGreeting.setVisibility(View.VISIBLE);
        }
    }
}