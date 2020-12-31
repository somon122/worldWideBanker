package com.world_tech_point.worldwide_knowledge;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.world_tech_point.worldwide_knowledge.services.QuestionFragment;
import com.world_tech_point.worldwide_knowledge.services.QuizFragment;
import com.world_tech_point.worldwide_knowledge.services.exam.ExamOptionActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private NavigationView navigationView;
    private BottomNavigationView bottomNavigationView;
    private Spinner spinner;
    SaveLanguage saveLanguage;


    @SuppressLint("HardwareIds")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = findViewById(R.id.languageSelectSpinner);
        saveLanguage = new SaveLanguage(this);
        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setSelectedItemId(R.id.action_Question);
        QuestionFragment questionFragment = new QuestionFragment();
        setFragment(questionFragment);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        List<String> lan_list = new ArrayList<>();
        lan_list.add("SELECT LANGUAGE");
        lan_list.add(LanguageName.ENGLISH);
        lan_list.add(LanguageName.BENGALI);
        lan_list.add(LanguageName.HINDI);
        lan_list.add(LanguageName.URDU);


        ArrayAdapter<String> mainDataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lan_list);
        mainDataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(mainDataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                selectLang(spinner.getSelectedItem().toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                if (id == R.id.nav_home) {
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                } else if (id == R.id.nav_exam) {
                    startActivity(new Intent(MainActivity.this, ExamOptionActivity.class));
                } else if (id == R.id.nav_policy) {
                    startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
                } else if (id == R.id.nav_rate_us) {
                    action_out_site("https://play.google.com/store/apps/details?id=" + getPackageName());
                } else if (id == R.id.nav_share_app) {
                  shareApp();
                } else if (id == R.id.nav_exits) {
                    exitAlert();
                }
                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return false;

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.action_Exam:
                        startActivity(new Intent(MainActivity.this, ExamOptionActivity.class));
                        return true;
                    case R.id.action_Quiz:
                        QuizFragment quizFragment = new QuizFragment();
                        setFragment(quizFragment);
                        return true;
                    case R.id.action_Question:
                        QuestionFragment questionFragment = new QuestionFragment();
                        setFragment(questionFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    private void shareApp() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
        intent.putExtra(Intent.EXTRA_TEXT,"App link:\n https://play.google.com/store/apps/details?id="+getPackageName());
        startActivity(Intent.createChooser(intent,getResources().getString(R.string.app_name)));
    }


    private void action_out_site(String url) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
        }
    }


    private void restartPage() {
        bottomNavigationView.setSelectedItemId(R.id.action_Question);
        QuestionFragment questionFragment = new QuestionFragment();
        setFragment(questionFragment);
    }

    private void selectLang(String lanName) {

        switch (lanName) {
            case LanguageName.ENGLISH:
                saveLanguage.setLanguage(LanguageName.ENGLISH);
                Toasty.success(MainActivity.this, "English Save Successfully", Toast.LENGTH_SHORT, true).show();
                restartPage();

                break;
            case LanguageName.BENGALI:
                saveLanguage.setLanguage(LanguageName.BENGALI);
                Toasty.success(MainActivity.this, "Bengali Save Successfully", Toast.LENGTH_SHORT, true).show();
                restartPage();

                break;
            case LanguageName.HINDI:
                saveLanguage.setLanguage(LanguageName.HINDI);
                Toasty.success(MainActivity.this, "Hindi Save Successfully", Toast.LENGTH_SHORT, true).show();
                restartPage();

                break;
            case LanguageName.URDU:
                saveLanguage.setLanguage(LanguageName.URDU);
                Toasty.success(MainActivity.this, "Urdu Save Successfully", Toast.LENGTH_SHORT, true).show();
                restartPage();
                break;
            default:
                break;
        }

    }


    private void setFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.nav_host_fragment, fragment)
                .commit();
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
            exitAlert();
        } else {
            exitAlert();
        }
    }
    private void exitAlert() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exits alert!")
                .setMessage("Are you sure to Exits?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finishAffinity();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }

}