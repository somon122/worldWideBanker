package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_NobelPrize {


    private Context context;
    public Q_NobelPrize(Context context) {
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
    arrayList.add(new ThreeItemModel("Biologist of Indian origin who received the Nobel Prize was\n\nA) C.V. Raman\nB) Raja Ramanna\nC) Hargovind Khorana\nD) Jagadish Chandra Bose\n", "C) Hargovind Khorana"));
        arrayList.add(new ThreeItemModel("Nobel Prize winning India, Amartya Sen, is known for his work in which area?\n\nA) Chemistry\nB) Economics\nC) Physics\nD) Environmental Protection\n", "B) Economics"));
        arrayList.add(new ThreeItemModel("Which India-born scientist was awarded the Nobel Prize in Astrophysics?\n\nA) Sir. C.V. Raman\nB) Satyendra Nath Bose\nC) Vikram Sarabhai\nD) Prof. Chandrashekha\n", "D) Prof. Chandrashekha"));
        arrayList.add(new ThreeItemModel("Nobel Prize in which field is not paid out of the endowment set up by Dr. Alfred Nobel?\n\nA) Peace\nB) Medicine\nC) Economics\nD) Chemistry\n", "C) Economics"));
        arrayList.add(new ThreeItemModel("The Nobel Prize was instituted by the country\n\nA) UK\nB) USA\nC) Russia\nD) Sweden\n", "D) Sweden"));
        arrayList.add(new ThreeItemModel("The Indian representing an international organization who shared the Nobel Peace Prize with Al Gore of U.S. was\n\nA) R.N. Tagore\nB) Rajendra Pachauri\nC) Mother Teresa\nD) Viswanathan Subramanian\n", "B) Rajendra Pachauri"));
        arrayList.add(new ThreeItemModel("In which year did Amartya Kumar Sen receive the Nobel Prize in Economics?\n\nA) 1998\nB) 1995\nC) 1990\nD) 2000\n", "A) 1998"));
        arrayList.add(new ThreeItemModel("Among the following Nobel laureates, who was not a recipient of the Nobel Prize for Peace?\n\nA) Norman Eanest Borlaug\nB) Linus C. Pauling\nC) Woodrow Wilson\nD) Sir Winston Churchill\n", "D) Sir Winston Churchill"));
        arrayList.add(new ThreeItemModel("Sir C.V. Raman was awarded Nobel Prize for his work on:\n\nA) Sonometer\nB) Cryogenics\nC) Light Scattering\nD) Radio activity\n", "C) Light Scattering"));
        arrayList.add(new ThreeItemModel("Who amidst the following won the Nobel Prize in Science in two different disciplines ?\n\nA) David Lee\nB) Madam Curie\nC) Russel Hulse\nD) Enrico Fermi\n", "B) Madam Curie"));
        arrayList.add(new ThreeItemModel("Who amongst the following was awarded Nobel Prize for developing the technology used in integrated circuits used in PCs ?\n\nA) Robert F. Furchgott\nB) Horst L. Stormer\nC) Jack Kilby\nD) Lev Landau\n", "C) Jack Kilby"));
        arrayList.add(new ThreeItemModel("Who from the following is an awardee of both the Nobel Prize and Bharat Ratna ?\n\nA) C V Raman\nB) Rabindranath Tagore\nC) Mother Teresa\nD) All of above\n", "D) All of above"));
        arrayList.add(new ThreeItemModel("Who among the following Nobel laureates facilitated the development of MRI as an important diagnostic tool ?\n\nA) Sydney Brenner\nB) Paul C. Lauterbur\nC) John E. Sulton\nD) H. Robert Horvitz\n", "B) Paul C. Lauterbur"));
        arrayList.add(new ThreeItemModel("Who was the first nobel prize winner from India ?\n\nA) Sir C. V. Raman\nB) Mother Teresa\nC) S. Chandrashekar\nD) Rabindranath Tagore\n", "D) Rabindranath Tagore"));
        arrayList.add(new ThreeItemModel("Amartya Sen was awarded the Nobel Prize for his contribution to :\n\nA) Econometrics\nB) Development Economics\nC) Monetary Economics\nD) Welfare Economics\n", "D) Welfare Economics"));
        arrayList.add(new ThreeItemModel("Which of the following pairs won the Nobel Peace Prize in 2014?\n\nA) Paul L. Modrich and Aziz Sancar\nB) Kailash Satyarthi and Malala Yousafzai\nC) Serge Haroche and David J. Wineland\nD) Alvin E. Roth and Lloyd S. Shapley\n", "B) Kailash Satyarthi and Malala Yousafzai"));
        arrayList.add(new ThreeItemModel("In 2015 Nobel Peace Prize was awarded to:\n\nA) Tunisian National Dialogue Quartet\nB) Jean Tirole\nC) Alice Munro\nD) Takaaki Kajita and Arthur B. McDonald\n", "A) Tunisian National Dialogue Quartet"));
        arrayList.add(new ThreeItemModel("The Nobel Prize for Economics was instituted by:\n\nA) Alfred Nobel\nB) Sweden's Central Bank\nC) The Nobel Committee\nD) World Bank\n", "B) Sweden's Central Bank"));
        arrayList.add(new ThreeItemModel("In which city Nobel Peace Prize is awarded?\n\nA) Brussels\nB) Geneva\nC) Oslo\nD) Stockhlm\n", "C) Oslo"));
        arrayList.add(new ThreeItemModel("In which of the following fields Nobel Prize is not given?\n\nA) Mathematics\nB) Chemistry\nC) Medicine\nD) Physics\n", "A) Mathematics"));


        arrayList.add(new ThreeItemModel("Nobel Prize are distributed annually at\n\nA) Manila\nB) Stockholm\nC) Geneva\nD) New York\n", "B) Stockholm"));
        arrayList.add(new ThreeItemModel("Who was first Nobel Prize winner in the field of Physics?\n\nA) CV Raman\nB) Lord Rayleigh\nC) Wilhelm Röntgen\nD) Thomas Alva Edison\n", "C) Wilhelm Röntgen"));
        arrayList.add(new ThreeItemModel("Who won first Nobel Prize in the field of Chemistry?\n\nA) Hermann Emil Fischer\nB) Sir William Ramsay\nC) Eduard Buchner\nD) Jacobus H. van't Hof\n", "D) Jacobus H. van't Hof"));
        arrayList.add(new ThreeItemModel("Who was first Nobel Prize winner for peace in India?\n\nA) CV Raman\nB) Mother Teressa\nC) Kailash Satyarthi\nD) Dr. Har Gobind Khorana\n", "B) Mother Teressa"));
        arrayList.add(new ThreeItemModel("Maximum number of Literature awards goes to __________ language?\n\nA) English\nB) Portuguese\nC) German\nD) French\n", "A) English"));
        arrayList.add(new ThreeItemModel("Mother Theresa Won Nobel Prize in year _______.\n\nA) 1975\nB) 1977\nC) 1979\nD) 1981\n", "C) 1979"));
        arrayList.add(new ThreeItemModel("Rabindranath Tagore was awarded by Nobel Prize for Literature in Year?\n\nA) 1913\nB) 1914\nC) 1915\nD) 1916\n", "A) 1913"));
        arrayList.add(new ThreeItemModel("Alfred Nobel has invented _________.\n\nA) Atom Bomb\nB) Dynamite\nC) Nuclear Wapone\nD) Satellite Launching Machine\n", "B) Dynamite"));
        arrayList.add(new ThreeItemModel("When was the first Nobel Prize awarded?\n\nA) In Year 1901\nB) In Year 1905\nC) In Year 1909\nD) In Year 1911\n", "A) In Year 1901"));
        arrayList.add(new ThreeItemModel("Which of the following lady won Nobel Prize in two fields Physics as well as Chemistry?\n\nA) Marie Curie\nB) Herta Müller\nC) Maria Goeppert Mayer\nD) Elizabeth H. Blackburn\n", "A) Marie Curie"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("কোন শহরে নোবেল শান্তি পুরষ্কার দেওয়া হয়? ক) ব্রাসেলস বি) জেনেভা গ) অসলো ডি) স্টকহলম", "সি) অসলো"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কোন ক্ষেত্রে নোবেল পুরষ্কার দেওয়া হয় না? ক) গণিত খ) রসায়ন গ) মেডিসিন ডি) পদার্থবিদ্যা", "ক) গণিত"));
        arrayList.add(new ThreeItemModel("ভারতীয় বংশোদ্ভূত জীববিজ্ঞানী যিনি নোবেল পুরষ্কার পেয়েছিলেন তিনি হলেন এ) সিভি ভি রমন  B) রাজা রমন্না সি) হরগোবিন্দ খোরানাডি) জগদীশ চন্দ্র বোস", "সি) হরগোবিন্দ খোরণ"));
        arrayList.add(new ThreeItemModel("নোবেল পুরষ্কার অর্জনকারী ভারত, অমর্ত্য সেন কোন ক্ষেত্রে তার কাজের জন্য পরিচিত? ক) রসায়ন খ) অর্থনীতি গ) পদার্থবিজ্ঞান ঘ) পরিবেশগত সুরক্ষা", "খ) অর্থনীতি"));
        arrayList.add(new ThreeItemModel("ভারতবর্ষের কোন বিজ্ঞানী অ্যাস্ট্রো ফিজিক্সে নোবেল পুরষ্কার পেয়েছিলেন? ক) স্যার। সি। ভি। রমন বি) সত্যেন্দ্র নাথ বোস গ) বিক্রম সারাভাই ডি) অধ্যাপক চন্দ্রশেখা", "ডি) অধ্যাপক চন্দ্রশেখা"));
        arrayList.add(new ThreeItemModel("ডক্টর অ্যালফ্রেড নোবেল কর্তৃক প্রতিষ্ঠিত অর্থায়নের বাইরে কোন ক্ষেত্রে নোবেল পুরস্কার প্রদান করা হয় না? ক) শান্তি খ) মেডিসিন গ) অর্থনীতি ডি) রসায়ন", "সি) অর্থনীতি"));
        arrayList.add(new ThreeItemModel("নোবেল পুরষ্কারটি দেশ এ দ্বারা প্রতিষ্ঠিত হয়েছিল) ক) যুক্তরাজ্য খ) ইউএসএ সি) রাশিয়া ডি) সুইডেন", "ডি) সুইডেন"));
        arrayList.add(new ThreeItemModel("যে আন্তর্জাতিক সংস্থাটি মার্কিন যুক্তরাষ্ট্রের আল গোরের সাথে নোবেল পুরস্কার ভাগ করে নিচ্ছিলেন তিনি হলেন) ক) আরএন ঠাকুর খ) রাজেন্দ্র পাচৌরি গ) মাদার তেরেসা ডি) বিশ্বনাথন সুব্রমনিয়ান", "খ) রাজেন্দ্র পাচৌরী"));
        arrayList.add(new ThreeItemModel("অমর্ত্য কুমার সেন কোন বছরে অর্থনীতিতে নোবেল পেয়েছিলেন? ক) 1998 খ) 1995 গ) 1990 ডি) 2000" ," ক) 1998 "));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত নোবেল বিজয়ীদের মধ্যে কে শান্তির নোবেল পুরষ্কার প্রাপ্ত ছিলেন না? ক) নরম্যান ইয়ানস্ট বোরলগ বি) লিনাস সি পলিং সি) উড্রো উইলসন ডি) স্যার উইনস্টন চার্চিল", "ডি) স্যার উইনস্টন চার্চিল"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কে দুটি ভিন্ন শাখায় বিজ্ঞানের নোবেল পুরস্কার পেয়েছেন? ক) ডেভিড লি বি) ম্যাডাম কুরি গ) রাসেল হুলসে ডি) এনরিকো ফার্মি", "খ) ম্যাডাম কুরি"));
        arrayList.add(new ThreeItemModel("পিসিগুলিতে ব্যবহৃত সংহত সার্কিটগুলিতে ব্যবহৃত প্রযুক্তি বিকাশের জন্য নিম্নলিখিতগুলির মধ্যে কে নোবেল পুরষ্কার পেয়েছিলেন? ক) রবার্ট এফ। ফারচগোট বি) হোর্স্ট এল স্টর্মার সি) জ্যাক কিল্বি ডি) লেভ ল্যান্ডাউ", "সি) জ্যাক কিলবি"));
        arrayList.add(new ThreeItemModel("নীচের থেকে কে নোবেল পুরষ্কার এবং ভারতরত্ন উভয়ের পুরষ্কার? ক) সি ভি রমন খ) রবীন্দ্রনাথ ঠাকুর গ) মাদার তেরেসা ডি) উপরের সমস্ত", "ডি) উপরের সমস্ত"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত নোবেল বিজয়ীদের মধ্যে কে একটি গুরুত্বপূর্ণ ডায়াগনস্টিক সরঞ্জাম হিসাবে এমআরআই বিকাশকে সহজতর করেছে? ক) সিডনি ব্রেনার বি) পল সি লাউটারবার সি) জন ই। সুলটন ডি) এইচ। রবার্ট হরভিটজ", "বি) পল সি লটারবার"));
        arrayList.add(new ThreeItemModel("ভারত থেকে প্রথম নোবেল পুরষ্কার কে ছিলেন? ক) স্যার সি ভি ভি রমন বি) মাদার তেরেসা গ) এস চন্দ্রশেখর ডি) রবীন্দ্রনাথ ঠাকুর", "ডি) রবীন্দ্রনাথ ঠাকুর"));
        arrayList.add(new ThreeItemModel("অমর্ত্য সেনকে অবদানের জন্য নোবেল পুরষ্কার দেওয়া হয়েছিল: ক) একনোমেট্রিক্স খ) উন্নয়ন অর্থনীতি গ) আর্থিক অর্থনীতি ডি) কল্যাণ অর্থনীতি", "ডি) কল্যাণ অর্থনীতি"));
        arrayList.add(new ThreeItemModel("২০১৪ সালে নিম্নলিখিত দুটি জুটির মধ্যে নোবেল শান্তি পুরষ্কার জিতেছে? ক) পল এল মোডরিচ এবং আজিজ সানকার বি) কৈলাশ সত্যার্থী এবং মালালা ইউসুফজাই সি) সার্জ হ্যারোচে এবং ডেভিড জে ওয়াইনল্যান্ড ডি) অ্যালভিন ই রথ এবং লয়েড এস শাপলি "," খ) কৈলাশ সত্যার্থী এবং মালালা ইউসুফজাই "));
        arrayList.add(new ThreeItemModel("২০১৫ সালে নোবেল শান্তি পুরষ্কারটি ভূষিত করা হয়েছিল: ক) তিউনিসিয়ার জাতীয় সংলাপ কোয়ার্টেট খ) জিন তিরোল গ) অ্যালিস মুনরো ডি) টাকাকাকি কাজিতা এবং আর্থার বি ম্যাকডোনাল্ড", "ক) তিউনিসিয়ার জাতীয় সংলাপ চতুর্দশী"));
        arrayList.add(new ThreeItemModel("অর্থনীতিতে নোবেল পুরষ্কার প্রতিষ্ঠিত হয়েছিল: ক) আলফ্রেড নোবেল খ) সুইডেনের কেন্দ্রীয় ব্যাংক গ) নোবেল কমিটি ডি) ওয়ার্ল্ড ব্যাংক", "খ) সুইডেনের কেন্দ্রীয় ব্যাংক"));


        arrayList.add(new ThreeItemModel("স্যার সিভি রমনকে তার কাজের জন্য নোবেল পুরষ্কার দেওয়া হয়েছিল: A) সোনোমিটার বি) ক্রিওজেনিক্স সি) হালকা ছড়িয়ে পড়া ডি) রেডিও ক্রিয়াকলাপ", "সি) হালকা ছড়িয়ে পড়া"));
        arrayList.add(new ThreeItemModel("নোবেল পুরষ্কার বার্ষিক বিতরণ করা হয় ক) ম্যানিলা বি) স্টকহোম সি) জেনেভা ডি) নিউ ইয়র্ক", "খ) স্টকহোম"));
        arrayList.add(new ThreeItemModel("পদার্থবিজ্ঞানের ক্ষেত্রে নোবেল পুরষ্কার প্রাপ্ত কে ছিলেন? ক) সিভি রমন বি) লর্ড রেলেইগ সি) উইলহেলম রেন্টজেন ডি) টমাস আলভা এডিসন", "সি) উইলহেলাম রেন্টজেন"));
        arrayList.add(new ThreeItemModel("কেমিস্ট্রি ক্ষেত্রে প্রথম নোবেল পুরস্কার জিতেছেন? ক) হারমান এমিল ফিশার বি) স্যার উইলিয়াম র‌্যামসে সি) এডুয়ার্ড বুচনার ডি) জ্যাকবাস এইচ ভ্যান্ট হফ", "ডি) জ্যাকবাস এইচ। ভ্যান্ট হফ"));
        arrayList.add(new ThreeItemModel("ভারতে শান্তির জন্য প্রথম নোবেল পুরষ্কার কে ছিলেন? ক) সিভি রমন খ) মাদার তেরেসা গ) কৈলাশ সত্যার্থী ডি) ডঃ হর গোবিন্দ খোরানা", "খ) মাদার তেরেসা"));
        arrayList.add(new ThreeItemModel("সর্বাধিক সংখ্যক সাহিত্য পুরষ্কার __________ ভাষায় যায়? ক) ইংরেজি খ) পর্তুগিজ গ) জার্মান ডি) ফরাসী", "ক) ইংরেজি"));
        arrayList.add(new ThreeItemModel("১৯৯ year সালে মাদার থেরেসা নোবেল পুরস্কার পেলেন _______ ক) ১৯ 197৫ খ) ১৯77 গ) 1979 ডি) 1981", "সি) 1979"));
        arrayList.add(new ThreeItemModel("রবীন্দ্রনাথ ঠাকুর সাহিত্যের জন্য নোবেল পুরষ্কারে পুরষ্কার পেয়েছিলেন? ক) 1913 খ) 1914 গ) 1915 ডি) 1916", "ক) 1913"));
        arrayList.add(new ThreeItemModel("আলফ্রেড নোবেল আবিষ্কার করেছেন ক) এটম বোম্ব বি) ডায়নামাইট সি) পারমাণবিক ওয়াপোন ডি) স্যাটেলাইট লঞ্চিং মেশিন", "খ) ডায়নামাইট"));
        arrayList.add(new ThreeItemModel("কবে প্রথম নোবেল পুরষ্কার দেওয়া হয়? ক) ১৯০১ সালে খ) ১৯০৫ সালে) খ) ১৯০৯ সালে ডি) ১৯৯১ সালে", "ক) ১৯০১ সালে"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত স্ত্রীর মধ্যে কে পদার্থবিদ্যার পাশাপাশি দুটি ক্ষেত্রে নোবেল পুরস্কার জিতেছেন? ক) মেরি কুরি বি) হার্টা মুলার সি) মারিয়া গোপার্ট মায়ার ডি) এলিজাবেথ এইচ ব্ল্যাকবার্ন","ক) মেরি কুরি"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("निंगेलिविलेर द डे ऑफ द डिजनिंग डेसिग्नेटर नॅशनल रेलिंग ऑफ दि आइकॉन ऑफ दि आइकॉन ऑफ इंडिया?", "ম) शुक्रिया"));
        arrayList.add(new ThreeItemModel("पीसी में प्रयुक्त इंटीग्रेटेड सर्किट में प्रयुक्त प्रौद्योगिकी के विकास के लिए निम्न में से किसने नोबेल पुरस्कार जीता? ए) रॉबर्ट एफ। फ़ार्चगॉट बी) होर्स्ट एल। स्ट्रॉमर सी) जैक किल्बी डी) लेव लैंडौ", "सी जैक किल्बी "));
        arrayList.add(new ThreeItemModel("नोबेल पुरस्कार और नीचे से भारत रत्न दोनों में से कौन विजेता है? ए) सीवी रमन b) रबींद्रनाथ टैगोर c) मदर टेरेसा d) उपरोक्त सभी", "D) उपरोक्त सभी"));
        arrayList.add(new ThreeItemModel("निम्नलिखित नोबेल पुरस्कार विजेताओं में से किसने एमआरआई के विकास को एक महत्वपूर्ण नैदानिक ​​उपकरण के रूप में विकसित किया है? ए) सिडनी ब्रेनर बी) पॉल सी। लुटेरबार सी) जॉन ई। सुल्तान डी) एच। रॉबर्ट हार्विट्ज़", "बी पॉल सी। लुटरबार "));
        arrayList.add(new ThreeItemModel("भारत का पहला नोबेल पुरस्कार विजेता कौन था? ए) सर सीवीवी रमन b) मदर टेरेसा c) एस चंद्रशेखर d) रबींद्रनाथ टैगोर", "D) रबींद्रनाथ टैगोर"));
        arrayList.add(new ThreeItemModel("अमर्त्य सेन को उनके योगदान के लिए नोबेल पुरस्कार दिया गया: ए) इकोनोमेट्रिक्स बी) विकास अर्थशास्त्र सी) वित्तीय अर्थव्यवस्था डी) कल्याण अर्थशास्त्र "," डी) कल्याण अर्थशास्त्र "));
        arrayList.add(new ThreeItemModel("निम्नलिखित दो में से किस युगल ने 2014 में नोबेल शांति पुरस्कार जीता? ए) पॉल एल। मोदिक और अजीज शंकर b) कैलाश सत्यार्थी और मलाला यूसुफजई c) सर्ज हारोच और डेविड जे। विनलैंड डी। एल्विन ई। रोथ और लॉयड एस। शैले", "बी) कैलाश सत्यार्थी और मलाला यूसुफजई "));
        arrayList.add(new ThreeItemModel("नोबेल शांति पुरस्कार 2015 में प्रदान किया गया था: ए) ट्यूनीशियाई राष्ट्रीय वार्ता चौकड़ी बी) जीन टिरोल सी) ऐलिस मुनरो डी) ताकाकी काजिता और आर्थर बी। मैकडोनाल्ड "," ए) ट्यूनीशियाई राष्ट्रीय संवाद चौदहवें "));
        arrayList.add(new ThreeItemModel("अर्थशास्त्र का नोबेल पुरस्कार स्थापित किया गया था: ए) अल्फ्रेड नोबेल बी) सेंट्रल बैंक ऑफ स्वीडन c) नोबेल समिति d) वर्ल्ड बैंक", "बी) सेंट्रल बैंक ऑफ स्वीडन"));
        arrayList.add(new ThreeItemModel("किस शहर में नोबेल शांति पुरस्कार दिया जाता है? ए) ब्रुसेल्स बी) जिनेवा सी) ओस्लो डी) स्टॉकहोम", "सी) ओस्लो"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किसे नोबेल पुरस्कार से सम्मानित नहीं किया गया है? ए) गणित बी) रसायन विज्ञान सी) चिकित्सा डी) भौतिकी", "ए) गणित"));
        arrayList.add(new ThreeItemModel("भारतीय मूल के जीव विज्ञान के नोबेल पुरस्कार विजेता हैं A) CV V Raman B) राजा रमन्ना C) हरगोबिंद खोरनाड़ी) जगदीश चंद्र बोस", "C) हरगोविंद खोरन"));
        arrayList.add(new ThreeItemModel("नोबेल पुरस्कार विजेता भारत, अमर्त्य सेन, उनके क्षेत्र में उनके काम के लिए 2 कॉनन? ए) रसायन विज्ञान या) अर्थशास्त्र सी) भौतिकी डी) पर्यावरण संरक्षण", "या) अर्थशास्त्र"));
        arrayList.add(new ThreeItemModel("किस भारत में जन्मे वैज्ञानिक को एस्ट्रोफिजिक्स में नोबेल पुरस्कार दिया गया? ए) सर। सी.वी. रमन बी) सत्येंद्र नाथ बोस सी। विक्रम साराभाई डी) प्रो। चंद्रशेखर", "डी। प्रो। चंद्रशेखर"));
        arrayList.add(new ThreeItemModel("नोबेल पुरस्कार देश ए द्वारा स्थापित किया गया था) ए) यूनाइटेड किंगडम बी) यूएसए सी) रूस डी) स्वीडन", "पी) स्वीडन"));
        arrayList.add(new ThreeItemModel("िस वर्ष में अमर्त्य कुमार सेन ने अर्थशास्त्र में नोबेल पुरस्कार जीता? ए) 1998 बी) 1995 सी) 1990 डी) 2000 "," ए) 1998 "));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किस नोबेल पुरस्कार विजेता को नोबेल शांति पुरस्कार नहीं मिला? ए) नॉर्मन यानस्ट बोरलॉग बी) लिनुस सी। पॉलिंग सी) वुडरो विल्सन d) सर विंस्टन चर्चिल", "d) सर विनी चर्चिल"));
        arrayList.add(new ThreeItemModel("सर सीवी रमन को उनके कार्य के लिए नोबेल पुरस्कार दिया गया: ए) सोनोमीटर बी) क्रायोजेनिक्स सी) प्रकाश प्रकीर्णन घ) रेडियो गतिविधि", "सी) तितर बितर प्रकाश"));
        arrayList.add(new ThreeItemModel("नोबेल पुरस्कार प्रतिवर्ष प्रदान किए जाते हैं a) मनीला b) स्टॉकहोम c) जिनेवा d) न्यूयॉर्क", "b स्टॉकहोम"));
        arrayList.add(new ThreeItemModel("भौतिकी में नोबेल पुरस्कार पाने वाले कौन थे? ए) सीवी रमन b) लॉर्ड रीलैग c) विल्हेम रेंटजेन d) थॉमस अल्वा एडिसन", "c) विल्हेम रेंटजेन"));
        arrayList.add(new ThreeItemModel("रसायन विज्ञान में पहला नोबेल पुरस्कार जीता। ए) हरमन एमिल फिशर बी) सर विलियम रामसे सी) एडवर्ड बुचनर डी) जैकब्स एच। वैंट हफ", "डी) जैकबस एच। वैंट हफ"));
        arrayList.add(new ThreeItemModel("भारत का पहला नोबेल शांति पुरस्कार विजेता कौन था? ए) सीवी रमन b) मदर टेरेसा c) कैलाश सत्यार्थी d) डॉ हर गोविंदा खोराना", "b) मदर टेरेसा"));
        arrayList.add(new ThreeItemModel("अधिकांश साहित्यिक पुरस्कार __________ भाषाओं में जाते हैं? ए) अंग्रेजी बी) पुर्तगाली सी) जर्मन डी) फ्रेंच", "ए) अंग्रेजी"));
        arrayList.add(new ThreeItemModel("मदर थेरेसा ने 199 वर्षों में नोबेल पुरस्कार जीता। _______ ए) 19 1975 बी) 1977 सी) 1979 डी) 1981", "सी) 1979"));
        arrayList.add(new ThreeItemModel("क्या रवींद्रनाथ टैगोर ने साहित्य के लिए नोबेल पुरस्कार जीता? ए) 1913 बी) 1914 सी) 1915 डी) 1916", "ए) 1913"));
        arrayList.add(new ThreeItemModel("अल्फ्रेड नोबेल ने आविष्कार किया ए) एटम बम बी) डायनामाइट सी) परमाणु वैपन डी) सैटेलाइट लॉन्चिंग मशीन", "बी) डायनामाइट"));
        arrayList.add(new ThreeItemModel("रवींद्रनाथ टैगोर को साहित्य के लिए नोबेल पुरस्कार से सम्मानित किया गया था?", "ए) 1913"));
        arrayList.add(new ThreeItemModel("अल्फ्रेड नोबेल ने आविष्कार किया है) एटम बम या) डायनामाइट कुंजी) परमाणु संयंत्र डॉ) सैटेलाइट लॉन्चिंग मशीन", "या) डायनामाइट"));
        arrayList.add(new ThreeItemModel("१ ९ ०५ में प्रथम नोबेल पुरस्कार कब दिया गया था? ए) १ ९ ०५ में) बी) १ ९ ० ९ में १ ९९ १)"," १ ९ ०१ में ए"));
        arrayList.add(new ThreeItemModel("निम्न में से किस महिला ने भौतिकी में और साथ ही दो अन्य क्षेत्रों में नोबेल पुरस्कार जीता है? ए) मैरी क्यूरी बी) हर्टा म्यूएलर सी) मारिया गोपर्ट मेयर डी) एलिजाबेथ एच ब्लैकबर्न", "ए) मैरी क्यूरी"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کس نے دو مختلف شعبوں میں سائنس میں نوبل انعام جیتا ہے؟ ا) ڈیوڈ لی ب) میڈم کیوری ج) رسل ہلسی ڈی) اینریکو فرمی" , "ب) میڈم کیوری"));
        arrayList.add(new ThreeItemModel("پی سی میں استعمال ہونے والی انٹیگریٹڈ سرکٹس میں استعمال ہونے والی ٹکنالوجی کی نشوونما کے ل following درج ذیل میں سے کس نے نوبل انعام جیتا؟ ا) رابرٹ ایف فرچگٹ بی) ہورسٹ ایل اسٹورمر سی) جیک کِلبی ڈی) لیوا لینڈو" , "سی) جیک کِلبی"));
        arrayList.add(new ThreeItemModel("نیچے سے نوبل انعام اور ہندوستان رتن دونوں کا فاتح کون ہے؟ اے) سی وی رامن ب) رابندر ناتھ ٹیگور ج) مدر ٹریسا ڈی) مذکورہ بالا سب" , "ڈی) سب سے اوپر"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل نوبل انعام یافتہ افراد میں سے کس نے ایک اہم تشخیصی آلہ کی حیثیت سے ایم آر آئی کی نشوونما میں مدد کی؟ ا) سڈنی برنر ب) پال سی۔ لوٹربر سی) جان ای۔ سلاٹن ڈی) ایچ رابرٹ ہارٹز" , "بی) پال سی لاؤٹربر"));
        arrayList.add(new ThreeItemModel("ہندوستان سے پہلے نوبل انعام یافتہ کون تھا؟ ا) سر سی وی وی رامان ب) مدر ٹریسا سی) ایس چندر شیکھر د) رابندر ناتھ ٹیگور" , "ڈی) رابندر ناتھ ٹیگور"));
        arrayList.add(new ThreeItemModel("امرتیہ سین کو ان کی شراکت کے لئے نوبل انعام دیا گیا۔ ا) اکنامکس ب) ڈویلپمنٹ اکنامکس سی) فنانشل اکنامکس ڈی) ویلفیئر اکنامکس "," ویلفیئر اکنامکس "));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کس نے 2014 میں امن کا نوبل انعام جیتا؟ اے) پال ایل موڈریک اور عزیز سنکر b) کیلاش ستیارتھی اور ملالہ یوسف زئی سی) سرج ہاروچے اور ڈیوڈ جے وینلینڈ d) یلوین ای روتھ اور لائیڈ ایس شیلی" , "ب) کیلاش ستیارتھی اور ملالہ یوسف زئی "));
        arrayList.add(new ThreeItemModel(" امن انعام 2015 میں دیا گیا: ا) تیونسی قومی مکالمہ کوآرٹیٹ ب) جین ترول ج) ایلس منرو د) تاکاکی کاجیٹا اور آرتھر بی میکڈونلڈ "," ایک) تیونس کا قومی مکالمہ چودھویں "));
        arrayList.add(new ThreeItemModel("معاشیات میں نوبل انعام قائم کیا گیا تھا: ا) الفریڈ نوبل b) سویڈن کا مرکزی بینک c) نوبل کمیٹی d) ورلڈ بینک" ,"b) سنٹرل بینک آف سویڈن"));
        arrayList.add(new ThreeItemModel("امن کا نوبل انعام کس شہر میں دیا گیا ہے؟ ا) برسلز ب) جنیوا ج) اوسلو ڈی) اسٹاک ہوم" , "ج) اوسلو"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون کو نوبل پرائز نہیں دیا گیا؟ ا) ریاضی ب) کیمسٹری سی) میڈیسن ڈی) فزکس" , "ا) ریاضی"));
        arrayList.add(new ThreeItemModel("ہندوستانی نسل کی نوادریاure حیاتیات اے۔ سی وی وی رامان بی) راجہ رامنا سی) ہرگوبند کھورانادی) جگدیش چندر بوس" ,"سی) ہرگوبند کھوران"));
        arrayList.add(new ThreeItemModel("نوبل انعام یافتہ ہندوستان ، امرتیہ سین اپنے کام کے لئے کس شعبے میں جانا جاتا ہے؟ ا) کیمسٹری b) معاشیات c) طبیعیات d) ماحولیاتی تحفظ" ,"b) معاشیات"));
        arrayList.add(new ThreeItemModel(" ہندوستانی سائنس دان نے ایسٹرو فزکس میں نوبل انعام جیتا؟ اے) سر سی وی۔ رامان ب) ستیندر ناتھ بوس ج) وکرم سرا بھائی"," د) پروفیسر چندر شیکھا "));
        arrayList.add(new ThreeItemModel("کسی بھی معاملے میں ڈاکٹر الفریڈ نوبل کے قائم کردہ فنڈ سے باہر نوبل انعام نہیں دیا جاتا۔ ا) امن ب) دوائی سی) معاشیات ڈی) کیمسٹری" ,"سی) معاشیات"));
        arrayList.add(new ThreeItemModel("نوبل انعام ملک کے ذریعہ قائم کیا گیا۔ ا) برطانیہ ب) امریکہ سی) روس ڈی) سویڈن" , "د) سویڈن"));
        arrayList.add(new ThreeItemModel("بین الاقوامی تنظیم جو ریاستہائے متحدہ میں ال گور کے ساتھ نوبل انعام بانٹ رہی تھی وہ تھی: ا) آر این ٹیگور ب) راجندر پچوری c) مدر ٹریسا د) بشنواتھن سبرامنیم" , "بی) راجندر پچوری"));
        arrayList.add(new ThreeItemModel(" کمار سین نے کس سال اقتصادیات میں نوبل انعام جیتا تھا؟ ا) 1998 ب) 1995 سی) 1990 د) 2000 "," ایک) 1998 "));
        arrayList.add(new ThreeItemModel("درج ذیل نوبل انعام یافتہ افراد میں سے کون کو نوبل امن انعام نہیں ملا؟ ا) نارمن یانسٹ بورلاگ ب) لینس سی پولنگ سی) ووڈرو ولسن ڈی) سر ونسٹن چرچل" , "د) سر ونسٹن چرچل"));
        arrayList.add(new ThreeItemModel("سر سی وی رمن کو ان کے کام کے لئے نوبل پرائز دیا گیا: ا) سونومیٹر بی) کرائیوجنکس سی) لائٹ بکھرنے والی ڈی) ریڈیو کی سرگرمی" , "سی) لائٹ سکریٹر"));
        arrayList.add(new ThreeItemModel("کیا رابندر ناتھ ٹیگور نے ادب کا نوبل انعام جیتا؟ ا) 1913 ب) 1914 سی) 1915 د) 1916" , "ا) 1913"));
        arrayList.add(new ThreeItemModel("نوبل انعامات سالانہ طور پر دیئے جاتے ہیں a) منیلا b) اسٹاک ہوم c) جنیوا d) نیویارک" , "b) اسٹاک ہوم"));
        arrayList.add(new ThreeItemModel("طبیعیات میں نوبل انعام حاصل کرنے والا کون تھا؟ اے) سی وی رامان ب) لارڈ ریلیگ ج) ولہیلم رینٹجن ڈی) تھامس الوا ایڈیسن", "ج) ولہیلم رینٹجن"));
        arrayList.add(new ThreeItemModel("کیمسٹری میں پہلا نوبل انعام جیتا؟ ا) ہرمین ایمل فشر ب) سر ولیم رامسے سی) ایڈورڈ بچنر ڈی) جیکبس ایچ وانٹ ہف" , "ڈی) جیکبس ایچ۔ وانٹ ہف"));
        arrayList.add(new ThreeItemModel("ہندوستان میں پہلا نوبل انعام یافتہ کون تھا؟ اے) سی وی رامان ب) مدر ٹریسا سی) کیلاش ستیارتھی d) ڈاکٹر ہار گووندا کھورانا" , "ب) مدر ٹریسا"));
        arrayList.add(new ThreeItemModel("زیادہ تر ادبی ایوارڈ __________ زبان میں جاتے ہیں؟ ا) انگریزی ب) پرتگالی ج) جرمن د) فرانسیسی" ,"ا) انگریزی"));
        arrayList.add(new ThreeItemModel("کیا رابندر ناتھ ٹیگور نے ادب کا نوبل انعام جیتا؟ ا) 1913 ب) 1914 سی) 1915 د) 1916" , "ا) 1913"));
        arrayList.add(new ThreeItemModel("الفریڈ نوبل نے ایجاد کیا a) ایٹم بم b) ڈائنامائٹ c) ایٹم واپون d) سیٹلائٹ لانچنگ مشین" , "b) ڈائنامائٹ"));
        arrayList.add(new ThreeItemModel("پہلا نوبل انعام کب دیا گیا؟ الف) 1901 میں) 1905 میں) ب) 1909 میں) 1991 میں" , "ا) 1901 میں"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل خواتین میں سے کس نے فزکس کے ساتھ ساتھ دو دیگر شعبوں میں بھی نوبل انعام جیتا ہے؟ ا) مریم کیوری ب) ہرٹا مولر سی) ماریہ گوپارت مائر ڈی) الزبتھ ایچ بلیک برن" , "ا) مریم کیوری"));


        return arrayList;
    }


}
