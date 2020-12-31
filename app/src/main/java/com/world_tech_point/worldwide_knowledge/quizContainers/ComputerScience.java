package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class ComputerScience {

    private Context context;

    public ComputerScience(Context context) {
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
         arrayList.add(new ContentQuestionModel("1 GB is equal to","230 bits ","230 bytes","220 bits","220 bytes","230 bytes"));
        arrayList.add(new ContentQuestionModel("A microprocessor unit, a memory unit, and an input/output unit form a:","CPU","compiler","microcomputer","ALU","microcomputer"));
        arrayList.add(new ContentQuestionModel("Process to exit from computer by giving correct instructions such as 'EXIT' is classified as","log in","process out","process in","log out","log out"));
        arrayList.add(new ContentQuestionModel("Function of running and loading programs by use of peripherals is function of","operating system","inquiry system","dump programs","function system","operating system"));
        arrayList.add(new ContentQuestionModel("An assembler is","Programming language-dependent.","Syntax dependant.","Machine dependant.","Data dependant.","Machine dependant."));
        arrayList.add(new ContentQuestionModel("Which amongst the following is not an advantage of Distributed systems?","Reliability","Incremental growth","Resource sharing","None of the above","Reliability"));
        arrayList.add(new ContentQuestionModel("The term ‘page traffic’ describes","Number of pages in memory at a given instant.","Number of papers required to be brought in at a given page request.","The movement of pages in and out of memory.","Number of pages of executing programs loaded in memory.","The movement of pages in and out of memory."));
        arrayList.add(new ContentQuestionModel("Assembler is","A program that places programs into memory an prepares them for execution","Is a program that appears to execute a source program as if it were machine language","A program that automates the translation of assembly language into machine language","A program that accepts a program written in high-level language and produces an object program","A program that automates the translation of assembly language into machine language"));
        arrayList.add(new ContentQuestionModel("An interpreter is","A program that places programs into memory an prepares them for execution","A program that appears to execute a source program as if it were machine language","A program that automates the translation of assembly language into machine language","A program that accepts a program written in high-level language and produces an object program","A program that appears to execute a source program as if it were machine language"));
        arrayList.add(new ContentQuestionModel("How many buses are connected as part of the 8085 microprocessor?","2","3","5","8","3"));
        arrayList.add(new ContentQuestionModel("How many bits are used in the data bus?","7","8","9","16","16"));
        arrayList.add(new ContentQuestionModel("What would you do to highlight a word? You position the cursor next to the word, and then","Drag mouse while holding button down","Click mouse once","Roll and then click mouse","None of these","Drag mouse while holding button down"));
        arrayList.add(new ContentQuestionModel("Reusable optical storage will typically have the acronym ………..","CD","DVD","ROM","RW","RW"));
        arrayList.add(new ContentQuestionModel("..……………. is processed by the computer into information.","Data","Numbers","Alphabets","Pictures","Data"));
        arrayList.add(new ContentQuestionModel("One kilobyte is equal to:","1000 bytes","100 bytes","1024 bytes","1023 bytes","1024 bytes"));
        arrayList.add(new ContentQuestionModel("Which supercomputer is developed by the Indian Scientists?","Param","Super 301","Compaq Presario","CRAY YMP","Param"));
        arrayList.add(new ContentQuestionModel("Which is the part of the computer system that one can physically touch?","data","operating systems","hardware","software","hardware"));
        arrayList.add(new ContentQuestionModel("A ………. is an electronic device that process data, converting it into information.","computer","processor","case","stylus","computer"));
        arrayList.add(new ContentQuestionModel("IC chips used in computers are usually made of:","Lead","Silicon","Chromium","Gold","Silicon"));

        arrayList.add(new ContentQuestionModel("The most common type of storage devices are ………….","persistent","optical","magnetic","flash","magnetic"));
        arrayList.add(new ContentQuestionModel("The ………… tells the computer how to use its components.","utility","network","operating system","motherboard","operating system"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not a linear data structure?","Array","Binary Tree","Queue","Stack","Binary Tree"));
        arrayList.add(new ContentQuestionModel("Where does a computer add and compare its data?","CPU","Memory","Hard disk","Floppy disk","CPU"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not an Internet Service Provider (ISP)?","MTNL","BSNL","ERNET India","Infotech India Ltd.","Infotech India Ltd."));
        arrayList.add(new ContentQuestionModel("The binary equivalent of (–15)10 is (2’s complement system is used)","11110001","11110000","10001111","None of these","11110001"));
        arrayList.add(new ContentQuestionModel("The set of computer programs that manage the hardware/software of a computer is called","Compiler system","Operation system","Operating system","None of these","Operating system"));
        arrayList.add(new ContentQuestionModel("Program which is readily available for computer users as a part of software package is classified as","library program","program library","software library","directory library","library program"));
        arrayList.add(new ContentQuestionModel("Set of software authorized to a specific user is considered as","software library","program library","directory library","library package","program library"));
        arrayList.add(new ContentQuestionModel("If program can cope data errors, such program can be termed as","robust","reliable","unreliable","stable functioning","robust"));
        arrayList.add(new ContentQuestionModel("Which of the following is not a fundamental process state","Ready","Terminated","Executing","Blocked","Blocked"));
        arrayList.add(new ContentQuestionModel("Which of the following is true?","Block cipher technique is an encryption technique.","Steam cipher technique is an encryption technique.","Both (A) and (B).","Neither of (A) and (B).","Both (A) and (B)."));
        arrayList.add(new ContentQuestionModel("Which of the following loader is executed when a system is first turned on or restarted","Bootloader","Compile and Go loader","Bootstrap loader","Relating loader","Bootstrap loader"));

        arrayList.add(new ContentQuestionModel("Which of the following is not an example of an Operating System?","Windows 98","BSD Unix","Microsoft Office XP","Red Hat Linux","Microsoft Office XP"));
        arrayList.add(new ContentQuestionModel("One Gigabyte is approximately equal is:","1000,000 bytes","1000,000,000 bytes","1000,000,000,000 bytes","None of these","1000,000,000 bytes"));
        arrayList.add(new ContentQuestionModel("Compact discs, (according to the original CD specifications) hold how many minutes of music?","74 mins","90 mins","56 mins","60 mins","74 mins"));
        arrayList.add(new ContentQuestionModel("Which of the following is not an input device?","Mouse","Light pen","Keyboard","VDU","VDU"));
        arrayList.add(new ContentQuestionModel("What type of process creates a smaller file that is faster to transfer over the internet?","Compression","Fragmentation","Encapsulation","None of the above","Compression"));
        arrayList.add(new ContentQuestionModel("Operating System","Operating System","Compiler","DBMS","None of the above","DBMS"));
        arrayList.add(new ContentQuestionModel("Which of the following is an example of non-volatile memory?","Cache memory","RAM","ROM","None of the above","ROM"));
        arrayList.add(new ContentQuestionModel("File extensions are used in order to ……….","Name the file","Ensure the filename is not lost","Identify the file","Identify the file type","Identify the file type"));
        arrayList.add(new ContentQuestionModel("here are …………. parts to a computer system.","2","4","16","100","4"));
        arrayList.add(new ContentQuestionModel("During the ………… portion of the Information Processing Cycle, the computer acquires data from some source.","processing","storage","input","output","input"));
        arrayList.add(new ContentQuestionModel("bit stands for","binary information term","binary digit","binary tree","Bivariate Theory","binary digit"));
        arrayList.add(new ContentQuestionModel("Which one of the following is different from other members?","Google","Mac","Linux","Windows","Google"));
        arrayList.add(new ContentQuestionModel("The hexadecimal number system consists of the symbols","0 – 7","0 – 9 , A – F","0 – 7, A – F ","None of these","0 – 9 , A – F"));


        arrayList.add(new ContentQuestionModel("In binary code, the number 7 is written as -","110","111","101","100","111"));
        arrayList.add(new ContentQuestionModel("In which generation of computers, transistors were used?","First","Second","Third","Fourth","Second"));
        arrayList.add(new ContentQuestionModel("ALU' stands for?","Arithmetic Long Unit","All Longer Units","Around Logical Units","Arithmetic and Logical Units","Arithmetic and Logical Units"));
        arrayList.add(new ContentQuestionModel("The term 'Pentium' is related to -","DVD","Hard Disk","Microprocessor","Mouse","Microprocessor"));
        arrayList.add(new ContentQuestionModel("Which of the following is the most powerful type of computer?","Super-micro","Super Computer","Micro Computer","Mini Computer","Super Computer"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

       arrayList.add(new ContentQuestionModel("1 জিবি সমান", "230 বিট", "230 বাইট", "220 বিট", "220 বাইট", "230 বাইট"));
        arrayList.add(new ContentQuestionModel("একটি মাইক্রোপ্রসেসর ইউনিট, একটি মেমোরি ইউনিট এবং একটি ইনপুট / আউটপুট ইউনিট একটি গঠন করে:", "সিপিইউ", "সংকলক", "মাইক্রোকম্পিউটার", "এএলইউ", "মাইক্রোকম্পিউটার"));
        arrayList.add(new ContentQuestionModel("কম্পিউটার থেকে বেরিয়ে যাওয়ার প্রক্রিয়া যেমন 'এক্সআইটি' হিসাবে", "লগ ইন", "প্রসেস আউট", "প্রসেস ইন", "লগ আউট", "লগ আউট"));
        arrayList.add(new ContentQuestionModel("পেরিফেরিয়াল ব্যবহার করে চলমান এবং লোডিং প্রোগ্রামগুলির কার্যকারিতা হ'ল", "অপারেটিং সিস্টেম", "তদন্ত সিস্টেম", "ডাম্প প্রোগ্রাম", "ফাংশন সিস্টেম", "অপারেটিং সিস্টেম"));
        arrayList.add(new ContentQuestionModel("একটি সমাবেশকারী হ'ল", "প্রোগ্রামিং ভাষা নির্ভর।" , "সিনট্যাক্স নির্ভর।", "মেশিন নির্ভর dependent", "ডেটা নির্ভর।", "মেশিন নির্ভর dependent"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি বিতরণ ব্যবস্থার সুবিধা নয়?", "নির্ভরযোগ্যতা", "বর্ধমান বৃদ্ধি", "সংস্থান ভাগ করে নেওয়া", "উপরোক্তগুলির মধ্যে কোনওটি নয়", "নির্ভরযোগ্যতা"));
        arrayList.add(new ContentQuestionModel("পৃষ্ঠা ট্র্যাফিক শব্দটি বর্ণনা করে "," প্রদত্ত তাত্ক্ষণিকতায় মেমরির পৃষ্ঠাগুলির সংখ্যা। "," প্রদত্ত পৃষ্ঠার অনুরোধে প্রয়োজনীয় কাগজপত্র আনতে হবে ", "মেমরির ভিতরে এবং বাইরে পৃষ্ঠাগুলির গতিবিধি"," মেমরিতে লোড হওয়া সম্পাদনকারী প্রোগ্রামগুলির পৃষ্ঠাগুলির সংখ্যা ", "মেমরির ভিতরে এবং বাইরে পৃষ্ঠাগুলির গতিবিধি"));//23
        arrayList.add(new ContentQuestionModel("এসেমব্লার হ'ল", "এমন একটি প্রোগ্রাম যা প্রোগ্রামগুলিকে মেমোরিতে রাখে একটি তাদের মৃত্যুদন্ড কার্যকর করার জন্য প্রস্তুত করে", "এমন একটি প্রোগ্রাম যা কোনও উত্স প্রোগ্রাম কার্যকর করার মতো মনে হয় যেন এটি মেশিন ল্যাঙ্গুয়েজ", "এমন একটি প্রোগ্রাম যা সমাবেশ ভাষার ভাষা মেশিন ভাষায় অনুবাদ স্বয়ংক্রিয় করে তোলে"," এমন একটি প্রোগ্রাম যা উচ্চ-স্তরের ভাষায় রচিত একটি প্রোগ্রাম গ্রহণ করে এবং একটি অবজেক্ট প্রোগ্রাম তৈরি করে ","এমন একটি প্রোগ্রাম যা সমাবেশ ভাষার ভাষা মেশিন ভাষায় অনুবাদ স্বয়ংক্রিয় করে তোলে" ));
        arrayList.add(new ContentQuestionModel("এসেমব্লার হ'ল", "এমন একটি প্রোগ্রাম যা প্রোগ্রামগুলিকে মেমোরিতে রাখে একটি তাদের মৃত্যুদন্ড কার্যকর করার জন্য প্রস্তুত করে", "এমন একটি প্রোগ্রাম যা কোনও উত্স প্রোগ্রাম কার্যকর করার মতো মনে হয় যেন এটি মেশিন ল্যাঙ্গুয়েজ", "এমন একটি প্রোগ্রাম যা সমাবেশ ভাষার ভাষা মেশিন ভাষায় অনুবাদ স্বয়ংক্রিয় করে তোলে"," এমন একটি প্রোগ্রাম যা উচ্চ-স্তরের ভাষায় রচিত একটি প্রোগ্রাম গ্রহণ করে এবং একটি অবজেক্ট প্রোগ্রাম তৈরি করে ","এমন একটি প্রোগ্রাম যা সমাবেশ ভাষার ভাষা মেশিন ভাষায় অনুবাদ স্বয়ংক্রিয় করে তোলে" ));
        arrayList.add(new ContentQuestionModel("8085 মাইক্রোপ্রসেসরের অংশ হিসাবে কতগুলি বাস সংযুক্ত রয়েছে?", "2", "3", "5", "8", "3"));
        arrayList.add(new ContentQuestionModel("ডেটা বাসে কয়টি বিট ব্যবহৃত হয়?", "7", "8", "9", "16", "16"));
        arrayList.add(new ContentQuestionModel("আপনি কোন শব্দটি হাইলাইট করার জন্য কী করবেন? আপনি শব্দের পাশে কার্সারটি অবস্থান করুন এবং তারপরে", " বোতামটি ধরে রাখার সময় মাউসটি টানুন ", "একবার মাউস ক্লিক করুন", "রোল এবং তারপরে মাউস ক্লিক করুন", "এর কোনওটিই নয় "," বোতামটি ধরে রাখার সময় মাউসটি টানুন "));//28
        arrayList.add(new ContentQuestionModel("পুনরায় ব্যবহারযোগ্য অপটিক্যাল স্টোরেজটিতে সংক্ষিপ্ত আকার থাকবে ……… ..", "সিডি", "ডিভিডি", "রম", "আরডাব্লু", "আরডাব্লু"));
        arrayList.add(new ContentQuestionModel(".. ……………। কম্পিউটার দ্বারা তথ্যতে প্রক্রিয়াজাত করা হয়।", "ডেটা", "নম্বর", "বর্ণমালা", "ছবি", "ডেটা"));

        arrayList.add(new ContentQuestionModel("কম্পিউটারের এমন কোন অংশ যা শারীরিকভাবে কেউ স্পর্শ করতে পারে?", "ডেটা", "অপারেটিং সিস্টেম", "হার্ডওয়্যার", "সফ্টওয়্যার", "হার্ডওয়্যার"   ));
        arrayList.add(new ContentQuestionModel("এ ………। একটি বৈদ্যুতিন ডিভাইস যা ডেটা প্রক্রিয়াকরণ করে, তথ্যগুলিকে রূপান্তর করে"  ," কম্পিউটার "," প্রসেসর "," কেস "," স্টাইলাস "," কম্পিউটার "));
        arrayList.add(new ContentQuestionModel("কম্পিউটারে ব্যবহৃত আইসি চিপগুলি সাধারণত:", "লিড", "সিলিকন", "ক্রোমিয়াম", "সোনার", "সিলিকন"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি অপারেটিং সিস্টেমের উদাহরণ নয়?", "উইন্ডোজ 98", "বিএসডি ইউনিক্স", "মাইক্রোসফ্ট অফিস এক্সপি", "রেড হ্যাট লিনাক্স", "মাইক্রোসফ্ট অফিস এক্সপি"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত ধরণের কম্পিউটারটি সবচেয়ে শক্তিশালী ধরণের কম্পিউটার?", "সুপার মাইক্রো", "সুপার কম্পিউটার", "মাইক্রো কম্পিউটার", "মিনি কম্পিউটার", "সুপার কম্পিউটার"));
        arrayList.add(new ContentQuestionModel("সর্বাধিক সাধারণ ধরণের স্টোরেজ ডিভাইস হ'ল …………।", "ধ্রুবক", "অপটিক্যাল", "চৌম্বক", "ফ্ল্যাশ", "চৌম্বক"));//38
        arrayList.add(new ContentQuestionModel("………… কম্পিউটারকে তার উপাদানগুলি কীভাবে ব্যবহার করতে হয় তা বলে" ," ইউটিলিটি "," নেটওয়ার্ক "," অপারেটিং সিস্টেম "," মাদারবোর্ড "," অপারেটিং সিস্টেম "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি লিনিয়ার ডেটা কাঠামো নয়?", "অ্যারে", "বাইনারি ট্রি", "সারি", "স্ট্যাক", "বাইনারি ট্রি"));
        arrayList.add(new ContentQuestionModel("একটি কম্পিউটার কোথায় তার ডেটা যুক্ত এবং তুলনা করে?", "সিপিইউ", "মেমরি", "হার্ড ডিস্ক", "ফ্লপি ডিস্ক", "সিপিইউ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি ইন্টারনেট পরিষেবা সরবরাহকারী নয় (আইএসপি)?", "এমটিএনএল", "বিএসএনএল", "ইআরএনইটি ইন্ডিয়া", "ইনফোটেক ইন্ডিয়া লিমিটেড।", "ইনফোটেক ইন্ডিয়া লিমিটেড।"));
        arrayList.add(new ContentQuestionModel("(–15) ​​10 এর বাইনারি সমতুল্য (2 টির পরিপূরক সিস্টেম ব্যবহৃত হয়)", "11110001", "11110000", "10001111", "এর কোনওটি নয়", "11110001"));
        arrayList.add(new ContentQuestionModel("কম্পিউটারের হার্ডওয়্যার / সফ্টওয়্যার পরিচালনা করে এমন কম্পিউটার প্রোগ্রামগুলির সেটটিকে --  বলা হয় ", "সংকলক সিস্টেম", "অপারেশন সিস্টেম", "অপারেটিং সিস্টেম", "এর কিছুই নয়", "অপারেটিং সিস্টেম"));
        arrayList.add(new ContentQuestionModel("সফ্টওয়্যার প্যাকেজের অংশ হিসাবে কম্পিউটার ব্যবহারকারীদের জন্য সহজলভ্য যে প্রোগ্রামটি  -- হিসাবে শ্রেণিবদ্ধ করা হয়েছে", "গ্রন্থাগার প্রোগ্রাম", "প্রোগ্রাম গ্রন্থাগার", "সফ্টওয়্যার লাইব্রেরি", "ডিরেক্টরি গ্রন্থাগার", "গ্রন্থাগার প্রোগ্রাম"));
        arrayList.add(new ContentQuestionModel("নির্দিষ্ট ব্যবহারকারীর কাছে অনুমোদিত সফ্টওয়্যার সেটটিকে --  হিসাবে বিবেচনা করা হয়", "সফটওয়্যার লাইব্রেরি", "প্রোগ্রাম লাইব্রেরি", "ডিরেক্টরি গ্রন্থাগার", "লাইব্রেরি প্যাকেজ", "প্রোগ্রাম লাইব্রেরি"));
        arrayList.add(new ContentQuestionModel("প্রোগ্রাম যদি ডেটা ত্রুটিগুলি মোকাবেলা করতে পারে তবে এই জাতীয় প্রোগ্রামটিকে", "শক্তিশালী", "নির্ভরযোগ্য", "অবিশ্বস্ত", "স্থিতিশীল কার্যকারিতা", "শক্তিশালী"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি মৌলিক প্রক্রিয়া রাষ্ট্র নয়", "প্রস্তুত", "সমাপ্ত", "নির্বাহী", "অবরুদ্ধ", "অবরুদ্ধ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সত্য?", "ব্লক সাইফার কৌশলটি একটি এনক্রিপশন কৌশল"," বাষ্প সিফার কৌশলটি একটি এনক্রিপশন কৌশল  ", "উভয় (এ) এবং (বি)", "উভয়ই (এ) নয় এবং (খ)। ","উভয় (এ) এবং (বি)"));
        arrayList.add(new ContentQuestionModel("সিস্টেমটি প্রথমে চালু বা পুনরায় চালু করা হলে  নিম্নোক্ত লোডারগুলির মধ্যে কোনটি কার্যকর করা হয় "," বুটলোডার "," সংকলন ও গো লোডার "," বুটস্ট্র্যাপ লোডার "," রিলেটিং লোডার "," বুটস্ট্র্যাপ লোডার "));


        arrayList.add(new ContentQuestionModel("একটি গিগাবাটি প্রায় সমান:", "1000,000 বাইট", "1000,000,000 বাইট", "1000,000,000,000 বাইট", "এর কিছুই নয়", "1000,000,000 বাইট"));
        arrayList.add(new ContentQuestionModel("কমপ্যাক্ট ডিস্ক, (মূল সিডি স্পেসিফিকেশন অনুসারে) কত মিনিটের সংগীত ধারণ করে?", "74 মিনিট", "90 মিনিট", "56 মিনিট", "60 মিনিট", "74 মিনিট"));//6
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি ইনপুট ডিভাইস নয়?", "মাউস", "হালকা কলম", "কীবোর্ড", "ভিডিইউ", "ভিডিইউ"));
        arrayList.add(new ContentQuestionModel("কোন ধরণের প্রক্রিয়া একটি ছোট ফাইল তৈরি করে যা ইন্টারনেটে স্থানান্তর করতে দ্রুত হয়?", " সংক্ষেপণ ", "টুকরো টুকরো", "এনক্যাপসুলেশন", "উপরের কিছুই নয়"," সংক্ষেপণ "));//8
        arrayList.add(new ContentQuestionModel("অপারেটিং সিস্টেম", "অপারেটিং সিস্টেম", "সংকলক", "ডিবিএমএস", "উপরের কিছুই নেই", "ডিবিএমএস"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি অ-উদ্বায়ী মেমরির উদাহরণ?", "ক্যাশে মেমরি", "রম", "রম", "উপরের কিছুই নয়", "রম"));
        arrayList.add(new ContentQuestionModel("ফাইল এক্সটেনশনগুলি ………।", "ফাইলটির নাম দিন", "ফাইলের নামটি হারিয়েছে না তা নিশ্চিত করুন", "ফাইলটি সনাক্ত করুন", "ফাইলের ধরণ চিহ্নিত করুন", "ফাইলের ধরণ চিহ্নিত করুন"));
        arrayList.add(new ContentQuestionModel("কম্পিউটার সিস্টেমে এখানে …………। পার্টস রয়েছে।", "2", "4", "16", "100", "4"));
        arrayList.add(new ContentQuestionModel("ইনফরমেশন প্রসেসিং চক্রের ………… অংশের সময় কম্পিউটার কোনও উত্স থেকে ডেটা অর্জন করে।", "প্রসেসিং", "স্টোরেজ", "ইনপুট", "আউটপুট", "ইনপুট"));
        arrayList.add(new ContentQuestionModel("বিট", "বাইনারি ইনফরমেশন টার্ম", "বাইনারি ডিজিট", "বাইনারি ট্রি", "বিভায়ারেট থিওরি", "বাইনারি ডিজিট"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি অন্য সদস্যদের থেকে পৃথক?", "গুগল", "ম্যাক", "লিনাক্স", "উইন্ডোজ", "গুগল"));
        arrayList.add(new ContentQuestionModel("হেক্সাডেসিমাল সংখ্যা সিস্টেমটি প্রতীকগুলি নিয়ে গঠিত", "0 - 7", "0 - 9, এ - এফ", "0 - 7, এ - এফ", "এর কোনওটি নয়", "0 - 9, এ - এফ"));

        arrayList.add(new ContentQuestionModel("এক কিলোবাইট সমান:", "1000 বাইট", "100 বাইট", "1024 বাইট", "1023 বাইট", "1024 বাইট"));
        arrayList.add(new ContentQuestionModel("ভারতীয় বিজ্ঞানীরা কোন সুপার কম্পিউটারটি তৈরি করেছেন?", "পরম", "সুপার 301", "কমপ্যাক প্রেসারিও", "সিআরএ ওয়াইএমপি", "পরম"));
        arrayList.add(new ContentQuestionModel("বাইনারি কোডে, 7 নম্বরটি লিখিত রয়েছে -", "110", "111", "101", "100", "111"));
        arrayList.add(new ContentQuestionModel("কম্পিউটারের কোন প্রজন্মের ট্রানজিস্টর ব্যবহার করা হয়েছিল?", "প্রথম", "দ্বিতীয়", "তৃতীয়", "চতুর্থ", "দ্বিতীয়"));
        arrayList.add(new ContentQuestionModel("ALU এর অর্থ? "," গাণিতিক দীর্ঘ ইউনিট "," সমস্ত দীর্ঘ ইউনিট "," চারপাশে লজিকাল ইউনিট "," গাণিতিক এবং লজিকাল ইউনিট "," গাণিতিক এবং লজিকাল ইউনিট "));
        arrayList.add(new ContentQuestionModel("পেন্টিয়াম শব্দটি সম্পর্কিত"," ডিভিডি "," হার্ড ডিস্ক "," মাইক্রোপ্রসেসর "," মাউস "," মাইক্রোপ্রসেসর "));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("कंप्यूटर सिस्टम का वह कौन सा भाग है जिसे कोई शारीरिक रूप से छू सकता है?", "डेटा", "ऑपरेटिंग सिस्टम", "हार्डवेयर", "सॉफ्टवेयर", "हार्डवेयर"));
        arrayList.add(new ContentQuestionModel("ए ... ... ... एक इलेक्ट्रॉनिक उपकरण है जो डेटा को प्रोसेस करता है, इसे सूचना में परिवर्तित करता है।", "कंप्यूटर", "प्रोसेसर", "केस", "स्टाइलस", "कंप्यूटर"));
        arrayList.add(new ContentQuestionModel("कंप्यूटर में उपयोग किए जाने वाले आईसी चिप्स आमतौर पर बने होते हैं:", "कंप्यूटर", "सिलिकॉन", "क्रोमियम", "गोल्ड", "कंप्यूटर"));//3
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एक ऑपरेटिंग सिस्टम का उदाहरण नहीं है?", "विंडोज 98", "बीएसडी यूनिक्स", "माइक्रोसॉफ्ट ऑफिस एक्सपी", "रेड हैट लिनक्स", "माइक्रोसॉफ्ट ऑफिस एक्सपी"));
        arrayList.add(new ContentQuestionModel("एक गीगाबाइट लगभग बराबर है:", "1000,000 बाइट्स", "1000,000,000 बाइट्स", "1000,000,000,000 बाइट्स", "इनमें से कोई नहीं", "1000,000,000 बाइट्स"));
        arrayList.add(new ContentQuestionModel("कॉम्पैक्ट डिस्क, (मूल सीडी विनिर्देशों के अनुसार) कितने मिनट का संगीत रखती है?", "74 मिनट", "90 मिनट", "56 मिनट", "60 मिनट", "74 मिनट"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एक इनपुट डिवाइस नहीं है?", "माउस", "लाइट पेन", "कीबोर्ड", "वीडीयू", "वीडीयू"));
        arrayList.add(new ContentQuestionModel("किस प्रकार की प्रक्रिया एक छोटी फ़ाइल बनाती है जो इंटरनेट पर स्थानांतरित करने के लिए तेज़ है?", "संपीड़न", "विखंडन", "एनकैप्सुलेशन", "उपरोक्त में से कोई नहीं", "संपीड़न"));
        arrayList.add(new ContentQuestionModel("ऑपरेटिंग सिस्टम", "ऑपरेटिंग सिस्टम", "PRMS", "DBMS", "उपरोक्त में से कोई नहीं", "PRMS"));//9
        arrayList.add(new ContentQuestionModel("निम्न में से कौन गैर-वाष्पशील स्मृति का एक उदाहरण है?", "कैश मेमोरी", "RAM", "ROM", "उपरोक्त में से कोई नहीं", "ROM"));
        arrayList.add(new ContentQuestionModel(" फ़ाइल एक्सटेंशन का उपयोगके लिए किया जाता है" , " फ़ाइल का नाम  ", " सुनिश्चित करें कि फ़ाइलनाम खो न जाए ", " फ़ाइल को पहचानें ",  "फ़ाइल प्रकार को पहचानें",  "फ़ाइल प्रकार को पहचानें"));//11
        arrayList.add(new ContentQuestionModel("यहाँ हैं …………। कंप्यूटर सिस्टम के कुछ भाग।", "2", "4", "16", "100", "4"));
        arrayList.add(new ContentQuestionModel("सूचना प्रसंस्करण चक्र के भाग के दौरान, ... कंप्यूटर कुछ स्रोत से डेटा प्राप्त करता है।", "प्रसंस्करण", "भंडारण", "इनपुट", "आउटपुट", "इनपुट" ));
        arrayList.add(new ContentQuestionModel("बिट स्टैंड फॉर", "बाइनरी इंफॉर्मेशन टर्म", "बाइनरी डिजिट", "बाइनरी ट्री", "बिवरिएट थ्योरी", "बाइनरी डिजिट"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा अन्य सदस्यों से अलग है?", "नया", "मैक", "लिनक्स", "विंडोज", "नया"));//15
        arrayList.add(new ContentQuestionModel("हेक्साडेसिमल संख्या प्रणाली में प्रतीक होते हैं", "0 - 7", "0 - 9, ए -। एफ", "0 - 7, ए - एफ", "इनमें से कोई नहीं", "0 - 9, ए -। एफ"));//16
        arrayList.add(new ContentQuestionModel("1 GB", "230 बाइट्स  के बराबर है", "230 बाइट्स", "220 बिट्स", "220 बाइट्स", "230 बाइट्स  के बराबर है"));//17
        arrayList.add(new ContentQuestionModel("एक माइक्रोप्रोसेसर यूनिट, एक मेमोरी यूनिट और एक इनपुट / आउटपुट यूनिट एक:", "CPU", "कंपाइलर", "माइक्रो कंप्यूटर", "ALU", "माइक्रो कंप्यूटर"));
        arrayList.add(new ContentQuestionModel("सही निर्देशों के साथ कंप्यूटर से बाहर निकलें। बाहर निकलें", "लॉग इन", "प्रोसेस आउट", "प्रोसेस इन", "लॉग आउट करें", "लॉग आउट करें"));//19
        arrayList.add(new ContentQuestionModel("बाहरी उपकरणों का उपयोग करके प्रोग्राम चलाना और लोड करना -", "ऑपरेटिंग सिस्टम", "जांच प्रणाली", "डंप प्रोग्राम", "फ़ंक्शन सिस्टम", "ऑपरेटिंग सिस्टम"));
        arrayList.add(new ContentQuestionModel("एक असेंबलर है", "भाषा-निर्भर प्रोग्रामिंग।", "सिंटैक्स डिपेंडेंट।", "मशीन डिपेंडेंट।", "डेटा डिपेंडेंट।", "मशीन डिपेंडेंट।"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन वितरित प्रणाली का लाभ नहीं है?", "विश्वसनीयता", "वृद्धि वृद्धि", "संसाधन साझाकरण", "उपरोक्त में से कोई नहीं", "विश्वसनीयता"));
        arrayList.add(new ContentQuestionModel("पृष्ठ ट्रैफ़िक शब्द का वर्णन है", "किसी दिए गए इंस्टैंट पर मेमोरी में पृष्ठों की संख्या।", "दिए गए पेज के अनुरोध पर लाए जाने वाले कागजात की संख्या।", "मेमोरी में पृष्ठों की आवाजाही।"," मेमोरी में लोड किए गए प्रोग्राम को निष्पादित करने के पृष्ठों की संख्या। ","मेमोरी में पृष्ठों की आवाजाही।"));
        arrayList.add(new ContentQuestionModel("असेंबलर  है", "एक प्रोग्राम जो मेमोरी में प्रोग्राम को क्रियान्वित करने के लिए तैयार करता है", "एक प्रोग्राम है जो एक स्रोत प्रोग्राम को निष्पादित करता है जैसे कि यह मशीन भाषा था", "एक प्रोग्राम जो असेंबली भाषा के अनुवाद को स्वचालित करता है मशीन भाषा ","ए प्रोग्राम जो असेंबली लैंग्वेज के अनुवाद को मशीन लैंग्वेज में ऑटोमेट करता है","ए प्रोग्राम जो असेंबली लैंग्वेज के अनुवाद को मशीन लैंग्वेज में ऑटोमेट करता है"));//24
        arrayList.add(new ContentQuestionModel("एक दुभाषिया  है", "एक कार्यक्रम जो स्मृति में कार्यक्रमों को क्रियान्वित करने के लिए तैयार करता है", "एक कार्यक्रम जो एक स्रोत कार्यक्रम को निष्पादित करने के लिए प्रकट होता है जैसे कि यह मशीन भाषा थी", "एक कार्यक्रम जो विधानसभा भाषा के अनुवाद को स्वचालित करता है। मशीनी भाषा "," एक प्रोग्राम जो उच्च-स्तरीय भाषा में लिखे गए प्रोग्राम को स्वीकार करता है और एक ऑब्जेक्ट प्रोग्राम का निर्माण करता है ","एक कार्यक्रम जो विधानसभा भाषा के अनुवाद को स्वचालित करता है। मशीनी भाषा "));
        arrayList.add(new ContentQuestionModel("8085 माइक्रोप्रोसेसर के हिस्से के रूप में कितनी बसें जुड़ी हुई हैं?", "2", "3", "5", "8", "3"));
        arrayList.add(new ContentQuestionModel("डेटा बस में कितने बिट्स का उपयोग किया जाता है?", "7", "8", "9", "16", "9"));//27
        arrayList.add(new ContentQuestionModel("आप एक शब्द को उजागर करने के लिए क्या करेंगे? आप शब्द के बगल में कर्सर रखें, और फिर", "माउस को खींचें", "माउस को एक बार क्लिक करें", "रोल और फिर माउस क्लिक करें", "इनमें से कोई नहीं बटन दबाते हुए ","माउस को खींचें"));
        arrayList.add(new ContentQuestionModel("पुन: प्रयोज्य ऑप्टिकल स्टोरेज में आम तौर पर संक्षिप्त नाम ……… ..", "सीडी", "डीवीडी", "रोम", "आरडब्ल्यू  होगा।", "आरडब्ल्यू  होगा।"));//29
        arrayList.add(new ContentQuestionModel(".. ……………। को कंप्यूटर द्वारा सूचना में संसाधित किया जाता है।", "डेटा", "नंबर", "अक्षर", "चित्र", "डेटा" ));
        arrayList.add(new ContentQuestionModel("एक किलोबाइट बराबर है:", "1000 बाइट्स", "100 बाइट्स", "1024 बाइट्स", "1023 बाइट्स", "1024 बाइट्स"));
        arrayList.add(new ContentQuestionModel("कौन सा सुपर कंप्यूटर भारतीय वैज्ञानिकों द्वारा विकसित किया गया है?", "परम", "सुपर 301", "कॉम्पैक प्रेसारियो", "क्रे वाईएमपी", "परम"));
        arrayList.add(new ContentQuestionModel("बाइनरी कोड में, संख्या 7 के रूप में लिखा गया है -", "110", "111", "101", "100", "101"));//33
        arrayList.add(new ContentQuestionModel("कंप्यूटर की किस पीढ़ी में, ट्रांजिस्टर का उपयोग किया गया था?", "प्रथम", "दूसरा", "तीसरा", "चौथा", "दूसरा"));
        arrayList.add(new ContentQuestionModel("ALL 'का अर्थ है?", "अंकगणितीय लंबी इकाई", "सभी लंबी इकाइयाँ", "आसपास की तार्किक इकाइयाँ", "अंकगणित और तार्किक इकाइयाँ", "अंकगणित और तार्किक इकाइयाँ"));
        arrayList.add(new ContentQuestionModel("पेंटियम 'शब्द' से संबंधित है -", "डीवीडी", "हार्ड डिस्क", "माइक्रोप्रोसेसर", "माउस", "माइक्रोप्रोसेसर"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा कंप्यूटर का सबसे शक्तिशाली प्रकार है?", "सुपर-माइक्रो", "सुपर कंप्यूटर", "माइक्रो कंप्यूटर", "मिनी कंप्यूटर", "सुपर कंप्यूटर"));
        arrayList.add(new ContentQuestionModel("सबसे सामान्य प्रकार के भंडारण उपकरण हैं ... ... ... ...", "लगातार", "ऑप्टिकल", "चुंबकीय", "फ्लैश", "चुंबकीय"));
        arrayList.add(new ContentQuestionModel("The …………। कंप्यूटर को उसके घटकों का उपयोग करने का तरीका बताता है।", "उपयोगिता", "नेटवर्क", "ऑपरेटिंग सिस्टम", "मदरबोर्ड", "ऑपरेटिंग सिस्टम"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एक रैखिक डेटा संरचना नहीं है?", "ऐरे", "बाइनरी ट्री", "क्यू", "स्टैक", "बाइनरी ट्री"));
        arrayList.add(new ContentQuestionModel("कंप्यूटर अपने डेटा को कहां जोड़ता और तुलना करता है?", "CPU", "मेमोरी", "हार्ड डिस्क", "फ्लॉपी डिस्क", "CPU"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन एक इंटरनेट सेवा प्रदाता (ISP) नहीं है?", "MTNL", "BSNL", "ERNET India", "Infotech India Ltd", "Infotech India Ltd"));
        arrayList.add(new ContentQuestionModel("(-15) 10 का बाइनरी समकक्ष (2 के पूरक सिस्टम का उपयोग किया जाता है)", "11110001", "11110000", "10001111", "इनमें से कोई नहीं", "11110001"));
        arrayList.add(new ContentQuestionModel("कंप्यूटर प्रोग्राम का सेट जो कंप्यूटर के हार्डवेयर / सॉफ्टवेयर को प्रबंधित करता है", "कम्पाइलर सिस्टम", "ऑपरेशन सिस्टम", "ऑपरेटिंग सिस्टम", "इनमें से कोई नहीं", "ऑपरेटिंग सिस्टम"));
        arrayList.add(new ContentQuestionModel("प्रोग्राम जो सॉफ्टवेयर पैकेज के एक भाग के रूप में कंप्यूटर उपयोगकर्ताओं के लिए आसानी से उपलब्ध है", "ऑपरेटिंग सिस्टम", "प्रोग्राम लाइब्रेरी", "सॉफ्टवेयर लाइब्रेरी", "डायरेक्टरी लाइब्रेरी", "ऑपरेटिंग सिस्टम"));
        arrayList.add(new ContentQuestionModel("एक विशिष्ट उपयोगकर्ता के लिए अधिकृत सॉफ़्टवेयर का सेट", "सॉफ़्टवेयर लाइब्रेरी", "प्रोग्राम लाइब्रेरी", "डायरेक्ट्री लाइब्रेरी", "लाइब्रेरी पैकेज", "प्रोग्राम लाइब्रेरी"));
        arrayList.add(new ContentQuestionModel("यदि प्रोग्राम डेटा त्रुटियों का सामना कर सकता है, तो ऐसे प्रोग्राम को  मजबूत "," विश्वसनीय ","विश्वसनीय"," अविश्वसनीय "," स्थिर कार्यप्रणाली ","विश्वसनीय"));
        arrayList.add(new ContentQuestionModel("निम्न में से एक मौलिक प्रक्रिया राज्य नहीं है", "रेडी", "समाप्त", "निष्पादन", "अवरुद्ध", "अवरुद्ध"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा सही है?", "ब्लॉक सिफर तकनीक एक एन्क्रिप्शन तकनीक है।", "स्टीम सिफर तकनीक एक एन्क्रिप्शन तकनीक है।", "दोनों (ए) और (बी)।", "ए (ए) के दोनों  और (बी)। ","दोनों (ए) और (बी)।"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा लोडर निष्पादित होता है जब कोई सिस्टम पहली बार चालू होता है या फिर चालू होता है "," बूटलोडर "," कंपाइल एंड गो लोडर "," बूटस्ट्रैप लोडर "," रिलेटिंग लोडर "," बूटस्ट्रैप लोडर "));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("کمپیوٹر سسٹم کا کون سا حصہ ہے جس کو جسمانی طور پر چھو سکتا ہے؟" , "ڈیٹا" , "آپریٹنگ سسٹم" , "ہارڈ ویئر" , "سافٹ ویئر","ہارڈ ویئر"));
        arrayList.add(new ContentQuestionModel("اے ………. ایک الیکٹرانک ڈیوائس ہے جو ڈیٹا پراسس کرتی ہے ، اسے معلومات میں تبدیل کرتی ہے۔" , "کمپیوٹر" , "پروسیسر" , "کیس" , "اسٹائلس","کمپیوٹر"));
        arrayList.add(new ContentQuestionModel("کمپیوٹرز میں استعمال ہونے والی آئی سی چپس عام طور پر بنتی ہیں:" , "لیڈ"  , "سلیکن" , "کرومیم" , "گولڈ","سلیکن"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون آپریٹنگ سسٹم کی مثال نہیں ہے؟" , "ونڈوز 98" , "بی ایس ڈی یونکس" , "مائیکروسافٹ آفس ایکس پی" , "ریڈ ہیٹ لینکس","مائیکروسافٹ آفس ایکس پی"));
        arrayList.add(new ContentQuestionModel("ایک گیگا بائٹ تقریبا برابر برابر ہے:" , "1000،000 بائٹس" , "1000،000،000 بائٹس" , "1000،000،000،000 بائٹس" , "ان میں سے کوئی بھی نہیں","1000،000،000،000 بائٹس"));//5
        arrayList.add(new ContentQuestionModel("کومپیکٹ ڈسکس ، (اصل سی ڈی کی وضاحت کے مطابق) کتنے منٹ کی موسیقی پر مشتمل ہے؟" , "74 منٹ" , "90 منٹ" , "56 منٹ" , "60 منٹ","74 منٹ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ان پٹ آلہ نہیں ہے؟" , "ماؤس" , "ہلکی قلم" , "کی بورڈ" , "وی ڈی یو","وی ڈی یو"));
        arrayList.add(new ContentQuestionModel("کس قسم کا عمل ایک چھوٹی فائل بناتا ہے جو انٹرنیٹ پر منتقل کرنے میں تیز تر ہوتا ہے؟" , "دباؤ" , "فریگمنٹشن" , "انکپسولیشن" , "مذکورہ بالا کوئی بھی نہیں","دباؤ"));//8
        arrayList.add(new ContentQuestionModel("آپریٹنگ سسٹم" , "آپریٹنگ سسٹم" , "مرتب کنندہ" ,"DBMS" , "مندرجہ بالا میں سے کوئی بھی نہیں","DBMS"));
        arrayList.add(new ContentQuestionModel("غیر مستحکم میموری کی مندرجہ ذیل میں سے کون سی مثال ہے؟" , "کیشے میموری" , "رام" , "روم" , "مندرجہ بالا میں سے کوئی بھی نہیں","روم"));
        arrayList.add(new ContentQuestionModel("فائل کی توسیع کا استعمال ………. "," فائل کا نام "," یقینی بنائیں کہ فائل کا نام ختم نہیں ہوا ہے ","فائل کی قسم کی شناخت کریں"," فائل کی شناخت ","فائل کی قسم کی شناخت کریں"));//11
        arrayList.add(new ContentQuestionModel("کمپیوٹر سسٹم کے حصے یہاں ہیں …………." , "2" , "4" , "16" , "100","4"));
        arrayList.add(new ContentQuestionModel("ڈیٹا پروسیسنگ سائیکل کے ساتویں حصے کے دوران ، کمپیوٹر ایک ذریعہ یا دوسرے سے ڈیٹا بازیافت کرتا ہے۔" , "پروسیسنگ" , "اسٹوریج" , "ان پٹ" , "آؤٹ اسٹوریج" ,"ان پٹ"));
        arrayList.add(new ContentQuestionModel("ہیکساڈیسیمل نمبر سسٹم علامتوں پر مشتمل ہے", "0 - 7" , "0 - 9 ، A - F" , "0 - 7 ، A - F" , "ان میں سے کوئی بھی نہیں" , "0 - 9 ، A - F"));//14
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا دوسرے ممبروں سے مختلف ہے؟" , "گوگل" , "میک" , "لینکس" , "ونڈوز","گوگل"));
        arrayList.add(new ContentQuestionModel("ہیکساڈیسمل نمبر نظام" , "0 - 7" , "0 - 9   A - F" , "0 - 7، A - F" , "ان میں سے کوئی بھی نہیں" , "0 - 9   A - F" ));//16
        arrayList.add(new ContentQuestionModel("1 جی بی کے برابر ہے" , "230 بٹس" , "230 bytes" , "220 بٹس" , "220 بائٹس","230 bytes"));
        arrayList.add(new ContentQuestionModel("1 جی بی کے برابر ہے" , "230 بٹس" , "230 bytes" , "220 بٹس" , "220 بائٹس","230 bytes"));
        arrayList.add(new ContentQuestionModel("درست ہدایات دے کر کمپیوٹر سے باہر نکلنے کے عمل جیسے " , "لاگ ان" , "عمل میں آؤٹ" , "عمل میں" , "لاگ آوٹ" ,"لاگ آوٹ"));//19
        arrayList.add(new ContentQuestionModel("پیری فیرلز کے استعمال سے پروگراموں کو چلانے اور لوڈ کرنے کا کام" , "آپریٹنگ سسٹم" , "انکوائری سسٹم" , "ڈمپ پروگرام" , "فنکشن سسٹم"  ,"آپریٹنگ سسٹم"));
        arrayList.add(new ContentQuestionModel("ایک جمع کرنے والا ہے" , "پروگرامنگ زبان پر منحصر ہے۔" , "نحو پر منحصر ہے۔" , "مشین منحصر ہے۔" , "ڈیٹا پر منحصر ہے۔","مشین منحصر ہے۔"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا تقسیم کار نظاموں کا فائدہ نہیں ہے؟" , "اعتبار", "بڑھتی ہوئی نمو" , "وسائل کا اشتراک" , "مندرجہ بالا میں سے کوئی بھی نہیں","اعتبار"));//22
        arrayList.add(new ContentQuestionModel("صفحہ ٹریفک کی اصطلاح بیان کرتی ہے" ,"کسی بھی وقت یادداشت میں صفحوں کی تعداد۔" , "میموری میں اور باہر صفحات کی نقل و حرکت۔" , "میموری کے اندر اور باہر صفحات کی نقل و حرکت۔ "," میموری میں لدے ہوئے پروگراموں کے اجراء کرنے والے صفحوں کی تعداد۔ ","میموری میں اور باہر صفحات کی نقل و حرکت۔"));
        arrayList.add(new ContentQuestionModel("صفحہ ٹریفک کی اصطلاح بیان کرتی ہے" , "کسی بھی وقت یادداشت میں صفحوں کی تعداد۔" , "کسی صفحہ کی درخواست پر لانے کے لئے ضروری کاغذات کی تعداد۔" ,"میموری میں اور باہر صفحات کی نقل و حرکت۔"," میموری میں لدے ہوئے پروگراموں کے اجراء کرنے والے صفحوں کی تعداد۔ ","میموری میں اور باہر صفحات کی نقل و حرکت۔"));//24
        arrayList.add(new ContentQuestionModel("ایک ترجمان ہے","ایک پروگرام جو پروگراموں کو میموری میں رکھتا ہے اور ان کو پھانسی کے لئے تیار کرتا ہے۔","ایسا پروگرام جو بظاہر کسی سورس پروگرام پر عمل درآمد کرتے ہو ایسا لگتا ہے جیسے یہ مشین زبان ہے","ایک پروگرام جو اسمبلی زبان کا مشینی زبان میں خودکار ترجمہ کرتا ہے","ایک ایسا پروگرام جو اعلی سطح کی زبان میں لکھے ہوئے پروگرام کو قبول کرتا ہے اور آبجیکٹ پروگرام تیار کرتا ہے" ,"ایسا پروگرام جو بظاہر کسی سورس پروگرام پر عمل درآمد کرتے ہو ایسا لگتا ہے جیسے یہ مشین زبان ہے"));
        arrayList.add(new ContentQuestionModel("8085 مائکرو پروسیسر کے حصے کے طور پر کتنی بسیں منسلک ہیں؟" , "2" , "3" , "5" , "8","3"));
        arrayList.add(new ContentQuestionModel("ڈیٹا بس میں کتنے بٹس استعمال ہوتے ہیں؟" ,"7" , "8" , "9" , "16","16"));
        arrayList.add(new ContentQuestionModel("آپ کسی لفظ کو اجاگر کرنے کے ل do کیا کریں گے؟ آپ اس لفظ کے آگے کرسر کی پوزیشن لیتے ہیں اور پھر" , "ماؤس کو نیچے دباتے ہوئے دبائیں" , "ماؤس کھینچ کر بٹن دباتے ہو" , "رول اور پھر ماؤس پر کلک کریں" , "ان میں سے کوئی بھی نہیں ","ماؤس کھینچ کر بٹن دباتے ہو" ));//28
        arrayList.add(new ContentQuestionModel("دوبارہ قابل استعمال آپٹیکل اسٹوریج میں عام طور پر مخفف ہوگا ……… .." , "سی ڈی" , "ڈی وی ڈی" , "RW" , "آر ڈبلیو","RW"));
        arrayList.add(new ContentQuestionModel(".. ……………. کمپیوٹر کے ذریعہ معلومات پر کارروائی کی جاتی ہے۔" , "ڈیٹا" , "نمبر" , "حروف" , "تصاویر","ڈیٹا"));
        arrayList.add(new ContentQuestionModel("ایک کلو بائٹ اس کے برابر ہے:" , "1000 بائٹس" , "100 بائٹس" , "1024 بائٹس" , "1023 بائٹس","1024 بائٹس"));
        arrayList.add(new ContentQuestionModel("ہندوستانی سائنسدانوں نے کون سا سپر کمپیوٹر تیار کیا ہے؟" , "پیرم" , "سپر 301" , "کمپاک پریساریو", "کرائے وائی ایم پی","پیرم"));//32
        arrayList.add(new ContentQuestionModel("بائنری کوڈ میں ، نمبر 7 لکھا گیا ہے -" , "110" , "111" , "101" , "100","111"));
        arrayList.add(new ContentQuestionModel("کمپیوٹر ، ٹرانجسٹر کی کس نسل میں استعمال کیا گیا تھا؟" , "پہلا" , "دوسرا" , "تیسرا" , "چوتھا" , "دوسرا"));
        arrayList.add(new ContentQuestionModel("ALU کا مطلب ہے؟" , "ریاضیاتی لانگ یونٹ" , "تمام طویل یونٹ" , "منطقی اکائیوں کے آس پاس" , "ریاضی اور منطقی اکائیوں","ریاضی اور منطقی اکائیوں"));
        arrayList.add(new ContentQuestionModel("پینٹیم کی اصطلاح سے متعلق ہے", "ڈی وی ڈی" , "ہارڈ ڈسک" , "مائکرو پروسیسر" , "ماؤس","مائکرو پروسیسر"));//36
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کمپیوٹر کی سب سے طاقتور قسم ہے؟" , "سپر مائکرو" , "سپر کمپیوٹر" , "مائیکرو کمپیوٹر" , "منی کمپیوٹر","سپر کمپیوٹر"));
        arrayList.add(new ContentQuestionModel("سب سے عام قسم کے اسٹوریج ڈیوائسز …………." , "مستقل" , "آپٹیکل" , "مقناطیسی" , "فلیش"  ,"مقناطیسی"));
        arrayList.add(new ContentQuestionModel("………… کمپیوٹر کو بتاتا ہے کہ اس کے اجزاء کو کس طرح استعمال کیا جائے۔",  " ", " نی ورک", "آپریٹنگ سسٹم", "مدر بورڈ","آپریٹنگ سسٹم"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا لکیری اعداد و شمار کا ڈھانچہ نہیں ہے؟" , "صف" , "ثنائی درخت" , "قطار" , "اسٹیک","ثنائی درخت"));//40
        arrayList.add(new ContentQuestionModel("ایک کمپیوٹر اپنے ڈیٹا کو کہاں شامل اور موازنہ کرتا ہے؟" , "سی پی یو", "میموری" , "ہارڈ ڈسک" , "فلاپی ڈسک","سی پی یو"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون انٹرنیٹ سروس پرووائڈر (آئی ایس پی) نہیں ہے؟" , "ایم ٹی این ایل" , "بی ایس این ایل" , "ایرٹ نیٹ" , "انفٹیک انڈیا لمیٹڈ","انفٹیک انڈیا لمیٹڈ"));
        arrayList.add(new ContentQuestionModel("بائنری برابر (–15) ​​10 ہے (2 کا تکمیلی نظام استعمال کیا جاتا ہے)","11110001","11110000","10001111","None of these","11110001"));
        arrayList.add(new ContentQuestionModel("کمپیوٹر پروگراموں کے اس سیٹ کو جو کمپیوٹر کے ہارڈ ویئر / سافٹ ویئر کا انتظام کرتے ہیں ،" , "کمپائلر سسٹم" , "آپریشن سسٹم" , "آپریٹنگ سسٹم" , "ان میں سے کوئی بھی نہیں" ,"آپریٹنگ سسٹم"));
        arrayList.add(new ContentQuestionModel("جو پروگرام سوفٹ ویئر پیکج کے حصے کے طور پر کمپیوٹر صارفین کے لئے آسانی سے دستیاب ہے اسے" , "لائبریری پروگرام" , "پروگرام لائبریری" , "سوفٹویری لائبریری" , "ڈائریکٹری لائبریری" ,"لائبریری پروگرام"));
        arrayList.add(new ContentQuestionModel("کسی مخصوص صارف کو اختیار کردہ سافٹ ویئر کی سیٹ کو" , "سافٹ ویئر لائبریری", "پروگرام لائبریری" , "ڈائریکٹری لائبریری" , "لائبریری پیکیج" ,"پروگرام لائبریری"));
        arrayList.add(new ContentQuestionModel("اگر پروگرام ڈیٹا کی غلطیوں کا مقابلہ کرسکتا ہے تو ، اس طرح کے پروگرام کو" , "مضبوط" , "قابل اعتماد" , "ناقابل اعتماد" ,"مستحکم کام کرنا","مضبوط"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی بنیادی عمل کی حالت نہیں ہے" , "تیار" , "ختم" , "عمل" , "مسدود","مسدود"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی سچ ہے؟" , "بلاک سائفر تکنیک ایک خفیہ کاری کی تکنیک ہے۔" , "بھاپ سیفر تکنیک ایک خفیہ کاری کی تکنیک ہے۔" , "دونوں (اے) اور (بی)۔" , "دونوں میں سے (اے) نہیں اور (B)","دونوں میں سے (اے) نہیں اور (B)"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی سچ ہے؟" , "بلاک سائفر تکنیک ایک خفیہ کاری کی تکنیک ہے۔" , "بھاپ سیفر تکنیک ایک خفیہ کاری کی تکنیک ہے۔" , "دونوں (اے) اور (بی)۔" , "دونوں میں سے (اے) نہیں اور (B)","دونوں میں سے (اے) نہیں اور (B)"));



        return arrayList;


    }


}