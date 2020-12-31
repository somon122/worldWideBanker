package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_EnvironmentalScience {

    private Context context;
    public Q_EnvironmentalScience(Context context) {
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

        arrayList.add(new ThreeItemModel("Famous environmentalist Sunderlal Bahuguna is associated with which movement?\n\n(A). Save Silent Valley\n(B). Narmada Bachao\n(C). Chipko Movement\n(D). Jhola Andolan\n", "(C). Chipko Movement"));
        arrayList.add(new ThreeItemModel("Who designed the Indian Parliament in New Delhi?\n\n(A). Gustave Eiffel\n(B). Le Corbusier\n(C). Edwin Landseer Lutyens\n(D). Bonanno Pisano\n", "(C). Edwin Landseer Lutyens"));
        arrayList.add(new ThreeItemModel("Who among the following chairs the National Board for Wildlife (NBWL) in India?\n\n(A). Prime Minister\n(B). Ministry of Environment and Forest\n(C). Environment Secretary\n(D). A renowned environmentalist of the country\n", "(A). Prime Minister"));
        arrayList.add(new ThreeItemModel("Which Animal has largest brain is the world?\n\n(A). Dolphin\n(B). Octopus\n(C). Blue Whale\n(D). Sperm Whale", "(D). Sperm Whale"));
        arrayList.add(new ThreeItemModel("In which of the following state Asiatic lion is the state animal?\n\n(A). Rajasthan\n(B). Haryana\n(C). Punjab\n(D). Gujarat", "(D). Gujarat"));
        arrayList.add(new ThreeItemModel("Which geologist introduced first the term ‘Biosphere’?\n\n(A). Charles Darwin\n(B). Eduard Sues\n(C). Matthew Maury\n(D). Arthur Tinsley\n", "(B). Eduard Sues"));
        arrayList.add(new ThreeItemModel("Gyan Bharati Reserve, a Biosphere Reserve of India is located in which of the following state?\n\n(A). West Bengal\n(B). Astrakhan\n(C). Gujarat\n(D). Bihar\n", "(C). Gujarat"));
        arrayList.add(new ThreeItemModel("Which of the following is an air pollutant?\n\n(A). Nitrogen\n(B). Carbon Dioxide\n(C). Carbon Monoxide\n(D). Oxygen\n", "(C). Carbon Monoxide"));
        arrayList.add(new ThreeItemModel("Who is considered the founder of earth day?\n\n(A). Gaylord Nelson\n(B). Aldo Leopold\n(C). William Proxmire\n(D). Danis Hayes\n", "(A). Gaylord Nelson"));
        arrayList.add(new ThreeItemModel("What is the renewable source of Energy?\n\n(A). Coal\n(B). Petroleum\n(C). Plants\n(D). Uranium\n", "(C). Plants"));

        arrayList.add(new ThreeItemModel("What is the main cause of Soil erosion?\n\n(A). Industrialization\n(B). Defforestation\n(C). Earthquake\n(D). Roads Construction\n", "(B). Defforestation"));
        arrayList.add(new ThreeItemModel("Where is situated Dudhwa National Park?\n\n(A). Madhya Pradesh\n(B). Uttar Pradesh\n(C). Rajasthan\n(D). Haryana\n", "(B). Uttar Pradesh"));
        arrayList.add(new ThreeItemModel("The name of India derived from which river?\n\n(A). Indus River\n(B). Ganges River\n(C). Brahmaputra River\n(D). Sutlej River\n", "(A). Indus River"));
        arrayList.add(new ThreeItemModel("When was established National Defence Academy?\n\n(A). 1951\n(B). 1952\n(C). 1953\n(D). 1954\n", "(D). 1954"));
        arrayList.add(new ThreeItemModel("What is the percentage of CO2 in atmosphere?\n\n(A). 0.0391 percent\n(B). 0.1001 Percent\n(C). 1.0001 Percent\n(D). 0.1001 Percent\n", "(A). 0.0391 percent"));
        arrayList.add(new ThreeItemModel("Which is the most polluted city in the world?\n\n(A). Faridabad\n(B). Varanasi\n(C). Kanpur\n(D). Lucknow\n", "(C). Kanpur"));
        arrayList.add(new ThreeItemModel("Who is known as the father of Indian environmental science?\n\n(A). Ramdeo Mishra\n(B). Sunderlal Bahuguna\n(C). Vinobha Bhave\n(D). Raja Ram Mohan Roy\n", "(A). Ramdeo Mishra"));
        arrayList.add(new ThreeItemModel("Which of the following animal has the highest blood pressure?\n\n(A). Elephant\n(B). Giraffe\n(C). Lion\n(D). Rabbit\n", "(B). Giraffe"));
        String str = "(B). Kerala";
        arrayList.add(new ThreeItemModel("Where is located Silent Valley National Park?\n\n(A). Odisha\n(B). Kerala\n(C). Tamil Nadu\n(D). West Bengal\n", str));
        arrayList.add(new ThreeItemModel("Grand Central Terminal, Park Avenue, New York is the world’s_______?\n\n(A). Longest railway station\n(B). Highest railway station\n(C). Largest Railway Station\n(D). None of the above\n", "(C). Largest Railway Station"));
        arrayList.add(new ThreeItemModel("The world’s first ever thermal battery plant has been inaugurated in which Indian state?\n\n(A). Andhra Pradesh\n(B). Himachal Pradesh\n(C). Karnataka\n(D). Odisha\n", "(A). Andhra Pradesh"));
        arrayList.add(new ThreeItemModel("What is the name of the world’s first Greenhouse gases Observing Satellite launched by Japan in 2009?\n\n(A). Ibuki\n(B). Tadami\n(C). Akatsuki\n(D). Hayabusa\n", "(A). Ibuki"));
        arrayList.add(new ThreeItemModel("Fathometer is used to measure________?\n\n(A). Earthquakes\n(B). Rainfalls\n(C). Ocean Depth\n(D). Sound Intensity\n", "(C). Ocean Depth"));
        arrayList.add(new ThreeItemModel("What is the largest land in the human body?\n\n(A). Liver\n(B). Adrenal\n(C). Pituitary\n(D). Pineal\n", "(A). Liver"));
        arrayList.add(new ThreeItemModel("Which of the following is India’s first National Marine Park?\n\n(A). Mahatma Gandhi Marine National Park\n(B). Marine National Park, Gulf of Kutch\n(C). Rani Jhansi Marine National Park\n(D). Gulf of Manmar Marine National Park\n", "(B). Marine National Park, Gulf of Kutch"));
        arrayList.add(new ThreeItemModel("Parambikulam Tiger Reserve is located is which state?\n\n(A). Andhra Pradesh\n(B). Kerala\n(C). Tamil Nadu\n(D). Karnataka\n", str));
        arrayList.add(new ThreeItemModel("Who is known as father of Indian Green Revolution?\n\n(A). V Kurien\n(B). C Subramanian\n(C). MS Swaminathan\n(D). None of the Above\n", "(C). MS Swaminathan"));
         arrayList.add(new ThreeItemModel("Which among the following is India’s first state to release a climate Change Action Plan?\n\n(A). Himachal Pradesh\n(B). Delhi\n(C). Haryana\n(D). Kerala\n", "(B). Delhi"));
        String str2 = "(A). Global Hectare";
        arrayList.add(new ThreeItemModel("Which among the following is the unit of measurement of the “Ecological Footprint”?\n\n(A). Global Hectare\n(B). Gallon Per Capita\n(C). Cubic Meter\n(D). Man Hour\n", str2));
        String str3 = "(B). Meghalaya";
        String str4 = "Nokrek Biosphere reserve is located in which of the following states?\n\n(A). Assam\n(B). Meghalaya\n(C). Manipur\n(D). Tripura\n";
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("Which among the following is the unit of measurement of the \"Ecological Footprint\"?\n\n(A). Global Hectare\n(B). Gallon Per Capita\n(C). Cubic Meter\n(D). Man Hour\n", str2));
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel(" Minamata disease are first detected in…………..?\n\n(A). Mexico\n(B). Japan\n(C). USA\n(D). India\n", "(B). Japan"));
        arrayList.add(new ThreeItemModel("Silviculture is the management of………..?\n\n(A). Rivers\n(B). Lakes\n(C). Hills\n(D). Forests\n", "(D). Forests"));
        arrayList.add(new ThreeItemModel("Which among following World Heritage site of India is owned by two states?\n\n(A). Valley of Flowers National Park\n(B). Mountain Railways of India\n(C). Sundarban National Park\n(D). Kalka Shimla Railway\n", "(D). Kalka Shimla Railway"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("বিখ্যাত পরিবেশবিদ সুন্দরলাল বহুগুনা কোন আন্দোলনের সাথে জড়িত? (ক)। সাইলেন্ট ভ্যালি (বি) সংরক্ষণ করুন। নর্মদা বাচাও (সি)। চিপকো আন্দোলন (ডি)। ঝোলা আন্দোলন", "(সি)। চিপকো আন্দোলন"));
        arrayList.add(new ThreeItemModel("নয়াদিল্লিতে কে ভারতীয় জাতীয় সংসদের নকশা করেছিলেন? (ক)। গুস্তাভে আইফেল (বি)। লে করবুসিয়ার (সি)। এডউইন ল্যান্ডসিয়ার লুটিয়েনস (ডি)। বনান্নো পিসানো", "(সি) এডউইন ল্যান্ডসিয়ার লুটিয়েনস"));
        arrayList.add(new ThreeItemModel("নীচের মধ্যে কে ভারতে জাতীয় বন্যজীবন বোর্ডের (এনবিডাব্লুএল) সভাপতিত্ব করছেন? (ক)। প্রধানমন্ত্রী (বি) ","(ক) প্রধানমন্ত্রী"));
        arrayList.add(new ThreeItemModel("কোন প্রাণীর বৃহত্তম মস্তিষ্ক পৃথিবী? (ক)। ডলফিন (বি)। অক্টোপাস (সি)। নীল তিমি (ডি)। শুক্রাণু তিমি", "(ডি) স্পার্ম হোয়েল"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কোন রাজ্যে এশিয়াটিক সিংহ রাষ্ট্রীয় প্রাণী? (ক)। রাজস্থান (খ)। হরিয়ানা (সি)। পাঞ্জাব (ডি)। গুজরাট", "(ডি)। গুজরাট"));
        arrayList.add(new ThreeItemModel("কোন ভূতাত্ত্বিক প্রথমে বায়োস্ফিয়ার শব্দটি চালু করেছিলেন? (ক) চার্লস ডারউইন (বি) এডুয়ার্ড স্যুস (সি) ম্যাথিউ মউরি (ডি) আর্থার টিন্সলে", "(বি) এডওয়ার্ড স্যুস"));
        arrayList.add(new ThreeItemModel("জ্ঞান ভারতী রিজার্ভ, ভারতের একটি বায়োস্ফিয়ার রিজার্ভ নিচের কোন রাজ্যে অবস্থিত? (ক)। পশ্চিমবঙ্গ (খ)। আস্ট্রখানা (সি)। গুজরাট (ডি)। বিহার", "(সি)। গুজরাট"));
        arrayList.add(new ThreeItemModel("নিচের কোনটি বায়ু দূষণকারী? (ক) নাইট্রোজেন (বি) কার্বন ডাই অক্সাইড (সি) কার্বন মনোক্সাইড (ডি)। অক্সিজেন", "(সি)। কার্বন মনোক্সাইড"));
        arrayList.add(new ThreeItemModel("পৃথিবী দিবসের প্রতিষ্ঠাতা কে বিবেচনা করা হয়? (ক) গাইলর্ড নেলসন (বি) অ্যাল্ডো লিওপল্ড (সি)] উইলিয়াম প্রক্সমিয়ার (ডি)। ড্যানিস হেইস", "(এ) গাইলর্ড নেলসন"));
        arrayList.add(new ThreeItemModel("শক্তির পুনর্নবীকরণযোগ্য উত্স কী? (ক)। কয়লা (খ)। পেট্রোলিয়াম (সি)। গাছপালা (ডি)। ইউরেনিয়াম", "(সি)। উদ্ভিদ"));

        arrayList.add(new ThreeItemModel("মাটি ক্ষয়ের প্রধান কারণ কী? (ক)। শিল্পায়ন (খ)। ডিফোরস্টেশন (সি)। ভূমিকম্প (ডি)। সড়ক নির্মাণ", "(বি)। ডিফোরস্টেশন"));
        arrayList.add(new ThreeItemModel("দুধওয়া জাতীয় উদ্যান কোথায় অবস্থিত? (ক)। মধ্য প্রদেশ   (বি)। উত্তর প্রদেশ (সি)। রাজস্থান (ডি)। হরিয়ানা", "(বি)। উত্তরপ্রদেশ"));
        arrayList.add(new ThreeItemModel("ভারতের নামটি কোন নদী থেকে উত্পন্ন? (ক)। সিন্ধু নদী (খ)। গঙ্গা নদী (সি)। ব্রহ্মপুত্র নদ (ডি)। সুতলজ নদী", "(ক)। সিন্ধু নদ"));
        arrayList.add(new ThreeItemModel("জাতীয় প্রতিরক্ষা একাডেমি কবে প্রতিষ্ঠিত হয়? (ক)। 1951 (খ)। 1952 (সি)। 1953 (ডি)। 1954", "(ডি)। 1954"));
        arrayList.add(new ThreeItemModel("জাতীয় প্রতিরক্ষা একাডেমি কবে প্রতিষ্ঠিত হয়? (ক)। 1951 (খ)। 1952 (সি)। 1953 (ডি)। 1954", "(ডি)। 1954"));
        arrayList.add(new ThreeItemModel("বিশ্বের সবচেয়ে দূষিত শহর কোনটি? (ক)। ফরিদাবাদ (খ)। বারাণসী (সি)। কানপুর (ডি)। লখনউ", "(সি)। কানপুর"));
        arrayList.add(new ThreeItemModel("কে ভারতীয় পরিবেশ বিজ্ঞানের জনক হিসাবে পরিচিত?    (এ) রামদেও মিশ্র  (বি) সুন্দরলাল বহুগুনা   (সি) বিনোভা ভাভে   (ডি) রাজা রাম মোহন রায়  ", "( ক) রামদেও মিশ্র "));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত প্রাণীর মধ্যে রক্তচাপ সবচেয়ে বেশি? (ক)। হাতি (বি)। জিরাফ (সি)। সিংহ (ডি)। খরগোশ", "(বি)। জিরাফ"));
        String str = "(B). Kerala";
        arrayList.add(new ThreeItemModel("সাইলেন্ট ভ্যালি জাতীয় উদ্যানটি কোথায় অবস্থিত? (ক) ওড়িশা (বি) কেরল (সি) তামিলনাড়ু   (ডি) পশ্চিমবঙ্গ", str));
        arrayList.add(new ThreeItemModel("গ্র্যান্ড সেন্ট্রাল টার্মিনাল, পার্ক অ্যাভিনিউ, নিউ ইয়র্ক হ'ল বিশ্বের _______? (ক) দীর্ঘতম রেলস্টেশন (খ) সর্বোচ্চতম রেলওয়ে স্টেশন (সি) বৃহত্তম রেলওয়ে স্টেশন (ডি) উপরের কোনওটিই নয়", "(সি) বৃহত্তম রেলওয়ে স্টেশন "));
        arrayList.add(new ThreeItemModel("বিশ্বের প্রথম তাপীয় ব্যাটারি কেন্দ্রটি ভারতের কোন রাজ্যে উদ্বোধন করা হয়েছে? (ক) অন্ধ্র প্রদেশ (খ) হিমাচল প্রদেশ (সি) কর্ণাটক (ডি) ওড়িশা", "(এ) অন্ধ্র প্রদেশ"));
        arrayList.add(new ThreeItemModel("২০০৯ সালে জাপানের দ্বারা চালু করা বিশ্বের প্রথম গ্রিনহাউস গ্যাসগুলির পর্যবেক্ষণ উপগ্রহের নাম কী? (ক) আইবুকি (বি)। তাদামি (সি)। আকাতসুকি (ডি)। হায়াবুসা", "(এ)। আইবুকি"));
        arrayList.add(new ThreeItemModel("ফ্যাথোমিটার ____ পরিমাপ করতে ব্যবহৃত হয়? (এ)। ভূমিকম্প (বি)। বৃষ্টিপাত (সি)। মহাসাগরের গভীরতা (ডি)। সাউন্ড তীব্রতা", "(সি)। মহাসাগরের গভীরতা"));
        arrayList.add(new ThreeItemModel("মানবদেহের বৃহত্তম ভূমি কোনটি? (ক)। লিভার (বি)। অ্যাড্রিনাল (সি)। পিটুইটারি (ডি)। পিনিয়াল", "(এ)। লিভার"));
        arrayList.add(new ThreeItemModel("ভারতের প্রথম জাতীয় সামুদ্রিক উদ্যানটি নিম্নলিখিতগুলির মধ্যে কোনটি? (ক)। মহাত্মা গান্ধী মেরিন জাতীয় উদ্যান (খ) পার্ক "," (খ)। মেরিন ন্যাশনাল পার্ক, কাঁচের উপসাগর "));
        arrayList.add(new ThreeItemModel("পারম্বিকুলাম টাইগার রিজার্ভটি কোন রাজ্যে অবস্থিত? (ক)। অন্ধ্র প্রদেশ (বি)। কেরালা (সি)। তামিলনাড়ু (ডি)। কর্ণাটক", str));
        arrayList.add(new ThreeItemModel("কারা ভারতীয় সবুজ বিপ্লবের জনক হিসাবে পরিচিত? (ক)। ভি কুরিয়ান (বি)। সি সুব্রহ্মণিয়ান (সি)। এমএস স্বামীনাথন (ডি)। উপরের কিছুই", "(সি) এমএস স্বামীনাথন"));
          arrayList.add(new ThreeItemModel("জলবায়ু পরিবর্তন কর্মপরিকল্পনা প্রকাশের জন্য ভারতের প্রথম রাজ্যটি কোনটি? (ক)। হিমাচল প্রদেশ (বি)। দিল্লি (সি)। হরিয়ানা (ডি)। কেরালা", "(বি)। দিল্লি"));
        String str2 ="(এ)। গ্লোবাল হেক্টরে";
        arrayList.add(new ThreeItemModel("নীচের মধ্যে কোনটি ইকোলজিকাল পদচিহ্ন পরিমাপের একক? (ক)। গ্লোবাল হেক্টরে (বি)। গ্যালন প্রতি মাথাপিছু (সি)। কিউবিক মিটার (ডি)। ম্যান আওয়ার", str2));
        String str3 = "(খ)। মেঘালয়";
        String str4 ="নোক্রেক বায়োস্ফিয়ার রিজার্ভ নীচের কোনটি রাজ্যে অবস্থিত? (ক)। আসাম (খ)। মেঘালয় (সি)। মণিপুর (ডি)। ত্রিপুরা";
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("নীচের মধ্যে বাস্তুসংস্থানীয় পদচিহ্ন measure পরিমাপের এককটি কী? (A)। গ্লোবাল হেক্টরে  (বি) )। ম্যান আওয়ার  ", str2));
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("মিনামাতা রোগটি প্রথম ………… ..? (ক)। মেক্সিকো (বি)। জাপান (সি)। ইউএসএ (ডি) ভারত", "(বি) জাপানে সনাক্ত করা হয়েছে"));
        arrayList.add(new ThreeItemModel("সিলভিচালচার হচ্ছে ……… ..? (ক)। নদী (খ)। হ্রদ (সি)। পাহাড় (ডি)। বন", "(ডি)। বন"));
        arrayList.add(new ThreeItemModel("ভারতের নিম্নলিখিত Herতিহ্যবাহী সাইটের মধ্যে কোনটি দুটি রাজ্যের মালিকানাধীন? (ক) উপত্যকা ফুল জাতীয় উদ্যান   (বি)। ভারতের মাউন্টেন রেলপথ (সি) সুন্দরবন জাতীয় উদ্যান (ডি) কালকা শিমলা রেলপথ", "(ডি) ) কালকা সিমলা রেলওয়ে "));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("दुधवा नेशनल पार्क कहाँ स्थित है? (A)। मध्य प्रदेश (b)। उत्तर प्रदेश (c)। राजस्थान (d) हरियाणा", "(b)। उत्तर प्रदेश"));
        arrayList.add(new ThreeItemModel("भारत का नाम किस नदी से लिया गया है? (A)। सिंधु (b)। गंगा (c)। ब्रह्मपुत्र नदी (d)। सतलज नदी", "(a)। सिंधु नदी"));
        arrayList.add(new ThreeItemModel("राष्ट्रीय रक्षा अकादमी की स्थापना कब हुई? (ए) 1951 (बी)। 1952 (सी) 1953 (डी) 1954", "(डी) 1954"));
        arrayList.add(new ThreeItemModel("राष्ट्रीय रक्षा अकादमी की स्थापना कब हुई? (ए) 1951 (बी)। 1952 (सी) 1953 (डी) 1954", "(डी) 1954"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे प्रदूषित शहर कौन सा है? (ए)। फरीदाबाद (बी)। वाराणसी (सी)। कानपुर (डी) लखनऊ", "(सी)। कानपुर"));
        arrayList.add(new ThreeItemModel("भारतीय पर्यावरण विज्ञान के जनक के रूप में किसे जाना जाता है? (ए) रामदेव मिश्रा (बी) सुंदरलाल बहुगुणा (सी) बिनोवा भावे (डी) राजा राम मोहन रॉय", "(ए) रामदेव मिश्रा"));
        arrayList.add(new ThreeItemModel("निम्न में से किस जानवर का रक्तचाप सबसे अधिक है? (ए)। हाथी (बी)। जिराफ (सी)। शेर (डी) खरगोश", "(बी)। जिराफ"));
        arrayList.add(new ThreeItemModel("साइलेंट वैली नेशनल पार्क कहाँ स्थित है? (A) उड़ीसा (b) केरल (c) तमिलनाडु (d) पश्चिम बंगाल","(d) पश्चिम बंगाल\""));
        String str = "(या)। केरल";
        arrayList.add(new ThreeItemModel("अरेरे साइलेंट वैली नेशनल पार्क में स्थित है? (ए)। ओडिशा   (या)। केरल (क्या)। तमिलनाडु (डॉ) पश्चिम बंगाल", str));
        arrayList.add(new ThreeItemModel("ग्रैंड सेंट्रल टर्मिनल, पार्क एवेन्यू, न्यूयॉर्क दुनिया का _______ है? (ए) सबसे लंबा रेलवे स्टेशन (बी) सबसे बड़ा रेलवे स्टेशन (सी) सबसे बड़ा रेलवे स्टेशन (डी) उपरोक्त में से कोई नहीं"," (सी) सबसे बड़ा रेलवे स्टेशन"));
        arrayList.add(new ThreeItemModel("भारत के किस राज्य में दुनिया के पहले थर्मल बैटरी प्लांट का उद्घाटन किया गया है? (A) आंध्र प्रदेश (b) हिमाचल प्रदेश (c) कर्नाटक (d) उड़ीसा ", "(a) आंध्र प्रदेश"));
        arrayList.add(new ThreeItemModel("2009 में जापान द्वारा लॉन्च किए गए दुनिया के पहले ग्रीनहाउस गैस अवलोकन उपग्रह का नाम क्या है? (ए) इबुकी (बी)। तादामी (सी)। अकात्सुकी (डी)। हयाबुसा "," (ए)। इबुकी "));
        arrayList.add(new ThreeItemModel("फेटोमीटर का उपयोग ____? (ए) को मापने के लिए किया जाता है। भूकंप (बी)। वर्षा (सी)। समुद्र की गहराई (डी)। ध्वनि की तीव्रता", "(सी)। समुद्र की गहराई"));
        arrayList.add(new ThreeItemModel("मानव शरीर का सबसे बड़ा हिस्सा कौन सा है? (ए)। लिवर (बी)। अधिवृक्क (सी)। पिट्यूटरी (डी)। पीनियल", "(ए) लिवर"));
        arrayList.add(new ThreeItemModel("भारत का पहला राष्ट्रीय समुद्री पार्क निम्नलिखित में से एक है? (ए)। महात्मा गांधी समुद्री राष्ट्रीय उद्यान (बी) पार्क", "(बी)। समुद्री राष्ट्रीय उद्यान, ग्लास बे"));
        arrayList.add(new ThreeItemModel("परम्बिकुलम टाइगर रिजर्व किस राज्य में स्थित है? (A)। आंध्र प्रदेश (b)। केरल (c)। तमिलनाडु (d)। कर्नाटक।", str));
        arrayList.add(new ThreeItemModel("भारतीय हरित क्रांति के जनक के रूप में किसे जाना जाता है? (A)। वी। कुरियन (b)। सी। सुब्रमण (c)। एमएस स्वामीनाथन (d)। उपरोक्त में से कोई नहीं", "(c) एमएस स्वामीनाथन "));
        arrayList.add(new ThreeItemModel("प्रसिद्ध पर्यावरणविद् सुंदरलाल बहुगुणा किस आंदोलन में शामिल हैं? (A)। साइलेंट वैली (b)। सेव नर्मदा (c)। चिपको आंदोलन (d)। झोला आंदोलन", "(c)। चिपको आंदोलन"));
        arrayList.add(new ThreeItemModel("नई दिल्ली में भारतीय राष्ट्रीय असेंबली का डिजाइन किसने बनाया? (ए)। गुस्ताव एफिल (बी) ले कोर्बुसियर (सी) एडविन लैंड्सियर लुटियंस (डी) बन्नो पिसानो", "(C) एडविन लैंडसीयर लुटियन"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन भारत में राष्ट्रीय वन्यजीव बोर्ड (NBWL) की अध्यक्षता कर रहा है? (A)। प्रधान मंत्री (b)", "(a) प्रधान मंत्री"));
        arrayList.add(new ThreeItemModel("किस जानवर का सबसे बड़ा दिमाग पृथ्वी है? (ए)। डॉल्फ़िन (बी)। ऑक्टोपस (सी)। ब्लू व्हेल (डी)। शुक्राणु व्हेल", "(डी) स्पर्म व्हेल"));
        arrayList.add(new ThreeItemModel("एशियाई शेर निम्नलिखित राज्यों में से किस राज्य का जानवर है? (ए)। राजस्थान (बी)। हरियाणा (सी) पंजाब (डी) गुजरात", "(डी)। गुजरात"));
        arrayList.add(new ThreeItemModel( "किस भूविज्ञानी ने पहली बार जीवमंडल शब्द की शुरुआत की? ए) चार्ल्स डार्विन b) एडवर्ड ससेक्स ने c) मैथ्यू मरे (d) आर्थर टिनस्ले", "(b) एडवर्ड सुससे"));
        arrayList.add(new ThreeItemModel("ज्ञान भारती रिजर्व, भारत का एक बायोस्फीयर रिजर्व निम्नलिखित में से किस राज्य में स्थित है? (ए) पश्चिम बंगाल (बी)। अस्त्रखाना (सी)। गुजरात (डी) बिहार", "(सी) गुजरात।"));
        arrayList.add(new ThreeItemModel("निम्न में से कौन एक वायु प्रदूषक है? (ए) नाइट्रोजन (बी) कार्बन डाइऑक्साइड (सी) कार्बन मोनोऑक्साइड (डी)। ऑक्सीजन", "(सी)। कार्बन मोनोऑक्साइड"));
        arrayList.add(new ThreeItemModel("पृथ्वी दिवस का संस्थापक किसे माना जाता है? (ए) गिलार्ड नेल्सन b) एल्डो लियोपोल्ड c) विलियम प्रोक्समायर ​​d)। डेनिस हेस", "ए) गिलार्ड नेल्सन"));
        arrayList.add(new ThreeItemModel("ऊर्जा का एक अक्षय स्रोत क्या है? (ए)। कोयला (बी)। पेट्रोलियम (सी)। पौधे (डी)। यूरेनियम", "(सी)। पौधे"));
        arrayList.add(new ThreeItemModel("जलवायु परिवर्तन कार्य योजना प्रकाशित करने वाला भारत का पहला राज्य कौन सा है? (A) हिमाचल प्रदेश (b) दिल्ली (c)। हरियाणा (d)। केरल "," (b)। दिल्ली"));
        String str2 = "(ए)। ग्लोबल हेक्टेयर";
        arrayList.add(new ThreeItemModel("निम्न में से कौन पारिस्थितिक पदचिह्न के लिए माप की इकाई है? (ए)। वैश्विक हेक्टेयर में (बी)। प्रति गैलन प्रति व्यक्ति (सी)। घन मीटर (डी)। मानव-घंटे", str2));
        String str3 = "(बी)। मेघालय";
        String str4 = "नोकेरेक बायोस्फीयर रिजर्व निम्नलिखित में से किस राज्य में स्थित है? (ए)। असम (बी)। मेघालय (सी)। मणिपुर (डी)। त्रिपुरा";
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("निम्नलिखित में पारिस्थितिक पदचिह्न माप के लिए माप की इकाई क्या है? (ए)। ग्लोबल हेक्टर (बी)। मैन", str2));
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("मिनामाता रोग पहली बार में पता चला है ... ... ... ... (ए)। मेक्सिको (या)। जापान (क्या)। अमेरिका (डॉ।) भारत", "(या) जापान।"));
        arrayList.add(new ThreeItemModel("सिल्विकाल्चर है ……… ..? (ए)। नदी (बी)। झील (सी)। हिल (डी) वन", "(डी) वन"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सी भारतीय विरासत स्थल दो राज्यों के स्वामित्व में है? (A) वैली फ्लावर नेशनल पार्क (b)। माउंटेन रेलवे ऑफ़ इंडिया (c) सुंदरबन नेशनल पार्क (d) कालका शिमला रेलवे", "(d)) कालका शिमला रेलवे "));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("مٹی کے کٹاؤ کی بنیادی وجوہات کیا ہیں؟ (ا). صنعتی (ب)۔ جنگلات کی کٹائی (سی)۔ زلزلہ (ڈی)۔ سڑک کی تعمیر" , "(بی)۔ جنگلات کی کٹائی"));
        arrayList.add(new ThreeItemModel("دودھوا نیشنل پارک کہاں واقع ہے؟ (ا)۔ مدھیہ پردیش (بی)۔ اتر پردیش (سی)۔ راجستھان (ڈی)۔ ہریانہ" , "(بی)۔ اتر پردیش"));
        arrayList.add(new ThreeItemModel("ہندوستان کا نام کس ندی سے اخذ ہوا ہے؟ (ا)۔ انڈس (بی) گنگا (سی)۔ برہما پتر ندی (د)۔ ستلج دریا" , "(ا) دریائے سندھ"));
        arrayList.add(new ThreeItemModel("نیشنل ڈیفنس اکیڈمی کب قائم کی؟ (ا)۔ 1951 (بی) 1952 (سی)۔ 1953 (ڈی)۔ 1954" , "(د)۔ 1954"));
        arrayList.add(new ThreeItemModel("نیشنل ڈیفنس اکیڈمی کب قائم کی؟ (ا)۔ 1951 (بی) 1952 (سی)۔ 1953 (ڈی)۔ 1954" , "(د)۔ 1954"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے زیادہ آلودہ شہر کون سا ہے؟ (ا)۔ فرید آباد (بی)۔ وارانسی (سی)۔ کانپور (د)۔ لکھنؤ" , "(سی)۔ کان پور"));
        arrayList.add(new ThreeItemModel("ہندوستانی ماحولیاتی سائنس کے باپ کے نام سے کون جانا جاتا ہے؟ (ا) رامدو مشرا (ب) سندر لال بہوگونا (ج) بنووا بھا (د) راجہ رام موہن رائے" , "(ا) رامدو مشرا"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کس جانور میں بلڈ پریشر سب سے زیادہ ہے؟ (ا). ہاتھی (بی)۔ جراف (سی)۔ شیر (د)۔ خرگوش" , "(بی)۔ جراف۔"));
        String str ="(یا)۔ کیرالہ";
        arrayList.add(new ThreeItemModel("خاموش وادی نیشنل پارک کہاں واقع ہے؟ (ا) اڑیسہ (بی) کیرالہ (c) تمل ناڈو (د) مغربی بنگال", str));
        arrayList.add(new ThreeItemModel("گرینڈ سینٹرل ٹرمینل ، پارک ایوینیو ، نیویارک دنیا کا _______ ہے؟ (A) سب سے طویل ریلوے اسٹیشن (b) سب سے بڑا ریلوے اسٹیشن (c) سب سے بڑا ریلوے اسٹیشن (d) مذکورہ بالا میں سے کوئی بھی" , "(c) سب سے بڑا ریلوے اسٹیشن"));
        arrayList.add(new ThreeItemModel("جاپان نے 2009 میں لانچ کیا دنیا کے پہلے گرین ہاؤس گیس آبزرویشن سیٹلائٹ کا نام کیا ہے؟ (ا) ایبوکی (بی)۔ تادامی (سی)۔ اکاتسوکی (ڈی)۔ حیابوسا" , "(ا)۔ ایبوکی"));
        arrayList.add(new ThreeItemModel("فاٹومیٹر ____ کی پیمائش کے لئے استعمال کیا جاتا ہے؟ (A). زلزلہ (b). بارش (c). سمندر کی گہرائی (d). آواز کی شدت" , "(c). سمندر کی گہرائی"));
        arrayList.add(new ThreeItemModel("انسانی جسم کا سب سے بڑا حصہ کون سا ہے؟ (A). جگر (b). ایڈرینل (c). پٹیوٹری (d). Pineal" , "(a). جگر"));
        arrayList.add(new ThreeItemModel("انسانی جسم کی سب سے بڑی زمین کیا ہے؟ (ا)۔ جگر  نہیں (یا)۔ ایڈرینل (کیا)۔ پٹیوٹری (ڈاکٹر)۔ پینل" , "(اے)۔ جگر"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا ہندوستان کا پہلا قومی میرین پارک ہے؟ (ا). مہاتما گاندھی میرین نیشنل پارک (بی) پارک  "," (بی)۔ میرین نیشنل پارک ، خلیج کچ "));
        arrayList.add(new ThreeItemModel("پیرانوکولم ٹائیگر ریزرو 2 واقع ہے وہ کون سا ریاست ہے؟ (ا) آندھرا پردیش (یا) کیرالہ (کیا) تمل ناڈو (ڈاکٹر) کرناٹک", str));
        arrayList.add(new ThreeItemModel("ہندوستان کے سبز انقلاب کے باپ کے نام سے کون جانا جاتا ہے؟ (اے)۔ وی کورین (بی) سی۔ سبرامنیم (سی)۔ ایم ایس سوامی ناٹھن (د)۔ مذکورہ بالا میں سے کوئی بھی" , "(سی) ایم ایس سوامیاتھن"));
        arrayList.add(new ThreeItemModel("مشہور ماہر ماحولیات سندر لال بہوگونا کس تحریک میں شامل ہیں؟ (ا). خاموش وادی (بی) کو بچائیں۔ نرمدا (سی) کو بچائیں۔ چپکو موومنٹ (ڈی)۔ جھولا موومنٹ" , "(سی)۔ چپکو موومنٹ"));
        arrayList.add(new ThreeItemModel("نئی دہلی میں ہندوستانی قومی اسمبلی کا ڈیزائن کس نے بنایا؟ ا) گستاوی ایفل ب) لی کوربسیر ج) ایڈون لینڈسیئر لوٹیئنز (د) بنانو پسانو" , "سی) ایڈون لینڈسیئر لوٹیئنز"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون بھارت میں نیشنل وائلڈ لائف بورڈ (این بی ڈبلیو ایل) کی صدارت کر رہا ہے؟ (اے)۔ وزیر اعظم (بی)" , "(ا) وزیر اعظم"));
        arrayList.add(new ThreeItemModel("زمین کس جانور کا سب سے بڑا دماغ ہے؟ (A). ڈولفن (b). آکٹپس (سی)۔ بلیو وہیل (d)۔ سپرم وہیل" , "(d) سپرم وہیل"));
        arrayList.add(new ThreeItemModel("ایشیاٹک شیر مندرجہ ذیل میں سے کس ریاست میں ریاستی جانور ہے؟ (ا)۔ راجستھان (بی)۔ ہریانہ (سی)۔ پنجاب (د)۔ گجرات" , "(د)۔ گجرات"));
        arrayList.add(new ThreeItemModel("کس ماہر ارضیات نے سب سے پہلے بایسوفیر کی اصطلاح تیار کی؟ ا) چارلس ڈارون (b) ایڈورڈ سوس (c) میتھیو مرے (د) آرتھر ٹنسلی" , "(بی) ایڈورڈ سوس"));
        arrayList.add(new ThreeItemModel("گیان بھارتی ریزرو ، ہندوستان کا ایک حیاتیاتی ذخیرہ درج ذیل میں سے کس ریاست میں واقع ہے؟ (ا) مغربی بنگال (بی) آستراخانہ (سی) گجرات (د)۔ بہار" , "(سی)۔ گجرات"));
        arrayList.add(new ThreeItemModel("درج ذیل میں سے کون سا ہوا آلودگی ہے؟ (A) نائٹروجن (B) کاربن ڈائی آکسائیڈ (C) کاربن مونو آکسائڈ (D). آکسیجن" , "(C). کاربن مونو آکسائڈ"));
        arrayList.add(new ThreeItemModel("یوم ارتھ کا بانی کون سمجھا جاتا ہے؟ اے) گیلارڈ نیلسن ب) ایلڈو لیوپولڈ ج) ولیم پراکسائر ڈی) ڈینس ہیس" , "(ا) گیلارڈ نیلسن"));
        arrayList.add(new ThreeItemModel("توانائی کا قابل تجدید ذریعہ کیا ہے؟ (A). کوئلہ (b). پٹرولیم (c). پودے (d). یورینیم" , "(c)"));
        arrayList.add(new ThreeItemModel("موسمیاتی تبدیلی ایکشن پلان شائع کرنے والی ہندوستان کی پہلی ریاست کون سی ہے؟ ا) ہماچل پردیش ب) دہلی سی)۔ ہریانہ ڈی)۔ کیرالہ" , "(بی)۔ دہلی۔"));
        String str2 = "(A)۔ عالمی سطح پر ہیکٹر";
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا ماحولیاتی پیروں کی پیمائش کی اکائی ہے؟ ا) عالمی ہیکٹر b) فی کس گیلن سی) مکعب میٹر d) انسان گھنٹہ", str2));
        String str3 = "(بی)۔ میگھالیہ";
        String str4 = "نوکریک بائیوفیر ریزرو درج ذیل میں سے کس ریاست میں واقع ہے؟ (ا)۔ آسام (بی)";
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں ماحولیاتی پیروں کی پیمائش کے لئے پیمائش کی اکائی کیا ہے؟ (A)۔ گلوبل ہیکٹر (B))۔ مین آور", str2));
        arrayList.add(new ThreeItemModel(str4, str3));
        arrayList.add(new ThreeItemModel("مناماتا مرض کا پتہ پہلے پہلا پتہ چلتا ہے کہ کس ...............؟ (ا) میکسیکو (یا) جاپان (کیا) ہم (ڈاکٹر) ہندوستان  نہیں" , "(اور) جاپان"));
        arrayList.add(new ThreeItemModel("سلویچلچار ……… ..؟ (A). دریائے (b). جھیل (c). پہاڑی (d). جنگل", "(d). جنگل" ));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا ہندوستانی ورثہ سائٹس دو ریاستوں کی ملکیت میں ہے؟ ا) ویلی فلاور نیشنل پارک (بی)۔ ماؤنٹین ریلوے آف انڈیا (c) سندربن نیشنل پارک (د) کالکا شملہ ریلوے" , "(د)) کالکا شملہ ریلوے"));


        return arrayList;
    }


}
