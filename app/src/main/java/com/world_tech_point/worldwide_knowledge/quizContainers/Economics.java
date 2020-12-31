package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Economics {
    private Context context;

    public Economics(Context context) {
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

           arrayList.add(new ContentQuestionModel("GDP stands for","Gross Development Price","Gross Domestic Product","Growth Developed Price","Non of the above","Gross Domestic Product"));
        arrayList.add(new ContentQuestionModel("Who first developed the concept of GDP","Richard Easterlin","Wassily Leontief","Milton Friedman","Simon Kuznets","Simon Kuznets"));
        arrayList.add(new ContentQuestionModel("World Trade Organization starts functioning from the year","1993","1995","1997","1998","1995"));
        arrayList.add(new ContentQuestionModel("World Trade Organization Ministerial Conference of 2001 was held in ","Cancum","Paris","Geneva","Doha","Doha"));
        arrayList.add(new ContentQuestionModel("Ruble is the currency of ","Japan","Russia","Malaysia","South Africa","Russia"));
        arrayList.add(new ContentQuestionModel("'Das Kapital' a book on political economy was written by","Karl Marx","William Herschel","Friedrich Engels","None of these","Karl Marx"));
        arrayList.add(new ContentQuestionModel("The first G-20 summit was held in the year ","2002","2005","2006","2008","2008"));
        arrayList.add(new ContentQuestionModel("Which country is not a member of G-20 group","India","Saudi Arabia","Indonesia","Thailand","Thailand"));
        arrayList.add(new ContentQuestionModel("Where the G-20 summit of 2014 was held ","Australia","USA","Maxico","India","Australia"));
        arrayList.add(new ContentQuestionModel("Which country get the highest ranking in the lastest list published by World Bank for GDP per capita","Macau","Qatar","Luxembourg","Norway","Luxembourg"));
        arrayList.add(new ContentQuestionModel("Before 2009,when the last Global recession was taken place","1971","1982","1991","2001","1991"));
        arrayList.add(new ContentQuestionModel("The Great Recession starts in the month of december of the year ","2005","2007","2008","2009","2007"));
        arrayList.add(new ContentQuestionModel("The Great Depression of 1930s was started from which country","India","Britain","Canada","USA","USA"));
        arrayList.add(new ContentQuestionModel("Which one is the Worlds biggest stock exchange","Tokyo","New York","London","NASDAQ","New York"));
        arrayList.add(new ContentQuestionModel("Which country is the largest reserves of gold in the world ","India","Germany","Italy","USA","USA"));
        arrayList.add(new ContentQuestionModel("The world Economic Forum Annual Meeting 2015 was held in ","Davos","Geneva","Rome","Paris","Davos"));
        arrayList.add(new ContentQuestionModel("Where the headquarter of BRICS Development Bank will be located ","India","Russia","USA","China","China"));
        arrayList.add(new ContentQuestionModel("The 7th BRICS summit in 2015 was held ","India","Russia","USA","China","Russia"));

        arrayList.add(new ContentQuestionModel("Ruble is the currency of ","Japan","Russia","Malaysia","South Africa","Russia"));
        arrayList.add(new ContentQuestionModel("Which institution publish the 'World Economic Outlook' report ","United Nation","IMF","World Bank","IDA","IMF"));
        arrayList.add(new ContentQuestionModel("Which country has first ever printed paper money","USA","Germany","Japan","China","China"));
        arrayList.add(new ContentQuestionModel("Which country is the largest reserves of gold in the world ","India","Germany","Italy","USA","USA"));
        arrayList.add(new ContentQuestionModel("The 'Ease of Doing Business Index' is prepared and published by  ","World Trade Organization","World Bank Group","United Nations","European Nations","World Bank Group"));
        arrayList.add(new ContentQuestionModel("World Trade Organization starts functioning from the year","1993","1995","1997","1998","1995"));
        arrayList.add(new ContentQuestionModel("'Green Index' has been developed by ","United Nation Environment Programme","International Monetary Fund","World Bank","Non of the above","United Nation Environment Programme"));
        arrayList.add(new ContentQuestionModel("Where the G-20 summit of 2014 was held ","Australia","USA","Maxico","India","Australia"));
        arrayList.add(new ContentQuestionModel("The WTO basically promotes","financial support","global peace","unilaterl trade","multilateral trade","multilateral trade"));
        arrayList.add(new ContentQuestionModel("The 7th BRICS summit in 2015 was held ","India","Russia","USA","China","Russia"));
        arrayList.add(new ContentQuestionModel("The world budget is synonymous to 'bougette' of which language ","Latin","Greek","France","Hebrew","France"));
        arrayList.add(new ContentQuestionModel("The Lorenz curve is a measure of ","proverty","income inequalities","inflation rate","tax structure","income inequalities"));

        arrayList.add(new ContentQuestionModel("The Still well Road exist between India and","Bangladesh","China","Myanmar","Bhutan","China"));
        arrayList.add(new ContentQuestionModel("Where the headquarters of International Monetary Fund located","New York","Geneva","London","Washington","Washington"));
        arrayList.add(new ContentQuestionModel("A Recession is negative economic growth for_____consecutive quarters","Four","Three","Two","Six","Two"));
        arrayList.add(new ContentQuestionModel("Which country is the biggest exporter in the world","USA","Germany","Japan","China","China"));
        arrayList.add(new ContentQuestionModel("Which country has first ever printed paper money","USA","Germany","Japan","China","China"));
        arrayList.add(new ContentQuestionModel("Which is the World first stock exchange","Antwerp,Belgium","New York","Washington","Hamburg,Germany","Antwerp,Belgium"));
        arrayList.add(new ContentQuestionModel("The currency of Japan is known as","Dollar","Renminbi","Yen","Ringgit","Yen"));
        arrayList.add(new ContentQuestionModel("Total number of countries the officially used Euro as Currency","15","18","16","28","18"));
        arrayList.add(new ContentQuestionModel("Total number of members in ASEAN","12","10","15","20","10"));
        arrayList.add(new ContentQuestionModel("The annual winter meeting of World Economic Forum held every year in","Cologny","Geneva","Davos","Ohio","Davos"));
        arrayList.add(new ContentQuestionModel("World Bank was established in the year ","1932","1938","1946","1944","1944"));


        arrayList.add(new ContentQuestionModel("By whom was the autonomous investment separated from induced investment ","Joan Robinson","Adam Smith","Schumpeter","Malthus","Schumpeter"));
        arrayList.add(new ContentQuestionModel("The time element in price analysis was introduced by","JS Mill","JR Hicks","JM Keynes","Alfred Marshall","Alfred Marshall"));
        arrayList.add(new ContentQuestionModel("Human Development Index is a composite indicator of  ","Income,Health and Education","Income,Health and Trade","Health, Education and Nutrition","None of the Above","Income,Health and Education"));
        arrayList.add(new ContentQuestionModel("Which one of the following institution was replaced by World Trade Organization","UNCTAD","GATT","IBRD","IDA","GATT"));
        arrayList.add(new ContentQuestionModel("Which one is the first country in the world to imolement GST ","USA","Canada","France","Thailand","France"));
        arrayList.add(new ContentQuestionModel("Which country has dual model of GST implemented","Canada","UK","Germany","USA","Canada"));
        arrayList.add(new ContentQuestionModel("A Recession is negative economic growth for_____consecutive quarters","Four","Three","Two","Six","Two"));
        arrayList.add(new ContentQuestionModel("Which country has first ever printed paper money","USA","Germany","Japan","China","China"));
        arrayList.add(new ContentQuestionModel("Which institution is known as 'Soft Loan Window' of World Bank ","IDBI","IDA","IMF","RBI","IDA"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("ওয়ার্ল্ড ট্রেড অর্গানাইজেশন বছর থেকে কাজ শুরু করে", "1993", "1995", "1997", "1998", "1995"));
        arrayList.add(new ContentQuestionModel("২০০১ সালের ওয়ার্ল্ড ট্রেড অর্গানাইজেশন মন্ত্রী সম্মেলন অনুষ্ঠিত হয়েছিল", "ক্যানকাম", "প্যারিস", "জেনেভা", "দোহা", "দোহা"));//14
        arrayList.add(new ContentQuestionModel("রুবেল হ'ল", "জাপান", "রাশিয়া", "মালয়েশিয়া", "দক্ষিণ আফ্রিকা", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("'দাস কপিটাল' রাজনৈতিক অর্থনীতি সম্পর্কিত একটি বই লিখেছিলেন", "কার্ল মার্কস", "উইলিয়াম হার্শেল", "ফ্রেডরিচ এঙ্গেলস", "এর মধ্যে কিছুই নয়", "কার্ল মার্কস"));
        arrayList.add(new ContentQuestionModel("প্রথম জি -20 শীর্ষ সম্মেলন অনুষ্ঠিত হয়েছিল", "2002", "2005", "2006", "২০০৮", "২০০৮"));
        arrayList.add(new ContentQuestionModel("কোন দেশটি জি -২০ গ্রুপের সদস্য নয়", "ভারত", "সৌদি আরব", "ইন্দোনেশিয়া", "থাইল্যান্ড", "থাইল্যান্ড"));
        arrayList.add(new ContentQuestionModel("যেখানে ২০১৪ সালের জি -২০ শীর্ষ সম্মেলন অনুষ্ঠিত হয়েছিল", "অস্ট্রেলিয়া", "ইউএসএ", "ম্যাক্সিকো", "ভারত", "অস্ট্রেলিয়া"));
        arrayList.add(new ContentQuestionModel("বিশ্বব্যাংকের মাথাপিছু জিডিপির জন্য সর্বশেষতম তালিকায় কোন দেশ সর্বোচ্চ র‌্যাঙ্কিং পেয়েছে", "ম্যাকাউ", "কাতার", "লাক্সেমবার্গ", "নরওয়ে", "লাক্সেমবার্গ"));
        arrayList.add(new ContentQuestionModel("২০০৯ এর আগে, যখন সর্বশেষ বিশ্ব মন্দা হয়েছিল", "১৯" , "1982", "1991", "2001", "1991"));
        arrayList.add(new ContentQuestionModel("দ্য গ্রেট মন্দা বছরের ডিসেম্বরের মাসে শুরু হয়", "2005", "2007", "২০০৮", "২০০৯", "2007"));//22
        arrayList.add(new ContentQuestionModel("1930-এর দশকের দ্য গ্রেট ডিপ্রেশন শুরু হয়েছিল কোন দেশ থেকে", "ভারত", "ব্রিটেন", "কানাডা", "মার্কিন যুক্তরাষ্ট্র", "মার্কিন যুক্তরাষ্ট্র"));
        arrayList.add(new ContentQuestionModel("বিশ্বের বৃহত্তম স্টক এক্সচেঞ্জ  কোনটি", "টোকিও", "নিউ ইয়র্ক", "লন্ডন", "ন্যাসডাক", "নিউ ইয়র্ক"));
        arrayList.add(new ContentQuestionModel("বিশ্বের বৃহত্তম সোনার মজুদ কোন দেশ", "ভারত", "জার্মানি", "ইতালি", "ইউএসএ", "ইউএসএ"));

        arrayList.add(new ContentQuestionModel("মন্দা হল _____ ধারাবাহিক প্রান্তিকের জন্য নেতিবাচক অর্থনৈতিক বৃদ্ধি", "চার", "তিন", "দুই", "ছয়", "দুই"));
        arrayList.add(new ContentQuestionModel("কোন দেশ প্রথমবারের মতো কাগজের অর্থ প্রিন্ট করেছে", "ইউএসএ", "জার্মানি", "জাপান", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("কোন সংস্থা বিশ্ব ব্যাংকের 'সফট লোন উইন্ডো' নামে পরিচিত", "আইডিবিআই", "আইডিএ", "আইএমএফ", "আরবিআই", "আইডিএ"));
        arrayList.add(new ContentQuestionModel("রুবেল হ'ল", "জাপান", "রাশিয়া", "মালয়েশিয়া", "দক্ষিণ আফ্রিকা", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("কোন সংস্থা 'ওয়ার্ল্ড ইকোনমিক আউটলুক' রিপোর্ট প্রকাশ করে", "ইউনাইটেড নেশন", "আইএমএফ", "ওয়ার্ল্ড ব্যাংক", "আইডিএ", "আইএমএফ"));
        arrayList.add(new ContentQuestionModel("কোন দেশ প্রথমবারের মতো কাগজের অর্থ প্রিন্ট করেছে", "ইউএসএ", "জার্মানি", "জাপান", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("কোন দেশ প্রথমবারের মতো কাগজের অর্থ প্রিন্ট করেছে", "ইউএসএ", "জার্মানি", "জাপান", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("'ইজ অফ ডুিং বিজনেস ইনডেক্স' তৈরি করেছে এবং প্রকাশ করেছে", "ওয়ার্ল্ড ট্রেড অর্গানাইজেশন", "ওয়ার্ল্ড ব্যাংক গ্রুপ", "ইউনাইটেড নেশনস", "ইউরোপীয় নেশনস", "ওয়ার্ল্ড ব্যাংক গ্রুপ"));
        arrayList.add(new ContentQuestionModel("ওয়ার্ল্ড ট্রেড অর্গানাইজেশন বছর থেকে কাজ শুরু করে", "1993", "1995", "1997", "1998", "1995"));
        arrayList.add(new ContentQuestionModel("  গ্রীন সূচক  --  দ্বারা তৈরি করা হয়েছে", "ইউনাইটেড নেশন এনভায়রনমেন্ট প্রোগ্রাম", "আন্তর্জাতিক মুদ্রা তহবিল", "ওয়ার্ল্ড ব্যাংক", "উপরোক্ত নয়", "ইউনাইটেড নেশন এনভায়রনমেন্ট প্রোগ্রাম"));
        arrayList.add(new ContentQuestionModel("যেখানে ২০১৪ সালের জি -২০ শীর্ষ সম্মেলন অনুষ্ঠিত হয়েছিল", "অস্ট্রেলিয়া", "ইউএসএ", "ম্যাক্সিকো", "ভারত", "অস্ট্রেলিয়া"));
        arrayList.add(new ContentQuestionModel("ডব্লিউটিও মূলত--  প্রচার করে", "আর্থিক সহায়তা", "বৈশ্বিক শান্তি", "ইউনিলিটাল ট্রেড", "বহুপাক্ষিক বাণিজ্য", "বহুপাক্ষিক বাণিজ্য"));
        arrayList.add(new ContentQuestionModel("২০১৫ সালে ব্রিকস শীর্ষ সম্মেলন অনুষ্ঠিত হয়েছিল", "ভারত", "রাশিয়া", "মার্কিন যুক্তরাষ্ট্র", "চীন", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("বিশ্ব বাজেট কোন ভাষার  বুগেট  এর সমার্থক" ," লাতিন "," গ্রীক "," ফ্রান্স "," হিব্রু "," ফ্রান্স "));
        arrayList.add(new ContentQuestionModel("লরেঞ্জ বক্ররেখা--  এর একটি পরিমাপ", "প্রবাদ", "আয়ের বৈষম্য", "মূল্যস্ফীতির হার", "করের কাঠামো", "আয়ের বৈষম্য"));

        arrayList.add(new ContentQuestionModel("ওয়ার্ল্ড ইকোনমিক ফোরামের বার্ষিক সভা 2015 অনুষ্ঠিত হয়েছিল", "দাভোস", "জেনেভা", "রোম", "প্যারিস", "দাভোস"));//26
        arrayList.add(new ContentQuestionModel("যেখানে আন্তর্জাতিক মুদ্রা তহবিলের সদর দফতর অবস্থিত", "নিউ ইয়র্ক", "জেনেভা", "লন্ডন", "ওয়াশিংটন", "ওয়াশিংটন"));
        arrayList.add(new ContentQuestionModel("মন্দা হল _____ ধারাবাহিক প্রান্তিকের জন্য নেতিবাচক অর্থনৈতিক বৃদ্ধি", "চার", "তিন", "দুই", "ছয়", "দুই"));
        arrayList.add(new ContentQuestionModel("কোন দেশ বিশ্বের বৃহত্তম রফতানিকারক দেশ", "ইউএসএ", "জার্মানি", "জাপান", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("কোন দেশ প্রথমবারের মতো কাগজের অর্থ প্রিন্ট করেছে", "ইউএসএ", "জার্মানি", "জাপান", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("বিশ্বের প্রথম স্টক এক্সচেঞ্জ", "অ্যান্টওয়ার্প, বেলজিয়াম", "নিউ ইয়র্ক", "ওয়াশিংটন", "হামবুর্গ, জার্মানি", "অ্যান্টওয়ার্প, বেলজিয়াম"));
        arrayList.add(new ContentQuestionModel("জাপানের মুদ্রা--  নামে পরিচিত", "ডলার", "রেনমিনবি", "ইয়েন", "রিংজিট", "ইয়েন"));
        arrayList.add(new ContentQuestionModel("আনুষ্ঠানিকভাবে ইউরোকে মুদ্রা হিসাবে ব্যবহার করা দেশের মোট সংখ্যা", "15", "18", "16", "28", "18"));
        arrayList.add(new ContentQuestionModel("আসিয়ান-এ মোট সদস্য সংখ্যা", "12", "10", "15", "20", "10"));
        arrayList.add(new ContentQuestionModel("ওয়ার্ল্ড ইকোনমিক ফোরামের বার্ষিক শীতের সভা প্রতিবছর", "কোলনি", "জেনেভা", "দাভোস", "ওহিও", "দাভোস"));
        arrayList.add(new ContentQuestionModel("ওয়ার্ল্ড ব্যাংক প্রতিষ্ঠিত হয়েছিল", "1932", "1938", "1946", "1944", "1944"));
        arrayList.add(new ContentQuestionModel("জিডিপি এর অর্থ দাঁড়ায়", "মোট উন্নয়ন মূল্য", "মোট দেশীয় পণ্য", "প্রবৃদ্ধি বিকাশিত মূল্য", "উপরেরটি নয়", "মোট দেশীয় পণ্য"));
        arrayList.add(new ContentQuestionModel("কে প্রথমে জিডিপির ধারণাটি গড়ে তুলেছিল", "রিচার্ড ইস্টারিন", "ওয়াসিলি লিওন্টিফ", "মিল্টন ফ্রেডম্যান", "সাইমন কুজনেটস", "সাইমন কুজনেটস"));


        arrayList.add(new ContentQuestionModel("যেখানে ব্রিকস ডেভলপমেন্ট ব্যাংকের সদর দফতর অবস্থিত", "ভারত", "রাশিয়া", "ইউএসএ", "চীন", "চীন"));
        arrayList.add(new ContentQuestionModel("২০১৫ সালে ব্রিকস শীর্ষ সম্মেলন অনুষ্ঠিত হয়েছিল", "ভারত", "রাশিয়া", "মার্কিন যুক্তরাষ্ট্র", "চীন", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("দ্য স্টিল ওয়েল রোড ভারত এবং--  এর মধ্যে বিদ্যমান", "বাংলাদেশ", "চীন", "মিয়ানমার", "ভুটান", "চীন"));//29
        arrayList.add(new ContentQuestionModel("স্বায়ত্তশাসিত বিনিয়োগ কাদের দ্বারা প্ররোচিত বিনিয়োগ থেকে আলাদা হয়েছিল", "জোয়ান রবিনসন", "অ্যাডাম স্মিথ", "শম্পিটার", "মালথাস", "শম্পিটার"));
        arrayList.add(new ContentQuestionModel("মূল্য বিশ্লেষণের সময় উপাদানটি --  চালু করেছিলেন", "জেএস ​​মিল", "জেআর হিকস", "জেএম কেইনস", "আলফ্রেড মার্শাল", "আলফ্রেড মার্শাল"));
        arrayList.add(new ContentQuestionModel("মানব উন্নয়ন সূচক হ'ল --  এর সম্মিলিত সূচক", "আয়, স্বাস্থ্য ও শিক্ষা", "আয়, স্বাস্থ্য ও বাণিজ্য", "স্বাস্থ্য, শিক্ষা ও পুষ্টি", "উপরের কিছুই নয়", "আয়, স্বাস্থ্য ও শিক্ষা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোন প্রতিষ্ঠানের পরিবর্তে ওয়ার্ল্ড ট্রেড অর্গানাইজেশন--    প্রতিস্থাপন করা হয়েছিল ", "ইউএনসিটিএডিডি", "জিএটিটি", "আইবিআরডি", "আইডিএ", "জিএটিটি"));
        arrayList.add(new ContentQuestionModel("জিএসটি বাস্তবায়নকারী বিশ্বের প্রথম কোন দেশ", "ইউএসএ", "কানাডা", "ফ্রান্স", "থাইল্যান্ড", "ফ্রান্স"));
        arrayList.add(new ContentQuestionModel("কোন দেশে জিএসটির দ্বৈত মডেল প্রয়োগ করা হয়েছে", "কানাডা", "ইউকে", "জার্মানি", "ইউএসএ", "কানাডা"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("जहां अंतर्राष्ट्रीय मुद्रा कोष का मुख्यालय स्थित है", "न्यूयॉर्क", "जिनेवा", "लंदन", "वाशिंगटन", "वाशिंगटन"));
        arrayList.add(new ContentQuestionModel("एक मंदी नकारात्मक आर्थिक विकास के लिए _____consistent तिमाहियों", "चार", "तीन", "दो", "छह", "दो"));
        arrayList.add(new ContentQuestionModel("कौन सा देश दुनिया में सबसे बड़ा निर्यातक है", "यूएसए", "जर्मनी", "जापान", "चीन", "चीन"));
        arrayList.add(new ContentQuestionModel("किस देश ने पहली बार कागज के पैसे छापे हैं", "यूएसए", "जर्मनी", "जापान", "चीन", "चीन"));
        arrayList.add(new ContentQuestionModel("कौन सा विश्व का पहला स्टॉक एक्सचेंज है", "एंटवर्प, बेल्जियम", "न्यूयॉर्क", "वाशिंगटन", "हैम्बर्ग, जर्मनी", "एंटवर्प, बेल्जियम"));
        arrayList.add(new ContentQuestionModel("जापान की मुद्रा  --   के रूप में जानी जाती है", "डॉलर", "रेनमिनबी", "येन", "रिंगित", "येन"));
        arrayList.add(new ContentQuestionModel("कुल देशों की आधिकारिक तौर पर यूरो का मुद्रा के रूप में उपयोग किया जाता है", "15", "19", "16", "28", "19"));//7
        arrayList.add(new ContentQuestionModel("आसियान में सदस्यों की कुल संख्या", "12", "10", "15", "20", "10"));
        arrayList.add(new ContentQuestionModel("वर्ल्ड इकोनॉमिक फोरम की वार्षिक शीतकालीन बैठक हर साल कोलोन  -- में आयोजित होती है।"," ", " िनेवा ","दावोस"," ओहियो " , "दावोस" ));//9
        arrayList.add(new ContentQuestionModel("विश्व बैंक की स्थापना वर्ष में हुई", "1932", "1938", "1946", "1944", "1944"));
        arrayList.add(new ContentQuestionModel("जीडीपी का अर्थ है", "सकल विकास मूल्य", "सकल घरेलू उत्पाद", "विकसित विकास मूल्य", "उपरोक्त में से कोई भी", "सकल घरेलू उत्पाद"));
        arrayList.add(new ContentQuestionModel("जिसने पहली बार जीडीपी की अवधारणा विकसित की", "रिचर्ड ईस्टरलीन", "वासिली लोंटेफ", "मिल्टन फ्रीडमैन", "साइमन कुजनेट", "साइमन कुजनेट"));
        arrayList.add(new ContentQuestionModel("विश्व व्यापार संगठन वर्ष से काम करना शुरू करता है", "1993", "1995", "1997", "1998", "1995"));
        arrayList.add(new ContentQuestionModel("2001 का विश्व व्यापार संगठन मंत्री सम्मेलन", "कान्कम", "पेरिस", "जिनेवा", "दोहा", "दोहा"));
        arrayList.add(new ContentQuestionModel("रूबल", "जापान", "रूस", "मलेशिया", "दक्षिण अफ्रीका", "रूस"));
        arrayList.add(new ContentQuestionModel("दास कपिटल  राजनीतिक अर्थव्यवस्था पर एक पुस्तक -- द्वारा लिखी गई थी। ","कार्ल मार्क्स", "विलियम हर्शल", "फ्रेडरिक एंगेल्स", "इनमें से कोई नहीं", "कार्ल मार्क्स"));
        arrayList.add(new ContentQuestionModel("पहला जी -20 शिखर सम्मेलन वर्ष में आयोजित किया गया था", "2002", "2005", "2006", "2008", "2008"));
        arrayList.add(new ContentQuestionModel("कौन सा देश जी -20 समूह का सदस्य नहीं है", "भारत", "सऊदी अरब", "इंडोनेशिया", "थाईलैंड", "थाईलैंड"));
        arrayList.add(new ContentQuestionModel("जहां 2014 का जी -20 शिखर सम्मेलन आयोजित किया गया", "ऑस्ट्रेलिया", "यूएसए", "मैक्सिको", "भारत", "ऑस्ट्रेलिया"));
        arrayList.add(new ContentQuestionModel("विश्व बैंक द्वारा प्रति व्यक्ति जीडीपी के लिए प्रकाशित नवीनतम सूची में किस देश को सर्वोच्च रैंकिंग मिली है", "मकाऊ", "कतर", "लक्ज़मबर्ग", "नॉर्वे", "लक्ज़मबर्ग"));
        arrayList.add(new ContentQuestionModel("2009 से पहले, जब आखिरी वैश्विक मंदी हुई थी", "1971", "1982", "1991", "2001", "1991"));
        arrayList.add(new ContentQuestionModel("महान मंदी वर्ष के वर्ष के महीने में शुरू होती है", "2005", "2007", "2008", "2009", "2007"));
        arrayList.add(new ContentQuestionModel("द ग्रेट डिप्रेशन ऑफ़ 1930s किस देश से शुरू हुआ था", "भारत", "ब्रिटेन", "कनाडा", "यूएसए", "यूएसए"));
        arrayList.add(new ContentQuestionModel("कौन सा सबसे बड़ा स्टॉक एक्सचेंज है", "टोक्यो", "न्यूयॉर्क", "लंदन", "NASDAQ", "न्यूयॉर्क"));
        arrayList.add(new ContentQuestionModel("कौन सा देश दुनिया में सोने का सबसे बड़ा भंडार है", "भारत", "जर्मनी", "इटली", "यूएसए", "भारत"));
        arrayList.add(new ContentQuestionModel("विश्व आर्थिक मंच वार्षिक बैठक 2015 -- में आयोजित की गई थी। ", "दावोस", "जेनेवा", "रोम", "पेरिस", "दावोस"));
        arrayList.add(new ContentQuestionModel("ब्रिक्स डेवलपमेंट बैंक का मुख्यालय कहाँ स्थित होगा", "भारत", "रूस", "यूएसए", "चीन", "चीन"));
        arrayList.add(new ContentQuestionModel("2015 में 7 वां ब्रिक्स शिखर सम्मेलन --  आयोजित किया गया था।", "भारत", "रूस", "यूएसए", "चीन", "रूस"));
        arrayList.add(new ContentQuestionModel("द स्टिल वेल रोड भारत और  के बीच मौजूद है", "बांग्लादेश", "चीन", "म्यांमार", "भूटान", "चीन"));
        arrayList.add(new ContentQuestionModel("प्रेरित निवेश से अंकुरित स्वायत्त निवेश था", "युवा रॉबिन्स", "एडम स्मिथ", "शम्पेटर", "मुल्थेस", "शम्पेटर"));
        arrayList.add(new ContentQuestionModel("मूल्य विश्लेषण में समय तत्व -- द्वारा प्रस्तुत किया गया था।", "जेएस मिल", "जेआर हिक्स", "जेएम कीन्स", "अल्फ्रेड मार्शल", "अल्फ्रेड मार्शल"));
        arrayList.add(new ContentQuestionModel("मानव विकास सूचकांक", "आय, स्वास्थ्य और शिक्षा", "आय, स्वास्थ्य और व्यापार", "स्वास्थ्य, शिक्षा और पोषण", "उपरोक्त में से कोई नहीं", "आय, स्वास्थ्य और व्यापार"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किस संस्थान को विश्व व्यापार संगठन द्वारा प्रतिस्थापित किया गया", "UNCTAD", "GATT", "IBRD", "IDA", "GATT"));
        arrayList.add(new ContentQuestionModel("जीएसटी को लागू करने वाला दुनिया का पहला देश कौन सा है", "यूएसए", "कनाडा", "फ्रांस", "थाईलैंड", "फ्रांस"));
        arrayList.add(new ContentQuestionModel("किस देश में जीएसटी लागू होने का दोहरा मॉडल है", "कनाडा", "यूके", "जर्मनी", "यूएसए", "कनाडा"));
        arrayList.add(new ContentQuestionModel("एक मंदी नकारात्मक आर्थिक विकास के लिए _____consistent तिमाहियों", "चार", "तीन", "दो", "छह", "दो"));
        arrayList.add(new ContentQuestionModel("किस देश ने पहली बार कागज के पैसे छापे हैं", "यूएसए", "जर्मनी", "जापान", "चीन", "चीन"));
        arrayList.add(new ContentQuestionModel("किस संस्था को विश्व बैंक की सॉफ्ट बैंक विंडो", "आईडीबीआई", "आईडीए", "आईएमएफ", "आरबीआई", "आईडीबीआई"));
        arrayList.add(new ContentQuestionModel("रूबल", "जापान", "रूस", "मलेशिया", "दक्षिण अफ्रीका", "रूस"));//39
        arrayList.add(new ContentQuestionModel("कौन सी संस्था 'विश्व आर्थिक आउटलुक' रिपोर्ट प्रकाशित करती है", "यूनाइटेड नेशन", "आईएमएफ", "वर्ल्ड बैंक", "आईडीए", "आईएमएफ"));
        arrayList.add(new ContentQuestionModel("किस देश ने पहली बार कागज के पैसे छापे हैं", "यूएसए", "जर्मनी", "जापान", "चीन", "चीन"));
        arrayList.add(new ContentQuestionModel("कौन सा देश दुनिया में सोने का सबसे बड़ा भंडार है", "भारत", "जर्मनी", "इटली", "यूएसए", "भारत"));
        arrayList.add(new ContentQuestionModel("ईज ऑफ डूइंग बिजनेस इंडेक्स", "वर्ल्ड ट्रेड ऑर्गनाइजेशन --  द्वारा तैयार और प्रकाशित किया गया है।", "वर्ल्ड बैंक ग्रुप", "यूनाइटेड नेशंस", "यूरोपियन नेशंस", "वर्ल्ड बैंक ग्रुप"));
        arrayList.add(new ContentQuestionModel("विश्व व्यापार संगठन वर्ष से काम करना शुरू करता है", "1993", "1995", "1997", "1998", "1995"));
        arrayList.add(new ContentQuestionModel("  ग्रीन इंडेक्स  "," यूनाइटेड नेशन एनवायरनमेंट प्रोग्राम ","अंतर्राष्ट्रीय मुद्रा कोष"," वर्ल्ड बैंक "," नॉन उपरोक्त ","अंतर्राष्ट्रीय मुद्रा कोष"));
        arrayList.add(new ContentQuestionModel("जहां 2014 का जी -20 शिखर सम्मेलन आयोजित किया गया", "ऑस्ट्रेलिया", "यूएसए", "मैक्सिको", "भारत", "ऑस्ट्रेलिया"));
        arrayList.add(new ContentQuestionModel("विश्व व्यापार संगठन मूल रूप से बढ़ावा देता है", "वित्तीय सहायता", "वैश्विक शांति", "एकतरफा व्यापार", "बहुपक्षीय व्यापार", "बहुपक्षीय व्यापार"));
        arrayList.add(new ContentQuestionModel("2015 में 7 वां ब्रिक्स शिखर सम्मेलन --  आयोजित किया गया था।", "भारत", "रूस", "यूएसए", "चीन", "रूस"));
        arrayList.add(new ContentQuestionModel("विश्व बजट 'किस भाषा का' गुलदस्ता 'का पर्याय है", "लैटिन", "ग्रीक", "फ्रांस", "हिब्रू", "फ्रांस"));
        arrayList.add(new ContentQuestionModel("लोरेंज वक्र-- का एक उपाय है", "कहावत", "आय असमानताएं", "मुद्रास्फीति दर", "कर संरचना", "आय असमानताएं"));

        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("جہاں بین الاقوامی مالیاتی فنڈ کا صدر مقام واقع ہے" , "نیو یارک" , "جنیوا" , "لندن" , "واشنگٹن","واشنگٹن"));
        arrayList.add(new ContentQuestionModel("ایک مندی منفی معاشی نمو ہے جو _____ متواتر سہ ماہیوں" , "چار" , "تین" , "دو" , "چھ","دو"));
        arrayList.add(new ContentQuestionModel("کون سا ملک دنیا کا سب سے بڑا برآمد کنندہ ہے" , "USA" , "جرمنی" , "جاپان" , "چین","چین"));
        arrayList.add(new ContentQuestionModel("کس ملک نے پہلی بار کاغذی رقم چھپی ہے" , "امریکہ" , "جرمنی" , "جاپان" , "چین","چین"));
        arrayList.add(new ContentQuestionModel("دنیا کا پہلا اسٹاک ایکسچینج کونسا ہے" , "انٹورپ ، بیلجیم" , "نیو یارک" , "واشنگٹن" , "ہیمبرگ ، جرمنی","انٹورپ ، بیلجیم"));
        arrayList.add(new ContentQuestionModel("جاپان کی کرنسی کے نام سے جانا جاتا ہے "," ڈالر "," رینمنبی ","ین"," رنگٹ ","ین"));//6
        arrayList.add(new ContentQuestionModel("سرکاری طور پر یورو کو بطور کرنسی استعمال کرنے والے ممالک کی کل تعداد","15","18","16","28","18"));
        arrayList.add(new ContentQuestionModel("آسیان میں ممبروں کی کل تعداد","12","10","15","20","10"));
        arrayList.add(new ContentQuestionModel("ورلڈ اکنامک فورم کا سالانہ سرمائی اجلاس ہر سال میں منعقد ہوتا ہے "," کولونی "," جنیوا ","ڈیووس"," اوہائیو ","ڈیووس"));//9
        arrayList.add(new ContentQuestionModel("ورلڈ بینک سال میں قائم کیا گیا تھا","1932","1938","1946","1944","1944"));
        arrayList.add(new ContentQuestionModel("جی ڈی پی کا مطلب ہے" , "مجموعی ترقیاتی قیمت" , "مجموعی گھریلو مصنوعات" , "مجموعی ملکی پیداوار" , "مذکورہ بالا میں سے کوئی نہیں","مجموعی ملکی پیداوار"));//11
        arrayList.add(new ContentQuestionModel("جی ڈی پی کا تصور سب سے پہلے کس نے تیار کیا" , "رچرڈ ایسٹرلن" , "واسیلی لیونٹف" , "ملٹن فریڈمین" , "سائمن کوزنٹس","سائمن کوزنٹس"));//12
        arrayList.add(new ContentQuestionModel("ورلڈ ٹریڈ آرگنائزیشن نے سال سے کام شروع کیا","1993","1995","1997","1998","1995"));
        arrayList.add(new ContentQuestionModel("2001 میں ورلڈ ٹریڈ آرگنائزیشن کی وزارتی کانفرنس منعقد ہوئی "," کینکم "," پیرس "," جنیوا ","دوحہ","دوحہ"));//14
        arrayList.add(new ContentQuestionModel("روبل کی کرنسی ہے "," جاپان ","روس"," ملیشیا "," جنوبی افریقہ ","روس"));
        arrayList.add(new ContentQuestionModel("'داس کیپیٹل' 'سیاسی معیشت پر ایک کتاب لکھی گئی تھی ","کارل مارکس"," ولیم ہرشل "," فریڈرک اینگلز "," ان میں سے کوئی بھی نہیں ","کارل مارکس"));//16
        arrayList.add(new ContentQuestionModel("پہلا جی -20 سربراہی اجلاس سال میں ہوا تھا","2002","2005","2006","2008","2008"));
        arrayList.add(new ContentQuestionModel("کون سا ملک G-20 گروپ کا رکن نہیں ہے" , "ہندوستان" , "سعودی عرب" , "انڈونیشیا" , "تھائی لینڈ","تھائی لینڈ"));
        arrayList.add(new ContentQuestionModel("جہاں 2014 کا جی -20 سربراہ اجلاس ہوا" , "آسٹریلیا" , "امریکہ" , "میکسیکو" , "ہندوستان","آسٹریلیا"));
        arrayList.add(new ContentQuestionModel("عالمی بینک کے ذریعہ فی کس جی ڈی پی کے لئے شائع ہونے والی تازہ ترین فہرست میں کون سا ملک اعلی درجہ حاصل کرتا ہے" , "مکاؤ" , "قطر" , "لکسمبرگ" , "ناروے","لکسمبرگ"));
        arrayList.add(new ContentQuestionModel("2009 سے پہلے ، جب آخری عالمی کساد بازاری ہوئی تھی","1971","1982","1991","2001","1991"));
        arrayList.add(new ContentQuestionModel("زبردست کساد بازاری کا آغاز سال کے دسمبر میں ہوتا ہے","2005","2007","2008","2009","2007"));
        arrayList.add(new ContentQuestionModel("1930 کی دہائی کا عظیم افسردگی کس ملک سے شروع ہوا تھا" , "ہندوستان" , "برطانیہ" , "کینیڈا" , "امریکا","امریکا"));
        arrayList.add(new ContentQuestionModel("کون سا دنیا کا سب سے بڑا اسٹاک ایکسچینج ہے" , "ٹوکیو" , "نیویارک" , "لندن" , "نیس ڈیک","نیویارک"));//24
        arrayList.add(new ContentQuestionModel("کون سا ملک دنیا میں سونے کا سب سے بڑا ذخیرہ ہے" , "ہندوستان" , "جرمنی" , "اٹلی" , "USA","USA"));
        arrayList.add(new ContentQuestionModel("ورلڈ اکنامک فورم کی سالانہ میٹنگ 2015 منعقد ہوئی "," ڈیووس "," جنیوا "," روم ","ڈیووس","ڈیووس"));//26
        arrayList.add(new ContentQuestionModel("جہاں برکس ڈویلپمنٹ بینک کا صدر مقام واقع ہوگا" , "ہندوستان" , "روس" , "امریکہ" , "چین","چین"));
        arrayList.add(new ContentQuestionModel("2015 میں برکس کا 7واں اجلاس منعقد ہوا" , "ہندوستان" , "روس" , "امریکہ" , "چین","روس"));
        arrayList.add(new ContentQuestionModel("اسٹیل ویل روڈ ہندوستان اور کے درمیان موجود ہے "," بنگلہ دیش ","چین"," میانمار "," بھوٹان ","چین"));//29
        arrayList.add(new ContentQuestionModel("خود مختار سرمایہ کاری کس کے ذریعہ حوصلہ افزائی کی گئی سرمایہ کاری سے جدا ہوئی تھی" , "جون رابنسن" , "ایڈم اسمتھ" , "شومپیٹر" ,"مالتھس","شومپیٹر"));
        arrayList.add(new ContentQuestionModel("قیمت تجزیہ میں وقت عنصر کے ذریعہ متعارف کرایا گیا تھا "," جے ایس مل "," جے آر ہکس "," جے ایم کینز ","الفریڈ مارشل","الفریڈ مارشل"));
        arrayList.add(new ContentQuestionModel("ہیومن ڈویلپمنٹ انڈیکس ایک جامع اشارے ہے ","انکم ، صحت اور تعلیم"," انکم ، صحت اور تجارت "," صحت ، تعلیم اور تغذیہ "," اوپر سے کوئی نہیں ","انکم ، صحت اور تعلیم"));//32
        arrayList.add(new ContentQuestionModel("ورلڈ ٹریڈ آرگنائزیشن نے مندرجہ ذیل میں سے کون سا ادارہ تبدیل کیا؟ "," یونکٹاد "," جی اے ٹی ٹی ","GATT"," آئی ڈی اے ","GATT"));
        arrayList.add(new ContentQuestionModel("جی ایس ٹی نافذ کرنے والا دنیا کا کون سا پہلا ملک ہے" ,"امریکہ" , "کینیڈا" , "فرانس" , "تھائی لینڈ","فرانس"));
        arrayList.add(new ContentQuestionModel("کس ملک میں جی ایس ٹی کا دوہری ماڈل لاگو ہے" , "کینیڈا" , "یوکے" , "جرمنی" , "امریکہ","کینیڈا"));
        arrayList.add(new ContentQuestionModel("ایک مندی منفی معاشی نمو ہے جو _____ متواتر سہ ماہیوں" , "چار" , "تین" , "دو" , "چھ","دو"));
        arrayList.add(new ContentQuestionModel("کس ملک نے پہلی بار کاغذی رقم چھپی ہے" , "امریکہ" , "جرمنی" , "جاپان" , "چین","چین"));
        arrayList.add(new ContentQuestionModel("کون سا ادارہ جسے ورلڈ بینک کا 'سافٹ لون ونڈو' کہا جاتا ہے" , "IDBI" , "IDA" , "IMF" ,"RBI","IDA"));
        arrayList.add(new ContentQuestionModel("روبل کی کرنسی ہے "," جاپان "," روس "," ملیشیا "," جنوبی افریقہ "," روس "));
        arrayList.add(new ContentQuestionModel("کون سا ادارہ 'ورلڈ اکنامک آؤٹ لک' رپورٹ شائع کرتا ہے؟ "," متحدہ قوم "," آئی ایم ایف "," ورلڈ بینک ","مِف","مِف"));
        arrayList.add(new ContentQuestionModel("کس ملک نے پہلی بار کاغذی رقم چھپی ہے" , "امریکہ" , "جرمنی" , "جاپان" , "چین","چین"));
        arrayList.add(new ContentQuestionModel("کون سا ملک دنیا میں سونے کا سب سے بڑا ذخیرہ ہے" , "ہندوستان", "جرمنی" ,"اٹلی" , "امریکا","امریکا"));
        arrayList.add(new ContentQuestionModel("'ایج آف ڈوئنگ بزنس انڈیکس' تیار کیا اور شائع کیا ہے" , "ورلڈ ٹریڈ آرگنائزیشن" ,"ورلڈ بینک گروپ" , "اقوام متحدہ" , "یوروپی نیشن","ورلڈ بینک گروپ"));
        arrayList.add(new ContentQuestionModel("World Trade Organization starts functioning from the year","1993","1995","1997","1998","1995"));
        arrayList.add(new ContentQuestionModel("'گرین انڈیکس' تیار کیا گیا ہے "," یونائیٹڈ نیشن ماحولیاتی پروگرام "," بین الاقوامی مالیاتی فنڈ "," ورلڈ بینک ","متحدہ قومی ماحولیاتی پروگرام","متحدہ قومی ماحولیاتی پروگرام"));//45
        arrayList.add(new ContentQuestionModel("جہاں 2014 کا جی -20 سربراہ اجلاس ہوا" , "آسٹریلیا" , "امریکہ" , "میکسیکو" , "ہندوستان" ,"میکسیکو" ));
        arrayList.add(new ContentQuestionModel("ڈبلیو ٹی او بنیادی طور پر فروغ دیتا ہے" , "مالی تعاون" , "عالمی امن" , "غیر منطقی تجارت" , "کثیرالجہتی تجارت","کثیرالجہتی تجارت"));
        arrayList.add(new ContentQuestionModel("2015 میں برکس کا 7واں اجلاس منعقد ہوا" , "ہندوستان" , "روس" , "امریکہ" , "چین","روس"));
        arrayList.add(new ContentQuestionModel("عالمی بجٹ 'بوگیٹ' کا مترادف ہے جس زبان کے" , "لاطینی" , "یونانی" , "فرانس" , "عبرانی","فرانس"));
        arrayList.add(new ContentQuestionModel("لورینز وکر ایک پیمائش ہے "," غربت ","آمدنی میں عدم مساوات"," افراط زر کی شرح "," ٹیکس کا ڈھانچہ ","آمدنی میں عدم مساوات"));//50

        return arrayList;


    }


}