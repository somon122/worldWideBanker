package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_FamousInventors {


    private Context context;
    public Q_FamousInventors(Context context) {
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
          arrayList.add(new ThreeItemModel("Who invented the Postage stamp (adhesive)?", "James Chalmers in 1834."));
        arrayList.add(new ThreeItemModel("What is the name of the inventor of Postcard?", "John P Charlton in 1861"));
        arrayList.add(new ThreeItemModel("Who created the first Lego?", "Gottfried Kirk Christiansen in 1955 (registered trademark)"));
        arrayList.add(new ThreeItemModel("The Telegraph is invented by –", "Samuel Morse.  {1837 (patent)1838 (public demonstration)}"));
        arrayList.add(new ThreeItemModel("Who invented the DNA (structure)?", "Francis Crick, James Watson, Rosalind Franklin in 1953"));
        arrayList.add(new ThreeItemModel("What is the name of the inventor of the Camera (flexible roll film) Photographic film (using celluloid)?", "George Eastman in 1888-1889"));
        arrayList.add(new ThreeItemModel("The Swiss Army knife is invented by—", "Karl Elsner in 1891"));
        arrayList.add(new ThreeItemModel("When was the Electric washing machine invented?", "1908,1910 (patent) by Alva Fisher"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Penicillin?", "Alexander Fleming in 1928"));
        arrayList.add(new ThreeItemModel("Who invented Machine gun?", "Richard Jordan Gatling in 1862"));
        arrayList.add(new ThreeItemModel("Who invented Rocket, liquid-fueled (first launch)?", "Robert Goddard in 1926"));
        arrayList.add(new ThreeItemModel("Who is the inventor of the submarine?", "Cornelis Dribble."));
        arrayList.add(new ThreeItemModel("Who is the inventor of Refrigerator?", "Carl Paul Gottfried von Linde"));
        arrayList.add(new ThreeItemModel("When was Pacemaker (artificial, implantable) invented?", "in 1960 (first implant) by Wilson Greatbatch"));
        arrayList.add(new ThreeItemModel("Who invented Air Conditioning?", "Willis Carrier in 1902"));
        arrayList.add(new ThreeItemModel("Who invented Atomic Bomb?", "J. Robert Oppenheimer with his team in 1945"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Ball-Point Pen?", "Ladislo Biro in 1938"));
        arrayList.add(new ThreeItemModel("Who invented the internet?", "Robert E. Kahn and Vint Cerf"));
        arrayList.add(new ThreeItemModel("Who invented the mobile phone?", "Martin Cooper"));
        arrayList.add(new ThreeItemModel("Who invented Electric Chair?", "Thomas Edison in 1888"));
        arrayList.add(new ThreeItemModel("When was Macintosh Computer invented?", "in 1984 by Apple Inc."));
        arrayList.add(new ThreeItemModel("When was MS-DOS invented?", "in 1981 by Microsoft Corporation."));
        arrayList.add(new ThreeItemModel("Who invented ceiling fans?", "Philip Diehl in 1882"));
        arrayList.add(new ThreeItemModel("Who invented Electric motor?", "William Sturgeon, Emily Davenport, Thomas Davenport, Michael Faraday"));
        arrayList.add(new ThreeItemModel("Who is an inventor of Insulin?", "Frederick Banting & Charles Best in 1921"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Television?", "John Logie Baird in 1926 (demonstration of moving object televised)"));
        arrayList.add(new ThreeItemModel("Who is the inventor of medical Thermometer?", "Thomas Albert in 1867"));
        arrayList.add(new ThreeItemModel("Who is considered as the inventor of Video games?", "Ralph Baer in 1967"));
        arrayList.add(new ThreeItemModel("The name of the inventor of Telephone—", "Alexander Graham Bell in 1876"));
        arrayList.add(new ThreeItemModel("Who created Automobile, internal combustion (gasoline-powered)?", "Karl Benz in 1885 (1st patent issued for the gas-fueled car)"));
        arrayList.add(new ThreeItemModel("When was the first Fire-engine created?", " in 1518 by Anthony Blattner"));
        arrayList.add(new ThreeItemModel("When was Helicopter (first manned vertical lift-off) invented?", "in 1907 by Louis and Jacques Brigued"));
        arrayList.add(new ThreeItemModel("Who invented the Typewriter?", "William A Burt in 1829 (first US patent)."));
        arrayList.add(new ThreeItemModel("Who is credited for the invention of a Chocolate bar?", "Francois-Louis Cailler in 1819"));

        arrayList.add(new ThreeItemModel("Who invented Microscope (compound)?", "Hans Janssen in 1590"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Calculator (pocket)?", "Jack Kilby in 1967 (patent)"));
        arrayList.add(new ThreeItemModel("When was the Battery (dry cell) invented?", " in 1866 (patent) by Georges Leclenche"));
        arrayList.add(new ThreeItemModel("Who invented Bicycle (pedal)?", "Kirkpatrick Macmillan in 1839"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Balloon (hot air)?", "Joseph-Michel & Jacques-Etienne Montgolfier in 1783"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Match (safety, phosphorous)?", "Johan Edvard Lundstrom in 1855"));
        arrayList.add(new ThreeItemModel("When was the Plastic surgery invented?", " in 1940 by Archibald Hector McIndoe"));
        arrayList.add(new ThreeItemModel("Who invented Genetics?", "Johann Gregor Mendel in 1866"));
        arrayList.add(new ThreeItemModel("When was the Gas mask invented?", "in 1912 by Garrett Augustus Morgan."));
        arrayList.add(new ThreeItemModel("Who invented Micro-processor?", "Robert Norton Noyce & Gordon Moore in 1971."));
        arrayList.add(new ThreeItemModel(" Who is the inventor of Radio telescope?", "Grote Rebar in 1937"));
        arrayList.add(new ThreeItemModel("What is the name of the inventor of the Cash register?", "James J Ritty in 1879"));
        arrayList.add(new ThreeItemModel("Who invented X-rays?", "Wilhelm Roentgen in 1895"));
        arrayList.add(new ThreeItemModel("Who invented Aerosol can?", "Erik Rotheim in 1926,1927 (patent)"));
        arrayList.add(new ThreeItemModel("Who is the inventor of Morphine?", "Friedrich Wilhelm Adam Serturner in 1805."));
        arrayList.add(new ThreeItemModel("Who is the creator of the Jet engine?", "Frank Whittle in 1930 (patent)"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("কে নিরবচ্ছিন্ন এয়ার কন্ডিশনিং?", "উইল ক্যারিয়ার ইন"));
        arrayList.add(new ThreeItemModel("কে পারমাণবিক বোমা আবিষ্কার করেছেন?" , "রবার্ট ওপ্পেনহেইমারের সাথে একটি হাস্যরসের অনুভূতি রয়েছে।"));
        arrayList.add(new ThreeItemModel("সেটাই কি বল-পয়েন্ট পিনের আবিষ্কারক?" , "লুডিস্লো ব্রাউন"));
        arrayList.add(new ThreeItemModel("ইন্টারনেট কি চিরকুটবিহীন ছিল?", "রবার্ট এ। কাহন এবং কারেন্টফ ছিলেন"));
        arrayList.add(new ThreeItemModel("সেই অলক্ষিত সেল ফোনগুলি কি ছিল?", "মার্টিন কুপার"));
        arrayList.add(new ThreeItemModel("অবাঞ্ছিত বৈদ্যুতিক টিয়ার কে?", "টমাস এডিসন ইন"));
        arrayList.add(new ThreeItemModel("ম্যাকিনটোস কম্পিউটার কোথায় মনোযোগবিহীন?", "তারা অ্যাপল ইনক।"));
        arrayList.add(new ThreeItemModel("মিস-ডস অননোটেড কোথায়?", "তারা মাইক্রোসফ্ট কর্পোরেশন're"));
        arrayList.add(new ThreeItemModel("উও অবাঞ্ছিত হত্যা বন্ধ?", "ফিলিপ ডাহল ইন"));
        arrayList.add(new ThreeItemModel("দ্য আনচার্টেড ইলেকট্রিক মোটর?", "উইলিয়াম স্টারজন, এমিলি ডেভেনপোর্ট, টমাস ডেভেনপোর্ট, মাইকেল ফ্যারাডে"));
        arrayList.add(new ThreeItemModel("ইনসুলিনের এই উদ্ভাবক কে?", "ফ্রেডরিক বুটিং এবং চার্লসে সেরা"));
        arrayList.add(new ThreeItemModel("এটি কি টেলিভিশনের অসুবিধা হয়েছিল?" ," জান লোজে বার্ড ইন টি (মুভিং অবজেক্ট টেলিভিশনের বিক্ষোভ) "));
        arrayList.add(new ThreeItemModel("এটি কি মেডিকেল থার্মোমিটারের একটি লিখিত ছিল?", "টমাস অ্যালবার্ট ইন"));
        arrayList.add(new ThreeItemModel("ভিডিও গেমগুলির এই ষড়যন্ত্র তাত্ত্বিক কে ছিলেন?", "রাল্ফ বিয়ার ইন"));
        arrayList.add(new ThreeItemModel("নাম ছিল, নাম ছিল, টেলিফোন ছিল", "আলেকজান্ডার গ্রাহাম বেল ইন"));
        arrayList.add(new ThreeItemModel("অটোমোবাইল, অভ্যন্তরীণ জ্বলন (পেট্রল চালিত) কে তৈরি করেছেন?" , "কার্ল বেনজ ইন ١٨٨٥ (١ পেটেন্ট অ্যাসিড ফোর দ্য গ্যাস-ফিল্ড কার)"));
        arrayList.add(new ThreeItemModel("সেখানে কি অবসর সময়ে ফায়ার ইঞ্জিন জমা দেওয়া হয়েছিল?" , "অ্যান্টনি ব্লাটনার"));
        arrayList.add(new ThreeItemModel("কোনও হেলিকপ্টার (অবসর-মতো উল্লম্ব লিফট-ওয়াফল) কি নজরে ছিল?" ,"তারা হলেন লুইস এবং জ্যাক ব্রিগেড"));
        arrayList.add(new ThreeItemModel("তিনি কি একজন অলিখিত টাইপরাইটার ছিলেন?", "উইলিয়াম এ বার্ট ইন।"));
        arrayList.add(new ThreeItemModel("চকোলেট বার উদ্ভাবনের জন্য এই কৃতিত্ব কার?", "ফ্রেঞ্চই-লুই কলার ইন"));
        arrayList.add(new ThreeItemModel("অলিখিত লিখিত ডাকটিকিট কে ছিল?", "জেমস চিলমার্স ইন।"));
        arrayList.add(new ThreeItemModel("পোস্টকার্ডের নাম কী ছিল?", "জন পি। চার্লটন।"));
        arrayList.add(new ThreeItemModel("আপনি কি সুযোগটি নিতে চান?" , "গটফ্রিড কার্ক ক্রিস্টেনসেন ইন ١٩٥٥ (নিবন্ধিত ট্রেডমার্ক)"));
        arrayList.add(new ThreeItemModel("এই এনটোটেড বি এর টেলিগ্রাফ ছিল -", "স্যামুয়েল মরিস। {١٨٣٧ (পেটেন্ট) ١٨٣٨ (সর্বজনীন বিক্ষোভ)"));
        arrayList.add(new ThreeItemModel("তারা কি ডিএনএ (কাঠামো) আবিষ্কার করেছিল?" , "ফ্রান্সিস কার্ক, জেমস ওয়াটসন, রোজল্যান্ড ফ্র্যাঙ্কলিন ইন"));
        arrayList.add(new ThreeItemModel("ক্যামেরার নাম কী ছিল (ফ্ল্যাশিবল রোল ফিল্ম) ফটোগ্রাফিক ফিল্ম (উইশিং সেলুলয়েড)?", "জর্জ ইস্টম্যান 5- 5-6"));
        arrayList.add(new ThreeItemModel("এখানে ছিল সুইস আর্মি নাইফ"," কার্ল এলসনার ইন "));
        arrayList.add(new ThreeItemModel("সেখানে কি বৈদ্যুতিক ওয়াশিং মেশিন উদ্ভাবিত হয়েছিল?" , "1.2 (পেটেন্ট) অ লৌহঘটিত ফিশার"));
        arrayList.add(new ThreeItemModel("সে কি পেনিসিলিনের আবিষ্কারক ছিল?" , "আলেকজান্ডার ফ্লেমিং ইন"));
        arrayList.add(new ThreeItemModel("মেশিনগান কে আবিষ্কার করেছেন?", "রিচার্ড জর্ডান গ্যাটলিং ইন"));
        arrayList.add(new ThreeItemModel("আনলকড রকেট, তরল ক্ষেত্র (অবসর লঞ্চ) কে?" , "রবার্টের হার্টবার্ন"));
        arrayList.add(new ThreeItemModel("তারা কি সাবমেরিন ছিল?" , "কর্নেলিয়াস ড্রিবল।"));
        arrayList.add(new ThreeItemModel("ফ্রিজের উদ্ভাবক কে?", "কার্ল পল গটফ্রিড ভন লিন্ডে"));
        arrayList.add(new ThreeItemModel("পেসমেকার (কৃত্রিম, ইমপ্লান্টেবল) কখন আবিষ্কার করেছিলেন?", "1960 সালে (প্রথম ইমপ্লান্ট) উইলসন গ্রেটব্যাচ দ্বারা"));
        arrayList.add(new ThreeItemModel("মাইক্রোস্কোপ (যৌগিক) কে আবিষ্কার করেছিলেন?", "1590 সালে হ্যানস জানসেন"));
        arrayList.add(new ThreeItemModel("ক্যালকুলেটর (পকেট) এর উদ্ভাবক কে?", "1967 সালে জ্যাক কিলবি (পেটেন্ট)"));
        arrayList.add(new ThreeItemModel("1866 সালে জর্জেস লেলেঞ্চে দ্বারা ব্যাটারি (শুকনো সেল) কখন আবিষ্কার হয়েছিল? "," (পেটেন্ট) "));
        arrayList.add(new ThreeItemModel("সাইকেল (প্যাডেল) কে আবিষ্কার করেছেন?", "কেরকপ্যাট্রিক ম্যাকমিলান 1839 সালে"));
        arrayList.add(new ThreeItemModel("বেলুন (উত্তপ্ত বাতাস) এর আবিষ্কারক কে?", "জোসেফ-মিশেল এবং জ্যাক-এতিয়েন মন্টগল্ফিয়ার 1783"));
        arrayList.add(new ThreeItemModel("ম্যাচের উদ্ভাবক কে? (সুরক্ষা, ফসফরাস)?", "জোহান এডওয়ার্ড লুন্ডস্ট্রম ১৮৫৫ সালে"));
        arrayList.add(new ThreeItemModel("1940 সালে আর্চিবাল্ড হেক্টর ম্যাকআইন্ডো দ্বারা" ,"প্লাস্টিক সার্জারি কখন আবিষ্কার হয়েছিল? "));
        arrayList.add(new ThreeItemModel("জেনেটিক্স কে আবিষ্কার করেছেন?", "জোহান গ্রেগর মেন্ডেল 1866 সালে"));
        arrayList.add(new ThreeItemModel("কখন গ্যাসের মুখোশ উদ্ভাবিত হয়েছিল?" , "গ্যারেট অগাস্টাস মরগান 1912 সালে।"));
        arrayList.add(new ThreeItemModel("মাইক্রো প্রসেসর কে আবিষ্কার করেছিলেন?", "একাত্তরে রবার্ট নরটন নয়েস এবং গর্ডন মুর।"));
        arrayList.add(new ThreeItemModel("রেডিও টেলিস্কোপের উদ্ভাবক কে?", "1937 সালে গ্রোট রেবার"));
        arrayList.add(new ThreeItemModel("নগদ নিবন্ধকের উদ্ভাবকের নাম কী?", "জেমস জে রিট্টি 1879 সালে"));
        arrayList.add(new ThreeItemModel("এক্স-রে কে আবিষ্কার করেছেন?", "1895 সালে উইলহেলম রেন্টজেন"));
        arrayList.add(new ThreeItemModel("এরোসোল কারা আবিষ্কার করতে পারেন?", "এরিক রোথিম 1926,1927 সালে (পেটেন্ট)"));
        arrayList.add(new ThreeItemModel("মরফিনের উদ্ভাবক কে?", "ফ্রিডরিক উইলহেলাম অ্যাডাম সার্টার্নার 1805 সালে।"));
        arrayList.add(new ThreeItemModel("জেট ইঞ্জিনের নির্মাতা কে?", "1930 সালে ফ্র্যাঙ্ক হুইটল (পেটেন্ট)"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("एयर कंडीशनिंग का आविष्कार किसने किया?", "1902 में विलिस कैरियर"));
        arrayList.add(new ThreeItemModel("परमाणु बम का आविष्कार किसने किया था?" , "1945 में अपनी टीम के साथ जे। रॉबर्ट ओपेनहाइमर"));
        arrayList.add(new ThreeItemModel("बॉल-पॉइंट पेन के आविष्कारक कौन हैं?", "1938 में लाडिसो बिरो"));
        arrayList.add(new ThreeItemModel("इंटरनेट का आविष्कार किसने किया?", "रॉबर्ट ई। कान और विंट सेर्फ़"));
        arrayList.add(new ThreeItemModel("मोबाइल फोन का आविष्कार किसने किया?", "मार्टिन कूपर"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रिक चेयर का आविष्कार किसने किया?", "1888 में थॉमस एडिसन"));
        arrayList.add(new ThreeItemModel("एपल इंक द्वारा 1984 में " ,"ैकिन्टोश कंप्यूटर का आविष्कार कब हुआ?"));
        arrayList.add(new ThreeItemModel("एमएस-डॉस का आविष्कार कब हुआ था?" , "Microsoft Corporation द्वारा 1981 में।"));
        arrayList.add(new ThreeItemModel("छत के प्रशंसकों का आविष्कार किसने किया?", "1882 में फिलिप डाइहाल"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रिक मोटर का आविष्कार किसने किया?", "विलियम स्टर्जन, एमिली डेवनपोर्ट, थॉमस डेवनपोर्ट, माइकल फैराए"));
        arrayList.add(new ThreeItemModel("इंसुलिन का आविष्कारक कौन है?", "फ्रेडरिक बैंटिंग एंड चार्ल्स बेस्ट इन 1921"));
        arrayList.add(new ThreeItemModel("टेलीविजन का आविष्कारक कौन है?", "1926 में जॉन लोगी बेयर्ड (चलती हुई वस्तु का प्रदर्शन टेलीफ़ोन किया गया)"));
        arrayList.add(new ThreeItemModel("मेडिकल थर्मामीटर का आविष्कारक कौन है?", "1867 में थॉमस अल्बर्ट"));
        arrayList.add(new ThreeItemModel("1967 में वीडियो गेम के आविष्कारक के रूप में किसे माना जाता है?", "राल्फ बेयर"));
        arrayList.add(new ThreeItemModel("टेलीफोन के आविष्कारक का नाम-", "1876 में अलेक्जेंडर ग्राहम बेल"));
        arrayList.add(new ThreeItemModel("ऑटोमोबाइल, आंतरिक दहन (गैसोलीन द्वारा संचालित) किसने बनाया?", "1885 में कार्ल बेंज (गैस-ईंधन वाली कार के लिए पहला पेटेंट जारी किया गया) "));
        arrayList.add(new ThreeItemModel("पहला फायर-इंजन कब बनाया गया था?" , "1518 में एंथनी ब्लाटनर द्वारा"));
        arrayList.add(new ThreeItemModel("हेलिकॉप्टर (पहली बार वर्टिकल लिफ्ट-ऑफ) का आविष्कार कब हुआ था?" , "1907 में लुइस और जैक्स ब्रिगेड द्वारा"));
        arrayList.add(new ThreeItemModel("किसने टाइपराइटर का आविष्कार किया?", "1829 में विलियम ए बर्ट (पहला अमेरिकी पेटेंट)।"));
        arrayList.add(new ThreeItemModel("एक चॉकलेट बार के आविष्कार का श्रेय किसे दिया जाता है?", "1819 में फ्रेंकोइस-लुई कैलर"));
        arrayList.add(new ThreeItemModel("डाक टिकट (चिपकने वाला) का आविष्कार किसने किया?" , "1834 में जेम्स चैलर्स।"));
        arrayList.add(new ThreeItemModel("पोस्टकार्ड के आविष्कारक का नाम क्या है?", "जॉन पी चार्लटन 1861 में"));
        arrayList.add(new ThreeItemModel("किसने पहला लेगो बनाया?", "गॉटफ्रीड कर्क क्रिस्चेन ने 1955 में (पंजीकृत ट्रेडमार्क)"));
        arrayList.add(new ThreeItemModel("द टेलिग्राफ का आविष्कार किया गया है -", "सैमुअल मोर्स। {1837 (पेटेंट) 1838 (सार्वजनिक प्रदर्शन)"));
        arrayList.add(new ThreeItemModel("किसने डीएनए (संरचना) का आविष्कार किया?", "फ्रांसिस क्रिक, जेम्स वाटसन, रोस्लिंड फ्रैंकलिन ने 1953 में"));
        arrayList.add(new ThreeItemModel("कैमरा के आविष्कारक (लचीली रोल फिल्म) फोटोग्राफिक फिल्म (सेलुलॉइड का उपयोग करके) का नाम क्या है?", "1888-1889 में जॉर्ज ईस्टमैन"));
        arrayList.add(new ThreeItemModel("स्विस आर्मी चाकू का आविष्कार किसने किया-", "1891 में कार्ल एल्स्नर"));
        arrayList.add(new ThreeItemModel("अल्वा फिशर द्वारा इलेक्ट्रिक वॉशिंग मशीन का आविष्कार कब किया गया था?", "1908,1910 (पेटेंट)"));
        arrayList.add(new ThreeItemModel("पेनिसिलिन के आविष्कारक कौन हैं?", "1928 में अलेक्जेंडर फ्लेमिंग"));
        arrayList.add(new ThreeItemModel("मशीन गन का आविष्कार किसने किया?", "1862 में रिचर्ड जॉर्डन गैटलिंग ने"));
        arrayList.add(new ThreeItemModel("रॉकेट का आविष्कार किसने किया, तरल-ईंधन (पहला प्रक्षेपण)?", "1926 में रॉबर्ट गोडार्ड"));
        arrayList.add(new ThreeItemModel("पनडुब्बी का आविष्कारक कौन है?", "कॉर्नेलिस ड्रिबल।"));
        arrayList.add(new ThreeItemModel("फ्रिज का आविष्कारक कौन है?", "कार्ल पॉल गॉटफ्रीड वॉन लिंडे"));
        arrayList.add(new ThreeItemModel("1960 में पेसमेकर (कृत्रिम, प्रत्यारोपण योग्य) का आविष्कार कब किया गया?", "1960 में (पहली इम्प्लांट) विल्सन बॉबी द्वारा"));
        arrayList.add(new ThreeItemModel("माइक्रोस्कोप (यौगिक) का आविष्कार किसने किया?", "1590 हंस जानसेन"));
        arrayList.add(new ThreeItemModel("कैलकुलेटर (पॉकेट) के आविष्कारक कौन हैं?", "1967 में जैक किल्बी (पेटेंट)"));
        arrayList.add(new ThreeItemModel("1866 में बैटरी (ड्राई सेल) का आविष्कार कब हुआ था?", "जार्ज लेक्ले द्वारा 1866 (पेटेंट) में"));
        arrayList.add(new ThreeItemModel("किसने साइकिल (पैडल) का आविष्कार किया?", "1839 में किर्कपैट्रिक मैकमिलन"));
        arrayList.add(new ThreeItemModel("बलून (गर्म हवा) का आविष्कारक कौन है?" , "1783 में जोसेफ-मिशेल और जैक्स-एटिने मोंटेगोल्फियर"));
        arrayList.add(new ThreeItemModel("मैच का आविष्कारक (सुरक्षा, फॉस्फोरस) कौन है?", "जोहान एडवर्ड लुंडस्ट्रॉम 18-10 में"));
        arrayList.add(new ThreeItemModel("प्लास्टिक सर्जरी का आविष्कार कब किया गया था?" , "1940 में आर्चीबाल्ड हेक्टर मैकिंडो द्वारा"));
        arrayList.add(new ThreeItemModel("जेनेटिक्स का आविष्कार किसने किया?", "1866 में जोहान ग्रेगोर मेंडल"));
        arrayList.add(new ThreeItemModel("गैस मास्क का आविष्कार कब किया गया था?" , "1912 में गैरेट ऑगस्टस मॉर्गन द्वारा।"));
        arrayList.add(new ThreeItemModel("किसने माइक्रो-प्रोसेसर का आविष्कार किया?", "रॉबर्ट नॉर्टन नॉयस और गॉर्डन मूर ने 1971 में।"));
        arrayList.add(new ThreeItemModel("रेडियो टेलीस्कोप के आविष्कारक कौन हैं?", "1937 में ग्रोट रेबार"));
        arrayList.add(new ThreeItemModel("कैश रजिस्टर के आविष्कारक का नाम क्या है?", "जेम्स जे रिट्टी 1879 में"));
        arrayList.add(new ThreeItemModel("किसने एक्स-रे का आविष्कार किया?", "1895 में विल्हेम रेंटजेन"));
        arrayList.add(new ThreeItemModel("एरोसोल कैन का आविष्कार किसने किया?", "1926,1927 (पेटेंट) में एरिक रोटहीम"));
        arrayList.add(new ThreeItemModel("मॉर्फिन का आविष्कारक कौन है?", "1805 में फ्रेडरिक विल्हेम एडम सेर्टनर।"));
        arrayList.add(new ThreeItemModel("जेट इंजन का निर्माता कौन है?" , "1930 में फ्रैंक व्हिटेट (पेटेंट)"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();

        arrayList.add(new ThreeItemModel("ایئرکنڈیشنگ کی ایجاد کس نے کی؟" , "ولیس کیریئر 1902 میں"));
        arrayList.add(new ThreeItemModel("جوہری بم کی ایجاد کس نے کی؟" , "جے رابرٹ اوپن ہیمر اپنی ٹیم کے ساتھ 1945 میں"));
        arrayList.add(new ThreeItemModel("بال پوائنٹ قلم کا موجد کون ہے؟" , "1938 میں لاڈیسلو بیرو"));
        arrayList.add(new ThreeItemModel("انٹرنیٹ کس نے ایجاد کیا؟", "رابرٹ ای کاہن اور ونٹ سرف"));
        arrayList.add(new ThreeItemModel("موبائل فون کی ایجاد کس نے کی؟" , "مارٹن کوپر"));
        arrayList.add(new ThreeItemModel("الیکٹرک چیئر کس نے ایجاد کی؟" , "1888 میں تھامس ایڈیسن"));
        arrayList.add(new ThreeItemModel("میکنٹوش کمپیوٹر کی ایجاد کب ہوئی؟" , "1984 میں ایپل انک کے ذریعہ۔"));
        arrayList.add(new ThreeItemModel("MS-DOS کی ایجاد کب ہوئی؟" , "مائیکروسافٹ کارپوریشن کے ذریعہ 1981 میں۔"));
        arrayList.add(new ThreeItemModel("چھت کے پرستاروں کی ایجاد کس نے کی؟" , "فلپ ڈیہل 1882 میں"));
        arrayList.add(new ThreeItemModel("الیکٹرک موٹر کس نے ایجاد کی؟" , "ولیم اسٹارجن ، ایملی ڈیوین پورٹ ، تھامس ڈیوین پورٹ ، مائیکل فراڈے"));
        arrayList.add(new ThreeItemModel("انسولین کا موجد کون ہے؟" , "فریڈرک بینٹنگ اینڈ چارلس 1921 میں بہترین"));
        arrayList.add(new ThreeItemModel("ٹیلی ویژن کا موجد کون ہے؟" , "جان لوگی بیرڈ 1926 میں (حرکت پذیر شے کا ٹیلی ویژن کا مظاہرہ)"));
        arrayList.add(new ThreeItemModel("میڈیکل تھرمامیٹر کا موجد کون ہے؟" , "1867 میں تھامس البرٹ"));
        arrayList.add(new ThreeItemModel("ویڈیو گیمز کا موجد کون سمجھا جاتا ہے؟" ,"1967 میں رالف بیئر"));
        arrayList.add(new ThreeItemModel("ٹیلیفون— کے موجد کا نام" , "1876 میں الیگزینڈر گراہم بیل"));
        arrayList.add(new ThreeItemModel("آٹوموبائل ، اندرونی دہن (پٹرول سے چلنے والا) کس نے بنایا؟" , "کارل بینز نے 1885 میں (گیس سے چلنے والی کار کے لئے پہلا پیٹنٹ جاری کیا)"));
        arrayList.add(new ThreeItemModel("پہلے فائر انجن کو کب بنایا گیا تھا؟" ,  "1515 میں انتھونی بلاٹنر کے ذریعہ"));
        arrayList.add(new ThreeItemModel("ہیلی کاپٹر (پہلی بار عمودی لفٹ آف) کی ایجاد کب ہوئی؟" , "1907 میں بذریعہ لوئس اور جیک بریگیڈ"));
        arrayList.add(new ThreeItemModel("ٹائپ رائٹر کی ایجاد کس نے کی؟" , "1829 میں ولیم اے برٹ (پہلا امریکی پیٹنٹ)۔"));
        arrayList.add(new ThreeItemModel("چاکلیٹ بار کی ایجاد کا ساکھ کس کو دیا جاتا ہے؟" , "1819 میں فرانکوئس لوئس سیلر"));
        arrayList.add(new ThreeItemModel("ڈاک ٹکٹ کی ایجاد کس نے کی (چپکنے والی)؟" , "جیمز چامرز نے 1834 میں۔"));
        arrayList.add(new ThreeItemModel("پوسٹ کارڈ کے موجد کا نام کیا ہے؟" , "جان پی چارلٹن 1861 میں"));
        arrayList.add(new ThreeItemModel("پہلا لیگو کس نے بنایا؟" , "1955 میں گٹفریڈ کرک کرسچنین (رجسٹرڈ ٹریڈ مارک)"));
        arrayList.add(new ThreeItemModel("ٹیلی گراف کی ایجاد - -" , "سموئیل مرس نے کی۔ 37 1837 (پیٹنٹ) 1838 (عوامی مظاہرے)}"));
        arrayList.add(new ThreeItemModel("ڈی این اے (ساخت) کی ایجاد کس نے کی؟" , "فرانسس کرک ، جیمز واٹسن ، روزالینڈ فرینکلن 1953 میں"));
        arrayList.add(new ThreeItemModel("کیمرہ کے موجد (لچکدار رول فلم) فوٹوگرافی فلم (سیلولائڈ کا استعمال کرتے ہوئے) کا نام کیا ہے؟" , "جارج ایسٹ مین نے 1888-1889 میں"));
        arrayList.add(new ThreeItemModel("سوئس آرمی چاقو ایجاد ہوا ہے" , "کارل ایلسنر 1891 میں"));
        arrayList.add(new ThreeItemModel("الیکٹرک واشنگ مشین کی ایجاد کب ہوئی؟" , "الوا فشر کے ذریعہ 1908،1910 (پیٹنٹ)"));
        arrayList.add(new ThreeItemModel("پینسلن کا موجد کون ہے؟" , "1928 میں الیگزینڈر فلیمنگ"));
        arrayList.add(new ThreeItemModel("مشین گن کی ایجاد کس نے کی؟" , "1862 میں رچرڈ اردن گیٹلنگ"));
        arrayList.add(new ThreeItemModel("راکٹ ، مائع ایندھن (پہلی لانچ) کی ایجاد کس نے کی؟" , "1926 میں رابرٹ گوڈارڈ"));
        arrayList.add(new ThreeItemModel("سب میرین کا موجد کون ہے؟" , "کارنیلس ڈرائبل۔"));
        arrayList.add(new ThreeItemModel("ریفریجریٹر کا موجد کون ہے؟" , "کارل پال گوٹ فریڈ وون لنڈے"));
        arrayList.add(new ThreeItemModel("پیسمیکر (مصنوعی ، پرتیاروپت) کب ایجاد ہوا؟" , "1960 میں (پہلا امپلانٹ) ولسن گریٹ بیچ کے ذریعہ"));
        arrayList.add(new ThreeItemModel("مائکروسکوپ (کمپاؤنڈ) کس نے ایجاد کیا؟" , "ہنس جانسن 1590 میں"));
        arrayList.add(new ThreeItemModel("کیلکولیٹر (جیب) کا موجد کون ہے؟" , "جیک کیلبی 1967 میں (پیٹنٹ)"));
        arrayList.add(new ThreeItemModel("بیٹری (خشک سیل) کی ایجاد کب ہوئی؟" , "1866 میں (پیٹنٹ) از جارجز لیکلینچ"));
        arrayList.add(new ThreeItemModel("بائیسکل (پیڈل) کس نے ایجاد کیا؟" , "کرک پیٹرک میکملن 1839 میں"));
        arrayList.add(new ThreeItemModel("غبارے (گرم ہوا) کا موجد کون ہے؟" , "جوزف میشل اور جیکس - ایٹین مونٹ گالفئیر 1783 میں"));
        arrayList.add(new ThreeItemModel("میچ کا موجد کون ہے (حفاظت ، فاسفورس)؟" , "جوہان ایڈورڈ لنڈسٹروم 1855 میں"));
        arrayList.add(new ThreeItemModel("پلاسٹک سرجری کا ایجاد کب ہوا؟" , "آرکی بلڈ ہیکٹر میک انڈوے کے ذریعے 1940 میں"));
        arrayList.add(new ThreeItemModel("جینیاتیات کی ایجاد کس نے کی؟" , "1866 میں جوہن گریگور مینڈل"));
        arrayList.add(new ThreeItemModel("گیس ماسک کی ایجاد کب ہوئی؟" , "1912 میں گیریٹ آگسٹس مورگن کے ذریعہ۔"));
        arrayList.add(new ThreeItemModel("مائکرو پروسیسر کی ایجاد کس نے کی؟" , "رابرٹ نورٹن نوائس اور گورڈن مور نے 1971 میں۔"));
        arrayList.add(new ThreeItemModel("ریڈیو دوربین کا موجد کون ہے؟", "1937 میں گرٹ ریبر"));
        arrayList.add(new ThreeItemModel("کیش رجسٹر کے موجد کا نام کیا ہے؟" , "جیمز جے رٹی 1879 میں"));
        arrayList.add(new ThreeItemModel("ایکس رے کی ایجاد کس نے کی؟" , "ولہیم روینٹجن 1895 میں"));
        arrayList.add(new ThreeItemModel("ایروسول کون ایجاد کرسکتا ہے؟" , "1926،1927 (پیٹنٹ) میں ایرک روتیم"));
        arrayList.add(new ThreeItemModel("مورفین کا موجد کون ہے؟" , "فریڈرک ولہیلم ایڈم سٹرورنر 1805 میں۔"));
        arrayList.add(new ThreeItemModel("جیٹ انجن کا خالق کون ہے؟" , "فرینک وہٹل 1930 میں (پیٹنٹ)"));


        return arrayList;
    }


}
