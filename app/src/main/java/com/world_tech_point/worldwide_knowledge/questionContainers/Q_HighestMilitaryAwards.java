package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_HighestMilitaryAwards {


    private Context context;
    public Q_HighestMilitaryAwards(Context context) {
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
        arrayList.add(new ThreeItemModel("Australia", "he Victoria Cross for Australia"));
        arrayList.add(new ThreeItemModel("Austria ", "The Military Merit Decoration"));
        arrayList.add(new ThreeItemModel("Argentina", "Cross to the Heroic Valour in Combat"));
        arrayList.add(new ThreeItemModel("Bangladesh ", "Bir Sreshtho"));
        arrayList.add(new ThreeItemModel("Belgium", "War Cross"));
        arrayList.add(new ThreeItemModel("Belarus ", "Order of Military Glory"));
        arrayList.add(new ThreeItemModel("Brazil", "Order of Military Merit (Brazil)"));
        arrayList.add(new ThreeItemModel("Bulgaria", "Order of Bravery"));
        arrayList.add(new ThreeItemModel("Canada", "The Victoria Cross of Canada\n"));
        arrayList.add(new ThreeItemModel("China", "Order of August First"));
        arrayList.add(new ThreeItemModel("Chile", "Legion of Merit"));
        arrayList.add(new ThreeItemModel("Colombia", "Order of San Mateo"));
        arrayList.add(new ThreeItemModel("Denmark", "The Valour Cross"));
        arrayList.add(new ThreeItemModel("Egypt", "Order of Honor Star"));
        arrayList.add(new ThreeItemModel("Estonia", "The Cross of Liberty"));
        arrayList.add(new ThreeItemModel("Finland", "Mannerheim Cross"));
        arrayList.add(new ThreeItemModel("France", "The Legion of Honour"));
        arrayList.add(new ThreeItemModel("Germany", "The Cross of Honour for Valour"));
        arrayList.add(new ThreeItemModel("Greece", "Medal for Gallantry, Cross of Valour"));
        arrayList.add(new ThreeItemModel("India", "Param Vir Chakra"));
        arrayList.add(new ThreeItemModel("Iran", "Fath Medal"));
        String str = "Medal of Valor";
        arrayList.add(new ThreeItemModel("Israel", str));
        arrayList.add(new ThreeItemModel("Italy", "Gold Medal of Military Valour"));
        arrayList.add(new ThreeItemModel("Japan", "Order of the Rising Sun"));
        arrayList.add(new ThreeItemModel("Jordan", "Navy Cross"));
        arrayList.add(new ThreeItemModel("Kuwait", "Liberation Medal"));
        arrayList.add(new ThreeItemModel("Libya", "Order of Katonga"));
        arrayList.add(new ThreeItemModel("Luxembourg", "Military Medal"));
        arrayList.add(new ThreeItemModel("Mexico", "The Mexican Order of the Aztec Eagle"));
        arrayList.add(new ThreeItemModel("Myanmar", "Aung San Thiriya"));
        arrayList.add(new ThreeItemModel("Netherlands", "Military William Order"));
        arrayList.add(new ThreeItemModel("Nepal", "Ratna Man Padavi"));
        arrayList.add(new ThreeItemModel("New Zealand", "The Victoria Cross for New Zealand"));
        arrayList.add(new ThreeItemModel("Norway", "The War Cross with Sword\n"));
        arrayList.add(new ThreeItemModel("North Korea", "Order of Kim Il - sung"));
        arrayList.add(new ThreeItemModel("Pakistan", "Nishan - e - Haider"));
        arrayList.add(new ThreeItemModel("Philippines", str));
        arrayList.add(new ThreeItemModel("Poland", "Order of Virtuti Militari"));
        arrayList.add(new ThreeItemModel("Portgual", "The Military Valor Medal"));
        arrayList.add(new ThreeItemModel("Russia", "Order of St. George, Hero of the Russian Federation"));
        arrayList.add(new ThreeItemModel("SaudiArabia", "Order of King Abdulaziz"));
        arrayList.add(new ThreeItemModel("Spain", "Laureate Cross of Saint Ferdinand"));
        arrayList.add(new ThreeItemModel("Sri - lanka", "Parama Weera Vibhushanaya"));
        arrayList.add(new ThreeItemModel("Thailand", "Order of Rama"));
        arrayList.add(new ThreeItemModel("Turkey", "Great Valor"));
        arrayList.add(new ThreeItemModel("Ukraine", "Hero of Ukraine"));
        arrayList.add(new ThreeItemModel("United Kingdom", "The Victoria Cross"));
        arrayList.add(new ThreeItemModel("United States", "Medal of Honor"));
        arrayList.add(new ThreeItemModel("Vitenam", "Vietnamese"));
        arrayList.add(new ThreeItemModel("Zambia", "Valour Cross"));
        arrayList.add(new ThreeItemModel("Zimbabwe", "The Gold Cross of Zimbabwe"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("অস্ট্রেলিয়া", "তিনি অস্ট্রেলিয়ার হয়ে ভিক্টোরিয়া ক্রস"));
        arrayList.add(new ThreeItemModel("অস্ট্রিয়া", "সামরিক যোগ্যতার সজ্জা"));
        arrayList.add(new ThreeItemModel("আর্জেন্টিনা", "লড়াইয়ে বীরত্বের বীর্যকে ক্রস করুন"));
        arrayList.add(new ThreeItemModel("বাংলাদেশ", "বিআর সুরথো"));
        arrayList.add(new ThreeItemModel("বেলজিয়াম", "ওয়ার ক্রস"));
        arrayList.add(new ThreeItemModel("বেলারুশ", "সামরিক গৌরব অর্ডার"));
        arrayList.add(new ThreeItemModel("ব্রাজিল", "সামরিক যোগ্যতার আদেশ (ব্রাজিল)"));
        arrayList.add(new ThreeItemModel("বুলগেরিয়া", "সাহসের আদেশ"));
        arrayList.add(new ThreeItemModel("কানাডা", "কানাডার দ্য ভিক্টোরিয়া ক্রস "));
        arrayList.add(new ThreeItemModel("চীন", "প্রথম আগস্টের আদেশ"));
        arrayList.add(new ThreeItemModel("চিলি", "যোগ্যতার দল"));
        arrayList.add(new ThreeItemModel("কলম্বিয়া", "অর্ডার অফ সান মাতিও"));
        arrayList.add(new ThreeItemModel("ডেনমার্ক", "দ্য ওয়ারোর ক্রস"));
        arrayList.add(new ThreeItemModel("মিশর", "অর্ডার অফ অনার স্টার"));
        arrayList.add(new ThreeItemModel("এস্তোনিয়া", "দ্য ক্রস অফ লিবার্টি"));
        arrayList.add(new ThreeItemModel("ফিনল্যান্ড", "ম্যাননারহিম ক্রস"));
        arrayList.add(new ThreeItemModel("ফ্রান্স", "সম্মানের দল"));
        arrayList.add(new ThreeItemModel("জার্মানি", "বীরত্বের জন্য ক্রস অফ অনার"));
        arrayList.add(new ThreeItemModel("গ্রীস", "সাহসিকতার জন্য পদক, বীরত্বের ক্রস"));
        arrayList.add(new ThreeItemModel("ভারত", "পরম বীর চক্র"));
        arrayList.add(new ThreeItemModel("ইরান", "ফাতাহ ম্যাডেল"));
        String str ="বীরত্বের পদক" ;
        arrayList.add(new ThreeItemModel("ইস্রায়েল", str));
        arrayList.add(new ThreeItemModel("ইতালি", "সামরিক বীরত্বের স্বর্ণপদক"));
        arrayList.add(new ThreeItemModel("জাপান", "রাইজিং সান এর আদেশ"));
        arrayList.add(new ThreeItemModel("জর্দান", "নেভি ক্রস"));
        arrayList.add(new ThreeItemModel("কুয়েত", "মুক্তি পদক"));
        arrayList.add(new ThreeItemModel("লিবিয়া", "কাটঙ্গার অর্ডার"));
        arrayList.add(new ThreeItemModel("লাক্সেমবার্গ", "সামরিক পদক"));
        arrayList.add(new ThreeItemModel("মেক্সিকো", "অ্যাজটেক agগলের মেক্সিকান অর্ডার"));
        arrayList.add(new ThreeItemModel("মিয়ানমার", "লং সান থিরিয়া"));
        arrayList.add(new ThreeItemModel("নেদারল্যান্ডস", "মিলিটারি উইলিয়াম অর্ডার"));
        arrayList.add(new ThreeItemModel("নেপাল", "রত্ন মন পদবি"));
        arrayList.add(new ThreeItemModel("নিউজিল্যান্ড", "নিউজিল্যান্ডের জন্য দ্য ভিক্টোরিয়া ক্রস"));
        arrayList.add(new ThreeItemModel("নরওয়ে", "তরোয়াল সহ যুদ্ধ ক্রস "));
        arrayList.add(new ThreeItemModel("উত্তর কোরিয়া", "অর্ডার অফ কিম ইল - গাওয়া"));
        arrayList.add(new ThreeItemModel("পাকিস্তান", "নিশান-ই-হায়দার"));
        arrayList.add(new ThreeItemModel("ফিলিপাইন", str));
        arrayList.add(new ThreeItemModel("পোল্যান্ড", "ভার্টুটি মিলিটারির অর্ডার"));
        arrayList.add(new ThreeItemModel("Portgual", "সামরিক বীরত্ব পদক"));
        arrayList.add(new ThreeItemModel("রাশিয়া", "সেন্ট জর্জ অর্ডার অফ, রাশিয়ান ফেডারেশনের নায়ক"));
        arrayList.add(new ThreeItemModel("সৌদি আরবিয়া", "কিং আবদুলাজিজের আদেশ"));
        arrayList.add(new ThreeItemModel("স্পেন", "সেন্ট ফার্দিনান্দের বিজয়ী ক্রস"));
        arrayList.add(new ThreeItemModel("শ্রী - লঙ্কা", "পরমা বীরা বিভূষণায়"));
        arrayList.add(new ThreeItemModel("থাইল্যান্ড", "অর্ডার অফ রামা"));
        arrayList.add(new ThreeItemModel("তুরস্ক", "মহান বীরত্ব"));
        arrayList.add(new ThreeItemModel("ইউক্রেন", "ইউক্রেনের নায়ক"));
        arrayList.add(new ThreeItemModel("যুক্তরাজ্য", "দ্য ভিক্টোরিয়া ক্রস"));
        arrayList.add(new ThreeItemModel("মার্কিন যুক্তরাষ্ট্র", "সম্মানের পদক"));
        arrayList.add(new ThreeItemModel("ভিটেনাম", "ভিয়েতনামী"));
        arrayList.add(new ThreeItemModel("জাম্বিয়া", "বীরত্ব ক্রস"));
        arrayList.add(new ThreeItemModel("জিম্বাবুয়ে", "জিম্বাবুয়ের গোল্ড ক্রস"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("ऑस्ट्रेलिया", "वह ऑस्ट्रेलिया के लिए विक्टोरिया क्रॉस"));
        arrayList.add(new ThreeItemModel("ऑस्ट्रिया", "द मिलिट्री मेरिट डेकोरेशन"));
        arrayList.add(new ThreeItemModel("अर्जेंटीना", "कॉम्बैट में वीर वीरता के लिए पार"));
        arrayList.add(new ThreeItemModel("बांग्लादेश", "Br Sreshtho"));
        arrayList.add(new ThreeItemModel("बेल्जियम", "वॉर क्रॉस"));
        arrayList.add(new ThreeItemModel("बेलारूस", "ऑर्डर ऑफ़ मिलिट्री ग्लोरी"));
        arrayList.add(new ThreeItemModel("ब्राजील", "ऑर्डर ऑफ मिलिट्री मेरिट (ब्राजील)"));
        arrayList.add(new ThreeItemModel("बुल्गारिया", "ऑर्डर ऑफ़ ब्रेवरी"));
        arrayList.add(new ThreeItemModel("कनाडा", "कनाडा का विक्टोरिया क्रॉस "));
        arrayList.add(new ThreeItemModel("चीन", "ऑर्डर ऑफ़ अगस्त फर्स्ट"));
        arrayList.add(new ThreeItemModel("चिली", "लीजन ऑफ़ मेरिट"));
        arrayList.add(new ThreeItemModel("कोलंबिया", "सैन माटेओ का आदेश"));
        arrayList.add(new ThreeItemModel("डेनमार्क", "द वेलोर क्रॉस"));
        arrayList.add(new ThreeItemModel("मिस्र", "ऑर्डर ऑफ़ ऑनर स्टार"));
        arrayList.add(new ThreeItemModel("एस्टोनिया", "द क्रॉस ऑफ़ लिबर्टी"));
        arrayList.add(new ThreeItemModel("फ़िनलैंड", "मैननेरहिम क्रॉस"));
        arrayList.add(new ThreeItemModel("फ्रांस", "द लीजन ऑफ़ ऑनर"));
        arrayList.add(new ThreeItemModel("जर्मनी", "द क्रॉस ऑफ़ ऑनर फॉर वेलोर"));
        arrayList.add(new ThreeItemModel("ग्रीस", "गैलेंट्री के लिए मेडल, क्रॉस ऑफ़ वेलोर"));
        arrayList.add(new ThreeItemModel("भारत", "परमवीर चक्र"));
        arrayList.add(new ThreeItemModel("ईरान", "फतह मैडल"));
        String str ="वीरता का पदक" ;
        arrayList.add(new ThreeItemModel("इजराइल", str));
        arrayList.add(new ThreeItemModel("इटली", "सैन्य पदक का स्वर्ण पदक"));
        arrayList.add(new ThreeItemModel("जापान", "ऑर्डर ऑफ़ द राइजिंग सन"));
        arrayList.add(new ThreeItemModel("जॉर्डन", "नेवी क्रॉस"));
        arrayList.add(new ThreeItemModel("कुवैत", "लिबरेशन मेडल"));
        arrayList.add(new ThreeItemModel("लीबिया", "कटंगा का आदेश"));
        arrayList.add(new ThreeItemModel("लक्समबर्ग", "सैन्य पदक"));
        arrayList.add(new ThreeItemModel("मेक्सिको", "द मैक्सिकन ऑर्डर ऑफ़ एज़्टेक ईगल"));
        arrayList.add(new ThreeItemModel("म्यांमार", "ॉन्ग सन ठिरिया"));
        arrayList.add(new ThreeItemModel("नीदरलैंड", "मिलिट्री विलियम ऑर्डर"));
        arrayList.add(new ThreeItemModel("नेपाल", "रत्न मन पदवी"));
        arrayList.add(new ThreeItemModel("न्यूजीलैंड", "न्यूजीलैंड के लिए विक्टोरिया क्रॉस"));
        arrayList.add(new ThreeItemModel("नॉर्वे", "तलवार के साथ युद्ध क्रॉस  "));
        arrayList.add(new ThreeItemModel("उत्तर कोरिया", "किम इल का आदेश - गाया"));
        arrayList.add(new ThreeItemModel("पाकिस्तान", "निशान - इ - हैदर"));
        arrayList.add(new ThreeItemModel("फिलीपींस", str));
        arrayList.add(new ThreeItemModel("पोलैंड", "ऑर्डर ऑफ़ पुण्युटी मिलितारी"));
        arrayList.add(new ThreeItemModel("पोर्टगुअल", "द मिलिट्री वेलोर मेडल"));
        arrayList.add(new ThreeItemModel("रूस", "ऑर्डर ऑफ सेंट जॉर्ज, रूसी संघ के हीरो"));
        arrayList.add(new ThreeItemModel("सऊदी अरबिया", "किंग अब्दुलअज़ीज़ का आदेश"));
        arrayList.add(new ThreeItemModel("स्पेन", "सेंट फर्डिनेंड का लॉरेट क्रॉस"));
        arrayList.add(new ThreeItemModel("श्री - लंका", "परमा वीरा विभूषणाय"));
        arrayList.add(new ThreeItemModel("थाईलैंड", "राम का आदेश"));
        arrayList.add(new ThreeItemModel("तुर्की", "ग्रेट वेलोर"));
        arrayList.add(new ThreeItemModel("यूक्रेन", "यूक्रेन के हीरो"));
        arrayList.add(new ThreeItemModel("यूनाइटेड किंगडम", "द विक्टोरिया क्रॉस"));
        arrayList.add(new ThreeItemModel("यूनाइटेड स्टेट्स", "मेडल ऑफ ऑनर"));
        arrayList.add(new ThreeItemModel("विटेनम", "वियतनामी"));
        arrayList.add(new ThreeItemModel("ज़ाम्बिया", "वेलोर क्रॉस"));
        arrayList.add(new ThreeItemModel("जिम्बाब्वे", "द गोल्ड क्रॉस ऑफ जिम्बाब्वे"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("آسٹریلیا" , "وہ وکٹوریہ کراس برائے آسٹریلیا"));
        arrayList.add(new ThreeItemModel("آسٹریا" , "فوجی میرٹ کی سجاوٹ"));
        arrayList.add(new ThreeItemModel("ارجنٹائن" , "جنگ میں بہادری کی بہادری کو عبور کرنا"));
        arrayList.add(new ThreeItemModel("بنگلہ دیش" , "برش سریشو"));
        arrayList.add(new ThreeItemModel("بیلجیم" , "وار کراس"));
        arrayList.add(new ThreeItemModel("بیلاروس" , "فوجی شان کا آرڈر"));
        arrayList.add(new ThreeItemModel("برازیل" , "فوجی میرٹ کا آرڈر (برازیل)"));
        arrayList.add(new ThreeItemModel("بلغاریہ" , "بہادری کا حکم"));
        arrayList.add(new ThreeItemModel("کینیڈا" , "کینیڈا کا وکٹوریہ کراس"));
        arrayList.add(new ThreeItemModel("چین" , "اگست کا حکم سب سے پہلے"));
        arrayList.add(new ThreeItemModel("چلی" , "لشکر کی میرٹ"));
        arrayList.add(new ThreeItemModel("کولمبیا", "آرڈر آف سان میٹو"));
        arrayList.add(new ThreeItemModel("ڈنمارک" , "دی ویلور کراس"));
        arrayList.add(new ThreeItemModel("مصر" , "آرڈر آف آنر اسٹار"));
        arrayList.add(new ThreeItemModel("ایسٹونیا" , "آزادی کا کراس"));
        arrayList.add(new ThreeItemModel("فن لینڈ" , "مینر ہیم کراس"));
        arrayList.add(new ThreeItemModel("فرانس" , "غیرت کا لشکر"));
        arrayList.add(new ThreeItemModel("جرمنی" , "بہادری کا کراس آف آنر"));
        arrayList.add(new ThreeItemModel("یونان" , "بہادری کا تمغہ ، بہادری کا پارہ"));
        arrayList.add(new ThreeItemModel("ہندوستان" , "پرم ویر چکر"));
        arrayList.add(new ThreeItemModel("ایران" , "فتاح میڈل"));
        String str ="تمغہ بہادری" ;
        arrayList.add(new ThreeItemModel("اسرا ییل", str));
        arrayList.add(new ThreeItemModel("اٹلی" , "فوجی بہادری کا طلائی تمغہ"));
        arrayList.add(new ThreeItemModel("جاپان" , "طلوع آفتاب کا حکم"));
        arrayList.add(new ThreeItemModel("اردن" , "نیوی کراس"));
        arrayList.add(new ThreeItemModel("کویت" , "لبریشن میڈل"));
        arrayList.add(new ThreeItemModel("لیبیا" , "کٹونگا کا آرڈر"));
        arrayList.add(new ThreeItemModel("لکسمبرگ" , "ملٹری میڈل"));
        arrayList.add(new ThreeItemModel("میکسیکو" , "ازٹیک ایگل کا میکسیکن آرڈر"));
        arrayList.add(new ThreeItemModel("میانمار" , "لانگ سن تھیریا"));
        arrayList.add(new ThreeItemModel("نیدرلینڈز" , "ملٹری ولیم آرڈر"));
        arrayList.add(new ThreeItemModel("نیپال" , "رتنا مان پڑاوی"));
        arrayList.add(new ThreeItemModel("نیوزی لینڈ" , "نیوزی لینڈ کے لئے وکٹوریہ کراس"));
        arrayList.add(new ThreeItemModel("ناروے" , "سورڈ کے ساتھ وار کراس"));
        arrayList.add(new ThreeItemModel("شمالی کوریا" , "کم ایل کا آرڈر - گایا ہوا"));
        arrayList.add(new ThreeItemModel("پاکستان" , "نشانِ حیدر"));
        arrayList.add(new ThreeItemModel("فلپائن", str));
        arrayList.add(new ThreeItemModel("پولینڈ" , "ورٹوٹی ملیٹری کا آرڈر"));
        arrayList.add(new ThreeItemModel("پورٹگول" , "فوجی بہادری تمغہ"));
        arrayList.add(new ThreeItemModel("روس" , "سینٹ جارج کا آرڈر ، روسی فیڈریشن کا ہیرو"));
        arrayList.add(new ThreeItemModel("سعودی عربیہ" , "شاہ عبد العزیز کا حکم"));
        arrayList.add(new ThreeItemModel("اسپین" , "سینٹ فرڈینینڈ کے لاریئٹ کراس"));
        arrayList.add(new ThreeItemModel("سری - لنکا" , "پرما ویرا وبھوشنائے"));
        arrayList.add(new ThreeItemModel("تھائی لینڈ" , "آرڈر آف رام"));
        arrayList.add(new ThreeItemModel("ترکی" ,"عظیم بہادری"));
        arrayList.add(new ThreeItemModel("یوکرین" , "یوکرین کا ہیرو"));
        arrayList.add(new ThreeItemModel("برطانیہ" , "وکٹوریہ کراس"));
        arrayList.add(new ThreeItemModel("ریاستہائے متحدہ" , "میڈل آف آنر"));
        arrayList.add(new ThreeItemModel("ویتنام" , "ویتنامی"));
        arrayList.add(new ThreeItemModel("زیمبیا" , "ویلور کراس"));
        arrayList.add(new ThreeItemModel("زمبابوے" , "زمبابوے کا گولڈ کراس"));


        return arrayList;
    }


}
