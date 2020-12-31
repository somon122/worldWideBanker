package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Sports {


    private Context context;
    public Q_Sports(Context context) {
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
        arrayList.add(new ThreeItemModel("National Sports of China is –", "Table Tennis"));
        arrayList.add(new ThreeItemModel("Canada Cup belongs to which sports –", "Golf"));
        arrayList.add(new ThreeItemModel("Westchester Cup belongs to – ", "Polo"));
        arrayList.add(new ThreeItemModel("Ghulam Ahmed Trophy belongs to which sports –", "Cricket"));
        arrayList.add(new ThreeItemModel(" How many players are there in one team of Water Polo –", "6 Players"));

        arrayList.add(new ThreeItemModel("Which country will host Cricket World Cup 2019 –", "England"));
        arrayList.add(new ThreeItemModel("Naidu cup belongs to which game –", "Chess"));
        arrayList.add(new ThreeItemModel("Hook pass terminology belongs to which sports –", "Basketball"));
        arrayList.add(new ThreeItemModel("The distance of a marathon run is –", "26 miles 385 yards"));
        arrayList.add(new ThreeItemModel("Hockey is the national sports of – ", "India and Pakistan"));
        arrayList.add(new ThreeItemModel("Eden Gardens cricket stadium as in –", "Calcutta"));
        arrayList.add(new ThreeItemModel("Number of players in one team of Kho Kho are –", "9 Players"));
        arrayList.add(new ThreeItemModel("Football was inducted as a competitive game in Olympics in year –", "1908"));
        arrayList.add(new ThreeItemModel("Somdev Devburman, who has recently announce retirement belongs to which game/sports – ", "Lawn Tennis"));
        arrayList.add(new ThreeItemModel("Who has won the first ever all Indian boys under 19 final at British Junior Open Squash Tournament", "Velavan Senthilkumar"));
        arrayList.add(new ThreeItemModel(" Magnus Carlsen, the distinguished chess player belongs to which country –", "Norway"));
        arrayList.add(new ThreeItemModel("Who has won Men’s Single Title of Qatar Open Tennis Championship 2017 – ", "Novak Djokovic from Siberia defeating Andy Murray"));
        arrayList.add(new ThreeItemModel("45 which Chinese E-Commerce firm has become top sponsor of Olympic Games through 2028 – ", "Alibaba group"));
        arrayList.add(new ThreeItemModel("Who has been named the world’s best player at the inaugural best FIFA football awards 2016 in Zurich Switzerland –", "Cristiano Ronald"));
        arrayList.add(new ThreeItemModel("Which football player has been voted as the best playmaker in the world for 2016 – ", "Lionel Messi"));

        arrayList.add(new ThreeItemModel("First Asian Games held in which nation –", "New Delhi 1951"));
        arrayList.add(new ThreeItemModel("Barcelona open was lifted by – ", "Rafael Nadal from Spain beating Dominic thiem Australia"));
        arrayList.add(new ThreeItemModel("Russian Grand Prix was recently won by –", "Valtteri Bottas"));
        arrayList.add(new ThreeItemModel("Which country won 26th edition of Sultan Azlan Shah Cup Hockey tournament – ", "Great Britain defeating Australia"));
        arrayList.add(new ThreeItemModel(" Indian players Chef Thapa belongs to which Sports –", "Boxing"));
        arrayList.add(new ThreeItemModel("Which player has recently made the record of highest wicket taker in women’s one-day international – ", "Jhulan Goswami; 181 wickets in 153 matches"));
        arrayList.add(new ThreeItemModel("World para-athletics Grand Prix recently conducted in which nation – ", "China"));
        arrayList.add(new ThreeItemModel("Which team won 7th Junior National Hockey championship 2017 women – ", "Hockey Him (Himachal) defeating hockey Mizoram"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("৪৫ টি যা চীনা ই-কমার্স সংস্থা ২০২৮ সালের মধ্যে অলিম্পিক গেমসের শীর্ষ স্পনসর হয়ে উঠেছে -", "আলিবাবা গ্রুপ"));
        arrayList.add(new ThreeItemModel("৪৫ টি যা চীনা ই-কমার্স সংস্থা ২০২৮ সালের মধ্যে অলিম্পিক গেমসের শীর্ষ স্পনসর হয়ে উঠেছে -", "আলিবাবা গ্রুপ"));
        arrayList.add(new ThreeItemModel("জুরিখ সুইজারল্যান্ডের উদ্বোধনী সেরা ফিফা ফুটবল অ্যাওয়ার্ডস ২০১ at-এ যিনি বিশ্বের সেরা খেলোয়াড় হিসাবে মনোনীত হয়েছেন -", "ক্রিশ্চিয়ানো রোনাল্ড"));
        arrayList.add(new ThreeItemModel("চীনের জাতীয় ক্রীড়া হ'ল -", "টেবিল টেনিস"));
        arrayList.add(new ThreeItemModel("চীনের জাতীয় ক্রীড়া হ'ল -", "টেবিল টেনিস"));
        arrayList.add(new ThreeItemModel("ওয়েস্টচেস্টার কাপটি অন্তর্ভুক্ত -", "পোলো"));
        arrayList.add(new ThreeItemModel("কোন দেশ ক্রিকেট বিশ্বকাপ 2019 আয়োজন করবে -", "ইংল্যান্ড"));
        arrayList.add(new ThreeItemModel("কোন দেশ ক্রিকেট বিশ্বকাপ 2019 আয়োজন করবে -", "ইংল্যান্ড"));
        arrayList.add(new ThreeItemModel("হুক পাসের পরিভাষাটি কোন খেলাধুলার সাথে সম্পর্কিত -", "বাস্কেটবল"));
        arrayList.add(new ThreeItemModel("ম্যারাথন রানের দূরত্বটি -", "26 মাইল 385 গজ"));
        arrayList.add(new ThreeItemModel("ম্যারাথন রানের দূরত্বটি -", "26 মাইল 385 গজ"));
        arrayList.add(new ThreeItemModel("ইডেন গার্ডেনস ক্রিকেট স্টেডিয়াম যেমন রয়েছে -", "কলকাতা"));
        arrayList.add(new ThreeItemModel("খো খোয়ের একটি দলে খেলোয়াড়ের সংখ্যা হ'ল -", "৯ জন খেলোয়াড়"));
        arrayList.add(new ThreeItemModel("খো খোয়ের একটি দলে খেলোয়াড়ের সংখ্যা হ'ল -", "৯ জন খেলোয়াড়"));
        arrayList.add(new ThreeItemModel("সোমদেব দেববর্মান, যিনি সম্প্রতি অবসর ঘোষণা করেছেন তিনি কোন খেলা / খেলাধুলার অন্তর্ভুক্ত -", "লন টেনিস"));
        arrayList.add(new ThreeItemModel("ব্রিটিশ জুনিয়র ওপেন স্কোয়াশ টুর্নামেন্টে ১৯ টি ফাইনালের আওতায় প্রথম ভারতীয় ছেলেদের মধ্যে কে জিতল", "ভেলভান সেন্টিলকুমার"));
        arrayList.add(new ThreeItemModel("ব্রিটিশ জুনিয়র ওপেন স্কোয়াশ টুর্নামেন্টে ১৯ টি ফাইনালের আওতায় প্রথম ভারতীয় ছেলেদের মধ্যে কে জিতল", "ভেলভান সেন্টিলকুমার"));
        arrayList.add(new ThreeItemModel("কাতার ওপেন টেনিস চ্যাম্পিয়নশিপ 2017 এর পুরুষদের একক খেতাব কে জিতেছে -", "সাইবেরিয়া থেকে নভাক জোকোভিচ অ্যান্ডি মারেকে হারিয়ে"));


        arrayList.add(new ThreeItemModel("গোলাম আহমেদ ট্রফি কোন খেলা সম্পর্কিত -", "ক্রিকেট"));
        arrayList.add(new ThreeItemModel("ওয়াটার পোলো-র একটি দলে কত খেলোয়াড় রয়েছে -", "6 জন খেলোয়াড়"));
        arrayList.add(new ThreeItemModel("প্রথম এশিয়ান গেমসটি কোন দেশে অনুষ্ঠিত হয়েছিল -", "নয়াদিল্লি 1951"));
        arrayList.add(new ThreeItemModel("প্রথম এশিয়ান গেমসটি কোন দেশে অনুষ্ঠিত হয়েছিল -", "নয়াদিল্লি 1951"));
        arrayList.add(new ThreeItemModel("বার্সেলোনা ওপেন তুলে নিয়েছিল -", "স্পেনের রাফায়েল নাদাল ডোমিনিক থিয়েমে অস্ট্রেলিয়াকে হারিয়ে"));
        arrayList.add(new ThreeItemModel("কোন দেশ সুলতান আজলান শাহ কাপ হকি টুর্নামেন্টের 26 তম সংস্করণ জিতেছে -", "গ্রেট ব্রিটেন অস্ট্রেলিয়াকে পরাজিত করেছে"));
        arrayList.add(new ThreeItemModel("ভারতীয় খেলোয়াড় শেফ থাপা কোন খেলাধুলার -", "বক্সিং"));
        arrayList.add(new ThreeItemModel("কোন খেলোয়াড়ই সম্প্রতি মহিলাদের ওয়ানডেতে সর্বোচ্চ উইকেট শিকারির রেকর্ড তৈরি করেছেন -", "ঝুলন গোস্বামী; 153 ম্যাচে 181 উইকেট"));
        arrayList.add(new ThreeItemModel("ওয়ার্ল্ড প্যারা-অ্যাথলেটিক্স গ্র্যান্ড প্রিক সম্প্রতি কোন দেশে পরিচালিত হয়েছে -", "চীন"));
        arrayList.add(new ThreeItemModel("কোন দলটি 7th ম জুনিয়র জাতীয় হকি চ্যাম্পিয়নশিপ 2017 মহিলা জিতেছে -", "হকি হিম (হিমাচল) হকি মিজোরামকে হারিয়ে"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("कौन सा देश क्रिकेट विश्व कप 2019 की मेजबानी करेगा -", "इंग्लैंड"));
        arrayList.add(new ThreeItemModel("नायडू कप किस खेल से संबंधित है -", "शतरंज"));
        arrayList.add(new ThreeItemModel("हुक पास शब्दावली किस खेल की है -", "बास्केटबॉल"));
        arrayList.add(new ThreeItemModel("मैराथन दौड़ की दूरी है -", "26 मील 385 गज"));
        arrayList.add(new ThreeItemModel("हॉकी का राष्ट्रीय खेल है -", "भारत और पाकिस्तान"));
        arrayList.add(new ThreeItemModel("ईडन गार्डन्स क्रिकेट स्टेडियम -", "कलकत्ता"));
        arrayList.add(new ThreeItemModel("खो खो की एक टीम में खिलाड़ियों की संख्या -", "9 खिलाड़ी"));
        arrayList.add(new ThreeItemModel("फुटबॉल को वर्ष में ओलंपिक में प्रतिस्पर्धी खेल के रूप में शामिल किया गया था -", "1908"));
        arrayList.add(new ThreeItemModel("सोमदेव देवबर्मन, जिनकी हाल ही में सेवानिवृत्ति की घोषणा हुई है, वे किस खेल / खेल से संबंधित हैं", "लॉन टेनिस"));
        arrayList.add(new ThreeItemModel("जिन्होंने ब्रिटिश जूनियर ओपन स्क्वैश टूर्नामेंट में 19 फाइनल के तहत पहली बार सभी भारतीय लड़कों को जीता है"," वेलवन सेंथिलुमार "));
        arrayList.add(new ThreeItemModel("मैग्नस कार्लसन, प्रतिष्ठित शतरंज खिलाड़ी किस देश के हैं -", "नॉर्वे"));
        arrayList.add(new ThreeItemModel("साइबेरिया के नोवाक जोकोविच ने एंडी मरे को हराया", "किसने कतर ओपन टेनिस चैंपियनशिप 2017 का पुरुष एकल खिताब जीता"));
        arrayList.add(new ThreeItemModel("45 जो चीनी ई-कॉमर्स फर्म 2028 के माध्यम से ओलंपिक खेलों के शीर्ष प्रायोजक बन गए हैं -", "अलीबाबा समूह"));
        arrayList.add(new ThreeItemModel("ज्यूरिख स्विट्जरलैंड में उद्घाटन फीफा फुटबॉल अवार्ड्स 2016 में विश्व के सर्वश्रेष्ठ खिलाड़ी का नाम किसने रखा है -", "क्रिस्टियानो रोनाल्ड"));
        arrayList.add(new ThreeItemModel( "किस फुटबॉल खिलाड़ी को 2016 के लिए दुनिया में सर्वश्रेष्ठ नाटककार के रूप में वोट दिया गया है - "," लियोनेल मेस्सी "));
        arrayList.add(new ThreeItemModel("चीन का राष्ट्रीय खेल है -", "टेबल टेनिस"));
        arrayList.add(new ThreeItemModel("कनाडा कप किस खेल से संबंधित है -", "गोल्फ"));
        arrayList.add(new ThreeItemModel("वेस्टचेस्टर कप का संबंध है -", "पोलो"));
        arrayList.add(new ThreeItemModel("गुलाम अहमद ट्रॉफी किस खेल से संबंधित है -", "क्रिकेट"));
        arrayList.add(new ThreeItemModel("वाटर पोलो की एक टीम में कितने खिलाड़ी हैं -", "6 खिलाड़ी"));
        arrayList.add(new ThreeItemModel("प्रथम एशियाई खेल किस राष्ट्र में आयोजित हुए -", "नई दिल्ली 1951"));
        arrayList.add(new ThreeItemModel("बार्सिलोना ओपन द्वारा उठाया गया -", "स्पेन से राफेल नडाल ने डोमिनिक थिएम ऑस्ट्रेलिया को हराया"));
        arrayList.add(new ThreeItemModel("रूसी ग्रां प्री हाल ही में जीता गया था -", "वाल्टेरी बोटास"));
        arrayList.add(new ThreeItemModel("किस देश ने सुल्तान अजलान शाह कप हॉकी टूर्नामेंट का 26 वां संस्करण जीता -", "ग्रेट ब्रिटेन ने ऑस्ट्रेलिया को हराया"));
        arrayList.add(new ThreeItemModel("भारतीय खिलाड़ी शेफ थापा का संबंध किस खेल से है -", "बॉक्सिंग"));
        arrayList.add(new ThreeItemModel("किस खिलाड़ी ने हाल ही में महिलाओं के एक दिवसीय अंतरराष्ट्रीय मैचों में सर्वाधिक विकेट लेने का रिकॉर्ड बनाया है", "झूलन गोस्वामी, 153 मैचों में 181 विकेट"));
        arrayList.add(new ThreeItemModel("विश्व पैरा-एथलेटिक्स ग्रां प्री हाल ही में किस राष्ट्र में आयोजित किया गया है -", "चीन"));
        arrayList.add(new ThreeItemModel("किस टीम ने 7 वीं जूनियर नेशनल हॉकी चैंपियनशिप 2017 की महिलाएँ जीतीं -", "हॉकी हिमाचल (हिमाचल) ने हॉकी खिलाड़ी को हराया।") );

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("کون سا ملک کرکٹ ورلڈ کپ 2019 کی میزبانی کرے گا -" , "انگلینڈ"));
        arrayList.add(new ThreeItemModel("نائیڈو کپ کا تعلق کس کھیل سے ہے -" , "شطرنج"));
        arrayList.add(new ThreeItemModel("ہک پاس اصطلاحات کا تعلق کس کھیل سے ہے -" , "باسکٹ بال"));
        arrayList.add(new ThreeItemModel("میراتھن رن کا فاصلہ ہے -", "26 میل 385 گز"));
        arrayList.add(new ThreeItemModel("ایڈن گارڈنز کرکٹ اسٹیڈیم جیسے -" ,"  کلکتہ   ہندوستان اور پاکستان" ));
        arrayList.add(new ThreeItemModel("ایڈن گارڈنز کرکٹ اسٹیڈیم جیسے -", "کلکتہ"));
        arrayList.add(new ThreeItemModel("کھو کھو کی ایک ٹیم میں کھلاڑیوں کی تعداد ہیں۔", "9 کھلاڑی"));
        arrayList.add(new ThreeItemModel("فٹ بال کو اولمپکس میں ایک مسابقتی کھیل کے طور پر شامل کیا گیا -" , "1908"));
        arrayList.add(new ThreeItemModel("سوم دیو دیوبرمن ، جنہوں نے حال ہی میں ریٹائرمنٹ کا اعلان کیا ہے وہ کس کھیل / کھیل سے تعلق رکھتے ہیں۔" , "لان ٹینس"));
        arrayList.add(new ThreeItemModel("برٹش جونیئر اوپن اسکواش ٹورنامنٹ میں 19 فائنل کے تحت پہلے ہندوستانی لڑکوں میں سے کون جیتا ہے؟" , "ویلاون سینتھل کمار"));
        arrayList.add(new ThreeItemModel("میگنس کارلسن ، ممتاز شطرنج کا کھلاڑی کس ملک سے تعلق رکھتا ہے۔" , "ناروے"));
        arrayList.add(new ThreeItemModel("کس نے قطر اوپن ٹینس چیمپئن شپ 2017 کا مینز سنگل ٹائٹل جیتا ہے۔" , "سائبیریا کے نوواک جوکووچ نے اینڈی مرے کو شکست دے کر"));
        arrayList.add(new ThreeItemModel("45 جو چینی ای کامرس فرم 2028 کے ذریعے اولمپک کھیلوں کی اعلی کفیل بن گئی ہے ،" , "علی بابا گروپ"));
        arrayList.add(new ThreeItemModel("زیورک سوئٹزرلینڈ میں ہونے والے افتتاحی بہترین فیفا فٹ بال ایوارڈز 2016 میں جسے دنیا کا بہترین کھلاڑی قرار دیا گیا ہے۔" , "کرسٹیانو رونالڈ"));
        arrayList.add(new ThreeItemModel("فٹ بال کے کس کھلاڑی کو 2016 کے لئے دنیا کے بہترین پلے میکر کے طور پر ووٹ دیا گیا ہے؟" , "لیونل میسی"));
        arrayList.add(new ThreeItemModel("چین کا قومی کھیل ہے -" , "ٹیبل ٹینس"));
        arrayList.add(new ThreeItemModel("کینیڈا کپ کا تعلق کس کھیل سے ہے -" , "گالف"));
        arrayList.add(new ThreeItemModel("ویسٹ چیسٹر کپ کا تعلق ہے -" , "پولو"));
        arrayList.add(new ThreeItemModel("غلام احمد ٹرافی کا تعلق کس کھیل سے ہے -" , "کرکٹ"));
        arrayList.add(new ThreeItemModel("واٹر پولو کی ایک ٹیم میں کتنے کھلاڑی ہیں -", "6 کھلاڑی"));
        arrayList.add(new ThreeItemModel("پہلی ایشین گیمز کا انعقاد کس قوم میں ہوا -" , "نئی دہلی 1951"));
        arrayList.add(new ThreeItemModel("بارسلونا کھلا کھلا -" , "اسپین سے تعلق رکھنے والے رافیل نڈال نے ڈومینک تھیم آسٹریلیا کو شکست دی" ));
        arrayList.add(new ThreeItemModel("روسی گراں پری کو حال ہی میں جیتا گیا تھا -" , "والٹری بوٹاس"));
        arrayList.add(new ThreeItemModel("کس ملک نے سلطان اذلان شاہ کپ ہاکی ٹورنامنٹ کا 26 واں ایڈیشن جیتا -" , "برطانیہ نے آسٹریلیا کو شکست دی"));
        arrayList.add(new ThreeItemModel("ہندوستانی کھلاڑی شیف تھاپا کا تعلق کس کھیل سے ہے -" , "باکسنگ"));
        arrayList.add(new ThreeItemModel("حال ہی میں کس کھلاڑی نے خواتین کے ایک روزہ بین الاقوامی میچ میں سب سے زیادہ وکٹ حاصل کرنے کا ریکارڈ بنایا ہے -" , "جھلن گوسوامی 15 153 میچوں میں 181 وکٹیں"));
        arrayList.add(new ThreeItemModel("ورلڈ پیرا-ایتھلیٹکس گراں پری نے حال ہی میں کس ملک میں کیا -" , "چین"));
        arrayList.add(new ThreeItemModel("کون سی ٹیم نے 7 جونیئر نیشنل ہاکی چیمپئن شپ 2017 خواتین جیتا -" , "ہاکی ہیم (ہماچل) نے ہاکی میزورم کو شکست دی"));

        return arrayList;
    }



}
