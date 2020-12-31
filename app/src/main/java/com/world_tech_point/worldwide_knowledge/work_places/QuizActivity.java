package com.world_tech_point.worldwide_knowledge.work_places;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.ResultActivity;
import com.world_tech_point.worldwide_knowledge.quizContainers.AnimalsAndBirds;
import com.world_tech_point.worldwide_knowledge.quizContainers.Biology;
import com.world_tech_point.worldwide_knowledge.quizContainers.CapitalsOfCounties;
import com.world_tech_point.worldwide_knowledge.quizContainers.Chemistry;
import com.world_tech_point.worldwide_knowledge.quizContainers.Commerce;
import com.world_tech_point.worldwide_knowledge.quizContainers.ComputerScience;
import com.world_tech_point.worldwide_knowledge.quizContainers.ComputerSecurity;
import com.world_tech_point.worldwide_knowledge.quizContainers.ContentQuestionModel;
import com.world_tech_point.worldwide_knowledge.quizContainers.Economics;
import com.world_tech_point.worldwide_knowledge.quizContainers.FamousInventors;
import com.world_tech_point.worldwide_knowledge.quizContainers.MarketingManagement;
import com.world_tech_point.worldwide_knowledge.quizContainers.MilitaryAwards;
import com.world_tech_point.worldwide_knowledge.quizContainers.NaturalSevenWonders;
import com.world_tech_point.worldwide_knowledge.quizContainers.Physics;
import com.world_tech_point.worldwide_knowledge.quizContainers.Science;
import com.world_tech_point.worldwide_knowledge.quizContainers.SportsClass;
import com.world_tech_point.worldwide_knowledge.quizContainers.WorldContinents;
import com.world_tech_point.worldwide_knowledge.quizContainers.WorldHistory;
import com.world_tech_point.worldwide_knowledge.quizContainers.WorldUniverse;
import com.world_tech_point.worldwide_knowledge.quizContainers.WorldWarsHistory;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    TextView question, option1, option2, option3, option4, quizCounter;
    Button nextBtn;
    ContentQuestionModel contentQuestionModel;
    List<ContentQuestionModel> contentQuestionModelList;
    String mAnswer;
    int pos = 0;
    int scoreCount = 0;
    int rightAnsCount = 0;
    int wrongAnsCount = 0;
    private String category = null;
    private String position;

    private int totalQuiz;
    private int wrongAns= 0;
    private int rightAns= 0;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = findViewById(R.id.quizToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adView = new AdView(this, LanguageName.FB_BANNER_ID, AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.quiz_banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        question = findViewById(R.id.quizQuestion);
        option1 = findViewById(R.id.quizOption1);
        option2 = findViewById(R.id.quizOption2);
        option3 = findViewById(R.id.quizOption3);
        option4 = findViewById(R.id.quizOption4);
        nextBtn = findViewById(R.id.quizNextBtn);
        quizCounter = findViewById(R.id.quizCounter);
        contentQuestionModelList = new ArrayList<>();

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            category = bundle.getString("category");
            position = bundle.getString("position");
            setTitle(category);
            get_quiz_question(position);
        }

        totalQuiz = contentQuestionModelList.size();
        updateQuestion(pos);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (scoreCount < contentQuestionModelList.size()) {
                    pos = pos + 1;
                    outAnimation();
                    updateQuestion(pos);
                } else {
                    Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                    intent.putExtra("totalRight",String.valueOf(rightAns));
                    intent.putExtra("totalWrong",String.valueOf(wrongAns));
                    intent.putExtra("totalQuiz",String.valueOf(totalQuiz));
                    intent.putExtra("type","Quiz");
                    startActivity(intent);
                }
            }
        });
        option1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                String op1 = option1.getText().toString();
                String op2 = option2.getText().toString();
                String op3 = option3.getText().toString();
                String op4 = option4.getText().toString();
                if (op1.equals(mAnswer)) {
                    rightAns = rightAns+1;
                    option1.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else {
                    wrongAns = wrongAns+1;
                    option1.setBackground(getDrawable(R.drawable.red_stoke));
                    optionHide();
                }
                if (op2.equals(mAnswer)) {
                    option2.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op3.equals(mAnswer)) {
                    option3.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op4.equals(mAnswer)) {
                    option4.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                String op1 = option1.getText().toString();
                String op2 = option2.getText().toString();
                String op3 = option3.getText().toString();
                String op4 = option4.getText().toString();
                if (op2.equals(mAnswer)) {
                    rightAns = rightAns+1;
                    option2.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else {
                    wrongAns = wrongAns+1;
                    option2.setBackground(getDrawable(R.drawable.red_stoke));
                    optionHide();
                }
                if (op1.equals(mAnswer)) {
                    option1.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();

                } else if (op3.equals(mAnswer)) {
                    option3.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();

                } else if (op4.equals(mAnswer)) {
                    option4.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {

                String op1 = option1.getText().toString();
                String op2 = option2.getText().toString();
                String op3 = option3.getText().toString();
                String op4 = option4.getText().toString();
                if (op3.equals(mAnswer)) {
                    rightAns = rightAns+1;
                    option3.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else {
                    wrongAns = wrongAns+1;
                    option3.setBackground(getDrawable(R.drawable.red_stoke));
                    optionHide();
                }
                if (op1.equals(mAnswer)) {
                    option1.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op2.equals(mAnswer)) {
                    option2.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op4.equals(mAnswer)) {
                    option4.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View view) {
                String op1 = option1.getText().toString();
                String op2 = option2.getText().toString();
                String op3 = option3.getText().toString();
                String op4 = option4.getText().toString();
                if (op4.equals(mAnswer)) {
                    rightAns = rightAns+1;
                    option4.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else {
                    wrongAns = wrongAns+1;
                    option4.setBackground(getDrawable(R.drawable.red_stoke));
                    optionHide();
                }
                if (op2.equals(mAnswer)) {
                    option2.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op3.equals(mAnswer)) {
                    option3.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                } else if (op1.equals(mAnswer)) {
                    option1.setBackground(getDrawable(R.drawable.green_stoke));
                    optionHide();
                }

            }
        });

    }

    private void get_quiz_question(String position) {

        if (position.equals("0")){
            contentQuestionModelList = new SportsClass(this).getQuizQuestion();
        }else if (position.equals("1")){
            contentQuestionModelList = new ComputerScience(this).getQuizQuestion();
        }else if (position.equals("2")){
            contentQuestionModelList = new ComputerSecurity(this).getQuizQuestion();
        }else if (position.equals("3")){
            contentQuestionModelList = new Commerce(this).getQuizQuestion();
        }else if (position.equals("4")){
            contentQuestionModelList = new Economics(this).getQuizQuestion();
        }else if (position.equals("5")){
            contentQuestionModelList = new MarketingManagement(this).getQuizQuestion();
        }else if (position.equals("6")){
            contentQuestionModelList = new WorldUniverse(this).getQuizQuestion();
        }else if (position.equals("7")){
            contentQuestionModelList = new Science(this).getQuizQuestion();
        }else if (position.equals("8")){
            contentQuestionModelList = new Physics(this).getQuizQuestion();
        }else if (position.equals("9")){
            contentQuestionModelList = new Chemistry(this).getQuizQuestion();
        }else if (position.equals("10")){
            contentQuestionModelList = new Biology(this).getQuizQuestion();
        }else if (position.equals("11")){
            contentQuestionModelList = new NaturalSevenWonders(this).getQuizQuestion();
        }else if (position.equals("12")){
            contentQuestionModelList = new AnimalsAndBirds(this).getQuizQuestion();
        }else if (position.equals("13")){
            contentQuestionModelList = new CapitalsOfCounties(this).getQuizQuestion();
        }else if (position.equals("14")){
            contentQuestionModelList = new WorldContinents(this).getQuizQuestion();
        }else if (position.equals("15")){
            contentQuestionModelList = new FamousInventors(this).getQuizQuestion();
        }else if (position.equals("16")){
            contentQuestionModelList = new MilitaryAwards(this).getQuizQuestion();
        }else if (position.equals("17")){
            contentQuestionModelList = new WorldHistory(this).getQuizQuestion();
        }else if (position.equals("18")){
            contentQuestionModelList = new WorldWarsHistory(this).getQuizQuestion();
        }else {
            contentQuestionModelList = new SportsClass(this).getQuizQuestion();
        }



    }

    private void optionHide() {
        nextBtn.setEnabled(true);
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
    }

    private void optionHideShow() {
        nextBtn.setEnabled(false);
        option1.setEnabled(true);
        option2.setEnabled(true);
        option3.setEnabled(true);
        option4.setEnabled(true);
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    private void updateQuestion(int num) {

        scoreCount = scoreCount + 1;
        quizCounter.setText((scoreCount) + "/" + contentQuestionModelList.size());
        contentQuestionModel = contentQuestionModelList.get(num);
        enterAnimation();
        question.setText(contentQuestionModel.getmQuestion());
        option1.setText(contentQuestionModel.getmOption1());
        option2.setText(contentQuestionModel.getmOption2());
        option3.setText(contentQuestionModel.getmOption3());
        option4.setText(contentQuestionModel.getmOption4());
        mAnswer = contentQuestionModel.getmAnswer();
        optionHideShow();
        option1.setBackground(getDrawable(R.drawable.white_stoke));
        option2.setBackground(getDrawable(R.drawable.white_stoke));
        option3.setBackground(getDrawable(R.drawable.white_stoke));
        option4.setBackground(getDrawable(R.drawable.white_stoke));
    }

    private void enterAnimation() {

        option1.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_in_left));
        option2.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_in_right));
        option3.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_in_left));
        option4.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_in_right));


    }

    private void outAnimation() {
        option1.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_out_right));
        option2.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_out_left));
        option3.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_out_right));
        option4.setAnimation(AnimationUtils.loadAnimation(QuizActivity.this, R.anim.slide_out_left));
    }


}