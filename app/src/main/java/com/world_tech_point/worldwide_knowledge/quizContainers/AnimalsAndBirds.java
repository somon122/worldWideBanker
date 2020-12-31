package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class AnimalsAndBirds {

    private Context context;

    public AnimalsAndBirds(Context context) {
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


        arrayList.add(new ContentQuestionModel("Which animal exclusively eat only eucalyptus leaves and nothing else","Koala","Greater Glider","kangaroo","Common Wombat","Koala"));
        arrayList.add(new ContentQuestionModel("Which living bird lays the world's largest egg?","Eagle","Ostrich","Owl","Vulture","Ostrich"));
        arrayList.add(new ContentQuestionModel("Which of the following birds is the state bird of three Indian states ?","Great Hornbill","Greater Flamingo","Hill Mynah","Blue Jay (Indian Roller)","Blue Jay (Indian Roller)"));
        arrayList.add(new ContentQuestionModel("Which of the following is the National Aquatic animal of India?","Salt water crocodile","Sea Turtle","Dugong","Dolphin","Dolphin"));
        arrayList.add(new ContentQuestionModel("The first tiger reserve in India to officially introduce a mascot, which has been named Bhoorsingh the Barasingha is","Sunderbans Tiger Reserve","Bandhavgarh Tiger Reserve","Kanha Tiger Reserve","Corbett Tiger Reserve","Kanha Tiger Reserve"));
        arrayList.add(new ContentQuestionModel("The fish that can taste with its whole body is the","Captain","Finley","Moby","Catfish","Catfish"));
        arrayList.add(new ContentQuestionModel("For which one of the following snakes is the diet mainly composed of other snakes ?","Rattlesnake","King Cobra","Krait","Russel's viper","King Cobra"));
        arrayList.add(new ContentQuestionModel("How much water can be used by a camel in drinking in a single time ?","Up to 60 ltr.","Up to 80 ltr.","Up to 100 ltr.","Up to 120 ltr.","Up to 100 ltr."));
        arrayList.add(new ContentQuestionModel("Which bird can turn head around to look backward?","Ostrich","Hen","Eagle","Owl","Owl"));
        arrayList.add(new ContentQuestionModel("The fastest moving insect in the world is the","Moby","Finley","Captain","Tropical cockroach","Tropical cockroach"));
        arrayList.add(new ContentQuestionModel("What is the maximum running land speed of Crocodile ?","5 KMPL","15 KMPL","12 KMPL","17 KMPL","17 KMPL"));arrayList.add(new ContentQuestionModel("The country in which Yak is found","Mongolia","Nepal","Tibet","Vutan","Tibet"));
        arrayList.add(new ContentQuestionModel("Among the following animals , the figures of which are found in the state emblem of india?","Bull, deer and eagle","Deer and elephant","Elephant, Tiger and Bull","Horse and Bull","Horse and Bull"));

        arrayList.add(new ContentQuestionModel("Which animal do not make any sound?","Parrot","Cow","Goat","Giraffe ","Giraffe "));
        arrayList.add(new ContentQuestionModel("The bird which lays more than 100 eggs in one nest is","Dove","Magpie","Ostrich","Parrot","Ostrich"));
        arrayList.add(new ContentQuestionModel("Which of the following has no Skeleton at all?","Star fish","Sponge","Jelly fish","Silver fish","Jelly fish"));
        arrayList.add(new ContentQuestionModel("Which animal can create the loudest sound among any living creature?","Whale shark","Gibbon","Howler monkey","Humpback Whales","Humpback Whales"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not a true fish?","Silver fish","Saw fish","Hammer fish","Sucker fish","Sucker fish"));
        arrayList.add(new ContentQuestionModel("In which of the following kinds of organism is the phenomenon found wherein the female kills the male after copulation","Dragonfly","Honeybee","Spider","Pit viper","Honeybee"));
        arrayList.add(new ContentQuestionModel("What animal has the worst memory?","Dog","Rat","Elephant","Dolphin","Elephant"));
        arrayList.add(new ContentQuestionModel("Pashmina shawl is made from the hair of ","Sheep","Goat","Rabbit","Yak","Goat"));
        arrayList.add(new ContentQuestionModel("In which of the following groups animals bear no teeth ?","Peacock, Ostrich and Tortoise","Turtle, Kiwi and Cow","Owl, Loris and Crow","Alligator, Turtle and Tortoise","Peacock, Ostrich and Tortoise"));
        arrayList.add(new ContentQuestionModel("Name the bird that migrates from the north pole to the south pole and back?","Swallow","Arctic tern","Penguin","Crane","Arctic tern"));
        arrayList.add(new ContentQuestionModel("This animal fasts for about 8 months in a year and yet is active, gives birth, and nurses its young while fasting. Name the animal","Polar Bear","Frog","Reindeer","Lion","Polar Bear"));
        arrayList.add(new ContentQuestionModel("The Bhindawas Bird Sanctuary (BBS) is located in which state  ?","Madhya Pradesh","Bihar","Odisha","Haryana","Haryana"));
        arrayList.add(new ContentQuestionModel("In which of the following animals is respiration done by skin?","Flying fish","Sea horse","Frog","Chemeleon","Frog"));
        arrayList.add(new ContentQuestionModel("Name the only animal that dislikes white colour?","Buffellow","Horse","Deer","Tiger","Tiger"));
        arrayList.add(new ContentQuestionModel("Which of the following birds is the state bird of three indian states?","Hill Mynah","Greater Flamingo","Blue Jay( Indian Roller)","Great Hornbill","Blue Jay( Indian Roller)"));
        arrayList.add(new ContentQuestionModel("A bird which lays only one egg in two years is the","Dove","Parrot","Crow","Albatross","Albatross"));
        arrayList.add(new ContentQuestionModel("The only fish that makes nest is the","Captain","Jack","Bubbles.","Stickle back","Stickle back"));
        arrayList.add(new ContentQuestionModel("Which is the only snake that builds nests ?","King Cobra","Anaconda","Viper","Python","King Cobra"));
        arrayList.add(new ContentQuestionModel("The age of a lion can be determined from its","hair","nose","nails","tail","nose"));
        arrayList.add(new ContentQuestionModel("Which is the only snake that builds nests?","Viper","Anaconda","King Cobra","Python","King Cobra"));
        arrayList.add(new ContentQuestionModel("What is the fastest of all the birds?","Blood phesant","Swift","Sparrow","None","Swift"));
        arrayList.add(new ContentQuestionModel("Which is the longest snake in the world?","Black Mamba","Puff Adder","Reticulated Python","Anaconda","Reticulated Python"));
        arrayList.add(new ContentQuestionModel("Which of the following is the state animal of Chhattisgarh?","Wild Ass","Wild Buffalo","Blue Bull","Tiger","Wild Buffalo"));
        arrayList.add(new ContentQuestionModel("What animal has the highest blood pressure?","Rabbit","Lion","Elephant","Giraffe","Giraffe"));
        arrayList.add(new ContentQuestionModel("Niligiri Tahr is the state animal of which of the following states ?","Tamil Nadu","Karnataka","Kerala","Maharashtra","Tamil Nadu"));


        arrayList.add(new ContentQuestionModel("How many legs does a butterfly have?","2","6","4","8","6"));
        arrayList.add(new ContentQuestionModel("What kind of animal is a dhole ?","wild cat","wild ass","wild dog","wild buffalo","wild dog"));
        arrayList.add(new ContentQuestionModel("Which of the following has the largest eyes of all land mammals?","Horse","Camel","Elephant","Rhinocerous","Horse"));
        arrayList.add(new ContentQuestionModel("Which is the only bird that can fly backwards?","Sunbird","Kingfisher","Honey eater","Hummingbird","Hummingbird"));
        arrayList.add(new ContentQuestionModel("Which among the following have a 'mixed heart'?","Reptiles","Nematodes","Birds","Fishes","Reptiles"));
        arrayList.add(new ContentQuestionModel("The period after parturition in which animal produces milk is called as ___","Calving period","Lactation period","Dry period","Conception","Lactation period"));
        arrayList.add(new ContentQuestionModel("The dolphin is ","Fish","Reptile","Mammal","Turtle","Mammal"));
        arrayList.add(new ContentQuestionModel("What is the largest seabird ?","cormorant","blue shag","auklet","Albatross","Albatross"));
        arrayList.add(new ContentQuestionModel("What is a rhinos horn made of ?","Bones","Collagen","Fibroin","Kerotin","Kerotin"));
        arrayList.add(new ContentQuestionModel("Which is fastest swimming fish","Wheal","Finley","Catfish","sailfish","sailfish"));
        arrayList.add(new ContentQuestionModel("Which one of the following is not a true snake ?","Blind snake","Glass snake","Sea snake","Tree snake","Glass snake"));
        arrayList.add(new ContentQuestionModel("Kiwi is a native bird of Which of the following countries ?","South Africa","New zealand","Australia","Zimbabwe","New zealand"));

        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("কোন প্রাণী কোন শব্দ করে না?", "তোতা", "গরু", "ছাগল", "জিরাফ", "জিরাফ"));
        arrayList.add(new ContentQuestionModel("যে পাখি একটি বাসাতে 100 টিরও বেশি ডিম দেয়" ," ডোভ "," ম্যাগপি "," অস্ট্রিচ "," তোতা "," অস্ট্রিচ "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির কঙ্কালটির মোটেই নেই?", "স্টার ফিশ", "স্পঞ্জ", "জেলি ফিশ", "সিলভার ফিশ", "জেলি ফিশ"));
        arrayList.add(new ContentQuestionModel("কোন প্রাণী কোন জীবের মধ্যে সবচেয়ে উচ্চতর শব্দ তৈরি করতে পারে?", "তিমি হাঙ্গর", "গিবন", "হাওলার বানর", "হাম্পব্যাক তিমি", "হাম্পব্যাক তিমি"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সত্যিকারের মাছ নয়?", "সিলভার ফিশ", "সওয়া ফিশ", "হাতুড়ি মাছ", "সকার ফিশ", "সকার ফিশ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত ধরণের জীবের মধ্যে কোনটি দেখা যায় যে মহিলাগুলি সহবাসের পরে পুরুষকে হত্যা করে", "ড্রাগনফ্লাই", "হানিবি", "স্পাইডার", "পিট ভাইপার","হানিবি" ));
        arrayList.add(new ContentQuestionModel("কোন প্রাণীর স্মৃতি সবচেয়ে খারাপ?", "কুকুর", "ইঁদুর", "হাতি", "ডলফিন", "হাতি"));
        arrayList.add(new ContentQuestionModel("পশমিনা শাল -- এর চুল থেকে তৈরি", "ভেড়া", "ছাগল", "খরগোশ", "ইয়াক", "ছাগল"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত গ্রুপগুলির মধ্যে কোন প্রাণীতে দাঁত নেই?", "ময়ূর, অস্ট্রিচ এবং কচ্ছপ", "কচ্ছপ, কিউই এবং গরু", "আউল, লরিস এবং ক্রো", "অ্যালিগেটর, কচ্ছপ এবং কচ্ছপ", "ময়ূর, অস্ট্রিচ এবং কচ্ছপ"));
        arrayList.add(new ContentQuestionModel("উত্তর মেরু থেকে দক্ষিণ মেরু এবং পিছনে যে পাখি স্থানান্তরিত হয়েছে তার নাম দিন?", "গেলা", "আর্কটিক টার্ন", "পেঙ্গুইন", "ক্রেন", "আর্কটিক টার্ন"));
        arrayList.add(new ContentQuestionModel("এই প্রাণীটি বছরে প্রায় 8 মাস রোজা রাখে এবং এখনও সক্রিয় থাকে, রোজা রাখার সময় তার বাচ্চা জন্ম দেয় এবং নার্সদের জন্ম দেয় the প্রাণীর নাম রাখুন", "পোলার ভালুক", "ব্যাঙ", "রেইনডিয়ার", "সিংহ", "পোলার ভালুক"));
        arrayList.add(new ContentQuestionModel("ভিন্ডাবাস পাখি অভয়ারণ্য (বিবিএস) কোন রাজ্যে অবস্থিত?", "মধ্যপ্রদেশ", "বিহার", "ওড়িশা", "হরিয়ানা", "হরিয়ানা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত প্রাণীগুলির মধ্যে কোনটিতে ত্বক দ্বারা শ্বসন করা হয়?", "উড়ন্ত মাছ", "সমুদ্র ঘোড়া", "ব্যাঙ", "চিমেলিওন", "ব্যাঙ"));
        arrayList.add(new ContentQuestionModel("সাদা রঙ অপছন্দকারী একমাত্র প্রাণীর নাম রাখুন?", "বুফেও", "ঘোড়া", "হরিণ", "বাঘ", "বাঘ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তিনটি পাখির মধ্যে তিনটি ভারতের রাষ্ট্রের পাখি?", "হিল মায়না", "গ্রেটার ফ্ল্যামিংগো", "ব্লু জে (ইন্ডিয়ান রোলার)", "গ্রেট হর্নবিল", "ব্লু জে (ইন্ডিয়ান রোলার)"));
        arrayList.add(new ContentQuestionModel("একটি পাখি যা দু'বছরে মাত্র একটি ডিম দেয় হ'ল "," কবচ "," তোতা "," কাক "," আলব্যাট্রস "," আলব্যাট্রস "));
        arrayList.add(new ContentQuestionModel("কোন প্রাণী একচেটিয়াভাবে কেবল ইউক্যালিপটাস পাতা খায় এবং অন্য কিছু না", "কোয়ালা", "গ্রেটার গ্লাইডার", "ক্যাঙ্গারু", "কমন ওম্বাট", "কোয়ালা"));
        arrayList.add(new ContentQuestionModel("কোন জীবন্ত পাখি বিশ্বের বৃহত্তম ডিম দেয়?", "Agগল", "অস্ট্রিচ", "আউল", "শকুন", "অস্ট্রিচ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তিনটি পাখির মধ্যে তিনটি ভারতের রাষ্ট্রের পাখি?", "গ্রেট হর্নবিল", "গ্রেটার ফ্লেমিংগো", "হিল মায়না", "ব্লু জে (ইন্ডিয়ান রোলার)", "ব্লু জে (ইন্ডিয়ান রোলার)"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি ভারতের জাতীয় জলজ প্রাণী?", "নুনের জলের কুমির", "সমুদ্রের কচ্ছপ", "ডুগং", "ডলফিন", "ডলফিন"));
        arrayList.add(new ContentQuestionModel("ভারতের প্রথম টাইগার রিজার্ভ আনুষ্ঠানিকভাবে একটি মাস্কট চালু করার জন্য, যার নাম রাখা হয়েছে ভোরসিংহ বড়সিংহ", "সুন্দরবন টাইগার রিজার্ভ", "বান্ধবগড় টাইগার রিজার্ভ", "কানহা টাইগার রিজার্ভ", "কর্বেট টাইগার রিজার্ভ", "কানহা টাইগার রিজার্ভ"));
        arrayList.add(new ContentQuestionModel("যে মাছটি তার পুরো শরীরের সাথে স্বাদ নিতে পারে তা হ'ল", "ক্যাপ্টেন", "ফিনলে", "মবি", "ক্যাটফিশ", "ক্যাটফিশ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোন সাপের জন্য ডায়েট মূলত অন্যান্য সাপ নিয়ে গঠিত?", "রেটলসনেক", "কিং কোবরা", "ক্রেইট", "রাসেলের ভাইপার", "কিং কোবরা"));
        arrayList.add(new ContentQuestionModel("একবারে পান করতে উট দ্বারা কত জল ব্যবহার করতে পারে?", "60 লিটার পর্যন্ত।", "80 লিটার পর্যন্ত।", "100 লিটার পর্যন্ত।", "120 লিটার পর্যন্ত।" , "100 লিটার পর্যন্ত।"));
        arrayList.add(new ContentQuestionModel("কোন পাখি পিছনে দেখতে মাথা ঘুরতে পারে?", "অস্ট্রিচ", "মুরগী", "agগল", "আউল", "আউল"));
        arrayList.add(new ContentQuestionModel("বিশ্বের দ্রুততম চলমান পোকা হ'ল", "মুবি", "ফিনলে", "ক্যাপ্টেন", "ক্রান্তীয় তেলাপোকা", "ক্রান্তীয় তেলাপোকা"));
        arrayList.add(new ContentQuestionModel("কুমিরের সর্বাধিক চলমান ভূমির গতি কী?", "5 কেএমপিএল", "15 কেএমপিএল", "12 কেএমপিএল", "17 কেএমপিএল", "17 কেএমপিএল"));
        arrayList.add(new ContentQuestionModel("যে দেশে ইয়াক পাওয়া গেছে", "মঙ্গোলিয়া", "নেপাল", "তিব্বত", "ভুটান", "তিব্বত"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত প্রাণীগুলির মধ্যে ভারতের চিত্রগুলির মধ্যে কোনটির চিত্র পাওয়া যায়?", "ষাঁড়, হরিণ এবং agগল", "হরিণ এবং হাতি", "হাতি, বাঘ এবং ষাঁড়", "ঘোড়া এবং ষাঁড়", "ঘোড়া এবং ষাঁড়"));
        arrayList.add(new ContentQuestionModel("একটি প্রজাপতির কত পা আছে?", "2", "6", "4", "8", "6"));
        arrayList.add(new ContentQuestionModel("ধোল কি ধরণের প্রাণী?", "বন্য বিড়াল", "বন্য গাধা", "বন্য কুকুর", "বন্য মহিষ", "বন্য কুকুর"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি সমস্ত ভূমি স্তন্যপায়ী প্রাণীর চোখ সবচেয়ে বেশি?", "ঘোড়া", "উট", "হাতি", "গণ্ডার", "ঘোড়া"));

        arrayList.add(new ContentQuestionModel("কোন প্রাণী কোন শব্দ করে না?", "তোতা", "গরু", "ছাগল", "জিরাফ", "জিরাফ"));
        arrayList.add(new ContentQuestionModel("যে পাখি একটি বাসাতে 100 টিরও বেশি ডিম দেয়" ," ডোভ "," ম্যাগপি "," অস্ট্রিচ "," তোতা "," অস্ট্রিচ "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটির কঙ্কালটির মোটেই নেই?", "স্টার ফিশ", "স্পঞ্জ", "জেলি ফিশ", "সিলভার ফিশ", "জেলি ফিশ"));
        arrayList.add(new ContentQuestionModel("কোন প্রাণী কোন জীবের মধ্যে সবচেয়ে উচ্চতর শব্দ তৈরি করতে পারে?", "তিমি হাঙ্গর", "গিবন", "হাওলার বানর", "হাম্পব্যাক তিমি", "হাম্পব্যাক তিমি"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি সত্যিকারের মাছ নয়?", "সিলভার ফিশ", "সওয়া ফিশ", "হাতুড়ি মাছ", "সকার ফিশ", "সকার ফিশ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত ধরণের জীবের মধ্যে কোনটি দেখা যায় যে মহিলাগুলি সহবাসের পরে পুরুষকে হত্যা করে", "ড্রাগনফ্লাই", "হানিবি", "স্পাইডার", "পিট ভাইপার","হানিবি" ));
        arrayList.add(new ContentQuestionModel("কোন প্রাণীর স্মৃতি সবচেয়ে খারাপ?", "কুকুর", "ইঁদুর", "হাতি", "ডলফিন", "হাতি"));
        arrayList.add(new ContentQuestionModel("পশমিনা শাল -- এর চুল থেকে তৈরি", "ভেড়া", "ছাগল", "খরগোশ", "ইয়াক", "ছাগল"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত গ্রুপগুলির মধ্যে কোন প্রাণীতে দাঁত নেই?", "ময়ূর, অস্ট্রিচ এবং কচ্ছপ", "কচ্ছপ, কিউই এবং গরু", "আউল, লরিস এবং ক্রো", "অ্যালিগেটর, কচ্ছপ এবং কচ্ছপ", "ময়ূর, অস্ট্রিচ এবং কচ্ছপ"));
        arrayList.add(new ContentQuestionModel("উত্তর মেরু থেকে দক্ষিণ মেরু এবং পিছনে যে পাখি স্থানান্তরিত হয়েছে তার নাম দিন?", "গেলা", "আর্কটিক টার্ন", "পেঙ্গুইন", "ক্রেন", "আর্কটিক টার্ন"));
        arrayList.add(new ContentQuestionModel("এই প্রাণীটি বছরে প্রায় 8 মাস রোজা রাখে এবং এখনও সক্রিয় থাকে, রোজা রাখার সময় তার বাচ্চা জন্ম দেয় এবং নার্সদের জন্ম দেয় the প্রাণীর নাম রাখুন", "পোলার ভালুক", "ব্যাঙ", "রেইনডিয়ার", "সিংহ", "পোলার ভালুক"));
        arrayList.add(new ContentQuestionModel("ভিন্ডাবাস পাখি অভয়ারণ্য (বিবিএস) কোন রাজ্যে অবস্থিত?", "মধ্যপ্রদেশ", "বিহার", "ওড়িশা", "হরিয়ানা", "হরিয়ানা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত প্রাণীগুলির মধ্যে কোনটিতে ত্বক দ্বারা শ্বসন করা হয়?", "উড়ন্ত মাছ", "সমুদ্র ঘোড়া", "ব্যাঙ", "চিমেলিওন", "ব্যাঙ"));
        arrayList.add(new ContentQuestionModel("সাদা রঙ অপছন্দকারী একমাত্র প্রাণীর নাম রাখুন?", "বুফেও", "ঘোড়া", "হরিণ", "বাঘ", "বাঘ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তিনটি পাখির মধ্যে তিনটি ভারতের রাষ্ট্রের পাখি?", "হিল মায়না", "গ্রেটার ফ্ল্যামিংগো", "ব্লু জে (ইন্ডিয়ান রোলার)", "গ্রেট হর্নবিল", "ব্লু জে (ইন্ডিয়ান রোলার)"));
        arrayList.add(new ContentQuestionModel("একটি পাখি যা দু'বছরে মাত্র একটি ডিম দেয় হ'ল "," কবচ "," তোতা "," কাক "," আলব্যাট্রস "," আলব্যাট্রস "));
        arrayList.add(new ContentQuestionModel("কোন প্রাণী একচেটিয়াভাবে কেবল ইউক্যালিপটাস পাতা খায় এবং অন্য কিছু না", "কোয়ালা", "গ্রেটার গ্লাইডার", "ক্যাঙ্গারু", "কমন ওম্বাট", "কোয়ালা"));
        arrayList.add(new ContentQuestionModel("কোন জীবন্ত পাখি বিশ্বের বৃহত্তম ডিম দেয়?", "Agগল", "অস্ট্রিচ", "আউল", "শকুন", "অস্ট্রিচ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তিনটি পাখির মধ্যে তিনটি ভারতের রাষ্ট্রের পাখি?", "গ্রেট হর্নবিল", "গ্রেটার ফ্লেমিংগো", "হিল মায়না", "ব্লু জে (ইন্ডিয়ান রোলার)", "ব্লু জে (ইন্ডিয়ান রোলার)"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটি ভারতের জাতীয় জলজ প্রাণী?", "নুনের জলের কুমির", "সমুদ্রের কচ্ছপ", "ডুগং", "ডলফিন", "ডলফিন"));
        arrayList.add(new ContentQuestionModel("ভারতের প্রথম টাইগার রিজার্ভ আনুষ্ঠানিকভাবে একটি মাস্কট চালু করার জন্য, যার নাম রাখা হয়েছে ভোরসিংহ বড়সিংহ", "সুন্দরবন টাইগার রিজার্ভ", "বান্ধবগড় টাইগার রিজার্ভ", "কানহা টাইগার রিজার্ভ", "কর্বেট টাইগার রিজার্ভ", "কানহা টাইগার রিজার্ভ"));
        arrayList.add(new ContentQuestionModel("যে মাছটি তার পুরো শরীরের সাথে স্বাদ নিতে পারে তা হ'ল", "ক্যাপ্টেন", "ফিনলে", "মবি", "ক্যাটফিশ", "ক্যাটফিশ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোন সাপের জন্য ডায়েট মূলত অন্যান্য সাপ নিয়ে গঠিত?", "রেটলসনেক", "কিং কোবরা", "ক্রেইট", "রাসেলের ভাইপার", "কিং কোবরা"));
        arrayList.add(new ContentQuestionModel("সিংহের বয়স নির্ধারণ করা যায় এর", "চুল", "নাক", "নখ", "লেজ", "নাক"));
        arrayList.add(new ContentQuestionModel("বাসা বানায় এমন একমাত্র সাপ কোনটি?", "ভাইপার", "অ্যানাকোন্ডা", "কিং কোবরা", "পাইথন", "কিং কোবরা"));
        arrayList.add(new ContentQuestionModel("সমস্ত পাখির মধ্যে দ্রুততম কোনটি?", "ব্লাড ফেসেন্ট", "সুইফ্ট", "স্প্যারো", "কিছুই নয়", "সুইফ্ট"));
        arrayList.add(new ContentQuestionModel("বিশ্বের দীর্ঘতম সাপটি কোনটি?", "ব্ল্যাক মাম্বা", "পাফ অ্যাড্ডার", "রেটিকুলেটেড পাইথন", "আনাকোন্ডা", "রেটিকুলেটেড পাইথন"));
        arrayList.add(new ContentQuestionModel("ছত্তিশগড়ের রাজ্য প্রাণী নীচের মধ্যে কোনটি?", "ওয়াইল্ড অ্যাস", "বন্য মহিষ", "ব্লু বুল", "বাঘ", "বন্য মহিষ"));
        arrayList.add(new ContentQuestionModel("কোন প্রাণীর সর্বোচ্চ রক্তচাপ আছে?", "খরগোশ", "সিংহ", "হাতি", "জিরাফ", "জিরাফ"));
        arrayList.add(new ContentQuestionModel("নীলিগিরি তাহর নিম্নলিখিত কোন রাজ্যের রাজ্য প্রাণী?", "তামিলনাড়ু", "কর্ণাটক", "কেরাল", "মহারাষ্ট্র", "তামিলনাড়ু"));


        arrayList.add(new ContentQuestionModel("কোন একমাত্র পাখি পিছনে উড়তে পারে?", "সানবার্ড", "কিংফিশার", "মধু খাওয়া", "হামিংবার্ড", "হামিংবার্ড"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে 'মিশ্র হৃদয়' রয়েছে?", "সরীসৃপ", "নেমাটোডস", "পাখি", "ফিশ", "সরীসৃপ"));
        arrayList.add(new ContentQuestionModel("পশুর ভাগের পরে যে সময়টিতে প্রাণী দুধ উত্পাদন করে তাকে ___", "শুকানোর সময়", "স্তন্যদানের সময়", "শুকনো সময়", "গর্ভধারণ", "স্তন্যদানের সময়"));
        arrayList.add(new ContentQuestionModel("ডলফিন হ'ল", "ফিশ", "সরীসৃপ", "স্তন্যপায়ী", "কচ্ছপ", "স্তন্যপায়ী"));
        arrayList.add(new ContentQuestionModel("বৃহত্তম সামুদ্রিক বার্ড কী?", "করমোরেন্ট", "নীল শাগ", "আউলেট", "আলব্যাট্রস", "আলব্যাট্রস"));
        arrayList.add(new ContentQuestionModel("গন্ডার শিং কী দিয়ে তৈরি?", "হাড়", "কোলাজেন", "ফাইব্রোইন", "কেরোটিন", "কেরোটিন"));
        arrayList.add(new ContentQuestionModel("যা দ্রুততম সাঁতার মাছ", "হুইল", "ফিনলে", "ক্যাটফিশ", "সেলফিশ", "সেলফিশ"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত কোনটি সত্যিকারের সাপ নয়?", "অন্ধ সাপ", "কাঁচের সাপ", "সমুদ্রের সাপ", "গাছের সাপ", "কাঁচের সাপ"));
        arrayList.add(new ContentQuestionModel("কিভি নিম্নলিখিত দেশগুলির একটি দেশীয় পাখি?", "দক্ষিণ আফ্রিকা", "নিউজিল্যান্ড", "অস্ট্রেলিয়া", "জিম্বাবুয়ে", "নিউজিল্যান্ড"));
        arrayList.add(new ContentQuestionModel("বাসা তৈরি করে এমন একমাত্র মাছ হ'ল", "ক্যাপ্টেন", "জ্যাক", "বুদবুদ।", "স্টিকল ব্যাক", "স্টিকল ব্যাক"));
        arrayList.add(new ContentQuestionModel("বাসা তৈরির একমাত্র সাপ কোনটি?", "কিং কোবরা", "অ্যানাকোন্ডা", "ভাইপার", "পাইথন", "কিং কোবরা"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("कौन सा जानवर कोई आवाज़ नहीं करता है?", "तोता", "गाय", "बकरी", "जिराफ़", "जिराफ़"));
        arrayList.add(new ContentQuestionModel("पक्षी जो एक घोंसले में 100 से अधिक अंडे देता है", "कबूतर", "मैगपाई", "शुतुरमुर्ग", "तोता", "शुतुरमुर्ग"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसके पास कोई कंकाल नहीं है?", "स्टार फिश", "स्पंज", "जेली फिश", "सिल्वर फिश", "जेली फिश"));
        arrayList.add(new ContentQuestionModel("कौन सा जानवर किसी भी जीवित प्राणी के बीच सबसे तेज ध्वनि पैदा कर सकता है?", "व्हेल शार्क", "गिब्बन", "हॉवलर बंदर", "हंपबैक व्हेल्स", "हंपबैक व्हेल्स"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सच्ची मछली नहीं है?", "सिल्वर फिश", "सॉ फिश", "हैमर फिश", "सक्कर फिश", "सक्कर फिश"));
        arrayList.add(new ContentQuestionModel("निम्न में से किस प्रकार के जीव में वह घटना पाई जाती है जिसमें मादा मैथुन के बाद नर को मारती है", "ड्रैगनफली", "हनीबी", "स्पाइडर", "पिट वाइपर", "हनीबी"));
        arrayList.add(new ContentQuestionModel("किस जानवर की सबसे खराब स्मृति है?", "कुत्ता", "चूहा", "हाथी", "डॉल्फिन", "हाथी"));
        arrayList.add(new ContentQuestionModel("पश्मीना शॉल --  के बालों से बनाया गया है", "भेड़", "बकरी", "खरगोश", "याक", "बकरी"));
        arrayList.add(new ContentQuestionModel("निम्न में से किस समूह में जानवर बिना दाँत के रहते हैं?", "मोर, शुतुरमुर्ग और कछुआ", "कछुआ, कीवी और गाय", "उल्लू, लोरिस और कौवा", "मगरमच्छ, कछुआ और कछुआ", "मोर, शुतुरमुर्ग और कछुआ"));
        arrayList.add(new ContentQuestionModel("उस पक्षी का नाम बताइए जो उत्तरी ध्रुव से दक्षिणी ध्रुव की और वापस जाता है?", "निगल", "आर्कटिक टर्न", "पेंगुइन", "क्रेन", "आर्कटिक टर्न"));
        arrayList.add(new ContentQuestionModel("यह जानवर एक वर्ष में लगभग 8 महीने तक उपवास करता है और फिर भी सक्रिय है, जन्म देता है और उपवास करते हुए अपने युवा का पालन-पोषण करता है। जानवर का नाम", "ध्रुवीय भालू", "मेंढक", "हिरन", "शेर", "ध्रुवीय भालू"));
        arrayList.add(new ContentQuestionModel("भिंडावास पक्षी अभयारण्य (BBS) किस राज्य में स्थित है?", "मध्य प्रदेश", "बिहार", "ओडिशा", "हरियाणा", "हरियाणा"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किस जानवर में त्वचा द्वारा किया गया श्वसन है?", "फ्लाइंग फिश", "मेंढक", "फ्रॉग", "चेम्लेन", "मेंढक"));
        arrayList.add(new ContentQuestionModel("एकमात्र जानवर का नाम बताइए जो सफेद रंग को नापसंद करता है?", "बफ़ेलो", "हार्स", "हिरण", "टाइगर", "टाइगर"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा पक्षी तीन भारतीय राज्यों का राज्य पक्षी है?", "हिल मैना", "ग्रेटर फ्लेमिंगो", "ब्लू जे (इंडियन रोलर)", "ग्रेट हॉर्नबिल", "ब्लू जे (इंडियन रोलर)"));
        arrayList.add(new ContentQuestionModel("एक पक्षी जो दो वर्षों में केवल एक अंडा देता है", "कबूतर", "तोता", "कौवा", "अल्बाट्रॉस", "अल्बाट्रॉस"));
        arrayList.add(new ContentQuestionModel("कौन सा जानवर विशेष रूप से केवल नीलगिरी के पत्तों को खाता है और कुछ नहीं", "कोआला", "ग्रेटर ग्लाइडर", "कंगारू", "कॉमन वॉम्बैट", "कोआला"));
        arrayList.add(new ContentQuestionModel("कौन सा जीवित पक्षी दुनिया का सबसे बड़ा अंडा देता है?", "ईगल", "शुतुरमुर्ग", "उल्लू", "गिद्ध", "शुतुरमुर्ग"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा पक्षी तीन भारतीय राज्यों का राज्य पक्षी है?", "ग्रेट हॉर्नबिल", "ग्रेटर फ्लेमिंगो", "हिल माइना", "ब्लू जे (इंडियन रोलर)", "ब्लू जे (इंडियन रोलर)"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन भारत का राष्ट्रीय जलीय जानवर है?", "खारे पानी का मगरमच्छ", "समुद्री कछुआ", "डुगॉन्ग", "डॉल्फिन", "डॉल्फिन"));
        arrayList.add(new ContentQuestionModel("भारत में आधिकारिक रूप से शुभंकर पेश करने वाला पहला बाघ अभयारण्य जिसे भोरसिंह द बारासिंघ नाम दिया गया है","सुंदरबन टाइगर रिजर्व", "बांधवगढ़ टाइगर रिजर्व", "कान्हा टाइगर रिजर्व", "कॉर्बेट टाइगर रिजर्व", "कान्हा टाइगर रिजर्व"));
        arrayList.add(new ContentQuestionModel("मछली जो अपने पूरे शरीर के साथ स्वाद ले सकती है", "कप्तान", "फिनाले", "मोबी", "कैटफ़िश", "कैटफ़िश"));
        arrayList.add(new ContentQuestionModel("जिसके लिए निम्न में से एक सांप मुख्य रूप से अन्य सांपों से बना आहार है?", "रैटलस्नेक", "किंग कोबरा", "क्रेट", "रसेल वाइपर", "किंग कोबरा"));
        arrayList.add(new ContentQuestionModel("एक समय में पीने पर ऊंट द्वारा कितना पानी का उपयोग किया जा सकता है?", "60 लीटर तक।", "80 लीटर तक।", "100 लीटर तक।", "120 लीटर तक।" , "100 लीटर तक।"));
        arrayList.add(new ContentQuestionModel("कौन सा पक्षी पीछे की ओर देखने के लिए सिर घुमा सकता है?", "शुतुरमुर्ग", "मुर्गी", "ईगल", "उल्लू", "उल्लू"));
        arrayList.add(new ContentQuestionModel("दुनिया में सबसे तेज चलने वाला कीट", "मोबी", "फिनाले", "कैप्टन", "ट्रॉपिकल कॉकरोच", "ट्रॉपिकल कॉकरोच"  ));
        arrayList.add(new ContentQuestionModel("क्रोकोडाइल की अधिकतम चलने वाली भूमि की गति क्या है?", "5 KMPL", "15 KMPL", "12 KMPL", "17 KMPL", "17 KMPL"));
        arrayList.add(new ContentQuestionModel("जिस देश में याक पाए जाते हैं", "मंगोलिया", "नेपाल", "तिब्बत", "वूटान", "नेपाल"));//28
        arrayList.add(new ContentQuestionModel("निम्नलिखित जानवरों में, जिनमें से आंकड़े भारत के राज्य प्रतीक में पाए जाते हैं?", "बुल, हिरण और चील", "हिरण और हाथी", "हाथी, बाघ और बैल", "घोड़ा और बैल", "घोड़ा और बैल"));
        arrayList.add(new ContentQuestionModel("एक तितली के कितने पैर होते हैं?", "2", "6", "4", "8", "6"));
        arrayList.add(new ContentQuestionModel("किस प्रकार का जानवर एक ढोल है?", "जंगली बिल्ली", "जंगली गधा", "जंगली कुत्ता", "जंगली भैंस", "जंगली कुत्ता"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसके पास सभी भूमि स्तनधारियों की सबसे बड़ी आंखें हैं?", "हार्स", "कैमल", "एलीफेंट", "घोड़ा", "घोड़ा"));
        arrayList.add(new ContentQuestionModel("कौन सा एकमात्र पक्षी है जो पीछे की ओर उड़ सकता है?", "सनबर्ड", "किंगफ़िशर", "हनी ईटर", "हमिंगबर्ड", "हमिंगबर्ड"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसके पास 'मिश्रित हृदय' है?", "सरीसृप", "नेमाटोड्स", "पक्षी", "मछलियां", "सरीसृप"));
        arrayList.add(new ContentQuestionModel("विभाजन के बाद की अवधि जिसमें पशु दूध का उत्पादन करता है, उसे ___    कहा जाता है।", "कैल्विंग पीरियड", "स्तनपान अवधि", "शुष्क काल", "गर्भाधान", "स्तनपान अवधि"));
        arrayList.add(new ContentQuestionModel("डॉल्फिन", "मछली", "सरीसृप", "स्तनपायी", "कछुआ", "स्तनपायी" ));
        arrayList.add(new ContentQuestionModel("सबसे बड़ा सीबर्ड क्या है?", "कॉर्मोरेंट", "ब्लू शैग", "एंकलेट", "अल्बाट्रोस", "अल्बाट्रोस"));
        arrayList.add(new ContentQuestionModel("गैंडे का सींग क्या होता है?", "हड्डियों", "कोलेजन", "फाइब्रोइन", "केरोटिन", "केरोटिन"));
        arrayList.add(new ContentQuestionModel("जो सबसे तेज तैरने वाली मछली है", "गेहूं", "फिनाले", "कैटफ़िश", "जेलफ़िश", "जेलफ़िश"));//39
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा एक सच्चा साँप नहीं है?", "ब्लाइंड स्नेक", "ग्लास स्नेक", "सी स्नेक", "ट्री स्नेक", "ग्लास स्नेक"));
        arrayList.add(new ContentQuestionModel("कीवी निम्नलिखित में से किस देश का मूल पक्षी है?", "दक्षिण अफ्रीका", "न्यू ज़ीलैंड", "ऑस्ट्रेलिया", "ज़िम्बाब्वे", "न्यू ज़ीलैंड"));
        arrayList.add(new ContentQuestionModel("घोंसला बनाने वाली एकमात्र मछली", "कप्तान", "जैक", "बुलबुले", "स्टिक बैक", "स्टिक बैक" ));
        arrayList.add(new ContentQuestionModel("कौन सा एकमात्र साँप है जो घोंसले बनाता है?", "किंग कोबरा", "एनाकोंडा", "वाइपर", "पायथन", "किंग कोबरा"));
        arrayList.add(new ContentQuestionModel("एक शेर की उम्र उसके", "बाल", "नाक", "नाखून", "पूंछ", "बाल"));
        arrayList.add(new ContentQuestionModel("कौन सा एकमात्र साँप है जो घोंसले बनाता है?", "वाइपर", "एनाकोंडा", "किंग कोबरा", "पायथन", "किंग कोबरा"));
        arrayList.add(new ContentQuestionModel("सभी पक्षियों में सबसे तेज क्या है?", "रक्त phesant", "स्विफ्ट", "स्पैरो", "कोई नहीं", "स्विफ्ट"));
        arrayList.add(new ContentQuestionModel("दुनिया का सबसे लंबा सांप कौन सा है?", "ब्लैक माम्बा", "पफ एडडर", "रेटिकुलेटेड पायथन", "एनाकोंडा", "रेटिकुलेटेड पायथन"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन छत्तीसगढ़ का राज्य पशु है?", "वाइल्ड ऐस", "वाइल्ड बफेलो", "ब्लू बुल", "टाइगर", "वाइल्ड बफेलो"));
        arrayList.add(new ContentQuestionModel("किस जानवर का रक्तचाप सबसे अधिक है?", "खरगोश", "शेर", "हाथी", "जिराफ", "जिराफ"));
        arrayList.add(new ContentQuestionModel("नीलगिरि तहर निम्नलिखित में से किस राज्य का पशु है?", "तमिलनाडु", "कर्नाटक", "केरल", "महाराष्ट्र", "तमिलनाडु"));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("کون سا جانور کوئی آواز نہیں اٹھاتا؟" , "طوطا" , "گائے" , "بکرا" , "جراف","جراف"));
        arrayList.add(new ContentQuestionModel("وہ پرندہ جو ایک گھونسلے میں 100 سے زیادہ انڈے دیتا ہے" ,"کبوتر" , "میگپی" , "شوترمرغ" , "طوطا","شوترمرغ"));//2
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کسی کے پاس بھی کنکال نہیں ہے؟" , "اسٹار فش" , "سپنج" , "جیلی فش", "سلور فش","جیلی فش"));
        arrayList.add(new ContentQuestionModel("کون سا جانور کسی بھی زندہ مخلوق کے درمیان تیز آواز پیدا کرسکتا ہے؟", "وہیل شارک" , "گبن" , "ہولر بندر","ہمپ بیک وہیل","ہمپ بیک وہیل"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی مچھلی نہیں ہے؟" , "سلور فش", "سو مچھلی" , "ہتھوڑا مچھلی" , "سوکر مچھلی","سوکر مچھلی"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس قسم کے حیاتیات میں یہ پائے جانے والا رجحان پایا جاتا ہے جس میں مادہ مرد کے بعد مردے کو مار دیتی ہے" , "شہد کی مکھی" ,"ہنیبی" ,"مکڑی" , "پٹ وائپر","شہد کی مکھی"));//6
        arrayList.add(new ContentQuestionModel("کس جانور کی خراب ترین میموری ہے؟" , "ڈاگ" , "چوہا" , "ہاتھی" , "ڈالفن","ہاتھی"));
        arrayList.add(new ContentQuestionModel("پشمینہ شال کے بالوں سے بنی ہے","بھیڑ" , "بکرا" ,"خرگوش" , "یاک","بکرا"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس گروپ میں جانور دانت نہیں رکھتے ہیں؟" , "مور ، شوترمرگ اور کچھوا", "کچھی ، کیوی اور گائے" , "اللو ، لورس اور کوہ" ,"الیگیٹر ، کچھی اور کچھی","مور ، شوترمرگ اور کچھوا"));//9
        arrayList.add(new ContentQuestionModel("اس پرندے کا نام بتائیں جو شمالی قطب سے جنوبی قطب اور پیچھے کی طرف ہجرت کرتا ہے؟" , "نگل" , "آرکٹک ٹرن" , "پینگوئن" , "کرین","آرکٹک ٹرن"));
        arrayList.add(new ContentQuestionModel("یہ جانور ایک سال میں تقریبا 8 8 ماہ تک روزہ رکھتا ہے اور پھر بھی فعال ہے ، اسے جنم دیتا ہے ، اور روزے کی حالت میں اس کی جوان نرسیں دیتا ہے۔ جانور کا نام" , "پولر بیئر" , "قطبی ریچھ" , "قطبی ہرن" , "شیر","قطبی ریچھ"));//11
        arrayList.add(new ContentQuestionModel("بھنڈاوس برڈ سینکچرری (بی بی ایس) کس ریاست میں واقع ہے؟" , "مدھیہ پردیش" , "بہار" , "اڈیشہ" ,"ہریانہ","ہریانہ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس جانور میں جلد کے ذریعہ سانس لیا جاتا ہے؟" , "اڑتی ہوئی مچھلی" , "سمندری گھوڑا" , "مینڈک" , "گریل","مینڈک"));//13
        arrayList.add(new ContentQuestionModel("واحد جانور کا نام بتائیں جو سفید رنگ کو ناپسند کرتا ہے؟" , "بوفی" , "چیتا" , "ہرن" , "شیر","چیتا"));//14
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا پرندہ تین ہندوستانی ریاستوں کا ریاستی پرندہ ہے؟", "ہل مینا" , "گریٹر فلیمنگو" , "بلیو جے (انڈین رولر)", "گریٹ ہورنبل","بلیو جے (انڈین رولر)"));
        arrayList.add(new ContentQuestionModel("ایک پرندہ جو دو سال میں صرف ایک انڈا دیتا ہے وہ ہے" , "کبوتر" , "طوطا" , "کوا" , "البتراس","البتراس"));//16
        arrayList.add(new ContentQuestionModel("کونسا جانور خصوصی طور پر صرف یوکلپٹس کے پتے کھاتا ہے اور کچھ نہیں" , "کوآلا" , "گریٹر گلائڈر" , "کنگارو", "کامن وومبیٹ","کوآلا"));
        arrayList.add(new ContentQuestionModel("کون سا زندہ پرندہ دنیا کا سب سے بڑا انڈا دیتا ہے؟" , "ایگل" , "شوترمرغ" , "اللو" , "گدھ","شوترمرغ"));//18
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا پرندہ تین ہندوستانی ریاستوں کا ریاستی پرندہ ہے؟" , "گریٹ ہورن بل" , "گریٹر فلیمنگو" , "ہل مینا" , "بلیو جے (انڈین رولر)","بلیو جے (انڈین رولر)"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا ہندوستان کا قومی آبی جانور ہے؟" , "نمک کا پانی مگرمچھ" , "سمندری کچھی" , "ڈوگونگ", "ڈولفن","ڈولفن"));//20
        arrayList.add(new ContentQuestionModel("ہندوستان میں پہلا ٹائیگر ریزرو جس نے باقاعدہ طور پر ایک شوبنکر کو متعارف کرایا ، جس کا نام بوراسنگھ باراسنگا رکھا گیا ہے۔","سندربنس ٹائیگر ریزرو" , "بندھا گڑھ ٹائیگر ریزرو" , "کانہا ٹائیگر ریزرو" , "کاربیٹ ٹائیگر ریزرو","کانہا ٹائیگر ریزرو"));
        arrayList.add(new ContentQuestionModel("وہ مچھلی جو اپنے پورے جسم کے ساتھ ذائقہ لے سکتی ہے وہ ہے" , "کیپٹن" , "فنلی" , "موبی" , "کیٹفش","کیٹفش"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے ایک سانپ کس کے لئے بنیادی طور پر دوسرے سانپوں پر مشتمل غذا ہے؟" , "رتلسناک" , "کنگ کوبرا" , "کرائٹ" , "رسل کا وائپر","کنگ کوبرا"));
        arrayList.add(new ContentQuestionModel("اونٹ ایک ہی وقت میں پینے میں کتنا پانی استعمال کرسکتا ہے؟", "60 لیٹر تک۔" , "80 لیٹر تک۔" , "100 لیٹر تک۔" , "120 لیٹر تک۔","100 لیٹر تک۔"));
        arrayList.add(new ContentQuestionModel("کون سا پرندہ پیچھے کی طرف دیکھنے کے لئے سر پھر سکتا ہے؟" , "شوترمرگ" , "مرغی" , "ایگل" , "اللو","اللو"));
        arrayList.add(new ContentQuestionModel("دنیا میں سب سے تیز رفتار حرکت کرنے والا کیڑے" , "موبی" , "فنلی", "کپتان" , "اشنکٹبندیی کاکروچ" ,"اشنکٹبندیی کاکروچ"));
        arrayList.add(new ContentQuestionModel("مگرمچھ کی زیادہ سے زیادہ چلنے والی زمین کی رفتار کتنی ہے؟" , "5 کے ایم پی ایل", "15 کے ایم پی ایل" , "12 کے ایم پی ایل" , "17 کے ایم پی ایل","17 کے ایم پی ایل"));
        arrayList.add(new ContentQuestionModel("جس ملک میں یاک مل گیا ہے" , "منگولیا" , "نیپال" , "تبت" , "وتن","تبت"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل جانوروں میں سے ، کے اعداد و شمار ہندوستان کے ریاستی نشان میں پائے جاتے ہیں؟" ,"بیل ، ہرن اور عقاب" , "ہرن اور ہاتھی" , "ہارس اینڈ بل" , "گھوڑا اور بچھ" ,"ہارس اینڈ بل"));//29
        arrayList.add(new ContentQuestionModel("تتلی کی کتنی ٹانگیں ہیں؟" , "2" , "6" , "4" , "8","6"));
        arrayList.add(new ContentQuestionModel("ڈھول کس طرح کا جانور ہے؟" , "جنگلی بلی" , "جنگلی گدا" , "جنگلی کتا" , "جنگلی بھینس","جنگلی کتا"));
        arrayList.add(new ContentQuestionModel("زمین کے تمام ستنداریوں کی سب سے بڑی آنکھیں مندرجہ ذیل میں سے کون ہے؟" , "گھوڑا" , "اونٹ" ,"ہاتھی" , "گینڈے","گھوڑا"));
        arrayList.add(new ContentQuestionModel("کون سا واحد پرندہ ہے جو پیچھے کی طرف اڑ سکتا ہے؟" , "سنبرڈ" , "کنگ فشر" , "رینگنے والے جانور" , "ہمنگ برڈ","ہمنگ برڈ"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس کا مخلوط دل ہے؟" , "ریپٹائلس" , "رینگنے والے جانور" , "پرندے" , "مچھلیاں","رینگنے والے جانور"));//34
        arrayList.add(new ContentQuestionModel("حصurہ بندی کے بعد جس دور میں جانور دودھ پیدا کرتا ہے اس کو ___" , "بچھڑوں کی مدت" , "دودھ پلانے کی مدت" , "خشک مدت" , "تصور","دودھ پلانے کی مدت"));
        arrayList.add(new ContentQuestionModel("ڈالفن ہے" , "مچھلی" , "رینگنے والے جانور" , "ممالیہ" , "کچھی","ممالیہ"));
        arrayList.add(new ContentQuestionModel("سب سے بڑا سمندری فرڈ کونسا ہے؟" , "کورورانٹ" , "بلیو شگ", "آکلٹ" , "البتراس","البتراس"));
        arrayList.add(new ContentQuestionModel("رائونوس سینگ کیا ہوتا ہے؟" , "ہڈیوں" , "کولیجن" , "فائبروین" , "کیروٹین","کیروٹین"));
        arrayList.add(new ContentQuestionModel("جو تیز تر تیاری کرنے والی مچھلی ہے" , "وہیل" , "فنلے" , "کیٹفش" , "سیلفش","سیلفش"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا سچا سانپ نہیں ہے؟" , "بلائنڈ سانپ" , "شیشے کا سانپ", "سمندر کا سانپ" , "درخت کا سانپ","شیشے کا سانپ"));
        arrayList.add(new ContentQuestionModel("کیوی مندرجہ ذیل میں سے کون سا ملک کا آبائی پرندہ ہے؟" , "جنوبی افریقہ" , "نیوزی لینڈ" , "آسٹریلیا" , "زمبابوے","نیوزی لینڈ"));
        arrayList.add(new ContentQuestionModel("گھوںسلا بنانے والی واحد مچھلی" , "کیپٹن" , "جیک" , "بلبلوں" ,"اسٹیکلی بیک"   ,"اسٹیکلی بیک"));
        arrayList.add(new ContentQuestionModel("کون سا واحد سانپ ہے جو گھوںسلے بناتا ہے؟" ,"کنگ کوبرا" , "ایناکونڈا" , "وائپر" , "ازگر","کنگ کوبرا"));
        arrayList.add(new ContentQuestionModel("کون سا واحد سانپ ہے جو گھوںسلے بناتا ہے؟" , "وائپر" , "ایناکونڈا" , "کنگ کوبرا" , "ازگر","کنگ کوبرا"));
        arrayList.add(new ContentQuestionModel("کون سا واحد سانپ ہے جو گھوںسلے بناتا ہے؟" , "وائپر" , "ایناکونڈا" , "کنگ کوبرا" , "ازگر","کنگ کوبرا"));
        arrayList.add(new ContentQuestionModel("تمام پرندوں میں سب سے تیز رفتار کیا ہے؟" , "بلڈ فیسنٹ" , "سوئفٹ" ,"تیز رو" , "کوئی نہیں","تیز رو"));//46
        arrayList.add(new ContentQuestionModel("دنیا کا سب سے لمبا سانپ کونسا ہے؟" , "بلیک مامبا" , "جال کا اژدہا" , "ریٹیکولیٹڈ ازگر" , "ایناکونڈا","جال کا اژدہا"));//47
        arrayList.add(new ContentQuestionModel("چھتیس گڑھ کا ریاستی جانور مندرجہ ذیل میں سے کون سا ہے؟" , "وائلڈ گدا" , "وائلڈ بھینس" , "بلیو بل" , "ٹائیگر","وائلڈ بھینس"));
        arrayList.add(new ContentQuestionModel("کس جانور میں بلڈ پریشر سب سے زیادہ ہے؟" , "خرگوش" , "شیر", "ہاتھی" , "جراف","جراف"));
        arrayList.add(new ContentQuestionModel("نیلگیری طہر مندرجہ ذیل میں سے کس ریاست کا ریاستی جانور ہے؟" , "تمل ناڈو" , "کرناٹک" , "کیرالہ" , "مہاراشٹرا","تمل ناڈو"));




        return arrayList;


    }


}