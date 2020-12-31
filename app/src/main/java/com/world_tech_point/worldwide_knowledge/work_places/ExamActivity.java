package com.world_tech_point.worldwide_knowledge.work_places;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.ResultActivity;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.examContainers.BanglaQuestion;
import com.world_tech_point.worldwide_knowledge.examContainers.EnglishQuestion;
import com.world_tech_point.worldwide_knowledge.examContainers.HindiQuestion;
import com.world_tech_point.worldwide_knowledge.examContainers.UrduQuestion;
import com.world_tech_point.worldwide_knowledge.quizContainers.ContentQuestionModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import es.dmoral.toasty.Toasty;

public class ExamActivity extends AppCompatActivity {

    private String currentDateAndTime;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            if (mTimerRunning){
                Toasty.info(ExamActivity.this,"Please complete this MCQ test",Toasty.LENGTH_LONG).show();
            }else {
                this.finish();

            }
        }
        return super.onOptionsItemSelected(item);
    }

    private List<ContentQuestionModel> contentQuestionModelList;
    private int mQuestionsLength;
    private int randomQuizList;

    private int qCount=0;
    private int scoreCount=0;
    private RadioButton optionButtonNo1, optionButtonNo2, optionButtonNo3, optionButtonNo4;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private TextView questionTV,numberTV, questionCountTV, timeShowTV;
    private Button subjectiveP_NextBtn;
    private String answer;

    private String number;
    private int wrongAns= 0;
    private int rightAns= 0;

    private long START_TIME_IN_MILLIS = 10000;
    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis ;
    int tTest=0;
    AlertDialog dialog;
    ProgressBar progressBar;
    private Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        Toolbar toolbar = findViewById(R.id.subjectPracticeShowToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("MCQ Exam");

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            number = bundle.getString("quiz_number");
            mQuestionsLength = Integer.parseInt(number);
            START_TIME_IN_MILLIS = Long.parseLong(number)*10000;
        }

        contentQuestionModelList = questionList(new SaveLanguage(this).getLanguage());
        randomQuizList = contentQuestionModelList.size();

        radioGroup = findViewById(R.id.liveExamOptionGroup);
        optionButtonNo1 = findViewById(R.id.subjectOptionNo1_id);
        optionButtonNo2 = findViewById(R.id.subjectOptionNo2_id);
        optionButtonNo3 = findViewById(R.id.subjectOptionNo3_id);
        optionButtonNo4 = findViewById(R.id.subjectOptionNo4_id);
        questionTV = findViewById(R.id.subjectQuestion_id);
        numberTV = findViewById(R.id.subjectNumber_id);
        progressBar = findViewById(R.id.examProgressBar);
        questionCountTV = findViewById(R.id.examQuestionCount);
        timeShowTV = findViewById(R.id.examTimeShow);
        subjectiveP_NextBtn = findViewById(R.id.subjectiveP_NextBtn);

        random = new Random();
        int num = random.nextInt(randomQuizList);
        updateData(num);
        subjectiveP_NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(ExamActivity.this, "Please select option", Toast.LENGTH_SHORT).show();
                }else {
                        int radioId = radioGroup.getCheckedRadioButtonId();
                        radioButton = findViewById(radioId);
                        String selectOption = radioButton.getText().toString();
                        if (selectOption.equals(answer)){
                            rightAns = rightAns+1;

                            if (scoreCount==mQuestionsLength){
                                exam_finished();
                            }else {
                                nextQuestion();
                            }
                        }else {
                            wrongAns = wrongAns+1;
                            if (scoreCount==mQuestionsLength){
                                exam_finished();
                            }else {
                                nextQuestion();
                            }
                        }
                }
            }
        });
    }

    ///// Start time coding//////


    private List<ContentQuestionModel> questionList(String value) {

        List<ContentQuestionModel>questionModelList = new ArrayList<>();

        if (value.equals(LanguageName.ENGLISH)) {
            questionModelList = new EnglishQuestion().getQuiz();
        } else if (value.equals(LanguageName.BENGALI)) {
            questionModelList =new BanglaQuestion().getQuiz();
        } else if (value.equals(LanguageName.HINDI)) {
            questionModelList =new HindiQuestion().getQuiz();
        } else if (value.equals(LanguageName.URDU)) {
            questionModelList =new UrduQuestion().getQuiz();
        } else {
            questionModelList =new EnglishQuestion().getQuiz();
        }

        return questionModelList;
    }

    private void nextQuestion(){
        if (scoreCount < mQuestionsLength){
            int num = random.nextInt(randomQuizList);
            updateData(num);
            unCheckOption();
        }else {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        }
    }

    private void unCheckOption() {
        radioGroup.clearCheck();
    }
    private void startExamAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ExamActivity.this);
        builder.setCancelable(false);
        View view = LayoutInflater.from(ExamActivity.this).inflate(R.layout.ads_click_model,null);
        Button clickBtn = view.findViewById(R.id.modelClimAdsNow);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer();
                dialog.dismiss();
            }
        });
        builder.setView(view);
        dialog = builder.create();
        dialog.show();
    }

    private void startTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                mTimerRunning = false;
                exam_finished();
            }
        }.start();
        mTimerRunning = true;
    }

    private void exam_finished() {

        Intent intent = new Intent(ExamActivity.this, ResultActivity.class);
        intent.putExtra("totalRight",String.valueOf(rightAns));
        intent.putExtra("totalWrong",String.valueOf(wrongAns));
        intent.putExtra("totalQuiz",number);
        intent.putExtra("type","Exam");
        startActivity(intent);
        pauseTimer2();
        finish();

    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        resetTimer();
        startTimer();
    }
    private void pauseTimer2() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        resetTimer();
    }
    private void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
    }
    @SuppressLint("SetTextI18n")
    private void updateCountDownText() {
        int hours = (int) ((mTimeLeftInMillis / 1000) / 60) / 60;
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours,minutes, seconds);
        timeShowTV.setText("Time left: "+timeLeftFormatted);
    }
    /// time section  ///////
    @Override
    public void onBackPressed() {
        if (mTimerRunning){
            Toasty.info(ExamActivity.this,"Please complete this MCQ test",Toasty.LENGTH_LONG).show();
        }else {
            pauseTimer();
            super.onBackPressed();
        }

    }
    @Override
    protected void onStop() {
        if (mTimerRunning){
            pauseTimer();
        }
        super.onStop();
    }
    @Override
    protected void onPause() {
        if (mTimerRunning){
            pauseTimer();
        }
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        if (mTimerRunning){
            pauseTimer();
        }
        super.onDestroy();
    }

    private void updateData(int qCount) {

        if (!contentQuestionModelList.isEmpty()){
             ContentQuestionModel contentQuestionModel = contentQuestionModelList.get(qCount);
            scoreCount = scoreCount+1;
            numberTV.setText(""+scoreCount+") ");
            questionCountTV.setText(""+scoreCount+"/"+mQuestionsLength);
            questionTV.setText(contentQuestionModel.getmQuestion());
            optionButtonNo1.setText(contentQuestionModel.getmOption1());
            optionButtonNo2.setText(contentQuestionModel.getmOption2());
            optionButtonNo3.setText(contentQuestionModel.getmOption3());
            optionButtonNo4.setText(contentQuestionModel.getmOption4());
            answer = contentQuestionModel.getmAnswer();

            if (scoreCount==1){
                startExamAlert();
            }
            if (scoreCount==mQuestionsLength){
                subjectiveP_NextBtn.setText("See Result");
            }

        }else {
            Toast.makeText(this, "Data is not available", Toast.LENGTH_SHORT).show();
        }
    }

}