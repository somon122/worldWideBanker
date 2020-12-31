package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class WorldWarsHistory {

    private Context context;

    public WorldWarsHistory(Context context) {
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

         arrayList.add(new ContentQuestionModel("Which country lost the leadership of the world after the First World War?","Poland","Germany","France","None of these","Germany"));
        arrayList.add(new ContentQuestionModel("When did Romania join World War 1?","1914","1915","1916","None of these","1916"));
        arrayList.add(new ContentQuestionModel("Who was France’s leader during World War I?","John J. Pershing","Georges Clemenceau","Lloyd George","None of these","Georges Clemenceau"));
        arrayList.add(new ContentQuestionModel("Who was the commander of U.S. forces in Europe during the World War I?","Czar Nicholas","Kaiser Wilhelm II","John J. Pershing","None of these","John J. Pershing"));
        arrayList.add(new ContentQuestionModel("Who was King of England during WWI?","Albert","George V","Edward VIII","None of these","George V"));
        arrayList.add(new ContentQuestionModel("Who was the leader of Germany in World War I?","Franz Joseph","Wilhelm II","Frederick III","None of these","Wilhelm II"));

        arrayList.add(new ContentQuestionModel("World War I , also known as the First World War or the Great War, was a global war originating in Europe that lasted from __________."," 1914 to 1918","1924 to 1928","1933 to 1944","None of these"," 1914 to 1918"));
        arrayList.add(new ContentQuestionModel("What were the main reasons for the First World War?","suicide of Russian commanding general","Battle of Tannenberg","Murder of Archduke Franz Ferdinand at Sarajevo","None of these","Murder of Archduke Franz Ferdinand at Sarajevo"));
        arrayList.add(new ContentQuestionModel("Which country was involved in the First World War?","Belgium","Italy","United Kingdom","All of these","All of these"));
        arrayList.add(new ContentQuestionModel("Which country was not in the Triple Entente in 1914?","Italy","Great Britain","France","None of these","Italy"));
        arrayList.add(new ContentQuestionModel("Which countries were in the Triple Alliance in 1914?","Italy","Germany","Austria-Hungary","All of above","All of above"));
        arrayList.add(new ContentQuestionModel("How many countries were involved in World War 1?","18","25","32","None of these","32"));
        arrayList.add(new ContentQuestionModel("What was the deadliest battle of World War 1?","Battle of the Somme","Battle of Jutland","None of these","Battle of Cambrai","Battle of the Somme"));
        arrayList.add(new ContentQuestionModel("What was the first British battle of World War 1?","Battle of Verdun","Battle of Mons","Battle of Cambrai","None of these","Battle of Mons"));
        arrayList.add(new ContentQuestionModel("What was the first battle of the First World War?","Battle of Gallipoli","Battle of Jutland","Battle of Marne","None of these","Battle of Marne"));
        arrayList.add(new ContentQuestionModel("Which country has the most deaths in World War 1?","British Empire","Russia","Germany"," None of these","Russia"));
        arrayList.add(new ContentQuestionModel("What was the longest battle in World War 1?","Battle of the Somme","Battle of Mons","Battle of Verdun","None of these","Battle of Verdun"));
        arrayList.add(new ContentQuestionModel(" What was the biggest battle the US fought in World War 1?","Battle of Cantigny","Battle of Amiens","Battle of Megiddo","None of these","Battle of Cantigny"));
        arrayList.add(new ContentQuestionModel("When did US enter WWI?","1915","1916","1917","None of these","1917"));
        arrayList.add(new ContentQuestionModel("Which country made the first declaration of war?","Austria","Russia","Germany","None of these","Austria"));
        arrayList.add(new ContentQuestionModel("When did Britain declare war on Germany in the First World War?","1917","1915","1914","None of these","1914"));
        arrayList.add(new ContentQuestionModel("Which of the following nations was not part of the central powers?","Bulgaria","Austria-Hungary","Russia","None of these","Russia"));
        arrayList.add(new ContentQuestionModel("Which of the following nations were part of the allied powers?","China","France","Britain","All of above","All of above"));
        arrayList.add(new ContentQuestionModel("What was another name for World War 1?","Battle of the Marne","Battle of the Somme","The War to End All Wars","None of these","The War to End All Wars"));
        arrayList.add(new ContentQuestionModel("When did Italy join World War 1?","1915","1916","1914","None of these","1915"));

        arrayList.add(new ContentQuestionModel("What was the new technology in World War I?","Machine gun","Tanks","Both a & b","None of these","Both a & b"));
        arrayList.add(new ContentQuestionModel("What was the area in between trenches called during WWI?","The Point of View","No man’s land","Series of battles","None of these","No man’s land"));
        arrayList.add(new ContentQuestionModel("Who won World War 1?","Nazi Party","Central Powers","Allied Powers","None of these","Allied Powers"));
        arrayList.add(new ContentQuestionModel("What weapons did World War 1 soldiers use?","Rifles","Artillery","Poison gas","All of these","All of these"));
        arrayList.add(new ContentQuestionModel("How many people died in World War 1?","16 million people","7 million people","30 million people","None of these","16 million people"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();
         arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধে ব্রিটেন কখন জার্মানির বিরুদ্ধে যুদ্ধ ঘোষণা করেছিল?","1917","1915","1914","None of these","1914"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত দেশগুলির মধ্যে কোনটি কেন্দ্রীয় শক্তির অংশ ছিল না?", "বুলগেরিয়া", "অস্ট্রিয়া-হাঙ্গেরি", "রাশিয়া", "এর মধ্যে কোনওটি নয়", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত দেশগুলির মধ্যে কোনটি মিত্রশক্তির অংশ ছিল?", "চীন", "ফ্রান্স", "ব্রিটেন", "উপরের সব", "উপরের সব"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের আর কি নাম ছিল?", "মেরিনের যুদ্ধ", "সোমের যুদ্ধ", "যুদ্ধের সমাপ্তি সমস্ত যুদ্ধ", "এর কিছুই নয়", "যুদ্ধের সমাপ্তি সমস্ত যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("ইতালি কখন বিশ্বযুদ্ধ 1 এ যোগ দিয়েছে?", "1915", "1916", "1914", "এর কিছুই নয়", "1915"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের পরে কোন দেশ বিশ্বের নেতৃত্ব হারিয়েছে?", "পোল্যান্ড", "জার্মানি", "ফ্রান্স", "এর কিছুই নয়", "জার্মানি"));
        arrayList.add(new ContentQuestionModel("রোমানিয়া কখন বিশ্বযুদ্ধ 1 এ যোগ দিয়েছে?", "1914", "1915", "1916", "এর কিছুই নয়", "1916"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের সময় ফ্রান্সের নেতা কে ছিলেন?", "জন জে পার্শিং", "জর্জেস ক্লেমেন্সিউ", "লয়েড জর্জ", "এর মধ্যে কোনওটিই নয়", "জর্জেস ক্লেমেন্সিউ"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের সময় ইউরোপে মার্কিন বাহিনীর কমান্ডার কে ছিলেন?", "সিজার নিকোলাস", "কায়সার উইলহেম দ্বিতীয়", "জন জে পার্শিং", "এর মধ্যে কোনওটিই নয়", "জন জে পার্শিং"));

        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধ, প্রথম বিশ্বযুদ্ধ বা মহাযুদ্ধ হিসাবেও পরিচিত, এটি ইউরোপে শুরু হয়েছিল একটি বিশ্বযুদ্ধ যা __________ অবধি স্থায়ী হয়েছিল।", "1914 থেকে 1918", "1924 থেকে 1928", "1933 থেকে 1944", " এর মধ্যে কোনওটিই ","1914 থেকে 1918"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের মূল কারণগুলি কী কী ছিল?", "রাশিয়ান কমান্ডিং জেনারেলের আত্মহত্যা", "ট্যানেনবার্গের যুদ্ধ", "সরজেভোর আর্চডুক ফ্রাঞ্জ ফার্ডিনান্দের খুন", "এগুলির কোনওটিই নয়", "সরজেভোর আর্চডুক ফ্রাঞ্জ ফার্ডিনান্দের খুন"));
        arrayList.add(new ContentQuestionModel("কোন দেশ প্রথম বিশ্বযুদ্ধের সাথে জড়িত?", "বেলজিয়াম", "ইতালি", "যুক্তরাজ্য", "এই সব", "এই সব"));
        arrayList.add(new ContentQuestionModel("1914 সালে কোন দেশ ট্রিপল এন্টেতে ছিল না?", "ইতালি", "গ্রেট ব্রিটেন", "ফ্রান্স", "এর কিছুই নয়", "ইতালি"));
        arrayList.add(new ContentQuestionModel("1914 সালে কোন দেশগুলি ট্রিপল অ্যালায়েন্সে ছিল?", "ইতালি", "জার্মানি", "অস্ট্রিয়া-হাঙ্গেরি", "উপরের সমস্ত", "উপরের সমস্ত"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধে কয়টি দেশ জড়িত ছিল?", "18", "25", "32", "এর কিছুই নয়", "32"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের সবচেয়ে মারাত্মক যুদ্ধটি কী ছিল?", "সোমের যুদ্ধ", "জুটল্যান্ডের যুদ্ধ", "এর কিছুই নয়", "ক্যামব্রয়ের যুদ্ধ", "সোমের যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের প্রথম ব্রিটিশ যুদ্ধ কী ছিল?", "ভার্ডুনের যুদ্ধ", "মনস যুদ্ধ", "ক্যামব্রয়ের যুদ্ধ", "এর কিছুই নয়", "মনস যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের প্রথম যুদ্ধটি কী ছিল?", "গ্যালিপোলির যুদ্ধ", "জুটল্যান্ডের যুদ্ধ", "মার্নের যুদ্ধ", "এর কিছুই নয়", "মার্নের যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধে কোন দেশ সবচেয়ে বেশি মৃত্যুবরণ করেছে?", "ব্রিটিশ সাম্রাজ্য", "রাশিয়া", "জার্মানি", "এর কিছুই নয়", "রাশিয়া"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের দীর্ঘতম যুদ্ধ কোনটি ছিল?", "সোমমের যুদ্ধ", "মনসের যুদ্ধ", "ভার্দুনের যুদ্ধ", "এর কিছুই নয়", "ভার্দুনের যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের মার্কিন যুক্তরাষ্ট্রে সবচেয়ে বড় লড়াইটি কী ছিল?", "ক্যান্টিগির যুদ্ধ", "অ্যামিয়েন্সের যুদ্ধ", "ম্যাগিডোর যুদ্ধ", "এর মধ্যে কোনটিই নয়", "ক্যান্টিগির যুদ্ধ"));
        arrayList.add(new ContentQuestionModel("মার্কিন ডাব্লুডব্লিউআই কখন প্রবেশ করেছে?", "1915", "1916", "1917", "এর কিছুই নয়", "1917"));
        arrayList.add(new ContentQuestionModel("কোন দেশ যুদ্ধের প্রথম ঘোষণা করেছিল?", "অস্ট্রিয়া", "রাশিয়া", "জার্মানি", "এর কিছুই নয়", "অস্ট্রিয়া"));

        arrayList.add(new ContentQuestionModel("দ্বিতীয় বিশ্বযুদ্ধের সময় ইংল্যান্ডের রাজা কে ছিলেন?", "অ্যালবার্ট","জর্জ পঞ্চম", "এডওয়ার্ড অষ্টম", "এর মধ্যে কোনওটিই নয়", "জর্জ পঞ্চম"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধে জার্মানির নেতা কে ছিলেন?", "ফ্রাঞ্জ জোসেফ", "দ্বিতীয় উইলহেলম", "ফ্রেডরিক তৃতীয়", "এর মধ্যে কোনওটিই নয়", "দ্বিতীয় উইলহেলম"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের নতুন প্রযুক্তিটি কী ছিল?", "মেশিনগান", "ট্যাঙ্কস", "উভয় এ & বি", "এগুলির কোনওটিই নয়", "উভয় এ & বি"));
        arrayList.add(new ContentQuestionModel("ডাব্লুডব্লিউআইয়ের সময় পরিখাগুলির মাঝখানে কী ছিল?", "দ্য পয়েন্ট অফ ভিউ", "কোনও মানুষের জমি", "সিরিজের লড়াই", "এর কোনওটি নয়", "কোনও মানুষের জমি" ));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধ কে জিতল?", "নাজি পার্টি", "কেন্দ্রীয় শক্তি", "মিত্র শক্তি", "এর কিছুই নয়", "মিত্র শক্তি"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধের সৈন্যরা কী অস্ত্র ব্যবহার করেছিল?", "রাইফেলস", "আর্টিলারি", "বিষের গ্যাস", "এই সমস্ত", "এই সমস্ত"));
        arrayList.add(new ContentQuestionModel("প্রথম বিশ্বযুদ্ধে কত লোক মারা গিয়েছিল?", "১মিলিয়ন মানুষ", "million মিলিয়ন মানুষ", "তিন কোটি মানুষ", "এর মধ্যে কোনটিই নয়", "১মিলিয়ন মানুষ"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध, जिसे प्रथम विश्व युद्ध या महायुद्ध के रूप में भी जाना जाता है, यूरोप में होने वाला एक वैश्विक युद्ध था जो ____ से शुरू हुआ था।","1914 to 1918","1924 to 1928","1933 to 1944","None of these","1914 to 1918"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध के मुख्य कारण क्या थे?", "रूसी कमांडिंग जनरल की आत्महत्या", "टैनबर्ग की लड़ाई", "आर्कड्यूक फ्रांज फर्डिनेंड की हत्या", "इनमें से कोई नहीं", "आर्कड्यूक फ्रांज फर्डिनेंड की हत्या"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध में कौन सा देश शामिल था?", "बेल्जियम", "इटली", "यूनाइटेड किंगडम", "ये सभी", "ये सभी"));
        arrayList.add(new ContentQuestionModel("1914 में कौन सा देश ट्रिपल एंटेंटे में नहीं था?", "इटली", "ग्रेट ब्रिटेन", "फ्रांस", "इनमें से कोई नहीं", "इटली"));
        arrayList.add(new ContentQuestionModel("1914 में ट्रिपल अलायंस में कौन से देश थे?", "इटली", "जर्मनी", "ऑस्ट्रिया-हंगरी", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 1 में कितने देश शामिल थे?","18","25","32","None of these","32"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध की सबसे घातक लड़ाई क्या थी?", "सोम की लड़ाई", "जुटलैंड की लड़ाई", "इनमें से कोई नहीं", "कंबरी की लड़ाई", "सोम की लड़ाई"));//7
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 1 की पहली ब्रिटिश लड़ाई क्या थी?", "वर्दुन की लड़ाई", "बैटल ऑफ़ मॉन्स", "बैटल ऑफ़ कैंबरी", "इनमे से कोई नहीं", "बैटल ऑफ़ मॉन्स"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध की पहली लड़ाई क्या थी?", "गैलीपोली की लड़ाई", "बैटल ऑफ़ मार्ने", "मार्ने की लड़ाई", "इनमें से कोई नहीं", "बैटल ऑफ़ मार्ने"));
        arrayList.add(new ContentQuestionModel("किस देश में विश्व युद्ध 1 में सबसे ज्यादा मौतें हुई हैं?", "ब्रिटिश साम्राज्य", "रूस", "जर्मनी", "इनमें से कोई नहीं", "रूस"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध में सबसे लंबी लड़ाई क्या थी?", "बैटल ऑफ द सोम्मे", "बैटल ऑफ मॉन्स", "वर्दुन की लड़ाई", "इनमें से कोई नहीं", "वर्दुन की लड़ाई"));
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 1 में अमेरिका द्वारा लड़ी गई सबसे बड़ी लड़ाई क्या थी?", "कैंटजेन की लड़ाई", "बैटल ऑफ़ अमियन्स", "बैटल ऑफ़ मेगिडो", "इनमें से कोई नहीं", "कैंटजेन की लड़ाई"));
        arrayList.add(new ContentQuestionModel("US ने WWI में कब प्रवेश किया?", "1915", "1916", "1917", "इनमें से कोई नहीं", "1917"));
        arrayList.add(new ContentQuestionModel("किस देश ने युद्ध की पहली घोषणा की?", "ऑस्ट्रिया", "रूस", "जर्मनी", "इनमें से कोई नहीं", "ऑस्ट्रिया"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध में ब्रिटेन ने जर्मनी पर युद्ध की घोषणा कब की?", "1917", "1915", "1914", "इनमें से कोई नहीं", "1914"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा राष्ट्र केंद्रीय शक्तियों का हिस्सा नहीं था?", "बुल्गारिया", "ऑस्ट्रिया-हंगरी", "रूस", "इनमें से कोई नहीं", "रूस"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से कौन सा देश संबद्ध शक्तियों का हिस्सा था?", "चीन", "फ्रांस", "ब्रिटेन", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("वर्ल्ड वॉर 1 का दूसरा नाम क्या था?", "बैटल ऑफ द मार्ने", "बैटल ऑफ द सोमे", "द वॉर टू एंड ऑल वॉर्स", "इनमें से कोई नहीं", "द वॉर टू एंड ऑल वॉर्स"));
        arrayList.add(new ContentQuestionModel("इटली कब प्रथम विश्व युद्ध में शामिल हुआ?", "1915", "1916", "1914", "इनमें से कोई नहीं", "1915"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध के बाद किस देश ने दुनिया का नेतृत्व खो दिया?", "पोलैंड", "जर्मनी", "फ्रांस", "इनमें से कोई नहीं", "जर्मनी"));
        arrayList.add(new ContentQuestionModel("रोमानिया विश्व युद्ध 1 में कब शामिल हुआ?", "1914", "1915", "1916", "इनमें से कोई नहीं", "1916"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध के दौरान फ्रांस के नेता कौन थे?", "जॉन जे। पर्सिंग", "जॉर्जेस क्लेमेंसियो", "लॉयड जॉर्ज", "इनमें से कोई नहीं", "जॉर्जेस क्लेमेंसियो"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध के दौरान यूरोप में अमेरिकी सेनाओं का कमांडर कौन था?", "सीजर निकोलस", "कैसर विल्हेल्म II", "जॉन जे। पर्सिंग", "इनमें से कोई नहीं", "जॉन जे। पर्सिंग"));
        arrayList.add(new ContentQuestionModel("WWI के दौरान इंग्लैंड का राजा कौन था?", "अल्बर्ट", "जॉर्ज V", "एडवर्ड VIII", "इनमें से कोई नहीं", "जॉर्ज V"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध में जर्मनी का नेता कौन था?", "फ्रांज जोसेफ", "विल्हेम II", "फ्रेडरिक III", "इनमें से कोई नहीं", "विल्हेम II"));
        arrayList.add(new ContentQuestionModel("प्रथम विश्व युद्ध में नई तकनीक क्या थी?", "मशीन गन", "टैंक", "दोनों a & b", "इनमें से कोई नहीं", "दोनों a & b"));
        arrayList.add(new ContentQuestionModel("WWI के दौरान बुलाई गई खाइयों के बीच का क्षेत्र क्या था?", "द पॉइंट ऑफ़ व्यू", "नो मैन्स लैंड", "बैटल ऑफ़ बैटल", "इनमे से कोई नहीं", "नो मैन्स लैंड"));
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 1 किसने जीता?", "नाज़ी पार्टी", "सेंट्रल पॉवर्स", "एलाइड पॉवर्स", "इनमें से कोई नहीं", "एलाइड पॉवर्स"));
        arrayList.add(new ContentQuestionModel("किन हथियारों ने विश्व युद्ध 1 सैनिकों का उपयोग किया?", "राइफल्स", "आर्टिलरी", "ज़हर गैस", "ये सभी", "ये सभी"));
        arrayList.add(new ContentQuestionModel("विश्व युद्ध 1 में कितने लोग मारे गए?", "16 मिलियन लोग", "7 मिलियन लोग", "30 मिलियन लोग", "इनमें से कोई नहीं", "16 मिलियन लोग"));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم ، جسے پہلی جنگ عظیم یا عظیم جنگ بھی کہا جاتا ہے ، وہ یوروپ میں شروع ہونے والی ایک عالمی جنگ تھی جو __________ تک جاری رہی۔" , "1914 سے 1918" , "1924 سے 1928" , "1933 سے 1944" , " ان میں سے کوئی نہیں","1914 سے 1918"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کی بنیادی وجوہات کیا تھیں؟" ,"روسی کمانڈنگ جنرل کی خودکشی" , "تننبرگ کی لڑائی" , "سرجیوو میں آرچ ڈوک فرانز فرڈینینڈ کا قتل" , "ان میں سے کوئی بھی نہیں","سرجیوو میں آرچ ڈوک فرانز فرڈینینڈ کا قتل"));
        arrayList.add(new ContentQuestionModel("کون سا ملک پہلی جنگ عظیم میں شامل تھا؟" , "بیلجیم" , "اٹلی" , "برطانیہ" , "یہ سب","یہ سب"));
        arrayList.add(new ContentQuestionModel("کون سا ملک 1914 میں ٹرپل اینٹینٹ میں نہیں تھا؟" , "اٹلی" , "عظیم برطانیہ" , "فرانس" , "ان میں سے کوئی بھی نہیں","اٹلی"));
        arrayList.add(new ContentQuestionModel("کون سے ممالک 1914 میں ٹرپل الائنس میں شامل تھے؟" , "اٹلی" , "اوپر سب" , "آسٹریا - ہنگری" , "سب سے بڑھ کر","اوپر سب"));//5
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم میں کتنے ممالک شامل تھے؟" , "18" , "25" , "32" , "ان میں سے کوئی بھی نہیں","32"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کی سب سے مہلک جنگ کیا تھی؟" , "سومی کی لڑائی" , "جنگلینڈ کی لڑائی" , "ان میں سے کوئی بھی نہیں" , "کیمبری کی لڑائی","سومی کی لڑائی"));//7
        arrayList.add(new ContentQuestionModel("جنگ عظیم اول کی پہلی برطانوی جنگ کیا تھی؟" , "وارڈن کی لڑائی", "مونس کی لڑائی" , "کیمبرای کی لڑائی" , "ان میں سے کوئی بھی نہیں","مونس کی لڑائی"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کی پہلی جنگ کیا تھی؟" , "گیلپولی کی لڑائی" , "جنگلینڈ کی جنگ" , "مارن کی لڑائی" , "ان میں سے کوئی بھی نہیں","مارن کی لڑائی"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم میں سب سے زیادہ اموات کس ملک میں ہوئی ہیں؟" , "برطانوی سلطنت" , "روس" , "جرمنی" , "ان میں سے کوئی بھی نہیں","روس"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم میں سب سے طویل جنگ کیا تھی؟" , "سوممی کی لڑائی" , "مونس کی لڑائی" , "وارڈن کی لڑائی" , "ان میں سے کوئی بھی نہیں","وارڈن کی لڑائی"));
        arrayList.add(new ContentQuestionModel("امریکہ نے پہلی جنگ عظیم میں جو سب سے بڑی لڑائی لڑی تھی وہ کیا تھا؟" , "کینٹیگنی کی لڑائی" , "امیینس کی لڑائی" , "میگڈو کی لڑائی" , "ان میں سے کوئی بھی نہیں","کینٹیگنی کی لڑائی"));
        arrayList.add(new ContentQuestionModel("امریکہ نے WWI میں کب داخل کیا؟" , "1915" , "1916" , "1917" , "ان میں سے کوئی بھی نہیں","1917"));
        arrayList.add(new ContentQuestionModel("جنگ کا پہلا اعلان کس ملک نے کیا؟" , "آسٹریا" , "روس" , "جرمنی" , "ان میں سے کوئی بھی نہیں","آسٹریا"));
        arrayList.add(new ContentQuestionModel("برطانیہ نے پہلی عالمی جنگ میں جرمنی کے خلاف جنگ کا اعلان کب کیا؟" , "1917" , "1915" , "1914" , "ان میں سے کوئی بھی نہیں","1914"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی قوم مرکزی طاقت کا حصہ نہیں تھی؟" , "بلغاریہ" , "آسٹریا ہنگری" , "روس" , "ان میں سے کوئی بھی نہیں","روس"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سی قومیں اتحادی طاقتوں کا حصہ تھیں؟" , "چین" , "فرانس" , "اوپر سب" , "سبھی اوپر","اوپر سب"));//17
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کا دوسرا نام کیا تھا؟" , "مارین کی لڑائی" , "سوممی کی لڑائی" , "تمام جنگوں کو ختم کرنے کی جنگ" , "ان میں سے کوئی بھی نہیں","تمام جنگوں کو ختم کرنے کی جنگ"));
        arrayList.add(new ContentQuestionModel("اٹلی عالمی جنگ 1 میں کب شامل ہوا؟" , "1915" , "1916" , "1914" , "ان میں سے کوئی نہیں","1915"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کے بعد کون سا ملک دنیا کی قیادت سے محروم ہوا؟" , "پولینڈ" , "جرمنی" , "فرانس" , "ان میں سے کوئی بھی نہیں","جرمنی"));
        arrayList.add(new ContentQuestionModel("رومانیہ عالمی جنگ 1 میں کب شامل ہوا؟" , "1914" , "1915" , "1916" , "ان میں سے کوئی بھی نہیں","1916"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کے دوران فرانس کا رہنما کون تھا؟" , "جان جے پرشنگ" , "جارجز کلیمینساؤ" , "لائیڈ جارج" , "ان میں سے کوئی بھی نہیں","جارجز کلیمینساؤ"));//22
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کے دوران یورپ میں امریکی افواج کا کمانڈر کون تھا؟" , "زار نکولس" , "قیصر ولہیلم II" , "جان جے پرشینگ" , "ان میں سے کوئی بھی نہیں","جان جے پرشینگ"));
        arrayList.add(new ContentQuestionModel("WWI کے دوران انگلینڈ کا بادشاہ کون تھا؟" , "البرٹ" , "جارج پنجم" , "ایڈورڈ ہشتم" , "ان میں سے کوئی بھی نہیں","جارج پنجم"));
        arrayList.add(new ContentQuestionModel("WWI کے دوران انگلینڈ کا بادشاہ کون تھا؟" , "البرٹ" , "جارج پنجم" , "ایڈورڈ ہشتم" , "ان میں سے کوئی بھی نہیں","جارج پنجم"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم میں نئی ​​ٹیکنالوجی کیا تھی؟" , "مشین گن" , "ٹینکس" , "دونوں ایک اور بی" , "ان میں سے کوئی بھی نہیں","دونوں ایک اور بی"));
        arrayList.add(new ContentQuestionModel("WWI کے دوران خندقوں کے درمیان کیا علاقہ تھا؟" , "دی پوائنٹ آف ویو" , "کسی کی زمین نہیں ہے" , "لڑائیوں کا سلسلہ" , "ان میں سے کوئی بھی نہیں","کسی کی زمین نہیں ہے"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم کس نے جیتا؟" , "نازی پارٹی" , "مرکزی طاقتیں" , "اتحادی طاقتیں" , "ان میں سے کوئی نہیں","اتحادی طاقتیں"));
        arrayList.add(new ContentQuestionModel("جنگ عظیم اول کے فوجیوں نے کیا ہتھیار استعمال کیے؟", "رائفلز" , "آرٹلری" , "زہر گیس" , "یہ سب","یہ سب"));
        arrayList.add(new ContentQuestionModel("پہلی جنگ عظیم میں کتنے افراد ہلاک ہوئے؟" , "16 ملین افراد" , "7 ملین افراد" , "30 ملین افراد" , "ان میں سے کوئی بھی نہیں","16 ملین افراد"));

        return arrayList;


    }


}