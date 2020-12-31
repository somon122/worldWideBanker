package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Biology {
    private Context context;

    public Biology(Context context) {
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



          arrayList.add(new ContentQuestionModel("Foot and mouth disease is found in","Cats and dogs","Humans","Cattle","Poultry","Cattle"));
        arrayList.add(new ContentQuestionModel("Which one of the following is a primate? ","Bear","Otter","Loris","Pangolin","Loris"));
        arrayList.add(new ContentQuestionModel("To which one of the following types of organisms do mushrooms belong? ","Algae","Ferns","Fungi","Lichens","Fungi"));
        arrayList.add(new ContentQuestionModel("Food wrapped in newspaper is likely to get contaminated with  ","Lead","Aluminium","Iron","Magnesium","Lead"));
        arrayList.add(new ContentQuestionModel("Which one of the following produces seeds but no flowers?","Cashew nut","Coffee","Ground nut","Pine","Ground nut"));
        arrayList.add(new ContentQuestionModel("Which one of the following palnts is used for green manuring in India?  ","Wheat","Sunhemp","Cotton","Rice","Sunhemp"));
        arrayList.add(new ContentQuestionModel("The combination of foods providing protein quality nearest to that of meat is ","Wheat, dal and groundnuts","Bread and butter","Groundnuts and jiggery","Sprouted gram and groundnuts","Sprouted gram and groundnuts"));
        arrayList.add(new ContentQuestionModel("Which one of the following disease is Inheritable? ","Leukaemia","Colour blindness","Malignancy","Hepatitis","Colour blindness"));
        arrayList.add(new ContentQuestionModel("Which one of the following elements are present in all proteins? 1. Carbon 2. Hydrogen 3. Oxygen 4. Nitrogen  ","2 and 3","1,2 and 4","1,3 and 4","1,2,3 and 4","1,2,3 and 4"));
        arrayList.add(new ContentQuestionModel("For which one among the following diseases no vaccine is yet available? ","Tetanus","Malaria","Measles","Mumps","Malaria"));
        arrayList.add(new ContentQuestionModel("Which of the following vitamins is synthesised in the body by intenstinal bacteria? ","vitamin B1","vitamin B4","vitamin D","vitaminsK","vitaminsK"));
        arrayList.add(new ContentQuestionModel("BCG vaccination (Bacillus Calmette Guerine) is injected to get immunity from","Polio","Cholera","Small pox","Tuberculosis","Tuberculosis"));
        arrayList.add(new ContentQuestionModel("In which one of the following, antibody formations takes place? ","RBC’s","Blood platelets","Blood Plasma"," Donnan’s membrane","Blood Plasma"));
        arrayList.add(new ContentQuestionModel("From the evolutionary point of view, which one of the following is closer to man?  ","Dolphin","shark","Flying fish","tortoise","Dolphin"));
        arrayList.add(new ContentQuestionModel("How do most insects respire? ","through skin","through gills","by lungs","by trachea system","by trachea system"));
        arrayList.add(new ContentQuestionModel("Which one of the following part of human brain is the regulating centre for swallowing and vomiting? ","Cerebellum","cerebrum","medulla oblongata","pons","medulla oblongata"));
        arrayList.add(new ContentQuestionModel("Production of which one of the following is a function of the liver?","Lipase","Urea","Mucus","Hydrochloric acid","Urea"));
        arrayList.add(new ContentQuestionModel("During sleep a man’s blood pressure","Increases","decreases","remains constant","fluctuates","fluctuates"));
        arrayList.add(new ContentQuestionModel("Oncogene is responsible for  ","Aids","typhoid","malaria","cancer","cancer"));
        arrayList.add(new ContentQuestionModel("Which acid is produced when milk gets sour?","Acetic acid","Lactic acid","Tartaric acid","Butyric acid","Lactic acid"));
        arrayList.add(new ContentQuestionModel("Two richest kown sources of edible protein are  ","Meat and eggs","Milk and vegetables","Soyabean and groundnut","Some algae and other micro-organisms","Soyabean and groundnut"));
        arrayList.add(new ContentQuestionModel("Which nutrients are most likely to be affected by food processing and storage? ","Carbohydrates","Fats","Proteins","Vitamins","Vitamins"));
        arrayList.add(new ContentQuestionModel("Which one of the following parts of the pitcher plant becomes modified into a pitcher?  ","leaf","petiole","stipule","Stem","leaf"));
        arrayList.add(new ContentQuestionModel("In which one of the following animals is respiration done by skin? ","Flying fish","Sea horse","Frog","Chameleon","Frog"));
        arrayList.add(new ContentQuestionModel("Which one of the following bacteria helps in improving the soil fertility? ","Clostridium","Rhizobium","Salmonella","Staphylococcus","Rhizobium"));
        arrayList.add(new ContentQuestionModel("Which chamber of human heart pumps fully oxygenated blood to aorta and hence to the body?","Right Auricle","Left Auricle","Right Ventricle","Left Ventricle","Left Ventricle"));
        arrayList.add(new ContentQuestionModel("Which one of the following is a vitamin? ","Citric acid","Glutamic acid"," Folic acid","Linoleic acid"," Folic acid"));
        arrayList.add(new ContentQuestionModel("Which one of the following is responsible for converting milk into curd?  ","Bacteria","Fungi","Virus","None of these","Bacteria"));
        arrayList.add(new ContentQuestionModel("In which one of the following animals is skin a respiratory organ?  ","Cockroach","Frog","shark","Whale","Frog"));
        arrayList.add(new ContentQuestionModel("A typical human ribcage consists of how many ribs?","12","14","16","24","24"));
        arrayList.add(new ContentQuestionModel("What is the pH level of blood of a normal person?","4.0 – 4.5","6.45 – 65.5","7.35 – 7.45","8.25 – 8.35","7.35 – 7.45"));
        arrayList.add(new ContentQuestionModel("Which of the following disease is not a caused by viruses?  ","Cholera","Chickenpox","Hepatitis","Measles","Cholera"));

        arrayList.add(new ContentQuestionModel("For which among the following is not a true fruit?   ","Apple ","Date ","Grape","Plum","Plum"));
        arrayList.add(new ContentQuestionModel("Which of the following is least infectious ?  ","leprosy","conjunctivitis","tuberculosis","hepatitis","leprosy"));
        arrayList.add(new ContentQuestionModel("Which of the following is not a mosquito borne disease? ","Dengue fever","Sleeping sickness","Filariasis ","Malaria","Sleeping sickness"));
        arrayList.add(new ContentQuestionModel("In certain amino acids, which one of the following elements is found in addition to carbon , hydrogen, nitrogen and oxygen? ","Phosphorus","Zinc","Calcium","Sulphur ","Sulphur "));
        arrayList.add(new ContentQuestionModel("Among the following elements, which one is essential for the transmission of impulses in the nerve fibre?","Calcium","Zinc","Sodium","Iron","Calcium"));
        arrayList.add(new ContentQuestionModel("The vitamin which is very liable and easily destroyed during cooking as well as storage is  ","Vitamin A","Vitaminb6","Vitamin C","Vitamin K","Vitamin C"));
        arrayList.add(new ContentQuestionModel("The compound used in anti-malarial drug is ","Aspirin","Neoprene","Isoprene","Chloroquin","Chloroquin"));
        arrayList.add(new ContentQuestionModel("Which of the following is a skin disease?  ","Anaemia","Pellagra","Osteomalacia","Rickets","Pellagra"));
        arrayList.add(new ContentQuestionModel("The richest source of vitamin D is  ","Cod liver oil","Spinach","Milk","Cheese","Cod liver oil"));
        arrayList.add(new ContentQuestionModel("Which of the following tests helps in diagnosis of cancer?  ","X-ray","Urine test","Blood test","Biopsy test","Biopsy test"));
        arrayList.add(new ContentQuestionModel("Which one of the following is an enzyme?  ","Glucagon","Insulin","Somatotropin","Trypsin","Trypsin"));
        arrayList.add(new ContentQuestionModel("Which vitamin is provided by sunlight to the body?  ","Vitamin A","Vitamin B","Vitamin C","Vitamin D","Vitamin D"));
        arrayList.add(new ContentQuestionModel("The deficiency of which of the following leads to dental caries?  ","Iron","Copper","Fluorine","Zinc","Fluorine"));
        arrayList.add(new ContentQuestionModel("Healing of wounds is hastened by vitamin ","A","E","C","K","C"));
        arrayList.add(new ContentQuestionModel("Which of the following diseases is caused by the bite of a mad dog? ","Hydrocele","Hydrophobia","Hydrocephatus","Hydroperitoneum","Hydrophobia"));
        arrayList.add(new ContentQuestionModel("Which of the following vegetable proteins is considered as good as an animal protein? ","Soyabean protein","corn protein","Wheat protein","Bengal gram protein","Soyabean protein"));
        arrayList.add(new ContentQuestionModel("Carotene in Indian cow’s milk causes ","Creamish white colour","yellow colour","deep yellow colour","no change","yellow colour"));
        arrayList.add(new ContentQuestionModel(" A woman who weighs 45 kg and whose work involves a lot of physical exertion needs ","2800 calories per day","3000 calories per day","25000 calories per day"," 3700 calories per day","3000 calories per day"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

     arrayList.add(new ContentQuestionModel("নিম্নলিখিত উদ্ভিজ্জ প্রোটিনগুলির মধ্যে কোনটি প্রাণী প্রোটিন হিসাবে ভাল হিসাবে বিবেচিত হয়?", "সয়াবিন প্রোটিন", "কর্ন প্রোটিন", "গমের প্রোটিন", "বেঙ্গল ছোলা প্রোটিন", "সয়াবিন প্রোটিন"));
        arrayList.add(new ContentQuestionModel("ভারতীয় গরুর দুধে ক্যারোটিন হ'ল", "ক্রিমযুক্ত সাদা রঙ", "হলুদ বর্ণ", "গভীর হলুদ বর্ণ", "কোনও পরিবর্তন নেই", "হলুদ বর্ণ"));
        arrayList.add(new ContentQuestionModel("একজন মহিলা যার ওজন 45 কেজি এবং যার কাজে প্রচুর শারীরিক পরিশ্রম জড়িত", "প্রতিদিন 288 ক্যালোরি", "3000 ক্যালোরি  প্রতিদিন", "25000 ক্যালোরি প্রতিদিন", "প্রতিদিন 3700 ক্যালোরি", "3000 ক্যালোরি  প্রতিদিন"));
        arrayList.add(new ContentQuestionModel("পা ও মুখের রোগ পাওয়া যায়", "বিড়াল এবং কুকুর", "মানুষ", "গবাদি পশু", "হাঁস", "গবাদি পশু"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি প্রাইমেট?", "বিয়ার", "ওটার", "লরিস", "পাঙ্গোলিন", "লরিস"));
        arrayList.add(new ContentQuestionModel("মাশরুম নিম্নলিখিত কোন ধরণের জীবের সাথে জড়িত?", "শৈবাল", "ফার্নস", "ফুঙ্গি", "ল্যাচেনস", "ফুঙ্গি"));
        arrayList.add(new ContentQuestionModel("খবরের কাগজে মোড়ানো খাবার সম্ভবত", "সীসা", "অ্যালুমিনিয়াম", "আয়রন", "ম্যাগনেসিয়াম", "সীসা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি বীজ উত্পাদন করে তবে ফুল নেই?", "কাজু বাদাম", "কফি", "গ্রাউন্ড বাদাম", "পাইন", "গ্রাউন্ড বাদাম"));
        arrayList.add(new ContentQuestionModel("ভারতে সবুজ সারের জন্য নীচের কোনটি ব্যবহার করা হয়?", "গম", "সানহ্যাম্প", "তুলা", "ভাত", "সানহ্যাম্প"));
        arrayList.add(new ContentQuestionModel("মাংসের নিকটতম প্রোটিনের গুণাগুণ সরবরাহ করে এমন খাবারগুলির সংমিশ্রণ হ'ল", "গম, ডাল এবং চিনাবাদাম", "রুটি এবং মাখন", "শিং এবং চিনাবাদাম", "অঙ্কিত ছোলা এবং চিনাবাদাম", "অঙ্কিত ছোলা এবং চিনাবাদাম"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত রোগগুলির মধ্যে কোনটি উত্তরাধিকারযোগ্য?", "লিউকেমিয়া", "রঙিন অন্ধত্ব", "ম্যালিগেন্সি", "হেপাটাইটিস", "রঙিন অন্ধত্ব"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত উপাদানগুলির মধ্যে কোনটি সমস্ত প্রোটিনে উপস্থিত? 1. কার্বন 2. হাইড্রোজেন 3. অক্সিজেন 4. নাইট্রোজেন", "2 এবং 3", "1,2 এবং 4", "1,3 এবং 4", " 1,2,3 এবং 4 "," 1,2,3 এবং 4 "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত রোগগুলির মধ্যে কোনটির জন্য এখনও কোনও ভ্যাকসিন পাওয়া যায় না?", "টিটেনাস", "ম্যালেরিয়া", "হাম", "মাম্পস", "ম্যালেরিয়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত ভিটামিনগুলির মধ্যে কোনটি দেহে ইন্টাস্টিনাল ব্যাকটিরিয়া দ্বারা সংশ্লেষিত হয়?", "ভিটামিন বি 1", "ভিটামিন বি 4", "ভিটামিন ডি", "ভিটামিন কে", "ভিটামিন কে"));
        arrayList.add(new ContentQuestionModel("--থেকে প্রতিরোধ ক্ষমতা পেতে ইনজেকশন দেওয়া হয় বিসিজি টিকা (ব্যাসিলাস ক্যালমেট গেরিন)", "পোলিও", "কলেরা", "ক্ষুদ্র পোক্স", "যক্ষা", "যক্ষা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটিতে অ্যান্টিবডি গঠন হয়?", "আরবিসি'স", "রক্তের প্লেটলেট", "রক্তের প্লাজমা", "ডোনানের ঝিল্লি", "রক্তের প্লাজমা"));
        arrayList.add(new ContentQuestionModel("বিবর্তনীয় দৃষ্টিকোণ থেকে নিচের কোনটি মানুষের নিকটে?", "ডলফিন", "হাঙ্গর", "উড়ন্ত মাছ", "কচ্ছপ", "ডলফিন"));
        arrayList.add(new ContentQuestionModel("ঘুমের সময় একজন মানুষের রক্তচাপ", "বৃদ্ধি", "হ্রাস", "স্থির থাকে", "ওঠানামা", "ওঠানামা"));
        arrayList.add(new ContentQuestionModel("অনকোজিন--এর জন্য দায়ী", "এইডস", "টাইফয়েড", "ম্যালেরিয়া", "ক্যান্সার", "ক্যান্সার"));
        arrayList.add(new ContentQuestionModel("দুধ টক হয়ে গেলে কোন অ্যাসিড তৈরি হয়?", "এসিটিক অ্যাসিড", "ল্যাকটিক অ্যাসিড", "টারটারিক অ্যাসিড", "বাট্রিক অ্যাসিড", "ল্যাকটিক অ্যাসিড"));
        arrayList.add(new ContentQuestionModel("ভোজ্য প্রোটিনের দুটি ধনী কাউন্ট উত্স হ'ল", "মাংস এবং ডিম", "দুধ এবং শাকসবজি", "সয়াবিন এবং চিনাবাদাম", "কিছু শৈবাল এবং অন্যান্য অণুজীব", "সয়াবিন এবং চিনাবাদাম"));
        arrayList.add(new ContentQuestionModel("কোন খাদ্যতালিকা খাদ্য প্রক্রিয়াকরণ এবং স্টোরেজ দ্বারা সবচেয়ে বেশি প্রভাবিত হয়?", "কার্বোহাইড্রেট", "চর্বি", "প্রোটিন", "ভিটামিন", "ভিটামিন"));
        arrayList.add(new ContentQuestionModel("কলস উদ্ভিদের নিম্নলিখিত অংশগুলির মধ্যে কোনটি কলস হিসাবে পরিবর্তিত হয়?", "পাতা", "পেটিওল", "উপবৃত্তি", "কাণ্ড", "পাতা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত প্রাণীগুলির মধ্যে কোনটি ত্বকের দ্বারা শ্বাসকষ্ট হয়?", "উড়ন্ত মাছ", "সমুদ্র ঘোড়া", "ব্যাঙ", "গিরগিটি", "ব্যাঙ"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি ব্যাকটিরিয়া মাটির উর্বরতা উন্নত করতে সহায়তা করে?", "ক্লোস্ট্রিডিয়াম", "রাইজোবিয়াম", "সালমোনেলা", "স্টাফিলোকক্কাস", "রাইজোবিয়াম"));
        arrayList.add(new ContentQuestionModel("মানব হৃদয়ের কোন চেম্বারটি পুরো অক্সিজেনযুক্ত রক্তকে মহাশূন্যে এবং তাই শরীরে পাম্প করে?"," রাইট অরিকল "," বাম দিকের আরিকেল "," রাইট ভেন্ট্রিকল "," বাম ভেন্ট্রিকল "," বাম ভেন্ট্রিকল "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোনটি ভিটামিন?", "সাইট্রিক অ্যাসিড", "গ্লুটামিক এসিড", "ফলিক অ্যাসিড", "লিনোলিক এসিড", "ফলিক অ্যাসিড"));
        arrayList.add(new ContentQuestionModel("দুধকে দইতে রূপান্তরের জন্য নিম্নলিখিতগুলির মধ্যে কোনটি দায়ী?", "ব্যাকটিরিয়া", "ফুঙ্গি", "ভাইরাস", "এর কোনওটি নয়", "ব্যাকটিরিয়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোন প্রাণীতে ত্বক একটি শ্বসন অঙ্গ?", "তেলাপোকা", "ব্যাঙ", "হাঙ্গর", "তিমি", "ব্যাঙ"));
        arrayList.add(new ContentQuestionModel("একটি সাধারণ মানব ribcage কতগুলি পাঁজর নিয়ে গঠিত?", "12", "14", "16", "24", "24"));
        arrayList.add(new ContentQuestionModel("সাধারণ ব্যক্তির রক্তের পিএইচ স্তরটি কী?", "4.0.৪ - ৪.৫", ".4.৪৫ - .5.5.৫", "7.35 - 7.45", "8.25 ​​- 8.35", "7.35 - 7.45"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত রোগগুলির মধ্যে কোনটি ভাইরাস দ্বারা সৃষ্ট নয়?", "কলেরা", "চিকেনপক্স", "হেপাটাইটিস", "হাম", "কলেরা"));



        arrayList.add(new ContentQuestionModel("বেশিরভাগ পোকামাকড় কীভাবে শ্বাস দেয়?", "ত্বকের মাধ্যমে", "গিলের মাধ্যমে", "ফুসফুস দ্বারা", "শ্বাসনালী দ্বারা", "শ্বাসনালী দ্বারা"));
        arrayList.add(new ContentQuestionModel("মানব মস্তিষ্কের নিম্নলিখিত অংশগুলির মধ্যে কোনটি গিলতে এবং বমি করার নিয়ন্ত্রক কেন্দ্র?"," সেরিবেলাম "," সেরিব্রাম "," মেডুল্লা ওকোঙ্গাটা "," প্যানস "," মেডুল্লা ওকোঙ্গাটা "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির উত্পাদন লিভারের কার্যকারিতা?", "লিপ্যাস", "ইউরিয়া", "শ্লেষ্মা", "হাইড্রোক্লোরিক অ্যাসিড", "ইউরিয়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির জন্য সত্য ফল নয়?", "অ্যাপল", "তারিখ", "আঙ্গুর", "বরই", "বরই"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কম সংক্রামক?", "কুষ্ঠ", "কনজেক্টিভাইটিস", "যক্ষ্মা", "হেপাটাইটিস", "কুষ্ঠ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি মশা বাহিত রোগ নয়?", "ডেঙ্গু জ্বর", "ঘুমন্ত অসুস্থতা", "ফিলারিয়াসিস", "ম্যালেরিয়া", "ঘুমন্ত অসুস্থতা"));
        arrayList.add(new ContentQuestionModel("নির্দিষ্ট অ্যামিনো অ্যাসিডে কার্বন, হাইড্রোজেন, নাইট্রোজেন এবং অক্সিজেন ছাড়াও নিম্নলিখিত উপাদানগুলির মধ্যে কোনটি পাওয়া যায়?", "ফসফরাস", "দস্তা", "ক্যালসিয়াম", "সালফার", "সালফার"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত উপাদানগুলির মধ্যে, কোনটি স্নায়ু ফাইবারে প্রেরণগুলির জন্য প্রয়োজনীয়?", "ক্যালসিয়াম", "দস্তা", "সোডিয়াম", "আয়রন", "ক্যালসিয়াম"));
        arrayList.add(new ContentQuestionModel("রান্না করার পাশাপাশি সংরক্ষণের সময় যে ভিটামিনটি খুব দায়বদ্ধ এবং সহজেই ধ্বংস হয় তা হ'ল", "ভিটামিন এ", "ভিটামিনবি 6", "ভিটামিন সি", "ভিটামিন কে", "ভিটামিন সি"));
        arrayList.add(new ContentQuestionModel("অ্যান্টি-ম্যালেরিয়া ওষুধে ব্যবহৃত যৌগটি হ'ল", "অ্যাসপিরিন", "নিওপ্রিন", "ইসোপ্রিন", "ক্লোরোকুইন", "ক্লোরোকুইন"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি চর্মরোগ?", "অ্যানিমিয়া", "পেলেগ্রা", "অস্টিওমালাসিয়া", "রিকেটস", "পেলেগ্রা"));
        arrayList.add(new ContentQuestionModel("ভিটামিন ডি এর সবচেয়ে ধনী উত্স হ'ল", "কড লিভারের তেল", "শাক", "দুধ", "পনির", "কড লিভারের তেল"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত পরীক্ষাগুলির মধ্যে কোনটি ক্যান্সার নির্ণয় করতে সহায়তা করে?", "এক্স-রে", "মূত্র পরীক্ষা", "রক্ত পরীক্ষা", "বায়োপসি পরীক্ষা", "বায়োপসি পরীক্ষা"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি এনজাইম?", "গ্লুকাগন", "ইনসুলিন", "সোমোটোট্রপিন", "ট্রিপসিন", "ট্রিপসিন"));
        arrayList.add(new ContentQuestionModel("কোন ভিটামিন দেহে সূর্যের আলো দ্বারা সরবরাহ করা হয়?", "ভিটামিন এ", "ভিটামিন বি", "ভিটামিন সি", "ভিটামিন ডি", "ভিটামিন ডি"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোনটির অভাব ডেন্টাল ক্যারিসের দিকে পরিচালিত করে?", "আয়রন", "তামা", "ফ্লুরিন", "দস্তা", "ফ্লুরিন"));
        arrayList.add(new ContentQuestionModel("ক্ষত নিরাময় ভিটামিন দ্বারা ত্বরান্বিত হয়", "এ", "ই", "সি", "কে", "সি"));
        arrayList.add(new ContentQuestionModel("পাগল কুকুরের কামড়ের ফলে নিম্নলিখিত রোগগুলির মধ্যে কোনটি হয়?", "হাইড্রোসিলি", "হাইড্রোফোবিয়া", "হাইড্রোসেফটাস", "হাইড্রোপারিটোনিয়াম", "হাইড্রোফোবিয়া"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("जिसके लिए निम्नलिखित में से कोई एक सच्चा फल नहीं है?", "Apple", "दिनांक", "अंगूर", "बेर", "बेर"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन कम से कम संक्रामक है?", "कुष्ठ", "नेत्रश्लेष्मलाशोथ", "तपेदिक", "हेपेटाइटिस", "कुष्ठ"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन मच्छर जनित बीमारी नहीं है?", "डेंगू बुखार", "स्लीपिंग सिकनेस", "फाइलेरिया", "मलेरिया", "स्लीपिंग सिकनेस"));
        arrayList.add(new ContentQuestionModel("कुछ अमीनो एसिड में, कार्बन, हाइड्रोजन, नाइट्रोजन और ऑक्सीजन के अलावा निम्नलिखित में से कौन सा तत्व पाया जाता है?", "फास्फोरस", "जस्ता", "कैल्शियम", "सल्फर", "सल्फर"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित तत्वों में से, जो तंत्रिका फाइबर में आवेगों के संचरण के लिए आवश्यक है?", "कैल्शियम", "जस्ता", "सोडियम", "लोहा", "कैल्शियम"));
        arrayList.add(new ContentQuestionModel("विटामिन जो खाना पकाने के दौरान बहुत ही उत्तरदायी और आसानी से नष्ट हो जाता है", "विटामिन ए", "विटामिन बी 6", "विटामिन सी", "विटामिन के", "विटामिन सी"));
        arrayList.add(new ContentQuestionModel("मलेरिया-रोधी दवा में प्रयुक्त यौगिक है", "एस्पिरिन", "नियोप्रिन", "आइसोप्रीन", "क्लोरोक्विन", "क्लोरोक्विन"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा एक त्वचा रोग है?", "एनीमिया", "पेलग्रा", "ओस्टोमोलेशिया", "रिकेट्स", "पेलग्रा"));
        arrayList.add(new ContentQuestionModel("विटामिन डी का सबसे अमीर स्रोत", "कॉड लिवर ऑयल", "पालक", "दूध", "पनीर", "कॉड लिवर ऑयल" ));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा परीक्षण कैंसर के निदान में मदद करता है?", "एक्स-रे", "मूत्र परीक्षण", "रक्त परीक्षण", "बायोप्सी परीक्षण", "बायोप्सी परीक्षण"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन एक एंजाइम है?", "ग्लूकागन", "इंसुलिन", "सोमाटोट्रोपिन", "ट्रिप्सिन", "ट्रिप्सिन"));
        arrayList.add(new ContentQuestionModel("कौन सा विटामिन शरीर को सूर्य के प्रकाश द्वारा प्रदान किया जाता है?", "विटामिन ए", "विटामिन बी", "विटामिन सी", "विटामिन डी", "विटामिन डी"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसकी कमी से दंत क्षय होता है?", "आयरन", "कॉपर", "फ्लोरीन", "जिंक", "फ्लोरीन"));
        arrayList.add(new ContentQuestionModel("घावों का उपचार विटामिन द्वारा जल्दबाजी में किया जाता है", "ए", "ई", "सी", "के।","सी"));
        arrayList.add(new ContentQuestionModel("पागल कुत्ते के काटने से निम्नलिखित में से कौन सी बीमारी होती है?", "हाइड्रोसेले", "हाइड्रोफोबिया", "हाइड्रोसेफेटस", "हाइड्रोपरिटोनम", "हाइड्रोफोबिया"));
        arrayList.add(new ContentQuestionModel("निम्न में से किस वनस्पति प्रोटीन को पशु प्रोटीन के रूप में अच्छा माना जाता है?", "सोयाबीन प्रोटीन", "मकई प्रोटीन", "गेहूं प्रोटीन", "बंगाल ग्राम प्रोटीन", "सोयाबीन प्रोटीन"));
        arrayList.add(new ContentQuestionModel("भारतीय गाय के दूध में कैरोटीन", "क्रीमिश सफेद रंग", "पीला रंग", "गहरा पीला रंग", "कोई परिवर्तन नहीं", "पीला रंग"));
        arrayList.add(new ContentQuestionModel("एक महिला जिसका वजन 45 किलो है और जिसके काम में बहुत अधिक शारीरिक परिश्रम की ज़रूरत है", "2800 कैलोरी प्रति दिन", "प्रति दिन 3000 कैलोरी", "प्रति दिन 25000 कैलोरी", "प्रति दिन 3700 कैलोरी", "प्रति दिन 3000 कैलोरी"));
        arrayList.add(new ContentQuestionModel("फुट एंड माउथ डिजीज", "कैट्स एंड डॉग्स", "ह्यूमन", "कैटल", "पोल्ट्री", "कैटल"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन एक प्राइमेट है?", "भालू", "ओटर", "लोरिस", "पैंगोलिन", "लोरिस"));
        arrayList.add(new ContentQuestionModel("निम्न में से किस प्रकार के जीवों में मशरूम होते हैं?", "शैवाल", "फ़र्न्स", "फंगी", "लिचेंस", "फंगी"));
        arrayList.add(new ContentQuestionModel("अख़बार में लिपटे खाद्य पदार्थ से दूषित होने की संभावना है", "लीड", "एल्यूमीनियम", "लोहा", "मैग्नीशियम", "लीड"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा बीज पैदा करता है लेकिन कोई फूल नहीं?", "काजू", "कॉफी", "ग्राउंड नट", "पाइन", "ग्राउंड नट"));
        arrayList.add(new ContentQuestionModel("भारत में हरी खाद के लिए निम्नलिखित में से किस महल का उपयोग किया जाता है?", "व्हीट", "सनफेम", "कॉटन", "राइस", "सनफेम"));//24
        arrayList.add(new ContentQuestionModel("मांस के निकटतम प्रोटीन गुणवत्ता प्रदान करने वाले खाद्य पदार्थों का संयोजन है", "गेहूं, दाल और मूंगफली", "रोटी और मक्खन", "मूंगफली और गुड़", "अंकुरित चने और मूंगफली", "अंकुरित चने और मूंगफली"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सी बीमारी इनहेरिटेबल है?"," ल्यूकेमिया "," कलरनेस "," मैलिग्नेंसी "," हेपेटाइटिस "," कलरनेस "));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा तत्व सभी प्रोटीनों में मौजूद हैं? 1. कार्बन 2. हाइड्रोजन 3. ऑक्सीजन 4. नाइट्रोजन", "2 और 3", "1,2 और 4", "1,3 और 4", " 1,2,3 और 4 "," 1,2,3 और 4 "));
        arrayList.add(new ContentQuestionModel("जिसके लिए निम्न बीमारियों में से कोई भी टीका अभी तक उपलब्ध नहीं है?", "टेटनस", "मलेरिया", "खसरा", "कण्ठमाला", "मलेरिया"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा विटामिन शरीर में आंतों के बैक्टीरिया द्वारा संश्लेषित होता है?", "विटामिन बी 1", "विटामिन बी 4", "विटामिन डी", "विटामिनके", "विटामिनके"));
        arrayList.add(new ContentQuestionModel("बीसीजी टीकाकरण (बेसिलस कैलमेट गुएरिन) से प्रतिरक्षा प्राप्त करने के लिए इंजेक्शन है।"," तपेदिक "," हैजा "," स्मॉल पॉक्स "," ट्यूबरकुलोसिस "," तपेदिक "));//30
        arrayList.add(new ContentQuestionModel("जिसमें निम्नलिखित में से एक, एंटीबॉडी फॉर्मेशन होता है?", "आरबीसी का", "ब्लड प्लेटलेट्स", "ब्लड प्लाज़्मा", "डोनान का मेम्ब्रेन", "ब्लड प्लाज़्मा"));
        arrayList.add(new ContentQuestionModel("विकासवादी दृष्टिकोण से, निम्नलिखित में से कौन एक आदमी के करीब है?", "डॉल्फिन", "शार्क", "फ्लाइंग फिश", "कछुआ", "डॉल्फिन"));
        arrayList.add(new ContentQuestionModel("अधिकांश कीट कैसे प्रतिक्रिया करते हैं?", "त्वचा के माध्यम से", "गलफड़ों के माध्यम से", "फेफड़ों द्वारा", "ट्रेकिआ प्रणाली द्वारा", "ट्रेकिआ प्रणाली द्वारा")); //33
        arrayList.add(new ContentQuestionModel("मानव मस्तिष्क का निम्नलिखित में से कौन सा हिस्सा निगलने और उल्टी करने के लिए विनियमन केंद्र है?", "सेरिबैलम", "सेरेब्रम", "मज्जा ओबोंगेटा", "पॉन्स","मज्जा ओबोंगेटा"));
        arrayList.add(new ContentQuestionModel("उत्पादन जिसमें से एक यकृत का एक कार्य है?", "लाइपेस", "यूरिया", "म्यूकस", "हाइड्रोक्लोरिक एसिड", "यूरिया"));
        arrayList.add(new ContentQuestionModel("नींद के दौरान एक आदमी का रक्तचाप", "बढ़ता है", "घटता है", "स्थिर रहता है", "उतार-चढ़ाव", "उतार-चढ़ाव"));
        arrayList.add(new ContentQuestionModel("ऑन्कोजीन जिम्मेदार है", "एड्स", "टाइफाइड", "मलेरिया", "कैंसर", "कैंसर"));
        arrayList.add(new ContentQuestionModel("दूध के खट्टे होने पर कौन सा अम्ल उत्पन्न होता है?", "एसिटिक अम्ल", "लैक्टिक अम्ल", "टार्टरिक अम्ल", "ब्यूटिरिक अम्ल", "लैक्टिक अम्ल"));
        arrayList.add(new ContentQuestionModel("खाद्य प्रोटीन के दो सबसे अमीर स्रोत हैं", "मांस और अंडे", "दूध और सब्जियां", "सोयाबीन और मूंगफली", "कुछ शैवाल और अन्य सूक्ष्म जीव", "सोयाबीन और मूंगफली"));
        arrayList.add(new ContentQuestionModel("खाद्य प्रसंस्करण और भंडारण से कौन से पोषक तत्व सबसे अधिक प्रभावित होते हैं?", "कार्बोहाइड्रेट", "वसा", "प्रोटीन", "विटामिन", "विटामिन"));
        arrayList.add(new ContentQuestionModel("घड़े के पौधे के निम्नलिखित भागों में से कौन सा एक घड़े में परिवर्तित हो जाता है?", "पत्ती", "पेटियोल", "वजीफा", "तना", "पत्ती"));
        arrayList.add(new ContentQuestionModel("जिसमें निम्न में से एक जानवर त्वचा द्वारा किया गया श्वसन है?", "फ्लाइंग फिश", "मेंढक", "फ्रॉग", "गिरगिट", "मेंढक"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा बैक्टीरिया मिट्टी की उर्वरता को बेहतर बनाने में मदद करता है?", "क्लोस्ट्रीडियम", "राइजोबियम", "साल्मोनेला", "स्टेफिलोकोकस", "राइजोबियम"));
        arrayList.add(new ContentQuestionModel("मानव हृदय के कौन से कक्ष ने महाधमनी में रक्त को पूरी तरह से ऑक्सीजन पहुंचाया है और इसलिए शरीर को?", "राइट ऑरिकल", "लेफ्ट ऑरिकल", "राइट वेंट्रिकल", "लेफ्ट वेंट्रिकल", "लेफ्ट वेंट्रिकल"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा एक विटामिन है?", "साइट्रिक एसिड", "ग्लूटामिक एसिड", "फोलिक एसिड", "लिनोलिक एसिड", "फोलिक एसिड"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा दूध दही में परिवर्तित करने के लिए जिम्मेदार है?", "बैक्टीरिया", "फंगी", "वायरस", "इनमें से कोई नहीं", "बैक्टीरिया"));
        arrayList.add(new ContentQuestionModel("जिसमें से एक में जानवरों की त्वचा एक श्वसन अंग है?", "कॉकरोच", "मेंढक", "शार्क", "व्हेल", "मेंढक"));
        arrayList.add(new ContentQuestionModel("एक सामान्य मानव रिबकाज में कितनी पसलियाँ होती हैं?", "12", "14", "16", "24", "24"));
        arrayList.add(new ContentQuestionModel("एक सामान्य व्यक्ति के रक्त का पीएच स्तर क्या है?", "4.0 - 4.5", "6.45 - 65.5", "7.35 - 7.45", "8.25 ​​- 8.35", "7.35 - 7.45"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा रोग वायरस के कारण नहीं है?", "हैजा", "चिकनपॉक्स", "हेपेटाइटिस", "खसरा", "हैजा"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس کے لئے صحیح پھل نہیں ہے؟" , "ایپل", "تاریخ" , "آلوبخارہ" , "بیر","آلوبخارہ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کم سے کم متعدی ہے؟" , "جذام" ,"آشوب چشم" , "تپ دق" , "ہیپاٹائٹس","جذام"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون مچھر سے پیدا ہونے والا مرض نہیں ہے؟" , "ڈینگی بخار" , "نیند کی بیماری" , "فلاریائیسس" , "ملیریا","نیند کی بیماری"));
        arrayList.add(new ContentQuestionModel("بعض امینو ایسڈ میں ، کاربن ، ہائیڈروجن ، نائٹروجن اور آکسیجن کے علاوہ مندرجہ ذیل میں سے کون سا عنصر پایا جاتا ہے؟" , "فاسفورس" , "زنک" , "گندھک" , "سلفر","گندھک"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل عناصر میں سے ، اعصابی فائبر میں تسلسل کی ترسیل کے لئے کون سا ضروری ہے؟" , "کیلشیم" ,"زنک" , "سوڈیم" , "آئرن","کیلشیم"));
        arrayList.add(new ContentQuestionModel("وہ وٹامن جو کھانا پکانے کے ساتھ ساتھ ذخیرہ کرنے کے ساتھ ساتھ بہت آسانی سے ختم ہوجاتا ہے" , "وٹامن اے" , "وٹامن بی 6" , "وٹامن سی" , "وٹامن کے" ,"وٹامن سی"));
        arrayList.add(new ContentQuestionModel("اینٹی ملیرائی دوائی میں جو مرکب استعمال ہوتا ہے وہ ہے" , "ایسپرین" , "نیوپرین" , "آئوپرین" , "کلوروکین","کلوروکین"));
        arrayList.add(new ContentQuestionModel("جلد میں سے بیماری میں سے کون سا بیماری ہے؟" , "انیمیا" , "پیلاگرا" , "اوسٹیوالاکیا" , "ریکٹس","پیلاگرا"));
        arrayList.add(new ContentQuestionModel("وٹامن ڈی کا سب سے امیر ذریعہ" , "میثاق جمہوریت کا تیل" , "پالک" , "دودھ" , "پنیر"  ,"میثاق جمہوریت کا تیل")); //9
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون کون سے ٹیسٹ کینسر کی تشخیص میں مدد کرتا ہے؟" , "ایکس رے" , "پیشاب کی جانچ" , "بلڈ ٹیسٹ" , "بایپسی ٹیسٹ","بایپسی ٹیسٹ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ایک انزیم ہے؟ "," گلوکاگون "," انسولین "," سوماتوٹروپن ","ٹرپسن","ٹرپسن"));
        arrayList.add(new ContentQuestionModel("جسم کو سورج کی روشنی سے کون سا وٹامن فراہم کیا جاتا ہے؟" , "وٹامن اے" , "وٹامن بی" , "وٹامن سی" , "وٹامن ڈی","وٹامن ڈی"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسی کی کمی کی وجہ سے دانتوں کا خطرہ ہوتا ہے؟" , "آئرن" , "کاپر" , "فلورین" , "زنک","فلورین"));
        arrayList.add(new ContentQuestionModel("زخموں کی افادیت جلدی ہوتی ہے وٹامن" , "A" , "E" , "C" , "K","C"));
        arrayList.add(new ContentQuestionModel("پاگل کتے کے کاٹنے سے مندرجہ ذیل میں سے کون سی بیماری لاحق ہے؟ "," ہائیڈرویلیسیل ","ہائیڈروفوبیا"," ہائیڈرو رسٹیٹس "," ہائیڈرو پیریٹونیم ","ہائیڈروفوبیا"));//15
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا سبزی پروٹین جانوروں کے پروٹین کی طرح اچھا سمجھا جاتا ہے؟" ,"" ,"سویابین پروٹین" , "بنگال چنا پروٹین", "گندم پروٹین" , "بنگال چنا پروٹین"));
        arrayList.add(new ContentQuestionModel("ہندوستانی گائے کے دودھ میں کیروٹین" , "کریمیش سفید رنگ" , "پیلا رنگ" , "گہرا پیلا رنگ" , "کوئی تبدیلی نہیں","پیلا رنگ"));
        arrayList.add(new ContentQuestionModel("ایک ایسی عورت جس کا وزن 45 کلو ہے اور جس کے کام میں جسمانی مشقت کی بہت ضرورت ہے", "روزانہ 2800 کیلوری" , "3000 کیلوری فی دن" , "25000 کیلوری فی دن" , "3700 کیلوری فی دن","3000 کیلوری فی دن"));
        arrayList.add(new ContentQuestionModel( "پیر اور منہ کی بیماری" , "بلیوں اور کتوں" , "انسان" , "مویشی" , "مرغی","مویشی"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ایک پریمیٹ ہے؟" , "بیئر" ,"پینگولن" ,"اوٹر" , "لوریس" , "پینگولن")); //20
        arrayList.add(new ContentQuestionModel("مشروم کی مندرجہ ذیل اقسام میں سے کس سے تعلق ہے؟" , "پینگولن" , "فرنز" , "فنگی" , "لائچینز","فنگی"));
        arrayList.add(new ContentQuestionModel("اخبار میں لپیٹے ہوئے کھانے میں" , "لیڈ" , "ایلومینیم" , "آئرن" , "میگنیشیم","لیڈ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا بیج تیار کرتا ہے لیکن پھول نہیں؟" , "کاجو" , "کافی" , "زمینی نٹ" , "پائن","زمینی نٹ"));
        arrayList.add(new ContentQuestionModel("ہندوستان میں سبزے کی کھاد کے لئے مندرجہ ذیل میں سے کون سا پالنٹ استعمال ہوتا ہے؟" , "گندم" , "سنہیم" , "کاٹن" , "چاول","چاول"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا مرض لاعلاج ہے؟" , "لیوکیمیا" , "رنگین اندھا پن" , "بدنیتی" , "ہیپاٹائٹس","رنگین اندھا پن"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا عنصر تمام پروٹین میں موجود ہے؟ 1. کاربن 2. ہائیڈروجن 3. آکسیجن 4. نائٹروجن" , "2 اور 3" , "1،2 اور 4" , "1،3 اور 4" , "1,2,3 and 4","1,2,3 and 4"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل بیماریوں میں سے ایک کے لئے ابھی تک کوئی ویکسین دستیاب نہیں ہے؟"," " ,"تیتانس" , "ملیریا" , "ممپس" , "ممپس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا وٹامن جسم میں ارادہ بیکٹیریا کے ذریعہ ترکیب کیا جاتا ہے؟" , "وٹامن بی 1" , "وٹامن بی 4" , "وٹامن ڈی" , "وٹامنز","وٹامنز"));//28
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا وٹامن جسم میں ارادہ بیکٹیریا کے ذریعہ ترکیب کیا جاتا ہے؟" , "وٹامن بی 1" , "وٹامن بی 4" , "وٹامن ڈی" , "وٹامنز","وٹامنز"));//29
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس میں اینٹی باڈی کی تشکیل ہوتی ہے؟"  , "آر بی سی کی" , "بلڈ پلیٹلیٹس" , "بلڈ پلازما" , "ڈاننز جھلی","بلڈ پلازما"));
        arrayList.add(new ContentQuestionModel("ارتقائی نقطہ نظر سے ، مندرجہ ذیل میں سے کون سا انسان کے قریب تر ہے؟" , "ڈولفن", "شارک" , "اڑتی ہوئی مچھلی" , "کچھوا","ڈولفن"));//31
        arrayList.add(new ContentQuestionModel("زیادہ تر کیڑے کیسے دم کرتے ہیں؟" , "جلد کے ذریعے" , "گلیوں کے ذریعے" , "پھیپھڑوں کے ذریعہ" , "ٹریچیا نظام کے ذریعہ","پھیپھڑوں کے ذریعہ"));//32
        arrayList.add(new ContentQuestionModel("زیادہ تر کیڑے کیسے دم کرتے ہیں؟" , "جلد کے ذریعے" , "گلیوں کے ذریعے" , "پھیپھڑوں کے ذریعہ" , "ٹریچیا نظام کے ذریعہ","ٹریچیا نظام کے ذریعہ"));//33
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسی کی پیداوار جگر کا ایک فنکشن ہے؟" , "لیپیس" , "یوریا" , "بلغم" , "ہائیڈروکلورک ایسڈ","یوریا"));//34
        arrayList.add(new ContentQuestionModel("نیند کے دوران انسان کا بلڈ پریشر" , "بڑھتا ہے" , "کم ہوتا ہے" , "مستقل رہتا ہے" , "اتار چڑھاؤ","اتار چڑھاؤ"));//35
        arrayList.add(new ContentQuestionModel("اونکوجن" , "ایڈز" , "ٹائیفائیڈ" , "ملیریا" , "کینسر","کینسر"));
        arrayList.add(new ContentQuestionModel("جب دودھ کھٹا ہوجاتا ہے تو کون سا تیزاب پیدا ہوتا ہے؟" , "لیکٹک ایسڈ" , "لییکٹک ایسڈ" , "ٹارٹرک ایسڈ" , "بٹیرک ایسڈ" ,"لیکٹک ایسڈ"));//37
        arrayList.add(new ContentQuestionModel("خوردنی پروٹین کے دو امیر ترین کاؤن ذرائع", "گوشت اور انڈے" , "دودھ اور سبزیاں" , "سویا بین اور مونگ پھلی" , "کچھ طحالب اور دیگر مائکرو حیاتیات"  ,"سویا بین اور مونگ پھلی"));
        arrayList.add(new ContentQuestionModel("فوڈ پروسیسنگ اور ذخیرہ کرنے سے کون سے غذائی اجزاء سب سے زیادہ متاثر ہوتے ہیں؟" , "کاربوہائیڈریٹ" , "چربی" , "پروٹین" , "وٹامن","وٹامن"));
        arrayList.add(new ContentQuestionModel("گھڑے کے پودوں میں سے مندرجہ ذیل میں سے کون سا ایک حص aہ گھڑے میں تبدیل ہوجاتا ہے؟" , "پتی" , "پیٹیول" , "اسٹڈیپول" , "اسٹیم","پتی"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے ایک جانور میں جلد کے ذریعہ سانس لیا جاتا ہے؟" , "اڑتی ہوئی مچھلی" , "سمندری گھوڑا" , "مینڈک" , "گرگٹ","مینڈک"));//41
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے ایک جانور میں جلد کے ذریعہ سانس لیا جاتا ہے؟" , "اڑتی ہوئی مچھلی" , "سمندری گھوڑا" , "مینڈک" , "گرگٹ","مینڈک"));//42
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے ایک جانور میں جلد کے ذریعہ سانس لیا جاتا ہے؟" , "اڑتی ہوئی مچھلی" , "سمندری گھوڑا" , "میڑک" , "گرگٹ","میڑک"));//43
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ایک وٹامن ہے؟" , "سائٹرک ایسڈ" , "گلوٹامک ایسڈ" , "Bacteria" , "لینولک ایسڈ","Bacteria"));//44
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ایک وٹامن ہے؟" , "سائٹرک ایسڈ" , "گلوٹامک ایسڈ" , "فولک ایسڈ" , "لینولک ایسڈ","فولک ایسڈ"));//45
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسی جانور میں جلد ایک سانس کا عضو ہے؟" , "کاکروچ" , "مینڈک" , "شارک" , "وہیل","مینڈک"));//46
        arrayList.add(new ContentQuestionModel("ایک عام انسانی پسلی کتنی پسلیوں پر مشتمل ہے؟" , "12" , "14" , "16" , "24","24"));
        arrayList.add(new ContentQuestionModel("عام انسان کے خون کی پییچ کی سطح کیا ہے؟" , "--. - - ", " 6.45 - 65.5 ","7.35 – 7.45"," 8.25 - 8.35 ","7.35 – 7.45"));//48
        arrayList.add(new ContentQuestionModel("Choleraمندرجہ ذیل میں سے کون سی بیماری وائرس کی وجہ سے نہیں ہے؟" ,"خسرہ" ,"ہیضہ" , "چکن پوکس" , "ہیپاٹائٹس"   ,"خسرہ" ));//49

        return arrayList;


    }


}