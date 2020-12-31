package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class NaturalSevenWonders {
    private Context context;

    public NaturalSevenWonders(Context context) {
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

      arrayList.add(new ContentQuestionModel("Which of these is a list of the Wonders of the World?","Modern Wonders","Natural Wonders","Ancient Wonders","All of the above","All of the above"));
        arrayList.add(new ContentQuestionModel("The Great Pyramid of Egypt is part of the Wonders of the _________ World.","Ancient","Natural","New","None of these","Ancient"));
        arrayList.add(new ContentQuestionModel("How many massive pyramids remain in Giza, Egypt, today?","1","2","3","4","3"));
        arrayList.add(new ContentQuestionModel("Who built the Hanging Gardens of Babylon?","Jakir","Soloman","Abraham","Nebuchadnezzar II","Nebuchadnezzar II"));
        arrayList.add(new ContentQuestionModel("Which is called the first wonder of the world?","The Pyramids of Egypt","The Hanging Gardens of Babylon","The Tomb of Mausolus","The Colossus of Rhodes","The Pyramids of Egypt"));
        arrayList.add(new ContentQuestionModel("Which among the following does not belong to the seven ancient wonders of the world?","The Statue of Jupiter Olympus","The Pharos of Alexandria","Great Wall of China","The Pyramids of Egypt","Great Wall of China"));

        arrayList.add(new ContentQuestionModel("Who built the Pharos of Alexandria?","Dinocrates","Eudoxus of Cnidus","Mausolus","Sostratus of Cnidus","Sostratus of Cnidus"));
        arrayList.add(new ContentQuestionModel("Which among the following does not belong to seven new wonders of the world?","Taj Mahal of Agra","Pyramid at Chichen Itza","Ruins of Petra","The Eiffel Tower in Paris","The Eiffel Tower in Paris"));
        arrayList.add(new ContentQuestionModel("Who built Machu Picchu?","Atahualpa","Huayna Capac","Pachacutec","Viracocha Inca","Pachacutec"));
        arrayList.add(new ContentQuestionModel("Who designed Statue of Christ - The Redeemer?","Anna Levinson","Apostolos Vellios","Heitor de Silva Costa","Olena Shurkhno","Heitor de Silva Costa"));
        arrayList.add(new ContentQuestionModel("Who built the Hanging Gardens of Babylon?","Jakir","Soloman","Abraham","Nebuchadnezzar II","Nebuchadnezzar II"));
        arrayList.add(new ContentQuestionModel("Which is called the first wonder of the world?","The Pyramids of Egypt","The Hanging Gardens of Babylon","The Tomb of Mausolus","The Colossus of Rhodes","The Pyramids of Egypt"));
        arrayList.add(new ContentQuestionModel("Which among the following does not belong to the seven ancient wonders of the world?","The Statue of Jupiter Olympus","The Pharos of Alexandria","Great Wall of China","The Pyramids of Egypt","Great Wall of China"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("মাচু পিচ্চু কে তৈরি করেছেন?", "আতাহুয়ালপা", "হুয়না ক্যাপাক", "পাচাকুটেক", "ভাইরাচা ইনকা", "পাচাকুটেক"));
        arrayList.add(new ContentQuestionModel("নীচের মধ্যে কোনটি বিশ্বের সাতটি প্রাচীন বিস্ময়ের সাথে সম্পর্কিত নয়?", "স্ট্যাচু অফ জুপিটার অলিম্পাস", "দ্য ফেরোস অফ আলেকজান্দ্রিয়া", "গ্রেট ওয়াল অফ চায়না", "মিশরের পিরামিডস", "গ্রেট ওয়াল অফ চায়না"));
        arrayList.add(new ContentQuestionModel("নীচের মধ্যে কোনটি বিশ্বের সাতটি প্রাচীন বিস্ময়ের সাথে সম্পর্কিত নয়?", "স্ট্যাচু অফ জুপিটার অলিম্পাস", "দ্য ফেরোস অফ আলেকজান্দ্রিয়া", "গ্রেট ওয়াল অফ চায়না", "মিশরের পিরামিডস", "গ্রেট ওয়াল অফ চায়না"));
        arrayList.add(new ContentQuestionModel("নীচের মধ্যে কোনটি বিশ্বের সাতটি নতুন বিস্ময়ের সাথে সম্পর্কিত নয়?", "আগ্রার তাজমহল", "পিচনিড এ চিচেন ইতজা", "পেট্রার ধ্বংসাবশেষ", "প্যারিসের আইফেল টাওয়ার", "প্যারিসের আইফেল টাওয়ার"));

        arrayList.add(new ContentQuestionModel("স্ট্যাচু অফ ক্রাইস্ট - দি রিডিমার কে ডিজাইন করেছিলেন?", "আনা লেভিনসন", "অ্যাপোস্টোলোস ভেলিয়াস", "হিটার ডি সিলভা কোস্টা", "ওলেনা শুর্খনো", "হিটার ডি সিলভা কোস্টা"));
        arrayList.add(new ContentQuestionModel("এর মধ্যে কোনটি বিশ্বের ওয়ান্ডার্সের তালিকা?", "আধুনিক আশ্চর্য", "প্রাকৃতিক আশ্চর্য", "প্রাচীন আশ্চর্য", "উপরের সমস্ত", "উপরের সমস্ত"));
        arrayList.add(new ContentQuestionModel("পৃথিবীর প্রথম আশ্চর্য বলা হয় কোনটিকে?", "মিশরের পিরামিডস", "ব্যাবিলনের ঝুলন্ত উদ্যান", "মাউসোলাসের সমাধি", "রোডসের কলসাস", "মিশরের পিরামিডস"));

        arrayList.add(new ContentQuestionModel("মিশরের গ্রেট পিরামিড _________ ওয়ার্ল্ডের বিস্ময়ের অংশ" ,"প্রাচীন"," প্রাকৃতিক "," নতুন "," এর কিছুই নেই ","প্রাচীন"));
        arrayList.add(new ContentQuestionModel("আজ মিশরের গিজায় কত বড় পিরামিড রয়েছে?", "1", "2", "3", "4", "3"));
        arrayList.add(new ContentQuestionModel("ব্যাবিলনের ঝুলন্ত উদ্যান কে তৈরি করেছেন?", "জাকির", "সলোমন", "আব্রাহাম", "নেবুচাদনেজার দ্বিতীয়", "নেবুচাদনেজার দ্বিতীয়"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("जिसे दुनिया का पहला आश्चर्य कहा जाता है?", "द पिरामिड ऑफ़ मिस्र", "द हैंगिंग गार्डन ऑफ़ बेबीलोन", "द टॉम्ब ऑफ मौसोलस", "द कोलोसस ऑफ़ रोड्स", "द पिरामिड ऑफ़ मिस्र"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन दुनिया के सात प्राचीन अजूबों में से नहीं है?", "द स्टैच्यू ऑफ जुपिटर ओलंपस", "द फैरोस ऑफ अलेक्जेंड्रिया", "ग्रेट चीन की दीवार", "द पिरामिड ऑफ इजिप्ट","ग्रेट चीन की दीवार"));
        arrayList.add(new ContentQuestionModel("अलेक्जेंड्रिया के फ्रास का निर्माण किसने किया?", "डाइनोक्रेट्स", "यूडोसो ऑफ़ ओर्स", "मौसोलोस", "ओस्ट के सॉस्ट्रेटस", "ओस्ट के सॉस्ट्रेटस"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन दुनिया के सात नए आश्चर्यों से संबंधित नहीं है?", "आगरा का ताजमहल", "चिचेन इत्ज़ा का पिरामिड", "रुइरास ऑफ़ पेट्रा", "द एफिल टॉवर  पेरिस में", "द एफिल टॉवर  पेरिस में"));
        arrayList.add(new ContentQuestionModel("माचू पिचू", "अथाहल्पा", "पचकटे  का निर्माण किसने किया था?", "पचकटेक", "विरकोचा इंका", "पचकटे  का निर्माण किसने किया था?"));
        arrayList.add(new ContentQuestionModel("स्टैच्यू ऑफ़ क्राइस्ट - द रिडीमर?", "अन्ना लेविंसन", "हेइटर डे सिल्वा कोस्टा  का डिजाइन किसने किया।", "हेटर डे सिल्वा कोस्टा", "ओलेना शूर्ख्नो", "हेइटर डे सिल्वा कोस्टा  का डिजाइन किसने किया।"));
        arrayList.add(new ContentQuestionModel("इनमें से कौन सा चमत्कार दुनिया की सूची है?", "आधुनिक चमत्कार", "प्राकृतिक चमत्कार", "प्राचीन चमत्कार", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("मिस्र का महान पिरामिड _________ विश्व के आश्चर्यों का हिस्सा है।", "प्राचीन", "प्राकृतिक", "नया", "इनमें से कोई नहीं", "प्राचीन"));
        arrayList.add(new ContentQuestionModel("गीज़ा, मिस्र में आज कितने विशाल पिरामिड बने हुए हैं?", "1", "2", "3", "4", "3"));
        arrayList.add(new ContentQuestionModel("बाबुल के हैंगिंग गार्डन का निर्माण किसने किया?", "जाकिर", "सोलोमन", "अब्राहम", "नबूकदनेस्सर II", "नबूकदनेस्सर II"));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("دنیا کا پہلا تعجب کہاں کہا جاتا ہے؟" ,"مصر کے اہرام" , "بابل کے معلق باغات" , "مقبروں کا مقبرہ" , "رہوڈوں کا کولاسس","مصر کے اہرام"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا دنیا کے سات قدیم عجائبات سے تعلق نہیں رکھتا؟" , "مجسمہ کا مشتبہ اولمپس" , "اسکندریہ کا پھیرس" , "چین کی عظیم دیوار" , "مصر کے اہرام","چین کی عظیم دیوار"));
        arrayList.add(new ContentQuestionModel("اسکندریہ کے پھروز کو کس نے بنایا؟" , "ڈائناکریٹس" , "ینیڈوکس آف کنیڈوس" , "مائوسولس" , "آسٹری کا سوسٹریٹس","آسٹری کا سوسٹریٹس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا دنیا کے سات نئے عجائبات سے تعلق نہیں رکھتا؟" , "آگرہ کا تاج محل" , "چیچن اتزہ پر پیرامڈ" , "پیٹرا کا کھنڈرات" , "پیرس میں ایفل ٹاور","پیرس میں ایفل ٹاور"));
        arrayList.add(new ContentQuestionModel("ماچو پچو کس نے بنایا؟" , "اتہوالاپا" , "ہوئنا کیپیک" , "پاچاکوٹیک" , "وائراکوچا انکا","پاچاکوٹیک"));
        arrayList.add(new ContentQuestionModel("مجسمہ برائے مسیح - دی امتزاج کس نے ڈیزائن کیا؟" , "انا لیونسن" , "اپوستوولوس ویلیوس" , "ہیٹر ڈی سلوا کوسٹا" , "اولینا شورخنو","ہیٹر ڈی سلوا کوسٹا"));
        arrayList.add(new ContentQuestionModel("ان میں سے کون سی دنیا کے حیرت کی فہرست ہے؟" , "جدید حیرت" , "اوپر کا سارا" , "قدیم حیرت" , "مذکورہ بالا سب","اوپر کا سارا"));
        arrayList.add(new ContentQuestionModel("مصر کا عظیم اہرامہ _________ دنیا کے حیرت کا ایک حصہ ہے۔" , "قدیم" ,"قدرتی" , "نیا" , "ان میں سے کوئی بھی نہیں","قدیم"));
        arrayList.add(new ContentQuestionModel("آج ، مصر کے گیزا میں کتنے بڑے پیمانے پر اہرام باقی ہیں؟","1","2","3","4","3"));
        arrayList.add(new ContentQuestionModel("بابل کے پھانسی کے باغات کس نے بنائے؟" , "جاکر" , "سولو مین" , "نبو کد نضر دوم" , "نبوچادنسر دوم","نبو کد نضر دوم"));


        return arrayList;


    }


}