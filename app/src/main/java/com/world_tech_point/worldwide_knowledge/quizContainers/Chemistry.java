package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Chemistry {
    private Context context;

    public Chemistry(Context context) {
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



    arrayList.add(new ContentQuestionModel("Mixture of which one of the following pairs of gases is the causes of occurance of most of the explosion in mines?","Hydrogen and oxygen","oxygen and acetylene","Methane and air","Carbon dioxide and methane","Methane and air"));
        arrayList.add(new ContentQuestionModel("Which synthetic fibre is known as artificial silk?","Cotton","Rayon","Terylene","Nylon","Rayon"));
        arrayList.add(new ContentQuestionModel("Bagasse, a by-product of sugar manufacturing industry is used for the production of ","Nylon","Glass","Paper","Alcohol","Paper"));
        arrayList.add(new ContentQuestionModel("Glass is made of the mixture of  ","Quartz and mica","Sand and salt","Sand and silicates","None of these","Sand and silicates"));
        arrayList.add(new ContentQuestionModel("Which one of the following is used as a filter in rubber tyres?","Graphite","Coal","Coke","Carbon black","Carbon black"));
        arrayList.add(new ContentQuestionModel("Which one of the following polymeric matreials is used for making bullet proof jacket? ","NYLON 6.6","RAYON","KEVLAR","DACRON","KEVLAR"));
        arrayList.add(new ContentQuestionModel("Which alloy contains nickel?","Brass","Bronze","Invar","Solder","Invar"));
        arrayList.add(new ContentQuestionModel("Which one of the following elements is not present in stainless steel? ","Iron","Tungsten","Chromium","Nickel","Tungsten"));
        arrayList.add(new ContentQuestionModel("Bronze is an alloy of","Tin and zinc","Iron and zinc","Copper and zinc","Copper and tin","Copper and tin"));
        arrayList.add(new ContentQuestionModel("Which of the following is a super cooled liquid?","Teflon","Glass","Mercury","Ice cream","Glass"));
        arrayList.add(new ContentQuestionModel("Which one of the following non metals is not a poor conductor of electricity ","Phosphorus","Selenium","Bromine","Sulphur  ","Selenium"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not a chemical change ?   ","Burning of coal in air","Fermentation of sugarcane juice","Cracking of petroleum","Crystallization of table salt from sea water","Crystallization of table salt from sea water"));
        arrayList.add(new ContentQuestionModel("Which metal remains in the liquid form under normal conditions?  ","zinc","radium","uranium","mercury","mercury"));
        arrayList.add(new ContentQuestionModel("Commercially, sodium bicarbonate is known as  ","Washing soda","Baking soda","Bleaching powder","Soda ash","Baking soda"));
        arrayList.add(new ContentQuestionModel("Acetyl salicylic acid is commonly used as  ","A pain killer","A sedative","Tear gas","A fertilizer","A pain killer"));
        arrayList.add(new ContentQuestionModel("Which metal is commonly used for making an electromagnet? ","Copper","Cobalt","Iron","Nickel","Iron"));
        arrayList.add(new ContentQuestionModel("The gas that is responsible for global warming is  ","Carbon dioxide","Oxygen","Methane","Sulphur dioxide","Carbon dioxide"));
        arrayList.add(new ContentQuestionModel("Which of the following is the source of common salt?  ","Bauxite","Pyrite","Calcite","Halite","Halite"));
        arrayList.add(new ContentQuestionModel("What is the main constituent of coal gas? ","Oxygen","Water","Nitrogen","Methane","Methane"));
        arrayList.add(new ContentQuestionModel("For Which one of the following is the density maximum ?  ","Chloroform","Water","Benzene","Ice","Water"));
        arrayList.add(new ContentQuestionModel("The chemicals used as a fixer in phosphorous is  ","borax","sodium thiosulpahte","sodium sulphate","ammonium persulphate","sodium thiosulpahte"));
        arrayList.add(new ContentQuestionModel("Which one of the following does not contain silver?","horn silver","german silver","ruby silver","Lunar caustic","german silver"));
        arrayList.add(new ContentQuestionModel("Which one among the following is called philosophers wool ?","zinc bromide","zinc nitrate","zinc oxide","zinc chloride","zinc oxide"));
        arrayList.add(new ContentQuestionModel("Which one of the following when dissolved in HO gives hissing sound?  ","Limestone","slacked lime","soda lime","quick lime","Limestone"));
        arrayList.add(new ContentQuestionModel("Which one of the following is also called Stranger Gas?  ","Argon","Neon","Xenon","Nitrous oxide","Xenon"));
        arrayList.add(new ContentQuestionModel("What are Rubies and Sapphires chemically known as","Silicon dioxide","Aluminium oxide","Lead tetra oxide","Boron nitride","Aluminium oxide"));
        arrayList.add(new ContentQuestionModel("Which one of the following is used as a mordant in dying and tanning industry?","Magnesium oxide","Magnesium carbonate","Magnesium chloride","Magnesium sulphate","Magnesium sulphate"));
        arrayList.add(new ContentQuestionModel("Which one of the following glasses is used in bullet proof screens?","Soda glass","Pyrex glasss","Jena glass","Reinforced glass","Reinforced glass"));
        arrayList.add(new ContentQuestionModel("For Which one of the following is the density maximum ?","Chloroform","Water","Benzene","Ice","Water"));
        arrayList.add(new ContentQuestionModel("Which substance is used to retard the setting action of cement? ","CaO","AlO","CaSO.2HO","NaO + KO","CaSO.2HO"));
        arrayList.add(new ContentQuestionModel("What is a mixture of potassium nitrate , powdered charcoal and sulphur called?","Glass","Cement","Paint","Gun Powder","Gun Powder"));
        arrayList.add(new ContentQuestionModel("Which one of the following is the softest?  ","Iron","Aluminium","Calcium","Lithium","Iron"));
        arrayList.add(new ContentQuestionModel("The iron layered with zinc is called  ","Pig iron","Cost iron","Galvanised iron","Steel","Galvanised iron"));
        arrayList.add(new ContentQuestionModel("When quick lime is added to water ","Heat is liberated","Heat is absorbed","Temperature decreases","No heat change takes place","Heat is liberated"));
        arrayList.add(new ContentQuestionModel("The cathode of a lead storage battery is made up of ","Zinc"," Lead oxide","Manganese dioxide","Lead","Lead"));
        arrayList.add(new ContentQuestionModel("Vinegar is trade name of  ","Acetic acid","Chloroform","Ethyl alcohol","Carbon tetrachloride","Acetic acid"));
        arrayList.add(new ContentQuestionModel("Which of the following elements behave chemically both as metal and non metal?","Boron","Argon","Xenon","Carbon","Boron"));
        arrayList.add(new ContentQuestionModel("Nail polish remover contains ","Acetic acid","Petroleum ether","Benzeme","Acetone","Acetone"));
        arrayList.add(new ContentQuestionModel("Which one of the following correctly defines the state of glass? ","Crystalline solid","Super cooled liquid","Condensed gas","Liquid crystal","Super cooled liquid"));
        arrayList.add(new ContentQuestionModel("Which one of the following is an element which never exhibits positive oxidation state in any of its compounds?","Oxygen","Chlorine","Fluorine","Carbon","Fluorine"));
        arrayList.add(new ContentQuestionModel("Which one of the following materials is suitable for water purification? ","Silicones","Zeolites","Asbestos","Quartz","Zeolites"));
        arrayList.add(new ContentQuestionModel("Which one of the following is a major constituent of Biogas ?","Carbon dioxide","hydrogen","nitrogen dioxide","methane","methane"));
        arrayList.add(new ContentQuestionModel("Which one of the following is present in the emission from “unleaded petrol”?","carbon monoxide","carbon dioxide","ethylene","hydrocarbons","hydrocarbons"));
        arrayList.add(new ContentQuestionModel("Which one of the following is used in preparing match sticks? ","Chile saltpeter","Indian salpetre","Red phosphorus","Sodium bicarbonate","Red phosphorus"));


        arrayList.add(new ContentQuestionModel("Curd is sour due to presence of ","Acidic acid","Tartaric acid","Lactic acid","Oxalic acid","Lactic acid"));
        arrayList.add(new ContentQuestionModel("What are Rubies and Sapphires chemically known as","silicon dioxide","aluminium oxide","lead tetra oxide","boron nitride","aluminium oxide"));
        arrayList.add(new ContentQuestionModel("Acid rain contains high levels of","oxalic acid","acetic acid","sulphuric and nitric acids","carbolic acid","carbolic acid"));
        arrayList.add(new ContentQuestionModel("Talc contains which one of the following ? "," zinc,calcium,oxygen","calcium,oxygen,tin","magnesium,silicon,oxygen","zinc,tin,sulphur","magnesium,silicon,oxygen"));
        arrayList.add(new ContentQuestionModel("Which one of the following substances is made up of only one type of atoms?","water","hydrogen","milk","air","hydrogen"));
        arrayList.add(new ContentQuestionModel("Which one of the following is used as a mordant in dyeing and tanning indusrty?","Magnesium oxide","magnesium carbonate","magnesium chloride","magnesium sulphate","magnesium sulphate"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

         arrayList.add(new ContentQuestionModel("খনিজগুলির মধ্যে বিস্ফোরণের বেশিরভাগ কারণগুলির মধ্যে নিচের কোন এক জোড়া গ্যাসের মিশ্রণ?", "হাইড্রোজেন এবং অক্সিজেন", "অক্সিজেন এবং এসিটিলিন", "মিথেন এবং বায়ু", "কার্বন ডাই অক্সাইড এবং মিথেন" , "মিথেন এবং বায়ু"));//18
        arrayList.add(new ContentQuestionModel("কোন সিনথেটিক ফাইবারটি কৃত্রিম রেশম হিসাবে পরিচিত?", "তুলা", "রেয়ন", "টেরিলিন", "নাইলন", "রেয়ন"));
        arrayList.add(new ContentQuestionModel("বাগাসে, চিনি উত্পাদন শিল্পের একটি উপ-পণ্য", "নাইলন", "গ্লাস", "কাগজ", "অ্যালকোহল", "কাগজ" ));
        arrayList.add(new ContentQuestionModel("গ্লাসটি এর মিশ্রণ দিয়ে তৈরি --?", "কোয়ার্টজ এবং মিকা", "বালু এবং নুন", "বালু এবং সিলিকেটস", "এর কোনওটি নয়", "বালু এবং সিলিকেটস"));//21
        arrayList.add(new ContentQuestionModel("নীচের কোনটি রাবারের টায়ারে ফিল্টার হিসাবে ব্যবহৃত হয়?", "গ্রাফাইট", "কয়লা", "কোক", "কার্বন কালো", "কার্বন কালো"));
        arrayList.add(new ContentQuestionModel("বুলেট প্রুফ জ্যাকেট তৈরি করতে নীচের কোনটি পলিমারিক ম্যাটারিয়াল ব্যবহার করা হয়?"," নাইলন .6..6 "," রেয়ন "," কেভলার "," ড্যাক্রন "," কেভলার "));//23
        arrayList.add(new ContentQuestionModel("কোন মিশ্রণে নিকেল রয়েছে?", "ব্রাস", "ব্রোঞ্জ", "ইনভার", "সোল্ডার", "ইনভার"));//24
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত উপাদানগুলির মধ্যে কোনটি স্টেইনলেস স্টিলটিতে উপস্থিত নেই?", "আয়রন", "টংস্টেন", "ক্রোমিয়াম", "নিকেল", "টংস্টেন"));//25
        arrayList.add(new ContentQuestionModel("নিচের কোনটি একটি সুপার কুলড তরল?", "টেফলন", "গ্লাস", "বুধ", "আইসক্রিম", "গ্লাস"));
        arrayList.add(new ContentQuestionModel("দই -- থাকার কারণে টক টক হয়ে যায়", "এসিডিক অ্যাসিড", "টারটারিক অ্যাসিড", "ল্যাকটিক অ্যাসিড", "অক্সালিক অ্যাসিড", "ল্যাকটিক অ্যাসিড"));
        arrayList.add(new ContentQuestionModel("রুবি এবং নীলকান্ত্রিক পদার্থগুলি কী কী রাসায়নিকভাবে--  নামে পরিচিত", "সিলিকন ডাই অক্সাইড", "অ্যালুমিনিয়াম অক্সাইড", "সীসা টেট্রা অক্সাইড", "বোরন নাইট্রাইড", "অ্যালুমিনিয়াম অক্সাইড"));
        arrayList.add(new ContentQuestionModel("অ্যাসিড বৃষ্টিতে উচ্চ স্তরের", "অক্সালিক অ্যাসিড", "এসিটিক এসিড", "সালফিউরিক এবং নাইট্রিক অ্যাসিড", "কার্বলিক অ্যাসিড", "কার্বলিক অ্যাসিড"));
        arrayList.add(new ContentQuestionModel("ট্যাল্কে নিম্নলিখিতগুলির মধ্যে একটি রয়েছে?", "দস্তা, ক্যালসিয়াম, অক্সিজেন", "ক্যালসিয়াম, অক্সিজেন, টিন", "ম্যাগনেসিয়াম, সিলিকন, অক্সিজেন", "দস্তা, টিন, সালফার", "ম্যাগনেসিয়াম, সিলিকন, অক্সিজেন"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোন পদার্থটি কেবল এক ধরণের পরমাণু দিয়ে গঠিত?", "জল", "হাইড্রোজেন", "দুধ", "বায়ু", "হাইড্রোজেন"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি রঙ্গিনকরণ এবং ট্যানিং ইনড্রুসির ক্ষেত্রে মর্ডান্ট হিসাবে ব্যবহৃত হয়?", "ম্যাগনেসিয়াম অক্সাইড", "ম্যাগনেসিয়াম কার্বনেট", "ম্যাগনেসিয়াম ক্লোরাইড", "ম্যাগনেসিয়াম সালফেট", "ম্যাগনেসিয়াম সালফেট"));
        arrayList.add(new ContentQuestionModel("বুলেট প্রুফ স্ক্রিনে নিচের কোন চশমা ব্যবহার করা হয়?", "সোডা গ্লাস", "পাইরেক্স গ্লাস", "জেনা গ্লাস", "চাঙ্গা কাঁচ", "চাঙ্গা কাঁচ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির ঘনত্ব সর্বাধিক?", "ক্লোরোফর্ম", "জল", "বেনজিন", "বরফ", "জল"));
        arrayList.add(new ContentQuestionModel("সিমেন্টের সেটিং ক্রিয়াকলাপ পিছিয়ে রাখতে কোন পদার্থ ব্যবহৃত হয়?", "CaO", "Alo", "CaSO.2HO", "NaO + KO", "CaSO.2HO"));

        arrayList.add(new ContentQuestionModel("নিম্নলিখিত ধাতবগুলির মধ্যে কোনটি বিদ্যুতের দুর্বল কন্ডাক্টর নয়", "ফসফরাস", "সেলেনিয়াম", "ব্রোমাইন", "সালফার", "সেলেনিয়াম"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি রাসায়নিক পরিবর্তন নয়?", "বাতাসে কয়লা পোড়ানো", "আখের রস গাঁজন", "পেট্রোলিয়ামের ক্র্যাকিং", "সমুদ্রের জল থেকে", "সমুদ্রের জল থেকে"));
        arrayList.add(new ContentQuestionModel("কোন ধাতু স্বাভাবিক পরিস্থিতিতে তরল আকারে থেকে যায়?", "দস্তা", "রেডিয়াম", "ইউরেনিয়াম", "পারদ", "পারদ"));
        arrayList.add(new ContentQuestionModel("কোন ধাতুটি তরল আকারে অবরুদ্ধ থাকে বাণিজ্যিকভাবে সোডিয়াম বাইকার্বোনেট "," ওয়াশিং সোডা "," বেকিং সোডা "," ব্লিচিং পাউডার "," সোডা অ্যাশ "," বেকিং সোডা "));
        arrayList.add(new ContentQuestionModel("অ্যাসিটিল স্যালিসিলিক অ্যাসিড সাধারণত", "একটি ব্যথার ঘাতক", "একটি শালীন", "টিয়ার গ্যাস", "একটি সার", "একটি ব্যথার ঘাতক"));

        arrayList.add(new ContentQuestionModel("ভিনেগার হ'ল ট্রেডের নাম", "এসিটিক এসিড", "ক্লোরোফর্ম", "ইথাইল অ্যালকোহল", "কার্বন টেট্রাক্লোরাইড", "এসিটিক এসিড"));//41
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত উপাদানগুলির মধ্যে কে রাসায়নিকভাবে ধাতব এবং অ ধাতব উভয়ই আচরণ করে?", "বোরন", "আর্গন", "জেনন", "কার্বন", "বোরন"));
        arrayList.add(new ContentQuestionModel("পেরেক পলিশ রিমুভারটিতে", "এসিটিক এসিড", "পেট্রোলিয়াম ইথার", "বেনজেম", "এসিটোন", "এসিটোন"));//43
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সঠিকভাবে কাচের রাজ্যটিকে সংজ্ঞায়িত করে?", "স্ফটিকের ঘন", "সুপার শীতল তরল", "কনডেন্সড গ্যাস", "তরল স্ফটিক", "সুপার শীতল তরল"));//44
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি এমন একটি উপাদান যা এর কোনও যৌগগুলিতে কখনই ইতিবাচক জারণ অবস্থাকে প্রদর্শন করে না?", "অক্সিজেন", "ক্লোরিন", "ফ্লুরিন", "কার্বন", "ফ্লুরিন"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি উপকরণ জল পরিশোধনের জন্য উপযুক্ত?", "সিলিকনস", "জেলোইটাইটস", "অ্যাসবেস্টস", "কোয়ার্টজ", "জেলোইটাইটস"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি বায়োগ্যাসের প্রধান উপাদান?", "কার্বন ডাই অক্সাইড", "হাইড্রোজেন", "নাইট্রোজেন ডাই অক্সাইড", "মিথেন", "মিথেন"));
        arrayList.add(new ContentQuestionModel("  আনলেডেড পেট্রোল  নিঃসরণে নিচের কোনটি উপস্থিত?", "কার্বন মনোক্সাইড", "কার্বন ডাই অক্সাইড", "ইথিলিন", "হাইড্রোকার্বন", "হাইড্রোকার্বন"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি ম্যাচের কাঠি প্রস্তুত করতে ব্যবহৃত হয়?", "চিলি সল্টপেটার", "ভারতীয় সালপেটের", "রেড ফসফরাস", "সোডিয়াম বাইকার্বোনেট", "রেড ফসফরাস"));

        arrayList.add(new ContentQuestionModel("কোন ধাতু সাধারণত তড়িৎ চৌম্বক তৈরি করতে ব্যবহৃত হয়?", "তামা", "কোবাল্ট", "আয়রন", "নিকেল", "আয়রন"));
        arrayList.add(new ContentQuestionModel("বৈশ্বিক উষ্ণায়নের জন্য দায়ী গ্যাস হ'ল", "কার্বন ডাই অক্সাইড", "অক্সিজেন", "মিথেন", "সালফার ডাই অক্সাইড", "কার্বন ডাই অক্সাইড"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি সাধারণ লবণের উত্স?", "বাক্সাইট", "পাইরেট", "ক্যালসাইট", "হালাইট", "হালাইট"));
        arrayList.add(new ContentQuestionModel("কয়লা গ্যাসের মূল উপাদান কোনটি?", "অক্সিজেন", "জল", "নাইট্রোজেন", "মিথেন", "মিথেন"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির ঘনত্ব সর্বাধিক?", "ক্লোরোফর্ম", "জল", "বেনজিন", "বরফ", "জল"));
        arrayList.add(new ContentQuestionModel("ফসফরাসে ফিক্সার হিসাবে ব্যবহৃত রাসায়নিকগুলি হ'ল", "বোরাক্স", "সোডিয়াম থিয়াসুলপাহে", "সোডিয়াম থিয়াসুলফেট", "অ্যামোনিয়াম পার্সুলফেট", "সোডিয়াম থিয়াসুলফেট"));//11
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটিতে রৌপ্য থাকে না?", "শিং রৌপ্য", "জার্মান রৌপ্য", "রুবি রৌপ্য", "চন্দ্র কস্টিক", "জার্মান রৌপ্য"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে যাকে দার্শনিক উল বলা হয়?", "দস্তা ব্রোমাইড", "দস্তা নাইট্রেট", "দস্তা অক্সাইড", "দস্তা ক্লোরাইড", "দস্তা অক্সাইড"));
        arrayList.add(new ContentQuestionModel("এইচওতে দ্রবীভূত হওয়ার পরে নিম্নলিখিতগুলির মধ্যে কোনটি হিসিং শব্দ দেয়?", "চুনাপাথর", "স্ল্যাড চুন", "সোডা চুন", "দ্রুত চুন", "চুনাপাথর"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোনটিকে স্ট্র্যাঞ্জার গ্যাস বলা হয়?", "আর্গন", "নিয়ন", "জেনন", "নাইট্রাস অক্সাইড", "জেনন"));
        arrayList.add(new ContentQuestionModel("রুবি এবং নীলকান্ত্রিক কীভাবে রাসায়নিকভাবে -- নামে পরিচিত", "সিলিকন ডাই অক্সাইড", "অ্যালুমিনিয়াম অক্সাইড", "লিড টেট্রা অক্সাইড", "বোরন নাইট্রাইড", "অ্যালুমিনিয়াম অক্সাইড"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি মরন এবং ট্যানিং শিল্পে মর্ডান্ট হিসাবে ব্যবহৃত হয়?", "ম্যাগনেসিয়াম অক্সাইড", "ম্যাগনেসিয়াম কার্বনেট", "ম্যাগনেসিয়াম ক্লোরাইড", "ম্যাগনেসিয়াম সালফেট", "ম্যাগনেসিয়াম সালফেট"));

        arrayList.add(new ContentQuestionModel("পটাসিয়াম নাইট্রেট, গুঁড়ো কাঠকয়লা এবং সালফার এর মিশ্রণ কী?", "গ্লাস", "সিমেন্ট", "পেইন্ট", "বন্দুক গুঁড়া", "বন্দুক গুঁড়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সবচেয়ে নরম?", "আয়রন", "অ্যালুমিনিয়াম", "ক্যালসিয়াম", "লিথিয়াম", "আয়রন"));
        arrayList.add(new ContentQuestionModel("দস্তা দিয়ে তৈরি লোহাটিকে-- বলা হয়", "পিগ আয়রন", "দাম আয়রন", "গ্যালভেনাইজড লোহা", "ইস্পাত", "গ্যালভেনাইজড লোহা"));
        arrayList.add(new ContentQuestionModel("যখন জলগুলিতে দ্রুত চুন যুক্ত করা হয়", "তাপ মুক্ত হয়", "তাপ শোষণ হয়", "তাপমাত্রা হ্রাস পায়", "তাপের কোনও পরিবর্তন হয় না", "তাপ মুক্ত হয়"));//39
        arrayList.add(new ContentQuestionModel("লিড স্টোরেজ ব্যাটারির ক্যাথোডটি", "জিঙ্ক", "লিড অক্সাইড", "ম্যাঙ্গানিজ ডাই অক্সাইড", "সীসা", "সীসা"));//40

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("निम्न में से कौन-सी एक गैर धातु है, जो बिजली का एक सुचालक नहीं है", "फास्फोरस", "सेलेनियम", "ब्रोमीन", "सल्फर", "सेलेनियम"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन रासायनिक परिवर्तन नहीं है?", "हवा में कोयला जलाना", "गन्ने के रस का किण्वन", "पेट्रोलियम का टूटना", "समुद्री जल से टेबल नमक का क्रिस्टलीकरण" ,"समुद्री जल से टेबल नमक का क्रिस्टलीकरण"));
        arrayList.add(new ContentQuestionModel("कौन सी धातु सामान्य परिस्थितियों में तरल रूप में रहती है?", "जस्ता", "रेडियम", "यूरेनियम", "पारा", "पारा"));
        arrayList.add(new ContentQuestionModel("व्यावसायिक रूप से, सोडियम बाइकार्बोनेट --", "वाशिंग सोडा", "बेकिंग सोडा", "ब्लीचिंग पाउडर", "सोडा ऐश","सोडा ऐश"));
        arrayList.add(new ContentQuestionModel("एसिटाइल सैलिसिलिक एसिड आमतौर पर इस्तेमाल किया जाता है", "एक दर्द निवारक", "एक कंपकंपी", "आंसू गैस", "एक उर्वरक", "एक दर्द निवारक"));
        arrayList.add(new ContentQuestionModel("किस धातु का इस्तेमाल आम तौर पर एक इलेक्ट्रोमैग्नेट बनाने के लिए किया जाता है?", "कॉपर", "कोबाल्ट", "आयरन", "निकल", "आयरन"));
        arrayList.add(new ContentQuestionModel("ग्लोबल वार्मिंग के लिए जिम्मेदार गैस है", "कार्बन डाइऑक्साइड", "ऑक्सीजन", "मिथेन", "सल्फर डाइऑक्साइड", "कार्बन डाइऑक्साइड"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा आम नमक का स्रोत है?", "बॉक्साइट", "पाइराइट", "कैल्साइट", "हैलाइट", "हैलाइट"));
        arrayList.add(new ContentQuestionModel("कोयला गैस का मुख्य घटक क्या है?", "ऑक्सीजन", "पानी", "नाइट्रोजन", "मीथेन", "मीथेन"));
        arrayList.add(new ContentQuestionModel("निम्न में से किसके लिए घनत्व अधिकतम है?", "क्लोरोफॉर्म", "जल", "बेंजीन", "बर्फ", "जल"));
        arrayList.add(new ContentQuestionModel("फ़ॉस्फ़ोरस में फिक्सर्स के रूप में प्रयुक्त रसायन", "बोरस", "सोडियम थियोसल्फ़ेट", "सोडियम सल्फेट", "अमोनियम पार्सल्फ़ेट", "सोडियम थियोसल्फ़ेट"));//11
        arrayList.add(new ContentQuestionModel("निम्न में से किसमें चांदी नहीं है?", "सींग की चांदी", "जर्मन चांदी", "रूबी चांदी", "चंद्र कास्टिक", "जर्मन चांदी"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसे दार्शनिक ऊन कहा जाता है?", "जस्ता ब्रोमाइड", "जस्ता नाइट्रेट", "जस्ता ऑक्साइड", "जस्ता क्लोराइड", "जस्ता ऑक्साइड"));
        arrayList.add(new ContentQuestionModel("हो में भंग किए जाने पर निम्नलिखित में से कौन हिसिंग ध्वनि देता है?", "चूना पत्थर", "सुस्त चूना", "सोडा चूना", "त्वरित चूना", "चूना पत्थर"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसको स्ट्रेंजर गैस कहा जाता है?", "आर्गन", "नियॉन", "क्सीनन", "नाइट्रस ऑक्साइड", "क्सीनन"));
        arrayList.add(new ContentQuestionModel("रूबीज़ और सैफायर रासायनिक रूप से क्या कहलाते हैं", "सिलिकॉन डाइऑक्साइड", "एल्यूमीनियम ऑक्साइड", "लीड टेट्रा ऑक्साइड", "बोरान नाइट्राइड", "एल्यूमीनियम ऑक्साइड"));
        arrayList.add(new ContentQuestionModel("निम्न में से किसका उपयोग मरने और तपन उद्योग में एक स्वामी के रूप में किया जाता है?", "मैग्नीशियम ऑक्साइड", "मैग्नीशियम कार्बोनेट", "मैग्नीशियम क्लोराइड", "मैग्नीशियम सल्फेट", "मैग्नीशियम सल्फेट"));
        arrayList.add(new ContentQuestionModel("मिश्रण जिसमें से एक निम्न गैसों के खानों में विस्फोट के अधिकांश का कारण बनता है?", "हाइड्रोजन और ऑक्सीजन", "ऑक्सीजन और एसिटिलीन", "मीथेन और वायु", "कार्बन डाइऑक्साइड और मीथेन।" , "मीथेन और वायु"));
        arrayList.add(new ContentQuestionModel("कौन सा सिंथेटिक फाइबर कृत्रिम रेशम के रूप में जाना जाता है?", "कपास", "रेयॉन", "टेरलीन", "नायलॉन", "रेयॉन"));
        arrayList.add(new ContentQuestionModel("चीनी निर्माण उद्योग के उत्पादों का उपयोग बैगैसे का उत्पादन करने के लिए किया जाता है", "नायलॉन", "ग्लास", "पेपर", "अल्कोहल", "पेपर"));
        arrayList.add(new ContentQuestionModel("चश्मे के मिश्रण से बना "," क्वार्ट्ज और माइका "," रेत और नमक ","रेत और सिलिकेट"," इनमें से कोई नहीं ","रेत और सिलिकेट"));
        arrayList.add(new ContentQuestionModel("रबर टायर में फिल्टर के रूप में निम्न में से किसका उपयोग किया जाता है?", "ग्रेफाइट", "कोयला", "कोक", "कार्बन ब्लैक", "कार्बन ब्लैक"));
        arrayList.add(new ContentQuestionModel("बुलेट प्रूफ जैकेट बनाने के लिए निम्नलिखित में से कौन सा पॉलिमर मैट्रिक का उपयोग किया जाता है?", "NYLON 6.6", "रेयॉन", "KEVLAR", "DACRON", "KEVLAR"));
        arrayList.add(new ContentQuestionModel("किस एक्सेल में निकेल होता है?", "पीतल", "कांस्य", "इन्वर्टर", "सोल्डर", "इन्वर्टर"));//24
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा तत्व स्टेनलेस स्टील में मौजूद नहीं है?", "आयरन", "टंगस्टन", "क्रोमियम", "निकल", "टंगस्टन"));
        arrayList.add(new ContentQuestionModel("कांस्य एक मिश्र धातु है", "टिन और जस्ता", "लोहा और जस्ता", "तांबा और जस्ता", "तांबे और टिन", "तांबे और टिन"));//26
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एक सुपर ठंडा तरल है?", "टेफ्लॉन", "ग्लास", "मरक्यूरी", "आइसक्रीम", "ग्लास"));
        arrayList.add(new ContentQuestionModel("दही की उपस्थिति के कारण खट्टा है"," एसिडिक एसिड "," टार्टरिक एसिड "," लैक्टिक एसिड "," ऑक्सालिक एसिड "," लैक्टिक एसिड "));
        arrayList.add(new ContentQuestionModel("रूबीज़ और सैफायर रासायनिक रूप से क्या कहलाते हैं", "सिलिकॉन डाइऑक्साइड", "एल्यूमीनियम ऑक्साइड", "लीड टेट्रा ऑक्साइड", "बोरान नाइट्राइड", "एल्यूमीनियम ऑक्साइड"));
        arrayList.add(new ContentQuestionModel("अम्ल वर्षा में उच्च स्तर", "ऑक्सालिक एसिड", "एसिटिक एसिड", "सल्फ्यूरिक और नाइट्रिक एसिड", "कार्बोलिक एसिड", "कार्बोलिक एसिड"));//30
        arrayList.add(new ContentQuestionModel("तालक में निम्नलिखित में से कौन सा है?", "जस्ता, कैल्शियम, ऑक्सीजन", "कैल्शियम, ऑक्सीजन, टिन", "मैग्नीशियम, सिलिकॉन, ऑक्सीजन", "जस्ता, टिन, सल्फर", "मैग्नीशियम, सिलिकॉन, ऑक्सीजन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा पदार्थ केवल एक प्रकार के परमाणुओं से बना है?", "पानी", "हाइड्रोजन", "दूध", "वायु", "हाइड्रोजन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा एक रंगाई और टेनिंग इंडस्यूट्री में एक मोर्डेंट के रूप में उपयोग किया जाता है?", "मैग्नीशियम ऑक्साइड", "मैग्नीशियम कार्बोनेट", "मैग्नीशियम क्लोराइड", "मैग्नीशियम सल्फेट", "मैग्नीशियम सल्फेट"));
        arrayList.add(new ContentQuestionModel("बुलेट प्रूफ स्क्रीन में निम्न में से किस ग्लास का उपयोग किया जाता है?", "सोडा ग्लास", "पाइरेक्स ग्लास", "जेना ग्लास", "प्रबलित ग्लास", "प्रबलित ग्लास"));
        arrayList.add(new ContentQuestionModel("निम्न में से किसके लिए घनत्व अधिकतम है?", "क्लोरोफॉर्म", "जल", "बेंजीन", "बर्फ", "जल"));
        arrayList.add(new ContentQuestionModel("सीमेंट की सेटिंग क्रिया को मंद करने के लिए किस पदार्थ का उपयोग किया जाता है?", "CaO", "AlO", "CaSO.2HO", "NaO + KO", "CaSO.2HO"));
        arrayList.add(new ContentQuestionModel("पोटेशियम नाइट्रेट, पाउडर चारकोल और सल्फर नामक मिश्रण क्या है?", "ग्लास", "सीमेंट", "पेंट", "गन पाउडर", "गन पाउडर"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा सबसे नरम है?", "आयरन", "एल्यूमीनियम", "कैल्शियम", "लिथियम", "आयरन"));
        arrayList.add(new ContentQuestionModel("जिंक लेयर्ड आयरन के - कॉल", "पिग आयरन", "प्राइस आयरन", "गैल्वेनाइज्ड आयरन", "स्टील", "गैल्वेनाइज्ड आयरन"));
        arrayList.add(new ContentQuestionModel("जब पानी में जल्दी चूना डाला जाता है", "गर्मी से मुक्ति मिलती है", "गर्मी अवशोषित हो जाती है", "तापमान घटता है", "कोई गर्मी नहीं बदलती", "गर्मी से मुक्ति मिलती है"));
        arrayList.add(new ContentQuestionModel("लीड स्टोरेज बैटरी कैथोड - से बना है।", "जस्ता", "लीड ऑक्साइड", "मैंगनीज डाइऑक्साइड", "लीड", "लीड"));
        arrayList.add(new ContentQuestionModel("सिरका --- व्यापार नाम", "एसिटिक एसिड", "क्लोरोफॉर्म", "एथिल अल्कोहल", "कार्बन टेट्राक्लोराइड", "एसिटिक एसिड"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा तत्व धातु और गैर धातु दोनों के रूप में रासायनिक व्यवहार करता है?", "बोरोन", "आर्गन", "क्सीनन", "कार्बन", "बोरोन"));
        arrayList.add(new ContentQuestionModel("नेल पॉलिश रिमूवर में", "एसिटिक एसिड", "पेट्रोलियम ईथर", "एसीटोन  शामिल हैं।|", "एसीटोन", "एसीटोन  शामिल हैं।|"));//44
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन कांच की स्थिति को सटीक रूप से परिभाषित करता है? "," क्रिस्टल सॉलिड्स ","सुपर क्यूट लिक्विड"," कंडेंस्ड गैस "," लिक्विड क्रिस्टल ","सुपर क्यूट लिक्विड"));//45
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा एक तत्व है जो कभी भी अपने किसी भी यौगिक में सकारात्मक ऑक्सीकरण अवस्था को प्रदर्शित नहीं करता है?", "ऑक्सीजन", "क्लोरीन", "फ्लोरीन", "कार्बन", "फ्लोरीन"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी सामग्री जल शोधन के लिए उपयुक्त है?", "सिलिकॉन्स", "ज़ोलाइट्स", "एस्बेस्टोस", "क्वार्ट्ज", "ज़ोलाइट्स"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा बायोगैस का प्रमुख घटक है?", "कार्बन डाइऑक्साइड", "हाइड्रोजन", "नाइट्रोजन डाइऑक्साइड", "मीथेन", "मीथेन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा  अनलेडेड पेट्रोल  से उत्सर्जन में मौजूद है?", "कार्बन मोनोऑक्साइड", "कार्बन डाइऑक्साइड", "एथिलीन", "हाइड्रोकार्बन", "हाइड्रोकार्बन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसका उपयोग मैच स्टिक्स तैयार करने में किया जाता है?", "चिली साल्टपीटर", "इंडियन सालेट्रे", "रेड फास्फोरस", "सोडियम बाइकार्बोनेट", "रेड फास्फोरस"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی غیر دھات بجلی کا ناقص موصل نہیں ہے" , "فاسفورس" , "سیلینیم" , "برومین" , "سلفر","سیلینیم"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کیمیائی تبدیلی نہیں ہے؟" , "ہوا میں کوئلے کو جلانا" , "گنے کے جوس کو خمیر کرنا" , "پٹرولیم کی کریکنگ" , "سمندر کے پانی سے ٹیبل نمک کا کرسٹاللائزیشن","سمندر کے پانی سے ٹیبل نمک کا کرسٹاللائزیشن"));
        arrayList.add(new ContentQuestionModel("کون سا دھات عام حالات میں مائع کی شکل میں رہتا ہے؟" , "زنک" , "ریڈیم" , "یورینیم" , "پارا","پارا"));
        arrayList.add(new ContentQuestionModel("تجارتی طور پر ، سوڈیم بائک کاربونیٹ کے نام سے جانا جاتا ہے"," دھونے والا سوڈا "," بیکنگ سوڈا ","بیکنگ سوڈا"," سوڈا راھ ","بیکنگ سوڈا"));//4
        arrayList.add(new ContentQuestionModel("ایسیٹیل سیلیسیلک ایسڈ عام طور پر" , "ایک درد قاتل" , "ایک مضمکن" , "آنسو گیس" , "ایک کھاد" ,"ایک درد قاتل"));
        arrayList.add(new ContentQuestionModel("کون سا دھات عام طور پر برقی مقناطیس بنانے کے لئے استعمال ہوتا ہے؟" , "کاپر" , "کوبالٹ" , "آئرن" , "نکل","آئرن"));
        arrayList.add(new ContentQuestionModel("گیس جو گلوبل وارمنگ کے لئے ذمہ دار ہے وہ ہے" , "کاربن ڈائی آکسائیڈ" , "آکسیجن" , "میتھین" , "سلفر ڈائی آکسائیڈ","کاربن ڈائی آکسائیڈ"));
        arrayList.add(new ContentQuestionModel("عام نمک کا ذریعہ مندرجہ ذیل میں سے کون سا ہے؟" , "باکسائٹ" , "پیراائٹ" , "کیلکائٹ" , "ہلائٹ","ہلائٹ"));//8
        arrayList.add(new ContentQuestionModel("کوئلہ گیس کا بنیادی جزو کیا ہے؟" , "آکسیجن" , "پانی" , "نائٹروجن" , "میتھین","میتھین"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے کس کے لئے کثافت زیادہ سے زیادہ ہے؟" , "کلوروفارم" , "پانی" , "بینزین" , "آئس","پانی"));
        arrayList.add(new ContentQuestionModel("فاسفورس میں فکسر کے طور پر استعمال ہونے والے کیمیکل" , "بوراکس" , "سوڈیم تیوسولپاہٹ" , "سوڈیم سلفیٹ" , "امونیم پرسولفٹ" ,"سوڈیم تیوسولپاہٹ"));//11
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا چاندی پر مشتمل نہیں ہے؟" , "سینگ چاندی" , "قمری کاسٹک","" , "روبی چاندی" , "قمری کاسٹک" ));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون کو فلسفیان اون کہا جاتا ہے؟" , "زنک برومائڈ" , "زنک نائٹریٹ" ,"زنک کلورائد", "زنک آکسائڈ" , "زنک کلورائد" ));//13
        arrayList.add(new ContentQuestionModel("HO میں تحلیل ہونے پر مندرجہ ذیل میں سے کون سی آواز سنائی دیتی ہے؟" , "چونا پتھر" , "سلیکڈ چونا" , "سوڈا چونا" , "تیز چونا","چونا پتھر"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا بھی اجنبی گیس کہلاتا ہے؟" , "ارگون" , "Xenon" , "زینون" , "نائٹروس آکسائڈ","Xenon"));//15
        arrayList.add(new ContentQuestionModel("روبی اور نیلمیاں کیا ہیں جو کیمیائی طور پر جانا جاتا ہے" , "سلیکن ڈائی آکسائیڈ" , "ایلومینیم آکسائڈ" , "لیڈ ٹیٹرا آکسائڈ" , "بورن نائٹریڈ","ایلومینیم آکسائڈ"));
        arrayList.add(new ContentQuestionModel("مرنے اور چھونے کی صنعت میں مندرجہ ذیل میں سے کون کون سے مردانت کے طور پر استعمال ہوتا ہے؟" , "میگنیشیم آکسائڈ" , "میگنیشیم کاربونیٹ" , "میگنیشیم کلورائد" , "میگنیشیم سلفیٹ","میگنیشیم سلفیٹ"));
        arrayList.add(new ContentQuestionModel("گیس کے مندرجہ ذیل جوڑے میں سے کون سا مرکب یہ ہے کہ بارودی سرنگوں میں ہونے والے زیادہ تر دھماکے ہونے کی وجوہات ہیں؟" , "ہائیڈروجن اور آکسیجن" , "آکسیجن اور ایسیٹیلین" , "میتھین اور ہوا" , "کاربن ڈائی آکسائیڈ اور میتھین" ,"میتھین اور ہوا"));
        arrayList.add(new ContentQuestionModel("کون سا مصنوعی فائبر مصنوعی ریشم کے نام سے جانا جاتا ہے؟" , "کاٹن" , "ریان" , "ٹیریلین" , "نایلان","ریان"));//19
        arrayList.add(new ContentQuestionModel("بگاس ، چینی تیار کرنے والی صنعت کی ایک ذیلی مصنوع کی پیداوار کے لئے استعمال کیا جاتا ہے"," نایلان "," گلاس ","کاغذ"," شراب ","کاغذ"));
        arrayList.add(new ContentQuestionModel("شیشے کے مرکب سے بنا ہے"," کوارٹج اور میکا ","ریت اور سلیکیٹس"," ریت اور سلیکیٹ "," ان میں سے کوئی بھی نہیں ","ریت اور سلیکیٹس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ربڑ کے ٹائروں میں فلٹر کے طور پر استعمال ہوتا ہے؟" , "گریفائٹ" , "کوئلہ" , "کوک" , "کاربن سیاہ","کاربن سیاہ"));
        arrayList.add(new ContentQuestionModel("بلٹ پروف جیکٹ بنانے کے لئے مندرجہ ذیل میں سے کون کون سے پولیمرک میٹریئریل استعمال کیا جاتا ہے؟" , "نیائلن 6.6" , "KEVLAR" , "کیولر" , "ڈیکرون","KEVLAR"));//23
        arrayList.add(new ContentQuestionModel("کون سے مرکب میں نکل موجود ہے؟" , "پیتل" , "کانسی" , "انوار" , "سولڈر","انوار"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا عنصر سٹینلیس سٹیل میں موجود نہیں ہے؟" , "ٹنگسٹن" , "ٹنگسٹین" , "کرومیم" , "نکل","ٹنگسٹن"));//25
        arrayList.add(new ContentQuestionModel("کانسی" , "ٹن اور زنک" , "آئرن اور زنک" , "کاپر اور زنک" , "کاپر اور ٹن"   ,"کاپر اور ٹن"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا سپر کولڈ مائع ہے؟" , "ٹیفلون" , "گلاس" , "مرکری" , "آئس کریم","گلاس"));
        arrayList.add(new ContentQuestionModel("موجودگی کی وجہ سے دہی کھٹی ہے"," تیزابی تیزاب "," ٹارٹرک ایسڈ ","لیکٹک ایسڈ"," آکسالک ایسڈ ","لیکٹک ایسڈ"));//28
        arrayList.add(new ContentQuestionModel("روبی اور نیلمیاں کیا ہیں جو کیمیائی طور پر" , "سلیکن ڈائی آکسائیڈ" , "ایلومینیم آکسائڈ" , "لیڈ ٹیٹرا آکسائڈ" , "بوران نائٹریڈ" ,"ایلومینیم آکسائڈ"));
        arrayList.add(new ContentQuestionModel("تیزاب بارش میں اونچے درجے ہوتے ہیں"," آکسالک ایسڈ"," اسکیٹک ایسڈ "," گندھک اور نائٹرک ایسڈ ","کاربولک ایسڈ","کاربولک ایسڈ"));//30
        arrayList.add(new ContentQuestionModel("ٹالک میں مندرجہ ذیل میں سے کون سا شامل ہے؟" , "زنک ، کیلشیم ، آکسیجن" , "کیلشیم ، آکسیجن ، ٹن" , "میگنیشیم ، سلکان ، آکسیجن" , "زنک ، ٹن ، گندھک","میگنیشیم ، سلکان ، آکسیجن"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا مادہ صرف ایک قسم کے جوہری پر مشتمل ہے؟" , "پانی" , "ہائیڈروجن" , "دودھ" , "ہوا","ہائیڈروجن"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسے کو رنگنے اور ٹیننگ انڈسروٹی میں مورڈنٹ کے طور پر استعمال کیا جاتا ہے؟" , "میگنیشیم آکسائڈ" , "میگنیشیم کاربونیٹ" , "میگنیشیم کلورائد" , "میگنیشیم سلفیٹ","میگنیشیم سلفیٹ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سے شیشے کو بلٹ پروف اسکرینوں میں استعمال کیا جاتا ہے؟" , "سوڈا گلاس" , "پیریکس گلاس" , "جینا گلاس" , "پربلت شیشے","پربلت شیشے"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے کس کے لئے کثافت زیادہ سے زیادہ ہے؟" , "کلوروفارم" , "پانی" , "بینزین" , "آئس","پانی"));
        arrayList.add(new ContentQuestionModel("کون سا مادہ سیمنٹ کی ترتیب کارروائی کو روکنے کے لئے استعمال ہوتا ہے؟"," کاو "," ALO ","CaSO.2HO"," NaO + KO ","CaSO.2HO"));//36
        arrayList.add(new ContentQuestionModel("کون سا مادہ سیمنٹ کی ترتیب کارروائی کو روکنے کے لئے استعمال ہوتا ہے؟"," کاو "," ALO ","CaSO.2HO"," NaO + KO ","CaSO.2HO"));
        arrayList.add(new ContentQuestionModel("گن پاو ان میں سے کون سا نرم ترین ہے؟","آئرن"," ایلومینیم "," کیلشیم "," لتیم " ,"آئرن"));
        arrayList.add(new ContentQuestionModel("گن پاو ان میں سے کون سا نرم ترین ہے؟","آئرن"," ایلومینیم "," کیلشیم "," لتیم " ,"آئرن"));//39
        arrayList.add(new ContentQuestionModel("جب تیز چونے کو پانی میں شامل کیا جاتا ہے" , "حرارت آزاد ہوجاتا ہے" , "حرارت جذب ہوتا ہے" , "درجہ حرارت کم ہوتا ہے" , "حرارت میں کوئی تبدیلی نہیں ہوتی ہے۔","درجہ حرارت کم ہوتا ہے"));
        arrayList.add(new ContentQuestionModel("لیڈ اسٹوریج بیٹری کا کیتھوڈ" , "لیڈ" , "لیڈ آکسائڈ" , "مینگنیج ڈائی آکسائیڈ" , "سیسہ" ,"لیڈ"));//41
        arrayList.add(new ContentQuestionModel("سرکہ تجارتی نام ہے" , "ایسیٹک ایسڈ" , "کلوروفورم" , "ایتھل الکحل" , "کاربن ٹیٹراکلورائڈ","ایسیٹک ایسڈ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا عنصر کیمیائی طور پر دھات اور غیر دھات دونوں کی طرح برتاؤ کرتا ہے؟" , "بورون" , "آرگون" , "زینون" , "کاربن","بورون"));
        arrayList.add(new ContentQuestionModel("نیل پالش ہٹانے والے میں", "اسکیٹک ایسڈ" , "پٹرولیم ایتھر" , "بینزیم" , "ایسیٹون" ,"ایسیٹون"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون شیشے کی حالت کی صحیح طور پر وضاحت کرتا ہے؟" , "کرسٹل ٹھوس" , "سپر کولڈ مائع" , "گاڑھا ہوا گیس" , "مائع کرسٹل","سپر کولڈ مائع"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا عنصر ہے جو اپنے مرکبات میں سے کبھی بھی آکسیکرن کی مثبت کیفیت کا مظاہرہ نہیں کرتا ہے؟" , "آکسیجن" , "کلورین" , "فلورین" , "کاربن","فلورین"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا مواد پانی صاف کرنے کے لئے موزوں ہے؟"," سلیکونز ","زیولائٹس"," ایسبیسٹوس "," کوارٹز ","زیولائٹس"));//47
        arrayList.add(new ContentQuestionModel("بایوگاس کا ایک اہم جز مندرجہ ذیل میں سے کون سا ہے؟" , "کاربن ڈائی آکسائیڈ" , "ہائیڈروجن" , "نائٹروجن ڈائی آکسائیڈ" , "میتھین","میتھین"));
        arrayList.add(new ContentQuestionModel("انلیڈیڈ پیٹرول سے اخراج میں مندرجہ ذیل میں سے کون سا موجود ہے؟" , "کاربن مونو آکسائڈ" , "کاربن ڈائی آکسائیڈ" , "ایتھیلین" , "ہائیڈرو کاربن","ہائیڈرو کاربن"));
        arrayList.add(new ContentQuestionModel("میچوں کی لاٹھی تیار کرنے میں مندرجہ ذیل میں سے کون سا استعمال ہوتا ہے؟" , "چلی نمکیات" , "ہندوستانی سالپیٹر" , "ریڈ فاسفورس" , "سوڈیم بائک کاربونیٹ","ریڈ فاسفورس"));

        return arrayList;


    }


}