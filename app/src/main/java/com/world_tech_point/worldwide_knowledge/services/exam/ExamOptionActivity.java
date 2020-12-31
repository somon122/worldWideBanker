package com.world_tech_point.worldwide_knowledge.services.exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.work_places.ExamActivity;

import java.util.ArrayList;
import java.util.List;

public class ExamOptionActivity extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    ViewPager2 viewPager2;
    List<SliderClass> sliderList;
    private Handler slideHandler = new Handler();

    LinearLayout customExamQuiz;
    AlertDialog.Builder builder;
    AlertDialog alertDialog;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_option);

        Toolbar toolbar = findViewById(R.id.examOptionToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ShimmerFrameLayout container = findViewById(R.id.shimmer_view_container);
        container.startShimmer();

        adView = new AdView(this, LanguageName.FB_BANNER_ID, AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.examOptionBanner);
        adContainer.addView(adView);
        adView.loadAd();

        customExamQuiz = findViewById(R.id.customExamQuiz);
        viewPager2 = findViewById(R.id.viewPager2_id);

        customExamQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialogBox();
            }
        });

        sliderList = new ArrayList<>();
        sliderList.add(new SliderClass(R.drawable.image, "10 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));
        sliderList.add(new SliderClass(R.drawable.image, "25 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));
        sliderList.add(new SliderClass(R.drawable.image, "50 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));
        sliderList.add(new SliderClass(R.drawable.image, "75 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));
        sliderList.add(new SliderClass(R.drawable.image, "100 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));
        sliderList.add(new SliderClass(R.drawable.image, "200 MCQ Exam", "Check yourself your Expertise on General knowledge", "Enter Now"));

        viewPager2.setAdapter(new SliderAdapter(this, sliderList, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);
    }

    private void customDialogBox() {

        builder = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.custom_quiz_number, null);
        final EditText editText = view.findViewById(R.id.customModelEditText);
        Button goBtn = view.findViewById(R.id.customModelBtn);
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number  = editText.getText().toString().trim();
                if (number.isEmpty()){
                    editText.setError("Please enter number");
                }else {
                    if (Integer.parseInt(number) <10 ){
                        editText.setError("Please enter at least 10");
                    }else {
                        Intent intent = new Intent(ExamOptionActivity.this, ExamActivity.class);
                        intent.putExtra("quiz_number",number);
                        startActivity(intent);
                    }
                }
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alertDialog.dismiss();
            }
        });

        builder.setView(view);
        alertDialog = builder.create();
        alertDialog.show();

    }
}