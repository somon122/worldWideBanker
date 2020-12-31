package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_WorldOcean {


    private Context context;
    public Q_WorldOcean(Context context) {
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

        arrayList.add(new ThreeItemModel("Pacific Ocean", "The Pacific Ocean is located between the Southern Ocean, Asia and Australia and the Western Hemisphere\n" +
                "Covers about one-third of the earth's surface, it covers 28% of the Earth\n" +
                "deepest point is the Challenger Deep within Mariana Trench near Japan"));

        arrayList.add(new ThreeItemModel("Atlantic ocean", "Its greatest depth is in the Puerto Rico Trench at 8,605 meters (28,231 feet).\n" +
                "It is located between Africa, Europe, the Southern Ocean and the Western Hemisphere.\n" +
                "Atlantic's major marginal seas include the Mediterranean Sea, the North Sea, the Baltic Sea, Hudson Bay, the Gulf of Mexico, and the Caribbean Sea."));
        arrayList.add(new ThreeItemModel("Indian Ocean", "It is located between Africa, the Southern Ocean, Asia and Australia.\n" +
                "Its deepest point is the Java trench, at 7,725 m."));

        arrayList.add(new ThreeItemModel("Southern Ocean", "The Southern Ocean is the world's newest and fourth-largest ocean.\n" +
                "\n" +
                "The deepest point in the Southern Ocean is unnamed but it is in the south end of the South Sandwich Trench and has a depth of -23,737 feet (-7,235 m)"));
        arrayList.add(new ThreeItemModel("Arctic Ocean", "The Arctic Ocean is the smallest ocean - more than five times smaller than the Indian and Atlantic oceans.\n" +
                "\n" +
                "It extends between Europe, Asia and North America and most of its waters are north of the Arctic Circle\n" +
                "ts deepest point is the Fram Basin at -15,305 feet (-4,665 m).\n" +
                "Arctic Ocean is covered by a drifting polar icepack that is an average of ten feet (three meters) thick."));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("প্রশান্ত মহাসাগর", "প্রশান্ত মহাসাগরটি দক্ষিণ মহাসাগর, এশিয়া এবং অস্ট্রেলিয়া এবং পশ্চিম গোলার্ধের মধ্যে অবস্থিত\n" +
                "পৃথিবীর পৃষ্ঠের প্রায় এক তৃতীয়াংশ জুড়ে, এটি পৃথিবীর ২৮% জুড়ে\n" +
                "গভীরতম বিন্দু হ'ল চ্যালেঞ্জার ডিপ জাপানের কাছে মারিয়ানা ট্রেঞ্চের মধ্যে within"));

        arrayList.add(new ThreeItemModel("আটলান্টিক মহাসাগর", "এর বৃহত্তম গভীরতা 8,605 মিটার (28,231 ফুট) এর পুয়ের্তো রিকো ট্র্যাঞ্চে।\n" +
                "এটি আফ্রিকা, ইউরোপ, দক্ষিণ মহাসাগর এবং পশ্চিম গোলার্ধের মধ্যে অবস্থিত।\n" +
                "আটলান্টিকের প্রধান প্রান্তিক সমুদ্রের মধ্যে রয়েছে ভূমধ্যসাগর, উত্তর সাগর, বাল্টিক সাগর, হাডসন উপসাগর, মেক্সিকো উপসাগর এবং ক্যারিবিয়ান সমুদ্র।"));

        arrayList.add(new ThreeItemModel("ভারত মহাসাগর", "এটি আফ্রিকা, দক্ষিণ মহাসাগর, এশিয়া এবং অস্ট্রেলিয়ার মধ্যে অবস্থিত।\n" +
                "এর গভীরতম বিন্দুটি জাভা ট্রেঞ্চ, 7,725 মি।"));
        arrayList.add(new ThreeItemModel("দক্ষিণ মহাসাগর", "দক্ষিণ মহাসাগর বিশ্বের বৃহত্তম এবং চতুর্থ বৃহত্তম মহাসাগর।\n" +
                "\n" +
                "দক্ষিণ মহাসাগরের গভীরতম বিন্দু নামবিহীন তবে এটি দক্ষিণ স্যান্ডউইচ পরিখরের দক্ষিণ প্রান্তে এবং এর গভীরতা -২৩,7377 ফুট (-7,২৩৫ মিটার) রয়েছে।"));

        arrayList.add(new ThreeItemModel("উত্তর মহাসাগর", "আর্কটিক মহাসাগর হ'ল ক্ষুদ্রতম মহাসাগর - ভারত ও আটলান্টিক মহাসাগরের চেয়ে পাঁচগুণ বেশি ছোট।\n" +
                "\n" +
                "এটি ইউরোপ, এশিয়া এবং উত্তর আমেরিকার মধ্যে বিস্তৃত এবং এর জলের বেশিরভাগ অংশটি আর্কটিক সার্কেলের উত্তরে\n" +
                "ts গভীরতম বিন্দুটি -15,305 ফুট (-4,665 মিটার) এর ফ্রেম বেসিন।\n" +
                "আর্টিক মহাসাগরটি একটি প্রবাহিত পোলার আইসপ্যাক দ্বারা আবৃত যা গড়ে দশ ফুট (তিন মিটার) পুরু।"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("प्रशांत महासागर", "प्रशांत महासागर दक्षिणी महासागर, एशिया और ऑस्ट्रेलिया और पश्चिमी गोलार्ध के बीच स्थित है\n" +
                "पृथ्वी की सतह का लगभग एक तिहाई भाग शामिल है, यह पृथ्वी का 28% भाग शामिल है\n" +
                "सबसे गहरी बात जापान के पास मारियाना ट्रेंच के भीतर चैलेंजर डीप है"));
        arrayList.add(new ThreeItemModel("अटलांटिक महासागर", "इसकी सबसे बड़ी गहराई प्यूर्टो रिको ट्रेंच में 8,605 मीटर (28,231 फीट) पर है।\n" +
                "यह अफ्रीका, यूरोप, दक्षिणी महासागर और पश्चिमी गोलार्ध के बीच स्थित है।\n" +
                "अटलांटिक के प्रमुख सीमांत समुद्रों में भूमध्य सागर, उत्तरी सागर, बाल्टिक सागर, हडसन की खाड़ी, मैक्सिको की खाड़ी और कैरेबियन सागर शामिल हैं।"));
        arrayList.add(new ThreeItemModel("हिंद महासागर", "यह अफ्रीका, दक्षिणी महासागर, एशिया और ऑस्ट्रेलिया के बीच स्थित है।\n" +
                "इसका सबसे गहरा बिंदु जावा ट्रेंच है, 7,725 मीटर पर।"));
        arrayList.add(new ThreeItemModel("दक्षिणी महासागर", "दक्षिणी महासागर दुनिया का सबसे नया और चौथा सबसे बड़ा महासागर है।\n" +
                "\n" +
                "दक्षिणी महासागर में सबसे गहरा बिंदु अनाम है लेकिन यह दक्षिण सैंडविच ट्रेंच के दक्षिणी छोर में है और इसकी गहराई -23,737 फीट (-7,235 मीटर) है।"));
        arrayList.add(new ThreeItemModel("आर्कटिक महासागर", "आर्कटिक महासागर सबसे छोटा महासागर है - भारतीय और अटलांटिक महासागरों की तुलना में पाँच गुना अधिक छोटा है।\n" +
                "\n" +
                "यह यूरोप, एशिया और उत्तरी अमेरिका के बीच फैला हुआ है और इसका अधिकांश पानी आर्कटिक सर्कल के उत्तर में है\n" +
                "ts सबसे गहरा बिंदु, Fram बेसिन -15,305 फीट (-4,665 m) है।\n" +
                "आर्कटिक महासागर एक बहते ध्रुवीय आइसपैक से ढका है जो औसतन दस फीट (तीन मीटर) मोटा है।"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("بحر اوقیانوس", "بحر الکاہل بحر ہند ، ایشیا اور آسٹریلیا اور مغربی نصف کرہ کے درمیان واقع ہے\n" +
                "زمین کی سطح کا تقریبا-ایک تہائی حصے پر محیط ہے ، جو زمین کے 28٪ حصے پر محیط ہے\n" +
                "سب سے گہری نقطہ جاپان کے قریب ماریانا ٹریچ کے اندر چیلنجر گہرائی ہے"));

        arrayList.add(new ThreeItemModel("بحر اوقیانوس", "اس کی سب سے بڑی گہرائی 8،605 میٹر (28،231 فٹ) پر پورٹو ریکو کھائی میں ہے۔\n" +
                "یہ افریقہ ، یورپ ، بحر ہند اور مغربی نصف کرہ کے درمیان واقع ہے۔\n" +
                "بحر اوقیانوس کے بڑے حاشیہ سمندر میں بحیرہ روم ، شمالی بحر ، بالٹک بحر ، ہڈسن بے ، خلیج میکسیکو اور بحیرہ کیریبین شامل ہیں۔"));
        arrayList.add(new ThreeItemModel("بحر ہند", "یہ افریقہ ، بحر ہند ، ایشیا اور آسٹریلیا کے درمیان واقع ہے۔\n" +
                "اس کا سب سے گہرا نقطہ جاوا خندق ہے ، جو 7،725 میٹر ہے۔"));
        arrayList.add(new ThreeItemModel("جنوبی سمندر", "بحر ہند دنیا کا جدید ترین اور چوتھا بڑا سمندر ہے۔\n" +
                "\n" +
                "بحر ہند میں سب سے گہری نقطہ نامعلوم نہیں ہے لیکن یہ جنوبی سینڈوچ کھائی کے جنوب کنارے میں ہے اور اس کی گہرائی -23،737 فٹ (-7،235 میٹر) ہے۔"));
        arrayList.add(new ThreeItemModel("آرکٹک اوقیانوس", "آرکٹک اوقیانوس سب سے چھوٹا سا سمندر ہے - ہندوستانی اور بحر اوقیانوس کے سمندروں سے پانچ گنا زیادہ چھوٹا ہے۔\n" +
                "\n" +
                "یہ یورپ ، ایشیا اور شمالی امریکہ کے مابین پھیلا ہوا ہے اور اس کا بیشتر پانی آرکٹک سرکل کے شمال میں ہے\n" +
                "ts سب سے گہری نقطہ -15،305 فٹ (-4،665 میٹر) پر فریم بیسن ہے۔\n" +
                "آرکٹک اوقیانوس میں بہتی قطبی آئسپیک کا احاطہ کیا گیا ہے جو اوسطا دس فٹ (تین میٹر) موٹا ہے۔"));

        return arrayList;
    }



}