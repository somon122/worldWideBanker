package com.world_tech_point.worldwide_knowledge.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.R;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;

import java.util.ArrayList;
import java.util.List;


public class QuizFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<ListItem> quizQList;
    private AdView adView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_quiz, container, false);


        adView = new AdView(getContext(), LanguageName.FB_BANNER_ID, AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = root.findViewById(R.id.banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        quizQList = new ArrayList<>();
        quizList(new SaveLanguage(getContext()).getLanguage());

        recyclerView = root.findViewById(R.id.quizRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();
        CategoryAdapter categoryAdapter = new CategoryAdapter(getContext(), quizQList, "Quiz");
        recyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();
        return root;


    }

    private void quizList(String value) {

        if (value.equals(LanguageName.ENGLISH)) {
            quizQList = englishList();
        } else if (value.equals(LanguageName.BENGALI)) {
            quizQList = banglaList();
        } else if (value.equals(LanguageName.HINDI)) {
            quizQList = hindiList();
        } else if (value.equals(LanguageName.URDU)) {
            quizQList = urduList();
        } else {
            quizQList = englishList();
        }

    }


    private List<ListItem> englishList() {
        List<ListItem> englishArrayList = new ArrayList();
        englishArrayList.add(new ListItem(R.drawable.sports, "Sports"));
        englishArrayList.add(new ListItem(R.drawable.computerscience, "Computer Science"));
        englishArrayList.add(new ListItem(R.drawable.security, "Computer Security"));
        englishArrayList.add(new ListItem(R.drawable.commerce, "Commerce"));
        englishArrayList.add(new ListItem(R.drawable.economics, "Economics"));
        englishArrayList.add(new ListItem(R.drawable.marketing, "Marketing Management"));
        englishArrayList.add(new ListItem(R.drawable.universe, "World Universe"));
        englishArrayList.add(new ListItem(R.drawable.science, "Science"));
        englishArrayList.add(new ListItem(R.drawable.physics, "Physics"));
        englishArrayList.add(new ListItem(R.drawable.chemistry, "Chemistry"));
        englishArrayList.add(new ListItem(R.drawable.biology, "Biology"));
        englishArrayList.add(new ListItem(R.drawable.wonders, "Natural Seven Wonders"));
        englishArrayList.add(new ListItem(R.drawable.animalbirds, "Animals & birds"));
        englishArrayList.add(new ListItem(R.drawable.capitals, "Capital's Of Counties"));
        englishArrayList.add(new ListItem(R.drawable.continents, "World Continents"));
        englishArrayList.add(new ListItem(R.drawable.inventors, "Famous Inventors"));
        englishArrayList.add(new ListItem(R.drawable.militeryawerd, "Military Awards"));
        englishArrayList.add(new ListItem(R.drawable.worldhistory, "World History"));
        englishArrayList.add(new ListItem(R.drawable.war, "World Wars History"));

        return englishArrayList;

    }

    private List<ListItem>  banglaList() {
        final ArrayList englishArrayList = new ArrayList();
        englishArrayList.add(new ListItem(R.drawable.sports, "ক্রীড়া"));
        englishArrayList.add(new ListItem(R.drawable.computerscience, "কম্পিউটার বিজ্ঞান"));
        englishArrayList.add(new ListItem(R.drawable.security, "কম্পিউটার নিরাপত্তা"));
        englishArrayList.add(new ListItem(R.drawable.commerce, "বাণিজ্য"));
        englishArrayList.add(new ListItem(R.drawable.economics, "অর্থনীতি"));
        englishArrayList.add(new ListItem(R.drawable.marketing, "বিপণন পরিচালনা"));
        englishArrayList.add(new ListItem(R.drawable.universe, "ওয়ার্ল্ড ইউনিভার্স"));
        englishArrayList.add(new ListItem(R.drawable.science, "বিজ্ঞান"));
        englishArrayList.add(new ListItem(R.drawable.physics, "পদার্থবিজ্ঞান"));
        englishArrayList.add(new ListItem(R.drawable.chemistry, "রসায়ন"));
        englishArrayList.add(new ListItem(R.drawable.biology, "জীববিজ্ঞান"));
        englishArrayList.add(new ListItem(R.drawable.wonders, "প্রাকৃতিক সাত আশ্চর্য"));
        englishArrayList.add(new ListItem(R.drawable.animalbirds, "প্রাণী ও পাখি"));
        englishArrayList.add(new ListItem(R.drawable.capitals, "ক্যাপিটাল অফ কাউন্টি"));
        englishArrayList.add(new ListItem(R.drawable.continents, "মহাদেশ সম্পর্কে"));
        englishArrayList.add(new ListItem(R.drawable.inventors, "বিখ্যাত উদ্ভাবক"));
        englishArrayList.add(new ListItem(R.drawable.militeryawerd, "সর্বোচ্চতম সামরিক পুরষ্কার"));
        englishArrayList.add(new ListItem(R.drawable.worldhistory, "বিশ্ব ইতিহাস"));
        englishArrayList.add(new ListItem(R.drawable.war, "ওয়ার্ল্ড ওয়ার্সের ইতিহাস"));

        return englishArrayList;
    }

    private List<ListItem>  hindiList() {
        final ArrayList englishArrayList = new ArrayList();
        englishArrayList.add(new ListItem(R.drawable.sports, "खेल"));
        englishArrayList.add(new ListItem(R.drawable.computerscience, "कंप्यूटर विज्ञान"));
        englishArrayList.add(new ListItem(R.drawable.security, "कंप्यूटर सुरक्षा"));
        englishArrayList.add(new ListItem(R.drawable.commerce, "वाणिज्य"));
        englishArrayList.add(new ListItem(R.drawable.economics, "अर्थशास्त्र"));
        englishArrayList.add(new ListItem(R.drawable.marketing, "विपणन प्रबंधन"));
        englishArrayList.add(new ListItem(R.drawable.universe, "विश्व ब्रह्मांड"));
        englishArrayList.add(new ListItem(R.drawable.science, "विज्ञान"));
        englishArrayList.add(new ListItem(R.drawable.physics, "भौतिक विज्ञान"));
        englishArrayList.add(new ListItem(R.drawable.chemistry, "रसायन विज्ञान"));
        englishArrayList.add(new ListItem(R.drawable.biology, "जीवविज्ञान"));
        englishArrayList.add(new ListItem(R.drawable.wonders, "प्राकृतिक सात आश्चर्य"));
        englishArrayList.add(new ListItem(R.drawable.animalbirds, "पशु और पक्षी"));
        englishArrayList.add(new ListItem(R.drawable.capitals, "राजधानी काउंटियों की"));
        englishArrayList.add(new ListItem(R.drawable.continents, "महाद्वीपों के बारे में"));
        englishArrayList.add(new ListItem(R.drawable.inventors, "प्रसिद्ध आविष्कारक"));
        englishArrayList.add(new ListItem(R.drawable.militeryawerd, "सर्वोच्च सैन्य पुरस्कार"));
        englishArrayList.add(new ListItem(R.drawable.worldhistory, "विश्व इतिहास"));
        englishArrayList.add(new ListItem(R.drawable.war, "विश्व युद्ध का इतिहास"));


        return englishArrayList;

    }

    private List<ListItem>  urduList() {
        final ArrayList englishArrayList = new ArrayList();
        englishArrayList.add(new ListItem(R.drawable.sports, "کھیل"));
        englishArrayList.add(new ListItem(R.drawable.computerscience, "کمپیوٹر سائنس"));
        englishArrayList.add(new ListItem(R.drawable.security, "کمپیوٹر سیکیورٹی"));
        englishArrayList.add(new ListItem(R.drawable.commerce, "کامرس"));
        englishArrayList.add(new ListItem(R.drawable.economics, "اکنامکس"));
        englishArrayList.add(new ListItem(R.drawable.marketing, "مارکیٹنگ مینجمنٹ"));
        englishArrayList.add(new ListItem(R.drawable.universe, "عالمی کائنات"));
        englishArrayList.add(new ListItem(R.drawable.science, "سائنس"));
        englishArrayList.add(new ListItem(R.drawable.physics, "طبیعیات"));
        englishArrayList.add(new ListItem(R.drawable.chemistry, "کیمسٹری"));
        englishArrayList.add(new ListItem(R.drawable.biology, "حیاتیات"));
        englishArrayList.add(new ListItem(R.drawable.wonders, "قدرتی سات حیرت"));
        englishArrayList.add(new ListItem(R.drawable.animalbirds, "جانور اور پرندے"));
        englishArrayList.add(new ListItem(R.drawable.capitals, "دارالحکومت کاؤنٹیوں"));
        englishArrayList.add(new ListItem(R.drawable.continents, "براعظموں کے بارے میں"));
        englishArrayList.add(new ListItem(R.drawable.inventors, "مشہور موجد"));
        englishArrayList.add(new ListItem(R.drawable.militeryawerd, "اعلی ترین فوجی ایوارڈز"));
        englishArrayList.add(new ListItem(R.drawable.worldhistory, "دنیا کی تاریخ"));
        englishArrayList.add(new ListItem(R.drawable.war, "عالمی جنگوں کی تاریخ"));


        return englishArrayList;

    }


}