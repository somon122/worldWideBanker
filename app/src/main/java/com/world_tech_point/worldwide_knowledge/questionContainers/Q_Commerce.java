package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Commerce {


    private Context context;
    public Q_Commerce(Context context) {
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
            arrayList.add(new ThreeItemModel("What Is The Name Of Entry Which Is Used In Bank Column Cash Book To Record The Money Transaction ?", "Contra entry"));
        arrayList.add(new ThreeItemModel("The Fixed Cost Of Producing A Quantity Of A Good Divided By The Quantity Produced Is……?", "Average fixed cost"));
        arrayList.add(new ThreeItemModel("Which Is The Basic Document Of A Company?", "Memorandum of association"));
        arrayList.add(new ThreeItemModel("Minimum Number Of Persons Who Has To Sign The Memorandum Of Association?", "Seven persons in the presence of one witness"));
        arrayList.add(new ThreeItemModel("In The Charter Of The Company While Choosing A Name Which Word Should Not Be Included ?", "Co-operative"));
        arrayList.add(new ThreeItemModel("In The Name Of A Company Which Word Should Be Used At The End?", "Limited"));
        arrayList.add(new ThreeItemModel("Which Is The Most Important Clauses Of The Memorandum ?", "The object clause"));
        arrayList.add(new ThreeItemModel("Which Is A Document Containing A Rules And Regulations For The Internal Management Of The Company ?", "The article of association"));
        arrayList.add(new ThreeItemModel("What Is The Maximum Number Of Partners In Banking Business?", "Ten"));
        arrayList.add(new ThreeItemModel("What Is The Minimum Number Of Members In A Public Company ?", "Seven"));
        arrayList.add(new ThreeItemModel("Which Bank Note Gives The Bearer The Right To Have Its Face Value Converted Into Gold Or Some Other Commodity Of Value Equivalent To The Amount Stated?", "Convertible bank-note"));

        arrayList.add(new ThreeItemModel("What Is Commerce?", "Commerce refers to and includes all those activities which are necessary to bring goods and services from the place of their origin to the place of their consumption"));
        arrayList.add(new ThreeItemModel("Into How Many Departments Is Commerce Mainly Divided Into? Which Are They ?", "Into two"));
        arrayList.add(new ThreeItemModel("The Trade Is Sub Divided Into Two Divisions, Which Are They?", "Home trade and Foreign trade"));
        arrayList.add(new ThreeItemModel("Into How Many Divisions The Home Trade Is Divided ?", "Into two they are, Whole sale and retail"));
        arrayList.add(new ThreeItemModel("What Is Quoted Price?", "It is the price of a share commodity as stated in the official list of the stock exchange commodity market"));
        arrayList.add(new ThreeItemModel("What Is Share?", " A unit for reckoning investors interests in the contributed capital of a company"));
        arrayList.add(new ThreeItemModel("What Is The Other Name For Creditorship?", "securities Debentures"));
        arrayList.add(new ThreeItemModel("Who Is Called An Arbitrator?", " A person chosen by the parties to a dispute to suggest a way of settling the dispute"));
        arrayList.add(new ThreeItemModel("When Did The Government Institute The Companies Amendment Act ?", "In February 1963."));
        arrayList.add(new ThreeItemModel("What Is Debit?", "It is the term using in double entry book keeping for an entry made on the left-hand side of an account"));
        arrayList.add(new ThreeItemModel("Name The Brand Mark Which Has Legal Restrictions?", "Trademark"));
        arrayList.add(new ThreeItemModel("What Is Stock Market?", " An organized market for securities. Also called a ‘stock exchange’"));
        arrayList.add(new ThreeItemModel("What Is Tap?", "A large quantity of securities held by some one who is able to sell to any one who wants to buy is called a tap"));
        arrayList.add(new ThreeItemModel("What Is Wage?", "It is the remuneration paid to the operative staff whoe output can be directly in an year"));
        arrayList.add(new ThreeItemModel("What Is A By-product ?", "A commonly which can be sold, produced in the process of manufacturing the main product."));
        arrayList.add(new ThreeItemModel("Document Issued By A Vendor Giving Credit To The Debtor Is Called...... ?", "Credit note"));
        arrayList.add(new ThreeItemModel("What Is Petty Cash ?", "A small fund of cash held by an institution which is used to make small and urgent payments"));
        arrayList.add(new ThreeItemModel("Who Are Entitled To Take Part In The Control And Management Of Business In A Company?", "The board of directors elected by the shareholders"));
        arrayList.add(new ThreeItemModel("The Bailment Of Goods As Security For Payment Of A Debt Is Called....... ?", "Pledge"));
        arrayList.add(new ThreeItemModel("The Selection Of Goods Offered For Sale By A Retailer Is Called........ ?", "Assortment"));
        arrayList.add(new ThreeItemModel("What Is A Person Or Party To Whom An Assignment Is Made Called ?", "Assignee"));
        arrayList.add(new ThreeItemModel("Which Value Was Measured In Gold Or Equivalent In Us Dollars ?", "Par value"));

        arrayList.add(new ThreeItemModel("In Which Form The Co-operative Society, Distributes Its Surplus Dividends To Its Members ?", "In the form of bonus"));
        arrayList.add(new ThreeItemModel("Which Is The Technique Designed To Create An Artificial Market To Benefit A Businessman?", "Rigging the market"));
        arrayList.add(new ThreeItemModel("What Is Dead Time?", "Time lost through no fault of the employee and for which he is usually paid at the full rate"));
        arrayList.add(new ThreeItemModel("What Is A Decision Tree?", "A diagram of a sequence of decisions, each of which involves choosing between a known number of alternatives and depends on the resultants of the previous decisions"));
        arrayList.add(new ThreeItemModel("What Is Syndicate ?", "A group of people working together towards a common objective usually profit is called a syndicate."));
        arrayList.add(new ThreeItemModel("In The Aspect Of Banking Business What Is The Term Used Of Giving Loans To Companies On A Large Scale?", "Wholesale banking"));
        arrayList.add(new ThreeItemModel("The Profit Margin Which A Retailer Of Goods Obtains From His Supplier Is Called........?", "Trade discount"));
        arrayList.add(new ThreeItemModel("What Is The Term Used To Indicate A Statement Of What Is Owned And What Is Owed?", "Assets and Liability statements"));
        arrayList.add(new ThreeItemModel("How Is An Asset Expressed?", "Assets Liabilities = owner’s equity"));
        arrayList.add(new ThreeItemModel("What Is Subsidy ?", "It is a method adopted by the government or a company of supporting a price"));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
           arrayList.add(new ThreeItemModel("কোন সংস্থার বেসিক ডকুমেন্টটি কোনটি?", "মেমোরেন্ডাম অফ অ্যাসোসিয়েশন"));
        arrayList.add(new ThreeItemModel("সমিতির স্মারকলিপিতে স্বাক্ষরকারী কারা ন্যূনতম সংখ্যা?", "একজন সাক্ষীর উপস্থিতিতে সাত জন"));
        arrayList.add(new ThreeItemModel("কোম্পানির সনদে কোনও নাম নির্বাচন করার সময় কোন শব্দটি অন্তর্ভুক্ত করা উচিত নয়?", "সমবায়"));
        arrayList.add(new ThreeItemModel("একটি সংস্থার নামে শেষ পর্যন্ত কোন শব্দটি ব্যবহার করা উচিত?", "সীমাবদ্ধ"));
        arrayList.add(new ThreeItemModel("স্মারকলিপিটির সর্বাধিক গুরুত্বপূর্ণ ধারাগুলি কোনটি?", "বস্তুর ধারা"));
        arrayList.add(new ThreeItemModel("কোম্পানির অভ্যন্তরীণ পরিচালনার জন্য একটি বিধি এবং বিধিবিধান সম্বলিত কোন দলিল কোনটি?", "সমিতির নিবন্ধ"));
        arrayList.add(new ThreeItemModel("ব্যাংকিং ব্যবসায়ের অংশীদারদের সর্বাধিক সংখ্যা কত?", "দশ"));
        arrayList.add(new ThreeItemModel("একটি সরকারী সংস্থায় সর্বনিম্ন সদস্য সংখ্যা কত?", "সাত"));
        arrayList.add(new ThreeItemModel("কোন ব্যাঙ্ক নোট তার বাহককে তার মুখের মূল্য সোনায় রূপান্তরিত করার অধিকার বা অন্য কোনও পণ্যের মূল্য সমান পরিমাণের সমান মূল্য দেওয়ার অধিকার দেয়?", "রূপান্তরযোগ্য ব্যাংক নোট"));
        arrayList.add(new ThreeItemModel("কো-অপারেটিভ সোসাইটি কোন ফর্মে এর উদ্বৃত্ত লভ্যাংশ তার সদস্যদের বিতরণ করে?", "বোনাস আকারে"));

        arrayList.add(new ThreeItemModel("বাণিজ্য কি?", "বাণিজ্য উল্লেখ করে এবং সেই সমস্ত ক্রিয়াকলাপকে অন্তর্ভুক্ত করে যা তাদের উত্সের জায়গা থেকে তাদের ব্যবহারের স্থানে পণ্য ও পরিষেবা আনতে প্রয়োজনীয়"));
        arrayList.add(new ThreeItemModel("বাণিজ্য কতগুলি বিভাগের মধ্যে মূলত বিভক্ত হয়? সেগুলি কোনটি?", "দু'টিতে"));
        arrayList.add(new ThreeItemModel("বাণিজ্যটি দুটি বিভাগে বিভক্ত, যেগুলি সেগুলি?", "স্বদেশ বাণিজ্য এবং বৈদেশিক বাণিজ্য"));
        arrayList.add(new ThreeItemModel("হোম ট্রেড কয়টি বিভাগে বিভক্ত?", "তারা দুটি ক্ষেত্রে, পুরো বিক্রয় এবং খুচরা বিক্রয়"));
        arrayList.add(new ThreeItemModel("উদ্ধৃত মূল্য কী?", "শেয়ার বাজারের শেয়ার বাজারের অফিসিয়াল তালিকায় বলা হয়েছে যে এটি শেয়ারের দাম"));
        arrayList.add(new ThreeItemModel("শেয়ার কী?", "কোনও সংস্থার অবদানযুক্ত মূলধনে বিনিয়োগকারীদের আগ্রহ গণনা করার জন্য একটি ইউনিট"));
        arrayList.add(new ThreeItemModel("Itorsণপত্রের জন্য অন্যান্য নাম কী?", "সিকিওরিটিস ডিবেঞ্চারস"));
        arrayList.add(new ThreeItemModel("আরবিট্রেটার কাকে বলা হয়?", "বিরোধ নিষ্পত্তি করার একটি উপায় প্রস্তাব করার জন্য একটি পক্ষকে বিরোধের দ্বারা বাছাই করা ব্যক্তি"));
        arrayList.add(new ThreeItemModel("সরকারী ইনস্টিটিউট কখন সংস্থাগুলি সংশোধন আইন করেছে?", "১৯63৩ সালের ফেব্রুয়ারিতে।"));
        arrayList.add(new ThreeItemModel("ডেবিট কি?", "এটি ডাবল এন্ট্রি বইতে কোনও অ্যাকাউন্টের বাম-হাতের প্রবেশের জন্য রাখার শব্দটি ব্যবহৃত হয়"));
        arrayList.add(new ThreeItemModel("ব্র্যান্ড মার্কের নাম রাখুন যার কোন আইনি বিধিনিষেধ আছে?", "ট্রেডমার্ক"));
        arrayList.add(new ThreeItemModel("স্টক মার্কেট কী?", "সিকিওরিটির জন্য একটি সংগঠিত বাজার। এটিকে্টক এক্সচেঞ্জ বলা হয়"));
        arrayList.add(new ThreeItemModel("কি ট্যাপ?", "যে কেউ কিনতে চাইলে যে কেউ বিক্রি করতে সক্ষম এমন একজনের হাতে প্রচুর পরিমাণে সিকিওরিটি থাকে তাকে একটি ট্যাপ বলা হয়"));
        arrayList.add(new ThreeItemModel("মজুরি কী?", "অপারেটিভ কর্মীদের যে পারিশ্রমিক দেওয়া হয়, তার আউটপুট সরাসরি এক বছরে হতে পারে"));
        arrayList.add(new ThreeItemModel("একটি বাই-প্রোডাক্ট কী?", "একটি সাধারণত যা বিক্রি করা যায়, মূল পণ্য উত্পাদন প্রক্রিয়াতে উত্পাদিত হয়" ));
        arrayList.add(new ThreeItemModel("Vণগ্রহীতাকে Creditণ প্রদানের কোনও বিক্রেতা কর্তৃক জারি করা নথি ......?", "ক্রেডিট নোট"));
        arrayList.add(new ThreeItemModel("পেটি ক্যাশ কী?", "একটি সংস্থার হাতে থাকা নগদ অর্থের একটি ছোট তহবিল যা ছোট এবং জরুরি অর্থ প্রদানের জন্য ব্যবহৃত হয়"));
        arrayList.add(new ThreeItemModel("কোন কোম্পানির ব্যবসায়ের নিয়ন্ত্রণ ও পরিচালনায় অংশ নেওয়ার জন্য কাকে নিয়োগ দেওয়া হয়েছে?", "শেয়ারহোল্ডারদের দ্বারা নির্বাচিত পরিচালনা পর্ষদ"));
        arrayList.add(new ThreeItemModel("Tণ পরিশোধের সুরক্ষার হিসাবে জিনিসপত্রের বিলমেন্ট .......?", "প্রতিশ্রুতি"));
        arrayList.add(new ThreeItemModel("একজন খুচরা বিক্রেতার দ্বারা বিক্রয়ের জন্য দেওয়া পণ্যগুলির নির্বাচনকে কল করা হয় ........?", "ভাণ্ডার"));
        arrayList.add(new ThreeItemModel("একজন ব্যক্তি বা দল কী যার একটি দায়িত্ব অর্পণ করা হয়?", "Assignee"));
        arrayList.add(new ThreeItemModel("আমাদের মূল্য ডলারের মধ্যে স্বর্ণ বা সমমানের মধ্যে কোন মান পরিমাপ করা হয়েছিল?", "সমমূল্য"));
        arrayList.add(new ThreeItemModel("টাকা লেনদেন রেকর্ড করতে ব্যাঙ্ক কলাম নগদ পুস্তকে ব্যবহৃত প্রবেশের নাম কী?", "কনট্রা এন্ট্রি"));
        arrayList.add(new ThreeItemModel("উত্পাদিত পরিমাণের দ্বারা বিভক্ত ভাল পরিমাণের পরিমাণ নির্ধারণের স্থির ব্যয়টি কি??", "গড় নির্ধারিত ব্যয়"));

        arrayList.add(new ThreeItemModel("কোন ব্যবসায়িককে উপকৃত করার জন্য একটি কৃত্রিম বাজার তৈরি করার জন্য কোন কৌশলটি তৈরি করা হয়েছে?", "বাজারটি পুনরায় চালানো"));
        arrayList.add(new ThreeItemModel("ডেড টাইম কী?", "কর্মচারীর কোনও দোষের মধ্যে সময় নষ্ট হয়ে যায় এবং যার জন্য তাকে সাধারণত পুরো হারে প্রদান করা হয়"));
        arrayList.add(new ThreeItemModel("সিদ্ধান্তের গাছটি কী?", "সিদ্ধান্তের অনুক্রমের একটি ডায়াগ্রাম, যার মধ্যে প্রতিটি বিকল্পের একটি ज्ञিত বিকল্পের মধ্যে নির্বাচন করা জড়িত এবং পূর্ববর্তী সিদ্ধান্তের ফলাফলের উপর নির্ভর করে"));
        arrayList.add(new ThreeItemModel("সিন্ডিকেট কী?", "একদল লোক একসাথে একটি সাধারণ উদ্দেশ্যে কাজ করার জন্য সাধারণত লাভকে সিন্ডিকেট বলে।"));
        arrayList.add(new ThreeItemModel("ব্যাংকিং ব্যবসায়ের দিক থেকে বড় আকারের সংস্থাগুলিকে ivingণ দেওয়ার শব্দটি কী ব্যবহৃত হয়?", "পাইকার ব্যাংকিং"));
        arrayList.add(new ThreeItemModel("লাভের মার্জিন কোন সরবরাহকারী তার সরবরাহকারীর কাছ থেকে প্রাপ্ত কলকে বলা হয় ........?", "বাণিজ্য ছাড়"));
        arrayList.add(new ThreeItemModel("এই শর্তটি কীসের মালিকানাধীন এবং কীসের মালিকানাধীন তার একটি বিবৃতি নির্দেশ করতে ব্যবহৃত হয়?", "সম্পদ এবং দায়বদ্ধতার বিবৃতি"));
        arrayList.add(new ThreeItemModel("একটি সম্পদ কীভাবে প্রকাশ করা হয়?", "সম্পদ দায়বদ্ধতা = মালিকের ইক্যুইটি"));
        arrayList.add(new ThreeItemModel("ভর্তুকি কী?", "এটি সরকার বা কোনও দামকে সমর্থন করে এমন একটি সংস্থা গৃহীত একটি পদ্ধতি"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("कॉमर्स क्या है?", "वाणिज्य से तात्पर्य उन सभी गतिविधियों से है, जिनमें वस्तुओं और सेवाओं को उनके मूल स्थान से उनके उपभोग के स्थान पर लाना आवश्यक है"));
        arrayList.add(new ThreeItemModel("कितने विभागों में वाणिज्य मुख्य रूप से विभाजित हैं? वे कौन हैं?", "दो में"));
        arrayList.add(new ThreeItemModel("व्यापार दो भागों में विभाजित है, जो वे हैं?", "गृह व्यापार और विदेश व्यापार"));
        arrayList.add(new ThreeItemModel("कितने डिवीजनों में गृह व्यापार विभाजित है?", "दो में वे हैं, पूरी बिक्री और खुदरा"));
        arrayList.add(new ThreeItemModel("शेयर भाव नहीं है?", "यह शेयर बाजार की आधिकारिक सूची में बताई गई एक शेयर वस्तु की कीमत है।"));
        arrayList.add(new ThreeItemModel("शेयर क्या है?", "एक कंपनी की योगदान की गई पूंजी में निवेशकों के हितों की गणना के लिए एक इकाई"));
        arrayList.add(new ThreeItemModel("क्रेडिटरशिप के लिए दूसरा नाम क्या है?", "प्रतिभूतियां डिबेंचर"));
        arrayList.add(new ThreeItemModel("किसे एक मध्यस्थ कहा जाता है?", "विवाद को निपटाने का एक तरीका सुझाने के लिए पक्षों द्वारा एक व्यक्ति को चुना गया"));
        arrayList.add(new ThreeItemModel("फरवरी 1963 में सरकारी संस्थान ने कंपनी संशोधन अधिनियम कब बनाया?","व्हेन डिड द फरवरी 1963 में। "));
        arrayList.add(new ThreeItemModel("व्हाट इज़ डेबिट?", "यह एक अकाउंट के बायीं ओर बने एंट्री के लिए डबल एंट्री बुक का उपयोग करने वाला शब्द है"));
        arrayList.add(new ThreeItemModel("ब्रांड का नाम जो कानूनी प्रतिबंध है?", "ट्रेडमार्क"));
        arrayList.add(new ThreeItemModel("स्टॉक मार्केट क्या है?", "प्रतिभूतियों के लिए एक संगठित बाजार। इसे स्टॉक एक्सचेंज भी कहा जाता है" ));
        arrayList.add(new ThreeItemModel("व्हाट इज़ टैप?", "कुछ प्रतिभूतियों द्वारा रखी गई बड़ी मात्रा में प्रतिभूतियां जो कोई भी व्यक्ति खरीदना चाहता है, जिसे नल कहा जाता है"));
        arrayList.add(new ThreeItemModel("व्हाट इज़ वेज?", "यह ऑपरेटिव कर्मचारियों को दिया जाने वाला पारिश्रमिक है जो आउटपुट सीधे एक वर्ष में हो सकता है"));
        arrayList.add(new ThreeItemModel("एक उप-उत्पाद क्या है?", "एक आम तौर पर जो बेचा जा सकता है, मुख्य उत्पाद के निर्माण की प्रक्रिया में उत्पादित होता है।"));
        arrayList.add(new ThreeItemModel("एक ऋणदाता को ऋण देने वाले विक्रेता द्वारा जारी किए गए दस्तावेज़ को ...... कहा जाता है?", "क्रेडिट नोट"));
        arrayList.add(new ThreeItemModel("क्या पेटीएम कैश है?", "एक संस्था द्वारा रखी गई नकदी का एक छोटा सा फंड जो छोटे और जरूरी भुगतान करने के लिए उपयोग किया जाता है"));
        arrayList.add(new ThreeItemModel("कौन एक कंपनी में नियंत्रण और व्यवसाय के प्रबंधन में भाग लेने के लिए प्रवेश कर रहे हैं?", "निदेशक मंडल शेयरधारकों के लिए चुने गए"));
        arrayList.add(new ThreeItemModel("ऋण की अदायगी के लिए सामानों की जमानत को सुरक्षा कहा जाता है? ......?", "प्रतिज्ञा"));
        arrayList.add(new ThreeItemModel("रिटेलर द्वारा बिक्री के लिए प्रस्तुत सामान का चयन ........ कहा जाता है?","वर्गीकरण"));
        arrayList.add(new ThreeItemModel("एक व्यक्ति या पार्टी किसके लिए एक असाइनमेंट कहलाता है?", "असाइननी"));
        arrayList.add(new ThreeItemModel("कौन सा मूल्य हमारे डॉलर में सोने या समकक्ष में मापा गया था?", "बराबर मूल्य"));
        arrayList.add(new ThreeItemModel("पैसे के लेन-देन को रिकॉर्ड करने के लिए बैंक कॉलम कैश बुक में उपयोग की जाने वाली प्रविष्टि का नाम क्या है?", "प्रविष्टि दर्ज करें"));
        arrayList.add(new ThreeItemModel("निर्धारित मात्रा का एक अच्छा उत्पादन करने की निर्धारित लागत, जो कि उत्पादित मात्रा से विभाजित होती है ... ...?", "निश्चित रूप से निर्धारित राशि"));
        arrayList.add(new ThreeItemModel("ए कंपनी का मूल दस्तावेज कौन सा है?", "मेमोरेंडम ऑफ एसोसिएशन"));
        arrayList.add(new ThreeItemModel("एक व्यक्ति की उपस्थिति में सात व्यक्ति एसोसिएशन के ज्ञापन पर हस्ताक्षर करने के लिए न्यूनतम संख्या?", "सात व्यक्ति"));
        arrayList.add(new ThreeItemModel("कंपनी के चार्टर में, एक नाम का चयन करते समय किस शब्द को शामिल नहीं किया जाना चाहिए?", "सहकारी"));
        arrayList.add(new ThreeItemModel("एक कंपनी के नाम पर जो शब्द अंत में इस्तेमाल किया जाना चाहिए?", "सीमित"));
        arrayList.add(new ThreeItemModel("मेमोरेंडम का सबसे महत्वपूर्ण खंड कौन सा है?", "वस्तु खंड"));
        arrayList.add(new ThreeItemModel("कौन सा एक दस्तावेज है जिसमें कंपनी के आंतरिक प्रबंधन के लिए एक नियम और विनियम शामिल हैं?", "एसोसिएशन का लेख"));
        arrayList.add(new ThreeItemModel("बैंकिंग व्यवसाय में भागीदारों की अधिकतम संख्या क्या है?", "दस"));
        arrayList.add(new ThreeItemModel("एक सार्वजनिक कंपनी में सदस्यों की न्यूनतम संख्या क्या है?", "सात"));
        arrayList.add(new ThreeItemModel("कौन सा बैंक नोट बियरर को यह अधिकार देता है कि वह सोने में अपना अंकित मूल्य परिवर्तित करे या राशि के समतुल्य मूल्य के बराबर कोई अन्य वस्तु?", "परिवर्तनीय बैंक-नोट?"));
        arrayList.add(new ThreeItemModel("किस रूप में सहकारी समिति, अपने सदस्यों को इसके अधिशेष लाभांश वितरित करती है?", "बोनस के रूप में"));
        arrayList.add(new ThreeItemModel("कौन सा तकनीक एक व्यापारी को लाभ के लिए एक कृत्रिम बाजार बनाने के लिए डिज़ाइन किया गया है?", "बाजार में वृद्धि"));
        arrayList.add(new ThreeItemModel("व्हाट इज़ डेड टाइम?", "कर्मचारी की कोई गलती नहीं होने के कारण समय नष्ट हो गया और जिसके लिए उसे आमतौर पर पूरी दर से भुगतान किया जाता है"));
        arrayList.add(new ThreeItemModel("एक निर्णय वृक्ष क्या है?", "निर्णयों के अनुक्रम का एक आरेख, जिसमें से प्रत्येक में विकल्पों की एक ज्ञात संख्या के बीच चयन करना शामिल है और पिछले निर्णयों के परिणाम पर निर्भर करता है"));
        arrayList.add(new ThreeItemModel("क्या सिंडीकेट है?", "आम उद्देश्य की ओर एक साथ काम करने वाले लोगों के समूह को आमतौर पर लाभ एक सिंडिकेट कहा जाता है।"));
        arrayList.add(new ThreeItemModel("बैंकिंग व्यवसाय के पहलू में एक बड़े पैमाने पर कंपनियों को ऋण देने के लिए इस्तेमाल किया जाने वाला शब्द क्या है?", "बैंकिंग"));
        arrayList.add(new ThreeItemModel("लाभ मार्जिन जो माल का एक खुदरा विक्रेता अपने आपूर्तिकर्ता से प्राप्त करता है, जिसे ........ कहा जाता है?", "व्यापार छूट"));
        arrayList.add(new ThreeItemModel("क्या स्वामित्व है और क्या स्वामित्व है?", "संपत्ति और दायित्व"));
        arrayList.add(new ThreeItemModel("एक परिसंपत्ति कैसे व्यक्त की जाती है?", "देयताएं = मालिक की इक्विटी"));
        arrayList.add(new ThreeItemModel("क्या सब्सिडी है?", "यह सरकार द्वारा अपनाई गई एक विधि है या किसी मूल्य का समर्थन करने वाली कंपनी है"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("کامرس کیا ہے؟", "کامرس سے مراد ہے اور اس میں وہ تمام سرگرمیاں شامل ہیں جو سامان اور خدمات کو اپنی اصل جگہ سے اپنے استعمال کی جگہ پر لانے کے لئے ضروری ہیں۔"));
        arrayList.add(new ThreeItemModel("کامرس کتنے محکموں میں بنیادی طور پر تجارت میں تقسیم ہوتا ہے؟ وہ کون سے ہیں؟" , "دو میں"));
        arrayList.add(new ThreeItemModel("تجارت دو حصوں میں تقسیم ہے ، وہ کون سے ہیں؟" , "گھریلو تجارت اور غیر ملکی تجارت"));
        arrayList.add(new ThreeItemModel("گھریلو تجارت کتنے ڈویژنوں میں تقسیم کی گئی ہے؟" , "ان دو میں ، پوری فروخت اور خوردہ"));
        arrayList.add(new ThreeItemModel("حوالہ قیمت کیا ہے؟" , "یہ حصص کی قیمت کی قیمت ہے جیسا کہ اسٹاک ایکسچینج اجناس مارکیٹ کی سرکاری فہرست میں بتایا گیا ہے۔"));
        arrayList.add(new ThreeItemModel("شیئر کیا ہے؟" , "کسی کمپنی کے حصہ دار سرمایہ میں سرمایہ کاروں کے مفادات کا حساب کتاب کرنے کے لئے ایک یونٹ"));
        arrayList.add(new ThreeItemModel("ساکھ لینے کے لئے دوسرا نام کیا ہے؟" , "سیکیورٹیز ڈیبینچرز"));
        arrayList.add(new ThreeItemModel("کس کو ثالث کہا جاتا ہے؟" , "فریقین کے ذریعہ تنازعہ کو طے کرنے کے لئے ایک طریقہ تجویز کرنے کے لئے فریقین کے ذریعہ ایک شخص کا انتخاب کیا جاتا ہے"));
        arrayList.add(new ThreeItemModel("گورنمنٹ انسٹی ٹیوٹ نے کمپنیوں میں ترمیم کا قانون کب انجام دیا؟" , "فروری 1963 میں۔"));
        arrayList.add(new ThreeItemModel("ڈیبٹ کیا ہے؟" , "یہ وہ اصطلاح ہے جس میں ڈبل انٹری بک میں کسی اکاؤنٹ کے بائیں جانب اندراج کے لئے استعمال ہوتا ہے۔"));
        arrayList.add(new ThreeItemModel("اس برانڈ مارک کو نامزد کریں جس میں قانونی پابندیاں ہیں؟" , "تجارتی نشان"));
        arrayList.add(new ThreeItemModel("اسٹاک مارکیٹ کیا ہے؟", "سیکیورٹیز کے لئے ایک منظم مارکیٹ۔ اسے اسٹاک ایکسچینج بھی کہا جاتا ہے۔"));
        arrayList.add(new ThreeItemModel("کیا ہے ٹیپ؟" , "سیکیورٹیز کی ایک بڑی مقدار جو کسی کے پاس ہے جو کسی کو بھی خریدنا چاہتا ہے جو بیچ سکتا ہے اسے نل کہا جاتا ہے۔"));
        arrayList.add(new ThreeItemModel("اجرت کیا ہے؟" , "یہ آپریٹو عملے کو ادا کیا جانے والا معاوضہ ہے جس کی پیداوار ایک سال میں براہ راست ہوسکتی ہے۔"));
        arrayList.add(new ThreeItemModel("ایک ضمنی پروڈکٹ کیا ہے؟" , "عام طور پر جو فروخت کی جاسکتی ہے ، وہ اہم مصنوعات کی تیاری کے عمل میں تیار کی جاتی ہے۔"));
        arrayList.add(new ThreeItemModel("ایک وینڈر نے دیندار کو کریڈٹ دینے کے ذریعہ جاری کردہ دستاویز کو کال کیا جاتا ہے ......؟" , "کریڈٹ نوٹ"));
        arrayList.add(new ThreeItemModel("پیٹی کیش کیا ہے؟" ,"ایک ادارہ کے پاس نقد رقم کا ایک چھوٹا فنڈ جو چھوٹی اور فوری ادائیگی کے لئے استعمال ہوتا ہے"));
        arrayList.add(new ThreeItemModel("کسی کمپنی میں کاروبار کے کنٹرول اور انتظامیہ میں حصہ لینے کے لئے کس کو اختیار دیا گیا ہے؟" , "شیئر ہولڈرز کے ذریعہ منتخب کردہ بورڈ آف ڈائریکٹرز"));
        arrayList.add(new ThreeItemModel("قرض کی ادائیگی کے لئے بطور سیکیورٹی سامان کی ضمانت طلب ہے .......؟" , "عہد"));
        arrayList.add(new ThreeItemModel("ایک خوردہ فروش کے ذریعہ فروخت کردہ سامان کا انتخاب کال کیا جاتا ہے ........؟" , "درجہ بندی"));
        arrayList.add(new ThreeItemModel("ایک فرد یا پارٹی کیا ہے جس کے لئے ایک تفویض نامہ دیا گیا ہے؟" , "Assignee"));
        arrayList.add(new ThreeItemModel("سونے میں کس قدر کی پیمائش کی گئی یا ہمارے ڈالر میں اس کے مساوی؟", "مساوی قدر"));
        arrayList.add(new ThreeItemModel("انٹری کا نام کیا ہے جو منی ٹرانزیکشن کو ریکارڈ کرنے کے لئے بینک کالم کیش بک میں استعمال ہوتا ہے؟" , "برعکس اندراج"));
        arrayList.add(new ThreeItemModel("پیدا کردہ مقدار کے حساب سے اچھ Divے حص Ofے کی پیداوار کے لئے مقررہ لاگت کیا ہے؟" ,"اوسط مقررہ قیمت"));
        arrayList.add(new ThreeItemModel("کسی کمپنی کا بنیادی دستاویز کون سا ہے؟" , "میمورنڈم آف ایسوسی ایشن"));
        arrayList.add(new ThreeItemModel("ان افراد کی کم سے کم تعداد جنہوں نے ایسوسی ایشن کی یادداشت پر دستخط کرنے ہیں؟" , "ایک گواہ کی موجودگی میں سات افراد"));
        arrayList.add(new ThreeItemModel("کمپنی کے میثاق میں ایک نام کا انتخاب کرتے ہوئے کون سا لفظ شامل نہیں ہونا چاہئے؟" , "کوآپریٹو"));
        arrayList.add(new ThreeItemModel("ایک کمپنی کے نام پر آخر کون سا لفظ استعمال کیا جانا چاہئے؟" , "محدود"));
        arrayList.add(new ThreeItemModel("یادداشت کی سب سے اہم شقیں کون سی ہیں؟" , "اعتراض شق"));
        arrayList.add(new ThreeItemModel("کمپنی کی داخلی انتظامیہ کے لئے قواعد و ضوابط پر مشتمل ایک دستاویز کون سی ہے؟" , "مضمون کا ایسوسی ایشن"));
        arrayList.add(new ThreeItemModel("بینکنگ کاروبار میں شراکت داروں کی زیادہ سے زیادہ تعداد کیا ہے؟" , "دس"));
        arrayList.add(new ThreeItemModel("عوامی کمپنی میں ممبروں کی کم سے کم تعداد کتنی ہے؟" , "سات"));
        arrayList.add(new ThreeItemModel("کس بینک نوٹ نے بیریر کو یہ حق دیا ہے کہ وہ اس کے چہرے کی قیمت کو سونے میں تبدیل کرے یا اس کی قیمت کے برابر کسی اور اجناس کی قیمت کو مقرر کردہ رقم سے مل سکے؟" , "کنورٹیبل بینک نوٹ"));
        arrayList.add(new ThreeItemModel("کوآپریٹو سوسائٹی ، کس فارم میں اپنے زائد حصص کو اپنے ممبروں میں بانٹتی ہے؟" , "بونس کی شکل میں"));
        arrayList.add(new ThreeItemModel("تاجر کو فائدہ اٹھانے کے لئے مصنوعی مارکیٹ بنانے کے لئے کس تکنیک کا ڈیزائن کیا گیا ہے؟" , "مارکیٹ کو دھاندلی کرنا"));
        arrayList.add(new ThreeItemModel("ڈیڈ ٹائم کیا ہے؟" , "ملازم کی غلطی کے سبب وقت ضائع ہوا اور اس کے لئے عام طور پر اسے پوری شرح پر ادا کیا جاتا ہے۔"));
        arrayList.add(new ThreeItemModel("فیصلہ کن درخت کیا ہے؟" , "فیصلوں کے تسلسل کا ایک آریھ ، جس میں سے ہر ایک میں متبادل کے نام سے جانا جاتا تعداد کے درمیان انتخاب کرنا شامل ہے اور یہ پچھلے فیصلوں کے نتائج پر منحصر ہے۔"));
        arrayList.add(new ThreeItemModel("سنڈیکیٹ کیا ہے؟" , "لوگوں کے ایک گروپ کو ایک مشترکہ مقصد کے لئے مل کر کام کرنے سے عام طور پر منافع سنڈیکیٹ کہلاتا ہے۔"));
        arrayList.add(new ThreeItemModel("بینکنگ کاروبار کے پہلو میں ، بڑے پیمانے پر کمپنیوں کو قرض دینے میں کیا اصطلاح استعمال کی جاتی ہے؟" , "تھوک بینکاری"));
        arrayList.add(new ThreeItemModel("منافع کی حد جس سامان کی خوردہ فروش اس کے سپلائر سے وصول کرتا ہے اسے بلایا جاتا ہے ........؟" , "تجارت کی چھوٹ"));
        arrayList.add(new ThreeItemModel("اس اصطلاح کا کیا مطلب ہے جو اس کے ملکیت اور کس ملکیت کا ہے اس کے بیان کی نشاندہی کرنے کے لئے کیا ہے؟" , "اثاثے اور ذمہ داری کے بیانات"));
        arrayList.add(new ThreeItemModel("کسی اثاثے کا اظہار کس طرح ہوتا ہے؟" , "اثاثہ جات کی واجبات = مالک کی ایکویٹی"));
        arrayList.add(new ThreeItemModel("سبسڈی کیا ہے؟" , "یہ ایک ایسا طریقہ ہے جسے حکومت یا قیمت کی حمایت کرنے والی کمپنی نے اپنایا ہے۔"));



        return arrayList;
    }


}
