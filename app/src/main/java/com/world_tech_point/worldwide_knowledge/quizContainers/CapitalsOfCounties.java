package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class CapitalsOfCounties {

    private Context context;

    public CapitalsOfCounties(Context context) {
        this.context = context;
    }

    public ArrayList<ContentQuestionModel> getQuizQuestion(){

        ArrayList quizList = new ArrayList();
        SaveLanguage saveLanguage = new SaveLanguage(context);
        switch (saveLanguage.getLanguage()) {
            case LanguageName.ENGLISH:
                quizList = englishList();
                break;
            case LanguageName.BENGALI:
                quizList = banglaList();
                break;
            case LanguageName.HINDI:
                quizList = hindiList();
                break;
            case LanguageName.URDU:
                quizList = urduList();
                break;
            default:
                quizList = englishList();
                break;
        }
        return quizList;
    }

    private ArrayList<ListItem> englishList() {
        final ArrayList arrayList = new ArrayList();



     arrayList.add(new ContentQuestionModel(" ________________ is the capital city of South Korea.","Stockholm","Seoul","Berlin","Pyongyang","Seoul"));
        arrayList.add(new ContentQuestionModel("___________________ is the capital city of the United States of America (USA).","New York","Chicago","Washington, D.C.","Philadelphia","Washington, D.C."));
        arrayList.add(new ContentQuestionModel("Abu Dhabi is the capital city of which country?","United Arab Emirates (UAE)","United Kingdom (UK)","Sweden","South Africa","United Arab Emirates (UAE)"));
        arrayList.add(new ContentQuestionModel("What is the capital city of Indonesia?","Budapest","Kingston","Jakarta","Tokyo","Jakarta"));
        arrayList.add(new ContentQuestionModel("Dublin is the capital city of ____________________.","Ireland","Iran","Sweden","Norway","Ireland"));



        arrayList.add(new ContentQuestionModel("What is the capital city of Lebanon?","Beirut","Bishkek","Pristina","Tripoli","Beirut"));
        arrayList.add(new ContentQuestionModel("______________ is the capital city of Slovakia.","Honiara","Bratislava","Madrid","Helsinki","Bratislava"));
        arrayList.add(new ContentQuestionModel("What is the capital of Spain?","Madrid","Port of Spain","Tunis","Kampala","Madrid"));
        arrayList.add(new ContentQuestionModel("_____________________ is the capital city of Bangladesh.","Kabul","Kathmandu","Dhaka","Karachi","Dhaka"));
        arrayList.add(new ContentQuestionModel("What is the capital city of China?","Xiamen","Beijing","Shanghai","Shenzhen","Beijing"));
        arrayList.add(new ContentQuestionModel(" ________________ is the capital of Russia.","Moscow","Prague","Havana","New Delhi","Moscow"));
        arrayList.add(new ContentQuestionModel("What is the capital of Canada?","Toronto","Ottawa","Santiago","None of the above","Ottawa"));
        arrayList.add(new ContentQuestionModel("Canberra is the capital city of which island continent?","Australia","Asia","North America","Africa","Australia"));
        arrayList.add(new ContentQuestionModel("What is the capital city of Italy which is also referred to as the “Eternal City” of the world?","Rome","Washington DC","Tripoli","Skopje","Rome"));
        arrayList.add(new ContentQuestionModel("Thimphu is the capital of which South Asian country?","India","Sri Lanka","Bhutan","Afghanistan","Bhutan"));
        arrayList.add(new ContentQuestionModel("Wellington is the capital of which country?","New Zealand","None of the above","Kenya","United States of America (USA)","New Zealand"));
        arrayList.add(new ContentQuestionModel("Lima is the capital of _______________.","Pakistan","Rwanda","Poland","Peru","Peru"));
        arrayList.add(new ContentQuestionModel("What is the capital of Iraq?","Baghdad","Tehran","Sydney","New York","Baghdad"));

        arrayList.add(new ContentQuestionModel("_________________ is the capital city of France.","Toulouse","Strasbourg","Paris","Bordeaux","Paris"));
        arrayList.add(new ContentQuestionModel("Cairo is the capital city of which country?","Greece","Jordan","Kuwait","Egypt","Egypt"));
        arrayList.add(new ContentQuestionModel("_________________ is the capital city of Mauritius.","Port Louis","Majuro","Curepipe","Goodlands","Port Louis"));
        arrayList.add(new ContentQuestionModel("What is the capital city of the Philippines?","Warsaw","Quezon City","Manila","Davao City","Manila"));


        arrayList.add(new ContentQuestionModel("________________ is the capital of Malaysia.","Male","Kuala Lumpur","London","Seoul","Kuala Lumpur"));
        arrayList.add(new ContentQuestionModel("Athens is the capital of which southeastern European country?","Greece","Germany","Finland","Czech Republic","Greece"));
        arrayList.add(new ContentQuestionModel("Vienna is the capital city of _________________.","Austria","Hungary","India","Bahrain","Austria"));
        arrayList.add(new ContentQuestionModel("What is the capital city of Israel?","Dublin","Rome","Jerusalem","Baghdad","Jerusalem"));
        arrayList.add(new ContentQuestionModel("Nairobi is the capital city of which country?","Kenya","Iran","Iraq","Japan","Kenya"));
        arrayList.add(new ContentQuestionModel(" _____________ is the capital city of India.","Lahore","Mumbai","New Delhi","Hyderabad","New Delhi"));
        arrayList.add(new ContentQuestionModel("Amsterdam is the capital city of which country?","Nepal","New Zealand","Netherlands","Myanmar","Netherlands"));
        arrayList.add(new ContentQuestionModel("What is the capital city of Oman?","Muscat","Tehran","Islamabad","Riyadh","Muscat"));
        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

       arrayList.add(new ContentQuestionModel("আমস্টারডাম কোন দেশের রাজধানী?", "নেপাল", "নিউজিল্যান্ড", "নেদারল্যান্ডস", "মায়ানমার", "নেদারল্যান্ডস"));
        arrayList.add(new ContentQuestionModel("ওমান রাজধানী কী?", "মাসকট", "তেহরান", "ইসলামাবাদ", "রিয়াদ", "মাসকট"));
        arrayList.add(new ContentQuestionModel("________________ হ'ল দক্ষিণ কোরিয়ার রাজধানী শহর।", "স্টকহোম", "সিওল", "বার্লিন", "পিয়ংইয়াং", "সিওল"));
        arrayList.add(new ContentQuestionModel("___________________ হ'ল মার্কিন যুক্তরাষ্ট্রের রাজধানী শহর (মার্কিন যুক্তরাষ্ট্র)।", "নিউ ইয়র্ক", "শিকাগো", "ওয়াশিংটন, ডিসি।", "ফিলাডেলফিয়া", "ওয়াশিংটন, ডিসি।"));
        arrayList.add(new ContentQuestionModel("আবুধাবি কোন দেশের রাজধানী শহর?", "সংযুক্ত আরব আমিরাত", "যুক্তরাজ্য (যুক্তরাজ্য)", "সুইডেন", "দক্ষিণ আফ্রিকা", "সংযুক্ত আরব আমিরাত"));
        arrayList.add(new ContentQuestionModel("ইন্দোনেশিয়ার রাজধানী শহর কী?", "বুদাপেস্ট", "কিংস্টন", "জাকার্তা", "টোকিও", "জাকার্তা"));
        arrayList.add(new ContentQuestionModel("ডাবলিন ____________________ এর রাজধানী শহর।", "আয়ারল্যান্ড", "ইরান", "সুইডেন", "নরওয়ে", "আয়ারল্যান্ড"));
        arrayList.add(new ContentQuestionModel("লেবাননের রাজধানী শহরটি কী?", "বৈরুত", "বিশেকেক", "প্রিস্টিনা", "ট্রিপলি", "বৈরুত"));

        arrayList.add(new ContentQuestionModel("________________ রাশিয়ার রাজধানী।", "মস্কো", "প্রাগ", "হাভানা", "নয়াদিল্লি", "মস্কো"));
        arrayList.add(new ContentQuestionModel("কানাডার রাজধানী কী?", "টরন্টো", "অটোয়া", "সান্টিয়াগো", "উপরের কিছুই নয়", "অটোয়া"));
        arrayList.add(new ContentQuestionModel("ক্যানবেরা কোন দ্বীপ মহাদেশের রাজধানী?", "অস্ট্রেলিয়া", "এশিয়া", "উত্তর আমেরিকা", "আফ্রিকা", "অস্ট্রেলিয়া"));
        arrayList.add(new ContentQuestionModel("ইতালির রাজধানী শহর কোনটি যা বিশ্বের শাশ্বত শহর  হিসাবেও পরিচিত?", "রোম", "ওয়াশিংটন ডিসি", "ট্রিপলি", "স্কোপজে", "রোম"));
        arrayList.add(new ContentQuestionModel("লেবাননের রাজধানী শহরটি কী?", "বৈরুত", "বিশেকেক", "প্রিস্টিনা", "ট্রিপলি", "বৈরুত"));
        arrayList.add(new ContentQuestionModel("স্পেনের রাজধানী কী?", "মাদ্রিদ", "স্পেনের বন্দর", "তিউনিস", "কমপালা", "মাদ্রিদ"));
        arrayList.add(new ContentQuestionModel("_____________________ হ'ল বাংলাদেশের রাজধানী শহর।", "কাবুল", "কাঠমান্ডু", "Dhaka", "করাচি", "Dhaka"));
        arrayList.add(new ContentQuestionModel("চীনের রাজধানী শহর কী?", "জিয়ামেন", "বেইজিং", "সাংহাই", "শেনজেন", "বেইজিং"));
        arrayList.add(new ContentQuestionModel("_________________ হ'ল ফ্রান্সের রাজধানী শহর", "টুলুউস", "স্ট্রাসবার্গ", "প্যারিস", "বোর্দো", "প্যারিস"));
        arrayList.add(new ContentQuestionModel("কায়রো কোন দেশের রাজধানী?", "গ্রীস", "জর্দান", "কুয়েত", "মিশর", "মিশর"));
        arrayList.add(new ContentQuestionModel("_________________ হ'ল মরিশাসের রাজধানী শহর।", "পোর্ট লুই", "মাজুরো", "কুরিপাইপ", "গুডল্যান্ডস", "পোর্ট লুই"));
        arrayList.add(new ContentQuestionModel("ফিলিপাইনের রাজধানী শহর কী?", "ওয়ার্সা", "কুইজন সিটি", "ম্যানিলা", "দাভাও সিটি", "ম্যানিলা"));


        arrayList.add(new ContentQuestionModel("থিম্পু কোন দক্ষিণ এশিয়ার দেশের রাজধানী?", "ভারত", "শ্রীলঙ্কা", "ভুটান", "আফগানিস্তান", "ভুটান"));
        arrayList.add(new ContentQuestionModel("ওয়েলিংটন কোন দেশের রাজধানী?", "নিউজিল্যান্ড", "উপরের কিছুই নয়", "কেনিয়া", "আমেরিকা যুক্তরাষ্ট্র (মার্কিন যুক্তরাষ্ট্র)", "নিউজিল্যান্ড"));
        arrayList.add(new ContentQuestionModel("লিমা _______________এর রাজধানী ", "পাকিস্তান", "রুয়ান্ডা", "পোল্যান্ড", "পেরু", "পেরু"));
        arrayList.add(new ContentQuestionModel("ইরাকের রাজধানী কী?", "বাগদাদ", "তেহরান", "সিডনি", "নিউ ইয়র্ক", "বাগদাদ"));
        arrayList.add(new ContentQuestionModel("________________ মালয়েশিয়ার রাজধানী।", "পুরুষ", "কুয়ালালামপুর", "লন্ডন", "সিওল", "কুয়ালালামপুর"));
        arrayList.add(new ContentQuestionModel("অ্যাথেন্স কোন দক্ষিণ-পূর্ব ইউরোপীয় দেশের রাজধানী?", "গ্রীস", "জার্মানি", "ফিনল্যান্ড", "চেক প্রজাতন্ত্র", "গ্রীস"));
        arrayList.add(new ContentQuestionModel("ভিয়েনা _________________ এর রাজধানী শহর।", "অস্ট্রিয়া", "হাঙ্গেরি", "ভারত", "বাহরাইন", "অস্ট্রিয়া"));
        arrayList.add(new ContentQuestionModel("ইস্রায়েলের রাজধানী শহর কী?", "ডাবলিন", "রোম", "জেরুজালেম", "বাগদাদ", "জেরুজালেম"));
        arrayList.add(new ContentQuestionModel("নাইরোবি কোন দেশের রাজধানী?", "কেনিয়া", "ইরান", "ইরাক", "জাপান", "কেনিয়া"));
        arrayList.add(new ContentQuestionModel("_____________ হ'ল ভারতের রাজধানী শহর।", "লাহোর", "মুম্বাই", "নয়াদিল্লি", "হায়দরাবাদ", "নয়াদিল্লি"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("________________ रूस की राजधानी है।", "मॉस्को", "प्राग", "हवाना", "नई दिल्ली", "नई दिल्ली"));
        arrayList.add(new ContentQuestionModel("कनाडा की राजधानी क्या है?", "टोरंटो", "ओटावा", "सेंटियागो", "उपरोक्त में से कोई नहीं", "ओटावा"));
        arrayList.add(new ContentQuestionModel("कैनबरा किस द्वीप महाद्वीप की राजधानी है?", "ऑस्ट्रेलिया", "एशिया", "उत्तरी अमेरिका", "अफ्रीका", "ऑस्ट्रेलिया"));
        arrayList.add(new ContentQuestionModel("इटली की राजधानी शहर क्या है जिसे दुनिया का  भी कहा जाता है?", "रोम", "वाशिंगटन डीसी", "त्रिपोली", "स्कोप्जे", "रोम"));
        arrayList.add(new ContentQuestionModel("थिम्पू किस दक्षिण एशियाई देश की राजधानी है?", "भारत", "श्रीलंका", "भूटान", "अफगानिस्तान", "भूटान"));
        arrayList.add(new ContentQuestionModel("वेलिंगटन किस देश की राजधानी है?", "न्यूजीलैंड", "उपरोक्त में से कोई नहीं", "केन्या", "संयुक्त राज्य अमेरिका (यूएसए)", "न्यूजीलैंड"));
        arrayList.add(new ContentQuestionModel("लीमा _______________ की राजधानी है।", "पाकिस्तान", "रवांडा", "पोलैंड", "पेरू", "पेरू"));
        arrayList.add(new ContentQuestionModel("इराक की राजधानी क्या है?", "बगदाद", "तेहरान", "सिडनी", "न्यूयॉर्क", "बगदाद"));
        arrayList.add(new ContentQuestionModel("________________ मलेशिया की राजधानी है।", "माले", "कुआलालंपुर", "लंदन", "सियोल", "कुआलालंपुर"));
        arrayList.add(new ContentQuestionModel("एथेंस किस दक्षिण-पूर्वी यूरोपीय देश की राजधानी है?", "ग्रीस", "जर्मनी", "फिनलैंड", "चेक गणराज्य", "ग्रीस"));
        arrayList.add(new ContentQuestionModel("वियना _________________ की राजधानी शहर है।", "ऑस्ट्रिया", "हंगरी", "भारत", "बहरीन", "ऑस्ट्रिया"));
        arrayList.add(new ContentQuestionModel("इजरायल की राजधानी क्या है?", "डबलिन", "जर्मनी", "जेरूसलम", "बगदाद", "जर्मनी"));
        arrayList.add(new ContentQuestionModel("नैरोबी किस देश की राजधानी है?", "केन्या", "ईरान", "इराक", "जापान", "केन्या"));
        arrayList.add(new ContentQuestionModel("_____________ भारत की राजधानी है।", "लाहौर", "मुंबई", "नई दिल्ली", "हैदराबाद", "नई दिल्ली"));
        arrayList.add(new ContentQuestionModel("एम्स्टर्डम किस देश की राजधानी है?", "नेपाल", "न्यूजीलैंड", "नीदरलैंड", "म्यांमार", "नीदरलैंड"));
        arrayList.add(new ContentQuestionModel("ओमान की राजधानी क्या है?", "मस्कट", "तेहरान", "इस्लामाबाद", "रियाद", "मस्कट"));
        arrayList.add(new ContentQuestionModel("________________ दक्षिण कोरिया की राजधानी है।", "स्टॉकहोम", "सियोल", "बर्लिन", "प्योंगयांग", "सियोल"));
        arrayList.add(new ContentQuestionModel("___________________ संयुक्त राज्य अमेरिका (संयुक्त राज्य अमेरिका) राजधानी शहर", "न्यूयॉर्क", "शिकागो", "वाशिंगटन, डीसी।", "फिलाडेल्फिया", "वाशिंगटन, डीसी।"));
        arrayList.add(new ContentQuestionModel("अबू धाबी किस देश की राजधानी है?", "संयुक्त अरब अमीरात (यूएई)", "यूनाइटेड किंगडम (यूके)", "स्वीडन", "दक्षिण अफ्रीका", "संयुक्त अरब अमीरात (यूएई)"));
        arrayList.add(new ContentQuestionModel("इंडोनेशिया की राजधानी शहर क्या है?", "बुडापेस्ट", "किंग्स्टन", "जकार्ता", "टोक्यो", "जकार्ता"));
        arrayList.add(new ContentQuestionModel("डबलिन ____________________ की राजधानी है।", "आयरलैंड", "ईरान", "स्वीडन", "नॉर्वे", "आयरलैंड"));
        arrayList.add(new ContentQuestionModel("लेबनान की राजधानी क्या है?", "बेरूत", "बिश्केक", "प्रिस्टिना", "त्रिपोली", "बेरूत"));
        arrayList.add(new ContentQuestionModel("______________ स्लोवाकिया की राजधानी है।", "होनियारा", "ब्रातिस्लावा", "मैड्रिड", "हेलसिंकी", "ब्रातिस्लावा"));
        arrayList.add(new ContentQuestionModel("स्पेन की राजधानी क्या है?", "स्पेन", "पोर्ट ऑफ स्पेन", "ट्यूनिस", "कम्पाला", "स्पेन"));
        arrayList.add(new ContentQuestionModel("_____________________ बांग्लादेश की राजधानी है।", "काबुल", "काठमांडू", "ढाका", "कराची", "ढाका"));
        arrayList.add(new ContentQuestionModel("चीन की राजधानी क्या है?", "ज़ियामी", "बीजिंग", "शंघाई", "शेन्ज़ेन", "बीजिंग"));
        arrayList.add(new ContentQuestionModel("_________________ फ्रांस की राजधानी है।", "टूलूज़", "स्ट्रासबर्ग", "पेरिस", "बोर्डो", "पेरिस"));
        arrayList.add(new ContentQuestionModel("काहिरा किस देश की राजधानी है?", "ग्रीस", "जॉर्डन", "कुवैत", "मिस्र", "मिस्र"));
        arrayList.add(new ContentQuestionModel("_________________ मॉरीशस की राजधानी है।", "पोर्ट लुई", "माजुरो", "क्योरपाइप", "गुडलैंड्स", "पोर्ट लुई"));
        arrayList.add(new ContentQuestionModel("_________________ मॉरीशस की राजधानी है।", "पोर्ट लुई", "माजुरो", "क्योरपाइप", "गुडलैंड्स", "पोर्ट लुई"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("________________ روس کا دارالحکومت ہے۔" , "ماسکو" , "پراگ", "ہوانا" , "نئی دہلی","ماسکو"));
        arrayList.add(new ContentQuestionModel("کینیڈا کا دارالحکومت کیا ہے؟" , "ٹورنٹو" , "اوٹاوا" , "سانتیاگو" , "مندرجہ بالا میں سے کوئی بھی نہیں","اوٹاوا"));
        arrayList.add(new ContentQuestionModel("کینبرا کس جزیرے کے براعظم کا دارالحکومت ہے؟" , "آسٹریلیا" , "ایشیا" , "شمالی امریکہ" , "افریقہ","آسٹریلیا"));
        arrayList.add(new ContentQuestionModel("اٹلی کا دارالحکومت کونسا ہے جسے دنیا کا ابدی شہر بھی کہا جاتا ہے؟" , "روم" , "واشنگٹن ڈی سی" , "طرابلس" , "اسکوپجے","روم"));
        arrayList.add(new ContentQuestionModel("تھمپو کون سا جنوبی ایشین ملک کا دارالحکومت ہے؟" , "ہندوستان" , "سری لنکا" , "بھوٹان" , "افغانستان","بھوٹان"));
        arrayList.add(new ContentQuestionModel("ویلنگٹن کس ملک کا دارالحکومت ہے؟" ,"نیوزی لینڈ" , "مذکورہ بالا کوئی نہیں" , "کینیا" , "ریاستہائے متحدہ امریکہ (USA)","نیوزی لینڈ"));
        arrayList.add(new ContentQuestionModel("لیما _______________ کا دارالحکومت ہے۔" , "پاکستان" , "روانڈا" , "پولینڈ" , "پیرو","پیرو"));
        arrayList.add(new ContentQuestionModel("عراق کا دارالحکومت کیا ہے؟" , "بغداد" , "تہران" , "سڈنی" , "نیو یارک","بغداد"));
        arrayList.add(new ContentQuestionModel("________________ ملائیشیا کا دارالحکومت ہے۔" , "مرد" , "کوالالمپور" , "لندن" , "سیئول","کوالالمپور"));
        arrayList.add(new ContentQuestionModel("ایتھنز کس جنوب مشرقی یورپی ملک کا دارالحکومت ہے؟" , "یونان" , "جرمنی" , "فن لینڈ" , "جمہوریہ چیک","یونان"));
        arrayList.add(new ContentQuestionModel("ویانا _________________ کا دارالحکومت ہے۔" , "آسٹریا" , "ہنگری" , "ہندوستان" , "بحرین","آسٹریا"));
        arrayList.add(new ContentQuestionModel("اسرائیل کا دارالحکومت کیا ہے؟" , "ڈبلن" , "روم" , "یروشلم" , "بغداد","یروشلم"));
        arrayList.add(new ContentQuestionModel("نیروبی کس ملک کا دارالحکومت ہے؟" , "کینیا" , "ایران" , "عراق" , "جاپان","کینیا"));
        arrayList.add(new ContentQuestionModel("_____________ ہندوستان کا دارالحکومت ہے۔" , "لاہور" , "ممبئی" , "نئی دہلی" , "حیدرآباد","نئی دہلی"));
        arrayList.add(new ContentQuestionModel("ایمسٹرڈیم کس ملک کا دارالحکومت ہے؟" , "نیپال" , "نیوزی لینڈ" , "نیدرلینڈز" , "میانمار","نیدرلینڈز"));
        arrayList.add(new ContentQuestionModel("عمان کا دارالحکومت کیا ہے؟" , "مسقط" , "تہران" , "اسلام آباد" , "ریاض","مسقط"));
        arrayList.add(new ContentQuestionModel("________________ جنوبی کوریا کا دارالحکومت ہے۔" , "اسٹاک ہوم" , "سیئول" , "برلن" , "پیانگ یانگ","سیئول"));
        arrayList.add(new ContentQuestionModel("___________________ ریاستہائے متحدہ امریکہ کا دارالحکومت ہے۔ (USA)" , "نیو یارک" , "شکاگو" , "واشنگٹن ڈی سی." , "فلاڈیلفیا","واشنگٹن ڈی سی."));//18
        arrayList.add(new ContentQuestionModel("ابوظہبی کس ملک کا دارالحکومت ہے؟" , "متحدہ عرب امارات (متحدہ عرب امارات)" , "برطانیہ (برطانیہ)" , "سویڈن" , "جنوبی افریقہ","متحدہ عرب امارات (متحدہ عرب امارات)"));
        arrayList.add(new ContentQuestionModel("انڈونیشیا کا دارالحکومت کیا ہے؟" , "بوڈاپیسٹ" , "کنگسٹن" , "جکارتہ" , "ٹوکیو","جکارتہ"));
        arrayList.add(new ContentQuestionModel("ڈبلن ____________________ کا دارالحکومت ہے۔" , "آئرلینڈ" , "ایران" , "سویڈن" , "ناروے","آئرلینڈ"));
        arrayList.add(new ContentQuestionModel("لبنان کا دارالحکومت کیا ہے؟" , "بیروت" , "بشکیک" , "پرسٹینا" , "طرابلس","بیروت"));
        arrayList.add(new ContentQuestionModel("______________ سلوواکیا کا دارالحکومت ہے۔" , "ہونیرا" , "بریٹیسلاوا" , "میڈرڈ" , "ہیلسنکی","بریٹیسلاوا"));
        arrayList.add(new ContentQuestionModel("اسپین کا دارالحکومت کیا ہے؟" , "میڈرڈ" , "پورٹ آف اسپین" , "تیونس" , "کمپالا","میڈرڈ"));
        arrayList.add(new ContentQuestionModel("_____________________ بنگلہ دیش کا دارالحکومت ہے۔" , "کابل" , "کھٹمنڈو" , "ڈھاکہ" ,"کراچی","ڈھاکہ"));
        arrayList.add(new ContentQuestionModel("چین کا دارالحکومت کیا ہے؟" , "زیامین" , "بیجنگ", "شنگھائی" , "شینزین","بیجنگ"));
        arrayList.add(new ContentQuestionModel("_________________ فرانس کا دارالحکومت ہے۔" , "ٹولائوس" , "اسٹراسبرگ" , "پیرس" , "بورڈو","پیرس"));
        arrayList.add(new ContentQuestionModel("قاہرہ کس ملک کا دارالحکومت ہے؟" , "یونان" , "اردن" , "کویت" , "مصر","مصر"));
        arrayList.add(new ContentQuestionModel("_________________ موریشس کا دارالحکومت ہے۔" , "پورٹ لوئس" , "ماجوورو" ,"کیوریپائپ" , "گڈ لینڈز","پورٹ لوئس"));
        arrayList.add(new ContentQuestionModel("فلپائن کا دارالحکومت کیا ہے؟" , "وارسا" , "کوئزن سٹی" , "منیلا" , "دااوو سٹی","منیلا"));



        return arrayList;


    }


}