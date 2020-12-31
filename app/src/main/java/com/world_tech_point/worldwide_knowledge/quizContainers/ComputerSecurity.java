package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class ComputerSecurity {
    private Context context;

    public ComputerSecurity(Context context) {
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
        arrayList.add(new ContentQuestionModel("Which of the following would most likely not be a symptom of a virus?","The web browser opens to an unusual home page","Odd message or images are displayed on the screen","Existing program files and icons disappear","The CD–ROM stops functioning","The CD–ROM stops functioning"));
        arrayList.add(new ContentQuestionModel("Code red is a(n) ----------","Word Processing Software","Antivirus","Virus","Photo Editing Software","Virus"));
        arrayList.add(new ContentQuestionModel("-------- software are programs that are installed onto your computer and can scan and remove known viruses which you may have contracted.","Firmmware","Antivirus","Adware","Keylogger","Antivirus"));
        arrayList.add(new ContentQuestionModel("Which of the following describes programs that can run independently travel from system to system and disrupt computer communication?","Viruses","Trojans","Droppers","Worm","Worm"));
        arrayList.add(new ContentQuestionModel("A -------- is a computer program that can replicate itself and spread from one computer to another.","Antivurs","PenDrive","Mouse","Computer Virus","Computer Virus"));
        arrayList.add(new ContentQuestionModel("Authentication is","modification","insertion","hard to assure identity of user on a remote system","none of the above","hard to assure identity of user on a remote system"));


        arrayList.add(new ContentQuestionModel("A -------- is a computer program that can replicate itself and spread from one computer to another.","Antivurs","PenDrive","Mouse","Computer Virus","Computer Virus"));
        arrayList.add(new ContentQuestionModel("The first computer virus is --------","I Love You","Blaster","Sasser","Creeper","Creeper"));
        arrayList.add(new ContentQuestionModel("MCAfee is an example of","Antivirus","Photo Editing Software","Quick Heal","Virus","Antivirus"));
        arrayList.add(new ContentQuestionModel("Which of the following is known as Malicious software?","illegalware","badware","malware","maliciousware","malware"));
        arrayList.add(new ContentQuestionModel("To protect a computer from virus, you should install -------- in your computer.","backup wizard","antivirus","disk cleanup","disk defragmenter","antivirus"));
        arrayList.add(new ContentQuestionModel("VIRUS stands for","Very Intelligent Result Until Source","Very Interchanged Resource Under Search","Vital Information Resource Under Slege","Viral Important Record User Searched","Vital Information Resource Under Slege"));
        arrayList.add(new ContentQuestionModel("Which of the following is not an antivirus software?","AVG","Avast","Code Red","MCAfee","Code Red"));
        arrayList.add(new ContentQuestionModel("What is short for malicious software (is software designed to disrupt computer operation, gather sensitive information, or gain unauthorized access to computer systems)?","Malware","Moleculewar","Malisoft","Malairasoft","Malware"));
        arrayList.add(new ContentQuestionModel("Which of the following is/are threats for electronic payment systems?","Computer worms","Computer virus","Trojan horse","All of the above","All of the above"));
        arrayList.add(new ContentQuestionModel("Which of the following virus overtake computer system, when it boots and destroy information?","System infectors","Trojan","Boot infectors","Stealth virus","Stealth virus"));
        arrayList.add(new ContentQuestionModel("Key logger is a","Firmware","Antivirus","Spyware","All of the above","Spyware"));
        arrayList.add(new ContentQuestionModel("To protect yourself from computer hacker, you should turn on a","Script","Firewall","VLC","Antivirus","Firewall"));
        arrayList.add(new ContentQuestionModel("Firewalls are used to protect against --------","data driven attacks","fire attacks","virus attacks","unauthorised access","unauthorised access"));

        arrayList.add(new ContentQuestionModel("-------- are attempts by individuals to obtain confidential information from you to falsifying their identity.","Computer viruses","Phishing scams","Phishing trips","Spyware scams","Phishing scams"));
        arrayList.add(new ContentQuestionModel("A virus that migrates freely within a large population of unauthorized email user is called a -------"," flame war","worm","macro","plagiarism","macro"));
        arrayList.add(new ContentQuestionModel("-------- are often delivered to a PC through an email attachment and are often designed to do harm.","Spam","Email","Portals","Virus","Virus"));
        arrayList.add(new ContentQuestionModel("The altering of data so that it is not usable unless the changes are undone is","ergonomics","compression","biometrics","encryption","encryption"));
        arrayList.add(new ContentQuestionModel("When a logic bomb is activated by a time related event, it is known as -------","virus","trojan horse","time related bomb sequence","time bomb","time bomb"));
        arrayList.add(new ContentQuestionModel("A ------- is a computer program that can invade computer and perform a variety of functions ranging from annoying(e.g. popping up messages as a joke) to dangerous (e.g. deleting files or destroying your hard disk).","Ms Word","Computer Virus","Ms Access","Antivirus","Computer Virus"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

      arrayList.add(new ContentQuestionModel("কম্পিউটার হ্যাকার থেকে নিজেকে রক্ষা করতে আপনার"  ," স্ক্রিপ্ট ","ফায়ারওয়াল"," ভিএলসি "," অ্যান্টিভাইরাস ","ফায়ারওয়াল"));
        arrayList.add(new ContentQuestionModel("ফায়ারওয়ালগুলি --------", "ডেটা চালিত আক্রমণ", "আগুন আক্রমণ", "ভাইরাস আক্রমণ", "অননুমোদিত অ্যাক্সেস", "অননুমোদিত অ্যাক্সেস"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সম্ভবত ভাইরাসের লক্ষণ হতে পারে না?", "ওয়েব ব্রাউজারটি একটি অস্বাভাবিক হোম পৃষ্ঠাতে খোলে", "স্ক্রিনে বিজোড় বার্তা বা চিত্র প্রদর্শিত হয়", "বিদ্যমান প্রোগ্রামের ফাইল এবং আইকনগুলি অদৃশ্য হয়ে যায়" , "সিডি – রম কাজ বন্ধ করে দেয়", "সিডি – রম কাজ বন্ধ করে দেয়"));
        arrayList.add(new ContentQuestionModel("কোড লাল হ'ল একটি (এন) ----------", "ওয়ার্ড প্রসেসিং সফটওয়্যার", "অ্যান্টিভাইরাস", "ভাইরাস", "ফটো এডিটিং সফ্টওয়্যার", "ভাইরাস"));
        arrayList.add(new ContentQuestionModel("-------- সফ্টওয়্যার হ'ল এমন প্রোগ্রাম যা আপনার কম্পিউটারে ইনস্টল করা হয় এবং আপনার পরিচিতি পাওয়া ভাইরাসগুলি স্ক্যান করে মুছে ফেলতে পারে যা আপনি চুক্তিবদ্ধ হয়েছেন"  ," ফিরমওয়ারওয়্যার "," অ্যান্টিভাইরাস "," অ্যাডওয়্যার "," কীলগার "," অ্যান্টিভাইরাস "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি এমন প্রোগ্রামের বর্ণনা দেয় যা স্বতন্ত্রভাবে সিস্টেম থেকে সিস্টেমে যাতায়াত করতে পারে এবং কম্পিউটার যোগাযোগ বিঘ্নিত করতে পারে?", "ভাইরাস", "ট্রোজান", "ড্রপার", "কীট", "কীট"));
        arrayList.add(new ContentQuestionModel("এ -------- একটি কম্পিউটার প্রোগ্রাম যা নিজেই প্রতিলিপি তৈরি করতে এবং একটি কম্পিউটার থেকে অন্য কম্পিউটারে ছড়িয়ে দিতে পারে"  ," অ্যান্টিভাইরাস "," পেনড্রাইভ "," মাউস "," কম্পিউটার ভাইরাস "," কম্পিউটার ভাইরাস "));

        arrayList.add(new ContentQuestionModel("এ -------- একটি কম্পিউটার প্রোগ্রাম যা নিজেই প্রতিলিপি তৈরি করতে এবং একটি কম্পিউটার থেকে অন্য কম্পিউটারে ছড়িয়ে দিতে পারে", "অ্যান্টিভাইরাস", "পেনড্রাইভ", "মাউস", "কম্পিউটার ভাইরাস", "কম্পিউটার ভাইরাস"));
        arrayList.add(new ContentQuestionModel("প্রথম কম্পিউটার ভাইরাস হ'ল --------", "আই লাভ ইউ", "ব্লাস্টার", "স্যাসার", "লতা", "লতা"));
        arrayList.add(new ContentQuestionModel("এমসিএফি হ'ল", "অ্যান্টিভাইরাস", "ফটো এডিটিং সফ্টওয়্যার", "কুইক হিল", "ভাইরাস", "অ্যান্টিভাইরাস"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি দূষিত সফ্টওয়্যার হিসাবে পরিচিত?", "অবৈধ সরঞ্জাম", "ব্যাডওয়্যার", "ম্যালওয়্যার", "দূষিতওয়্যার", "ম্যালওয়্যার"));
        arrayList.add(new ContentQuestionModel("কম্পিউটারকে ভাইরাস থেকে রক্ষা করতে, আপনার কম্পিউটারে -------- ইনস্টল করা উচিত"  ," ব্যাকআপ উইজার্ড "," অ্যান্টিভাইরাস "," ডিস্ক ক্লিনআপ "," ডিস্ক ডিফ্র্যাগম্যান্টার "," অ্যান্টিভাইরাস "));
        arrayList.add(new ContentQuestionModel("ভাইরাস হ'ল", "খুব বুদ্ধিমান ফলাফল অবধি উত্স", "খুব ইন্টারচেঞ্জেড রিসোর্স আন্ডার সন্ধান", "গুরুত্বপূর্ণ তথ্য রিসোর্স আন্ডার স্লেজ", "ভাইরাল গুরুত্বপূর্ণ রেকর্ড ব্যবহারকারী অনুসন্ধান করা", "গুরুত্বপূর্ণ তথ্য রিসোর্স আন্ডার স্লেজ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি অ্যান্টিভাইরাস সফটওয়্যার নয়?", "এভিজি", "অ্যাভাস্ট", "কোড রেড", "এমসিএফি", "কোড রেড"));
        arrayList.add(new ContentQuestionModel("দূষিত সফ্টওয়্যারটির জন্য সংক্ষিপ্তটি কী (কম্পিউটার সফটওয়্যার বিঘ্নিত করতে, সংবেদনশীল তথ্য সংগ্রহ করতে, বা কম্পিউটার সিস্টেমে অননুমোদিত অ্যাক্সেস অর্জনের জন্য তৈরি সফ্টওয়্যার)?", "ম্যালওয়্যার", "মলিকিউয়ার", "ম্যালিসফট", "ম্যালাইরাসফট", "ম্যালওয়্যার"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি / ইলেকট্রনিক পেমেন্ট সিস্টেমের জন্য হুমকি?", "কম্পিউটার ওয়ার্মস", "কম্পিউটার ভাইরাস", "ট্রোজান ঘোড়া", "উপরের সমস্ত", "উপরের সমস্ত"));
        arrayList.add(new ContentQuestionModel("কম্পিউটার সিস্টেমে নিম্নলিখিত তথ্যগুলির মধ্যে কোনটি ভাইরাস ছাপিয়ে যায়, যখন তথ্য বুট করে এবং ধ্বংস করে?", "সিস্টেম ইনফেক্টর", "ট্রোজান", "বুট ইনফেক্টর", "স্টিলথ ভাইরাস", "স্টিলথ ভাইরাস"));
        arrayList.add(new ContentQuestionModel("কী লগার হ'ল একটি", "ফার্মওয়্যার", "অ্যান্টিভাইরাস", "স্পাইওয়্যার", "উপরের সমস্ত", "স্পাইওয়্যার"));

        arrayList.add(new ContentQuestionModel("প্রমাণীকরণ হ'ল", "সংশোধন", "সন্নিবেশ", "দূরবর্তী সিস্টেমে ব্যবহারকারীর পরিচয় নিশ্চিত করা কঠিন", "উপরের কোনওটিই নয়", "দূরবর্তী সিস্টেমে ব্যবহারকারীর পরিচয় নিশ্চিত করা কঠিন"));
        arrayList.add(new ContentQuestionModel("-------- হ'ল ব্যক্তিদের দ্বারা তাদের পরিচয় মিথ্যা বলার জন্য আপনার কাছ থেকে গোপনীয় তথ্য গ্রহণের প্রচেষ্টা"  ," কম্পিউটার ভাইরাস "," ফিশিং স্ক্যামস "," ফিশিং ট্রিপস "," স্পাইওয়্যার স্ক্যামস "," ফিশিং স্ক্যামস "));
        arrayList.add(new ContentQuestionModel("একটি ভাইরাস যা অননুমোদিত ইমেল ব্যবহারকারীর বিশাল জনগোষ্ঠীর মধ্যে অবাধে স্থানান্তরিত হয় তাকে একটি -------", "শিখা যুদ্ধ", "কৃমি", "ম্যাক্রো", "চৌর্যবৃত্তি", "ম্যাক্রো"));
        arrayList.add(new ContentQuestionModel("-------- প্রায়শই একটি ইমেল সংযুক্তির মাধ্যমে একটি পিসিতে পৌঁছে দেওয়া হয় এবং প্রায়শই ক্ষতি করতে ডিজাইন করা হয় are", "স্প্যাম", "ইমেল", "পোর্টাল", "ভাইরাস", "ভাইরাস"));
        arrayList.add(new ContentQuestionModel("ডেটা পরিবর্তন করে যাতে পরিবর্তনগুলি পূর্বাবস্থায় না নিলে তা ব্যবহারযোগ্য হয় না", "এরগনমিক্স", "সংক্ষেপণ", "বায়োমেট্রিক্স", "এনক্রিপশন", "এনক্রিপশন"));
        arrayList.add(new ContentQuestionModel("যখন সময় সম্পর্কিত ইভেন্টের দ্বারা লজিক বোমাটি সক্রিয় করা হয়, তখন এটি ------- নামে পরিচিত ", "ভাইরাস", "ট্রোজান ঘোড়া", "সময় সম্পর্কিত বোম সিকোয়েন্স", "টাইম বোমা", "টাইম বোমা"));
        arrayList.add(new ContentQuestionModel("এ ------- একটি কম্পিউটার প্রোগ্রাম যা কম্পিউটার আক্রমণ করে এবং বিরক্তিকর (যেমন রসিকতা হিসাবে ম্যাসেজ পপিং করা) থেকে বিপজ্জনক (যেমন ফাইলগুলি মুছে ফেলা বা আপনার হার্ডডিস্কটি ধ্বংস করা) অবধি বিভিন্ন ফাংশন সম্পাদন করতে পারে", "এমএস ওয়ার্ড", "কম্পিউটার ভাইরাস", "এমএস অ্যাক্সেস", "অ্যান্টিভাইরাস", "কম্পিউটার ভাইরাস"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("ए -------- एक कंप्यूटर प्रोग्राम है जो खुद को दोहरा सकता है और एक कंप्यूटर से दूसरे कंप्यूटर में फैल सकता है।", "एंटिवर्स", "पेनड्राइव", "माउस", "कंप्यूटर वायरस", "कंप्यूटर वायरस" ));
        arrayList.add(new ContentQuestionModel("पहला कंप्यूटर वायरस है --------", "आई लव यू", "ब्लास्टर", "सैसर", "क्रीपर", "क्रीपर"));
        arrayList.add(new ContentQuestionModel("MCAfee", "एंटीवायरस", "एंटीवायरस  का एक उदाहरण है।", "क्विक हील", "वायरस", "एंटीवायरस  का एक उदाहरण है।"));//3
        arrayList.add(new ContentQuestionModel("निम्न में से किसे दुर्भावनापूर्ण सॉफ़्टवेयर के रूप में जाना जाता है?", "गैरकानूनी", "बैडवेयर", "मैलवेयर", "दुर्भावनापूर्ण", "मैलवेयर"));
        arrayList.add(new ContentQuestionModel("कंप्यूटर को वायरस से बचाने के लिए, आपको अपने कंप्यूटर में -------- स्थापित करना चाहिए।", "बैकअप विजार्ड", "एंटीवायरस", "डिस्क क्लीनअप", "डिस्क डीफ़्रैग्मेंट", "एंटीवायरस"));
        arrayList.add(new ContentQuestionModel("VIRUS का अर्थ है", "वेरी इंटेलीजेंट रिजल्ट टु सोर्स", "वेरी इंटरचेंज रिसोर्स अंडर सर्च", "वाइटल इन्फॉर्मेशन रिसोर्स अंडर सैल", "वायरल महत्वपूर्ण रिकॉर्ड यूजर सर्च", "वाइटल इन्फॉर्मेशन रिसोर्स अंडर सैल"));//6
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एंटीवायरस सॉफ़्टवेयर नहीं है?", "AVG", "अवास्ट", "कोड रेड", "MCAfee", "कोड रेड"));
        arrayList.add(new ContentQuestionModel("दुर्भावनापूर्ण सॉफ़्टवेयर के लिए क्या छोटा है (कंप्यूटर ऑपरेशन को बाधित करने के लिए डिज़ाइन किया गया सॉफ़्टवेयर, संवेदनशील जानकारी इकट्ठा करने, या कंप्यूटर सिस्टम पर अनधिकृत पहुँच प्राप्त करने के लिए)?", "मैलवेयर", "मोलेकुलेवर", "मालिसॉफ्ट", "मालवेयरसॉफ्ट", "मैलवेयर"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन इलेक्ट्रॉनिक भुगतान प्रणाली के लिए खतरा है?", "कंप्यूटर कीड़े", "कंप्यूटर वायरस", "ट्रोजन हॉर्स", "उपरोक्त सभी", "उपरोक्त सभी"));//9
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा वायरस कंप्यूटर सिस्टम से आगे निकल जाता है, जब वह बूट करता है और जानकारी को नष्ट कर देता है?", "सिस्टम इन्फक्टर्स", "ट्रोजन", "बूट इन्फक्टर्स", "चुपके वायरस", "चुपके वायरस"));
        arrayList.add(new ContentQuestionModel("कुंजी लकड़हारा", "फर्मवेयर", "एंटीवायरस", "स्पाइवेयर", "उपरोक्त सभी", "स्पाइवेयर"));//11
        arrayList.add(new ContentQuestionModel("अपने आप को कंप्यूटर हैकर से बचाने के लिए, आपको", "स्क्रिप्ट", "फ़ायरवॉल", "वीएलसी", "एंटीवायरस", "फ़ायरवॉल"));
        arrayList.add(new ContentQuestionModel("फायरवॉल का उपयोग --------", "डेटा चालित हमलों", "आग के हमलों", "वायरस के हमलों", "अनधिकृत पहुंच", "अनधिकृत पहुंच"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सबसे अधिक संभावना वायरस का लक्षण नहीं होगा?", "वेब ब्राउज़र एक असामान्य होम पेज पर खुलता है", "अजीब संदेश या चित्र स्क्रीन पर प्रदर्शित होते हैं", "मौजूदा प्रोग्राम फ़ाइलें और आइकन गायब हो जाते हैं" , "CD-ROM कार्य करना बंद कर देता है", "CD-ROM कार्य करना बंद कर देता है"));
        arrayList.add(new ContentQuestionModel("कोड रेड एक (n) ----------", "वर्ड प्रोसेसिंग सॉफ्टवेयर", "एंटीवायरस", "वायरस", "फोटो एडिटिंग सॉफ्टवेयर", "वायरस"  ));
        arrayList.add(new ContentQuestionModel("-------- सॉफ्टवेयर ऐसे प्रोग्राम हैं जो आपके कंप्यूटर पर इंस्टॉल किए जाते हैं और आपके द्वारा अनुबंधित किए गए ज्ञात वायरस को स्कैन और निकाल सकते हैं।", "Firmmware", "एंटीवायरस", "Adware", "Keylogger", "एंटीवायरस"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा प्रोग्राम उन प्रोग्रामों का वर्णन करता है जो स्वतंत्र रूप से सिस्टम से सिस्टम तक यात्रा कर सकते हैं और कंप्यूटर संचार को बाधित कर सकते हैं?", "वायरस", "ट्रोजन", "ड्रॉपर", "कृमि", "कृमि"));
        arrayList.add(new ContentQuestionModel("ए -------- एक कंप्यूटर प्रोग्राम है जो खुद को दोहरा सकता है और एक कंप्यूटर से दूसरे कंप्यूटर में फैल सकता है।", "एंटिवर्स", "पेनड्राइव", "माउस", "कंप्यूटर वायरस", "कंप्यूटर वायरस" ));
        arrayList.add(new ContentQuestionModel("प्रमाणीकरण", "संशोधन", "सम्मिलित करें", "दूरस्थ प्रणाली पर उपयोगकर्ता पहचान की पुष्टि करने के लिए कठिन", "उपरोक्त में से कोई नहीं", "दूरस्थ प्रणाली पर उपयोगकर्ता पहचान की पुष्टि करने के लिए कठिन"));//19
        arrayList.add(new ContentQuestionModel("-------- व्यक्तियों द्वारा आपकी पहचान को ग़लत साबित करने के लिए आपसे गोपनीय जानकारी प्राप्त करने का प्रयास किया जाता है।", "कंप्यूटर वायरस", "फ़िशिंग स्कैम", "फ़िशिंग ट्रिप", "स्पाईवेयर घोटाले", "फ़िशिंग स्कैम" ));
        arrayList.add(new ContentQuestionModel("एक वायरस जो अनधिकृत ईमेल उपयोगकर्ता की एक बड़ी आबादी के भीतर स्वतंत्र रूप से प्रवास करता है, उसे एक -------", "लौ युद्ध", "वर्म", "मैक्रो", "साहित्यिक चोरी", "मैक्रो"));
        arrayList.add(new ContentQuestionModel("-------- अक्सर एक ईमेल अटैचमेंट के माध्यम से एक पीसी पर पहुंचाए जाते हैं और अक्सर नुकसान करने के लिए डिज़ाइन किए जाते हैं।", "स्पैम", "ईमेल", "पोर्टल", "वायरस", "वायरस"));
        arrayList.add(new ContentQuestionModel("डेटा में फेरबदल करना ताकि यह प्रयोग करने योग्य न हो जब तक कि परिवर्तन पूर्ववत न हों", "एर्गोनॉमिक्स", "संपीड़न", "बायोमेट्रिक्स", "एन्क्रिप्शन", "एन्क्रिप्शन"));
        arrayList.add(new ContentQuestionModel("जब एक लॉजिक बम को समय से संबंधित घटना द्वारा सक्रिय किया जाता है, तो इसे -------", "वायरस", "ट्रोजन हॉर्स", "टाइम रिलेटेड बम सीक्वेंस", "टाइम बम", "टाइम बम"));
        arrayList.add(new ContentQuestionModel("ए ------- एक कंप्यूटर प्रोग्राम है जो कंप्यूटर पर आक्रमण कर सकता है और विभिन्न प्रकार के कार्य कर सकता है जो कष्टप्रद (जैसे संदेशों को मजाक के रूप में पॉप अप करना) से लेकर खतरनाक (जैसे फाइलों को हटाना या आपकी हार्ड डिस्क को नष्ट करना) तक करता है।" , "सुश्री शब्द", "कंप्यूटर वायरस", "सुश्री प्रवेश", "एंटीवायरस", "कंप्यूटर वायरस"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("اے ایک کمپیوٹر پروگرام ہے جو خود کو نقل بنا سکتا ہے اور ایک کمپیوٹر سے دوسرے کمپیوٹر تک پھیل سکتا ہے۔" , "اینٹیورز" , "پین ڈرائیو" , "ماؤس" , "کمپیوٹر وائرس","کمپیوٹر وائرس"));
        arrayList.add(new ContentQuestionModel("پہلا کمپیوٹر وائرس ہے --------" , "میں آپ سے محبت کرتا ہوں" , "بلاسٹر", "ساسر" , "کریپر","کریپر"));
        arrayList.add(new ContentQuestionModel("ایم سی اےفی" , "اینٹی وائرس" , "فوٹو ایڈٹنگ سافٹ ویئر" , "کوئیک شفا" ,   " کی ایک مثال ہے  ","اینٹی وائرس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون کو خالی سافٹ ویئر کے نام سے جانا جاتا ہے؟" , "غیر قانونی سامان" , "بیڈ ویئر" , "مالویئر" , "بدنیتی پر مبنی سافٹ ویئر","مالویئر"));
        arrayList.add(new ContentQuestionModel("کمپیوٹر کو وائرس سے بچانے کے ل، ، آپ کو اپنے کمپیوٹر میں -------- انسٹال کرنا چاہئے۔" , "بیک اپ وزرڈ" , "اینٹی وائرس" , "ڈسک کلین اپ" , "ڈسک ڈیفراگ مینٹر","اینٹی وائرس"));
        arrayList.add(new ContentQuestionModel("VIRUS کا مطلب ہے" ,"بہت انٹلیجنٹ نتیجہ تک منبع", "اہم انفو انفارمیشن ریسورس سائلج" , "وائٹل انفارمیشن ریسورس انڈر سلج" , "وائرل اہم ریکارڈ صارف کی تلاش","اہم انفو انفارمیشن ریسورس سائلج"));//6
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا اینٹی وائرس سافٹ ویئر نہیں ہے؟" , "اے وی جی" , "آواسٹ" , "کوڈ ریڈ" , "ایم سی اےفی","کوڈ ریڈ"));
        arrayList.add(new ContentQuestionModel("بدنیتی پر مبنی سافٹ ویئر کے لئے کیا چھوٹا ہے (ایسا سافٹ ویئر ہے جو کمپیوٹر آپریشن کو خلل ڈالنے ، حساس معلومات اکٹھا کرنے یا کمپیوٹر سسٹم تک غیر مجاز رسائی حاصل کرنے کے لئے ڈیزائن کیا گیا ہے)؟" ," ", "مالویئر" , "مالیکیولور" , "ملیراسوفٹ" , "ملیراسوفٹ" ));//8
        arrayList.add(new ContentQuestionModel("الیکٹرانک ادائیگی کے نظام کے ل following مندرجہ ذیل میں سے کونسا خطرہ ہے / ہیں؟" , "اوپر کا سارا" , "کمپیوٹر وائرس" , "ٹروجن ہارس" , "مذکورہ بالا سب","اوپر کا سارا"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا وائرس کمپیوٹر سسٹم کو آگے بڑھاتا ہے ، جب وہ معلومات کو بوٹ کرتا ہے اور اسے ختم کر دیتا ہے؟" , "سسٹم انفیکٹرز" , "ٹروجن" ,"بوٹ انفیکٹرز", "اسٹیلتھ وائرس","اسٹیلتھ وائرس"));
        arrayList.add(new ContentQuestionModel("کلیدی لاگر ایک ہے" , "فرم ویئر" , "اینٹی وائرس" , "اسپائی ویئر" , "اوپر والے سب","اسپائی ویئر"));//11
        arrayList.add(new ContentQuestionModel("کمپیوٹر ہیکر سے اپنے آپ کو بچانے کے ل you ، آپ کو" , "اسکرپٹ" , "فائر وال" , "وی ایل سی" , "اینٹی وائرس"  ,"فائر وال"));
        arrayList.add(new ContentQuestionModel("فائر وال --------" , "ڈیٹا سے چلنے والے حملوں" , "فائر حملوں" , "وائرس کے حملوں", "غیر مجاز رسائی"   ,"غیر مجاز رسائی"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ممکنہ طور پر وائرس کی علامت نہیں ہوگا؟" , "ویب براؤزر غیر معمولی ہوم پیج پر کھلتا ہے" , "اسکرین پر عجیب پیغام یا تصاویر آویزاں کردی جاتی ہیں" , "موجودہ پروگرام فائلیں اور شبیہیں غائب ہوجاتی ہیں"  , "سی ڈی – روم کام کرنا چھوڑ دیتا ہے","سی ڈی – روم کام کرنا چھوڑ دیتا ہے"));
        arrayList.add(new ContentQuestionModel("کوڈ ریڈ ایک (ن) ----------" , "ورڈ پروسیسنگ سوفٹ ویئر" , "اینٹی وائرس", "وائرس" , "فوٹو ایڈٹنگ سافٹ ویئر"  ,"وائرس"));
        arrayList.add(new ContentQuestionModel("کوڈ ریڈ ایک (ن) ----------" , "ورڈ پروسیسنگ سوفٹ ویئر", "اینٹی وائرس" , "وائرس" , "فوٹو ایڈٹنگ سافٹ ویئر"  ,"وائرس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون کون سے ایسے پروگرام کی وضاحت کرتا ہے جو نظام سے نظام تک آزادانہ طور پر چل سکتے ہیں اور کمپیوٹر مواصلات میں خلل ڈال سکتے ہیں؟" , "وائرس" , "ٹروجن" ,"کیڑا" , "کرم","کیڑا"));//17
        arrayList.add(new ContentQuestionModel("اے ایک کمپیوٹر پروگرام ہے جو خود کو نقل کرتا ہے اور ایک کمپیوٹر سے دوسرے کمپیوٹر تک پھیل سکتا ہے" , "اینٹیورز" , "پین ڈرائیو" , "ماؤس" , "کمپیوٹر وائرس","کمپیوٹر وائرس"));
        arrayList.add(new ContentQuestionModel("توثیق" , "ترمیم" , "اضافے" , "ریموٹ سسٹم پر صارف کی شناخت کی یقین دہانی کرنا مشکل ہے" , "مذکورہ بالا کوئی بھی نہیں","مذکورہ بالا کوئی بھی نہیں"));//19
        arrayList.add(new ContentQuestionModel("-------- افراد کی جانب سے آپ کی شناخت غلط ثابت کرنے" , "کمپیوٹر وائرس" , "فشنگ گھوٹالوں" , "فشنگ گھوٹالے" , "اسپائی ویئر گھوٹالے" ,"فشنگ گھوٹالے"));//20
        arrayList.add(new ContentQuestionModel("ایک ایسا وائرس جو غیر مجاز ای میل صارف کی ایک بڑی آبادی میں آزادانہ طور پر نقل مکانی کرتا ہے اسے -------" , "شعلہ جنگ" , "وسیع" , "میکرو" , "ادبي سرقہ"   ,"وسیع"));//21
        arrayList.add(new ContentQuestionModel("-------- اکثر کسی ای میل منسلکہ کے ذریعے کسی کمپیوٹر کو پہنچائے جاتے ہیں اور اکثر نقصان پہنچانے کے لئے تیار کیے جاتے ہیں۔" , "سپیم" , "ای میل" , "پورٹلز" , "وائرس","وائرس"));
        arrayList.add(new ContentQuestionModel("اعداد و شمار میں ردوبدل تاکہ وہ اس وقت تک قابل استعمال نہ ہوں جب تک کہ تبدیلیاں کالعدم نہ کی جائیں" , "ایرگونکس"  , "کمپریشن" , "بایومیٹرکس" , "خفیہ کاری","خفیہ کاری"));
        arrayList.add(new ContentQuestionModel("جب منطقی بم کو وقت سے متعلق واقعہ کے ذریعہ چالو کیا جاتا ہے ، تو اسے -------" , "وائرس" , "ٹروجن ہارس" , "وقت سے متعلق بم ترتیب", "ٹائم بم" ,"ٹائم بم"));
        arrayList.add(new ContentQuestionModel("اے ------- ایک کمپیوٹر پروگرام ہے جو کمپیوٹر پر حملہ کرسکتا ہے اور طرح طرح کے افعال انجام دے سکتا ہے (جیسے میسجز کو مذاق بنانا) سے لے کر خطرناک (جیسے فائلیں حذف کرنا یا آپ کی ہارڈ ڈسک کو تباہ کرنا)۔" , "محترمہ ورڈ" , "کمپیوٹر وائرس" , "محترمہ رسائی" , "اینٹی وائرس","کمپیوٹر وائرس"));



        return arrayList;


    }


}