package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Biology {

    private Context context;
    public Q_Biology(Context context) {
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

        arrayList.add(new ThreeItemModel("Which form of science dealing with the study of structural and cultural traits of human beings?", "Anthropology"));
        arrayList.add(new ThreeItemModel("What are the two functional groups in an ecosystem ?", "Autotrophs and heterotrophs."));
        arrayList.add(new ThreeItemModel("Where does the primary photo chemical reaction occur in chloroplast ?", "Quantasome."));
        arrayList.add(new ThreeItemModel("What is exobiology?", "It is the study of life in outer space."));
        arrayList.add(new ThreeItemModel("What is the magnification of an electron microscope?", "100000"));
        arrayList.add(new ThreeItemModel("Which is the monocarpic plant which shows gregarious flowering once in 48 years?", "Bamboo"));
        arrayList.add(new ThreeItemModel("How does the living and non-living resemble up to the level organization ?", "Molecules and compounds."));
        arrayList.add(new ThreeItemModel("What number of chemicals are present in a cell ?", "About 5000."));
        arrayList.add(new ThreeItemModel("Write an example of homeostasis. ?", "Increased heart beat on running and sweating during exercise."));
        arrayList.add(new ThreeItemModel("Which is called blue-print of information?", "DNA"));
        arrayList.add(new ThreeItemModel("Which cells are programmed to die during embryonic stage ?", "Vessel elements."));
        arrayList.add(new ThreeItemModel("Why virus cannot be cultured in totally artificial medium ?", "Because it lacks machinery to use genetic information."));
        arrayList.add(new ThreeItemModel("What are seedless plants called ?", "Cryptogams."));
        arrayList.add(new ThreeItemModel("What is Dendrology ?", "The study of trees called Dendrology"));
        arrayList.add(new ThreeItemModel("Energy is converted from sunlight and released by what ?", "Respiration"));

        arrayList.add(new ThreeItemModel("Write an example of serendipity. ?", "Discovery of penicillin by Fleming."));
        arrayList.add(new ThreeItemModel("What do you mean by Hydroponics ?", "Plant growth in liquid culture medium."));
        arrayList.add(new ThreeItemModel("What is the technique of separation of disrupted cell components?", "Fractionation"));
        arrayList.add(new ThreeItemModel("What is EM?", "Electron microscope."));
        arrayList.add(new ThreeItemModel("Name two monocarpic plants which show gregarious flowering?", "Bambusa tulda, Melocanna bambusoides."));
        arrayList.add(new ThreeItemModel("Under what system, organisms are provided with scientific means ?", "Binomial nomenclature."));
        arrayList.add(new ThreeItemModel("What is the name of that branch of Biology which devoted to identifying, naming and classifying organisms?", "Taxonomy"));
        arrayList.add(new ThreeItemModel("Who was the author of ‘Man’s place in nature’?", "Huxley"));
        arrayList.add(new ThreeItemModel("Both living and the non-living are made of same elements and are governed by the similar physical laws. In which respect are they different?", "Level organization."));
        arrayList.add(new ThreeItemModel("Expand the TMV. ?", "Tobacco Mosaic Virus."));
        arrayList.add(new ThreeItemModel("What is DNA ?", "Deoxyribonucleic acid."));
        arrayList.add(new ThreeItemModel("What is Histology?", "Histology is the study of tissues (Microscopic anatomy)"));
        arrayList.add(new ThreeItemModel("Which is the free living soil bacteria in fixes nitrogen?", "Azotobacter"));
        arrayList.add(new ThreeItemModel("What is Physiology ?", "Physiology is the study of structure and functions."));
        arrayList.add(new ThreeItemModel("What is Cell Biology?", "Cell Biology is the study of structure and reproduction of cells."));
        arrayList.add(new ThreeItemModel("What do you mean by Genetics ?", "Genetics is the study of heredity and variations."));
        arrayList.add(new ThreeItemModel("Write a Radio isotope ?", "131"));
        arrayList.add(new ThreeItemModel("What is ecosystem ?", "The entire living community and non-living factors of the environment together from the ecosystem."));

        arrayList.add(new ThreeItemModel("Name the process by which plants prepare their food ?", "Photosynthesis"));
        arrayList.add(new ThreeItemModel("What is Tonoplast ?", "Tonoplast is the membrane around the plant vacuoles"));
        arrayList.add(new ThreeItemModel("What is the other name of root cap?", "Calyptra"));
        arrayList.add(new ThreeItemModel("What is Anemophily?", "It is the pollination by wind"));
        arrayList.add(new ThreeItemModel("What is pollination?", "The transference of pollen grain from the another of a flower to the stigma is known as pollination"));
        arrayList.add(new ThreeItemModel("What is Clinostat ?", "Clinostat is an apparatus used to demonstrate photoperiodism."));
        arrayList.add(new ThreeItemModel("Name the process by which terrestrial plant loses water?", "Transpiration"));
        arrayList.add(new ThreeItemModel("What is the term used for the occurrence of more than one type of morphologically different leaves on the same plant?", "Heterophylly"));
        arrayList.add(new ThreeItemModel("In which country the hormone gibberellin was discovered ?", "Japan"));
        arrayList.add(new ThreeItemModel("Name the natural process involving loss of water from a plant in the form of liquid drops?", "Guttation"));
        arrayList.add(new ThreeItemModel("What is the technical name of the natural opening in the leaves meant for gaseous exchange?", "Stomata"));
        arrayList.add(new ThreeItemModel("What are Heliophytes and Sciophytes ?", "Heliophytes are plants that grow in full sunlight, Sciophytes are plants that grow in shade"));
        arrayList.add(new ThreeItemModel("Name the instrument used to demonstrate geotropism ?", "Clinostat"));
        arrayList.add(new ThreeItemModel("What are the types of flagella noticed in Algae?", "Whiplash, Tinsel"));
        arrayList.add(new ThreeItemModel("What are Atrichous bacteria ?", "Bacteria which do not have flagella are called Atrichous bacteria"));
        arrayList.add(new ThreeItemModel("What are the other names for dark reaction of photosynthesis ?", "Blackman’s reaction or Calvin cycle"));
        arrayList.add(new ThreeItemModel("What is the most common nutritive tissue for the developing embryos in angiosperm known as?", "Endosperm."));
        arrayList.add(new ThreeItemModel("What is an animal ?", "The word animal comes from Latin, meaning breath or soul. It includes mammals, birds, reptiles, fish, frogs, clams, lobsters, insects, worms, and jelly-fish"));
        arrayList.add(new ThreeItemModel("What are invertebrates ?", "They are a division of the animals which have no vertebral column"));
        arrayList.add(new ThreeItemModel("Which is the biggest cell ?", "The egg of the bird ostrich"));
        arrayList.add(new ThreeItemModel("Gave the names of three fur bearing animals ?", "The sable, a kind of antelope, mink and the arctic fox are fur bearing animals"));
        arrayList.add(new ThreeItemModel("Which living animal has the longest lifespan?", "Tortoise"));
        arrayList.add(new ThreeItemModel("What is a flying fox ?", "It is a kind of bat"));
        arrayList.add(new ThreeItemModel("Which is the largest marsupial ?", "Red kangaroo"));
        arrayList.add(new ThreeItemModel("How do mammals communicate ?", "They communicate by sounds, touch, visual clues, and odor"));
        arrayList.add(new ThreeItemModel("What is a viviparous ?", "A viviparous animal is one that gives birth to young ones"));
        arrayList.add(new ThreeItemModel("What is Murrah?", "It is a hybrid buffalo which is a high milk producer"));
        arrayList.add(new ThreeItemModel("Which is the tallest living animal ?", "Giraffe"));
        arrayList.add(new ThreeItemModel("Which is the biggest land animal?", "African bush elephant"));


        arrayList.add(new ThreeItemModel("Name the four insectivorous plants ?", "1. Drosera, 2. Dionaea, 3. Aldrovanda, 4. Utricularia"));
        arrayList.add(new ThreeItemModel("What is the color of Carotene ?", "yellow"));
        arrayList.add(new ThreeItemModel("What is the source of chemical energy during photosynthesis?", "Adenosine Triphosphate (ATP)"));
        arrayList.add(new ThreeItemModel("What is the shape of chloroplast in spirogyra?", "Ribbon shaped"));
        arrayList.add(new ThreeItemModel("Which plant has the lifespan of 4000 years?", "Gnetum"));
        arrayList.add(new ThreeItemModel("Name the organelle where photosynthesis takes place ?", "Chloroplast"));
        arrayList.add(new ThreeItemModel("What are the three kinds of plastids ?", "1. Leucoplasts, 2. Chloroplasts, 3. Chromoplasts"));
        arrayList.add(new ThreeItemModel("What is the other name for Nastic movement ?", "Sleep movement"));
        arrayList.add(new ThreeItemModel("What is cladode?", "The modification of stem to carry the function of leaf is called cladode. Example: Opuntia"));
        arrayList.add(new ThreeItemModel("What is the male reproductive part of the flower known as?", "Stamens"));



        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
         arrayList.add(new ThreeItemModel("জেনেটিক্স বলতে কী বোঝ?", "জেনেটিক্স হ'ল বংশগতি ও তারতম্যের গবেষণা।"));
        arrayList.add(new ThreeItemModel("একটি রেডিও আইসোটোপ লিখবেন?", "131"));
        arrayList.add(new ThreeItemModel("বাস্তুতন্ত্র কী?", "পরিবেশের সম্পূর্ণ জীবিত সম্প্রদায় এবং পরিবেশহীন জীবিত উপাদান একত্রিত করে"));
        arrayList.add(new ThreeItemModel("বিজ্ঞানের কোন রূপটি মানুষের কাঠামোগত এবং সাংস্কৃতিক বৈশিষ্ট্যের অধ্যয়নের সাথে কাজ করে?", "নৃতত্ত্ব"));
        arrayList.add(new ThreeItemModel("বাস্তুতন্ত্রের দুটি কার্যকরী দল কী কী?", "অটোট্রোফস এবং হিটারো ট্রফস"));
        arrayList.add(new ThreeItemModel("ক্লোরোপ্লাস্টে প্রাথমিক ফটো রাসায়নিক বিক্রিয়াটি কোথায় ঘটে?", "কোয়ান্টাসোম।"));
        arrayList.add(new ThreeItemModel("এক্সোবায়োলজি কী?", "এটি বাইরের মহাকাশের জীবনের অধ্যয়ন"));
        arrayList.add(new ThreeItemModel("একটি বৈদ্যুতিন মাইক্রোস্কোপ এর বৃদ্ধি কি?", "100000"));
        arrayList.add(new ThreeItemModel("48 বছরের মধ্যে একবারে সবুজ ফুল দেখায় এমন একরঙা গাছটি কোনটি?", "বাঁশ"));
        arrayList.add(new ThreeItemModel("জীবিত ও জীবিত কীভাবে স্তরের সংস্থার সাথে সাদৃশ্য থাকে?", "অণু এবং যৌগগুলি।"));
        arrayList.add(new ThreeItemModel("কোন কোষে কতগুলি রাসায়নিক রয়েছে?", "প্রায় 5000."));
        arrayList.add(new ThreeItemModel("হোমিওস্টেসিসের উদাহরণ লিখুন।?", "অনুশীলনের সময় দৌড়াতে এবং ঘামতে হার্ট বিট বাড়িয়ে তোলেন।"));
        arrayList.add(new ThreeItemModel("কোনটিকে তথ্যের নীল প্রিন্ট বলা হয়?", "ডিএনএ"));
        arrayList.add(new ThreeItemModel("কোন কোষটি ভ্রূণের পর্যায়ে মারা যাওয়ার জন্য প্রোগ্রাম করা হয়?", "ভ্যাসেল উপাদানগুলি।"));
        arrayList.add(new ThreeItemModel("কেন সম্পূর্ণ কৃত্রিম মাধ্যমে ভাইরাসকে সংস্কৃত করা যায় না?", "কারণ এতে জিনগত তথ্য ব্যবহারের জন্য যন্ত্রপাতি নেই"));
        arrayList.add(new ThreeItemModel("বীজবিহীন গাছগুলিকে কী বলা হয়?", "ক্রিপটোগামস।"));
        arrayList.add(new ThreeItemModel("ডেন্ড্রোলজি কী?", "ডেন্ড্রোলজি নামে পরিচিত গাছগুলির গবেষণা"));
        arrayList.add(new ThreeItemModel("শক্তি সূর্যের আলো থেকে রূপান্তরিত হয় এবং কী দ্বারা মুক্তি পায়?", "শ্বসন"));
        arrayList.add(new ThreeItemModel("উদ্ভিদগুলি তাদের খাবার প্রস্তুত করার প্রক্রিয়াটির নাম দিন?", "আলোকসংশ্লিষ্ট"));
        arrayList.add(new ThreeItemModel("টোনোপ্লাস্ট কি?", "টোনোপ্লাস্ট হ'ল উদ্ভিদের শূন্যস্থানগুলির চারপাশের ঝিল্লি"));

        arrayList.add(new ThreeItemModel("সেরেন্ডিপিটির উদাহরণ লিখুন।?", "ফ্লেমিংয়ের মাধ্যমে পেনিসিলিন আবিষ্কার।"));
        arrayList.add(new ThreeItemModel("হাইড্রোপোনিক্স বলতে কী বোঝ?", "তরল সংস্কৃতি মাধ্যমের উদ্ভিদ বৃদ্ধি।"));
        arrayList.add(new ThreeItemModel("ব্যাহত ঘরের উপাদানগুলি পৃথক করার কৌশল কী?", "ভগ্নাংশ"));
        arrayList.add(new ThreeItemModel("ইএম কী?", "বৈদ্যুতিন মাইক্রোস্কোপ।"));
        arrayList.add(new ThreeItemModel("দুটি মনোকর্পিক গাছের নাম দিন যা সবুজ রঙের ফুল দেখায়?", "বাম্বুসা তুলদা, মেলোকান্না বামবুসাইডস।"));
        arrayList.add(new ThreeItemModel("কোন সিস্টেমের অধীনে জীবকে বৈজ্ঞানিক উপায়ে সরবরাহ করা হয়?", "দ্বিপদী নামকরণ।"));
        arrayList.add(new ThreeItemModel("জীববিজ্ঞানের সেই শাখার নাম যা জীব সনাক্তকরণ, নামকরণ এবং শ্রেণিবদ্ধকরণের জন্য উত্সর্গ করেছিল?", "শ্রমশক্তি"));
        arrayList.add(new ThreeItemModel("‘ প্রকৃতির মানুষের স্থান ’রচয়িতা কে ছিলেন?", "হাক্সলি"));
        arrayList.add(new ThreeItemModel("জীবিত ও জীবিত উভয়ই একই উপাদান দিয়ে তৈরি এবং একই শারীরিক আইন দ্বারা পরিচালিত হয় which তারা কোন সম্মানের সাথে আলাদা?", "স্তর সংগঠন।"));
        arrayList.add(new ThreeItemModel("টিএমভি প্রসারণ করুন??", "তামাক মোজাইক ভাইরাস।"));
        arrayList.add(new ThreeItemModel("ডিএনএ কী?", "ডিওক্সাইরিবোনুক্লিক অ্যাসিড"));
        arrayList.add(new ThreeItemModel("হিস্টোলজি কী?", "হিস্টোলজি হ'ল টিস্যুগুলির অধ্যয়ন (মাইক্রোস্কোপিক অ্যানাটমি)"));
        arrayList.add(new ThreeItemModel("স্থির নাইট্রোজেনের মুক্ত জীবন্ত মাটির ব্যাকটিরিয়া কোনটি?", "অ্যাজোটোব্যাক্টর"));
        arrayList.add(new ThreeItemModel("ফিজিওলজি কী?", "ফিজিওলজি হ'ল কাঠামো এবং কার্যাদি অধ্যয়ন।"));
        arrayList.add(new ThreeItemModel("সেল জীববিজ্ঞান কী?", "সেল জীববিজ্ঞান হ'ল কোষের গঠন এবং প্রজননের অধ্যয়ন"));

        arrayList.add(new ThreeItemModel("রুট ক্যাপের অন্য নাম কী?", "ক্যালিপেট্রা"));
        arrayList.add(new ThreeItemModel("অ্যানিমোফিলি কী?", "এটি বাতাসের মাধ্যমে পরাগায়ন হয়"));
        arrayList.add(new ThreeItemModel("পরাগায়ন কী?", "ফুলের অন্য একটি থেকে কলঙ্কে পরাগ শস্যের স্থানান্তরকে পরাগায়ন হিসাবে পরিচিত"));
        arrayList.add(new ThreeItemModel("ক্লিনোস্ট্যাট কী?", "ক্লিনোস্ট্যাট এমন একটি সরঞ্জাম যা ফটোপ্রিওরিডিজম প্রদর্শনের জন্য ব্যবহৃত হয়।"));
        arrayList.add(new ThreeItemModel("পার্থিব উদ্ভিদ জল হারাতে পারে এমন প্রক্রিয়াটির নাম দাও?", "রক্তপাত"));
        arrayList.add(new ThreeItemModel("একই উদ্ভিদে একাধিক প্রকারের মরফোলজিকালি বিভিন্ন পাতাগুলির সংঘটিত হওয়ার জন্য কী শব্দটি ব্যবহৃত হয়?", "হিটারোফিল্লি"));
        arrayList.add(new ThreeItemModel("গিব্বেরেলিন নামক হরমোনটি কোন দেশে আবিষ্কৃত হয়েছিল?", "জাপান"));
        arrayList.add(new ThreeItemModel("তরল ফোটা আকারে কোনও উদ্ভিদ থেকে জলের ক্ষতি জড়িত প্রাকৃতিক প্রক্রিয়াটির নাম দিন?", "গেটেশন"));
        arrayList.add(new ThreeItemModel("শৈবালে ফ্ল্যাজেলার ধরণের কী কী লক্ষ্য করা যায়?", "হুইপল্যাশ, টিনসেল"));
        arrayList.add(new ThreeItemModel("অ্যাট্রিচাস ব্যাকটিরিয়া কি?", "যে জীবাণুতে ফ্ল্যাজেলা থাকে না তাকে এট্রিচাস ব্যাকটিরিয়া বলা হয়"));
        arrayList.add(new ThreeItemModel("সালোকসংশ্লেষের অন্ধকার বিক্রিয়াটির অন্যান্য নাম কী?", "ব্ল্যাকম্যানের প্রতিক্রিয়া বা ক্যালভিন চক্র"));
        arrayList.add(new ThreeItemModel("অ্যাঞ্জিওস্পার্মে বিকাশিত ভ্রূণের সবচেয়ে সাধারণ পুষ্টিকর টিস্যু কোনটি?", "এন্ডোস্পার্ম"));
        arrayList.add(new ThreeItemModel("একটি প্রাণী কী?", "প্রাণী শব্দটি লাতিন থেকে এসেছে যার অর্থ দম বা আত্মা।"));
        arrayList.add(new ThreeItemModel("ইনভার্টেব্রেটস কী?", "এগুলি এমন প্রাণীর একটি বিভাগ যাগুলির কোনও ভার্ভেট্রাল কলাম নেই"));
        arrayList.add(new ThreeItemModel("বৃহত্তম কোষটি কোনটি?", "পাখির উটপাখির ডিম"));
        arrayList.add(new ThreeItemModel("তিনটি পশম বহনকারী প্রাণীর নাম দিয়েছেন?", "সাবল, এক ধরণের হরিণ, মিংক এবং আর্কটিক শিয়াল পশম বহনকারী প্রাণী"));
        arrayList.add(new ThreeItemModel("কোন জীবন্ত প্রাণীটির দীর্ঘতম আয়ু রয়েছে?", "কচ্ছপ"));
        arrayList.add(new ThreeItemModel("উড়ন্ত শিয়াল কী?", "এটি এক ধরণের ব্যাট"));
        arrayList.add(new ThreeItemModel("বৃহত্তম মার্সুপিয়াল কোনটি?", "রেড ক্যাঙ্গারু"));
        arrayList.add(new ThreeItemModel("স্তন্যপায়ী প্রাণীরা কীভাবে যোগাযোগ করে?", "তারা শব্দ, স্পর্শ, ভিজ্যুয়াল ক্লু এবং গন্ধের মাধ্যমে যোগাযোগ করে"));
        arrayList.add(new ThreeItemModel("একটি প্রাণবন্ত প্রাণী কী?", "একটি জীবন্ত প্রাণী হ'ল বাচ্চাদের জন্ম দেয়"));
        arrayList.add(new ThreeItemModel("মুররাহ কী?", "এটি একটি হাইব্রিড মহিষ যা উচ্চ দুধ উত্পাদনকারী"));
        arrayList.add(new ThreeItemModel("সবচেয়ে দীর্ঘ জীবন্ত প্রাণী কোনটি?", "জিরাফ"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ভূমির প্রাণী কোনটি?", "আফ্রিকান গুল্ম হাতি"));


        arrayList.add(new ThreeItemModel("বায়বীয় বিনিময়টির জন্য পাতাগুলিতে প্রাকৃতিক খোলার প্রযুক্তিগত নাম কী?", "স্টোমাটা"));
        arrayList.add(new ThreeItemModel("হেলিওফাইটস এবং সায়োফাইট কি?", "হেলিওফাইটগুলি এমন উদ্ভিদ যা পূর্ণ সূর্যের আলোতে জন্মায়, সায়োফাইটগুলি এমন গাছপালা যা ছায়ায় জন্মে"));
        arrayList.add(new ThreeItemModel("চারটি কীট সংক্রামক গাছের নাম রাখ?", "১. দ্রোসেরা, ২. ডায়োনিয়া, ৩.আল্ড্রোভান্ডা, ৪. ইউট্রিকুলারিয়া"));
        arrayList.add(new ThreeItemModel("ক্যারোটিনের রঙ কী?", "হলুদ"));
        arrayList.add(new ThreeItemModel("সালোকসংশ্লেষণের সময় রাসায়নিক শক্তির উত্স কী?", "অ্যাডেনোসিন ট্রাইফোসফেট (এটিপি)"));
        arrayList.add(new ThreeItemModel("স্পিরোগিরায় ক্লোরোপ্লাস্টের আকৃতি কী?", "ফিতা আকৃতির"));
        arrayList.add(new ThreeItemModel("কোন উদ্ভিদের 4000 বছরের আয়ু রয়েছে?", "জেনেটাম"));
        arrayList.add(new ThreeItemModel("অর্গানেলের নাম রাখুন যেখানে সালোকসংশ্লেষণ ঘটে?", "ক্লোরোপ্লাস্ট"));
        arrayList.add(new ThreeItemModel("তিন ধরণের প্লাস্টিড কী?", "১. লিউকোপ্লাস্ট, ২. ক্লোরোপ্লাস্ট, ৩. ক্রোমোপ্লাস্ট"));
        arrayList.add(new ThreeItemModel("নীস্টিক আন্দোলনের অন্য নাম কী?", "ঘুম চলাচল"));
        arrayList.add(new ThreeItemModel("ক্লাডোড কি?", "পাতার কার্য সম্পাদন করতে স্টেমের পরিবর্তনকে ক্ল্যাডোড বলা হয়। উদাহরণ: অপুনিয়া"));
        arrayList.add(new ThreeItemModel("ফুলের পুরুষ প্রজনন অংশটি কী নামে পরিচিত?", "স্টামেনস"));
        arrayList.add(new ThreeItemModel("জিওট্রোপিজম প্রদর্শনের জন্য ব্যবহৃত যন্ত্রটির নাম দিন?", "ক্লিনোস্ট্যাট"));



        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("सीरमिपिटिटी का एक उदाहरण लिखें?", "फ्लेमिंग द्वारा पेनिसिलिन की खोज।"));
        arrayList.add(new ThreeItemModel("हाइड्रोपोनिक्स द्वारा आपका क्या मतलब है?", "तरल संस्कृति माध्यम में पौधे की वृद्धि।"));
        arrayList.add(new ThreeItemModel("विघटित कोशिका घटकों के पृथक्करण की तकनीक क्या है?", "भिन्नता"));
        arrayList.add(new ThreeItemModel("ईएम क्या है?", "इलेक्ट्रॉन माइक्रोस्कोप।"));
        arrayList.add(new ThreeItemModel("दो मोनोकार्पिक पौधों का नाम बताइए, जो फूलों के फूलों को दिखाते हैं?", "बंबूसा टुल्डा, मेलोकन्ना बम्बूसोइड्स।"));
        arrayList.add(new ThreeItemModel("किस प्रणाली के तहत, जीवों को वैज्ञानिक साधनों के साथ प्रदान किया जाता है?", "द्विपद नामकरण।"));
        arrayList.add(new ThreeItemModel("जीव विज्ञान की उस शाखा का नाम क्या है जो जीवों की पहचान, नामकरण और वर्गीकरण के लिए समर्पित है?", "स्वायत्तता"));
        arrayList.add(new ThreeItemModel("हक्सले", "प्रकृति में मनुष्य के स्थान का लेखक कौन था?"));
        arrayList.add(new ThreeItemModel("जीवित और निर्जीव दोनों समान तत्वों से बने होते हैं और समान भौतिक नियमों द्वारा शासित होते हैं। किस सम्मान में वे भिन्न होते हैं?", "स्तरीय संगठन।"));
        arrayList.add(new ThreeItemModel("टीएमवी का विस्तार करें?", "तंबाकू मोज़ेक वायरस।"));
        arrayList.add(new ThreeItemModel("डीएनए क्या है?", "डीऑक्सीराइबोन्यूक्लिक एसिड।"));
        arrayList.add(new ThreeItemModel("हिस्टोलॉजी क्या है?", "ऊतक विज्ञान ऊतकों (सूक्ष्म शरीर रचना) का अध्ययन है"));
        arrayList.add(new ThreeItemModel("नाइट्रोजन को ठीक करने में मुक्त जीवित मिट्टी के जीवाणु कौन सा है?", "एज़ोटोबैक्टर"));
        arrayList.add(new ThreeItemModel("फिजियोलॉजी क्या है?", "फिजियोलॉजी संरचना और कार्यों का अध्ययन है।"));
        arrayList.add(new ThreeItemModel("सेल बायोलॉजी क्या है?", "सेल बायोलॉजी कोशिकाओं की संरचना और प्रजनन का अध्ययन है।"));
        arrayList.add(new ThreeItemModel("जेनेटिक्स से आपका क्या मतलब है?", "जेनेटिक्स आनुवंशिकता और विविधताओं का अध्ययन है।"));
        arrayList.add(new ThreeItemModel("एक रेडियो आइसोटोप लिखें?", "131"));
        arrayList.add(new ThreeItemModel("पारिस्थितिक तंत्र क्या है?", "संपूर्ण जीवित समुदाय और पर्यावरण के गैर-जीवित कारक एक साथ पारिस्थितिकी तंत्र से।"));
        arrayList.add(new ThreeItemModel("मानव के संरचनात्मक और सांस्कृतिक लक्षणों के अध्ययन से निपटने के लिए विज्ञान का कौन सा रूप है?", "नृविज्ञान"));
        arrayList.add(new ThreeItemModel("एक पारिस्थितिकी तंत्र में दो कार्यात्मक समूह क्या हैं?", "ऑटोट्रॉफ़्स और हेटरोट्रोफ़्स।"));
        arrayList.add(new ThreeItemModel("प्राथमिक फोटो रासायनिक प्रतिक्रिया क्लोरोप्लास्ट में कहां होती है?", "क्वांटासोम।"));
        arrayList.add(new ThreeItemModel("एक्सोबोलॉजी क्या है?", "यह बाह्य अंतरिक्ष में जीवन का अध्ययन है।"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रॉन माइक्रोस्कोप का आवर्धन क्या है?", "100000"));
        arrayList.add(new ThreeItemModel("कौन सा मोनोकार्पिक पौधा है जो 48 वर्षों में एक बार शानदार फूल दिखाता है?", "बांस"));
        arrayList.add(new ThreeItemModel("जीवित और निर्जीव किस स्तर के संगठन से मेल खाते हैं?", "अणु और यौगिक।"));
        arrayList.add(new ThreeItemModel("सेल में कितने रसायन मौजूद हैं?", "लगभग 5000।"));
        arrayList.add(new ThreeItemModel("होमोस्टैसिस का एक उदाहरण लिखिए?", "व्यायाम के दौरान दौड़ने और पसीना आने पर दिल की धड़कन बढ़ जाती है।"));
        arrayList.add(new ThreeItemModel("जिसे सूचना का ब्लू-प्रिंट कहा जाता है?", "DNA"));
        arrayList.add(new ThreeItemModel("कौन से कोशिकाओं को भ्रूण के चरण के दौरान मरने के लिए प्रोग्राम किया जाता है?", "वेसल तत्व।"));
        arrayList.add(new ThreeItemModel("क्यों वायरस को पूरी तरह से कृत्रिम माध्यम में संवर्धित नहीं किया जा सकता है?", "क्योंकि इसमें आनुवंशिक जानकारी का उपयोग करने के लिए मशीनरी का अभाव है।"));
        arrayList.add(new ThreeItemModel("बीज रहित पौधे किसे कहते हैं?", "क्रिप्टोगैम।"));
        arrayList.add(new ThreeItemModel("डेंड्रोलॉजी क्या है?", "डेंड्रोलॉजी नामक पेड़ों का अध्ययन"));
        arrayList.add(new ThreeItemModel("ऊर्जा को सूर्य के प्रकाश से परिवर्तित किया जाता है और किसके द्वारा छोड़ा जाता है?", "श्वसन"));
        arrayList.add(new ThreeItemModel("उस प्रक्रिया का नाम बताइए जिसके द्वारा पौधे अपना भोजन तैयार करते हैं?", "प्रकाश संश्लेषण"));
        arrayList.add(new ThreeItemModel("टोनोप्लास्ट क्या है?", "टोनोप्लास्ट पौधे के चारों ओर झिल्ली है"));
        arrayList.add(new ThreeItemModel("रूट कैप का दूसरा नाम क्या है?", "कैलेप्ट्रा"));
        arrayList.add(new ThreeItemModel("एनीमोफिली क्या है?", "यह हवा से परागण है"));
        arrayList.add(new ThreeItemModel("परागण क्या है?", "एक फूल से दूसरे कलंक में पराग कण के संक्रमण को परागण के रूप में जाना जाता है"));
        arrayList.add(new ThreeItemModel("क्लिनोस्टैट क्या है?", "क्लिनोस्टैट एक उपकरण है जिसका उपयोग फोटोऑपरोडिज़्म को प्रदर्शित करने के लिए किया जाता है।"));
        arrayList.add(new ThreeItemModel("उस प्रक्रिया का नाम बताइए जिसके द्वारा स्थलीय पौधा पानी खो देता है?", "वाष्पोत्सर्जन"));
        arrayList.add(new ThreeItemModel("एक ही पौधे पर एक से अधिक प्रकार के रूपात्मक रूप से अलग-अलग पत्तियों की घटना के लिए किस शब्द का उपयोग किया जाता है?", "हेटरोफाइलली"));
        arrayList.add(new ThreeItemModel("किस देश में हार्मोन जिबरेलिन की खोज की गई थी?", "जापान"));
        arrayList.add(new ThreeItemModel("तरल बूंदों के रूप में एक पौधे से पानी के नुकसान से जुड़ी प्राकृतिक प्रक्रिया का नाम बताएं?", "गुटेशन"));
        arrayList.add(new ThreeItemModel("गैसीय विनिमय के लिए पत्तियों में प्राकृतिक उद्घाटन का तकनीकी नाम क्या है?", "स्टोमेटा"));
        arrayList.add(new ThreeItemModel("हेलियोफाइट्स और साइज़ोफाइट्स क्या हैं?", "हेलियोफाइट्स पौधे हैं जो पूर्ण सूर्य के प्रकाश में उगते हैं, साइज़ोफाइट्स ऐसे पौधे हैं जो छाया में बढ़ते हैं"));
        arrayList.add(new ThreeItemModel("चार कीटभक्षी पौधों का नाम बताइए?", "1. ड्रोसेरा, 2. डायनाया, 3. एल्ड्रोवांडा, 4. यूट्रीकुलरिया"));
        arrayList.add(new ThreeItemModel("कैरोटीन का रंग क्या है?", "पीला"));
        arrayList.add(new ThreeItemModel("प्रकाश संश्लेषण के दौरान रासायनिक ऊर्जा का स्रोत क्या है?", "एडेनोसिन ट्राइफॉस्फेट (एटीपी)"));
        arrayList.add(new ThreeItemModel("स्पिरोग्रा में क्लोरोप्लास्ट का आकार क्या है?", "रिबन के आकार का"));
        arrayList.add(new ThreeItemModel("किस पौधे का जीवनकाल 4000 साल का है?", "गंटम"));
        arrayList.add(new ThreeItemModel("ऑर्गेनेल का नाम जहां प्रकाश संश्लेषण होता है?", "क्लोरोप्लास्ट"));
        arrayList.add(new ThreeItemModel("प्लास्टिड के तीन प्रकार क्या हैं?", "1. ल्यूकोप्लास्ट, 2. क्लोरोप्लास्ट, 3. क्रोमोप्लास्ट"));
        arrayList.add(new ThreeItemModel("नैशनल मूवमेंट का दूसरा नाम क्या है?", "स्लीप मूवमेंट"));
        arrayList.add(new ThreeItemModel("क्लैडोड क्या है?", "पत्ती के कार्य को करने के लिए तने के संशोधन को क्लैडोड कहा जाता है। उदाहरण: स्वैच्छिक।"));
        arrayList.add(new ThreeItemModel("फूल के नर प्रजनन अंग को क्या कहा जाता है?", "स्टैमेंस"));
        arrayList.add(new ThreeItemModel("जियोट्रोपिज्म को प्रदर्शित करने के लिए प्रयुक्त उपकरण का नाम?", "क्लिनोस्टैट"));
        arrayList.add(new ThreeItemModel("शैवाल में फ्लैगेल्ला के प्रकार क्या हैं?", "व्हिपलैश, टिनसेल"));
        arrayList.add(new ThreeItemModel("एट्रिचस बैक्टीरिया क्या होते हैं?", "जिन बैक्टीरिया में फ्लैगेल्ला नहीं होता उन्हें एट्रिचस बैक्टीरिया कहा जाता है"));
        arrayList.add(new ThreeItemModel("प्रकाश संश्लेषण की अंधेरे प्रतिक्रिया के लिए अन्य नाम क्या हैं?", "ब्लैकमैन की प्रतिक्रिया या केल्विन चक्र"));
        arrayList.add(new ThreeItemModel("एंजियोस्पर्म में विकासशील भ्रूण के लिए सबसे आम पोषक ऊतक क्या है?", "एंडोस्पर्म।"));
        arrayList.add(new ThreeItemModel("जानवर क्या है?", "जानवर शब्द लैटिन से आया है, जिसका अर्थ है सांस या आत्मा। इसमें स्तनधारी, पक्षी, सरीसृप, मछली, मेंढक, भेड़, कीड़े, कीड़े और जेली-मछली शामिल हैं"));
        arrayList.add(new ThreeItemModel("अकशेरूकीय क्या हैं?", "वे उन जानवरों का एक विभाजन हैं जिनके पास कोई कशेरुक स्तंभ नहीं है"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी कोशिका कौन सी है?", "पक्षी शुतुरमुर्ग का अंडा"));
        arrayList.add(new ThreeItemModel("तीन फर वाले जानवरों के नाम बताए?", "सेबल, एक प्रकार का मृग, मिंक और आर्कटिक लोमड़ी हैं, जो फर वाले जानवर हैं"));
        arrayList.add(new ThreeItemModel("किस जीवित जानवर का जीवनकाल सबसे लंबा होता है?", "कछुआ"));
        arrayList.add(new ThreeItemModel("फ्लाइंग फॉक्स क्या है?", "यह एक तरह का बैट है"));
        arrayList.add(new ThreeItemModel("फ्लाइंग फॉक्स क्या है?", "यह एक तरह का बैट है"));
        arrayList.add(new ThreeItemModel("स्तनधारी कैसे संवाद करते हैं?", "वे ध्वनि, स्पर्श, दृश्य सुराग और गंध द्वारा संवाद करते हैं"));
        arrayList.add(new ThreeItemModel("क्या एक viviparous है?", "एक viviparous जानवर वह है जो युवा लोगों को जन्म देता है"));
        arrayList.add(new ThreeItemModel("मुर्राह क्या है?", "यह एक संकर भैंस है जो एक उच्च दूध उत्पादक है"));
        arrayList.add(new ThreeItemModel("सबसे लंबा जीवित जानवर कौन है?", "जिराफ़"));
        arrayList.add(new ThreeItemModel("कौन सा सबसे बड़ा भूमि पशु है?", "अफ्रीकी झाड़ी हाथी"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("صلح پذیرائی کی ایک مثال لکھیں۔؟" , "فلیمنگ کے ذریعہ پینسلن کی دریافت۔"));
        arrayList.add(new ThreeItemModel("ہائیڈروپونککس سے آپ کا کیا مطلب ہے؟" , "مائع ثقافت کے وسط میں پودوں کی نشوونما۔"));
        arrayList.add(new ThreeItemModel("خلل ڈالنے والے خلیوں کو الگ کرنے کی کیا تکنیک ہے؟" , "تحلیل"));
        arrayList.add(new ThreeItemModel("EM کیا ہے؟" , "الیکٹران مائکروسکوپ۔"));
        arrayList.add(new ThreeItemModel("دو مونوکارپک پودوں کا نام بتائیں جو شاکاہاری پھول دکھاتے ہیں؟" , "بامبوسہ ٹولڈا ، میلوکانا بامبوسائڈز۔"));
        arrayList.add(new ThreeItemModel("کس نظام کے تحت ، حیاتیات کو سائنسی ذرائع مہیا کیے جاتے ہیں؟" , "دو نام نام"));
        arrayList.add(new ThreeItemModel("حیاتیات کی اس شاخ کا کیا نام ہے جس نے حیاتیات کی شناخت ، نام اور درجہ بندی کرنے کے لئے وقف کیا؟" , "درجہ بندی"));
        arrayList.add(new ThreeItemModel("'فطرت میں انسان کا مقام' کے مصنف کون تھے؟" , "ہکسلے"));
        arrayList.add(new ThreeItemModel("زندہ اور غیر زندہ دونوں ایک ہی عناصر سے بنے ہیں اور اسی طرح کے جسمانی قوانین کے تحت چلتے ہیں۔ وہ کس لحاظ سے مختلف ہیں؟" , "سطح کی تنظیم۔"));
        arrayList.add(new ThreeItemModel("ٹی ایم وی میں توسیع کریں۔؟" , "تمباکو موزیک وائرس"));
        arrayList.add(new ThreeItemModel("DNA کیا ہے؟" , "Deoxyribonucleic ایسڈ۔"));
        arrayList.add(new ThreeItemModel("ہسٹولوجی کیا ہے؟" , "ہسٹولوجی ٹشوز (مائکروسکوپک اناٹومی) کا مطالعہ ہے۔"));
        arrayList.add(new ThreeItemModel("فکس نائٹروجن میں مٹی کا آزاد جاندار بیکٹیریا کونسا ہے؟" , "ایزوٹوبیکٹر"));
        arrayList.add(new ThreeItemModel("جسمانیات کیا ہے؟" , "جسمانیات ساخت اور افعال کا مطالعہ ہے۔"));
        arrayList.add(new ThreeItemModel("سیل حیاتیات کیا ہے؟" , "سیل حیاتیات خلیوں کی ساخت اور پنروتپادن کا مطالعہ ہے۔"));
        arrayList.add(new ThreeItemModel("جینیٹکس سے آپ کا کیا مطلب ہے؟" , "جینیاتیات نسب اور مختلفات کا مطالعہ ہے۔"));
        arrayList.add(new ThreeItemModel("ایک ریڈیو آاسوٹوپ لکھیں؟" , "131"));
        arrayList.add(new ThreeItemModel("ماحولیاتی نظام کیا ہے؟" , "ماحولیاتی نظام سے ایک ساتھ ماحول کی پوری زندہ برادری اور غیر زندہ عوامل۔"));
        arrayList.add(new ThreeItemModel("سائنس کی کون سی شکل انسان کے ساختی اور ثقافتی خصائص کے مطالعہ سے وابستہ ہے؟" , "بشریات"));
        arrayList.add(new ThreeItemModel("ایک ماحولیاتی نظام میں دو فعال گروہ کیا ہیں؟" , "آٹوٹروفس اور ہیٹرو ٹرافس۔"));
        arrayList.add(new ThreeItemModel("کلوروپلاسٹ میں بنیادی فوٹو کیمیائی رد عمل کہاں پایا جاتا ہے؟" , "کوانٹازوم۔"));
        arrayList.add(new ThreeItemModel("ایکسوبیولوجی کیا ہے؟" , "یہ بیرونی خلا میں زندگی کا مطالعہ ہے۔"));
        arrayList.add(new ThreeItemModel("الیکٹران مائکروسکوپ میں اضافہ کیا ہے؟" , "100000"));
        arrayList.add(new ThreeItemModel("مونوکارپک کون سا پلانٹ ہے جو 48 سالوں میں ایک بار شاکاہاری پھول دکھاتا ہے؟" , "بانس"));
        arrayList.add(new ThreeItemModel("زندہ اور غیر جاندار سطح کی تنظیم سے ملتے جلتے کیسے ہیں؟" , "انو اور مرکبات۔"));
        arrayList.add(new ThreeItemModel("ایک خلیے میں کتنے کیمیکل موجود ہیں؟" , "تقریبا 5000 5000۔"));
        arrayList.add(new ThreeItemModel("ہومیوسٹاسس کی ایک مثال لکھیں۔؟" , "ورزش کے دوران بھاگنے اور پسینہ آتے ہوئے دل کی دھڑکن میں اضافہ ہوا۔"));
        arrayList.add(new ThreeItemModel("معلومات کے نیلے پرنٹ کو کسے کہتے ہیں؟" , "ڈی این اے"));
        arrayList.add(new ThreeItemModel("کن خلیوں کو برانن مرحلے کے دوران مرنے کا پروگرام بنایا جاتا ہے؟" , "ویزل عناصر۔"));
        arrayList.add(new ThreeItemModel("کیوں کہ مکمل طور پر مصنوعی وسط میں وائرس کی ثقافت نہیں ہوسکتی؟" , "کیوں کہ اس میں جینیاتی معلومات کے استعمال کے لئے مشینری کا فقدان ہے۔"));
        arrayList.add(new ThreeItemModel("بیجوں والے پودوں کو کیا کہتے ہیں؟" , "کریپٹوگیمز۔"));
        arrayList.add(new ThreeItemModel("ڈینڈرولوجی کیا ہے؟" , "درختوں کا مطالعہ جسے ڈینڈرولوجی کہتے ہیں"));
        arrayList.add(new ThreeItemModel("توانائی سورج کی روشنی سے تبدیل ہوتی ہے اور کس کے ذریعہ جاری کی جاتی ہے؟" , "سانس"));
        arrayList.add(new ThreeItemModel("اس عمل کا نام بتائیں جس کے ذریعے پودوں نے اپنا کھانا تیار کیا ہے؟" , "فوٹو سنتھیس"));
        arrayList.add(new ThreeItemModel("ٹونوپلسٹ کیا ہے؟" , "ٹونوپلاسٹ پودوں کے ویکیولس کے ارد گرد کی جھلی ہے"));
        arrayList.add(new ThreeItemModel("روٹ ٹوپی کا دوسرا نام کیا ہے؟" , "کلیپٹرا"));
        arrayList.add(new ThreeItemModel("انیموفائیلی کیا ہے؟" , "یہ ہوا کے ذریعہ جرگن ہے"));
        arrayList.add(new ThreeItemModel("جرگن کیا ہے؟" , "ایک دوسرے کے پھول سے جرگ کے دانے کو بدبودار پھیلانے کو جرگ کہتے ہیں۔"));
        arrayList.add(new ThreeItemModel("کلینوسٹٹ کیا ہے؟" , "کلینوسٹٹ ایک ایسا سامان ہے جو فوٹو پیریڈ ازم کا مظاہرہ کرنے کے لئے استعمال ہوتا ہے۔"));
        arrayList.add(new ThreeItemModel("اس عمل کا نام بتائیں جس کے ذریعہ مٹی کے پودوں نے پانی کھویا ہے؟" , "ٹرانسپیریشن"));
        arrayList.add(new ThreeItemModel("ایک ہی پودے پر ایک سے زیادہ اقسام کے مختلف پتیوں کی موجودگی کے لئے کیا اصطلاح استعمال کی جاتی ہے؟" , "ہیٹروفیلی"));
        arrayList.add(new ThreeItemModel("کس ملک میں جبربیلن نامی ہارمون دریافت ہوا؟" , "جاپان"));
        arrayList.add(new ThreeItemModel("کسی پلانٹ سے پانی کے ضائع ہونے والے قدرتی عمل کا نام بتائیں جو مائع کے قطروں کی صورت میں ہوتا ہے؟" , "گٹٹیشن"));
        arrayList.add(new ThreeItemModel("گیسوں کے تبادلے کے لئے پتے میں قدرتی کھلنے کا تکنیکی نام کیا ہے؟" , "اسٹوماٹا"));
        arrayList.add(new ThreeItemModel("ہیلیفائٹس اور سائوفائٹس کیا ہیں؟", "ہیلیوفائٹس ایسے پودے ہیں جو پورے سورج کی روشنی میں اگتے ہیں ، سائوفائٹس ایسے پودے ہیں جو سایہ میں اگتے ہیں"));
        arrayList.add(new ThreeItemModel("چار حشراتی پودوں کا نام بتائیں؟" , "1. ڈروسیرا ، 2. ڈیانا ، 3. الڈروونڈا ، 4. یوٹریکولریا"));
        arrayList.add(new ThreeItemModel("کیروٹین کا رنگ کیا ہے؟" , "پیلا"));
        arrayList.add(new ThreeItemModel("فوٹوشاپ کے دوران کیمیائی توانائی کا ذریعہ کیا ہے؟" , "اڈینوسائن ٹرائفوسفیٹ (اے ٹی پی)"));
        arrayList.add(new ThreeItemModel("اسپوگرا میں کلوروپلاسٹ کی شکل کیا ہے؟" , "ربن کی شکل"));
        arrayList.add(new ThreeItemModel("کس پودے کی عمر 4000 سال ہے؟" , "جینٹم"));
        arrayList.add(new ThreeItemModel("آرگنیل کا نام بتائیں جہاں فوٹو سنتھیس ہوتا ہے؟" , "کلوروپلاسٹ"));
        arrayList.add(new ThreeItemModel("پلاسٹائڈ کی تین قسمیں کیا ہیں؟" , "1. لیوکوپلاسٹ ، 2. کلوروپلاسٹ ، 3. کروموپلاسٹ"));
        arrayList.add(new ThreeItemModel("نیسٹیک تحریک کا دوسرا نام کیا ہے؟" , "نیند کی تحریک"));
        arrayList.add(new ThreeItemModel("کلاڈوڈ کیا ہے؟" , "پتی کی افادیت کو لے جانے کے لئے تنوں کی ترمیم کو کلائڈوڈ کہا جاتا ہے۔ مثال: اوپنٹیا"));
        arrayList.add(new ThreeItemModel("پھول کا مرد تولیدی حصہ کونسا ہے؟" , "طوفان"));
        arrayList.add(new ThreeItemModel(" استعمال ہونے والے آلے کا نام دیں؟","جیوٹروپزم کا مظاہرہ کرنے کے لئے"));
        arrayList.add(new ThreeItemModel("الجی میں فلجیلا کی کون سی اقسام پائی جاتی ہیں؟" , "وہپلیش ، ٹنسل"));
        arrayList.add(new ThreeItemModel("اٹرائوس بیکٹیریا کیا ہیں؟", "جراثیم جن میں فلاجیلا نہیں ہوتا ہے اسے اتریچوس بیکٹیریا کہتے ہیں"));
        arrayList.add(new ThreeItemModel("فوٹو سنیٹیسس کے سیاہ رد عمل کے دوسرے نام کیا ہیں؟" , "بلیک مین کا رد عمل یا کالون سائیکل"));
        arrayList.add(new ThreeItemModel("انجیو اسپرم میں ترقی پذیر جنینوں کے لئے سب سے عام غذائیت سے متعلق ٹشو کونسا ہے؟" , "اینڈوسپرم۔"));
        arrayList.add(new ThreeItemModel("جانور کون سا ہے؟" , "جانوروں کا لفظ لاطینی سے آیا ہے ، جس کا مطلب ہے سانس یا روح۔ اس میں پستان دار ، پرندے ، رینگنے والے جانور ، مچھلی ، مینڈک ، کلیمے ، لوبسٹر ، کیڑے ، کیڑے اور جیلی فش شامل ہیں۔"));
        arrayList.add(new ThreeItemModel("جانور کون سا ہے؟" , "جانوروں کا لفظ لاطینی سے آیا ہے ، جس کا مطلب ہے سانس یا روح۔ اس میں پستان دار ، پرندے ، رینگنے والے جانور ، مچھلی ، مینڈک ، کلیمے ، لوبسٹر ، کیڑے ، کیڑے اور جیلی فش شامل ہیں۔"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سیل کون سا ہے؟" , "پرندوں کے شوترمرگ کا انڈا"));
        arrayList.add(new ThreeItemModel("تین فر والے جانوروں کے نام بتائے؟" , "سیبل ، ایک قسم کا ہرن ، منک اور آرکٹک لومڑی فر برنگ جانور ہیں"));
        arrayList.add(new ThreeItemModel("کس زندہ جانور کا لمبا عمر ہے؟" , "کچھآ"));
        arrayList.add(new ThreeItemModel("اڑتا ہوا لومڑی کیا ہے؟" , "یہ ایک قسم کا بیٹ ہے"));
        arrayList.add(new ThreeItemModel("سب سے بڑا مرسوپل کون سا ہے؟" , "ریڈ کنگارو"));
        arrayList.add(new ThreeItemModel("پستان دار جانور کیسے مواصلت کرتے ہیں؟" , "وہ آواز ، رابطے ، بصری اشارے اور بدبو کے ذریعہ بات چیت کرتے ہیں"));
        arrayList.add(new ThreeItemModel("ایک ویویپیرس کیا ہے؟" , "ایک ویویپیرس جانور وہ ہے جو جوانوں کو جنم دیتا ہے۔"));
        arrayList.add(new ThreeItemModel("مررہ کیا ہے؟" , "یہ ایک ہائبرڈ بھینس ہے جو دودھ کی ایک اعلی پیداوار ہے۔"));
        arrayList.add(new ThreeItemModel("قد آور جانور کون سا ہے؟" , "جراف"));
        arrayList.add(new ThreeItemModel("زمین کا سب سے بڑا جانور کونسا ہے؟" , "افریقی بش کا ہاتھی"));



        return arrayList;
    }


}
