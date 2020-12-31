package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Physics {

    private Context context;

    public Physics(Context context) {
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

       arrayList.add(new ContentQuestionModel("Which of the following is correct about the coefficient of limiting friction between any two surfaces in contact?","it is equal to twice the tangent of angle of friction","it is equal to twice the sine of angle of friction","it is equal to the tangent of angle of friction","it is equal to the sine of angle of friction","it is equal to the tangent of angle of friction"));
        arrayList.add(new ContentQuestionModel("Which of the following is an example of application of force?","when a body at rest starts moving","when a moving body stops","when moving body changes its direction","All of the above","All of the above"));
        arrayList.add(new ContentQuestionModel("The dot product of two vectors A and B is equal to the product of magnitude of A and B and __________?","cosine of the largest angle between them","sine of the largest angle between them","cosine of the smallest angle between them","sine of the smallest angle between them","cosine of the smallest angle between them"));
        arrayList.add(new ContentQuestionModel("When one body is actually moving over the surface of other body, the friction is known as:","Kinetic friction","Limiting friction","Static friction","Negative friction","Kinetic friction"));
        arrayList.add(new ContentQuestionModel("Which of the following is NOT correct about the velocity of rocket at any time?","it is directly proportional to the exhaust speed of the gases","it is directly proportional to the natural log of ratio of intial mass of rocket to its mass at that instant","length of the rocket","All of the above","length of the rocket"));
        arrayList.add(new ContentQuestionModel("Which of the following is correct about the coefficient of limiting friction between any two surfaces in contact?","it is equal to twice the tangent of angle of friction","it is equal to twice the sine of angle of friction","it is equal to the tangent of angle of friction","it is equal to the sine of angle of friction","it is equal to the tangent of angle of friction"));
        arrayList.add(new ContentQuestionModel("1 kilogram force produces how much acceleration in a body of mass 1 kg?","1 ms-2","0","9.8 ms-2","-1 ms-2","9.8 ms-2"));
        arrayList.add(new ContentQuestionModel("Which of the following is NOT correct about units of work:","1 joule = 107 ergs","1 kg-m = 1 joule","1 kg-m = 9.8 joule","1 joule = 1 Nm","1 kg-m = 1 joule"));
        arrayList.add(new ContentQuestionModel("The work done in moving a body over a smooth inclined plane does not depend on which of the following?","mass of the body","height of the inclined plane","slope of the inclined plane","All of the above","slope of the inclined plane"));
        arrayList.add(new ContentQuestionModel("What is the absolute unit of power in c.g.s system?","dyne","erg","watt","erg s-1","erg s-1"));
        arrayList.add(new ContentQuestionModel("1 electron volt of energy is equal to ____?","3.6 x 106 J","1.6 x 10-19 J","3.6 x 10-19 J","1.6 x 10-18 J","1.6 x 10-19 J"));
        arrayList.add(new ContentQuestionModel("Which among the following temperature scale is based upon absolute zero?","Celsius","Fahrenheit","Kelvin","Rankine","Kelvin"));
        arrayList.add(new ContentQuestionModel("By how many times are the Electrostatic forces stronger than the Gravitational Forces for a fixed distance?","102","1036","1012","2","1036"));
        arrayList.add(new ContentQuestionModel("Which of the following is/are part of the Classical Physics?","Optics","Thermodynamics","Both a and b","None","Both a and b"));

        arrayList.add(new ContentQuestionModel("1 electron volt of energy is equal to ____?","3.6 x 106 J","1.6 x 10-19 J","3.6 x 10-19 J","1.6 x 10-18 J","1.6 x 10-19 J"));
        arrayList.add(new ContentQuestionModel("What is the coefficient of restitution for a perfectly elastic collision?","0","1","-1","100","1"));
        arrayList.add(new ContentQuestionModel("What should be the angle between force and displacement for maximum work to be done?","0°","90°","180°","30°","0°"));
        arrayList.add(new ContentQuestionModel("Which of the following is true about universal gravitational constant in the case of two bodies each of unit mass having their centres placed at unit distance apart?","It is equal to the force of attraction between them","It is equal to twice the force of attraction between them","It is equal to half the force of attraction between them","It is equal to ten times the force of attraction between them","It is equal to the force of attraction between them"));
        arrayList.add(new ContentQuestionModel("What is the unit of intensity of Gravitational field in the c.g.s system?","dyne cm g-1","dyne g-2","dyne cm g2","dyne g-1","dyne g-1"));
        arrayList.add(new ContentQuestionModel("At sea level, what is the difference between the value of acceleration due to gravity at the poles and at the equator?","No difference","9.8 cm s-2","1.80 cm s-2"," None of the above","1.80 cm s-2"));
        arrayList.add(new ContentQuestionModel("Which of the following is correct about the value of acceleration due to gravity?","it is greater at mountains than in plains","it is lesser at mountains than in plains","it is equal for mountains and plains","None of the above","it is lesser at mountains than in plains"));
        arrayList.add(new ContentQuestionModel("What is the value of Universal Gravitational Constant?","6.67×10-9 N–m2 kg–2","6.67×10-10 N–m2 kg–2","6.67×1011 N–m2 kg–2","6.67×10-11 N–m2 kg–2","6.67×10-11 N–m2 kg–2"));
        arrayList.add(new ContentQuestionModel("On which of the following the gravitational force between two objects does not depend?","Gravitational constant","Distance between the objects","Product of the masses of the objects","Sum of the masses of the objects","Sum of the masses of the objects"));
        arrayList.add(new ContentQuestionModel("What do we call the minimum velocity with which a body must be projected up, so as to enable it to just overcome the gravitational pull?","Orbital velocity","Gravitational velocity","Escape velocity","None of the above","Escape velocity"));
        arrayList.add(new ContentQuestionModel("Which of the following condition will be true for a planet to have atmosphere?","velocity of molecules in its atmosphere is lesser than escape velocity","velocity of molecules in its atmosphere is greater than escape velocity","velocity of molecules in its atmosphere is twice the escape velocity","velocity of molecules in its atmosphere is equal to the escape velocity","velocity of molecules in its atmosphere is lesser than escape velocity"));
        arrayList.add(new ContentQuestionModel("The minimum speed required to put a satellite into a given orbit around earth is known as:","Escape velocity","Orbital velocity","Kinetic velocity","None of the above","Orbital velocity"));
        arrayList.add(new ContentQuestionModel("Which of the following is the orbital velocity of a satellite orbiting very close to the surface of earth?","7.92 km/s","9.8 km/s","11.2 km/s","14.8 km/s","7.92 km/s"));
        arrayList.add(new ContentQuestionModel("The angular momentum of a satellite depends on which of the following?","Mass of the satellite","Mass of the planet","Radius of orbit of satellite","All of the above","All of the above"));

        arrayList.add(new ContentQuestionModel("Who among the following is credited for the Corpuscular theory of light?","Isaac Newton","Christiaan Hyugens","Albert Einstein","James Clerk Maxwell","Isaac Newton"));
        arrayList.add(new ContentQuestionModel("Which of the following is correct about the properties of Gravitational Forces?","They are the strongest forces in nature","They observe inverse square law","Both a and b","None","They observe inverse square law"));
        arrayList.add(new ContentQuestionModel("Which of the following scientific discoveries was made by C.V Raman?","Inelastic scattering of light by molecules","Super Conductivity","Controlled nuclear fission","Cyclotron","Inelastic scattering of light by molecules"));
        arrayList.add(new ContentQuestionModel("Which of the following is the largest practical unit of mass?","Slug","a.m.u","Hyperkg","C.S.L","C.S.L"));
        arrayList.add(new ContentQuestionModel("What is the S.I. unit for Luminous Intensity?","mole","ampere","candela","weber","candela"));
        arrayList.add(new ContentQuestionModel("A projectile will achieve maximum horizontal range at which angle?","90°","60°"," 45°","30°"," 45°"));
        arrayList.add(new ContentQuestionModel("What is the relation between Time period and Frequency in case of uniform circular motion?","reciprocal to each other","equal to each other","no relation between them","Time period is one half of the Frequency","reciprocal to each other"));
        arrayList.add(new ContentQuestionModel("Which of the following pairs represent two scalar quantities?","Mass, Acceleration","Temperature, Torque","Distance, Speed","Gravitational Intensity, Work","Distance, Speed"));
        arrayList.add(new ContentQuestionModel("The magnitude of the resultant of two vectors is maximum in which of the following case?","when vectors act in the same direction","when vectors act in the opposite direction","when vectors act at 90° to each other","None of the above","when vectors act in the same direction"));
        arrayList.add(new ContentQuestionModel("Which of the following conditions is true for an object to be in equilibrium?","No linear motion of the object","No rotational motion of the object","Minimum potential energy of the object","All of the above","All of the above"));
        arrayList.add(new ContentQuestionModel("Which of the following is correct about Kinetic energy during the projectile motion?","it is minimum at the point of projection","it is minimum at the highest point","it is maximum at the highest point","it is minimum at the point of reaching the ground","it is minimum at the highest point"));
        arrayList.add(new ContentQuestionModel("Which of the following is NOT correct about Vectors addition?","Vectors addition is associative","Vectors addition is commutative","None of the above","Vectors of different natures can be added","Vectors of different natures can be added"));
        arrayList.add(new ContentQuestionModel("The force acting on a body for a short time are called as:","Average force","Momentum","Impulse","Tension","Impulse"));
        arrayList.add(new ContentQuestionModel("The Newton’s third law is applicable when:","bodies are at rest","bodies are in motion","bodies are in the air","bodies are at rest or in motion","bodies are at rest or in motion"));


        arrayList.add(new ContentQuestionModel("What will be the work done in holding a 25 kg iron plate for 25 seconds?","25 j","1 j","0","625 j","0"));
        arrayList.add(new ContentQuestionModel("What is the effect on velocities of the two bodies of equal masses when they undergo elastic collision in one dimension?","remains same","gets interchanged","becomes twice of the original velocity","becomes half of the original velocity","gets interchanged"));
        arrayList.add(new ContentQuestionModel("Work done is defined as the dot product of which of the following vectors?","Force and acceleration","Force and area"," Force and instantaneous velocity","Force and displacement","Force and displacement"));
        arrayList.add(new ContentQuestionModel("Which of the following is NOT correct about units of work:","1 joule = 107 ergs","1 kg-m = 1 joule","1 kg-m = 9.8 joule","1 joule = 1 Nm","1 kg-m = 1 joule"));
        arrayList.add(new ContentQuestionModel("Work done will NOT be zero in which of the following case/cases?","When displacement is zero","When angle between force and displacement vector is zero","When angle between force and displacement vector is 90°","When force is zero","When angle between force and displacement vector is zero"));
        arrayList.add(new ContentQuestionModel("The work done by a variable force is given by:","square of the area under the force curve and the displacement axis","natural log of the area under the force curve and the displacement axis","twice the area under the force curve and the displacement axis","area under the force curve and the displacement axis","area under the force curve and the displacement axis"));
        arrayList.add(new ContentQuestionModel("The work done in moving a body over a smooth inclined plane does not depend on which of the following?","mass of the body","height of the inclined plane","slope of the inclined plane","All of the above","slope of the inclined plane"));
        arrayList.add(new ContentQuestionModel("What is the average power consumption of a heartbeat in an adult?","1.2 watt","112.5 watt","200 watt","500 watt","1.2 watt"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তাপমাত্রার স্কেলগুলির মধ্যে কোনটি নিখুঁত শূন্যের উপর ভিত্তি করে?", "সেলসিয়াস", "ফারেনহাইট", "কেলভিন", "র্যাঙ্কাইন", "কেলভিন"));
        arrayList.add(new ContentQuestionModel("একটি নির্দিষ্ট দূরত্বের জন্য মহাকর্ষীয় বাহিনীর তুলনায় তড়িৎস্তর শক্তি কতবার শক্তিশালী?", "102", "1036", "1012", "2", "1036"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি ক্লাসিকাল পদার্থবিজ্ঞানের অঙ্গ / অংশ?", "অপটিক্স", "থার্মোডাইনামিক্স", "এ এবং বি উভয়", "কিছুই নয়", "এ এবং বি উভয়"));
        arrayList.add(new ContentQuestionModel("আলোর কার্পাসকুলার তত্ত্বের জন্য নিম্নলিখিতের মধ্যে কাকে কৃতিত্ব দেওয়া হয়?", "আইজ্যাক নিউটন", "ক্রিশ্চিয়ান হিউজেনস", "আলবার্ট আইনস্টাইন", "জেমস ক্লার্ক ম্যাক্সওয়েল", "আইজ্যাক নিউটন"));
        arrayList.add(new ContentQuestionModel("মাধ্যাকর্ষণ বাহিনীর বৈশিষ্ট্যগুলির সম্পর্কে নিম্নলিখিতগুলির মধ্যে কোনটি সঠিক?", "এগুলি প্রকৃতির সবচেয়ে শক্তিশালী বাহিনী", "তারা বিপরীত বর্গক্ষেত্র আইন পালন করে", "এ এবং বি উভয়", "কিছুই নয়", "তারা বিপরীত বর্গক্ষেত্র আইন পালন করে"));
        arrayList.add(new ContentQuestionModel("সিভি ভি রমন নিম্নলিখিত বৈজ্ঞানিক আবিষ্কারগুলির মধ্যে কোনটি আবিষ্কার করেছিলেন?", "অণু দ্বারা আলোর অবিচ্ছিন্ন ছড়িয়ে পড়া", "সুপার কন্ডাকটিভিটি", "নিয়ন্ত্রিত পারমাণবিক বিচ্ছেদ", "সাইক্লোট্রন", "অণু দ্বারা আলোর অবিচ্ছিন্ন ছড়িয়ে পড়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে ভরগুলির বৃহত্তম ব্যবহারিক একক?", "স্লাগ", "এ.এম.ইউ", "হাইপারকিজি", "সি.এস.এল", "সি.এস.এল"));
        arrayList.add(new ContentQuestionModel("আলোকিত তীব্রতার জন্য এস.আই. ইউনিট কী?", "তিল", "অ্যাম্পিয়ার", "মোমেলা", "ক্যান্ডেল", "ক্যান্ডেল"));
        arrayList.add(new ContentQuestionModel("একটি প্রক্ষেপণটি কোন কোণে সর্বাধিক অনুভূমিক পরিসীমা অর্জন করবে?", "90 °", "60 °", "45 °", "30 °", "45 °"));
        arrayList.add(new ContentQuestionModel("অভিন্ন বৃত্তাকার গতির ক্ষেত্রে সময়কাল এবং ফ্রিকোয়েন্সিটির মধ্যে কী সম্পর্ক?", "একে অপরের প্রতিদান", "একে অপরের সমান", "তাদের মধ্যে কোনও সম্পর্ক নেই", "সময়কাল ফ্রিকোয়েন্সিটির অর্ধেক" , "একে অপরের প্রতিদান"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত জোড়াগুলির মধ্যে দুটি স্কেলারের পরিমাণকে উপস্থাপন করে?", "গণ, ত্বরণ", "তাপমাত্রা, টর্ক", "দূরত্ব, গতি", "মাধ্যাকর্ষণ তীব্রতা, কাজ", "দূরত্ব, গতি"));
        arrayList.add(new ContentQuestionModel("দুটি ভেক্টরের ফলাফলের মাত্রা নীচের কোনটির মধ্যে সর্বাধিক?", "যখন ভেক্টরগুলি একই দিকের সাথে কাজ করে", "যখন ভেক্টরগুলি বিপরীত দিকে কাজ করে", "যখন ভেক্টর একে অপরের সাথে 90 at এ কাজ করে "," উপরেরগুলির মধ্যে কোনওটিই ","যখন ভেক্টরগুলি বিপরীত দিকে কাজ করে"));
        arrayList.add(new ContentQuestionModel("অবজেক্টের ভারসাম্য রক্ষার জন্য নিম্নলিখিত শর্তগুলির মধ্যে কোনটি সত্য?", "বস্তুর কোন রৈখিক গতি", "বস্তুর কোনও আবর্তনীয় গতি", "বস্তুর নূন্যতম সম্ভাবনা শক্তি", "উপরের সবগুলো","উপরের সবগুলো"));
        arrayList.add(new ContentQuestionModel("প্রক্ষেপণ গতির সময় গতিশক্তি সম্পর্কে নিম্নলিখিতটির মধ্যে কোনটি সঠিক?", "এটি প্রক্ষেপণের বিন্দুতে ন্যূনতম", "এটি সর্বোচ্চ পয়েন্টে ন্যূনতম", "এটি সর্বোচ্চ পয়েন্টে সর্বোচ্চ", "এটি মাটিতে পৌঁছানোর বিন্দুতে ন্যূনতম ","এটি সর্বোচ্চ পয়েন্টে ন্যূনতম"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি ভেক্টর সংযোজন সম্পর্কে সঠিক নয়?", "ভেক্টর সংযোজনটি মিশ্রণমূলক", "ভেক্টর সংযোজনটি ক্রমবর্ধমান", "উপরের কিছুই নয়", "বিভিন্ন প্রকৃতির ভেক্টর যুক্ত করা যায", "বিভিন্ন প্রকৃতির ভেক্টর যুক্ত করা যায"));
        arrayList.add(new ContentQuestionModel("অল্প সময়ের জন্য একটি শরীরে যে শক্তি কাজ করে তাকে বলা হয়:", "গড় বল", "গতিবেগ", "ইমপালস", "উত্তেজনা", "গতিবেগ"));
        arrayList.add(new ContentQuestionModel("নিউটনের তৃতীয় আইনটি তখন প্রযোজ্য যখন:", "দেহগুলি বিশ্রামে থাকে", "দেহগুলি গতিতে থাকে", "দেহগুলি বায়ুতে থাকে", "দেহগুলি বিশ্রামে বা গতিতে থাকে", "দেহগুলি বিশ্রামে বা গতিতে থাকে"));
        arrayList.add(new ContentQuestionModel("যোগাযোগের ক্ষেত্রে যে কোনও দুটি পৃষ্ঠের মধ্যে ঘর্ষণকে সীমাবদ্ধ করার সহগ সম্পর্কে নিম্নরূপটি সঠিক?", "এটি ঘর্ষণ কোণের দ্বিগুণ স্পর্শকারের সমান", "এটি ঘর্ষণ কোণের দ্বিগুণ সমান", "এটি ঘর্ষণ কোণের স্পর্শক সমান", "এটি ঘর্ষণ কোণের সাইন সমান", "এটি ঘর্ষণ কোণের স্পর্শক সমান"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি শক্তি প্রয়োগের উদাহরণ?", "যখন বিশ্রামের কোনও শরীর চলতে শুরু করে", "যখন একটি চলমান দেহ থামে", "যখন চলা শরীর তার দিক পরিবর্তন করে", "উপরের সমস্ত", "উপরের সমস্ত"));
        arrayList.add(new ContentQuestionModel("দুটি ভেক্টর এ এবং বি এর বিন্দু পণ্য এ এবং বি এবং __________ এর দৈর্ঘ্যের সমান?", "তাদের মধ্যে বৃহত্তম কোণের কোসাইন", "তাদের মধ্যে বৃহত্তম কোণের সাইন", "তাদের মধ্যে ক্ষুদ্রতম কোণটির কোসাইন"," তাদের মধ্যে ক্ষুদ্রতম কোণের সাইন ","তাদের মধ্যে ক্ষুদ্রতম কোণটির কোসাইন"));
        arrayList.add(new ContentQuestionModel("যখন একটি দেহ আসলে অন্য দেহের পৃষ্ঠের উপরে চলে যায় তখন ঘর্ষণটি হিসাবে পরিচিত:", "গতিশীল ঘর্ষণ", "সীমাবদ্ধতা ঘর্ষণ", "স্থির ঘর্ষণ", "নেতিবাচক ঘর্ষণ", "গতিশীল ঘর্ষণ"));
        arrayList.add(new ContentQuestionModel("রকেটের বেগ সম্পর্কে নিম্নলিখিতগুলির মধ্যে কোনটি সঠিক নয়?", "এটি গ্যাসের নিষ্কাশনের গতির সাথে সরাসরি সমানুপাতিক", "এটি রকেটের অভ্যন্তরীণ ভর অনুপাতের প্রাকৃতিক লগের সাথে সরাসরি সমানুপাতিক তাত্ক্ষণিকভাবে এর ভর ","রকেটের দৈর্ঘ্য"," উপরের সমস্ত ","রকেটের দৈর্ঘ্য"));
        arrayList.add(new ContentQuestionModel("যোগাযোগের ক্ষেত্রে যে কোনও দুটি পৃষ্ঠের মধ্যে ঘর্ষণকে সীমাবদ্ধ করার সহগ সম্পর্কে নিম্নরূপটি সঠিক?", "এটি ঘর্ষণ কোণের দ্বিগুণ স্পর্শকারের সমান", "এটি ঘর্ষণ কোণের দ্বিগুণ সমান", "এটি ঘর্ষণ কোণের স্পর্শকের সমান", "এটি ঘর্ষণ কোণের সাইন সমান", "এটি ঘর্ষণ কোণের স্পর্শকের সমান"));
        arrayList.add(new ContentQuestionModel("1 কিলোগ্রাম শক্তি 1 কেজি দৈর্ঘ্যের শরীরে কত ত্বরণ তৈরি করে?", "1 এমএস -2", "0", "9.8 এমএস -2", "- 1 এমএস -2", "9.8 এমএস -2"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি কাজের ইউনিট সম্পর্কে সঠিক নয়:", "1 জোল = 107 এর্গস", "1 কেজি-মি = 1 জোল", "1 কেজি-মি = 9.8 জোল", "1 জোল = 1 এনএম" , "1 কেজি-মি = 1 জোল"));
        arrayList.add(new ContentQuestionModel("কোনও মসৃণ ঝোঁকযুক্ত বিমানের উপরে দেহকে সরানোর ক্ষেত্রে যে কাজগুলি করা হয়েছে তা নিম্নলিখিত কোনটির উপর নির্ভর করে না?", "শরীরের ভর", "ঝুঁকির বিমানের উচ্চতা", "ঝোঁকযুক্ত বিমানের opeাল", "সমস্ত কিছুই উপরের ","ঝুঁকির বিমানের উচ্চতা"));
        arrayList.add(new ContentQuestionModel("সি। সি। সিস্টেমে পাওয়ারের পরম ইউনিট কী?", "ডায়ন", "এরগ", "ওয়াট", "এরগ এস -১", "এরগ এস -১"));
        arrayList.add(new ContentQuestionModel("1 ইলেকট্রন ভোল্ট শক্তি ____?", "3.6 x 106 জে", "1.6 x 10-19 জে", "3.6 x 10-19 জে", "1.6 x 10-18 জে", "1.6 x 10-19 জে"));
        arrayList.add(new ContentQuestionModel("25 সেকেন্ডের জন্য 25 কেজি লোহার প্লেট ধরে রাখার কাজটি কী হবে?", "25 জ", "1 জে", "0", "625 জে", "0"));
        arrayList.add(new ContentQuestionModel("সমান জনগণের দুটি দেহের বেগের যখন এক মাত্রায় স্থিতিস্থাপক সংঘর্ষ হয় তার গতিবেগের উপর কী প্রভাব থাকে?", "একই থাকে", "পরস্পর বদলে যায়", "মূল বেগের দ্বিগুণ হয়ে যায়", "মূলটির অর্ধেক হয়ে যায়  বেগ ","পরস্পর বদলে যায়"));
        arrayList.add(new ContentQuestionModel("সম্পন্ন কাজটি নীচের কোন ভেক্টরের ডট পণ্য হিসাবে সংজ্ঞায়িত?", "বল এবং ত্বরণ", "বাহিনী এবং অঞ্চল", "বাহিনী এবং তাত্ক্ষণিক বেগ", "বল এবং স্থানচ্যুতি", "বল এবং স্থানচ্যুতি"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি কাজের ইউনিট সম্পর্কে সঠিক নয়:", "1 জোল = 107 এর্গস", "1 কেজি-মি = 1 জোল", "1 কেজি-মি = 9.8 জোল", "1 জোল = 1 এনএম" , "1 কেজি-মি = 1 জোল"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কাজগুলির মধ্যে কোনটি শূন্য হবে না?", "যখন স্থানচ্যুতি শূন্য হয়", "যখন বল এবং স্থানচ্যূত ভেক্টরের মধ্যবর্তী কোণটি শূন্য হয়", "যখন বল এবং স্থানচ্যূত ভেক্টরের মধ্যবর্তী কোণ 90 ° হয়" ,"যখন বল শূন্য হয়", "যখন বল এবং স্থানচ্যূত ভেক্টরের মধ্যবর্তী কোণটি শূন্য হয়"));
        arrayList.add(new ContentQuestionModel("একটি পরিবর্তনশীল শক্তির দ্বারা কাজটি দেওয়া হয়:", "ফোর্স বক্ররেখা এবং স্থানচ্যুতি অক্ষের আওতাধীন অঞ্চলের বর্গক্ষেত্র", "ফোর্সের বক্ররেখা এবং স্থানচ্যুতি অক্ষের আওতাধীন অঞ্চলের প্রাকৃতিক লগ", "বল বক্ররেখা এবং স্থানচ্যুতি অক্ষের অধীনে অঞ্চল"," বল বক্ররেখা এবং স্থানচ্যুতি অক্ষ ","বল বক্ররেখা এবং স্থানচ্যুতি অক্ষের অধীনে অঞ্চল"));
        arrayList.add(new ContentQuestionModel("কোনও মসৃণ ঝোঁকযুক্ত বিমানের উপরে দেহকে সরানোর ক্ষেত্রে যে কাজগুলি করা হয়েছে তা নিম্নলিখিত কোনটির উপর নির্ভর করে না?", "শরীরের ভর", "ঝুঁকির বিমানের উচ্চতা", "ঝোঁকযুক্ত বিমানের opeাল", "সমস্ত কিছুই উপরের ","ঝুঁকির বিমানের উচ্চতা"));
        arrayList.add(new ContentQuestionModel("প্রাপ্ত বয়স্কের হার্টবিটের গড় শক্তি খরচ কত?", "১.২ ওয়াট", "১১২.৫ ওয়াট", "২০০ ওয়াট", "৫০০ ওয়াট", "১.২ ওয়াট"));
        arrayList.add(new ContentQuestionModel("1 ইলেকট্রন ভোল্ট শক্তি ____?", "3.6 x 106 জে", "1.6 x 10-19 জে", "3.6 x 10-19 জে", "1.6 x 10-18 জে", "1.6 x 10-19 জে"));
        arrayList.add(new ContentQuestionModel("নিখুঁত স্থিতিস্থাপক সংঘর্ষের জন্য পুনঃস্থাপনের সহগ কী?", "0", "1", "- 1", "100", "1"));
        arrayList.add(new ContentQuestionModel("সর্বাধিক কাজ করার জন্য বল এবং স্থানচ্যুত করার মধ্যবর্তী কোণটি কী হওয়া উচিত?", "0 °", "90 °", "180 °", "30 °", "0 °"));
        arrayList.add(new ContentQuestionModel("ইউনিট ভর দুটি ইউনিট পৃথক পৃথক পৃথক কেন্দ্র স্থাপন করে দুটি দেহের ক্ষেত্রে সর্বজনীন মহাকর্ষীয় ধ্রুবক সম্পর্কে নিম্নলিখিতগুলির মধ্যে সত্য?", "এটি তাদের মধ্যে আকর্ষণীয় শক্তির সমান", "এটি সমান তাদের মধ্যে আকর্ষণ বলের দ্বিগুণ "," এটি তাদের মধ্যে আকর্ষণীয় শক্তির অর্ধেক সমান "," এটি তাদের মধ্যে আকর্ষণীয় শক্তির দশগুণ সমান ","এটি তাদের মধ্যে আকর্ষণীয় শক্তির সমান"));
        arrayList.add(new ContentQuestionModel("সিজিএস সিস্টেমে গ্র্যাভিটেশনাল ফিল্ডের তীব্রতার একক কী?", "ডায়ন সেমি জি -1", "ডায়ন জি -২", "ডায়ন সেমি জি 2", "ডাইনে জি -১", "ডাইনে জি -১"));
        arrayList.add(new ContentQuestionModel("সমুদ্রপৃষ্ঠে, মেরুতে এবং নিরক্ষীয় অঞ্চলে মাধ্যাকর্ষণজনিত কারণে ত্বরণের মানের মধ্যে পার্থক্য কী?", "কোনও পার্থক্য নেই", "9.8 সেমি এস -2", "1.80 সেমি এস -2", "কিছুই নয় উপরের ","1.80 সেমি এস -2"));
        arrayList.add(new ContentQuestionModel("মাধ্যাকর্ষণজনিত কারণে ত্বরণের মান সম্পর্কে নিম্নলিখিতটির মধ্যে কোনটি সঠিক?", "এটি সমভূমির চেয়ে পাহাড়ের চেয়ে বড়", "এটি সমভূমির চেয়ে পাহাড়ের চেয়ে কম", "এটি পাহাড় এবং সমভূমির সমান", "উপরের কিছুই নয়", "এটি সমভূমির চেয়ে পাহাড়ের চেয়ে কম"));
        arrayList.add(new ContentQuestionModel("ইউনিভার্সাল গ্র্যাভিটেশনাল কনস্ট্যান্টের মান কত?", "6.67 × 10-9 এন – এম 2 কেজি – 2", "6.67 × 10-10 এন – এম 2 কেজি – 2", "6.67 × 1011 এন – এম 2 কেজি – 2 ","6.67 × 10-11 এন – এম 2 কেজি – 2","6.67 × 10-11 এন – এম 2 কেজি – 2"));
        arrayList.add(new ContentQuestionModel("দুটি বস্তুর মধ্যে মহাকর্ষীয় শক্তির উপর নির্ভর করে না?", "মাধ্যাকর্ষণ ধ্রুবক", "বস্তুর মধ্যে দূরত্ব", "বস্তুর ভরগুলির গুণমান", "বস্তুর ভরগুলির যোগফল", "বস্তুর ভরগুলির যোগফল"));
        arrayList.add(new ContentQuestionModel("আমরা নূন্যতম বেগকে কী বলব যার সাহায্যে কোনও দেহকে প্রজেক্ট করা উচিত, যাতে এটি কেবল মহাকর্ষীয় টানকে কাটিয়ে উঠতে সক্ষম করে তোলে?", "অরবিটাল বেগ", "মহাকর্ষীয় বেগ", "পালানোর বেগ", "কোনওটিই নয় উপরে","কোনওটিই নয় উপরে"));
        arrayList.add(new ContentQuestionModel("গ্রহের বায়ুমণ্ডল থাকতে নিম্নের কোনটি শর্তটি সত্য?", "এর বায়ুমণ্ডলে অণুর বেগ পালানোর বেগের চেয়ে কম", "এর বায়ুমণ্ডলে অণুর বেগ পালনের বেগের চেয়ে বেশি", "অণুর বেগ  তার বায়ুমণ্ডলে পালানোর বেগ দ্বিগুণ হয় "," এর বায়ুমণ্ডলে অণুগুলির গতিবেগ পালনের বেগের সমান ","এর বায়ুমণ্ডলে অণুর বেগ পালানোর বেগের চেয়ে কম"));
        arrayList.add(new ContentQuestionModel("পৃথিবীর চারপাশে প্রদত্ত কক্ষপথে উপগ্রহ স্থাপনের জন্য প্রয়োজনীয় ন্যূনতম গতি হিসাবে পরিচিত:", "এস্কেপ বেগ", "অরবিটাল বেগ", "গতিবেগ বেগ", "উপরের কিছুই নয়", "অরবিটাল বেগ"));
        arrayList.add(new ContentQuestionModel("পৃথিবীর পৃষ্ঠের খুব কাছাকাছি প্রদক্ষিণ করে উপগ্রহের গতির গতিবেগ নীচের কোনটি?", "7.92 কিমি / সে", "৯.৮ কিমি / সে", "১১.২ কিমি / সে", "১৪.৮ কিমি / সে" , "7.92 কিমি / সে"));
        arrayList.add(new ContentQuestionModel("উপগ্রহের কৌণিক গতিবেগ নীচের কোনটির উপর নির্ভর করে?", "উপগ্রহের গণ", "গ্রহের গণ", "উপগ্রহের কক্ষপথের ব্যাসার্ধ", "উপরের সমস্ত", "উপরের সমস্ত"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा तापमान पैमाने पर पूर्ण शून्य पर आधारित है?", "सेल्सियस", "फ़ारेनहाइट", "केल्विन", "रैंकिन", "केल्विन"));
        arrayList.add(new ContentQuestionModel("कितनी बार इलेक्ट्रोस्टैटिक बलों को एक निश्चित दूरी के लिए गुरुत्वाकर्षण बलों की तुलना में मजबूत है?", "102", "1036", "1012", "2", "1036"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन शास्त्रीय भौतिकी का हिस्सा है?", "प्रकाशिकी", "ऊष्मप्रवैगिकी", "दोनों एक और बी", "कोई नहीं", "दोनों एक और बी"));
        arrayList.add(new ContentQuestionModel("प्रकाश के Corpuscular सिद्धांत के लिए निम्नलिखित में से किसे श्रेय दिया जाता है?", "आइजैक न्यूटन", "क्रिस्टियान ह्यूजेंस", "अल्बर्ट आइंस्टीन", "जेम्स क्लर्क मैक्सवेल", "आइजैक न्यूटन"));
        arrayList.add(new ContentQuestionModel("गुरुत्वाकर्षण बल के गुणों के बारे में निम्नलिखित में से कौन सा सही है?", "वे प्रकृति की सबसे मजबूत ताकतें हैं", "वे उलटा वर्ग कानून का पालन करते हैं", "दोनों एक और बी", "कोई नहीं", "दोनों एक और बी"));
        arrayList.add(new ContentQuestionModel("सी। वी। रमन द्वारा निम्नलिखित में से कौन सी वैज्ञानिक खोज की गई थी?", "अणुओं द्वारा प्रकाश का प्रकीर्णन प्रकीर्णन", "सुपर कंडक्टिविटी", "नियंत्रित परमाणु विखंडन", "साइक्लोट्रॉन", "अणुओं द्वारा प्रकाश का प्रकीर्णन प्रकीर्णन"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा द्रव्यमान की सबसे बड़ी व्यावहारिक इकाई है?", "स्लग", "a.m.u", "हाइपर किलोग्राम", "C.S.L", "C.S.L"));
        arrayList.add(new ContentQuestionModel("चमकदार तीव्रता के लिए एस.आई. इकाई क्या है?", "तिल", "एम्पीयर", "कैंडेला", "वेबर", "कैंडेला"));
        arrayList.add(new ContentQuestionModel("एक प्रक्षेप्य किस कोण पर अधिकतम क्षैतिज सीमा प्राप्त करेगा?", "90 °", "60 °", "45 °", "30 °", "45 °"));
        arrayList.add(new ContentQuestionModel("समान अवधि गति के मामले में समय अवधि और आवृत्ति के बीच संबंध क्या है?", "एक दूसरे के लिए पारस्परिक", "एक दूसरे के बराबर", "उनके बीच कोई संबंध नहीं", "समय अवधि आवृत्ति का एक आधा है" , "एक दूसरे के लिए पारस्परिक"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी जोड़ी दो स्केलर मात्राओं का प्रतिनिधित्व करती है?", "द्रव्यमान, त्वरण", "तापमान, टोक़", "दूरी, गति", "गुरुत्वाकर्षण तीव्रता, कार्य", "दूरी, गति"));
        arrayList.add(new ContentQuestionModel("दो वैक्टरों के परिणाम का परिमाण निम्नलिखित में से किस मामले में अधिकतम है?", "जब वैक्टर एक ही दिशा में कार्य करते हैं", "जब वैक्टर विपरीत दिशा में कार्य करते हैं", "जब वेक्टर एक दूसरे से 90 ° कार्य करते हैं "," उपरोक्त में से कोई नहीं ","जब वैक्टर एक ही दिशा में कार्य करते हैं"));
        arrayList.add(new ContentQuestionModel("किसी वस्तु के संतुलन में होने के लिए निम्न में से कौन सी स्थिति सही है?", "ऑब्जेक्ट की कोई रेखीय गति", "ऑब्जेक्ट की कोई घूर्णी गति", "ऑब्जेक्ट की न्यूनतम संभावित ऊर्जा", "उपरोक्त सभी","उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("प्रक्षेप्य गति के दौरान काइनेटिक ऊर्जा के बारे में निम्नलिखित में से कौन सही है?", "यह प्रक्षेपण के बिंदु पर न्यूनतम है", "यह उच्चतम बिंदु पर न्यूनतम है", "यह उच्चतम बिंदु पर अधिकतम है", "यह जमीन तक पहुँचने के बिंदु पर न्यूनतम है ","यह उच्चतम बिंदु पर न्यूनतम है"));
        arrayList.add(new ContentQuestionModel("वैक्टर जोड़ के बारे में निम्नलिखित में से कौन सा सही नहीं है?", "वैक्टर जोड़ साहचर्य है", "वैक्टर्स जोड़ सराहनीय है", "उपरोक्त में से कोई भी नहीं", "अलग-अलग निक्टर्स के वैक्टर जोड़े जा सकते हैं", "अलग-अलग निक्टर्स के वैक्टर जोड़े जा सकते हैं"));
        arrayList.add(new ContentQuestionModel("शरीर पर थोड़े समय के लिए काम करने वाले बल को कहा जाता है:", "औसत बल", "गति", "आवेग", "तनाव", "आवेग"));
        arrayList.add(new ContentQuestionModel("न्यूटन का तीसरा नियम तब लागू होता है जब:", "शव आराम में होते हैं", "शव गति में होते हैं", "शव हवा में होते हैं", "शव आराम में या गति में होते हैं", "शव आराम में होते हैं"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन संपर्क में किसी भी दो सतहों के बीच घर्षण को सीमित करने के गुणांक के बारे में सही है?", "यह घर्षण के कोण के दुगुने स्पर्श के बराबर है", "यह घर्षण के कोण के दुगुने साइन के बराबर है" , "यह घर्षण के कोण के स्पर्शरेखा के बराबर है", "यह घर्षण के कोण के साइन के बराबर है", "यह घर्षण के कोण के स्पर्शरेखा के बराबर है"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन बल के अनुप्रयोग का एक उदाहरण है?", "जब कोई शरीर आराम से चलना शुरू करता है", "जब एक गतिशील शरीर बंद हो जाता है", "जब चलती हुई शरीर अपनी दिशा बदलती है", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("दो वैक्टर ए और बी का डॉट उत्पाद ए और बी और __________ के परिमाण के उत्पाद के बराबर है?", "उनके बीच सबसे बड़े कोण का कोसाइन", "उनके बीच सबसे बड़े कोण की साइन", "कोसाइन उनके बीच का सबसे छोटा कोण ","उनके बीच का सबसे छोटा कोण","उनके बीच का सबसे छोटा कोण"));
        arrayList.add(new ContentQuestionModel("जब एक शरीर वास्तव में दूसरे शरीर की सतह पर घूम रहा होता है, तो घर्षण को इस प्रकार जाना जाता है:", "काइनेटिक घर्षण", "सीमित घर्षण", "स्टेटिक घर्षण", "नकारात्मक घर्षण", "काइनेटिक घर्षण"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा किसी भी समय रॉकेट के वेग के बारे में सही नहीं है?", "यह गैसों की निकास गति के सीधे आनुपातिक है", "यह सीधे रॉकेट के आंतरिक द्रव्यमान के अनुपात के प्राकृतिक लॉग के लिए आनुपातिक है।  उस पल में इसका द्रव्यमान ","रॉकेट की लंबाई"," उपरोक्त सभी ","रॉकेट की लंबाई"));//22
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन संपर्क में किसी भी दो सतहों के बीच घर्षण को सीमित करने के गुणांक के बारे में सही है?", "यह घर्षण के कोण के दुगुने स्पर्श के बराबर है", "यह घर्षण के कोण के दुगुने साइन के बराबर है" , "यह घर्षण के कोण के स्पर्शरेखा के बराबर है", "यह घर्षण के कोण के साइन के बराबर है", "यह घर्षण के कोण के स्पर्शरेखा के बराबर है"));
        arrayList.add(new ContentQuestionModel("1 किलोग्राम बल, द्रव्यमान 1 किलो के शरीर में कितना त्वरण पैदा करता है?", "1 एमएस -2", "0", "9.8 एमएस -2", "- 1 एमएस -2", "9.8 एमएस -2"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन काम की इकाइयों के बारे में सही नहीं है:", "1 जूल = 107 ergs", "1 किग्रा-मी = 1 जूल", "1 kg-m = 9.8 जूल", "1 joule - 1 Nm" , "1 किग्रा-मी = 1 जूल"));//25
        arrayList.add(new ContentQuestionModel("सुचारु रूप से झुकाव वाले विमान के ऊपर एक शरीर को हिलाने में किया गया कार्य निम्न में से किस पर निर्भर नहीं करता है?", " झुकाव वाले विमान का ढलान ", "झुके हुए विमान की ऊँचाई", "झुके हुए विमान का ढलान", "सभी उपरोक्त "," झुकाव वाले विमान का ढलान "));
        arrayList.add(new ContentQuestionModel("C.g.s प्रणाली में शक्ति की पूर्ण इकाई क्या है?", "Dyne", "erg", "watt", "erg s-1", "erg s-1"));
        arrayList.add(new ContentQuestionModel("ऊर्जा का 1 इलेक्ट्रॉन वोल्ट ____ के बराबर है?", "3.6 x 106 J", "1.6 x 10-19 जे", "3.6 x 10-19 J", "1.6 x 10-18 J", "1.6 x 10-19 जे"));
        arrayList.add(new ContentQuestionModel("25 सेकंड के लिए 25 किलो लोहे की प्लेट रखने में क्या काम होगा?", "25 जे", "1 जे", "0", "625 जे", "0"));
        arrayList.add(new ContentQuestionModel("समान आयाम में लोचदार टक्कर से गुजरने पर दोनों समान द्रव्यमानों के वेगों पर क्या प्रभाव पड़ता है?", "एक ही रहता है", "एक दूसरे से जुड़ जाता है", "आपस में जुड़ जाता है", "मूल का आधा हो जाता है  वेग ","आपस में जुड़ जाता है"));
        arrayList.add(new ContentQuestionModel("किए गए कार्य को निम्नलिखित में से किस वैक्टर के डॉट उत्पाद के रूप में परिभाषित किया गया है?", "बल और त्वरण", "बल और क्षेत्र", "बल और तात्कालिक वेग", "बल और विस्थापन", "बल और विस्थापन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन काम की इकाइयों के बारे में सही नहीं है:", "1 जूल = 107 ergs", "1 किग्रा-मी = 1 जूल", "1 kg-m = 9.8 जूल", "1 joule - 1 Nm" , "1 किग्रा-मी = 1 जूल"));
        arrayList.add(new ContentQuestionModel("किया गया कार्य निम्न में से किस मामले / मामलों में शून्य नहीं होगा?", "जब विस्थापन शून्य हो", "जब बल और विस्थापन वेक्टर के बीच का कोण शून्य हो", "जब बल और विस्थापन वेक्टर के बीच का कोण 90 ° हो", "बल और विस्थापन वेक्टर के बीच का कोण शून्य होता है", "बल और विस्थापन वेक्टर के बीच का कोण शून्य होता है"));//33
        arrayList.add(new ContentQuestionModel("बल वक्र और विस्थापन अक्ष के तहत क्षेत्र का वर्ग  " ," एक चर बल द्वारा किया गया है  द्वारा दिया गया है", "बल वक्र और विस्थापन अक्ष के तहत क्षेत्र का प्राकृतिक लॉग", "दो बार के तहत क्षेत्र बल वक्र और विस्थापन अक्ष "," बल वक्र और विस्थापन अक्ष के अंतर्गत क्षेत्र ","बल वक्र और विस्थापन अक्ष के तहत क्षेत्र का प्राकृतिक लॉग"));
        arrayList.add(new ContentQuestionModel("सुचारु रूप से झुकाव वाले विमान के ऊपर एक शरीर को हिलाने में किया गया कार्य निम्न में से किस पर निर्भर नहीं करता है?", "शरीर का द्रव्यमान", "झुके हुए विमान की ऊँचाई", "झुके हुए विमान का ढलान", "सभी उपरोक्त ","झुके हुए विमान का ढलान"));
        arrayList.add(new ContentQuestionModel("एक वयस्क में दिल की धड़कन की औसत बिजली की खपत क्या है?", "1.2 वाट", "112.5 वाट", "200 वाट", "500 वाट", "1.2 वाट"));
        arrayList.add(new ContentQuestionModel("ऊर्जा का 1 इलेक्ट्रॉन वोल्ट ____ के बराबर है?", "3.6 x 106 J", "1.6 x 10-19 जे", "3.6 x 10-19 J", "1.6 x 10-18 J", "1.6 x 10-19 जे"));
        arrayList.add(new ContentQuestionModel("पूरी तरह से लोचदार टक्कर के लिए बहाली का गुणांक क्या है?", "0", "1", "- 1", "100", "1"));
        arrayList.add(new ContentQuestionModel("अधिकतम कार्य के लिए बल और विस्थापन के बीच का कोण क्या होना चाहिए?", "0 °", "90 °", "180 °", "30 °", "0 °"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा दो इकाइयों के प्रत्येक इकाई द्रव्यमान के मामले में सार्वभौमिक गुरुत्वाकर्षण स्थिरांक के बारे में सही है, जो उनके केंद्र को इकाई दूरी से अलग रखा गया है?", "यह उनके बीच आकर्षण बल के बराबर है", "यह बराबर है उनके बीच आकर्षण का दोगुना बल "," यह उनके बीच आकर्षण के आधे बल के बराबर है "," यह उनके बीच आकर्षण के बल के दस गुना के बराबर है ","यह उनके बीच आकर्षण बल के बराबर है"));
        arrayList.add(new ContentQuestionModel("Cgs सिस्टम में गुरुत्वाकर्षण क्षेत्र की तीव्रता की इकाई क्या है?", "Dyne cm g-1", "dyne g-2", "dyne cm g2", "dyne g-1", "dyne g-1"));
        arrayList.add(new ContentQuestionModel("समुद्र स्तर पर, ध्रुवों पर और भूमध्य रेखा पर गुरुत्वाकर्षण के कारण त्वरण के मूल्य में क्या अंतर है?", "कोई अंतर नहीं", "9.8 सेमी एस -2", "1.80 सेमी एस -2", "कोई नहीं उपरोक्त ","1.80 सेमी एस -2"));
        arrayList.add(new ContentQuestionModel("गुरुत्वाकर्षण के कारण त्वरण के मूल्य के बारे में निम्नलिखित में से कौन सही है?", "यह मैदानों की तुलना में पहाड़ों पर अधिक है", "यह पहाड़ों की तुलना में पहाड़ों पर कम है", "यह पहाड़ों और मैदानों के बराबर है", "उपरोक्त में से कोई नहीं", "यह मैदानों की तुलना में पहाड़ों पर अधिक है"));
        arrayList.add(new ContentQuestionModel("यूनिवर्सल गुरुत्वाकर्षण कॉन्स्टैंट का मान क्या है?", "6.67 × 10-9 N-m2 kg – 2", "6.67 × 10-10 N-m2 kg-2", "6.67 × 1011 N-m2 kg-2 "," 6.67 × 10-11 N-m2 kg -2"," 6.67 × 10-11 N-m2 kg -2"));//44
        arrayList.add(new ContentQuestionModel("निम्न में से किस पर दो वस्तुओं के बीच गुरुत्वाकर्षण बल निर्भर नहीं करता है?", "गुरुत्वाकर्षण स्थिरांक", "वस्तुओं के बीच की दूरी", "वस्तुओं के द्रव्यमान का उत्पाद", "वस्तुओं के द्रव्यमान का योग" , "वस्तुओं के द्रव्यमान का योग"));
        arrayList.add(new ContentQuestionModel("हम उस न्यूनतम वेग को क्या कहते हैं जिसके साथ एक शरीर का अनुमान लगाया जाना चाहिए, ताकि इसे गुरुत्वाकर्षण खिंचाव को दूर करने में सक्षम किया जा सके?", "कक्षीय वेग", "गुरुत्वाकर्षण वेग", "एस्केप वेलोसिटी" ,"कोई नहीं ऊपर ","एस्केप वेलोसिटी"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी स्थिति किसी ग्रह के वायुमंडल के लिए सही होगी?", "उसके वायुमंडल में अणुओं का वेग भागने के वेग से कम है", "इसके वायुमंडल में अणुओं का वेग भागने के वेग से अधिक है", "अणुओं का वेग इसके वातावरण में एस्केप वेलोसिटी से दोगुना है","इसके वायुमंडल में अणुओं का वेग एस्केप वेलोसिटी से कम है","इसके वायुमंडल में अणुओं का वेग एस्केप वेलोसिटी से कम है"));//47
        arrayList.add(new ContentQuestionModel("पृथ्वी के चारों ओर दी गई कक्षा में एक उपग्रह को रखने के लिए आवश्यक न्यूनतम गति को इस रूप में जाना जाता है:", "एस्केप वेलोसिटी", "ऑर्बिटल वेलोसिटी", "काइनेटिक वेग", "उपरोक्त में से कोई नहीं", "ऑर्बिटल वेलोसिटी"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा उपग्रह पृथ्वी की सतह के बहुत निकट की परिक्रमा का कक्षीय वेग है?", "7.92 किमी / सेकंड", "9.8 किमी / सेकंड", "11.2 किमी / सेकंड", "14.8 किमी / सेकंड" , "7.92 किमी / सेकंड"));
        arrayList.add(new ContentQuestionModel("किसी उपग्रह की कोणीय गति निम्न में से किस पर निर्भर करती है?", "उपग्रह का द्रव्यमान", "ग्रह का द्रव्यमान", "उपग्रह की कक्षा का त्रिज्या", "उपरोक्त सभी", "उपरोक्त सभी"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("درج ذیل درجہ حرارت کے پیمانے میں کون سا مطلق صفر پر مبنی ہے؟" , "سیلسیئس" ,"فارن ہائیٹ" , "کیلن" , "رینکین","کیلن"));
        arrayList.add(new ContentQuestionModel("کتنی بار الیکٹروسٹیٹک قوتیں گروویٹیشنل فورسز کے مقابلے میں ایک مقررہ فاصلے کے لئے مضبوط ہیں؟","102","1036","1012","2","1036"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کلاسیکل فزکس کا حصہ ہے / ہیں؟" , "آپٹکس" , "ایک اور بی دونوں" , "دونوں اور بی" , "کوئی بھی نہیں","ایک اور بی دونوں"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس کو کارپورسکلر تھیوری آف لائٹ کا سہرا دیا گیا ہے؟" , "آئزک نیوٹن" , "کرسٹیان ہیوگنس" , "البرٹ آئنسٹائن" , "جیمز کلرک میکسویل","آئزک نیوٹن"));
        arrayList.add(new ContentQuestionModel("گریویٹیشنل فورسز کی خصوصیات کے بارے میں مندرجہ ذیل میں سے کون سا صحیح ہے؟" , "وہ فطرت کی سب سے مضبوط قوتیں ہیں" , "وہ الٹا مربع قانون کا مشاہدہ کرتے ہیں" , "دونوں اور اے" , "کوئی بھی نہیں","وہ الٹا مربع قانون کا مشاہدہ کرتے ہیں"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی سائنسی دریافت سی وی رمن نے کی تھی؟" , "انو کے ذریعہ روشنی کا غیر لچکدار بکھرنا" , "سپر کوندکٹاواٹی" , "کنٹرول شدہ نیوکلیئر فیوژن" , "سائکوٹٹرون","انو کے ذریعہ روشنی کا غیر لچکدار بکھرنا"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا بڑے پیمانے پر سب سے بڑا عملی یونٹ ہے؟" , "سلگ" , "C.S.L" , "ہائپرکگ" , "سی ایس ایل ایل","C.S.L"));
        arrayList.add(new ContentQuestionModel("برائٹ شدت کے لئے S.I. یونٹ کیا ہے؟" , "تل" , "امپیئر" , "موم بتی" , "ویبر","موم بتی"));//8
        arrayList.add(new ContentQuestionModel("ایک پرکشیپک کس زاویہ پر زیادہ سے زیادہ افقی رینج حاصل کرے گا؟","90°","60°"," 45°","30°"," 45°"));
        arrayList.add(new ContentQuestionModel("یکساں سرکلر حرکت کی صورت میں ٹائم پیریڈ اور فریکوئینسی کے درمیان کیا تعلق ہے؟" , "ایک دوسرے سے تکرار" , "ایک دوسرے کے برابر" , "ان کے مابین کوئی رشتہ نہیں" , "وقت کا تعدد فریکوئینسی کا نصف ہے","ایک دوسرے سے تکرار"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا جوڑا دو اسکیلر مقدار کی نمائندگی کرتا ہے؟" , "بڑے پیمانے پر ، ایکسلریشن" , "درجہ حرارت ، ٹارک" , "فاصلہ ، رفتار" , "کشش ثقل کی شدت ، کام","فاصلہ ، رفتار"));
        arrayList.add(new ContentQuestionModel("دو ویکٹر کے نتیجے کے نتیجے میں درج ذیل میں سے کس میں زیادہ سے زیادہ ہے؟" , "جب ویکٹر ایک ہی سمت میں کام کرتے ہیں" , "جب ویکٹر ایک ہی سمت میں کام کریں" , "جب ویکٹر ایک دوسرے کے ساتھ 90 at پر عمل کرتے ہیں "," مندرجہ بالا میں سے کوئی بھی نہیں ","جب ویکٹر ایک ہی سمت میں کام کریں"));
        arrayList.add(new ContentQuestionModel("کسی چیز کے توازن میں رہنے کے لئے درج ذیل میں سے کون سی حالت درست ہے؟" , "شے کی کوئی لکیری حرکت نہیں" , "شے کی کوئی گھماؤ حرکت نہیں" , "اوپر کا سارا" , "مندرجہ بالا تمام ","اوپر کا سارا"));//13
        arrayList.add(new ContentQuestionModel("پرکشیپک تحریک کے دوران متحرک توانائی کے بارے میں مندرجہ ذیل میں سے کون سا صحیح ہے؟" , "یہ پروجیکشن کے مقام پر کم سے کم ہے" , "یہ اعلی ترین مقام پر کم سے کم ہے" , "یہ اعلی ترین نقطہ پر زیادہ سے زیادہ ہے" ,"یہ زمین تک پہنچنے کے مقام پر کم سے کم ہے ","یہ اعلی ترین مقام پر کم سے کم ہے"));
        arrayList.add(new ContentQuestionModel("ویکٹرز کے اضافے کے بارے میں مندرجہ ذیل میں سے کون سا صحیح نہیں ہے؟" , "ویکٹرز کا اضافہ اسسوئیوٹیو ہے" , "ویکٹروں کا اضافہ معاشی ہے" , "مذکورہ بالا میں سے کوئی بھی نہیں" , "مختلف فطرت کے ویکٹر شامل کیے جاسکتے ہیں","مختلف فطرت کے ویکٹر شامل کیے جاسکتے ہیں"));//15
        arrayList.add(new ContentQuestionModel("جسم پر تھوڑی دیر کے لئے کام کرنے والی قوت کو کہا جاتا ہے:" , "اوسط قوت" , "لمحے" , "تسلسل" , "تناؤ","تسلسل"));
        arrayList.add(new ContentQuestionModel("نیوٹن کا تیسرا قانون لاگو ہوتا ہے جب:" , "لاشیں آرام سے ہیں" , "لاشیں حرکت میں ہیں" , "لاشیں ہوا میں ہیں" , "لاشیں آرام سے ہیں یا حرکت میں ہیں" ,"لاشیں آرام سے ہیں یا حرکت میں ہیں"));
        arrayList.add(new ContentQuestionModel("رابطے میں کسی بھی دو سطحوں کے مابین رگڑ کو محدود کرنے کے گتانک کے بارے میں مندرجہ ذیل میں سے کون سا صحیح ہے؟" , "یہ رگڑ کے زاویہ سے دو مرتبہ ٹینجینٹ کے برابر ہے" , "یہ رگڑ کے زاویہ کے دانے کے برابر ہے" , "یہ رگڑ کے زاویہ کے ٹینجنٹ کے برابر ہے" , "یہ رگڑ کے زاویہ کے جین کے برابر ہے","یہ رگڑ کے زاویہ کے ٹینجنٹ کے برابر ہے"));
        arrayList.add(new ContentQuestionModel("طاقت کے استعمال کی مثال مندرجہ ذیل میں سے کون سی ہے؟" , "جب ایک جسم آرام سے حرکت پذیر ہونے لگے" , "جب چلتا ہوا جسم رک جاتا ہے" , "جب جسم حرکت پذیر ہوتا ہے تو اس کی سمت تبدیل ہوجاتا ہے" , "اوپر کا سارا","اوپر کا سارا"));//19
        arrayList.add(new ContentQuestionModel("دو ویکٹر A اور B کی ڈاٹ پروڈکٹ A اور B کے طول و عرض کی پیداوار کے برابر ہے اور؟" , "ان کے درمیان سب سے بڑے زاویہ کا کوسائن" , "ان کے درمیان سب سے بڑے زاویہ کا جیب" , "سب سے چھوٹے کا کوسین ان کے درمیان زاویہ ","ان کے درمیان سب سے چھوٹے زاویہ کا کوسائن","ان کے درمیان سب سے چھوٹے زاویہ کا کوسائن"));
        arrayList.add(new ContentQuestionModel("جب واقعی ایک جسم دوسرے جسم کی سطح پر آگے بڑھتا ہے تو ، رگڑ کے نام سے جانا جاتا ہے:" , "متحرک رگڑ" , "رگڑ کو محدود کرنا" , "جامد رگڑ" , "منفی رگڑ","متحرک رگڑ"));
        arrayList.add(new ContentQuestionModel("کسی بھی وقت راکٹ کی رفتار کے بارے میں مندرجہ ذیل میں سے کون سا درست نہیں ہے؟" , "یہ گیسوں کی راستہ کی رفتار کے متناسب ہے" , "یہ راکٹ کے اندرونی بڑے پیمانے کے تناسب کے فطری لاگ کے متناسب ہے۔ اس کا بڑے پیمانے پر اس وقت ","راکٹ کی لمبائی"," مذکورہ بالا سب ","راکٹ کی لمبائی"));//22
        arrayList.add(new ContentQuestionModel("رابطے میں کسی بھی دو سطحوں کے مابین رگڑ کو محدود کرنے کے گتانک کے بارے میں مندرجہ ذیل میں سے کون سا صحیح ہے؟" , "یہ رگڑ کے زاویہ سے دو مرتبہ ٹینجینٹ کے برابر ہے" , "یہ رگڑ کے زاویہ کے دانے کے برابر ہے" , "یہ رگڑ کے زاویہ کے ٹینجنٹ کے برابر ہے" , "یہ رگڑ کے زاویہ کے جین کے برابر ہے","یہ رگڑ کے زاویہ کے ٹینجنٹ کے برابر ہے"));
        arrayList.add(new ContentQuestionModel("1 کلوگرام طاقت سے 1 کلو بڑے پیمانے پر جسم میں کتنا تیز رفتار پیدا ہوتا ہے؟","1 ms-2","0","9.8 ms-2","-1 ms-2","9.8 ms-2"));
        arrayList.add(new ContentQuestionModel("کام کی اکائیوں کے بارے میں مندرجہ ذیل میں سے کون سا صحیح نہیں ہے:" , "1 joule = 107 ergs", "1 kg-m = 1 joule","1 kg-m = 9.8 joule", "1 joule = 1 Nm","1 kg-m = 1 joule"));//25
        arrayList.add(new ContentQuestionModel("جسم کو ہموار مائل ہوائی جہاز پر منتقل کرنے میں جو کام ہوتا ہے اس کا انحصار مندرجہ ذیل میں سے کس پر نہیں ہوتا؟" , "جسم کا بڑے پیمانے پر" , "مائل طیارے کی لمبائی" , "مائل طیارے کی ڈھال" , "سب اوپر ","مائل طیارے کی ڈھال"));
        arrayList.add(new ContentQuestionModel("مثال کے طور پر نظام میں طاقت کا مطلق یونٹ کیا ہے؟" , "ڈائن" , "ارگ" , "واٹ", "بہت ہی S-1","بہت ہی S-1"));//27
        arrayList.add(new ContentQuestionModel("1 الیکٹران وولٹ توانائی ____ کے برابر ہے؟","3.6 x 106 J","1.6 x 10-19 J","3.6 x 10-19 J","1.6 x 10-18 J","1.6 x 10-19 J"));
        arrayList.add(new ContentQuestionModel("25 کلوگرام لوہے کی پلیٹ کو 25 سیکنڈ تک تھامنے میں کیا کام ہوگا؟","25 j","1 j","0","625 j","0"));
        arrayList.add(new ContentQuestionModel("جب ایک ہی جہت میں لچکدار تصادم سے گزرتے ہو تو مساوی عوام کے دو جسموں کی رفتار پر کیا اثر پڑتا ہے؟" , "ایک ہی رہتا ہے" , "آپس میں بدل جاتا ہے" , "آپس میں بدل جاتا ہے" , "اصلی کا آدھا ہوجاتا ہے" ,"آپس میں بدل جاتا ہے"));//30
        arrayList.add(new ContentQuestionModel("کام کیا ہوا مندرجہ ذیل میں سے کسی ویکٹر کی ڈاٹ پروڈکٹ کے طور پر تعی isن ہوا؟" , "فورس اور ایکسلریشن" , "فورس اینڈ ایریا" , "فورس اینڈ فوری رفتار" , "فورس اور نقل مکانی","فورس اینڈ فوری رفتار"  ));
        arrayList.add(new ContentQuestionModel("کام کی اکائیوں کے بارے میں مندرجہ ذیل میں سے کون سا صحیح نہیں ہے:" , "1 joule = 107 ergs", "1 kg-m = 1 joule", "1 kg-m = 9.8 joule", "1 joule = 1 Nm","1 kg-m = 1 joule"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسی ایک صورت میں کیا کام صفر نہیں ہوگا؟" , "جب نقل مکانی صفر ہے" , "جب قوت اور بے گھر ویکٹر کے درمیان زاویہ صفر ہوتا ہے" , "جب قوت اور بے گھر ویکٹر کے درمیان زاویہ 90 is ہوتا ہے تو ،" ,"جب قوت صفر ہو","جب قوت اور بے گھر ویکٹر کے درمیان زاویہ صفر ہوتا ہے"));
        arrayList.add(new ContentQuestionModel("متغیر قوت کے ذریعہ کام یہ کیا جاتا ہے:" , "فورس وکر اور نقل مکانی محور کے تحت علاقے کا مربع" , "فورس وکر اور نقل مکانی کے محور کے تحت علاقے کا قدرتی لاگ" , "دو بارہ زیریں رقبہ فورس وکر اور نقل مکانی محور ","فورس وکر اور نقل مکانی کے محور کے تحت کا علاقہ","فورس وکر اور نقل مکانی کے محور کے تحت کا علاقہ"));//34
        arrayList.add(new ContentQuestionModel("جسم کو ہموار مائل ہوائی جہاز پر منتقل کرنے میں جو کام ہوتا ہے اس کا انحصار مندرجہ ذیل میں سے کس پر نہیں ہوتا؟" , "جسم کا بڑے پیمانے پر" ,"مائل طیارے کی ڈھال" , "مائل طیارے کی ڈھلان" , "سب اوپر ","مائل طیارے کی ڈھال"));
        arrayList.add(new ContentQuestionModel("ایک بالغ میں دل کی دھڑکن کی اوسطا بجلی کی کھپت کتنی ہے؟" , "1.2 واٹ" , "112.5 واٹ" , "200 واٹ" , "500 واٹ","1.2 واٹ"));
        arrayList.add(new ContentQuestionModel("1 الیکٹران وولٹ توانائی ____ کے برابر ہے؟","3.6 x 106 J","1.6 x 10-19 J","3.6 x 10-19 J","1.6 x 10-18 J","1.6 x 10-19 J"));
        arrayList.add(new ContentQuestionModel("بالکل لچکدار تصادم کے ل rest معاوضے کا قابلیت کیا ہے؟","0","1","-1","100","1"));
        arrayList.add(new ContentQuestionModel("زیادہ سے زیادہ کام کرنے کے ل force طاقت اور نقل مکانی کے درمیان کون سا زاویہ ہونا چاہئے؟","0°","90°","180°","30°","0°"));
        arrayList.add(new ContentQuestionModel("زیادہ سے زیادہ کام کرنے کے ل force طاقت اور نقل مکانی کے درمیان کون سا زاویہ ہونا چاہئے؟","0°","90°","180°","30°","0°"));
        arrayList.add(new ContentQuestionModel("c.g.s سسٹم میں کشش ثقل شعبے کی شدت کا اکائی کیا ہے؟" , "dyne cm g-1", "dyne g-2", "dyne cm g2", "dyne g-1","dyne g-1"));
        arrayList.add(new ContentQuestionModel("سطح سمندر پر ، کھمبے اور خط استوا پر کشش ثقل کی وجہ سے ایکسلریشن کی قدر میں کیا فرق ہے؟","کوئی فرق نہیں" , "9.8 سینٹی میٹر s-2" , "1.80 cm s-2" , "مندرجہ بالا میں سے کوئی نہیں","1.80 cm s-2"));//42
        arrayList.add(new ContentQuestionModel("کشش ثقل کی وجہ سے ایکسلریشن کی قدر کے بارے میں مندرجہ ذیل میں سے کون سا صحیح ہے؟" , "یہ میدانی علاقوں سے پہاڑوں پر زیادہ ہے" , "یہ میدانی علاقوں سے پہاڑوں پر کم ہے" , "یہ میدانی علاقوں کے مقابلے پہاڑوں پر کم ہے" , "مندرجہ بالا میں سے کوئی بھی نہیں","یہ میدانی علاقوں کے مقابلے پہاڑوں پر کم ہے"));
        arrayList.add(new ContentQuestionModel("یونیورسل گریویٹیشنل کانسٹیٹینٹ کی کیا قیمت ہے؟","6.67×10-9 N–m2 kg–2","6.67×10-10 N–m2 kg–2","6.67×1011 N–m2 kg–2","6.67×10-11 N–m2 kg–2","6.67×10-11 N–m2 kg–2"));
        arrayList.add(new ContentQuestionModel("دو اشیاء کے مابین کشش ثقل کے درج ذیل میں سے کس پر انحصار نہیں ہے؟" , "کشش ثقل مستقل" , "اشیاء کے مابین فاصلہ" , "اشیاء کے عوام کی پیداوار" , "اشیاء کی کثیر تعداد کا مجموعہ","اشیاء کی کثیر تعداد کا مجموعہ"));//45
        arrayList.add(new ContentQuestionModel("ہم کم سے کم رفتار کو کیا کہتے ہیں جس کے ساتھ جسم کو پیش گوئی کرنا چاہئے ، تاکہ کشش ثقل کی کھینچ پر قابو پانے کے قابل بن سکے؟" , "مداری رفتار" , "کشش ثقل کی رفتار" , "رفتار سے فرار" , "کوئی بھی نہیں اوپر ","رفتار سے فرار"));
        arrayList.add(new ContentQuestionModel("کسی سیارے کے ماحول کے ل the درج ذیل میں سے کون سی حالت درست ہوگی؟" , "اس کے ماحول میں انو کی رفتار فرار کی رفتار سے کم ہے" , "اس کے ماحول میں انو کی رفتار فرار کی رفتار سے زیادہ ہے" , "انووں کی رفتار اس کی فضا میں فرار کی رفتار دوگنا ہے "," اس کے ماحول میں انو کی رفتار فرار کی رفتار کے برابر ہے ","اس کے ماحول میں انو کی رفتار فرار کی رفتار سے کم ہے"));
        arrayList.add(new ContentQuestionModel("زمین کے ارد گرد دیئے گئے مدار میں مصنوعی سیارہ رکھنے کے لئے درکار کم سے کم رفتار جس کے نام سے جانا جاتا ہے:" , "فرار کی رفتار" , "مداری کی رفتار" , "حرکیات کی رفتار" , "مذکورہ بالا میں سے کوئی بھی نہیں","مداری کی رفتار"));
        arrayList.add(new ContentQuestionModel("زمین کی سطح کے بالکل قریب گھومنے والے مصنوعی سیارہ کی مدار میں سے مندرجہ ذیل میں سے کون سا ہے؟","7.92 km/s","9.8 km/s","11.2 km/s","14.8 km/s","7.92 km/s"));
        arrayList.add(new ContentQuestionModel("مصنوعی سیارہ کی کونیی رفتار مندرجہ ذیل میں سے کس پر منحصر ہے؟" , "سیٹیلائٹ کا ماس" , "اوپر کا سارا" , "سیٹلائٹ کے مدار کا رداس" , "مذکورہ بالا سب","اوپر کا سارا"));



        return arrayList;


    }


}