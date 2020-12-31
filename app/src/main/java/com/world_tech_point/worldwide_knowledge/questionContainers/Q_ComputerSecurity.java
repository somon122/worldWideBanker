package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_ComputerSecurity {


    private Context context;
    public Q_ComputerSecurity(Context context) {
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

        arrayList.add(new ThreeItemModel("What is the name of the Act that governs internet usage in India?", "The Information Technology Act, 2004"));
        arrayList.add(new ThreeItemModel("All of the following are examples of real security and privacy risks EXCEPT", "Spam"));
        arrayList.add(new ThreeItemModel("A worm is...", "Pieces of malicious code that make copies of themselves and spread through computers without human interaction"));
        arrayList.add(new ThreeItemModel("You just got a new computer which has antivirus software already installed. Is it safe to use on the internet immediately, yes/NO?", "No"));
        arrayList.add(new ThreeItemModel("If you receive an email claiming to need your username and/or password, what should you do?", "Report it as phishing/spam through your email provider 0„2"));
        arrayList.add(new ThreeItemModel("Both email attachments and downloaded files can spread malware - true/false?", "TRUE"));
        arrayList.add(new ThreeItemModel("What is the best way to protect your information when you are away from your computer?", "Lock the computer with a password"));
        arrayList.add(new ThreeItemModel("What is a firewall?", "A filter for an internet connection that monitors outgoing and incoming activity"));
        arrayList.add(new ThreeItemModel("A strong password should contain", "At least 8 characters, and a combination of letters, numbers, and characters"));
        arrayList.add(new ThreeItemModel("Social engineering is", "Scams distributed through email such as phishing, pharming and impersonation"));
        arrayList.add(new ThreeItemModel("What is ¡°Trend Micro¡±?", "It is anti-virus software"));
        arrayList.add(new ThreeItemModel("What is the name of the viruses that fool a user into downloading and/or executing them by pretending to be useful applications?", "Trojan horses"));
        arrayList.add(new ThreeItemModel("The virus that spread in application software is called as", "Macro virus"));
        arrayList.add(new ThreeItemModel("How does a Le-Hard virus come into existence?", "Command.Com"));
        arrayList.add(new ThreeItemModel("What is the virus that spread in computer?", "It is a computer program"));


        arrayList.add(new ThreeItemModel("What is a computer network?", "Computer Network is A web of connected computers or devices"));
        arrayList.add(new ThreeItemModel("Why are cyber vulnerabilities unlikely to ever go away?", "They are side effects of the freedom and ease"));
        arrayList.add(new ThreeItemModel("The size and complexity of networks grew enormously when:", "The number of personal computers greatly increased"));
        arrayList.add(new ThreeItemModel("The first computer virus is -------- ?", "Creeper"));
        arrayList.add(new ThreeItemModel("To protect a computer from virus, you should install -------- in your computer ?", "antivirus"));
        arrayList.add(new ThreeItemModel("Which of the following is known as Malicious software?", "malware"));
        String str = "Antivirus";
        arrayList.add(new ThreeItemModel("MCAfee is an example of ?", str));
        String str2 = "Computer Virus";
        arrayList.add(new ThreeItemModel("A ------- is a computer program that can invade computer and perform a variety of functions ranging from annoying(e.g. popping up messages as a joke) to dangerous (e.g. deleting files)", str2));
        arrayList.add(new ThreeItemModel("When a logic bomb is activated by a time related event, it is known as -------", "time bomb"));
        String str3 = "Virus";
        arrayList.add(new ThreeItemModel("-------- are often delivered to a PC through an email attachment and are often designed to do harm", str3));
        arrayList.add(new ThreeItemModel("The altering of data so that it is not usable unless the changes are undone is", "encryption"));
        arrayList.add(new ThreeItemModel("VIRUS stands for", "Vital Information Resource Under Slege"));
        arrayList.add(new ThreeItemModel("What is short for malicious software (is software designed to disrupt computer operation, gather sensitive information, or gain unauthorized access to computer systems)?", "Malware"));
        arrayList.add(new ThreeItemModel("Which of the following is not an antivirus software?", "Code Red"));
        arrayList.add(new ThreeItemModel("Which of the following is/are threats for electronic payment systems?", "All of the above"));
        arrayList.add(new ThreeItemModel("A virus that migrates freely within a large population of unauthorized email user is called a -------", "macro"));
        arrayList.add(new ThreeItemModel("-------- are attempts by individuals to obtain confidential information from you to falsifying their identity", "Phishing scams"));
        arrayList.add(new ThreeItemModel("uthentication is", "hard to assure identity of user on a remote system"));
        arrayList.add(new ThreeItemModel("A -------- is a computer program that can replicate itself and spread from one computer to another", str2));
        String str4 = "Stealth virus";
        arrayList.add(new ThreeItemModel("Which of the following virus overtake computer system, when it boots and destroy information?", str4));
        arrayList.add(new ThreeItemModel("Key logger is a", "Spyware"));
        arrayList.add(new ThreeItemModel("To protect yourself from computer hacker, you should turn on a", "Firewall"));
        arrayList.add(new ThreeItemModel("Firewalls are used to protect against --------", "unauthorised access"));
        arrayList.add(new ThreeItemModel("Which of the following describes programs that can run independently travel from system to system and disrupt computer communication?", "Worm"));
        arrayList.add(new ThreeItemModel("-------- software are programs that are installed onto your computer and can scan and remove known viruses which you may have contracted.", str));
        arrayList.add(new ThreeItemModel("Code red is a(n) ----------", str3));
        arrayList.add(new ThreeItemModel("Which of the following would most likely not be a symptom of a virus?", "The CD¨CROM stops functioning"));
        String str5 = "Zombie";
        arrayList.add(new ThreeItemModel("............ are used in denial of service attacks, typically against targeted web sites", str5));
        arrayList.add(new ThreeItemModel("Select the correct order for the different phases of virus execution. \n\ni) Propagation phase \nii) Dormant phase \niii) Execution phase \niv) Triggering phase\n", "ii, i, iv and iii"));
        arrayList.add(new ThreeItemModel("A ............ attaches itself to executable files and replicates, when the infected program is executed, by finding other executable files to infect", "Parasitic Virus"));
        arrayList.add(new ThreeItemModel("......... is a form of virus explicitly designed to hide itself from detection by antivirus software", str4));
        arrayList.add(new ThreeItemModel("A .......... creates copies during replication that are functionally equivalent but have distinctly different bit patterns", "Polymorphic Virus"));
        arrayList.add(new ThreeItemModel("A portion of the Polymorphic virus, generally called a , creates, a random encryption, key to encrypt the remainder of the virus", "mutation engine"));
        arrayList.add(new ThreeItemModel("State whether the following statement is true. \n\ni) A macro virus is platform independent. \nii) Macro viruses infect documents, not executable portions of code\n", "Both i and ii"));
        arrayList.add(new ThreeItemModel("In ........, the virus places an identical copy of itself into other programs or into certain system areas on the disk", "Propagation phase"));
        arrayList.add(new ThreeItemModel("A ....... is a program that secretly takes over another Internet-attached computer and then uses that computer to launch attacks", str5));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("কম্পিউটার নেটওয়ার্ক কী?", "কম্পিউটার নেটওয়ার্ক হ'ল সংযুক্ত কম্পিউটার বা ডিভাইসগুলির একটি ওয়েব"));
        arrayList.add(new ThreeItemModel("কেন সাইবার দুর্বলতাগুলি দূরে যাওয়ার সম্ভাবনা নেই?", "এগুলি স্বাধীনতা এবং স্বাচ্ছন্দ্যের পার্শ্ব প্রতিক্রিয়া"));
        arrayList.add(new ThreeItemModel("নেটওয়ার্কগুলির আকার এবং জটিলতা প্রবলভাবে বৃদ্ধি পেয়েছিল যখন:", "ব্যক্তিগত কম্পিউটারের সংখ্যা ব্যাপকভাবে বৃদ্ধি পেয়েছে"));
        arrayList.add(new ThreeItemModel("প্রথম কম্পিউটার ভাইরাসটি হ'ল --------?", "লতা"));
        arrayList.add(new ThreeItemModel("কম্পিউটারকে ভাইরাস থেকে রক্ষা করতে, আপনার কম্পিউটারে -------- ইনস্টল করা উচিত?", "অ্যান্টিভাইরাস"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি দূষিত সফ্টওয়্যার হিসাবে পরিচিত?", "ম্যালওয়্যার"));
        String str ="অ্যান্টিভাইরাস" ;
        arrayList.add(new ThreeItemModel("এমসিএফি এর উদাহরণ?", str));
        String str2 = "কম্পিউটার ভাইরাস";
        arrayList.add(new ThreeItemModel("এ ------- এমন একটি কম্পিউটার প্রোগ্রাম যা কম্পিউটার আক্রমণ করে এবং বিরক্তিকর (উদাঃ একটি রসিকতা হিসাবে বার্তা পপ করতে) থেকে বিপজ্জনক (উদাঃ ফাইলগুলি মোছা) অবধি বিভিন্ন ফাংশন সম্পাদন করতে পারে", str2));
        arrayList.add(new ThreeItemModel("যখন সময় সম্পর্কিত ইভেন্ট দ্বারা লজিক বোমাটি সক্রিয় করা হয়, তখন এটি -------", "টাইম বোম নামে পরিচিত"));
        String str3 = "ভাইরাস";
        arrayList.add(new ThreeItemModel("-------- প্রায়শই একটি ইমেল সংযুক্তির মাধ্যমে একটি পিসিতে সরবরাহ করা হয় এবং প্রায়শই ক্ষতি করার জন্য ডিজাইন করা হয়", str3));
        arrayList.add(new ThreeItemModel("ডেটা পরিবর্তন করে যাতে পরিবর্তনগুলি পূর্বাবস্থায়িত না করা না হলে এটি ব্যবহারযোগ্য না", "এনক্রিপশন"));
        arrayList.add(new ThreeItemModel("VIRUS এর অর্থ দাঁড়ায়", "গুরুত্বপূর্ণ তথ্য রিসোর্স আন্ডার স্লেজ"));
        arrayList.add(new ThreeItemModel("দূষিত সফ্টওয়্যারটির জন্য সংক্ষিপ্তটি কী (কম্পিউটার সফটওয়্যার বিঘ্নিত করতে, সংবেদনশীল তথ্য সংগ্রহ করতে, বা কম্পিউটার সিস্টেমে অননুমোদিত অ্যাক্সেস পাওয়ার জন্য তৈরি সফ্টওয়্যার)?", "ম্যালওয়্যার"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি অ্যান্টিভাইরাস সফটওয়্যার নয়?", "কোড রেড"));
        arrayList.add(new ThreeItemModel("বৈদ্যুতিন অর্থ প্রদানের ব্যবস্থার জন্য নিম্নলিখিতগুলির মধ্যে কোনটি হুমকী?", "উপরের সমস্ত"));
        arrayList.add(new ThreeItemModel("একটি ভাইরাস যা অননুমোদিত ইমেল ব্যবহারকারীর বিশাল জনগোষ্ঠীর মধ্যে অবাধে স্থানান্তরিত হয় তাকে -------", "ম্যাক্রো বলা হয়"));
        arrayList.add(new ThreeItemModel("-------- হ'ল ব্যক্তিরা তাদের পরিচয় মিথ্যা বলার জন্য আপনার কাছ থেকে গোপনীয় তথ্য গ্রহণের প্রচেষ্টা", "ফিশিং স্ক্যামগুলি"));
        arrayList.add(new ThreeItemModel("উচ্চারণ হল", "দূরবর্তী সিস্টেমে ব্যবহারকারীর পরিচয় নিশ্চিত করা শক্ত"));
        arrayList.add(new ThreeItemModel("এ -------- একটি কম্পিউটার প্রোগ্রাম যা নিজেই প্রতিলিপি তৈরি করতে এবং একটি কম্পিউটার থেকে অন্য কম্পিউটারে ছড়িয়ে দিতে পারে", str2));
        String str4 = "স্টিলথ ভাইরাস";
        arrayList.add(new ThreeItemModel("কম্পিউটারের সিস্টেমে নিম্নলিখিতটি কোন ভাইরাস ছাপিয়ে যায়, যখন এটি বুট হয়ে তথ্য নষ্ট করে?", str4));
        arrayList.add(new ThreeItemModel("কী লগার একটি", "স্পাইওয়্যার"));
        arrayList.add(new ThreeItemModel("কম্পিউটার হ্যাকার থেকে নিজেকে রক্ষা করার জন্য আপনার"," ফায়ারওয়াল চালু করা উচিত"));
        arrayList.add(new ThreeItemModel("ফায়ারওয়ালগুলি --------", "অননুমোদিত অ্যাক্সেস রক্ষা করতে ব্যবহৃত হয়"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি এমন প্রোগ্রামের বর্ণনা দেয় যা স্বতন্ত্রভাবে সিস্টেম থেকে সিস্টেমে যাতায়াত করতে এবং কম্পিউটার যোগাযোগ বিঘ্নিত করতে পারে?", "কীট"));
        arrayList.add(new ThreeItemModel("-------- সফ্টওয়্যার হ'ল এমন প্রোগ্রাম যা আপনার কম্পিউটারে ইনস্টল করা হয় এবং আপনার পরিচিতিযুক্ত ভাইরাসগুলি স্ক্যান করে মুছে ফেলতে পারে যা আপনি চুক্তিবদ্ধ হয়েছেন", str));
        arrayList.add(new ThreeItemModel("কোড লাল একটি (এন) ----------", str3));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি সম্ভবত ভাইরাসের লক্ষণ হতে পারে না?", "সিডিক্রোম কাজ বন্ধ করে দেয়"));
        String str5 ="বোকচন্দর";
        arrayList.add(new ThreeItemModel("............ পরিষেবা আক্রমণের অস্বীকৃতিতে ব্যবহৃত হয়, সাধারণত লক্ষ্যযুক্ত ওয়েব সাইটের বিরুদ্ধে", str5));
        arrayList.add(new ThreeItemModel("ভাইরাস প্রয়োগের বিভিন্ন ধাপের জন্য সঠিক ক্রমটি নির্বাচন করুন i","ii i  iv এবং iii" ));
        arrayList.add(new ThreeItemModel("এ ............ সম্পাদিত ফাইলগুলিতে নিজেকে সংযুক্ত করে এবং সংক্রামিত প্রোগ্রাম কার্যকর করা হলে সংক্রমণের জন্য অন্যান্য এক্সিকিউটেবল ফাইলগুলি সন্ধান করে", "পরজীবী ভাইরাস"));
        arrayList.add(new ThreeItemModel("......... এন্টিভাইরাস সফ্টওয়্যার দ্বারা সনাক্তকরণ থেকে নিজেকে গোপন করার জন্য স্পষ্টভাবে ডিজাইন করা ভাইরাসের একটি রূপ", str4));
        arrayList.add(new ThreeItemModel("এ .......... প্রতিলিপিটির সময় অনুলিপি তৈরি করে যা কার্যত সমতুল্য তবে আলাদা বিট ধরণের রয়েছে", "পলিমারফিক ভাইরাস"));
        arrayList.add(new ThreeItemModel("পলিমর্ফিক ভাইরাসের একটি অংশ, সাধারণত একটি বলা হয়, তৈরি করে, একটি এলোমেলো এনক্রিপশন, ভাইরাসের অবশিষ্টাংশ এনক্রিপ্ট করার কী", "মিউটেশন ইঞ্জিন"));
        arrayList.add(new ThreeItemModel("নীচের বিবৃতিটি সত্য কিনা তা উল্লেখ করুন। Ii) ম্যাক্রো ভাইরাস প্ল্যাটফর্মটি স্বতন্ত্র i ii) ম্যাক্রো ভাইরাস নথিগুলিকে সংক্রামিত করে, কোডের এক্সিকিউটেবল অংশ নয়", "আমি এবং ii উভয়ই"));
        arrayList.add(new ThreeItemModel("........ সালে, ভাইরাসটি নিজের প্রোগ্রামের একটি অনুলিপি অন্য প্রোগ্রামগুলিতে বা ডিস্কের নির্দিষ্ট সিস্টেম অঞ্চলে রাখে", "প্রচারের ধাপ"));
        arrayList.add(new ThreeItemModel("এ ....... হ'ল এমন একটি প্রোগ্রাম যা গোপনে অন্য একটি ইন্টারনেট-সংযুক্ত কম্পিউটারের দখল নেয় এবং তারপরে আক্রমণ চালানোর জন্য সেই কম্পিউটারটি ব্যবহার করে", str5));
        arrayList.add(new ThreeItemModel("ভারতে ইন্টারনেট ব্যবহার নিয়ন্ত্রণ করে এমন আইনটির নাম কী?", "তথ্য প্রযুক্তি আইন, 2004"));
        arrayList.add(new ThreeItemModel("নীচের সমস্তগুলি প্রকৃত সুরক্ষা এবং গোপনীয়তার ঝুঁকির উদাহরণ ছাড়াই", "স্প্যাম"));
        arrayList.add(new ThreeItemModel("একটি কৃমি হ'ল ...", "দূষিত কোডের টুকরা যা নিজের অনুলিপি তৈরি করে এবং মানুষের সাথে মিথস্ক্রিয়া ছাড়াই কম্পিউটারের মাধ্যমে ছড়িয়ে যায়"));
        arrayList.add(new ThreeItemModel("আপনি সবেমাত্র একটি নতুন কম্পিউটার পেয়েছেন যার মধ্যে অ্যান্টিভাইরাস সফটওয়্যার ইতিমধ্যে ইনস্টল রয়েছে immediately ইন্টারনেটে অবিলম্বে ব্যবহার করা নিরাপদ, হ্যাঁ / না?", "না"));
        arrayList.add(new ThreeItemModel("আপনি যদি আপনার ব্যবহারকারী নাম এবং / অথবা পাসওয়ার্ডের দাবি করে একটি ইমেল পান তবে আপনার কী করা উচিত?", "এটি আপনার ইমেল সরবরাহকারীর মাধ্যমে 0„ 2 এর মাধ্যমে ফিশিং / স্প্যাম হিসাবে রিপোর্ট করুন "));
        arrayList.add(new ThreeItemModel("ইমেল সংযুক্তি এবং ডাউনলোড করা ফাইল উভয়ই ম্যালওয়ার ছড়িয়ে দিতে পারে - সত্য / মিথ্যা?", "সত্য"));
        arrayList.add(new ThreeItemModel("আপনি যখন কম্পিউটার থেকে দূরে থাকবেন তখন আপনার তথ্য সুরক্ষার সর্বোত্তম উপায় কোনটি?", "একটি পাসওয়ার্ড দিয়ে কম্পিউটার লক করুন"));
        arrayList.add(new ThreeItemModel("ফায়ারওয়াল কী?", "ইন্টারনেট সংযোগের জন্য একটি ফিল্টার যা বহির্মুখী এবং আগত ক্রিয়াকলাপ পর্যবেক্ষণ করে"));
        arrayList.add(new ThreeItemModel("একটি শক্তিশালী পাসওয়ার্ডে", "কমপক্ষে 8 টি অক্ষর এবং অক্ষর, সংখ্যা এবং অক্ষরের সমন্বয় থাকা উচিত"));
        arrayList.add(new ThreeItemModel("সোশ্যাল ইঞ্জিনিয়ারিং হ'ল", "ফিশিং, ফর্মিং এবং নকলকরণের মতো ইমেলের মাধ্যমে বিতরণ করা স্ক্যামগুলি"));
        arrayList.add(new ThreeItemModel("¡° ট্রেন্ড মাইক্রো ¡কী?", "এটি অ্যান্টি-ভাইরাস সফটওয়্যার"));
        arrayList.add(new ThreeItemModel("ভাইরাসগুলির নাম কী যা কোনও ব্যবহারকারীকে দরকারী অ্যাপ্লিকেশন হওয়ার ভান করে ডাউনলোড এবং / বা কার্যকর করার ক্ষেত্রে বোকা বানায়?", "ট্রোজান ঘোড়া"));
        arrayList.add(new ThreeItemModel("অ্যাপ্লিকেশন সফ্টওয়্যারটিতে যে ভাইরাস ছড়িয়ে পড়ে তাকে", "ম্যাক্রো ভাইরাস হিসাবে ডাকা হয়"));
        arrayList.add(new ThreeItemModel("কীভাবে একটি লে-হার্ড ভাইরাস অস্তিত্বশীল হয়?", "কমান্ড.কম"));
        arrayList.add(new ThreeItemModel("কম্পিউটারে ছড়িয়ে পড়া ভাইরাস কী?", "এটি একটি কম্পিউটার প্রোগ্রাম"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("कंप्यूटर नेटवर्क क्या है?", "कंप्यूटर नेटवर्क कनेक्टेड कंप्यूटर या उपकरणों का एक वेब है"));
        arrayList.add(new ThreeItemModel("साइबर भेद्यताएं कभी दूर होने की संभावना क्यों नहीं है?", "वे स्वतंत्रता और सहजता के दुष्प्रभाव हैं"));
        arrayList.add(new ThreeItemModel("नेटवर्क का आकार और जटिलता बहुत बढ़ गई जब:", "व्यक्तिगत कंप्यूटरों की संख्या बहुत बढ़ गई"));
        arrayList.add(new ThreeItemModel("पहला कंप्यूटर वायरस है --------?", "क्रीपर"));
        arrayList.add(new ThreeItemModel("कंप्यूटर को वायरस से बचाने के लिए, आपको अपने कंप्यूटर में -------- स्थापित करना चाहिए?", "एंटीवायरस"));
        arrayList.add(new ThreeItemModel("निम्न में से किसे दुर्भावनापूर्ण सॉफ़्टवेयर के रूप में जाना जाता है?", "मैलवेयर"));
        String str = "एंटीवायरस";
        arrayList.add(new ThreeItemModel("MCAfee इसका एक उदाहरण है?", str));
        String str2 ="कंप्यूटर वायरस" ;
        arrayList.add(new ThreeItemModel("ए ------- एक कंप्यूटर प्रोग्राम है जो कंप्यूटर पर आक्रमण कर सकता है और विभिन्न प्रकार के कार्य कर सकता है (जैसे कि संदेशों को एक मजाक के रूप में पॉप करना) खतरनाक (जैसे फ़ाइलों को हटाना)", str2));
        arrayList.add(new ThreeItemModel("जब एक तर्क बम को समय से संबंधित घटना द्वारा सक्रिय किया जाता है, तो इसे -------", "टाइम बम के रूप में जाना जाता है"));
        String str3 = "Virus";
        arrayList.add(new ThreeItemModel("-------- अक्सर एक ईमेल अटैचमेंट के माध्यम से एक पीसी पर दिया जाता है और अक्सर नुकसान पहुंचाने के लिए डिज़ाइन किया जाता है", str3));
        arrayList.add(new ThreeItemModel("डेटा का परिवर्तन ताकि यह प्रयोग करने योग्य न हो जब तक कि परिवर्तन पूर्ववत न हों", "एन्क्रिप्शन"));
        arrayList.add(new ThreeItemModel("VIRUS का मतलब है", "महत्वपूर्ण सूचना संसाधन"));
        arrayList.add(new ThreeItemModel("दुर्भावनापूर्ण सॉफ़्टवेयर के लिए क्या छोटा है (कंप्यूटर ऑपरेशन को बाधित करने के लिए डिज़ाइन किया गया सॉफ़्टवेयर, संवेदनशील जानकारी इकट्ठा करने या कंप्यूटर सिस्टम पर अनधिकृत पहुंच प्राप्त करने के लिए बनाया गया है)?", "मैलवेयर"));
        arrayList.add(new ThreeItemModel("निम्न में से कौन एंटीवायरस सॉफ़्टवेयर नहीं है?", "कोड रेड"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन इलेक्ट्रॉनिक भुगतान प्रणालियों के लिए खतरा है?", "उपरोक्त सभी"));
        arrayList.add(new ThreeItemModel("अनधिकृत ईमेल उपयोगकर्ता की एक बड़ी आबादी के भीतर स्वतंत्र रूप से प्रवास करने वाले वायरस को एक -------", "मैक्रो कहा जाता है।"));
        arrayList.add(new ThreeItemModel("-------- व्यक्तियों द्वारा अपनी पहचान को ग़लत साबित करने के लिए आपसे गोपनीय जानकारी प्राप्त करने का प्रयास किया जाता है", "फ़िशिंग स्कैम"));
        arrayList.add(new ThreeItemModel("िमोट सिस्टम पर उपयोगकर्ता की पहचान को आश्वस्त करने के लिए "," है "));
        arrayList.add(new ThreeItemModel("ए -------- एक कंप्यूटर प्रोग्राम है जो खुद को दोहरा सकता है और एक कंप्यूटर से दूसरे कंप्यूटर में फैल सकता है", str2));
        String str4 = "चुपके वायरस";
        arrayList.add(new ThreeItemModel("निम्न में से कौन सा वायरस कंप्यूटर सिस्टम से आगे निकल जाता है, जब वह बूट करता है और सूचना को नष्ट कर देता है?", str4));
        arrayList.add(new ThreeItemModel("कुंजी लकड़हारा एक", "स्पाइवेयर" ));
        arrayList.add(new ThreeItemModel("अपने आप को कंप्यूटर हैकर से बचाने के लिए, आपको", "फ़ायरवॉल चालू करना चाहिए"));
        arrayList.add(new ThreeItemModel("फ़ायरवॉल का उपयोग रक्षा के लिए किया जाता है --------", "अनधिकृत पहुंच"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा प्रोग्राम उन प्रोग्रामों का वर्णन करता है जो स्वतंत्र रूप से सिस्टम से सिस्टम तक यात्रा कर सकते हैं और कंप्यूटर संचार को बाधित कर सकते हैं?", "कृमि"));
        arrayList.add(new ThreeItemModel("-------- सॉफ्टवेयर ऐसे प्रोग्राम हैं जो आपके कंप्यूटर पर इंस्टॉल किए जाते हैं और ज्ञात वायरस को स्कैन और हटा सकते हैं जिन्हें आपने अनुबंधित किया हो सकता है।", str));
        arrayList.add(new ThreeItemModel("कोड रेड एक (n) ----------", str3));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सबसे अधिक वायरस का लक्षण नहीं होगा?", "CDROMCROM कार्य करना बंद कर देता है"));
        String str5 ="ज़ोंबी" ;
        arrayList.add(new ThreeItemModel("............ का उपयोग सेवा हमलों से इनकार करने के लिए किया जाता है, आमतौर पर लक्षित वेब साइटों के खिलाफ", str5));
        arrayList.add(new ThreeItemModel("वायरस के निष्पादन के विभिन्न चरणों के लिए सही क्रम का चयन करें।  ) प्रचार चरण  )) निष्क्रिय चरण  ii) निष्पादन चरण  ) ट्रिगर चरण  ", "ii, i, iv और iii"));
        arrayList.add(new ThreeItemModel("............ खुद को निष्पादन योग्य फ़ाइलों से जोड़ता है और प्रतिकृति करता है, जब संक्रमित प्रोग्राम निष्पादित होता है, तो अन्य निष्पादन योग्य फ़ाइलों को संक्रमित करने के लिए", "परजीवी वायरस"));
        arrayList.add(new ThreeItemModel("......... वायरस का एक रूप है जिसे स्पष्ट रूप से एंटीवायरस सॉफ़्टवेयर द्वारा पहचान से छिपाने के लिए डिज़ाइन किया गया है", str4));
        arrayList.add(new ThreeItemModel(".......... प्रतिकृति के दौरान प्रतियाँ बनाता है जो कार्यात्मक रूप से समतुल्य होती हैं लेकिन विशिष्ट रूप से भिन्न बिट प्रतिरूप हैं", "पॉलीमॉर्फ वायरस"));
        arrayList.add(new ThreeItemModel("पॉलीमॉर्फिक वायरस का एक हिस्सा, जिसे आम तौर पर ए, क्रिएट, एक यादृच्छिक एन्क्रिप्शन, वायरस के शेष को एन्क्रिप्ट करने की कुंजी", "म्यूटेशन इंजन कहा जाता है।"));
        arrayList.add(new ThreeItemModel("यह बताएं कि क्या निम्नलिखित कथन सत्य है। i) एक मैक्रो वायरस प्लेटफ़ॉर्म स्वतंत्र है। ii) मैक्रो वायरस दस्तावेज़ों को संक्रमित करता है, कोड के निष्पादन योग्य भागों को नहीं", "मैं और ii दोनों"));
        arrayList.add(new ThreeItemModel("........ में, वायरस अन्य कार्यक्रमों में या डिस्क पर कुछ सिस्टम क्षेत्रों में खुद की एक समान कॉपी रखता है", "प्रस्ताव चरण 3"));
        arrayList.add(new ThreeItemModel("एक ....... एक प्रोग्राम है जो गुप्त रूप से एक अन्य इंटरनेट-संलग्न कंप्यूटर पर ले जाता है और फिर हमलों को लॉन्च करने के लिए उस कंप्यूटर का उपयोग करता है", str5));
        arrayList.add(new ThreeItemModel("भारत में इंटरनेट उपयोग को नियंत्रित करने वाले अधिनियम का नाम क्या है?", "सूचना प्रौद्योगिकी अधिनियम, 2004"));
        arrayList.add(new ThreeItemModel("निम्नलिखित सभी वास्तविक सुरक्षा और गोपनीयता जोखिम के उदाहरण हैं", "स्पैम"));
        arrayList.add(new ThreeItemModel("एक कीड़ा है ...", "दुर्भावनापूर्ण कोड के टुकड़े जो स्वयं की प्रतियां बनाते हैं और मानव बातचीत के बिना कंप्यूटर के माध्यम से फैलते हैं"));
        arrayList.add(new ThreeItemModel("आपको बस एक नया कंप्यूटर मिला है जिसमें एंटीवायरस सॉफ़्टवेयर पहले से इंस्टॉल है। क्या इंटरनेट पर तुरंत उपयोग करना सुरक्षित है, हाँ / नहीं?", "नहीं"));
        arrayList.add(new ThreeItemModel("यदि आपको अपने उपयोगकर्ता नाम और / या पासवर्ड की आवश्यकता का दावा करने वाला एक ईमेल प्राप्त होता है, तो आपको क्या करना चाहिए?", "इसे अपने ईमेल प्रदाता 0 2 के माध्यम से फ़िशिंग / स्पैम के रूप में रिपोर्ट करें "));
        arrayList.add(new ThreeItemModel("दोनों ईमेल अटैचमेंट और डाउनलोड की गई फाइलें मैलवेयर फैला सकती हैं - सच / गलत?", "सही"));
        arrayList.add(new ThreeItemModel("जब आप अपने कंप्यूटर से दूर होते हैं तो आपकी जानकारी की सुरक्षा करने का सबसे अच्छा तरीका क्या है?", "कंप्यूटर को पासवर्ड से लॉक करें"));
        arrayList.add(new ThreeItemModel("फ़ायरवॉल क्या है?", "एक इंटरनेट कनेक्शन के लिए एक फ़िल्टर जो आउटगोइंग और इनकमिंग गतिविधि पर नज़र रखता है"));
        arrayList.add(new ThreeItemModel("एक मजबूत पासवर्ड में होना चाहिए", "कम से कम 8 वर्ण, और अक्षरों, संख्याओं और वर्णों का एक संयोजन"));
        arrayList.add(new ThreeItemModel("सोशल इंजीनियरिंग है", "फिशिंग, फ़ार्मिंग और प्रतिरूपण जैसे ईमेल के माध्यम से वितरित किए गए घोटाले"));
        arrayList.add(new ThreeItemModel("What ° ट्रेंड माइक्रो¡ क्या है? "," यह एंटी-वायरस सॉफ़्टवेयर है "));
        arrayList.add(new ThreeItemModel("उन वायरस का क्या नाम है जो किसी उपयोगकर्ता को डाउनलोड करने और / या उन्हें उपयोगी अनुप्रयोगों का बहाना बनाकर बेवकूफ बनाते हैं?", "ट्रोजन हॉर्स"));
        arrayList.add(new ThreeItemModel("एप्लिकेशन सॉफ़्टवेयर में फैलने वाले वायरस को", "मैक्रो वायरस कहा जाता है"));
        arrayList.add(new ThreeItemModel("एक ले-हार्ड वायरस कैसे अस्तित्व में आता है?", "Command.Com"));
        arrayList.add(new ThreeItemModel("कंप्यूटर में फैला वायरस क्या है?", "यह एक कंप्यूटर प्रोग्राम है"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("کمپیوٹر نیٹ ورک کیا ہے؟" , "کمپیوٹر نیٹ ورک منسلک کمپیوٹرز یا آلات کا ایک ویب ہے"));
        arrayList.add(new ThreeItemModel("سائبر خطرات کا ہمیشہ سے دور ہونے کا امکان کیوں نہیں ہے؟" , "یہ آزادی اور آسانی کے مضر اثرات ہیں" ));
        arrayList.add(new ThreeItemModel("نیٹ ورک کی جسامت اور پیچیدگی میں اس وقت بہت اضافہ ہوا جب:", "پرسنل کمپیوٹرز کی تعداد میں بہت اضافہ ہوا"));
        arrayList.add(new ThreeItemModel("پہلا کمپیوٹر وائرس ہے --------؟" , "کریپر"));
        arrayList.add(new ThreeItemModel("کسی کمپیوٹر کو وائرس سے بچانے کے ل you ، آپ کو اپنے کمپیوٹر میں -------- نصب کرنا چاہئے؟" , "اینٹی وائرس"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون کو خالی سافٹ ویئر کے نام سے جانا جاتا ہے؟" , "مالویئر"));
        String str = "اینٹی وائرس";
        arrayList.add(new ThreeItemModel("ایم سی اےفی ایک مثال ہے؟", str));
        String str2 ="کمپیوٹر وائرس";
        arrayList.add(new ThreeItemModel("اے ------- ایک کمپیوٹر پروگرام ہے جو کمپیوٹر پر حملہ کرسکتا ہے اور پریشان کن (جیسے مذاق کے بطور پیغامات اٹھانا) سے لے کر خطرناک (جیسے فائلوں کو حذف کرنا) تک مختلف کام انجام دیتا ہے۔", str2));
        arrayList.add(new ThreeItemModel("جب منطقی بم کو وقت سے متعلق واقعہ کے ذریعہ چالو کیا جاتا ہے ، تو اسے -------" ,  " کے نام سے جانا جاتا ہے"));
        String str3 = "وائرس";
        arrayList.add(new ThreeItemModel("-------- اکثر پی سی کو ای میل منسلکہ کے ذریعہ پہنچایا جاتا ہے اور اکثر نقصان پہنچانے کے لئے ڈیزائن کیا گیا ہے۔", str3));
        arrayList.add(new ThreeItemModel("اعداد و شمار میں ردوبدل تاکہ وہ اس وقت تک قابل استعمال نہ ہوں جب تک کہ تبدیلیوں کو کالعدم نہ کیا جائے",  "خفیہ کاری"));
        arrayList.add(new ThreeItemModel("VIRUS کا مطلب ہے",  "اہم انفارمیشن ریسورس انڈر سلیج"));
        arrayList.add(new ThreeItemModel("بدنیتی پر مبنی سافٹ وئیر کے لئے کیا کم ہے (کیا ایسا سافٹ ویئر تیار کیا گیا ہے جو کمپیوٹر آپریشن کو رکاوٹ بنائے ، حساس معلومات اکٹھا کرے ، یا کمپیوٹر سسٹم تک غیر مجاز رسائی حاصل کرے)؟", "مالویئر"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا اینٹی وائرس سافٹ ویئر نہیں ہے؟"  , "کوڈ ریڈ"));
        arrayList.add(new ThreeItemModel("الیکٹرانک ادائیگی کے نظام کے لئے مندرجہ ذیل میں سے کون کون سے خطرہ ہیں؟",  "مذکورہ بالا سب"));
        arrayList.add(new ThreeItemModel("ایک وائرس جو غیر مجاز ای میل صارف کی بڑی آبادی میں آزادانہ طور پر ہجرت کرتا ہے اسے -------"  , "میکرو"  ));
        arrayList.add(new ThreeItemModel("-------- افراد کی اپنی شناخت کو غلط ثابت کرنے کے لئے آپ سے خفیہ معلومات حاصل کرنے کی کوششیں ہیں"  , "فشنگ گھوٹالے"));
        arrayList.add(new ThreeItemModel("قول ہے" , "ریموٹ نظام میں صارف کی شناخت کی یقین دہانی کرنا مشکل ہے"));
        arrayList.add(new ThreeItemModel("اے -------- ایک ایسا کمپیوٹر پروگرام ہے جو خود کو نقل بنا سکتا ہے اور ایک کمپیوٹر سے دوسرے کمپیوٹر میں پھیل سکتا ہے۔", str2));
        String str4 ="اسٹیلتھ وائرس" ;
        arrayList.add(new ThreeItemModel("کمپیوٹر سسٹم کو مندرجہ ذیل میں سے کون سا آگے بڑھتا ہے ، جب وہ معلومات کو بوٹ کرتا اور تباہ کر دیتا ہے؟", str4));
        arrayList.add(new ThreeItemModel("کلیدی لاگر ایک ہے" , "سپائی ویئر"));
        arrayList.add(new ThreeItemModel("کمپیوٹر ہیکر سے اپنے آپ کو بچانے کے ل you ، آپ کو" , "فائر وال" ));
        arrayList.add(new ThreeItemModel("فائر وال -------- کے خلاف حفاظت کے لئے استعمال ہوتے ہیں۔", "غیر مجاز رسائی"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا ایسے پروگرام کی وضاحت کرتا ہے جو نظام سے سسٹم تک آزادانہ طور پر چل سکتے ہیں اور کمپیوٹر مواصلات میں خلل ڈال سکتے ہیں؟" , "کرم"));
        arrayList.add(new ThreeItemModel("-------- سافٹ ویئر وہ پروگرام ہوتے ہیں جو آپ کے کمپیوٹر پر انسٹال ہوتے ہیں اور معلوم وائرس کو اسکین اور ختم کرسکتے ہیں جن سے آپ نے معاہدہ کیا ہو۔", str));
        arrayList.add(new ThreeItemModel("کوڈ ریڈ ایک (ن) ----------" , str3));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا زیادہ تر وائرس کی علامت نہیں ہوگا؟" , "سی ڈی کروم کام کرنا چھوڑ دیتا ہے"));
        String str5 = "زومبی";
        arrayList.add(new ThreeItemModel("............ سروس حملوں کے انکار میں استعمال ہوتے ہیں ، عام طور پر ھدف شدہ ویب سائٹس کے خلاف۔", str5));
        arrayList.add(new ThreeItemModel("وائرس کے نفاذ کے مختلف مراحل کے لئے صحیح ترتیب کا انتخاب کریں۔ i) تبلیغ کا مرحلہ ii) غیر فعال مرحلہ iii) عمل درآمد مرحلہ iv) ٹرگرنگ مرحلہ" , "ii ، i ، iv اور iii"));
        arrayList.add(new ThreeItemModel("ای متاثر ہونے والی فائلوں اور نقلوں کو خود سے منسلک کرتا ہے ، جب متاثرہ پروگرام پر عمل درآمد ہوتا ہے تو ، انفیکشن کے ل other دیگر قابل عمل فائلوں کو ڈھونڈ کر" , "پرجیوی وائرس"));
        arrayList.add(new ThreeItemModel("وائرس کی ایک قسم ہے جس کو واضح طور پر اینٹی وائرس سافٹ ویئر کے ذریعے خود سے پتہ لگانے سے چھپانے کے لئے ڈیزائن کیا گیا ہے۔", str4));
        arrayList.add(new ThreeItemModel("اے نقل کے دوران ایسی کاپیاں تیار کرتا ہے جو عملی طور پر مساوی ہوں لیکن اس میں واضح طور پر مختلف بٹ پیٹرن ہوں" , "پولیورفک وائرس"));
        arrayList.add(new ThreeItemModel("پولیمورفک وائرس کا ایک حصہ ، جسے عام طور پر a ، تخلیق ، ایک بے ترتیب خفیہ کاری کہا جاتا ہے ، جو وائرس کے باقی حصے کو خفیہ کرنے کی کلید ہے" , "اتپریورتن انجن"));
        arrayList.add(new ThreeItemModel("یہ بتائیں کہ آیا مندرجہ ذیل بیان درست ہے۔ i) میکرو وائرس پلیٹ فارم سے آزاد ہے۔ ii) میکرو وائرس دستاویزات کو متاثر کرتا ہے ، کوڈ کے قابل عمل حصوں کو نہیں" , "میں اور ii دونوں"));
        arrayList.add(new ThreeItemModel("........ میں ، وائرس اپنی ایک جیسی کاپی دوسرے پروگراموں میں یا ڈسک کے کچھ مخصوص علاقوں میں رکھتا ہے" , "تبلیغ کا مرحلہ"));
        arrayList.add(new ThreeItemModel("اے ....... ایک ایسا پروگرام ہے جو خفیہ طور پر کسی اور انٹرنیٹ سے منسلک کمپیوٹر پر قبضہ کرتا ہے اور پھر اس کمپیوٹر کو حملے شروع کرنے کے لئے استعمال کرتا ہے۔", str5));
        arrayList.add(new ThreeItemModel("What is the name of the Act that governs internet usage in India?", "The Information Technology Act, 2004"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے سبھی اصلی سلامتی اور رازداری کے خطرات کی مثال ہیں" , "سپیم"));
        arrayList.add(new ThreeItemModel("ایک کیڑا ہے ..." , "بدنصیبی کوڈ کے ٹکڑے جو خود کی کاپیاں بناتے ہیں اور بغیر کسی بات چیت کے کمپیوٹر کے ذریعے پھیل جاتے ہیں۔"));
        arrayList.add(new ThreeItemModel("آپ کے پاس ابھی ایک نیا کمپیوٹر ملا ہے جس میں اینٹی وائرس سافٹ ویئر پہلے ہی نصب ہے۔ کیا انٹرنیٹ پر فوری طور پر استعمال کرنا محفوظ ہے ، ہاں / نہیں؟" , "نہیں"));
        arrayList.add(new ThreeItemModel("اگر آپ کو اپنے صارف نام اور / یا پاس ورڈ کی ضرورت کا دعوی کرنے والا کوئی ای میل موصول ہوتا ہے تو آپ کو کیا کرنا چاہئے؟" , "اپنے ای میل فراہم کنندہ 0„ 2 کے ذریعہ اس کو فشنگ / اسپام کی حیثیت سے رپورٹ کریں۔ "));
        arrayList.add(new ThreeItemModel("ای میل منسلکات اور ڈاؤن لوڈ فائلیں دونوں ہی میلویئر پھیل سکتے ہیں۔ / سچ / جھوٹا؟" , "سچ"));
        arrayList.add(new ThreeItemModel("جب آپ اپنے کمپیوٹر سے دور ہوں تو اپنی معلومات کو محفوظ رکھنے کا سب سے بہتر طریقہ کیا ہے؟" , "پاس ورڈ سے کمپیوٹر لاک کریں"));
        arrayList.add(new ThreeItemModel("فائر وال کیا ہے؟" ,"انٹرنیٹ کنیکشن کا فلٹر جو باہر جانے والی اور آنے والی سرگرمی پر نظر رکھتا ہے" ));
        arrayList.add(new ThreeItemModel("ایک مضبوط پاس ورڈ میں" , "کم از کم 8 حروف ، اور حروف ، اعداد ، اور حروف کا مجموعہ ہونا چاہئے"));
        arrayList.add(new ThreeItemModel("سوشل انجینئرنگ ہے" , "اسکیمیں ای میل کے ذریعے تقسیم کی گئیں جیسے فشنگ ، فرامنگ اور نقالی"));
        arrayList.add(new ThreeItemModel("¡° Trend Micro¡ What کیا ہے؟" , "یہ اینٹی وائرس سافٹ ویئر ہے"));
        arrayList.add(new ThreeItemModel("ان وائرسوں کا کیا نام ہے جو صارف کو مفید ایپلی کیشنز کا بہانہ بنا کر ڈاؤن لوڈ اور / یا ان پر عمل درآمد کرنے سے بے وقوف بناتے ہیں؟" , "ٹروجن ہارس"));
        arrayList.add(new ThreeItemModel("ایپلی کیشن سوفٹ ویئر میں پھیلنے والا وائرس اس کے نام سے موسوم ہے", "میکرو وائرس"));
        arrayList.add(new ThreeItemModel("لی ہارڈ وائرس کیسے وجود میں آتا ہے؟" , "کمانڈ ڈاٹ کام"));
        arrayList.add(new ThreeItemModel("کمپیوٹر میں کون سا وائرس پھیل گیا ہے؟" , "یہ ایک کمپیوٹر پروگرام ہے۔"));


        return arrayList;
    }


}
