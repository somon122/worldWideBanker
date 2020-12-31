package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Physics {


    private Context context;
    public Q_Physics(Context context) {
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

        String str = "Leonardo da Vinci";

        arrayList.add(new ThreeItemModel("Which famous Danish physicist in 1675 measured the speed of light?", "Romer "));
        arrayList.add(new ThreeItemModel("What did Sir William Herschel discover in 1800?", "Infra-red radiation "));
        arrayList.add(new ThreeItemModel("In which year did G.S. Ohm formulate Ohm’s law?", "1827"));
        arrayList.add(new ThreeItemModel("In which year did A. Michelson and E. Morley conduct their experiment to verify the existence of ether?", "1887"));
        arrayList.add(new ThreeItemModel("Who in 1939 suggested the name meson for middle-weight particles?", "Homi J. Bhabha"));
        arrayList.add(new ThreeItemModel("What is the importance of 2nd December 1942?", "The creation of the first controlled chain reaction"));
        arrayList.add(new ThreeItemModel("Which philosopher conjectured that if the moon did not move, it would fall upon the earth?", " Anaxagoras"));
        arrayList.add(new ThreeItemModel("Who said, “A bird is an instrument working according to the mathematical laws”?", str));
        arrayList.add(new ThreeItemModel("Who said, “All falling bodies, irrespective of their size, descend at the same speed”?", "Galileo Galilei "));
        arrayList.add(new ThreeItemModel("Which Austrian physicist developed the philosophy that all knowledge is simply sensation?", "Ernest Mach "));
        arrayList.add(new ThreeItemModel("Who contemplated “A freely floating magnet orients itself in the north-south direction?", "Robert Norman "));
        arrayList.add(new ThreeItemModel("Who gave the idea “Electricity flows through space from heated metal”?", "Thomas Alva Edison "));
        arrayList.add(new ThreeItemModel("“Moving particles have wave characteristics.” Who proposed the idea first?", "Victor de Broglie"));
        arrayList.add(new ThreeItemModel("Who suggested that light is made up of packets of energy known as protons?", "Albert Einstein "));
        arrayList.add(new ThreeItemModel("Who first gave the concept of ‘Atom’?", "Kanada"));
        arrayList.add(new ThreeItemModel("How many times is the proton heavier than the electron?", "1836 times"));
        arrayList.add(new ThreeItemModel("What is AMU?", "It is the unit of atomic mass"));

        arrayList.add(new ThreeItemModel("Who was the first pre-Socratic philosopher to suggest that matter could neither be created nor destroyed?", "Parmenides"));
        arrayList.add(new ThreeItemModel("In 1729 AD, Pieter Van Musschenbroek used the term ‘PHYSICS’ for the first time. What was the subject called so far?", "Natural philosophy"));
        arrayList.add(new ThreeItemModel("Which Greek philosopher suggested that the material world was composed of four basic elements – air, water, fire and earth?", "Empedocles"));
        arrayList.add(new ThreeItemModel("Who in 1231 was the first to describe the science of optics?", "Robert Grosseteste"));
        arrayList.add(new ThreeItemModel("Who was burnt to death for suggesting that the sun might be an ordinary star?", "Giordano Bruno"));
        arrayList.add(new ThreeItemModel("Who in 1643 was the first person to create vacuum above the liquid?", "Evangelista Torricelli"));
        arrayList.add(new ThreeItemModel("Who in 1786 invented the gold leaf electroscope?", "Abraham Bennet"));
        arrayList.add(new ThreeItemModel("Who encouraged Newton to write his idea for Principia?", "Edmund Halley"));
        arrayList.add(new ThreeItemModel("Who in 1808 discovered polarization of light and introduced the term ‘Polarization’?", "Etienne-Louis Malus"));
        arrayList.add(new ThreeItemModel("The first scientist to apply scientific reasoning to cosmology was Rene Descartes. What was his theory called?", "Vortex Theory"));
        arrayList.add(new ThreeItemModel("Who was the first to attack Newton’s Corpuscular theory of light?", "Thomas Young"));

        arrayList.add(new ThreeItemModel("Who was the first person to design models of flying machine?", str));
        arrayList.add(new ThreeItemModel("Who in 1749 developed a method for making an artificial magnet?", "John Canton"));
        arrayList.add(new ThreeItemModel("Hydrodynamic gave an explanation of Bernoulli’s theorem in 1738. Who was the first to suggest this theorem?", "Daniel Bernoulli"));
        arrayList.add(new ThreeItemModel("Who invented the Leyden jar?", " Pieter Van Musschenbroek and  Ewald Georg von Kleist"));
       arrayList.add(new ThreeItemModel("The energy released from the sun and the other stars is due to what?", "Nuclear fusion"));
        arrayList.add(new ThreeItemModel("The force that tends to make a nucleus fly apart?", "Electrostatic repulsion "));
        arrayList.add(new ThreeItemModel("Which force is responsible to keep the atomic nuclei together?", "Nuclear force only"));
        arrayList.add(new ThreeItemModel("How do the electrons move according to the Rutherford model of the atom?", "Electrons orbit the positively charged nuclei "));
        arrayList.add(new ThreeItemModel("What does the phenomenon of photo-electric emission establish?", "The quantum nature of light"));
        arrayList.add(new ThreeItemModel("When does the emission of energy take place?", "An electron jumps from the higher orbit to the lower orbit "));
        arrayList.add(new ThreeItemModel("What did Rutherford’s gold foil experiment prove?", "Positively charged protons are contained in the nucleus of the atom "));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        String str = "লিওনার্দো দা ভিঞ্চি";
        arrayList.add(new ThreeItemModel("উড়ন্ত মেশিনের মডেল ডিজাইন করা প্রথম ব্যক্তি কে?", str));
        arrayList.add(new ThreeItemModel("1749 সালে কৃত্রিম চৌম্বক তৈরির জন্য কে একটি পদ্ধতি তৈরি করেছিলেন?", "জন ক্যান্টন"));
        arrayList.add(new ThreeItemModel("হাইড্রোডাইনামিক 1738 সালে বার্নোলির উপপাদকের ব্যাখ্যা দিয়েছিলেন। এই উপপাদ্যটি প্রথম প্রস্তাব করেছিলেন কে?", "ড্যানিয়েল বার্নোল্লি"));
        arrayList.add(new ThreeItemModel("লেডেনের জার কে আবিষ্কার করেছিলেন?", "পিটার ভ্যান মুশচেনব্রুক এবং এয়াল্ড জর্জি ভন ক্লেইস্ট"));
        arrayList.add(new ThreeItemModel("1675 সালে কোন বিখ্যাত ডেনিশ পদার্থবিদ আলোর গতি পরিমাপ করেছিলেন?", "রোমার"));
        arrayList.add(new ThreeItemModel("স্যার উইলিয়াম হার্শেল 1800 সালে কী আবিষ্কার করেছিলেন?", "ইনফ্রা-রেড রেডিয়েশন"));
        arrayList.add(new ThreeItemModel("জি.এস. ওহম কোন বছরে ওহমের আইন তৈরি করেছিলেন?", "1827"));
        arrayList.add(new ThreeItemModel("কোন বছরে এ। মাইকেলসন এবং ই। মর্লি ইথারের অস্তিত্ব যাচাই করার জন্য তাদের পরীক্ষা চালিয়েছিলেন?", "1887"));
        arrayList.add(new ThreeItemModel("1939 সালে মাঝারি ওজন কণার জন্য মেসন নামটির পরামর্শ কে দিয়েছিলেন?", "হোমি জে ভাভা"));
        arrayList.add(new ThreeItemModel("1942 সালের 2 শে ডিসেম্বর এর গুরুত্ব কী?", "প্রথম নিয়ন্ত্রিত চেইন প্রতিক্রিয়া সৃষ্টি"));
        arrayList.add(new ThreeItemModel("1942 2 শে ডিসেম্বর এর পদ্ধতি কী?", "প্রথম নিয়ন্ত্রিত চৈতন্য প্রচার"));
        arrayList.add(new ThreeItemModel("কে বলেছিল  পাখি একটি গাণিতিক আইন অনুসারে কাজ করা একটি উপকরণ  ?", str));
        arrayList.add(new ThreeItemModel("কে বলেছিল  সমস্ত পতনশীল দেহ, তাদের আকার নির্বিশেষে একই গতিতে নেমে আসে ?", "গ্যালিলিও গ্যালিলি"));
        arrayList.add(new ThreeItemModel("কোন অস্ট্রিয়ান পদার্থবিজ্ঞানী এই দর্শনের বিকাশ করেছিলেন যে সমস্ত জ্ঞান কেবল সংবেদন হয়?", "আর্নেস্ট মাচ"));

        arrayList.add(new ThreeItemModel("প্রথম প্রাক-সকরাটিক দার্শনিক কে পরামর্শ দিয়েছিলেন যে বিষয়টি তৈরি বা ধ্বংস করা যায় না?", "পারমানাইডস"));
        arrayList.add(new ThreeItemModel("১ 17২২ খ্রিস্টাব্দে, পিটার ভ্যান মুশবেনব্রোক প্রথমবারের জন্য‘ পিএইচওয়াইসিকস ’শব্দটি ব্যবহার করেছিলেন। এতক্ষণ কী বিষয় বলা হত?", "প্রাকৃতিক দর্শন"));
        arrayList.add(new ThreeItemModel("কোন গ্রীক দার্শনিক পরামর্শ দিয়েছিলেন যে জগত জগতটি চারটি মৌলিক উপাদান - বায়ু, জল, আগুন এবং পৃথিবীর সমন্বয়ে গঠিত?", "এম্পেডোক্লস"));
        arrayList.add(new ThreeItemModel("1231 সালে কে সর্বপ্রথম আলোক বিজ্ঞানের বর্ণনা দিয়েছেন?", "রবার্ট গ্রোসেটেস্ট"));
        arrayList.add(new ThreeItemModel("সূর্য একটি সাধারণ তারা হতে পারে এমন পরামর্শের জন্য কে মারা গিয়েছিল?", "জিওর্ডানো ব্রুনো"));
        arrayList.add(new ThreeItemModel("সূর্য একটি সাধারণ তারা হতে পারে এমন পরামর্শের জন্য কে মারা গিয়েছিল?", "জিওর্ডানো ব্রুনো"));
        arrayList.add(new ThreeItemModel("1786 সালে সোনার পাতার বৈদ্যুতিনস্কোপ আবিষ্কার করেছিলেন কে?", "আব্রাহাম বেনেট"));
        arrayList.add(new ThreeItemModel("নিউটন কে প্রিন্সিপিয়া জন্য তার ধারণা লিখতে উত্সাহিত করেছিলেন?", "এডমন্ড হ্যালি"));
        arrayList.add(new ThreeItemModel("কে 1808 সালে আলোর পোলারাইজেশন আবিষ্কার করেছিলেন এবং  মেরুকরণ  শব্দটি চালু করেছিলেন?", "এতিয়েন-লুই মালুস"));
        arrayList.add(new ThreeItemModel("মহাজাগতিকবিদ্যায় বৈজ্ঞানিক যুক্তি প্রয়োগকারী প্রথম বিজ্ঞানী ছিলেন রিনি ডেসকার্টেস। তাঁর তত্ত্বটি কী নামে পরিচিত?", "ভেরটেক্স থিওরি"));
        arrayList.add(new ThreeItemModel("নিউটনের করপাস্কুলার আলোর তত্ত্বকে আক্রমণকারী প্রথম কে ছিলেন?", "থমাস ইয়ং"));
        arrayList.add(new ThreeItemModel("কে একটি মুক্তভাবে ভাসমান চৌম্বকটি উত্তর-দক্ষিণের দিকে নিজেকে আঁকিয়ে নিয়েছে?", "রবার্ট নরম্যান"));
        arrayList.add(new ThreeItemModel("উত্তপ্ত ধাতব থেকে স্থান দিয়ে বিদ্যুৎ প্রবাহিত হয়  এই ধারণাটি কে দিয়েছেন? "," থমাস আলভা এডিসন "));
        arrayList.add(new ThreeItemModel(" সরানো কণার তরঙ্গ বৈশিষ্ট্য রয়েছে  প্রথমে ধারণাটি কে প্রস্তাব করেছিলেন? "," ভিক্টর ডি ব্রোগলি "));
        arrayList.add(new ThreeItemModel("কে পরামর্শ দিয়েছেন যে প্রোটন হিসাবে পরিচিত শক্তির প্যাকেটগুলি দিয়ে আলো তৈরি হয়?", "অ্যালবার্ট আইনস্টাইন"));
        arrayList.add(new ThreeItemModel("প্রথমে‘ পরমাণু ’ধারণাটি কে দিয়েছিলেন?", "কানদা"));
        arrayList.add(new ThreeItemModel("প্রোটনটি ইলেক্ট্রনের চেয়ে কতগুণ ভারী?", "1836 বার"));
        arrayList.add(new ThreeItemModel("এএমইউ কী?", "এটি পারমাণবিক ভরের একক"));
        arrayList.add(new ThreeItemModel("সূর্য এবং অন্যান্য নক্ষত্র থেকে যে শক্তি প্রকাশিত হয়েছে তা কি কারণে?", "পারমাণবিক সংশ্লেষ"));
        arrayList.add(new ThreeItemModel("যে শক্তিটি নিউক্লিয়াসকে পৃথক করে উড়ে বেড়ায়?", "ইলেক্ট্রোস্ট্যাটিক বিকর্ষণ"));
        arrayList.add(new ThreeItemModel("পারমাণবিক নিউক্লিয়িকে একত্রে রাখার জন্য কোন শক্তি দায়বদ্ধ?", "কেবলমাত্র পারমাণবিক শক্তি"));
        arrayList.add(new ThreeItemModel("পরমাণুর রাদারফোর্ড মডেল অনুসারে ইলেক্ট্রনগুলি কীভাবে চলাচল করে?", "ইলেক্ট্রনগুলি ধনাত্মক চার্জযুক্ত নিউক্লিয়াকে প্রদক্ষিণ করে"));
        arrayList.add(new ThreeItemModel("ফটো-বৈদ্যুতিক নির্গমনের ঘটনাটি কী প্রতিষ্ঠিত করে?", "আলোর পরিমাণের প্রকৃতি"));
        arrayList.add(new ThreeItemModel("কখনই শক্তির নির্গমন ঘটে?", "একটি ইলেক্ট্রন উচ্চ কক্ষপথ থেকে নিম্ন কক্ষপথের দিকে ঝাঁপিয়ে পড়ে"));
        arrayList.add(new ThreeItemModel("রাদারফোর্ডের সোনার ফয়েল পরীক্ষা কী প্রমাণ করেছিল?", "ধনাত্মক চার্জযুক্ত প্রোটনগুলি পরমাণুর নিউক্লিয়াসে রয়েছে"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("पहला पूर्व-सुकराती दार्शनिक कौन था जो यह सुझाव दे सकता था कि इस मामले को न तो बनाया जा सकता है और न ही नष्ट किया जा सकता है?", "पेरेन"));
        arrayList.add(new ThreeItemModel("1729 ई। में, पीटर वान मुस्चेनब्रोक ने पहली बार 'PHYSICS' शब्द का इस्तेमाल किया था। अब तक किस विषय को बुलाया गया था?", "प्राकृतिक दर्शन"));
        arrayList.add(new ThreeItemModel("किस यूनानी दार्शनिक ने सुझाव दिया कि भौतिक दुनिया चार मूल तत्वों - वायु, जल, अग्नि और पृथ्वी से बनी है?", "एम्पोल्स"));
        arrayList.add(new ThreeItemModel("1231 में कौन प्रकाशिकी विज्ञान का वर्णन करने वाला पहला व्यक्ति था?", "रॉबर्ट ग्रोस्सेटे"));
        arrayList.add(new ThreeItemModel("कौन सुझाव के लिए जला दिया गया था कि सूरज एक साधारण तारा हो सकता है?", "गियोर्डानो ब्रूनो"));
        arrayList.add(new ThreeItemModel("1643 में तरल के ऊपर वैक्यूम बनाने वाला पहला व्यक्ति कौन था?", "इवेंजेलिस्ता टोर्रिकेली"));
        arrayList.add(new ThreeItemModel("किसने 1786 में सोने की पत्ती इलेक्ट्रोस्कोप का आविष्कार किया?", "अब्राहम बेनेट"));
        arrayList.add(new ThreeItemModel("किसने न्यूटन को प्रिंसिपिया के लिए अपना विचार लिखने के लिए प्रोत्साहित किया?", "एडमंड हैली"));
        arrayList.add(new ThreeItemModel("1808 में किसने प्रकाश के ध्रुवीकरण की खोज की और 'ध्रुवीकरण' शब्द का परिचय दिया?", "इटेन-लुइस माली"));
        arrayList.add(new ThreeItemModel("ब्रह्मांड विज्ञान के लिए वैज्ञानिक तर्क को लागू करने वाले पहले वैज्ञानिक रेने डेसकार्टेस थे। उनके सिद्धांत को क्या कहा गया था?", "भंवर सिद्धांत"));
        arrayList.add(new ThreeItemModel("थॉमस न्यूटन के प्रकाश के सिद्धांत पर हमला करने वाला पहला व्यक्ति कौन था?", "थॉमस यंग"));
        String str ="लियोनार्डो दा विंसी";
        arrayList.add(new ThreeItemModel("फ्लाइंग मशीन के मॉडल डिजाइन करने वाला पहला व्यक्ति कौन था?", str));
        arrayList.add(new ThreeItemModel("1749 में किसने कृत्रिम चुंबक बनाने के लिए एक विधि विकसित की?", "जॉन कैंटन"));
        arrayList.add(new ThreeItemModel("हाइड्रोडायनामिक ने 1738 में बर्नौली के प्रमेय का विवरण दिया। इस प्रमेय का सुझाव देने वाला पहला व्यक्ति कौन था?", "डैनियल बर्नोली"));
        arrayList.add(new ThreeItemModel("लेयर्ड जार का आविष्कार किसने किया?", "पीटर वान मुस्चेनब्रुक और इवाल्ड जॉर्ज वॉन क्लेव"));
        arrayList.add(new ThreeItemModel("1675 में किस प्रसिद्ध डेनिश भौतिक विज्ञानी ने प्रकाश की गति को मापा?", "रोमर"));
        arrayList.add(new ThreeItemModel("सर विलियम हर्शल ने 1800 में क्या खोजा था?", "इन्फ्रा-रेड विकिरण"));
        arrayList.add(new ThreeItemModel("किस वर्ष में जी.एस. ओह्म ने ओह्म का नियम तैयार किया?", "1827"));
        arrayList.add(new ThreeItemModel("ए। माइकलसन और ई। मॉर्ले ने ईथर के अस्तित्व को सत्यापित करने के लिए अपना प्रयोग किस वर्ष में किया था?", "1887"));
        arrayList.add(new ThreeItemModel("1939 में किसने मध्यम वजन के कणों के लिए मेसन नाम सुझाया?", "होमी जे। भाभा"));
        arrayList.add(new ThreeItemModel("2 दिसंबर 1942 का महत्व क्या है?", "पहली नियंत्रित श्रृंखला प्रतिक्रिया का निर्माण"));
        arrayList.add(new ThreeItemModel("किस दार्शनिक ने अनुमान लगाया कि अगर चंद्रमा नहीं हिलता, तो वह पृथ्वी पर गिरता?", "अनएक्सकोरोर"));
        arrayList.add(new ThreeItemModel("किसने कहा एक पक्षी गणितीय नियमों के अनुसार काम करने वाला एक उपकरण है  ?", str));
        arrayList.add(new ThreeItemModel("किसने कहा  सभी गिरने वाले शरीर, उनके आकार के बावजूद, एक ही गति से उतरते हैं  ?", "गैलीलियो गैली"));
        arrayList.add(new ThreeItemModel("किस ऑस्ट्रियाई भौतिक विज्ञानी ने दर्शन विकसित किया कि सभी ज्ञान बस सनसनी है?", "अर्नेस्ट मच"));
        arrayList.add(new ThreeItemModel("किसने चिंतन किया उत्तर-दक्षिण दिशा में स्वयं एक स्वतंत्र रूप से तैरते चुंबक?",  "रॉबर्ट नॉर्मन"));
        arrayList.add(new ThreeItemModel("किसने विचार दिया  गर्म धातु से अंतरिक्ष में बिजली प्रवाहित होती है? "," थॉमस अल्वा एडिसन "));
        arrayList.add(new ThreeItemModel("  बढ़ते कणों में तरंग विशेषताएं होती हैं।   किसने सबसे पहले विचार प्रस्तावित किया? "," विक्टर डी ब्रोगली "));
        arrayList.add(new ThreeItemModel("किसने सुझाव दिया कि प्रकाश ऊर्जा के पैकेट से बना है जिसे प्रोटॉन के रूप में जाना जाता है?", "अल्बर्ट आइंस्टीन"));
        arrayList.add(new ThreeItemModel("किसने सबसे पहले om परमाणु 'की अवधारणा दी थी?", "कणाद"));
        arrayList.add(new ThreeItemModel("प्रोटॉन इलेक्ट्रॉन की तुलना में कितनी बार भारी होता है?", "1836 बार"));
        arrayList.add(new ThreeItemModel("एएमयू क्या है?", "यह परमाणु द्रव्यमान की इकाई है"));
        arrayList.add(new ThreeItemModel("सूर्य और अन्य तारों से निकलने वाली ऊर्जा किसके कारण है?", "न्यूक्लियर फ्यूजन"));
        arrayList.add(new ThreeItemModel("जो बल एक नाभिक को अलग करने के लिए उड़ जाता है?", "इलेक्ट्रोस्टैटिक प्रतिकर्षण"));
        arrayList.add(new ThreeItemModel("परमाणु नाभिक को एक साथ रखने के लिए कौन सा बल जिम्मेदार है?", "केवल परमाणु बल"));
        arrayList.add(new ThreeItemModel("परमाणु के रदरफोर्ड मॉडल के अनुसार इलेक्ट्रॉन कैसे चलते हैं?", "इलेक्ट्रॉनों ने सकारात्मक रूप से संक्रांति की परिक्रमा की"));
        arrayList.add(new ThreeItemModel("फोटो-इलेक्ट्रिक उत्सर्जन की घटना क्या स्थापित करती है?", "प्रकाश की क्वांटम प्रकृति"));
        arrayList.add(new ThreeItemModel("ऊर्जा का उत्सर्जन कब होता है?", "एक इलेक्ट्रॉन उच्च कक्षा से निचली कक्षा में कूदता है"));
        arrayList.add(new ThreeItemModel("रदरफोर्ड के गोल्ड फ़ॉइल प्रयोग ने क्या साबित किया?", "सकारात्मक रूप से चार्ज किए गए प्रोटॉन परमाणु के नाभिक में समाहित हैं"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("پہلے سے پہلے سقراطی فلسفی کون تھا جس نے یہ تجویز کیا کہ اس معاملے کو نہ تو پیدا کیا جاسکتا ہے اور نہ ہی تباہ کیا جاسکتا ہے؟" , "پیرامیائیڈس"));
        arrayList.add(new ThreeItemModel("1729 عیسوی میں ، پیٹر وان مسن بروک نے پہلی بار PHYSICS کی اصطلاح استعمال کی۔ اب تک اس موضوع کو کیا کہا جاتا ہے؟" , "قدرتی فلسفہ"));
        arrayList.add(new ThreeItemModel("کس یونانی فلاسفر نے مشورہ دیا کہ مادی دنیا چار بنیادی عناصر یعنی ہوا ، پانی ، آگ اور زمین پر مشتمل ہے؟" , "ایمپیڈوکلس"));
        arrayList.add(new ThreeItemModel("1231 میں آپٹکس کی سائنس کی وضاحت کرنے والا پہلا شخص کون تھا؟" , "رابرٹ گروسیٹی"));
        arrayList.add(new ThreeItemModel("سورج ایک عام ستارہ ہوسکتا ہے اس تجویز پر کون جلایا گیا؟" , "جورڈانو برونو"));
        arrayList.add(new ThreeItemModel("مائع سے بالا تر خلا پیدا کرنے والا پہلا شخص کون تھا؟" , "ایوینجلسٹا ٹوریسیلی"));
        arrayList.add(new ThreeItemModel("سنہ 1786 میں سونے کے پتے الیکٹروسکوپ کی ایجاد کس نے کی؟" , "ابراہیم بینیٹ"));
        arrayList.add(new ThreeItemModel("کس نے نیوٹن کو پرنسیپیا کے لئے اپنا نظریہ لکھنے کی ترغیب دی؟" , "ایڈمنڈ ہیلی"));
        arrayList.add(new ThreeItemModel( " 1808 میں کس نے روشنی کی پولرائزیشن کو دریافت کیا اور" , "ایٹین لوئس میلس"));
        arrayList.add(new ThreeItemModel("کائناتولوجی پر سائنسی استدلال کا اطلاق کرنے والے پہلے سائنس دان رینی ڈسکارٹس تھے۔ ان کے نظریہ کو کیا کہا جاتا تھا؟" , "ورٹیکس تھیوری"));
        arrayList.add(new ThreeItemModel("نیوٹن کے کارپسکولر تھیوری آف لائٹ پر حملہ کرنے والے پہلے کون تھا؟" , "تھامس ینگ"));
        String str = "لیونارڈو ڈاونچی";
        arrayList.add(new ThreeItemModel("فلائنگ مشین کے ماڈل ڈیزائن کرنے والا پہلا شخص کون تھا؟", str));
        arrayList.add(new ThreeItemModel("کس نے 1749 میں مصنوعی مقناطیس بنانے کا طریقہ تیار کیا؟" , "جان کینٹن"));
        arrayList.add(new ThreeItemModel("ہائیڈروڈینیامک نے 1738 میں برنولی کے نظریہ کی وضاحت پیش کی۔ اس تھیوریم کی تجویز کرنے والے پہلے کون تھا؟" , "ڈینیئل برنولی"));
        arrayList.add(new ThreeItemModel("لیڈن جار کی ایجاد کس نے کی؟" , "پیٹر وان مسن بروک اور ایولڈ جارج وان کلائسٹ"));
        arrayList.add(new ThreeItemModel("ڈینش کے کس مشہور ماہر طبیعیات دان نے 1675 میں روشنی کی رفتار کی پیمائش کی؟" , "رومر"));
        arrayList.add(new ThreeItemModel("سر ولیم ہرشل نے 1800 میں کیا دریافت کیا؟" , "انفرا ریڈ ریڈی ایشن"));
        arrayList.add(new ThreeItemModel("جی ایس اوہم نے اوہم کا قانون کس سال تیار کیا؟" , "1827"));
        arrayList.add(new ThreeItemModel("اے مائیکلسن اور ای. مورلی نے آسمان کے وجود کی تصدیق کے لئے کس سال اپنا تجربہ کیا؟" , "1887"));
        arrayList.add(new ThreeItemModel("1939 میں درمیانی وزن کے ذرات کے ل 19 میسن نام کس نے تجویز کیا؟" , "ہومی جے بھابھا"));
        arrayList.add(new ThreeItemModel("2 دسمبر 1942 کی اہمیت کیا ہے؟" , "پہلا کنٹرول چین رد عمل کی تخلیق"));
        arrayList.add(new ThreeItemModel("کس فلاسفر نے یہ قیاس کیا تھا کہ اگر چاند حرکت نہیں کرتا ہے تو ، وہ زمین پر گر جائے گا؟" , "انیکاگاس"));
        arrayList.add(new ThreeItemModel("کس نے کہا کہ پرندہ ریاضی کے قوانین کے مطابق کام کرنے والا ایک آلہ ہے؟", str));
        arrayList.add(new ThreeItemModel("کس نے کہا ، تمام گرتی ہوئی لاشیں ، ان کے سائز سے قطع نظر ، اسی رفتار سے نیچے اترتی ہیں؟" ,"گیلیلیو گیلیلی"));
        arrayList.add(new ThreeItemModel("کس آسٹریا کے ماہر طبیعیات نے یہ فلسفہ تیار کیا کہ تمام علم محض سنسنی ہے؟" , "ارنسٹ مچ"));
        arrayList.add(new ThreeItemModel("کس نے آزادانہ طور پر تیرتا ہوا مقناطیس شمال - سمت کی سمت میں اپنے آپ کو گردش کرنے پر غور کیا؟" , "رابرٹ نارمن"));
        arrayList.add(new ThreeItemModel("گرم ، شہوت انگیز دھات سے بجلی پیدا کرنے کا خیال کس نے دیا؟" , "تھامس الوا ایڈیسن"));
        arrayList.add(new ThreeItemModel("حرکت پذیر ذرات کی لہر کی خصوصیات ہیں۔ اس نظریہ کو پہلے کس نے پیش کیا؟" , "وکٹر ڈی بروگلی"));
        arrayList.add(new ThreeItemModel("کس نے مشورہ دیا کہ روشنی توانائی کے پیکٹ سے بنی ہوتی ہے جسے پروٹون کہا جاتا ہے؟" , "البرٹ آئن سٹائین "));
        arrayList.add(new ThreeItemModel("سب سے پہلے کس نے’ ایٹم ‘کا تصور دیا؟" , "کانڈا"));
        arrayList.add(new ThreeItemModel("الیکٹران سے کتنی بار پروٹون بھاری ہے؟" , "1836 بار"));
        arrayList.add(new ThreeItemModel("اے ایم یو کیا ہے؟" , "یہ جوہری ماس کی اکائی ہے"));
        arrayList.add(new ThreeItemModel("سورج اور دوسرے ستاروں سے نکلنے والی توانائی کس وجہ سے ہے؟" , "جوہری فیوژن"));
        arrayList.add(new ThreeItemModel("وہ قوت جو ایک مرکز کو اڑانے کے مترادف ہے؟" , "الیکٹرو اسٹٹیٹک پسپائی"));
        arrayList.add (new ThreeItemModel("کون سی طاقت جوہری نیوکللی کو ساتھ رکھنے کی ذمہ دار ہے؟" , "صرف ایٹمی قوت"));
        arrayList.add(new ThreeItemModel("الیکٹران ایٹم کے روڈرفورڈ ماڈل کے مطابق کیسے حرکت کرتے ہیں؟", "الیکٹران مثبت چارج والے مرکزوں کا مدار رکھتے ہیں"));
        arrayList.add(new ThreeItemModel("تصویر سے بجلی کے اخراج کا رجحان کیا ہوتا ہے؟" , "روشنی کی کوانٹم فطرت"));
        arrayList.add(new ThreeItemModel("توانائی کا اخراج کب ہوتا ہے؟", "ایک الیکٹران اعلی مدار سے نچلے مدار میں کودتا ہے" ));
        arrayList.add(new ThreeItemModel("رتھر فورڈ کے سونے کے ورق تجربے سے کیا ثابت ہوا؟" , "مثبت چارج شدہ پروٹون ایٹم کے مرکز میں موجود ہیں"));


        return arrayList;
    }


}
