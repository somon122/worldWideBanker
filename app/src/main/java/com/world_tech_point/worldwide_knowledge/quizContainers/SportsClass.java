package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class SportsClass {

    private Context context;
    public SportsClass(Context context) {
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

        arrayList.add(new ContentQuestionModel("Ben Stokes is associated with the game of -","Badminton","Football","Hockey","Cricket","Cricket"));
        arrayList.add(new ContentQuestionModel("The Subroto Game is associated with the game of -","Hockey","Football","Cricket","Tennis","Football"));
        arrayList.add(new ContentQuestionModel("Salwa Eid Nasser has won the gold medal in the 400 m women's race for 2019 IAAF World Athletics Championships. She is from which country?","Kenya","Kuwait","Peru","Bahrain","Bahrain"));
        arrayList.add(new ContentQuestionModel("IAAF World Athletics Championships 2019 was held at which place?","Ulan Ude, Russia","Doha, Qatar","Seoul, South Korea","Riyadh, UAE","Doha, Qatar"));
        arrayList.add(new ContentQuestionModel("Sarah Taylor is a womn cricketer. She plays for which of the following countries?","Australia","New Zealand","South Africa","England","England"));
        arrayList.add(new ContentQuestionModel("Who is the second fastest batsman to score 25 centuries in the test format after Sir Don Bradman?","Virat Kohli","Mahela Jayawardene","Kane Williamson","Steve Smith","Steve Smith"));
        arrayList.add(new ContentQuestionModel("The world's largest cricket stadium situated at -","Kolkata","Manchester","Melbourne","Motera","Motera"));
        arrayList.add(new ContentQuestionModel(" Which of the following club has won the FIFA Club World Cup,2019?","Barcelona","Real Madrid","Juventas","Liverpool","Liverpool"));
        arrayList.add(new ContentQuestionModel("Where was India's first Day-Night Test organised?","Delhi","Kolkata","Mumbai","Chennai","Kolkata"));
        arrayList.add(new ContentQuestionModel("Which country hosted the the 13th South Asian Games 2019?","Bangladesh","Nepal","Bhutan","India","Nepal"));
        arrayList.add(new ContentQuestionModel("How many players are there in a team of Volleyball?","5","6","7","8","6"));
        arrayList.add(new ContentQuestionModel("Deodhar Trophy is a prestigious tournament of -","Football","Cricket","Hockey","Badminton","Cricket"));
        arrayList.add(new ContentQuestionModel("Which team emerge champion of the FIFA under-17 Football World Cup, 2019?","Argentina","Germany","Brazil","Spain","Brazil"));
        arrayList.add(new ContentQuestionModel("FIH Men's Hockey World Cup, 2023 will be hosted in India in -","Kolkata","Jalandhar","Chandigarh","Bhubaneswar and Rourkela","Bhubaneswar and Rourkela"));
        arrayList.add(new ContentQuestionModel("Beighton Cup is the prestigious championship of the game of -","Cricket","Basket Ball","Hockey","Football","Hockey"));
        arrayList.add(new ContentQuestionModel("Barabati Stadium is located in -","Cuttack","Ranchi","Bhubaneshwar","Patna","Cuttack"));

        arrayList.add(new ContentQuestionModel("Who amon the following Cricketer has been chosen for ICC ODI Cricketer of the Year for 2019 -","Virat Kohli","Ben Stokes","Rohit Sharma","Deepak Chahar","Rohit Sharma"));
        arrayList.add(new ContentQuestionModel("Who amon the following Cricketer has been chosen for ICC Best Cricketer of the Year 2019 -","Rohit Sharma (India)","Ben Stokes (England)","Pat Cummins (Australia)","Virat Kohli (India)","Ben Stokes (England)"));
        arrayList.add(new ContentQuestionModel("Who became the first World Badminton Champion from India?","Saina Newal","P V Sindhu","Sania Mirza","K Srikant","P V Sindhu"));
        arrayList.add(new ContentQuestionModel("Who is the first Indian woman to win an individual Olympic medal?","Karnam Malleshwari","Sania Mirza","P V Sindhu","Saina Newal","Karnam Malleshwari"));
        arrayList.add(new ContentQuestionModel("Ace Against Odds is the autobiography of -"," P T Usha","Sania Mirza","Hima Das","Marry Kom","Sania Mirza"));
        arrayList.add(new ContentQuestionModel("Fed Ex Cup and Augusta Masters are coveted trophies of the game of -","Squash","Golf","Billiards","Hockey","Golf"));
        arrayList.add(new ContentQuestionModel("Which team emerged Champion of the Vijay Hazare Trophy, 2019?","Tamil Nadu","Karnataka","Maharashtra","Delhi","Karnataka"));
        arrayList.add(new ContentQuestionModel("Where was the 17th IAAF World Athletics Championship, 2019 organised?","Dubai, Saudi Arabia","Alhasa, Saudi Arabia","Doha, Qatar","Tokyo, Japan","Doha, Qatar"));
        arrayList.add(new ContentQuestionModel("Who won the silver medal in badmintion in the Asian Games, 2018?","Taipeis Tai Tzuying","Saina Nehwal","Syed Modi","P. V. Sindhu","P. V. Sindhu"));
        arrayList.add(new ContentQuestionModel("Which Indian batsman was the first to hit six consecutive sixes in first-class cricket?","Ravi Shastri","Sunil Gavaskar","Virat Kohli","Sachin Tendulkar","Ravi Shastri"));
        arrayList.add(new ContentQuestionModel("The term Dolphin Kick is associated with which sport?","Football","Rugby","Swimming","Cricket","Swimming"));
        arrayList.add(new ContentQuestionModel("Which Indian badminton player was runner-up at the 2019 Swiss Open tournament?","Kidambi Srikanth","Chetan Anand","Sai Praneeth","Parupalli Kashyap","Sai Praneeth"));
        arrayList.add(new ContentQuestionModel("'Triples' is a new format of -","Boxing","Judo","Chess","Badminton","Badminton"));
        arrayList.add(new ContentQuestionModel("Who among the following won the Italian Open Women's Tennis Singles Title 2019?","Karolina Pliskova","Johanna Konta","Naomi Osaka","Serena Williams","Karolina Pliskova"));
        arrayList.add(new ContentQuestionModel("The National Dope Testing Laboratory functions under -","Ministry of Health and Family Welfare","Ministry of Science and Technology","Ministry of Youth Affairs and Sports"," Ministry of Home Affairs","Ministry of Youth Affairs and Sports"));

        arrayList.add(new ContentQuestionModel("Naomi Osaka and Simona Halep are eminent sports women associated with the game of -","Badminton","Lawn Tennis","Table Tennis","Women Cricket","Lawn Tennis"));
        arrayList.add(new ContentQuestionModel("Which country hosted the 13th South Asian Games, 2019?","Bangladesh","Nepal","India","Bhutan","Nepal"));
        arrayList.add(new ContentQuestionModel("Ballon d'Or honour is associated with the game of -","Basket Ball","Football","Polo","Tennis","Football"));
        arrayList.add(new ContentQuestionModel("The Frank Worrell Trophy is a test-match (cricket) series played between Australia and -","West Indies","South Africa","New Zealand","England","West Indies"));
        arrayList.add(new ContentQuestionModel("Who amongst the following has become the first in women cricket, to have 20 years of international cricket experience?","Smriti Mandhana","Ekta Bisht","Mithali Raj","Veda Krishnamurthy","Mithali Raj"));
        arrayList.add(new ContentQuestionModel("Ekaterina Paltceva and Manju Rani both are associated with the sport of -","Badminton","Basketball","Baseball","Boxing","Boxing"));
        arrayList.add(new ContentQuestionModel("The Green Park Stadium, which hosted the 500th International test cricket match played by India in 2016, is situated in the Indian city of -","Kanpur","Indore","Gwalior","Rajkot","Kanpur"));
        arrayList.add(new ContentQuestionModel("The Asian Amateur Boxing Championships' 2019 was held in -","Delhi, India","Moscow, Russia","Bangkok, Thailand"," Nur-Sultan, Kazakhstan","Bangkok, Thailand"));
        arrayList.add(new ContentQuestionModel("The headquarters of The International Olympic Committee is situated in -","Vienna, Austria","Lausanne, Switzerland","Geneva, Switzerland","Madrid, Spain","Lausanne, Switzerland"));
        arrayList.add(new ContentQuestionModel("Former Olympic Champion, 28 year old Li Xuerul who announced (in October 2019) her retirement, was associated with -","Baseball","Boxing","Softball","Badminton","Badminton"));


        arrayList.add(new ContentQuestionModel("Who among the following won the gold medal in 10,000 meters race in Asian Athletics Championship, 2017?","Govindan Lakshmanan","Adilet Kyshtabekov","Gopi Thonakal","Chen Chich","Govindan Lakshmanan"));
        arrayList.add(new ContentQuestionModel("Which of the following city hosted the 2017 Asian Athletics Championship?","Delhi","Bengaluru","Bhubaneshwar","Chandigarh","Bhubaneshwar"));
        arrayList.add(new ContentQuestionModel("What was the mascots for the 2017 FIFA Under-17 World Cup Football Tournament played in India?","SHERA","BHOLU","KHELEO","APPU","KHELEO"));
        arrayList.add(new ContentQuestionModel("Which among the following country won the Women's Rugby World Cup held in 2017?","England","New Zealand","Canada","Australia","New Zealand"));
        arrayList.add(new ContentQuestionModel("Which of the following teams won the final in Vijay Hazare Trophy 2018?","Rajasthan","Mumbai","Delhi","Punjab","Mumbai"));
        arrayList.add(new ContentQuestionModel("Who is the present captain of India's men National field hockey team?","Akashdeep Singh","Harmanpreet Singh","Rupinder Pal Singh","Manpreet Singh","Manpreet Singh"));
        arrayList.add(new ContentQuestionModel(" Archery is the national game of -","Bhutan","Denmark","Sri Lanka","Switzerland","Bhutan"));
        arrayList.add(new ContentQuestionModel("Rani Rampal has won the World Games Athlete of the Year award for 2019. She is associated with which of the following sports?","Tennis","Badminton","Hockey","Cricket","Hockey"));
        arrayList.add(new ContentQuestionModel("Who among the following has won Australian Open Men’s Singles title 2020?","Roger Federer","Novak Djokovic","Dominic Thiem","Rafael Nadal","Novak Djokovic"));
          return arrayList;

    }
   private ArrayList<ListItem> banglaList() {
       final ArrayList arrayList = new ArrayList();

       arrayList.add(new ContentQuestionModel("সালওয়া Eidদ নাসের ২০১৮ আইএএএফ ওয়ার্ল্ড অ্যাথলেটিক্স চ্যাম্পিয়নশিপে 400 মিটার মহিলাদের রেসে স্বর্ণপদক জিতেছে। তিনি কোন দেশ থেকে এসেছেন?", "কেনিয়া", "কুয়েত", "পেরু", "বাহরাইন", "বাহরাইন"));
       arrayList.add(new ContentQuestionModel("আইএএএফ ওয়ার্ল্ড অ্যাথলেটিক্স চ্যাম্পিয়নশিপ 2019 কোন জায়গায় অনুষ্ঠিত হয়েছিল?", "উলান উদে, রাশিয়া", "দোহা, কাতার", "সিওল, দক্ষিণ কোরিয়া", "রিয়াদ, সংযুক্ত আরব আমিরাত", "দোহা, কাতার"));
       arrayList.add(new ContentQuestionModel("সারা টেলর একজন মহিলা ক্রিকেটার। তিনি নিম্নলিখিত কোন দেশের হয়ে খেলেন?", "অস্ট্রেলিয়া", "নিউজিল্যান্ড", "দক্ষিণ আফ্রিকা", "ইংল্যান্ড", "ইংল্যান্ড"));
       arrayList.add(new ContentQuestionModel("স্যার ডন ব্র্যাডম্যানের পরে টেস্ট ফর্ম্যাটে দ্বিতীয় দ্রুততম ব্যাটসম্যান কে?", "বিরাট কোহলি", "মাহেলা জয়াবর্ধনে", "কেন উইলিয়ামসন", "স্টিভ স্মিথ", "স্টিভ স্মিথ"));
       arrayList.add(new ContentQuestionModel("বিশ্বের বৃহত্তম ক্রিকেট স্টেডিয়ামটি -", "কলকাতা", "ম্যানচেস্টার", "মেলবোর্ন", "মতেরা", "মতেরা"));//22
       arrayList.add(new ContentQuestionModel("নিম্নলিখিত ক্লাবগুলির মধ্যে কোনটি ফিফা ক্লাব বিশ্বকাপ, ২০১৮ জিতেছে?", "বার্সেলোনা", "রিয়াল মাদ্রিদ", "জুভেন্টাস", "লিভারপুল", "লিভারপুল"));
       arrayList.add(new ContentQuestionModel("ভারতের প্রথম ডে-নাইট টেস্ট কোথায় অনুষ্ঠিত হয়েছিল?", "দিল্লি", "কলকাতা", "মুম্বাই", "চেন্নাই", "কলকাতা"));
       arrayList.add(new ContentQuestionModel("১৩ তম দক্ষিণ এশিয়ান গেমস 2019 এর আয়োজক কোন দেশ?", "বাংলাদেশ", "নেপাল", "ভুটান", "ভারত", "নেপাল"));
       arrayList.add(new ContentQuestionModel("এশীয় অ্যাথলেটিক্স চ্যাম্পিয়নশিপ, ২০১ in, ২০১৩ সালে 10,000 মিটার দৌড়ে নিম্নলিখিতগুলির মধ্যে কে স্বর্ণপদক জিতেছেন?", "গোবিন্দন লক্ষ্মণন", "অ্যাডিলেট কিশতাবেকভ", "গোপী থোনাকল", "চেন চিচ", "গোবিন্দন লক্ষ্মণন"));
       arrayList.add(new ContentQuestionModel("নিম্নলিখিত শহরগুলির মধ্যে 2017 সালের এশিয়ান অ্যাথলেটিক্স চ্যাম্পিয়নশিপটি অনুষ্ঠিত হয়েছিল?", "দিল্লি", "বেঙ্গালুরু", "ভুবনেশ্বর", "চণ্ডীগড়", "ভুবনেশ্বর"));
       arrayList.add(new ContentQuestionModel("ভারতে অনুষ্ঠিত ২০১ 2017 ফিফার অনূর্ধ্ব -১ World বিশ্বকাপ ফুটবল টুর্নামেন্টের মাস্কটগুলি কী ছিল?", "শেরা", "ভোলু", "খেলিও", "অ্যাপু", "খেলিও"));
       arrayList.add(new ContentQuestionModel("2017 সালে অনুষ্ঠিত মহিলা রাগবি বিশ্বকাপ নিম্নলিখিত দেশগুলির মধ্যে কোনটি জিতেছে?", "ইংল্যান্ড", "নিউজিল্যান্ড", "কানাডা", "অস্ট্রেলিয়া", "নিউজিল্যান্ড"));
       arrayList.add(new ContentQuestionModel("বিজয় হাজারে ট্রফি 2018 সালে নিম্নলিখিত দলগুলির মধ্যে কোনটি ফাইনাল জিতেছে?", "রাজস্থান", "মুম্বাই", "দিল্লি", "পাঞ্জাব", "মুম্বাই"));//30
       arrayList.add(new ContentQuestionModel("ভারতের পুরুষদের জাতীয় জাতীয় হকি দলের বর্তমান অধিনায়ক কে?", "আকাশদীপ সিং", "হরমনপ্রীত সিং", "রুপিন্দর পাল সিং", "মনপ্রীত সিং", "মনপ্রীত সিং"));

       arrayList.add(new ContentQuestionModel("ভলিবলের একটি দলে কতজন খেলোয়াড় রয়েছে?","5","6","7","8","6"));
       arrayList.add(new ContentQuestionModel("দেওধর ট্রফি -", "ফুটবল", "ক্রিকেট", "হকি", "ব্যাডমিন্টন", "ক্রিকেট"));
       arrayList.add(new ContentQuestionModel("কোন দল ফিফার অনূর্ধ্ব -১ Football ফুটবল বিশ্বকাপ, ২০১৮ এর চ্যাম্পিয়ন হয়ে উঠেছে?", "আর্জেন্টিনা", "জার্মানি", "ব্রাজিল", "স্পেন", "ব্রাজিল"));
       arrayList.add(new ContentQuestionModel("এফআইএইচ মেনস হকি বিশ্বকাপ, ২০২২ ভারতে অনুষ্ঠিত হবে -", "কলকাতা", "জলন্ধর", "চণ্ডীগড়", "ভুবনেশ্বর এবং রাউরকেলা", "ভুবনেশ্বর এবং রাউরকেলা"));
       arrayList.add(new ContentQuestionModel("বেইটন কাপ হ'ল -", "ক্রিকেট", "বাস্কেটবল বাস্কেটবল", "হকি", "ফুটবল", "হকি"));
       arrayList.add(new ContentQuestionModel("বড়বতি স্টেডিয়ামটি অবস্থিত -", "কটক", "রাঁচি", "ভুবনেশ্বর", "পাটনা", "কটক"));

       arrayList.add(new ContentQuestionModel("স্বতন্ত্র অলিম্পিক পদক জেতা প্রথম ভারতীয় মহিলা কে?", "কর্ণম মলেশ্বরী", "সানিয়া মির্জা", "পি ভি সিন্ধু", "কর্ণম মলেশ্বরী", "সানিয়া মির্জা"));
       arrayList.add(new ContentQuestionModel("এসের বিরুদ্ধে অদ্ভুত হ'ল -", "পি টি উষা", "সানিয়া মির্জা", "হিমা দাস", "মেরি কোম", "সানিয়া মির্জা"));
       arrayList.add(new ContentQuestionModel("এসের বিরুদ্ধে অদ্ভুত হ'ল  ", "পি টি উষা", "সানিয়া মির্জা", "হিমা দাস", "মেরি কোম", "সানিয়া মির্জা"));
       arrayList.add(new ContentQuestionModel("কোন দল বিজয় হাজারে ট্রফির চ্যাম্পিয়ন হয়ে উঠল, 2019?", "তামিলনাড়ু", "কর্ণাটক", "মহারাষ্ট্র", "দিল্লি", "কর্ণাটক"));
       arrayList.add(new ContentQuestionModel("২০১ 2019 সালের ১th তম আইএএএফ ওয়ার্ল্ড অ্যাথলেটিক্স চ্যাম্পিয়নশিপ কোথায় অনুষ্ঠিত হয়েছিল?", "দুবাই, সৌদি আরব", "আলহাসা, সৌদি আরব", "দোহা, কাতার", "টোকিও, জাপান", "দোহা, কাতার"));
       arrayList.add(new ContentQuestionModel("কে এশিয়ান গেমস, 2018 এ ব্যাডমিনেশনে রৌপ্য পদক জিতেছে?", "তাইপেইস তাইজুইয়িং", "সায়না নেহওয়াল", "সৈয়দ মোদী", "পি। ভি। সিন্ধু", "পি। ভি। সিন্ধু"));
       arrayList.add(new ContentQuestionModel("কোন ভারতীয় ব্যাটসম্যান প্রথম শ্রেণির ক্রিকেটে টানা ছয়টি ছক্কা মারেন?", "রবি শাস্ত্রী", "সুনীল গাভাস্কার", "বিরাট কোহলি", "সচিন তেন্ডুলকর", "রবি শাস্ত্রী"));
       arrayList.add(new ContentQuestionModel("ডলফিন কিক শব্দটি কোন খেলাটির সাথে জড়িত?", "ফুটবল", "রাগবি", "সাঁতার", "ক্রিকেট", "সাঁতার"));
       arrayList.add(new ContentQuestionModel("2019 এর সুইস ওপেন টুর্নামেন্টে কোন ভারতীয় ব্যাডমিন্টন খেলোয়াড় রানার আপ হয়েছেন?", "কিদম্বী শ্রীকান্ত", "চেতন আনন্দ", "সাই প্রণীত", "পারুপল্লী কাশ্যপ", "সাই প্রণীত"));
       arrayList.add(new ContentQuestionModel("'ট্রিপলস' - এর একটি নতুন ফর্ম্যাট -", "বক্সিংিং", "জুডো", "দাবা", "ব্যাডমিন্টন", "ব্যাডমিন্টন"));
       arrayList.add(new ContentQuestionModel("নীচের মধ্যে কে ইটালিয়ান ওপেন উইমেন টেনিস সিঙ্গলস শিরোনাম 2019 জিতেছে?", "ক্যারোলিনা প্লিসকোভা", "জোহানা কোন্টা", "নওমি ওসাকা", "সেরেনা উইলিয়ামস", "ক্যারোলিনা প্লিসকোভা"));
       arrayList.add(new ContentQuestionModel("জাতীয় ডোপ টেস্টিং পরীক্ষাগারের অধীনে -", "স্বাস্থ্য ও পরিবার কল্যাণ মন্ত্রক", "বিজ্ঞান ও প্রযুক্তি মন্ত্রক", "যুব বিষয় ও ক্রীড়া মন্ত্রক", "স্বরাষ্ট্র মন্ত্রক", "যুব বিষয় ও ক্রীড়া মন্ত্রক"));

       arrayList.add(new ContentQuestionModel("নাওমি ওসাকা এবং সিমোনা হালেপ হলেন বিশিষ্ট ক্রীড়া মহিলা -", "ব্যাডমিন্টন", "লন টেনিস", "টেবিল টেনিস", "মহিলা ক্রিকেট", "লন টেনিস"));
       arrayList.add(new ContentQuestionModel("কোন দেশ ১৩ তম দক্ষিণ এশিয়ান গেমস, ২০১২ এর হোস্ট করেছে?", "বাংলাদেশ", "নেপাল", "ভারত", "ভুটান", "নেপাল"));
       arrayList.add(new ContentQuestionModel("ব্যালন ডি'অর সম্মান -", "বাস্কেটবল বাস্কেটবল", "ফুটবল", "পোলো", "টেনিস", "ফুটবল"));
       arrayList.add(new ContentQuestionModel("ফ্র্যাঙ্ক ওয়ারেল ট্রফি হল অস্ট্রেলিয়া এবং -", "ওয়েস্ট ইন্ডিজ", "দক্ষিণ আফ্রিকা", "নিউজিল্যান্ড", "ইংল্যান্ড  এর মধ্যে খেলা টেস্ট ম্যাচ (ক্রিকেট) সিরিজ","ওয়েস্ট ইন্ডিজ"));
       arrayList.add(new ContentQuestionModel("মহিলা ক্রিকেটে নিম্নলিখিতের মধ্যে কে প্রথম হয়েছেন, আন্তর্জাতিক ক্রিকেটের 20 বছরের অভিজ্ঞতা আছে?", "স্মৃতি মান্ধনা", "একতা বিশত", "মিতালি রাজ","বেদ কৃষ্ণমূর্তি", "মিতালি রাজ"));
       arrayList.add(new ContentQuestionModel("একেতেরিনা প্যাল্টেসেভা এবং মঞ্জু রানী দুজনেই খেলাধুলার সাথে যুক্ত -", "ব্যাডমিন্টন", "বাস্কেটবল", "বেসবল", "বক্সিং", "বক্সিং"));
       arrayList.add(new ContentQuestionModel("গ্রিন পার্ক স্টেডিয়াম, যা ২০১ 2016 সালে ভারত দ্বারা খেলা ৫০০ তম আন্তর্জাতিক টেস্ট ক্রিকেট ম্যাচটি আয়োজিত ছিল, ভারতের শহরটিতে অবস্থিত -", "কানপুর", "ইন্দোর", "গওয়ালিয়র", "রাজকোট", "কানপুর"));
       arrayList.add(new ContentQuestionModel("এশিয়ান অপেশাদার বক্সিং চ্যাম্পিয়নশিপস ২০১৮ অনুষ্ঠিত হয়েছিল -", "দিল্লি, ভারত", "মস্কো, রাশিয়া", "ব্যাংকক, থাইল্যান্ড", "নূর-সুলতান, কাজাখস্তান", "ব্যাংকক, থাইল্যান্ড"));
       arrayList.add(new ContentQuestionModel("আন্তর্জাতিক অলিম্পিক কমিটির সদর দফতর অবস্থিত -", "ভিয়েনা, অস্ট্রিয়া", "লসান, সুইজারল্যান্ড", "জেনেভা, সুইজারল্যান্ড", "মাদ্রিদ, স্পেন", "লসান, সুইজারল্যান্ড"));
       arrayList.add(new ContentQuestionModel("প্রাক্তন অলিম্পিক চ্যাম্পিয়ন, 28 বছর বয়সী লি জুয়েরুল যিনি তার অবসর ঘোষণা করেছিলেন (অক্টোবর 2019), এর সাথে যুক্ত ছিলেন -", "বেসবল", "বক্সিং", "সফটবল", "ব্যাডমিন্টন", "ব্যাডমিন্টন"));
       arrayList.add(new ContentQuestionModel("সুব্রতো গেমটি", "হকি", "ফুটবল", "ক্রিকেট", "টেনিস", "ফুটবল"));

       arrayList.add(new ContentQuestionModel("তীরন্দাজি হ'ল জাতীয় খেলা -", "ভুটান", "ডেনমার্ক", "শ্রীলঙ্কা", "সুইজারল্যান্ড", "ভুটান"));
       arrayList.add(new ContentQuestionModel("রানী রামপাল ২০১৮ সালের বিশ্বকাপের অ্যাথলিট অফ দ্য ইয়ার অ্যাওয়ার্ড জিতেছে। নীচের কোন খেলাধুলার সাথে তিনি জড়িত?", "টেনিস", "ব্যাডমিন্টন", "হকি", "ক্রিকেট", "হকি"));
       arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কে অস্ট্রেলিয়ান ওপেন মেনস সিঙ্গলস শিরোপা ২০২০ জিতেছে?", "রজার ফেডারার", "নোভাক জোকোভিচ", "ডমিনিক থিয়েম", "রাফায়েল নাদাল", "নোভাক জোকোভিচ"));
       arrayList.add(new ContentQuestionModel("নীচের এই ক্রিকেটার কে 2019 সালের সেরা আইসিসির সেরা ক্রিকেটার নির্বাচিত হয়েছেন -", "রোহিত শর্মা (ভারত)", "বেন স্টোকস (ইংল্যান্ড)", "প্যাট কামিন্স (অস্ট্রেলিয়া)", "বিরাট কোহলি (ভারত) ","বেন স্টোকস (ইংল্যান্ড)"));
       arrayList.add(new ContentQuestionModel("ভারত থেকে প্রথম বিশ্ব ব্যাডমিন্টন চ্যাম্পিয়ন কে হয়েছিলেন?", "সায়না নিউয়াল", "পি ভি সিন্ধু", "সানিয়া মির্জা", "কে শ্রীকান্ত", "পি ভি সিন্ধু"));


       return arrayList;

   }
   private ArrayList<ListItem> hindiList() {
       final ArrayList arrayList = new ArrayList();

       arrayList.add(new ContentQuestionModel("वॉलीबॉल की टीम में कितने खिलाड़ी हैं?","5","6","7","8","6"));
       arrayList.add(new ContentQuestionModel("देवधर ट्रॉफी एक प्रतिष्ठित टूर्नामेंट है -", "फुटबॉल", "क्रिकेट", "हॉकी", "बैडमिंटन", "क्रिकेट"));
       arrayList.add(new ContentQuestionModel("कौन सी टीम फीफा अंडर -17 फुटबॉल विश्व कप, 2019 का चैंपियन बनती है?", "अर्जेंटीना", "जर्मनी", "ब्राजील", "स्पेन", "ब्राजील"));
       arrayList.add(new ContentQuestionModel("FIH मेन्स हॉकी वर्ल्ड कप, 2023 भारत में आयोजित किया जाएगा -", "कोलकाता", "जालंधर", "चंडीगढ़", "भुवनेश्वर और राउरकेला", "भुवनेश्वर और राउरकेला"));
       arrayList.add(new ContentQuestionModel("बीटन कप खेल के प्रतिष्ठित चैम्पियनशिप है -", "क्रिकेट", "बास्केट बॉल", "हॉकी", "फुटबॉल", "हॉकी" ));
       arrayList.add(new ContentQuestionModel("बाराबती स्टेडियम -", "कटक", "रांची", "भुवनेश्वर", "पटना", "कटक"));
       arrayList.add(new ContentQuestionModel("नाओमी ओसाका और सिमोना हालेप प्रख्यात खेल महिलाएं हैं - जो खेल से जुड़ी हैं -", "बैडमिंटन", "लॉन टेनिस", "टेबल टेनिस", "महिला क्रिकेट", "लॉन टेनिस"));
       arrayList.add(new ContentQuestionModel("किस देश ने 13 वें दक्षिण एशियाई खेलों, 2019 की मेजबानी की?", "बांग्लादेश", "नेपाल", "भारत", "भूटान", "नेपाल"));
       arrayList.add(new ContentQuestionModel("बैलोन डी''","ओर सम्मान   बास्केट बॉल ","फुटबॉल"," पोलो "," टेनिस ","फुटबॉल"));
       arrayList.add(new ContentQuestionModel("द फ्रैंक वॉरेल ट्रॉफी एक टेस्ट-मैच (क्रिकेट) श्रृंखला है जो ऑस्ट्रेलिया और -", " वेस्ट इंडीज "," साउथ अफ्रीका "," न्यूजीलैंड "," इंग्लैंड "," वेस्ट इंडीज "));
       arrayList.add(new ContentQuestionModel("20 साल के अंतर्राष्ट्रीय क्रिकेट अनुभव के बाद, महिला क्रिकेट में पहली कौन बनी?", "स्मृति मंधाना", "एकता बिष्ट", "मिताली राज", "वेदा कृष्णमूर्ति", "मिताली राज"));
       arrayList.add(new ContentQuestionModel("एकाटेरिना पलसेवा और मंजू रानी दोनों ही खेल से जुड़ी हैं -", "बैडमिंटन", "बास्केटबॉल", "बेसबॉल", "मुक्केबाजी", "मुक्केबाजी"));
       arrayList.add(new ContentQuestionModel("ग्रीन पार्क स्टेडियम, जिसने 2016 में भारत द्वारा खेले गए 500 वें अंतर्राष्ट्रीय टेस्ट क्रिकेट मैच की मेजबानी की, वह भारतीय शहर में स्थित है -", "कानपुर", "इंदौर", "ग्वालियर", "राजकोट", "कानपुर"));
       arrayList.add(new ContentQuestionModel("द एशियन एमेच्योर बॉक्सिंग चैंपियनशिप 2019 -", "दिल्ली, भारत", "मॉस्को, रूस", "बैंकॉक, थाईलैंड", "नूर-सुल्तान, कजाकिस्तान", "बैंकॉक, थाईलैंड"));
       arrayList.add(new ContentQuestionModel("अंतर्राष्ट्रीय ओलंपिक समिति का मुख्यालय स्थित है -", "वियना, ऑस्ट्रिया", "लॉज़ेन, स्विटज़रलैंड", "जिनेवा, स्विटज़रलैंड", "मैड्रिड, स्पेन", "लॉज़ेन, स्विटज़रलैंड"));
       arrayList.add(new ContentQuestionModel("पूर्व ओलंपिक चैंपियन, 28 वर्षीय ली ज़ुअरुल जिन्होंने घोषणा की (अक्टूबर 2019 में) उनकी सेवानिवृत्ति, -", "बेसबॉल", "बॉक्सिंग", "सॉफ्टबॉल", "बैडमिंटन", "बैडमिंटन"  ));
       arrayList.add(new ContentQuestionModel("बेन स्टोक्स -", "बैडमिंटन", "फुटबॉल", "हॉकी", "क्रिकेट", "क्रिकेट"));
       arrayList.add(new ContentQuestionModel("द सुब्रतो गेम खेल से जुड़ा है -", "हॉकी", "फुटबॉल", "क्रिकेट", "टेनिस", "फुटबॉल"));
       arrayList.add(new ContentQuestionModel("सालवा ईद नासिर ने 2019 IAAF वर्ल्ड एथलेटिक्स चैंपियनशिप के लिए 400 मीटर महिला दौड़ में स्वर्ण पदक जीता है। वह किस देश से हैं?", "केन्या", "कुवैत", "पेरू", "बहरीन","बहरीन" ));
       arrayList.add(new ContentQuestionModel("आईएएएफ विश्व एथलेटिक्स चैंपियनशिप 2019 किस स्थान पर आयोजित किया गया था?", "उलान उड, रूस", "दोहा, कतर", "सियोल, दक्षिण कोरिया", "रियाद, यूएई", "दोहा, कतर"));
       arrayList.add(new ContentQuestionModel("सारा टेलर एक महिला क्रिकेटर हैं। वह निम्नलिखित में से किस देश के लिए खेलती हैं?", "ऑस्ट्रेलिया", "न्यूजीलैंड", "दक्षिण अफ्रीका", "इंग्लैंड", "इंग्लैंड"));
       arrayList.add(new ContentQuestionModel("सर डॉन ब्रैडमैन के बाद टेस्ट प्रारूप में 25 शतक लगाने वाले दूसरे सबसे तेज बल्लेबाज कौन हैं?", "विराट कोहली", "महेला जयवर्धने", "केन विलियमसन", "स्टीव स्मिथ", "स्टीव स्मिथ"));
       arrayList.add(new ContentQuestionModel("दुनिया का सबसे बड़ा क्रिकेट स्टेडियम -", "कोलकाता", "मैनचेस्टर", "मेलबर्न", "मोटेरा", "मोटेरा"));
       arrayList.add(new ContentQuestionModel("निम्न में से किस क्लब ने फीफा क्लब विश्व कप, 2019 जीता है?", "बार्सिलोना", "रियल मैड्रिड", "जुवेंटस", "लिवरपूल", "लिवरपूल"));
       arrayList.add(new ContentQuestionModel("भारत का पहला डे-नाइट टेस्ट कहाँ आयोजित किया गया था?", "दिल्ली", "कोलकाता", "जयपुर", "चेन्नई", "जयपुर"));
       arrayList.add(new ContentQuestionModel("किस देश ने 13 वें दक्षिण एशियाई खेलों 2019 की मेजबानी की?", "बांग्लादेश", "नेपाल", "भूटान", "भारत", "नेपाल"));
       arrayList.add(new ContentQuestionModel("एशियाई एथलेटिक्स चैम्पियनशिप, 2017 में निम्नलिखित में से किसने 10,000 मीटर की दौड़ में स्वर्ण पदक जीता?", "गोविंदन लक्ष्मणन", "एडिलेश किश्तबेकोव", "गोपी थोनाकाल", "चेन चीच", "गोविंदन लक्ष्मणन"));
       arrayList.add(new ContentQuestionModel("निम्नलिखित में से किस शहर ने 2017 एशियाई एथलेटिक्स चैम्पियनशिप की मेजबानी की?", "दिल्ली", "बेंगलुरु", "भुवनेश्वर", "चंडीगढ़", "भुवनेश्वर"));
       arrayList.add(new ContentQuestionModel("भारत में खेले गए 2017 फीफा अंडर -17 विश्व कप फुटबॉल टूर्नामेंट के लिए शुभंकर क्या था?", "शेरा", "BHOLU", "KHELEO", "APPU", "KHELEO"));
       arrayList.add(new ContentQuestionModel("किस देश ने 2017 में आयोजित महिला रग्बी विश्व कप जीता?", "इंग्लैंड", "न्यूजीलैंड", "कनाडा", "ऑस्ट्रेलिया", "न्यूजीलैंड"));
       arrayList.add(new ContentQuestionModel("विजय हजारे ट्रॉफी 2018 में निम्नलिखित में से किस टीम ने फाइनल जीता?", "राजस्थान", "मुंबई", "दिल्ली", "पंजाब", "मुंबई"));
       arrayList.add(new ContentQuestionModel("भारत के पुरुष राष्ट्रीय हॉकी टीम के वर्तमान कप्तान कौन हैं?", "आकाशदीप सिंह", "हरमनप्रीत सिंह", "रूपिंदर पाल सिंह", "मनप्रीत सिंह", "मनप्रीत सिंह"));
       arrayList.add(new ContentQuestionModel("तीरंदाजी का राष्ट्रीय खेल है -", "भूटान", "डेनमार्क", "श्रीलंका", "स्विटजरलैंड", "भूटान"));
       arrayList.add(new ContentQuestionModel("रानी रामपाल ने 2019 के लिए विश्व खेल एथलीट ऑफ द ईयर पुरस्कार जीता है। वह निम्नलिखित में से किस खेल से जुड़ी हैं?", "टेनिस", "बैडमिंटन", "हॉकी", "क्रिकेट", "हॉकी"));
       arrayList.add(new ContentQuestionModel("निम्न में से किसने ऑस्ट्रेलियन ओपन मेन का एकल खिताब 2020 जीता है?", "रोजर फेडरर", "नोवाक जोकोविच", "डोमिनिक थिएम", "राफेल नडाल", "नोवाक जोकोविच"));
       arrayList.add(new ContentQuestionModel("2019 के लिए ICC वनडे क्रिकेटर ऑफ द ईयर के लिए निम्नलिखित क्रिकेटर किसे चुना गया है -", "विराट कोहली", "बेन स्टोक्स", "रोहित शर्मा", "दीपक चाहर", "रोहित शर्मा"));
       arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन क्रिकेटर आईसीसी बेस्ट क्रिकेटर ऑफ द ईयर 2019 के लिए चुना गया है -", "रोहित शर्मा (भारत)", "बेन स्टोक्स (इंग्लैंड)", "पैट कमिंस (ऑस्ट्रेलिया)", "विराट कोहली (भारत)" ,"बेन स्टोक्स (इंग्लैंड)"));
       arrayList.add(new ContentQuestionModel("कौन भारत से पहला विश्व बैडमिंटन चैंपियन बना?", "साइना नेवल", "पी वी सिंधु", "सानिया मिर्ज़ा", "के श्रीकांत", "पी वी सिंधु"));
       arrayList.add(new ContentQuestionModel("व्यक्तिगत ओलंपिक पदक जीतने वाली पहली भारतीय महिला कौन है?", "कर्णम मल्लेश्वरी", "सानिया मिर्ज़ा", "पी वी सिंधु", "साइना नवल", "कर्णम मल्लेश्वरी"));
       arrayList.add(new ContentQuestionModel("ऐस अगेंस्ट ऑड्स की आत्मकथा है -", "पी टी उषा", "सानिया मिर्ज़ा", "हेमा दास", "मैरी कॉम", "सानिया मिर्ज़ा"));
       arrayList.add(new ContentQuestionModel("फेड एक्स कप और अगस्टा मास्टर्स के खेल की प्रतिष्ठित ट्रॉफियां हैं -", "स्क्वैश", "गोल्फ", "बिलियर्ड्स", "हॉकी", "गोल्फ"));
       arrayList.add(new ContentQuestionModel("कौन सी टीम विजेता हजारे ट्रॉफी, 2019 में उभरी?", "तमिलनाडु", "कर्नाटक", "महाराष्ट्र", "दिल्ली", "कर्नाटक"));
       arrayList.add(new ContentQuestionModel("17 वीं आईएएएफ विश्व एथलेटिक्स चैम्पियनशिप, 2019 का आयोजन कहां हुआ था?", "दुबई, सऊदी अरब", "अल्हासा, सऊदी अरब", "दोहा, कतर", "टोक्यो, जापान", "दोहा, कतर"));
       arrayList.add(new ContentQuestionModel("एशियन गेम्स, 2018 में बैडमिंटन में रजत पदक किसने जीता?", "ताइपेस ताई त्ज़ुयिंग", "साइना नेहवाल", "सैयद मोदी", "पी। वी। सिंधु", "पी। वी। सिंधु"));
       arrayList.add(new ContentQuestionModel("प्रथम श्रेणी क्रिकेट में लगातार छक्के मारने वाले भारतीय बल्लेबाज कौन थे?", "रवि शास्त्री", "सुनील गावस्कर", "विराट कोहली", "सचिन तेंदुलकर", "रवि शास्त्री"));
       arrayList.add(new ContentQuestionModel("डॉल्फिन किक शब्द किस खेल से जुड़ा है?", "फुटबॉल", "रग्बी", "तैराकी", "क्रिकेट", "तैराकी"));
       arrayList.add(new ContentQuestionModel("2019 स्विस ओपन टूर्नामेंट में कौन सा भारतीय बैडमिंटन खिलाड़ी उपविजेता था?", "किदांबी श्रीकांत", "चेतन आनंद", "साई प्रणीत", "पारुपल्ली कश्यप", "साई प्रणीत"));
       arrayList.add(new ContentQuestionModel("  ट्रिपल्स  का एक नया प्रारूप है -", "बॉक्सिंग", "जूडो", "शतरंज", "बैडमिंटन", "बैडमिंटन"));
       arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसने इतालवी ओपन महिला टेनिस एकल खिताब 2019 जीता?", "कैरोलिना प्लिस्कोवा", "जोहाना कोंटा", "नाओमी ओसाका", "सेरेना विलियम्स", "कैरोलिना प्लिस्कोवा"));
       arrayList.add(new ContentQuestionModel("नेशनल डोप टेस्टिंग लेबोरेटरी के अंतर्गत कार्य -", "स्वास्थ्य और परिवार कल्याण मंत्रालय", "विज्ञान और प्रौद्योगिकी मंत्रालय", "युवा मामले मंत्रालय और  खेल", "गृह मंत्रालय", "युवा मामले मंत्रालय और  खेल"));





       return arrayList;

   }
   private ArrayList<ListItem> urduList() {
       final ArrayList arrayList = new ArrayList();

       arrayList.add(new ContentQuestionModel("والی بال کی ایک ٹیم میں کتنے کھلاڑی ہیں؟","5","6","7","8","6"));
       arrayList.add(new ContentQuestionModel("دیودھر ٹرافی ایک پر وقار ٹورنامنٹ ہے۔"," فٹ بال "," کرکٹ "," ہاکی "," بیڈمنٹن "," کرکٹ "));
       arrayList.add(new ContentQuestionModel("کون سی ٹیم فیفا انڈر 17 فٹ بال ورلڈ کپ ، 2019 کے چیمپین بن کر سامنے آئی؟" , "ارجنٹائن" , "جرمنی" , "برازیل" , "اسپین","برازیل"));
       arrayList.add(new ContentQuestionModel("ایف آئی ایچ مینز ہاکی ورلڈ کپ ، 2023 کی میزبانی بھارت میں -" , "کولکتہ" , "جالندھر" , "چندی گڑھ" , "بھونیشور اور رورکیلا","بھونیشور اور رورکیلا"));//4
       arrayList.add(new ContentQuestionModel("بیٹن کپ اس کھیل کی ایک ممتاز چیمپئن شپ ہے۔"," کرکٹ "," باسکٹ بال "," ہاکی "," فٹ بال "," ہاکی "));
       arrayList.add(new ContentQuestionModel("باراباتی اسٹیڈیم میں واقع ہے۔" , "کٹک" , "رانچی" , "بھوبنیشور" , "پٹنہ","کٹک"));
       arrayList.add(new ContentQuestionModel("نومی اوساکا اور سیمونا ہالیپ کھیلوں سے وابستہ معروف کھیلوں کی خواتین ہیں۔"," بیڈمنٹن "," لان ٹینس "," ٹیبل ٹینس "," خواتین کرکٹ "," لان ٹینس "));
       arrayList.add(new ContentQuestionModel("کس ملک نے 13 ویں جنوبی ایشین گیمز ، 2019 کی میزبانی کی؟" , "بنگلہ دیش" , "نیپال" , "ہندوستان" , "بھوٹان","نیپال"));
       arrayList.add(new ContentQuestionModel("بالن کا اعزاز اس کھیل سے وابستہ ہے -"," باسکٹ بال ","فٹ بال"," پولو "," ٹینس ","فٹ بال"));//9
       arrayList.add(new ContentQuestionModel("فرینک ورلیل ٹرافی آسٹریلیا اور - کے مابین کھیلی جانے والی ٹیسٹ میچ (کرکٹ) سیریز ہے۔"," ویسٹ انڈیز "," جنوبی افریقہ "," نیوزی لینڈ "," انگلینڈ "," ویسٹ انڈیز "));
       arrayList.add(new ContentQuestionModel("خواتین کرکٹ میں درج ذیل میں سے کون بن گیا ہے ، جس نے 20 سال کا انٹرنیشنل کرکٹ تجربہ حاصل کیا؟" , "اسمرتی ماندھنا" , "ایکتا بشٹ" , "میتھلی راج" , "وید کرشنومورتی","میتھلی راج"));
       arrayList.add(new ContentQuestionModel("ایکٹیرینا پالٹسیوا اور منجو رانی دونوں اس کھیل سے وابستہ ہیں"," بیڈمنٹن "," باسکٹ بال "," بیس بال ","باکسنگ","باکسنگ"));//12
       arrayList.add(new ContentQuestionModel("گرین پارک اسٹیڈیم ، جس نے سنہ 2016 میں بھارت کے ذریعہ کھیلے جانے والے 500 ویں بین الاقوامی ٹیسٹ کرکٹ میچ کی میزبانی کی ، وہ ہندوستان کے شہر میں واقع ہے۔"," کانپور "," اندور "," گوالیار "," راجکوٹ "," کانپور "));
       arrayList.add(new ContentQuestionModel("ایشین امیچور باکسنگ چیمپینشپز 2019 میں منعقد ہوا -"," دہلی ، ہندوستان "," ماسکو ، روس "," بینکاک، تھائی لینڈ "," نور سلطان ، قازقستان "," بینکاک، تھائی لینڈ "));//14
       arrayList.add(new ContentQuestionModel("بین الاقوامی اولمپک کمیٹی کا صدر مقام واقع ہے -"," ویانا ، آسٹریا "," لوزان ، سوئٹزرلینڈ "," جنیوا ، سوئٹزرلینڈ "," میڈرڈ ، اسپین "," لوزان ، سوئٹزرلینڈ "));
       arrayList.add(new ContentQuestionModel("سابق اولمپک چیمپیئن 28 سالہ لی زیورول جس نے (اکتوبر 2019 میں) اپنی ریٹائرمنٹ کا اعلان کیا تھا ، سے وابستہ تھے -"," بیس بال "," باکسنگ "," سافٹ بال "," بیڈمنٹن "," بیڈمنٹن "));
       arrayList.add(new ContentQuestionModel("بین اسٹوکس - کے کھیل سے وابستہ ہے۔"," بیڈمنٹن "," فٹ بال "," ہاکی ","کرکٹ","کرکٹ"));//17
       arrayList.add(new ContentQuestionModel("سبروٹو گیم اس کھیل سے وابستہ ہے -"," ہاکی ","فٹ بال"," کرکٹ "," ٹینس ","فٹ بال"));
       arrayList.add(new ContentQuestionModel("سلوا عید ناصر نے 2019 آئی اے اے ایف ورلڈ ایتھلیٹکس چیمپینشپ میں خواتین کی 400 میٹر ریس میں طلائی تمغہ جیتا ہے۔ وہ کس ملک سے ہیں؟" , "کینیا" , "کویت" , "پیرو" , "بحرین","بحرین"));
       arrayList.add(new ContentQuestionModel("آئی اے اے ایف ورلڈ ایتھلیٹکس چیمپئن شپ 2019 کس جگہ پر منعقد ہوئی؟" , "الان اودے ، روس" , "دوحہ ، قطر" , "سیئل ، جنوبی کوریا" , "ریاض ، متحدہ عرب امارات","دوحہ ، قطر"));
       arrayList.add(new ContentQuestionModel("سارہ ٹیلر ایک وومن کرکٹر ہیں۔ وہ مندرجہ ذیل میں سے کس ملک کے لئے کھیلتی ہیں؟" , "آسٹریلیا" , "نیوزی لینڈ" , "جنوبی افریقہ" , "انگلینڈ","انگلینڈ"));
       arrayList.add(new ContentQuestionModel("سر ڈان بریڈمین کے بعد ٹیسٹ فارمیٹ میں 25 سنچری اسکور کرنے والا دوسرا تیز بلے باز کون ہے؟" , "ویرات کوہلی" , "مہیلا جے وردھنے" , "کین ولیمسن" , "اسٹیو اسمتھ","اسٹیو اسمتھ"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل کلب میں سے کس نے فیفا کلب ورلڈ کپ ، 2019 جیت لیا؟" , "بارسلونا" , "ریئل میڈرڈ" , "جوونٹس" , "لیورپول","لیورپول"));
       arrayList.add(new ContentQuestionModel("ہندوستان کا پہلا ڈے نائٹ ٹیسٹ کہاں کا اہتمام کیا گیا؟" , "دہلی" , "کولکتہ" , "ممبئی" , "چنئی","کولکتہ"));
       arrayList.add(new ContentQuestionModel("کس ملک نے 13 ویں جنوبی ایشین گیمز 2019 کی میزبانی کی؟" , "بنگلہ دیش" , "نیپال" , "بھوٹان" , "ہندوستان","نیپال"));
       arrayList.add(new ContentQuestionModel("ایشین ایتھلیٹکس چیمپینشپ ، 2017 میں درج ذیل میں سے کس نے 10،000 میٹر ریس میں طلائی تمغہ جیتا؟" , "گووندن لکشمنان" , "عادلیٹ کیشت بیکوف" , "گوپی تھوناکال" , "چن چیچ","گووندن لکشمنان"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا شہر 2017 کی ایشین ایتھلیٹکس چیمپئن شپ کی میزبانی کرتا ہے؟", "دہلی" , "بنگلورو" , "بھوبنیشور" , "چندی گڑھ","بھوبنیشور"));
       arrayList.add(new ContentQuestionModel("بھارت میں کھیلے جانے والے 2017 فیفا انڈر 17 ورلڈ کپ فٹ بال ٹورنامنٹ کے لئے کون کون سے نقاب پوش تھے؟" , "شیرا" , "بھلو" , "کھیلیں" , "اے پی پی یو","کھیلیں"));//28
       arrayList.add(new ContentQuestionModel("درج ذیل ملک میں سے کس نے 2017 میں منعقدہ ویمنز رگبی ورلڈ کپ جیتا؟" , "انگلینڈ" , "نیوزی لینڈ" , "کینیڈا" , "آسٹریلیا","نیوزی لینڈ"));
       arrayList.add(new ContentQuestionModel("وجئے ہزارے ٹرافی 2018 میں مندرجہ ذیل میں سے کون سی ٹیم فائنل جیت گئی؟" , "راجستھان" , "ممبئی" , "دہلی" , "پنجاب","ممبئی"));
       arrayList.add(new ContentQuestionModel("ہندوستان کی مین نیشنل فیلڈ ہاکی ٹیم کا موجودہ کپتان کون ہے؟" , "آکاشدیپ سنگھ" , "ہرمنپریت سنگھ" , "روپندر پال سنگھ" , "منپریت سنگھ","منپریت سنگھ"));
       arrayList.add(new ContentQuestionModel("تیر اندازی قومی کھیل ہے -" ,"بھوٹان", "ڈنمارک" , "سری لنکا" , "سوئٹزرلینڈ","بھوٹان"));
       arrayList.add(new ContentQuestionModel("رانی رامپال نے ورلڈ گیمز کے ایتھلیٹ آف دی ایئر کا ایوارڈ 2019 کے لئے جیتا ہے۔ وہ مندرجہ ذیل کھیلوں میں سے کس سے وابستہ ہیں؟" , "ٹینس" , "بیڈمنٹن" , "ہاکی" , "کرکٹ","ہاکی"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس نے آسٹریلیائی اوپن مینز سنگلز ٹائٹل 2020 جیتا ہے؟" , "راجر فیڈرر" , "نوواک جوکووچ" , "ڈومینک تھیم" , "رافیل نڈال","نوواک جوکووچ"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل کرکٹر کو کس کے لئے 2019 کے لئے آئی سی سی ون ڈے کرکٹر آف دی ایئر کے لئے منتخب کیا گیا ہے۔" , "ویرات کوہلی", "بین اسٹوکس" , "روہت شرما" , "دیپک چاہر","روہت شرما"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل کرکٹر کون امون کے بہترین کرکٹر برائے سال 2019 کے لئے منتخب کیا گیا ہے۔" , "روہت شرما (ہندوستان)" , "بین اسٹوکس (انگلینڈ)" , "پیٹ کمنس (آسٹریلیا)" , "ویرات کوہلی (ہندوستان) ","بین اسٹوکس (انگلینڈ)"));
       arrayList.add(new ContentQuestionModel("ہندوستان سے پہلا ورلڈ بیڈ منٹن چیمپیئن کون بن گیا؟" , "سائنا نیوال" , "پیشاب انڈس" , "ثانیہ مرزا" , "کے سری کانت","پیشاب انڈس"));//37
       arrayList.add(new ContentQuestionModel("انفرادی اولمپک تمغہ جیتنے والی پہلی ہندوستانی خاتون کون ہے؟" , "کرم ملشوری" , "ثانیہ مرزا" , "پی وی سندھو" , "سائنا نیوال","کرم ملشوری"));
       arrayList.add(new ContentQuestionModel("اکیس کے خلاف مشکلات - کی سوانح عمری ہے۔", "پی ٹی اوشا" , "ثانیہ مرزا" , "ہما داس" , "میری کوم","ثانیہ مرزا"));
       arrayList.add(new ContentQuestionModel("فیڈ سابق کپ اور آگسٹا ماسٹرز کھیل کے مائشٹھیت ٹرافیاں ہیں۔"," اسکواش ","گولف"," بلئرڈز "," ہاکی ","گولف"));//40
       arrayList.add(new ContentQuestionModel("کس ٹیم نے وجے ہزارے ٹرافی ، 2019 کے چیمپیئن کے طور پر ابھرا ہے؟" , "تمل ناڈو" , "کرناٹک" , "مہاراشٹرا" , "دہلی","کرناٹک"));
       arrayList.add(new ContentQuestionModel("17 ویں آئی اے اے ایف ورلڈ ایتھلیٹکس چیمپین شپ ، 2019 کا انعقاد کہاں کیا گیا؟" , "دبئی ، سعودی عرب" , "الہسا ، سعودی عرب" , "دوحہ ، قطر" , "ٹوکیو ، جاپان","دوحہ ، قطر"));
       arrayList.add(new ContentQuestionModel("ایشین گیمز ، 2018 میں کس طرح بیڈمیشن میں چاندی کا تمغہ جیتا؟" , "تائی پیس تائی زوئنگ", "سائنا نہوال" , "سید مودی" , "پی وی انڈس","پی وی انڈس"));//43
       arrayList.add(new ContentQuestionModel("فرسٹ کلاس کرکٹ میں لگاتار چھ چھکے لگانے والا ہندوستانی بلے باز کون تھا؟" , "روی شاستری" , "سنیل گواسکر" , "ویرات کوہلی" , "سچن تندولکر","روی شاستری"));
       arrayList.add(new ContentQuestionModel("ڈولفن کِک کی اصطلاح کس کھیل سے وابستہ ہے؟" , "فٹ بال" , "رگبی" , "تیراکی" , "کرکٹ","تیراکی"));
       arrayList.add(new ContentQuestionModel("2019 کے سوئس اوپن ٹورنامنٹ میں کون سا ہندوستانی بیڈمنٹن کھلاڑی رنر اپ تھا؟" , "کدامبی سریانت" , "چیتن آنند" , "سائیں پریتھ" , "پاروپلی کشیپ","سائیں پریتھ"));
       arrayList.add(new ContentQuestionModel("2019 کے سوئس اوپن ٹورنامنٹ میں کون سا ہندوستانی بیڈمنٹن کھلاڑی رنر اپ تھا؟" , "کدامبی سریانت" , "چیتن آنند" , "سائیں پریتھ" , "پاروپلی کشیپ","سائیں پریتھ"));
       arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس نے اطالوی اوپن ویمنس ٹینس سنگلز ٹائٹل 2019 جیتا؟" , "کرولینا پلسکوفا" , "جوہنا کونٹا" , "نومی اوساکا" , "سرینا ولیمز","کرولینا پلسکوفا"));
       arrayList.add(new ContentQuestionModel("نیشنل ڈوپ ٹیسٹنگ لیبارٹری کے تحت کام ہوتا ہے -" , "وزارت صحت اور خاندانی بہبود", "سائنس اور ٹیکنالوجی کی وزارت", "وزارت امور امور اور کھیل" , "وزارت داخلہ" ,"وزارت امور امور اور کھیل"));




       return arrayList;


   }


}
