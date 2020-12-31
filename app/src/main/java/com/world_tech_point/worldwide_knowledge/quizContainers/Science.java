package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Science {
    private Context context;

    public Science(Context context) {
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

          arrayList.add(new ContentQuestionModel("Which of the following is the ‘master gland’?","Thymus gland","Pancreas","Pineal gland","Pituitary gland","Pituitary gland"));
        arrayList.add(new ContentQuestionModel("What is the full form of ADH?","Anti Diuretic Hormone","Adhesive Diuretic Hormone","Acidic Diuretic Hormone","Adenosine Double Hormone","Anti Diuretic Hormone"));
        arrayList.add(new ContentQuestionModel("What is the normal value of blood sugar in the body?","80 to 120mg/100 ml of blood","70 to 120mg/100 ml of blood","90 to 120mg/100 ml of blood","60 to 120mg/100 ml of blood","80 to 120mg/100 ml of blood"));
        arrayList.add(new ContentQuestionModel("Which is the largest blood vessel in the body?","Alveoli","Artery","Aorta","Vein","Aorta"));
        arrayList.add(new ContentQuestionModel("Which of the following carries impure blood?","Pulmonary artery","Pulmonary vein","Alveoli","Aorta","Pulmonary artery"));
        arrayList.add(new ContentQuestionModel("Who had performed the world’s first heart transplant?","Dr. Venugopal","William Harvey","Christian Bernard","None of the above","Christian Bernard"));
        arrayList.add(new ContentQuestionModel("Which of the following is not an allotrope of Carbon?","Diamond","Graphite","Fullerenes","Glass","Glass"));
        arrayList.add(new ContentQuestionModel("What is the formula of Sulfuric acid?","H2SO4","SO2","Na2SO4","K2SO4","H2SO4"));
        arrayList.add(new ContentQuestionModel("How are the following elements arranged in the Periodic table?","H, He, Li, Be and B","H, Li, He, Be and B","H, He, Be, Li and B","H, Be, He, B and Li","H, He, Li, Be and B"));
        arrayList.add(new ContentQuestionModel("What is the number of periods in which Periodic table is divided?","6","7","8","9","7"));
        arrayList.add(new ContentQuestionModel("There are ___ Groups in the Periodic table.","18","17","16","15","18"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not an element of Noble gases?","Helium","Neon","Xenon","Hydrogen","Hydrogen"));
        arrayList.add(new ContentQuestionModel("Mole is defined as the number of atoms found in _____ of carbon-12?","11 grams","14 grams","10 grams","12 grams","12 grams"));
        arrayList.add(new ContentQuestionModel("Which of the following is not a mixture?","Steel","Aluminium","Graphite","Glass","Graphite"));
        arrayList.add(new ContentQuestionModel("Alloys are _______________","Harder than the pure metal","Harder than the impure metal","Softer than the pure metal","Softer than the impure metal","Harder than the pure metal"));
        arrayList.add(new ContentQuestionModel("What is the name of that process in which oxygen is removed?","Oxidation","Electrolysis","Ionization","Reduction","Reduction"));
        arrayList.add(new ContentQuestionModel("Rusting is an ___________ reaction.","Ionization","Oxidation","Reduction","None of the above","Oxidation"));
        arrayList.add(new ContentQuestionModel("What is needed for rusting to occur?","Water","Oxygen","Water and Oxygen","Carbon dioxide","Water and Oxygen"));
        arrayList.add(new ContentQuestionModel("Which acid is used in the body to help digestion?","Hydrochloric Acid","Sulphuric Acid","Acetic Acid","Boric Acid","Hydrochloric Acid"));
        arrayList.add(new ContentQuestionModel("Which of the following was to be discovered first in the chromospheres of the sun?","Krypton","Xenon","Neon","Helium","Helium"));
        arrayList.add(new ContentQuestionModel("Which of the following is in liquid form at room temperature?","Lithium","Sodium","Francium","Cerium","Francium"));
        arrayList.add(new ContentQuestionModel("Sodium metal is kept under","petrol","alcohol","water","kerosene","kerosene"));
        arrayList.add(new ContentQuestionModel("Which of the following are the ingredients ofgunmetall?","Iron, Zinc, Titanium","Iron, tin","Iron, Brass, Tin","Copper, Tin","Copper, Tin"));
        arrayList.add(new ContentQuestionModel("From which mineral is radium obtained?","Rutile","Haematite","Pitchblende","Limestone","Pitchblende"));
        arrayList.add(new ContentQuestionModel("Potassium nitrate is used in","medicine","fertilizer","salt","glass","fertilizer"));
        arrayList.add(new ContentQuestionModel("Permanent hardness of water may be removed by the addition of","sodium carbonate","alum","potassium permanganate","lime","sodium carbonate"));
        arrayList.add(new ContentQuestionModel("Soda water contains","carbonic acid","sulphuric acid","carbon dioxide","nitrous acid","carbon dioxide"));
        arrayList.add(new ContentQuestionModel("The most important ore of aluminum is","galena","calamine","calcite","bauxite","bauxite"));
        arrayList.add(new ContentQuestionModel("Most soluble in water is","camphor","sulfur","common salt","sugar","sugar"));


        arrayList.add(new ContentQuestionModel("All acids are ________________","Corrosive when they are strong","Corrosive when they are weak","Irritant when they are strong","None of the above","Corrosive when they are strong"));
        arrayList.add(new ContentQuestionModel("When an acid reacts with a metal carbonate, the products formed are __________","Salt and Water","Water and Carbon dioxide","Salt, Water and Carbon dioxide","Salt and Carbon dioxide","Salt, Water and Carbon dioxide"));
        arrayList.add(new ContentQuestionModel("Which one is an alkaline among the following?","Vinegar","Saliva","Ammonia","Acid rain","Ammonia"));
        arrayList.add(new ContentQuestionModel("Which animal never drinks water in its entire life? ","Kangaroo","Hippopotamus ","Rat","Kangaroo rat","Kangaroo rat"));
        arrayList.add(new ContentQuestionModel("What is the physical phase of life called? ","Protoplasm","Cytoplasm","Organelles","None of the above","Protoplasm"));
        arrayList.add(new ContentQuestionModel("The largest cell is ________________","Nerve Cell","Ovum","The egg of an Ostrich","None of the above","The egg of an Ostrich"));
        arrayList.add(new ContentQuestionModel("Which is the largest human cell?","Liver","Skin","Spleen","Ovum","Ovum"));
        arrayList.add(new ContentQuestionModel("_________________ is the longest cell.","Nerve Cell","Skin","Spleen","None of the above","Nerve Cell"));
        arrayList.add(new ContentQuestionModel("What is the name of the cells in the body that engulf foreign particles like bacteria?","Globulin","Fibrinogen","Phagocytes","Albumin","Phagocytes"));
        arrayList.add(new ContentQuestionModel("There are _____ number of muscles in human.","638","637","639","640","639"));
        arrayList.add(new ContentQuestionModel("What is the life span of RBC?","130 days","110 days","100 days","120 days","120 days"));
        arrayList.add(new ContentQuestionModel("What is the life span of WBC?","2-15 days","3-15 days","4-15 days","5-20 days","2-15 days"));
        arrayList.add(new ContentQuestionModel("Which is the vertebrate that has two chambered heart?","Fish","Snake","Blue Whale","Crocodile","Fish"));
        arrayList.add(new ContentQuestionModel("The number of ribs in a human body is _____.","23","24","25","22","24"));
        arrayList.add(new ContentQuestionModel("Which is the smallest flightless bird?","Kiwi","Penguin","Ostrich","Rhea","Kiwi"));
        arrayList.add(new ContentQuestionModel("Saurology is the study of ___________.","Mosquitoes","Snake","Lizards","Cockroach","Lizards"));
        arrayList.add(new ContentQuestionModel("Hormones are produced by _____________","Endocrine glands","Pituitary glands","Pancreas","Hypothalamus","Endocrine glands"));


        arrayList.add(new ContentQuestionModel("In Periodic table elements are arranged according to their ___________","Mass number","Atomic and Mass number","None of the above","Atomic number","Atomic number"));
        arrayList.add(new ContentQuestionModel("What is an Isotope?","Atoms of an element having different mass number","Atoms of an element having same mass number","Atoms of an element having different atomic number","Atoms of an element having same atomic number","Atoms of an element having different mass number"));
        arrayList.add(new ContentQuestionModel(" Atomic number is represented by which letter?","A","M","X","Z","Z"));
        arrayList.add(new ContentQuestionModel("Which science is sometimes called ‘central science’?","Physics","Chemistry","Biology","Geology","Chemistry"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("কোন প্রাণী তার পুরো জীবনে কখনও জল পান করে না?", "ক্যাঙ্গারু", "হিপ্পোপটামাস", "ইঁদুর", "ক্যাঙ্গারু ইঁদুর", "ক্যাঙ্গারু ইঁদুর"));
        arrayList.add(new ContentQuestionModel("জীবনের শারীরিক স্তর কী বলা হয়?", "প্রোটোপ্লাজম", "সাইটোপ্লাজম", "অর্গানেলস", "উপরের কিছুই নয়", "প্রোটোপ্লাজম"));
        arrayList.add(new ContentQuestionModel("বৃহত্তম কোষটি হল ________________", "স্নায়ু কোষ", "ওভুম", "একটি অস্ট্রিচের ডিম", "উপরের কিছুই নয়", "একটি অস্ট্রিচের ডিম"));
        arrayList.add(new ContentQuestionModel("বৃহত্তম মানব কোষ কোনটি?", "লিভার", "ত্বক", "প্লীহা", "ওভুম", "ওভুম"));
        arrayList.add(new ContentQuestionModel("_________________ হ'ল দীর্ঘতম কোষ।", "স্নায়ু কোষ", "ত্বক", "প্লীহা", "উপরের কিছুই নয়", "স্নায়ু কোষ"));
        arrayList.add(new ContentQuestionModel("দেহের এমন কোষগুলির নাম কী যা ব্যাকটেরিয়ার মতো বিদেশী কণাগুলি জড়িত করে?", "গ্লোবুলিন", "ফিব্রিনোজেন", "ফাগোসাইটস", "অ্যালবামিন", "ফাগোসাইটস"));
        arrayList.add(new ContentQuestionModel("মানুষের মধ্যে _____ সংখ্যক পেশী রয়েছে  "," 638 "," 637 "," 639 "," 640 "," 639 "));
        arrayList.add(new ContentQuestionModel("আরবিসির আয়ু কত?", "130 দিন", "110 দিন", "100 দিন", "120 দিন", "120 দিন"));
        arrayList.add(new ContentQuestionModel("ডাব্লুবিসির আয়ু কত?", "2-15 দিন", "3-15 দিন", "4-15 দিন", "5-20 দিন", "2-15 দিন"));
        arrayList.add(new ContentQuestionModel("দুটি মেরুদণ্ডযুক্ত হৃদপিণ্ডটি কোনটি মেরুদণ্ড?", "মাছ", "সাপ", "নীল তিমি", "কুমির", "মাছ"));
        arrayList.add(new ContentQuestionModel("মানুষের দেহে পাঁজরের সংখ্যা _____।", "23", "24", "25", "22", "24"));
        arrayList.add(new ContentQuestionModel("সবচেয়ে উড়ন্তহীন পাখি কোনটি?", "কিউই", "পেঙ্গুইন", "অস্ট্রিচ", "রিয়া", "কিউই"));
        arrayList.add(new ContentQuestionModel("সওরোলজি হ'ল ___________ "," মশা "," সাপ "," টিকটিকি "," তেলাপোকা "," টিকটিকি "));
        arrayList.add(new ContentQuestionModel("হরমোনগুলি _____________  দ্বারা উত্পাদিত হয়", "এন্ডোক্রাইন গ্রন্থি", "পিটুইটারি গ্রন্থি", "অগ্ন্যাশয়", "হাইপোথ্যালামাস", "এন্ডোক্রাইন গ্রন্থি"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি  মাস্টার গ্রন্থি  ?", "থাইমাস গ্রন্থি", "প্যানক্রিয়াস", "পাইনাল গ্রন্থি", "পিটুইটারি গ্রন্থি", "পিটুইটারি গ্রন্থি" ));
        arrayList.add(new ContentQuestionModel("এডিএইচ এর পূর্ণরূপটি কী?", "অ্যান্টি ডিউরেটিক হরমোন", "আঠালো ডিউরেটিক হরমোন", "এসিডিক ডিউরেটিক হরমোন", "অ্যাডেনোসিন ডাবল হরমোন", "অ্যান্টি ডিউরেটিক হরমোন"));
        arrayList.add(new ContentQuestionModel("শরীরে রক্তে শর্করার স্বাভাবিক মূল্যটি কী?", "রক্তের 80 থেকে 120 মিলিগ্রাম / 100 মিলি", "70 থেকে 120 মিলি / রক্তের 100 মিলি", "90 থেকে 120 মিলি / 100 মিলি রক্ত", "60 120mg / 100 মিলি রক্ত ​​","রক্তের 80 থেকে 120 মিলিগ্রাম / 100 মিলি"));
        arrayList.add(new ContentQuestionModel("দেহের বৃহত্তম রক্তনালী কোনটি?", "আলভেওলি", "ধমনী", "অ্যাওর্টা", "শিরা", "ধমনী"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি রক্তকে নাপাক করে?", "পালমোনারি ধমনী", "পালমোনারি শিরা", "আলভেওলি", "অর্টা", "আলভেওলি"));
        arrayList.add(new ContentQuestionModel("বিশ্বের প্রথম হার্ট ট্রান্সপ্ল্যান্ট কে সম্পাদন করেছিলেন?", "ড। ড। ভেনুগোপাল", "উইলিয়াম হার্ভে", "ক্রিশ্চান বার্নার্ড", "উপরের কিছুই নেই", "ক্রিশ্চান বার্নার্ড"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কার্বনের আলোট্রোপ নয়?", "ডায়মন্ড", "গ্রাফাইট", "ফুলেরেনেস", "গ্লাস", "গ্লাস"));
        arrayList.add(new ContentQuestionModel("সালফিউরিক অ্যাসিডের সূত্র কী?", "এইচ 2 এসও 4", "এসও 2", "না 2 এসও 4", "কে 2 এসও 4", "এইচ 2 এসও 4"));
        arrayList.add(new ContentQuestionModel("পর্যায় সারণীতে নিম্নলিখিত উপাদানগুলি কীভাবে সাজানো আছে?", "এইচ, লি, তিনি, বি এবং বি", "এইচ, হি, বি, লি এবং বি", "এইচ, লি, তিনি, বি এবং বি", "এইচ, তিনি, লি, থাকুন এবং বি", "এইচ, তিনি, লি, থাকুন এবং বি"));
        arrayList.add(new ContentQuestionModel("পর্যায় সারণি বিভক্ত পিরিয়ডের সংখ্যা কত?", "6", "7", "8", "9", "7"));
        arrayList.add(new ContentQuestionModel("পর্যায় সারণীতে ___ গোষ্ঠী রয়েছে"  ," 18 "," 17 "," 16 "," 15 "," 18 "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোনটি নোবেল গ্যাসের উপাদান নয়?", "হিলিয়াম", "নিয়ন", "জেনন", "হাইড্রোজেন", "হাইড্রোজেন"));
        arrayList.add(new ContentQuestionModel("তিলকে কার্বন -12 এর _____ তে প্রাপ্ত পরমাণুর সংখ্যা হিসাবে সংজ্ঞায়িত করা হয়?", "11 গ্রাম", "14 গ্রাম", "10 গ্রাম", "12 গ্রাম", "12 গ্রাম"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি মিশ্রণ নয়?", "ইস্পাত", "অ্যালুমিনিয়াম", "গ্রাফাইট", "গ্লাস", "গ্রাফাইট"));
        arrayList.add(new ContentQuestionModel("অ্যালোয়গুলি _______________", "খাঁটি ধাতুর চেয়ে শক্ত", "অপরিষ্কার ধাতুর চেয়ে শক্ত", "খাঁটি ধাতুর চেয়ে নরম", "অপরিষ্কার ধাতুর চেয়ে নরম", "খাঁটি ধাতুর চেয়ে শক্ত"));
        arrayList.add(new ContentQuestionModel("সেই প্রক্রিয়ার নাম কী যেখানে অক্সিজেন সরানো হয়?", "জারণ", "তড়িৎ বিশ্লেষণ", "আয়নায়ন", "হ্রাস", "হ্রাস"));
        arrayList.add(new ContentQuestionModel("মরিচা একটি ___________ প্রতিক্রিয়া।", "আয়নাইজেশন", "জারণ", "হ্রাস", "উপরের কিছুই নয়", "জারণ"));
        arrayList.add(new ContentQuestionModel("মরিচা হওয়ার জন্য কী দরকার?", "জল", "অক্সিজেন", "জল এবং অক্সিজেন", "কার্বন ডাই অক্সাইড", "জল এবং অক্সিজেন"));
        arrayList.add(new ContentQuestionModel("সমস্ত অ্যাসিডগুলি ________________", "তারা শক্তিশালী হলে ক্ষয়কারী", "তারা যখন দুর্বল থাকে তখন ক্ষয়কারী", "তারা শক্তিশালী হলে খিটখিটে", "উপরের কোনওটিই নয়", "তারা শক্তিশালী হলে ক্ষয়কারী"));
        arrayList.add(new ContentQuestionModel("যখন অ্যাসিডটি ধাতব কার্বনেটের সাথে প্রতিক্রিয়া জানায়, তখন তৈরি পণ্যগুলি __________", "লবণ এবং জল", "জল এবং কার্বন ডাই অক্সাইড", "লবণ, জল এবং কার্বন ডাই অক্সাইড", "লবণ এবং কার্বন ডাই অক্সাইড", "লবণ, জল এবং কার্বন ডাই অক্সাইড"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি ক্ষারীয়?", "ভিনেগার", "লালা", "অ্যামোনিয়া", "অ্যাসিড বৃষ্টি", "অ্যামোনিয়া"));
        arrayList.add(new ContentQuestionModel("পর্যায় সারণিতে উপাদানগুলি তাদের ___________", "গণ সংখ্যা", "পারমাণবিক এবং ভর সংখ্যা", "উপরের কিছুই নয়", "পরমাণু সংখ্যা","পরমাণু সংখ্যা"));
        arrayList.add(new ContentQuestionModel("একটি আইসোটোপ কী?", "বিভিন্ন ভর সংখ্যাযুক্ত একটি উপাদানের পরমাণু", "একই পরিমাণে একটি সংখ্যার উপাদানগুলির পরমাণু", "পৃথক পারমাণবিক সংখ্যাযুক্ত একটি উপাদানের পরমাণু", "একই পরিমাণে পারমাণবিক সংখ্যাযুক্ত একটি উপাদানের পরমাণু  কী? ","বিভিন্ন ভর সংখ্যাযুক্ত একটি উপাদানের পরমাণু"));
        arrayList.add(new ContentQuestionModel("পারমাণবিক সংখ্যাটি কোন বর্ণ দ্বারা প্রতিনিধিত্ব করা হয়?", "এ", "এম", "এক্স", "জেড", "জেড"));
        arrayList.add(new ContentQuestionModel("কোন বিজ্ঞানকে কখনও কখনও  কেন্দ্রীয় বিজ্ঞান  বলা হয়?", "পদার্থবিজ্ঞান", "রসায়ন", "জীববিজ্ঞান", "ভূতত্ত্ব", "রসায়ন"));
        arrayList.add(new ContentQuestionModel("শরীরে হজমে সহায়তা করতে কোন অ্যাসিড ব্যবহার করা হয়?", "হাইড্রোক্লোরিক অ্যাসিড", "সালফিউরিক এসিড", "এসিটিক এসিড", "বোরিক অ্যাসিড", "হাইড্রোক্লোরিক অ্যাসিড"));
        arrayList.add(new ContentQuestionModel("সূর্যের ক্রোমোস্ফিয়ারে নিম্নলিখিতগুলির মধ্যে কোনটি আবিষ্কার করা হয়েছিল?", "ক্রিপটন", "জেনন", "নিয়ন", "হিলিয়াম", "হিলিয়াম"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি ঘরের তাপমাত্রায় তরল আকারে?", "লিথিয়াম", "সোডিয়াম", "ফ্রেঞ্চিয়াম", "সেরিয়াম", "ফ্রেঞ্চিয়াম"));
        arrayList.add(new ContentQuestionModel("সোডিয়াম ধাতু", "পেট্রোল", "অ্যালকোহল", "জল", "কেরোসিন", "কেরোসিন"  ));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি গুনমেটালের উপাদান?", "আয়রন, দস্তা, টাইটানিয়াম", "আয়রন, টিন", "আয়রন, ব্রাস, টিন", "তামা, টিন", "তামা, টিন"));
        arrayList.add(new ContentQuestionModel("কোন খনিজ থেকে রেডিয়াম পাওয়া যায়?", "রুটাইল", "হেইমেটাইট", "পিচবলেন্ডে", "চুনাপাথর", "পিচবলেন্ডে"));
        arrayList.add(new ContentQuestionModel("পটাসিয়াম নাইট্রেট", "ওষুধ", "সার", "নুন", "গ্লাস", "সার"  ));
        arrayList.add(new ContentQuestionModel("পানির স্থায়ী কঠোরতা", "সোডিয়াম কার্বনেট", "বাদাম", "পটাসিয়াম পারমঙ্গনেট", "চুন", "সোডিয়াম কার্বনেট"  ));
        arrayList.add(new ContentQuestionModel("সোডা পানিতে", "কার্বনিক অ্যাসিড", "সালফিউরিক অ্যাসিড", "কার্বন ডাই অক্সাইড", "নাইট্রাস অ্যাসিড", "কার্বন ডাই অক্সাইড"));
        arrayList.add(new ContentQuestionModel("অ্যালুমিনিয়ামের সবচেয়ে গুরুত্বপূর্ণ আকরিকটি হল", "গ্যালেনা", "ক্যালামাইন", "ক্যালসাইট", "বক্সাইট", "বক্সাইট"));
        arrayList.add(new ContentQuestionModel("পানিতে সর্বাধিক দ্রবণীয় হ'ল", "কর্পূর", "সালফার", "সাধারণ লবণ", "চিনি", "চিনি"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("कौन सा जानवर अपने पूरे जीवन में कभी पानी नहीं पीता है?", "कंगारू", "दरियाई घोड़ा", "चूहा", "कंगारू चूहा", "कंगारू चूहा"));
        arrayList.add(new ContentQuestionModel("जीवन का भौतिक चरण क्या कहलाता है?", "प्रोटोप्लाज्म", "साइटोप्लाज्म", "ऑर्गेनेल", "उपरोक्त में से कोई नहीं", "प्रोटोप्लाज्म"));
        arrayList.add(new ContentQuestionModel("सबसे बड़ी कोशिका ________________", "नर्व सेल", "ओवम", "एक अंडा का अंडा", "उपरोक्त में से कोई नहीं", "एक अंडा का अंडा"  ));
        arrayList.add(new ContentQuestionModel("सबसे बड़ा मानव कोशिका कौन सा है?", "लिवर", "स्किन", "प्लीहा", "ओवम", "ओवम"));
        arrayList.add(new ContentQuestionModel("_________________ सबसे लंबी सेल है।", "नर्व सेल", "स्किन", "प्लीहा", "उपरोक्त में से कोई नहीं", "नर्व सेल"));
        arrayList.add(new ContentQuestionModel("शरीर में कोशिकाओं का नाम क्या है जो बैक्टीरिया जैसे विदेशी कणों को संलग्न करते हैं?", "ग्लोब्युलिन", "फाइब्रिनोजेन", "फागोसाइट्स", "एल्बुमिन", "फागोसाइट्स"));
        arrayList.add(new ContentQuestionModel("मानव में मांसपेशियों की संख्या _____ होती है।", "638", "637", "639", "640", "639"));
        arrayList.add(new ContentQuestionModel("आरबीसी का जीवन काल क्या है?", "130 दिन", "110 दिन", "100 दिन", "120 दिन", "120 दिन"));
        arrayList.add(new ContentQuestionModel("डब्ल्यूबीसी का जीवन काल क्या है?", "2-15 दिन", "3-15 दिन", "4-15 दिन", "5-20 दिन", "2-15 दिन"));
        arrayList.add(new ContentQuestionModel("कौन सा कशेरुक है जिसमें दो कक्षीय हृदय हैं?", "मछली", "सांप", "ब्लू व्हेल", "क्रोकोडाइल", "मछली"));
        arrayList.add(new ContentQuestionModel("मानव शरीर में पसलियों की संख्या _____ है।", "23", "24", "25", "22", "24"));
        arrayList.add(new ContentQuestionModel("सबसे छोटा उड़ने वाला पक्षी कौन सा है?", "कीवी", "पेंगुइन", "शुतुरमुर्ग", "रिया", "कीवी"));
        arrayList.add(new ContentQuestionModel("सॉरोलॉजी, ___________ का अध्ययन है।", "मच्छर", "सांप", "छिपकली", "कॉकरोच", "छिपकली"));
        arrayList.add(new ContentQuestionModel("हार्मोन _____________", "अंतःस्रावी ग्रंथियाँ", "पिट्यूटरी ग्रंथियाँ", "अग्न्याशय", "हाइपोथैलेमस", "अंतःस्रावी ग्रंथियाँ"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी 'मास्टर ग्रंथि' है?", "थाइमस ग्रंथि", "अग्न्याशय", "पीनियल ग्रंथि", "पिट्यूटरी ग्रंथि", "पिट्यूटरी ग्रंथि"));
        arrayList.add(new ContentQuestionModel("एडीएच का पूर्ण रूप क्या है?", "एंटी डाइयुरेटिक हॉर्मोन", "एडेसिव डाइयुरेटिक हॉर्मोन", "एसिडिक ड्यूरेटिक हॉर्मोन", "एडेनोसिन डबल हॉर्मोन", "एंटी डाइयुरेटिक हॉर्मोन"));//16
        arrayList.add(new ContentQuestionModel("शरीर में रक्त शर्करा का सामान्य मूल्य क्या है?", "80 से 120mg / 100 ml खून", "70 से 120mg / 100 ml रक्त", "90 से 120mg / 100 ml रक्त", "60 120mg / 100 ml खून ","80 से 120mg / 100 ml खून"));
        arrayList.add(new ContentQuestionModel("शरीर में सबसे बड़ा रक्त वाहिका कौन सा है?", "एल्वियोली", "धमनी", "महाधमनी", "नस", "महाधमनी"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी गाड़ी में खून होता है?", "पल्मोनरी आर्टरी", "पल्मोनरी नस", "एल्वियोली", "एओर्टा", "पल्मोनरी आर्टरी"));
        arrayList.add(new ContentQuestionModel("किसने दुनिया का पहला हृदय प्रत्यारोपण किया था?", "डॉ। वेणुगोपाल", "विलियम हार्वे", "क्रिश्चियन बर्नार्ड", "उपरोक्त में से कोई नहीं", "क्रिश्चियन बर्नार्ड"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा कार्बन का एक आबंटन नहीं है?", "डायमंड", "ग्रेफाइट", "फुलरीन", "ग्लास", "ग्लास"));
        arrayList.add(new ContentQuestionModel("सल्फ्यूरिक एसिड का सूत्र क्या है?", "H2SO4", "SO2", "Na2SO4", "K2SO4", "H2SO4"));
        arrayList.add(new ContentQuestionModel("आवर्त सारणी में निम्नलिखित तत्वों को कैसे व्यवस्थित किया गया है?", "H, He, Li, Be and B", "H, Li, He, Be and B", "H, He, Be, Li and B" ,"एच, बी, हे, बी और ली", "एच, बी, हे, बी और ली"));
        arrayList.add(new ContentQuestionModel("किस अवधि में आवर्त सारणी विभाजित होती है?", "6", "7", "8", "9", "7"));
        arrayList.add(new ContentQuestionModel("आवर्त सारणी में ___ समूह हैं।", "18", "17", "16", "15", "18"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन नोबल गैसों का एक तत्व नहीं है?", "हीलियम", "नियॉन", "क्सीनन", "हाइड्रोजन", "हाइड्रोजन"));
        arrayList.add(new ContentQuestionModel("मोल को कार्बन -12 के _____ में पाए जाने वाले परमाणुओं की संख्या के रूप में परिभाषित किया गया है?", "11 ग्राम", "14 ग्राम", "10 ग्राम", "12 ग्राम", "12 ग्राम"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन मिश्रण नहीं है?", "स्टील", "एल्युमिनियम", "ग्रेफाइट", "ग्लास", "ग्रेफाइट"));
        arrayList.add(new ContentQuestionModel("मिश्र धातुएं _______________", "शुद्ध धातु की तुलना में कठिन", "अशुद्ध धातु की तुलना में कठोर", "शुद्ध धातु की तुलना में सोफ़र", "अशुद्ध धातु की तुलना में नरम", "शुद्ध धातु की तुलना में सोफ़र"));
        arrayList.add(new ContentQuestionModel("उस प्रक्रिया का नाम क्या है जिसमें ऑक्सीजन को हटाया जाता है?", "ऑक्सीकरण", "इलेक्ट्रोलिसिस", "आयनिकरण", "न्यूनीकरण", "न्यूनीकरण"));
        arrayList.add(new ContentQuestionModel("जंग लगाना एक ___________ प्रतिक्रिया है।", "आयनीकरण", "ऑक्सीकरण", "न्यूनीकरण", "उपरोक्त में से कोई नहीं", "ऑक्सीकरण"));
        arrayList.add(new ContentQuestionModel("जंग लगने के लिए क्या आवश्यक है?", "पानी", "ऑक्सीजन", "पानी और ऑक्सीजन", "कार्बन डाइऑक्साइड", "पानी और ऑक्सीजन"));
        arrayList.add(new ContentQuestionModel("सभी एसिड ________________", "संक्षारक जब वे मजबूत होते हैं", "संक्षारक जब वे कमजोर होते हैं", "चिड़चिड़े जब वे मजबूत होते हैं", "उपरोक्त में से कोई नहीं", "संक्षारक जब वे कमजोर होते हैं"));
        arrayList.add(new ContentQuestionModel("जब एक धातु कार्बोनेट के साथ एक एसिड प्रतिक्रिया करता है, तो बनने वाले उत्पाद __________", "नमक और पानी", "पानी और कार्बन डाइऑक्साइड", "नमक, पानी  होते हैं। और कार्बन डाइऑक्साइड", "नमक और कार्बन डाइऑक्साइड", "नमक, पानी  होते हैं। और कार्बन डाइऑक्साइड"));//34
        arrayList.add(new ContentQuestionModel("कौन सा निम्नलिखित में से एक क्षारीय है?", "सिरका", "लार", "अमोनिया", "अम्ल वर्षा", "अमोनिया"));
        arrayList.add(new ContentQuestionModel("आवर्त सारणी में तत्वों को उनके ___________ के अनुसार व्यवस्थित किया जाता है", "मास संख्या", "परमाणु और द्रव्यमान संख्या", "उपरोक्त में से कोई नहीं", "परमाणु संख्या", "परमाणु संख्या"));
        arrayList.add(new ContentQuestionModel("एक आइसोटोप क्या है?", "विभिन्न द्रव्यमान संख्या वाले तत्व के परमाणु", "एक समान द्रव्यमान संख्या वाले तत्व के", "अलग परमाणु संख्या वाले तत्व के परमाणु", "एक परमाणु संख्या वाले तत्व के परमाणु ","एक समान द्रव्यमान संख्या वाले तत्व के"));
        arrayList.add(new ContentQuestionModel("परमाणु संख्या को किस अक्षर द्वारा दर्शाया गया है?", "ए", "एम", "एक्स", "जेड", "जेड"));
        arrayList.add(new ContentQuestionModel("किस विज्ञान को कभी-कभी 'केंद्रीय विज्ञान' कहा जाता है?", "भौतिकी", "रसायन विज्ञान", "जीवविज्ञान", "भूविज्ञान", "रसायन विज्ञान"));
        arrayList.add(new ContentQuestionModel("पाचन में मदद करने के लिए शरीर में किस एसिड का उपयोग किया जाता है?", "हाइड्रोक्लोरिक एसिड", "सल्फ्यूरिक एसिड", "एसिटिक एसिड", "बोरिक एसिड", "हाइड्रोक्लोरिक एसिड"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसे सूर्य के क्रोमोस्फियर में सबसे पहले खोजा जाना था?", "क्रिप्टन", "क्सीनन", "नियॉन", "हीलियम", "हीलियम"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसे सूर्य के क्रोमोस्फियर में सबसे पहले खोजा जाना था?", "क्रिप्टन", "Francium","Lithium","Sodium","Francium"));
        arrayList.add(new ContentQuestionModel("सोडियम मेटल --  के अंतर्गत रखा जाता है।", "पेट्रोल", "अल्कोहल", "वाटर", "केरोसीन", "केरोसीन"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी सामग्री टॉगनमीटर है?", "आयरन, जिंक, टाइटेनियम", "आयरन, टिन", "आयरन, ब्रास, टिन", "कॉपर, टिन", "कॉपर, टिन"));
        arrayList.add(new ContentQuestionModel("किस खनिज से रेडियम प्राप्त होता है?", "रूटाइल", "हेमाटाइट", "पिचब्लेंड", "चूना पत्थर", "पिचब्लेंड"));
        arrayList.add(new ContentQuestionModel("पोटेशियम नाइट्रेट--  में उपयोग किया जाता है", "दवा", "उर्वरक", "नमक", "गिलास", "उर्वरक"));
        arrayList.add(new ContentQuestionModel("पानी की स्थायी कठोरता --  के अतिरिक्त द्वारा हटाया जा सकता है", "सोडियम कार्बोनेट", "फिटकरी", "पोटेशियम परमैंगनेट", "चूना", "सोडियम कार्बोनेट"));
        arrayList.add(new ContentQuestionModel("सोडा पानी में", "कार्बोनिक एसिड", "सल्फ्यूरिक एसिड", "कार्बन डाइऑक्साइड", "नाइट्रस एसिड", "कार्बन डाइऑक्साइड"));
        arrayList.add(new ContentQuestionModel("एल्यूमीनियम का सबसे महत्वपूर्ण अयस्क", "गैलिना", "कैलामाइन", "कैल्साइट", "बॉक्साइट", "बॉक्साइट" ));
        arrayList.add(new ContentQuestionModel("पानी में सबसे अधिक घुलनशील", "कपूर", "सल्फर", "सामान्य नमक", "चीनी", "चीनी"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("کون سا جانور کبھی بھی اپنی پوری زندگی میں پانی نہیں پیتا؟" , "کینگارو" , "ہپپوپوٹیمس" , "چوہا" , "کنگارو چوہا","کنگارو چوہا"));
        arrayList.add(new ContentQuestionModel("زندگی کے جسمانی مرحلے کو کیا کہتے ہیں؟" , "پروٹوپلازم" , "سائٹوپلازم" , "آرگنیلز" , "مذکورہ بالا کوئی بھی نہیں","پروٹوپلازم"));
        arrayList.add(new ContentQuestionModel("سب سے بڑا سیل ________________ ہے" , "اعصاب سیل" , "شوترمرگ کا انڈا" , "ایک شوترمرگ کا انڈا", "مندرجہ بالا میں سے کوئی بھی نہیں ہے","شوترمرگ کا انڈا"));
        arrayList.add(new ContentQuestionModel("سب سے بڑا انسانی خلیہ کونسا ہے؟", "جگر" , "جلد" , "تللی" , "اووم","اووم"));
        arrayList.add(new ContentQuestionModel("_________________ سب سے لمبا سیل ہے۔" , "اعصاب سیل" , "جلد" , "تلی" , "مذکورہ بالا کوئی بھی نہیں","اعصاب سیل"));
        arrayList.add(new ContentQuestionModel("جسم میں ان خلیوں کا کیا نام ہے جو خارجی ذرات کو بیکٹیریا کی طرح لپیٹ دیتے ہیں؟" , "گلوبلین" , "فبرینوجن" , "فاگوکیٹس" , "البومین","فاگوکیٹس"));//6
        arrayList.add(new ContentQuestionModel("انسانوں میں _____ تعداد میں پٹھوں کی تعداد موجود ہے۔","638","637","639","640","639"));
        arrayList.add(new ContentQuestionModel("آر بی سی کی زندگی کا دورانیہ کیا ہے؟" , "130 دن" , "110 دن" , "100 دن" , "120 دن","120 دن"));
        arrayList.add(new ContentQuestionModel("ڈبلیو بی سی کی زندگی کا دورانیہ کتنا ہے؟" , "2-15 دن" , "3-15 دن" , "4-15 دن" , "5-20 دن","2-15 دن"));
        arrayList.add(new ContentQuestionModel("کونسا فقرہ ہے جس کا دو دل دار دماغ ہے؟" , "مچھلی" , "سانپ" , "بلیو وہیل" , "مگرمچرچھ","مچھلی"));
        arrayList.add(new ContentQuestionModel("انسانی جسم میں پسلیوں کی تعداد _____ ہے۔","23","24","25","22","24"));
        arrayList.add(new ContentQuestionModel("اڑان بھرنے والا سب سے چھوٹا پرندہ کونسا ہے؟" , "کیوی" , "پینگوئن" , "شوترمرگ" , "ریا","کیوی"));
        arrayList.add(new ContentQuestionModel("سوروولوجی ___________ کا مطالعہ ہے۔" ,"مچھر" , "سانپ" , "چھپکلی" , "کاکروچ","چھپکلی"));
        arrayList.add(new ContentQuestionModel("ہارمونز _____________" , "Endocrine gland" , "اینڈوکرائن غدود" , "Pancreas" , "Hypothalamus"  ,"اینڈوکرائن غدود"));//14
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ماسٹر غدود ہے؟" , "تھیمس گلینڈ" , "پینکریاس" , "پائنل گلٹی" , "پٹیوٹری غدود","پٹیوٹری غدود"));
        arrayList.add(new ContentQuestionModel("ADH کی مکمل شکل کیا ہے؟" , "اینٹی ڈیوورٹک ہارمون" , "چپکنے والی ڈوریوٹک ہارمون" , "تیزابی ڈوریوٹک ہارمون" , "اینٹی ڈایوریٹک ہارمون","اینٹی ڈایوریٹک ہارمون"));
        arrayList.add(new ContentQuestionModel("جسم میں بلڈ شوگر کی عام قدر کیا ہے؟" , "80 سے 120 ملی گرام / 100 ملی لیٹر خون" , "خون سے 70 سے 120 ملی گرام / 100 ملی لیٹر" , "خون سے 90 سے 120 ملی گرام / 100 ملی لیٹر" , "60 120mg / 100 ملی لیٹر خون ","80 سے 120 ملی گرام / 100 ملی لیٹر خون"));//17
        arrayList.add(new ContentQuestionModel("جسم میں خون کا سب سے بڑا برتن کون سا ہے؟" , "الیوولی" , "شریان" , "شہ رگ" , "رگ","شہ رگ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ناپاک خون ہے؟" , "پلمونری دمنی", "پھیپھڑوں کی نس" , "الیلوولی" , "شہ رگ","پھیپھڑوں کی نس"));
        arrayList.add(new ContentQuestionModel("دنیا کا پہلا ہارٹ ٹرانسپلانٹ کس نے کیا؟" , "ڈاکٹر وینگوپال" , "ولیم ہاروی" , "کرسچن برنارڈ" , "مذکورہ بالا کوئی بھی نہیں","کرسچن برنارڈ"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے کون سا کاربن کا الاٹروپ نہیں ہے؟" , "ڈائمنڈ" , "گریفائٹ" , "فلریننس" , "گلاس","گلاس"));
        arrayList.add(new ContentQuestionModel("سلفورک ایسڈ کا فارمولا کیا ہے؟" , "H2SO4" , "SO2" , "Na2SO4" , "K2SO4","H2SO4"));
        arrayList.add(new ContentQuestionModel("متواتر جدول میں مندرجہ ذیل عناصر کا کس طرح اہتمام کیا گیا ہے؟" , "ایچ ، ہی ، لی ، بی اور بی" , "ایچ ، لی ، وہ ، ہو اور بی" , "ایچ ، وہ ، بی ، لی اور بی" , "ایچ ، وہ ، لی ، بی اور بی","ایچ ، وہ ، لی ، بی اور بی"));//23
        arrayList.add(new ContentQuestionModel("ادوار کی تعداد کتنی ہے جس میں متواتر جدول تقسیم ہوا ہے؟","6","7","8","9","7"));
        arrayList.add(new ContentQuestionModel("متواتر جدول میں ___ گروپس ہیں۔","18","17","16","15","18"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی نوبل گیسوں کا عنصر نہیں ہے؟" ,"ہیلیم" , "نیین" , "زینون" , "ہائیڈروجن","ہائیڈروجن"));
        arrayList.add(new ContentQuestionModel("تل کی وضاحت کاربن 12 کے _____ میں پائے جانے والے ایٹموں کی تعداد کے طور پر کی گئی ہے؟" , "11 گرام" , "14 گرام" , "10 گرام" , "12 گرام","12 گرام"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا مرکب نہیں ہے؟" , "اسٹیل" , "ایلومینیم" , "گریفائٹ" , "گلاس","گریفائٹ"));
        arrayList.add(new ContentQuestionModel("مرکب دھات _______________" , "خالص دھات سے سخت" , "ناپاک دھات سے سخت" , "خالص دھات سے نرم" , "ناپاک دھات سے نرم","خالص دھات سے سخت"));
        arrayList.add(new ContentQuestionModel("اس عمل کا نام کیا ہے جس میں آکسیجن کو ہٹا دیا جاتا ہے؟" , "آکسیکرن" , "الیکٹرولیسیس" , "آئنائزیشن" , "کمی","کمی"));
        arrayList.add(new ContentQuestionModel("زنگ آلود ہونا ایک ___________ رد عمل ہے۔" , "آئنائزیشن" , "آکسیکرن" , "کمی" , "مذکورہ بالا میں سے کوئی بھی نہیں","آکسیکرن"));
        arrayList.add(new ContentQuestionModel("زنگ آلود ہونے کے ل What کیا ضرورت ہے؟" , "پانی" , "آکسیجن" , "پانی اور آکسیجن" , "کاربن ڈائی آکسائیڈ","پانی اور آکسیجن"));
        arrayList.add(new ContentQuestionModel("تمام تیزاب ________________"   , "جب وہ مضبوط ہوتے ہیں تو سنکنرن" , "جب وہ کمزور ہوتے ہیں تو سنکنرن ہوتے ہیں" , "چڑچڑا جب وہ مضبوط ہوتے ہیں" , "مندرجہ بالا میں سے کوئی بھی نہیں","جب وہ مضبوط ہوتے ہیں تو سنکنرن"));//33
        arrayList.add(new ContentQuestionModel("جب تیزاب دھات کے کاربونیٹ کے ساتھ ردعمل ظاہر کرتا ہے تو ، بننے والی مصنوعات __________" , "نمک اور پانی" , "پانی اور کاربن ڈائی آکسائیڈ" , "نمک ، پانی اور کاربن ڈائی آکسائیڈ" , "نمک اور کاربن ڈائی آکسائیڈ"  ,"نمک ، پانی اور کاربن ڈائی آکسائیڈ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں کون سا ایک الکلائن ہے؟" , "سرکہ" , "تھوک" , "امونیا"  , "تیزاب بارش","امونیا"));
        arrayList.add(new ContentQuestionModel("متواتر جدول میں عناصر کو ان کی ___________" , "بڑے پیمانے پر نمبر" , "جوہری اور بڑے پیمانے پر نمبر" , "مذکورہ بالا میں سے کوئی بھی نہیں" , "اٹامک نمبر"   ,"اٹامک نمبر"));//36
        arrayList.add(new ContentQuestionModel("ایک آاسوٹوپ کیا ہے؟" , "ایک عنصر کے جوہری جس میں بڑے پیمانے پر اعداد ہوتے ہیں" , "ایک عنصر کے جوہری ایک ہی تعداد میں ایک جیسے ہوتے ہیں" , " ایک عنصر کے جوہری جس میں بڑے پیمانے پر تعداد ہے " , "ایک عنصر کے جوہری ایک ہی جوہری تعداد والے حامل ہوتے ہیں۔" ," ایک عنصر کے جوہری جس میں بڑے پیمانے پر تعداد ہے "));//37
        arrayList.add(new ContentQuestionModel("ایٹم نمبر کس خط کی نمائندگی کرتا ہے؟","A","M","X","Z","Z"));
        arrayList.add(new ContentQuestionModel("کس سائنس کو کبھی کبھی"  ,"کہا جاتا ہے؟" , "ارضیات" , "کیمسٹری" , "حیاتیات" , "ارضیات"));//39
        arrayList.add(new ContentQuestionModel("ہضم میں مدد کے لئے جسم میں کون سا تیزاب استعمال ہوتا ہے؟" ,"ہائیڈروکلورک ایسڈ" ,"سلفورک ایسڈ" , "ایسیٹک ایسڈ" , "بورک ایسڈ","ہائیڈروکلورک ایسڈ"));
        arrayList.add(new ContentQuestionModel("سورج کے کروماسفیرس میں مندرجہ ذیل میں سے کون سا پہلے دریافت کیا جانا تھا؟" , "کرپٹن" , "زینون" , "نیین" , "ہیلیم","ہیلیم"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے کون سا کمرے کے درجہ حرارت پر مائع کی شکل میں ہے؟" , "لتیم" , "سوڈیم" , "فرانسیئم" , "سیریم","فرانسیئم"  ));
        arrayList.add(new ContentQuestionModel("سوڈیم دھات" , "پٹرول" , "شراب" , "پانی" , "مٹی کا تیل"   ,"مٹی کا تیل"));
        arrayList.add(new ContentQuestionModel("گونمیٹال کے اجزاء کون سے ہیں؟" , "آئرن ، زنک ، ٹائٹینیم" , "آئرن ، ٹن" , "آئرن ، پیتل ، ٹن" , "کاپر ، ٹن","کاپر ، ٹن"));
        arrayList.add(new ContentQuestionModel("ریڈیم کس معدنیات سے حاصل کیا جاتا ہے؟" , "روٹیل" , "ہیمیٹیائٹ" , "پِچبلینڈی" , "چونا پتھر","پِچبلینڈی"));
        arrayList.add(new ContentQuestionModel("پوٹاشیم نائٹریٹ" , "دوائی" , "کھاد" , "نمک" ,  "گلاس"  ,"کھاد"));
        arrayList.add(new ContentQuestionModel("پانی کی مستقل سختی کو" , "سوڈیم کاربونیٹ" , "پھٹکڑی" , "پوٹاشیم پرمنجانیٹ" , "کے اضافے سے ختم کیا جاسکتا",  "کے اضافے سے ختم کیا جاسکتا"));//47
        arrayList.add(new ContentQuestionModel("سوڈا کے پانی میں" , "کاربنک ایسڈ" , "سلفورک ایسڈ" , "کاربن ڈائی آکسائیڈ" , "نائٹریس ایسڈ"   ,"کاربن ڈائی آکسائیڈ"));
        arrayList.add(new ContentQuestionModel("ایلومینیم کا سب سے اہم دھات" , "گیلینا" , "کیلامین" , "کیلکائٹ", "باکسائٹ"  ,"باکسائٹ"));
        arrayList.add(new ContentQuestionModel("پانی میں سب سے زیادہ گھلنشیل" , "کپور" , "شکر" , "عام نمک" , "چینی"  ,"شکر"));

        return arrayList;


    }


}