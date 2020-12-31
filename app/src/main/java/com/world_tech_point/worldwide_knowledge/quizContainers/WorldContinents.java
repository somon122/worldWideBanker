package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class WorldContinents {

    private Context context;

    public WorldContinents(Context context) {
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

        arrayList.add(new ContentQuestionModel("Which of the following is not a continent? ","Antarctica","Australia","Africa","Russia","Russia"));
        arrayList.add(new ContentQuestionModel("If you are in South Africa and you started travelling in east direction, which continent would you get to first?","South America","Asia","Australia","Europe","Asia"));
        arrayList.add(new ContentQuestionModel("Which is the largest continent in population? ","North America","South America","Africa","Asia","Asia"));

        arrayList.add(new ContentQuestionModel("How many continents are there in the world? ","3","5","7","9","7"));
        arrayList.add(new ContentQuestionModel("Which is the largest continent in area? ","North America","Asia","Europe","South America","Asia"));
        arrayList.add(new ContentQuestionModel("Which is the smallest continent in area? ","Australia","Africa","South America","Europe","Australia"));

        arrayList.add(new ContentQuestionModel("Which continent has largest number of countries?","Africa","Europe","Asia","South America","Africa"));
        arrayList.add(new ContentQuestionModel("The largest mountain in the world, Mount Everest is situated in which continent?","Antarctica","North America","Asia","Africa","Asia"));
        arrayList.add(new ContentQuestionModel("The longest river in the world, Nile is situated in which continent?","Africa","Asia","South America","Europe","Africa"));
        arrayList.add(new ContentQuestionModel("Which continent is also called Dark Continent? ","Africa","North America","Asia","Antarctica","Africa"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি মহাদেশ নয়?", "অ্যান্টার্কটিকা", "অস্ট্রেলিয়া", "আফ্রিকা", "রাশিয়া", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("আপনি যদি দক্ষিণ আফ্রিকাতে থাকেন এবং আপনি পূর্ব দিকের দিকে যাত্রা শুরু করেছিলেন, তবে কোন মহাদেশে আপনি প্রথমে যেতে পারবেন?", "দক্ষিণ আমেরিকা", "এশিয়া", "অস্ট্রেলিয়া", "ইউরোপ", "এশিয়া"));
        arrayList.add(new ContentQuestionModel("জনসংখ্যার বৃহত্তম মহাদেশ কোনটি?", "উত্তর আমেরিকা", "দক্ষিণ আমেরিকা", "আফ্রিকা", "এশিয়া", "এশিয়া"));
        arrayList.add(new ContentQuestionModel("পৃথিবীতে কতটি মহাদেশ রয়েছে?","৩","৫","৭","৯","৭"));
        arrayList.add(new ContentQuestionModel("অঞ্চলটির বৃহত্তম মহাদেশ কোনটি?","উত্তর আমেরিকা", "এশিয়া", "ইউরোপ", "দক্ষিণ আমেরিকা", "এশিয়া"));
        arrayList.add(new ContentQuestionModel("অঞ্চলের ক্ষুদ্রতম মহাদেশ কোনটি?","অস্ট্রেলিয়া", "আফ্রিকা", "দক্ষিণ আমেরিকা", "ইউরোপ", "অস্ট্রেলিয়া"));


        arrayList.add(new ContentQuestionModel("কোন মহাদেশের সংখ্যা সবচেয়ে বেশি?", "আফ্রিকা", "ইউরোপ", "এশিয়া", "দক্ষিণ আমেরিকা", "আফ্রিকা"));
        arrayList.add(new ContentQuestionModel("বিশ্বের বৃহত্তম পর্বত, এভারেস্ট কোন মহাদেশে অবস্থিত?", "অ্যান্টার্কটিকা", "উত্তর আমেরিকা", "এশিয়া", "আফ্রিকা", "এশিয়া"));
        arrayList.add(new ContentQuestionModel("বিশ্বের দীর্ঘতম নদী নীল কোন মহাদেশে অবস্থিত?", "আফ্রিকা", "এশিয়া", "দক্ষিণ আমেরিকা", "ইউরোপ", "আফ্রিকা"));
        arrayList.add(new ContentQuestionModel("কোন মহাদেশকে ডার্ক কন্টিনেন্ট বলা হয়?", "আফ্রিকা", "উত্তর আমেরিকা", "এশিয়া", "অ্যান্টার্কটিকা", "আফ্রিকা"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("दुनिया में कितने महाद्वीप हैं?", "3", "5", "7", "9", "7"));
        arrayList.add(new ContentQuestionModel("क्षेत्रफल में सबसे बड़ा महाद्वीप कौन सा है?", "उत्तरी अमेरिका", "एशिया", "यूरोप", "दक्षिण अमेरिका", "दक्षिण अमेरिका"));
        arrayList.add(new ContentQuestionModel("क्षेत्रफल में सबसे छोटा महाद्वीप कौन सा है?", "ऑस्ट्रेलिया", "अफ्रीका", "दक्षिण अमेरिका", "यूरोप", "ऑस्ट्रेलिया"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन एक महाद्वीप नहीं है?", "अंटार्कटिका", "ऑस्ट्रेलिया", "अफ्रीका", "रूस", "रूस"));
        arrayList.add(new ContentQuestionModel("यदि आप दक्षिण अफ्रीका में हैं और आपने पूर्व दिशा में यात्रा शुरू की है, तो आपको कौन सा महाद्वीप मिलेगा?", "दक्षिण अमेरिका", "एशिया", "ऑस्ट्रेलिया", "यूरोप", "एशिया"));
        arrayList.add(new ContentQuestionModel("जनसंख्या में सबसे बड़ा महाद्वीप कौन सा है?", "उत्तरी अमेरिका", "दक्षिण अमेरिका", "अफ्रीका", "एशिया", "एशिया"));
        arrayList.add(new ContentQuestionModel("किस महाद्वीप में सबसे अधिक देश हैं?", "अफ्रीका", "यूरोप", "एशिया", "दक्षिण अमेरिका", "अफ्रीका"));
        arrayList.add(new ContentQuestionModel("दुनिया का सबसे बड़ा पर्वत, माउंट एवरेस्ट किस महाद्वीप में स्थित है?", "अंटार्कटिका", "उत्तरी अमेरिका", "एशिया", "अफ्रीका", "एशिया"));
        arrayList.add(new ContentQuestionModel("दुनिया की सबसे लंबी नदी, नील किस महाद्वीप में स्थित है?", "अफ्रीका", "एशिया", "दक्षिण अमेरिका", "यूरोप", "अफ्रीका"));
        arrayList.add(new ContentQuestionModel("किस महाद्वीप को डार्क कॉन्टिनेंट भी कहा जाता है?", "अफ्रीका", "उत्तरी अमेरिका", "एशिया", "अंटार्कटिका", "अफ्रीका"));

        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("دنیا میں کتنے براعظم ہیں؟" , "3" , "5" , "7" , "9","7"));
        arrayList.add(new ContentQuestionModel("علاقے کا سب سے بڑا براعظم کونسا ہے؟" , "شمالی امریکہ" , "ایشیا" , "یورپ" , "جنوبی امریکہ","ایشیا"));
        arrayList.add(new ContentQuestionModel("رقبہ کا سب سے چھوٹا براعظم کونسا ہے؟" , "آسٹریلیا" , "افریقہ" , "جنوبی امریکہ" , "یورپ","آسٹریلیا"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کوئی براعظم نہیں ہے؟" , "انٹارکٹیکا" , "آسٹریلیا" , "افریقہ" ,"روس","روس"));
        arrayList.add(new ContentQuestionModel("اگر آپ جنوبی افریقہ میں ہیں اور آپ مشرق کی سمت سفر کرنا شروع کردیتے ہیں تو آپ کو کون سے براعظم کو پہلے جانا پڑے گا؟" , "جنوبی امریکہ" , "ایشیا" ,"آسٹریلیا" ,"یورپ","ایشیا"));
        arrayList.add(new ContentQuestionModel("آبادی کا سب سے بڑا براعظم کونسا ہے؟" , "شمالی امریکہ" , "جنوبی امریکہ" , "افریقہ" , "ایشیا","ایشیا"));
        arrayList.add(new ContentQuestionModel("کس براعظم میں سب سے زیادہ ممالک ہیں؟" , "افریقہ" , "یورپ" , "ایشیاء" , "جنوبی امریکہ","افریقہ"));
        arrayList.add(new ContentQuestionModel("دنیا کا سب سے بڑا پہاڑ ، ماؤنٹ ایورسٹ کس براعظم میں واقع ہے؟" , "انٹارکٹیکا" , "شمالی امریکہ" , "ایشیا" , "افریقہ","ایشیا"));
        arrayList.add(new ContentQuestionModel("دنیا کا سب سے طویل دریا ، نیل کس براعظم میں واقع ہے؟" , "افریقہ" , "ایشیا" , "جنوبی امریکہ" , "یورپ","افریقہ"));
        arrayList.add(new ContentQuestionModel("کون سے براعظم کو ڈارک کونٹینیننٹ کہا جاتا ہے؟" , "افریقہ" , "شمالی امریکہ" , "ایشیا" , "انٹارکٹیکا","افریقہ"));


        return arrayList;


    }


}
