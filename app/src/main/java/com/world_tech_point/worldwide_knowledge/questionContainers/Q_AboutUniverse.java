package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_AboutUniverse {


    private Context context;
    public Q_AboutUniverse(Context context) {
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

          arrayList.add(new ThreeItemModel("Which planets do not have moons?", " Mercury and Venus"));
        arrayList.add(new ThreeItemModel("How much larger the Sun is than Earth?", "300000 times"));
        arrayList.add(new ThreeItemModel("When the Halley’s Comet will be visible from Earth again?", "2061"));
        arrayList.add(new ThreeItemModel("What is the surface temperature of Venus over 450 degrees?", "Celsius"));
        arrayList.add(new ThreeItemModel("When was the Solar System formed ?", "around 4.6 billion years ago"));
        arrayList.add(new ThreeItemModel("A person who weighs 200 pounds on earth, what would he weigh on the surface ofMars?", "76 pounds"));
        arrayList.add(new ThreeItemModel("Which Planet spins backwards relative to the others?", "Venus"));
        arrayList.add(new ThreeItemModel("When was the first man made object sent into space?", "1957"));
        arrayList.add(new ThreeItemModel("Name Jupiter’s 4 biggest moons?", "Europa, Ganymede, Callisto and Io"));
        arrayList.add(new ThreeItemModel("Why do we have high & low tides ?", "because of the Sun & Moons gravity"));
        arrayList.add(new ThreeItemModel("Where is The “edge of space” located ?", "100 km (62 mi) above sea level"));
        arrayList.add(new ThreeItemModel("What is an astronaut employed by the Russian Federal Space Agency called?", "Kosmonavt"));

        arrayList.add(new ThreeItemModel("Which star is at the center of our Solar System?", "Sun"));
        arrayList.add(new ThreeItemModel("What is the diameter of Sun?", "1,392,684 km (865,374 mi)"));
        arrayList.add(new ThreeItemModel("What percent of the solar system’s mass does Sun holds?", "99.8 percent"));
        arrayList.add(new ThreeItemModel("How many stars are in the Milky Way?", "more than 100 billion"));
        arrayList.add(new ThreeItemModel("When was Sun born?", "roughly 4.6 billion years ago"));
        arrayList.add(new ThreeItemModel("What is the distance between sun and earth?", "92,960,000 miles (149,600,000 km)"));
        arrayList.add(new ThreeItemModel("Sun’s Chemical Composition ?", "71% of Hydrogen, 26.5% Helium and2.5% of other elements"));
        arrayList.add(new ThreeItemModel("How much time does sun rays take to reach earth?", "8 minutes"));
        arrayList.add(new ThreeItemModel("Which planet isnearest tothe earth ?", "MERCURY"));
        arrayList.add(new ThreeItemModel("Which planet is known as the Morning Star or the Evening Star?", "VENUS"));
        arrayList.add(new ThreeItemModel("What is the diameter of MERCURY?", "3,032 miles (4,879 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of VENUS?", "7,521 miles (12,104 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of EARTH?", "7,918 miles (12,742 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of MARS?", "4,212 miles (6,779 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of JUPITER?", "86,881 miles (139,822 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of SATURN?", "120 536 kilometers"));
        arrayList.add(new ThreeItemModel("What is the diameter of URANUS ?", "31,518 miles (50,724 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of NEPTUNE?", "30,599 miles (49,244 km)"));
        arrayList.add(new ThreeItemModel("What is the diameter of PLUTO ?", "2360 kilometers"));
        arrayList.add(new ThreeItemModel("Which is the largest planet in our solar system?", "JUPITER"));
        arrayList.add(new ThreeItemModel("Which Planet Has the Most Moons?", "the planet with the most number of moons is Jupiter with 66 moons"));
        arrayList.add(new ThreeItemModel("Which planet is closest to the sun?", "name of the closest planet to the sun is : Mercury"));
        arrayList.add(new ThreeItemModel("Which Is the Hottest Planet in the solar system ?", "Venus"));
        arrayList.add(new ThreeItemModel("Which Planets Have Rings around Them?", "Saturn,Jupiter, Uranus, and Neptune (4 planets)"));
        arrayList.add(new ThreeItemModel("Which is the coldest andsmallest of all planets?", "PLUTO"));
        arrayList.add(new ThreeItemModel("Which Star is called Earth’s satellite ?", "Moon"));
        arrayList.add(new ThreeItemModel("What is the Average distance of Moon from Earth ?", "238,855 miles (384,400 km)"));
        arrayList.add(new ThreeItemModel("What is the age of Moon?", "4.527 billion years"));
        arrayList.add(new ThreeItemModel("What is the Orbital period of Moon?", "27 days"));
        arrayList.add(new ThreeItemModel("What is the Circumference of Moon?", "6,784 miles (10,917 km)."));
        arrayList.add(new ThreeItemModel("Which planet has the most volcanoes?", "Venus"));


        arrayList.add(new ThreeItemModel("Who was the first person to reach space?", "Yuri Gagarin, in 1961."));
        arrayList.add(new ThreeItemModel("Who was the first woman to reach space?", "Valentina Tereshkova, in 1963"));
        arrayList.add(new ThreeItemModel("Name five recognized dwarf planets ?", "Pluto, Ceres, Eris, Makemake & Haumea"));
        arrayList.add(new ThreeItemModel("The Moon orbits the Earth every?", "27.3 days"));
        arrayList.add(new ThreeItemModel("Who was the first person to set foot on the Moon ?", "Neil Armstrong"));
        arrayList.add(new ThreeItemModel("What is the average surface temperature of the Moon?", "107 degrees Celsius during the day and -153 degrees Celsius at night"));
        arrayList.add(new ThreeItemModel("When does a lunar eclipse occur ?", "when the Earth is between — the Sun and the Moon"));
        arrayList.add(new ThreeItemModel("At how mush speed Moon moves across the Sun?", "2,250 km per hour"));
        arrayList.add(new ThreeItemModel("How long a solar eclipse can last ?", "7 and a half minutes"));
        arrayList.add(new ThreeItemModel("What is the Equatorial Circumference of Earth?", "40,030 km"));
        arrayList.add(new ThreeItemModel("What is Earth’s surface temperature ?", "88 to 58°C"));
        arrayList.add(new ThreeItemModel("When was the Earth formed approximately ?", "4.54 billion years ago"));
        arrayList.add(new ThreeItemModel("How many natural satellites of Earth are there ?", "one, Moon"));
        arrayList.add(new ThreeItemModel("What are the notable satellites of Mars ?", "Phobos & Deimos"));
        arrayList.add(new ThreeItemModel("Which planet has approximately the same landmass as Earth?", "Mars"));
        arrayList.add(new ThreeItemModel("What are the notable satellites of Pluto ?", "Charon, Nix, Hydra, Kerberos and Styx"));
        arrayList.add(new ThreeItemModel("When was the Pluto reclassified from a planet to a dwarf planet?", "in 2006"));
        arrayList.add(new ThreeItemModel("How many stars are there in Andromeda Galaxy ?", "1 trillion"));
        arrayList.add(new ThreeItemModel("At which speed the Andromeda Galaxy is approaching the Milky Way?", "at approximately hundred to hundred and forty kilometers per second."));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

         arrayList.add(new ThreeItemModel("কোন গ্রহের চাঁদ নেই?", "বুধ এবং শুক্র"));
        arrayList.add(new ThreeItemModel("পৃথিবীর চেয়ে সূর্য কত বড়?", "300000 বার"));
        arrayList.add(new ThreeItemModel("হ্যালির ধূমকেতুটি যখন আবার পৃথিবী থেকে দৃশ্যমান হবে?", "2061"));
        arrayList.add(new ThreeItemModel("শুক্রের ভূপৃষ্ঠের তাপমাত্রা 450 ডিগ্রির বেশি কত?", "সেলসিয়াস"));
        arrayList.add(new ThreeItemModel("সৌরজগত কখন গঠিত হয়েছিল?", "প্রায় ৪. 4. বিলিয়ন বছর আগে"));
        arrayList.add(new ThreeItemModel("যে ব্যক্তি পৃথিবীতে 200 পাউন্ড ওজনের হয়, তিনি মার্সের পৃষ্ঠের ওজনের কী হবে?", "76 পাউন্ড"));
        arrayList.add(new ThreeItemModel("কোন প্ল্যানেট অন্যের তুলনায় পিছনের দিকে স্পিন করে?", "শুক্র"));
        arrayList.add(new ThreeItemModel("মহাশূন্যে প্রথম মানুষটিকে কখন প্রেরণ করা হয়েছিল?", "1957"));
        arrayList.add(new ThreeItemModel("বৃহস্পতির 4 বৃহত্তম চাঁদের নাম?", "ইউরোপা, গ্যানিমেড, কলিস্টো এবং আইও"));
        arrayList.add(new ThreeItemModel("কেন আমাদের উচ্চ ও নিম্ন জোয়ার?", "সূর্য ও চাঁদের মাধ্যাকর্ষণ কারণে"));
        arrayList.add(new ThreeItemModel(" স্থানের কিনারা কোথায় অবস্থিত?", "সমুদ্রতল থেকে 100 কিলোমিটার (62 মাইল)"));
        arrayList.add(new ThreeItemModel("রাশিয়ান ফেডারেল স্পেস এজেন্সি দ্বারা নিযুক্ত কোন নভোচারী কী বলা হয়?", "কোসমনভেট"));

        arrayList.add(new ThreeItemModel("কোন সৌর আমাদের সৌরজগতের কেন্দ্রস্থলে?", "সান"));
        arrayList.add(new ThreeItemModel("সূর্যের ব্যাস কত?", "1,392,684 কিমি (865,374 মাইল)"));
        arrayList.add(new ThreeItemModel("সূর্য সৌরজগতের কত শতাংশ ভর ধারণ করে?", "99.8 শতাংশ"));
        arrayList.add(new ThreeItemModel("মিল্কিওয়েতে কত তারা আছেন?", "100 বিলিয়নেরও বেশি"));
        arrayList.add(new ThreeItemModel("সূর্যের জন্ম কখন হয়েছিল?", "প্রায় ৪.6 বিলিয়ন বছর আগে"));
        arrayList.add(new ThreeItemModel("সূর্য ও পৃথিবীর মধ্যে দূরত্ব কত?", "92,960,000 মাইল (149,600,000 কিলোমিটার)"));
        arrayList.add(new ThreeItemModel("সূর্যের রাসায়নিক গঠন?", "হাইড্রোজেনের 71%, 26.5% হেলিয়াম এবং অন্যান্য উপাদানগুলির 2.5.5%"));
        arrayList.add(new ThreeItemModel("পৃথিবীতে পৌঁছতে সূর্যের রশ্মি কত সময় নেয়?", "8 মিনিট"));
        arrayList.add(new ThreeItemModel("কোন গ্রহ পৃথিবীর নিকটবর্তী?", "রহস্যময়"));
        arrayList.add(new ThreeItemModel("কোন গ্রহটি মর্নিং স্টার বা সান্ধ্য তারকা হিসাবে পরিচিত?", "ভেনাস"));
        arrayList.add(new ThreeItemModel("MERCURY এর ব্যাস কত?", "3,032 মাইল (4,879 কিমি)"));
        arrayList.add(new ThreeItemModel("ভেনুসের ব্যাস কত?", "7,521 মাইল (12,104 কিমি)"));
        arrayList.add(new ThreeItemModel("EARTH এর ব্যাস কত?", "7,918 মাইল (12,742 কিমি)"));
        arrayList.add(new ThreeItemModel("MARS এর ব্যাস কত?", "4,212 মাইল (6,779 কিমি)"));
        arrayList.add(new ThreeItemModel("JUPITER এর ব্যাস কত?", "86,881 মাইল (139,822 কিমি)"));
        arrayList.add(new ThreeItemModel("SATURN এর ব্যাস কত?", "120 536 কিলোমিটার"));
        arrayList.add(new ThreeItemModel("ইউরানাসের ব্যাস কত?", "31,518 মাইল (50,724 কিমি)"));
        arrayList.add(new ThreeItemModel("নীপটুনের ব্যাস কত?", "30,599 মাইল (49,244 কিমি)"));
        arrayList.add(new ThreeItemModel("PLUTO এর ব্যাস কত?", "2360 কিলোমিটার"));
        arrayList.add(new ThreeItemModel("আমাদের সৌরজগতের বৃহত্তম গ্রহ কোনটি?", "JUPITER"));
        arrayList.add(new ThreeItemModel("কোন গ্রহের সর্বাধিক চাঁদ রয়েছে?", "সবচেয়ে বেশি চাঁদ নিয়ে গ্রহটি বৃহস্পতিটি is 66 টি চাঁদ নিয়েছে"));
        arrayList.add(new ThreeItemModel("কোন গ্রহ সূর্যের নিকটতম?", "সূর্যের নিকটতম গ্রহের নাম: বুধ"));
        arrayList.add(new ThreeItemModel("সৌরজগতের হটেস্ট প্ল্যানেট কোনটি?", "শুক্র"));
        arrayList.add(new ThreeItemModel("কোন গ্রহে তাদের চারপাশে রিং রয়েছে?", "শনি, বৃহস্পতি, ইউরেনাস এবং নেপচুন (৪ টি গ্রহ)"));
        arrayList.add(new ThreeItemModel("সমস্ত গ্রহের মধ্যে সবচেয়ে শীতলতমতমতমতম কোনটি?", "প্লুটো"));
        arrayList.add(new ThreeItemModel("কোন তারাটিকে পৃথিবীর উপগ্রহ বলা হয়?", "চাঁদ"));
        arrayList.add(new ThreeItemModel("পৃথিবী থেকে চাঁদের গড় দূরত্ব কত?", "238,855 মাইল (384,400 কিমি)"));
        arrayList.add(new ThreeItemModel("চাঁদের বয়স কত?", "4.527 বিলিয়ন বছর"));
        arrayList.add(new ThreeItemModel("চাঁদের কক্ষপথকাল কত?", "২ days দিন"));
        arrayList.add(new ThreeItemModel("চাঁদের পরিধি কী?", "6,784 মাইল (10,917 কিমি)"));
        arrayList.add(new ThreeItemModel("কোন গ্রহের সর্বাধিক আগ্নেয়গিরি রয়েছে?", "শুক্র"));

        arrayList.add(new ThreeItemModel("মহাকাশে পৌঁছানোর প্রথম ব্যক্তি কে?", "ইউরি গাগারিন, 1961 সালে।"));
        arrayList.add(new ThreeItemModel("মহাকাশে পৌঁছে প্রথম মহিলা কে?", "ভ্যালেন্টিনা তেরেশকোভা, ১৯ 19৩ সালে"));
        arrayList.add(new ThreeItemModel("স্বীকৃত পাঁচটি বামন গ্রহের নাম বলুন?", "প্লুটো, সেরেস, এরিস, মেকমেক এবং হাউমিয়া"));
        arrayList.add(new ThreeItemModel("চাঁদ প্রতিটি পৃথিবী প্রদক্ষিণ করে?", "27.3 দিন"));
        arrayList.add(new ThreeItemModel("চাঁদে পা রাখার প্রথম ব্যক্তি কে?", "নীল আর্মস্ট্রং"));
        arrayList.add(new ThreeItemModel("চাঁদের গড় তাপমাত্রা কত?", "দিনের বেলা 107 ডিগ্রি সেলসিয়াস এবং রাতে -153 ডিগ্রি সেলসিয়াস"));
        arrayList.add(new ThreeItemModel("কখন চন্দ্রগ্রহণ হয়?", "যখন পৃথিবী - সূর্য ও চাঁদের মাঝে থাকে"));
        arrayList.add(new ThreeItemModel("মুন গতিতে কত চাঁদ সূর্যের ওপারে চলে?", "প্রতি ঘন্টা ২,২৫০ কিমি"));
        arrayList.add(new ThreeItemModel("কতক্ষণ একটি সূর্যগ্রহণ স্থায়ী হতে পারে?", "সাড়ে সাত মিনিট"));
        arrayList.add(new ThreeItemModel("পৃথিবীর নিরক্ষীয় চক্রটি কী?", "40,030 কিমি"));
        arrayList.add(new ThreeItemModel("পৃথিবীর পৃষ্ঠের তাপমাত্রা কী?", "88 থেকে 58 58 C"));
        arrayList.add(new ThreeItemModel("পৃথিবীটি প্রায় কখন গঠিত হয়েছিল?", "4.54 বিলিয়ন বছর আগে"));
        arrayList.add(new ThreeItemModel("পৃথিবীর কতটি প্রাকৃতিক উপগ্রহ রয়েছে?", "এক, চাঁদ"));
        arrayList.add(new ThreeItemModel("মঙ্গল গ্রহের উল্লেখযোগ্য উপগ্রহগুলি কী?", "ফোবস এবং ডিমোস"));
        arrayList.add(new ThreeItemModel("কোন গ্রহের পৃথিবীর মতো প্রায় ল্যান্ডমাস রয়েছে?", "মঙ্গল"));
        arrayList.add(new ThreeItemModel("প্লুটো-এর উল্লেখযোগ্য উপগ্রহ কি?", "চারন, নিক্স, হাইড্রা, কার্বেরোস এবং স্টাইক্স"));
        arrayList.add(new ThreeItemModel("প্লুটো কখন একটি গ্রহ থেকে বামন গ্রহে পুনর্গঠিত হয়েছিল?", "২০০ 2006 সালে"));
        arrayList.add(new ThreeItemModel("অ্যান্ড্রোমিডা গ্যালাকিতে কত তারা আছেন?", "1 ট্রিলিয়ন"));
        arrayList.add(new ThreeItemModel("অ্যান্ড্রোমিডা গ্যালাক্সি কোন গতিতে মিল্কিওয়ের কাছে পৌঁছেছে?", "প্রতি সেকেন্ডে প্রায় শতাধিক থেকে একশো চল্লিশ কিলোমিটারে।"));



        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("कौन सा तारा हमारे सौर मंडल के केंद्र में है?", "सूर्य"));
        arrayList.add(new ThreeItemModel("सूर्य का व्यास क्या है?", "1,392,684 किमी (865,374 मील)"));
        arrayList.add(new ThreeItemModel("सौर प्रणाली के द्रव्यमान का कितना प्रतिशत सूर्य धारण करता है?", "99.8 प्रतिशत"));
        arrayList.add(new ThreeItemModel("कितने सितारे मिल्की वे में हैं?", "100 बिलियन से अधिक"));
        arrayList.add(new ThreeItemModel("सूर्य का जन्म कब हुआ?", "लगभग 4.6 बिलियन साल पहले"));
        arrayList.add(new ThreeItemModel("सूर्य और पृथ्वी के बीच की दूरी क्या है?", "92,960,000 मील (149,600,000 किमी)"));
        arrayList.add(new ThreeItemModel("सन के रासायनिक संरचना?", "हाइड्रोजन का 71%, 26.5% हीलियम और अन्य तत्वों का 2.5%"));
        arrayList.add(new ThreeItemModel("सूर्य की किरणों को पृथ्वी तक पहुँचने में कितना समय लगता है?", "8 मिनट"));
        arrayList.add(new ThreeItemModel("कौन सा ग्रह नार्थस्ट टोटे अर्थ है?", "मर्किरी"));
        arrayList.add(new ThreeItemModel("कौन सा ग्रह मॉर्निंग स्टार या ईवनिंग स्टार के रूप में जाना जाता है?", "वीनस"));
        arrayList.add(new ThreeItemModel("MURURY का व्यास क्या है?", "3,032 मील (4,879 किमी"));
        arrayList.add(new ThreeItemModel("वीनस का व्यास क्या है?", "7,521 मील (12,104 किमी)"));
        arrayList.add(new ThreeItemModel("EARTH का व्यास क्या है?", "7,918 मील (12,742 किमी)"));
        arrayList.add(new ThreeItemModel("MARS का व्यास क्या है?", "4,212 मील (6,779 किमी)"));
        arrayList.add(new ThreeItemModel("JUPITER का व्यास क्या है?", "86,881 मील (139,822 किमी)"));
        arrayList.add(new ThreeItemModel("SATURN का व्यास क्या है?", "120 536 किलोमीटर"));
        arrayList.add(new ThreeItemModel("यूरेनस का व्यास क्या है?", "31,518 मील (50,724 किमी)"));
        arrayList.add(new ThreeItemModel("NEPTUNE का व्यास क्या है?", "30,599 मील (49,244 किमी)"));
        arrayList.add(new ThreeItemModel("PLUTO का व्यास क्या है?", "2360 किलोमीटर"));
        arrayList.add(new ThreeItemModel("हमारे सौरमंडल का सबसे बड़ा ग्रह कौन सा है?", "JUPITER"));
        arrayList.add(new ThreeItemModel("किस ग्रह के पास सबसे अधिक चंद्रमा हैं?", "चंद्रमा की सबसे अधिक संख्या वाला ग्रह 66 चंद्रमाओं वाला बृहस्पति है?"));
        arrayList.add(new ThreeItemModel("कौन सा ग्रह सूर्य के सबसे निकट है?", "सूर्य के सबसे निकट का ग्रह है: बुध"));
        arrayList.add(new ThreeItemModel("कौन सा सौरमंडल में सबसे गर्म ग्रह है?", "शुक्र"));
        arrayList.add(new ThreeItemModel("शनि के चारों ओर कौन से ग्रह हैं?", "शनि, बृहस्पति, यूरेनस और नेपच्यून (4 ग्रह)"));
        arrayList.add(new ThreeItemModel("सभी ग्रहों में सबसे ठंडा और सबसे छोटा कौन है?", "PLUTO"));
        arrayList.add(new ThreeItemModel("किस तारे को पृथ्वी का उपग्रह कहा जाता है?", "चंद्रमा"));
        arrayList.add(new ThreeItemModel("पृथ्वी से चंद्रमा की औसत दूरी क्या है?", "238,855 मील (384,400 किमी)"));
        arrayList.add(new ThreeItemModel("चंद्रमा की आयु क्या है?", "4.527 बिलियन वर्ष"));
        arrayList.add(new ThreeItemModel("चंद्रमा का कक्षीय काल क्या है?", "27 दिन"));
        arrayList.add(new ThreeItemModel("चंद्रमा की परिधि क्या है?", "6,784 मील (10,917 किमी)।"));
        arrayList.add(new ThreeItemModel("किस ग्रह में सबसे अधिक ज्वालामुखी हैं?", "शुक्र"));
        arrayList.add(new ThreeItemModel("किन ग्रहों में चंद्रमा नहीं हैं?", "बुध और शुक्र"));
        arrayList.add(new ThreeItemModel("सूर्य पृथ्वी से कितना बड़ा है?", "300000 बार"));
        arrayList.add(new ThreeItemModel("जब हैली धूमकेतु पृथ्वी से फिर से दिखाई देगा?", "2061"));
        arrayList.add(new ThreeItemModel("शुक्र का सतह का तापमान 450 डिग्री से अधिक है?", "सेल्सियस"));
        arrayList.add(new ThreeItemModel("सौर प्रणाली का गठन कब हुआ?", "लगभग 4.6 बिलियन साल पहले"));
        arrayList.add(new ThreeItemModel("एक व्यक्ति जो पृथ्वी पर 200 पाउंड वजन का होता है, वहMars की सतह पर क्या तौलेगा?", "76 पाउंड"));
        arrayList.add(new ThreeItemModel("कौन सा ग्रह दूसरों के सापेक्ष पीछे की ओर घूमता है?", "शुक्र"));
        arrayList.add(new ThreeItemModel("अंतरिक्ष में भेजा गया पहला आदमी कब बनाया गया?", "1957"));
        arrayList.add(new ThreeItemModel("नाम बृहस्पति के 4 सबसे बड़े चंद्रमाएं?", "यूरोपा, गेनीमेड, कैलिस्टो और Io"));
        arrayList.add(new ThreeItemModel("हमारे पास उच्च और निम्न ज्वार क्यों हैं?", "सूर्य और चंद्रमा के गुरुत्वाकर्षण के कारण"));
        arrayList.add(new ThreeItemModel("द स्पेस ऑफ़ एज कहाँ स्थित है? "," 100 किमी (62 मील) समुद्र तल से ऊपर "));
        arrayList.add(new ThreeItemModel("एक संघीय अंतरिक्ष एजेंसी द्वारा नियुक्त अंतरिक्ष यात्री को क्या कहा जाता है?", "कोसोनोमवेट"));
        arrayList.add(new ThreeItemModel("अंतरिक्ष में पहुंचने वाला पहला व्यक्ति कौन था?", "1961 में यूरी गगारिन।"));
        arrayList.add(new ThreeItemModel("अंतरिक्ष में पहुंचने वाली पहली महिला कौन थी?", "1963 वैलेनटीना टेरेशकोवा"));
        arrayList.add(new ThreeItemModel("नाम पांच मान्यता प्राप्त बौने ग्रह?", "प्लूटो, सेरेस, एरिस, माकेमेक और ह्यूमिया"));
        arrayList.add(new ThreeItemModel("चंद्रमा हर दिन पृथ्वी की परिक्रमा करता है?", "27.3 दिन"));
        arrayList.add(new ThreeItemModel("चंद्रमा पर पैर रखने वाला पहला व्यक्ति कौन था?", "नील आर्मस्ट्रांग"));
        arrayList.add(new ThreeItemModel("चंद्रमा का औसत तापमान क्या है?", "दिन के दौरान 107 डिग्री सेल्सियस और रात में -153 डिग्री सेल्सियस"));
        arrayList.add(new ThreeItemModel("When does a lunar eclipse occur ?", "when the Earth is between — the Sun and the Moon"));
        arrayList.add(new ThreeItemModel("2,250 किमी प्रति घंटे की गति से"," चंद्रमा सूर्य पर कैसे गति करता है?"));
        arrayList.add(new ThreeItemModel("सूर्य ग्रहण कितने समय तक चल सकता है?", "साढ़े 7 मिनट"));
        arrayList.add(new ThreeItemModel("पृथ्वी की भूमध्यरेखीय परिधि क्या है?", "40,030 किमी"));
        arrayList.add(new ThreeItemModel("पृथ्वी की सतह का तापमान क्या है?", "88 से 58 ° C"));
        arrayList.add(new ThreeItemModel("पृथ्वी का गठन लगभग कब हुआ था?", "4.54 बिलियन साल पहले"));
        arrayList.add(new ThreeItemModel("पृथ्वी के कितने प्राकृतिक उपग्रह हैं?", "एक, चंद्रमा"));
        arrayList.add(new ThreeItemModel("मंगल के उल्लेखनीय उपग्रह क्या हैं?", "फोबोस और डीमोस"));
        arrayList.add(new ThreeItemModel("कौन सा ग्रह पृथ्वी के समान लगभग एक ही भूभाग है?", "मंगल"));
        arrayList.add(new ThreeItemModel("प्लूटो के उल्लेखनीय उपग्रह क्या हैं?", "चारोन, निक्स, हाइड्रा, केर्बरोस और स्टाइलएक्स"));
        arrayList.add(new ThreeItemModel( "में प्लूटो कब एक ग्रह से एक बौने ग्रह के रूप में पुनर्वर्गीकृत किया गया था? ","2006"));
        arrayList.add(new ThreeItemModel("एंड्रोमेडा गैलेक्सी में कितने सितारे हैं?", "1 ट्रिलियन"));
        arrayList.add(new ThreeItemModel("किस गति से एंड्रोमेडा गैलेक्सी मिल्की वे के पास आ रही है?", "लगभग सौ से सौ और चालीस किलोमीटर प्रति सेकंड।"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("ہمارے شمسی نظام کے مرکز میں کون سا ستارہ ہے؟" , "سن"));
        arrayList.add(new ThreeItemModel("سورج کا قطر کیا ہے؟" , "1،392،684 کلومیٹر (865،374 میل)"));
        arrayList.add(new ThreeItemModel("سورج نظام شمسی کے بڑے پیمانے پر کتنے فیصد پر مشتمل ہے؟" , "99.8 فیصد"));
        arrayList.add(new ThreeItemModel("آکاشگنگے میں کتنے ستارے ہیں؟" , "100 ارب سے زیادہ"));
        arrayList.add(new ThreeItemModel("سورج کب پیدا ہوا؟" , "تقریبا 4. 4.6 بلین سال پہلے"));
        arrayList.add(new ThreeItemModel("سورج اور زمین کے درمیان فاصلہ کتنا ہے؟" , "92،960،000 میل (149،600،000 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("سورج کا کیمیکل مرکب؟" , "ہائیڈروجن کا 71٪ ، 26.5٪ ہیلیم اور 2.5.5٪ دوسرے عناصر"));
        arrayList.add(new ThreeItemModel("سورج کی کرنوں کو زمین تک پہنچنے میں کتنا وقت لگتا ہے؟" , "8 منٹ"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ زمین پر نزدیک آتا ہے؟" , "مکروری"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ صبح کا ستارہ یا شام کا ستارہ کے نام سے جانا جاتا ہے؟" , "وینس"));
        arrayList.add(new ThreeItemModel("مرکیوری کا قطر کیا ہے؟" , "3،032 میل (4،879 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("VENUS کا قطر کیا ہے؟" , "7،521 میل (12،104 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("EARTH کا قطر کیا ہے؟" , "7،918 میل (12،742 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("MARS کا قطر کیا ہے؟" , "4،212 میل (6،779 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("JUPITER کا قطر کیا ہے؟" , "86،881 میل (139،822 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("SATURN کا قطر کیا ہے؟" , "120 536 کلومیٹر"));
        arrayList.add(new ThreeItemModel("یوراناس کا قطر کیا ہے؟" , "31،518 میل (50،724 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("نیپٹون کا قطر کیا ہے؟" , "30،599 میل (49،244 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("پلوٹو کا قطر کیا ہے؟" , "2360 کلومیٹر"));
        arrayList.add(new ThreeItemModel("ہمارے نظام شمسی کا سب سے بڑا سیارہ کونسا ہے؟" , "JUPITER"));
        arrayList.add(new ThreeItemModel("کون سے سیارے کو سب سے زیادہ چاند لگے ہیں؟" , "چاندوں کی سب سے زیادہ تعداد والا سیارہ 66 چاندوں والا مشتری ہے۔"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ سورج کے قریب ہے؟" , "سورج کے قریب ترین سیارے کا نام ہے: مرکری"));
        arrayList.add(new ThreeItemModel("نظام شمسی کا سب سے مشہور سیارہ کونسا ہے؟" , "وینس"));
        arrayList.add(new ThreeItemModel("ان کے گرد کون سے سیارے بجتے ہیں؟" , "زحل ، مشتری ، یورینس اور نیپچون (4 سیارے)"));
        arrayList.add(new ThreeItemModel("تمام سیاروں میں سب سے زیادہ ٹھنڈا کون سا ہے؟" , "پلوٹو"));
        arrayList.add(new ThreeItemModel("کس ستارے کو زمین کا مصنوعی سیارہ کہا جاتا ہے؟" , "چاند"));
        arrayList.add(new ThreeItemModel("زمین سے چاند کا اوسط فاصلہ کتنا ہے؟" , "238،855 میل (384،400 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("چاند کی عمر کتنی ہے؟" , "4.527 بلین سال"));
        arrayList.add(new ThreeItemModel("چاند کی مداری مدت کتنی ہے؟" , "27 دن"));
        arrayList.add(new ThreeItemModel("چاند کا طواف کیا ہے؟" , "6،784 میل (10،917 کلومیٹر)"));
        arrayList.add(new ThreeItemModel("کون سے سیارے میں سب سے زیادہ آتش فشاں ہیں؟" , "وینس"));
        arrayList.add(new ThreeItemModel("کون سے سیاروں میں چاند نہیں ہوتے؟" , "مرکری اور وینس"));
        arrayList.add(new ThreeItemModel("سورج زمین سے کتنا بڑا ہے؟" , "300000 اوقات"));
        arrayList.add(new ThreeItemModel("جب ہیلی کا دومکیت ایک بار پھر زمین سے نظر آئے گا؟" , "2061"));
        arrayList.add(new ThreeItemModel("زہرہ کا درجہ حرارت 450 ڈگری سے زیادہ کیا ہے؟" , "سیلسیس"));
        arrayList.add(new ThreeItemModel("شمسی نظام کب قائم ہوا؟" , "تقریبا 4. 6.6 بلین سال پہلے"));
        arrayList.add(new ThreeItemModel("ایک شخص جس کا وزن زمین پر 200 پاؤنڈ ہے ، اس کا وزن مارس کی سطح پر کیا ہوگا؟" , "76 پاؤنڈ"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ دوسروں کی نسبت پیچھے کی طرف گھومتا ہے؟" , "وینس"));
        arrayList.add(new ThreeItemModel("خلاء میں پہلے انسان کو بنایا گیا سامان کب بھیجا گیا تھا؟" , "1957"));
        arrayList.add(new ThreeItemModel("مشتری کے 4 سب سے بڑے چاند کا نام بتائیں؟" , "یوروپا ، گنیمیڈ ، کالیستو اور آئی او"));
        arrayList.add(new ThreeItemModel("ہمارے پاس اونچ نیچ کی لہر کیوں ہے؟" , "سورج اور چاند کی کشش ثقل کی وجہ سے"));
        arrayList.add(new ThreeItemModel("جگہ کے کنارے کہاں واقع ہے؟ "," سطح سمندر سے 100 کلومیٹر (62 میل) "));
        arrayList.add(new ThreeItemModel("روسی فیڈرل اسپیس ایجنسی کے ذریعہ ملازمت کرنے والے خلاباز کو کیا کہتے ہیں؟" , "کوسمونوت"));
        arrayList.add(new ThreeItemModel("خلا میں پہنچنے والا پہلا شخص کون تھا؟" , "یوری گیگرین ، 1961 میں۔"));
        arrayList.add(new ThreeItemModel("خلا میں پہنچنے والی پہلی خاتون کون تھیں؟" , "ویلنٹینا تیریشکووا ، 1963 میں"));
        arrayList.add(new ThreeItemModel("پانچ تسلیم شدہ بونے سیاروں کے نام بتائیں؟" , "پلوٹو ، سیرس ، ایرس ، میک میکیک اور ہومیا"));
        arrayList.add(new ThreeItemModel("چاند ہر بار زمین کا چکر لگاتا ہے؟" , "27.3 دن"));
        arrayList.add(new ThreeItemModel("چاند پر قدم رکھنے والا پہلا شخص کون تھا؟" , "نیل آرمسٹرانگ"));
        arrayList.add(new ThreeItemModel("چاند کا اوسط درجہ حرارت کتنا ہے؟" , "دن کے وقت 107 ڈگری سینٹی گریڈ اور رات کو -153 ڈگری سینٹی گریڈ"));
        arrayList.add(new ThreeItemModel("جب چاند گرہن ہوتا ہے؟" , "جب زمین - سورج اور چاند کے درمیان ہوتا ہے"));
        arrayList.add(new ThreeItemModel("چاند کس طرح تیز رفتار سے سورج کے پار پار ہوتا ہے؟" , "2،250 کلومیٹر فی گھنٹہ"));
        arrayList.add(new ThreeItemModel("سورج گرہن کتنے دن چل سکتا ہے؟" , "ساڑھے سات منٹ"));
        arrayList.add(new ThreeItemModel("زمین کا استوائی دائرہ کیا ہے؟" , "40،030 کلومیٹر"));
        arrayList.add(new ThreeItemModel("زمین کا درجہ حرارت کیا ہے؟" , "88 سے 58 ° C"));
        arrayList.add(new ThreeItemModel("زمین تقریبا formed کب تشکیل دی گئی؟" , "4.54 بلین سال پہلے"));
        arrayList.add(new ThreeItemModel("زمین کے کتنے قدرتی مصنوعی سیارہ ہیں؟" , "ایک ، چاند"));
        arrayList.add(new ThreeItemModel("مریخ کے قابل ذکر مصنوعی سیارہ کیا ہیں؟" , "فونوس اور ڈیموس"));
        arrayList.add(new ThreeItemModel("کون سا سیارہ زمین کے لگ بھگ اتنا ہی لینڈ سڈم رکھتا ہے؟" , "مریخ"));
        arrayList.add(new ThreeItemModel("پلوٹو کے قابل ذکر مصنوعی سیارہ کیا ہیں؟" , "چارون ، نکس ، ہائیڈرا ، کیربیروز اور اسٹیکس"));
        arrayList.add(new ThreeItemModel("2006 میں پلوٹو کو کسی سیارے سے بونے سیارے پر دوبارہ نوکیا کیا گیا تھا؟" , "2006 میں"));
        arrayList.add(new ThreeItemModel("اینڈومیڈا گلیکسی میں کتنے ستارے ہیں؟" , "1 ٹریلین"));
        arrayList.add(new ThreeItemModel("اینڈومیڈا کہکشاں آکاشگنگا کے قریب کس رفتار سے آرہی ہے؟" , "تقریبا سو سے سو اور چالیس کلومیٹر فی سیکنڈ میں۔"));




        return arrayList;
    }


}
