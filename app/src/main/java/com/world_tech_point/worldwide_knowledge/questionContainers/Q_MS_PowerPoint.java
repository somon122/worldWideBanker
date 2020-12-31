package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_MS_PowerPoint {


    private Context context;
    public Q_MS_PowerPoint(Context context) {
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
        String str = "D.) All of above";
        arrayList.add(new ThreeItemModel("How can we view slide show repeated continuously ?\n\nA.) repeat continuously\nB.) loop continuously until Esc\nC.) loop more\nD.) None of these\n", "B.) loop continuously until Esc"));
        arrayList.add(new ThreeItemModel("How can we stop a slide show ?\n\nA.) Press the right arrow\nB.) Press Ctrl + A\nC.) Press Escape\nD.) Press Ctrl + S\n", "C.) Press Escape"));
        arrayList.add(new ThreeItemModel("Power Point can display data from which of the following add-in software of MS Office ?\n\nA.) Organization Chart\nB.) Photo Album\nC.) Equation Editor\nD.) All of above\n", str));
        arrayList.add(new ThreeItemModel("The spelling dialog box can be involved by choosing spelling from ____ menu.\n\nA.) tools\nB.) view\nC.) file\nD.) insert\n", "A.) tools"));
        arrayList.add(new ThreeItemModel("Which key do you press to check spelling ?\n\nA.) F9\nB.) F7\nC.) F5\nD.) F3\n", "B.) F7"));
        arrayList.add(new ThreeItemModel("PowerPoint slides can have ?\n\nA.) title, text, graphs\nB.) drawn objects, shapes\nC.) clipart, drawn art, visual\nD.) any of the above\n", "D.) any of the above"));

        arrayList.add(new ThreeItemModel("Which file format can be added to a PowerPoint show ?\n\nA.) .gif\nB.) .jpg\nC.) .wav\nD.) All of above\n", str));
        arrayList.add(new ThreeItemModel("How to select one hyperlink after another during a slide presentation ?\n\nA.) Ctrl + K\nB.) Ctrl + D\nC.) Ctrl + H\nD.) Tab\n", "D.) Tab"));
        arrayList.add(new ThreeItemModel("Which PowerPoint feature allows the user to create a simple presentation quickly ?\n\nA.) Animations\nB.) Chart Wizard\nC.) Transition Wizard\nD.) AutoContent Wizard\n", "D.) AutoContent Wizard"));
        arrayList.add(new ThreeItemModel("\nWhich PowerPoint view works best for adding slide transitions ?\n\nA.) Slide sorter view\nB.) Slide show view\nC.) Slide view\nD.) Notes view\n", "A.) Slide sorter view"));
        arrayList.add(new ThreeItemModel("Special effects used to introduce slides in a presentation are known as ?\n\nA.) transitions\nB.) effects\nC.) Custom animations\nD.) annotations\n", "A.) transitions"));
        arrayList.add(new ThreeItemModel("Slide sorter can be accessed from which menu ?\n\nA.) View\nB.) Edit\nC.) File\nD.) Insert\n", "A.) View"));
        arrayList.add(new ThreeItemModel("To print powerpoint presentation, press :\n\nA.) Ctrl + P\nB.) CTRL + S\nC.) Ctrl + Shift + P\nD.) Ctrl + A\n", "A.) Ctrl + P"));
        arrayList.add(new ThreeItemModel("What would I choose to create a pre-formatted style ?\n\nA.) Format\nB.) Slide layout\nC.) Slide sorter view\nD.) None of above\n", "B.) Slide layout"));
        arrayList.add(new ThreeItemModel("To edit a chart, we can\n\nA.) Click and drag the chart object\nB.) Double click the chart object\nC.) Triple click the chart object\nD.) Click the chart object\n", "B.) Double click the chart object"));
        arrayList.add(new ThreeItemModel("To preview a motion path effect using the custom animation task pane, we should\n\nA.) double click the motion path\nB.) click the show effect button\nC.) click the play button\nD.) None of above\n", "C.) click the play button"));
        arrayList.add(new ThreeItemModel("You can create a new presentation by completing all of the following except\n\nA.) Clicking the new button on the standard toolbar\nB.) Clicking file, new\nC.) Pressing ctrl + N\nD.) Clicking file open\n", "D.) Clicking file open"));
        arrayList.add(new ThreeItemModel("What is the term used when you press and hold the left mouse key and more the mouse around the slide ?\n\nA.) Moving\nB.) Dragging\nC.) Monitoring\nD.) Highlighting\n", "B.) Dragging"));
        arrayList.add(new ThreeItemModel("what term describes a background that appears as a grainy, non smooth surface ?\n\nA.) Pattern\nB.) Gradient\nC.) Velvet\nD.) Texture\n", "B.) Gradient"));
        arrayList.add(new ThreeItemModel("Which of the following views is the best view to use when setting transition effects for all slides in a presentation ?\n\nA.) Slide view\nB.) Notes page view\nC.) Outline view\nD.) Slide sorter view\n", "D.) Slide sorter view"));
        arrayList.add(new ThreeItemModel("Which of the following will not advance the slides in a slide show view ?\n\nA.) The mouse button\nB.) The enter key\nC.) The mouse button\nD.) The esc key\n", "D.) The esc key"));
        arrayList.add(new ThreeItemModel("Which option can be used to set custom timings for slides in a presentation ?\n\nA.) Slider Timings\nB.) Slider Timer\nC.) Rehearsal\nD.) Slide Show Setup\n", "C.) Rehearsal"));
        arrayList.add(new ThreeItemModel("Which type of fonts are best suite for titles and headlines ?\n\nA.) Sans Serif Fonts\nB.) Picture Fonts\nC.) Text Fonts\nD.) Serif Fonts\n", "A.) Sans Serif Fonts"));
        arrayList.add(new ThreeItemModel("Which key can be used to view Slide show ?\n\nA.) F5\nB.) F2\nC.) F7\nD.) F8\n", "A.) F5"));
        arrayList.add(new ThreeItemModel("Which of the following can you use to add times to the slides in a presentation ?\n\nA.) Rehearse timing button\nB.) Slice Show menu\nC.) Slide transition button\nD.) All of above\n", "A.) Rehearse timing button"));

        arrayList.add(new ThreeItemModel("To open the existing presentation, press\n\nA.) CTRL + A\nB.) CTRL + O\nC.) CTRL + N\nD.) CTRL + L\n", "B.) CTRL + O"));
        arrayList.add(new ThreeItemModel("Ellipse Motion is a predefined ___ .\n\nA.) Design Template\nB.) Color Scheme\nC.) Animation Scheme\nD.) None of above\n", "B.) Color Scheme"));
        arrayList.add(new ThreeItemModel("A File which contains readymade styles that can be used for a presentation is called __ ?\n\nA.) Pre formatting\nB.) AutoStyle\nC.) Wizard\nD.) Template\n", "D.) Template"));
        arrayList.add(new ThreeItemModel("What is maximum Zoom percentage in Microsoft PowerPoint ?\n\nA.) 100%\nB.) 400%\nC.) 300%\nD.) 200%\n", "B.) 400%"));
        arrayList.add(new ThreeItemModel("How we can put a Chart in the presentation using PowerPoint ?\n\nA.) Insert -> Pictures -> Chart\nB.) Edit -> Chart\nC.) Insert -> Chart\nD.) View -> Chart\n", "A.) Insert -> Pictures -> Chart"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str = "ডি।) সর্বোপরি";
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি স্লাইড শো ভিউতে স্লাইডগুলি অগ্রসর করবে না? ক। মাউস বোতাম বি।) কী কী প্রবেশ করান সি) মাউস বোতাম D.) এসকি কী", "ডি। এসকি কী"));
        arrayList.add(new ThreeItemModel("উপস্থাপনায় স্লাইডগুলির জন্য কাস্টম সময় নির্ধারণ করতে কোন বিকল্পটি ব্যবহার করা যেতে পারে? ক। স্লাইডার টাইমিংস বি।) স্লাইডার টাইমার সি) রিহার্সাল ডি।) স্লাইড শো সেটআপ", "সি।) রিহার্সাল"));
        arrayList.add(new ThreeItemModel("কোন ধরণের ফন্ট শিরোনাম এবং শিরোনামগুলির জন্য সেরা স্যুট? ক) সানস সেরিফ হরফ খ) পিকচার ফন্ট সি। পাঠ্য ফন্ট D.) সেরিফ হরফ", "এ।) সানস সেরিফ হরফ"));
        arrayList.add(new ThreeItemModel("স্লাইড শো দেখতে কোন কী ব্যবহার করা যেতে পারে? এ। এফ 5 বি) এফ 2 সি) এফ 7 ডি) এফ 8", "এ) এফ 5"));
        arrayList.add(new ThreeItemModel("উপস্থাপনায় আপনি স্লাইডগুলিতে সময় যোগ করতে নিম্নলিখিতগুলির মধ্যে কোনটি ব্যবহার করতে পারেন? ক) সময়সামার বোতামটি রিহার্সাল করুন)) স্লাইস শো মেনু সি) স্লাইড রূপান্তর বোতাম ডি) উপরের সমস্ত", "এ) রিহার্সিং টাইমিং বোতামটি "));
        arrayList.add(new ThreeItemModel("আমরা কীভাবে ধারাবাহিকভাবে পুনরাবৃত্তি স্লাইড শো দেখতে পারি? এ।) ধারাবাহিকভাবে পুনরাবৃত্তি করা উচিত বি।) এসএসসি সি পর্যন্ত অবিচ্ছিন্ন লুপ) আরও লুপ। ডি। এগুলির কোনওটি", "বি) এএসসি অবধি অবিরত লুপ"));
        arrayList.add(new ThreeItemModel("পাওয়ারপয়েন্ট শোতে কোন ফাইলের ফর্ম্যাট যুক্ত করা যায়? এ) .gif বি) .jpg সি)। ওয়াভ ডি) উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("স্লাইড উপস্থাপনা চলাকালীন কীভাবে একের পর এক হাইপারলিঙ্ক নির্বাচন করবেন? এ। Ctrl + K বি।) Ctrl + ডি সি) Ctrl + এইচ ডি। ট্যাব", "ডি।) ট্যাব"));
        arrayList.add(new ThreeItemModel("কোন পাওয়ার পয়েন্ট বৈশিষ্ট্যটি ব্যবহারকারীকে দ্রুত একটি সাধারণ উপস্থাপনা তৈরি করতে দেয়? ক। অ্যানিমেশনস খ) চার্ট উইজার্ড সি) ট্রানজিশন উইজার্ড ডি। অটোকন্ট কনসেন্ট উইজার্ড", "ডি।) স্বতঃসংশ্লিষ্ট উইজার্ড"));
        arrayList.add(new ThreeItemModel("  কী পাওয়ারপয়েন্ট ভিউ স্লাইড ট্রানজিশন যুক্ত করার জন্য সবচেয়ে ভাল কাজ করে? ক) স্লাইড সোর্টার ভিউ বি।) স্লাইড শো ভি। সি। স্লাইড ভিউ ডি। নোটস ভিউ", "এ।) স্লাইডের সর্ট ভিউ"));
        arrayList.add(new ThreeItemModel("উপস্থাপনায় স্লাইডগুলি প্রবর্তন করতে ব্যবহৃত বিশেষ প্রভাবগুলি? ক। রূপান্তর বি।) প্রভাব সি। কাস্টম অ্যানিমেশনগুলি ডি) টিকা","এ।) রূপান্তর"));
        arrayList.add(new ThreeItemModel("কোন মেনু থেকে স্লাইড সর্টারে অ্যাক্সেস করা যায়? এ। বি। সম্পাদনা করুন।) ফাইল ডি। Sertোকান", "এ) দেখুন"));
        arrayList.add(new ThreeItemModel("পাওয়ারপয়েন্ট উপস্থাপনা মুদ্রণের জন্য, টিপুন: এ।) সেন্ট্রাল + পি বি) সিটিআরএল + এস সি) সেন্ট্রাল + শিফট + পি ডি।) সেন্ট্রাল + এ", "এ।) সেন্ট্রাল + পি"));
        arrayList.add(new ThreeItemModel("প্রাক-ফর্ম্যাট শৈলীটি তৈরি করতে আমি কী বেছে নেব? এ। ফর্ম্যাট বি) স্লাইড লেআউট সি। স্লাইড সর্টর ভি। ডি) উপরের কোনওটি", "বি) স্লাইড বিন্যাস"));
        arrayList.add(new ThreeItemModel("চার্ট সম্পাদনা করতে, আমরা এ।) চার্ট অবজেক্টটি ক্লিক করে টেনে আনি খ) চার্ট অবজেক্ট সিটিতে ডাবল ক্লিক করুন সি) চার্ট অবজেক্টে ট্রিপল ক্লিক করুন ডি) চার্ট অবজেক্টে ক্লিক করুন", "খ) চার্টে ডাবল ক্লিক করুন বস্তু "));
        arrayList.add(new ThreeItemModel("কাস্টম অ্যানিমেশন টাস্ক ফলকটি ব্যবহার করে একটি গতিপথের প্রভাবের পূর্বরূপ দেখতে, আমাদের এ। হওয়া উচিত) গতিপথের বিতে ডাবল ক্লিক করুন বি।) শো এফেক্ট বোতামটি ক্লিক করুন সি) প্লে বাটনে ক্লিক করুন ডি) উপরের কোনওটি", "সি। ) প্লে বাটনে ক্লিক করুন "));
        arrayList.add(new ThreeItemModel("আপনি এ বাদে নীচের সমস্তগুলি সম্পূর্ণ করে একটি নতুন উপস্থাপনা তৈরি করতে পারেন the) স্ট্যান্ডার্ড টুলবারে নতুন বোতামটি ক্লিক করে বি।) ফাইল ক্লিক করুন, নতুন সি) সিটিআরএল + এন ডি চাপুন) ফাইলটি ওপেন করুন", "ডি। ) ক্লিক করে ফাইল খোলা "));
        arrayList.add(new ThreeItemModel("আপনি যখন স্লাইডের উপরে বাম মাউস কী এবং আরও মাউস টিপুন এবং ধরে রাখেন তখন শব্দটি কী ব্যবহৃত হয়? A।) চলমান  C)", "B.) Dragging"));
        arrayList.add(new ThreeItemModel("কোন শব্দটি এমন পটভূমি বর্ণনা করে যা দানাদার, মসৃণ পৃষ্ঠ হিসাবে প্রদর্শিত হয়? ক। প্যাটার্ন বি।) গ্রেডিয়েন্ট সি) ভেলভেট ডি) গঠন", "বি।) গ্রেডিয়েন্ট"));
        arrayList.add(new ThreeItemModel("উপস্থাপনায় সমস্ত স্লাইডের জন্য ট্রানজিশন ইফেক্টস সেট করার সময় নীচের মতামতের মধ্যে কোনটি ব্যবহার করা ভাল? এ। স্লাইড ভিউ বি) নোটস পৃষ্ঠা"," ভি। ) স্লাইড সাজানো ভিউ "));


        arrayList.add(new ThreeItemModel("আমরা কীভাবে একটি স্লাইড শো থামাতে পারি? এ।) ডান তীর টিপুন বি।) সিটিআরএল + এ সি টিপুন) এস্কেপ প্রেস টিপুন) সিটিটিএল + এস টিপুন", "সি। প্রেস প্রেস "));
        arrayList.add(new ThreeItemModel("পাওয়ার পয়েন্ট এমএস অফিসের নিম্নলিখিত অ্যাড-ইন সফ্টওয়্যার থেকে ডেটা প্রদর্শন করতে পারে? একটি) সংস্থা চার্ট বি। ফটো অ্যালবাম সি) সমীকরণ সম্পাদক D.) উপরের সমস্ত", str));
        arrayList.add(new ThreeItemModel("বানান ডায়লগ বাক্স ____ মেনু থেকে বানান চয়ন করে জড়িত থাকতে পারে A.। সরঞ্জামগুলি খ) সি দেখুন ফাইল ডি) sertোকান", "এ) সরঞ্জাম"));
        arrayList.add(new ThreeItemModel("বানানটি পরীক্ষা করতে আপনি কোন কী টিপেন? এ। এফ 9 বি) এফ 7 সি) এফ 5 ডি) এফ 3", "বি) এফ 7"));
        arrayList.add(new ThreeItemModel("পাওয়ারপয়েন্ট স্লাইডগুলিতে কি? এ। শিরোনাম, পাঠ্য, গ্রাফ বি) টানা অবজেক্ট, আকার সি) ক্লিপআর্ট, আঁকা শিল্প, ভিজ্যুয়াল ডি) উপরের যে কোনও", "ডি) উপরের যে কোনও"));
        arrayList.add(new ThreeItemModel("বিদ্যমান উপস্থাপনাটি খোলার জন্য, এ। টিপুন।) সিটিআরএল + এ বি।) সিটিআরএল + ও সি।) সিটিআরএল + এন ডি।) সিটিআরএল + এল", "বি।) সিটিআরএল + ও"));
        arrayList.add(new ThreeItemModel("উপবৃত্ত মোশন একটি পূর্বনির্ধারিত ___ A.) ডিজাইন টেম্পলেট বি) রঙীন স্কিম সি) অ্যানিমেশন স্কিম D.) উপরের কিছুই নয়", "খ) রঙীন স্কিম"));
        arrayList.add(new ThreeItemModel("একটি ফাইল যা রেডিমেড স্টাইলগুলি ধারণ করে যা উপস্থাপনের জন্য ব্যবহার করা যেতে পারে তাকে বলা হয় __? এ। প্রাক ফর্ম্যাটিং বি।) অটোস্টাইল সি) উইজার্ড ডি) টেম্পলেট", "ডি। টেম্পলেট"));
        arrayList.add(new ThreeItemModel("মাইক্রোসফ্ট পাওয়ারপয়েন্টে সর্বাধিক জুম শতাংশ কত? A।) 100% B।) 400% C।) 300% D।) 200%  ", "বি) 400%"));
        arrayList.add(new ThreeItemModel("পাওয়ারপয়েন্ট ব্যবহার করে উপস্থাপনাটিতে আমরা কীভাবে একটি চার্ট স্থাপন করতে পারি? ক। --োকান -> ছবি -> চার্ট বি) সম্পাদনা -> চার্ট সি) sertোকান -> চার্ট ডি) দেখুন -> চার্ট","এ) সন্নিবেশ -> ছবি -> চার্ট "));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str = "डी।) सब से ऊपर";
        arrayList.add(new ThreeItemModel("किस फ़ाइल प्रारूप को PowerPoint शो में जोड़ा जा सकता है? A) .gif b) .jpg c) .wav d) उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("स्लाइड प्रस्तुति के दौरान एक के बाद एक हाइपरलिंक का चयन कैसे करें? ए Ctrl + केबी। Ctrl + DC) Ctrl + HD। टैब", "D.) टैब"));
        arrayList.add(new ThreeItemModel("कौन सा PowerPoint सुविधा उपयोगकर्ता को एक सरल प्रस्तुति बनाने की अनुमति देती है? ए एनिमेशन बी) चार्ट विजार्ड c) संक्रमण विज़ार्ड डी। ऑटोकंटेंट सहमति विज़ार्ड", "डी) स्वतः पूर्ण विज़ार्ड"));
        arrayList.add(new ThreeItemModel("स्लाइड ट्रांज़िशन जोड़ने के लिए कौन सा पावरपॉइंट व्यू सबसे अच्छा काम करता है? ए) स्लाइड सॉर्टर व्यू बी।) स्लाइड शो वी। सी। स्लाइड व्यू डी। नोट्स व्यू", "ए।) स्लाइड सॉर्ट व्यू"));
        arrayList.add(new ThreeItemModel("विशेष प्रभाव एक प्रस्तुति में स्लाइड्स को पेश करने के लिए उपयोग किया जाता है। ए रूपांतरण बी। प्रभाव सी। कस्टम एनिमेशन डी) एनोटेशन", "ए।) रूपांतरण"));
        arrayList.add(new ThreeItemModel("किस मेनू से स्लाइड सॉर्टर तक पहुँचा जा सकता है? संपादित करें .B। संपादित करें।) फ़ाइल D.Certify", "A View "));
        arrayList.add(new ThreeItemModel("PowerPoint प्रस्तुति को प्रिंट करने के लिए, प्रेस: ​​a।) सेंट्रल + PB) CTRL + SC) सेंट्रल + शिफ्ट + पीडी।) सेंट्रल + ए", "ए) सेंट्रल + पी"));
        arrayList.add(new ThreeItemModel("मुझे पूर्व-प्रारूप शैली बनाने के लिए क्या चुनना चाहिए? ए प्रारूप बी) स्लाइड लेआउट सी। स्लाइड सॉर्टर वीडी) उपरोक्त में से कोई भी", "बी) स्लाइड प्रारूप"));
        arrayList.add(new ThreeItemModel("चार्ट को संपादित करने के लिए, हमें पर क्लिक करना है और चार्ट ऑब्जेक्ट को खींचें b) चार्ट ऑब्जेक्ट शहर पर डबल क्लिक करें c) चार्ट ऑब्जेक्ट पर ट्रिपल क्लिक करें d) चार्ट ऑब्जेक्ट पर क्लिक करें "," बी) चार्ट ऑब्जेक्ट पर डबल क्लिक करें "));
        arrayList.add(new ThreeItemModel("कस्टम एनीमेशन कार्य फलक का उपयोग करते हुए प्रक्षेपवक्र के प्रभाव का पूर्वावलोकन करने के लिए, हमारे पास एक होना चाहिए।) प्रक्षेपवक्र पर डबल-क्लिक करें।) शो प्रभाव बटन पर क्लिक करें। सी) प्ले बटन पर क्लिक करें। डी) उपरोक्त में से कोई नहीं।" ,"पर क्लिक करें"));
        arrayList.add(new ThreeItemModel("आप निम्न में से सभी को पूरा करके एक नई प्रस्तुति बना सकते हैं) a) मानक टूलबार में नया बटन पर क्लिक करके b) फ़ाइल पर क्लिक करके, नए c पर क्लिक करके CTRL + ND) फ़ाइल खोलें", "d।) फ़ाइल पर क्लिक करें। खुला हुआ "));
        arrayList.add(new ThreeItemModel("जब आप बाईं माउस कुंजी दबाते हैं और स्लाइड पर माउस को पकड़ते हैं तो कौन सा शब्द प्रयोग किया जाता है? ए) रनिंग सी)", "बी। ड्रैगिंग"));
        arrayList.add(new ThreeItemModel("कौन सा शब्द एक ऐसी पृष्ठभूमि का वर्णन करता है जो एक दानेदार, चिकनी सतह के रूप में दिखाई देती है? ए पैटर्न बी। ग्रेडिएंट सी) मखमल घ) संरचना", "बी।) ग्रेडिएंट।"));
        arrayList.add(new ThreeItemModel("प्रस्तुति में सभी स्लाइड्स के लिए संक्रमण प्रभाव सेट करते समय निम्नलिखित में से किस टिप्पणी का उपयोग किया जाना चाहिए? ए स्लाइड व्यू बी) नोट्स पेज", "वी।) स्लाइड सॉर्ट व्यू"));
        arrayList.add(new ThreeItemModel("स्लाइड शो दृश्य में निम्नलिखित में से कौन स्लाइड को स्थानांतरित नहीं करेगा? माउस बटन b।) कुंजी c दर्ज करें) माउस बटन d) एसकी कुंजी", "d eski कुंजी"));
        arrayList.add(new ThreeItemModel("प्रस्तुति में स्लाइड के लिए कस्टम समय सेट करने के लिए कौन सा विकल्प इस्तेमाल किया जा सकता है? ए स्लाइडर समय। बी। स्लाइडर टाइमर सी) रिहर्सल डी।) स्लाइड शो सेटअप", "सी। रिहर्सल "));
        arrayList.add(new ThreeItemModel("शीर्षक और शीर्षकों के लिए किस प्रकार का फ़ॉन्ट सबसे उपयुक्त है? ए) सेन्स सेरिफ़ फॉन्ट बी) पिक्चर फॉन्ट सी। टेक्स्ट फॉन्ट डी। सेरिफ़ फ़ॉन्ट", "ए।) सैंस सेरिफ़ फ़ॉन्ट"));
        arrayList.add(new ThreeItemModel("स्लाइड शो देखने के लिए किन कुंजियों का उपयोग किया जा सकता है? (F5B) F2C) F7D) F8", "A) F5"));
        arrayList.add(new ThreeItemModel("निम्न में से आप किसी प्रस्तुति में स्लाइड में समय जोड़ने के लिए किसका उपयोग कर सकते हैं? ए) समय बटन को फिर से देखें) क) स्लाइस शो मेन्यू सी) स्लाइड रूपांतरण बटन d) उपरोक्त सभी", "ए) रिहर्सिंग टाइमिंग बटन"));
        arrayList.add(new ThreeItemModel("हम एक सतत स्लाइड शो कैसे देख सकते हैं? ए) को लगातार बी को दोहराया जाना चाहिए) एसएससी सी को निरंतर लूप) अधिक लूप। डी। इनमें से कोई भी", "बी) एएससी तक निरंतर लूप"));
        arrayList.add(new ThreeItemModel("हम एक स्लाइड शो कैसे रोकते हैं? ए) दायाँ तीर दबाएँ। b) प्रेस CTRL + AC।) एस्केप प्रेस दबाएँ) प्रेस CTTL + S", "C. दबाएँ।"));
        arrayList.add(new ThreeItemModel("PowerPoint MS Office के निम्न ऐड-इन सॉफ़्टवेयर से डेटा प्रदर्शित कर सकता है? ए) संगठन चार्ट बी। फोटो एल्बम सी) समीकरण संपादक डी।) उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("स्पेलिंग डायलॉग बॉक्स को मेनू ए। टूल्स बी) सी व्यू फाइल डी) सीरट से स्पेलिंग चुनकर शामिल किया जा सकता है", "ए) टूल्स"));
        arrayList.add(new ThreeItemModel("वर्तनी की जाँच करने के लिए आप किस कुंजी को दबाते हैं? (F9B) F7C) F5D) F3", "B) F7"));
        arrayList.add(new ThreeItemModel("PowerPoint स्लाइड्स में क्या है? ए शीर्षक, पाठ, ग्राफ b) आरेखित वस्तु, आकार c) क्लिपआर्ट, ड्राइंग आर्ट, विजुअल d) उपरोक्त में से कोई भी", "उपरोक्त में से कोई भी"));
        arrayList.add(new ThreeItemModel("एक मौजूदा प्रस्तुति खोलने के लिए, A.) CTRL + AB दबाएं। CTRL + O C.) CTRL + ND।) CTRL + L", "B.) CTRL + O"));
        arrayList.add(new ThreeItemModel("अण्डाकार गति एक डिफ़ॉल्ट ___ A.) डिज़ाइन टेम्पलेट है b) रंग योजना c) एनीमेशन योजना D.) ऊपर कुछ भी नहीं", "b) रंग योजना"));
        arrayList.add(new ThreeItemModel("एक फाइल जिसमें रेडीमेड शैलियाँ होती हैं, जिन्हें प्रस्तुति के लिए इस्तेमाल किया जा सकता है, __ कहलाती है। पूर्व-स्वरूपण b।) ऑटोस्टाइल c) विज़ार्ड d) टेम्पलेट", "D. टेम्पलेट"));
        arrayList.add(new ThreeItemModel("Microsoft PowerPoint में अधिकतम ज़ूम प्रतिशत क्या है? A.) 100% B.) 400% C.) 300% D.) 200%", "B) 400%"));
        arrayList.add(new ThreeItemModel("हम पावरपॉइंट का उपयोग करके किसी प्रस्तुति में चार्ट कैसे लगाते हैं? -> -> छवि -> चार्ट बी) संपादित करें -> चार्ट सी) सर्ट - -> चार्ट डी) दृश्य -> ​​चार्ट", "ए) डालें -> चित्र -> चार्ट "));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        String str = "D.) سب سے بڑھ کر";
        arrayList.add(new ThreeItemModel("پاورپوائنٹ شو میں کون سی فائل کی شکل شامل کی جاسکتی ہے؟ A) .gif b) .jpg c) .wav d) مندرجہ بالا سب", str));
        arrayList.add(new ThreeItemModel("سلائیڈ پریزنٹیشن کے دوران ایک کے بعد ہائپر لنکس کو کیسے منتخب کریں؟ A. Ctrl + K B.) Ctrl + DC) Ctrl + HD. ٹیب" , "D.) ٹیب"));
        arrayList.add(new ThreeItemModel("سلائیڈ پریزنٹیشن کے دوران ایک کے بعد ہائپر لنکس کو کیسے منتخب کریں؟ A. Ctrl + K B.) Ctrl + DC) Ctrl + HD. ٹیب" , "D.) ٹیب"));
        arrayList.add(new ThreeItemModel("سلائیڈ ٹرانزیشن کو شامل کرنے کے لئے کون سا پاورپوائنٹ نظارہ سب سے بہتر کام کرتا ہے؟ ا) سلائیڈ سارٹر ویو بی۔) سلائیڈ شو بمقابلہ۔ سلائڈ ویو ڈی. نوٹس ویو" , "اے) سلائیڈ ترتیب ملاحظہ"));
        arrayList.add(new ThreeItemModel("ایک پریزنٹیشن میں سلائیڈوں کو متعارف کروانے کے لئے استعمال ہونے والے خاص اثرات؟ A. تبادلوں سے ب.) اثرات ج۔ اپنی مرضی کے مطابق متحرک تصاویر d) تشریحات" , "اے) تبادلوں"));
        arrayList.add(new ThreeItemModel("کس مینو سے سلائڈ چھانٹیا تک رسائی حاصل کی جاسکتی ہے؟ ترمیم. بی. ترمیم کریں۔) فائل ڈی تصدیق کریں" , "A) دیکھیں"));
        arrayList.add(new ThreeItemModel("پاورپوائنٹ پریزنٹیشن پرنٹ کرنے کے لئے ، دبائیں: ا۔) سنٹرل + پی بی) سی ٹی آر ایل + ایس سی) سنٹرل + شفٹ + پی ڈی۔) سنٹرل + اے" , "اے) سینٹرل + پی"));
        arrayList.add(new ThreeItemModel("مجھے پہلے سے بنا ہوا انداز بنانے کے ل I کیا انتخاب کرنا چاہئے؟ ا۔ فارمیٹ بی) سلائیڈ لے آؤٹ سی۔ سلائیڈ سارٹر وی ڈی) مندرجہ بالا میں سے کوئی بھی نہیں" , "بی) سلائیڈ فارمیٹ"));
        arrayList.add(new ThreeItemModel("چارٹ میں ترمیم کرنے کے ل we ، ہمیں ایک) چارٹ آبجیکٹ سٹی پر ڈبل کلک کریں) چارٹ آبجیکٹ شہر پر ڈبل کلک کریں) چارٹ آبجیکٹ پر ٹرپل کلک کریں) چارٹ آبجیکٹ پر کلک کریں" , "بی) چارٹ آبجیکٹ پر ڈبل کلک کریں"));
        arrayList.add(new ThreeItemModel("کسٹم اینیمیشن ٹاسک پین کو استعمال کرتے ہوئے کسی ٹریکیکورٹری کے اثر کا جائزہ لینے کے ل we ، ہمارے پاس ایک ہونا چاہئے) رفتار پر بٹن پر ڈبل کلک کریں ب) شو ایفیکٹ کے بٹن پر کلک کریں c) پلے بٹن پر کلک کریں D) اوپر والے میں سے کوئی بھی نہیں" ," سی) پلے بٹن پر " ));
        arrayList.add(new ThreeItemModel("آپ معیاری ٹول بار میں نئے بٹن پر کلک کرکے ب) درج ذیل تمام کو مکمل کرکے ایک نئی پریزنٹیشن تشکیل دے سکتے ہیں b) فائل پر کلک کرکے ، نئے C پر کلک کریں) CTRL + ND) فائل کو کھولیں" , "d.) فائل پر کلک کریں کھولیں "));
        arrayList.add(new ThreeItemModel("جب آپ سلائیڈ پر بائیں ماؤس کی کی اور زیادہ ماؤس کو دباتے اور تھامتے ہیں تو کون سا لفظ استعمال ہوتا ہے؟ ا۔ چل رہا ہے)) ،"," بی۔ ڈریگنگ "));
        arrayList.add(new ThreeItemModel("کون سا اصطلاح ایک پس منظر کی وضاحت کرتا ہے جو دانے دار ، ہموار سطح کی حیثیت سے ظاہر ہوتا ہے؟ ا۔ پیٹرن ب۔) تدریجی سی) مخمل ڈی) ساخت" , "بی۔) تدریجی"));
        arrayList.add(new ThreeItemModel("پریزنٹیشن میں تمام سلائیڈوں کے لئے منتقلی کے اثرات مرتب کرتے وقت مندرجہ ذیل میں سے کون سا تبصرے استعمال کیے جائیں؟ سلائڈ ویو ب) نوٹ پیج" , "V.) سلائیڈ ترتیب دیا گیا نظارہ"));
        arrayList.add(new ThreeItemModel("پریزنٹیشن میں تمام سلائیڈوں کے لئے منتقلی کے اثرات مرتب کرتے وقت مندرجہ ذیل میں سے کون سا تبصرے استعمال کیے جائیں؟ سلائڈ ویو ب) نوٹ پیج" , "V.) سلائیڈ ترتیب دیا گیا نظارہ"));
        arrayList.add(new ThreeItemModel("پریزنٹیشن میں سلائیڈوں کے لئے کسٹم ٹائم متعین کرنے کے لئے کس آپشن کا استعمال کیا جاسکتا ہے؟ اے سلائیڈر کے اوقات b.) سلائیڈر ٹائمر c) ریہرسل ڈی۔) سلائیڈ شو سیٹ اپ" , "ج۔) ریہرسل"));
        arrayList.add(new ThreeItemModel("عنوان اور عنوانات کے ل Which کس قسم کا فونٹ مناسب ہے؟ ا) سانس سیرف فونٹ ب) تصویر فونٹ سی ٹیکسٹ فونٹ D.) سیرف فونٹ" , "ا) سانس سیرف فونٹ"));
        arrayList.add(new ThreeItemModel("عنوان اور عنوانات کے ل Which کس قسم کا فونٹ مناسب ہے؟ ا) سانس سیرف فونٹ ب) تصویر فونٹ سی ٹیکسٹ فونٹ D.) سیرف فونٹ" , "ا) سانس سیرف فونٹ"));
        arrayList.add(new ThreeItemModel("پریزنٹیشن میں سلائیڈوں میں وقت شامل کرنے کے لئے آپ مندرجہ ذیل میں سے کون سے استعمال کرسکتے ہیں؟ ا) ٹائم لائن بٹن کی مشق کریں)) سلائس شو مینو ج) سلائیڈ تبادلوں کے بٹن پر ڈی) مذکورہ بالا سب" , "ا) ریہرسلنگ ٹائمنگ بٹن"));
        arrayList.add(new ThreeItemModel("ہم لگاتار سلائیڈ شو کس طرح دیکھ سکتے ہیں؟ A.) مسلسل دہرایا جانا چاہئے ب) ایس ایس سی سی تک لگاتار لوپ) مزید لوپ۔ ڈی۔ ان میں سے کوئی بھی" , "بی) اے ایس سی تک لگاتار لوپ"));
        arrayList.add(new ThreeItemModel("ہم سلائڈ شو کو کیسے روکیں؟ ا۔) دائیں تیر کو دبائیں۔) سی ٹی آر ایل + اے سی دبائیں۔) فرار پریس دبائیں) سی ٹی ٹی ایل + ایس دبائیں" ,"سی سی دبائیں۔"));
        arrayList.add(new ThreeItemModel("پاورپوائنٹ ایم ایس آفس کے درج ذیل ایڈ ان سافٹ ویئر سے ڈیٹا ظاہر کرسکتا ہے۔ ا) آرگنائزیشن چارٹ بی فوٹو البم سی) مساوات ایڈیٹر ڈی۔) مذکورہ بالا تمام", str));
        arrayList.add(new ThreeItemModel("ہجے ڈائیلاگ باکس میں مینو اے سے ہجے کو منتخب کرکے شامل کیا جاسکتا ہے۔ ٹولز ب) سی فائل دیکھیں ڈی) سیرٹ" , "ا) ٹولز"));
        arrayList.add(new ThreeItemModel("آپ ہجے کی جانچ پڑتال کے لئے کون سا کلید دباتے ہیں؟ ا۔ F9B) F7C) F5D) F3" , "B) F7"));
        arrayList.add(new ThreeItemModel("پاورپوائنٹ سلائیڈز میں کیا ہے؟ اے۔ عنوان ، متن ، گراف b) تیار کردہ شے ، سائز c) کلیپ پارٹ ، ڈرائنگ آرٹ ، ویژول ڈی) مندرجہ بالا میں سے کوئی بھی" , "مندرجہ بالا میں سے کوئی بھی"));
        arrayList.add(new ThreeItemModel("موجودہ پریزنٹیشن کو کھولنے کے ل A. ، اے دبائیں۔) سی ٹی آر ایل + اے سی۔) سی ٹی آر ایل + او سی) سی ٹی آر ایل + این ڈی۔) سی ٹی آر ایل + ایل" , "بی) سی ٹی آر ایل + او"));
        arrayList.add(new ThreeItemModel("بیضوی حرکت ایک پہلے سے طے شدہ ہے ___ A.) ڈیزائن ٹیمپلیٹ b) رنگ سکیم c) حرکت پذیری اسکیم D.) اوپر کچھ بھی نہیں" , "b) رنگ سکیم"));
        arrayList.add(new ThreeItemModel("ایک ایسی فائل جس میں ریڈی میڈ اسٹائل موجود ہوں جو پریزنٹیشن کے لئے استعمال ہوسکیں __؟ A. پری فارمیٹنگ ب۔ آٹوسٹائل سی) مددگار ڈی) ٹیمپلیٹ" , "ڈی ٹیمپلیٹ"));
        arrayList.add(new ThreeItemModel("مائیکروسافٹ پاورپوائنٹ میں زیادہ سے زیادہ زوم فیصد کتنا ہے؟ ا۔) 100٪ بی) 400٪ سی۔) 300٪ ڈی) 200٪" , "بی) 400٪"));
        arrayList.add(new ThreeItemModel("ہم پاورپوائنٹ کا استعمال کرتے ہوئے کسی پریزنٹیشن میں چارٹ کس طرح رکھ سکتے ہیں؟ -> -> تصویری -> چارٹ ب) ترمیم کریں -> چارٹ سی) سرٹ - -> چارٹ ڈی) دیکھیں -> چارٹ" , "A) داخل کریں -> تصویری -> چارٹ "));


        return arrayList;
    }


}
