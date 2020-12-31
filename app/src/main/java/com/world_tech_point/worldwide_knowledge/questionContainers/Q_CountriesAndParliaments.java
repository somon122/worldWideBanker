package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_CountriesAndParliaments {


    private Context context;
    public Q_CountriesAndParliaments(Context context) {
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

        arrayList.add(new ThreeItemModel("Myanmar", "Pyithu Hluttaw"));
        arrayList.add(new ThreeItemModel("Netherlands", "States General (Staten-General)"));
        arrayList.add(new ThreeItemModel("New Zealand", "Parliament (House Of Representative)"));
        arrayList.add(new ThreeItemModel("Norway", "Storting"));
        arrayList.add(new ThreeItemModel("Oman", "Monarchy"));
        arrayList.add(new ThreeItemModel("Pakistan", "National Assembly & Senate"));
        arrayList.add(new ThreeItemModel("Papua New Guinea", "National Parliament"));
        arrayList.add(new ThreeItemModel("Paraguay", "Senate & Chamber Of Deputies"));
        arrayList.add(new ThreeItemModel("Philippines", "The Congress"));
        arrayList.add(new ThreeItemModel("Poland", "Sejm"));
        arrayList.add(new ThreeItemModel("Romania", "Great National Assembly"));
        arrayList.add(new ThreeItemModel("Russia", "Duma & Federal Council"));
        arrayList.add(new ThreeItemModel("Saudi Arabia", "Majlis Al Shura"));

        arrayList.add(new ThreeItemModel("Afghanistan", "Shora"));
        String str = "People’s Assembly";
        arrayList.add(new ThreeItemModel("Albania", str));
        String str2 = "National People’s Assembly";
        arrayList.add(new ThreeItemModel("Algeria", str2));
        arrayList.add(new ThreeItemModel("Andorra", "General Council"));
        arrayList.add(new ThreeItemModel("Angola", str2));
        String str3 = "National Congress";
        arrayList.add(new ThreeItemModel("Argentina", str3));
        arrayList.add(new ThreeItemModel("Australia", "Federal Parliament"));
        String str4 = "National Assembly";
        arrayList.add(new ThreeItemModel("Austria", str4));
        arrayList.add(new ThreeItemModel("Azerbaijan", "Melli Majlis"));
        arrayList.add(new ThreeItemModel("Bahamas", "General Assembly"));
        arrayList.add(new ThreeItemModel("Bahrain", "Consultative Council"));
        arrayList.add(new ThreeItemModel("Bangladesh", "Jatia Parliament"));
        arrayList.add(new ThreeItemModel("Belize", str4));
        arrayList.add(new ThreeItemModel("Bhutan", "Tsogdu"));
        arrayList.add(new ThreeItemModel("Bolivia", str3));
        arrayList.add(new ThreeItemModel("Botswana", str4));
        arrayList.add(new ThreeItemModel("Brazil", str3));
        arrayList.add(new ThreeItemModel("Britain", "Parliment (House Of Common’s And House Of Lords)"));
        arrayList.add(new ThreeItemModel("Brunei", str4));
        arrayList.add(new ThreeItemModel("Bulgaria", "Narodno Subranie"));
        arrayList.add(new ThreeItemModel("Cambodia", str4));
        String str5 = "Parliament";
        arrayList.add(new ThreeItemModel("Canada", str5));
        arrayList.add(new ThreeItemModel("China", str2));
        String str6 = "Congress";
        arrayList.add(new ThreeItemModel("Colombia", str6));
        String str7 = "Legislative Council And Senate";
        arrayList.add(new ThreeItemModel("Comoros", str7));
        arrayList.add(new ThreeItemModel("Congo Democratic", "Rep. Of National Legislative Council"));
        arrayList.add(new ThreeItemModel("Costa Rice", str7));
        arrayList.add(new ThreeItemModel("Crotia", "Sabor"));
        arrayList.add(new ThreeItemModel("Cuba", "National Assembly Of People’s Power"));
        arrayList.add(new ThreeItemModel("Denmark", "Folketing"));
        arrayList.add(new ThreeItemModel("East Timor", "Constituent Assembly"));
        arrayList.add(new ThreeItemModel("Ecuador", str3));
        arrayList.add(new ThreeItemModel("Egypt", str));
        arrayList.add(new ThreeItemModel("El Salvador", "Legislative Assembly"));
        arrayList.add(new ThreeItemModel("Ethiopia", "Federal Council And House Of Representative"));
        arrayList.add(new ThreeItemModel("Fiji Islands", "Senate & House Of Representative"));
        arrayList.add(new ThreeItemModel("Finland", "Eduskusta (Parliament)"));
        arrayList.add(new ThreeItemModel("France", str4));
        arrayList.add(new ThreeItemModel("Germany", "Bundestag (Lower House) And Bundesrat (Upper House)"));
        arrayList.add(new ThreeItemModel("Great Britain", str5));
        String str8 = "Chamber Of Deputies";
        arrayList.add(new ThreeItemModel("Greece", str8));
        arrayList.add(new ThreeItemModel("Guyana", str4));
        arrayList.add(new ThreeItemModel("Hungary", str4));
        arrayList.add(new ThreeItemModel("Iceland", "Althing"));
        arrayList.add(new ThreeItemModel("India", "Sansad"));
        arrayList.add(new ThreeItemModel("Indonesia", "People’s Consultative Assembly"));
        arrayList.add(new ThreeItemModel("Iran", "Majlis"));
        arrayList.add(new ThreeItemModel("Iraq", str4));
        arrayList.add(new ThreeItemModel("Ireland", "Oireachtas"));
        arrayList.add(new ThreeItemModel("Israel", "The Knesset"));
        arrayList.add(new ThreeItemModel("Italy", "Chamber Of Deputies And Senate"));
        arrayList.add(new ThreeItemModel("Japan", "Diet"));
        arrayList.add(new ThreeItemModel("Jordan", str4));
        arrayList.add(new ThreeItemModel("Korea(North)", "Supreme People’s Assembly"));
        arrayList.add(new ThreeItemModel("Korea(South)", str4));
        arrayList.add(new ThreeItemModel("Kuwait", str4));
        arrayList.add(new ThreeItemModel("Labanon", str4));
        arrayList.add(new ThreeItemModel("Laos", "People’s Supreme Assembly"));
        arrayList.add(new ThreeItemModel("Lativa", "Saeima"));
        arrayList.add(new ThreeItemModel("Lesotho", "National Assembly And Senate"));
        arrayList.add(new ThreeItemModel("Libya", "General People’s Congress"));
        arrayList.add(new ThreeItemModel("Lithuania", "Seimas"));
        arrayList.add(new ThreeItemModel("Luxembourg", str8));
        arrayList.add(new ThreeItemModel("Madagascar", str2));
        arrayList.add(new ThreeItemModel("Magnolia", "Khural"));
        String str9 = "Majilis";
        arrayList.add(new ThreeItemModel("Malaysia", str9));
        arrayList.add(new ThreeItemModel("Maldives", str9));
        arrayList.add(new ThreeItemModel("Mongolia", "Great People’s Khural"));
        arrayList.add(new ThreeItemModel("Montenegro", "Federal Assembly"));
        arrayList.add(new ThreeItemModel("Mozambique", str));
        arrayList.add(new ThreeItemModel("South Africa", str5));
        arrayList.add(new ThreeItemModel("Spain", "Crotes"));
        arrayList.add(new ThreeItemModel("Taiwan", "Yuan"));
        arrayList.add(new ThreeItemModel("Turkey", "Grand National Assembly"));
        arrayList.add(new ThreeItemModel("USA", str6));
        arrayList.add(new ThreeItemModel("Uzbekistan", "Oliy Majlis"));
        arrayList.add(new ThreeItemModel("Vietnam", str4));
        arrayList.add(new ThreeItemModel("Zambia", str4));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("আফগানিস্তান", "উপরে থেকে"));
        String str = "জনগণের সমাবেশ";
        arrayList.add(new ThreeItemModel("আলবেনিয়া", str));
        String str2 ="জাতীয় জনগণের সমাবেশ";
        arrayList.add(new ThreeItemModel("আলজেরিয়া", str2));
        arrayList.add(new ThreeItemModel("অ্যান্ডোরা", "সাধারণ পরিষদ"));
        arrayList.add(new ThreeItemModel("অ্যাঙ্গোলা", str2));
        String str3 ="জাতীয় কংগ্রেস";
        arrayList.add(new ThreeItemModel("আর্জেন্টিনা", str3));
        arrayList.add(new ThreeItemModel("অস্ট্রেলিয়া", "ফেডারেল সংসদ"));
        String str4 ="জাতীয় সমাবেশ" ;
        arrayList.add(new ThreeItemModel("অস্ট্রিয়া", str4));
        arrayList.add(new ThreeItemModel("আজারবাইজান", "মেলি মজলিস"));
        arrayList.add(new ThreeItemModel("বাহামা", "সাধারণ সভা"));
        arrayList.add(new ThreeItemModel("বাহরাইন", "পরামর্শমূলক কাউন্সিল"));
        arrayList.add(new ThreeItemModel("বাংলাদেশ", "জাতি সংসদ"));
        arrayList.add(new ThreeItemModel("Belize", str4));
        arrayList.add(new ThreeItemModel("ভুটান", "তাসোগদু"));
        arrayList.add(new ThreeItemModel("বলিভিয়া", str3));
        arrayList.add(new ThreeItemModel("বোতসোয়ানা", str4));
        arrayList.add(new ThreeItemModel("ব্রাজিল", str3));
        arrayList.add(new ThreeItemModel("ব্রিটেন", "সংসদ (হাউস অফ কমনস অ্যান্ড হাউস অফ লর্ডস)"));
        arrayList.add(new ThreeItemModel("ব্রুনেই", str4));
        arrayList.add(new ThreeItemModel("বুলগেরিয়া", "জাতীয় সংসদ"));
        arrayList.add(new ThreeItemModel("কম্বোডিয়া", str4));
        String str5 = "সংসদ";
        arrayList.add(new ThreeItemModel("কানাডা", str5));
        arrayList.add(new ThreeItemModel("চীন", str2));
        String str6 ="কংগ্রেস" ;
        arrayList.add(new ThreeItemModel("কলম্বিয়া", str6));
        String str7 ="আইন পরিষদ এবং সেনেট" ;
        arrayList.add(new ThreeItemModel("কোমোরোস", str7));
        arrayList.add(new ThreeItemModel("কঙ্গো গণতান্ত্রিক", "জাতীয় আইন পরিষদের প্রতিনিধি"));
        arrayList.add(new ThreeItemModel("কোস্টারিকা", str7));
        arrayList.add(new ThreeItemModel("ক্রোটিয়া", "গন্ধ"));
        arrayList.add(new ThreeItemModel("কিউবা", "জনগণের শক্তির জাতীয় সংসদ"));
        arrayList.add(new ThreeItemModel("ডেনমার্ক", "ফলটিং"));
        arrayList.add(new ThreeItemModel("পূর্ব তিমুর", "গণপরিষদ"));
        arrayList.add(new ThreeItemModel("ইকুয়েডর", str3));
        arrayList.add(new ThreeItemModel("মিশর", str));
        arrayList.add(new ThreeItemModel("এল সালভাদোর", "আইনসভা"));
        arrayList.add(new ThreeItemModel("ইথিওপিয়া", "ফেডারেল কাউন্সিল এবং প্রতিনিধি হাউস"));
        arrayList.add(new ThreeItemModel("ফিজি দ্বীপপুঞ্জ", "সিনেট এবং প্রতিনিধিদের ঘর"));
        arrayList.add(new ThreeItemModel("ফিনল্যান্ড", "সংসদ"));
        arrayList.add(new ThreeItemModel("ফ্রান্স", str4));
        arrayList.add(new ThreeItemModel("জার্মানি", "বুন্ডেস্টাগ (নিম্ন ঘর) এবং বুন্দেসরত (উচ্চ ঘর)"));
        arrayList.add(new ThreeItemModel("গ্রেট ব্রিটেন", str5));
        String str8 = "ডেপুটিস অফ চেম্বার";
        arrayList.add(new ThreeItemModel("গ্রীস", str8));
        arrayList.add(new ThreeItemModel("গায়ানা", str4));
        arrayList.add(new ThreeItemModel("হাঙ্গেরি", str4));
        arrayList.add(new ThreeItemModel("আইসল্যান্ড", "সবকিছু"));
        arrayList.add(new ThreeItemModel("ভারত", "সংসদ"));
        arrayList.add(new ThreeItemModel("ইন্দোনেশিয়া", "জনগণের পরামর্শমূলক সমাবেশ"));
        arrayList.add(new ThreeItemModel("ইরান", "মজলিস"));
        arrayList.add(new ThreeItemModel("ইরাক", str4));
        arrayList.add(new ThreeItemModel("আয়ারল্যান্ড", "ওরিয়াচটাস"));
        arrayList.add(new ThreeItemModel("ইস্রায়েল", "দ্য নেসেট"));
        arrayList.add(new ThreeItemModel("ইতালি", "ডেপুটি অফ অ্যান্ড সিনেট"));
        arrayList.add(new ThreeItemModel("জাপান", "ডায়েট"));
        arrayList.add(new ThreeItemModel("জর্দান", str4));
        arrayList.add(new ThreeItemModel("কোরিয়া (উত্তর)", "সর্বোচ্চ জনগণের সমাবেশ"));
        arrayList.add(new ThreeItemModel("কোরিয়া (দক্ষিণ)", str4));
        arrayList.add(new ThreeItemModel("কুয়েত", str4));
        arrayList.add(new ThreeItemModel("লেবানন", str4));
        arrayList.add(new ThreeItemModel("লাওস", "জনগণের সর্বোচ্চ আদালত"));
        arrayList.add(new ThreeItemModel("লাটিভা", "সাইমা"));
        arrayList.add(new ThreeItemModel("লেসোথো", "জাতীয় সংসদ এবং সিনেট"));
        arrayList.add(new ThreeItemModel("লিবিয়া", "সাধারণ মানুষের কংগ্রেস"));
        arrayList.add(new ThreeItemModel("লিথুয়ানিয়া", "সেমাস"));
        arrayList.add(new ThreeItemModel("লাক্সেমবার্গ", str8));
        arrayList.add(new ThreeItemModel("মাদাগাস্কার", str2));
        arrayList.add(new ThreeItemModel("ম্যাগনোলিয়া", "খুরাল"));
        String str9 ="মজিলিস" ;
        arrayList.add(new ThreeItemModel("মালয়েশিয়া", str9));
        arrayList.add(new ThreeItemModel("মালদ্বীপ", str9));
        arrayList.add(new ThreeItemModel("মঙ্গোলিয়া", "গ্রেট পিপলস খুরাল"));
        arrayList.add(new ThreeItemModel("মন্টিনিগ্রো", "ফেডারেল অ্যাসেম্বলি"));
        arrayList.add(new ThreeItemModel("মোজাম্বিক", str));
        arrayList.add(new ThreeItemModel("মায়ানমার", "পাইথু হাল্টু"));
        arrayList.add(new ThreeItemModel("নেদারল্যান্ডস", "স্টেটস জেনারেল (স্টেটন-জেনারেল)"));
        arrayList.add(new ThreeItemModel("নিউজিল্যান্ড", "সংসদ (প্রতিনিধি ঘর)"));
        arrayList.add(new ThreeItemModel("নরওয়ে", "সংরক্ষণ করা"));
        arrayList.add(new ThreeItemModel("ওমান", "রাজতন্ত্র"));
        arrayList.add(new ThreeItemModel("পাকিস্তান", "জাতীয় সংসদ এবং সিনেট"));
        arrayList.add(new ThreeItemModel("পাপুয়া নিউ গিনি", "জাতীয় সংসদ"));
        arrayList.add(new ThreeItemModel("প্যারাগুয়ে", "সিনেট ও ডেপুটি অফ চেম্বার"));
        arrayList.add(new ThreeItemModel("ফিলিপাইন", "কংগ্রেস"));
        arrayList.add(new ThreeItemModel("পোল্যান্ড", "সেজম"));
        arrayList.add(new ThreeItemModel("রোমানিয়া", "গ্রেট জাতীয় সংসদ"));
        arrayList.add(new ThreeItemModel("রাশিয়া", "ডুমা এবং ফেডারেল কাউন্সিল"));
        arrayList.add(new ThreeItemModel("সৌদি আরব", "মজলিস আল শুরা"));
        arrayList.add(new ThreeItemModel("দক্ষিন আফ্রিকা", str5));
        arrayList.add(new ThreeItemModel("স্পেন", "ক্রোটস"));
        arrayList.add(new ThreeItemModel("তাইওয়ান", "ইউয়ান"));
        arrayList.add(new ThreeItemModel("তুরস্ক", "গ্র্যান্ড ন্যাশনাল অ্যাসেম্বলি"));
        arrayList.add(new ThreeItemModel("আমেরিকা", str6));
        arrayList.add(new ThreeItemModel("উজবেকিস্তান", "অলি মজলিস"));
        arrayList.add(new ThreeItemModel("ভিয়েতনাম", str4));
        arrayList.add(new ThreeItemModel("জাম্বিয়া", str4));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("अफगानिस्तान", "ऊपर से"));
        String str = "पीपुल्स असेंबली";
        arrayList.add(new ThreeItemModel("अल्बानिया", str));
        String str2 ="नेशनल पीपुल्स असेंबली" ;
        arrayList.add(new ThreeItemModel("अल्जीरिया", str2));
        arrayList.add(new ThreeItemModel("अंडोरा", "जनरल काउंसिल"));
        arrayList.add(new ThreeItemModel("अंगोला", str2));
        String str3 = "नेशनल कांग्रेस";
        arrayList.add(new ThreeItemModel("अर्जेंटीना", str3));
        arrayList.add(new ThreeItemModel("ऑस्ट्रेलिया", "संघीय संसद"));
        String str4 = "राष्ट्रीय सभा";
        arrayList.add(new ThreeItemModel("ऑस्ट्रिया", str4));
        arrayList.add(new ThreeItemModel("अजरबैजान", "मेली मजलिस"));
        arrayList.add(new ThreeItemModel("बहामास", "महासभा"));
        arrayList.add(new ThreeItemModel("बहरीन", "परामर्शदात्री परिषद"));
        arrayList.add(new ThreeItemModel("बांग्लादेश", "जातिअ पार्लियामेंट"));
        arrayList.add(new ThreeItemModel("बेलिज", str4));
        arrayList.add(new ThreeItemModel("भूटान", "तसोग्दु"));
        arrayList.add(new ThreeItemModel("बोलीविया", str3));
        arrayList.add(new ThreeItemModel("बोत्सवाना", str4));
        arrayList.add(new ThreeItemModel("ब्राज़ील", str3));
        arrayList.add(new ThreeItemModel("ब्रिटेन", "पार्लिमेंट (हाउस ऑफ़ कॉमन एंड हाउस ऑफ़ लॉर्ड्स)"));
        arrayList.add(new ThreeItemModel("ब्रुनेई", str4));
        arrayList.add(new ThreeItemModel("बुल्गारिया", "नेशनल असेंबली"));
        arrayList.add(new ThreeItemModel("कम्बोडिया", str4));
        String str5 = "संसद";
        arrayList.add(new ThreeItemModel("कनाडा", str5));
        arrayList.add(new ThreeItemModel("चीन", str2));
        String str6 = "कांग्रेस";
        arrayList.add(new ThreeItemModel("कोलंबिया", str6));
        String str7 ="विधान परिषद और सीनेट" ;
        arrayList.add(new ThreeItemModel("कोमोरोस", str7));
        arrayList.add(new ThreeItemModel("कांगो लोकतांत्रिक", "राष्ट्रीय विधान परिषद के निरसन"));
        arrayList.add(new ThreeItemModel("कोस्टा रिका", str7));
        arrayList.add(new ThreeItemModel("क्रोटिया", "फ्लेवर"));
        arrayList.add(new ThreeItemModel("क्यूबा", "नेशनल असेंबली ऑफ पीपल्स पावर"));
        arrayList.add(new ThreeItemModel("डेनमार्क", "लोकगीत"));
        arrayList.add(new ThreeItemModel("ईस्ट तिमोर", "संविधान सभा"));
        arrayList.add(new ThreeItemModel("इक्वाडोर", str3));
        arrayList.add(new ThreeItemModel("मिस्र", str));
        arrayList.add(new ThreeItemModel("अल साल्वाडोर", "विधानसभा"));
        arrayList.add(new ThreeItemModel("इथियोपिया", "संघीय परिषद और प्रतिनिधि सभा"));
        arrayList.add(new ThreeItemModel("फिजी द्वीप समूह", "सीनेट और प्रतिनिधि सभा"));
        arrayList.add(new ThreeItemModel("फिनलैंड", "संसद"));
        arrayList.add(new ThreeItemModel("फ्रांस", str4));
        arrayList.add(new ThreeItemModel("जर्मनी", "बुंडेसटाग (निचला सदन) और बुंदेसराट (उच्च सदन)"));
        arrayList.add(new ThreeItemModel("ग्रेट ब्रिटेन", str5));
        String str8 ="एंथोनी के चैंबर" ;
        arrayList.add(new ThreeItemModel("यूनान", str8));
        arrayList.add(new ThreeItemModel("गुयाना", str4));
        arrayList.add(new ThreeItemModel("हंगरी", str4));
        arrayList.add(new ThreeItemModel("आइसलैंड", "एलाथिंग"));
        arrayList.add(new ThreeItemModel("इंडिया", "संसद"));
        arrayList.add(new ThreeItemModel("इंडोनेशिया", "पीपुल्स कंसल्टेंट असेंबली।"));
        arrayList.add(new ThreeItemModel("ईरान", "मजलिस"));
        arrayList.add(new ThreeItemModel("इराक", str4));
        arrayList.add(new ThreeItemModel("आयरलैंड", "ओइर्चेटास"));
        arrayList.add(new ThreeItemModel("इज़राइल", "द केसेट"));
        arrayList.add(new ThreeItemModel("इटली", "चैंबर ऑफ डेप्युटी एंड सीनेट"));
        arrayList.add(new ThreeItemModel("जापान", "आहार"));
        arrayList.add(new ThreeItemModel("जोर्डन", str4));
        arrayList.add(new ThreeItemModel("कोरिया (उत्तर)", "सुप्रीम पीपुल्स असेंबली"));
        arrayList.add(new ThreeItemModel("कोरिया, दक्षिण)", str4));
        arrayList.add(new ThreeItemModel("कुवैत", str4));
        arrayList.add(new ThreeItemModel("लेबनान", str4));
        arrayList.add(new ThreeItemModel("लाओस", "पीपुल्स सुप्रीम असेंबली"));
        arrayList.add(new ThreeItemModel("लतिवा", "सेइमा"));
        arrayList.add(new ThreeItemModel("लेसोथो", "नेशनल असेंबली और सीनेट"));
        arrayList.add(new ThreeItemModel("लीबिया", "जनरल पीपुल्स कांग्रेस"));
        arrayList.add(new ThreeItemModel("लिथुआनिया", "सीमस"));
        arrayList.add(new ThreeItemModel("लक्ज़मबर्ग", str8));
        arrayList.add(new ThreeItemModel("मेडागास्कर", str2));
        arrayList.add(new ThreeItemModel("मैगनोलिया", "खुराल"));
        String str9 ="Majilis";
        arrayList.add(new ThreeItemModel("मलेशिया", str9));
        arrayList.add(new ThreeItemModel("मालदीव", str9));
        arrayList.add(new ThreeItemModel("मंगोलिया", "ग्रेट पीपुल्स खुराल"));
        arrayList.add(new ThreeItemModel("मोंटेनेग्रो", "संघीय विधानसभा"));
        arrayList.add(new ThreeItemModel("मोजाम्बिक", str));
        arrayList.add(new ThreeItemModel("म्यांमार", "पाइथु ह्लुटाव"));
        arrayList.add(new ThreeItemModel("नीदरलैंड", "स्टेट्स जनरल (स्टेटन-जनरल))"));
        arrayList.add(new ThreeItemModel("न्यूजीलैंड", "संसद (प्रतिनिधि सभा)"));
        arrayList.add(new ThreeItemModel("नॉर्वे", "स्टॉर्टिंग"));
        arrayList.add(new ThreeItemModel("ओमान", "राजशाही"));
        arrayList.add(new ThreeItemModel("पाकिस्तान", "नेशनल असेंबली और सीनेट"));
        arrayList.add(new ThreeItemModel("पापुआ न्यू गिनी", "नेशनल पार्लियामेंट"));
        arrayList.add(new ThreeItemModel("पराग्वे", "सीनेट और चैंबर ऑफ डेप्युटीज़"));
        arrayList.add(new ThreeItemModel("फिलीपींस", "द कांग्रेस"));
        arrayList.add(new ThreeItemModel("पोलैंड", "सेजम"));
        arrayList.add(new ThreeItemModel("रोमानिया", "ग्रेट नेशनल असेंबली"));
        arrayList.add(new ThreeItemModel("रूस", "ड्यूमा एंड फेडरल काउंसिल"));
        arrayList.add(new ThreeItemModel("सऊदी अरबिया", "मजलिस अल शूरा"));
        arrayList.add(new ThreeItemModel("दक्षिण अफ्रीका", str5));
        arrayList.add(new ThreeItemModel("स्पेन", "क्रोट्स"));
        arrayList.add(new ThreeItemModel("ताइवान", "युआन"));
        arrayList.add(new ThreeItemModel("तुर्की", "ग्रैंड नेशनल असेंबली"));
        arrayList.add(new ThreeItemModel("अमेरीका", str6));
        arrayList.add(new ThreeItemModel("उज्बेकिस्तान", "ओली मजलिस"));
        arrayList.add(new ThreeItemModel("वियतनाम", str4));
        arrayList.add(new ThreeItemModel("ज़ाम्बिया", str4));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("افغانستان" , "اوپر سے"));
        String str ="لوگوں کی مجلس" ;
        arrayList.add(new ThreeItemModel("البانیہ", str));
        String str2 ="قومی عوام کی مجلس" ;
        arrayList.add(new ThreeItemModel("الجیریا", str2));
        arrayList.add(new ThreeItemModel("انڈورا" , "جنرل کونسل"));
        arrayList.add(new ThreeItemModel("انگولا", str2));
        String str3 ="نیشنل کانگریس" ;
        arrayList.add(new ThreeItemModel("ارجنٹائن", str3));
        arrayList.add(new ThreeItemModel("آسٹریلیا" , "وفاقی پارلیمنٹ"));
        String str4 ="قومی اسمبلی" ;
        arrayList.add(new ThreeItemModel("آسٹریا", str4));
        arrayList.add(new ThreeItemModel("آذربائیجان" , "میلے مجلس"));
        arrayList.add(new ThreeItemModel("بہاماس" , "جنرل اسمبلی"));
        arrayList.add(new ThreeItemModel("بحرین" , "مشاورتی کونسل"));
        arrayList.add(new ThreeItemModel("بنگلہ دیش" , "ذات پارلیمنٹ"));
        arrayList.add(new ThreeItemModel("بیلیز", str4));
        arrayList.add(new ThreeItemModel("بھوٹان" , "تسوگدو"));
        arrayList.add(new ThreeItemModel("Bolivia", str3));
        arrayList.add(new ThreeItemModel("بوٹسوانا", str4));
        arrayList.add(new ThreeItemModel("برازیل", str3));
        arrayList.add(new ThreeItemModel("برطانیہ" , "پارلیمنٹ (ہاؤس آف کامنز اینڈ ہاؤس آف لارڈز)"));
        arrayList.add(new ThreeItemModel("برونائی", str4));
        arrayList.add(new ThreeItemModel("بلغاریہ" , "قومی اسمبلی"));
        arrayList.add(new ThreeItemModel("کمبوڈیا", str4));
        String str5 ="پارلیمنٹ" ;
        arrayList.add(new ThreeItemModel("کینیڈا", str5));
        arrayList.add(new ThreeItemModel("چین", str2));
        String str6 ="کانگریس";
        arrayList.add(new ThreeItemModel("کولمبیا", str6));
        String str7 = "قانون ساز کونسل اور سینیٹ";
        arrayList.add(new ThreeItemModel("کوموروس", str7));
        arrayList.add(new ThreeItemModel("کانگو ڈیموکریٹک" , "قومی قانون ساز کونسل کی نمائندہ۔"));
        arrayList.add(new ThreeItemModel("کوسٹا ریکا", str7));
        arrayList.add(new ThreeItemModel("کروٹیا" , "ذائقہ"));
        arrayList.add(new ThreeItemModel("کیوبا" , "لوگوں کی طاقت کی قومی اسمبلی"));
        arrayList.add(new ThreeItemModel("ڈنمارک" , "فولٹنگ"));
        arrayList.add(new ThreeItemModel("مشرقی تیمور" , "دستور ساز اسمبلی"));
        arrayList.add(new ThreeItemModel("ایکواڈور", str3));
        arrayList.add(new ThreeItemModel("مصر", str));
        arrayList.add(new ThreeItemModel("ایل سیلواڈور" , "قانون ساز اسمبلی"));
        arrayList.add(new ThreeItemModel("ایتھوپیا" , "فیڈرل کونسل اینڈ نمائندہ ایوان"));
        arrayList.add(new ThreeItemModel("فجی جزیرے" , "سینیٹ اور ایوان نمائندگان"));
        arrayList.add(new ThreeItemModel("فن لینڈ" , "پارلیمنٹ"));
        arrayList.add(new ThreeItemModel("فرانس", str4));
        arrayList.add(new ThreeItemModel("جرمنی" , "بنڈسٹیگ (لوئر ہاؤس) اور بنڈسراٹ (بالائی ہاؤس)"));
        arrayList.add(new ThreeItemModel("عظیم برطانیہ", str5));
        String str8 ="ڈپٹی آف چیمبر" ;
        arrayList.add(new ThreeItemModel("یونان", str8));
        arrayList.add(new ThreeItemModel("گیانا", str4));
        arrayList.add(new ThreeItemModel("ہنگری", str4));
        arrayList.add(new ThreeItemModel("آئس لینڈ" , "کچھ"));
        arrayList.add(new ThreeItemModel("آئس لینڈ" , "کچھ"));
        arrayList.add(new ThreeItemModel("انڈونیشیا" , "لوگوں کی مشاورتی اسمبلی"));
        arrayList.add(new ThreeItemModel("Iran", "Majlis"));
        arrayList.add(new ThreeItemModel("عراق", str4));
        arrayList.add(new ThreeItemModel("آئرلینڈ" , "اوریچاس"));
        arrayList.add(new ThreeItemModel("اسرائیل" , "ننیسیٹ"));
        arrayList.add(new ThreeItemModel("اٹلی" , "نمائندہ اور سینیٹ کا چیمبر"));
        arrayList.add(new ThreeItemModel("جاپان" , "غذا"));
        arrayList.add(new ThreeItemModel("اردن", str4));
        arrayList.add(new ThreeItemModel("کوریا (شمالی)" , "سپریم لوگوں کی مجلس"));
        arrayList.add(new ThreeItemModel("کوریا (جنوبی)", str4));
        arrayList.add(new ThreeItemModel("کویت", str4));
        arrayList.add(new ThreeItemModel("Labanon", str4));
        arrayList.add(new ThreeItemModel("لاؤس" , "لوگوں کی سپریم اسمبلی"));
        arrayList.add(new ThreeItemModel("لاٹیوا" , "صائمہ"));
        arrayList.add(new ThreeItemModel("لیسوتھو" , "قومی اسمبلی اور سینیٹ"));
        arrayList.add(new ThreeItemModel("لیبیا" , "عام لوگوں کی کانگریس"));
        arrayList.add(new ThreeItemModel("لیتھوانیا" , "سیماس"));
        arrayList.add(new ThreeItemModel("لکسمبرگ", str8));
        arrayList.add(new ThreeItemModel("مڈغاسکر", str2));
        arrayList.add(new ThreeItemModel("مگنولیا" , "کھورال"));
        String str9 = "مجیلس";
        arrayList.add(new ThreeItemModel("ملائیشیا", str9));
        arrayList.add(new ThreeItemModel("مالدیپ", str9));
        arrayList.add(new ThreeItemModel("منگولیا" , "عظیم لوگوں کا کھورال"));
        arrayList.add(new ThreeItemModel("مونٹی نیگرو" , "وفاقی اسمبلی"));
        arrayList.add(new ThreeItemModel("موزمبیق", str));
        arrayList.add(new ThreeItemModel("میانمار" , "پیتھو ہلوٹو"));
        arrayList.add(new ThreeItemModel("نیدرلینڈز" , "اسٹیٹس جنرل (اسٹیٹن جنرل))"));
        arrayList.add(new ThreeItemModel("نیوزی لینڈ" , "پارلیمنٹ (نمائندہ ایوان))"));
        arrayList.add(new ThreeItemModel("ناروے" , "ذخیرہ اندوزی"));
        arrayList.add(new ThreeItemModel("عمان" , "بادشاہت"));
        arrayList.add(new ThreeItemModel("پاکستان" , "قومی اسمبلی اور سینیٹ"));
        arrayList.add(new ThreeItemModel("پاپوا نیو گنی" , "قومی پارلیمنٹ"));
        arrayList.add(new ThreeItemModel("پیراگوئے" , "سینٹ اینڈ چیمبر آف ڈپٹی"));
        arrayList.add(new ThreeItemModel("فلپائن" , "کانگریس"));
        arrayList.add(new ThreeItemModel("پولینڈ" , "سیجم"));
        arrayList.add(new ThreeItemModel("رومانیہ" , "عظیم قومی اسمبلی"));
        arrayList.add(new ThreeItemModel("روس" , "ڈوما اور فیڈرل کونسل"));
        arrayList.add(new ThreeItemModel("Saudi Arabia", "Majlis Al Shura"));
        arrayList.add(new ThreeItemModel("جنوبی افریقہ", str5));
        arrayList.add(new ThreeItemModel("سپین" , "کروٹس"));
        arrayList.add(new ThreeItemModel("تائیوان" , "یوآن"));
        arrayList.add(new ThreeItemModel("ترکی", "گرینڈ نیشنل اسمبلی"));
        arrayList.add(new ThreeItemModel("امریکا", str6));
        arrayList.add(new ThreeItemModel("ازبیکستان" , "اولی مجلس"));
        arrayList.add(new ThreeItemModel("ویتنام", str4));
        arrayList.add(new ThreeItemModel("زیمبیا", str4));


        return arrayList;
    }


}
