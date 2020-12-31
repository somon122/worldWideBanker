package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_FirstInTheWorld {


    private Context context;
    public Q_FirstInTheWorld(Context context) {
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

        arrayList.add(new ThreeItemModel("Man heart transplant was per formed by\t", "Dr. Christian Barnard, 1967"));
        arrayList.add(new ThreeItemModel("Man Oscar winner for the Best Actor\t", "Emil Jannings, 1928"));
        arrayList.add(new ThreeItemModel("Man to climb Mt Everest\t", "Tenzing Norgay and Edmund Hillary, 1953"));
        arrayList.add(new ThreeItemModel("Man to compile Encyclopedia\t", "Aspheosis"));
        arrayList.add(new ThreeItemModel("Man to cross the Pacific Ocean in hot air balloon\t", "Ben Abruzzo and team in the Double Eagle V"));
        arrayList.add(new ThreeItemModel("Man to draw the map of Earth\t", "Anexemander"));
        arrayList.add(new ThreeItemModel("Man to Fly an aeroplan\t", "Wright Brothers"));
        arrayList.add(new ThreeItemModel("Man to fly solo non stop across the Atlantic", "Charles Lindbergh, 1927"));
        arrayList.add(new ThreeItemModel("Man to fly solo nonstop around the world in ballon", "Steve Fossett, U.S., 2002"));
        arrayList.add(new ThreeItemModel("Man to go to the space", "Major Yuri Gagarin"));
        arrayList.add(new ThreeItemModel("Man to have climbed Mount Everest Twice", "Nawang Gombu"));
        arrayList.add(new ThreeItemModel("Man to reach North Pole", "Robert Peary"));
        arrayList.add(new ThreeItemModel("Man to reach South Pole", "Ronald Amundsen"));
        arrayList.add(new ThreeItemModel("Man to sail around the World", "Ferdinand Magellan"));
        arrayList.add(new ThreeItemModel("Man to sail around the World alone", "Joshua Slocum"));
        arrayList.add(new ThreeItemModel("Man to set foot on the Moon", "Neil Armstrong"));
        arrayList.add(new ThreeItemModel("Man to swim across the English Channel", "Matthew Webb, 1875"));
        arrayList.add(new ThreeItemModel("Man to walk in space", "Alexei Arkhovich Leonov, 1965"));
        arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Chemistry", "JH Wenthoff"));
        arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Economics", "Ranger Fish and John Tinbergen"));
        arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Literature", "Rene FA and Silt Pradhom"));
        arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Medicine", "AE Wonn Behring"));
        arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Peace", "Jin F Dunant nad Frederic Peiry"));

        arrayList.add(new ThreeItemModel("Asian city to host Olympics", "Tokyo, Japan, 1964"));
        arrayList.add(new ThreeItemModel("Athlete disqualified at the Olympics for drug use", "Hans-Gunnar Lijenwall, Mexico Olympics, 1968"));
        arrayList.add(new ThreeItemModel("Blind person to conquer the Everest", "Erik Weihenmayer, USA, 2001"));
        arrayList.add(new ThreeItemModel("Country to host modern Olympics", "Greece"));
        String str = "China";
        arrayList.add(new ThreeItemModel("Country to issue paper currency", str));
        arrayList.add(new ThreeItemModel("Country to launch Radio Telescope Satellite into space\t", "Japan"));
        arrayList.add(new ThreeItemModel("Country to launch satellite into space\t", "Russia"));
        String str2 = "USA";
        arrayList.add(new ThreeItemModel("Country to make a constitution\t", str2));
        arrayList.add(new ThreeItemModel("Country to make education compulsory\t", "Prussia"));
        arrayList.add(new ThreeItemModel("Country to Organize NAM Summit\t", "Belgrade"));
        arrayList.add(new ThreeItemModel("Country to Print Books\t", str));
        arrayList.add(new ThreeItemModel("Country to send human to Moon\t", str2));
        arrayList.add(new ThreeItemModel("Country to start Civil Service Competition\t", str));
        arrayList.add(new ThreeItemModel("Country to win World Cup football\t", "Uruguay"));
        arrayList.add(new ThreeItemModel("Cricket Club\t", "Cricket club founded in Hambledon, England"));
        arrayList.add(new ThreeItemModel("European to visit China\t", "Marco Polo"));
        arrayList.add(new ThreeItemModel("Man boxing champion\t", "Tim Hyer, 1841"));
        arrayList.add(new ThreeItemModel("Man chess champion\t", "Wilhelm Steinitz, 1886"));
        arrayList.add(new ThreeItemModel("Man heart transplant recipient\t", "Louis Washkansky, 1967"));
         arrayList.add(new ThreeItemModel("Man to win Nobel Prize in Physics", "WK Roentgen"));
        arrayList.add(new ThreeItemModel("Man to win Tour de France", "Maurice Garin, 1903"));
        arrayList.add(new ThreeItemModel("Man tourist in Space", "Dennis Tito"));
        arrayList.add(new ThreeItemModel("Movie in the world", "The jazz Singer , 1927"));
        arrayList.add(new ThreeItemModel("Parkinson’s disease was first described by", "James Parkinson, British neurologist, 1817"));
        arrayList.add(new ThreeItemModel("Recipient of a permanent artificial heart", "Barney Clark, 1982"));
        arrayList.add(new ThreeItemModel("Religion of the world", "Santosh Dharma"));
        arrayList.add(new ThreeItemModel("Secretary General of UN\t", "Trigve Li"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("এশিয়ান শহর অলিম্পিকের হোস্ট", "টোকিও, জাপান, 1964"));
        arrayList.add(new ThreeItemModel("ড্রাগ ব্যবহারের জন্য অলিম্পিকে অ্যাথলিট অযোগ্য ঘোষণা করা হয়েছে", "হান্স-গুনার লিজেনওয়াল, মেক্সিকো অলিম্পিক, ১৯ 19৮"));
        arrayList.add(new ThreeItemModel("এভারেস্ট জয় করতে অন্ধ ব্যক্তি", "এরিক ওয়েহেনমায়ার, মার্কিন যুক্তরাষ্ট্র, ২০০১"));
        arrayList.add(new ThreeItemModel("আধুনিক অলিম্পিকের আয়োজক দেশ", "গ্রীস"));
        String str = "চীন";
        arrayList.add(new ThreeItemModel("কাগজের মুদ্রা জারি করার দেশ", str));
        arrayList.add(new ThreeItemModel("দেশটি রেডিও টেলিস্কোপ উপগ্রহকে মহাকাশে  চালু করবে", "জাপান"));
        arrayList.add(new ThreeItemModel("দেশ মহাকাশে উপগ্রহ উৎক্ষেপণ করবে", "রাশিয়া"));
        String str2 = "আমেরিকা";
        arrayList.add(new ThreeItemModel("সংবিধান গঠনের দেশ", str2));
        arrayList.add(new ThreeItemModel("শিক্ষা বাধ্যতামূলক করার দেশ", "প্রসিয়া"));
        arrayList.add(new ThreeItemModel("এনএএম সামিট আয়োজনের দেশ", "বেলগ্রেড"));
        arrayList.add(new ThreeItemModel("বই মুদ্রণের দেশ", str));
        arrayList.add(new ThreeItemModel("চাঁদে মানুষ পাঠানোর দেশ", str2));
        arrayList.add(new ThreeItemModel("সিভিল সার্ভিস প্রতিযোগিতা শুরু করার দেশ ", str));
        arrayList.add(new ThreeItemModel("বিশ্বকাপ ফুটবল জিততে দেশ", "উরুগুয়ে"));
        arrayList.add(new ThreeItemModel("ক্রিকেট ক্লাব", "ইংল্যান্ডের হাম্বলডনে ক্রিকেট ক্লাব প্রতিষ্ঠিত"));
        arrayList.add(new ThreeItemModel("ইউরোপীয় চীন সফরে যাবে", "মার্কো পোলো"));
        arrayList.add(new ThreeItemModel("ম্যান বক্সিং চ্যাম্পিয়ন", "টিম হাইয়ার, 1841"));
        arrayList.add(new ThreeItemModel("ম্যান দাবা চ্যাম্পিয়ন  ", "উইলহেলম স্টেইনিতস, 1886"));
        arrayList.add(new ThreeItemModel("ম্যান হার্ট ট্রান্সপ্ল্যান্ট প্রাপক", "লুই ওয়াশকানস্কি, 1967"));
        arrayList.add(new ThreeItemModel("ম্যান হার্ট ট্রান্সপ্ল্যান্টটি  দ্বারা তৈরি হয়েছিল", "ডাঃ ক্রিশ্চান বার্নার্ড, ১৯6767"));
        arrayList.add(new ThreeItemModel("সেরা অভিনেতা Man  এর জন্য ম্যান অস্কার বিজয়ী" , "এমিল জ্যানিংস, 1928"));
        arrayList.add(new ThreeItemModel("ম্যান টু এম্ট এভারেস্ট", "তেনজিং নরগে এবং এডমন্ড হিলারি, 1953"));
        arrayList.add(new ThreeItemModel("এনসাইক্লোপিডিয়া সংকলন করতে मानिस", "Aspheosis"));
        arrayList.add(new ThreeItemModel("উত্তপ্ত বাতাসের বেলুনে প্রশান্ত মহাসাগর পেরিয়ে যাওয়ার মানুষ", "বেন আব্রুজ্জো এবং ডাবল agগল ভি'তে দল"));
        arrayList.add(new ThreeItemModel("পৃথিবীর মানচিত্র আঁকতে মানুষ", "অ্যানেক্সেম্যান্ডার"));
        arrayList.add(new ThreeItemModel("ম্যান টু ফ্লাই অ্যারোপ্লান", "রাইট ব্রাদার্স"));
        arrayList.add(new ThreeItemModel("আটলান্টিক জুড়ে একক নন স্টপ উড়ানোর মানুষ", "চার্লস লিন্ডবার্গ, 1927"));
        arrayList.add(new ThreeItemModel("ব্যালনে বিশ্বজুড়ে একক ননস্টপ উড়ে যাওয়ার মানুষ", "স্টিভ ফসেট, মার্কিন যুক্তরাষ্ট্র, ২০০২"));
        arrayList.add(new ThreeItemModel("মহাশূন্যে যাওয়ার লোক", "মেজর ইউরি গাগারিন"));
        arrayList.add(new ThreeItemModel("মানুষ দু'বার মাউন্ট এভারেস্টে উঠেছে", "নয়াং গম্বু"));
        arrayList.add(new ThreeItemModel("উত্তর মেরুতে পৌঁছানোর লোক", "রবার্ট পেরি"));
        arrayList.add(new ThreeItemModel("দক্ষিণ মেরুতে পৌঁছানোর লোক", "রোনাল্ড আমন্ডসেন"));
        arrayList.add(new ThreeItemModel("ম্যান টু দ্য ওয়ার্ল্ড ঘুরে", "ফার্ডিনান্দ ম্যাগেলান"));
        arrayList.add(new ThreeItemModel("একা বিশ্বজুড়ে যাত্রা করতে মানুষ", "জোশুয়া স্লোকাম"));
        arrayList.add(new ThreeItemModel("চাঁদে পা রাখার মানুষ", "নীল আর্মস্ট্রং"));
        arrayList.add(new ThreeItemModel("ইংলিশ চ্যানেল জুড়ে সাঁতার কাটা মানুষ", "ম্যাথু ওয়েব, 1875"));
        arrayList.add(new ThreeItemModel("মহাশূন্যে চলার মানুষ", "আলেক্সি আরখোভিচ লিওনোভ, 1965"));
        arrayList.add(new ThreeItemModel("মহাশূন্যে চলার মানুষ , আলেক্সি আরখোভিচ লিওনোভ, 1965 রসায়নে নোবেল পুরস্কার জিতবেন", "জেএইচ ভেনথফ"));
        arrayList.add(new ThreeItemModel("অর্থনীতিতে নোবেল পুরস্কার জিতেন", "রেঞ্জার ফিশ এবং জনগণ টিনবারজেন"));
        arrayList.add(new ThreeItemModel("সাহিত্যে নোবেল পুরস্কার জিতবেন", "রিনি এফএ এবং সিল্ট প্রধানম"));
        arrayList.add(new ThreeItemModel("মেডিসিনে নোবেল পুরষ্কার জিতবেন", "এই ওয়ান বহেরিং"));
        arrayList.add(new ThreeItemModel("শান্তিতে নোবেল পুরস্কার জিতবেন", "জিন এফ ডুনান্ট নাদ ফ্রেডেরিক পেরিরি"));
        arrayList.add(new ThreeItemModel("পদার্থবিজ্ঞানে নোবেল পুরস্কার জিতবেন", "ডব্লিউ কে রেন্টেনজ"));
        arrayList.add(new ThreeItemModel("ম্যান ট্যুর ডি ফ্রান্স জিতবেন", "মরিস গ্যারিন, 1903"));
        arrayList.add(new ThreeItemModel("স্পেসে ম্যান ট্যুরিস্ট", "ডেনিস টিটো"));
        arrayList.add(new ThreeItemModel("বিশ্বের সিনেমা", "জাজ সিঙ্গার, 1927"));
        arrayList.add(new ThreeItemModel("পার্কিনসন'স রোগটি প্রথম বর্ণিত হয়েছিল", "জেমস পার্কিনসন, ব্রিটিশ নিউরোলজিস্ট, 1817"));
        arrayList.add(new ThreeItemModel("স্থায়ী কৃত্রিম হৃদয়ের প্রাপক", "বার্নি ক্লার্ক, 1982"));
        arrayList.add(new ThreeItemModel("বিশ্বের ধর্ম", "সন্তোষ ধর্ম"));
        arrayList.add(new ThreeItemModel("জাতিসংঘের সেক্রেটারি জেনারেল ", "ট্রিগভে লি"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("एशियाई शहर ओलंपिक की मेजबानी करने के लिए", "टोक्यो, जापान, 1964"));
        arrayList.add(new ThreeItemModel("एथलीट ने नशीली दवाओं के उपयोग के लिए ओलंपिक में अयोग्य ठहराया", "हंस-गुनार लिजेनवाल, मेक्सिको ओलंपिक, 1962"));
        arrayList.add(new ThreeItemModel("ब्लाइंड व्यक्ति एवरेस्ट फतह करने के लिए", "एरिक वेहेंमेयर, यूएसए, 2001"));
        arrayList.add(new ThreeItemModel("आधुनिक ओलंपिक की मेजबानी करने वाला देश", "ग्रीस"));
        String str ="चीन";
        arrayList.add(new ThreeItemModel("कागजी मुद्रा जारी करने का देश", str));
        arrayList.add(new ThreeItemModel("देश ने रेडियो टेलीस्कोप सैटेलाइट को स्पेस   में लॉन्च किया", "जापान"));
        arrayList.add(new ThreeItemModel("अंतरिक्ष में उपग्रह प्रक्षेपित करने वाला देश", "रूस"));
        String str2 = "अमेरीका";
        arrayList.add(new ThreeItemModel("संविधान बनाने के लिए देश  ", str2));
        arrayList.add(new ThreeItemModel("शिक्षा अनिवार्य करने के लिए देश", "प्रशिया"));
        arrayList.add(new ThreeItemModel("NAM समिट आयोजित करने का देश  ", "बेलग्रेड"));
        arrayList.add(new ThreeItemModel("कंट्री टू प्रिंट बुक्स  ", str));
        arrayList.add(new ThreeItemModel("चंद्रमा पर मानव भेजने के लिए देश  ", str2));
        arrayList.add(new ThreeItemModel("सिविल सेवा प्रतियोगिता शुरू करने के लिए देश", str));
        arrayList.add(new ThreeItemModel("विश्व कप फुटबॉल जीतने के लिए देश", "उरुग्वे"));
        arrayList.add(new ThreeItemModel("क्रिकेट क्लब  ", "हैम्बल्डन, इंग्लैंड में स्थापित क्रिकेट क्लब"));
        arrayList.add(new ThreeItemModel("चीन का दौरा करने के लिए यूरोपीय", "मार्को पोलो"));
        arrayList.add(new ThreeItemModel("मैन बॉक्सिंग चैंपियन  ", "टिम हायर, 1841"));
        arrayList.add(new ThreeItemModel("मैन चेस चैंपियन  ", "विल्हेम स्टीनिट्ज़, 1886"));
        arrayList.add(new ThreeItemModel("मैन हार्ट ट्रांसप्लांट प्राप्तकर्ता  ", "लुई वाशकेन्स्की, 1967"));
        arrayList.add(new ThreeItemModel("मैन हार्ट ट्रांसप्लांट", "डॉ। क्रिश्चियन बार्नार्ड, 1967 द्वारा बनाया गया था"));
        arrayList.add(new ThreeItemModel("सर्वश्रेष्ठ अभिनेता के लिए मैन ऑस्कर विजेता", "एमिल जेनिंग्स, 1928"));
        arrayList.add(new ThreeItemModel("मैन माउंट एवरेस्ट पर चढ़ने के लिए", "तेनजिंग नोर्गे और एडमंड हिलेरी, 1953"));
        arrayList.add(new ThreeItemModel("मैन इनसाइक्लोपीडिया   संकलित करने के लिए", "एस्पाहोसिस"));
        arrayList.add(new ThreeItemModel("मैन हॉट एयर बैलून   में प्रशांत महासागर को पार करने के लिए", "डबल अब्रू वी में बेन अब्रूज़ो और टीम"));
        arrayList.add(new ThreeItemModel("मनुष्य को पृथ्वी के मानचित्र को आकर्षित करने के लिए", "एनेक्समेन्डर"));
        arrayList.add(new ThreeItemModel("मैन टु एअर ए फ्लाप्लान  ", "राइट ब्रदर्स"));
        arrayList.add(new ThreeItemModel("मैन ऑफ़ द सोलो नॉन स्टॉप फ़ॉर द अटलांटिक", "चार्ल्स लिंडबर्ग, 1927"));
        arrayList.add(new ThreeItemModel("मैन बैलून में दुनिया भर में एकल नॉनस्टॉप उड़ान भरने के लिए", "स्टीव फॉसेट, यू.एस., 2002"));
        arrayList.add(new ThreeItemModel("अंतरिक्ष में जाने के लिए आदमी", "मेजर यूरी गगारिन"));
        arrayList.add(new ThreeItemModel("मैन ने माउंट एवरेस्ट पर दो बार चढ़ाई की", "नवांग गोम्बू"));
        arrayList.add(new ThreeItemModel("उत्तरी ध्रुव पर पहुंचने के लिए आदमी", "रॉबर्ट पीयर"));
        arrayList.add(new ThreeItemModel("मैन टू साउथ पोल", "रोनाल्ड अमुंडसेन"));
        arrayList.add(new ThreeItemModel("दुनिया भर में पालने के लिए आदमी", "फर्डिनेंड मैगलन"));
        arrayList.add(new ThreeItemModel("दुनिया भर में अकेले पालने के लिए आदमी", "जोशुआ स्लोकम"));
        arrayList.add(new ThreeItemModel("चंद्रमा पर पैर रखने के लिए मनुष्य", "नील आर्मस्ट्रांग"));
        arrayList.add(new ThreeItemModel("मैन इन द इंग्लिश चैनल"," मैथ्यू वेब, 1875"));
        arrayList.add(new ThreeItemModel("मैन इन स्पेस टू वॉक", "अलेक्सी अरखोविच लियोनोव, 1965"));
        arrayList.add(new ThreeItemModel("मैन को केमिस्ट्री में नोबेल पुरस्कार जीतने के लिए", "JH Wenthoff"));
        arrayList.add(new ThreeItemModel("मैन इन नोबेल पुरस्कार जीतने के लिए", "रेंजर मछली और जॉन टिनबर्गेन"));
        arrayList.add(new ThreeItemModel("मैन इन नोबेल पुरस्कार साहित्य में जीतने के लिए", "रेने एफए और सिल्ट प्रधान"));
        arrayList.add(new ThreeItemModel("मेडिसिन में नोबेल पुरस्कार जीतने के लिए आदमी", "एई वॉन बेह्रिंग"));
        arrayList.add(new ThreeItemModel("मैन इन नोबेल पुरस्कार जीतने के लिए", "जिन एफ डुनेंट नाद फ्रेडरिक पेरी"));
        arrayList.add(new ThreeItemModel("मैन इन फिजिक्स का नोबेल पुरस्कार जीतने के लिए", "WK Roentgen"));
        arrayList.add(new ThreeItemModel("मैन टु टूर डी फ्रांस", "मौरिस गारिन, 1903"));
        arrayList.add(new ThreeItemModel("मैन टूरिस्ट इन स्पेस", "डेनिस टीटो"));
        arrayList.add(new ThreeItemModel("मूवी इन द वर्ल्ड", "द जैज़ सिंगर, 1927"));
        arrayList.add(new ThreeItemModel("पार्किंसंस रोग का पहली बार वर्णन किया गया था", "जेम्स पार्किंसंस, ब्रिटिश न्यूरोलॉजिस्ट, 1817"));
        arrayList.add(new ThreeItemModel("एक स्थायी कृत्रिम हृदय का प्राप्तकर्ता", "बार्नी क्लार्क, 1982"));
        arrayList.add(new ThreeItemModel("दुनिया का धर्म", "संतोष धर्म"));
        arrayList.add(new ThreeItemModel("यूएन टी के महासचिव", "त्रिग्वे ली"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("ایشین شہر اولمپکس کی میزبانی کرے گا" , "ٹوکیو ، جاپان ، 1964"));
        arrayList.add(new ThreeItemModel("اولمپکس میں منشیات کے استعمال کے لئے ایتھلیٹ کو نااہل قرار دیا گیا" , "ہنس گنار لجن وال ، میکسیکو اولمپکس ، 1968"));
        arrayList.add(new ThreeItemModel("ایورسٹ کو فتح کرنے کے لئے نابینا شخص" , "ایرک ویہن مایر ، USA ، 2001"));
        arrayList.add(new ThreeItemModel("جدید اولمپکس کی میزبانی کرنے والا ملک" , "یونان"));
        String str = "چین";
        arrayList.add(new ThreeItemModel("کاغذی کرنسی جاری کرنے والا ملک", str));
        arrayList.add(new ThreeItemModel("ملک ریڈیو ٹیلی سکوپ سیٹلائٹ کو خلا میں بھیجے گا ،" ,"جاپان "));
        arrayList.add(new ThreeItemModel("ملک مصنوعی سیارہ خلا میں بھیجے گا" , "روس"));
        String str2 = "USA";
        arrayList.add(new ThreeItemModel("آئین بنانے والا ملک", str2));
        arrayList.add(new ThreeItemModel("تعلیم لازمی بنانے والا ملک" , "پرشیا"));
        arrayList.add(new ThreeItemModel("ملک برائے نام سربراہی اجلاس" , "بلغراد"));
        arrayList.add(new ThreeItemModel("کتب پرنٹ کرنے کا ملک", str));
        arrayList.add(new ThreeItemModel("چاند پر انسان بھیجنے والا ملک", str2));
        arrayList.add(new ThreeItemModel("سول سروس مقابلہ شروع کرنے والا ملک", str));
        arrayList.add(new ThreeItemModel("ورلڈ کپ فٹ بال جیتنے والا ملک", "یوراگوئے"));
        arrayList.add(new ThreeItemModel("کرکٹ کلب" ,"کرکٹ کلب کا آغاز انگلینڈ کے ہیمبلڈن میں ہوا"));
        arrayList.add(new ThreeItemModel("چین کا دورہ کرنے کے لئے یورپی" , "مارکو پولو"));
        arrayList.add(new ThreeItemModel("مین باکسنگ چیمپیئن" , "ٹم ہائیر ، 1841"));
        arrayList.add(new ThreeItemModel("مین شطرنج چیمپیئن" , "ولہیم اسٹینز ، 1886"));
        arrayList.add(new ThreeItemModel("مین ہارٹ ٹرانسپلانٹ وصول کنندہ" , "لوئس واشکانکی ، 1967"));
        arrayList.add(new ThreeItemModel("مین ہارٹ ٹرانسپلانٹ کی تشکیل ہر ایک نے کی تھی" , "ڈاکٹر کرسچن برنارڈ ، 1967"));
        arrayList.add(new ThreeItemModel("بہترین اداکار کے لئے مین آسکر ایوارڈ" , "ایمل جننگز ، 1928"));
        arrayList.add(new ThreeItemModel("مین ٹور ماؤنٹ ایورسٹ" , "تنزنگ نورگے اور ایڈمنڈ ہلیری ، 1953"));
        arrayList.add(new ThreeItemModel("انسائیکلوپیڈیا مرتب کرنے والا انسان" , "Aspheosis"));
        arrayList.add(new ThreeItemModel("گرم ہوا کے غبارے میں بحر الکاہل کو عبور کرنے والا انسان" , "ڈبل ایگل پن میں بین ابروزو اور ٹیم"));
        arrayList.add(new ThreeItemModel("زمین کا نقشہ کھینچنے والا آدمی", "Anexemander"));
        arrayList.add(new ThreeItemModel("مین ٹو فلائٹ ائیروپلان" , "رائٹ برادرز"));
        arrayList.add(new ThreeItemModel("اٹلانٹک کے پار سولو نون اسٹاپ اڑانے والا انسان" ,"چارلس لنڈبرگ ، 1927"));
        arrayList.add(new ThreeItemModel("بیلن میں دنیا بھر میں سولو نان اسٹاپ اڑانے والا انسان" , "اسٹیو فوسیٹ ، امریکی ، 2002 ،"));
        arrayList.add(new ThreeItemModel("خلا میں جانے والا آدمی" , "میجر یوری گیگرین"));
        arrayList.add(new ThreeItemModel("انسان دو بار ماؤنٹ ایورسٹ پر چڑھ گیا" , "نوانگ گومبو"));
        arrayList.add(new ThreeItemModel("شمالی قطب تک پہنچنے والا آدمی" , "رابرٹ پیری"));
        arrayList.add(new ThreeItemModel("قطب جنوبی تک پہنچنے والا آدمی" , "رونالڈ امنڈسن"));
        arrayList.add(new ThreeItemModel("دنیا بھر میں سفر کرنے والا انسان" , "فرڈینینڈ میگیلن"));
        arrayList.add(new ThreeItemModel("انسان تنہا پوری دنیا میں سفر کرے گا" , "جوشوا سلوکم"));
        arrayList.add(new ThreeItemModel("انسان چاند پر قدم رکھے گا" , "نیل آرمسٹرانگ"));
        arrayList.add(new ThreeItemModel("انگلش چینل کے اس پار تیرنے والا آدمی" , "میتھیو ویب ، 1875"));
        arrayList.add(new ThreeItemModel("خلا میں چلنے والا انسان" , "الیکسی آرخوویچ لیونوف ، 1965"));
        arrayList.add(new ThreeItemModel("کیمسٹری میں نوبل انعام جیتنے والا آدمی" , "جے ایچ وینتھاف"));
        arrayList.add(new ThreeItemModel("معاشیات میں نوبل انعام جیتنے والا آدمی" , "رینجر فش اور جان ٹنبرجن"));
        arrayList.add(new ThreeItemModel("ادب میں نوبل انعام جیتنے والا آدمی" , "رینی ایف اے اور سائلٹ پردھوم"));
        arrayList.add(new ThreeItemModel("میڈیسن میں نوبل انعام جیتنے والا آدمی" , "AE Wonn Behring"));
        arrayList.add(new ThreeItemModel("امن میں نوبل انعام جیتنے والا آدمی" , "جن ایف ڈنانٹ ناد فریڈرک پیری"));
        arrayList.add(new ThreeItemModel("طبیعیات میں نوبل انعام جیتنے والا آدمی" , "ڈبلیو کے روینٹجن"));
        arrayList.add(new ThreeItemModel("ٹور ڈی فرانس جیتنے کے لئے آدمی" , "ماریس گارین ، 1903"));
        arrayList.add(new ThreeItemModel("اسپیس میں انسان سیاح" , "ڈینس ٹیتو"));
        arrayList.add(new ThreeItemModel("دنیا میں مووی" , "جاز گلوکار ، 1927"));
        arrayList.add(new ThreeItemModel("پارکنسن کا مرض پہلی بار بیان کیا تھا" , "جیمز پارکنسن ، برطانوی نیورولوجسٹ ، 1817"));
        arrayList.add(new ThreeItemModel("مستقل مصنوعی دل کا وصول کنندہ" , "بارنی کلارک ، 1982"));
        arrayList.add(new ThreeItemModel("دنیا کا مذہب" , "سنتوش دھرم"));
        arrayList.add(new ThreeItemModel("اقوام متحدہ کے سکریٹری جنرل" , "ٹریگوی لی"));


        return arrayList;
    }


}
