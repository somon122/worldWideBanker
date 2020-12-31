package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class WorldHistory {

    private Context context;

    public WorldHistory(Context context) {
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

         arrayList.add(new ContentQuestionModel("Who discovered the North Pole?","Captain James","Magellan","Amundsen","Robert Peary","Robert Peary"));
        arrayList.add(new ContentQuestionModel("Magna Carta or The Great Charter was signed in","1210","1215","1220","1225","1215"));
        arrayList.add(new ContentQuestionModel("Habeas Corpus Act was passed in?","1679","1683","1691","1997","1679"));
        arrayList.add(new ContentQuestionModel("\"Boston Tea Party\" incident happened in?","1770","1771","1772","1773","1773"));
        arrayList.add(new ContentQuestionModel("In which year American Revolution started?","1774","1775","1776","1777","1775"));
        arrayList.add(new ContentQuestionModel("In which year American Independence was acknowledged by England?","1782","1783","1784","1785","1783"));
        arrayList.add(new ContentQuestionModel("French Revolution was started in the Year?","1786","1787","1788","1789","1789"));
        arrayList.add(new ContentQuestionModel("Young Italy movement by led by two revolutionaries, one was \"Mazzini\" and Other was?","Garibaldi","Victor","Emmanuel","Louis","Garibaldi"));
        arrayList.add(new ContentQuestionModel("Rome was liberated by the Italian soldiers in the year?","1869","1870","1871","1872","1870"));
        arrayList.add(new ContentQuestionModel("When did World War 2 start?","1937","1938","1939","1940","1939"));
        arrayList.add(new ContentQuestionModel("When was Bulkan War II fought?","1912","1913","1914","1915","1913"));
        arrayList.add(new ContentQuestionModel("Who is known as Man of Blood and Iron?","Napoleon","Bismarck","Ho Chi Minh","Sir Walter Scott","Bismarck"));
        arrayList.add(new ContentQuestionModel("In which year Hitler became the Chancellor of Germany?","1932","1944","1945","1933","1933"));

        arrayList.add(new ContentQuestionModel("Rivers Tigris and Euphrates are associated with?","Mesopotamian Civilization","Egyptian Civilization","Harappan Civilization","Chinese Civilization","Mesopotamian Civilization"));
        arrayList.add(new ContentQuestionModel("Which is considered as the oldest civilization of the world?","Egyptian Civilization","Harappan Civilization","Chinese Civilization","Mesopotamian Civilization","Mesopotamian Civilization"));
        arrayList.add(new ContentQuestionModel("Which among following is called \"Gift of the Nile”?","China","India","Iraq","Egypt","Egypt"));
        arrayList.add(new ContentQuestionModel("Who is considered as the master of Greek comedy?","Aeschylus","Sophocles","Aristophanes","Philip","Aristophanes"));
        arrayList.add(new ContentQuestionModel("When ancient Olympic games first held?","776 BC","780 BC","790 BC","800 BC","776 BC"));
        arrayList.add(new ContentQuestionModel("Who is known as the father of Modern Medicine?","Euclid","Pythagoras","Hippocrates","Eratosthenes","Hippocrates"));
        arrayList.add(new ContentQuestionModel("What is the name of the autobiography of Adolf Hitler?","First Attack","Mein Kompf","My Spirit","Ray of Hope","Mein Kompf"));
        arrayList.add(new ContentQuestionModel("Who was the last Emperor of Rome?","Nero","Cesare","Romulus August ulus","Julius","Romulus August ulus"));
        arrayList.add(new ContentQuestionModel("The Parliament of Great Britain was formed in the year?","1705","1706","1707","1708","1707"));
        arrayList.add(new ContentQuestionModel("In which year, Alexander the Great become the king of Macedonia","336 BC","323 BC","350 BC","200 BC ","336 BC"));
        arrayList.add(new ContentQuestionModel("The European renaissance started from which country","England","French","Italy","Greece ","Italy"));
        arrayList.add(new ContentQuestionModel("The Battle of Waterloo was fought in the year","1800","1805","1807","1815","1815"));
        arrayList.add(new ContentQuestionModel("On which island of French, Napoleon was born","Saint Helena","Corsica","Elba","Operon","Corsica"));
        arrayList.add(new ContentQuestionModel("In which year America got independence","1760","1776","1780","1782","1776"));
        arrayList.add(new ContentQuestionModel("Who is known as the Artist of the world-famous painting 'Mona Lisa'","Filippo Brunelleschi","Michelangelo","Vincent van Gogh","Leonardo da Vinci","Leonardo da Vinci"));
        arrayList.add(new ContentQuestionModel("Who was the king during the French revolution","Napoleon","Louis XV","Louis XVI","Charles IX","Louis XVI"));
        arrayList.add(new ContentQuestionModel("The Hundred Years' War (from 1337 to 1453) was fought between","England and French","Germany and Russia","America and Argentina","England and Germany","England and French"));
        arrayList.add(new ContentQuestionModel("Queen Elizabeth I of England belongs to which dynasty","Stuart","York","Tudor","Normandy","Tudor"));
        arrayList.add(new ContentQuestionModel("'Boston Tea Party' protest was associated with the revolution of","America","Italy","French","India","America"));



        arrayList.add(new ContentQuestionModel("Who is known as the father of Modern Medicine?","Euclid","Pythagoras","Hippocrates","Eratosthenes","Hippocrates"));
        arrayList.add(new ContentQuestionModel("Which was not a Roman Philosopher?","Cicero","Seneca","Lucretius","Octavian","Octavian"));
        arrayList.add(new ContentQuestionModel("Who was among the famous Roman poets?","Tacitus","Plinky","Virgil","Marcus","Virgil"));
        arrayList.add(new ContentQuestionModel("Marco Polo, the Venetian traveler, traveled from Venice to China and Japan in:","1285 - 90","1288 - 93","1290 - 96","1295 - 1301","1288 - 93"));
        arrayList.add(new ContentQuestionModel("In which year Bartholomew Diaz reached Cape of Good Hope?","1480","1487","1495","1500","1487"));
        arrayList.add(new ContentQuestionModel("Vasco da Gama reached in India in the year?","1495","1496","1497","1498","1498"));
        arrayList.add(new ContentQuestionModel("Who was the first to sail around the world?","Francis Drake","Columbus","Magellan","Vasco da Gama","Magellan"));
        arrayList.add(new ContentQuestionModel("America was discovered in?","1491","1492","1493","1494","1492"));
        arrayList.add(new ContentQuestionModel("Brazil was discovered in?","1500","1505","1510","1515","1500"));

        arrayList.add(new ContentQuestionModel("Who was the author of the \"American Declaration of Independence”?","Jefferson","Lafayette","George Washington","Thomas Paine","Jefferson"));
        arrayList.add(new ContentQuestionModel("The Renaissance scientist who explained how planets moved around the sun was?","Kepler","Rabelais","Francis Bacoor","Gutenberg","Kepler"));
        arrayList.add(new ContentQuestionModel("Russian revolutionary, who founded the Communist Party was","Karl Marx","Stalin","Lenin","Trotsky","Lenin"));
        arrayList.add(new ContentQuestionModel("Who is also known as the founder of scientific socialism?","Karl Marx","Lenin","Rousseau","Engels","Karl Marx"));
        arrayList.add(new ContentQuestionModel("Who said that \" Man is a political animal”?","Aristotle","Karl Marx","Lenin","Plato","Aristotle"));
        arrayList.add(new ContentQuestionModel("In which country Aztec civilization was originated?","Greece","USA","Mexico","Egypt","Mexico"));
        arrayList.add(new ContentQuestionModel("Who was the Emperor of Russia during Russia revolution?","Nicholas I","Nicholas II","Alexander I","Alexander II","Nicholas II"));
        arrayList.add(new ContentQuestionModel("What is the name first Roman Emperor?","Claudius","Augustus","Caligula","Nero","Augustus"));
        arrayList.add(new ContentQuestionModel("Who is known as \"Father of History”?","Mark Antony","Nero","Herodotus","Homer","Herodotus"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

            arrayList.add(new ContentQuestionModel("ব্রাজিল আবিষ্কার হয়েছিল?", "1500", "1505", "1510", "1515", "1500"));
        arrayList.add(new ContentQuestionModel("উত্তর মেরু কে আবিষ্কার করেছেন?", "ক্যাপ্টেন জেমস", "ম্যাগেলান", "আমুন্ডসেন", "রবার্ট পেরি", "রবার্ট পেরি"));
        arrayList.add(new ContentQuestionModel("ম্যাগনা কার্টা বা দ্য গ্রেট চার্টার সাইন ইন হয়েছিল", "1210", "1215", "1220", "1225", "1215"));
        arrayList.add(new ContentQuestionModel("হাবিয়াস কর্পাস আইনটি কি পাস হয়েছিল?", "1679", "1683", "1691", "1997", "1679"));
        arrayList.add(new ContentQuestionModel("Ost  বোস্টন টি পার্টি incident  ঘটনাটি ঘটেছে?", "1770", "1771", "1772", "1773", "1773"));
        arrayList.add(new ContentQuestionModel("আমেরিকান বিপ্লবটি কোন বছরে শুরু হয়েছিল?", "1774", "1775", "1776", "1777", "1775"));
        arrayList.add(new ContentQuestionModel("ইংরাজী আমেরিকান স্বাধীনতার স্বীকৃতি দেয় কোন বছরে?", "1782", "1783", "1784", "1785", "1783"));
        arrayList.add(new ContentQuestionModel("ফরাসী বিপ্লবটি কি বছরের শুরু হয়েছিল?", "1786", "1787", "1788", "1789", "1789"));
        arrayList.add(new ContentQuestionModel("দু'জন বিপ্লবীর নেতৃত্বে ইটালি ইন্দোলনের আন্দোলন, একজন ছিলেন one  মাজনি  এবং অন্যটি ছিল?", "গরিবালদী", "ভিক্টর", "এমানুয়েল", "লুই", "গরিবালদী"));
        arrayList.add(new ContentQuestionModel("রোম ইটালিয়ান সৈন্যরা ১৯rated১ সালে মুক্তি পেয়েছিল?","1869","1870","1871","1872","1870"));
        arrayList.add(new ContentQuestionModel("দ্বিতীয় বিশ্বযুদ্ধ 2 কখন শুরু হয়েছিল?", "1937", "1938", "1939", "1940", "1939"));
        arrayList.add(new ContentQuestionModel("দ্বিতীয় বুলকান যুদ্ধ কখন হয়েছিল?","1912","1913","1914","1915","1913"));
        arrayList.add(new ContentQuestionModel("ম্যান অফ ব্লাড অ্যান্ড আয়রন হিসাবে কে পরিচিত?", "নেপোলিয়ন", "বিসমার্ক", "হো চি মিন", "স্যার ওয়াল্টার স্কট", "বিসমার্ক"));
        arrayList.add(new ContentQuestionModel("কোন বছরে হিটলার জার্মানির চ্যান্সেলর হন?","1932","1944","1945","1933","1933"));
        arrayList.add(new ContentQuestionModel("  আমেরিকার স্বাধীনতার ঘোষণা  এর লেখক কে ছিলেন?", "জেফারসন", "লাফায়েট", "জর্জ ওয়াশিংটন", "টমাস পেইন", "জেফারসন"));
        arrayList.add(new ContentQuestionModel("রেনেসাঁর বিজ্ঞানী যিনি ব্যাখ্যা করেছিলেন যে গ্রহগুলি কীভাবে সূর্যের চারদিকে ঘুরেছিল?", "কেপলার", "রাবেলাইস", "ফ্রান্সিস বকুর", "গুটেনবার্গ", "কেপলার"));
        arrayList.add(new ContentQuestionModel("রাশিয়ান বিপ্লবী, যিনি কমিউনিস্ট পার্টির প্রতিষ্ঠা করেছিলেন", "কার্ল মার্কস", "স্টালিন", "লেনিন", "ট্রটস্কি", "লেনিন"));
        arrayList.add(new ContentQuestionModel("কারা বৈজ্ঞানিক সমাজতন্ত্রের প্রতিষ্ঠাতা হিসাবে পরিচিত?", "কার্ল মার্কস", "লেনিন", "রুসো", "এঙ্গেলস", "কার্ল মার্কস"));
        arrayList.add(new ContentQuestionModel("কে বলেছিল Man  মানুষ একটি রাজনৈতিক প্রাণী  ?", "অ্যারিস্টটল", "কার্ল মার্কস", "লেনিন", "প্লেটো", "অ্যারিস্টটল"));

        arrayList.add(new ContentQuestionModel("নদী টাইগ্রিস এবং ইউফ্রেটিস জড়িত?", "মেসোপটেমিয়ান সভ্যতা", "মিশরীয় সভ্যতা", "হরপ্পান সভ্যতা", "চীনা সভ্যতা", "মেসোপটেমিয়ান সভ্যতা"));
        arrayList.add(new ContentQuestionModel("কোনটি বিশ্বের প্রাচীন সভ্যতা হিসাবে বিবেচিত?", "মিশরীয় সভ্যতা", "হরপ্পান সভ্যতা", "চীনা সভ্যতা", "মেসোপটেমিয়ান সভ্যতা", "মেসোপটেমিয়ান সভ্যতা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটিকে   নীল উপহার  বলা হয়?", "চীন", "ভারত", "ইরাক", "মিশর", "মিশর"));
        arrayList.add(new ContentQuestionModel("গ্রীক কমেডির কর্তা কে বিবেচনা করা হয়?", "এসচিলাস", "সোফোক্লেস", "অ্যারিস্টোফেনস", "ফিলিপ", "অ্যারিস্টোফেনস"));
        arrayList.add(new ContentQuestionModel("প্রাচীন অলিম্পিক গেমস কখন প্রথম অনুষ্ঠিত হয়েছিল?", "খ্রিস্টপূর্ব 77 776", " ", "খ্রিস্টপূর্ব 7৯০", "৮০০ খ্রিস্টপূর্ব", " "));

        arrayList.add(new ContentQuestionModel("কোন বছরে, আলেকজান্ডার গ্রেট ম্যাসেডোনিয়ার রাজা হন","336 BC","323 BC","350 BC","200 BC ","336 BC"));
        arrayList.add(new ContentQuestionModel("ইউরোপীয় পুনর্জাগরণ কোন দেশ থেকে শুরু হয়েছিল", "ইংল্যান্ড", "ফরাসী", "ইতালি", "গ্রীস", "ইতালি"));
        arrayList.add(new ContentQuestionModel("ওয়াটারলু যুদ্ধ যুদ্ধ হয়েছিল --- সালে","1800","1805","1807","1815","1815"));
        arrayList.add(new ContentQuestionModel("ফ্রেঞ্চ এর কোন দ্বীপে নেপোলিয়ন জন্মগ্রহণ করেছিলেন", "সেন্ট হেলেনা", "কর্সিকা", "এলবা", "ওপারন", "কর্সিকা"));
        arrayList.add(new ContentQuestionModel("আমেরিকা যে বছর স্বাধীনতা পেয়েছিল", "1760", "1776", "1780", "1782", "1776"));
        arrayList.add(new ContentQuestionModel("বিশ্বখ্যাত চিত্রকর্ম 'মোনা লিসা' এর শিল্পী হিসাবে যিনি পরিচিত"," ফিলিপ্পো ব্রুনেললেসি "," মিশেলঞ্জেলো "," ভিনসেন্ট ভ্যান গগ "," লিওনার্দো দা ভিঞ্চি "," লিওনার্দো দা ভিঞ্চি "));
        arrayList.add(new ContentQuestionModel("ফরাসি বিপ্লবের সময় কে ছিলেন রাজা", "নেপোলিয়ন", "লুই এক্সভি", "লুই চতুর্দশ", "চার্লস নবম", "লুই চতুর্দশ"));
        arrayList.add(new ContentQuestionModel("শত বছরের যুদ্ধ (১৩৩37 থেকে ১৪৫৩ অবধি)", "ইংল্যান্ড এবং ফরাসী", "জার্মানি এবং রাশিয়া", "আমেরিকা ও আর্জেন্টিনা", "ইংল্যান্ড এবং জার্মানি", "ইংল্যান্ড এবং ফরাসী"));
        arrayList.add(new ContentQuestionModel("ইংল্যান্ডের রানী প্রথম এলিজাবেথ কোন রাজবংশের অন্তর্গত", "স্টুয়ার্ট","ইয়র্ক", "টিউডার", "নরম্যান্ডি", "টিউডার"));
        arrayList.add(new ContentQuestionModel(" বোস্টন টি পার্টি এর বিপ্লবের সাথে জড়িত ছিলএর প্রতিবাদ", "আমেরিকা", "ইতালি", "ফরাসি", "ভারত", "আমেরিকা"));

        arrayList.add(new ContentQuestionModel("আধুনিক মেডিসিনের জনক হিসাবে পরিচিত কে?", "ইউক্লিড", "পাইথাগোরাস", "হিপোক্রেটিস", "ইরোটোস্টিনিস", "হিপোক্রেটিস"));
        arrayList.add(new ContentQuestionModel("আধুনিক মেডিসিনের জনক হিসাবে পরিচিত কে?", "ইউক্লিড", "পাইথাগোরাস", "হিপোক্রেটিস", "ইরোটোস্টিনিস", "হিপোক্রেটিস"));
        arrayList.add(new ContentQuestionModel("কোনটি রোমান দার্শনিক ছিলেন না?", "সিসেরো", "সেনেকা", "লুক্রেটিয়াস", "অক্টাভিয়ান", "অক্টাভিয়ান"));
        arrayList.add(new ContentQuestionModel("বিখ্যাত রোমান কবিদের মধ্যে কে ছিলেন?", "ট্যাসিটাস", "প্লিংকি", "ভার্জিল", "মার্কাস", "ভার্জিল"));
        arrayList.add(new ContentQuestionModel("ভেনিসের ভ্রমণকারী মার্কো পোলো ভেনিস থেকে চীন ও জাপানে ভ্রমণ করেছিলেন:", "1285 - 90", "1288 - 93", "1290 - 96", "1295 - 1301", "1288 - 93"));
        arrayList.add(new ContentQuestionModel("কোন বছরে বার্থোলোমিউ ডিয়াজ কেপ অফ গুড হোপে পৌঁছেছে?", "1480", "1487", "1495", "1500", "1487"));
        arrayList.add(new ContentQuestionModel("ভাস্কো দা গামা বছরে ভারতে পৌঁছেছেন?", "1495", "1496", "1497", "1498", "1498"));
        arrayList.add(new ContentQuestionModel("বিশ্বজুড়ে প্রথম যাত্রা করেন কে?", "ফ্রান্সিস ড্রেক", "কলম্বাস", "ম্যাগেলান", "ভাস্কো দা গামা", "ম্যাগেলান"));
        arrayList.add(new ContentQuestionModel("আমেরিকা আবিষ্কার হয়েছিল?", "1491", "1492", "1493", "1494", "1492"));

        arrayList.add(new ContentQuestionModel("আজ্টেক সভ্যতার উদ্ভব কোন দেশে?", "গ্রীস", "ইউএসএ", "মেক্সিকো", "মিশর", "মেক্সিকো"));
        arrayList.add(new ContentQuestionModel("রাশিয়া বিপ্লবের সময় রাশিয়ার সম্রাট কে ছিলেন?", "নিকোলাস প্রথম", "নিকোলাস দ্বিতীয়", "আলেকজান্ডার প্রথম", "দ্বিতীয় আলেকজান্ডার", "নিকোলাস দ্বিতীয়"));
        arrayList.add(new ContentQuestionModel("প্রথম রোমান সম্রাট নামটি কী?", "ক্লডিয়াস", "অগাস্টাস", "ক্যালিগুলা", "নিরো", "অগাস্টাস"));
        arrayList.add(new ContentQuestionModel("ইতিহাসের জনক  নামে পরিচিত কে? "," মার্ক অ্যান্টনি "," নীরো ","হেরোডোটাস"," হোমার ","হেরোডোটাস"));
        arrayList.add(new ContentQuestionModel("অ্যাডলফ হিটলারের আত্মজীবনীটির নাম কী?", "প্রথম আক্রমণ", "মেইন কম্প", "আমার স্পিরিট", "রে অফ হোপ", "মেইন কম্প"));
        arrayList.add(new ContentQuestionModel("রোমের শেষ সম্রাট কে ছিলেন?", "নীরো", "সিজারে", "রোমুলাস আগস্ট উলুস", "জুলিয়াস", "রোমুলাস আগস্ট উলুস"));
        arrayList.add(new ContentQuestionModel("গ্রেট ব্রিটেনের সংসদ গঠিত হয়েছিল ১৯৯? সালে?","1705","1706","1707","1708","1707"));



        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("नदियों टाइग्रिस और यूफ्रेट्स के साथ जुड़े हुए हैं?", "मेसोपोटामियन सभ्यता", "मिस्र की सभ्यता", "हड़प्पा सभ्यता", "चीनी सभ्यता", "मेसोपोटामियन सभ्यता"));
        arrayList.add(new ContentQuestionModel("जिसे दुनिया की सबसे पुरानी सभ्यता माना जाता है?", "मिस्र की सभ्यता", "हड़प्पा सभ्यता", "चीनी सभ्यता", "मेसोपोटामिया सभ्यता", "मेसोपोटामिया सभ्यता"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसे  नील का उपहार  कहा जाता है?", "चीन", "भारत", "इराक", "मिस्र", "मिस्र"));
        arrayList.add(new ContentQuestionModel("ग्रीक कॉमेडी के मास्टर के रूप में किसे माना जाता है?", "एशेकिलस", "सोफोकल्स", "अरस्तूफेन्स", "फिलिप", "अरस्तूफेन्स"));
        arrayList.add(new ContentQuestionModel("प्राचीन ओलंपिक खेल पहली बार कब आयोजित हुए?","776 BC","780 BC","790 BC","800 BC","776 BC"));
        arrayList.add(new ContentQuestionModel("आधुनिक चिकित्सा के पिता के रूप में किसे जाना जाता है?", "यूक्लिड", "पाइथागोरस", "हिप्पोक्रेट्स", "एराटोस्थनीज", "हिप्पोक्रेट्स"));
        arrayList.add(new ContentQuestionModel("आधुनिक चिकित्सा के पिता के रूप में किसे जाना जाता है?", "यूक्लिड", "पाइथागोरस", "हिप्पोक्रेट्स", "एराटोस्थनीज", "हिप्पोक्रेट्स"));
        arrayList.add(new ContentQuestionModel("जो एक रोमन दार्शनिक नहीं था?", "सिसेरो", "सेनेका", "ल्यूक्रेटियस", "ऑक्टेवियन", "ऑक्टेवियन"));
        arrayList.add(new ContentQuestionModel("प्रसिद्ध रोमन कवियों में कौन था?", "टैकिटस", "प्लंकी", "वर्जिल", "मार्कस", "वर्जिल"));
        arrayList.add(new ContentQuestionModel("वेनिस के यात्री मार्को पोलो ने वेनिस से चीन और जापान की यात्रा की:","1285 - 90","1288 - 93","1290 - 96","1295 - 1301","1288 - 93"));
        arrayList.add(new ContentQuestionModel("बर्थोलोम्यू डियाज किस वर्ष केप ऑफ गुड होप में पहुंचा?","1480","1487","1495","1500","1487"));
        arrayList.add(new ContentQuestionModel("वास्को द गामा किस वर्ष भारत में पहुंचा?","1495","1496","1497","1498","1498"));
        arrayList.add(new ContentQuestionModel("दुनिया भर में सबसे पहले पालने वाले कौन थे?", "फ्रांसिस ड्रेक", "कोलंबस", "मैगलन", "वास्को डी गामा", "मैगलन"));//13
        arrayList.add(new ContentQuestionModel("अमेरिका में खोजा गया था?","1491","1492","1493","1494","1492"));
        arrayList.add(new ContentQuestionModel("ब्राजील में खोजा गया था?","1500","1505","1510","1515","1500"));
        arrayList.add(new ContentQuestionModel("उत्तरी ध्रुव की खोज किसने की?", "कैप्टन जेम्स", "मैगलन", "अमुंडसेन", "रॉबर्ट पीयर", "रॉबर्ट पीयर"));//16
        arrayList.add(new ContentQuestionModel("मैग्ना कार्टा या द ग्रेट चार्टर में हस्ताक्षर किए गए थे","1210","1215","1220","1225","1215"));
        arrayList.add(new ContentQuestionModel("हैबियस कॉर्पस एक्ट पारित किया गया था?","1679","1683","1691","1997","1679"));
        arrayList.add(new ContentQuestionModel("  बोस्टन टी पार्टी  की घटना क्या हुई?","1770","1771","1772","1773","1773"));
        arrayList.add(new ContentQuestionModel("अमेरिकी क्रांति किस वर्ष में शुरू हुई?","1774","1775","1776","1777","1775"));
        arrayList.add(new ContentQuestionModel("किस वर्ष में अमेरिकी स्वतंत्रता इंग्लैंड द्वारा स्वीकार की गई थी?","1782","1783","1784","1785","1783"));
        arrayList.add(new ContentQuestionModel("फ्रांसीसी क्रांति वर्ष में शुरू की गई थी?","1786","1787","1788","1789","1789"));
        arrayList.add(new ContentQuestionModel("दो क्रांतिकारियों के नेतृत्व में युवा इटली आंदोलन  एक था माज़िनी ","और दूसरा था!", "गैरीबाल्डी", "विक्टर", "इमैनुएल", "गैरीबाल्डी"));
        arrayList.add(new ContentQuestionModel("वर्ष में इतालवी सैनिकों द्वारा रोम को मुक्त किया गया था?","1869","1870","1871","1872","1870"));
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 2 कब शुरू हुआ था?","1937","1938","1939","1940","1939"));
        arrayList.add(new ContentQuestionModel("बुलकान द्वितीय युद्ध कब लड़ा गया था?","1912","1913","1914","1915","1913"));
        arrayList.add(new ContentQuestionModel("ब्लड एंड आयरन के नाम से किसे जाना जाता है?", "नेपोलियन", "बिस्मार्क", "हो ची मिन्ह", "सर वाल्टर स्कॉट", "बिस्मार्क"));
        arrayList.add(new ContentQuestionModel("किस वर्ष हिटलर जर्मनी का चांसलर बना?","1932","1944","1945","1933","1933"));
        arrayList.add(new ContentQuestionModel("स्वतंत्रता के अमेरिकी घोषणापत्र  के लेखक कौन थे? "," जेफरसन "," लाफेयेट "," जॉर्ज वाशिंगटन "," थॉमस पाइन "," जेफरसन "));
        arrayList.add(new ContentQuestionModel("पुनर्जागरण वैज्ञानिक जिन्होंने समझाया कि ग्रह सूर्य के चारों ओर कैसे चले गए?", "केप्लर", "रबेलिस", "फ्रांसिस बेकर", "गुटेनबर्ग", "केप्लर"));
        arrayList.add(new ContentQuestionModel("रूसी क्रांतिकारी, जिन्होंने कम्युनिस्ट पार्टी की स्थापना की थी", "कार्ल मार्क्स", "स्टालिन", "लेनिन", "ट्रोट्स्की", "लेनिन"));
        arrayList.add(new ContentQuestionModel("किसे वैज्ञानिक समाजवाद के संस्थापक के रूप में भी जाना जाता है?", "कार्ल मार्क्स", "लेनिन", "रूसो", "एंगेल्स", "कार्ल मार्क्स"));
        arrayList.add(new ContentQuestionModel("किसने कहा था कि  मनुष्य एक राजनीतिक जानवर है? "," अरस्तू "," कार्ल मार्क्स "," लेनिन "," प्लेटो "," अरस्तू "));
        arrayList.add(new ContentQuestionModel("किस देश में एज़्टेक सभ्यता की उत्पत्ति हुई?", "भारत", "यूएसए", "मैक्सिको", "मिस्र", "भारत"));//34
        arrayList.add(new ContentQuestionModel("रूस क्रांति के दौरान रूस के सम्राट कौन थे?", "निकोलस I", "निकोलस II", "अलेक्जेंडर I", "अलेक्जेंडर II", "निकोलस II"));
        arrayList.add(new ContentQuestionModel("प्रथम रोमन सम्राट का नाम क्या है?", "क्लाउडियस", "ऑगस्टस", "कैलीगुला", "नीरो", "ऑगस्टस"));
        arrayList.add(new ContentQuestionModel("इतिहास के पिता  के रूप में किसे जाना जाता है? "," मार्क एंटनी "," नीरो "," हेरोडोटस "," होमर "," हेरोडोटस "));
        arrayList.add(new ContentQuestionModel("एडोल्फ हिटलर की आत्मकथा का नाम क्या है?", "पहला हमला", "मीन कोम्फ", "माई स्पिरिट", "रे ऑफ़ होप", "मीन कोम्फ"));
        arrayList.add(new ContentQuestionModel("रोम के अंतिम सम्राट कौन थे?", "नीरो", "सेसरे", "रोमुलस अगस्त अलस", "जूलियस", "रोमुलस अगस्त अलस"));//39
        arrayList.add(new ContentQuestionModel("ग्रेट ब्रिटेन की संसद का गठन किस वर्ष हुआ था?","1705","1706","1707","1708","1707"));
        arrayList.add(new ContentQuestionModel("किस वर्ष में, सिकंदर महान मैसिडोनिया का राजा बन गया","336 BC","323 BC","350 BC","200 BC ","336 BC"));
        arrayList.add(new ContentQuestionModel("यूरोपीय पुनर्जागरण किस देश से शुरू हुआ", "इंग्लैंड", "फ्रेंच", "इटली", "ग्रीस", "इटली"));
        arrayList.add(new ContentQuestionModel("वाटरलू की लड़ाई वर्ष में लड़ी गई थी","1800","1805","1807","1815","1815"));
        arrayList.add(new ContentQuestionModel("फ्रेंच के किस द्वीप पर नेपोलियन का जन्म हुआ", "सेंट हेलेना", "कोर्सिका", "एल्बा", "ऑपरेशनन", "कोर्सिका"));
        arrayList.add(new ContentQuestionModel("किस वर्ष अमेरिका को स्वतंत्रता मिली","1760","1776","1780","1782","1776"));
        arrayList.add(new ContentQuestionModel("विश्व प्रसिद्ध पेंटिंग 'मोना लिसा' के कलाकार के रूप में किसे जाना जाता है", "फिलिप्पो ब्रुनेलेस्ची", "माइकल एंजेलो", "विंसेंट वैन गॉग", "लियोनार्डो","लियोनार्डो"));
        arrayList.add(new ContentQuestionModel("फ्रांसीसी क्रांति के दौरान राजा कौन था", "नेपोलियन", "लुई XV", "लुई XVI", "चार्ल्स IX", "लुई XVI"));
        arrayList.add(new ContentQuestionModel("सौ साल का युद्ध (1337 से 1453 तक)  के बीच लड़ा गया था।", "इंग्लैंड और फ्रेंच", "जर्मनी और रूस", "अमेरिका और अर्जेंटीना", "इंग्लैंड और जर्मनी", "इंग्लैंड और फ्रेंच" ));
        arrayList.add(new ContentQuestionModel("इंग्लैंड की रानी एलिजाबेथ I किस वंश की हैं", "स्टुअर्ट", "यॉर्क", "ट्यूडर", "नॉरमैंडी", "ट्यूडर"));
        arrayList.add(new ContentQuestionModel("  बोस्टन टी पार्टी 'का विरोध की क्रांति से जुड़ा था।"," अमेरिका "," इटली "," फ्रेंच "," भारत "," अमेरिका "));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("دریاؤں دجلہ اور فرات کا تعلق ہے؟" ,"میسوپوٹیمین تہذیب" , "مصری تہذیب" , "ہڑپہ تہذیب" , "چینی تہذیب","میسوپوٹیمین تہذیب"));
        arrayList.add(new ContentQuestionModel("دنیا کی قدیم ترین تہذیب کے طور پر کون سمجھا جاتا ہے؟" , "مصری تہذیب" , "ہڑپہ تہذیب" , "چینی تہذیب" , "میسوپوٹیمین تہذیب","میسوپوٹیمین تہذیب"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس کو گفٹ آف نیل کہا جاتا ہے؟" , "چین" , "ہندوستان" , "عراق" , "مصر","مصر"));
        arrayList.add(new ContentQuestionModel("یونانی کامیڈی کا ماہر کون سمجھا جاتا ہے؟" ,"ایشیکلس" , "سوفوکسز" , "ارسطو" , "فلپ","ارسطو"));
        arrayList.add(new ContentQuestionModel("جب قدیم اولمپک کھیل پہلی بار منعقد ہوئے؟","776 BC","780 BC","790 BC","800 BC","776 BC"));
        arrayList.add(new ContentQuestionModel("ماڈرن میڈیسن کے والد کے نام سے کون جانا جاتا ہے؟" , "یوکلیڈ" , "پائیٹاگورس" , "ہپپوکریٹس" , "اریٹوسٹینیز","ہپپوکریٹس"));
        arrayList.add(new ContentQuestionModel("ماڈرن میڈیسن کے والد کے نام سے کون جانا جاتا ہے؟" , "یوکلیڈ" , "پائیٹاگورس" , "ہپپوکریٹس" , "اریٹوسٹینیز","ہپپوکریٹس"));
        arrayList.add(new ContentQuestionModel("کون سا رومن فلاسفر نہیں تھا؟" , "سیسرو" , "سینیکا" , "لوکٹریس" , "آکٹوین","آکٹوین"));//8
        arrayList.add(new ContentQuestionModel("رومن کے مشہور شعرا میں کون تھا؟" , "ٹیکسیٹس" , "کنواری" , "ورجیل" , "مارکس","کنواری"));
        arrayList.add(new ContentQuestionModel("وینسیائی سیاح ، مارکو پولو نے وینس سے چین اور جاپان کا سفر کیا:","1285 - 90","1288 - 93","1290 - 96","1295 - 1301","1288 - 93"));
        arrayList.add(new ContentQuestionModel("کس سال میں برتھلمو ڈیاز کیپ آف گڈ امید پر پہنچا؟","1480","1487","1495","1500","1487"));
        arrayList.add(new ContentQuestionModel("واسکو دا گاما سال میں ہندوستان پہنچا؟","1495","1496","1497","1498","1498"));
        arrayList.add(new ContentQuestionModel("دنیا میں سب سے پہلے سفر کرنے والا کون تھا؟" , "فرانسس ڈریک" , "کولمبس" , "میجیلان" , "واسکو ڈا گاما","میجیلان"));//13
        arrayList.add(new ContentQuestionModel("امریکہ دریافت ہوا تھا؟","1491","1492","1493","1494","1492"));
        arrayList.add(new ContentQuestionModel("برازیل میں دریافت ہوا تھا؟","1500","1505","1510","1515","1500"));
        arrayList.add(new ContentQuestionModel("قطب شمالی کو کس نے دریافت کیا؟" , "کیپٹن جیمز" , "میگیلن" , "امونڈسن" , "رابرٹ پیری","رابرٹ پیری"));
        arrayList.add(new ContentQuestionModel("میگنا کارٹا یا عظیم چارٹر پر دستخط کیے گئے تھے","1210","1215","1220","1225","1215"));
        arrayList.add(new ContentQuestionModel("میگنا کارٹا یا عظیم چارٹر پر دستخط کیے گئے تھے","1679","1683","1691","1997","1679"));
        arrayList.add(new ContentQuestionModel("بوسٹن ٹی پارٹی واقعہ ہوا؟","1770","1771","1772","1773","1773"));
        arrayList.add(new ContentQuestionModel("امریکی انقلاب کس سال میں شروع ہوا؟","1774","1775","1776","1777","1775"));
        arrayList.add(new ContentQuestionModel("انگلینڈ کے ذریعہ امریکی آزادی کو کس سال قبول کیا گیا؟","1782","1783","1784","1785","1783"));
        arrayList.add(new ContentQuestionModel("فرانسیسی انقلاب سال میں شروع کیا گیا تھا؟","1786","1787","1788","1789","1789"));
        arrayList.add(new ContentQuestionModel("دو اٹلی کی قیادت میں اٹلی کی ینگ تحریک ، جس میں ایک مازینی تھا اور دوسرا تھا؟" , "گیربلدی" , "وکٹر" , "ایمانوئل" , "لوئس","گیربلدی"));//23
        arrayList.add(new ContentQuestionModel("روم کو ایک سال میں اطالوی فوجیوں نے آزاد کرایا؟","1869","1870","1871","1872","1870"));
        arrayList.add(new ContentQuestionModel("جنگ عظیم 2 کب شروع ہوا؟","1937","1938","1939","1940","1939"));
        arrayList.add(new ContentQuestionModel("بلقان جنگ دوئم کا مقابلہ کب ہوا؟","1912","1913","1914","1915","1913"));
        arrayList.add(new ContentQuestionModel("مین آف بلڈ اینڈ آئرن کے نام سے کون جانا جاتا ہے؟" , "نپولین" , "بسمارک" , "ہو چی منہ" , "سر والٹر اسکاٹ","بسمارک"));
        arrayList.add(new ContentQuestionModel("ہٹلر کس سال جرمنی کا چانسلر بنا؟","1932","1944","1945","1933","1933"));
        arrayList.add(new ContentQuestionModel("امریکی اعلان آزادی کے مصنف کون تھے؟" , "جیفرسن" , "لیفائٹی" , "جارج واشنگٹن" , "تھامس پین","جیفرسن"));//29
        arrayList.add(new ContentQuestionModel("پنرجہرن سائنسدان جس نے بتایا کہ سورج کے گرد سیارے کیسے حرکت کرتے ہیں؟" , "کیپلر" , "رابیلیس" , "فرانسس بیکور" , "گٹین برگ","کیپلر"));
        arrayList.add(new ContentQuestionModel("روسی انقلابی ، جس نے کمیونسٹ پارٹی کی بنیاد رکھی تھی" , "کارل مارکس" , "اسٹالن" , "لینن" , "ٹراٹسکی" ,"لینن"));
        arrayList.add(new ContentQuestionModel("سائنسی سوشلزم کے بانی کے طور پر کون جانا جاتا ہے؟" , "کارل مارکس" , "لینن" , "روسو" , "اینگلز","کارل مارکس"));
        arrayList.add(new ContentQuestionModel("کس نے کہا کہ انسان ایک سیاسی جانور ہے؟" , "ارسطو" , "کارل مارکس" , "لینن" , "پلوٹو","ارسطو"));
        arrayList.add(new ContentQuestionModel("کس ملک میں ازٹیک تہذیب کی ابتدا ہوئی؟" , "یونان" , "یو ایس اے" , "میکسیکو" , "مصر","میکسیکو"));
        arrayList.add(new ContentQuestionModel("روس انقلاب کے دوران روس کا شہنشاہ کون تھا؟" , "نکولس اول" , "نکولس دوم" , "الیگزینڈر I" , "سکندر II","نکولس دوم"));
        arrayList.add(new ContentQuestionModel("پہلا رومن شہنشاہی نام کیا ہے؟" , "کلاڈیئس" , "اگسٹس" , "کیلگولا" , "نیرو","اگسٹس"));
        arrayList.add(new ContentQuestionModel("تاریخ کے والد کے نام سے کون جانا جاتا ہے؟" , "مارک اینٹونی" , "نیرو" , "ہیروڈوٹس" , "ہومر","ہیروڈوٹس"));
        arrayList.add(new ContentQuestionModel("ایڈولف ہٹلر کی خود نوشت کا نام کیا ہے؟" , "پہلا حملہ" , "میری لڑائی" , "میری روح" , "امید کی کرن","میری لڑائی"));//38
        arrayList.add(new ContentQuestionModel("روم کا آخری شہنشاہ کون تھا؟" , "نیرو" , "سیسری" , "رومولیس اگست اولس" , "جولیس","رومولیس اگست اولس"));
        arrayList.add(new ContentQuestionModel("برطانیہ کی پارلیمنٹ کی تشکیل سال میں ہوئی؟","1705","1706","1707","1708","1707"));
        arrayList.add(new ContentQuestionModel("کس سال ، سکندر اعظم مقدونیہ کا بادشاہ بن گیا","336 BC","323 BC","350 BC","200 BC ","336 BC"));
        arrayList.add(new ContentQuestionModel("یورپی نشاna ثانیہ کا آغاز کس ملک سے ہوا" , "انگلینڈ" , "فرانسیسی" , "اٹلی" , "یونان","اٹلی"));//42
        arrayList.add(new ContentQuestionModel("واٹر لو کی جنگ سال میں لڑی گئی تھی","1800","1805","1807","1815","1815"));
        arrayList.add(new ContentQuestionModel("فرانسیسی جزیرے پر ، نپولین پیدا ہوئے" , "سینٹ ہیلینا" , "کارسیکا" , "ایلبا" , "اوپرون","کارسیکا"));//44
        arrayList.add(new ContentQuestionModel("امریکہ کو کس سال آزادی ملی","1760","1776","1780","1782","1776"));
        arrayList.add(new ContentQuestionModel("دنیا کی مشہور مصوری مونا لیزا کے مصور کے طور پر کون جانا جاتا ہے" , "فلپو برونیلیسی" , "مائیکلینجیلو" ,"ونسنٹ وان گوگ" , "لیونارڈو ڈاونچی","لیونارڈو ڈاونچی"));
        arrayList.add(new ContentQuestionModel("فرانسیسی انقلاب کے دوران بادشاہ کون تھا" , "نپولین" , "لوئس XV" , "لوئس XVI" , "چارلس IX","لوئس XVI"));
        arrayList.add(new ContentQuestionModel("سو سال کی جنگ (1337 سے 1453 تک)" , "انگلینڈ اور فرانسیسی" , "جرمنی اور روس" , "امریکہ اور ارجنٹائن" , "انگلینڈ اور جرمنی" ,"انگلینڈ اور فرانسیسی"));
        arrayList.add(new ContentQuestionModel("انگلینڈ کی ملکہ الزبتھ اول کا تعلق کس خاندان سے ہے" , "اسٹورٹ" , "یارک" , "ٹیوڈر" , "نورمنڈی","ٹیوڈر"));
        arrayList.add(new ContentQuestionModel("انگلینڈ کی ملکہ الزبتھ اول کا تعلق کس خاندان سے ہے" , "اسٹورٹ" , "یارک" , "ٹیوڈر" , "نورمنڈی","ٹیوڈر"));





        return arrayList;


    }


}