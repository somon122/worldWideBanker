package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_OrgAndHeadquarters {


    private Context context;
    public Q_OrgAndHeadquarters(Context context) {
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
        String str = "New York";

        String str2 = "Geneva";
        arrayList.add(new ThreeItemModel("Food and Agricultural Organisation (FAO)", "Rome"));
        arrayList.add(new ThreeItemModel("North Atlantic Treaty Organisation (NATO)", "Brussels"));
        arrayList.add(new ThreeItemModel("Transparency International", "Berlin"));
        arrayList.add(new ThreeItemModel("International Renewable Energy Agency", "Abu Dhabi (UAE)"));
        arrayList.add(new ThreeItemModel("South Asian Association for Regional Cooperation", "Kathmandu"));
        arrayList.add(new ThreeItemModel("Association of South East Asian Nations (ASEAN)", "Jakarta"));
        arrayList.add(new ThreeItemModel("Asia Pacific Economic Cooperation (APEC)", "Singapore"));
        arrayList.add(new ThreeItemModel("Organisation of Islamic Cooperation", "Jeddah"));
        arrayList.add(new ThreeItemModel("Indian Ocean Rim Association for Regional Cooperation", "Ebene, Mauritius"));
        arrayList.add(new ThreeItemModel("Organisation for the Prohibition of Chemical Weapons", "The Hague, The Netherlands"));

        arrayList.add(new ThreeItemModel("United Nations Conference on Trade and Development (UNCTAD)", str2));
        arrayList.add(new ThreeItemModel("World Health Organisation", str2));
        arrayList.add(new ThreeItemModel("International Labour Organisation", str2));
        arrayList.add(new ThreeItemModel("International Committee of the Red Cross", str2));
        arrayList.add(new ThreeItemModel("World Trade Organisation", str2));
        arrayList.add(new ThreeItemModel("World Meteorological Organisation", str2));
        arrayList.add(new ThreeItemModel("World Intellectual Property Organization", str2));
        arrayList.add(new ThreeItemModel("International Organization for Standardization", str2));
        arrayList.add(new ThreeItemModel("United Nations Organisation", str));
        arrayList.add(new ThreeItemModel("United Nations International Children’s Emergency Fund (UNICEF)", str));
        arrayList.add(new ThreeItemModel("United Nations Population Fund (UNFPA)", str));

        String str3 = "Paris";
        arrayList.add(new ThreeItemModel("United Nations Educational Scientific and Cultural Organisation (UNESCO)", str3));
        arrayList.add(new ThreeItemModel("UN Women", str));
        arrayList.add(new ThreeItemModel("Organisation for Economic Cooperation and Development (OECD)", str3));
        String str4 = "Vienna";
        arrayList.add(new ThreeItemModel("United Nations Industrial Development Organization (UNIDO)", str4));
        arrayList.add(new ThreeItemModel("International Atomic Energy Agency", str4));
        arrayList.add(new ThreeItemModel("Organisation of Petroleum Exporting Countries (OPEC)", str4));
        String str5 = "Washington DC";
        arrayList.add(new ThreeItemModel("International Monetary Fund (IMF)", str5));
        arrayList.add(new ThreeItemModel("World Bank", str5));
        String str6 = "London";
        arrayList.add(new ThreeItemModel("Amnesty International", str6));
        arrayList.add(new ThreeItemModel("International Maritime Organisation", str6));
        arrayList.add(new ThreeItemModel("Commonwealth of Nations", str6));
        arrayList.add(new ThreeItemModel("International Court Of Justice", "The Hague"));
        arrayList.add(new ThreeItemModel("Universal Postal Union", "Berne"));
         String str7 = "Lausanne, Switzerland";
        arrayList.add(new ThreeItemModel("International Olympic Committee", str7));
        String str8 = "Gland, Switzerland";
        arrayList.add(new ThreeItemModel("Worldwide Fund for Nature", str8));
        String str9 = "Zurich, Switzerland";
        arrayList.add(new ThreeItemModel("International Union of Pure and Applied Chemistry", str9));
        String str10 = "Geneva, Switzerland";
        arrayList.add(new ThreeItemModel("World Economic Forum", str10));
        String str11 = "Monaco";
        arrayList.add(new ThreeItemModel("International Hydrographic Organization", str11));
        arrayList.add(new ThreeItemModel("International Association of Athletics Federations (IAAF)", str11));
        arrayList.add(new ThreeItemModel("Fédération Internationale de Football Association (FIFA)", str9));
        arrayList.add(new ThreeItemModel("International Cricket Council (ICC)", "Dubai, UAE"));
        arrayList.add(new ThreeItemModel("International Hockey Federation (FIH)", str7));
        arrayList.add(new ThreeItemModel("Fédération internationale des échecs (FIDE) or World Chess Federation", "Athens, Greece"));
        arrayList.add(new ThreeItemModel("International Union for Conservation of Nature (IUCN)", str8));
        arrayList.add(new ThreeItemModel("Internet Corporation for Assigned Names and Numbers (ICANN)", "Los Angeles, USA"));
        arrayList.add(new ThreeItemModel("Médecins Sans Frontières (MSF) or Doctors without Borders", str10));
        arrayList.add(new ThreeItemModel("International Shooting Sports Federation", "Munich, Germany"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str ="নিউ ইয়র্ক" ;
        arrayList.add(new ThreeItemModel("জাতিসংঘের সংস্থা", str));
        arrayList.add(new ThreeItemModel("জাতিসংঘের আন্তর্জাতিক শিশুদের জরুরি তহবিল (ইউনিসেফ)", str));
        arrayList.add(new ThreeItemModel("জাতিসংঘের জনসংখ্যা তহবিল (ইউএনএফপিএ)", str));
        String str2 ="জেনেভা";
        arrayList.add(new ThreeItemModel("বাণিজ্য ও উন্নয়ন বিষয়ক জাতিসংঘের সম্মেলন (ইউএনটিএটিএডিডি)", str2));
        arrayList.add(new ThreeItemModel("বিশ্ব স্বাস্থ্য সংস্থা", str2));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক শ্রম সংস্থা", str2));
        arrayList.add(new ThreeItemModel("রেড ক্রস আন্তর্জাতিক কমিটি", str2));
        arrayList.add(new ThreeItemModel("ওয়ার্ল্ড ট্রেড অর্গানাইজেশন", str2));
        arrayList.add(new ThreeItemModel("বিশ্ব আবহাওয়া সংস্থা", str2));
        arrayList.add(new ThreeItemModel("ওয়ার্ল্ড বুদ্ধিজীবী সম্পত্তি সংস্থা", str2));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক মান সংস্থা", str2));
        String str3 = "প্যারিস";
        arrayList.add(new ThreeItemModel("জাতিসংঘের শিক্ষামূলক বৈজ্ঞানিক ও সাংস্কৃতিক সংস্থা (ইউনেস্কো)", str3));
        arrayList.add(new ThreeItemModel("ইউএন উইমেন", str));
        arrayList.add(new ThreeItemModel("অর্থনৈতিক সহযোগিতা ও উন্নয়ন সংস্থা (ওইসিডি)", str3));
        String str4 ="ভিয়েনা" ;
        arrayList.add(new ThreeItemModel("জাতিসংঘের শিল্প উন্নয়ন সংস্থা (ইউএনআইডিডিও)", str4));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক পরমাণু শক্তি সংস্থা", str4));
        arrayList.add(new ThreeItemModel("পেট্রোলিয়াম রফতানিকারক দেশগুলির সংস্থা (ওপেক)", str4));
        String str5 = "ওয়াশিংটন ডিসি";
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক মুদ্রা তহবিল (আইএমএফ)", str5));
        arrayList.add(new ThreeItemModel("বিশ্ব ব্যাংক", str5));
        String str6 = "লন্ডন";
        arrayList.add(new ThreeItemModel("অ্যামনেস্টি ইন্টারন্যাশনাল", str6));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক মেরিটাইম অর্গানাইজেশন", str6));
        arrayList.add(new ThreeItemModel("কমনওয়েলথ অব নেশন্স", str6));
        arrayList.add(new ThreeItemModel("ইন্টারন্যাশনাল কোর্ট অফ জাস্টিস", "দি হেগ"));
        arrayList.add(new ThreeItemModel("ইউনিভার্সাল ডাক ইউনিয়ন", "বার্ন"));
        arrayList.add(new ThreeItemModel("খাদ্য ও কৃষি সংস্থা (এফএও)", "রোম"));
        arrayList.add(new ThreeItemModel("উত্তর আটলান্টিক চুক্তি সংস্থা (ন্যাটো)", "ব্রাসেলস"));
        arrayList.add(new ThreeItemModel("স্বচ্ছ আন্তর্জাতিক", "বার্লিন"));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক নবায়নযোগ্য শক্তি সংস্থা", "আবু ধাবি (সংযুক্ত আরব আমিরাত)"));
        arrayList.add(new ThreeItemModel("দক্ষিণ এশীয় অঞ্চল আঞ্চলিক সহযোগিতা", "কাঠমান্ডু"));
        arrayList.add(new ThreeItemModel("দক্ষিণ পূর্ব এশীয় জাতিসংঘের সমিতি (আসিয়ান)", "জাকার্তা"));
        arrayList.add(new ThreeItemModel("এশিয়া প্যাসিফিক অর্থনৈতিক সহযোগিতা (এপেক)", "সিঙ্গাপুর"));
        arrayList.add(new ThreeItemModel("ইসলামিক সহযোগিতা সংস্থা", "জেদ্দা"));
        arrayList.add(new ThreeItemModel("আঞ্চলিক সহযোগিতার জন্য ইন্ডিয়ান ওশান রিম অ্যাসোসিয়েশন", "এবিন, মরিশাস"));
        arrayList.add(new ThreeItemModel("রাসায়নিক অস্ত্র নিষিদ্ধের জন্য সংস্থা", "দি হেগ, নেদারল্যান্ডস"));
        String str7 = "লসান, সুইজারল্যান্ড";
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক অলিম্পিক কমিটি", str7));
        String str8 ="গ্রন্থি, সুইজারল্যান্ড" ;
        arrayList.add(new ThreeItemModel("প্রকৃতি ওয়ার্ল্ড ওয়াইড ফান্ড", str8));
        String str9 = "জুরিখ, সুইজারল্যান্ড";
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক বিশুদ্ধ ও ফলিত রসায়ন সঙ্ঘ", str9));
        String str10 ="জেনেভা, সুইজারল্যান্ড" ;
        arrayList.add(new ThreeItemModel("বিশ্ব অর্থনৈতিক ফোরাম", str10));
        String str11 ="মোনাকো" ;
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক জলবিদ্যুৎ সংস্থা", str11));
        arrayList.add(new ThreeItemModel("অ্যাথলেটিক্স ফেডারেশনের আন্তর্জাতিক সংস্থা (আইএএএফ)", str11));
        arrayList.add(new ThreeItemModel("ফেডারেশন ইন্টারনেশনাল ডি ফুটবল অ্যাসোসিয়েশন (ফিফা)", str9));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক ক্রিকেট কাউন্সিল (আইসিসি)", "দুবাই, সংযুক্ত আরব আমিরাত"));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক হকি ফেডারেশন (এফআইএইচ)", str7));
        arrayList.add(new ThreeItemModel("ফেডারেশন ইন্টার্নেশনাল ডেস চেকস (ফিড) বা ওয়ার্ল্ড দাবা ফেডারেশন", "অ্যাথেন্স, গ্রীস"));
        arrayList.add(new ThreeItemModel("সংরক্ষণের সংরক্ষণের জন্য আন্তর্জাতিক ইউনিয়ন (আইইউসিএন)", str8));
        arrayList.add(new ThreeItemModel("ইন্টারনেট কর্পোরেশন ফর অ্যাসাইনড নাম এবং নাম্বার (আইসিএনএএন)", "লস অ্যাঞ্জেলেস, মার্কিন যুক্তরাষ্ট্র"));
        arrayList.add(new ThreeItemModel("মেডিসিনস সানস ফ্রন্টিয়ারেস (এমএসএফ) বা সীমানা ছাড়াই চিকিত্সকরা", str10));
        arrayList.add(new ThreeItemModel("আন্তর্জাতিক শুটিং স্পোর্টস ফেডারেশন", "মিউনিখ, জার্মানি"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str ="न्यूयॉर्क" ;
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र संगठन", str));
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र अंतर्राष्ट्रीय बाल आपातकालीन कोष (यूनिसेफ)", str));
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र जनसंख्या कोष (UNFPA)", str));
        String str2 ="जिनेवा";
        arrayList.add(new ThreeItemModel("व्यापार और विकास पर संयुक्त राष्ट्र सम्मेलन (UNCTAD)", str2));
        arrayList.add(new ThreeItemModel("विश्व स्वास्थ्य संगठन", str2));
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय श्रम संगठन", str2));
        arrayList.add(new ThreeItemModel("रेड क्रॉस की अंतर्राष्ट्रीय समिति", str2));
        arrayList.add(new ThreeItemModel("विश्व व्यापार संगठन", str2));
        arrayList.add(new ThreeItemModel("विश्व मौसम संगठन", str2));
        arrayList.add(new ThreeItemModel("विश्व बौद्धिक संपदा संगठन", str2));
        arrayList.add(new ThreeItemModel("अंतरराष्ट्रीय मानकीकरण संगठन", str2));
        String str3 = "पेरिस";
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र शैक्षिक वैज्ञानिक और सांस्कृतिक संगठन (यूनेस्को)", str3));
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र महिला", str));
        arrayList.add(new ThreeItemModel("आर्थिक सहयोग और विकास संगठन (OECD)", str3));
        String str4 ="वियना";
        arrayList.add(new ThreeItemModel("संयुक्त राष्ट्र औद्योगिक विकास संगठन (UNIDO)", str4));
        arrayList.add(new ThreeItemModel("अंतरराष्ट्रीय परमाणु ऊर्जा एजेंसी", str4));
        arrayList.add(new ThreeItemModel("पेट्रोलियम निर्यातक देशों का संगठन (ओपेक)", str4));
        String str5 = "वाशिंगटन डी सी";
        arrayList.add(new ThreeItemModel("वाशिंगटन डी सी", str5));
        arrayList.add(new ThreeItemModel("विश्व बैंक", str5));
        String str6 ="लंडन";
        arrayList.add(new ThreeItemModel("अंतराष्ट्रिय क्षमा", str6));
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय समुद्री संगठन", str6));
        arrayList.add(new ThreeItemModel("राष्ट्र के राष्ट्रमंडल", str6));
        arrayList.add(new ThreeItemModel("इंटरनेशनल कोर्ट ऑफ़ जस्टिस", "द हेग"));
        arrayList.add(new ThreeItemModel("यूनिवर्सल पोस्टल यूनियन", "बर्न"));
        arrayList.add(new ThreeItemModel("खाद्य और कृषि संगठन (एफएओ)", "रोम"));
        arrayList.add(new ThreeItemModel("उत्तर अटलांटिक संधि संगठन (नाटो)", "ब्रसेल्स"));
        arrayList.add(new ThreeItemModel("ट्रांसपेरेंसी इंटरनेशनल", "बर्लिन"));
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय अक्षय ऊर्जा एजेंसी", "अबू धाबी (यूएई)"));
        arrayList.add(new ThreeItemModel("दक्षिण एशियाई क्षेत्रीय सहयोग संघ", "काठमांडू"));
        arrayList.add(new ThreeItemModel("एसोसिएशन ऑफ साउथ ईस्ट एशियन नेशंस (आसियान)", "जकार्ता"));
        arrayList.add(new ThreeItemModel("एशिया प्रशांत आर्थिक सहयोग (APEC)", "सिंगापुर"));
        arrayList.add(new ThreeItemModel("इस्लामिक सहयोग संगठन", "जेद्दा"));
        arrayList.add(new ThreeItemModel("क्षेत्रीय सहयोग के लिए हिंद महासागर रिम एसोसिएशन", "एबेने, मॉरीशस"));
        arrayList.add(new ThreeItemModel("रासायनिक हथियारों के निषेध के लिए संगठन", "हेग, द नीदरलैंड"));
        String str7 = "लॉज़ेन, स्विट्जरलैंड";
        arrayList.add(new ThreeItemModel("अंतरराष्ट्रीय ओलंपिक समिति", str7));
        String str8 ="ग्लैंड, स्विट्जरलैंड";
        arrayList.add(new ThreeItemModel("प्रकृति के लिए विश्वव्यापी निधि", str8));
        String str9 = "ज़्यूरिख, स्विट्ज़रलैंड";
        arrayList.add(new ThreeItemModel("शुद्ध और व्यावहारिक रसायन के अंतर्राष्ट्रीय संघ", str9));
        String str10 = "जिनेवा, स्विट्जरलैंड";
        arrayList.add(new ThreeItemModel("विश्व आर्थिक मंच", str10));
        String str11 ="मोनाको";
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय हाइड्रोग्राफिक संगठन", str11));
        arrayList.add(new ThreeItemModel("इंटरनेशनल एसोसिएशन ऑफ़ एथलेटिक्स फेडरेशन (IAAF)", str11));
        arrayList.add(new ThreeItemModel("फेडरेशन इंटरनेशनेल डी फुटबॉल एसोसिएशन (फीफा)", str9));
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय क्रिकेट परिषद (आईसीसी)", "दुबई, यूएई"));
        arrayList.add(new ThreeItemModel("अंतर्राष्ट्रीय हॉकी महासंघ (FIH)", str7));
        arrayList.add(new ThreeItemModel("फेडरेशन इंटरनेशनेल डेस एचेस (एफआईडीई) या वर्ल्ड चेस फेडरेशन", "एथेंस, ग्रीस"));
        arrayList.add(new ThreeItemModel("प्रकृति के संरक्षण के लिए अंतर्राष्ट्रीय संघ (IUCN)", str8));
        arrayList.add(new ThreeItemModel("इंटरनेट कॉर्पोरेशन फॉर असाइन्ड नेम्स एंड नंबर्स (ICANN)", "लॉस एंजिल्स, यूएसए"));
        arrayList.add(new ThreeItemModel("Médecins Sans Frontières (MSF) या डॉक्टर्स बिना सीमाओं के", str10));
        arrayList.add(new ThreeItemModel("इंटरनेशनल शूटिंग स्पोर्ट्स फेडरेशन", "म्यूनिख, जर्मनी"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str ="نیویارک" ;
        arrayList.add(new ThreeItemModel("اقوام متحدہ کی تنظیم", str));
        arrayList.add(new ThreeItemModel("اقوام متحدہ کے بچوں کا ہنگامی فنڈ (یونیسف)", str));
        arrayList.add(new ThreeItemModel("اقوام متحدہ کے پاپولیشن فنڈ (یو این ایف پی اے)", str));
        String str2 = "جنیوا";
        arrayList.add(new ThreeItemModel("تجارت اور ترقی کے بارے میں اقوام متحدہ کی کانفرنس (UNCTAD)", str2));
        arrayList.add(new ThreeItemModel("عالمی ادارہ صحت", str2));
        arrayList.add(new ThreeItemModel("بین الاقوامی لیبر آرگنائزیشن", str2));
        arrayList.add(new ThreeItemModel("ریڈ کراس کی بین الاقوامی کمیٹی", str2));
        arrayList.add(new ThreeItemModel("عالمی تجارتی تنظیم", str2));
        arrayList.add(new ThreeItemModel("عالمی موسمیاتی تنظیم", str2));
        arrayList.add(new ThreeItemModel("عالمی دانشورانہ املاک کی تنظیم", str2));
        arrayList.add(new ThreeItemModel("بین الاقوامی ادارہ برائے معیاریہ", str2));
        String str3 ="پیرس";
        arrayList.add(new ThreeItemModel("اقوام متحدہ کی تعلیمی سائنسی اور ثقافتی تنظیم (یونیسکو)", str3));
        arrayList.add(new ThreeItemModel("اقوام متحدہ کی خواتین", str));
        arrayList.add(new ThreeItemModel("اقتصادی تعاون اور ترقی کی تنظیم (او ای سی ڈی)", str3));
        String str4 ="ویانا";
        arrayList.add(new ThreeItemModel("اقوام متحدہ کی صنعتی ترقی کی تنظیم (یو این آئی ڈی او)", str4));
        arrayList.add(new ThreeItemModel("بین الاقوامی جوہری توانائی ایجنسی", str4));
        arrayList.add(new ThreeItemModel("پٹرولیم برآمد کرنے والے ممالک کی تنظیم (اوپیک)", str4));
        String str5 ="واشنگٹن ڈی سی" ;
        arrayList.add(new ThreeItemModel("بین الاقوامی مالیاتی فنڈ (آئی ایم ایف)", str5));
        arrayList.add(new ThreeItemModel("عالمی بینک", str5));
        String str6 ="لندن" ;
        arrayList.add(new ThreeItemModel("ایمنسٹی انٹرنیشنل", str6));
        arrayList.add(new ThreeItemModel("بین الاقوامی میری ٹائم آرگنائزیشن", str6));
        arrayList.add(new ThreeItemModel("دولت مشترکہ", str6));
        arrayList.add(new ThreeItemModel("انٹرنیشنل کورٹ آف جسٹس" , "دی ہیگ"));
        arrayList.add(new ThreeItemModel("یونیورسل پوسٹل یونین" , "برن"));
        arrayList.add(new ThreeItemModel("فوڈ اینڈ ایگریکلچرل آرگنائزیشن (ایف اے او)" , "روم"));
        arrayList.add(new ThreeItemModel("نارتھ اٹلانٹک ٹریٹی آرگنائزیشن (نیٹو)" , "برسلز"));
        arrayList.add(new ThreeItemModel("شفافیت بین الاقوامی" , "برلن"));
        arrayList.add(new ThreeItemModel("بین الاقوامی قابل تجدید توانائی ایجنسی" , "ابو ظہبی (یو اے ای)"));
        arrayList.add(new ThreeItemModel("علاقائی تعاون کے لئے جنوبی ایشین ایسوسی ایشن" , "کھٹمنڈو"));
        arrayList.add(new ThreeItemModel("ایسوسی ایشن آف ساؤتھ ایسٹ ایشین نیشنس (آسیان)" , "جکارتہ"));
        arrayList.add(new ThreeItemModel("ایشیا پیسیفک اکنامک کوآپریشن (اے پی ای سی)" , "سنگاپور"));
        arrayList.add(new ThreeItemModel("اسلامی تعاون تنظیم" , "جدہ"));
        arrayList.add(new ThreeItemModel("بحر ہند ریم ایسوسی ایشن برائے علاقائی تعاون" , "ایبائن ، ماریشیس"));
        arrayList.add(new ThreeItemModel("کیمیائی ہتھیاروں کی ممانعت کے لئے تنظیم" , "دی ہیگ ، نیدرلینڈز"));
        String str7 ="لوزان ، سوئٹزرلینڈ";
        arrayList.add(new ThreeItemModel("بین الاقوامی اولمپک کمیٹی", str7));
        String str8 ="گلینڈ ، سوئٹزرلینڈ";
        arrayList.add(new ThreeItemModel("فطرت کے لئے عالمی سطح پر فنڈ", str8));
        String str9 ="زیورخ ، سوئٹزرلینڈ" ;
        arrayList.add(new ThreeItemModel("بین الاقوامی یونین برائے خالص اور اپلائیڈ کیمسٹری", str9));
        String str10 ="جنیوا ، سوئٹزرلینڈ";
        arrayList.add(new ThreeItemModel("عالمی اقتصادی فورم", str10));
        String str11 ="موناکو" ;
        arrayList.add(new ThreeItemModel("بین الاقوامی ہائیڈرو گرافک تنظیم", str11));
        arrayList.add(new ThreeItemModel("ایتھلیٹکس فیڈریشنوں کی بین الاقوامی ایسوسی ایشن (IAAF)", str11));
        arrayList.add(new ThreeItemModel("ایتھلیٹکس فیڈریشنوں کی بین الاقوامی ایسوسی ایشن (IAAF)", str9));
        arrayList.add(new ThreeItemModel("انٹرنیشنل کرکٹ کونسل (آئی سی سی)" , "دبئی ، متحدہ عرب امارات"));
        arrayList.add(new ThreeItemModel( "بین الاقوامی یونین برائے قدرتی تحفظ (IUCN)" ,    str7));
        arrayList.add(new ThreeItemModel("Fédération internationale des échecs (FIDE) یا ورلڈ شطرنج فیڈریشن" , "ایتھنز ، یونان"));
        arrayList.add(new ThreeItemModel("بین الاقوامی یونین برائے قدرتی تحفظ (IUCN)", str8));
        arrayList.add(new ThreeItemModel("انٹرنیٹ کارپوریشن برائے تفویض کردہ نام اور نمبر (آئی سی این این)" , "لاس اینجلس ، USA"));
        arrayList.add(new ThreeItemModel("میڈیسنز سنز فرنٹیئرس (ایم ایس ایف) یا سرحدوں کے بغیر ڈاکٹرز", str10));
        arrayList.add(new ThreeItemModel("انٹرنیشنل شوٹنگ اسپورٹس فیڈریشن" , "میونخ ، جرمنی"));


        return arrayList;
    }


}
