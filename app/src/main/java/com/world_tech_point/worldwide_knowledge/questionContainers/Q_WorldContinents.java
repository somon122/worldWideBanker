package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_WorldContinents {


    private Context context;
    public Q_WorldContinents(Context context) {
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
        arrayList.add(new ThreeItemModel("Asia", "Is the only continent joined to two others.\n" +
                "Contains the world's biggest nation (China).\n" +
                "Contains the highest point on Earth (Mount Everest).\n" +
                "Is the only continent where you will see tigers in the wild."));

        arrayList.add(new ThreeItemModel("Africa", "Contains the world's longest river (The Nile).\n" +
                "Contains the world's largest desert (The Sahahra).\n" +
                "Contains more countries than any other continent.\n" +
                "Most of the world's gold and diamonds come from Africa."));

        arrayList.add(new ThreeItemModel("North America", "Is joined to Asia by ice in winter (Bering Sea).\n" +
                "Is the only continent that lies entirely in the Northern and Western Hemispheres.\n" +
                "Contains the world's tallest mountain (Mount Kea).\n" +
                "Contains the world's largest fresh water lake (Lake Superior)."));

        arrayList.add(new ThreeItemModel("South America", "Contains the world's Southern most city (Puentas Arenas).\n" +
                "Contains the world's largest river system (The Amazon)."));

        arrayList.add(new ThreeItemModel("Antarctica", "Is the only continent completely covered in ice.\n" +
                "Is the only continent that is uninhabited by humans (although some scientists live there for short periods of time)."));
        arrayList.add(new ThreeItemModel("Europe", "Through colonization, at one time ruled almost all of the rest of the world.\n" +
                "Has been the starting point of both World Wars."));

        arrayList.add(new ThreeItemModel("Australia", "Australia is an island continent and the world's sixth largest country (7,682,300 sq km).\n" +
                "Capital: Canberra"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("এশিয়া", "একমাত্র মহাদেশটি অন্য দু'জনের সাথে যোগ দিয়েছে।\n" +
                "বিশ্বের বৃহত্তম জনসংখ্যা ঘনত্ব দেশ (চীন) রয়েছে।\n" +
                "পৃথিবীর সর্বোচ্চ পয়েন্ট (এভারেস্ট মাউন্ট) ধারণ করে।\n" +
                "একমাত্র মহাদেশ যেখানে আপনি বন্যের মধ্যে বাঘ দেখতে পাবেন।"));
        arrayList.add(new ThreeItemModel("আফ্রিকা", "বিশ্বের দীর্ঘতম নদী (নীল নদ) রয়েছে\n" +
                "বিশ্বের বৃহত্তম মরুভূমি (সাহারা) ধারণ করে।\n" +
                "অন্য কোনও মহাদেশের চেয়ে বেশি দেশ রয়েছে।\n" +
                "বিশ্বের বেশিরভাগ সোনার এবং হীরা আফ্রিকা থেকে আসে।"));

        arrayList.add(new ThreeItemModel("উত্তর আমেরিকা", "শীতকালে বরফের মাধ্যমে এশিয়ায় যোগ দেওয়া হয়েছে (বেরিং সাগর)।\n" +
                "একমাত্র মহাদেশ যা পুরো উত্তর এবং পশ্চিম গোলার্ধে অবস্থিত।\n" +
                "বিশ্বের দীর্ঘতম পর্বত (মাউন্ট কিয়া) রয়েছে।\n" +
                "বিশ্বের বৃহত্তম মিঠা পানির হ্রদ (সুপিরিয়ার হ্রদ) রয়েছে।"));

        arrayList.add(new ThreeItemModel("দক্ষিণ আমেরিকা", "বিশ্বের দক্ষিণতম শহর (পান্তাস এরিনা) রয়েছে।\n" +
                "বিশ্বের বৃহত্তম নদী ব্যবস্থা (অ্যামাজন) ধারণ করে।"));

        arrayList.add(new ThreeItemModel("অ্যান্টার্কটিকা", "একমাত্র মহাদেশটি সম্পূর্ণ বরফে আচ্ছাদিত।\n" +
                "একমাত্র মহাদেশ যা মানুষের দ্বারা জনশূন্য হয় (যদিও কিছু বিজ্ঞানী অল্প সময়ের জন্য সেখানে থাকেন)।"));
        arrayList.add(new ThreeItemModel("ইউরোপ", "Colonপনিবেশিকরণের মাধ্যমে এক সময় বিশ্বের প্রায় সমস্ত অঞ্চলে রাজত্ব করেছিল।\n" +
                "উভয় বিশ্ব যুদ্ধের সূচনা পয়েন্ট হয়েছে।"));

        arrayList.add(new ThreeItemModel("অস্ট্রেলিয়া", "অস্ট্রেলিয়া একটি দ্বীপ মহাদেশ এবং বিশ্বের ষষ্ঠ বৃহত্তম দেশ (,,68৮২,৩০০ বর্গ কিমি)।\n" +
                "মূলধন: ক্যানবেরা"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("एशिया", "क्या एकमात्र महाद्वीप दो अन्य में शामिल हो गया है।\n" +
                "इसमें दुनिया का सबसे बड़ा देश (चीन) शामिल है।\n" +
                "पृथ्वी (माउंट एवरेस्ट) पर उच्चतम बिंदु शामिल है।\n" +
                "एकमात्र ऐसा महाद्वीप है जहां आप जंगली में बाघ देखेंगे।"));

        arrayList.add(new ThreeItemModel("अफ्रीका", "इसमें दुनिया की सबसे लंबी नदी (द नाइल) है।\n" +
                "इसमें दुनिया का सबसे बड़ा रेगिस्तान (द सहारा) शामिल है।\n" +
                "किसी भी अन्य महाद्वीप की तुलना में अधिक देशों को शामिल करता है।\n" +
                "दुनिया के अधिकांश सोने और हीरे अफ्रीका से आते हैं।"));

        arrayList.add(new ThreeItemModel("उत्तरी अमेरिका", "सर्दियों में बर्फ (बेरिंग सागर) से एशिया में शामिल हो जाता है।\n" +
                "एकमात्र ऐसा महाद्वीप है जो पूरी तरह से उत्तरी और पश्चिमी गोलार्ध में स्थित है।\n" +
                "इसमें दुनिया का सबसे ऊँचा पर्वत (माउंट केआ) शामिल है।\n" +
                "इसमें दुनिया की सबसे बड़ी ताजे पानी की झील (सुपीरियर झील) है।"));

        arrayList.add(new ThreeItemModel("दक्षिण अमेरिका", "इसमें दुनिया का सबसे दक्षिणी शहर (पंटस एरेनास) शामिल है।\n" +
                "इसमें दुनिया की सबसे बड़ी नदी प्रणाली (द अमेजन) शामिल है।"));

        arrayList.add(new ThreeItemModel("अंटार्कटिका", "एकमात्र महाद्वीप पूरी तरह से बर्फ में ढंका है।\n" +
                "एकमात्र महाद्वीप है जो मनुष्यों द्वारा निर्जन है (हालांकि कुछ वैज्ञानिक कम समय के लिए वहां रहते हैं)।"));

        arrayList.add(new ThreeItemModel("यूरोप", "उपनिवेश के माध्यम से, एक समय में दुनिया के बाकी हिस्सों में लगभग सभी का शासन था।\n" +
                "दोनों विश्व युद्धों का शुरुआती बिंदु रहा है।"));

        arrayList.add(new ThreeItemModel("ऑस्ट्रेलिया", "ऑस्ट्रेलिया एक द्वीप महाद्वीप है और दुनिया का छठा सबसे बड़ा देश (7,682,300 वर्ग किमी) है।\n" +
                "राजधानी: कैनबरा"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("ایشیا", "واحد براعظم دو دیگر لوگوں کے ساتھ شامل ہوا ہے۔\n" +
                "دنیا کی سب سے بڑی قوم (چین) پر مشتمل ہے۔\n" +
                "زمین پر اعلی مقام (ماؤنٹ ایورسٹ) پر مشتمل ہے۔\n" +
                "واحد براعظم ہے جہاں آپ کو جنگل میں شیر نظر آئیں گے۔"));

        arrayList.add(new ThreeItemModel("افریقہ", "دنیا کا سب سے طویل دریا (دی نیل) پر مشتمل ہے۔\n" +
                "دنیا کا سب سے بڑا صحرا (صحارا) پر مشتمل ہے۔\n" +
                "کسی دوسرے براعظم سے زیادہ ممالک پر مشتمل ہے۔\n" +
                "دنیا کے بیشتر سونے اور ہیرے افریقہ سے آتے ہیں۔"));

        arrayList.add(new ThreeItemModel("شمالی امریکہ", "موسم سرما (بیرنگ بحر) میں برف کے ذریعہ ایشیاء میں شامل ہوگیا\n" +
                "واحد براعظم ہے جو مکمل طور پر شمالی اور مغربی نصف کرہ میں واقع ہے۔\n" +
                "دنیا کا سب سے لمبا پہاڑ (ماؤنٹ کییا) پر مشتمل ہے۔\n" +
                "دنیا کی سب سے بڑی تازہ پانی کی جھیل (سپریئر جھیل) پر مشتمل ہے۔"));

        arrayList.add(new ThreeItemModel("جنوبی امریکہ", "دنیا کا جنوبی شہر (پنٹاس نامہ) پر مشتمل ہے۔\n" +
                "دنیا کا سب سے بڑا دریا کا نظام (ایمیزون) پر مشتمل ہے۔"));

        arrayList.add(new ThreeItemModel("انٹارکٹیکا", "واحد براعظم ہے جو مکمل طور پر برف میں ڈھک جاتا ہے۔\n" +
                "وہ واحد براعظم ہے جو انسانوں کے ذریعہ غیر آباد ہے (حالانکہ کچھ سائنس دان وہاں مختصر مدت کے لئے رہتے ہیں)۔"));
        arrayList.add(new ThreeItemModel("یورپ", "نوآبادیات کے ذریعہ ، ایک وقت میں پوری دنیا کے تقریبا تمام حصوں پر حکمرانی کی۔\n" +
                "دونوں عالمی جنگوں کا نقطہ آغاز رہا ہے۔"));
        arrayList.add(new ThreeItemModel("آسٹریلیا", "آسٹریلیا جزیرے کا ایک براعظم ہے اور دنیا کا چھٹا بڑا ملک (7،682،300 مربع کلومیٹر)۔\n" +
                "دارالحکومت: کینبرا"));

        return arrayList;
    }



}