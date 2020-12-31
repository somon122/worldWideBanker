package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_WorldWarsHistory {

    private Context context;
    public Q_WorldWarsHistory(Context context) {
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
        arrayList.add(new ThreeItemModel("When was the Magna Carta Signed by King John of England ", "1215"));
        arrayList.add(new ThreeItemModel("Economic Crisis of 1930s originated in", "U.S.A"));
        arrayList.add(new ThreeItemModel("Under which of the following treaties did the British recognize the independence of 13 American Colonies", "Treaty of Paris"));
        arrayList.add(new ThreeItemModel("The most important achievement of Abraham Lincoln was", "The abolition of slavery"));
        arrayList.add(new ThreeItemModel("Russian revolutionary, who founded the Communist Party was", "Lenin"));
        arrayList.add(new ThreeItemModel("The Industrial Revolution in the last quarter of the eighteenth century in England first affected the", "Cotton textiles industry"));
        arrayList.add(new ThreeItemModel("The Communist Manifesto was first published in", "German"));
        arrayList.add(new ThreeItemModel("Who was the author of the Republic , a famous classic", "Plato"));
        arrayList.add(new ThreeItemModel("Who among the following was a poet of the following events", "Dante"));
        arrayList.add(new ThreeItemModel("When did the Second World War end?", "1945"));
        arrayList.add(new ThreeItemModel("Saint Simon, Charles Fourier and Robert Owen were", "Early Socialist"));
        arrayList.add(new ThreeItemModel("The Boston Tea Party took place in", "1770"));
        arrayList.add(new ThreeItemModel("Who was the Head of the provincial government of Russia in 1917 ?", "Nicolas II"));
        arrayList.add(new ThreeItemModel("Which of the following was the main feature of European Renaissance ?", "It brought back the classic ideals in literature, painting and architecture"));
        arrayList.add(new ThreeItemModel("Renaissance started first in", "Italy"));
        arrayList.add(new ThreeItemModel("Which of the following is not true of the European renaissance ?", "It Found expression in the revival of the study of ancient Greco-Roman classics."));
        arrayList.add(new ThreeItemModel("The Last Supper, a famous renaissance painting was a master piece of", "Leonardo da Vinci"));
        arrayList.add(new ThreeItemModel("With which of the following is the term Liberty, Equality and Fraternity associated ?", "French Revolution"));
        arrayList.add(new ThreeItemModel("The author of the American Declaration of Independence was", "Jefferson"));
        arrayList.add(new ThreeItemModel("Which of the following events symbolized the fall of autocracy during the course of French Revolution ?", "The fall of Bastille on 14th july, 1789"));
        arrayList.add(new ThreeItemModel("Which style of painting was used by early renaissance artists ?", "Greco-Roman"));
        arrayList.add(new ThreeItemModel("The Industrial Revolution in the last quarter of the eighteenth century in England first affected the", "Cotton textiles industry"));
        arrayList.add(new ThreeItemModel("Which year is associated with the outbreak of world war II ?", "1935"));
        arrayList.add(new ThreeItemModel("Who among the following commanded the American force during American war of independence ?", "George Washington"));
        arrayList.add(new ThreeItemModel("Among the four political parties listed below, which one was the last to be formed ?", "The Indian National Congress"));
        arrayList.add(new ThreeItemModel("The ideas of Liberty, Equality and Fraternity were Emphasized by", "Rousseau"));
        arrayList.add(new ThreeItemModel("Who among the following commanded the American force during American war of independence ?", "George Washington"));
        arrayList.add(new ThreeItemModel("The European Renaissance of the fifteenth century is noted for great advances in", "Art and Architecture"));
        arrayList.add(new ThreeItemModel("Who among the following were known as physiocrates at the time of French Revolution ?", "Economist"));
        arrayList.add(new ThreeItemModel("The Industrial Revolution First took place in", "England"));
        arrayList.add(new ThreeItemModel("Guernica, the world famous painting was painted by", "Picasso"));
        arrayList.add(new ThreeItemModel("The author of the New Deal was", "President Franklin Delano Roosevelt"));
        arrayList.add(new ThreeItemModel("The book Social Contract was written by", "Rousseau"));
        arrayList.add(new ThreeItemModel("The Renaissance scientist who explained how planets moved around the sun was", "Kepler"));
        arrayList.add(new ThreeItemModel("The discovery of sea-route from Europe to India was made by", "Vasco-da-Gama"));
        arrayList.add(new ThreeItemModel("Who raised the slogan No taxation without representation", "American Colonies"));
        arrayList.add(new ThreeItemModel("What was the name of the atom bomb dropped by USA on Hiroshima in Japan during the second world War", "Little Boy"));
        arrayList.add(new ThreeItemModel("The first successful socialist revolution in history was", "American Revolution"));
        arrayList.add(new ThreeItemModel("Where was Napoleon sent in exile after the battle of waterloo ", "St. Helen"));
        arrayList.add(new ThreeItemModel("1917 is known for", "The Russian Revolution"));


        arrayList.add(new ThreeItemModel("Which of the following events occurred first", "American War of Independence"));
        arrayList.add(new ThreeItemModel("The slogan No taxation without representation was first raised during the American Revolution in", "Massachusetts Assembly"));
        arrayList.add(new ThreeItemModel("The European Renaissance of the fifteenth century is noted for great advances in", "Art and Architecture"));
        arrayList.add(new ThreeItemModel("German attack on Poland was the immediate cause of", "Second world War"));
        arrayList.add(new ThreeItemModel("Which was the first city destroyed by the atom bomb in second World War ", "Hiroshima"));
        arrayList.add(new ThreeItemModel("Who defined Democracy as the Government of the people, by the people and for the people", "Abraham Lincoln"));
        arrayList.add(new ThreeItemModel("The Fall of Bastille is associated with the", "French Revolution of 1789"));
        arrayList.add(new ThreeItemModel("Who is regarded as the founder of scientific socialism", "Karl Marx"));
        arrayList.add(new ThreeItemModel("Das Capital and Communist Manifesto were written by", "Karl Marx"));
        arrayList.add(new ThreeItemModel("The War of Independence of America was fought against the", "Britain"));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
       arrayList.add(new ThreeItemModel("গের্নিকা, বিশ্ব বিখ্যাত চিত্র আঁকা", "পিকাসো"));
        arrayList.add(new ThreeItemModel("নিউ ডিলের লেখক ছিলেন", "রাষ্ট্রপতি ফ্রাঙ্কলিন ডেলাানো রুজভেল্ট"));
        arrayList.add(new ThreeItemModel("সামাজিক চুক্তি বইটি লিখেছিলেন", "রুশো"));
        arrayList.add(new ThreeItemModel("রেনেসাঁর বিজ্ঞানী যিনি ব্যাখ্যা করেছিলেন যে গ্রহগুলি কীভাবে সূর্যের চারদিকে ঘুরেছিল", "কেপলার"));
        arrayList.add(new ThreeItemModel("ইউরোপ থেকে ভারতে যাওয়ার জন্য সমুদ্রপথের আবিষ্কার", "ভাস্কো-দা-গামা  করেছিলেন"));
        arrayList.add(new ThreeItemModel("কে প্রতিনিধিত্ব ছাড়াই কর না দেওয়ার স্লোগান উত্থাপন করেছিলেন", "আমেরিকান উপনিবেশ"));
        arrayList.add(new ThreeItemModel("দ্বিতীয় বিশ্বযুদ্ধের সময় জাপানের হিরোশিমায় মার্কিন যুক্তরাষ্ট্রের ফেলে দেওয়া অ্যাটম বোমার নাম কী ছিল", "ছোট্ট ছেলে"));
        arrayList.add(new ThreeItemModel("ইতিহাসের প্রথম সফল সমাজতান্ত্রিক বিপ্লব ছিল", "আমেরিকান বিপ্লব"));
        arrayList.add(new ThreeItemModel("ওয়াপলু যুদ্ধের পরে নেপোলিয়নকে নির্বাসনে কোথায় পাঠানো হয়েছিল", "সেন্ট হেলেন"));
        arrayList.add(new ThreeItemModel("1917", "রাশিয়ান বিপ্লব এর জন্য পরিচিত"));
        arrayList.add(new ThreeItemModel("ইংল্যান্ডের কিং জন স্বাক্ষরিত কখন ম্যাগনা কার্টা", "1215"));
        arrayList.add(new ThreeItemModel("1930-এর দশকের অর্থনৈতিক সঙ্কট উত্থিত হয়েছিল", "ইউ.এস.এ."));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কোন চুক্তির অধীনে ব্রিটিশরা 13 আমেরিকান উপনিবেশের স্বাধীনতা স্বীকৃতি দিয়েছে", "প্যারিসের চুক্তি"));
        arrayList.add(new ThreeItemModel("আব্রাহাম লিংকের সবচেয়ে গুরুত্বপূর্ণ অর্জন ছিল", "দাসত্বের বিলোপ"));

        arrayList.add(new ThreeItemModel("দ্বিতীয় বিশ্বযুদ্ধ কখন শেষ হয়েছিল?", "1945"));
        arrayList.add(new ThreeItemModel("সেন্ট সায়মন, চার্লস ফুরিয়ার এবং রবার্ট ওভেন ছিলেন", "আর্লি সোশালিস্ট"));
        arrayList.add(new ThreeItemModel("বোস্টন টি পার্টি হয়েছিল", "1770"));
        arrayList.add(new ThreeItemModel("১৯১17 সালে রাশিয়ার প্রাদেশিক সরকারের প্রধান কে ছিলেন?", "নিকোলাস দ্বিতীয়"));
        arrayList.add(new ThreeItemModel("ইউরোপীয় রেনেসাঁর মূল বৈশিষ্ট্যটি নিম্নলিখিতগুলির মধ্যে কোনটি ছিল?", "এটি সাহিত্যে, চিত্রকলায় এবং স্থাপত্যের সর্বোত্তম আদর্শকে ফিরিয়ে এনেছে"));
        arrayList.add(new ThreeItemModel("রেনেসাঁ প্রথম শুরু হয়েছিল", "ইতালি"   ));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি ইউরোপীয় নবজাগরণের ক্ষেত্রে সত্য নয়?", "এটি প্রাচীন গ্রিকো-রোমান ক্লাসিকগুলির অধ্যয়নের পুনর্জাগরণে অভিব্যক্তি খুঁজে পেয়েছিল।"));
        arrayList.add(new ThreeItemModel("দ্য লাস্ট সাপার, একটি বিখ্যাত রেনেসাঁ চিত্রকর্মটি ছিল মাস্টার টুকরো", "লিওনার্দো দা ভিঞ্চি"));
        arrayList.add(new ThreeItemModel("নিচের কোনটির সাথে লিবার্টি, সমতা এবং ভ্রাতৃত্বের শব্দটি যুক্ত?", "ফরাসি বিপ্লব"));
        arrayList.add(new ThreeItemModel("আমেরিকান স্বাধীনতার ঘোষণাপত্রের লেখক ছিলেন", "জেফারসন"));
        arrayList.add(new ThreeItemModel("ফরাসী বিপ্লব চলাকালীন নিম্নলিখিত কোন ঘটনাটি স্বৈরতন্ত্রের পতনের প্রতীক?", "১৪ ই জুলাই, ১89৮৯ সালে বাস্টিলের পতন"));
        arrayList.add(new ThreeItemModel("প্রারম্ভিক রেনেসাঁ শিল্পীরা কোন স্টাইলের পেইন্টিং ব্যবহার করেছিলেন?", "গ্রিকো-রোমান"));
        arrayList.add(new ThreeItemModel("ইংল্যান্ডে আঠারো শতকের শেষ প্রান্তিকে শিল্প বিপ্লব প্রথম প্রভাবিত করেছিল", "সুতি বস্ত্র শিল্প"));
        arrayList.add(new ThreeItemModel("দ্বিতীয় বিশ্বযুদ্ধের প্রাদুর্ভাবের সাথে কোন বছর জড়িত?", "1935"));
        arrayList.add(new ThreeItemModel("আমেরিকার স্বাধীনতা যুদ্ধের সময় নিচের মধ্যে কে আমেরিকান বাহিনীকে কমান্ড করেছিল?", "জর্জ ওয়াশিংটন"));
        arrayList.add(new ThreeItemModel("নীচে তালিকাভুক্ত চারটি রাজনৈতিক দলের মধ্যে সর্বশেষ কোনটি গঠিত হয়েছিল?", "দ্য ইন্ডিয়ান ন্যাশনাল কংগ্রেস"));
        arrayList.add(new ThreeItemModel("লিবার্টি, সমতা এবং ভ্রাতৃত্বের ধারণাগুলি জোর দিয়েছিল", "রুশো"));
        arrayList.add(new ThreeItemModel("আমেরিকার স্বাধীনতা যুদ্ধের সময় নিচের মধ্যে কে আমেরিকান বাহিনীকে কমান্ড করেছিল?", "জর্জ ওয়াশিংটন"));
        arrayList.add(new ThreeItemModel("পঞ্চদশ শতাব্দীর ইউরোপীয় রেনেসাঁস", "আর্ট এবং আর্কিটেকচার  -তে দুর্দান্ত অগ্রগতির জন্য খ্যাত"));
        arrayList.add(new ThreeItemModel("ফরাসি বিপ্লবের সময় নিচের মধ্যে কে শারীরবৃত্ত হিসাবে পরিচিত ছিল?", "অর্থনীতিবিদ"));
        arrayList.add(new ThreeItemModel("শিল্প বিপ্লব প্রথম স্থান নিয়েছিল", "ইংল্যান্ড"));

        arrayList.add(new ThreeItemModel("রাশিয়ান বিপ্লবী, যিনি কমিউনিস্ট পার্টি প্রতিষ্ঠা করেছিলেন", "লেনিন"));
        arrayList.add(new ThreeItemModel("রাশিয়ান বিপ্লবী, যিনি কমিউনিস্ট পার্টি প্রতিষ্ঠা করেছিলেন", "লেনিন"));
        arrayList.add(new ThreeItemModel("ইংল্যান্ডে আঠারো শতকের শেষ প্রান্তিকে শিল্প বিপ্লব প্রথম প্রভাবিত করেছিল", "সুতি বস্ত্র শিল্প"));
        arrayList.add(new ThreeItemModel("প্রজাতন্ত্রের লেখক কে ছিলেন, একটি বিখ্যাত ক্লাসিক", "প্লেটো"));
        arrayList.add(new ThreeItemModel("Who among the following was a poet of the following events", "Dante"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত ইভেন্টগুলির মধ্যে কোনটি আগে ঘটেছিল", "আমেরিকার স্বাধীনতা যুদ্ধ"));
        arrayList.add(new ThreeItemModel("  -তে আমেরিকার বিপ্লবকালে প্রথমে প্রতিনিধিত্ব ছাড়াই কোনও শুল্ক উত্থাপন করা হয়নি।","ম্যাসাচুসেটস অ্যাসেম্বলি"));
        arrayList.add(new ThreeItemModel("পঞ্চদশ শতাব্দীর ইউরোপীয় রেনেসাঁস", "আর্ট এবং আর্কিটেকচার  -তে দুর্দান্ত অগ্রগতির জন্য খ্যাত"));
        arrayList.add(new ThreeItemModel("পোল্যান্ডের উপর জার্মান আক্রমণ তাত্ক্ষণিক কারণ ছিল", "দ্বিতীয় বিশ্বযুদ্ধ"));
        arrayList.add(new ThreeItemModel("দ্বিতীয় বিশ্বযুদ্ধের পরমাণু বোমার দ্বারা ধ্বংস হওয়া প্রথম শহরটি", "হিরোশিমা"));
        arrayList.add(new ThreeItemModel("যিনি গণতন্ত্রকে জনগণের সরকার, জনগণ দ্বারা এবং জনগণের পক্ষে হিসাবে সংজ্ঞায়িত করেছেন", "আব্রাহাম লিংকন"));
        arrayList.add(new ThreeItemModel("যিনি গণতন্ত্রকে জনগণের সরকার, জনগণ দ্বারা এবং জনগণের পক্ষে হিসাবে সংজ্ঞায়িত করেছেন", "আব্রাহাম লিংকন"));
        arrayList.add(new ThreeItemModel("কাকে বৈজ্ঞানিক সমাজতন্ত্রের প্রতিষ্ঠাতা হিসাবে বিবেচনা করা হয়", "কার্ল মার্কস"));
        arrayList.add(new ThreeItemModel("দাস ক্যাপিটাল এবং কমিউনিস্ট ইশতেহারটি লিখেছিলেন", "কার্ল মার্কস"));
        arrayList.add(new ThreeItemModel("আমেরিকার স্বাধীনতা যুদ্ধ", "ব্রিটেন  এর বিরুদ্ধে লড়াই করা হয়েছিল "));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("द्वितीय विश्व युद्ध कब समाप्त हुआ?", "1945"));
        arrayList.add(new ThreeItemModel("सेंट साइमन, चार्ल्स फूरियर और रॉबर्ट ओवेन थे", "अर्ली सोशलिस्ट"));
        arrayList.add(new ThreeItemModel("বোস্টন টি পার্টি হয়েছিল", "1770"));
        arrayList.add(new ThreeItemModel("पुनर्जागरण पहली बार शुरू हुआ", "इटली"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन यूरोपीय पुनर्जागरण का सच नहीं है?", "यह प्राचीन ग्रीको-रोमन क्लासिक्स के अध्ययन के पुनरुद्धार में अभिव्यक्ति पाया।"));
        arrayList.add(new ThreeItemModel("द लास्ट सपर, एक प्रसिद्ध पुनर्जागरण पेंटिंग का एक मास्टर पीस था", "लियोनार्डो दा विंची"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किसके साथ लिबर्टी, इक्वेलिटी और फ्रेटरनिटी शब्द जुड़ा हुआ है?", "फ्रांसीसी क्रांति"));
        arrayList.add(new ThreeItemModel("अमेरिकन डिक्लेरेशन ऑफ़ इंडिपेंडेंस के लेखक थे", "जेफरसन"));
        arrayList.add(new ThreeItemModel("फ्रांसीसी क्रांति के दौरान निम्नलिखित में से किस घटना ने निरंकुशता के पतन का प्रतीक बनाया?", "14 वीं जुलाई 1789 को बैस्टिल का पतन"));
        arrayList.add(new ThreeItemModel("पेंटिंग की किस शैली का उपयोग पुनर्जागरण कलाकारों द्वारा किया गया था?", "ग्रीको-रोमन"));
        arrayList.add(new ThreeItemModel("इंग्लैंड में अठारहवीं शताब्दी की अंतिम तिमाही में औद्योगिक क्रांति ने सबसे पहले प्रभावित किया", "सूती वस्त्र उद्योग"));
        arrayList.add(new ThreeItemModel("द्वितीय विश्व युद्ध के प्रकोप के साथ कौन सा वर्ष जुड़ा है?", "1935"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किसने अमेरिकी स्वतंत्रता के दौरान अमेरिकी सेना की कमान संभाली?", "जॉर्ज वाशिंगटन"));
        arrayList.add(new ThreeItemModel("नीचे सूचीबद्ध चार राजनीतिक दलों में से, कौन सा अंतिम गठन किया गया था?", "द इंडियन नेशनल कांग्रेस"));
        arrayList.add(new ThreeItemModel("लिबर्टी, समानता और बंधुत्व के विचारों पर जोर दिया गया", "रूसो"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से किसने अमेरिकी स्वतंत्रता के दौरान अमेरिकी सेना की कमान संभाली?", "जॉर्ज वाशिंगटन"));
        arrayList.add(new ThreeItemModel("पंद्रहवीं शताब्दी का यूरोपीय पुनर्जागरण", "कला और वास्तुकला में महान प्रगति के लिए जाना जाता है"));
        arrayList.add(new ThreeItemModel("फ्रांसीसी क्रांति के समय निम्नलिखित में से किसे फिजियोक्रेट्स के रूप में जाना जाता था?", "अर्थशास्त्री"));
        arrayList.add(new ThreeItemModel("औद्योगिक क्रांति सबसे पहले", "इंग्लैंड में हुई "));
        arrayList.add(new ThreeItemModel("गुएर्निका, विश्व प्रसिद्ध पेंटिंग द्वारा चित्रित किया गया था", "पिकासो"));
        arrayList.add(new ThreeItemModel("न्यू डील के लेखक" , "राष्ट्रपति फ्रैंकलिन डेलानो रूजवेल्ट"));
        arrayList.add(new ThreeItemModel("पुस्तक सामाजिक अनुबंध", "रूसो  द्वारा लिखा गया था"));
        arrayList.add(new ThreeItemModel("पुनर्जागरण वैज्ञानिक जिन्होंने समझाया कि ग्रह सूर्य के चारों ओर कैसे चले गए", "केप्लर"));
        arrayList.add(new ThreeItemModel("यूरोप से भारत के लिए समुद्री मार्ग की खोज", "वास्को-द-गामा  द्वारा की गई थी"));
        arrayList.add(new ThreeItemModel("किसने नारा दिया प्रतिनिधित्व के बिना कोई कराधान", "अमेरिकी उपनिवेश"));
        arrayList.add(new ThreeItemModel("दूसरे विश्व युद्ध के दौरान जापान के हिरोशिमा पर अमरीका द्वारा गिराए गए परमाणु बम का नाम क्या था", "लिटिल बॉय"));
        arrayList.add(new ThreeItemModel("इतिहास में पहली सफल समाजवादी क्रांति थी", "अमेरिकी क्रांति"));
        arrayList.add(new ThreeItemModel("वाटरलू की लड़ाई के बाद नेपोलियन को निर्वासन में कहाँ भेजा गया था", "सेंट हेलेन"));
        arrayList.add(new ThreeItemModel("1917 is known for", "The Russian Revolution"));
        arrayList.add(new ThreeItemModel("जब मैग्ना कार्टा इंग्लैंड के राजा जॉन द्वारा हस्ताक्षरित था", "1215"));
        arrayList.add(new ThreeItemModel("1930 के आर्थिक संकट की उत्पत्ति", "U.S.A में हुई"));
        arrayList.add(new ThreeItemModel("किस संधि के तहत अंग्रेजों ने 13 अमेरिकी उपनिवेशों की स्वतंत्रता को मान्यता दी", "पेरिस की संधि"));
        arrayList.add(new ThreeItemModel("अब्राहम लिंकन की सबसे महत्वपूर्ण उपलब्धि थी", "दासता का उन्मूलन"));
        arrayList.add(new ThreeItemModel("रूसी क्रांतिकारी, जिन्होंने कम्युनिस्ट पार्टी की स्थापना की थी", "लेनिन"));
        arrayList.add(new ThreeItemModel("इंग्लैंड में अठारहवीं शताब्दी की अंतिम तिमाही में औद्योगिक क्रांति ने सबसे पहले प्रभावित किया", "सूती वस्त्र उद्योग"));
        arrayList.add(new ThreeItemModel("द कम्युनिस्ट मेनिफेस्टो पहली बार", "जर्मन में प्रकाशित हुआ था"));
        arrayList.add(new ThreeItemModel("रिपब्लिक के लेखक कौन थे, एक प्रसिद्ध क्लासिक", "प्लेटो"));
        arrayList.add(new ThreeItemModel("निम्नलिखित घटनाओं में से कौन एक कवि था", "दांते"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सी घटना पहले हुई", "अमेरिकी स्वतंत्रता संग्राम"));
        arrayList.add(new ThreeItemModel("नारा अमेरिकी प्रतिनिधित्व के दौरान प्रतिनिधित्व के बिना कोई कराधान पहली बार उठाया गया था","मैसाचुसेट्स विधानसभा"));
        arrayList.add(new ThreeItemModel("पंद्रहवीं शताब्दी का यूरोपीय पुनर्जागरण", "कला और वास्तुकला में महान प्रगति के लिए जाना जाता है।"));
        arrayList.add(new ThreeItemModel("पोलैंड पर जर्मन हमला", "द्वितीय विश्व युद्ध  का तात्कालिक कारण था"));
        arrayList.add(new ThreeItemModel("द्वितीय विश्व युद्ध में परमाणु बम द्वारा नष्ट किया गया पहला शहर कौन सा था", "हिरोशिमा"));
        arrayList.add(new ThreeItemModel("किसने डेमोक्रेसी को जनता और लोगों के लिए सरकार के रूप में परिभाषित किया", "अब्राहम लिंकन"));
        arrayList.add(new ThreeItemModel("बैस्टिल ऑफ़ द फॉल", "1789 की फ्रांसीसी क्रांति से संबद्ध है"));
        arrayList.add(new ThreeItemModel("किसे वैज्ञानिक समाजवाद का संस्थापक माना जाता है", "कार्ल मार्क्स"));
        arrayList.add(new ThreeItemModel("दास कैपिटल और कम्युनिस्ट मेनिफेस्टो", "कार्ल मार्क्स द्वारा लिखा गया था"));
        arrayList.add(new ThreeItemModel("अमेरिका की स्वतंत्रता का युद्ध", "ब्रिटेन के खिलाफ लड़ा गया था"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("دوسری جنگ عظیم کب ختم ہوئی؟" , "1945"));
        arrayList.add(new ThreeItemModel("سینٹ سائمن ، چارلس فوئیر اور رابرٹ اوون" , "ابتدائی سوشلسٹ" ));
        arrayList.add(new ThreeItemModel("بوسٹن ٹی پارٹی میں ہوئی۔", "1770"));
        arrayList.add(new ThreeItemModel("1917 میں روس کی صوبائی حکومت کا سربراہ کون تھا؟" , "نکولس دوم"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون ہے جو یورپی نشا of ثانیہ کی مرکزی خصوصیت تھی؟" , "اس نے ادب ، مصوری اور فن تعمیر میں کلاسیکی نظریات کو واپس لایا"));
        arrayList.add(new ThreeItemModel("نشاance ثانیہ کا آغاز سب سے پہلے" , "اٹلی"  ));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا یورپی نشا. ثانیہ کے بارے میں صحیح نہیں ہے؟" , "اس نے قدیم گریکو-رومن کلاسیکیوں کے مطالعے کی بحالی میں اظہار کیا۔"));
        arrayList.add(new ThreeItemModel("آخری رات کا کھانا ، پنرجہرن کی ایک مشہور پینٹنگ ایک ماسٹر ٹکڑا تھی", "لیونارڈو ڈاونچی"));
        arrayList.add(new ThreeItemModel("لبرٹی ، مساوات اور بھائی چارگی کی اصطلاح مندرجہ ذیل میں سے کس کے ساتھ ہے؟" , "فرانسیسی انقلاب"));
        arrayList.add(new ThreeItemModel("امریکی اعلان آزادی کے مصنف تھے" , "جیفرسن"));
        arrayList.add(new ThreeItemModel("فرانسیسی انقلاب کے دوران مندرجہ ذیل میں سے کون کون سے واقعہ خودمختاری کے زوال کی علامت ہے؟" , "14 جولائی ، 1789 کو باسٹیل کا زوال"));
        arrayList.add(new ThreeItemModel("ابتدائی پنرجہرن آرٹسٹوں نے مصوری کا کون سا انداز استعمال کیا؟" , "گریکو رومن"));
        arrayList.add(new ThreeItemModel("انگلینڈ میں اٹھارہویں صدی کے آخری سہ ماہی میں صنعتی انقلاب نے سب سے پہلے متاثر کیا", "کاٹن ٹیکسٹائل انڈسٹری"));
        arrayList.add(new ThreeItemModel("کون سا سال دوسری جنگ عظیم دوئم کے پھیلنے سے وابستہ ہے؟" , "1935"));
        arrayList.add(new ThreeItemModel("امریکی جنگ آزادی کے دوران مندرجہ ذیل میں سے کس نے امریکی فوج کو کمانڈ کیا؟" , "جارج واشنگٹن"));
        arrayList.add(new ThreeItemModel("ذیل میں درج چار سیاسی جماعتوں میں سے ، آخری بار کون سی تشکیل دی گئی؟" , "دی نیشنل کانگریس"));
        arrayList.add(new ThreeItemModel("آزادی ، مساوات اور بھائی چارہ کے خیالات پر زور دیا گیا" , "روسو"));
        arrayList.add(new ThreeItemModel("امریکی جنگ آزادی کے دوران مندرجہ ذیل میں سے کس نے امریکی فوج کو کمانڈ کیا؟" , "جارج واشنگٹن"));
        arrayList.add(new ThreeItemModel("پندرہویں صدی کا یورپی نشاance ثانیہ" , "آرٹ اور فن تعمیر" ));
        arrayList.add(new ThreeItemModel("فرانسیسی انقلاب کے وقت مندرجہ ذیل میں سے کون فزیو کریٹس کے نام سے جانا جاتا تھا؟" , "اکانومسٹ"));
        arrayList.add(new ThreeItemModel("صنعتی انقلاب پہلے ہوا" , "انگلینڈ"));
        arrayList.add(new ThreeItemModel("گورینیکا ، دنیا کی مشہور پینٹنگ نے رنگا ہوا تھا", "پکاسو"));
        arrayList.add(new ThreeItemModel("نیو ڈیل کے مصنف تھے" , "صدر فرینکلن ڈیلانو روس ویلٹ"));
        arrayList.add(new ThreeItemModel("کتاب سوشل کنٹریکٹ نے لکھی ہے", "روسو"));
        arrayList.add(new ThreeItemModel("پنرجہرن سائنسدان جس نے بتایا کہ کس طرح سیارے سورج کے گرد گھومتے ہیں" , "کیپلر"));
        arrayList.add(new ThreeItemModel("یورپ سے ہندوستان جانے والے سمندری راستے کی دریافت" , "واسکو دا-گاما" ));
        arrayList.add(new ThreeItemModel("جس نے نمائندگی کے بغیر ٹیکس وصول نہ کرنے کا نعرہ لگایا" , "امریکی کالونیوں"));
        arrayList.add(new ThreeItemModel("دوسری جنگ عظیم کے دوران جاپان میں ہیروشیما پر امریکہ کے ذریعہ پھینکے گئے ایٹم بم کا کیا نام تھا" , "لٹل بوائے"));
        arrayList.add(new ThreeItemModel("تاریخ کا پہلا کامیاب سوشلسٹ انقلاب تھا" , "امریکی انقلاب"));
        arrayList.add(new ThreeItemModel("تاریخ کا پہلا کامیاب سوشلسٹ انقلاب تھا" , "امریکی انقلاب"));
        arrayList.add(new ThreeItemModel("1917 کے لئے مشہور ہے", "روسی انقلاب"));
        arrayList.add(new ThreeItemModel("انگلینڈ کے شاہ جان کے ذریعہ میگنا کارٹا پر دستخط کب ہوا" , "1215"));
        arrayList.add(new ThreeItemModel("1930 کی دہائی کا معاشی بحران شروع ہوا", "امریکا"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل معاہدوں میں سے کس کے تحت انگریزوں نے 13 امریکی کالونیوں کی آزادی کو تسلیم کیا" , "معاہدہ پیرس"));
        arrayList.add(new ThreeItemModel("ابراہم لنکن کا سب سے اہم کارنامہ" , "غلامی کا خاتمہ"  ));
        arrayList.add(new ThreeItemModel("روسی انقلابی ، جس نے کمیونسٹ پارٹی کی بنیاد رکھی تھی", "لینن"));
        arrayList.add(new ThreeItemModel("انگلینڈ میں اٹھارہویں صدی کے آخری سہ ماہی میں صنعتی انقلاب نے سب سے پہلے متاثر کیا", "کاٹن ٹیکسٹائل انڈسٹری"));
        arrayList.add(new ThreeItemModel("کمیونسٹ منشور پہلی بار شائع ہوا", "جرمن"));
        arrayList.add(new ThreeItemModel("جمہوریہ کا مصنف کون تھا ، ایک مشہور کلاسک" , "افلاطون"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون مندرجہ ذیل واقعات کا شاعر تھا" , "ڈانٹے"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا واقعہ پہلے پیش آیا" , "امریکی جنگ آزادی"));
        arrayList.add(new ThreeItemModel("نمائندگی کے بغیر ٹیکس نہ لگانے کا نعرہ پہلی بار امریکی انقلاب کے دوران" , "میساچوسٹس اسمبلی"  ));
        arrayList.add(new ThreeItemModel("پندرہویں صدی کا یورپی نشاance ثانیہ بڑے ترقی کے لئے مشہور ہے", "فن اور فن تعمیر"));
        arrayList.add(new ThreeItemModel("پولینڈ پر جرمنی کا حملہ اس کی فوری وجہ تھا", "دوسری جنگ عظیم"));
        arrayList.add(new ThreeItemModel( "کس نے جمہوریت کو عوام کی حکومت ، عوام اور عوام کے لئے حکومت کی حیثیت سے تعبیر کیا" , "ابراہم لنکن" ));
        arrayList.add(new ThreeItemModel("کس نے جمہوریت کو عوام کی حکومت ، عوام اور عوام کے لئے حکومت کی حیثیت سے تعبیر کیا" , "ابراہم لنکن"));
        arrayList.add(new ThreeItemModel("باسٹیل کا زوال اس کے ساتھ وابستہ ہے", "فرانسیسی انقلاب 1789"));
        arrayList.add(new ThreeItemModel("جسے سائنسی سوشلزم کا بانی سمجھا جاتا ہے" , "کارل مارکس"));
        arrayList.add(new ThreeItemModel("داس کیپٹل اور کمیونسٹ منشور لکھے گئے تھے", "کارل مارکس"));
        arrayList.add(new ThreeItemModel("امریکہ کی جنگ آزادی کے خلاف لڑی گئی تھی", "برطانیہ"));


        return arrayList;
    }


}
