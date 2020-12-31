package com.world_tech_point.worldwide_knowledge.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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


public class QuestionFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<ListItem>arrayList;
    private AdView adView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_question, container, false);

        adView = new AdView(getContext(), LanguageName.FB_BANNER_ID, AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer = root.findViewById(R.id.question_banner_container);
        adContainer.addView(adView);
        adView.loadAd();

        arrayList = new ArrayList<>();
        questionList(new SaveLanguage(getContext()).getLanguage());

        recyclerView = root.findViewById(R.id.questionRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();
        CategoryAdapter categoryAdapter = new CategoryAdapter(getContext(),arrayList,"Question");
        recyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        return root;
    }

    private void questionList(String value) {

        if (value.equals(LanguageName.ENGLISH)) {
            englishList();
        } else if (value.equals(LanguageName.BENGALI)) {
           bengaliList();
        } else if (value.equals(LanguageName.HINDI)) {
            hindiList();
        } else if (value.equals(LanguageName.URDU)) {
            urduList();
        } else {
           englishList();
        }

    }

    private void englishList() {
        arrayList = new ArrayList();

        arrayList.add(new ListItem(R.drawable.computerscience, "Computer Science"));
        arrayList.add(new ListItem(R.drawable.security, "Computer Security"));
        arrayList.add(new ListItem(R.drawable.chemistry, "Chemistry"));
        arrayList.add(new ListItem(R.drawable.science, "Science"));
        arrayList.add(new ListItem(R.drawable.physics, "Physics"));
        arrayList.add(new ListItem(R.drawable.biology, "Biology"));
        arrayList.add(new ListItem(R.drawable.inventors, "Famous Inventors"));
        arrayList.add(new ListItem(R.drawable.currencies, "Currencies of World"));
        arrayList.add(new ListItem(R.drawable.body, "Environmental Science"));
        arrayList.add(new ListItem(R.drawable.economics, "Economics"));
        arrayList.add(new ListItem(R.drawable.idea, "Abbreviations"));
        arrayList.add(new ListItem(R.drawable.animalbirds, "Animal & Birds"));
        arrayList.add(new ListItem(R.drawable.universe, "About Universe"));
        arrayList.add(new ListItem(R.drawable.body, "Body Facts"));
        arrayList.add(new ListItem(R.drawable.book, "Book & Authors"));
        arrayList.add(new ListItem(R.drawable.commerce, "Commerce"));
        arrayList.add(new ListItem(R.drawable.marketing, "Marketing Management"));
        arrayList.add(new ListItem(R.drawable.nobel, "Nobel Prize"));
        arrayList.add(new ListItem(R.drawable.capitals, "Capital's Of Counties"));
        arrayList.add(new ListItem(R.drawable.parliaments, "Countries & Parliaments"));
        arrayList.add(new ListItem(R.drawable.emblems, "National Emblems"));
        arrayList.add(new ListItem(R.drawable.hadquater, "Org & Headquarters"));
        arrayList.add(new ListItem(R.drawable.smallestandbiggest, "Smallest and Biggest"));
        arrayList.add(new ListItem(R.drawable.first, "First in The World"));
        arrayList.add(new ListItem(R.drawable.worldhistory, "World History"));
        arrayList.add(new ListItem(R.drawable.war, "World Wars History"));
        arrayList.add(new ListItem(R.drawable.militeryawerd, "Highest Military Awards"));
        arrayList.add(new ListItem(R.drawable.internationaldays, "International Days"));
        arrayList.add(new ListItem(R.drawable.word, "MS Word"));
        arrayList.add(new ListItem(R.drawable.excel, "MS Excel"));
        arrayList.add(new ListItem(R.drawable.powerpoint, "MS PowerPoint"));
        arrayList.add(new ListItem(R.drawable.sports, "Sports"));

        arrayList.add(new ListItem(R.drawable.continents, "World Continents"));
        arrayList.add(new ListItem(R.drawable.world_ocean, "World Ocean"));


    }

    private void bengaliList() {
        arrayList = new ArrayList();
        arrayList.add(new ListItem(R.drawable.computerscience, "কম্পিউটার বিজ্ঞান"));
        arrayList.add(new ListItem(R.drawable.security, "কম্পিউটার নিরাপত্তা"));
        arrayList.add(new ListItem(R.drawable.chemistry, "রসায়ন"));
        arrayList.add(new ListItem(R.drawable.science, "বিজ্ঞান"));
        arrayList.add(new ListItem(R.drawable.physics, "পদার্থবিজ্ঞান"));
        arrayList.add(new ListItem(R.drawable.biology, "জীববিজ্ঞান"));
        arrayList.add(new ListItem(R.drawable.inventors, "বিখ্যাত আবিষ্কারক"));
        arrayList.add(new ListItem(R.drawable.currencies, "বিশ্বের মুদ্রা"));
        arrayList.add(new ListItem(R.drawable.body, "পরিবেশ বিজ্ঞান"));
        arrayList.add(new ListItem(R.drawable.economics, "অর্থনীতি"));
        arrayList.add(new ListItem(R.drawable.idea, "শব্দ সংক্ষেপ"));
        arrayList.add(new ListItem(R.drawable.animalbirds, "প্রাণী ও পাখি"));
        arrayList.add(new ListItem(R.drawable.universe, "ইউনিভার্স সম্পর্কে"));
        arrayList.add(new ListItem(R.drawable.body, "শারীরিক তথ্য"));
        arrayList.add(new ListItem(R.drawable.book, "বই এবং লেখক"));
        arrayList.add(new ListItem(R.drawable.commerce, "বাণিজ্য"));
        arrayList.add(new ListItem(R.drawable.marketing, "বিপণন ব্যবস্থাপনা"));
        arrayList.add(new ListItem(R.drawable.nobel, "নোবেল পুরস্কার"));
        arrayList.add(new ListItem(R.drawable.capitals, "ক্যাপিটাল অফ কাউন্টি"));
        arrayList.add(new ListItem(R.drawable.parliaments, "দেশ এবং সংসদ"));
        arrayList.add(new ListItem(R.drawable.emblems, "জাতীয় প্রতীক"));
        arrayList.add(new ListItem(R.drawable.hadquater, "সংগঠন ও সদর দফতর"));
        arrayList.add(new ListItem(R.drawable.smallestandbiggest, "সবচেয়ে ছোট এবং সবচেয়ে বড়"));
        arrayList.add(new ListItem(R.drawable.first, "দ্য ওয়ার্ল্ডে প্রথম"));
        arrayList.add(new ListItem(R.drawable.worldhistory, "বিশ্ব ইতিহাস"));
        arrayList.add(new ListItem(R.drawable.war, "ওয়ার্ল্ড ওয়ার্সের ইতিহাস"));
        arrayList.add(new ListItem(R.drawable.militeryawerd, "সর্বোচ্চ সামরিক পুরষ্কার"));
        arrayList.add(new ListItem(R.drawable.internationaldays, "আন্তর্জাতিক দিনগুলি"));
        arrayList.add(new ListItem(R.drawable.word, "মাইক্রোসফট ওয়ার্ড"));
        arrayList.add(new ListItem(R.drawable.excel, "মাইক্রোসফট এক্সেল"));
        arrayList.add(new ListItem(R.drawable.powerpoint, "মাইক্রোসফট পাওয়ারপয়েন্ট"));
        arrayList.add(new ListItem(R.drawable.sports, "খেলাধুলা"));
        arrayList.add(new ListItem(R.drawable.continents, "বিশ্ব মহাদেশ"));
        arrayList.add(new ListItem(R.drawable.world_ocean, "বিশ্ব মহাসাগর"));

    }

    private void hindiList() {
        arrayList = new ArrayList();
        arrayList.add(new ListItem(R.drawable.computerscience, "कंप्यूटर विज्ञान"));
        arrayList.add(new ListItem(R.drawable.security, "कंप्यूटर सुरक्षा"));
        arrayList.add(new ListItem(R.drawable.chemistry, "रसायन विज्ञान"));
        arrayList.add(new ListItem(R.drawable.science, "विज्ञान"));
        arrayList.add(new ListItem(R.drawable.physics, "भौतिक विज्ञान"));
        arrayList.add(new ListItem(R.drawable.biology, "जीवविज्ञान"));
        arrayList.add(new ListItem(R.drawable.inventors, "प्रसिद्ध आविष्कारक"));
        arrayList.add(new ListItem(R.drawable.currencies, "विश्व की मुद्राएँ"));
        arrayList.add(new ListItem(R.drawable.body, "पर्यावरण विज्ञान"));
        arrayList.add(new ListItem(R.drawable.economics, "अर्थशास्त्र"));
        arrayList.add(new ListItem(R.drawable.idea, "लघुरूप"));
        arrayList.add(new ListItem(R.drawable.animalbirds, "पशु और पक्षी"));
        arrayList.add(new ListItem(R.drawable.universe, "विश्व ब्रह्मांड"));
        arrayList.add(new ListItem(R.drawable.body, "शरीर के तथ्य"));
        arrayList.add(new ListItem(R.drawable.book, "पुस्तक और लेखक"));
        arrayList.add(new ListItem(R.drawable.commerce, "व्यापार"));
        arrayList.add(new ListItem(R.drawable.marketing, "विपणन प्रबंधन"));
        arrayList.add(new ListItem(R.drawable.nobel, "नोबेल पुरुस्कार"));
        arrayList.add(new ListItem(R.drawable.capitals, "काउंटी की काउंटी"));
        arrayList.add(new ListItem(R.drawable.parliaments, "देशों और संसदों"));
        arrayList.add(new ListItem(R.drawable.emblems, "राष्ट्रीय प्रतीक"));
        arrayList.add(new ListItem(R.drawable.hadquater, "संगठन और मुख्यालय"));
        arrayList.add(new ListItem(R.drawable.smallestandbiggest, "सबसे छोटा और सबसे बड़ा"));
        arrayList.add(new ListItem(R.drawable.first, "विश्व में प्रथम"));
        arrayList.add(new ListItem(R.drawable.worldhistory, "विश्व इतिहास"));
        arrayList.add(new ListItem(R.drawable.war, "विश्व युद्ध का इतिहास"));
        arrayList.add(new ListItem(R.drawable.militeryawerd, "सर्वोच्च सैन्य पुरस्कार"));
        arrayList.add(new ListItem(R.drawable.internationaldays, "अंतर्राष्ट्रीय दिन"));
        arrayList.add(new ListItem(R.drawable.word, "म एस वर्ड"));
        arrayList.add(new ListItem(R.drawable.excel, "एमएस एक्सेल"));
        arrayList.add(new ListItem(R.drawable.powerpoint, "एमएस पावरपॉइंट"));
        arrayList.add(new ListItem(R.drawable.sports, "खेल"));

        arrayList.add(new ListItem(R.drawable.continents, "विश्व महाद्वीप"));
        arrayList.add(new ListItem(R.drawable.world_ocean, "विश्व महासागर"));

    }

    private void urduList() {
        arrayList = new ArrayList();
        arrayList.add(new ListItem(R.drawable.computerscience, "کمپیوٹر سائنس"));
        arrayList.add(new ListItem(R.drawable.security, "کمپیوٹر سیکیورٹی"));
        arrayList.add(new ListItem(R.drawable.chemistry, "کیمسٹری"));
        arrayList.add(new ListItem(R.drawable.science, "سائنس"));
        arrayList.add(new ListItem(R.drawable.physics, "طبیعیات"));
        arrayList.add(new ListItem(R.drawable.biology, "حیاتیات"));
        arrayList.add(new ListItem(R.drawable.inventors, "مشہور موجد"));
        arrayList.add(new ListItem(R.drawable.currencies, "دنیا کی کرنسی"));
        arrayList.add(new ListItem(R.drawable.body, "ماحولیاتی سائنس"));
        arrayList.add(new ListItem(R.drawable.economics, "معاشیات"));
        arrayList.add(new ListItem(R.drawable.idea, "خلاصے"));
        arrayList.add(new ListItem(R.drawable.animalbirds, "جانوروں اور پرندوں"));
        arrayList.add(new ListItem(R.drawable.universe, "عالمی کائنات"));
        arrayList.add(new ListItem(R.drawable.body, "جسمانی حقائق"));
        arrayList.add(new ListItem(R.drawable.book, "کتاب اور مصنفین"));
        arrayList.add(new ListItem(R.drawable.commerce, "کامرس"));
        arrayList.add(new ListItem(R.drawable.marketing, "مارکیٹنگ مینجمنٹ"));
        arrayList.add(new ListItem(R.drawable.nobel, "نوبل انعام"));
        arrayList.add(new ListItem(R.drawable.capitals, "دارالحکومت کاؤنٹیوں"));
        arrayList.add(new ListItem(R.drawable.parliaments, "ممالک اور پارلیمنٹ"));
        arrayList.add(new ListItem(R.drawable.emblems, "قومی نشان"));
        arrayList.add(new ListItem(R.drawable.hadquater, "تنظیم اور صدر مقام"));
        arrayList.add(new ListItem(R.drawable.smallestandbiggest, "سب سے چھوٹا اور بڑا"));
        arrayList.add(new ListItem(R.drawable.first, "دنیا میں پہلا"));
        arrayList.add(new ListItem(R.drawable.worldhistory, "دنیا کی تاریخ"));
        arrayList.add(new ListItem(R.drawable.war, "عالمی جنگوں کی تاریخ"));
        arrayList.add(new ListItem(R.drawable.militeryawerd, "اعلی ترین فوجی ایوارڈز"));
        arrayList.add(new ListItem(R.drawable.internationaldays, "بین الاقوامی دن"));
        arrayList.add(new ListItem(R.drawable.word, "ایم ایس ورڈ"));
        arrayList.add(new ListItem(R.drawable.excel, "ایم ایس ایکسل"));
        arrayList.add(new ListItem(R.drawable.powerpoint, "ایم ایس پاورپوائنٹ"));
        arrayList.add(new ListItem(R.drawable.sports, "کھیل"));

        arrayList.add(new ListItem(R.drawable.continents, "عالمی براعظم"));
        arrayList.add(new ListItem(R.drawable.world_ocean, "ورلڈ اوقیانوس"));

    }

}