package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_NationalEmblems {


    private Context context;
    public Q_NationalEmblems(Context context) {
        this.context = context;
    }

    public List<ThreeItemModel> getQuestionList(){

        List<ThreeItemModel> quizList = new ArrayList();
        SaveLanguage saveLanguage = new SaveLanguage(context);
        switch (saveLanguage.getLanguage()) {
            case LanguageName.ENGLISH:
                quizList = english();
                break;
            case LanguageName.BENGALI:
                quizList = bengali();
                break;
            case LanguageName.HINDI:
                quizList = hindi();
                break;
            case LanguageName.URDU:
                quizList = urdu();
                break;
            default:
                quizList = english();
                break;
        }
        return quizList;
    }

    private List<ThreeItemModel> english() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("Ivory Coast", "Elephant"));
        arrayList.add(new ThreeItemModel("Japan", "Chrysanthemum"));
        arrayList.add(new ThreeItemModel("Luxembourg", "Lion with Crown"));
        arrayList.add(new ThreeItemModel("Lebanon", "Cedar Tree"));
        arrayList.add(new ThreeItemModel("Mongolia", "The Soyombo"));
        arrayList.add(new ThreeItemModel("Australia", "Kangaroo"));
        arrayList.add(new ThreeItemModel("Bangladesh", "Water Lily"));
        arrayList.add(new ThreeItemModel("Barbados", "Head of Trident"));
        String str = "Lion";
        arrayList.add(new ThreeItemModel("Belgium", str));
        String str2 = "White Lily";
        arrayList.add(new ThreeItemModel("Canada", str2));
        arrayList.add(new ThreeItemModel("Chile", "Candor and Huemul"));
        arrayList.add(new ThreeItemModel("Denmark", "Beach"));
        arrayList.add(new ThreeItemModel("Dominica", "Sisserou Parrot"));
        arrayList.add(new ThreeItemModel("France", "Lily"));
        arrayList.add(new ThreeItemModel("Germany", "Corn Flower"));
        arrayList.add(new ThreeItemModel("Hongkong", "Bauhinia (Orchid Tree)"));
        arrayList.add(new ThreeItemModel("India", "Lioned Capital"));
        String str3 = "Rose";
        arrayList.add(new ThreeItemModel("Iran", str3));
        arrayList.add(new ThreeItemModel("Ireland", "Shamrock"));
        arrayList.add(new ThreeItemModel("Israel", "Candelabrum"));
        arrayList.add(new ThreeItemModel("Italy", str2));

        arrayList.add(new ThreeItemModel("Norway", str));
        arrayList.add(new ThreeItemModel("New Zealand", "Kiwi, Southern Cross"));
        arrayList.add(new ThreeItemModel("Pakistan", "Crescent"));
        arrayList.add(new ThreeItemModel("Papua New Guinea", "Bird of Paradise"));
        String str4 = "Eagle";
        arrayList.add(new ThreeItemModel("Spain", str4));
        arrayList.add(new ThreeItemModel("Sri Lanka", "Sword & Lion"));
        arrayList.add(new ThreeItemModel("Syria", str4));
        arrayList.add(new ThreeItemModel("Sierra Leone", str));
        arrayList.add(new ThreeItemModel("Russia", "Sickle & Hammer"));
        arrayList.add(new ThreeItemModel("Turkey", "Crescenet & Star"));
        arrayList.add(new ThreeItemModel("United Kingdom", str3));
        arrayList.add(new ThreeItemModel("USA", "Golden Rod"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("চিলি", "ক্যান্ডর এবং হিউমুল"));
        arrayList.add(new ThreeItemModel("ডেনমার্ক", "সৈকত"));
        arrayList.add(new ThreeItemModel("ডোমিনিকা", "সিসারো তোতা"));
        arrayList.add(new ThreeItemModel("ফ্রান্স", "লিলি"));
        arrayList.add(new ThreeItemModel("জার্মানি", "কর্ন ফ্লাওয়ার"));
        arrayList.add(new ThreeItemModel("হংকং", "বাউহনিয়া (অর্কিড ট্রি)"));
        arrayList.add(new ThreeItemModel("ভারত", "সিংহযুক্ত রাজধানী"));
        arrayList.add(new ThreeItemModel("অস্ট্রেলিয়া", "ক্যাঙ্গারু"));
        arrayList.add(new ThreeItemModel("বাংলাদেশ", "জলের লিলি"));
        arrayList.add(new ThreeItemModel("বার্বাডোস", "ট্রাইডেন্টের প্রধান"));
        String str ="সিংহ" ;
        arrayList.add(new ThreeItemModel("বেলজিয়াম", str));
        String str2 ="সাদা কমল";
        arrayList.add(new ThreeItemModel("কানাডা", str2));

        String str3 ="গোলাপ" ;
        arrayList.add(new ThreeItemModel("ইরান", str3));
        arrayList.add(new ThreeItemModel("আয়ারল্যান্ড", "শ্যামরক"));
        arrayList.add(new ThreeItemModel("ইস্রায়েল", "ক্যান্ডেলব্রাম"));
        arrayList.add(new ThreeItemModel("ইতালি", str2));
        arrayList.add(new ThreeItemModel("আইভরি কোস্ট", "এলিফ্যান্ট"));
        arrayList.add(new ThreeItemModel("জাপান", "ক্রিসান্থেমাম"));
        arrayList.add(new ThreeItemModel("লাক্সেমবার্গ", "সিংহ উইথ ক্রাউন"));
        arrayList.add(new ThreeItemModel("লেবানন", "সিডার গাছ"));
        arrayList.add(new ThreeItemModel("মঙ্গোলিয়া", "দি সায়োম্বো"));
        arrayList.add(new ThreeItemModel("নরওয়ে", str));
        arrayList.add(new ThreeItemModel("নিউজিল্যান্ড", "কিউই, দক্ষিন ক্রস"));
        arrayList.add(new ThreeItemModel("পাকিস্তান", "ক্রিসেন্ট"));
        arrayList.add(new ThreeItemModel("পাপুয়া নিউ গিনি", "জান্নাতে পাখি"));
        String str4 = "Agগল";
        arrayList.add(new ThreeItemModel("স্পেন", str4));
        arrayList.add(new ThreeItemModel("শ্রীলঙ্কা", "তরোয়াল ও সিংহ"));
        arrayList.add(new ThreeItemModel("সিরিয়া", str4));
        arrayList.add(new ThreeItemModel("সিয়েরা লিওন", str));
        arrayList.add(new ThreeItemModel("রাশিয়া", "সিকেল এবং হ্যামার"));
        arrayList.add(new ThreeItemModel("তুরস্ক", "ক্রিসনেট এবং তারা"));
        arrayList.add(new ThreeItemModel("যুক্তরাজ্য", str3));
        arrayList.add(new ThreeItemModel("ইউএসএ", "গোল্ডেন রড"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("ऑस्ट्रेलिया", "कंगारू"));
        arrayList.add(new ThreeItemModel("बांग्लादेश", "वॉटर लिली"));
        arrayList.add(new ThreeItemModel("बारबाडोस", "ट्रिडेंट के प्रमुख"));
        String str = "सिंह";
        arrayList.add(new ThreeItemModel("बेल्जियम", str));
        String str2 ="सफ़ेद लिली" ;
        arrayList.add(new ThreeItemModel("कनाडा", str2));
        arrayList.add(new ThreeItemModel("चिली", "कैंडर और ह्यूमुल"));
        arrayList.add(new ThreeItemModel("डेनमार्क", "बीच"));
        arrayList.add(new ThreeItemModel("डोमिनिका", "सिस्सरो तोता"));
        arrayList.add(new ThreeItemModel("फ्रांस", "लिली"));
        arrayList.add(new ThreeItemModel("जर्मनी", "कॉर्न फ्लावर"));
        arrayList.add(new ThreeItemModel("हांगकांग", "बाउहिनिया (आर्किड ट्री)"));
        arrayList.add(new ThreeItemModel("भारत", "लायनड कैपिटल"));
        String str3 ="गुलाब का फूल";
        arrayList.add(new ThreeItemModel("ईरान", str3));
        arrayList.add(new ThreeItemModel("आयरलैंड", "शेमरॉक"));
        arrayList.add(new ThreeItemModel("इज़राइल", "कैंडेलब्रम"));
        arrayList.add(new ThreeItemModel("इटली", str2));
        arrayList.add(new ThreeItemModel("आइवरी कोस्ट", "हाथी"));
        arrayList.add(new ThreeItemModel("जापान", "गुलदाउदी"));
        arrayList.add(new ThreeItemModel("लक्समबर्ग", "लायन विद क्राउन"));
        arrayList.add(new ThreeItemModel("लेबनान", "देवदार का पेड़"));
        arrayList.add(new ThreeItemModel("मंगोलिया", "द सोयोमबो"));
        arrayList.add(new ThreeItemModel("नॉर्वे", str));
        arrayList.add(new ThreeItemModel("न्यूजीलैंड", "कीवी, दक्षिणी क्रॉस"));
        arrayList.add(new ThreeItemModel("पाकिस्तान", "क्रिसेंट"));
        arrayList.add(new ThreeItemModel("पापुआ न्यू गिनी", "बर्ड ऑफ़ पैराडाइज़"));
        String str4 = "ईगल";
        arrayList.add(new ThreeItemModel("स्पेन", str4));
        arrayList.add(new ThreeItemModel("श्रीलंका", "स्वॉर्ड एंड लायन"));
        arrayList.add(new ThreeItemModel("सीरिया", str4));
        arrayList.add(new ThreeItemModel("सियरा लिओन", str));
        arrayList.add(new ThreeItemModel("रूस", "सिकल और हैमर"));
        arrayList.add(new ThreeItemModel("तुर्की", "क्रिसेंसेट और स्टार"));
        arrayList.add(new ThreeItemModel("यूनाइटेड किंगडम", str3));
        arrayList.add(new ThreeItemModel("यूएसए", "गोल्डन रॉड"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("آسٹریلیا" , "کینگارو"));
        arrayList.add(new ThreeItemModel("بنگلہ دیش" , "واٹر للی"));
        arrayList.add(new ThreeItemModel("بارباڈوس" , "ہیڈ آف ٹرائڈینٹ"));
        String str = "شیر";
        arrayList.add(new ThreeItemModel("بیلجیم", str));
        String str2 ="وائٹ للی" ;
        arrayList.add(new ThreeItemModel("کینیڈا", str2));
        arrayList.add(new ThreeItemModel("چلی" , "کینڈر اور ہوئمول"));
        arrayList.add(new ThreeItemModel("ڈنمارک" , "بیچ"));
        arrayList.add(new ThreeItemModel("ڈومینیکا" , "سیسرو طوطا"));
        arrayList.add(new ThreeItemModel("فرانس" , "للی"));
        arrayList.add(new ThreeItemModel("جرمنی" , "کارن پھول"));
        arrayList.add(new ThreeItemModel("ہانگ کانگ" , "بوہینیا (آرکڈ ٹری)"));
        arrayList.add(new ThreeItemModel("ہندوستان" , "شیر دارالحکومت"));
        String str3 = "گلاب";
        arrayList.add(new ThreeItemModel("ایران", str3));
        arrayList.add(new ThreeItemModel("آئر لینڈ" , "شمروک"));
        arrayList.add(new ThreeItemModel("اسرائیل" , "کینڈیلا برم"));
        arrayList.add(new ThreeItemModel("اٹلی", str2));
        arrayList.add(new ThreeItemModel("آئیوری کوسٹ" , "ہاتھی"));
        arrayList.add(new ThreeItemModel("جاپان" , "کرسنتھیم"));
        arrayList.add(new ThreeItemModel("لکسمبرگ" , "شیر و ولی عہد"));
        arrayList.add(new ThreeItemModel("لبنان" , "دیودار کا درخت"));
        arrayList.add(new ThreeItemModel("منگولیا" , "سیووموبو"));
        arrayList.add(new ThreeItemModel("ناروے", str));
        arrayList.add(new ThreeItemModel("نیوزی لینڈ" , "کیوی ، سدرن کراس"));
        arrayList.add(new ThreeItemModel("پاکستان" , "کریسنٹ"));
        arrayList.add(new ThreeItemModel("پاپوا نیو گنی" , "جنت کا پرندہ"));
        String str4 ="عقاب" ;
        arrayList.add(new ThreeItemModel("اسپین", str4));
        arrayList.add(new ThreeItemModel("سری لنکا" , "تلوار اور شیر"));
        arrayList.add(new ThreeItemModel("شام", str4));
        arrayList.add(new ThreeItemModel("سیرا لیون", str));
        arrayList.add(new ThreeItemModel("روس" , "سکل اینڈ ہتھوڑا لیون "));
        arrayList.add(new ThreeItemModel("ترکی" , "کریسنٹ اور اسٹار"));
        arrayList.add(new ThreeItemModel("متحدہ سلطنت یونائیٹڈ کنگڈم", str3));
        arrayList.add(new ThreeItemModel("USA" , "گولڈن راڈ"));


        return arrayList;
    }


}
