package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_MS_Excel {


    private Context context;
    public Q_MS_Excel(Context context) {
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
         arrayList.add(new ThreeItemModel("\nWhat function displays row data in a column or column data in a row ?\n\nA.) Hyperlinks\nB.) Rows\nC.) Index\nD.) Transpose\n", "D.) Transpose"));
        arrayList.add(new ThreeItemModel("Except which of the following function, a formula with a logical function shows the word \"TRUE\" or \"FALSE\" as a result ?\n\nA.) NOT\nB.) OR\nC.) IF\nD.) AND\n", "C.) IF"));
        arrayList.add(new ThreeItemModel("Edit the selected cell.", "F2"));
        arrayList.add(new ThreeItemModel("Go to a specific e.g., C6", "F5"));
        arrayList.add(new ThreeItemModel("Spell chech selected text and/or document", "F7"));
        arrayList.add(new ThreeItemModel("Create chart", "F11"));
        arrayList.add(new ThreeItemModel("Enter the current time", "Ctrl + Shift + ;"));
        arrayList.add(new ThreeItemModel("Enter the current date", "Ctrl + ;"));
        arrayList.add(new ThreeItemModel("Insert new worksheet.", "Alt + Shift + F1"));
        arrayList.add(new ThreeItemModel("Open the Excel formula window", "Shift + F3"));
        arrayList.add(new ThreeItemModel("Bring up search box.", "Shift + F5"));
        arrayList.add(new ThreeItemModel("Select all contents of the worksheet", "Ctrl + A"));
        arrayList.add(new ThreeItemModel("Bold highlighted selection", "Ctrl + B"));
        arrayList.add(new ThreeItemModel("Italic highlighted selection", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("Insert link", "Ctrl + K"));
        arrayList.add(new ThreeItemModel("Underline highlighted selection.", "Ctrl + U"));
        arrayList.add(new ThreeItemModel("Strike through highlighted selection", "Ctrl + 5"));
        arrayList.add(new ThreeItemModel("Bring up the print dialog box to begin printing", "Ctrl + P"));
        arrayList.add(new ThreeItemModel("Undo last action", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("Minimise current workbook", "Ctrl + F9"));
        arrayList.add(new ThreeItemModel("Maximise currently selected workbook", "Ctrl + F10"));
        arrayList.add(new ThreeItemModel("Switch between open workbooks/windows", "Ctrl + F6"));
        String str = "Move between Excwl worksheets in the same Excel document";
        arrayList.add(new ThreeItemModel("With which of the following all formulas in excel starts ?\n\nA.) /\nB.) *\nC.) $\nD.) =\n", "D.) ="));
        arrayList.add(new ThreeItemModel("On an excel sheet the active cell in indicated by ?\n\nA.) A dotted border\nB.) By italic text\nC.) A dark wide border\nD.) A blinking border\n", "C.) A dark wide border"));
        arrayList.add(new ThreeItemModel("What term describes explanatory text attached to a cell ?\n\nA.) Context\nB.) Callout\nC.) Comment\nD.) Dialog\n", "C.) Comment"));
        arrayList.add(new ThreeItemModel("How we can view a cell comment ?\n\nA.) position the mouse pointer over the cell\nB.) click the comment command on the view menu\nC.) click the edit comment commands on the Insert menu\nD.) click the Display comment command on the window menu\n", "A.) position the mouse pointer over the cell"));
        arrayList.add(new ThreeItemModel("Which of these will not select all the cells in a document ?\n\nA.) Using the Edit - Select All menu\nB.) Pressing Ctrl + A on the keyboard\nC.) Clicking three times with the right mouse button in the spreadsheet\nD.) None of these\n", "C.) Clicking three times with the right mouse button in the spreadsheet"));
        arrayList.add(new ThreeItemModel("The default style for new data keyed in a new workbook is ?\n\nA.) Normal\nB.) Comma\nC.) Percent\nD.) CURRENCY\n", "A.) Normal"));
        arrayList.add(new ThreeItemModel("If you press ___, the cell accepts your typing as its contents ?\n\nA.) Tab\nB.) Enter\nC.) Alt+Enter\nD.) Ctrl+Enter\n", "B.) Enter"));
        arrayList.add(new ThreeItemModel("Which of the following keyboard shortcut can be used for creating a chart from the selected cells ?\n\nA.) F11\nB.) F10\nC.) F4\nD.) F2\n", "A.) F11"));
        arrayList.add(new ThreeItemModel("A value used in a formula that does not change is called a ?\n\nA.) Constant\nB.) Varaible\nC.) Cell address\nD.) Static\n", "A.) Constant"));
        arrayList.add(new ThreeItemModel("Formula palette is used to ?\n\nA.) format cells containing numbers\nB.) create and edit formulas containing functions\nC.) entered assumptions data\nD.) copy all cells\n", "B.) create and edit formulas containing functions"));
        arrayList.add(new ThreeItemModel("A Spreadsheet contains ?\n\nA.) columns\nB.) rows\nC.) rows and columns\nD.) None of above\n", "C.) rows and columns"));
        arrayList.add(new ThreeItemModel("To open an existing workbook, click the Open button on the ___ toolbar ?\n\nA.) Form\nB.) Standard\nC.) Drawing\nD.) Formatting\n", "B.) Standard"));
        arrayList.add(new ThreeItemModel("Which among following is not associated with spelling dialogue box ?\n\nA.) Edit\nB.) Ignore All\nC.) Ignore\nD.) Change\n", "A.) Edit"));
        arrayList.add(new ThreeItemModel("what term describes a background that appears as a grainy, non smooth surface ?\n\nA.) Pattern\nB.) Gradient\nC.) Velvet\nD.) Texture\n", "B.) Gradient"));
        arrayList.add(new ThreeItemModel("Which among following is associated with excel ?\n\nA.) Graphic program\nB.) Spreadsheet\nC.) Microsoft office\nD.) None of these\n", "B.) Spreadsheet"));
        arrayList.add(new ThreeItemModel("The cell reference for a range of cells that starts in cell C1 and goes over to column H and down to row 10 is ?\n\nA.) C1:10H\nB.) C1:H10\nC.) C1:H-10\nD.) C1:H:10\n", "B.) C1:H10"));
        arrayList.add(new ThreeItemModel("You can convert existing Excel worksheet data and charts to HTML document by using the ?\n\nA.) Intranet Wizard\nB.) Internet Assistant Wizard\nC.) Import Wizard\nD.) Export Wizard\n", "B.) Internet Assistant Wizard"));
        arrayList.add(new ThreeItemModel("To create an interactive Pivot Table for the web, you use a Microsoft Office Web component called ?\n\nA.) Pivot Table Report\nB.) Pivot Table List\nC.) Pivot Table Field List\nD.) HTML\n", "A.) Pivot Table Report"));

        arrayList.add(new ThreeItemModel(str, "Ctrl + Page up"));
        arrayList.add(new ThreeItemModel(str, "Ctrl + Page down"));
        arrayList.add(new ThreeItemModel("Move between two or more open Excel files.", "Ctrl + Tab"));
        arrayList.add(new ThreeItemModel("Create a formula to sum all of the above cells", "Alt + ="));
        arrayList.add(new ThreeItemModel("Insert the value of the above cell into cell currently selected.", "Ctrl + '"));
        arrayList.add(new ThreeItemModel("Format number in comma format.", "Ctrl + Shift + !"));
        arrayList.add(new ThreeItemModel("Format number in currency format.", "Ctrl + Shift + $"));
        arrayList.add(new ThreeItemModel("Format number in date format", "Ctrl + Shift + #"));
        arrayList.add(new ThreeItemModel("Format number in percentage format", "Ctrl + Shift + %"));
        arrayList.add(new ThreeItemModel("Format number in time format.", "Ctrl + Shift + @"));
        arrayList.add(new ThreeItemModel("Move to next section of text.", "Ctrl + Arrow key"));
        arrayList.add(new ThreeItemModel("Select entire column", "Ctrl + Space"));
        arrayList.add(new ThreeItemModel("Select entire row", "Shift + Space"));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
         arrayList.add(new ThreeItemModel("আপনি বিদ্যমান এক্সেল ওয়ার্কশিট ডেটা এবং চার্টগুলিকে এইচটিএমএল ডকুমেন্টে? এ।) ইন্ট্রানেট উইজার্ড বি ব্যবহার করে বি। ইন্টারনেট সাহায্যকারী উইজার্ড সি) আমদানি উইজার্ড ডি। এক্সপোর্ট উইজার্ড", "বি) ইন্টারনেট সহকারী উইজার্ড"));
        arrayList.add(new ThreeItemModel("ওয়েবে ইন্টারেক্টিভ পিভট টেবিল তৈরি করতে, আপনি? ম। মাইক্রোসফ্ট অফিস ওয়েব উপাদান ব্যবহার করেন? এ। পিভট টেবিল রিপোর্ট বি।) পাইভট টেবিল তালিকা সি। পিভট টেবিল ক্ষেত্র তালিকা ডি। এইচটিএমএল", "এ) পিভট সারণী প্রতিবেদন "));
        arrayList.add(new ThreeItemModel("  ফাংশনটি কীভাবে একটি সারিতে কলাম বা কলামের তথ্য সারি তথ্য প্রদর্শন করে? ক। হাইপারলিংকস বি।) সারি সি।) সূচি D.। ট্রান্সপোজ", "ডি। ট্রান্সপোজ"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত কোন ফাংশন ব্যতীত, একটি যৌক্তিক ফাংশন সহ একটি সূত্র ফলাফল হিসাবে সত্য বা মিথ্যা শব্দটি দেখায়? এ। বি।) বা সি।) যদি ডি) এবং", "সি) যদি "));
        arrayList.add(new ThreeItemModel("নির্বাচিত ঘরটি সম্পাদনা করুন।", "এফ 2"));
        arrayList.add(new ThreeItemModel("একটি নির্দিষ্ট উদাহরণে যান, সি, 6", "এফ 5"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য এবং / বা দস্তাবেজ বানান", "F7"));
        arrayList.add(new ThreeItemModel("চার্ট তৈরি করুন", "এফ 11"));
        arrayList.add(new ThreeItemModel("বর্তমান সময় প্রবেশ করুন", "Ctrl + শিফট +"));
        arrayList.add(new ThreeItemModel("বর্তমান তারিখ লিখুন", "Ctrl +"));
        arrayList.add(new ThreeItemModel("নতুন কার্যপত্রক sertোকান "," আল্ট + শিফট + এফ 1 "));
        arrayList.add(new ThreeItemModel("এক্সেল সূত্র উইন্ডোটি খুলুন", "শিফট + এফ 3"));
        arrayList.add(new ThreeItemModel("অনুসন্ধান বাক্সটি আনুন।", "শিফট + এফ 5"));
        arrayList.add(new ThreeItemModel("কার্যপত্রকের সমস্ত সামগ্রী নির্বাচন করুন", "Ctrl + A"));
        arrayList.add(new ThreeItemModel("বোল্ড হাইলাইটেড নির্বাচন", "Ctrl + বি"));
        arrayList.add(new ThreeItemModel("Italic হাইলাইটেড নির্বাচন", "Ctrl + আমি"));
        arrayList.add(new ThreeItemModel("লিঙ্ক linkোকান", "Ctrl + কে"));
        arrayList.add(new ThreeItemModel("হাইলাইট করা নির্বাচনকে আন্ডারলাইন করুন" ," Ctrl + U "));
        arrayList.add(new ThreeItemModel("হাইলাইটেড নির্বাচনের মাধ্যমে ধর্মঘট করুন", "Ctrl + 5"));
        arrayList.add(new ThreeItemModel("মুদ্রণ শুরু করতে মুদ্রণ ডায়ালগ বাক্সটি নিয়ে আসুন", "Ctrl + P"));
        arrayList.add(new ThreeItemModel("শেষ ক্রিয়াটি পূর্বাবস্থায় ফিরুন", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("বর্তমানের ওয়ার্কবুকটি ছোট করুন", "Ctrl + F9"));
        arrayList.add(new ThreeItemModel("বর্তমানে নির্বাচিত ওয়ার্কবুকটি সর্বাধিক করুন", "Ctrl + F10"));
        arrayList.add(new ThreeItemModel("খোলা ওয়ার্কবুক / উইন্ডোগুলির মধ্যে স্যুইচ করুন", "Ctrl + F6"));
        String str ="একই এক্সেল নথিতে এক্সক্লুয়াল ওয়ার্কশিটগুলির মধ্যে সরান" ;
        arrayList.add(new ThreeItemModel(str, "Ctrl + পৃষ্ঠা আপ"));
        arrayList.add(new ThreeItemModel(str, "Ctrl + পৃষ্ঠা নিচে"));
        arrayList.add(new ThreeItemModel("এক্সেলের নীচের সমস্ত সূত্রটি শুরু হয়? ক) / বি) * সি) C. ডি) =", "ডি) ="));
        arrayList.add(new ThreeItemModel("একটি এক্সেল শীটে সক্রিয় সেলটি দ্বারা নির্দেশিত? এ।) একটি বিন্দুযুক্ত সীমানা খ) ইটালিক পাঠ্য দ্বারা সি) একটি গা dark় প্রশস্ত সীমানা D.) একটি ঝলকানো সীমানা", "সি।) একটি অন্ধকার প্রশস্ত সীমানা"));
        arrayList.add(new ThreeItemModel("কোন শব্দটি কোনও ঘরের সাথে সংযুক্ত ব্যাখ্যাযুক্ত পাঠ্যকে বর্ণনা করে? ক। প্রবন্ধ খ) কলআউট সি। মন্তব্য D.) সংলাপ", "সি।) মন্তব্য"));
        arrayList.add(new ThreeItemModel("আমরা একটি সেল মন্তব্য কীভাবে দেখতে পারি? ক। কক্ষের উপর মাউস পয়েন্টারটি অবস্থান করে বি।) ভিউ মেনুতে মন্তব্য কমান্ডটি ক্লিক করুন সি) সন্নিবেশ মেনুতে মন্তব্য মন্তব্য সম্পাদনা ক্লিক করুন।) প্রদর্শন মন্তব্য কমান্ডটি ক্লিক করুন উইন্ডো মেনুতে "," এ) ঘরে মাউস পয়েন্টার অবস্থান "));
        arrayList.add(new ThreeItemModel("এর মধ্যে কোনটি কোনও দস্তাবেজের সমস্ত কক্ষ নির্বাচন করবে না? ক) সম্পাদনা - সমস্ত মেনু নির্বাচন করে বি) কীবোর্ড সিটিতে Ctrl + A টিপুন) স্প্রেডশিট ডিতে ডান মাউস বোতামটি দিয়ে তিনবার ক্লিক করুন D. ) এর মধ্যে কোনটি "," সি) স্প্রেডশিটে ডান মাউস বোতামটি দিয়ে তিনবার ক্লিক করা "));
        arrayList.add(new ThreeItemModel("একটি নতুন ওয়ার্কবুকে কীড করা নতুন ডেটার জন্য ডিফল্ট স্টাইলটি হল?", "A।) সাধারণ B।) কমা C"));
        arrayList.add(new ThreeItemModel("আপনি যদি ___ টিপেন, ঘরটি আপনার টাইপিংটিকে এর বিষয়বস্তু হিসাবে স্বীকার করে? এ। ট্যাব বি) প্রবেশ করানো হবে) আল্ট + এন্টার ডি।) সেন্ট্রাল + এন্টার", "বি।) লিখুন"));
        arrayList.add(new ThreeItemModel("নির্বাচিত ঘরগুলি থেকে চার্ট তৈরি করতে নিম্নলিখিত কীবোর্ড শর্টকাটটি ব্যবহার করা যেতে পারে? এ। এফ 11 বি) এফ 10 সি) এফ 4 ডি) এফ 2", "এ। এফ 11"));
        arrayList.add(new ThreeItemModel("পরিবর্তিত হয় না এমন সূত্রে ব্যবহৃত একটি মানকে বলা হয়? এ। ক। কনস্ট্যান্ট বি) ভেরিয়েবল সি) ঘরের ঠিকানা ডি। স্ট্যাটিক", "এ। কনস্ট্যান্ট"));
        arrayList.add(new ThreeItemModel("ফর্মুলা প্যালেটটি ব্যবহার করা হয়? ক। নম্বর বিযুক্ত ফর্ম্যাট কক্ষগুলি) ফাংশনযুক্ত সূত্র তৈরি এবং সম্পাদনা সি) অনুমানের ডেটা প্রবেশ করানো D.) সমস্ত কক্ষ অনুলিপি করুন", "বি) ফাংশনযুক্ত সূত্র তৈরি এবং সম্পাদনা করুন"));
        arrayList.add(new ThreeItemModel("একটি স্প্রেডশীটটিতে রয়েছে? ক। কলামগুলি খ।) সারি গ।) সারি এবং কলামগুলি ডি) উপরের কোনওটি", "সি।) সারি এবং কলামগুলি"));
        arrayList.add(new ThreeItemModel("বিদ্যমান ওয়ার্কবুকটি খুলতে, ___ টুলবারের ওপেন বোতামটি ক্লিক করুন? এ। ফর্ম বি।) স্ট্যান্ডার্ড সি। অঙ্কন ডি) ফর্ম্যাটিং", "বি। স্ট্যান্ডার্ড"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি বানান সংলাপ বাক্সের সাথে সম্পর্কিত নয়? ক। সম্পাদনা বি) সমস্ত উপেক্ষা করুন সি) উপেক্ষা করুন)) পরিবর্তন করুন", "এ) সম্পাদনা করুন"));
        arrayList.add(new ThreeItemModel("কোন শব্দটি এমন পটভূমি বর্ণনা করে যা দানাদার, মসৃণ পৃষ্ঠ হিসাবে প্রদর্শিত হয়? ক। প্যাটার্ন বি।) গ্রেডিয়েন্ট সি) ভেলভেট ডি) গঠন", "বি।) গ্রেডিয়েন্ট"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি এক্সেলের সাথে যুক্ত? ক) গ্রাফিক প্রোগ্রাম খ) স্প্রেডশিট সি) মাইক্রোসফ্ট অফিস ডি) এর মধ্যে কোনটিই", "বি) স্প্রেডশিট"));
        arrayList.add(new ThreeItemModel("সেল সি 1 থেকে শুরু হয়ে কলাম এইচ এবং নীচে 10 নম্বরে চলে যাওয়ার জন্য ঘরের রেফারেন্সটি কি? ক। 1: 10 এইচ বি।) সি 1: এইচ 10 সি) সি 1: এইচ -10 ডি) সি 1: এইচ: 10 "," বি) সি 1: এইচ 10 "));

        arrayList.add(new ThreeItemModel("এক্সেল ফাইল দুটি বা তারও বেশিের মধ্যে সরান" ," Ctrl + ট্যাব "));
        arrayList.add(new ThreeItemModel("উপরের সমস্ত কক্ষের যোগফলের জন্য একটি সূত্র তৈরি করুন", "Alt + ="));
        arrayList.add(new ThreeItemModel("বর্তমানে নির্বাচিত কক্ষে উপরের ঘরটির মান সন্নিবেশ করান।", "Ctrl + '"));
        arrayList.add(new ThreeItemModel("কমা ফর্ম্যাটে নম্বর বিন্যাস করুন" ," সিটিআরএল + শিফট +! "));
        arrayList.add(new ThreeItemModel("মুদ্রার ফর্ম্যাটে নম্বর বিন্যাস করুন" ," Ctrl + শিফট + + "));
        arrayList.add(new ThreeItemModel("তারিখের ফর্ম্যাটে নম্বর বিন্যাস করুন", "Ctrl + শিফট + #"));
        arrayList.add(new ThreeItemModel("শতাংশ বিন্যাসে ফর্ম্যাট নম্বর", "Ctrl + শিফট +%"));
        arrayList.add(new ThreeItemModel("সময় বিন্যাসে নম্বর বিন্যাস করুন"  ," সিটিআরএল + শিফট + @ "));
        arrayList.add(new ThreeItemModel("পাঠ্যের পরবর্তী বিভাগে যান" ," Ctrl + তীর কী "));
        arrayList.add(new ThreeItemModel("পুরো কলামটি নির্বাচন করুন", "Ctrl + স্পেস"));
        arrayList.add(new ThreeItemModel("পুরো সারিটি নির্বাচন করুন", "শিফট + স্পেস"));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("Excel के नीचे सभी फ़ार्मुलों से शुरू होता है A) / b) * c) C. d) =", "d) ="));
        arrayList.add(new ThreeItemModel("एक्सेल शीट पर सक्रिय सेल द्वारा इंगित किया गया? ए) एक बिंदीदार बॉर्डर बी) इटैलिक टेक्स्ट सी) एक डार्क वाइड बॉर्डर डी) एक चमकती सीमा", "सी।) एक डार्क वाइड बॉर्डर"));
        arrayList.add(new ThreeItemModel("कौन सा शब्द एक सेल से जुड़े व्याख्यात्मक पाठ का वर्णन करता है? ए निबंध बी) कॉलआउट सी। डी। डी। डायलॉग", "सी। टिप्पणी "));
        arrayList.add(new ThreeItemModel("निम्न में से कौन एक दस्तावेज़ में सभी कक्षों का चयन नहीं करेगा? ए) संपादित करें - सभी मेनू का चयन करें b) कीबोर्ड शहर पर Ctrl + A दबाएं) स्प्रैडशीट पर दाहिने माउस बटन पर डबल क्लिक करें D) निम्नलिखित में से कौन सा है", "C स्प्रेडशीट पर दाईं ओर माउस बटन के साथ तीन क्लिक "));
        arrayList.add(new ThreeItemModel("निम्न में से कौन एक दस्तावेज़ में सभी कक्षों का चयन नहीं करेगा? ए) संपादित करें - सभी मेनू का चयन करें b) कीबोर्ड शहर पर Ctrl + A दबाएं) स्प्रैडशीट पर दाहिने माउस बटन पर डबल क्लिक करें D) निम्नलिखित में से कौन सा है", "C स्प्रेडशीट पर दाईं ओर माउस बटन के साथ तीन क्लिक "));
        arrayList.add(new ThreeItemModel("यदि आप ___ दबाते हैं, तो सेल आपकी टाइपिंग को उसकी सामग्री के रूप में पहचानता है; ए टैब बी डाला जाएगा) Alt + Enter D.) Central + Enter", "B.) Enter"));
        arrayList.add(new ThreeItemModel("चयनित कीबोर्ड से चार्ट बनाने के लिए निम्नलिखित कीबोर्ड शॉर्टकट का उपयोग किया जा सकता है? (F11b) F10C) F4D) F2", "A. F11"));
        arrayList.add(new ThreeItemModel("चयनित कीबोर्ड से चार्ट बनाने के लिए निम्नलिखित कीबोर्ड शॉर्टकट का उपयोग किया जा सकता है? (F11b) F10C) F4D) F2", "A. F11"));
        arrayList.add(new ThreeItemModel("सूत्र पैलेट का उपयोग करें? ए संख्या स्वरूपित कोशिकाएं) कार्यात्मक सूत्र बनाएं और संपादित करें ग) प्रवेश डेटा डी डालें। सभी कोशिकाओं को कॉपी करें", "कार्यात्मक सूत्र बनाएं और संपादित करें"));
        arrayList.add(new ThreeItemModel("क्या एक स्प्रेडशीट में ए? कॉलम है।) पंक्तियाँ c।) पंक्तियाँ और स्तंभ d) उपरोक्त में से कोई भी", "c।) पंक्तियाँ और स्तंभ"));
        arrayList.add(new ThreeItemModel("मौजूदा कार्यपुस्तिका को खोलने के लिए, ___ टूलबार पर खुला बटन क्लिक करें। ए फॉर्म बी) मानक सी। ड्राइंग डी) स्वरूपण", "बी मानक"));
        arrayList.add(new ThreeItemModel("मौजूदा कार्यपुस्तिका को खोलने के लिए, ___ टूलबार पर खुला बटन क्लिक करें। ए फॉर्म बी) मानक सी। ड्राइंग डी) स्वरूपण", "बी मानक"));
        arrayList.add(new ThreeItemModel( "कौन सा शब्द एक ऐसी पृष्ठभूमि का वर्णन करता है जो एक दानेदार, चिकनी सतह के रूप में दिखाई देती है? ए पैटर्न बी।) निम्नलिखित में से कौन सा ग्रेड एक्सेल के साथ जुड़ा हुआ है? ए) ग्राफिक प्रोग्राम बी) स्प्रेडशीट सी) माइक्रोसॉफ्ट ऑफिस डी) इनमें से कोई नहीं", "बी ) स्प्रेडशीट "));
        arrayList.add(new ThreeItemModel("मौजूदा कार्यपुस्तिका को खोलने के लिए, ___ टूलबार पर खुला बटन क्लिक करें। ए फॉर्म बी) मानक सी। ड्राइंग डी) स्वरूपण", "बी मानक"));
        arrayList.add(new ThreeItemModel("क्या आप HTML", "क्या आप HTML दस्तावेज़ों में मौजूदा एक्सेल वर्कशीट डेटा और चार्ट का उपयोग करते हैं?"));
        arrayList.add(new ThreeItemModel("वेब पर इंटरेक्टिव पिवट टेबल बनाने के लिए, क्या आप उपयोग करते हैं? एम। माइक्रोसॉफ्ट ऑफिस वेब कम्पोनेंट्स? ए पिवट टेबल रिपोर्ट बी।) पिवट टेबल लिस्ट सी। पिवट टेबल फील्ड लिस्ट डी। एचटीएमएल", "ए) पिवट टेबल रिपोर्ट"));
        arrayList.add(new ThreeItemModel("फ़ंक्शन पंक्ति में स्तंभ या स्तंभ जानकारी पंक्ति जानकारी कैसे प्रदर्शित करता है? ए हाइपरलिंक बी।) पंक्ति c।) इंडेक्स डी .. ट्रांज़ोज़", "डी। ट्रांज़ोज़"));
        arrayList.add(new ThreeItemModel("तार्किक फ़ंक्शन के साथ सूत्र के परिणामस्वरूप शब्द को सही या गलत दिखाएं, निम्न कार्यों में से किसी को छोड़कर? ए)) या सी।) यदि डी) और", "सी) यदि"));
        arrayList.add(new ThreeItemModel("क्या फ़ंक्शन पंक्ति या स्तंभ डेटा में एक पंक्ति में पंक्ति डेटा प्रदर्शित करता है? ए) हाइपरलिंक्स  ।) पंक्तियां सी।) इंडेक्स डी।) स्थानांतरण", "डी। ट्रांसपोज़ करें"));
        arrayList.add(new ThreeItemModel("निम्न में से किस फ़ंक्शन को छोड़कर, तार्किक फ़ंक्शन के साथ एक सूत्र परिणामस्वरूप TRUE या FALSE शब्द दिखाता है? A.) NOT B.) OR C.) IF  D।) और", "C.) IF।"));
        arrayList.add(new ThreeItemModel("चयनित सेल को संपादित करें।", "F2"));
        arrayList.add(new ThreeItemModel("एक विशिष्ट उदाहरण पर जाएं, C6", "F5"));
        arrayList.add(new ThreeItemModel("Spell chech selected text and/or document", "F7"));
        arrayList.add(new ThreeItemModel("चार्ट बनाएं", "F11"));
        arrayList.add(new ThreeItemModel("वर्तमान समय दर्ज करें", "Ctrl + Shift +?"));
        arrayList.add(new ThreeItemModel("वर्तमान तिथि दर्ज करें", "Ctrl +?"));
        arrayList.add(new ThreeItemModel("नई वर्कशीट डालें।", "Alt + Shift + F1"));
        arrayList.add(new ThreeItemModel("एक्सेल फॉर्मूला विंडो खोलें", "Shift + F3"));
        arrayList.add(new ThreeItemModel("खोज बॉक्स लाओ", "Shift + F5"));
        arrayList.add(new ThreeItemModel("वर्कशीट की सभी सामग्री चुनें", "Ctrl + A"));
        arrayList.add(new ThreeItemModel("बोल्ड हाइलाइटेड चयन", "Ctrl + B"));
        arrayList.add(new ThreeItemModel("इटैलिक हाइलाइट किए गए चयन", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("लिंक डालें", "Ctrl + K"));
        arrayList.add(new ThreeItemModel("अंडरलाइन किए गए चयन पर प्रकाश डाला।", "Ctrl + U"));
        arrayList.add(new ThreeItemModel("हाइलाइट किए गए चयन के माध्यम से हड़ताल करें", "Ctrl + 5"));
        arrayList.add(new ThreeItemModel("मुद्रण शुरू करने के लिए प्रिंट डायलॉग बॉक्स लाएं", "Ctrl + P"));
        arrayList.add(new ThreeItemModel("अंतिम क्रिया को पूर्ववत करें", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("वर्तमान कार्यपुस्तिका को छोटा करें", "Ctrl + F9"));
        arrayList.add(new ThreeItemModel("वर्तमान में चयनित कार्यपुस्तिका को अधिकतम करें", "Ctrl + F10"));
        arrayList.add(new ThreeItemModel("ओपन वर्कबुक / विंडो के बीच स्विच करें", "Ctrl + F6"));
        String str ="एक्सेल दस्तावेज़ में एक्सेल वर्कशीट के बीच ले जाएँ";
        arrayList.add(new ThreeItemModel(str, "Ctrl + पेज अप"));
        arrayList.add(new ThreeItemModel(str, "Ctrl + पृष्ठ नीचे"));
        arrayList.add(new ThreeItemModel("दो या अधिक खुली एक्सेल फ़ाइलों के बीच ले जाएँ।", "Ctrl + Tab"));
        arrayList.add(new ThreeItemModel("उपरोक्त सभी कोशिकाओं को योग करने का सूत्र बनाएँ", "Alt + ="));
        arrayList.add(new ThreeItemModel("वर्तमान में चयनित सेल में उपरोक्त सेल का मान डालें।", "Ctrl + '"));
        arrayList.add(new ThreeItemModel("प्रारूप संख्या अल्पविराम प्रारूप में।", "Ctrl + Shift +!"));
        arrayList.add(new ThreeItemModel("मुद्रा प्रारूप में प्रारूप संख्या।", "Ctrl + Shift + $"));
        arrayList.add(new ThreeItemModel("फॉर्मेट नंबर इन डेट फॉर्मेट", "Ctrl + Shift + #"));
        arrayList.add(new ThreeItemModel("प्रारूप प्रारूप प्रतिशत में", "Ctrl + Shift +%"));
        arrayList.add(new ThreeItemModel("समय प्रारूप में प्रारूप संख्या।", "Ctrl + Shift + @"));
        arrayList.add(new ThreeItemModel("पाठ के अगले भाग में जाएँ।", "Ctrl + तीर कुंजी"));
        arrayList.add(new ThreeItemModel("संपूर्ण कॉलम चुनें", "Ctrl + Space"));
        arrayList.add(new ThreeItemModel("संपूर्ण पंक्ति चुनें", "Shift + Space"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("ایکسل سے نیچے کے تمام فارمولوں سے شروع ہوتا ہے؟ A) / b) * c) C. d) =", "d) ="));
        arrayList.add(new ThreeItemModel("ایکسل شیٹ پر فعال سیل کے ذریعہ اشارہ کیا گیا ہے؟۔) ایک نقطہ دار سرحد b) ترچھی متن c) گہری چوڑی سرحد D) چمکتی ہوئی سرحد" , "c.) گہرا چوڑا بارڈر"));
        arrayList.add(new ThreeItemModel("کون سا لفظ سیل سے منسلک وضاحتی متن کی وضاحت کرتا ہے؟ A. مضمون ب) کال آؤٹ سی۔ کمنٹ ڈی) ڈائیلاگ" , "ج.) تبصرہ"));
        arrayList.add(new ThreeItemModel("ہم سیل کا تبصرہ کس طرح دیکھتے ہیں؟ A. سیل پر ماؤس پوائنٹر رکھیں۔ ب) ویو مینو میں کمنٹ کمانڈ پر کلک کریں۔ سی) انسٹریٹ مینو میں کمنٹ ایڈیٹ کے تبصرے پر کلک کریں۔ پوائنٹر کا مقام ","\"ہم سیل کا تبصرہ کس طرح دیکھتے ہیں؟ A"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون دستاویز میں سارے خلیوں کا انتخاب نہیں کرے گا؟ ا) ترمیم کریں - تمام مینوز کو منتخب کریں ب) کی بورڈ شہر پر Ctrl + A دبائیں) اسپریڈشیٹ D پر تین بار دائیں کلک کریں D) مندرجہ ذیل میں سے کون سا" , "C) اسپریڈشیٹ پر دائیں ماؤس کے بٹن کے ساتھ تین کلکس"));
        arrayList.add(new ThreeItemModel("نئی ورک بک میں رکھے ہوئے نئے ڈیٹا کے لئے طے شدہ طرز کیا ہے؟" ,"ا) جنرل بی۔ کوما سی"));
        arrayList.add(new ThreeItemModel("اگر آپ ___ دبائیں تو ، سیل آپ کی ٹائپنگ کو اس کے مندرجات کے طور پر پہچانتا ہے؟ اے ٹی بی بی داخل ہوگا) Alt + Enter D.) مرکزی + درج کریں" , "بی) داخل کریں"));
        arrayList.add(new ThreeItemModel("اگر آپ ___ دبائیں تو ، سیل آپ کی ٹائپنگ کو اس کے مندرجات کے طور پر پہچانتا ہے؟ اے ٹی بی بی داخل ہوگا) Alt + Enter D.) مرکزی + درج کریں" , "بی) داخل کریں"));
        arrayList.add(new ThreeItemModel("جو قدر جو کسی فارمولے میں تبدیل نہیں ہوتی اس کو کہتے ہیں؟ اے۔ کانسٹنٹ بی) متغیر ج) سیل ایڈریس ڈی۔ جامد" , "ایک۔ مستحکم"));
        arrayList.add(new ThreeItemModel("فارمولا پیلیٹ کا استعمال کریں۔ ا۔ شکل والے خلیوں کی تعداد بنائیں) فنکشنل فارمولے بنائیں اور ان میں ترمیم کریں ج) تخمینہ ڈیٹا داخل کریں D. تمام خلیوں کی کاپی کریں" , "فعال فارمولے بنائیں اور ان میں ترمیم کریں"));
        arrayList.add(new ThreeItemModel("اسپریڈشیٹ پر مشتمل ہے؟     .) کالم  nB.) قطاریں     C.) قطاریں اور کالم   nD.  اوپر والی کوئی بھی نہیں  ", "سی) قطاریں اور کالم"));
        arrayList.add(new ThreeItemModel("موجودہ ورک بک کو کھولنے کے ل، ، ___ ٹول بار پر اوپن بٹن پر کلک کریں۔ اے فارم بی) معیاری سی ڈرائنگ ڈی) فارمیٹنگ" , "بی اسٹینڈرڈ"));
        arrayList.add(new ThreeItemModel("موجودہ ورک بک کو کھولنے کے ل، ، ___ ٹول بار پر اوپن بٹن پر کلک کریں۔ اے فارم بی) معیاری سی ڈرائنگ ڈی) فارمیٹنگ" , "بی اسٹینڈرڈ"));
        arrayList.add(new ThreeItemModel("کس اصطلاح میں ایک ایسے پس منظر کی وضاحت کی گئی ہے جو دانے دار ، غیر ہموار سطح کی طرح نمودار ہوتی ہے؟ ایک پیٹرن بی تدریجی سی مخمل D بناوٹ", "بی) تدریجی"));
        arrayList.add(new ThreeItemModel("سیل C1 سے کالم H اور نیچے 10 نمبر میں جانے کے لئے سیل کا کیا حوالہ ہے؟ A: 1: 10 HB.) C1: H10C) C1: H-10D) C1: H: 10 "," B) C1: H10 "));
        arrayList.add(new ThreeItemModel( "gnome - settings - daemon.schemas.in.h: 28","کیا آپ HTML دستاویزات میں موجودہ ایکسل ورک شیٹ ڈیٹا اور چارٹ استعمال کرتے ہیں؟"));
        arrayList.add(new ThreeItemModel("ویب پر انٹرایکٹو پیوٹ ٹیبل بنانے کے ل you ، کیا آپ استعمال کرتے ہیں؟ ایم مائیکرو سافٹ آفس ویب اجزاء؟ A. پیوٹ ٹیبل رپورٹ ب۔) پیوٹ ٹیبل لسٹ سی۔ محور ٹیبل فیلڈ لسٹ ڈی. ایچ ٹی ایم ایل" , "ا) محور ٹیبل رپورٹ"));
        arrayList.add(new ThreeItemModel("فنکشن ڈسپلے کالم یا کالم انفارمیشن کو قطار میں کس طرح جانکاری دیتا ہے؟ A. ہائپر لنکس ب.) قطار ج.) انڈیکس ڈی .. ٹرانسپوز" , "ڈی ٹرانسپوز"));
        arrayList.add(new ThreeItemModel("فنکشن ڈسپلے کالم یا کالم انفارمیشن کو قطار میں کس طرح جانکاری دیتا ہے؟ A. ہائپر لنکس ب.) قطار ج.) انڈیکس ڈی .. ٹرانسپوز" , "ڈی ٹرانسپوز"));
        arrayList.add(new ThreeItemModel("سوائے مندرجہ ذیل فنکشن میں سے کون سا ، کسی منطقی فعل کے ساتھ ایک فارمولہ کے نتیجے میں لفظ TRUE یا غلط ظاہر ہوتا ہے؟ A.) B B یا C اگر D اور" , "C IF"));
        arrayList.add(new ThreeItemModel("منتخب سیل میں ترمیم کریں۔" , "ایف 2"));
        arrayList.add(new ThreeItemModel("ایک مخصوص جیسے ، C6" , "F5 پر جائیں"));
        arrayList.add(new ThreeItemModel("ہجے چیچ منتخب متن اور / یا دستاویز" , "F7"));
        arrayList.add(new ThreeItemModel("چارٹ بنائیں" , "F11"));
        arrayList.add(new ThreeItemModel("موجودہ وقت درج کریں", "Ctrl + Shift +؛"));
        arrayList.add(new ThreeItemModel("موجودہ تاریخ درج کریں" , "Ctrl +؛"));
        arrayList.add(new ThreeItemModel("نئی ورکشیٹ داخل کریں۔" , "آلٹ + شفٹ + ایف 1"));
        arrayList.add(new ThreeItemModel("ایکسل فارمولہ ونڈو کھولیں" , "شفٹ + F3"));
        arrayList.add(new ThreeItemModel("تلاش خانہ سامنے لاؤ۔" , "شفٹ + F5"));
        arrayList.add(new ThreeItemModel("ورکشیٹ کے تمام مشمولات کو منتخب کریں", "Ctrl + A"));
        arrayList.add(new ThreeItemModel("بولڈ اجاگر انتخاب" , "Ctrl + B"));
        arrayList.add(new ThreeItemModel("Italic نمایاں کردہ انتخاب", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("لنک داخل کریں" , "Ctrl + K"));
        arrayList.add(new ThreeItemModel("روشنی ڈالی گئی انتخاب کو سرخرو کریں۔" ,"Ctrl + U"));
        arrayList.add(new ThreeItemModel("اجاگر انتخاب میں ہڑتال" , "Ctrl + 5"));
        arrayList.add(new ThreeItemModel("چھپائی شروع کرنے کے لئے پرنٹ ڈائیلاگ باکس لائیں" , "Ctrl + P"));
        arrayList.add(new ThreeItemModel("آخری کارروائی کو کالعدم کریں", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("موجودہ ورک بک کو کم سے کم کریں" , "Ctrl + F9"));
        arrayList.add(new ThreeItemModel("فی الحال منتخب شدہ ورک بک کو زیادہ سے زیادہ کریں" , "Ctrl + F10"));
        arrayList.add(new ThreeItemModel("کھلی ورک بک / ونڈوز کے درمیان سوئچ کریں" , "Ctrl + F6"));
        String str ="ایکسل ایکسل دستاویز میں غیر معمولی ورکشیٹ کے درمیان منتقل کریں" ;
        arrayList.add(new ThreeItemModel(str, "Ctrl + صفحہ اپ"));
        arrayList.add(new ThreeItemModel(str, "Ctrl + صفحہ نیچے"));
        arrayList.add(new ThreeItemModel("ایکسل دو یا دو سے زیادہ فائلوں کے درمیان منتقل کریں۔" , "Ctrl + Tab"));
        arrayList.add(new ThreeItemModel("مذکورہ بالا خلیوں کو جمع کرنے کے لئے ایک فارمولا بنائیں" , "Alt + ="));
        arrayList.add(new ThreeItemModel("فی الحال منتخب سیل میں مندرجہ بالا سیل کی قدر داخل کریں۔", "Ctrl + '"));
        arrayList.add(new ThreeItemModel("کوما فارمیٹ میں نمبر فارمیٹ کریں۔" , "Ctrl + شفٹ +!"));
        arrayList.add(new ThreeItemModel("کرنسی فارمیٹ میں نمبر کی شکل۔" , "Ctrl + شفٹ + $"));
        arrayList.add(new ThreeItemModel("تاریخ کی شکل میں فارمیٹ نمبر" , "Ctrl + شفٹ + #"));
        arrayList.add(new ThreeItemModel("فیصد کی شکل میں فارمیٹ نمبر" , "Ctrl + شفٹ +٪"));
        arrayList.add(new ThreeItemModel("ٹائم فارمیٹ میں نمبر کو فارمیٹ کریں۔" , "Ctrl + شفٹ + @"));
        arrayList.add(new ThreeItemModel("متن کے اگلے حصے میں منتقل کریں۔" , "Ctrl + یرو کی"));
        arrayList.add(new ThreeItemModel("پورا کالم منتخب کریں" , "Ctrl + Space"));
        arrayList.add(new ThreeItemModel("پوری صف منتخب کریں" , "شفٹ + اسپیس"));


        return arrayList;
    }


}
