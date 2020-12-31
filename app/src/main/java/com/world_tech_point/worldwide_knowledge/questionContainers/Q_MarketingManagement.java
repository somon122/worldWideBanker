package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_MarketingManagement {


    private Context context;
    public Q_MarketingManagement(Context context) {
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

        String str2 = "D.\tAll of these";
        arrayList.add(new ThreeItemModel("Internal marketing environment includes\n\nA.\tMarkets\t\nB.\tEmployees\nC.\tService provider\t\nD.\tAll of these\n", str2));
        arrayList.add(new ThreeItemModel("Internet Marketing does not deal\n\nA.\tAdvertising\nB.\tDisplay Advertising\nC.\tInteractive Marketing\nD.\tE-mail Marketing and Web advertisin\n", "B.\tDisplay Advertising"));
        arrayList.add(new ThreeItemModel("The most structured marketing problems are likely to be those dealing with\n\nA.\tPlace\t\nB.\tPrice\nC.\tProduct\t\nD.\tPromotion\n", "A.\tPlace"));
        arrayList.add(new ThreeItemModel("The life cycle concept places particular emphasis on risks. For management in any firm, of failing to cultivate invention and innovation\" this statement refers to\n\nA.\tProduct Life Cycle\nB.\tProduct Cost Plan\nC.\tProduct Price Policy\nD.\tMarket Segmentation\n", "A.\tProduct Life Cycle"));
        arrayList.add(new ThreeItemModel("MRP stands for\n\nA.\tMarketing Research Planning\nB.\tMaterial Requirements Planning\nC.\tManagement Resource Planning\nD.\tManufacturing Resource Planning\n", "D.\tManufacturing Resource Planning"));
        arrayList.add(new ThreeItemModel("Which is a base of green marketing?\n\nA.\tProduct\nB.\tProgramme\nC.\tCapital Flow\nD.\tGreenhouse gas reduction market\n", "D.\tGreenhouse gas reduction market"));
        arrayList.add(new ThreeItemModel("The market process involves, which functions?\n\nA.\tBuying\t\nB.\tStoring\nC.\tSelling\nD.\tAll of these\n", str2));
        arrayList.add(new ThreeItemModel("Which is not a form of Internet Marketing?\n\nA.\te-Marketing\nB.\tOn-line marketing\nC.\tInternet advertising\nD.\tProduct Mix and Branding\n", "D.\tProduct Mix and Branding"));
        arrayList.add(new ThreeItemModel("The Market environment consists\n\nA.\tTechnology\nB.\tCompetition\nC.\tSocio-economic\nD.\tAll of these\n", str2));
        arrayList.add(new ThreeItemModel("Which is the problem of marketing communication?\n\nA.\tDistance\nB.\tLack of trust\nC.\tHidden sources and data\nD.\tAll of these\n", str2));

        String str = "D.\tAll of the above";
        arrayList.add(new ThreeItemModel("Stage of PLC -\n\nA.\tIntroduction  \nB.\tGrowth\nC.\tMaturity & Decline\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Market control process consists\n\nA.\tCorrecting Deviations\nB.\tPerformance Appraisal\nC.\tFormation of Performance standards\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("The marketing plan provides both\n\nA.\tThe vision and control\nB.\tThe vision and the post\nC.\tThe vision and the cost\nD.\tThe vision and the direction\n", "D.\tThe vision and the direction"));
        arrayList.add(new ThreeItemModel("\"A marketing policy is a statement of a course of action which will be followed under a given set of circumstances.\" Who said it?\n\nA.\tMcCarthy\nB.\tManson and Rath\nC.\tWilliam J. Stanton\nD.\tNone of these\n", "C.\tWilliam J. Stanton"));
        arrayList.add(new ThreeItemModel("Marketing research does not normally\n\nA.\tDescribe the current situation\nB.\tGather environmental information\nC.\tProvide a continuous source of information\nD.\tRelate to all aspects of marketing operations\n", "C.\tProvide a continuous source of information"));
        arrayList.add(new ThreeItemModel("Which of the following is not factors of the demand variable, according to Philip Kotler?\n\nA.\tCustomer Variable\nB.\tCompetition Variable\nC.\tEnvironment Variable\nD.\tAll of the above\n", "A.\tCustomer Variable"));
        arrayList.add(new ThreeItemModel("Which of the following is not controllable variable of marketing management?\n\nA.\tScience Environment\nB.\tEconomic Environment\nC.\tCompetitive Environment\nD.\tTechnological Environment\n", "B.\tEconomic Environment"));
        arrayList.add(new ThreeItemModel("The marketing concerns requires both fixed capital and\n\nA.\tShare Capital\t\nB.\tWorking Capital\nC.\tFlexible Capital\t\nD.\tLong-term Capital\n", "B.\tWorking Capital"));
        arrayList.add(new ThreeItemModel("Promotion mix is the particular combination of promotional tools used by a company to _____ with its audiences.\n\nA.\tPlan\t\nB.\tHelp\nC.\tCommunicate\t\nD.\tPurchasing Decision\n", "C.\tCommunicate"));
           arrayList.add(new ThreeItemModel("Micro marketing environment include\n\nA.\tConsumer\nB.\tSuppliers\nC.\tLocal share holder\nD.\tAll of these\n", str2));
        arrayList.add(new ThreeItemModel("A market segment should be\n\nA.\tSizeable\nB.\tMeasurable     \nC.\tProfitable\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Element of promotion mix -\n\nA.\tPublic relations\nB.\tPersonal selling\nC.\tSales promotion\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Marketing research data is gathered by\n\nA.\tControlled experiment\nB.\tIn-depth interviews\nC.\tObservation\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("The marketing manager have to carry out their responsibilities integrating all these factors in the management\n\nA.\tGoals\nB.\tProcess\nC.\tObjective\nD.\tOpportunity\n", "B.\tProcess"));
        arrayList.add(new ThreeItemModel("Sales Promotion includes\n\nA.\tPublicity\nB.\tAdvertising\nC.\tSales Promotion and Personal Selling\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Which of the following point is responsibility for effective market segmentation?\n\nA.\tSubstantiality\nB.\tMeasurability\nC.\tEasy & accessibility\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Marketing Process involves\n\nA.\tProduct\nB.\tHuman Needs\nC.\tDemand Flow\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Marketing planning is concerned with\n\nA.\tPlanning sales force size and deployment\nB.\tPlanning consignment sales contracts to be offered\nC.\tPlanning the amount the placement of newspaper ads\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Advertising does appear to be important in\n\nA.\tInformation\nB.\tBrand image\nC.\tHighlighting Specific Features\nD.\tAll of the above\n", str));
        arrayList.add(new ThreeItemModel("Philosophy of marketing\n\nA.\tSale oriented marketing\nB.\tProduct oriented marketing\nC.\tProduction oriented marketing\nD.\tAll of the above\n", str));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str2 = "D.\tAll of these";
        String str ="উপরের সমস্ত ডি।  ";
        arrayList.add(new ThreeItemModel("অভ্যন্তরীণ বিপণনের পরিবেশে এ। মার্কেটস বি। কর্মচারী সি। পরিষেবা সরবরাহকারী ডি। এই সবগুলি অন্তর্ভুক্ত রয়েছে এনডি টি এর সবকটি  ", str2));
        arrayList.add(new ThreeItemModel("ইন্টারনেট বিপণন ডি এ না। বিজ্ঞাপন বি। প্রদর্শন বিজ্ঞাপন C nC। N t ইন্টারেক্টিভ মার্কেটিং ডি।-TE- বিপণন এবং ওয়েব বিজ্ঞাপনী is n", "বি  ডিসপ্লে বিজ্ঞাপন"));
        arrayList.add(new ThreeItemModel("সবচেয়ে কাঠামোগত বিপণনের সমস্যাগুলি সম্ভবত এ প্লেসের সাথে আচরণ করেবি দাম সি। পণ্য  টি ডি   প্রচার "," এ। স্থান "));
        arrayList.add(new ThreeItemModel("জীবনচক্র ধারণাটি ঝুঁকির উপরে বিশেষ জোর দেয় any কোনও ফার্মে পরিচালনার জন্য, উদ্ভাবন এবং উদ্ভাবন চাষে ব্যর্থ হওয়ার জন্য এই বিবৃতিটি এ। পণ্য জীবনচক্র খ। পণ্যমূল্য পরিকল্পনা সি। পণ্য মূল্য নীতি D মার্কেট বিভাজনকে বোঝায় এ। প্রোডাক্ট লাইফ জীবনচক্র ধারণাটি ঝুঁকির উপরে বিশেষ জোর দেয় any কোনও ফার্মে পরিচালনার জন্য" ," এ।  উত্পাদনের জীবনচক্র "));
        arrayList.add(new ThreeItemModel("এমআরপি হ'ল A।  বিপণন গবেষণা পরিকল্পনা B।মেটেরিয়াল প্রয়োজনীয়তা পরিকল্পনা C।  পরিচালন রিসোর্স প্ল্যানিং ডি ম্যানুফ্যাকচারিং রিসোর্স প্ল্যানিং", "ডি ম্যানুফ্যাকচারিং রিসোর্স প্ল্যানিং"));
        arrayList.add(new ThreeItemModel("সবুজ বিপণনের একটি ভিত্তি কোনটি? A. পণ্য বি প্রোগ্রাম সি। মূলধন প্রবাহ D. গ্রিনহাউস গ্যাস হ্রাস বাজার", "ডি গ্রিনহাউস গ্যাস হ্রাস বাজার"));
        arrayList.add(new ThreeItemModel("বাজার প্রক্রিয়া জড়িত, কোনটি কাজ করে? এ। বি। স্টোরিং সি বিক্রয় ডি। এ সবই", str2));
        arrayList.add(new ThreeItemModel("কোনটি ইন্টারনেট বিপণনের রূপ নয়? ই-বিপণন বি অনলাইন লাইন বিপণন সি ইন্টারনেট বিজ্ঞাপন ডি প্রোডাক্ট মিক্স এবং ব্র্যান্ডিং", "ডি প্রোডাক্ট মিক্স এবং ব্র্যান্ডিং পণ্য মিশ্রণ এবং ব্র্যান্ডিং "));
        arrayList.add(new ThreeItemModel("বাজারের পরিবেশে A. প্রযুক্তি বি। প্রতিযোগিতা সি। আর্থ-সামাজিক D. এই সবগুলিই রয়েছে", str2));
        arrayList.add(new ThreeItemModel("বিপণন যোগাযোগের সমস্যা কোনটি? এ। দূরত্ব বি। বিশ্বাসের অভাব সি। লুকানো উত্স এবং ডেটা ডি এই সমস্ত", str2));
        arrayList.add(new ThreeItemModel("মাইক্রো বিপণনের পরিবেশের সাথে এ। গ্রাহক বি সরবরাহকারী সি। লোকাল শেয়ার হোল্ডার ডি। এর সবগুলিই", str2));
        arrayList.add(new ThreeItemModel("একটি মার্কেট সেগমেন্ট এ। আকারযুক্ত বি পরিমাপযোগ্য সি। লাভজনক D. উপরের সমস্তটি", str));
        arrayList.add(new ThreeItemModel("পদোন্নতির মিশ্রণ গণতান্ত্রিক সম্পর্ক বি। ব্যক্তিগত বিক্রয় গ। বিক্রয় প্রচারডি উপরের সমস্ত ", str));
        arrayList.add(new ThreeItemModel("বিপণন গবেষণা ডেটা এ। নিয়ন্ত্রিত পরীক্ষার মাধ্যমে বি। গভীর-সাক্ষাত্কার সি। পর্যবেক্ষণ D. উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("বিপণন ব্যবস্থাপককে পরিচালনার ক্ষেত্রে এই সমস্ত বিষয়গুলি সংহত করে তাদের দায়িত্ব পালন করতে হবে এ গোল বি বি প্রক্রিয়া সি। উদ্দেশ্য ডি। সুযোগ", "বি প্রক্রিয়া"));

        arrayList.add(new ThreeItemModel("পিএলসির পর্যায় - একটি ভূমিকা বি। বৃদ্ধি সি। পরিপক্কতা এবং অস্বীকার D. উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("মার্কেট কন্ট্রোল প্রক্রিয়ায় এ। ডিভিয়েশনগুলি সংশোধন করে বি পারফরম্যান্স মূল্যায়ন সি। পারফরম্যান্স মান গঠন ডি। উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("বিপণন পরিকল্পনা এ। দর্শন এবং নিয়ন্ত্রণ বি। দৃষ্টি এবং পোস্ট D. দৃষ্টি এবং ব্যয় D. দর্শন এবং দিকনির্দেশনা", "ডি দৃষ্টি এবং দিকনির্দেশনা উভয়ই সরবরাহ করে "));
        arrayList.add(new ThreeItemModel(" একটি বিপণন নীতি হ'ল ক্রিয়াকলাপের বিবৃতি যা কোনও নির্দিষ্ট পরিস্থিতিতে অনুসরণ করা হবে। এটি কে বলেছে? এ। ম্যাকার্থি বি। ম্যানসন এবং রথ সি। উইলিয়াম জে স্ট্যান্টন ডি। এর মধ্যে কোনওটিই নয়", "সি উইলিয়াম জে স্ট্যান্টন"));
        arrayList.add(new ThreeItemModel("বিপণন গবেষণা সাধারনতঃ এ। বর্তমান পরিস্থিতি বর্ণনা করুন বি পরিবেশগত তথ্য সংগ্রহ করুন গ। তথ্যের একটি ধারাবাহিক উত্স সরবরাহ করুন ডি বিপণনের ক্রিয়াকলাপের সমস্ত দিকের সাথে সম্পর্কিত", "সি। তথ্যের ধারাবাহিক উত্স সরবরাহ করুন"));
        arrayList.add(new ThreeItemModel("ফিলিপ কোটলার অনুসারে নিম্নলিখিতগুলির মধ্যে কোনটি চাহিদা পরিবর্তকের কারণ নয়? ক। গ্রাহক পরিবর্তনশীল বি। প্রতিযোগিতা পরিবর্তনশীল সি। পরিবেশ পরিবর্তনশীল ডি। উপরের সমস্ত", "ক। গ্রাহক পরিবর্তনশীল"));
        arrayList.add(new ThreeItemModel("নিচের কোনটি বিপণন পরিচালনার নিয়ন্ত্রনযোগ্য পরিবর্তনশীল নয়? ক। বিজ্ঞান পরিবেশ বি। অর্থনৈতিক পরিবেশ সি। প্রতিযোগিতামূলক পরিবেশ D. প্রযুক্তিগত পরিবেশ", "বি অর্থনৈতিক পরিবেশ"));
        arrayList.add(new ThreeItemModel("বিপণনের উদ্বেগগুলির জন্য স্থির মূলধন এবং এ। উভয়ই ক্যাপিটাল ","বি ভাগ করা উচিত B."));
        arrayList.add(new ThreeItemModel("প্রচার মিশ্রণ হ'ল একটি সংস্থা তার শ্রোতাদের সাথে _____ ব্যবহার করার জন্য প্রচারমূলক সরঞ্জামগুলির নির্দিষ্ট"," সংমিশ্রণ  কম্যুনিকেট "));
          arrayList.add(new ThreeItemModel("বিক্রয় প্রচারের মধ্যে রয়েছে এ। প্রচার বি। বিবর্তন সি। বিক্রয় প্রচার এবং ব্যক্তিগত বিক্রয় D. উপরের সমস্তগুলি", str));
        arrayList.add(new ThreeItemModel("কার্যকর বাজার বিভাজনের জন্য নিম্নলিখিত পয়েন্টগুলির মধ্যে কোনটি দায়বদ্ধ? উ। সাঁই বাঁশিতে বি। পরিমাপযোগ্যতা এনসি।সহজ ও অ্যাক্সেসযোগ্যতা  ডি। Above উপরের সমস্ত কিছু ", str));
        arrayList.add(new ThreeItemModel("বিপণন প্রক্রিয়া এ। পণ্য জড়িতমানব প্রয়োজন সি। চাহিদা প্রবাহ D. উপরের সমস্ত ", str));
        arrayList.add(new ThreeItemModel("বিপণন পরিকল্পনা ক। পরিকল্পনা বিক্রয় বলের আকার এবং স্থাপনার সাথে সম্পর্কিত। পরিকল্পনা করা পণ্য বিক্রয় বিক্রয় প্রস্তাব দেওয়া হবে। খবরের কাগজের বিজ্ঞাপনের স্থান নির্ধারণের পরিমাণের পরিকল্পনা করা। উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("এ। বি। বি। ব্র্যান্ড ইমেজে বিজ্ঞাপন গুরুত্বপূর্ণ মনে হয়ওাইটিং নির্দিষ্ট বৈশিষ্ট্য ডি উপরোক্ত সমস্ত ", str));
        arrayList.add(new ThreeItemModel("বিপণনের দর্শন A. বিক্রয়মুখী বিপণন খ। পণ্যমুখী বিপণন সি। উত্পাদনমুখী বিপণন D. উপরের সমস্ত", str));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str = "उपरोक्त सभी डी।";
        arrayList.add(new ThreeItemModel("पीएलसी स्टेज - एन इंट्रोडक्शन बी ग्रोथ सी। मेच्योरिटी एंड डेनियल डी। उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("बाजार नियंत्रण प्रक्रिया में। ए। विचलन को ठीक करता है। बी। प्रदर्शन मूल्यांकन। सी। प्रदर्शन मानक गठन। उपरोक्त सभी।", str));
        arrayList.add(new ThreeItemModel("मार्केटिंग प्लान ए। विजन और कंट्रोल बी। विजन और पोस्ट डी। विजन और व्यय डी। विजन और दिशा", "डी विजन और डायरेक्शन दोनों प्रदान करता है"));
        arrayList.add(new ThreeItemModel("एक विपणन नीति कार्रवाई का एक बयान है जिसे एक विशेष स्थिति में पालन किया जाएगा। किसने कहा? ए। मैक्कार्थी बी। मैनसन और रोथ सी। विलियम जे। स्टैंटन डी। इनमें से कोई नहीं।", "सी। विलियम जे। स्टैंटन"));
        arrayList.add(new ThreeItemModel("विपणन अनुसंधान आम तौर पर एक है। वर्तमान स्थिति का वर्णन करें। बी पर्यावरणीय डेटा एकत्र करें। सी। सूचना का एक सुसंगत स्रोत प्रदान करें। डी। विपणन गतिविधियों के सभी पहलुओं से संबंधित है।"," सी। एक सुसंगत स्रोत प्रदान करें "));
        arrayList.add(new ThreeItemModel("फिलिप कोटलर के अनुसार, निम्न में से कौन सा मांग चर का कारण नहीं है? ग्राहक चर बी। प्रतिस्पर्धी चर सी। पर्यावरण चर डी। उपरोक्त सभी", "ए। ग्राहक चर।"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन विपणन प्रबंधन में एक परिवर्तनीय चर नहीं है? विज्ञान का वातावरण B. आर्थिक वातावरण C. प्रतिस्पर्धात्मक वातावरण D. प्रौद्योगिकी वातावरण", "आर्थिक वातावरण"));
        arrayList.add(new ThreeItemModel("विपणन चिंताओं और ए कैपिटल दोनों के लिए निश्चित पूंजी", "बी को बी विभाजित किया जाना चाहिए।"));
        arrayList.add(new ThreeItemModel("प्रोमोशनल मिक्स एक संगठन है जो अपने दर्शकों के लिए विशिष्ट है जो _____ प्रचार उपकरण का उपयोग कर रहा है", "कम्बाइंड करें"));
        String str2 = "इनमें से सभी डी";
        arrayList.add(new ThreeItemModel("एक आंतरिक विपणन वातावरण में, ए। मार्केट्स बी। कर्मचारी सी। सेवा प्रदाता डी। इनमें एनडीटी के सभी शामिल हैं।", str2));
        arrayList.add(new ThreeItemModel("इंटरनेट मार्केटिंग डीए नहीं है। विज्ञापन बी। विज्ञापन विज्ञापन सी एनसी। एन टी इंटरएक्टिव मार्केटिंग डी-टीई-मार्केटिंग और वेब विज्ञापन एन है", "बी डिस्प्ले विज्ञापन"));
        arrayList.add(new ThreeItemModel("सबसे संरचित विपणन समस्याएं संभवतः इस जगह से निपटेंगी। मूल्य सी। उत्पाद टीडी संवर्धन", "ए प्लेस।"));
        arrayList.add(new ThreeItemModel("जीवनचक्र अवधारणा किसी भी फर्म में काम करने वाले किसी भी फर्म, नवाचार और नवाचार को विफल करने के लिए विफलता पर जोर देती है। यह कथन एक उत्पाद। उत्पाद जीवनचक्र बी। कमोडिटी मूल्य निर्धारण योजना सी। कमोडिटी मूल्य निर्धारण नीति डी बाजार विभाजन के लिए संदर्भित करता है। उत्पाद जीवन जीवन चक्र अवधारणा जोखिम पर जोर देती है। किसी भी फर्म के लिए कोई भी जीवनचक्र देता है "," ए। प्रोडक्शन लाइफसाइकल "));
        arrayList.add(new ThreeItemModel("MRP ए। मार्केटिंग रिसर्च प्लान बी। मैटेरियल रिक्वायरमेंट प्लान C. मैनेजमेंट रिसोर्स प्लानिंग डी। मैन्युफैक्चरिंग रिसोर्स प्लानिंग", "मैन्युफैक्चरिंग रिसोर्स प्लानिंग"));
        arrayList.add(new ThreeItemModel("MRP ए। मार्केटिंग रिसर्च प्लान बी। मैटेरियल रिक्वायरमेंट प्लान C. मैनेजमेंट रिसोर्स प्लानिंग डी। मैन्युफैक्चरिंग रिसोर्स प्लानिंग", "मैन्युफैक्चरिंग रिसोर्स प्लानिंग"));
        arrayList.add(new ThreeItemModel("बाजार प्रक्रिया शामिल है, जो एक काम करती है? ए बी। स्टोरिंग सी। सेल्स डी। ए। एवरीथिंग।", str2));
        arrayList.add(new ThreeItemModel("जो इंटरनेट मार्केटिंग का एक रूप नहीं है? ई मार्केटिंग बी ऑनलाइन लाइन मार्केटिंग सी इंटरनेट विज्ञापन डी प्रोडक्ट मिक्स एंड ब्रांडिंग", "डी प्रोडक्ट मिक्स एंड ब्रांडिंग प्रोडक्ट मिक्सिंग और ब्रांडिंग"));
        arrayList.add(new ThreeItemModel("बाजार के वातावरण में  _ tTechnology BTCompetition C  TSocio-Economic D। होता है। इनमें से  सभी शामिल हैं", str2));
        arrayList.add(new ThreeItemModel("विपणन संचार में क्या समस्या है? ए। डि। B. विश्वास की कमी। छिपे हुए स्रोत और डेटा डी। यह सब।", str2));
        arrayList.add(new ThreeItemModel("मेरा एक बाजार खंड में है। आकार बी मापने योग्य सी। लाभदायक डी। उपरोक्त सभी ", str2));
        arrayList.add(new ThreeItemModel("प्रमोशन मिक्स डेमोक्रेटिक रिलेशनशिप b। पर्सनल सेल्स c। सेल्स प्रमोशन उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("मार्केटिंग रिसर्च डेटा ए। बी। नियंत्रित परीक्षण बी के माध्यम से गहराई से साक्षात्कार सी। अवलोकन डी। उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("विपणन प्रबंधकों को इन सभी कारकों को अपनी जिम्मेदारियों के प्रबंधन में एकीकृत करने की आवश्यकता है। एक लक्ष्य बीबी प्रक्रिया सी। उद्देश्य डी। अवसर", str));
        arrayList.add(new ThreeItemModel("विपणन प्रबंधक को प्रबंधन ए। लक्ष्य बी प्रक्रिया सी। उद्देश्य डी अवसर", "बी प्रक्रियामें इन सभी कारकों को एकीकृत करने के लिए अपनी जिम्मेदारियों को पूरा करना होगा।"));
        arrayList.add(new ThreeItemModel("सेल्स प्रमोशन में ए। पब्लिसिटी बी। विज्ञापन सी। सेल्स प्रमोशन और पर्सनल सेलिंग डी। उपरोक्त सभी शामिल हैं", str));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा बिंदु प्रभावी बाजार विभाजन के लिए जिम्मेदार है? ए साईं बांसुरी में। मापने योग्य नेकां। उपरोक्त सभी के ऊपर आसान और सुलभ डी।", str));
        arrayList.add(new ThreeItemModel("विपणन प्रक्रिया ए। उत्पाद जिसमें मानव की आवश्यकता हो सी। मांग का प्रवाह डी। उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("मार्केटिंग प्लान a। यह योजना बिक्री की गेंद के आकार और स्थान से संबंधित है। नियोजित उत्पाद की बिक्री की पेशकश की जाएगी। अखबार में विज्ञापन के लिए प्लेसमेंट की राशि की योजना बनाएं। उपरोक्त सभी।", str));
        arrayList.add(new ThreeItemModel("मार्केटिंग प्लान a। यह योजना बिक्री की गेंद के आकार और स्थान से संबंधित है। नियोजित उत्पाद की बिक्री की पेशकश की जाएगी। अखबार में विज्ञापन के लिए प्लेसमेंट की राशि की योजना बनाएं। उपरोक्त सभी।", str));
        arrayList.add(new ThreeItemModel("मार्केटिंग दर्शन ए। बिक्री उन्मुख विपणन बी। उत्पाद उन्मुख विपणन सी। उत्पादक उन्मुख विपणन डी। उपरोक्त सभी", str));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str ="مذکورہ بالا س ";
        arrayList.add(new ThreeItemModel("پی ایل سی اسٹیج۔ ایک تعارف بی۔ نمو سی۔ پختگی اور انکار ڈی۔ مذکورہ بالا سب", str));
        arrayList.add(new ThreeItemModel("مارکیٹ پر قابو پانے کے عمل میں۔ اے انحرافات کو درست کرتا ہے۔ بی کارکردگی کی تشخیص۔ سی۔ کارکردگی کا معیار تشکیل۔ ڈی۔ مذکورہ بالا سب۔", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ پلان اے ویژن اینڈ کنٹرول بی وژن اور پوسٹ ڈی وژن اور خرچ D. ویژن اور سمت" , "D وژن اور سمت دونوں فراہم کرتا ہے"));
        arrayList.add(new ThreeItemModel("ایک مارکیٹنگ کی پالیسی عمل کا بیان ہے جس کی پیروی کسی خاص صورتحال میں کی جائے گی۔ کس نے کہا؟ اے میککارتی بی مانسن اور روتھ سی۔ ولیم جے اسٹینٹن ڈی۔ ان میں سے کوئی بھی نہیں۔" , "سی ولیم جے اسٹینٹن"));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کی تحقیق عام طور پر ایک ہے۔ موجودہ صورتحال کی وضاحت کریں۔ بی۔ ماحولیاتی ڈیٹا اکٹھا کریں۔ سی معلومات کا مستقل ذریعہ فراہم کریں۔ ڈی مارکیٹنگ کی سرگرمیوں کے تمام پہلوؤں سے متعلق ہوں۔" ," سی معلومات کا مستقل ذریعہ فراہم کریں۔ "));
        arrayList.add(new ThreeItemModel("فلپ کوٹلر کے مطابق ، مندرجہ ذیل میں سے کونسا مطالبہ متغیر کی وجہ نہیں ہے؟ اے کسٹمر متغیر B. مسابقتی متغیر C. ماحولیاتی متغیر D. مندرجہ بالا میں سے سب" , "اے کسٹمر متغیر۔"));
        arrayList.add(new ThreeItemModel("فلپ کوٹلر کے مطابق ، مندرجہ ذیل میں سے کونسا مطالبہ متغیر کی وجہ نہیں ہے؟ اے کسٹمر متغیر B. مسابقتی متغیر C. ماحولیاتی متغیر D. مندرجہ بالا میں سے سب" , "اے کسٹمر متغیر۔"));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کے خدشات اور اے کیپٹل دونوں کے لئے فکسڈ دارالحکومت" , "بی کو بی تقسیم کیا جانا چاہئے۔"));
        arrayList.add(new ThreeItemModel("پروموشنل مکس ایک تنظیم ہے جو اپنے سامعین کے لئے مخصوص ہے _____ پروموشنل ٹولز استعمال کرنے کے لئے" , "بات چیت کومبائن"));
        String str2 = "D.  ان سب میں";
        arrayList.add(new ThreeItemModel("داخلی مارکیٹنگ کے ماحول میں ، اے مارکیٹس B. ملازم سی سروس فراہم کنندہ D. ان میں این ڈی ٹی کے سبھی شامل ہیں۔", str2));
        arrayList.add(new ThreeItemModel("انٹرنیٹ مارکیٹنگ ڈی اے نہیں ہے۔ ایڈورٹائزنگ بی ڈسپلے ایڈورٹائزنگ سی این سی۔ این ٹی انٹرایکٹو مارکیٹنگ ڈی ٹی ای مارکیٹنگ اور ویب ایڈورٹائزنگ این ہے" , "بی ڈسپلے ایڈورٹائزنگ"));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کے سب سے زیادہ مشکلات شاید اس جگہ سے نمٹیں گی۔ قیمت سی پروڈکٹ ٹی ڈی پروموشن" , "اے پلیس۔"));
        arrayList.add(new ThreeItemModel("لائف سائیکل تصور کسی بھی فرم کے چلانے ، جدت طرازی اور جدت طیبہ کی کاشت کرنے میں ناکامی کے ل risk خطرے پر زور دیتا ہے۔ یہ بیان a. مصنوعات کی زندگی سائیکل b. اجناس کی قیمتوں کا تعین منصوبہ۔ کماڈٹی قیمتوں کی پالیسی ڈی سے مراد مارکیٹ کی تقسیم ہے۔ مصنوعات کی زندگی لائف سائیکل تصور خطرے پر زور دیتا ہے۔ کسی بھی فرم کے لئے کوئی حیاتیاتی سائیکل دیتا ہے "," اے پروڈکشن لائف سائیکل "));
        arrayList.add(new ThreeItemModel("ایم آر پی ہے۔ مارکیٹنگ ریسرچ پلان۔ مادی تقاضوں کا منصوبہ سی۔ مینجمنٹ ریسورس پلاننگ D. مینوفیکچرنگ ریسورس پلاننگ" , "مینوفیکچرنگ ریسورس پلاننگ"));
        arrayList.add(new ThreeItemModel("گرین مارکیٹنگ کی بنیاد کیا ہے؟ اے پروڈکٹ بی پروگرام سی۔ کیپٹل فلوس ڈی گرین ہاؤس گیس کمی مارکیٹ" , "گرین ہاؤس گیس کمی مارکیٹ"));
        arrayList.add(new ThreeItemModel("مارکیٹ کا عمل شامل ہے ، کون سا کام کرتا ہے؟ A. بی۔ اسٹوریج۔ سی سیلز ڈی۔ ہر چیز۔"," "));
        arrayList.add(new ThreeItemModel("انٹرنیٹ مارکیٹنگ کی کون سی شکل نہیں ہے؟ ای مارکیٹنگ بی آن لائن لائن مارکیٹنگ سی انٹرنیٹ ایڈورٹائزنگ ڈی پروڈکٹ مکس اینڈ برانڈنگ", str2));
        arrayList.add(new ThreeItemModel("مارکیٹنگ مواصلات میں کیا پریشانی ہے؟ اے فاصلہ بی۔ اعتماد کا فقدان سی۔ پوشیدہ ذرائع اور ڈیٹا ڈی۔ یہ سب کچھ۔", str2));
        arrayList.add(new ThreeItemModel(" مارکیٹ کے ایک حصے میں ہے۔ سائز بی ناپنے والا ج۔ منافع بخش D. مندرجہ بالا سب ", str2));
        arrayList.add(new ThreeItemModel("پروموشن میں جمہوری رشتہ ملاحظہ ہوتا ہے۔ ذاتی فروخت سی۔ اوپر فروخت کو فروغ دینا۔", str));
        arrayList.add(new ThreeItemModel("تشہیر کے مرکب کا عنصر - ایک تعلقات عامہ بی ذاتی فروخت سی سیلز پروموشن ڈی مذکورہ بالا سب", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ ریسرچ کے اعداد و شمار کو ایک کنٹرول شدہ تجربہ B کے ذریعہ اکٹھا کیا جاتا ہے گہرائی انٹرویوز میں C مشاہدہ D مندرجہ بالا سب", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ منیجر کو ان تمام عوامل کو نظم و نسق میں شامل کرنے کے لئے اپنی ذمہ داریاں نبھانی ہوں گی A گول B پروسیسی سی مقصد D موقع" , "B عمل"));
        arrayList.add(new ThreeItemModel("سیلز پروموشن میں اے پروموشن بی ارتقاء سی۔ سیلز پروموشن اور پرائیویٹ سیلز D. شامل ہیں۔", str));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا نقطہ مارکیٹ کو موثر انداز میں تقسیم کرنے کے لئے ذمہ دار ہے؟ اے سائی بانسری بی ماپنے قابل این سی۔ آسان اور قابل رسائی D. مندرجہ بالا سب سے بڑھ کر۔", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کا عمل۔ انسان کی ضرورت سے منسلک مصنوعہ۔ طلب کا بہاؤ D. مندرجہ بالا سب", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کا منصوبہ ایک۔ اس منصوبے کا تعلق سیلز بال کی جسامت اور جگہ سے ہے۔ منصوبہ بند مصنوع کی فروخت پیش کی جائے گی۔ اخبار میں اشتہار دینے کے لئے جگہ کی رقم کی منصوبہ بندی کریں۔ مذکورہ بالا تمام۔", str));
        arrayList.add(new ThreeItemModel("A. B. B. برانڈ اشتہار میں اشتہار سوچتا ہے کہ مخصوص خصوصیات کو سفید کرنا D", str));
        arrayList.add(new ThreeItemModel("مارکیٹنگ کا فلسفہ A. سیلز پر مبنی مارکیٹنگ b. مصنوعات پر مبنی مارکیٹنگ سی۔ پیداواری پر مبنی مارکیٹنگ D. مذکورہ بالا سب", str));


        return arrayList;
    }


}
