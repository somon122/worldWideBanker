package com.world_tech_point.worldwide_knowledge.work_places.short_question;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Abbreviations;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_AboutUniverse;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_AnimalAndBirds;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Biology;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_BodyFacts;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_BookAndAuthors;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_CapitalsOfCounties;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Chemistry;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Commerce;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_ComputerScience;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_ComputerSecurity;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_CountriesAndParliaments;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_CurrenciesOfWorld;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Economics;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_EnvironmentalScience;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_FamousInventors;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_FirstInTheWorld;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_HighestMilitaryAwards;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_InternationalDays;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_MS_Excel;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_MS_PowerPoint;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_MS_Word;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_MarketingManagement;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_NationalEmblems;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_NobelPrize;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_OrgAndHeadquarters;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Physics;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Science;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_SmallestAndBiggest;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_Sports;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_WorldContinents;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_WorldHistory;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_WorldOcean;
import com.world_tech_point.worldwide_knowledge.questionContainers.Q_WorldWarsHistory;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private RecyclerView recyclerView;
    private List<ThreeItemModel> classList;
    private String category;
    private String position;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Toolbar toolbar = findViewById(R.id.questionToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adView = new AdView(this, LanguageName.FB_BANNER_ID, AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = findViewById(R.id.question_work_banner);
        adContainer.addView(adView);
        adView.loadAd();

        classList = new ArrayList<>();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            category = bundle.getString("category");
            position = bundle.getString("position");
            setTitle(category);
            get_quiz_question(position);

            if (position.equals("1")) {
                Toast.makeText(this, "" + position, Toast.LENGTH_SHORT).show();
            }

        }

        recyclerView = findViewById(R.id.questionDetailsRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();
        QuestionAdapter questionAdapter = new QuestionAdapter(this, classList,category);
        recyclerView.setAdapter(questionAdapter);
        questionAdapter.notifyDataSetChanged();


    }

    private void get_quiz_question(String position) {

        if (position.equals("0")) {
            classList = new Q_ComputerScience(this).getQuestionList();
        } else if (position.equals("1")) {
            classList = new Q_ComputerSecurity(this).getQuestionList();
        } else if (position.equals("2")) {
            classList = new Q_Chemistry(this).getQuestionList();
        } else if (position.equals("3")) {
            classList = new Q_Science(this).getQuestionList();
        } else if (position.equals("4")) {
            classList = new Q_Physics(this).getQuestionList();
        } else if (position.equals("5")) {
            classList = new Q_Biology(this).getQuestionList();
        } else if (position.equals("6")) {
            classList = new Q_FamousInventors(this).getQuestionList();
        } else if (position.equals("7")) {
            classList = new Q_CurrenciesOfWorld(this).getQuestionList();
        } else if (position.equals("8")) {
            classList = new Q_EnvironmentalScience(this).getQuestionList();
        } else if (position.equals("9")) {
            classList = new Q_Economics(this).getQuestionList();
        } else if (position.equals("10")) {
            classList = new Q_Abbreviations(this).getQuestionList();
        } else if (position.equals("11")) {
            classList = new Q_AnimalAndBirds(this).getQuestionList();
        } else if (position.equals("12")) {
            classList = new Q_AboutUniverse(this).getQuestionList();
        } else if (position.equals("13")) {
            classList = new Q_BodyFacts(this).getQuestionList();
        } else if (position.equals("14")) {
            classList = new Q_BookAndAuthors(this).getQuestionList();
        } else if (position.equals("15")) {
            classList = new Q_Commerce(this).getQuestionList();
        } else if (position.equals("16")) {
            classList = new Q_MarketingManagement(this).getQuestionList();
        } else if (position.equals("17")) {
            classList = new Q_NobelPrize(this).getQuestionList();
        } else if (position.equals("18")) {
            classList = new Q_CapitalsOfCounties(this).getQuestionList();
        } else if (position.equals("19")) {
            classList = new Q_CountriesAndParliaments(this).getQuestionList();
        } else if (position.equals("20")) {
            classList = new Q_NationalEmblems(this).getQuestionList();
        } else if (position.equals("21")) {
            classList = new Q_OrgAndHeadquarters(this).getQuestionList();
        } else if (position.equals("22")) {
            classList = new Q_SmallestAndBiggest(this).getQuestionList();
        } else if (position.equals("23")) {
            classList = new Q_FirstInTheWorld(this).getQuestionList();
        } else if (position.equals("24")) {
            classList = new Q_WorldHistory(this).getQuestionList();
        } else if (position.equals("25")) {
            classList = new Q_WorldWarsHistory(this).getQuestionList();
        } else if (position.equals("26")) {
            classList = new Q_HighestMilitaryAwards(this).getQuestionList();
        } else if (position.equals("27")) {
            classList = new Q_InternationalDays(this).getQuestionList();
        } else if (position.equals("28")) {
            classList = new Q_MS_Word(this).getQuestionList();
        } else if (position.equals("29")) {
            classList = new Q_MS_Excel(this).getQuestionList();
        } else if (position.equals("30")) {
            classList = new Q_MS_PowerPoint(this).getQuestionList();
        } else if (position.equals("31")) {
            classList = new Q_Sports(this).getQuestionList();
        }else if (position.equals("32")) {
            classList = new Q_WorldContinents(this).getQuestionList();
        }else if (position.equals("33")) {
            classList = new Q_WorldOcean(this).getQuestionList();
        } else {
            classList = new Q_Sports(this).getQuestionList();
        }

    }
}