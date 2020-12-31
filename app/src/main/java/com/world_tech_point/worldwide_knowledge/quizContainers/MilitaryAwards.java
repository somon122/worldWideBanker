package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class MilitaryAwards {

    private Context context;

    public MilitaryAwards(Context context) {
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

       arrayList.add(new ContentQuestionModel("Which is the highest military award of Turkey?","Iron Cross","Virtuti military","Medal of honour","None of these","Medal of honour"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of South Africa?","Param Vir Chukara","NKWE ya gauta (Gold Leopard)","African medal","None of these","NKWE ya gauta (Gold Leopard)"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Romania?","Aparatorii Independentei","Iron cross","Medal of honour","None of these","Aparatorii Independentei"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Poland?","Order of Virtuti Militari","Medal of honour","iron cross","None of these","Order of Virtuti Militari"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Netherlands?","Military William Order","Medal of honour","Iron cross","None of these","Military William Order"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Kuwait?","Order of leopard","Wisam-al-Tahrir","Iron cross","None of these","Wisam-al-Tahrir"));
        arrayList.add(new ContentQuestionModel("Which of the following ranks in the air force is higher?","Air Commander","Squadron Leader","Wing Commander","Group Captain","Air Commander"));

        arrayList.add(new ContentQuestionModel("Which is the highest civil award of Pakistan?","Nishan-e-Imtiaz","Iron Cross","Nishan-e-Pakistan","None of these","Nishan-e-Pakistan"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Italy?","Gold Medal of Military Valour","Victoria Cross","Iran Cross","Order of Rising","Gold Medal of Military Valour"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of India?"," Iron Cross","Military Cross","Victoria Cross","Param Vir Chakra","Param Vir Chakra"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Zimbabwe?","Order of the patriotic war","Military cross","The Gold Cross of Zimbabwe","None of these","The Gold Cross of Zimbabwe"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Denmark?","The Valour Cross","Param Vir Chukar","None of these","Military cross","The Valour Cross"));
        arrayList.add(new ContentQuestionModel("France’s highest military award is ___________?","Military Cross","Iron Cross","Medal for Valour","The Legion of Honour","The Legion of Honour"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Bangladesh?","Iron cross","Military cross","Bir Sreshtho","Group Captain","Bir Sreshtho"));
        arrayList.add(new ContentQuestionModel("Japan’s highest military award is __________?","Order of the rising sun","Victoria Cross","Iron cross","Param Vir Chukara","Order of the rising sun"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Germany?","Victoria Cross","The Cross of Honour for Valour","Military cross","Medal of honour","The Cross of Honour for Valour"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Norway?","Order of Leopold","Radetzky Korhaz","iron cross","The War Cross with Sword","The War Cross with Sword"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Russia?","Order of the patriotic war","Military cross","Param Vir Chukara","None of these","None of these"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Thailand?","Military cross","Order of Rama","Iron cross","None of these","Order of Rama"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Belgium?","Iron cross","Medal of honour","Virtuti military","Military cross","Military cross"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Vietnam?","Medal of honour","Nishan-e-Haider","None of these","National order of Vietnam","National order of Vietnam"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of China?","Medal of the army","The Hero’s Medal","War cross with the sword","None of these","The Hero’s Medal"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Australia?","Iron cross","Military cross","The Victoria Cross for Australia","None of these","The Victoria Cross for Australia"));

        arrayList.add(new ContentQuestionModel("Which is the highest military award of Spain?","Order of William","Wing Commander","Laureate Cross of Saint Ferdinand","Group Captain","Laureate Cross of Saint Ferdinand"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Brazil?","Aparatorii Independentei","Iron cross","Order of Military Merit (Brazil)","Military cross","Order of Military Merit (Brazil)"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Canda?","The Victoria Cross of Canada","Medal of honour","War cross with the sword","None of these","The Victoria Cross of Canada"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of Greece?","Military cross","Medal for Gallantry","Medal of honour","None of these","Medal for Gallantry"));
        arrayList.add(new ContentQuestionModel("What is the highest military award of New Zealand?","Iron cross","Param Vir Chukara","The Victoria Cross for New Zealand","None of these","The Victoria Cross for New Zealand"));
        arrayList.add(new ContentQuestionModel("Which is the highest military award of Pakistan?","Iron Cross","Nishan-e-Haider","Military Nishan","None of these","Nishan-e-Haider"));
        arrayList.add(new ContentQuestionModel("USA’s highest military award is ________?","American Cross","Victoria Cross","Medal of Honour","Iron Cross","Medal of Honour"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("পাকিস্তানের সর্বোচ্চ নাগরিক পুরষ্কার কোনটি?", "নিশান-ই-ইমতিয়াজ", "আয়রন ক্রস", "নিশান-ই-পাকিস্তান", "এর মধ্যে কোনটিই নয়", "নিশান-ই-পাকিস্তান"));
        arrayList.add(new ContentQuestionModel("ইতালির সর্বোচ্চ সামরিক পুরষ্কার কী?", "মিলিটারি বীরত্বের স্বর্ণপদক", "ভিক্টোরিয়া ক্রস", "ইরান ক্রস", "অর্ডার অফ রাইজিং", "মিলিটারি বীরত্বের স্বর্ণপদক"));
        arrayList.add(new ContentQuestionModel("ভারতের সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "আয়রন ক্রস", "সামরিক ক্রস", "ভিক্টোরিয়া ক্রস", "পরম বীর চক্র", "পরম বীর চক্র"));
        arrayList.add(new ContentQuestionModel("জিম্বাবুয়ের সর্বোচ্চ সামরিক পুরষ্কার কি?", "দেশপ্রেমিক যুদ্ধের আদেশ", "সামরিক ক্রস", "জিম্বাবুয়ের গোল্ড ক্রস", "এর মধ্যে কোনটিই নয়", "জিম্বাবুয়ের গোল্ড ক্রস"));//4
        arrayList.add(new ContentQuestionModel("ডেনমার্কের সর্বোচ্চ সামরিক পুরষ্কার কি?", "দ্য ভ্যালোর ক্রস", "পরম বির চুকার", "এর মধ্যে কোনওটিই নয়", "দ্য ওয়ারোর ক্রস", "দ্য ওয়ারোর ক্রস"));
        arrayList.add(new ContentQuestionModel("ফ্রান্সের সর্বোচ্চ সামরিক পুরষ্কারটি ___________?", "মিলিটারি ক্রস", "আয়রন ক্রস", "বীরত্বের জন্য পদক", "দি লিজিয়ন অফ অনার", "দি লিজিয়ন অফ অনার"));//6
        arrayList.add(new ContentQuestionModel("বাংলাদেশের সর্বোচ্চ সামরিক পুরষ্কার কি?", "আয়রন ক্রস", "সামরিক ক্রস", "বীরশ্রেষ্ঠ", "গ্রুপ ক্যাপ্টেন", "বীরশ্রেষ্ঠ"));
        arrayList.add(new ContentQuestionModel("জাপানের সর্বোচ্চ সামরিক পুরষ্কারটি __________?", "উঠতি সূর্যের অর্ডার", "ভিক্টোরিয়া ক্রস", "আয়রন ক্রস", "পরম বির চুকারা", "উঠতি সূর্যের অর্ডার"));
        arrayList.add(new ContentQuestionModel("জার্মানির সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "ভিক্টোরিয়া ক্রস", "ক্রসের অফ সম্মান", "মিলিটারি ক্রস", "সম্মানের পদক", "ক্রসের অফ সম্মান"));//9
        arrayList.add(new ContentQuestionModel("নরওয়ের সর্বোচ্চ সামরিক পুরষ্কার কী?", "অর্ডার অফ লিওপল্ড", "রাদেটজকি কোরহাজ", "আয়রন ক্রস", "ওয়ার ক্রস উইথ সোর্ড", "ওয়ার ক্রস উইথ সোর্ড"));
        arrayList.add(new ContentQuestionModel("রাশিয়ার সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "দেশপ্রেমিক যুদ্ধের আদেশ", "সামরিক ক্রস", "পরম বির চুকারা", "এর মধ্যে কোনওটিই নয়", "এর মধ্যে কোনওটিই নয়"));
        arrayList.add(new ContentQuestionModel("থাইল্যান্ডের সর্বোচ্চ সামরিক পুরস্কার কোনটি?", "মিলিটারি ক্রস", "অর্ডার অফ রামা", "আয়রন ক্রস", "এগুলির কোনওটিই নয়", "অর্ডার অফ রামা"));
        arrayList.add(new ContentQuestionModel("বেলজিয়ামের সর্বোচ্চ সামরিক পুরষ্কার কী?", "আয়রন ক্রস", "মেডেল অব অনার", "ভার্টুটি মিলিটারি", "মিলিটারি ক্রস", "মিলিটারি ক্রস"));
        arrayList.add(new ContentQuestionModel("ভিয়েতনামের সর্বোচ্চ সামরিক পুরস্কার কোনটি?", "সম্মান পদক", "নিশান-ই-হায়দার", "এর মধ্যে কোনওটিই নয়", "ভিয়েতনামের জাতীয় আদেশ", "ভিয়েতনামের জাতীয় আদেশ"));
        arrayList.add(new ContentQuestionModel("চীনের সর্বোচ্চ সামরিক পুরষ্কার কী?", "সেনাবাহিনীর পদক", "দ্য হিরো পদক", "তরোয়াল দিয়ে যুদ্ধ ক্রস", "এর কিছুই নয়", "দ্য হিরো পদক"));
        arrayList.add(new ContentQuestionModel("অস্ট্রেলিয়ার সর্বোচ্চ সামরিক পুরষ্কার কি?", "আয়রন ক্রস", "মিলিটারি ক্রস", "দ্য ভিক্টোরিয়া ক্রস অস্ট্রেলিয়ার", "এর কিছুই নয়", "দ্য ভিক্টোরিয়া ক্রস অস্ট্রেলিয়ার"));//16
        arrayList.add(new ContentQuestionModel("তুরস্কের সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "আয়রন ক্রস", "ভার্টুটি সামরিক", "সম্মানের পদক", "এর মধ্যে কোনওটি নয়", "সম্মানের পদক"));
        arrayList.add(new ContentQuestionModel("দক্ষিণ আফ্রিকার সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "পরম বীর চুকারা", "এনকেডব্লিউই ই গৌতা (স্বর্ণ চিতা)", "আফ্রিকান পদক", "এর কোনওটিই নয়", "এনকেডব্লিউই ই গৌতা (স্বর্ণ চিতা)"));
        arrayList.add(new ContentQuestionModel("রোমানিয়ার সর্বোচ্চ সামরিক পুরষ্কার কী?", "অপারাটিরি ইন্ডিপেন্ডেন্টি", "আয়রন ক্রস", "সম্মানের পদক", "এগুলির কোনওটিই নয়", "অপারাটিরি ইন্ডিপেন্ডেন্টি"));//19
        arrayList.add(new ContentQuestionModel("পোল্যান্ডের সর্বোচ্চ সামরিক পুরষ্কার কী?", "অর্ডার অফ ভার্টুটি মিলিটারি", "সম্মানের পদক", "আয়রন ক্রস", "এর মধ্যে কোনওটিই নয়", "অর্ডার অফ ভার্টুটি মিলিটারি"));
        arrayList.add(new ContentQuestionModel("নেদারল্যান্ডসের সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "মিলিটারি উইলিয়াম অর্ডার", "মেডেল অব অনার", "আয়রন ক্রস", "এর মধ্যে কোনটিই নয়", "মিলিটারি উইলিয়াম অর্ডার"));
        arrayList.add(new ContentQuestionModel("কুয়েতের সর্বোচ্চ সামরিক পুরষ্কার কি?", "চিতাবাঘের অর্ডার", "উইসাম-আল-তাহরির", "আয়রন ক্রস", "এর মধ্যে কোনওটিই নয়", "উইসাম-আল-তাহরির"));
        arrayList.add(new ContentQuestionModel("বিমান বাহিনীতে নিম্নলিখিত পদগুলির মধ্যে কোনটি বেশি?", "এয়ার কমান্ডার", "স্কোয়াড্রন লিডার", "উইং কমান্ডার", "গ্রুপ ক্যাপ্টেন", "এয়ার কমান্ডার"));//23
        arrayList.add(new ContentQuestionModel("স্পেনের সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "অর্ডার অফ উইলিয়াম", "উইং কমান্ডার", "সেন্ট ফারদিনান্ডের লরেট ক্রস", "গ্রুপ ক্যাপ্টেন", "সেন্ট ফারদিনান্ডের লরেট ক্রস"));
        arrayList.add(new ContentQuestionModel("ব্রাজিলের সর্বোচ্চ সামরিক পুরষ্কার কি?", "অপারটোরি ইন্ডিপেন্ডেন্টি", "আয়রন ক্রস", "অর্ডার অফ মিলিটারি মেরিট (ব্রাজিল)", "মিলিটারি ক্রস", "অর্ডার অফ মিলিটারি মেরিট (ব্রাজিল)"));
        arrayList.add(new ContentQuestionModel("কান্দার সর্বোচ্চ সামরিক পুরষ্কার কী?", "দ্য ভিক্টোরিয়া ক্রস অফ কানাডা", "মেডেল অফ অনার", "তরোয়াল দিয়ে যুদ্ধের ক্রস", "এর মধ্যে কোনওটিই নয়", "এর মধ্যে কোনওটিই নয়"));
        arrayList.add(new ContentQuestionModel("গ্রীসের সর্বোচ্চ সামরিক পুরষ্কার কী?", "মিলিটারি ক্রস", "গ্যালেন্টারি ফর মেডেল", "গৌরব পদক", "এর মধ্যে কোনটিই নয়", "গৌরব পদক"));//27
        arrayList.add(new ContentQuestionModel("নিউজিল্যান্ডের সর্বোচ্চ সামরিক পুরষ্কার কি?", "আয়রন ক্রস", "পরম বির চুকারা", "নিউজিল্যান্ডের জন্য দ্য ভিক্টোরিয়া ক্রস", "এর মধ্যে কোনওটিই নয়", "এর মধ্যে কোনওটিই নয়"));
        arrayList.add(new ContentQuestionModel("পাকিস্তানের সর্বোচ্চ সামরিক পুরষ্কার কোনটি?", "আয়রন ক্রস", "নিশান-ই-হায়দার", "সামরিক নিশান", "এর মধ্যে কোনটিই নয়", "নিশান-ই-হায়দার"));
        arrayList.add(new ContentQuestionModel("মার্কিন যুক্তরাষ্ট্রের সর্বোচ্চ সামরিক পুরষ্কারটি ________?", "আমেরিকান ক্রস", "ভিক্টোরিয়া ক্রস", "মেডেল অব অনার", "আয়রন ক্রস", "মেডেল অব অনার"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("पाकिस्तान का सर्वोच्च नागरिक पुरस्कार?", "निशान-ए-इम्तियाज़", "आयरन क्रॉस", "निशान-ए-पाकिस्तान", "इनमें से कोई नहीं", "निशान-ए-पाकिस्तान"));
        arrayList.add(new ContentQuestionModel("इटली का सर्वोच्च सैन्य पुरस्कार क्या है?", "गोल्ड मेडल ऑफ़ मिलिट्री वेलोर", "विक्टोरिया क्रॉस", "ईरान क्रॉस", "ऑर्डर ऑफ़ राइजिंग", "गोल्ड मेडल ऑफ़ मिलिट्री वेलोर"));
        arrayList.add(new ContentQuestionModel("भारत का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "आयरन क्रॉस", "मिलिट्री क्रॉस", "विक्टोरिया क्रॉस", "परमवीर चक्र", "परमवीर चक्र"));
        arrayList.add(new ContentQuestionModel("ज़िम्बाब्वे का सर्वोच्च सैन्य पुरस्कार क्या है?", "देशभक्ति युद्ध का आदेश", "सैन्य क्रॉस", "द गोल्ड क्रॉस ऑफ़ ज़िम्बाब्वे", "इनमें से कोई नहीं", "द गोल्ड क्रॉस ऑफ़ ज़िम्बाब्वे"));
        arrayList.add(new ContentQuestionModel("डेनमार्क का सर्वोच्च सैन्य पुरस्कार क्या है?", "द वैलेर क्रॉस", "परम वीर चोकर", "इनमें से कोई नहीं", "मिलिट्री क्रॉस", "द वैलेर क्रॉस"));
        arrayList.add(new ContentQuestionModel("फ्रांस का सर्वोच्च सैन्य पुरस्कार ___________?", "मिलिट्री क्रॉस", "आयरन क्रॉस", "मेडल फॉर वेलोर", "द लीजन ऑफ ऑनर", "द लीजन ऑफ ऑनर"   ));
        arrayList.add(new ContentQuestionModel("बांग्लादेश का सर्वोच्च सैन्य पुरस्कार क्या है?", "आयरन क्रॉस", "मिलिट्री क्रॉस", "बीर सृष्टि", "ग्रुप कैप्टन", "बीर सृष्टि"));
        arrayList.add(new ContentQuestionModel("जापान का सर्वोच्च सैन्य पुरस्कार __________ है?", "उगते सूरज का आदेश", "विक्टोरिया क्रॉस", "आयरन क्रॉस", "परम वीर चुकारा", "उगते सूरज का आदेश"));
        arrayList.add(new ContentQuestionModel("जर्मनी का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "विक्टोरिया क्रॉस", "द क्रॉस ऑफ ऑनर फॉर वेलोर", "मिलिट्री क्रॉस", "मेडल ऑफ ऑनर", "द क्रॉस ऑफ ऑनर फॉर वेलोर"));
        arrayList.add(new ContentQuestionModel("नॉर्वे का सर्वोच्च सैन्य पुरस्कार क्या है?", "ऑर्डर ऑफ़ लियोपोल्ड", "रैडेट्ज़की कोरहाज़", "आयरन क्रॉस", "द वार क्रॉस विद स्वॉर्ड", "द वार क्रॉस विद स्वॉर्ड"));
        arrayList.add(new ContentQuestionModel("रूस का सर्वोच्च सैन्य पुरस्कार कौन है?", "देशभक्ति युद्ध का आदेश", "सैन्य क्रॉस", "परम वीर चुकारा", "इनमें से कोई नहीं", "इनमें से कोई नहीं"));
        arrayList.add(new ContentQuestionModel("थाइलैंड का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "मिलिट्री क्रॉस", "ऑर्डर ऑफ राम", "आयरन क्रॉस", "इनमें से कोई नहीं", "ऑर्डर ऑफ राम"));
        arrayList.add(new ContentQuestionModel("बेल्जियम का सर्वोच्च सैन्य पुरस्कार क्या है?", "आयरन क्रॉस", "मेडल ऑफ ऑनर", "पुण्युटी मिलिट्री", "मिलिट्री क्रॉस", "मिलिट्री क्रॉस"));
        arrayList.add(new ContentQuestionModel("वियतनाम का सर्वोच्च सैन्य पुरस्कार कौन है?", "पदक का सम्मान", "निशान-ए-हैदर", "इनमें से कोई नहीं", "वियतनाम का राष्ट्रीय आदेश", "वियतनाम का राष्ट्रीय आदेश"));
        arrayList.add(new ContentQuestionModel("चीन का सर्वोच्च सैन्य पुरस्कार क्या है?", "सेना का पदक", "नायक का पदक", "तलवार के साथ युद्ध पार", "इनमें से कोई नहीं", "नायक का पदक"));
        arrayList.add(new ContentQuestionModel("ऑस्ट्रेलिया का सर्वोच्च सैन्य पुरस्कार क्या है?", "आयरन क्रॉस", "मिलिट्री क्रॉस", "ऑस्ट्रेलिया के लिए विक्टोरिया क्रॉस", "इनमें से कोई नहीं", "ऑस्ट्रेलिया के लिए विक्टोरिया क्रॉस"));
        arrayList.add(new ContentQuestionModel("तुर्की का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "आयरन क्रॉस", "पुण्युटी सैन्य", "सम्मान का पदक", "इनमें से कोई नहीं", "आयरन क्रॉस"));
        arrayList.add(new ContentQuestionModel("दक्षिण अफ्रीका का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "परम वीर छुकरा", "एनकेडब्ल्यूवाई गौता (गोल्ड तेंदुआ)", "अफ्रीकी पदक", "इनमें से कोई नहीं", "एनकेडब्ल्यूवाई गौता (गोल्ड तेंदुआ)"));//18
        arrayList.add(new ContentQuestionModel("रोमानिया का सर्वोच्च सैन्य पुरस्कार क्या है?", "अपरेट्री इंडिपेंडेनई", "आयरन क्रॉस", "मेडल ऑफ ऑनर", "इनमें से कोई नहीं", "अपरेट्री इंडिपेंडेनई"));
        arrayList.add(new ContentQuestionModel("पोलैंड का सर्वोच्च सैन्य पुरस्कार क्या है?", "ऑर्डर ऑफ़ पुण्युटी मिलिटरी", "मेडल ऑफ़ ऑनर", "आयरन क्रॉस", "इनमें से कोई नहीं", "ऑर्डर ऑफ़ पुण्युटी मिलिटरी"));
        arrayList.add(new ContentQuestionModel("नीदरलैंड का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "सैन्य विलियम ऑर्डर", "सम्मान का पदक", "आयरन क्रॉस", "इनमें से कोई नहीं", "सैन्य विलियम ऑर्डर"));
        arrayList.add(new ContentQuestionModel("कुवैत का सर्वोच्च सैन्य पुरस्कार क्या है?", "तेंदुए का आदेश", "विसम-अल-तहरीर", "आयरन क्रॉस", "इनमें से कोई नहीं", "विसम-अल-तहरीर"));//22
        arrayList.add(new ContentQuestionModel("वायु सेना में निम्न में से कौन सी रैंक अधिक है?", "एयर कमांडर", "स्क्वाड्रन लीडर", "विंग कमांडर", "ग्रुप कैप्टन", "एयर कमांडर"));
        arrayList.add(new ContentQuestionModel("स्पेन का सर्वोच्च सैन्य पुरस्कार कौन है?", "ऑर्डर ऑफ विलियम", "विंग कमांडर", "सेंट फर्डिनेंड का लॉरेट क्रॉस", "ग्रुप कैप्टन", "सेंट फर्डिनेंड का लॉरेट क्रॉस"));
        arrayList.add(new ContentQuestionModel("ब्राज़ील का सर्वोच्च सैन्य पुरस्कार क्या है?", "अपरटेरी इंडिपेंडेंटई", "आयरन क्रॉस", "ऑर्डर ऑफ़ मिलिट्री मेरिट (ब्राज़ीलिया)", "मिलिट्री क्रॉस", "ऑर्डर ऑफ़ मिलिट्री मेरिट (ब्राज़ीलिया)"));
        arrayList.add(new ContentQuestionModel("कनाडा का सर्वोच्च सैन्य पुरस्कार क्या है?", "कनाडा का विक्टोरिया क्रॉस", "मेडल ऑफ ऑनर", "वॉर क्रॉस विद द तलवार", "इनमें से कोई नहीं", "कनाडा का विक्टोरिया क्रॉस"));
        arrayList.add(new ContentQuestionModel("ग्रीस का सर्वोच्च सैन्य पुरस्कार क्या है?", "मिलिट्री क्रॉस", "मेडल फॉर गैलेंट्री", "मेडल ऑफ ऑनर", "इनमें से कोई नहीं", "मेडल फॉर गैलेंट्री"));
        arrayList.add(new ContentQuestionModel("न्यूजीलैंड का सर्वोच्च सैन्य पुरस्कार क्या है?", "आयरन क्रॉस", "परम वीर चुकारा", "न्यूजीलैंड के लिए विक्टोरिया क्रॉस", "इनमें से कोई नहीं", "न्यूजीलैंड के लिए विक्टोरिया क्रॉस"));
        arrayList.add(new ContentQuestionModel("पाकिस्तान का सर्वोच्च सैन्य पुरस्कार कौन सा है?", "आयरन क्रॉस", "निशान-ए-हैदर", "सैन्य निशान", "इनमें से कोई नहीं", "निशान-ए-हैदर"));
        arrayList.add(new ContentQuestionModel("यूएसए का सर्वोच्च सैन्य पुरस्कार ________ है?", "अमेरिकन क्रॉस", "विक्टोरिया क्रॉस", "मेडल ऑफ ऑनर", "आयरन क्रॉस", "मेडल ऑफ ऑनर"));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("پاکستان کا سب سے بڑا سول ایوارڈ کونسا ہے؟" , "نشانِ امتیاز" , "آئرن کراس" , "مارکِ پاکستان" , "ان میں سے کوئی بھی نہیں","مارکِ پاکستان"));
        arrayList.add(new ContentQuestionModel("اٹلی کا اعلی ترین فوجی ایوارڈ کیا ہے؟" , "گولڈ میڈل آف ملٹری ویلوری" , "فوجی بہادری کا گولڈ میڈل" , "ایران کراس" , "آرڈر آف رائزنگ","فوجی بہادری کا گولڈ میڈل"));
        arrayList.add(new ContentQuestionModel("ہندوستان کا اعلی ترین ایوارڈ کونسا ہے؟" , "آئرن کراس" , "پرم ویر چکر" , "وکٹوریہ کراس" , "پرم ویر چکرا","پرم ویر چکر"));
        arrayList.add(new ContentQuestionModel("زمبابوے کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "محب وطن جنگ کا آرڈر" , "ملٹری کراس" , "زمبابوے کا گولڈ کراس" , "ان میں سے کوئی بھی نہیں","زمبابوے کا گولڈ کراس"));
        arrayList.add(new ContentQuestionModel("ڈنمارک کا اعلی ترین فوجی ایوارڈ کیا ہے؟" , "دی ویلور کراس" , "پیر ویر چوکر" , "ان میں سے کوئی نہیں" , "ویلیر کراس","ویلیر کراس"));
        arrayList.add(new ContentQuestionModel("فرانس کا اعلی ترین فوجی ایوارڈ ___________؟" , "ملٹری کراس" , "آئرن کراس" , "تمغہ برائے بہادری" , "غیرت کا لشکر"  ,"غیرت کا لشکر"));
        arrayList.add(new ContentQuestionModel("بنگلہ دیش کا اعلی ترین ایوارڈ کیا ہے؟" , "آئرن کراس" ,"ملٹری کراس" , "BR Srestho" , "گروپ کیپٹن","BR Srestho"));
        arrayList.add(new ContentQuestionModel("جاپان کا اعلی ترین فوجی ایوارڈ __________ ہے؟" , "طلوع آفتاب کا آرڈر", "طلوع آفتاب کا حکم" , "آئرن کراس" , "پیر ویر چوکارا","طلوع آفتاب کا حکم"));
        arrayList.add(new ContentQuestionModel("جرمنی کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "وکٹوریہ کراس" , "کراس آف آنر آف آنلر" , "بہادری کا کراس آف آنر" , "میڈل آف آنر","بہادری کا کراس آف آنر"));//9
        arrayList.add(new ContentQuestionModel("ناروے کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "آرڈر آف لیوپولڈ" , "رڈٹزکی کورہاز" , "سورڈ کے ساتھ وار کراس" , "وار کراس ود وورڈ","سورڈ کے ساتھ وار کراس"));
        arrayList.add(new ContentQuestionModel("روس کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "محب وطن جنگ کا آرڈر" , "ملٹری کراس" , "پرم ویر چوکارا" , "ان میں سے کوئی نہیں","ان میں سے کوئی نہیں"));//11
        arrayList.add(new ContentQuestionModel("تھائی لینڈ کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "ملٹری کراس" , "آرڈر آف رام" , "آئرن کراس" , "ان میں سے کوئی بھی نہیں","آرڈر آف رام"));
        arrayList.add(new ContentQuestionModel("بیلجیئم کا اعلی ترین فوجی ایوارڈ کیا ہے؟" , "آئرن کراس" , "تمغہ آف آنر" , "ورتیا فوجی" , "ملٹری کراس","ملٹری کراس"));
        arrayList.add(new ContentQuestionModel("ویتنام کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "تمغہ برائے اعزاز" , "نشانِ حیدر" , "ان میں سے کوئی بھی نہیں" , "ویتنام کا قومی حکم","ویتنام کا قومی حکم"));
        arrayList.add(new ContentQuestionModel("چین کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "فوج کا تمغہ" , "ہیرو کا تمغہ" , "جنگ تلوار سے پار" , "ان میں سے کوئی بھی نہیں","ہیرو کا تمغہ"));//15
        arrayList.add(new ContentQuestionModel("آسٹریلیا کا اعلی ترین ایوارڈ کیا ہے؟" , "آئرن کراس" , "ملٹری کراس" , "وکٹوریا کراس فار آسٹریلیا" , "ان میں سے کوئی بھی نہیں","وکٹوریا کراس فار آسٹریلیا"));
        arrayList.add(new ContentQuestionModel("ترکی کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "آئرن کراس" , "ورچوٹی ملٹری" , "تمغہ تمغہ" , "ان میں سے کوئی بھی نہیں","تمغہ تمغہ"));
        arrayList.add(new ContentQuestionModel("جنوبی افریقہ کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "پرم ویر چوکارا" , "این کے ڈبلیو ای یا گوٹا (سونے کا چیتے)" , "افریقی تمغہ" , "ان میں سے کوئی بھی نہیں","این کے ڈبلیو ای یا گوٹا (سونے کا چیتے)"));
        arrayList.add(new ContentQuestionModel("رومانیہ کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "اپارٹوری آزادینٹی" , "دفاع کے محافظ" , "میڈل آف آنر" , "ان میں سے کوئی بھی نہیں","دفاع کے محافظ"));//19
        arrayList.add(new ContentQuestionModel("پولینڈ کا اعلی ترین فوجی ایوارڈ کیا ہے؟" , "آرڈر آف ورچوٹی ملیٹری" , "فوجی فضیلت کا آرڈر" , "آئرن کراس" , "ان میں سے کوئی بھی نہیں","فوجی فضیلت کا آرڈر"));
        arrayList.add(new ContentQuestionModel("نیدرلینڈ کا سب سے بڑا فوجی ایوارڈ کونسا ہے؟" , "ملٹری ولیم آرڈر" , "میڈل آف آنر" , "آئرن کراس" , "ان میں سے کوئی بھی نہیں","ملٹری ولیم آرڈر"));
        arrayList.add(new ContentQuestionModel("کویت کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "چیتے کا آرڈر" , "ویسام التحریر" , "خوشبو والا", "ان میں سے کوئی بھی نہیں","خوشبو والا"));//22
        arrayList.add(new ContentQuestionModel("فضائیہ میں درج ذیل میں سے کون سا درجہ زیادہ ہے؟" , "ایئر کمانڈر" , "اسکواڈرن لیڈر" , "ونگ کمانڈر" , "گروپ کیپٹن","ایئر کمانڈر"));
        arrayList.add(new ContentQuestionModel("اسپین کا اعلی ترین فوجی ایوارڈ کونسا ہے؟" , "آرڈر آف ولیم", "ونگ کمانڈر" , "سینٹ فرڈینینڈ کے جیتنے والے کراس" , "گروپ کیپٹن","سینٹ فرڈینینڈ کے جیتنے والے کراس"));//24
        arrayList.add(new ContentQuestionModel("برازیل کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "اپارٹوری آزادینٹی" , "آئرن کراس" , "فوجی میرٹ کا آرڈر (برازیل)" , "ملٹری کراس","فوجی میرٹ کا آرڈر (برازیل)"));
        arrayList.add(new ContentQuestionModel("کانڈا کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "کینیڈا کا وکٹوریہ کراس" , "تمغہ آف آنر" , "جنگ تلوار سے پار" , "ان میں سے کوئی بھی نہیں","کینیڈا کا وکٹوریہ کراس"));
        arrayList.add(new ContentQuestionModel("یونان کا اعلی ترین فوجی ایوارڈ کیا ہے؟" , "ملٹری کراس" , "میڈل فار گیلنٹری" , "بہادری کے لئے تمغہ" , "ان میں سے کوئی بھی نہیں","بہادری کے لئے تمغہ"));
        arrayList.add(new ContentQuestionModel("نیوزی لینڈ کا سب سے بڑا فوجی ایوارڈ کیا ہے؟" , "نیوزی لینڈ کے لئے وکٹوریہ کراس" , "پیر ویر چوکارا" , "وکٹوریہ کراس فار نیوزی لینڈ" , "ان میں سے کوئی بھی نہیں","نیوزی لینڈ کے لئے وکٹوریہ کراس"));
        arrayList.add(new ContentQuestionModel("پاکستان کا اعلی ترین ایوارڈ کونسا ہے؟" , "آئرن کراس" , "نشانِ حیدر" , "ملٹری نشان" , "ان میں سے کوئی بھی نہیں","نشانِ حیدر"));
        arrayList.add(new ContentQuestionModel("USA کا اعلی ترین فوجی ایوارڈ ________ ہے؟" , "امریکن کراس" , "میڈل آف آنر" , "تمغہ آف آنر" , "آئرن کراس","میڈل آف آنر"));



        return arrayList;


    }


}
