package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_AnimalAndBirds {


    private Context context;
    public Q_AnimalAndBirds(Context context) {
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

         arrayList.add(new ThreeItemModel("The country in which kiwi is found is", "New Zealand'"));
        arrayList.add(new ThreeItemModel("Wadia Institute of Himalayan Zoology is located at", "Delhi"));
        arrayList.add(new ThreeItemModel("Dudhwa National Park is located in    Uttar Pradesh", "Uttar Pradesh"));
        arrayList.add(new ThreeItemModel("The wildlife sanctury where we find asiatic lion is the", "Gir Forest"));
        arrayList.add(new ThreeItemModel("A two humped camel is called", "Bacteria camel"));
        arrayList.add(new ThreeItemModel("Butterflies come under the family", "Lepidoptera"));
        arrayList.add(new ThreeItemModel("The temple in which rats are revered,fed and protected is the", "Karnimata in Rajasthan"));
        arrayList.add(new ThreeItemModel("The fastest land animal is the", "Cheetah"));
        arrayList.add(new ThreeItemModel("The largest land animal is the", "African bush elephant"));
        arrayList.add(new ThreeItemModel("Rat snakes are found in", "South - East Asia"));
        arrayList.add(new ThreeItemModel("A common domesticated animal which cannot taste sweet is the", "Cat"));
        arrayList.add(new ThreeItemModel("The world's smallest mammal is the", "Etruscan shrew (Suncus etruscus)"));
        arrayList.add(new ThreeItemModel("The mammal that lives at the greatest altitude is the", "Hog nosed bat"));
        arrayList.add(new ThreeItemModel("The smallest member of the cat family is the", "Cat (Felis catus)"));
        arrayList.add(new ThreeItemModel("The largest flying mammal is the", "Bats"));
        arrayList.add(new ThreeItemModel("The world's largest deer is the", "Alaskan moose"));
        arrayList.add(new ThreeItemModel("The world's heaviest flying bird is the", "Great Bustard"));
        arrayList.add(new ThreeItemModel("The bird which has the largest wing span is the", "Albatros"));
        arrayList.add(new ThreeItemModel(" The largest known frog is the", "Ora"));
        arrayList.add(new ThreeItemModel("The longest known frog is the", "Goliath Grog"));
        arrayList.add(new ThreeItemModel("The longest insect in the world is the", "TGiant stick Insect"));
        arrayList.add(new ThreeItemModel("The fastest moving insect in the world is the", "Tropical cockroach"));
        arrayList.add(new ThreeItemModel("The giant stick Insect is found in", "Indonesia"));
        arrayList.add(new ThreeItemModel("There are how many kinds of cat species in India", "Fifteen"));
        arrayList.add(new ThreeItemModel("The animal known as the river horse is the ", "Hippopotamus"));

        arrayList.add(new ThreeItemModel("How many animals are in the whole world ?", "Approximately 8.7 million species on Earth. 1-2 million of those species are animals"));
        arrayList.add(new ThreeItemModel("The largest bird alive is the_?", "Ostrich"));
        arrayList.add(new ThreeItemModel("The smallest bird alive is the_?", " Humming bird"));
        arrayList.add(new ThreeItemModel("Fastest flying bird is _?", "Peregrine falcon 390 km/h"));
        arrayList.add(new ThreeItemModel("An animal doctor is called a _?", "Veterinarian"));
        arrayList.add(new ThreeItemModel("How many arms an octopus has_?", "Eight"));
        arrayList.add(new ThreeItemModel("The arms of the octopus are called ?", "Tentacles"));
        arrayList.add(new ThreeItemModel("The fastest moving land snake in the world is the_?", "Black Mamba"));
        arrayList.add(new ThreeItemModel("A group of lions is called a", "Pride"));
        arrayList.add(new ThreeItemModel("A group of invertebrate animals which have segments body and jointed limbs are called", "Arthropods"));
        arrayList.add(new ThreeItemModel("A period of dormancy in winter by some animals known as", "Hibernation"));
        arrayList.add(new ThreeItemModel("Animals having backbone (vertebra) are known as", "Vertebrates"));
        arrayList.add(new ThreeItemModel("Albatross is a large", "Sea bird"));
        arrayList.add(new ThreeItemModel("A small fish having a head like that of a horse is known as", " Sea horse"));
        arrayList.add(new ThreeItemModel("African donkey with black and white stripes is called a", "Zebra"));
        arrayList.add(new ThreeItemModel("A small worm which lives in ponds and rivers and sucks the blood of animals is", "Leech"));
        arrayList.add(new ThreeItemModel("The world's largest zoological reserve is the", "Etosha National Park,Namibia"));
        arrayList.add(new ThreeItemModel("Egg laying mammals are called", "Prototherians"));
        arrayList.add(new ThreeItemModel("The bird which lays more than 100 eggs in one nest is theh", "Ostrich"));
        arrayList.add(new ThreeItemModel("The largest Kangaroo in the world is the", " Red Kangaroo"));
        arrayList.add(new ThreeItemModel("The only mammal that can fly is the", "Bat"));
        arrayList.add(new ThreeItemModel("The animal revered by the buddhists as their sacred animal is the", "White elephant"));
        arrayList.add(new ThreeItemModel("It is widely believed that Ostrich buries its head in sand which is", " Not true"));
        arrayList.add(new ThreeItemModel("Austrian scientist Konard Lorenz is famous for", "Study on Geese"));
        arrayList.add(new ThreeItemModel("Bharatpur bird sanctuary is situated in", "Rajasthan"));
        arrayList.add(new ThreeItemModel("The fish which is known as the king of fishes is the", "Shark"));
        arrayList.add(new ThreeItemModel("The world's largest aquarium is the", "Sydney Aquarium"));
        arrayList.add(new ThreeItemModel("The tallest living animal is the", "The tallest living animal is the Giraffe"));
        arrayList.add(new ThreeItemModel("India's first sanctuary was the", " Corbett National Park in Uttar Pradesh"));
        arrayList.add(new ThreeItemModel("The largest living animal is the", "Rorqual or blue whale"));
        arrayList.add(new ThreeItemModel("The continent which is known as the land of Kangaroo is", "Australia"));
        arrayList.add(new ThreeItemModel("The first forest show was established in Mexico in the year", "1898"));
        arrayList.add(new ThreeItemModel("The country in which Yak is found is", "Tibet"));

        arrayList.add(new ThreeItemModel("The elephant's trunk is actually a modified", "Incisor"));
        arrayList.add(new ThreeItemModel("The diet of a gorilla is purely", "Vegetarian"));
        arrayList.add(new ThreeItemModel("The number of known species of mammals are", "4230"));
        arrayList.add(new ThreeItemModel("The fish that can taste with its whole body is the", "Catfish"));
        arrayList.add(new ThreeItemModel("The average weight of a blue whale is", " 1,20,000 kg"));
        arrayList.add(new ThreeItemModel("The most widely eaten fish in India is the", "Pomfret"));
        arrayList.add(new ThreeItemModel("The only fish that makes nest is the", "Stickle back"));
        arrayList.add(new ThreeItemModel("A group of peacocks are called a", "Muster"));
        arrayList.add(new ThreeItemModel("Gold fish originally belongs to", "China"));
        arrayList.add(new ThreeItemModel("Red panda is also known as the", "Cat bear"));
        arrayList.add(new ThreeItemModel("A female rabbit is called a", "Doe"));
        arrayList.add(new ThreeItemModel("A female horse is called a", "Mare"));
        arrayList.add(new ThreeItemModel("The whale believed to be a fish,is actually a", "Mammal"));
        arrayList.add(new ThreeItemModel("The organ which is missing in the Camel is the", "Gall bladder"));
        arrayList.add(new ThreeItemModel("A bird which lays only one egg in two years is the", "Albatross"));
        arrayList.add(new ThreeItemModel("The only animal that sleeps on its back is", "Man"));
        arrayList.add(new ThreeItemModel("The only animal which has four knees is the", "Elephant"));
        arrayList.add(new ThreeItemModel("An animal which is dumb is the", "Giraffe"));
        arrayList.add(new ThreeItemModel("A common domesticated animal which is colour - blind is the", "Dog"));
        arrayList.add(new ThreeItemModel("A group of eagles are called a", "Convocation"));
        arrayList.add(new ThreeItemModel("A group of hares are called a", "Husk"));
        arrayList.add(new ThreeItemModel("A group of fish are called a", "Shoal"));
        arrayList.add(new ThreeItemModel("A group of gorillas are called a", "Band"));
        arrayList.add(new ThreeItemModel("A group of elephants are called a", "Herd"));
        arrayList.add(new ThreeItemModel("The female of a stag are called a", "Hind"));
        arrayList.add(new ThreeItemModel("The male of a cow is called a", "Bull"));
        arrayList.add(new ThreeItemModel("The young of an elephant is called a", "Calf"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("সমগ্র পৃথিবীতে কত প্রাণী আছে?","পৃথিবীতে প্রায় ৮.7 মিলিয়ন প্রজাতি"));
        arrayList.add(new ThreeItemModel("জীবিত বৃহত্তম পাখি হ'ল_?", "অস্ট্রিচ"));
        arrayList.add(new ThreeItemModel("জীবন্ততম ক্ষুদ্রতম পাখিটি কি_?", "হামিং পাখি"));
        arrayList.add(new ThreeItemModel("দ্রুততম উড়ন্ত পাখিটি _?", "পেরেগ্রাইন ফ্যালকন 390 কিমি / ঘন্টা"));
        arrayList.add(new ThreeItemModel("একজন প্রাণী চিকিৎসকের নাম _ _?", "পশুচিকিত্সা"));
        arrayList.add(new ThreeItemModel("একটি অক্টোপাসের কতটি হাত রয়েছে?", "আট"));
        arrayList.add(new ThreeItemModel("অক্টোপাসের বাহুগুলি বলা হয়?", "তাঁবু"));
        arrayList.add(new ThreeItemModel("বিশ্বের দ্রুততম চলমান স্থল সাপটি কি??", "কালো মাম্বা"));
        arrayList.add(new ThreeItemModel("সিংহের একদলকে", "গর্ব বলা হয়"));
        arrayList.add(new ThreeItemModel("একদল ইনভার্টেব্রেট প্রাণীর একটি অংশ যাদের দেহের অংশ এবং সংযুক্ত অঙ্গ রয়েছে তাদের বলা হয়", "আর্থ্রোপডস"));
        arrayList.add(new ThreeItemModel("শীতকালে কিছু প্রাণীর দ্বারা শীতকালীন সুপ্তাবরণের একটি সময়", "হাইবারনেশন নামে পরিচিত"));
        arrayList.add(new ThreeItemModel("মেরুদণ্ডযুক্ত (কশেরুকা) থাকা প্রাণীগুলি", "ভার্টেট্রেটস নামে পরিচিত"));
        arrayList.add(new ThreeItemModel("আলবাট্রস একটি বিশাল", "সমুদ্র পাখি"));
        arrayList.add(new ThreeItemModel("একটি ছোট মাছ যেমন একটি ঘোড়ার মত মাথা থাকে", "সমুদ্র ঘোড়া নামে পরিচিত"));
        arrayList.add(new ThreeItemModel("কালো এবং সাদা ফিতেযুক্ত আফ্রিকান গাধাটিকে", "জেব্রা বলা হয়"));
        arrayList.add(new ThreeItemModel("একটি ছোট কৃমি যা পুকুর এবং নদীতে বাস করে এবং পশুর রক্ত ​​চুষে তোলে", "জোঁক"));
        arrayList.add(new ThreeItemModel("বিশ্বের বৃহত্তম প্রাণী সংরক্ষণাগার হ'ল", "ইতোশা জাতীয় উদ্যান, নামিবিয়া"));
        arrayList.add(new ThreeItemModel("ডিম দেওয়ার স্তন্যপায়ী প্রাণীদের বলা হয়", "প্রোটোথেরিয়ান্স"));
        arrayList.add(new ThreeItemModel("যে পাখি একটি বাসাতে 100 টিরও বেশি ডিম দেয় তারা হহ", "অস্ট্রিচ"));
        arrayList.add(new ThreeItemModel("বিশ্বের বৃহত্তম ক্যাঙ্গারু হ'ল", "রেড ক্যাঙ্গারু"));
        arrayList.add(new ThreeItemModel("উড়তে পারে এমন একমাত্র স্তন্যপায়ী হ'ল", "ব্যাট"));
        arrayList.add(new ThreeItemModel("বন্ধুরা তাদের পবিত্র প্রাণী হিসাবে শ্রদ্ধাযোগ্য প্রাণী হ'ল", "সাদা হাতি"));
        arrayList.add(new ThreeItemModel("এটি বহুলভাবে বিশ্বাস করা হয় যে অস্ট্রিচ তার মাথা বালুতে কবর দেয় যা", "সত্য নয়"));
        arrayList.add(new ThreeItemModel("অস্ট্রিয়ান বিজ্ঞানী কোনার্ড লোরেঞ্জ বিখ্যাত", "স্টাডি অন গিজ এর জন্য বিখ্যাত"));
        arrayList.add(new ThreeItemModel("ভারতপুর পাখির অভয়ারণ্য", "রাজস্থান এ অবস্থিত"));
        arrayList.add(new ThreeItemModel("যে মাছগুলি মাছের রাজা হিসাবে পরিচিত, তা হ'ল", "হাঙ্গর"));
        arrayList.add(new ThreeItemModel("বিশ্বের বৃহত্তম অ্যাকোয়ারিয়াম হ'ল", "সিডনি অ্যাকোয়ারিয়াম"));
        arrayList.add(new ThreeItemModel("সবচেয়ে দীর্ঘ জীবন্ত প্রাণী হ'ল", "সবচেয়ে দীর্ঘ জীবন্ত প্রাণী হ'ল জিরাফ"));
        arrayList.add(new ThreeItemModel("ভারতের প্রথম অভয়ারণ্যটি ছিল", "উত্তরপ্রদেশের কার্বেট জাতীয় উদ্যান"));
        arrayList.add(new ThreeItemModel("The largest living animal is the", "Rorqual or blue whale"));
        arrayList.add(new ThreeItemModel("যে মহাদেশটি কাঙ্গারুর ভূমি হিসাবে পরিচিত, তা হ'ল", "অস্ট্রেলিয়া"));
        arrayList.add(new ThreeItemModel("মেক্সিকোয় প্রথম ফরেস্ট শোটি প্রতিষ্ঠিত হয়েছিল", "1898"));
        arrayList.add(new ThreeItemModel("ইয়াককে যে দেশে পাওয়া যায় সে দেশটি হ'ল", "তিব্বত"));
        arrayList.add(new ThreeItemModel("যে দেশে কিউই পাওয়া যায় তা হ'ল", "নিউজিল্যান্ড"));
        arrayList.add(new ThreeItemModel("হিমালয়ান প্রাণীবিদ্যার ওয়াদিয়া ইনস্টিটিউটটি", "দিল্লি এ অবস্থিত"));
        arrayList.add(new ThreeItemModel("দুধওয়া জাতীয় উদ্যানটি উত্তর প্রদেশে অবস্থিত", "উত্তর প্রদেশ"));
        arrayList.add(new ThreeItemModel("বন্যপ্রাণী অভয়ারণ্য যেখানে আমরা এশিয়াটিক সিংহ খুঁজে পাই তা হ'ল", "গির বন"));
        arrayList.add(new ThreeItemModel("দুটি কুঁচকানো উট বলা হয়", "ব্যাকটিরিয়া উট"));
        arrayList.add(new ThreeItemModel("প্রজাপতিগুলি পরিবারের অধীনে আসে", "লেপিডোপটেরা"));
        arrayList.add(new ThreeItemModel("যে মন্দিরে ইঁদুরকে শ্রদ্ধা করা, খাওয়ানো এবং সুরক্ষিত করা হয় এটি হ'ল", "রাজস্থানের কর্নিমাতা"));
        arrayList.add(new ThreeItemModel("দ্রুততম ভূমির প্রাণী হ'ল", "চিতা"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ভূমির প্রাণী হ'ল", "আফ্রিকান গুল্ম হাতি"));
        arrayList.add(new ThreeItemModel("ইঁদুর সাপ পাওয়া যায়", "দক্ষিণ - পূর্ব এশিয়া"));
        arrayList.add(new ThreeItemModel("একটি সাধারণ পোষা প্রাণী যা মিষ্টি স্বাদ নিতে পারে না তা হ'ল", "বিড়াল"));
        arrayList.add(new ThreeItemModel("বিশ্বের ক্ষুদ্রতম স্তন্যপায়ী হ'ল", "এট্রস্কান শ্রু (সানকাস এট্রুসকাস)"));
        arrayList.add(new ThreeItemModel("যে স্তন্যপায়ী প্রাণটি সর্বোচ্চ উচ্চতায় বাস করে তা হ'ল", "হোগ নাকড ব্যাট"));
        arrayList.add(new ThreeItemModel("বিড়াল পরিবারের ক্ষুদ্রতম সদস্য হলেন", "বিড়াল (ফেলিস ক্যাটাস)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম উড়ন্ত স্তন্যপায়ী হ'ল", "ব্যাটস"));
        arrayList.add(new ThreeItemModel("বিশ্বের বৃহত্তম হরিণ হ'ল", "আলাস্কান মুজ"));
        arrayList.add(new ThreeItemModel("বিশ্বের সবচেয়ে উড়ন্ত পাখি হ'ল", "গ্রেট বুস্টার্ড"));
        arrayList.add(new ThreeItemModel("যে পাখির সর্বাধিক ডানা স্প্যান রয়েছে তা হ'ল", "আলবাট্রোস"));
        arrayList.add(new ThreeItemModel("বৃহত্তম পরিচিত ব্যাঙ হ'ল", "ওরা"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম ব্যাঙটি হ'ল", "গোলিয়থ গ্রোগ"));
        arrayList.add(new ThreeItemModel("বিশ্বের দীর্ঘতম পোকা হ'ল", "টিজিয়ান্ট স্টিক পোকার"));
        arrayList.add(new ThreeItemModel("বিশ্বের দ্রুততম চলমান পোকা হ'ল", "ক্রান্তীয় তেলাপোকা"));
        arrayList.add(new ThreeItemModel("জায়ান্ট স্টিক পোকা পাওয়া যায়", "ইন্দোনেশিয়া"));
        arrayList.add(new ThreeItemModel("ভারতে বিড়ালের কত প্রজাতি রয়েছে", "পনেরো"));
        arrayList.add(new ThreeItemModel("নদী ঘোড়া হিসাবে পরিচিত প্রাণী হ'ল", "হিপ্পোপটামাস"));
        arrayList.add(new ThreeItemModel("হাতির কাণ্ডটি আসলে একটি সংশোধিত", "ইনসিসিজার"));
        arrayList.add(new ThreeItemModel("গরিলার ডায়েট বিশুদ্ধভাবে", "নিরামিষ"));
        arrayList.add(new ThreeItemModel("স্তন্যপায়ী প্রাণীর পরিচিত প্রজাতির সংখ্যা হ'ল", "4230"));
        arrayList.add(new ThreeItemModel("যে মাছটি তার পুরো শরীরের সাথে স্বাদ নিতে পারে তা হ'ল", "ক্যাটফিশ"));
        arrayList.add(new ThreeItemModel("নীল তিমির গড় ওজন", "1,20,000 কেজি"));
        arrayList.add(new ThreeItemModel("ভারতে সবচেয়ে বেশি খাওয়া মাছ হ'ল", "পমফ্রেট"));
        arrayList.add(new ThreeItemModel("বাসা তৈরি করে এমন একমাত্র মাছ হ'ল", "স্টিকল ব্যাক"));
        arrayList.add(new ThreeItemModel("একদল ময়ূরকে", "ঝিনুক বলা হয়"));
        arrayList.add(new ThreeItemModel("সোনার মাছ মূলত", "চীন এর অন্তর্গত"));
        arrayList.add(new ThreeItemModel("লাল পান্ডাটি", "বিড়াল ভালুক নামেও পরিচিত"));
        arrayList.add(new ThreeItemModel("স্ত্রী খরগোশকে", "ডো বলা হয়"));
        arrayList.add(new ThreeItemModel("মহিলা ঘোড়াটিকে", "মেরে বলা হয়"));
        arrayList.add(new ThreeItemModel("তিমি একটি মাছ হিসাবে বিশ্বাস করা, এটি আসলে একটি", "স্তন্যপায়ী"));
        arrayList.add(new ThreeItemModel("উটের মধ্যে যে অঙ্গটি অনুপস্থিত তা হ'ল", "পিত্তথলি"));
        arrayList.add(new ThreeItemModel("একটি পাখি যা দু'বছরে মাত্র একটি ডিম দেয়" ,"আলবাট্রস"));
        arrayList.add(new ThreeItemModel("একমাত্র প্রাণী যে তার পিঠে ঘুমায় সে হ'ল", "মানুষ"));
        arrayList.add(new ThreeItemModel("চারটি হাঁটুযুক্ত একমাত্র প্রাণী হ'ল", "হাতি"));
        arrayList.add(new ThreeItemModel("যে প্রাণীটি বোবা, সে হ'ল", "জিরাফ"));
        arrayList.add(new ThreeItemModel("একটি সাধারণ গৃহপালিত প্রাণী যা বর্ণ - অন্ধ হয়", "কুকুর"));
        arrayList.add(new ThreeItemModel("একদল agগলকে", "সমাবর্তন বলা হয়"));
        arrayList.add(new ThreeItemModel("খরগোশের একটি দলকে বলা হয়", "কুণ্ডলী"));
        arrayList.add(new ThreeItemModel("একদল মাছকে", "শোয়াল বলা হয়"));
        arrayList.add(new ThreeItemModel("গরিলার একটি গ্রুপকে", "ব্যান্ড বলা হয়"));
        arrayList.add(new ThreeItemModel("হাতির একটি দলকে", "হার্ড বলা হয়"));
        arrayList.add(new ThreeItemModel("স্তম্ভের মহিলাটিকে", "হিন্দ বলা হয়"));
        arrayList.add(new ThreeItemModel("গরুর পুরুষকে", "ষাঁড় বলা হয়"));
        arrayList.add(new ThreeItemModel("একটি হাতির বাচ্চাকে", "বাছুর বলা হয়"));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("पूरी दुनिया में कितने जानवर हैं?", "पृथ्वी पर लगभग 8.7 मिलियन प्रजातियां हैं। उन प्रजातियों में से 1-2 मिलियन जानवर हैं।"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पक्षी जीवित है the_?", "शुतुरमुर्ग"));
        arrayList.add(new ThreeItemModel("सबसे छोटा पक्षी जीवित है the_?", "गुनगुना पक्षी"));
        arrayList.add(new ThreeItemModel("सबसे तेज़ उड़ने वाला पक्षी _ है?", "पेरेग्रीन बाज़ 390 किमी / घंटा"));
        arrayList.add(new ThreeItemModel("पशु चिकित्सक को _ कहा जाता है?", "पशुचिकित्सा"));
        arrayList.add(new ThreeItemModel("पशु चिकित्सक को _ कहा जाता है?", "पशुचिकित्सा"));
        arrayList.add(new ThreeItemModel("ऑक्टोपस की भुजाओं को कहा जाता है?", "टेंटेकल्स"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे तेज चलने वाला भूमि साँप the_ है?", "ब्लैक माम्बा"));
        arrayList.add(new ThreeItemModel("शेरों के एक समूह को", "गर्व कहा जाता है"));
        arrayList.add(new ThreeItemModel("अकशेरुकी जानवरों का एक समूह, जिनके शरीर के खंड और संयुक्त अंग होते हैं", "आर्थ्रोपोड्स"));
        arrayList.add(new ThreeItemModel("कुछ जानवरों द्वारा सर्दियों में सुस्ती का दौर", "हाइबरनेशन"));
        arrayList.add(new ThreeItemModel("रीढ़ (कशेरुक) वाले जानवरों को", "कशेरुक के रूप में जाना जाता है"));
        arrayList.add(new ThreeItemModel("अल्बाट्रॉस एक बड़ा है", "सी बर्ड"));
        arrayList.add(new ThreeItemModel("घोड़े की तरह सिर वाली छोटी मछली", "समुद्री घोड़ा के रूप में जानी जाती है"));
        arrayList.add(new ThreeItemModel("काले और सफेद धारियों वाले अफ्रीकी गधे को", "ज़ेबरा कहा जाता है"));
        arrayList.add(new ThreeItemModel("एक छोटा कीड़ा जो तालाबों और नदियों में रहता है और जानवरों का खून चूसता है", "लीच"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे बड़ा जूलॉजिकल रिजर्व है", "इटोशा नेशनल पार्क, नामीबिया"));
        arrayList.add(new ThreeItemModel("अंडे देने वाले स्तनधारियों को", "प्रोटोथेरियन कहा जाता है"));
        arrayList.add(new ThreeItemModel("चिड़िया जो एक घोंसले में 100 से अधिक अंडे देती है, वह है", "शुतुरमुर्ग"));
        arrayList.add(new ThreeItemModel("दुनिया में सबसे बड़ा कंगारू है", "रेड कंगारू"));
        arrayList.add(new ThreeItemModel("एकमात्र स्तनपायी जो उड़ सकता है", "चमगादड़"));
        arrayList.add(new ThreeItemModel("उनके पवित्र जानवर के रूप में बौद्धों द्वारा पूजनीय जानवर", "सफेद हाथी"));
        arrayList.add(new ThreeItemModel("यह व्यापक रूप से माना जाता है कि शुतुरमुर्ग अपने सिर को रेत में दबा देता है जो", "सच नहीं है"));
        arrayList.add(new ThreeItemModel("ऑस्ट्रियाई वैज्ञानिक कोनार्ड लोरेंज़ के लिए प्रसिद्ध है" , "स्टडी ऑन गीज़"));
        arrayList.add(new ThreeItemModel("भरतपुर पक्षी अभयारण्य", "राजस्थान में स्थित है"));
        arrayList.add(new ThreeItemModel("मछली जिसे मछलियों का राजा कहा जाता है", "शार्क"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे बड़ा मछलीघर है", "सिडनी एक्वेरियम"));
        arrayList.add(new ThreeItemModel("सबसे लंबा जीवित जानवर" , "सबसे लंबा जीवित जानवर जिराफ है"));
        arrayList.add(new ThreeItemModel("भारत का पहला अभयारण्य उत्तर प्रदेश में", "कॉर्बेट नेशनल पार्क था"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा जीवित जानवर", "रोरक्वल या ब्लू व्हेल"));
        arrayList.add(new ThreeItemModel("कंगारू की भूमि के रूप में जाना जाने वाला महाद्वीप" , "ऑस्ट्रेलिया"));
        arrayList.add(new ThreeItemModel("पहला वन शो साल में मेक्सिको में स्थापित किया गया था", "1898"));
        arrayList.add(new ThreeItemModel("जिस देश में याक पाया जाता है", "तिब्बत"));
        arrayList.add(new ThreeItemModel("जिस देश में कीवी पाया जाता है वह है", "न्यूजीलैंड"));
        arrayList.add(new ThreeItemModel("वाडिया इंस्टिट्यूट ऑफ़ हिमालयन जूलॉजी", "दिल्ली में स्थित है"));
        arrayList.add(new ThreeItemModel("दुधवा नेशनल पार्क उत्तर प्रदेश में स्थित है", "उत्तर प्रदेश"));
        arrayList.add(new ThreeItemModel("वन्यजीव अभयारण्य जहां हम एशियाई शेर पाते हैं", "गिर वन"));
        arrayList.add(new ThreeItemModel("दो कूबड़ वाला ऊंट", "बैक्टीरिया ऊंट कहलाता है"));
        arrayList.add(new ThreeItemModel("तितलियां परिवार के अंतर्गत आती हैं", "लेपिडोप्टेरा"));
        arrayList.add(new ThreeItemModel("राजस्थान में जिस मंदिर में चूहों की श्रद्धा, भक्ति और रक्षा की जाती है, वह है", "राजस्थान में कर्णमाता"));
        arrayList.add(new ThreeItemModel("सबसे तेज़ ज़मीन वाला जानवर है", "चीता"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा भूमि पशु", "अफ्रीकी झाड़ी हाथी"));
        arrayList.add(new ThreeItemModel("रैट स्नेक", "साउथ - ईस्ट एशिया में पाए जाते हैं"));
        arrayList.add(new ThreeItemModel("एक आम पालतू जानवर जो मीठा नहीं खा सकता है", "बिल्ली"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे छोटा स्तनपायी है", "इट्रस्केन शुक (सनकस एटरकस)"));
        arrayList.add(new ThreeItemModel("वह स्तनपायी जो सबसे बड़ी ऊंचाई पर रहता है", "हॉग नोज़्ड बैट"));
        arrayList.add(new ThreeItemModel("बिल्ली परिवार का सबसे छोटा सदस्य है", "बिल्ली (फेलिस कैटस)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी उड़ान स्तनपायी है", "चमगादड़"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे बड़ा हिरण", "अलास्का की मुद्रा"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे भारी उड़ने वाला पक्षी", "ग्रेट बस्टर्ड"));
        arrayList.add(new ThreeItemModel("जिस पक्षी में सबसे बड़ा पंख होता है, वह है", "अल्बाट्रोस"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा ज्ञात मेंढक है", "ओरा"));
        arrayList.add(new ThreeItemModel("सबसे लंबे समय तक ज्ञात मेंढक है", "गोलियत ग्राग"));
        arrayList.add(new ThreeItemModel("दुनिया का सबसे लंबा कीट", "टिगेंट स्टिक कीट"));
        arrayList.add(new ThreeItemModel("दुनिया में सबसे तेज चलने वाला कीट", "ट्रॉपिकल कॉकरोच"));
        arrayList.add(new ThreeItemModel("द ग्रेट स्टिक इनसेक्ट", "इंडोनेशिया में पाया जाता है"));
        arrayList.add(new ThreeItemModel("भारत में बिल्ली की प्रजातियाँ कितने प्रकार की हैं", "पंद्रह"));
        arrayList.add(new ThreeItemModel("नदी घोड़े के रूप में जाना जाने वाला जानवर", "हिप्पोपोटामस"));
        arrayList.add(new ThreeItemModel("हाथी की सूंड वास्तव में एक संशोधित है", "इन्सीज़र"));
        arrayList.add(new ThreeItemModel("गोरिल्ला का आहार विशुद्ध रूप से है", "शाकाहारी"));
        arrayList.add(new ThreeItemModel("स्तनधारियों की ज्ञात प्रजातियों की संख्या", "4230"));
        arrayList.add(new ThreeItemModel("मछली जो अपने पूरे शरीर के साथ स्वाद ले सकती है", "कैटफ़िश"));
        arrayList.add(new ThreeItemModel("एक ब्लू व्हेल का औसत वजन" , "1,20,000 किलोग्राम"));
        arrayList.add(new ThreeItemModel("भारत में सबसे व्यापक रूप से खाई जाने वाली मछली", "पोम्फ्रेट"));
        arrayList.add(new ThreeItemModel("घोंसला बनाने वाली एकमात्र मछली है", "स्टिकल बैक"));
        arrayList.add(new ThreeItemModel("मोर के समूह को","मस्टर कहा जाता "));
        arrayList.add(new ThreeItemModel("सोने की मछली मूल रूप से", "चीन"));
        arrayList.add(new ThreeItemModel("रेड पांडा को", "कैट भालू के रूप में भी जाना जाता है"));
        arrayList.add(new ThreeItemModel("मादा खरगोश को", "डो कहा जाता है"));
        arrayList.add(new ThreeItemModel("मादा घोड़े को", "घोड़ी कहा जाता है"));
        arrayList.add(new ThreeItemModel("व्हेल मछली माना जाता है, वास्तव में एक", "स्तनपायी"));
        arrayList.add(new ThreeItemModel("ऊंट में जो अंग गायब है, वह है", "पित्ताशय"));
        arrayList.add(new ThreeItemModel("एक पक्षी जो दो वर्षों में केवल एक अंडा देता है", "अल्बाट्रॉस"));
        arrayList.add(new ThreeItemModel("एकमात्र जानवर जो अपनी पीठ पर सोता है", "मैन"));
        arrayList.add(new ThreeItemModel("एकमात्र जानवर जिसके चार घुटने हैं", "हाथी"));
        arrayList.add(new ThreeItemModel("एक जानवर जो गूंगा है", "जिराफ़"));
        arrayList.add(new ThreeItemModel("एक आम पालतू जानवर जो रंग - अंधा है", "कुत्ता"));
        arrayList.add(new ThreeItemModel("ईगल्स के एक समूह को", "दीक्षांत समारोह कहा जाता है"));
        arrayList.add(new ThreeItemModel("हार्स के एक समूह को", "हस्क कहा जाता है"));
        arrayList.add(new ThreeItemModel("मछली के एक समूह को", "शोल कहा जाता है"));
        arrayList.add(new ThreeItemModel("गोरिल्लाओं के समूह को", "बैंड कहा जाता है"));
        arrayList.add(new ThreeItemModel("हाथियों के समूह को", "झुंड कहा जाता है"));
        arrayList.add(new ThreeItemModel("हरिण की मादा को", "हिंद कहा जाता है"));
        arrayList.add(new ThreeItemModel("गाय के नर को", "बुल कहा जाता है"));
        arrayList.add(new ThreeItemModel("हाथी के युवा को", "बछड़ा कहा जाता है"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("پوری دنیا میں کتنے جانور ہیں؟" , "زمین پر تقریبا 8. 8.7 ملین پرجاتی ہیں۔ ان پرجاتیوں میں سے 1-2 ملین جانور ہیں۔"));
        arrayList.add(new ThreeItemModel("زندہ سب سے بڑا پرندہ کیا_؟" ,"شوترمرگ"));
        arrayList.add(new ThreeItemModel("زندہ سب سے چھوٹا پرندہ کیا__؟" , "ہمنگ برڈ"));
        arrayList.add(new ThreeItemModel("تیز ترین اڑنے والا پرندہ _؟" , "پیریگرائن فالکن 390 کلومیٹر فی گھنٹہ ہے"));
        arrayList.add(new ThreeItemModel("جانوروں کے ڈاکٹر کو _؟" , "ویٹرنریرین کہا جاتا ہے"));
        arrayList.add(new ThreeItemModel("آکٹپس کے کتنے ہتھیار ہیں_؟" , "آٹھ"));
        arrayList.add(new ThreeItemModel("آکٹپس کے ہتھیاروں کو کہا جاتا ہے؟" , "ٹینٹیکلز"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے تیز رفتار زمین سے چلنے والا سانپ The_؟","بلیک مامبا"));
        arrayList.add(new ThreeItemModel("شیروں کے گروہ کو" , "فخر کہا جاتا ہے"));
        arrayList.add(new ThreeItemModel("الٹ جانے والے جانوروں کا ایک گروپ جس کے حصے میں جسم اور جوڑ اعضاء ہوتے ہیں" , " کہا جاتا ہے آرتروپڈز"));
        arrayList.add(new ThreeItemModel("کچھ جانوروں کے ذریعہ سردیوں میں دوری کی مدت جس کو جانا جاتا ہے", "ہائبرنیشن"));
        arrayList.add(new ThreeItemModel("جن جانوروں میں ریڑھ کی ہڈی (کشیرکا) ہوتا ہے ، ان کے نام سے جانا جاتا ہے", "کشیرے"));
        arrayList.add(new ThreeItemModel("البتراس بڑے ہیں", "سی برڈ"));
        arrayList.add(new ThreeItemModel("ایک چھوٹی مچھلی جس کا سر گھوڑے کے جیسے ہوتا ہے اس کے نام سے جانا جاتا ہے", "سمندری گھوڑا"));
        arrayList.add(new ThreeItemModel("African donkey with black and white stripes is called a", "Zebra"));
        arrayList.add(new ThreeItemModel("ایک چھوٹا سا کیڑا جو تالابوں اور ندیوں میں رہتا ہے اور جانوروں کا خون چوستا ہے۔", "جچھ"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے بڑا زولوجیکل ریزرو ہے", "اٹوشہ نیشنل پارک ، نمیبیا"));
        arrayList.add(new ThreeItemModel("انڈے دینے والے ستنداری جانور کہا جاتا ہے", "پروٹوتیریئنز"));
        arrayList.add(new ThreeItemModel("وہ پرندہ جو ایک گھونسلے میں 100 سے زیادہ انڈے دیتا ہے وہ ہے", "شوترمرغ"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے بڑا کینگارو ہے", "ریڈ کنگارو"));
        arrayList.add(new ThreeItemModel("واحد ستنداری ہے جو اڑ سکتی ہے", "چمگادڑ"));
        arrayList.add(new ThreeItemModel("بدھسٹوں کے ذریعہ جانوروں کا ان کے مقدس جانور کی حیثیت سے تعظیم کرنا ہے", "سفید ہاتھی"));
        arrayList.add(new ThreeItemModel("یہ بڑے پیمانے پر مانا جاتا ہے کہ شوترمرگ نے ریت میں اپنا سر دفن کردیا جو ہے", " سچ نہیں"));
        arrayList.add(new ThreeItemModel("آسٹریا کے سائنس دان کونارڈ لورینز مشہور ہیں", "گیز پر مطالعہ"));
        arrayList.add(new ThreeItemModel("بھرت پور پرندوں کا پناہ گاہ واقع ہے", "راجستھان"));
        arrayList.add(new ThreeItemModel("مچھلیوں کو جو مچھلیوں کا بادشاہ کہا جاتا ہے وہ ہے", "شارک"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے بڑا ایکویریم", "سڈنی ایکویریم"));
        arrayList.add(new ThreeItemModel("سب سے لمبا زندہ جانور جانور ہے ","سب سے لمبا زندہ جانور جراف ہے"));
        arrayList.add(new ThreeItemModel("ہندوستان کا پہلا پناہ گاہ تھا", "اترپردیش میں کاربیٹ نیشنل پارک"));
        arrayList.add(new ThreeItemModel("سب سے بڑا زندہ جانور" , "عام یا نیلی وہیل" ));
        arrayList.add(new ThreeItemModel("یہ براعظم جو کنگارو کی سرزمین کے نام سے جانا جاتا ہے وہ ہے", "آسٹریلیا"));
        arrayList.add(new ThreeItemModel("میکسیکو میں سال میں پہلا فارسٹ شو قائم کیا گیا تھا", "1898"));
        arrayList.add(new ThreeItemModel("جس ملک میں یاک مل گیا ہے وہ ہے", "تبت"));
        arrayList.add(new ThreeItemModel("جس ملک میں کیوی پایا جاتا ہے وہ ہے", "نیوزی لینڈ'"));
        arrayList.add(new ThreeItemModel("وادیہ انسٹی ٹیوٹ آف ہمالیان زولوجی واقع ہے", "دہلی"));
        arrayList.add(new ThreeItemModel("دودھوا نیشنل پارک اتر پردیش میں واقع ہے", "اتر پردیش"));
        arrayList.add(new ThreeItemModel("وائلڈ لائف کا تقدس جہاں ہمیں ایشیٹک شیر ملتا ہے وہ ہے۔", "گر جنگل"));
        arrayList.add(new ThreeItemModel("دو کوڑے ہوئے اونٹ کو کہا جاتا ہے", "بیکٹیریا اونٹ"));
        arrayList.add(new ThreeItemModel("تتلیاں خاندان کے تحت آتی ہیں", "لیپیڈوپٹیرا"));
        arrayList.add(new ThreeItemModel("وہ مندر جس میں چوہوں کی تعظیم ، کھانا کھلایا اور حفاظت کی جاتی ہے وہ ہے", "راجستھان میں کرنیماتا"));
        arrayList.add(new ThreeItemModel("زمین کا سب سے تیز رفتار جانور ہے", "چیتا"));
        arrayList.add(new ThreeItemModel("زمین کا سب سے بڑا جانور ہے, "," بش کا ہاتھی "));
        arrayList.add(new ThreeItemModel("چوہا سانپ پائے جاتے ہیں", "جنوب مشرقی ایشیا"));
        arrayList.add(new ThreeItemModel("ایک عام پالتو جانور جو میٹھا کا ذائقہ نہیں اٹھا سکتا وہ ہے, ","کیٹ"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے چھوٹا ستندار جانور", "اٹرسکن شیرو (سنیوس اٹراسکاس)"));
        arrayList.add(new ThreeItemModel("وہ ستنداری جو سب سے اونچائی پر رہتی ہے", "ہاگ ناک والا بیٹ"));
        arrayList.add(new ThreeItemModel("بلی کے کنبے کا سب سے چھوٹا رکن ہے, ","بلی (Felis catus) "));
        arrayList.add(new ThreeItemModel("سب سے بڑا اڑن والا ستندار ہے", "چمگادڑ"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے بڑا ہرن ہے ","الاسکا موس"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے بھاری اڑنے والا پرندہ ہے, "," عظیم دربان"));
        arrayList.add(new ThreeItemModel("وہ پرندہ جس کے سب سے بڑے پروں کا دورانیہ ہوتا ہے وہ ہے", "البتروس"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جانا جاتا میڑک ہے", "ابھی"));
        arrayList.add(new ThreeItemModel("سب سے طویل نام سے جانا جاتا مینڈک ہے", "گولیتھ گروگ"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے طویل کیڑا ہی ہے", "ٹیجیئنٹ اسٹک کیڑے"));
        arrayList.add(new ThreeItemModel("دنیا میں سب سے تیزی سے چلنے والا کیڑے ہی", "اشنکٹبندیی کاکروچ"));
        arrayList.add(new ThreeItemModel("دیو اسٹیک کیڑے میں پایا جاتا ہے", "انڈونیشیا"));
        arrayList.add(new ThreeItemModel("ہندوستان میں بلیوں کی کتنی قسمیں ہیں", "پندرہ"));
        arrayList.add(new ThreeItemModel("دریا گھوڑے کے نام سے جانا جانے والا جانور ہے, ","ہپیپوٹیمس "));
        arrayList.add(new ThreeItemModel("ہاتھی کا تنے دراصل ایک ترمیم شدہ ہے", "ماہر"));
        arrayList.add(new ThreeItemModel("گوریلہ کی خوراک خالصتا is ہے", "سبزی خور"));
        arrayList.add(new ThreeItemModel("پستان دار جانوروں کی معلوم تعداد پرجاتی ہیں", "4230"));
        arrayList.add(new ThreeItemModel("وہ مچھلی جو اپنے پورے جسم کے ساتھ چکھا سکتی ہے وہ ہے", "کیٹفش"));
        arrayList.add(new ThreeItemModel("نیلی وہیل کا اوسط وزن", "1،20،000 کلو"));
        arrayList.add(new ThreeItemModel("ہندوستان میں سب سے زیادہ کھایا جانے والی مچھلی ہی ہے۔", "پومفریٹ"));
        arrayList.add(new ThreeItemModel("گھوںسلا بنانے والی واحد مچھلی ہی ہے", "اسٹیکلی بیک"));
        arrayList.add(new ThreeItemModel("مور کے ایک گروپ کو کہا جاتا ہے ", "مسٹر"));
        arrayList.add(new ThreeItemModel("سونے کی مچھلی اصل میں کی ہے", "چین"));
        arrayList.add(new ThreeItemModel("ریڈ پانڈا کو کے نام سے بھی جانا جاتا ہے ", "بلی ریچھ"));
        arrayList.add(new ThreeItemModel( "مادہ خرگوش کو کہا جاتا ہے ", "ڈو"));
        arrayList.add(new ThreeItemModel("ایک خاتون گھوڑے کو کہا جاتا ہے ", "بڑا"));
        arrayList.add(new ThreeItemModel("وہیل مچھلی سمجھی جاتی تھی ، در حقیقت ایک ہے", "ممالیہ"));
        arrayList.add(new ThreeItemModel("اونٹ میں غائب ہونے والا عضو ہے", "گال بلیڈر"));
        arrayList.add(new ThreeItemModel("ایک پرندہ جو دو سال میں صرف ایک انڈا دیتا ہے", "البتراس"));
        arrayList.add(new ThreeItemModel("واحد جانور جو اپنی پیٹھ پر سوتا ہے", "آدمی"));
        arrayList.add(new ThreeItemModel("واحد جانور جس کے چار گھٹنے ہیں", "ہاتھی"));
        arrayList.add(new ThreeItemModel("جو جانور گونگا ہے وہ ہے", "جراف"));
        arrayList.add(new ThreeItemModel("ایک عام پالتو جانور جو رنگ ہے - اندھا ہے, ","کتا"));
        arrayList.add(new ThreeItemModel("عقاب کے ایک گروہ کو کہا جاتا ہے ", "کانووکیشن"));
        arrayList.add(new ThreeItemModel("خروں کے ایک گروپ کو ایک کہا جاتا ہے", "یاد رکھنا"));
        arrayList.add(new ThreeItemModel("مچھلی کے ایک گروپ کو کہا جاتا ہے ", "شوال"));
        arrayList.add(new ThreeItemModel("گوریلوں کے ایک گروپ کو کہا جاتا ہے ", "بینڈ"));
        arrayList.add(new ThreeItemModel("ہاتھیوں کے ایک گروپ کو کہا جاتا ہے ", "ریوڑ"));
        arrayList.add(new ThreeItemModel("لڑکے کی عورت کو ایک کہا جاتا ہے", "ہند"));
        arrayList.add(new ThreeItemModel("گائے کے نر کو کہا جاتا ہے ", "بیل"));
        arrayList.add(new ThreeItemModel("ہاتھی کے جوان کو کہا جاتا ہے", "بچھڑا"));


        return arrayList;
    }


}
