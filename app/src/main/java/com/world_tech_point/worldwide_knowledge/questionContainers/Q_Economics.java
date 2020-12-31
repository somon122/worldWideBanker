package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Economics {


    private Context context;
    public Q_Economics(Context context) {
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

        arrayList.add(new ThreeItemModel("Which Indian state has the largest number of cotton textile mills?\n\n a) Madhya Pradesh\n b) Maharashtra\n c) Gujarat\n d) West Bengal\n", "b) Maharashtra"));
        arrayList.add(new ThreeItemModel("Minor ports like Kakinada, Machilipatnam, Bheemunipatnam, and Krishnapatnam are in which of the following states?\n\n a) Tamil Nadu\n b) Andhra Pradesh\n c) Maharashtra\n d) Karnataka\n", "b) Andhra Pradesh"));
        arrayList.add(new ThreeItemModel("When, for the first time, did the Prime Minister of India announce the 20-point Economic Programme?\n\n a) 1973\n b) 1974\n c) 1975\n d) 1976\n", "c) 1975"));
        arrayList.add(new ThreeItemModel("Which of the following plans aimed at the removal of poverty and attainment of self-reliance?\n a) second plan\n b) third plan\n c) fourth plan\n d) fifth plan\n", "d) fifth plan"));
        arrayList.add(new ThreeItemModel("Census in India is being held regularly after every\n\n a) 6 years\n b) 8 years\n c) 10 years\n d) 12 years\n", "c) 10 years"));
        arrayList.add(new ThreeItemModel("People belonging to what age group are eligible for training under TRYSEM scheme?\n\n a) 18-35\n b) 25-40\n c) 18-50\n d) 18-25\n", "a) 18-35"));
        arrayList.add(new ThreeItemModel("According to the census in 2001, which city in India has the largest population?\n\n a) Kolkatta\n b) Mumbai\n c) Delhi\n d) Chennai\n", " b) Mumbai"));
        arrayList.add(new ThreeItemModel("In terms of geographical area India occupies what position in the world?\n\n a) Five\n b) six\n c) seven\n d) three\n", "c) seven"));
        arrayList.add(new ThreeItemModel("India does not share its boundary with which of the following countries?\n\n a) China\n b) Taiwan\n c) Burma\n d) Bhutan\n", " b) Taiwan"));
        arrayList.add(new ThreeItemModel("Agriculture employs almost what percent of the Indian population?\n\n a) 90\n b) 50\n c) 40\n d) 70\n", " d) 70"));
        arrayList.add(new ThreeItemModel("Which one of the following is a Kharif crop?\n\n a) bajra\n b) wheat\n c) mustard\n d) barley\n", "a) bajra"));
        arrayList.add(new ThreeItemModel("Which one of the following is a rabi crop?\n\n a) rice\n b) jowar\n c) cotton\n d) peas\n", "d) peas"));
        arrayList.add(new ThreeItemModel("Who is known as the ‘Father of White Revolution’?\n\n a) V Kurien\n b) MS Swaminathan\n c) JP Narayan\n d) Baba Amte\n", "a) V Kurien"));
        arrayList.add(new ThreeItemModel("Who was the chief architect of Green Revolution that significantly improved the agricultural yield in the country?\n\n a) MS Swaminathan\n b) VR Krisha Aiyyar\n c) V Kurien\n d) Jawaharlal Nehru\n", "a) MS Swaminathan"));
        arrayList.add(new ThreeItemModel("The Chota Nagpur Plateau famous for its mineral deposits is in\n\n a) Uttar Pradesh\n b) Jharkhand\n c) Madhya Pradesh\n d) Bihar\n", "b) Jharkhand"));
        arrayList.add(new ThreeItemModel("The Mumbai Stock Exchange was set up in\n\n a) 1875\n b) 1900\n c) 1922\n d) 1947\n", "a) 1875"));
        arrayList.add(new ThreeItemModel("What does the term NSDL stands for?\n\n a) National Securities Development Limited\n b) National Securities Depository Limited\n c) National Safety Development Limited\n d) Natural Safety Deployment Limited\n", "b) National Securities Depository Limited"));
        arrayList.add(new ThreeItemModel("Which one of the following was launched with the objective of helping the poor in rural areas to become self employed?\n\n a) DPAP\n b) IRDP\n c) TRYSEM\n d) DDP\n", "c) TRYSEM"));
        arrayList.add(new ThreeItemModel("In Indian economy, the principal means of transportation is\n\n a) airways\n b) railways\n c) waterways\n d) roadways\n", "b) railways"));
        arrayList.add(new ThreeItemModel("Which of the following organizations looks after the credit needs of agriculture and rural development in India?\n\n a) FCI\n b) IDBI\n c) NABARD\n d) ICAR\n", "c) NABARD"));
        arrayList.add(new ThreeItemModel("Which of the following estimates the National Income in India?\n\n a) Central Statistical Organization\n b) National Income Committee\n c) Planning commission\n d) Reserve Bank of India\n", "a) Central Statistical Organization"));
        arrayList.add(new ThreeItemModel("In India which of the following taxes is levied by the state governments?\n\n a) Excise duty on liquor\n b) Capital gains tax\n c) Customs tax\n d) corporation tax\n", "a) Excise duty on liquor"));
        arrayList.add(new ThreeItemModel("Which industry employs the largest number of women in India?\n\n a) tea\n b) textile\n c) jute\n d) coal", "a) tea"));
        arrayList.add(new ThreeItemModel("Which of the following is not a cash crop?\n\n a) Jute\n b) groundnut\n c) jowar\n d) sugarcane\n", "c) jowar"));
        arrayList.add(new ThreeItemModel("Who was the first administrator-statesman to attempt planning as a means for economic development? \n\n a) Sir CP Ramaswami Aiyyar\n b) M Viswesvarayya\n c) VT Krishnamachari\n d) C Rajagopalachari\n", " b) M Viswesvarayya"));
        String str = "b) begins steady growth";
        arrayList.add(new ThreeItemModel("An economy is at the take off stage on its path to development when it\n\n a) becomes stagnant\n b) begins steady growth\n c) is liberalized\n d) gets maximum foreign aid\n", str));
        arrayList.add(new ThreeItemModel("Which of the following is the basic characteristic of Oligopoly?\n\n a) a few sellers, one buyer\n b) a few sellers, many buyers\n c) a few sellers, a few buyers\n d) many sellers, a few buyers\n", " b) a few sellers, many buyers"));
        arrayList.add(new ThreeItemModel("The aim of which of the Five Year Plans was to correct the disequilibrium in the economy?\n\n a) First Five Year Plan\n b) Second Five Year Plan\n c) Third Five Year Plan\n d) Fourth Five Year Plan\n", "a) First Five Year Plan"));
        arrayList.add(new ThreeItemModel("Which of the following Five Year Plans recognized human development as the core of all developmental efforts?\n\n a) Eighth Five Year Plan\n b) Seventh Five Year Plan\n c) Fifth Five Year Plan\n d) Third Five Year Plan\n", "a) Eighth Five Year Plan"));
        arrayList.add(new ThreeItemModel(" Which of the following plans aimed at improving the standard of living?\n\n a) Third Plan\n b) Fourth Plan\n c) Fifth Plan\n d) Sixth Plan\n", "b) Fourth Plan"));
        arrayList.add(new ThreeItemModel("At which of the following places was the mining of coal started in 1774?\n\n a) Chhindwara\n b) Dhanbad\n c) Ranchi\n d) Raniganj\n", "d) Raniganj"));

        arrayList.add(new ThreeItemModel("An economy is at the ‘take off’ stage on its path to development when it\n\n a) becomes stagnant\n b) begins steady growth\n c) is liberalized\n d) gets maximum foreign aid\n", str));
        arrayList.add(new ThreeItemModel("Which among the following treaties provided for a common currency for the member countries of European Community?\n\n a) Brussels Treaty\n b) Geneva Convention\n c) Maastricht Treaty\n d) Treaty of Versailles\n", "c) Maastricht Treaty"));
        arrayList.add(new ThreeItemModel("SEBI stands for\n\n a) Science and Engineering Board of India\n b) Securities and Exchange Board of India\n c) Social Equity Bureau of India\n d) Science and Educational Board of India\n", "b) Securities and Exchange Board of India"));
        arrayList.add(new ThreeItemModel("With which of the following lies the basic regulatory authority for mutual funds and stock markets?\n\n a) Reserve bank of India\n b) Government of India\n c) SEBI\n d) Stock Exchanges\n", "c) SEBI"));
        arrayList.add(new ThreeItemModel("With which aspect of commerce are ‘Bulls and Bears’ associated?\n\n a) Foreign Trade\n b) Stock Exchange market\n c) banking\n d) international finance\n", "b) Stock Exchange market"));
        arrayList.add(new ThreeItemModel("Which of the following is the basic characteristic of Oligopoly?\n\n a) a few sellers, one buyer\n b) a few sellers, many buyers\n c) a few sellers, a few buyers\n d) many sellers, few buyers\n", "b) a few sellers, many buyers"));
        arrayList.add(new ThreeItemModel("State Financial Corporations give assistance mainly to develop\n\n a) small and medium scale industries\n b) agricultural farms\n c) cotton industry\n d) large scale industries\n", "a) small and medium scale industries"));
        arrayList.add(new ThreeItemModel("In which of the following fields was the first co-operative movement in India initiated?\n\n a) agricultural credit\n b) farming activities\n c) consumer co-operation\n d) agricultural marketing\n", "a) agricultural credit"));
        arrayList.add(new ThreeItemModel("Which of the following taxes is a progressive tax?\n\n a) income tax\n b) custom tax\n c) sales tax\n d) excise duty\n", "a) income tax"));
        arrayList.add(new ThreeItemModel("In which year was the policy of population planning adopted by the government of India?\n\n a) 1947\n b) 1956\n c) 1952\n d) 1962\n", "c) 1952"));
        arrayList.add(new ThreeItemModel("Which of the following taxes is/are levied by the Union and collected and appropriated by the states?\n\n a) stamp duties\n b) passenger and good tax\n c) estate duty\n d) taxes on newspapers\n", "a) stamp duties"));
        arrayList.add(new ThreeItemModel("The terms TRIPS and TRIMS are related to\n\n a) NAFTA\n b) SAPTA\n c) EFTA\n d) GATT\n", "d) GATT"));
        arrayList.add(new ThreeItemModel("In which year was the new liberalized industrial policy announced in India?\n\n a) 1989\n b) 1990\n c) 1991\n d) 1992\n", "c) 1991"));
        arrayList.add(new ThreeItemModel("During which Five Year Plan was the annual growth rate of National Income the lowest?\n\n a) second plan\n b) third plan\n c) fifth plan\n d) sixth plan\n", "b) third plan"));
        arrayList.add(new ThreeItemModel("Chelliah Committee of 1992 deals with the overhauling of our\n\n a) public sector undertakings\n b) financial system\n c) tax system\n d) patents and copyrights\n", "c) tax system"));
        arrayList.add(new ThreeItemModel("Economic planning is an essential feature of\n\n a) capitalist economy\n b) socialist economy\n c) mixed economy\n d) dual economy\n", "b) socialist economy"));
        arrayList.add(new ThreeItemModel("What is the value of goods and services produced in a country within a year called?\n\n a) National income at factor cost\n b) net national output\n c) net national product at market prices\n d) gross national product at market prices\n", "d) gross national product at market prices"));
        arrayList.add(new ThreeItemModel("Which of the following deals with economic offences?\n\n a) MISA\n b) NSA\n c) TADA\n d) COFEPOSA\n", "d) COFEPOSA"));
        arrayList.add(new ThreeItemModel("National income is the\n\n a) Net National Product at Market price\n b) Net National product at factor coast\n c) net domestic product at market price\n d) net domestic product at factor cost\n", "c) net domestic product at market price"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("কাকিনাদা, মাচিলিপট্টম, ভেমুনিপট্টনম, এবং কৃষ্ণপট্টম মত ছোট বন্দরগুলি নিম্নলিখিত কোন রাজ্যে অবস্থিত? ক) তামিলনাড়ু খ) অন্ধ্রপ্রদেশ গ) মহারাষ্ট্র ঘ) কর্ণাটক", "খ) অন্ধ্র প্রদেশ"));
        arrayList.add(new ThreeItemModel("প্রথমবারের মতো, ভারতের প্রধানমন্ত্রী কখন ২০-দফা অর্থনৈতিক কর্মসূচি ঘোষণা করেছিলেন? ক) 1973 খ) 1974 গ) 1975 ঘ) 1976", "গ) 1975"));
        arrayList.add(new ThreeItemModel("দারিদ্র্য দূরীকরণ এবং স্বনির্ভরতা অর্জনের লক্ষ্যে নিম্নলিখিত কোন পরিকল্পনাটি? ক) দ্বিতীয় পরিকল্পনা খ) তৃতীয় পরিকল্পনা গ) চতুর্থ পরিকল্পনা ঘ) পঞ্চম পরিকল্পনা", "ডি) পঞ্চম পরিকল্পনা"));
        arrayList.add(new ThreeItemModel("ভারতে আদমশুমারি নিয়মিতভাবে প্রতি ক) 6 বছর খ) 8 বছর গ) 10 বছর ঘ) 12 বছর 12" ," গ) 10 বছর পরে নিয়মিত অনুষ্ঠিত হচ্ছে?"));
        arrayList.add(new ThreeItemModel("কোন বয়সের গ্রুপের লোকেরা ট্রাইএসইএম প্রকল্পের অধীনে প্রশিক্ষণের জন্য যোগ্য?  a) 18-35  b) 25-40  এনসি) 18-50   এনডি) 18-25  ", "ক) 18- 35 "));
        arrayList.add(new ThreeItemModel("২০০১ সালের আদমশুমারি অনুসারে ভারতের কোন শহরে সবচেয়ে বেশি জনসংখ্যা রয়েছে? ক) কোলকাতা খ) মুম্বই গ) দিল্লি ঘ) চেন্নাই", "খ) মুম্বাই"));
        arrayList.add(new ThreeItemModel("ভৌগলিক ক্ষেত্রের দিক দিয়ে ভারত বিশ্বের কোন পদে অধিষ্ঠিত?) N   ক) পাঁচ   খ) ছয়     গ) সাত   ডি) তিন  ", "গ) সাত"));
        arrayList.add(new ThreeItemModel("ভারত নিম্নলিখিত কোন দেশের সাথে তার সীমানা ভাগ করে না? ক) চীন খ) তাইওয়ান গ) বার্মা ঘ) ভুটান", "খ) তাইওয়ান"));
        arrayList.add(new ThreeItemModel("কৃষিক্ষেত্র ভারতীয় জনসংখ্যার প্রায় কত শতাংশ নিয়োগ করে? ক) 90 খ) 50 গ) 40 ডি) 70", "ডি) 70"));
        arrayList.add(new ThreeItemModel("নিচের কোনটি খরিফ ফসল? ক) বজরা খ) গম গ) সরিষা ঘ) যব", "ক) বজরা"));
        arrayList.add(new ThreeItemModel("নিচের কোনটি রবি ফসল? ক) চাল খ) জোয়ার গ) তুলা ঘ) মটর", "ডি) মটর"));
        arrayList.add(new ThreeItemModel("কে  সাদা বিপ্লবের জনক হিসাবে পরিচিত? ক) ভি কুরিয়ান খ) এমএস স্বামীনাথন গ) জে পি নারায়ণ ঘ) বাবা আমতে", "ক) ভি কুরিয়ান"));
        arrayList.add(new ThreeItemModel("সবুজ বিপ্লবের প্রধান স্থপতি কে ছিলেন যে দেশের কৃষিক্ষেত্রের উল্লেখযোগ্য উন্নতি করেছিলেন? MS a) এমএস স্বামীনাথন  ি) ভিআর কৃষা আইয়ার  ি) ভি কুরিয়ান) এনডি) জওহরলাল নেহেরু ", "ক) এমএস স্বামীনাথন "));

        arrayList.add(new ThreeItemModel("অর্থনৈতিক উন্নয়নের উপায় হিসাবে পরিকল্পনার চেষ্টা করার জন্য প্রথম প্রশাসক-রাষ্ট্রপতি কে ছিলেন? ক) স্যার সিপি রামস্বামী আইয়ার খ) এম বিশ্বেশ্বরায়া  গ) ভিটি কৃষ্ণমাচারি d) সি রাজগোপালচারী", "খ) এম বিশ্বেশ্বর্যা"));
        String str = "খ) অবিচ্ছিন্ন বৃদ্ধি শুরু";
        arrayList.add(new ThreeItemModel("একটি অর্থনীতি যখন উন্নয়নের পথে যাত্রা শুরু করে তখন ক) স্থির হয়ে যায় খ) অবিচ্ছিন্ন বৃদ্ধি শুরু হয় গ) উদারনিত হয় ঘ) সর্বাধিক বৈদেশিক সহায়তা পায়", str));
        arrayList.add(new ThreeItemModel("নীচের কোনটি অলিগোপোলির মৌলিক বৈশিষ্ট্য? ক) কয়েকটি বিক্রেতা, এক ক্রেতা খ) কয়েক জন বিক্রেতা, অনেক ক্রেতা গ) কয়েকটি বিক্রয়কারী, কয়েকটি ক্রেতা ডি) অনেক বিক্রেতা, কয়েকটি ক্রেতা", "খ) কয়েক বিক্রেতা, অনেক ক্রেতা "));
        arrayList.add(new ThreeItemModel("অর্থনীতির বৈষম্য সংশোধন করার জন্য কোন পঞ্চবার্ষিকী পরিকল্পনার লক্ষ্য ছিল?  a) প্রথম পঞ্চবার্ষিকী পরিকল্পনা  b) দ্বিতীয় পঞ্চবার্ষিকী পরিকল্পনা Plan  c) তৃতীয় পঞ্চবার্ষিকী পরিকল্পনা  d) চতুর্থ পঞ্চবার্ষিকী পরিকল্পনা   এন "," ক) প্রথম পঞ্চবার্ষিকী পরিকল্পনা "));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত পাঁচ বছরের পরিকল্পনার মধ্যে কোনটি মানব বিকাশকে সমস্ত উন্নয়নমূলক প্রচেষ্টার মূল হিসাবে স্বীকৃতি দিয়েছে?  a) অষ্টম পঞ্চবার্ষিকী পরিকল্পনা খ) সপ্তম পঞ্চবার্ষিকী পরিকল্পনা গ) পঞ্চম পঞ্চবার্ষিকী পরিকল্পনা ঘ) তৃতীয় পঞ্চবার্ষিকী পরিকল্পনা", "ক অষ্টম পঞ্চবার্ষিকী পরিকল্পনা "));
        arrayList.add(new ThreeItemModel( "নিম্নমানের কোনটি জীবনযাত্রার মান উন্নয়নের লক্ষ্যে? ক) তৃতীয় পরিকল্পনা খ) চতুর্থ পরিকল্পনা গ) পঞ্চম পরিকল্পনা ঘ) ষষ্ঠ পরিকল্পনা", "খ) চতুর্থ পরিকল্পনা"));
        arrayList.add(new ThreeItemModel("নীচের কোন জায়গায় 1774 সালে কয়লা উত্তোলন শুরু হয়েছিল?   ক) ছিন্দোয়ারা   খ) ধনবাদ  গ) রাঁচি   ডি) রানীগঞ্জ    ", "ডি) রানীগঞ্জ"));
        arrayList.add(new ThreeItemModel("ভারতের কোন রাজ্যে সুতির টেক্সটাইল মিলের সংখ্যা সবচেয়ে বেশি? Madhya   ক) মধ্য প্রদেশ   খ) মহারাষ্ট্র   গ) গুজরাট  ডি) পশ্চিমবঙ্গ " , "খ মহারাষ্ট্র"));
       arrayList.add(new ThreeItemModel("ছোটা নাগপুর মালভূমি খনিজ জমার জন্য বিখ্যাত ক) উত্তর প্রদেশ খ) ঝাড়খণ্ড গ) মধ্য প্রদেশ ঘ) বিহার", "খ) ঝাড়খণ্ড"));
        arrayList.add(new ThreeItemModel("মুম্বই স্টক এক্সচেঞ্জটি ক) 1875 খ) 1900 গ) 1922 ঘ) 1947 সালে প্রতিষ্ঠিত হয়েছিল", "ক) 1875"));
        arrayList.add(new ThreeItemModel( "এনএসডিএল শব্দটি কী বোঝায়? ক) জাতীয় সিকিউরিটিজ ডেভেলপমেন্ট লিমিটেড খ) জাতীয় সিকিউরিটিজ ডিপোজিটরি লিমিটেড গ) জাতীয় সুরক্ষা বিকাশ লিমিটেড ঘ) প্রাকৃতিক সুরক্ষা ডিপ্লোমেন্ট লিমিটেড", "খ) জাতীয় সিকিউরিটিজ ডিপোজিটরি লিমিটেড"));
        arrayList.add(new ThreeItemModel("গ্রামীণ অঞ্চলের দরিদ্রদের স্ব-কর্মসংস্থানে পরিণত করার উদ্দেশ্যে নিচের কোনটি চালু করা হয়েছিল? ক) ডিপিএপি খ) আইআরডিপি গ) ট্রাইসেম ডি) ডিডিপি", "গ) ট্রাইএসইএম"));
        arrayList.add(new ThreeItemModel("ভারতীয় অর্থনীতিতে, পরিবহণের মূল মাধ্যম হ'ল) ​​এয়ারওয়েজ খ) রেলপথ গ) নৌপথ ঘ) রোডওয়েস", "খ) রেলপথ"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কৃষিগুলির মধ্যে কোনটি ভারতে কৃষিক্ষেত্র এবং পল্লী উন্নয়নের creditণ প্রয়োজনীয়তা দেখাশোনা করে? ক) এফসিআই খ) আইডিবিআই গ) নাবার্ড ঘ) আইসিএআর", "গ) নবার্ড"));
        arrayList.add(new ThreeItemModel("ভারতের জাতীয় আয়ের নিচের কোনটি অনুমান করে? ক) কেন্দ্রীয় পরিসংখ্যান সংস্থা খ) জাতীয় আয় কমিটি গ) পরিকল্পনা কমিশন ঘ) ভারতীয় রিজার্ভ ব্যাংক", "ক) কেন্দ্রীয় পরিসংখ্যান সংস্থা"));
        arrayList.add(new ThreeItemModel("ভারতে রাজ্য সরকার কর্তৃক নিম্নলিখিত কোন কর আদায় করা হয়? ক) মদের উপর আবগারি শুল্ক খ) মূলধন লাভ কর) কাস্টমস ট্যাক্স ডি) কর্পোরেশন ট্যাক্স", "ক) মদের উপর আবগারি শুল্ক"));
        arrayList.add(new ThreeItemModel("কোন শিল্প ভারতে সর্বাধিক সংখ্যক মহিলা নিযুক্ত করে? ক) চা খ) টেক্সটাইল গ) পাট ঘ) কয়লা", "ক) চা"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোন নগদ ফসল নয়?   ক) পাট   খ) চিনাবাদাম    গ) জোয়ার   ডি) আখ  ", "গ) জোয়ার"));
        arrayList.add(new ThreeItemModel("একটি অর্থনীতি যখন উন্নয়নের পথে টেক অফ  পর্যায়ে আসে যখন ক) স্থবির হয়ে যায় খ) অবিচ্ছিন্ন বৃদ্ধি শুরু হয় গ) উদারনিত হয় ঘ) সর্বাধিক বিদেশী সহায়তা পায়", str));
        arrayList.add(new ThreeItemModel("ইউরোপীয় সম্প্রদায়ের সদস্য দেশগুলির জন্য একটি সাধারণ মুদ্রার জন্য নিম্নলিখিত চুক্তিগুলির মধ্যে কোনটি সরবরাহ করেছিল? ক) ব্রাসেলস চুক্তি খ) জেনেভা কনভেনশন গ) মাস্ত্রিচ্ট চুক্তি ঘ) ভার্সাইয়ের চুক্তি", "গ) মাষ্ট্রিচ্ট চুক্তি"));
        arrayList.add(new ThreeItemModel("এসবিআই এর অর্থ দাঁড়ায় ক) ভারতের বিজ্ঞান ও প্রকৌশল বোর্ড খ) সিকিউরিটিজ অ্যান্ড এক্সচেঞ্জ বোর্ড অফ ইন্ডিয়া গ) ভারতের সামাজিক ইক্যুইটি ব্যুরো ডি) ভারতের বিজ্ঞান ও শিক্ষাবোর্ড", "খ) সিকিউরিটিজ অ্যান্ড এক্সচেঞ্জ বোর্ড অফ ইন্ডিয়া"));
        arrayList.add(new ThreeItemModel("মিউচুয়াল ফান্ড এবং শেয়ার বাজারের জন্য নীচের নিয়ন্ত্রক কর্তৃপক্ষের সাথে নিচের কোনটি রয়েছে? ক) ভারতের রিজার্ভ ব্যাংক খ) ভারত সরকার গ) সেবিআই ঘ) স্টক এক্সচেঞ্জ", "গ) সেবিআই"));
        arrayList.add(new ThreeItemModel("বাণিজ্যের কোন দিকটি‘ বুলস এবং বিয়ার্স ’এর সাথে যুক্ত? ক) বৈদেশিক বাণিজ্য খ) স্টক এক্সচেঞ্জের বাজার গ) ব্যাংকিং ঘ) আন্তর্জাতিক অর্থ", "খ) স্টক এক্সচেঞ্জের বাজার"));
        arrayList.add(new ThreeItemModel("নীচের কোনটি অলিগোপোলির মৌলিক বৈশিষ্ট্য? ক) কয়েকটি বিক্রেতা, এক ক্রেতা খ) কয়েকটি বিক্রেতা, অনেক ক্রেতা গ) কয়েকটি বিক্রেতা, কয়েকটি ক্রেতা ঘ) অনেক বিক্রেতা, কয়েকটি ক্রেতা", "খ) ক কয়েক বিক্রেতা, অনেক ক্রেতা "));
        arrayList.add(new ThreeItemModel("রাষ্ট্রীয় আর্থিক কর্পোরেশনগুলি মূলত ক) ক্ষুদ্র ও মাঝারি শিল্পের বিকাশের জন্য সহায়তা দেয় খ) কৃষি খামার গ) সুতি শিল্প ঘ) বৃহত আকারের শিল্প", "ক) ক্ষুদ্র ও মাঝারি শিল্প"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত ক্ষেত্রগুলির মধ্যে কোনটি ভারতে প্রথম সমবায় আন্দোলন শুরু করেছিল? ক) কৃষির creditণ খ) কৃষিকাজে গ) ভোক্তা সহযোগিতা ঘ) কৃষি বিপণন", "ক) কৃষি creditণ"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত করগুলির মধ্যে কোনটি প্রগতিশীল কর? ক) আয়কর খ) কাস্টম ট্যাক্স গ) বিক্রয় কর ঘ) আবগারি শুল্ক", "ক) আয়কর"));
        arrayList.add(new ThreeItemModel("ভারত সরকার গৃহীত জনসংখ্যা পরিকল্পনার নীতিটি কোন বছরে গৃহীত হয়েছিল? ক) ১৯৪ 1947 খ) ১৯৫6 গ) ১৯৫২ ঘ) ১৯62২", "গ) ১৯৫২"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কোন করটি ইউনিয়ন কর্তৃক আদায় করা হয় এবং রাজ্যগুলি দ্বারা সংগ্রহ ও বরাদ্দ করা হয়? ক) স্ট্যাম্প শুল্ক খ) যাত্রী এবং ভাল কর গ) এস্টেট শুল্ক ঘ) সংবাদপত্রগুলিতে কর", "ক) স্ট্যাম্প শুল্ক"));
        arrayList.add(new ThreeItemModel("টিআরআইপিএস এবং ট্রিমস পদগুলি ক) নফটা খ) সাপটা গ) ইফটিএ ঘ) গ্যাট", "ডি) গ্যাট"));
        arrayList.add(new ThreeItemModel("ভারতে নতুন উদারিকৃত শিল্পনীতি কোন বছরে ঘোষিত হয়েছিল? ক) 1989 খ) 1990 গ) 1991 ঘ) 1992", "গ) 1991"));
        arrayList.add(new ThreeItemModel("কোন পঞ্চবার্ষিকী পরিকল্পনার সময় জাতীয় আয়ের বার্ষিক বৃদ্ধির হার ছিল সর্বনিম্ন? ক) দ্বিতীয় পরিকল্পনা খ) তৃতীয় পরিকল্পনা গ) পঞ্চম পরিকল্পনা ঘ) ষষ্ঠ পরিকল্পনা", "খ) তৃতীয় পরিকল্পনা"));
        arrayList.add(new ThreeItemModel("১৯৯২ সালের চেলিয়াহ কমিটি আমাদের ক) পাবলিক সেক্টরের কর্মকাণ্ডের ওভারহালিংয়ের সাথে সম্পর্কিত খ) আর্থিক ব্যবস্থা গ) কর ব্যবস্থা ডি) পেটেন্টস এবং কপিরাইটস", "গ) ট্যাক্স সিস্টেম"));
        arrayList.add(new ThreeItemModel("অর্থনৈতিক পরিকল্পনা হ'ল capital   ক) পুঁজিবাদী অর্থনীতি   খ) সমাজতান্ত্রিক অর্থনীতি   গ) মিশ্র অর্থনীতি   ডি) দ্বৈত অর্থনীতি  ", "খ) সমাজতান্ত্রিক অর্থনীতি"));
        arrayList.add(new ThreeItemModel("এক বছরের মধ্যে কোন দেশে উত্পাদিত পণ্য ও সেবার মূল্য কত? ক) জাতীয় খরচে জাতীয় আয় খ) নেট জাতীয় আউটপুট গ) বাজারমূল্যে নেট জাতীয় পণ্য ঘ) বাজার মূল্যে মোট জাতীয় পণ্য", "ডি ) বাজার মূল্যে মোট জাতীয় পণ্য "));
        arrayList.add(new ThreeItemModel("অর্থনৈতিক অপরাধের সাথে নিচের কোনটি চুক্তি করে? ক) মিসা খ) এনএসএ গ) টাডা ঘ) কফপোসা", "ডি) কফোপোসা"));
        arrayList.add(new ThreeItemModel("জাতীয় আয় হ'ল ক) বাজার মূল্যে নেট জাতীয় পণ্য খ) ফ্যাক্টর উপকূলে নেট জাতীয় পণ্য গ) বাজার মূল্যে নেট দেশীয় পণ্য ঘ) ফ্যাক্টর ব্যয়ে নেট গার্হস্থ্য পণ্য", "গ) বাজার মূল্যে নেট দেশীয় পণ্য"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("आर्थिक विकास के साधनों के रूप में नियोजन का प्रयास करने वाला पहला प्रशासक-राजनेता कौन था? (सर सीपी रामास्वामी अय्यर b) एम विश्वेश्वरय्या c) वीटी कृष्णामाचारी d) सी राजगोपालाचारी", "b) एम विश्वेश्वरय्या"));
        String str = "बी) स्थिर विकास शुरू होता है";
        arrayList.add(new ThreeItemModel("एक अर्थव्यवस्था अपने विकास के रास्ते पर ले जाने के चरण में है जब यह क) स्थिर बी हो जाता है) स्थिर विकास शुरू होता है ग) उदारवादी घ) को अधिकतम विदेशी सहायता मिलती है", str));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा मूल गुण Oligopoly है? (A) कुछ विक्रेता, एक खरीदार b) कुछ विक्रेता, कई खरीदार c) कुछ विक्रेता, कुछ खरीदार d) कई विक्रेता, कुछ खरीदार", "b) कुछ विक्रेता, कई खरीदार "));
        arrayList.add(new ThreeItemModel("निम्नलिखित पंचवर्षीय योजनाओं में से किसने सभी विकास प्रयासों के मूल के रूप में मानव विकास को मान्यता दी? (ए) आठवीं पंचवर्षीय योजना ख) सातवीं पंचवर्षीय योजना सी) पांचवीं पंचवर्षीय योजना", "घ) तीसरी पंचवर्षीय योजना वर्ष की योजना "));
        arrayList.add(new ThreeItemModel("जीवन स्तर में सुधार लाने के उद्देश्य से निम्नलिखित में से कौन सी योजना है? (तीसरी योजना ख) चौथी योजना ग) पांचवीं योजना घ) छठी योजना", "ख) चौथी योजना"));
        arrayList.add(new ThreeItemModel("1774 में कोयले का खनन निम्नलिखित में से किस स्थान पर शुरू हुआ था? (ए) छिंदवाड़ा b) धनबाद c) रांची d) रानीगंज","d) रानीगंज"));
        arrayList.add(new ThreeItemModel("किस भारतीय राज्य में कपास कपड़ा मिलों की संख्या सबसे अधिक है? (मध्य प्रदेश b) महाराष्ट्र c) गुजरात d) पश्चिम बंगाल", "b) महाराष्ट्र"));
        arrayList.add(new ThreeItemModel("काकीनाडा, मछलीपट्टनम, भीमुनिपटनम और कृष्णापटनम जैसे छोटे बंदरगाह निम्नलिखित में से किस राज्य में हैं? ए) तमिलनाडु b) आंध्र प्रदेश c) महाराष्ट्र d) कर्नाटक", "b) आंध्र प्रदेश"));
        arrayList.add(new ThreeItemModel("जब, पहली बार, भारत के प्रधान मंत्री ने 20-सूत्रीय आर्थिक कार्यक्रम की घोषणा की? (ए) 1973 बी) 1974 सी) 1975 डी) 1976", "सी) 1975"));
        arrayList.add(new ThreeItemModel("गरीबी हटाने और आत्मनिर्भरता प्राप्त करने के उद्देश्य से निम्नलिखित में से कौन सी योजना है? (दूसरी योजना b) तीसरी योजना c) चौथी योजना d) पांचवीं योजना", "d) पांचवीं योजना"));
        arrayList.add(new ThreeItemModel("भारत में जनगणना नियमित रूप से प्रत्येक   a के बाद 6 साल  b) 8 साल   c) 10 साल   d) 12 साल  ", "c) 10 साल बाद आयोजित की जा रही है"));
        arrayList.add(new ThreeItemModel("TRYSEM योजना के तहत प्रशिक्षण के लिए कौन से आयु वर्ग के लोग पात्र हैं? (A) 18-35 b) 25-40 c) 18-50 d) 18-25", "a) 18-35"));
        arrayList.add(new ThreeItemModel("2001 में जनगणना के अनुसार, भारत के किस शहर में सबसे अधिक जनसंख्या है? (ए) कोलपट्टा b) मुंबई c) दिल्ली d) चेन्नई", "b) मुंबई"));
        arrayList.add(new ThreeItemModel("भौगोलिक क्षेत्र के संदर्भ में भारत दुनिया में किस स्थान पर है? (ए) पाँच बी) छह सी) सात डी) तीन", "सी) सात"));
        arrayList.add(new ThreeItemModel("भारत निम्नलिखित देशों में से किसके साथ अपनी सीमा साझा नहीं करता है? (A) चीन b) ताइवान c) बर्मा d) भूटान", "b) ताइवान"));
        arrayList.add(new ThreeItemModel("कृषि लगभग कितने प्रतिशत भारतीय जनसंख्या को रोजगार देती है? (ए) 90 बी) 50 सी) 40 डी) 70", "डी 70"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन एक खरीफ की फसल है (a) बाजरा b) गेहूं c) सरसों d) जौ", "a) बाजरा"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सी एक रबी फसल है? (ए) चावल बी) ज्वार सी) कपास डी) मटर", "डी) मटर"));
        arrayList.add(new ThreeItemModel("श्वेत क्रांति के पिता के रूप में किसे जाना जाता है? (ए) वी कुरियन बी) एमएस स्वामीनाथन सी) जेपी नारायण डी) बाबा आम्टे", "ए) वी कुरियन"));
        arrayList.add(new ThreeItemModel("हरित क्रांति के प्रमुख वास्तुकार कौन थे, जिन्होंने देश में कृषि उपज में काफी सुधार किया? (ए। एम। स्वामीनाथन b) वीआर कृष्णा अय्यर c) वी कुरियन d) जवाहरलाल नेहरू", "ए) एमएस स्वामीनाथन"));
        arrayList.add(new ThreeItemModel("छोटा नागपुर का पठार अपने खनिज भंडार के लिए प्रसिद्ध है) उत्तर प्रदेश में है) झारखंड ग) मध्य प्रदेश घ) बिहार", "बी) झारखंड"));
        arrayList.add(new ThreeItemModel("मुंबई स्टॉक एक्सचेंज की स्थापना 1875 बी) 1900 सी) 1922 डी) 1947", "ए) 1875 में की गई थी।"));
        arrayList.add(new ThreeItemModel("एनएसडीएल शब्द का अर्थ क्या है? (ए) नेशनल सिक्योरिटीज डेवलपमेंट लिमिटेड बी) नेशनल सिक्योरिटीज डिपॉजिटरी लिमिटेड सी) नेशनल सेफ्टी डेवलपमेंट लिमिटेड डी) नेचुरल सेफ्टी डिप्लॉयमेंट लिमिटेड", "बी) नेशनल सिक्योरिटीज डिपॉजिटरी लिमिटेड"));
        arrayList.add(new ThreeItemModel("ग्रामीण क्षेत्रों में गरीबों को स्वरोजगार बनने में मदद करने के उद्देश्य से निम्नलिखित में से कौन सा लॉन्च किया गया था? (A) DPAP b) IRDP c) TRYSEM d) DDP", "c) TRYSEM"));
        arrayList.add(new ThreeItemModel("भारतीय अर्थव्यवस्था में, परिवहन का मुख्य साधन है a) वायुमार्ग b) रेलवे c) जलमार्ग d) रोडवेज", "b) रेलवे"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा संगठन भारत में कृषि और ग्रामीण विकास की क्रेडिट जरूरतों को देखता है? (एफसीआई बी) आईडीबीआई सी) नाबार्ड डी) आईसीएआर", "सी) नाबार्ड"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन भारत में राष्ट्रीय आय का अनुमान लगाता है? (A) केंद्रीय सांख्यिकीय संगठन b) राष्ट्रीय आय समिति c) योजना आयोग d) भारतीय रिज़र्व बैंक", "a) केंद्रीय सांख्यिकीय संगठन"));
        arrayList.add(new ThreeItemModel("कौन सा उद्योग भारत में महिलाओं की सबसे बड़ी संख्या को नियोजित करता है? (ए) चाय बी) कपड़ा सी) जूट डी) कोयला", "ए उद्योग "));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सी नकदी फसल नहीं है? (A) जूट b) मूंगफली c) ज्वार d) गन्ना", "c) ज्वार"));
        arrayList.add(new ThreeItemModel("एक अर्थव्यवस्था development टेक ऑफ 'के चरण में विकास के पथ पर है जब यह a) स्थिर हो जाता है b) स्थिर विकास शुरू होता है c) उदारीकृत होता है d) अधिकतम विदेशी सहायता प्राप्त करता है", str));
        arrayList.add(new ThreeItemModel("यूरोपीय समुदाय के सदस्य देशों के लिए एक सामान्य मुद्रा के लिए प्रदान की जाने वाली संधियों में से कौन सी? (ए) ब्रुसेल्स संधि बी) जेनेवा कन्वेंशन सी) मास्ट्रिच संधि डी) वर्साय की संधि", "सी) मास्ट्रिच संधि"));
        arrayList.add(new ThreeItemModel("SEBI का अर्थ है a) विज्ञान और इंजीनियरिंग बोर्ड ऑफ इंडिया b) भारतीय प्रतिभूति और विनिमय बोर्ड c) भारत का सामाजिक इक्विटी ब्यूरो d) भारत का विज्ञान और शैक्षिक बोर्ड", "b) भारतीय प्रतिभूति और विनिमय बोर्ड"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किसके साथ म्यूचुअल फंड और शेयर बाजार के लिए बुनियादी नियामक प्राधिकरण निहित है? (A) भारतीय रिजर्व बैंक b) भारत सरकार c) सेबी d) स्टॉक एक्सचेंज", "c) सेबी"));
        arrayList.add(new ThreeItemModel("वाणिज्य का कौन सा पहलू s बुल्स और बियर 'से जुड़ा है? (ए) विदेश व्यापार बी) स्टॉक एक्सचेंज बाजार सी) बैंकिंग डी) अंतर्राष्ट्रीय वित्त", "बी) स्टॉक एक्सचेंज बाजार"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा मूल गुण Oligopoly है? (A) कुछ विक्रेता, एक खरीदार b) कुछ विक्रेता, कई खरीदार c) कुछ विक्रेता, कुछ खरीदार d) कई विक्रेता, कुछ खरीदार", "b) a कुछ विक्रेता, कई खरीदार "));
        arrayList.add(new ThreeItemModel("राज्य वित्तीय निगम मुख्य रूप से a) लघु और मध्यम उद्योग को विकसित करने के लिए सहायता देते हैं b) कृषि फार्म c) कपास उद्योग d) बड़े पैमाने पर उद्योग", "a) लघु और मध्यम उद्योग"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किस क्षेत्र में भारत में पहला सहकारी आंदोलन शुरू किया गया था? (ए) कृषि ऋण ख) कृषि गतिविधियां ग) उपभोक्ता सहयोग डी) कृषि विपणन", "ए) कृषि ऋण"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा कर एक प्रगतिशील कर है? (क) आयकर ख) कस्टम कर ग) बिक्री कर घ) उत्पाद शुल्क", "क) आयकर"));
        arrayList.add(new ThreeItemModel("भारत सरकार द्वारा अपनाई गई जनसंख्या नियोजन की नीति किस वर्ष में थी? (A) 1947 b) 1956 c) 1952 d) 1962", "c) 1952"));
        arrayList.add(new ThreeItemModel("निम्नलिखित करों में से कौन सा है / संघ द्वारा लगाया जाता है और राज्यों द्वारा एकत्र और विनियोजित किया जाता है (ए) स्टैंप ड्यूटी बी) यात्री और अच्छा कर ग) संपत्ति शुल्क घ) अखबारों पर कर", "ए) स्टैंप ड्यूटी"));
        arrayList.add(new ThreeItemModel("शब्द TRIPS और TRIMS a से संबंधित हैं) नाफ्टा b) SAPTA c) EFTA d) GATT", "d) GATT"));
        arrayList.add(new ThreeItemModel("भारत में नई उदारीकृत औद्योगिक नीति की घोषणा किस वर्ष की गई थी? (A) 1989 b) 1990 c) 1991 d) 1992", "c) 1991"));
        arrayList.add(new ThreeItemModel("जिस दौरान पंचवर्षीय योजना राष्ट्रीय आय की वार्षिक विकास दर सबसे कम थी (a) दूसरी योजना b) तीसरी योजना c) पाँचवीं योजना d) छठी योजना", "b) तीसरी योजना"));
        arrayList.add(new ThreeItemModel("1992 की चेल्हिया समिति हमारे a) सार्वजनिक क्षेत्र के उपक्रम b) वित्तीय प्रणाली c) कर प्रणाली d) पेटेंट और कॉपीराइट", "c) कर प्रणाली के ओवरहालिंग से संबंधित है"));
        arrayList.add(new ThreeItemModel("आर्थिक नियोजन a) पूंजीवादी अर्थव्यवस्था की आवश्यक विशेषता है b) समाजवादी अर्थव्यवस्था c) मिश्रित अर्थव्यवस्था d) दोहरी अर्थव्यवस्था", "b) समाजवादी अर्थव्यवस्था"));
        arrayList.add(new ThreeItemModel("एक वर्ष के भीतर किसी देश में उत्पादित वस्तुओं और सेवाओं का मूल्य क्या है? (क) कारक लागत पर राष्ट्रीय आय ख) शुद्ध राष्ट्रीय उत्पादन ग) बाजार मूल्य पर शुद्ध राष्ट्रीय उत्पाद घ) बाजार मूल्य पर सकल राष्ट्रीय उत्पाद", "घ ) बाजार मूल्य पर सकल राष्ट्रीय उत्पाद "));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन आर्थिक अपराधों से संबंधित है? (ए) MISA b) NSA c) टाडा d) COFEPOSA", "d) COFEPOSA"));
        arrayList.add(new ThreeItemModel("राष्ट्रीय आय एक है) बाजार मूल्य पर शुद्ध राष्ट्रीय उत्पाद ख) कारक तट पर शुद्ध राष्ट्रीय उत्पाद ग) बाजार मूल्य पर शुद्ध घरेलू उत्पाद घ) कारक लागत पर शुद्ध घरेलू उत्पाद", "ग) बाजार मूल्य पर शुद्ध घरेलू उत्पाद"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("اقتصادی ترقی کے ذریعہ منصوبہ بندی کرنے کی کوشش کرنے والا پہلا منتظم سیاستدان کون تھا؟ a) سر سی پی رامسوامی آیئیر b) ایم وشویشورایا c) وی ٹی کرشنامچاری d) سی راجگوپالچاری" , "b) M Visesesaraya"));
        String str ="بی) مستحکم نمو شروع ہوتا ہے";
        arrayList.add(new ThreeItemModel("جب معیشت ترقی کی راہ پر گامزن ہوجاتی ہے جب وہ a) جمود ہوجاتا ہے b) مستحکم نمو شروع ہوتی ہے c) آزاد ہو جاتا ہے d) زیادہ سے زیادہ غیر ملکی امداد مل جاتی ہے", str));
        arrayList.add(new ThreeItemModel("اولیگوپولی کی بنیادی خصوصیت مندرجہ ذیل میں سے کون سی ہے؟ ا) چند بیچنے والے ، ایک خریدار بی) کچھ بیچنے والے ، بہت سے خریدار ج) کچھ بیچنے والے ، چند خریدار ڈی) بہت سارے بیچنے والے ، چند خریدار" , "بی) کچھ بیچنے والے ، بہت سے خریدار "));
        arrayList.add(new ThreeItemModel("پانچ سالہ منصوبے میں سے کس کا مقصد معیشت میں عدم استحکام کو دور کرنا تھا؟ ا) پہلا پانچ سالہ منصوبہ ب) دوسرا پانچ سالہ منصوبہ ج) تیسرا پانچ سالہ منصوبہ د) چوتھا پانچ سالہ منصوبہ" , "الف) پہلا پانچ سال کا منصوبہ "));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل پانچ سالہ منصوبوں میں سے کس نے انسانی ترقی کو تمام ترقیاتی کوششوں کا بنیادی مرکز تسلیم کیا؟ a) آٹھویں پانچ سالہ منصوبہ ب) ساتواں پانچ سالہ منصوبہ ج) پانچواں پانچ سالہ منصوبہ د) تیسرا پانچ سالہ منصوبہ" , "ا پانچواں پانچواں منصوبہ" ));
        arrayList.add(new ThreeItemModel("درج ذیل میں سے کون سا منصوبہ ہے جس کا مقصد زندگی کے معیار کو بہتر بنانا ہے؟ ا) تیسرا منصوبہ ب) چوتھا منصوبہ ج) پانچواں منصوبہ د) چھٹا منصوبہ", "ب) چوتھا منصوبہ"));
        arrayList.add(new ThreeItemModel("کوئلے کی کان کنی کا کام مندرجہ ذیل میں سے 1774 میں شروع ہوا تھا۔ ا) چھندواڑہ ب) دھن آباد سی) رانچی ڈی) رانی گنج" , "د) رانی گنج"));
        arrayList.add(new ThreeItemModel("سوتی ٹیکسٹائل ملوں کی سب سے زیادہ تعداد ہندوستان کی کس ریاست میں ہے؟ ا) مدھیہ پردیش ب) مہاراشٹر سی) گجرات ڈی) مغربی بنگال" , "بی) مہاراشٹر"));
        arrayList.add(new ThreeItemModel("کاکینڈا ، مچلیپٹنم ، بھیمونیپٹنم ، اور کرشنپٹنم جیسے معمولی بندرگاہیں درج ذیل میں سے کس ریاست میں ہیں؟ ا) تمل ناڈو b) آندھرا پردیش c) مہاراشٹرا d) کرناٹک" , "b) آندھرا پردیش"));
        arrayList.add(new ThreeItemModel("جب ، پہلی بار ، ہندوستان کے وزیر اعظم نے 20 نکاتی اقتصادی پروگرام کا اعلان کیا؟ a) 1973 b) 1974 c) 1975 d) 1976" , "c) 1975"));
        arrayList.add(new ThreeItemModel("غربت کے خاتمے اور خود انحصاری کے حصول کے لئے مندرجہ ذیل میں سے کون سا منصوبہ ہے؟ ایک) دوسرا منصوبہ ب) تیسرا منصوبہ ج) چوتھا منصوبہ د) پانچواں منصوبہ" , "د) پانچواں منصوبہ"));
        arrayList.add(new ThreeItemModel("ہندوستان میں مردم شماری ہر ایک) 6 سال کے بعد باقاعدگی سے منعقد کی جارہی ہے ب) 8 سال سی) 10 سال د) 12 سال" , "سی) 10 سال"));
        arrayList.add(new ThreeItemModel("کس عمر کے افراد سے تعلق رکھنے والے افراد TRYSEM اسکیم کے تحت تربیت کے اہل ہیں؟ a) 18-35 b) 25-40 c) 18-50 d) 18-25", "a) 18-35"));
        arrayList.add(new ThreeItemModel("2001 میں مردم شماری کے مطابق ، ہندوستان میں کون سے شہر کی آبادی سب سے زیادہ ہے؟ a) کولکٹہ b) ممبئی c) دہلی d) چنئی" , "b) ممبئی"));
        arrayList.add(new ThreeItemModel("جغرافیائی علاقے کے لحاظ سے ہندوستان دنیا میں کس مقام پر قابض ہے؟ a) پانچ ب) چھ ج) سات د) تین" , "سی) سات"));
        arrayList.add(new ThreeItemModel("ہندوستان مندرجہ ذیل میں سے کس ملک کے ساتھ اپنی حدود مشترک نہیں کرتا؟ ا) چین ب) تائوا ج) برما ڈی) بھوٹان" , "بی) تائیوان"));
        arrayList.add(new ThreeItemModel("زراعت ہندوستانی آبادی کا تقریبا what کتنی فیصد پر ملازمت کرتی ہے؟ a) 90 b) 50 c) 40 d) 70" , "d) 70"));
        arrayList.add(new ThreeItemModel("خریف کی فصل میں سے ایک میں سے ایک ہے؟ a) باجرا ب) گندم سی) سرسوں d) جو جو" , "ا) باجرا"));
        arrayList.add(new ThreeItemModel("ربیع کی فصل مندرجہ ذیل میں سے کون سی ہے؟ ا) چاول ب) جوار ج) روئی  n د) مٹر" , "د) مٹر"));
        arrayList.add(new ThreeItemModel("کون وائٹ انقلاب کا باپ کے طور پر جانا جاتا ہے؟ a) وی کورین  n ب) ایم ایس سوامیاتھن سی) جے پی نارائن ڈی) بابا امٹے" , "ایک) وی کورین"));
        arrayList.add(new ThreeItemModel("سبز انقلاب کا مرکزی معمار کون تھا جس نے ملک میں زرعی پیداوار میں نمایاں بہتری لائی؟ a) ایم ایس سوامیاتھن b) وی آر کرشا اغیار ج) وی کورین ڈی) جواہر لال نہرو" , "ایک) ایم ایس سوامیاتھن"));
        arrayList.add(new ThreeItemModel("چھوٹا ناگپور مرتفع اپنے معدنیات کے ذخائر کے لئے مشہور a) اترپردیش b) جھارکھنڈ c) مدھیہ پردیش d) بہار" , "b) جھارکھنڈ"));
        arrayList.add(new ThreeItemModel("ممبئی اسٹاک ایکسچینج a) 1875 b) 1900 c) 1922 d) 1947 میں قائم کیا گیا تھا" , "ا) 1875"));
        arrayList.add(new ThreeItemModel("این ایس ڈی ایل کی اصطلاح کیا ہے؟ a) نیشنل سیکیورٹیز ڈویلپمنٹ لمیٹڈ b) نیشنل سیکیورٹیز ڈپازٹری لمیٹڈ c) نیشنل سیفٹی ڈویلپمنٹ لمیٹڈ d) قدرتی سیفٹی ڈپلائمنٹ لمیٹڈ" , "b) نیشنل سیکیورٹیز ڈپازٹری لمیٹڈ"));
        arrayList.add(new ThreeItemModel("دیہی علاقوں میں غریبوں کو خود روزگار بننے میں مدد دینے کے مقصد سے مندرجہ ذیل میں سے کون سا آغاز کیا گیا؟ a) ڈی پی اے پی b) IRDP c) TRYSEM d) DDP" , "c) TRYSEM"));
        arrayList.add(new ThreeItemModel("ہندوستانی معیشت میں ، نقل و حمل کا بنیادی ذریعہ ایک ہیں) ائر ویز ب) ریلوے ج) آبی گزرگاہیں ڈی) روڈ ویز" ,"بی) ریلوے"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سی تنظیم ہندوستان میں زراعت اور دیہی ترقی کی ساکھ کی ضروریات کو دیکھتی ہے؟ a) ایف سی آئی b) IDBI c) نابارڈ ڈی) آئی سی اے آر" , "سی) ناآبارڈ"));
        arrayList.add(new ThreeItemModel("ہندوستان میں قومی آمدنی کا اندازہ مندرجہ ذیل میں سے کونسا ہے؟ a) مرکزی شماریاتی تنظیم b) قومی انکم کمیٹی c) منصوبہ بندی کمیشن d) ریزرو بینک آف انڈیا" , "a) مرکزی شماریاتی تنظیم"));
        arrayList.add(new ThreeItemModel("ہندوستان میں ریاستی حکومتوں کے ذریعہ مندرجہ ذیل میں سے کون سا ٹیکس عائد کیا جاتا ہے؟ a) شراب پر ایکسائز ڈیوٹی b) کیپیٹل گین ٹیکس c) کسٹم ٹیکس d) کارپوریشن ٹیکس" , "a) شراب پر ایکسائز ڈیوٹی"));
        arrayList.add(new ThreeItemModel("ہندوستان میں خواتین کی سب سے بڑی تعداد کو کس صنعت میں ملازمت ہے؟ ا) چائے ب) ٹیکسٹائل سی) جوٹ ڈی) کوئلہ" , "ایک) چائے"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا نقد فصل نہیں ہے؟ a) جوٹ ب) مونگ پھلی ج) جوور ڈی) گنے" , "ج) جوار"));
        arrayList.add(new ThreeItemModel("جب معیشت ترقی کی راہ پر گامزن ہوجاتی ہے جب وہ a) جمود ہوجاتا ہے b) مستحکم نمو شروع ہوتی ہے c) آزاد ہو جاتا ہے d) زیادہ سے زیادہ غیر ملکی امداد مل جاتی ہے", str));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل معاہدوں میں سے کس نے یورپی برادری کے ممبر ممالک کے لئے مشترکہ کرنسی کے لئے فراہم کی؟ a) برسلز معاہدہ b) جنیوا کنونشن c) ماسٹریچ ٹریٹی d) ورسیوں کا معاہدہ" , "c) ماسٹریچ ٹریٹی"));
        arrayList.add(new ThreeItemModel("SEBI کا مطلب ہے ایک) سائنس اور انجینئرنگ بورڈ آف انڈیا b) سیکیورٹیز اینڈ ایکسچینج بورڈ آف انڈیا c) سوشل ایکویٹی بیورو آف انڈیا d) سائنس اینڈ ایجوکیشنل بورڈ آف انڈیا" , "b) سیکیورٹیز اینڈ ایکسچینج بورڈ آف انڈیا"));
        arrayList.add(new ThreeItemModel("باہمی فنڈز اور اسٹاک منڈیوں کے لئے بنیادی ریگولیٹری اتھارٹی مندرجہ ذیل میں سے کس کے پاس ہے؟ a) ریزرو بینک آف انڈیا b) حکومت ہند سی) سیبی ڈی) اسٹاک ایکسچینجز" , "سی) سیبی"));
        arrayList.add(new ThreeItemModel("تجارت کے کس پہلو سے‘ بل اور ریچھ ’منسلک ہیں؟ a) غیر ملکی تجارت ب) اسٹاک ایکسچینج مارکیٹ c) بینکاری د) بین الاقوامی خزانہ" , "b) اسٹاک ایکسچینج مارکیٹ"));
        arrayList.add(new ThreeItemModel("اولیگوپولی کی بنیادی خصوصیت مندرجہ ذیل میں سے کون سی ہے؟ ا) چند بیچنے والے ، ایک خریدار بی) کچھ بیچنے والے ، بہت سے خریدار ج) کچھ بیچنے والے ، چند خریدار ڈی) بہت سارے بیچنے والے ، کچھ خریدار" , "بی) ایک کچھ بیچنے والے ، بہت سے خریدار "));
        arrayList.add(new ThreeItemModel("ریاستی مالیاتی کارپوریشنز بنیادی طور پر ایک) چھوٹی اور درمیانے درجے کی صنعتوں کی ترقی کے لئے مدد فراہم کرتی ہیں۔ ب) زرعی فارمز) کپاس کی صنعت د) بڑے پیمانے پر صنعتیں" , "ایک) چھوٹی اور درمیانے درجے کی صنعتیں"));
        arrayList.add(new ThreeItemModel("ہندوستان میں درج ذیل میں سے کس شعبے میں پہلی کوآپریٹو تحریک کی ابتدا کی گئی تھی؟ a) زرعی قرضہ b) کاشتکاری کی سرگرمیاں c) صارفین کا تعاون d) زرعی مارکیٹنگ" , "a) زرعی قرضہ"));
        arrayList.add(new ThreeItemModel("درج ذیل میں سے کونسا ٹیکس ترقی پسند ٹیکس ہے؟ a) انکم ٹیکس b) کسٹم ٹیکس c) سیلز ٹیکس d) ایکسائز ڈیوٹی" , "a) انکم ٹیکس"));
        arrayList.add(new ThreeItemModel("حکومت ہند کی آبادی کی منصوبہ بندی کی پالیسی کس سال میں اختیار کی گئی؟ a) 1947 b) 1956 c) 1952 d) 1962" , "c) 1952"));
        arrayList.add(new ThreeItemModel("یونین کے ذریعہ مندرجہ ذیل میں سے کون سا ٹیکس عائد کیا جاتا ہے اور وہ ریاستوں کے ذریعہ جمع اور مختص کیا جاتا ہے؟ ا) ڈاک ٹکٹ کی ڈیوٹی ب) مسافر اور اچھے ٹیکس سی) اسٹیٹ ڈیوٹی ڈی) اخبارات پر ٹیکس" , "ا) ڈاک ٹکٹ کی ڈیوٹی"));
        arrayList.add(new ThreeItemModel("ٹرپس اور ٹرامس کی اصطلاحات ایک سے متعلق ہیں) نفاٹا ب) سیپٹا سی) ای ایف ٹی اے ڈی) جی اے ٹی ٹی" ,"د) جی اے ٹی ٹی"));
        arrayList.add(new ThreeItemModel("ہندوستان میں نئی ​​آزاد خیال صنعتی پالیسی کا اعلان کس سال ہوا؟ a) 1989 b) 1990 c) 1991 d) 1992" , "c) 1991"));
        arrayList.add(new ThreeItemModel("جس پانچ سال کے منصوبے کے دوران قومی آمدنی کی سالانہ شرح نمو سب سے کم تھی؟ a) دوسرا منصوبہ b) تیسرا منصوبہ c) پانچواں منصوبہ d) چھٹا منصوبہ" , "b) تیسرا منصوبہ"));
        arrayList.add(new ThreeItemModel("1992 کی چیلہہ کمیٹی ہمارے a) عوامی شعبے کے اقدامات کی بحالی سے متعلق ہے۔ b) مالیاتی نظام c) ٹیکس نظام d) پیٹنٹ اور کاپی رائٹس" , "c) ٹیکس نظام"));
        arrayList.add(new ThreeItemModel("معاشی منصوبہ بندی ایک لازمی خصوصیت ہے a) سرمایہ دارانہ معیشت b) سوشلسٹ معیشت c) مخلوط معیشت d) دوہری معیشت" , "b) سوشلسٹ معیشت"));
        arrayList.add(new ThreeItemModel("ایک سال کے اندر کسی ملک میں تیار کردہ سامان اور خدمات کی قیمت کیا ہے؟ ایک) قومی آمدنی عنصر لاگت پر ب) خالص قومی پیداوار سی) مارکیٹ کی قیمتوں پر خالص قومی پیداوار ڈی) مارکیٹ کی قیمتوں پر مجموعی قومی پیداوار" , "ڈی ) مارکیٹ کی قیمتوں پر مجموعی قومی پیداوار "));
        arrayList.add(new ThreeItemModel("معاشی مجرموں سے متعلق مندرجہ ذیل میں سے کون سا سودا؟ a) MISA b) NSA c) TADA d) CFEPOSA", "d) COFEPOSA"));
        arrayList.add(new ThreeItemModel("قومی آمدنی ایک ہے۔) مارکیٹ کی قیمت پر قومی قومی پیداوار ب) عنصر کوسٹ پر خالص قومی پیداوار ج) مارکیٹ کی قیمت پر خالص ملکی پیداوار د) عنصر لاگت پر خالص ملکی پیداوار" , "سی) مارکیٹ کی قیمت پر خالص ملکی پیداوار"));


        return arrayList;
    }


}
