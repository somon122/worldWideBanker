package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class WorldUniverse {
    private Context context;

    public WorldUniverse(Context context) {
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


       arrayList.add(new ContentQuestionModel("What is the diameter of SATURN?","321456 kiloeters","236547 kilometers","1250120 kilometers","120 536 kilometers","120 536 kilometers"));
        arrayList.add(new ContentQuestionModel("What is the diameter of URANUS?","32 125 miles","31,518 miles (50,724 km)","25852 miles","25698 miles","31,518 miles (50,724 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of NEPTUNE?","30,599 miles (49,244 km)","25852 miles","32145 miles","36987 miles","30,599 miles (49,244 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of PLUTO?","1458 kilometers","3214 kilometers","3365 kilometers"," 2360 kilometers"," 2360 kilometers"));
        arrayList.add(new ContentQuestionModel("Which is the largest planet in our solar system?","JUPITER","Earth","Mars","Saturn","JUPITER"));
        arrayList.add(new ContentQuestionModel("Which Planet Has the Most Moons?","Earth","Saturn","Jupiter with 66 moons","Mars","Jupiter with 66 moons"));
        arrayList.add(new ContentQuestionModel("Which planet is closest to the sun?","Saturn","Mercury","Jupiter","Earth","Mercury"));
        arrayList.add(new ContentQuestionModel("Which Is the Hottest Planet in the solar system?","Venus","Mercury","Saturn","Jupiter","Venus"));
        arrayList.add(new ContentQuestionModel("Which Planets Have Rings around Them?","Saturn,Jupiter, Uranus, and Neptune (4 planets)","Earth","Venus","Mercury","Saturn,Jupiter, Uranus, and Neptune (4 planets)"));
        arrayList.add(new ContentQuestionModel("Which is the coldest andsmallest of all planets?","Earth","Mercury","Venus","PLUTO","PLUTO"));
        arrayList.add(new ContentQuestionModel("Which Star is called Earth’s satellite?","Neptune","Moon","Venus","Jupiter","Moon"));

        arrayList.add(new ContentQuestionModel("Which star is at the center of our Solar System? ","Sun","Earth","Mars","Jupitar ","Sun"));
        arrayList.add(new ContentQuestionModel("What is the diameter of Sun?","1,392,684 km (865,374 mi)","145263987 km","253698745 Km","236547895 km","1,392,684 km (865,374 mi)"));
        arrayList.add(new ContentQuestionModel("What percent of the solar system’s mass does Sun holds?","94.5 percent","98.5 percent","95.5 percent","99.8 percent","99.8 percent"));
        arrayList.add(new ContentQuestionModel("How many stars are in the Milky Way?","more than 500 billion"," more thant 300 billion","more than 100 billion","more than 200 billion","more than 100 billion"));
        arrayList.add(new ContentQuestionModel("When was Sun born?","roughly 4.8 billion years ago","roughly 4.10 billion years ago","roughly 4.6 billion years ago","roughly 4.7 billion years ago","roughly 4.6 billion years ago"));
        arrayList.add(new ContentQuestionModel("What is the distance between sun and earth?","92,960,000 miles (149,600,000 km)","92 966666 miles","123654789 miles","258963147 miles","92,960,000 miles (149,600,000 km)"));
        arrayList.add(new ContentQuestionModel("Sun’s Chemical Composition:","74% of Hydrogen, 26.5% Helium and2.5% of other elements","73% of Hydrogen, 26.5% Helium and2.5% of other elements","72% of Hydrogen, 26.5% Helium and2.5% of other elements","71% of Hydrogen, 26.5% Helium and2.5% of other elements","71% of Hydrogen, 26.5% Helium and2.5% of other elements"));
        arrayList.add(new ContentQuestionModel("How much time does sun rays take to reach earth?","12 minutes"," 8 minutes","10 minutes","9 minutes"," 8 minutes"));
        arrayList.add(new ContentQuestionModel("Which planet isnearest tothe earth?","Saturn ","Mars","Jupiter","MERCURY","MERCURY"));
        arrayList.add(new ContentQuestionModel("Which planet is known as the Morning Star or the Evening Star?","Saturn ","VENUS","Mars","Jupiter","VENUS"));
        arrayList.add(new ContentQuestionModel("What is the diameter of MERCURY?","3,032 miles (4,879 km)","3221 miles","1236 miles","2589 miles","3,032 miles (4,879 km)"));
        arrayList.add(new ContentQuestionModel(" What is the diameter of VENUS?","3251 miles","7,521 miles (12,104 km)","9521 miles","8521 miles","7,521 miles (12,104 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of EARTH?","2569 miles","9874 miles","8932 miles","7,918 miles (12,742 km)","7,918 miles (12,742 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of MARS?","3215 miles","4,212 miles (6,779 km)","2569 miles","7856 miles","4,212 miles (6,779 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of JUPITER?","96321 miles","86,881 miles (139,822 km)","32567 miles","12365 miles","86,881 miles (139,822 km)"));

        arrayList.add(new ContentQuestionModel("What is the Average distance of Moon from Earth?","2365478 miles","321456 miles","258745 miles","238,855 miles (384,400 km)","238,855 miles (384,400 km)"));
        arrayList.add(new ContentQuestionModel("What is the age of Moon?","9587 billion years","2537 billion years","4.527 billion years","3527 billion years","4.527 billion years"));
        arrayList.add(new ContentQuestionModel("What is the Orbital period of Moon?","27 days","57 days","47 days","37 days","27 days"));
        arrayList.add(new ContentQuestionModel("What is the Circumference of Moon?","9784 miles","6,784 miles (10,917 km)","8784 miles","7784 miles","6,784 miles (10,917 km)"));
        arrayList.add(new ContentQuestionModel("Which planet has the most volcanoes?","Venus","Mercury","Earth","Jupiter","Venus"));
        arrayList.add(new ContentQuestionModel("Which planets do not have moons?","Earth","Neptune","Jupiter","Mercury and Venus","Mercury and Venus"));
        arrayList.add(new ContentQuestionModel("How much larger the Sun is than Earth?","300000 times","600000 times","500000 times","400000 times","300000 times"));
        arrayList.add(new ContentQuestionModel("When the Halley’s Comet will be visible from Earth again?","3071","5041","2061","2051","2061"));
        arrayList.add(new ContentQuestionModel("What is the surface temperature of Venus?","over 450 degrees Celsius","over 650 degrees Celsius","over 550 degrees Celsius","over 350 degrees Celsius","over 450 degrees Celsius"));
        arrayList.add(new ContentQuestionModel("When was the Solar System formed?","","around 4.6 billion years ago","around 3.6 billion years ago","around 5.6 billion years ago","around 4.6 billion years ago"));
        arrayList.add(new ContentQuestionModel("A person who weighs 200 pounds on earth, what would he weigh on the surface of Mars?","76 pounds","46 pounds","56 pounds","66 pounds","76 pounds"));
        arrayList.add(new ContentQuestionModel("Which Planet spins backwards relative to the others?","Venus","Earth","Mars","Jupiter","Venus"));

        arrayList.add(new ContentQuestionModel("Which star is at the center of our Solar System? ","Sun","Earth","Mars","Jupitar ","Sun"));
        arrayList.add(new ContentQuestionModel("What is the diameter of Sun?","1,392,684 km (865,374 mi)","145263987 km","253698745 Km","236547895 km","1,392,684 km (865,374 mi)"));
        arrayList.add(new ContentQuestionModel("What percent of the solar system’s mass does Sun holds?","94.5 percent","98.5 percent","95.5 percent","99.8 percent","99.8 percent"));
        arrayList.add(new ContentQuestionModel("How many stars are in the Milky Way?","more than 500 billion"," more thant 300 billion","more than 100 billion","more than 200 billion","more than 100 billion"));
        arrayList.add(new ContentQuestionModel("When was Sun born?","roughly 4.8 billion years ago","roughly 4.10 billion years ago","roughly 4.6 billion years ago","roughly 4.7 billion years ago","roughly 4.6 billion years ago"));
        arrayList.add(new ContentQuestionModel("What is the distance between sun and earth?","92,960,000 miles (149,600,000 km)","92 966666 miles","123654789 miles","258963147 miles","92,960,000 miles (149,600,000 km)"));
        arrayList.add(new ContentQuestionModel("Sun’s Chemical Composition:","74% of Hydrogen, 26.5% Helium and2.5% of other elements","73% of Hydrogen, 26.5% Helium and2.5% of other elements","72% of Hydrogen, 26.5% Helium and2.5% of other elements","71% of Hydrogen, 26.5% Helium and2.5% of other elements","71% of Hydrogen, 26.5% Helium and2.5% of other elements"));
        arrayList.add(new ContentQuestionModel("How much time does sun rays take to reach earth?","12 minutes"," 8 minutes","10 minutes","9 minutes"," 8 minutes"));
        arrayList.add(new ContentQuestionModel("Which planet isnearest tothe earth?","Saturn ","Mars","Jupiter","MERCURY","MERCURY"));
        arrayList.add(new ContentQuestionModel("Which planet is known as the Morning Star or the Evening Star?","Saturn ","VENUS","Mars","Jupiter","VENUS"));
        arrayList.add(new ContentQuestionModel("What is the diameter of MERCURY?","3,032 miles (4,879 km)","3221 miles","1236 miles","2589 miles","3,032 miles (4,879 km)"));
        arrayList.add(new ContentQuestionModel(" What is the diameter of VENUS?","3251 miles","7,521 miles (12,104 km)","9521 miles","8521 miles","7,521 miles (12,104 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of EARTH?","2569 miles","9874 miles","8932 miles","7,918 miles (12,742 km)","7,918 miles (12,742 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of MARS?","3215 miles","4,212 miles (6,779 km)","2569 miles","7856 miles","4,212 miles (6,779 km)"));
        arrayList.add(new ContentQuestionModel("What is the diameter of JUPITER?","96321 miles","86,881 miles (139,822 km)","32567 miles","12365 miles","86,881 miles (139,822 km)"));

        arrayList.add(new ContentQuestionModel("When was the first man made object sent into space?","1986","1961","1957","1958","1957"));
        arrayList.add(new ContentQuestionModel("Name Jupiter’s 4 biggest moons:","Mars","Venus","Earth","Europa, Ganymede, Calisto and Io","Europa, Ganymede, Calisto and Io"));
        arrayList.add(new ContentQuestionModel("Why do we have high & low tides?","because of the Jupiter & Moons gravity","because of the Mars & Moons gravity","because of the Earth & Moons gravity","because of the Sun & Moons gravity","because of the Sun & Moons gravity"));
        arrayList.add(new ContentQuestionModel("Where is The “edge of space” located?","500 km","100 km (62 mi) above sea level","300 km","200 km","100 km (62 mi) above sea level"));
        arrayList.add(new ContentQuestionModel("What is an astronaut employed by the Russian Federal Space Agency called?","Pitter","Millar","Devill","Kosmonavt","Kosmonavt"));
        arrayList.add(new ContentQuestionModel("Who was the first person to reach space?"," Devid Hudson","Yuri Gagarin, in 1961","Kith Mery","Neil Armstrong","Yuri Gagarin, in 1961"));
        arrayList.add(new ContentQuestionModel("Who was the first woman to reach space?","Monika Narnag","Reena Keith","Mery Hussain","Valentina Tereshkova, in 1963","Valentina Tereshkova, in 1963"));
        arrayList.add(new ContentQuestionModel("Name five recognized dwarf planets :","Mars","Saturn","Jupiter","Pluto, Ceres, Eris, Make make & Haumea","Pluto, Ceres, Eris, Make make & Haumea"));
        arrayList.add(new ContentQuestionModel("The Moon orbits the Earth every –","27.3 days","14.5 days","29.5 days","28.3 days","27.3 days"));
        arrayList.add(new ContentQuestionModel("Who was the first person to set foot on the Moon?","Devid Hudson","Neil Armstrong","Kith Mery","Yuri Gegrin","Neil Armstrong"));
        arrayList.add(new ContentQuestionModel("What is the average surface temperature of the Moon?","307 degrees Celsius during the day and -453 degrees Celsius at night","407 degrees Celsius during the day and -253 degrees Celsius at night","207 degrees Celsius during the day and -253 degrees Celsius at night","107 degrees Celsius during the day and -153 degrees Celsius at night","107 degrees Celsius during the day and -153 degrees Celsius at night"));
        arrayList.add(new ContentQuestionModel("At how much speed Moon moves across the Sun?","2,250 km per hour","2025 km","2125 km","2225 km","2,250 km per hour"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("কোন নক্ষত্র আমাদের সৌরজগতের কেন্দ্রস্থলে?", "সূর্য", "পৃথিবী", "মঙ্গল", "বৃহস্পতি", "সূর্য"));
        arrayList.add(new ContentQuestionModel("সূর্যের ব্যাস কত?", "1,392,684 কিমি (865,374 মাইল)", "145263987 কিমি", "253698745 কিমি", "236547895 কিমি", "1,392,684 কিমি (865,374 মাইল)"));
        arrayList.add(new ContentQuestionModel("সূর্য সৌরজগতের কত শতাংশ ভর করে?", "৯৯.৫ শতাংশ", "৯৯.৫ শতাংশ", "৯৯.৫ শতাংশ", "৯৯.৮ শতাংশ", "৯৯.৮ শতাংশ"));
        arrayList.add(new ContentQuestionModel("মিল্কিওয়েতে কত তারা আছেন?", "500 বিলিয়নের বেশি", "300 বিলিয়ন বেশি", "100 বিলিয়নেরও বেশি", "200 বিলিয়নেরও বেশি", "100 বিলিয়নেরও বেশি"));
        arrayList.add(new ContentQuestionModel("সূর্যের জন্ম কখন হয়েছিল?", "প্রায় ৪.৮ বিলিয়ন বছর আগে", "প্রায় ৪.১০ বিলিয়ন বছর আগে", "প্রায় ৪.6 বিলিয়ন বছর আগে", "প্রায় ৪.7 বিলিয়ন বছর আগে", "প্রায় ৪.6 বিলিয়ন বছর আগে"));
        arrayList.add(new ContentQuestionModel("সূর্য ও পৃথিবীর মধ্যে দূরত্ব কত?", "92,960,000 মাইল (149,600,000 কিলোমিটার)", "92 966666 মাইল", "123654789 মাইল", "258963147 মাইল", "92,960,000 মাইল (149,600,000 কিলোমিটার)"));
        arrayList.add(new ContentQuestionModel("সূর্যের রাসায়নিক সংমিশ্রণ:", "হাইড্রোজেনের 74%, 26.5% হিলিয়াম এবং 2.5% অন্যান্য উপাদান", "হাইড্রোজেনের 73%, 26.5% হিলিয়াম এবং 2.5% অন্যান্য উপাদান", "হাইড্রোজেনের 72%, 26.5 % হেলিয়াম এবং অন্যান্য উপাদানগুলির ২.৫% "," হাইড্রোজেনের %১%, ২ 26.৫% হেলিয়াম এবং অন্যান্য উপাদানগুলির ২.৫% "," হাইড্রোজেনের %১%, ২ 26.৫% হেলিয়াম এবং অন্যান্য উপাদানগুলির ২.৫% "));
        arrayList.add(new ContentQuestionModel("পৃথিবীতে পৌঁছতে সূর্যের রশ্মি কত সময় নেয়?", "12 মিনিট", "8 মিনিট", "10 মিনিট", "9 মিনিট", "8 মিনিট"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহ পৃথিবীর নিকটবর্তী?", "শনি", "মঙ্গল", "বৃহস্পতি", "রহস্যময়", "রহস্যময়"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহটি মর্নিং স্টার বা সান্ধ্য নক্ষত্র হিসাবে পরিচিত?", "শনি", "ভেনাস", "মঙ্গল", "বৃহস্পতি", "ভেনাস"));
        arrayList.add(new ContentQuestionModel("MERCURY এর ব্যাস কত?", "3,032 মাইল (4,879 কিমি)", "3221 মাইল", "1236 মাইল", "2589 মাইল", "3,032 মাইল (4,879 কিমি)"));
        arrayList.add(new ContentQuestionModel("ভেনুসের ব্যাস কত?", "3251 মাইল", "7,521 মাইল (12,104 কিমি)", "9521 মাইল", "8521 মাইল", "7,521 মাইল (12,104 কিমি)"));
        arrayList.add(new ContentQuestionModel("EARTH এর ব্যাস কত?", "2569 মাইল", "9874 মাইল", "8932 মাইল", "7,918 মাইল (12,742 কিমি)", "7,918 মাইল (12,742 কিমি)"));
        arrayList.add(new ContentQuestionModel("MARS এর ব্যাস কত?", "3215 মাইল", "4,212 মাইল (6,779 কিমি)", "2569 মাইল", "7856 মাইল", "4,212 মাইল (6,779 কিমি)"));
        arrayList.add(new ContentQuestionModel("JUPITER এর ব্যাস কত?", "96321 মাইল", "86,881 মাইল (139,822 কিমি)", "32567 মাইল", "12365 মাইল", "86,881 মাইল (139,822 কিমি)"));
        arrayList.add(new ContentQuestionModel("SATURN এর ব্যাস কত?", "321456 কিলোমিটার", "236547 কিলোমিটার", "1250120 কিলোমিটার", "120536 কিলোমিটার", "120536 কিলোমিটার"));
        arrayList.add(new ContentQuestionModel("ইউরানুসের ব্যাস কত?", "32 125 মাইল", "31,518 মাইল (50,724 কিমি)", "25852 মাইল", "25698 মাইল", "31,518 মাইল (50,724 কিমি)"));
        arrayList.add(new ContentQuestionModel("NEPTUNE এর ব্যাস কত?", "30,599 মাইল (49,244 কিমি)", "25852 মাইল", "32145 মাইল", "36987 মাইল", "30,599 মাইল (49,244 কিমি)"));
        arrayList.add(new ContentQuestionModel("প্লুটো এর ব্যাস কত?", "1458 কিলোমিটার", "3214 কিলোমিটার", "3365 কিলোমিটার", "2360 কিলোমিটার", "2360 কিলোমিটার"));
        arrayList.add(new ContentQuestionModel("আমাদের সৌরজগতের বৃহত্তম গ্রহটি কোনটি?", "জুপিটার", "আর্থ", "মঙ্গল", "শনি", "জুপিটার"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহের সর্বাধিক চাঁদ রয়েছে?", "আর্থ", "শনি", "mo 66 চাঁদ সহ বৃহস্পতি", "মঙ্গল", "mo 66 চাঁদ সহ বৃহস্পতি"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহ সূর্যের সবচেয়ে কাছাকাছি?", "শনি", "বুধ", "বৃহস্পতি", "পৃথিবী", "বুধ"));
        arrayList.add(new ContentQuestionModel("সৌরজগতের হটেস্ট প্ল্যানেট কোনটি?", "শুক্র", "বুধ", "শনি", "বৃহস্পতি", "শুক্র"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহে তাদের চারপাশে রিং রয়েছে?", "শনি, বৃহস্পতি, ইউরেনস এবং নেপচুন (৪ টি গ্রহ)", "আর্থ", "শুক্র", "বুধ", "শনি, বৃহস্পতি, ইউরেনস এবং নেপচুন (৪ টি গ্রহ)"));
        arrayList.add(new ContentQuestionModel("সমস্ত গ্রহের মধ্যে সবচেয়ে ঠান্ডা এবং সবচেয়ে ছোট কোনটি?", "আর্থ", "বুধ", "ভেনাস", "প্লুটো", "প্লুটো"));
        arrayList.add(new ContentQuestionModel("কোন তারাটিকে পৃথিবীর উপগ্রহ বলা হয়?", "নেপচুন", "চাঁদ", "শুক্র", "বৃহস্পতি", "চাঁদ"));
        arrayList.add(new ContentQuestionModel("পৃথিবী থেকে চাঁদের গড় দূরত্ব কত?", "2365478 মাইল", "321456 মাইল", "258745 মাইল", "238,855 মাইল (384,400 কিমি)", "238,855 মাইল (384,400 কিমি)"));
        arrayList.add(new ContentQuestionModel("চাঁদের বয়স কত?", "9587 বিলিয়ন বছর", "2537 বিলিয়ন বছর", "4.527 বিলিয়ন বছর", "3527 বিলিয়ন বছর", "4.527 বিলিয়ন বছর"));
        arrayList.add(new ContentQuestionModel("চাঁদের অরবিটাল সময়কাল কত?", "27 দিন", "57 দিন", "47 দিন", "37 দিন", "27 দিন"));
        arrayList.add(new ContentQuestionModel("চাঁদের পরিধি কী?", "9784 মাইল", "6,784 মাইল (10,917 কিমি)", "8784 মাইল", "7784 মাইল", "6,784 মাইল (10,917 কিমি)"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহের সর্বাধিক আগ্নেয়গিরি রয়েছে?", "শুক্র", "বুধ", "আর্থ", "বৃহস্পতি", "শুক্র"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহের চাঁদ নেই?", "আর্থ", "নেপচুন", "বৃহস্পতি", "বুধ ও শুক্র", "বুধ ও শুক্র"));
        arrayList.add(new ContentQuestionModel("পৃথিবী থেকে সূর্য কত বড়?", "300000 বার", "600000 বার", "500000 বার", "400000 বার", "300000 বার"));
        arrayList.add(new ContentQuestionModel("হ্যালির ধূমকেতুটি যখন আবার পৃথিবী থেকে দৃশ্যমান হবে?", "3071", "5041", "2061", "2051", "2061"));
        arrayList.add(new ContentQuestionModel("ভেনাসের উপরিভাগের তাপমাত্রাটি কী?", "450 ডিগ্রি সেলসিয়াসের বেশি", "650 ডিগ্রি সেলসিয়াসের বেশি", "550 ডিগ্রি সেলসিয়াসের বেশি", "350 ডিগ্রি সেলসিয়াসের বেশি", "450 ডিগ্রি সেলসিয়াসের বেশি"));
        arrayList.add(new ContentQuestionModel("সৌরজগত কখন গঠিত হয়েছিল?", "", "প্রায় ৪.6 বিলিয়ন বছর আগে", "প্রায় ৩.6 বিলিয়ন বছর আগে", "প্রায় ৫..6 বিলিয়ন বছর আগে", "প্রায় ৪.6 বিলিয়ন বছর আগে"));
        arrayList.add(new ContentQuestionModel("যে ব্যক্তি পৃথিবীতে 200 পাউন্ড ওজনের, তিনি মঙ্গল গ্রহের পৃষ্ঠের ওজন কী করবেন?", "76 পাউন্ড", "46 পাউন্ড", "56 পাউন্ড", "66 পাউন্ড", "76 পাউন্ড"));
        arrayList.add(new ContentQuestionModel("কোন গ্রহটি অন্যের তুলনায় পিছনের দিকে স্পিন করে?", "শুক্র", "আর্থ", "মঙ্গল", "বৃহস্পতি", "শুক্র"));
        arrayList.add(new ContentQuestionModel("মহাশূন্যে প্রথম মানুষকে কখন প্রেরণ করা হয়েছিল?", "1986", "1961", "1957", "1958", "1957"));
        arrayList.add(new ContentQuestionModel("বৃহস্পতির 4 বৃহত্তম চাঁদের নাম দিন:", "মঙ্গল", "ভেনাস", "আর্থ", "ইউরোপা, গ্যানিমেড, ক্যালিস্টো এবং আইও", "ইউরোপা, গ্যানিমেড, ক্যালিস্টো এবং আইও"));
        arrayList.add(new ContentQuestionModel("বৃহস্পতি ও চাঁদের মাধ্যাকর্ষণ কারণেই "," আমাদের উচ্চ ও নিম্ন জোয়ার কেন? "," মঙ্গল ও চাঁদের মাধ্যাকর্ষণের কারণে "," পৃথিবী ও চাঁদের মাধ্যাকর্ষণের কারণে "," সূর্য ও চাঁদের মাধ্যাকর্ষণ কারণে? "," সূর্য ও চাঁদের মাধ্যাকর্ষণ কারণে "));
        arrayList.add(new ContentQuestionModel("স্থানটির কিনারা  কোথায় অবস্থিত? "," 500 কিমি "," সমুদ্রপৃষ্ঠ থেকে 100 কিলোমিটার (62 মাইল) "," 300 কিমি "," 200 কিমি "," সমুদ্রপৃষ্ঠ থেকে 100 কিলোমিটার (62 মাইল) "));
        arrayList.add(new ContentQuestionModel("রাশিয়ান ফেডারেল স্পেস এজেন্সি দ্বারা নিযুক্ত কোন নভোচারী কী বলা হয়?", "পিটার", "মিলার", "ডেভিল", "কোসমনাভেট", "কোসমনাভেট"));
        arrayList.add(new ContentQuestionModel("মহাকাশে পৌঁছানোর প্রথম ব্যক্তি কে?", "ডেভিড হডসন", "ইউরি গাগারিন, 1961 সালে", "কিথ মেরি", "নীল আর্মস্ট্রং", "ইউরি গাগারিন, 1961 সালে"));
        arrayList.add(new ContentQuestionModel("মহাকাশে পৌঁছানোর প্রথম মহিলা কে?", "মনিকা নরনাগ", "রেনা কিথ", "মেরি হুসেন", "ভ্যালেন্টিনা তেরেশকোভা, 1963", "ভ্যালেন্টিনা তেরেশকোভা, 1963"));
        arrayList.add(new ContentQuestionModel("পাঁচটি স্বীকৃত বামন গ্রহের নাম দিন:", "মঙ্গল", "শনি", "বৃহস্পতি", "প্লুটো, সেরেস, এরিস, মেক মেক এবং হাউমিয়া", "প্লুটো, সেরেস, এরিস, মেক মেক এবং হাউমিয়া"));
        arrayList.add(new ContentQuestionModel("চাঁদ প্রতি পৃথিবী প্রদক্ষিণ করে -", "27.3 দিন", "14.5 দিন", "29.5 দিন", "28.3 দিন", "27.3 দিন"));
        arrayList.add(new ContentQuestionModel("চাঁদে পা রাখার প্রথম ব্যক্তি কে?", "ডেভিড হডসন", "নীল আর্মস্ট্রং", "কিথ মেরি", "ইউরি জাগ্রিন", "নীল আর্মস্ট্রং"));
        arrayList.add(new ContentQuestionModel("চাঁদের গড় তাপমাত্রা কত?", "দিনে 307 ডিগ্রি সেলসিয়াস এবং রাতে -453 ডিগ্রি সেলসিয়াস", "দিনের বেলা 407 ডিগ্রি সেলসিয়াস এবং রাতে 25 ডিগ্রি সেলসিয়াস", "207 ডিগ্রি সেলসিয়াস সময়  দিন এবং রাতে -253 ডিগ্রি সেলসিয়াস "," দিনের বেলা 107 ডিগ্রি সেলসিয়াস এবং রাতে 1515 ডিগ্রি সেলসিয়াস "," দিনের বেলা 107 ডিগ্রি সেলসিয়াস এবং রাতে 1515 ডিগ্রি সেলসিয়াস "));
        arrayList.add(new ContentQuestionModel("চাঁদ সূর্যকে কত গতিতে চলবে?", "প্রতি ঘন্টা ২,২৫০ কিমি", "2025 কিমি", "2125 কিমি", "2225 কিমি", "প্রতি ঘন্টা ২,২৫০ কিমি"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("कौन सा तारा हमारे सौर मंडल के केंद्र में है?", "सूर्य", "पृथ्वी", "मंगल", "बृहस्पति", "सूर्य"));
        arrayList.add(new ContentQuestionModel("सूर्य का व्यास क्या है?", "1,392,684 किमी (865,374 मील)", "145263987 किमी", "253698745 किमी", "236547895 किमी", "1,392,684 किमी (865,374 मील)"));
        arrayList.add(new ContentQuestionModel("सौर प्रणाली के द्रव्यमान का कितना प्रतिशत सूर्य रखता है?", "94.5 प्रतिशत", "98.5 प्रतिशत", "95.5 प्रतिशत", "99.8 प्रतिशत", "99.8 प्रतिशत"));
        arrayList.add(new ContentQuestionModel("मिल्की वे में कितने सितारे हैं?", "500 बिलियन से अधिक", "300 बिलियन से अधिक", "100 बिलियन से अधिक", "200 बिलियन से अधिक", "100 बिलियन से अधिक"));
        arrayList.add(new ContentQuestionModel("सूर्य का जन्म कब हुआ?", "लगभग 4.8 बिलियन साल पहले", "लगभग 4.10 बिलियन साल पहले", "मोटे तौर पर 4.6 बिलियन साल पहले", "मोटे तौर पर 4.7 बिलियन साल पहले", "मोटे तौर पर 4.6 बिलियन साल पहले"));
        arrayList.add(new ContentQuestionModel("सूर्य और पृथ्वी के बीच की दूरी क्या है?", "92,960,000 मील (149,600,000 किमी)", "92 966666 मील", "123654789 मील", "258963147 मील", "92,960,000 मील (149,600,000 किमी)"));
        arrayList.add(new ContentQuestionModel("सन के रासायनिक संरचना:", "74% हाइड्रोजन, 26.5% हीलियम और अन्य तत्वों के 2.5%", "73% हाइड्रोजन, 26.5% हीलियम और अन्य तत्वों के 2.5%", "72% हाइड्रोजन, 26.5% % हीलियम और अन्य तत्वों के 2.5% ","71% हाइड्रोजन, 26.5% हीलियम और अन्य तत्वों के 2.5%","71% हाइड्रोजन, 26.5% हीलियम और अन्य तत्वों के 2.5%"));
        arrayList.add(new ContentQuestionModel("सूर्य की किरणों को पृथ्वी तक पहुंचने में कितना समय लगता है?", "12 मिनट", "8 मिनट", "10 मिनट", "9 मिनट", "8 मिनट"));
        arrayList.add(new ContentQuestionModel("कौन सा ग्रह है, जो सबसे खराब पृथ्वी है?", "शनि", "मंगल", "बृहस्पति", "मर्किरी", "मर्किरी"));
        arrayList.add(new ContentQuestionModel("कौन से ग्रह को मॉर्निंग स्टार या ईवनिंग स्टार के रूप में जाना जाता है?", "शनि", "वेनस", "मंगल", "बृहस्पति", "वेनस"));
        arrayList.add(new ContentQuestionModel("MERCURY का व्यास क्या है?", "3,032 मील (4,879 किमी)", "3221 मील", "1236 मील", "2589 मील", "3,032 मील (4,879 किमी)"));
        arrayList.add(new ContentQuestionModel("वीनस का व्यास क्या है?", "3251 मील", "7,521 मील (12,104 किमी)", "9521 मील", "8521 मील", "7,521 मील (12,104 किमी)"));
        arrayList.add(new ContentQuestionModel("EARTH का व्यास क्या है?", "2569 मील", "9874 मील", "8932 मील", "7,918 मील (12,742 किमी)", "7,918 मील (12,742 किमी)"));
        arrayList.add(new ContentQuestionModel("MARS का व्यास क्या है?", "3215 मील", "4,212 मील (6,779 किमी)", "2569 मील", "7856 मील", "4,212 मील (6,779 किमी)"));
        arrayList.add(new ContentQuestionModel("जुपिटर का व्यास क्या है?", "96321 मील", "86,881 मील (139,822 किमी)", "32567 मील", "12365 मील", "86,881 मील (139,822 किमी)"));
        arrayList.add(new ContentQuestionModel("SATURN का व्यास क्या है?", "321456 किलोटर्स", "236547 किलोमीटर", "1250120 किलोमीटर", "120536 किलोमीटर", "120536 किलोमीटर"));
        arrayList.add(new ContentQuestionModel("यूरेनस का व्यास क्या है?", "32 125 मील", "31,518 मील (50,724 किमी)", "25852 मील", "25698 मील", "31,518 मील (50,724 किमी)"));
        arrayList.add(new ContentQuestionModel("NEPTUNE का व्यास क्या है?", "30,599 मील (49,244 किमी)", "25852 मील", "32145 मील", "36987 मील", "30,599 मील (49,244 किमी)"));
        arrayList.add(new ContentQuestionModel("PLUTO का व्यास क्या है?", "1458 किलोमीटर", "3214 किलोमीटर", "3365 किलोमीटर", "2360 किलोमीटर", "2360 किलोमीटर"));
        arrayList.add(new ContentQuestionModel("हमारे सौरमंडल का सबसे बड़ा ग्रह कौन सा है?", "जूपिटर", "अर्थ", "मंगल", "शनि", "जूपिटर"));// checked
        arrayList.add(new ContentQuestionModel("किस ग्रह के पास सबसे अधिक चंद्रमा हैं?", "पृथ्वी", "शनि", "66 चंद्रमाओं के साथ बृहस्पति", "मंगल", "66 चंद्रमाओं के साथ बृहस्पति"));
        arrayList.add(new ContentQuestionModel("कौन सा ग्रह सूर्य के सबसे करीब है?", "शनि", "बुध", "बृहस्पति", "पृथ्वी", "बुध"));
        arrayList.add(new ContentQuestionModel("सौर मंडल में सबसे गर्म ग्रह कौन सा है?", "शुक्र", "बुध", "शनि", "बृहस्पति", "शुक्र"));
        arrayList.add(new ContentQuestionModel("कौन से ग्रह उनके आसपास के छल्ले हैं?", "शनि, बृहस्पति, यूरेनस, और नेपच्यून (4 ग्रह)", "पृथ्वी", "शुक्र", "बुध", "शनि, बृहस्पति, यूरेनस, और नेपच्यून (4 ग्रह)"));
        arrayList.add(new ContentQuestionModel("सभी ग्रहों में सबसे ठंडा और सबसे छोटा कौन है?", "पृथ्वी", "बुध", "शुक्र", "PLUTO", "PLUTO"));
        arrayList.add(new ContentQuestionModel("किस तारे को पृथ्वी का उपग्रह कहा जाता है?", "नेपच्यून", "चंद्रमा", "शुक्र", "बृहस्पति", "चंद्रमा")); //
        arrayList.add(new ContentQuestionModel("पृथ्वी से चंद्रमा की औसत दूरी क्या है?", "2365478 मील", "321456 मील", "258745 मील", "238,855 मील (384,400 किमी)", "238,855 मील (384,400 किमी)"));
        arrayList.add(new ContentQuestionModel("चंद्रमा की आयु क्या है?", "9587 बिलियन वर्ष", "2537 बिलियन वर्ष", "4.527 बिलियन वर्ष", "3527 बिलियन वर्ष", "4.527 बिलियन वर्ष"));
        arrayList.add(new ContentQuestionModel("चंद्रमा का कक्षीय काल क्या है?", "27 दिन", "57 दिन", "47 दिन", "37 दिन", "27 दिन"));
        arrayList.add(new ContentQuestionModel("चंद्रमा की परिधि क्या है?", "9784 मील", "6,784 मील (10,917 किमी)", "8784 मील", "7784 मील", "6,784 मील (10,917 किमी)"));
        arrayList.add(new ContentQuestionModel("किस ग्रह में सबसे अधिक ज्वालामुखी हैं?", "शुक्र", "बुध", "पृथ्वी", "बृहस्पति", "शुक्र"));
        arrayList.add(new ContentQuestionModel("किन ग्रहों में चंद्रमा नहीं है?", "पृथ्वी", "नेपच्यून", "बृहस्पति", "बुध और शुक्र", "बुध और शुक्र"));
        arrayList.add(new ContentQuestionModel("सूर्य पृथ्वी से कितना बड़ा है?", "300000 बार", "600000 बार", "500000 बार", "400000 बार", "300000 बार"));
        arrayList.add(new ContentQuestionModel("जब हैली का धूमकेतु पृथ्वी से फिर से दिखाई देगा?", "3071", "5041", "2061", "2051", "2061"));
        arrayList.add(new ContentQuestionModel("शुक्र का सतह का तापमान क्या है?", "450 डिग्री सेल्सियस से अधिक", "650 डिग्री सेल्सियस से अधिक", "550 डिग्री सेल्सियस से अधिक", "350 डिग्री सेल्सियस से अधिक", "450 डिग्री सेल्सियस से अधिक"));
        arrayList.add(new ContentQuestionModel("सौर मंडल का गठन कब हुआ?", "", "लगभग 4.6 बिलियन साल पहले", "लगभग 3.6 बिलियन साल पहले", "लगभग 5.6 बिलियन साल पहले", "लगभग 4.6 बिलियन साल पहले"));
        arrayList.add(new ContentQuestionModel("एक व्यक्ति जिसका वजन पृथ्वी पर 200 पाउंड है, वह मंगल की सतह पर क्या वजन करेगा?", "76 पाउंड", "46 पाउंड", "56 पाउंड", "66 पाउंड", "76 पाउंड"));
        arrayList.add(new ContentQuestionModel("कौन सा ग्रह दूसरों के सापेक्ष पीछे की ओर घूमता है?", "शुक्र", "पृथ्वी", "मंगल", "बृहस्पति", "शुक्र"));
        arrayList.add(new ContentQuestionModel("पहला आदमी कब अंतरिक्ष में भेजा गया था?", "1986", "1961", "1957", "1958", "1957"));
        arrayList.add(new ContentQuestionModel("नाम बृहस्पति के 4 सबसे बड़े चंद्रमा:", "मंगल", "शुक्र", "पृथ्वी", "यूरोपा, गेनीमेड, कैलिस्टो और Io", "यूरोपा, गेनीमेड, कैलिस्टो और Io"));
        arrayList.add(new ContentQuestionModel("हमारे पास उच्च और निम्न ज्वार क्यों हैं?", "बृहस्पति और चंद्रमा के गुरुत्वाकर्षण के कारण", "मंगल और चंद्रमा के गुरुत्वाकर्षण के कारण", "पृथ्वी और चंद्रमा के गुरुत्वाकर्षण के कारण", "सूर्य और चंद्रमा के गुरुत्वाकर्षण के कारण"  ,"सूर्य और चंद्रमा के गुरुत्वाकर्षण के कारण"));
        arrayList.add(new ContentQuestionModel("अंतरिक्ष का छोर कहाँ स्थित है?", "500 किमी", "100 किमी (62 मील) समुद्र तल से ऊपर", "300 किमी", "200 किमी", "100 किमी (62 मील) समुद्र तल से ऊपर"));
        arrayList.add(new ContentQuestionModel("रूसी संघीय अंतरिक्ष एजेंसी द्वारा नियुक्त एक अंतरिक्ष यात्री को क्या कहा जाता है?", "पिटर", "मिलर", "डेविल", "कोसोमावत", "कोसोमावत"));
        arrayList.add(new ContentQuestionModel("1961 में अंतरिक्ष में पहुंचने वाले पहले व्यक्ति कौन थे?", "देवीद हडसन", "यूरी गगारिन, 1961 में", "कीथ मेरी", "नील आर्मस्ट्रांग", "यूरी गगारिन, 1961 में"));
        arrayList.add(new ContentQuestionModel("अंतरिक्ष में पहुँचने वाली पहली महिला कौन थी?", "मोनिका नारनग", "रीना कीथ", "मेरी हुसैन", "वैलेनटीना तेरेश्कोवा, 1963 में", "वैलेनटीना तेरेश्कोवा, 1963 में"));
        arrayList.add(new ContentQuestionModel("नाम पांच मान्यता प्राप्त बौने ग्रह:", "मंगल", "शनि", "बृहस्पति", "प्लूटो, सेरेस, एरिस, मेक एंड हैमिया", "प्लूटो, सेरेस, एरिस, मेक एंड हैमिया"));
        arrayList.add(new ContentQuestionModel("चंद्रमा पृथ्वी की परिक्रमा करता है -", "27.3 दिन", "14.5 दिन", "29.5 दिन", "28.3 दिन", "27.3 दिन"));
        arrayList.add(new ContentQuestionModel("चंद्रमा पर पैर रखने वाला पहला व्यक्ति कौन था?", "डेविड हडसन", "नील आर्मस्ट्रांग", "किथ मेरी", "यूरी गेग्रीन", "नील आर्मस्ट्रांग"));
        arrayList.add(new ContentQuestionModel("चंद्रमा का औसत तापमान क्या है?", "दिन के दौरान 307 डिग्री सेल्सियस और रात में -453 डिग्री सेल्सियस", "दिन के दौरान 407 डिग्री सेल्सियस और रात में -253 डिग्री सेल्सियस", "के दौरान 207 डिग्री सेल्सियस रात में दिन और -253 डिग्री सेल्सियस "," दिन में 107 डिग्री सेल्सियस और रात में -153 डिग्री सेल्सियस "," दिन में 107 डिग्री सेल्सियस और रात में -153 डिग्री सेल्सियस "));
        arrayList.add(new ContentQuestionModel("कितनी गति से चंद्रमा सूर्य के पार जाता है?", "2,250 किमी प्रति घंटा", "2025 किमी", "2125 किमी", "2225 किमी", "2,250 किमी प्रति घंटा"));

        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("ہمارے شمسی نظام کے مرکز میں کون سا ستارہ ہے؟" , "سورج" , "زمین" , "مریخ" , "جپیٹر","سورج"));
        arrayList.add(new ContentQuestionModel("اتوار کا قطر کیا ہے؟" , "1،392.684 کلومیٹر (865.374 میل)" , "145263987 کلومیٹر" , "253698745 کلومیٹر" , "236547895 کلومیٹر","1،392.684 کلومیٹر (865.374 میل)"));
        arrayList.add(new ContentQuestionModel("1،392،684 کلومیٹر (865،374 میل) سورج نظام شمسی کا کتنا فیصد رکھتا ہے؟" , "94.5 فیصد" , "98.5 فیصد" ,"95.5 فیصد" , "99.8 فیصد","99.8 فیصد"));
        arrayList.add(new ContentQuestionModel("آکاشگاہ میں کتنے ستارے ہیں؟" , "500 ارب سے زیادہ" , "300 ارب سے زیادہ" , "100 ارب سے زیادہ" , "200 ارب سے زیادہ","100 ارب سے زیادہ"));
        arrayList.add(new ContentQuestionModel("سورج کب پیدا ہوا؟" , "تقریبا 4. 8.8 ارب سال پہلے" , "تقریبا 4. 10.10 بلین سال پہلے" , "تقریبا 4. 4.6 بلین سال پہلے" , "تقریبا 4. 7.7 ارب سال پہلے","تقریبا 4. 4.6 بلین سال پہلے"));
        arrayList.add(new ContentQuestionModel("سورج اور زمین کے درمیان فاصلہ کیا ہے؟" , "92،960،000 میل (149،600،000 کلومیٹر)" , "92 966666 میل" , "123654789 میل" , "258963147 میل","92،960،000 میل (149،600،000 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("سورج کا کیمیائی مرکب:" , "ہائیڈروجن کا 74٪ ، 26.5٪ ہیلیم اور دیگر عناصر کا 2.5٪" ,"، ہائیڈروجن کا 73٪ ، 26.5٪ ہیلیم اور 2.5 فیصد دوسرے عناصر", "ہائیڈروجن کا 72٪ ، 26.5 ہیلیئم اور دیگر عناصر کا 2.5.5٪ ","ہائیڈروجن کا 71٪ ، 26.5٪ ہیلیم اور دیگر عناصر کا 2،5٪","ہائیڈروجن کا 71٪ ، 26.5٪ ہیلیم اور دیگر عناصر کا 2،5٪"));
        arrayList.add(new ContentQuestionModel("سورج کی کرنوں کو زمین تک پہنچنے میں کتنا وقت لگتا ہے؟" , "12 منٹ" , "8 منٹ" , "10 منٹ" , "9 منٹ","8 منٹ"));
        arrayList.add(new ContentQuestionModel("کون سا سیارہ قریب ترین زمین کو چھڑا رہا ہے؟" , "زحل" , "مریخ" , "مشتری" , "مکروری","مکروری"));//9
        arrayList.add(new ContentQuestionModel("میرکور کون سا سیارہ صبح کا ستارہ یا شام کا ستارہ کے نام سے جانا جاتا ہے؟" , "زھرہ" , "وینس" , "مریخ" , "مشتری" ,"زھرہ"));
        arrayList.add(new ContentQuestionModel("مرکیوری کا قطر کتنا ہے؟" , "3،032 میل (4،879 کلومیٹر)" , "3221 میل" , "1236 میل" , "2589 میل","3،032 میل (4،879 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("VENUS کا قطر کتنا ہے؟" , "3251 میل" , "7،521 میل (12،104 کلومیٹر)" , "9521 میل" , "8521 میل","7،521 میل (12،104 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("EARTH کا قطر کیا ہے؟" , "2569 میل" , "9874 میل" , "8932 میل" , "7،918 میل (12،742 کلومیٹر)","7،918 میل (12،742 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("MARS کا قطر کتنا ہے؟" , "3215 میل" , "4،212 میل (6،779 کلومیٹر)" , "2569 میل" , "7856 میل","4،212 میل (6،779 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("JUPITER کا قطر کیا ہے؟" , "96321 میل" , "86،881 میل (139،822 کلومیٹر)" , "32567 میل" , "12365 میل","86،881 میل (139،822 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("ساٹورن کا قطر کتنا ہے؟" , "321456 کلو میٹر" ,"236547 کلومیٹر" , "1250120 کلومیٹر" , "120 536 کلومیٹر","120 536 کلومیٹر"));
        arrayList.add(new ContentQuestionModel("یوراناس کا قطر کیا ہے؟" , "32 125 میل" , "31،518 میل (50،724 کلومیٹر)" , "25852 میل" ,"25698 میل","31،518 میل (50،724 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("NEPTUNE کا قطر کیا ہے؟" , "30،599 میل (49،244 کلومیٹر)" , "25852 میل" , "32145 میل" , "36987 میل","30،599 میل (49،244 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("2360 کلومیٹر" , "PLUTO کا قطر کیا ہے؟" , "1458 کلومیٹر" , "2360 کلومیٹر" , "3365 کلومیٹر" , "2360 کلومیٹر"));//19
        arrayList.add(new ContentQuestionModel("ہمارے نظام شمسی کا سب سے بڑا سیارہ کونسا ہے؟" , "JUPITER" , "زمین" , "مریخ" , "زحل","JUPITER"));
        arrayList.add(new ContentQuestionModel("کون سے سیارے میں سب سے زیادہ چاند لگے ہیں؟" , "زمین" , "زحل" , "مشتری جس میں 66 چاند ہیں" ,"مریخ","مشتری جس میں 66 چاند ہیں"));//21
        arrayList.add(new ContentQuestionModel("کون سا سیارہ سورج کے قریب ہے؟" , "زحل" , "مرکری" , "مشتری" , "زمین","مرکری"));
        arrayList.add(new ContentQuestionModel("نظام شمسی کا سب سے مشہور سیارہ کونسا ہے؟" , "وینس" , "مرکری" , "زحل" , "مشتری","مرکری"));
        arrayList.add(new ContentQuestionModel("ان کے ارد گرد کون سے سیارے بجتے ہیں؟" , "زحل ، مشتری ، یورینس ، اور نیپچون (4 سیارے)" , "زمین" , "وینس" , "مرکری","زحل ، مشتری ، یورینس ، اور نیپچون (4 سیارے)"));
        arrayList.add(new ContentQuestionModel("تمام سیاروں میں سب سے زیادہ ٹھنڈا کون سا ہے؟" , "زمین" , "مرکری" , "وینس" , "پلوٹو","پلوٹو"));
        arrayList.add(new ContentQuestionModel("کس ستارے کو ارتھ کا مصنوعی سیارہ کہا جاتا ہے؟" , "نیپچون" , "چاند" , "وینس", "مشتری","چاند"));
        arrayList.add(new ContentQuestionModel("زمین سے چاند کا اوسط فاصلہ کتنا ہے؟" , "2365478 میل" , "321456 میل" , "258745 میل" , "238،855 میل (384،400 کلومیٹر)","238،855 میل (384،400 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("چاند کی عمر کتنی ہے؟", "9587 بلین سال" , "2537 بلین سال" , "4.527 بلین سال" , "3527 ارب سال","4.527 بلین سال"));
        arrayList.add(new ContentQuestionModel("چاند کی مداری مدت کتنی ہے؟" , "27 دن" , "57 دن" , "47 دن" , "37 دن","27 دن"));
        arrayList.add(new ContentQuestionModel("چاند کا طواف کیا ہے؟" , "9784 میل" , "6،784 میل (10،917 کلومیٹر)" , "8784 میل" , "7784 میل","6،784 میل (10،917 کلومیٹر)"));
        arrayList.add(new ContentQuestionModel("کون سے سیارے میں سب سے زیادہ آتش فشاں ہیں؟" , "وینس" , "مرکری" , "زھرہ" , "مشتری","زھرہ"));//31
        arrayList.add(new ContentQuestionModel("کون سے سیاروں میں چاند نہیں ہوتے؟" , "ارتھ" , "نیپچون", "مشتری" ,"مرکری اور وینس","مرکری اور وینس"));
        arrayList.add(new ContentQuestionModel("سورج زمین سے کتنا بڑا ہے؟" , "300000 بار" , "600000 بار" ,"500000 بار" , "400000 بار","300000 بار"));
        arrayList.add(new ContentQuestionModel("جب ہیلی کا دومکیت ایک بار پھر زمین سے نظر آئے گا؟" ,"3071" , "5041" , "2061" , "2051","2061"));
        arrayList.add(new ContentQuestionModel("وینس کا سطحی درجہ حرارت کیا ہے؟" ,"450 ڈگری سینٹی گریڈ سے زیادہ" , "650 ڈگری سینٹی گریڈ سے زیادہ" , "550 ڈگری سینٹی گریڈ سے زیادہ" , "350 ڈگری سینٹی گریڈ سے زیادہ","450 ڈگری سینٹی گریڈ سے زیادہ"));
        arrayList.add(new ContentQuestionModel("شمسی نظام کب قائم ہوا؟" ,"" , "تقریبا 4. 4.6 بلین سال پہلے" , "تقریبا 3. 6.6 بلین سال پہلے" , "تقریبا 5 .6..6 بلین سال پہلے","تقریبا 4. 4.6 بلین سال پہلے"));//36
        arrayList.add(new ContentQuestionModel("ایک شخص جس کا وزن زمین پر 200 پاؤنڈ ہے ، اس کا وزن مریخ کی سطح پر کیا ہوگا؟" , "76 پاؤنڈ" , "46 پاؤنڈ" , "56 پاؤنڈ" , "66 پاؤنڈ","76 پاؤنڈ"));
        arrayList.add(new ContentQuestionModel("کون سا سیارہ دوسروں کی نسبت پیچھے کی طرف گھومتا ہے؟" , "وینس" , "زھرہ" , "مریخ" , "مشتری","زھرہ"));//38
        arrayList.add(new ContentQuestionModel("پہلے آدمی کو خلا میں بھیجا گیا تھا؟" , "1986" , "1961" , "1957" , "1958","1957"));
        arrayList.add(new ContentQuestionModel("مشتری کے 4 سب سے بڑے چاند کو نام دیں:" , "مریخ" , "وینس" , "ارتھ" , "یورپ ، گنیمیڈ ، کیلسٹو اور آئی او","یورپ ، گنیمیڈ ، کیلسٹو اور آئی او"));
        arrayList.add(new ContentQuestionModel("ہمارے پاس اونچی اور کم جوار کیوں ہے؟" , "مشتری اور چاند کی کشش ثقل کی وجہ سے" , "مریخ اور چاند کی کشش ثقل کی وجہ سے" , "زمین اور چاند کی کشش ثقل کی وجہ سے" , "سورج اور چاند کی کشش ثقل کی وجہ سے","سورج اور چاند کی کشش ثقل کی وجہ سے"));
        arrayList.add(new ContentQuestionModel("جگہ کے کنارے کہاں واقع ہے؟" ,"500 کلومیٹر" , "سطح سمندر سے 100 کلومیٹر (62 میل)" , "300 کلومیٹر" , "200 کلومیٹر","سطح سمندر سے 100 کلومیٹر (62 میل)"));
        arrayList.add(new ContentQuestionModel("روسی فیڈرل اسپیس ایجنسی کے ذریعہ ملازمت کرنے والے خلاباز کو کیا کہتے ہیں؟" , "پیٹر" ,"ملر" ,"برہمانڈ" , "کوسمون واٹ","برہمانڈ"));//43
        arrayList.add(new ContentQuestionModel("خلا تک پہنچنے والا پہلا شخص کون تھا؟" , "ڈیویڈ ہڈسن" , "یوری گا گیارن ، 1961 میں" ,"کِت میری" , "نیل آرمسٹرونگ","یوری گا گیارن ، 1961 میں"));
        arrayList.add(new ContentQuestionModel("خلا میں پہنچنے والی پہلی خاتون کون تھیں؟" , "مونیکا نارناگ" , "رینا کیتھ" , "میری حسین" , "ویلنٹینا تیریشکووا ، 1963 میں","ویلنٹینا تیریشکووا ، 1963 میں"));
        arrayList.add(new ContentQuestionModel("پانچ تسلیم شدہ بونے سیاروں کے نام بتائیں:" , "مریخ" , "زحل" , "مشتری" , "پلوٹو ، سیرس ، ایرس ، میک اپ اور حوثیہ","پلوٹو ، سیرس ، ایرس ، میک اپ اور حوثیہ"));
        arrayList.add(new ContentQuestionModel("چاند زمین کا ہر چکر لگاتا ہے -" , "27.3 دن", "14.5 دن" , "29.5 دن" , "28.3 دن","27.3 دن"));
        arrayList.add(new ContentQuestionModel("چاند پر قدم رکھنے والا پہلا شخص کون تھا؟" , "ڈیوڈ ہڈسن" , "نیل آرمسٹرانگ" , "کِت میری" , "یوری جگرن","نیل آرمسٹرانگ"));
        arrayList.add(new ContentQuestionModel("چاند کا اوسط درجہ حرارت کتنا ہے؟" , "دن کے وقت 307 ڈگری سینٹی گریڈ اور رات کو 453 ڈگری سینٹی گریڈ" , "دن کے وقت 407 ڈگری سینٹی گریڈ اور رات کو 253 ڈگری سینٹی گریڈ" , "دن کے دوران 107 ڈگری سینٹی گریڈ اور رات کو -153 ڈگری سینٹی گریڈ" , "107 ڈگری سینٹی گریڈ ","دن کے دوران 107 ڈگری سینٹی گریڈ اور رات کو -153 ڈگری سینٹی گریڈ"));
        arrayList.add(new ContentQuestionModel("چاند سورج کے پار کس حد تک چلتا ہے؟" , "2،250 کلومیٹر فی گھنٹہ" , "2025 کلومیٹر" , "2125 کلومیٹر" , "2225 کلومیٹر","2،250 کلومیٹر فی گھنٹہ"));


        return arrayList;


    }


}