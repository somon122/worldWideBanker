package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Science {


    private Context context;
    public Q_Science(Context context) {
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
        arrayList.add(new ThreeItemModel("One Horsepower (1 HP) is equivalent to approximately?", "746 Watts"));
        arrayList.add(new ThreeItemModel("Which was the first satellite of India, go into the orbit ?", "Aryabhata"));
        arrayList.add(new ThreeItemModel("In human body ‘Vitamin K’ is necessary for what ?", "Formation of Prothrombin"));
        arrayList.add(new ThreeItemModel("Who discovered the ‘Modern Anthropology’?", "Frederick Sanger"));
        arrayList.add(new ThreeItemModel("‘White Revolution’ is related to what ?", "Milk Production"));
        arrayList.add(new ThreeItemModel("A very successful invention ‘Liquid Oxygen’ discovered by whom?", "Dewar"));
        arrayList.add(new ThreeItemModel("What is the radiant energy of the sun is transmitted?", "Short waves"));
        arrayList.add(new ThreeItemModel("What is the chemical formula of ‘Sodium Hydroxide’ ?", "NAOH"));
        arrayList.add(new ThreeItemModel("Planet ‘Uranus’ was discovered by whom ?", "Hideki Yukawa"));
        arrayList.add(new ThreeItemModel("The Folded Earth book was written by ?", "Anuradha Roy"));
        arrayList.add(new ThreeItemModel("Barometer was invented by?", "F. Banting"));
        arrayList.add(new ThreeItemModel("Which rays is very helpful in Long distance photography ?", "Infra-Red rays"));
        arrayList.add(new ThreeItemModel("In India, who laid the foundation of Nuclear Science ?", "Homi J. Bhabha"));
        arrayList.add(new ThreeItemModel("In Computer, what is the full form of UPS ?", "UPS = Uninterruptable Power Supply"));
        arrayList.add(new ThreeItemModel("Which city is built on more than 100 islands ?", "Venice (capital of northern Italy’s Veneto region"));
        arrayList.add(new ThreeItemModel("Name the scientist who’s discovered the ‘Fahrenheit Scale’?", "Fahrenheit"));
        arrayList.add(new ThreeItemModel("Name of vegetable which is also known as a flower?", "Broccoli"));
        arrayList.add(new ThreeItemModel("Until in 1930, what was the highest structure in the world?", "Eiffel Tower"));
        arrayList.add(new ThreeItemModel("Highest electrical conductivity found in which element ?", "Silver"));
        arrayList.add(new ThreeItemModel("Thermometer made first by?", "Gauss"));
        arrayList.add(new ThreeItemModel("When India Supercomputer ‘PARAM 10000’ was unveiled ?", "In 1998"));
        arrayList.add(new ThreeItemModel("‘Foundations of Biology’ concept given by whom ?", "Jean Piaget"));
        arrayList.add(new ThreeItemModel("Planet Jupiter has how many moons ?", "Jupiter has at least 67 known moons"));
        arrayList.add(new ThreeItemModel("Soda water contains what ?", "Carbon dioxide"));
        arrayList.add(new ThreeItemModel("Stainless Steel invented by whom?", "Harvey"));
        arrayList.add(new ThreeItemModel("Which planet is commonly known as Dwarf Planet ?", "Pluto"));
        arrayList.add(new ThreeItemModel("In 1911 ‘Georges Claude’ invented what ?", "B"));
        arrayList.add(new ThreeItemModel("As of November 2015, which country have most of supercomputers?", "USA (199 Supercomputers)"));
        arrayList.add(new ThreeItemModel("Name the suitable material for purify the water ?", "Zeolites"));

        arrayList.add(new ThreeItemModel("Which gas is most popular as laughing gas?", "Nitrous oxide"));
        arrayList.add(new ThreeItemModel("Electromagnetic Field concept was observed and discovered by whom ?", "James Hargreaves"));
        arrayList.add(new ThreeItemModel("The BrahMos Missile was developed by which country?", "Developed with Joint venture of India and Russia"));
        arrayList.add(new ThreeItemModel("The ‘Concept of Inertia’ was developed by ?", "Galileo"));
        arrayList.add(new ThreeItemModel("For the cultivation, name the crop required of water-logging?", "Rice"));
        arrayList.add(new ThreeItemModel("Who achieved the discovery of ‘Vitamin C’?", "Albert Szent"));
        arrayList.add(new ThreeItemModel("What is the purest form of Iron ?", "Wrought Iron"));
        arrayList.add(new ThreeItemModel("What is the name of NASA Mars Rover and when its landed on MARS?", "Curiosity (Launched on November 26, 2011, Landed on MARS – 6th August 2012)"));
        arrayList.add(new ThreeItemModel("What is the speed of Earth around sun ?", "30 km/sec"));
        arrayList.add(new ThreeItemModel("In our solar system the MARS is fourth planet according to sequences but how many moons has ‘Planet MARS?", "2"));
        arrayList.add(new ThreeItemModel("To measure the Humidity in air, what instrument used ?", "Hygrograph"));
        arrayList.add(new ThreeItemModel("Splitting of light into its constituent colors is known as what ?", "Dispersion"));
        arrayList.add(new ThreeItemModel("Basically the heavy water is used by which type of industries ?", "Nuclear Power Generation plants"));
        arrayList.add(new ThreeItemModel("‘Mechanical Clock’ made by whom ?", "Isaac Newton"));
        arrayList.add(new ThreeItemModel("By which Cotton fibers are made ?", "Cellulose"));
        arrayList.add(new ThreeItemModel("What is the name of the tube which connects the middle ear with the throat?", "Eustachian tube"));
        arrayList.add(new ThreeItemModel("A historical victory achieved by a Spacecraft which got Mars on its First try?", "Mangalyaan (Developed by ISRO, launched on 5 November 2013, Reached – 24 September 2014)"));
        arrayList.add(new ThreeItemModel("What is the best source of Protein ?", "Soybean"));
        arrayList.add(new ThreeItemModel("‘Energy of the Sun’ concept discovered by which scientist ?", "Hans Selye"));
        arrayList.add(new ThreeItemModel("Rate of growth of the plant is measured by which instrument?", "Auxanometer"));

        arrayList.add(new ThreeItemModel("The invention of Electric Flat Iron was successfully by?", "H. C. Urey"));
        arrayList.add(new ThreeItemModel("Optical Phenomenon in the fringe pattern of CD is?", "Interference"));
        arrayList.add(new ThreeItemModel("Celsius and Fahrenheit show the same temperature at?", "40"));
        arrayList.add(new ThreeItemModel("Exchange particle in Quark-Quark Interaction ?", "Gluon"));
        arrayList.add(new ThreeItemModel("The working of a rockets based on the principle of: ?", "Conservation of momentum"));
        arrayList.add(new ThreeItemModel("The pollutants which move downward with percolating groundwater are called?", "Leachates"));
        arrayList.add(new ThreeItemModel("Hasdo Valley in Chhattisgarh is famous for?", "Coal mines"));
        arrayList.add(new ThreeItemModel("Special Theory of Relative was proposed in?", "1905"));
        arrayList.add(new ThreeItemModel("Black hole is an object to be found?", " in the sky"));
        arrayList.add(new ThreeItemModel("IRADIAN is?", "57.3 degree"));
        arrayList.add(new ThreeItemModel("Fraction of volume of ice seen outside when immersed in water?", "10.50%"));
        arrayList.add(new ThreeItemModel("The disease \" bronchitis \" is associated with:?", "Lungs"));
        arrayList.add(new ThreeItemModel("Which colour indicate Highest Temperature?", "Dull red"));
        arrayList.add(new ThreeItemModel("Persons sitting in an artificial satellite of the earth have:?", "Zero weight"));
        arrayList.add(new ThreeItemModel("Light Year is ?", "the distance traveled by light in one year"));
        arrayList.add(new ThreeItemModel("Liquefied petroleum gas (LPG) is mainly a mixture of ?", "propane and butane"));
        arrayList.add(new ThreeItemModel("The Ozone layer lies in the?", "Stratosphere"));
        arrayList.add(new ThreeItemModel("Most of the light rays inside a tube -light is in the form of?", " ultra -violet light"));
        arrayList.add(new ThreeItemModel("Which is the alkalodid that contains in cola drinks ?", "Caffeine"));
        arrayList.add(new ThreeItemModel("The device used for detecting even feeble current: ?", "Galvanoscope"));
        arrayList.add(new ThreeItemModel("Anemometer is an instrument used for measuring?", "Wind speed"));
        arrayList.add(new ThreeItemModel("Due to contraction of eyeball, a long-sighted eye can see only?", "farther objects which is corrected by using concave lens"));
        arrayList.add(new ThreeItemModel("Which one among the following is not correct about Down’s syndrome ?", "Effected individual has early ageing"));
        arrayList.add(new ThreeItemModel("Insects that can transmit diseases to human are referred to as?", "vectors"));
        arrayList.add(new ThreeItemModel("Which of the following diseases are transmitted from one person to another?", "1, 3 and 4 only"));
        arrayList.add(new ThreeItemModel("One of the occupational health hazards commonly faced by the workers of ceramics, pottery and glass industry is ?", "silicosis"));
        arrayList.add(new ThreeItemModel("The anti-malarial drug Quinine is made from a plant. The plant is?", "Cinchona"));
        arrayList.add(new ThreeItemModel("To suspect HIV/AIDS in a young individual, which one among the following symptoms is mostly associated with?", "Chronic diarrhoea"));
        arrayList.add(new ThreeItemModel("Hypertension is the term used for?", "Increase in blood pressure"));
        arrayList.add(new ThreeItemModel("Acute lead poisoning is also known as ?", "Plumbism"));
        arrayList.add(new ThreeItemModel("Oral Rehydration Therapy is recommended for ?", "Cholera"));



        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("কোন গ্যাস হাসির গ্যাস হিসাবে সবচেয়ে বেশি জনপ্রিয়?", "নাইট্রাস অক্সাইড"));
        arrayList.add(new ThreeItemModel("ইলেক্ট্রোম্যাগনেটিক ফিল্ড ধারণাটি কাদের দ্বারা পর্যবেক্ষণ ও আবিষ্কার করা হয়েছে?", "জেমস হারগ্রিভস"));
        arrayList.add(new ThreeItemModel("ব্রহ্মমোস মিসাইলটি কোন দেশ দ্বারা বিকশিত হয়েছিল?", "ভারত এবং রাশিয়ার যৌথ উদ্যোগের সাথে বিকাশ হয়েছে"));
        arrayList.add(new ThreeItemModel("  জড়তার ধারণাটি  তৈরি করেছিলেন?", "গ্যালিলিও"));
        arrayList.add(new ThreeItemModel("চাষের জন্য, জলাবদ্ধতার জন্য প্রয়োজনীয় ফসলের নাম দিন?", "চাল"));
        arrayList.add(new ThreeItemModel("‘ ভিটামিন সি ’কে আবিষ্কার করেছেন?", "অ্যালবার্ট জেজেন্ট"));
        arrayList.add(new ThreeItemModel("আয়রনের বিশুদ্ধতম রূপটি কী?", "রাউন্ড আয়রন"));
        arrayList.add(new ThreeItemModel("নাসা মার্স রোভারের নাম কী এবং এটি মার্সে নেমেছিল কখন?", "কিউরিওসিটি (২ November নভেম্বর, ২০১১, ল্যান্ডডে এমআরএস - August ই আগস্ট ২০১২)"));
        arrayList.add(new ThreeItemModel("সূর্যের চারপাশে পৃথিবীর গতি কত?", "30 কিমি / সেকেন্ড"));
        arrayList.add(new ThreeItemModel("আমাদের সৌরজগতে এমআরএস ক্রম অনুসারে চতুর্থ গ্রহ তবে কতটি চাঁদ রয়েছে‘ প্ল্যানেট এমএআরএস? "," ২ "));
        arrayList.add(new ThreeItemModel("বাতাসের আর্দ্রতা পরিমাপ করতে, কোন উপকরণ ব্যবহার করেছেন?", "হাইড্রোগ্রাফ"));
        arrayList.add(new ThreeItemModel("এর উপাদানগুলির রঙগুলিতে আলোর বিভাজকটি কী হিসাবে পরিচিত?", "ছত্রভঙ্গ"));
        arrayList.add(new ThreeItemModel("মূলত ভারী জল কোন ধরণের শিল্প দ্বারা ব্যবহৃত হয়?", "পারমাণবিক বিদ্যুৎ উত্পাদন কেন্দ্রসমূহ"));
        arrayList.add(new ThreeItemModel(" যান্ত্রিক ঘড়ি  কার তৈরি?", "আইজ্যাক নিউটন"));
        arrayList.add(new ThreeItemModel("কটন তুলনা দ্বারা তৈরি করা হয়?", "সেলুলোজ"));
        arrayList.add(new ThreeItemModel("টিউবটির নাম কী যা মধ্য কানকে গলার সাথে যুক্ত করে?", "ইউস্টাচিয়ান নল"));
        arrayList.add(new ThreeItemModel("একটি মহাকাশযানের মাধ্যমে অর্জন করা একটি historicalতিহাসিক বিজয় যা মঙ্গলকে তার প্রথম প্রয়াসে পেয়েছিল?", "মঙ্গলায়ন (ইসরো দ্বারা বিকাশিত, 5 নভেম্বর 2013-এ চালু হয়েছিল, পৌঁছেছে - 24 সেপ্টেম্বর 2014)"));
        arrayList.add(new ThreeItemModel("প্রোটিনের সেরা উত্স কোনটি?", "সয়াবিন"));
        arrayList.add(new ThreeItemModel("  সূর্যের শক্তি  ধারণাটি কোন বিজ্ঞানী আবিষ্কার করেছিলেন?", "হ্যান্স সেলি"));
        arrayList.add(new ThreeItemModel("উদ্ভিদের বৃদ্ধির হার কোন যন্ত্র দ্বারা পরিমাপ করা হয়?", "অক্সানোমিটার"));
        arrayList.add(new ThreeItemModel("একটি অশ্বশক্তি (1 এইচপি) প্রায়?", "746 ওয়াটস  এর সমান?"));
        arrayList.add(new ThreeItemModel("ভারতের প্রথম উপগ্রহ কোনটি ছিল, কক্ষপথে যেতে?", "আর্যভট্ট"));
        arrayList.add(new ThreeItemModel("মানুষের দেহে‘ ভিটামিন কে ’কীসের জন্য প্রয়োজনীয়?", "প্রথমোম্বিনের গঠন"));
        arrayList.add(new ThreeItemModel("‘ আধুনিক নৃবিজ্ঞান ’কে আবিষ্কার করেছেন?", "ফ্রেডরিক স্যাঙ্গার"));
        arrayList.add(new ThreeItemModel("  শ্বেত বিপ্লব  কিসের সাথে সম্পর্কিত?", "দুধ উত্পাদন"));
        arrayList.add(new ThreeItemModel("একটি অত্যন্ত সফল উদ্ভাবন‘ তরল অক্সিজেন ’কে আবিষ্কার করেছেন?", "দেওয়র"));
        arrayList.add(new ThreeItemModel("সূর্যের তেজস্ক্রিয় শক্তি কী সংক্রমণিত হয়?", "সংক্ষিপ্ত তরঙ্গ"));
        arrayList.add(new ThreeItemModel("‘ সোডিয়াম হাইড্রোক্সাইড ’এর রাসায়নিক সূত্র কী?", "নওহ"));
        arrayList.add(new ThreeItemModel("প্ল্যানেট‘ ইউরেনাস ’কে আবিষ্কার করেছিলেন?", "হিদেকী ইউকোয়া"));
        arrayList.add(new ThreeItemModel("ভাঁজ পৃথিবী বইটি লিখেছিলেন?", "অনুরাধা রায়"));
        arrayList.add(new ThreeItemModel("ব্যারোমিটার আবিষ্কার করেছিলেন?", "এফ বান্টিং"));
        arrayList.add(new ThreeItemModel("দূরত্বের ফটোগ্রাফিতে কোন রশ্মি খুব সহায়ক?", "ইনফ্রা-রেড রে"));
        arrayList.add(new ThreeItemModel("ভারতে পারমাণবিক বিজ্ঞানের ভিত্তি কে স্থাপন করেছিলেন?", "হোমি জে ভাভা"));
        arrayList.add(new ThreeItemModel("কম্পিউটারে, ইউপিএসের পূর্ণ রূপটি কী?", "ইউপিএস = নিরবচ্ছিন্ন বিদ্যুৎ সরবরাহ"));
        arrayList.add(new ThreeItemModel("কোন শহরটি 100 টিরও বেশি দ্বীপে নির্মিত?", "ভেনিস (উত্তর ইতালির ভেনেটো অঞ্চলের রাজধানী"));
        arrayList.add(new ThreeItemModel("বিজ্ঞানীর নাম লিখুন যিনি‘ ফারেনহাইট স্কেল ’আবিষ্কার করেছেন?", "ফারেনহাইট"));
        arrayList.add(new ThreeItemModel("সবজির নাম যা ফুল হিসাবেও পরিচিত?", "ব্রোকলি"));
        arrayList.add(new ThreeItemModel("1930 সাল অবধি বিশ্বের সর্বোচ্চ কাঠামোটি কী ছিল?", "আইফেল টাওয়ার"));
        arrayList.add(new ThreeItemModel("কোন উপাদানটিতে সর্বাধিক বৈদ্যুতিক পরিবাহিতা পাওয়া যায়?", "রৌপ্য"));
        arrayList.add(new ThreeItemModel("থার্মোমিটার আগে তৈরি?", "গৌস"));
        arrayList.add(new ThreeItemModel("যখন ভারত সুপার কম্পিউটার‘ পারম 10000 ’প্রকাশিত হয়েছিল?", "1998 সালে"));
        arrayList.add(new ThreeItemModel("‘ জীববিজ্ঞানের ফাউন্ডেশনস ’ধারণাটি কার দ্বারা প্রদত্ত?", "জিন পাইগেট"));
        arrayList.add(new ThreeItemModel("গ্রহ বৃহস্পতির কত চাঁদ আছে?", "বৃহস্পতির কমপক্ষে 67 টি চাঁদ রয়েছে"));
        arrayList.add(new ThreeItemModel("সোডা জলে কী থাকে?", "কার্বন ডাই অক্সাইড"));
        arrayList.add(new ThreeItemModel("স্টেইনলেস স্টিল কার দ্বারা উদ্ভাবিত?", "হার্ভে"));
        arrayList.add(new ThreeItemModel("কোন গ্রহটি সাধারণত বামন গ্রহ হিসাবে পরিচিত?", "প্লুটো"));
        arrayList.add(new ThreeItemModel("1911 সালে‘ জর্জেস ক্লড ’কী আবিষ্কার করেছিল?", "বি"));
        arrayList.add(new ThreeItemModel("নভেম্বর ২০১৫ অবধি কোন দেশে বেশিরভাগ সুপার কম্পিউটার রয়েছে?", "ইউএসএ (১৯৯৯ সুপার কম্পিউটার)"));
        arrayList.add(new ThreeItemModel("জল বিশুদ্ধ করার উপযুক্ত উপকরণের নাম বলুন?", "জেলিওাইটস"));
        arrayList.add(new ThreeItemModel("বৈদ্যুতিক ফ্ল্যাট আয়রনের উদ্ভাবন সফলভাবে হয়েছিল?", "এইচ। সি। ইউরি"));
        arrayList.add(new ThreeItemModel("সিডির সীমানা বিন্যাসে অপটিক্যাল ফেনোমেনন?", "হস্তক্ষেপ"));
        arrayList.add(new ThreeItemModel("সেলসিয়াস এবং ফারেনহাইট একই তাপমাত্রাটি দেখায়?", "40"));
        arrayList.add(new ThreeItemModel("কোয়ার্ক-কোয়ার্ক মিথস্ক্রিয়ায় কণা বিনিময়?", "গ্লুন"));
        arrayList.add(new ThreeItemModel(": রকেট এর নীতির উপর ভিত্তি করে কাজ করা:?", "গতির সংরক্ষণ"));
        arrayList.add(new ThreeItemModel("দূষিত ভূগর্ভস্থ জলের সাথে যে দূষকগুলি নীচের দিকে অগ্রসর হয় তাদেরকে কি বলা হয়?", "লেচাটেস"));
        arrayList.add(new ThreeItemModel("ছত্তিসগড়ের হাসডো উপত্যকা বিখ্যাত?", "কয়লা খনি"));
        arrayList.add(new ThreeItemModel("সম্পর্কিত থিওরি অফ রিলেটিভ প্রস্তাবিত হয়েছিল?", "1905"));
        arrayList.add(new ThreeItemModel("ব্ল্যাকহোল কি একটি বস্তু খুঁজে পাওয়া যায়?", "আকাশে"));
        arrayList.add(new ThreeItemModel("ইরানী কি?", "57.3 ডিগ্রি"));
        arrayList.add(new ThreeItemModel("পানিতে নিমগ্ন অবস্থায় বাইরে বরফের পরিমাণের ভগ্নাংশ দেখা যায়?", "10.50%"));
        arrayList.add(new ThreeItemModel("রোগ   ব্রঙ্কাইটিস  এর সাথে সম্পর্কিত:?", "ফুসফুস"));
        arrayList.add(new ThreeItemModel("কোন রঙ সর্বোচ্চ তাপমাত্রা নির্দেশ করে?", "নিস্তেজ লাল"));
        arrayList.add(new ThreeItemModel("পৃথিবীর কৃত্রিম উপগ্রহে বসে থাকা ব্যক্তির রয়েছে :?", "শূন্য ওজন"));
        arrayList.add(new ThreeItemModel("আলোকবর্ষটি হল?", "দূরত্বটি এক বছরে আলোক দ্বারা ভ্রমণ"));
        arrayList.add(new ThreeItemModel("তরল পেট্রোলিয়াম গ্যাস (এলপিজি) মূলত?", "প্রোপেন এবং বুটেন  এর মিশ্রণ?"));
        arrayList.add(new ThreeItemModel("ওজোন স্তরটি এর মধ্যে রয়েছে?", "স্ট্র্যাটোস্ফিয়ার"));
        arrayList.add(new ThreeItemModel("একটি নল-আলোতে বেশিরভাগ আলোক রশ্মি??", "অতি-বেগুনি আলো  আকারে হয়?"));
        arrayList.add(new ThreeItemModel("কোলা পানীয়তে থাকা ক্ষারকটি কোনটি?", "ক্যাফিন"));
        arrayList.add(new ThreeItemModel("এমনকি দুর্বল কারেন্ট সনাক্ত করার জন্য ব্যবহৃত ডিভাইস:?", "গ্যালভানোস্কোপ"));
        arrayList.add(new ThreeItemModel("অ্যানোমিটার পরিমাপের জন্য ব্যবহৃত একটি সরঞ্জাম?", "বাতাসের গতি"));
        arrayList.add(new ThreeItemModel("চোখের বলের সংকোচনের কারণে, দীর্ঘ-দর্শনীয় চোখ কেবল দেখতে পাবে?", "আরও দীর্ঘ অবজেক্ট যা অবতল লেন্স ব্যবহার করে সংশোধন করা হয়েছে"));
        arrayList.add(new ThreeItemModel("ডাউনসের সিনড্রোম সম্পর্কে নিম্নলিখিতগুলির মধ্যে কোনটি সঠিক নয়?", "প্রভাবিত ব্যক্তির বয়স বৃদ্ধির প্রথম দিকে"));
        arrayList.add(new ThreeItemModel("পোকামাকড় যা মানুষের মধ্যে রোগের সংক্রমণ করতে পারে তাদেরকে?", "ভেক্টর  হিসাবে উল্লেখ করা হয়"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত রোগগুলির মধ্যে কোনটি একজনের থেকে অন্য ব্যক্তিতে সংক্রমণ হয়?", "কেবল 1, 3 এবং 4"));
        arrayList.add(new ThreeItemModel("সিরামিক, মৃৎশিল্প এবং গ্লাস শিল্পের শ্রমিকরা সাধারণত পেশাগত স্বাস্থ্যের এক ঝুঁকির মুখোমুখি?", "সিলিকোসিস"));
        arrayList.add(new ThreeItemModel("ম্যানারি অ্যান্টি-ম্যালেরিয়াল ড্রাগ কুইনাইন একটি উদ্ভিদ থেকে তৈরি। উদ্ভিদটি?", "সিনচোনা"));
        arrayList.add(new ThreeItemModel("একজন অল্প বয়স্ক ব্যক্তির মধ্যে এইচআইভি / এইডস সন্দেহ করার জন্য, নিম্নলিখিত লক্ষণগুলির মধ্যে কোনটির সাথে বেশিরভাগ জড়িত?", "দীর্ঘস্থায়ী ডায়রিয়া"));
        arrayList.add(new ThreeItemModel("উচ্চ রক্তচাপ শব্দটি ব্যবহার করা হয়?", "রক্তচাপ বৃদ্ধি"));
        arrayList.add(new ThreeItemModel("তীব্র সীসাজনিত বিষ হিসাবে পরিচিত?", "প্লাম্বিজম"));
        arrayList.add(new ThreeItemModel("ওরাল রিহাইড্রেশন থেরাপির জন্য সুপারিশ করা হয়?", "কলেরা"));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("हँसाने वाली गैस के रूप में कौन सी गैस सबसे लोकप्रिय है?", "नाइट्रस ऑक्साइड"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रोमैग्नेटिक फील्ड कॉन्सेप्ट देखा और किसके द्वारा खोजा गया था?", "जेम्स हरग्रेव्स"));
        arrayList.add(new ThreeItemModel("ब्रह्मोस मिसाइल किस देश द्वारा विकसित की गई थी?", "भारत और रूस के संयुक्त उद्यम के साथ विकसित"));
        arrayList.add(new ThreeItemModel("Ia कॉन्सेप्ट ऑफ इनर्टिया 'किसके द्वारा विकसित किया गया था?" , "गैलीलियो"));
        arrayList.add(new ThreeItemModel("खेती के लिए, जल जमाव के लिए आवश्यक फसल का नाम बताएं?", "चावल"));
        arrayList.add(new ThreeItemModel("C विटामिन सी 'की खोज किसने हासिल की?" , "अल्बर्ट सजेंट"));
        arrayList.add(new ThreeItemModel("आयरन का शुद्ध रूप क्या है?", "आयरन"));
        arrayList.add(new ThreeItemModel("नासा मार्स रोवर का नाम क्या है और जब मार्स पर उतरा है?" , "जिज्ञासा (26 नवंबर 2011 को लॉन्च किया गया, MARS पर उतरा - 6 अगस्त 2012)"));
        arrayList.add(new ThreeItemModel("सूर्य के चारों ओर पृथ्वी की गति क्या है?", "30 किमी / सेकंड"));
        arrayList.add(new ThreeItemModel("हमारे सौर मंडल में अनुक्रमों के अनुसार MARS चौथा ग्रह है लेकिन कितने चंद्रमाओं में MAR Planet MARS है?", ""));
        arrayList.add(new ThreeItemModel("हवा में आर्द्रता को मापने के लिए, किस उपकरण का उपयोग किया गया है?", "हयग्रीग्राफ"));
        arrayList.add(new ThreeItemModel("इसके घटक रंगों में प्रकाश के विभाजन को क्या कहा जाता है?", "फैलाव"));
        arrayList.add(new ThreeItemModel("मूल रूप से भारी जल का उपयोग किस प्रकार के उद्योगों द्वारा किया जाता है?", "परमाणु ऊर्जा उत्पादन संयंत्र"));
        arrayList.add(new ThreeItemModel("  मैकेनिकल क्लॉक 'किसके द्वारा बनाई गई? "," आइजैक न्यूटन "));
        arrayList.add(new ThreeItemModel("जिसके द्वारा कपास के रेशे बनाए जाते हैं?", "सेलूलोज़"));
        arrayList.add(new ThreeItemModel("ट्यूब का नाम क्या है जो मध्य कान को गले से जोड़ता है?", "यूस्टेशियन ट्यूब"));
        arrayList.add(new ThreeItemModel("एक अंतरिक्ष यान द्वारा हासिल की गई एक ऐतिहासिक जीत, जिसे मंगल ने अपनी पहली कोशिश में हासिल किया था?", "मंगलयान (ISRO द्वारा विकसित, 5 नवंबर 2013 को लॉन्च किया गया, पहुंच गया - 24 सितंबर 2014)"));
        arrayList.add(new ThreeItemModel("प्रोटीन का सबसे अच्छा स्रोत क्या है?", "सोयाबीन"));
        arrayList.add(new ThreeItemModel("Scient एनर्जी ऑफ़ द सन 'की अवधारणा किस वैज्ञानिक द्वारा खोजी गई?", "हंस स्लेइ"));
        arrayList.add(new ThreeItemModel("पौधे की वृद्धि की दर किस यंत्र द्वारा मापी जाती है?", "औक्सनोमीटर"));
        arrayList.add(new ThreeItemModel("वन हॉर्सपावर (1 एचपी) लगभग बराबर है?", "746 वाट"));
        arrayList.add(new ThreeItemModel("भारत का पहला उपग्रह कौन सा था, कक्षा में गया?", "आर्यभट्ट"));
        arrayList.add(new ThreeItemModel("मानव शरीर में 'विटामिन K' किसके लिए आवश्यक है?", "प्रोथ्रॉम्बिन का निर्माण"));
        arrayList.add(new ThreeItemModel("आधुनिक मानव विज्ञान की खोज किसने की?", "फ्रेडरिक सेंगर"));
        arrayList.add(new ThreeItemModel(", श्वेत क्रांति 'किससे संबंधित है?", "दूध उत्पादन"));
        arrayList.add(new ThreeItemModel("एक बहुत ही सफल आविष्कार successful तरल ऑक्सीजन 'किसके द्वारा खोजा गया?", "देवर"));
        arrayList.add(new ThreeItemModel("सूर्य की उज्ज्वल ऊर्जा क्या संचरित होती है?", "लघु तरंगें"));
        arrayList.add(new ThreeItemModel("सोडियम हाइड्रॉक्साइड 'का रासायनिक सूत्र क्या है?", "NAOH"));
        arrayList.add(new ThreeItemModel("प्लैनेट  यूरेनस  िसके द्वारा खोजा गया था? "," हिदेकी युकावा "));
        arrayList.add(new ThreeItemModel("द फोल्डेड अर्थ बुक द्वारा लिखा गया था?", "अनुराधा रॉय"));
        arrayList.add(new ThreeItemModel("बैरोमीटर का आविष्कार किसने किया?", "एफ। बैंटिंग"));
        arrayList.add(new ThreeItemModel("लंबी दूरी की फोटोग्राफी में कौन सी किरणें बहुत सहायक होती हैं?", "इंफ्रा-रेड किरणें"));
        arrayList.add(new ThreeItemModel("भारत में, जिन्होंने परमाणु विज्ञान की नींव रखी?", "होमी जे। भाभा"));
        arrayList.add(new ThreeItemModel("कंप्यूटर में, यूपीएस का पूर्ण रूप क्या है?", "यूपीएस = निर्बाध विद्युत आपूर्ति"));
        arrayList.add(new ThreeItemModel("कौन सा शहर 100 से अधिक द्वीपों पर बना है?", "वेनिस (उत्तरी इटली के वेनेटो क्षेत्र की राजधानी)"));
        arrayList.add(new ThreeItemModel("उस वैज्ञानिक का नाम बताइए जिसने 'फारेनहाइट स्केल' की खोज की है?", "फ़ारेनहाइट"));
        arrayList.add(new ThreeItemModel("सब्जी का नाम जिसे फूल के रूप में भी जाना जाता है?", "ब्रोकोली"));
        arrayList.add(new ThreeItemModel("1930 तक, दुनिया में सबसे ऊंची संरचना क्या थी?", "एफिल टॉवर"));
        arrayList.add(new ThreeItemModel("उच्चतम विद्युत चालकता किस तत्व में पाई जाती है?", "सिल्वर"));
        arrayList.add(new ThreeItemModel("थर्मामीटर पहले बना?", "गॉस"));
        arrayList.add(new ThreeItemModel("जब भारत सुपर कंप्यूटर AM PARAM 10000 'का अनावरण किया गया?", "1998 में"));
        arrayList.add(new ThreeItemModel("’ बायोलॉजी का आधार 'अवधारणा किसके द्वारा दी गई है? "," जीन पियागेट "));
        arrayList.add(new ThreeItemModel("ग्रह बृहस्पति के पास कितने चंद्रमा हैं?", "बृहस्पति में कम से कम 67 ज्ञात चंद्रमा हैं"));
        arrayList.add(new ThreeItemModel("सोडा पानी में क्या होता है?", "कार्बन डाइऑक्साइड"));
        arrayList.add(new ThreeItemModel("स्टेनलेस स्टील का आविष्कार किसके द्वारा किया गया?", "हार्वे"));
        arrayList.add(new ThreeItemModel("किस ग्रह को आमतौर पर बौना ग्रह के रूप में जाना जाता है?" , "प्लूटो"));
        arrayList.add(new ThreeItemModel("1911 में 'जार्ज क्लाउड' ने क्या आविष्कार किया?", "बी"));
        arrayList.add(new ThreeItemModel("नवंबर 2015 तक, किस देश में अधिकांश सुपर कंप्यूटर हैं?", "यूएसए (199 सुपर कंप्यूटर)"));
        arrayList.add(new ThreeItemModel("पानी को शुद्ध करने के लिए उपयुक्त सामग्री का नाम बताएं?", "ज़ोलाइट्स"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रिक फ्लैट आयरन का आविष्कार सफलतापूर्वक किया गया था?", "एच। सी। उरे"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रिक फ्लैट आयरन का आविष्कार सफलतापूर्वक किया गया था?", "एच। सी। उरे"));
        arrayList.add(new ThreeItemModel("सेल्सियस और फ़ारेनहाइट समान तापमान दिखाते हैं?", "40"));
        arrayList.add(new ThreeItemModel("क्वार्क-क्वार्क इंटरैक्शन में एक्सचेंज पार्टिकल?", "ग्लोन"));
        arrayList.add(new ThreeItemModel("एक सिद्धांत के आधार पर रॉकेट का काम?", "संवेग का संरक्षण"));
        arrayList.add(new ThreeItemModel("जो प्रदूषक भूजल के साथ नीचे की ओर बढ़ते हैं, उन्हें कहा जाता है?", "लीचेटेस"));
        arrayList.add(new ThreeItemModel("छत्तीसगढ़ में हसदो घाटी किसके लिए प्रसिद्ध है?", "कोल माइंस"));
        arrayList.add(new ThreeItemModel("विशेष थ्योरी ऑफ़ रिलेटिव प्रस्तावित किया गया था?", "1905"));
        arrayList.add(new ThreeItemModel("ब्लैक होल पाया जाना एक वस्तु है?", "आकाश में"));
        arrayList.add(new ThreeItemModel("इराडियन है?", "57.3 डिग्री"));
        arrayList.add(new ThreeItemModel("पानी में डूबने पर बाहर दिखाई देने वाली बर्फ की मात्रा का अंश?", "10.50%"));
        arrayList.add(new ThreeItemModel("रोग   ब्रोंकाइटिस  के साथ जुड़ा हुआ है:", "फेफड़े"));
        arrayList.add(new ThreeItemModel("कौन सा रंग उच्चतम तापमान दर्शाता है?", "सुस्त लाल"));
        arrayList.add(new ThreeItemModel("पृथ्वी के एक कृत्रिम उपग्रह में बैठे व्यक्तियों में है:?", "शून्य भार"));
        arrayList.add(new ThreeItemModel("प्रकाश वर्ष है?", "प्रकाश द्वारा एक वर्ष में तय की गई दूरी"));
        arrayList.add(new ThreeItemModel("तरलीकृत पेट्रोलियम गैस (एलपीजी) मुख्य रूप से मिश्रण है?", "प्रोपेन और ब्यूटेन"));
        arrayList.add(new ThreeItemModel("ओजोन परत निहित है?", "स्ट्रैटोस्फियर"));
        arrayList.add(new ThreeItemModel("ट्यूबलाइट के अंदर अधिकांश प्रकाश किरणें किसके रूप में होती हैं?", "अल्ट्रावायलेट लाइट"));
        arrayList.add(new ThreeItemModel("कोका ड्रिंक्स में कौन सा एल्केलाइड होता है?", "कैफीन"));
        arrayList.add(new ThreeItemModel("डिवाइस का उपयोग कर का पता लगाने के लिए भी कमजोर वर्तमान:", "गैल्वेनोस्कोप"));
        arrayList.add(new ThreeItemModel("एनेमोमीटर एक उपकरण है जिसका उपयोग मापने के लिए किया जाता है?", "पवन की गति"));
        arrayList.add(new ThreeItemModel("नेत्रगोलक के संकुचन के कारण, एक लंबे समय से दिखाई देने वाली आंख केवल देख सकती है?", "दूर की वस्तुएं जो अवतल लेंस का उपयोग करके ठीक की जाती हैं"));
        arrayList.add(new ThreeItemModel("डाउन सिंड्रोम के बारे में निम्नलिखित में से कौन सा सही नहीं है?", "सफल व्यक्ति की उम्र बढ़ने की जल्दी होती है"));
        arrayList.add(new ThreeItemModel("वे कीड़े जो मानव में बीमारियों को प्रसारित कर सकते हैं, उन्हें कहा जाता है?", "वैक्टर"));
        arrayList.add(new ThreeItemModel("निम्न में से कौन सी बीमारी एक व्यक्ति से दूसरे व्यक्ति में फैलती है?", "1, 3 और 4 केवल"));
        arrayList.add(new ThreeItemModel("सिरेमिक, मिट्टी के बर्तनों और कांच उद्योग के श्रमिकों द्वारा सामना किए जाने वाले व्यावसायिक स्वास्थ्य खतरों में से एक है?", ""));
        arrayList.add(new ThreeItemModel("मलेरिया रोधी दवा क्विनिन एक पौधे से बनाई जाती है। पौधा है?", "सिनकोना"));
        arrayList.add(new ThreeItemModel("एक युवा व्यक्ति में एचआईवी / एड्स पर संदेह करने के लिए, निम्नलिखित लक्षणों में से कौन सा ज्यादातर के साथ जुड़ा हुआ है?", "क्रोनिक दस्त"));
        arrayList.add(new ThreeItemModel("उच्च रक्तचाप शब्द का उपयोग किसके लिए किया जाता है?", "रक्तचाप में वृद्धि"));
        arrayList.add(new ThreeItemModel("एक्यूट लेड पॉइजनिंग के रूप में भी जाना जाता है?", "प्लम्बिज़्म"));
        arrayList.add(new ThreeItemModel("हैजा रिहाइड्रेशन थेरेपी की सिफारिश की जाती है?", "हैजा"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("کون سی گیس ہنسنے والی گیس کے طور پر سب سے زیادہ مشہور ہے؟" , "نائٹروس آکسائڈ"));
        arrayList.add(new ThreeItemModel("برقی مقناطیسی فیلڈ کا تصور کس نے دیکھا اور دریافت کیا؟" , "جیمز ہارگریواس"));
        arrayList.add(new ThreeItemModel("برہموس میزائل کس ملک نے تیار کیا؟" , "ہندوستان اور روس کے مشترکہ منصوبے کے ساتھ تیار ہوا"));
        arrayList.add(new ThreeItemModel("'جڑتا کا تصور' تیار کیا گیا تھا؟" , "گیلیلیو"));
        arrayList.add(new ThreeItemModel("کاشت کے ل water ، اس فصل کا نام بتائیں جو پانی سے گزرنے کی ضرورت ہے؟" , "چاول"));
        arrayList.add(new ThreeItemModel("کس نے’ وٹامن سی ‘کی دریافت حاصل کی؟", "سینٹ البرٹ"));
        arrayList.add(new ThreeItemModel("آئرن کی خالص ترین شکل کیا ہے؟" , "آئرن لوہا"));
        arrayList.add(new ThreeItemModel("ناسا مارس روور کا نام کیا ہے اور جب یہ MARS پر اترا ہے؟" , "تجسس (26 نومبر ، 2011 کو لانچ کیا گیا ، مارس پر لایا گیا - 6 اگست 2012)"));
        arrayList.add(new ThreeItemModel("سورج کے گرد زمین کی رفتار کتنی ہے؟" , "30 کلومیٹر فی سیکنڈ"));
        arrayList.add(new ThreeItemModel("ہمارے نظام شمسی میں MARS ترتیب کے مطابق چوتھا سیارہ ہے لیکن کتنے چاند لگے ہیں جن میں’ سیارے کا نشان؟ “ ،  "  ,"ہمارے نظام شمسی میں " ));
        arrayList.add(new ThreeItemModel("ہوا میں نمی کی پیمائش کے ل what ، کون سا آلہ استعمال ہوا؟" , "ہائگروگراف"));
        arrayList.add(new ThreeItemModel("روشنی کو اس کے بنیادی رنگوں میں تقسیم کرنا کس چیز کے نام سے جانا جاتا ہے؟" , "بازی"));
        arrayList.add(new ThreeItemModel("بنیادی طور پر بھاری پانی کس قسم کی صنعتوں کے ذریعہ استعمال ہوتا ہے؟" , "نیوکلیئر پاور جنریشن پلانٹس"));
        arrayList.add(new ThreeItemModel("مکینیکل گھڑی کس نے بنائی ہے؟", "آئزک نیوٹن"));
        arrayList.add(new ThreeItemModel("کپاس کے ریشے کس کے ذریعہ بنائے جاتے ہیں؟" ,"سیلولوز"));
        arrayList.add(new ThreeItemModel("اس ٹیوب کا کیا نام ہے جو درمیانی کان کو گلے سے جوڑتا ہے؟" , "یوسٹاشیئن ٹیوب"));
        arrayList.add(new ThreeItemModel("خلائی جہاز کے ذریعہ حاصل ہونے والی ایک تاریخی فتح جس نے مریخ کو اپنی پہلی کوشش پر حاصل کیا؟" , "منگلیان (اسرو کے ذریعہ تیار کردہ ، 5 نومبر 2013 کو شروع کیا گیا ، پہنچ گیا - 24 ستمبر 2014)"));
        arrayList.add(new ThreeItemModel("پروٹین کا بہترین ذریعہ کیا ہے؟" ,"سویا بین"));
        arrayList.add(new ThreeItemModel("توانائی کا سورج تصور کس سائنس دان نے دریافت کیا؟", "ہنس سیلی"));
        arrayList.add(new ThreeItemModel("پودوں کی افزائش کی شرح کو کس آلے سے ماپا جاتا ہے؟" , "آکسانوومیٹر"));
        arrayList.add(new ThreeItemModel("ایک ہارس پاور (1 HP) تقریبا approximately برابر ہے؟" , "746 واٹس"));
        arrayList.add(new ThreeItemModel("ہندوستان کا پہلا مصنوعی سیارہ کون سا تھا ، مدار میں چلے جانا؟","آریا بھٹا"));
        arrayList.add(new ThreeItemModel("انسانی جسم میں‘ وٹامن کے ’کس چیز کے لئے ضروری ہے؟" , "پروتھروبن کی تشکیل"));
        arrayList.add(new ThreeItemModel("جدید ماہر بشریات کو کس نے دریافت کیا؟", "فریڈرک سنجر"));
        arrayList.add(new ThreeItemModel("سفید انقلاب کا تعلق کس سے ہے؟", "دودھ کی پیداوار"));
        arrayList.add(new ThreeItemModel("ایک بہت ہی کامیاب ایجاد‘ مائع آکسیجن ’کس نے دریافت کیا؟" , "دیور"));
        arrayList.add(new ThreeItemModel("سورج کی روشنی والی توانائی کیا ہے؟" , "مختصر لہریں"));
        arrayList.add(new ThreeItemModel("’ سوڈیم ہائڈرو آکسائیڈ ‘کا کیمیائی فارمولا کیا ہے؟", "این او او ایچ"));
        arrayList.add(new ThreeItemModel("سیارہ‘ یورینس ’کس نے دریافت کیا؟" , "ہیڈکی یوکاوا"));
        arrayList.add(new ThreeItemModel("فولڈ ارتھ کتاب کتاب لکھی تھی؟" ,"انورادھا رائے"));
        arrayList.add(new ThreeItemModel("بیرومیٹر ایجاد ہوا تھا؟" , "ایف. بینٹنگ"));
        arrayList.add(new ThreeItemModel("لمبی فاصلے کی فوٹو گرافی میں کون سی کرنیں بہت مددگار ہیں؟" , "انفرا ریڈ کرنیں"));
        arrayList.add(new ThreeItemModel("ہندوستان میں ، جوہری سائنس کی بنیاد کس نے رکھی؟" , "ہومی جے بھابھا"));
        arrayList.add(new ThreeItemModel("کمپیوٹر میں ، UPS کی مکمل شکل کیا ہے؟" , "UPS = بلاتعطل بجلی کی فراہمی"));
        arrayList.add(new ThreeItemModel("کون سا شہر 100 سے زیادہ جزیروں پر بنایا گیا ہے؟" , "وینس (شمالی اٹلی کے وینیٹو خطے کا دارالحکومت"));
        arrayList.add(new ThreeItemModel("اس سائنس دان کا نام بتائیں جس نے’ فارن ہائیٹ اسکیل ‘دریافت کیا؟", "فارن ہائیٹ"));
        arrayList.add(new ThreeItemModel("سبزی کا نام جو پھول کے نام سے بھی جانا جاتا ہے؟" , "بروکولی"));
        arrayList.add(new ThreeItemModel("1930 تک ، دنیا کا سب سے اونچا ڈھانچہ کون سا تھا؟" , "ایفل ٹاور"));
        arrayList.add(new ThreeItemModel("سب سے زیادہ برقی چالکتا کس عنصر میں پائی گئی؟" ,"سلور"));
        arrayList.add(new ThreeItemModel("تھرمامیٹر سب سے پہلے بنایا گیا؟", "گاوس"));
        arrayList.add(new ThreeItemModel("جب انڈیا سپر کمپیوٹر‘ پیرم 10000 ‘کی نقاب کشائی ہوئی تھی؟" , "1998 میں"));
        arrayList.add(new ThreeItemModel("حیاتیات کے تصور کی بنیادیں کس کے ذریعہ دی گئیں؟", "جین پیجٹ"));
        arrayList.add(new ThreeItemModel("سیارہ مشتری میں کتنے چاند ہیں؟" , "مشتری میں کم از کم 67 مشہور چاند ہیں"));
        arrayList.add(new ThreeItemModel("سوڈا پانی میں کیا ہوتا ہے؟" , "کاربن ڈائی آکسائیڈ"));
        arrayList.add(new ThreeItemModel("سٹینلیس اسٹیل کی ایجاد کس نے کی؟" , "ہاروی"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ بونے سیارے کے نام سے جانا جاتا ہے؟" , "پلوٹو"));
        arrayList.add(new ThreeItemModel("1911 میں‘ جارجز کلاڈ ’نے ایجاد کیا؟" , "بی"));
        arrayList.add(new ThreeItemModel("نومبر 2015 تک ، کس ملک میں زیادہ تر سپر کمپیوٹر موجود ہیں؟" , "USA (199 سپر کمپیوٹر)"));
        arrayList.add(new ThreeItemModel("پانی کو صاف کرنے کے لئے موزوں مواد کا نام بتائیں؟" , "زیلوٹس"));
        arrayList.add(new ThreeItemModel("الیکٹرک فلیٹ آئرن کی ایجاد کامیابی کے ساتھ ہوئی؟" , "H. C. Urey"));
        arrayList.add(new ThreeItemModel("سی ڈی کے نچلے انداز میں آپٹیکل فینیومن ہے؟" , "مداخلت"));
        arrayList.add(new ThreeItemModel("سیلسیس اور فارن ہائیٹ ایک ہی درجہ حرارت پر دکھاتے ہیں؟" , "40"));
        arrayList.add(new ThreeItemModel("کوارک - کوارک انٹرایکشن میں پارٹیکل ایکسچینج؟", "گلوون"));
        arrayList.add(new ThreeItemModel("راکٹوں کا کام اس اصول پر مبنی ہے کہ:؟" , "رفتار کا تحفظ"));
        arrayList.add(new ThreeItemModel("آلودگی والے جو زمینی پانی کے ساتھ نیچے کی طرف جاتے ہیں کہا جاتا ہے؟" , "لیچٹیٹس"));
        arrayList.add(new ThreeItemModel("چھتیس گڑھ میں وادی ہسدو مشہور ہے؟" , "کوئلے کی کان"));
        arrayList.add(new ThreeItemModel("رشتہ داروں کی خصوصی تھیوری تجویز کی گئی تھی؟" , "1905"));
        arrayList.add(new ThreeItemModel("بلیک ہول ایک ایسی چیز ہے جس کو ملنا ہے؟" , "آسمان میں"));
        arrayList.add(new ThreeItemModel("ارادیئن ہے؟" , "57.3 ڈگری"));
        arrayList.add(new ThreeItemModel("پانی میں ڈوبنے پر باہر کی برف کا حجم کا تھوڑا سا حصہ؟" , "10.50٪"));
        arrayList.add(new ThreeItemModel("بیماری برونکائٹس اس سے وابستہ ہے:؟" , "پھیپھڑوں"));
        arrayList.add(new ThreeItemModel("بیماری برونکائٹس اس سے وابستہ ہے:؟" ,"پھیپھڑوں"));
        arrayList.add(new ThreeItemModel("زمین کے مصنوعی سیٹلائٹ میں بیٹھے ہوئے افراد کے پاس:؟" , "زیرو وزن"  ));
        arrayList.add(new ThreeItemModel("روشنی سال ہے؟" , "ایک سال میں روشنی کے ذریعے فاصلہ طے کیا"));
        arrayList.add(new ThreeItemModel("مائع پٹرولیم گیس (ایل پی جی) بنیادی طور پر مرکب ہے؟" , "پروپین اور بیوٹین"));
        arrayList.add(new ThreeItemModel("اوزون کی پرت پوشیدہ ہے؟", "اسٹراٹوسفیر"));
        arrayList.add(new ThreeItemModel("ٹیوب لائٹ کے اندر زیادہ تر روشنی کی کرنیں کی شکل میں ہوتی ہیں؟" ,"الٹرا وایلیٹ لائٹ"));
        arrayList.add(new ThreeItemModel("کونسا الکروڈائڈ ہے جس میں کولا ڈرنکس ہوتا ہے؟" ,"کیفین"));
        arrayList.add(new ThreeItemModel("یہاں تک کہ ناقص موجودہ کی کھوج کے لئے استعمال ہونے والا آلہ:؟", "گیلوانوسکوپ"));
        arrayList.add(new ThreeItemModel("انومیومیٹر ایک ایسا آلہ ہے جو پیمائش کے ل used استعمال ہوتا ہے؟" , "ہوا کی رفتار"));
        arrayList.add(new ThreeItemModel("آئی بال کے سنکچن کی وجہ سے ، ایک لمبی نظر والی آنکھ ہی دیکھ سکتی ہے؟" , "بعید کی چیزیں جو محدب عینک کا استعمال کرکے درست کردی جاتی ہیں۔"));
        arrayList.add(new ThreeItemModel("ڈاؤن سنڈروم کے بارے میں مندرجہ ذیل میں سے کون سا صحیح نہیں ہے؟" , "متاثرہ فرد کی عمر بڑھاپے ہو جاتی ہے"));
        arrayList.add(new ThreeItemModel("ایسے کیڑے جو انسانوں میں بیماریوں کو منتقل کرسکتے ہیں انھیں حوالہ دیا جاتا ہے؟" , "ویکٹر"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سی بیماریاں ایک شخص سے دوسرے میں منتقل ہوتی ہیں؟" , "صرف 1 ، 3 اور 4"));
        arrayList.add(new ThreeItemModel("عام طور پر سیرامکس ، مٹی کے برتنوں اور شیشوں کی صنعت کے کارکنوں کو پیشہ ورانہ صحت کے خطرات میں سے ایک ہے؟" , "سلیکوسس"));
        arrayList.add(new ThreeItemModel("اینٹی ملیرائی دوائی کوئینا پودے سے تیار کی گئی ہے۔ پلانٹ ہے؟" , "سنچونا"));
        arrayList.add(new ThreeItemModel("کسی نوجوان فرد میں ایچ آئ وی / ایڈز پر شک کرنے کے لئے ، مندرجہ ذیل علامات میں سے کون سا زیادہ تر سے وابستہ ہے؟" , "دائمی اسہال"));
        arrayList.add(new ThreeItemModel("ہائی بلڈ پریشر اصطلاح کے لئے استعمال ہوتا ہے؟" , "بلڈ پریشر میں اضافہ"));
        arrayList.add(new ThreeItemModel("شدید لیڈ زہر کو بھی کہا جاتا ہے؟" , "پلمبزم"));
        arrayList.add(new ThreeItemModel("زبانی ریہائیڈریشن تھراپی کی سفارش کی جاتی ہے؟" , "ہیضہ"));

        return arrayList;
    }


}
