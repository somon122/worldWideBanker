package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_MS_Word {


    private Context context;
    public Q_MS_Word(Context context) {
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
        arrayList.add(new ThreeItemModel("A master document contains________, each of which contains a pointer to a file on a disk ?\n\nA) subdocuments\nB) hyperlink\nC) bookmarks\nD) Placeholders\n", "A) subdocuments"));
        arrayList.add(new ThreeItemModel("In Word you can force a page break\n\nA) By using the Insert/Section break on the Insert tab\nB) By positioning your cursor at the appropriate place and pressing Ctrl+Enter\nC) By positioning your cursor at the appropriate place and pressing the F1 key\nD) None of the abov\n", "B) By positioning your cursor at the appropriate place and pressing Ctrl+Enter"));
        arrayList.add(new ThreeItemModel("How can you increase the font size of selected text by one point every time ?\n\nA) By pressing Ctrl + ;\nB) By pressing Ctrl + ,\nC) By pressing Ctrl + [\nD) By pressing Ctrl + ]\n", "D) By pressing Ctrl + ]"));
        arrayList.add(new ThreeItemModel("What is the default font used in MS Word 2013 document ?\n\nA) Calibri\nB) Impact\nC) Century\nD) Times New Roman\n", "A) Calibri"));
        arrayList.add(new ThreeItemModel("What should you do if you require to paste the same format in many places ?\n\nA) Click the Copy and go on pasting in many places holding Alt Key\nB) Click the Format painter and go on pasting in many places holding Ctrl Key\nC) Double click the format painter then go on pasting in many places\nD) None of the above\n", "C) Double click the format painter then go on pasting in many places"));
        arrayList.add(new ThreeItemModel("Which option in File pull-down menu is used to close a file in MS Word ?\n\nA) Exit\nB) Close\nC) Shut down\nD) None of the above\n", "B) Close"));
        arrayList.add(new ThreeItemModel("Which would you choose to save a document with a new name ?\n\nA) Click File, Save As\nB) Click File, Save\nC) Press Ctrl+S\nD) None of the above\n", "A) Click File, Save As"));
        arrayList.add(new ThreeItemModel("To convert a hyperlink e-mail address to regular text, right-click the e-mail address and then click _____ on the shortcut menu.\n\nA) Select Hyperlink\nB) Remove Hyperlink\nC) Edit Hyperlink\nD) None of the above\n", "B) Remove Hyperlink"));
        arrayList.add(new ThreeItemModel("To select a sentence, click anywhere on the sentence while holding the following key.\n\nA) Shift\nB) Ctrl\nC) Alt\nD) Esc\n", "B) Ctrl"));
        String str = "D) All of the above";
        arrayList.add(new ThreeItemModel("The contents of the Clipboard remain the same until\n\nA) You cut other text\nB) You shut down your computer\nC) You copy the other text\nD) All of the above\n", str));
        arrayList.add(new ThreeItemModel("To copy selected text, press the key\n\nA) Alt + Shift + C\nB) Ctrl + Shift + V\nC) Ctrl + C\nD) All of the above\n", str));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Paste\" ?\n\nA) Ctrl + V\nB) Ctrl + P\nC) Ctrl + S\nD) Ctrl + E\n", "A) Ctrl + V"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Cut\" the selected text ?\n\nA) Ctrl + U\nB) Ctrl + Z\nC) Ctrl + C\nD) Ctrl + X\n", "D) Ctrl + X"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to create a \"New\" document ?\n\nA) Shift + N\nB) Ctrl + N\nC) Alt + N\nD) Shift + Ctrl + N\n", "B) Ctrl + N"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Open\" an existing document ?\n\nA) Ctrl + O\nB) Shift + Ctrl + O\nC) Ctrl + A\nD) None of the above\n", "A) Ctrl + O"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Save\" a document ?\n\nA) Alt + S\nB) Ctrl + S\nC) Ctrl + P\nD) None of the above\n", "B) Ctrl + S"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Print\" a document?\n\nA) Ctrl + V\nB) Ctrl + W\nC) Ctrl + P\nD) Ctrl + R\n", "C) Ctrl + P"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Select\" a whole document ?\n\nA) Ctrl + S\nB) Ctrl + W\nC) Ctrl + P\nD) Ctrl + A\n", "D) Ctrl + A"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Bold\" the selected text ?\n\nA) Ctrl + B\nB) Ctrl + I\nC) Ctrl + Shift + B\nD) Ctrl + O\n", "A) Ctrl + B"));
        arrayList.add(new ThreeItemModel("Microsoft Word is a-\n\nA. Word Processing Program\nB. Spreadsheet Program\nC. Presentation Program\nD. None of the above\n", "A. Word Processing Program"));
        arrayList.add(new ThreeItemModel("Word wrap means-\n\nA. aligning text with the right margin\nB. inserting spaces between words\nC. moving text automatically to the next line\nD. None of the above\n", "C. moving text automatically to the next line"));
        arrayList.add(new ThreeItemModel("If you want to copy a selection of text, which button do you click ?\n\nA. Cut\nB. Copy\nC. Move\nD. Duplicate\n", "B. Copy"));
        arrayList.add(new ThreeItemModel("Selection of text can be of_\n\nA. single word or a line\nB. a paragraph\nC. complete document\nD. all of the above\n", "D. all of the above"));
        arrayList.add(new ThreeItemModel("Paragraph marks signify-\n\nA. beginning of a paragraph\nB. press of Enter key to mark the end of para\nC. current cursor position in the paragraph\nD. saving has been done till the marked para\n", "B. press of Enter key to mark the end of para"));
        arrayList.add(new ThreeItemModel("You specify the save details of your file in the\n\nA. Save As... dialog box\nB. File Save dialog box\nC. Save the File As... dialog box\nD. None of the above\n", "A. Save As... dialog box"));
        arrayList.add(new ThreeItemModel("The Save As... dialog box can be used\n\nA. to save file by some alternative name\nB. to save file in a format other than word\nC. for saving the file for the first time\nD. All of the above\n", "D. All of the above"));
        arrayList.add(new ThreeItemModel("While typing in a paragraph, you will\n\nA. press Enter key at the end of each line\nB. press Enter only at the end of a paragraph\nC. press Enter key at the end of each word\nD. None of the above\n", "B. press Enter only at the end of a paragraph"));
        arrayList.add(new ThreeItemModel("If you click on the Undo button\n\nA. it will include the new text and remove the original text\nB. it will remove the old text and restore the new text back\nC. it will remove the new text and restore the original text back\nD. none of the above\n", "C. it will remove the new text and restore the original text back"));
        arrayList.add(new ThreeItemModel("To delete the selected sentence, we can press the following key:\n\nA. Backspace\nB. Del\nC. Both (A) and (B)\nD. None of the above\n", "C. Both (A) and (B)"));
        arrayList.add(new ThreeItemModel("The document can be zoomed maximum up to:\n\nA. 100%\nB. 200%\nC. 400%\nD. 500%\n", "D. 500%"));
        arrayList.add(new ThreeItemModel("What is the smallest and largest font size available in Font Size tool on formatting toolbar?\n\nA. 8 and 72\nB. 8 and 70\nC. 8 and 82\nD. 10 and 72\n", "A. 8 and 72"));
        arrayList.add(new ThreeItemModel("What is the maximum font size you can apply for any character ?\n\nA. 1638\nB. 1683\nC. 16038\nD. 16380\n", "A. 1638"));
        arrayList.add(new ThreeItemModel("What is the default font size of a new Word document based on Normal template in Word 2013 ?\n\nA. 9 pt\nB. 10 pt\nC. 11 pt\nD. 12 pt\n", "C. 11 pt"));
        arrayList.add(new ThreeItemModel("What is the default file extension for all Word documents ?\n\nA) .txt\nB) .xlsx\nC) .docs\nD) .docx\n", "D) .docx"));
        arrayList.add(new ThreeItemModel("Word, by default, places a tab stop at every _____ mark on the ruler.\n\nA) 1\"\nB) .75\"\nC) .5\"\nD) None of the above\n", "C) .5"));
        arrayList.add(new ThreeItemModel("What is a Document Outline View ?\n\nA) A View with a margins and gutter\nB) A preview in a full screen\nC) A view with a structure of heading at various levels\nD) None of the above\n", "C) A view with a structure of heading at various levels"));


        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Italic\" the selected text ?", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Underline\" the selected text ?", "Ctrl + U"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Subscript\" the selected text ?", "Ctrl + ="));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Superscript\" the selected text ?", "Ctrl + Shift + +"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to show font dialog box ?\n\nA) Ctrl + Shift + P\nB) Ctrl + Shift + F\nC) Ctrl + D\nD) All of the above\n", str));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Increase Font Size\" the selected text ?", "Ctrl + Shift + >"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Decrease Font Size\" the selected text ?", "Ctrl + Shift + <"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Change Case\" the selected text ?", "Shift + F3"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Clear All Formatting\" the selected text ?", "Ctrl + Spacebar"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Center Align\" the selected text ?", "Ctrl + E"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Right Align\" the selected text ?", "Ctrl + R"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Left Align\" the selected text ?", "Ctrl + L"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Justify Align\" the selected text ?", "Ctrl + J"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Find\" a word in document ?", "Ctrl + F"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Undo\" the last action in a document ", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("What is the shortcut key to \"Insert Hyperlink\" in a document ?", "Ctrl + K"));
        arrayList.add(new ThreeItemModel("Which key do you press to force a page break ?", "Ctrl + Enter"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for Spelling Check in document ?", "F7"));
        arrayList.add(new ThreeItemModel("What is the shortcut key for \"Replace\" a word in document ?", "Ctrl + H"));
        arrayList.add(new ThreeItemModel("What is the shortcut key you can press to create a copyright symbol ?", "Alt + Ctrl + C"));
        arrayList.add(new ThreeItemModel("To Repeat the last Action", "Ctrl + Y"));
        arrayList.add(new ThreeItemModel("In Word, the mailing list is known as the _______.\n\nA) data sheet\nB) data source\nC) database list\nD) None of the above\n", "B) data source"));
        arrayList.add(new ThreeItemModel("Which language does MS-Word use to create Macros ?\n\nA) Visual Basic\nB) Access\nC) Visual C++\nD) C++\n", "A) Visual Basic"));
        arrayList.add(new ThreeItemModel("Which of the following is Page Orientation ?\n\nA) Landscape\nB) Portrait\nC) Both (A) and (B)\nD) None of the above\n", "C) Both (A) and (B)"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
           arrayList.add(new ThreeItemModel("এমএস ওয়ার্ডে কোনও ফাইল বন্ধ করতে ফাইল টান-ডাউন মেনুতে কোন বিকল্প ব্যবহার করা হয়? ক) প্রস্থান বি) বন্ধ সি) শাট ডাউন ডি) উপরের কোনওটি", "বি) বন্ধ করুন"));
        arrayList.add(new ThreeItemModel("আপনি কোন নতুন নাম সহ কোনও দস্তাবেজ সংরক্ষণ করতে চান? ক) ফাইল ক্লিক করুন, সংরক্ষণ করুন বি) ফাইলটি ক্লিক করুন, সংরক্ষণ করুন সি) টিপুন টিপুন) উপরের কোনওটি", "ক) ফাইল ক্লিক করুন, সংরক্ষণ করুন"));
        arrayList.add(new ThreeItemModel("হাইপারলিংক ইমেইল ঠিকানাটিকে নিয়মিত পাঠ্যে রূপান্তর করতে ই-মেইল ঠিকানায় ডান ক্লিক করুন এবং তারপরে শর্টকাট মেনুতে _____ ক্লিক করুন। ক) হাইপারলিংক বি নির্বাচন করুন) হাইপারলিংক সরান সি) হাইপারলিংক সম্পাদনা করুন ডি) উপরের কোনওটি" ,"খ) হাইপারলিঙ্ক সরান"));
        arrayList.add(new ThreeItemModel("একটি বাক্য নির্বাচন করতে, নিম্নলিখিত কীটি ধরে রাখার সময় বাক্যটির যে কোনও জায়গায় ক্লিক করুন এ) শিফট বি) সিটিআর সি) আল্ট ডি) ইস্ক", "বি) সিটিআরএল"));
        String str = "ডি) উপরের সমস্ত";
        arrayList.add(new ThreeItemModel("ক্লিপবোর্ডের বিষয়বস্তু এ পর্যন্ত একই থাকে) ক) আপনি অন্য পাঠ্য কেটেছেন খ) আপনি আপনার কম্পিউটারটি বন্ধ করে দেবেন সি) আপনি অন্য পাঠ্যটি অনুলিপি করেন D) উপরের সমস্তগুলি", str));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য অনুলিপি করতে, কী টিপুন) Alt + Shift + C B) Ctrl + Shift + V C) Ctrl + C D) উপরের সমস্তটি", str));
        arrayList.add(new ThreeItemModel("  পেস্ট করুন for এর জন্য শর্টকাট কীটি? ক) সেন্ট্রাল + ভি বি) সিটিআরটি + পি সি) সেন্ট্রাল + এস ডি) সিটিআরএল + ই", "এ) Ctrl + ভি"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য কেটে নেওয়ার জন্য শর্টকাট কী কী? ক) Ctrl + U B) Ctrl + Z C) Ctrl + C D) Ctrl + X", "D) Ctrl + X"));
        arrayList.add(new ThreeItemModel("নতুন ডকুমেন্ট তৈরি করার শর্টকাট কী কী? ক) শিফট + এন বি) সিটিআর + এন সি) আল্ট + এন ডি) শিফট + সিটিআরএল + এন", "খ) Ctrl + N"));
        arrayList.add(new ThreeItemModel("বিদ্যমান নথিটি খোলার জন্য শর্টকাট কী কী? ক) সিটিআরএল + ও বি) শিফট + সিআরটিএল + ও সি) সিটিআরএল + এ ডি) উপরের কিছুই নয়", "এ) সিটিআরএল + ও"));
        arrayList.add(new ThreeItemModel("একটি নথি সংরক্ষণের শর্টকাট কী কী? ক) Alt + S B) Ctrl + S C) Ctrl + P D) উপরের কিছুই নয়", "খ) Ctrl + S"));
        arrayList.add(new ThreeItemModel("একটি ডকুমেন্ট মুদ্রণ করতে শর্টকাট কী কী? ক) Ctrl + V বি) Ctrl + ডাব্লু সি) সিটিআরটি + পি ডি) সিটিআরএল + আর", "সি) সিটিআরএল + পি"));
        arrayList.add(new ThreeItemModel("পুরো ডকুমেন্টটি নির্বাচন করার শর্টকাট কী কী? ক) Ctrl + S B) Ctrl + W C) Ctrl + P D) Ctrl + A", "D) Ctrl + A"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্যটির বোল্ড এর শর্টকাট কী কী? ক) Ctrl + B) Ctrl + I C) Ctrl + Shift + B D) Ctrl + O", "A) Ctrl + B"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য ইটালিকের শর্টকাট কী কী?", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য আন্ডারলাইন এর শর্টকাট কী কী?", "Ctrl + U"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য সাবস্ক্রিপ্টের শর্টকাট কী কী?", "Ctrl + ="));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য সুপারস্ক্রিপ্টের শর্টকাট কী কী?", "Ctrl + Shift + +"));
        arrayList.add(new ThreeItemModel("ফন্টের ডায়ালগ বাক্সটি দেখানোর জন্য শর্টকাট কী কী? ক) Ctrl + Shift + P B) Ctrl + Shift + F C) Ctrl + D D) উপরের সমস্তটি", str));

        arrayList.add(new ThreeItemModel("মাইক্রোসফ্ট ওয়ার্ড একটি এ। ওয়ার্ড প্রসেসিং প্রোগ্রাম বি। স্প্রেডশিট প্রোগ্রাম সি উপস্থাপনা প্রোগ্রাম D. উপরের কিছুই", "এ। ওয়ার্ড প্রসেসিং প্রোগ্রাম"));
        arrayList.add(new ThreeItemModel("শব্দের মোড়ক এর অর্থ এ। ডান মার্জিনের সাথে পাঠ্য প্রান্তিককরণ বি। শব্দের মধ্যে ফাঁকগুলি ফাঁক করে সি শব্দটি স্বয়ংক্রিয়ভাবে পরের লাইনে সরানো D. উপরের কিছুই নয়", "সি। পাঠ্যটি স্বয়ংক্রিয়ভাবে পরবর্তী লাইনে সরানো"));
        arrayList.add(new ThreeItemModel("আপনি যদি পাঠ্যের একটি নির্বাচন অনুলিপি করতে চান তবে আপনি কোন বোতামটি ক্লিক করেন? ক। বি। কপি সি সরান ডি নকল", "বি কপি"));
        arrayList.add(new ThreeItemModel("পাঠ্য নির্বাচন_একটি একক শব্দ বা একটি লাইন বি হতে পারে একটি অনুচ্ছেদ সি সম্পূর্ণ নথি D. উপরের সমস্তটি", "উপরের সমস্ত ডি"));
        arrayList.add(new ThreeItemModel("অনুচ্ছেদে চিহ্নিত চিহ্নগুলি- ক। অনুচ্ছেদের বি। শুরুতে প্যারা সি এর শেষ চিহ্নিত করতে এন্টার কী টিপুন ডি অনুচ্ছেদে বর্তমান কার্সার অবস্থান চিহ্নিত ডিগ্রি প্যারা অবধি সংরক্ষণ করা হয়েছে", "বি। এন্টার টিপুন। প্যারা শেষ চিহ্নিত করতে "));
        arrayList.add(new ThreeItemModel("আপনি এ হিসাবে সংরক্ষণ করুন ... ডায়ালগ বক্সে বি ফাইল সংরক্ষণ করুন ডায়ালগ বাক্স সি ফাইলটি সংরক্ষণ করুন ... ডায়ালগ বাক্স ডি। উপরের কোনওটি", "এ হিসাবে সংরক্ষণ করুন ... সংলাপ বাক্স"));
        arrayList.add(new ThreeItemModel("এই রূপে সংরক্ষণ করুন ... ডায়ালগ বক্সটি A. ব্যবহার করতে পারেন কিছু বিকল্প নাম বি দ্বারা ফাইল সংরক্ষণ করতে, প্রথম বারের জন্য ফাইল সংরক্ষণের জন্য শব্দ সি ব্যতীত অন্য কোনও ফর্ম্যাটে ফাইল সংরক্ষণ করার জন্য ডি। উপরের সমস্ত", "ডি। উপরের সমস্ত"));
        arrayList.add(new ThreeItemModel("অনুচ্ছেদে টাইপ করার সময়, আপনি এ। প্রতিটি লাইনের শেষে এন্টার টিপুন বি। অনুচ্ছেদের শেষে কেবল এন্টার টিপুন। সি শব্দের শেষে D. কী চাপুন ডি। উপরের কোনওটি নয়", "বি অনুচ্ছেদের শেষে কেবল এন্টার টিপুন"));
        arrayList.add(new ThreeItemModel("যদি আপনি পূর্বাবস্থায়িত বোতাম এ ক্লিক করেন তবে এটিতে নতুন পাঠ্য অন্তর্ভুক্ত হবে এবং মূল পাঠ্য বি সরানো হবে এটি পুরানো পাঠ্যটি সরিয়ে আবার নতুন পাঠ্য পুনরুদ্ধার করবে C. এটি নতুন পাঠ্য সরিয়ে দেবে এবং মূল পাঠ্যটি পুনরুদ্ধার করবে D উপরের কোনটি", "সি এটি নতুন পাঠ্য সরিয়ে দেবে এবং মূল পাঠ্যটি পুনরুদ্ধার করবে"));
        arrayList.add(new ThreeItemModel("নির্বাচিত বাক্যটি মুছে ফেলতে, আমরা নিম্নলিখিত কীটি টিপতে পারি: এ। ব্যাকস্পেস বি। ডেল সি, উভয় (এ) এবং (বি) ডি। উপরের কিছুই নয়", "সি। (এ) এবং (বি)"));
        arrayList.add(new ThreeItemModel("দস্তাবেজটি সর্বোচ্চ পর্যন্ত জুম করা যায়: এ 100% বি 200% সি 400% ডি 500%", "ডি 500%"));
        arrayList.add(new ThreeItemModel("বিন্যাসকরণ সরঞ্জামদণ্ডে হরফ আকারের সরঞ্জামের মধ্যে সবচেয়ে ছোট এবং বৃহত্তম ফন্টের আকারটি কী? এ। 8 এবং 72 বি 8 এবং 70 সি 8 এবং 82 ডি 10 এবং 72", "এ। 8 এবং 72"));
        arrayList.add(new ThreeItemModel("আপনি যে কোনও চরিত্রের জন্য আবেদন করতে পারবেন সর্বাধিক ফন্টের আকারটি কী? এ। 1638 বি 1683 সি 16038 ডি 16380", "এ 1638"));
        arrayList.add(new ThreeItemModel("ওয়ার্ড 2013-এ সাধারণ টেমপ্লেটের উপর ভিত্তি করে নতুন ওয়ার্ড ডকুমেন্টের ডিফল্ট ফন্টের আকারটি কী? A. 9 pt B. 10 pt C. 11 pt D. 12 pt", "C. 11 pt"));
        arrayList.add(new ThreeItemModel("সমস্ত ওয়ার্ড ডকুমেন্টগুলির জন্য ডিফল্ট ফাইল এক্সটেনশনটি কী? ক)। টেক্সট বি) .xlsx সি) .ডোক্স ডি) .ডোক্স", "ডি) .ডোক্স"));
        arrayList.add(new ThreeItemModel("শব্দ, ডিফল্টরূপে, শাসকের উপরে প্রতিটি _____ চিহ্নে একটি ট্যাব থামায় A ক) 1 খ) 75 সি) 5 ডি) উপরের কোনওটিই নয়", "সি) .5"));
        arrayList.add(new ThreeItemModel("ডকুমেন্টের আউটলাইন ভিউ কী? ক) একটি মার্জিন এবং জলের সাথে একটি ভি) একটি পূর্ণ স্ক্রিনের একটি পূর্বরূপ সি) বিভিন্ন স্তরে শিরোনামের কাঠামো সহ একটি দৃশ্য ডি) উপরের কিছুই নয়", "সি) একটি দর্শন বিভিন্ন স্তরে শিরোনামের কাঠামো সহ "));
        arrayList.add(new ThreeItemModel("একটি মাস্টার ডকুমেন্টে ____ থাকে, যার প্রত্যেকটিতে একটি ডিস্কের কোনও ফাইলের পয়েন্টার থাকে? ক) সাবডোকমেন্ট বি) হাইপারলিংক সি) বুকমার্কগুলি ডি) স্থানধারক", "এ) সাবডোকমেন্টস"));
        arrayList.add(new ThreeItemModel("কথায় কথায় আপনি একটি পৃষ্ঠা বিরতিতে জোর করতে পারেন) theোকান ট্যাব বিতে সন্নিবেশ / বিভাগ বিরতি ব্যবহার করে) আপনার কার্সারটিকে উপযুক্ত স্থানে স্থাপন করে এবং Ctrl + এন্টার সি টিপুন) আপনার কার্সারটিকে উপযুক্ত স্থানে স্থাপন করে এবং টিপুন এফ 1 কী ডি) উপরের কোনওটি "," খ) উপযুক্ত স্থানে আপনার কার্সারটি স্থাপন করে এবং Ctrl + এন্টার টিপুন "));
        arrayList.add(new ThreeItemModel("আপনি কীভাবে প্রতিবার নির্বাচিত পাঠ্যের ফন্টের আকার বাড়াতে পারবেন? ক) Ctrl + টিপে; খ) Ctrl + টি চাপিয়ে) Ctrl + [D) টিপে Ctrl +] চাপিয়ে", "D) Ctrl +] টিপে "));
        arrayList.add(new ThreeItemModel("এমএস ওয়ার্ড ২০১৩ নথিতে ব্যবহৃত ডিফল্ট ফন্টটি কী? ক) ক্যালিব্রি বি) প্রভাব গ) সেঞ্চুরি ডি) টাইমস নিউ রোমান", "ক) ক্যালিব্রি"));
        arrayList.add(new ThreeItemModel("আপনার যদি একই জায়গায় অনেক জায়গায় একই বিন্যাসটি আটকাতে হয় তবে আপনার কী করা উচিত? ক) অনুলিপিটি ক্লিক করুন এবং অল্ট কী বি ধারণ করে অনেক জায়গায় আটকানো যান) ফর্ম্যাট চিত্রককে ক্লিক করুন এবং Ctrl কী সি ধারণ করে অনেক জায়গায় আটকানো যান) ফর্ম্যাট পেইন্টারে ডাবল ক্লিক করুন তারপরে অনেক জায়গায় পেস্ট করুন ডি) উপরের কোনওটি "," সি) ফর্ম্যাট পেইন্টারে ডাবল ক্লিক করুন তারপরে অনেক জায়গায় পেস্ট করুন "));

        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য আকার বাড়ানোর শর্টকাট কীটি?", "Ctrl + Shift +>"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্যের আকার হ্রাস হ্রাসের শর্টকাট কী কী?", "Ctrl + Shift + <"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য পরিবর্তনের ক্ষেত্রে শর্টকাট কী কী?", "শিফট + এফ 3"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য সমস্ত বিন্যাস সাফ করার জন্য শর্টকাট কী কী?", "Ctrl + স্পেসবার"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য প্রান্তরেকরণের শর্টকাট কী কী?", "Ctrl + E"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্যকে ডান প্রান্তিককরণের জন্য শর্টকাট কী কী?", "Ctrl + R"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য বামে প্রান্তিককরণের জন্য শর্টকাট কী কী?", "Ctrl + L"));
        arrayList.add(new ThreeItemModel("নির্বাচিত পাঠ্য সামঞ্জস্য করার জন্য শর্টকাট কী কী?", "Ctrl + J"));
        arrayList.add(new ThreeItemModel("নথিতে কোনও শব্দ সন্ধানের জন্য শর্টকাট কী কী?", "Ctrl + F"));
        arrayList.add(new ThreeItemModel("একটি নথির শেষ ক্রিয়াটি পূর্বাবস্থায় ফেলার শর্টকাট কী কী", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("একটি নথিতে হাইপারলিঙ্ক toোকানোর শর্টকাট কী কী?", "Ctrl + K"));
        arrayList.add(new ThreeItemModel("পৃষ্ঠার বিরতিতে আপনি কোন কী চাপছেন?", "Ctrl + Enter"));
        arrayList.add(new ThreeItemModel("নথিতে বানান চেকের শর্টকাট কী কী?", "F7"));
        arrayList.add(new ThreeItemModel("নথিতে কোনও শব্দ প্রতিস্থাপনের জন্য শর্টকাট কী কী?", "Ctrl + H"));
        arrayList.add(new ThreeItemModel("কপিরাইট প্রতীক তৈরি করতে আপনি শর্টকাট কীটি টিপতে পারেন?", "Alt + Ctrl + C"));
        arrayList.add(new ThreeItemModel("শেষ ক্রিয়াটি পুনরাবৃত্তি করতে", "Ctrl + Y"));
        arrayList.add(new ThreeItemModel("ওয়ার্ডে, মেলিং তালিকাটি _______ A) ডেটা শীট হিসাবে পরিচিত খ) ডেটা উত্স সি) ডাটাবেসের তালিকা ডি) উপরের কোনওটি", "বি) ডেটা উত্স"));
        arrayList.add(new ThreeItemModel("ম্যাক্রোস তৈরি করতে এমএস-ওয়ার্ড কোন ভাষা ব্যবহার করে? ক) ভিজ্যুয়াল বেসিক বি) অ্যাক্সেস সি) ভিজ্যুয়াল সি ++ ডি) সি ++", "ক) ভিজ্যুয়াল বেসিক"));
        arrayList.add(new ThreeItemModel("নীচের কোনটি পৃষ্ঠা ওরিয়েন্টেশন? ক) ল্যান্ডস্কেপ বি) প্রতিকৃতি গ) উভয় (ক) এবং (খ) ডি) উপরের কিছুই নয়", "গ) উভয় (এ) এবং (বি)"));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("माइक्रोसॉफ्ट वर्ड ए। वर्ड प्रोसेसिंग प्रोग्राम बी। स्प्रेडशीट प्रोग्राम सी प्रेजेंटेशन प्रोग्राम डी। उपरोक्त में से कोई नहीं", "ए वर्ड प्रोसेसिंग प्रोग्राम"));
        arrayList.add(new ThreeItemModel("वर्ड रैपर का अर्थ है। सही मार्जिन के साथ टेक्स्ट संरेखण। शब्दों के बीच अंतर स्वचालित रूप से सी शब्द को अगली पंक्ति डी पर ले जाता है। ऊपर कुछ भी नहीं", "सी। टेक्स्ट को अगली पंक्ति में स्वचालित रूप से ले जाएं"));
        arrayList.add(new ThreeItemModel("यदि आप पाठ के चयन को कॉपी करना चाहते हैं तो कौन सा बटन क्लिक करते हैं? ए, बी, कॉपी, सी, डी, डुप्लिकेट", "बी कॉपी"));
        arrayList.add(new ThreeItemModel("पाठ चयन_ एक शब्द या एक पंक्ति हो सकता है एक पैराग्राफ c पूरा दस्तावेज़ डी। उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ThreeItemModel("पैराग्राफ में चिह्नित चिह्न - a। पैराग्राफ सी के अंत को चिह्नित करने के लिए Enter कुंजी दबाएं। पैराग्राफ बी की शुरुआत में पैराग्राफ डी में वर्तमान कर्सर स्थिति डिग्री पैराग्राफ तक संग्रहीत है", "पैराग्राफ के अंत को चिह्नित करने के लिए दर्ज करें।"));
        arrayList.add(new ThreeItemModel("आप ए के रूप में सहेजें ... डायलॉग बॉक्स में बी फाइल सेव करें डायलॉग बॉक्स सेव सी फाइल ... डायलॉग बॉक्स डी। उपरोक्त में से कोई नहीं", "ए के रूप में सहेजें ... डायलॉग बॉक्स"));
        arrayList.add(new ThreeItemModel("के रूप रक्षित करें डायलॉग ए। का उपयोग किसी फाइल को कुछ वैकल्पिक नाम बी से बचाने के लिए किया जा सकता है, फाइल को पहली बार सेव करने के लिए सी शब्द के अलावा किसी अन्य फॉर्मेट में सेव करने के लिए। उपरोक्त सभी "," डी। ऊपर के सभी "));
        arrayList.add(new ThreeItemModel("जब एक पैराग्राफ में टाइप करते हैं, तो आप ए दबाते हैं। प्रत्येक पंक्ति के अंत में बी दर्ज करें। पैराग्राफ डी के अंत में एन्टर प्रेस करें। सी। डी। के अंत में डी। कुंजी दबाएं। उपरोक्त में से कोई नहीं", "पैराग्राफ बी के अंत में सिर्फ एंटर दबाएं "));
        arrayList.add(new ThreeItemModel("यदि आप पूर्ववत करें बटन पर क्लिक करते हैं तो इसमें नया पाठ शामिल होगा और मूल पाठ को स्थानांतरित करेगा। यह पुराने पाठ को हटा देगा और नए पाठ को पुनर्स्थापित कर देगा। यह नए पाठ को हटा देगा और मूल पाठ को पुनर्स्थापित कर देगा D जो उपरोक्त में से एक है", "C यह नया है। पाठ निकालें और मूल पाठ को पुनर्स्थापित करें "));
        arrayList.add(new ThreeItemModel("चयनित वाक्य को हटाने के लिए, हम निम्नलिखित कुंजी दबा सकते हैं: a। बैकस्पेस b। डेल c, दोनों (a) और (b) d। उपरोक्त में से कोई नहीं", "c। (A) और (b)"));
        arrayList.add(new ThreeItemModel("दस्तावेज़ को अधिकतम तक ज़ूम किया जा सकता है: ए 100% बी 200% सी 400% डी 500%", "डी 500%"));
        arrayList.add(new ThreeItemModel("स्वरूपण टूलबार में फ़ॉन्ट आकार उपकरण का सबसे छोटा और सबसे बड़ा फ़ॉन्ट आकार है? ए 8 और 72 बी 8 और 70 सी 8 और 82 डी 10 और 72", "ए 8 और 72"));
        arrayList.add(new ThreeItemModel("किसी भी वर्ण के लिए अधिकतम फ़ॉन्ट आकार क्या हो सकता है? एक 1638 बी 1683 सी 16038 डी 16380", "एक 1638"));
        arrayList.add(new ThreeItemModel("वर्ड 2013 में सामान्य टेम्पलेट पर आधारित एक नए वर्ड डॉक्यूमेंट के लिए डिफ़ॉल्ट फॉन्ट साइज क्या है? ए 9 पीटी बी। 10 पीटी। सी। 11 पीटी। डी। 12 पीटी", "सी। 11 पीटी"));
        arrayList.add(new ThreeItemModel("सभी वर्ड डॉक्यूमेंट्स के लिए डिफॉल्ट फाइल एक्सटेंशन क्या है? ए)। टेक्स्ट बी) .xlsx c)। डॉक्स डी)। डॉक्स", "डी)। डॉक्स"));
        arrayList.add(new ThreeItemModel("शब्द, डिफ़ॉल्ट रूप से, शासक ए के ऊपर प्रत्येक _____ पर एक टैब को रोकता है ए) 1 बी) 75 सी) 5 डी) उपरोक्त में से कोई नहीं", "सी) .5"));
        arrayList.add(new ThreeItemModel("दस्तावेज़ का बाह्यरेखा दृश्य क्या है? A) मार्जिन और पानी v के साथ A) पूर्ण स्क्रीन का पूर्वावलोकन c) विभिन्न स्तरों पर शीर्षक संरचना के साथ एक दृश्य D) ऊपर कुछ भी नहीं", "C) विभिन्न स्तरों पर शीर्षक संरचना के साथ एक दृश्य"));
        arrayList.add(new ThreeItemModel("एक मास्टर दस्तावेज़ में ____ होता है, जिनमें से प्रत्येक में एक डिस्क पर एक फ़ाइल के लिए एक सूचक होता है। ए) उप-डिडक्लेमर बी) हाइपरलिंक्स सी) बुकमार्क डी) प्लेसहोल्डर्स", "ए) सबडाइक्लेमेंट"));
        arrayList.add(new ThreeItemModel("ओके टैब में इन्सर्ट / कैटिगरी ब्रेक का इस्तेमाल करके आप सचमुच एक पेज ब्रेक कर सकते हैं) अपने कर्सर को सही जगह पर रखें और प्रेस करें Ctrl + Enter C) अपने कर्सर को सही जगह पर रखें और F1 कुंजी (उपरोक्त में से कोई भी) दबाएं" , "B) अपने कर्सर को उचित स्थिति में रखें और Ctrl + Enter दबाएं"));
        arrayList.add(new ThreeItemModel("आप प्रत्येक बार चयनित पाठ के फ़ॉन्ट आकार को कैसे बढ़ा सकते हैं? ए) Ctrl + b दबाकर Ctrl +) Ctrl + दबाकर Ctrl +] दबाकर Ctrl +]", "D) Ctrl +] दबाकर"));
        arrayList.add(new ThreeItemModel("एमएस वर्ड 2013 दस्तावेजों में उपयोग किया जाने वाला डिफ़ॉल्ट फ़ॉन्ट क्या है? ए) अंशांकन बी) प्रभाव ग) शताब्दी डी) टाइम्स न्यू रोमन", "ए) कैलीबरी"));
        arrayList.add(new ThreeItemModel("यदि आपको एक ही स्थान पर एक ही लेआउट को एक ही स्थान पर पेस्ट करना है तो आपको क्या करना चाहिए? A) कॉपी पर क्लिक करें और इसे Alt कुंजी B वाले कई स्थानों पर पेस्ट करें) प्रारूप इलस्ट्रेटर पर क्लिक करें और इसे Ctrl कुंजी C वाले कई स्थानों में पेस्ट करें) प्रारूप चित्रकार में। डबल क्लिक करें फिर कई स्थानों पर पेस्ट करें d) उपरोक्त में से किसी पर डबल क्लिक करें "," c) स्वरूप पेंटर फिर कई स्थानों पर पेस्ट करें "));
        arrayList.add(new ThreeItemModel("क्या आप एक नए नाम के साथ एक दस्तावेज़ को सहेजना चाहते हैं? ए) फ़ाइल पर क्लिक करें, बी को सहेजें) फ़ाइल पर क्लिक करें, सी को सहेजें) उपरोक्त में से कोई भी दबाएं", "ए) फ़ाइल, सहेजें पर क्लिक करें"));
        arrayList.add(new ThreeItemModel("हाइपरलिंक ईमेल पते को नियमित पाठ में बदलने के लिए, ई-मेल पते पर राइट-क्लिक करें और फिर शॉर्टकट मेनू में _____। हाइपरलिंक का चयन करें b) हाइपरलिंक निकालें c) हाइपरलिंक को संपादित करें d) उपरोक्त में से कोई भी निकालें", "b हाइपरलिंक निकालें। "));
        arrayList.add(new ThreeItemModel("एक वाक्य का चयन करने के लिए, निम्नलिखित कुंजी को दबाए रखते हुए वाक्य पर कहीं भी क्लिक करें। A) Shift B) CTRC C) Alt D) ISK", "B) CTRL"));
        arrayList.add(new ThreeItemModel("तो एक वाक्य का चयन करें, उस पर क्लिक करें और वाक्य पर पकड़ रखें। ए) शिफ्ट या) सीटीआर सी) ऑल्ट डी) एससी", "या सीटीआरएल"));
        String str = "डॉ। ऑल ऑफ टी इबोव";
        arrayList.add(new ThreeItemModel("क्लिपबोर्ड की सामग्री अभी तक वही है) क) आपने एक और पाठ ख छोड़ दिया है) आप अपने कंप्यूटर को बंद कर देंगे सी) आपने एक और पाठ डी की प्रतिलिपि बनाई है) उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("चयनित पाठ को कॉपी करने के लिए, कुंजी दबाएं) Alt + Shift + C B) Ctrl + Shift + V C) Ctrl + C D) उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("शॉर्टकट कुंजी के लिए पेस्ट करें? ए) सेंट्रल + वीबी) सीटीआरटी + पीसी) सेंट्रल + एसडी) सीटीआरएल + ई", "ए) Ctrl + वी"));
        arrayList.add(new ThreeItemModel("चयनित पाठ को काटने के लिए शॉर्टकट क्या हैं? ए) Ctrl + U B) Ctrl + Z C) Ctrl + C D) Ctrl + X", "D) Ctrl + X"));
        arrayList.add(new ThreeItemModel("नए दस्तावेज़ बनाने के लिए शॉर्टकट क्या हैं? A) Shift + NB) CTR + NC) Alt + ND) Shift + CTRL + N", "B) Ctrl + N"));
        arrayList.add(new ThreeItemModel("मौजूदा दस्तावेज़ खोलने के लिए शॉर्टकट क्या हैं? A) CTRL + O b) Shift + CRTL + O C) CTRL + AD) उपरोक्त में से कोई नहीं", "A) CTRL + O"));
        arrayList.add(new ThreeItemModel("एक दस्तावेज़ को बचाने के लिए शॉर्टकट क्या हैं? ए) Alt + S B) Ctrl + S C) Ctrl + P D) उपरोक्त में से कोई नहीं", "b) Ctrl + S"));
        arrayList.add(new ThreeItemModel("डॉक्यूमेंट प्रिंट करने के लिए शॉर्टकट क्या हैं? A) Ctrl + V b) Ctrl + W c) CTRT + PD) CTRL + R", "C) CTRL + P"));
        arrayList.add(new ThreeItemModel("पूरे दस्तावेज़ को चुनने के लिए शॉर्टकट क्या हैं? ए) Ctrl + S B) Ctrl + W C) Ctrl + P D) Ctrl + A", "D) Ctrl + A"));
        arrayList.add(new ThreeItemModel("चयनित पाठ के लिए बोल्ड शॉर्टकट क्या हैं? ए) Ctrl + B) Ctrl + I C) Ctrl + Shift + B D) Ctrl + O", "A) Ctrl + B"));
        arrayList.add(new ThreeItemModel("चयनित पाठ इटैलिक्स के शॉर्टकट क्या हैं?", "Ctrl + I"));
        arrayList.add(new ThreeItemModel("चयनित पाठ रेखांकित करने के लिए शॉर्टकट क्या हैं?", "Ctrl + U"));
        arrayList.add(new ThreeItemModel("चयनित टेक्स्ट सबस्क्रिप्ट के लिए शॉर्टकट क्या हैं?", "Ctrl + ="));
        arrayList.add(new ThreeItemModel("चयनित पाठ सुपरस्क्रिप्ट शॉर्टकट क्या हैं?", "Ctrl + Shift + +"));
        arrayList.add(new ThreeItemModel("फ़ॉन्ट संवाद बॉक्स प्रदर्शित करने के लिए शॉर्टकट क्या हैं? ए) Ctrl + Shift + P B) Ctrl + Shift + F C) Ctrl + D D) उपरोक्त सभी", str));
        arrayList.add(new ThreeItemModel("चयनित पाठ आकार बढ़ाने के लिए शॉर्टकट कुंजी क्या है?", "Ctrl + Shift +>"));
        arrayList.add(new ThreeItemModel("चयनित पाठ के आकार को कम करने के लिए शॉर्टकट क्या हैं?", "Ctrl + Shift + <"));
        arrayList.add(new ThreeItemModel("चयनित पाठ को बदलने के लिए शॉर्टकट क्या हैं?", "Shift + F3"));
        arrayList.add(new ThreeItemModel("चयनित पाठ के सभी स्वरूपों को साफ़ करने के लिए शॉर्टकट क्या हैं?", "Ctrl + Spacebar"));
        arrayList.add(new ThreeItemModel("चयनित पाठ प्रारूपण शॉर्टकट क्या हैं?", "Ctrl + E"));
        arrayList.add(new ThreeItemModel("चयनित पाठ को सही-संरेखित करने के लिए शॉर्टकट क्या हैं?", "Ctrl + R"));
        arrayList.add(new ThreeItemModel("चयनित पाठ को बाएं-संरेखित करने के लिए शॉर्टकट क्या हैं?", "Ctrl + L"));
        arrayList.add(new ThreeItemModel("चयनित पाठ को समायोजित करने के लिए शॉर्टकट क्या हैं?", "Ctrl + J"));
        arrayList.add(new ThreeItemModel("एक दस्तावेज़ में एक शब्द खोजने के लिए शॉर्टकट क्या हैं?", "Ctrl + F"));
        arrayList.add(new ThreeItemModel("दस्तावेज़ की अंतिम क्रिया को पूर्ववत करने के लिए शॉर्टकट कुंजी", "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("दस्तावेज़ में हाइपरलिंक डालने के लिए शॉर्टकट क्या हैं?", "Ctrl + K"));
        arrayList.add(new ThreeItemModel("पेज ब्रेक पर आप किस कुंजी को दबा रहे हैं?", "Ctrl + Enter"));
        arrayList.add(new ThreeItemModel("दस्तावेज़ में वर्तनी जांच शॉर्टकट क्या हैं?", "F7"));
        arrayList.add(new ThreeItemModel("एक दस्तावेज़ में एक शब्द को बदलने के लिए शॉर्टकट क्या हैं?", "Ctrl + H"));
        arrayList.add(new ThreeItemModel("क्या आप कॉपीराइट प्रतीक बनाने के लिए शॉर्टकट कुंजी दबा सकते हैं?", "Alt + Ctrl + C"));
        arrayList.add(new ThreeItemModel("अंतिम क्रिया दोहराने के लिए", "Ctrl + Y"));
        arrayList.add(new ThreeItemModel("मैक्रो बनाने के लिए एमएस वर्ड किस भाषा का उपयोग करता है? ए) विज़ुअल बेसिक बी) एक्सेस सी) विज़ुअल सी ++ डी) सी ++", "ए) विज़ुअल बेसिक"));
        arrayList.add(new ThreeItemModel("आप किस भाषा का उपयोग करते हैं? वर्ड क्रेते में मैक्रोज़ है? ए) विज़ुअल बेसिक या एक्सेस सी) विज़ुअल सी ++ डी) व्हाट ++", "ए) विज़ुअल बेसिक"));
        arrayList.add(new ThreeItemModel("निम्न में से कौन सा पृष्ठ अभिविन्यास है? ए) लैंडस्केप बी) पोर्ट्रेट सी) दोनों (ए) और (बी) डी) उपरोक्त में से कोई नहीं", "सी) दोनों (ए) और (बी)"));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("مائیکروسافٹ ورڈ اے ورڈ پروسیسنگ پروگرام بی۔ اسپریڈشیٹ پروگرام سی پریزنٹیشن پروگرام D. مندرجہ بالا میں سے کوئی بھی نہیں" , "اے ورڈ پروسیسنگ پروگرام"));
        arrayList.add(new ThreeItemModel("ورڈ ریپر کا مطلب ہے۔ دائیں حاشیہ کے ساتھ عبارت کی سیدھ B. الفاظ کے درمیان وقفہ کرنا سی لفظ کو خود بخود اگلی لائن میں منتقل کرتا ہے D. اوپر کچھ نہیں" , "سی متن کو خود بخود اگلی لائن میں منتقل کریں"));
        arrayList.add(new ThreeItemModel("اگر آپ متن کے کسی انتخاب کی کاپی کرنا چاہتے ہیں تو آپ کس بٹن پر کلیک کرتے ہیں؟ اے ، بی ، کاپی ، سی ، سی ، ڈی ، ڈپلیکیٹ" , "بی کاپی"));
        arrayList.add(new ThreeItemModel("متن کا انتخاب_ایک ایک لفظ یا ایک لائن ہو سکتا ہے ، پیراگراف سی مکمل دستاویز ڈی۔ اوپر کے سب" , "اوپر والے سبھی"));
        arrayList.add(new ThreeItemModel("متن کا انتخاب_ایک ایک لفظ یا ایک لائن ہو سکتا ہے ، پیراگراف سی مکمل دستاویز ڈی۔ اوپر کے سب" , "اوپر والے سبھی"));
        arrayList.add(new ThreeItemModel("آپ A کے بطور محفوظ کریں ... ڈائیلاگ باکس میں B فائل کو محفوظ کریں ڈائیلاگ باکس سی فائل کو بچائیں ... ڈائیلاگ باکس D. مندرجہ بالا میں سے کوئی بھی نہیں" , "A کے طور پر محفوظ کریں ... ڈائیلاگ باکس"));
        arrayList.add(new ThreeItemModel("جب آپ کسی پیراگراف میں ٹائپ کرتے ہیں تو ، آپ ہر لکیر کے آخر میں اے درج کریں۔ B دبائیں۔ پیراگراف کے آخر میں صرف دبائیں۔ ڈی۔ مذکورہ بالا میں سے کوئی بھی لفظ کے آخر میں ڈی دبائیں۔" , "پیراگراف بی کے آخر میں صرف انٹر دبائیں۔"));
        arrayList.add(new ThreeItemModel("اگر آپ کالعدم بٹن پر کلک کرتے ہیں تو اس میں نیا متن شامل ہوگا اور اصلی متن کو منتقل کیا جائے گا B اس سے پرانا متن ہٹ جائے گا اور نیا متن بحال ہوگا۔ یہ نیا متن ہٹائے گا اور اصل متن D کو بحال کرے گا۔", "C یہ نیا ہے متن کو ہٹا دیں اور اصل متن کو بحال کریں "));
        arrayList.add(new ThreeItemModel("منتخب جملے کو حذف کرنے کے ل we ، ہم درج ذیل کلید کو دبائيں گے: الف۔ بیک اسپیس ب۔ ڈیل سی ، دونوں (ا) اور (بی) ڈی۔ مذکورہ بالا میں سے کوئی بھی نہیں" , "سی۔ (اے) اور (بی)"));
        arrayList.add(new ThreeItemModel("منتخب جملے کو حذف کرنے کے ل we ، ہم درج ذیل کلید کو دبائيں گے: الف۔ بیک اسپیس ب۔ ڈیل سی ، دونوں (ا) اور (بی) ڈی۔ مذکورہ بالا میں سے کوئی بھی نہیں" , "سی۔ (اے) اور (بی)"));
        arrayList.add(new ThreeItemModel("دستاویز کو زیادہ سے زیادہ تک زوم کیا جاسکتا ہے: A 100٪ B 200٪ C 400٪ D 500٪", "D 500٪"));
        arrayList.add(new ThreeItemModel("فارمیٹنگ ٹول بار میں فونٹ سائز ٹول کا سب سے چھوٹا اور سب سے بڑا فونٹ سائز کیا ہے؟ A. 8 اور 72 B8 اور 70 C8 اور 82 D 10 اور 72" , "A. 8 اور 72"));
        arrayList.add(new ThreeItemModel("آپ کسی بھی کردار کے ل apply درخواست دینے کے لئے زیادہ سے زیادہ فونٹ کا سائز کتنا ہے؟ A. 1638 B 1683 C 16038 D 16380", "A 1638"));
        arrayList.add(new ThreeItemModel("ورڈ 2013 میں عام ٹیمپلیٹ پر مبنی نئے ورڈ دستاویز کے لئے طے شدہ فونٹ کا سائز کتنا ہے؟ A. 9 pt B. 10 pt C. 11 pt D. 12 pt", "C. 11 pt"));
        arrayList.add(new ThreeItemModel("تمام ورڈ دستاویزات کے لئے پہلے سے طے شدہ فائل کی توسیع کیا ہے؟ A). متن ب). xlsx سی). ڈوکس ڈی). ڈوکس" , "ڈی) .ڈوکس"));
        arrayList.add(new ThreeItemModel("لفظ ، بطور ڈیفالٹ ، حکمران A کے اوپر ہر _____ علامت پر ایک ٹیب رکتا ہے) 1 b) 75 c) 5 d) مندرجہ بالا میں سے کوئی بھی" ,"c) .5"));
        arrayList.add(new ThreeItemModel("دستاویز کا آؤٹ لائن نقطہ نظر کیا ہے؟ A) ایک مارجن اور پانی والا V) مکمل اسکرین کا ایک جائزہ c) مختلف سطحوں پر عنوان ڈھانچے والا نظارہ D) مندرجہ بالا میں سے کوئی بھی نہیں" , "C) مختلف سطحوں پر عنوان کی ساخت کا نظارہ"));
        arrayList.add(new ThreeItemModel("ایک ماسٹر دستاویز میں ____ ہوتا ہے ، جن میں سے ہر ایک میں ڈسک کی فائل کا ایک پوائنٹر ہوتا ہے؟ A) سب ڈوکیومنٹ b) ہائپر لنکس سی) بوک مارکس d) پلیس ہولڈر" , "ایک) ذیلی دستاویزات"));
        arrayList.add(new ThreeItemModel("آپ ٹھیک ہے ٹیب میں داخل کریں / زمرہ وقفے کا استعمال کرتے ہوئے لفظی طور پر صفحہ توڑنے پر مجبور کرسکتے ہیں) اپنے کرسر کو صحیح جگہ پر رکھیں اور Ctrl + enter C دبائیں) اپنے کرسر کو صحیح جگہ پر رکھیں اور ایف 1 کی (اوپر والا کوئی بھی) دبائیں۔" , "B) اپنے کرسر کو مناسب پوزیشن میں رکھیں اور Ctrl + enter دبائیں۔"));
        arrayList.add(new ThreeItemModel("آپ ہر بار منتخب کردہ متن کے فونٹ سائز میں کس طرح اضافہ کرسکتے ہیں؟ ا) Ctrl + b دبانے سے) Ctrl + [D) دبانے سے Ctrl +] دبائیں ،" , "D) Ctrl +] دبانے سے۔"));
        arrayList.add(new ThreeItemModel("ایم ایس ورڈ 2013 دستاویزات میں استعمال شدہ ڈیفالٹ فونٹ کیا ہے؟ ا) انشانکن ب) اثرات سی) صدی د) ٹائمز نیو رومن" , "ا) کالیبری"));
        arrayList.add(new ThreeItemModel("آپ کو کیا کرنا چاہئے اگر آپ کو ایک ہی جگہ پر بہت سی جگہوں پر ایک ہی ترتیب کو چسپاں کرنا ہو؟ A) کاپی پر کلک کریں اور اس میں Alt کی B پر مشتمل بہت سی جگہوں پر چسپاں کریں) فارمیٹ کے مصور پر کلک کریں اور اسے Ctrl key C پر مشتمل بہت سی جگہوں پر چسپاں کریں) فارمیٹ پینٹر میں ڈبل کلک کریں پھر متعدد جگہوں پر پیسٹ کریں d) مذکورہ بالا ","شکل پر پینٹر پھر کئی جگہوں پر پیسٹ کریں"));
        arrayList.add(new ThreeItemModel("ایم ایس ورڈ میں فائل کو بند کرنے کے ل Which فائل پل ڈاون مینو میں کون سا آپشن استعمال کیا جاتا ہے؟ ا) باہر نکلیں ب) بند سی) بند کرو ڈی) مندرجہ بالا میں سے کوئی بھی نہیں" , "بی) بند"));
        arrayList.add(new ThreeItemModel("کیا آپ کسی نئے نام کے ساتھ کسی دستاویز کو محفوظ کرنا چاہتے ہیں؟ ا) فائل پر کلک کریں ، بی کو محفوظ کریں) فائل پر کلک کریں ، سی محفوظ کریں) مندرجہ بالا میں سے کسی کو دبائیں" , "ا) فائل پر کلک کریں ، محفوظ کریں"));
        arrayList.add(new ThreeItemModel("ہائپر لنک کو ای میل ایڈریس کو باقاعدہ متن میں تبدیل کرنے کے لئے ، شارٹ کٹ مینو میں ای میل ایڈریس پر دائیں کلک کریں اور پھر _____ دیکھیں۔ ہائپر لنک کو منتخب کریں ب) ہائپر لنک کو ایڈیٹ کریں d) مندرجہ بالا میں سے کوئی بھی ہٹائیں" , "بی) ہائپر لنک کو ہٹا دیں۔"));
        arrayList.add(new ThreeItemModel("ایک جملہ منتخب کرنے کے لئے ، درج ذیل کلید کو تھامتے ہوئے جملے پر کہیں بھی دبائیں۔ ا) شفٹ بی) سی ٹی آر سی سی) آلٹ ڈی) آئی ایس کے" , "بی) سی ٹی آر ایل"));
        String str ="D) اوپر والے سب" ;
        arrayList.add(new ThreeItemModel("کلپ بورڈ کے مندرجات ابھی تک وہی ہیں۔ ا) آپ نے ایک اور متن چھوڑ دیا ہے ب) آپ اپنا کمپیوٹر بند کردیں گے۔) آپ نے ایک اور متن کاپی کردیا ہے D) مذکورہ بالا سب", str));
        arrayList.add(new ThreeItemModel("منتخب متن کی کاپی کرنے کے لئے ، کلید دبائیں) Alt + Shift + C B) Ctrl + Shift + V C) Ctrl + C D) مذکورہ بالا سب", str));
        arrayList.add(new ThreeItemModel("شارٹ کٹ کلید کیلئے؟ A) مرکزی + VB) CTRT + PC) مرکزی + SD) CTRL + E" , "A) Ctrl + V کے لئے پیسٹ کریں"));
        arrayList.add(new ThreeItemModel("منتخب متن کو کاٹنے کے لئے شارٹ کٹ کیا ہیں؟ A) Ctrl + U B) Ctrl + Z C) Ctrl + C D) Ctrl + X", "D) Ctrl + X"));
        arrayList.add(new ThreeItemModel("نئی دستاویزات بنانے کے لئے شارٹ کٹ کیا ہیں؟ ا) شفٹ + این بی) سی ٹی آر + این سی) آلٹ + این ڈی) شفٹ + سی ٹی آر ایل + این" , "بی) سی ٹی آر ایل + این"));
        arrayList.add(new ThreeItemModel("کسی موجودہ دستاویز کو کھولنے کے لئے شارٹ کٹ کیا ہیں؟ A) CTRL + O b) شفٹ + CRTL + O C) CTRL + AD مندرجہ بالا میں سے کوئی بھی نہیں "," A) CTRL + O "));
        arrayList.add(new ThreeItemModel("دستاویز کو محفوظ کرنے کے لئے شارٹ کٹ کیا ہیں؟ ا) Alt + S B) Ctrl + S C) Ctrl + P D) مندرجہ بالا میں سے کوئی بھی نہیں" , "b) Ctrl + S"));
        arrayList.add(new ThreeItemModel("دستاویز کو چھپانے کے لئے شارٹ کٹ کیا ہیں؟ A) Ctrl + V b) Ctrl + WC) CTRT + PD) CTRL + R", "C) CTRL + P"));
        arrayList.add(new ThreeItemModel("پوری دستاویز کے انتخاب کے ل the شارٹ کٹ کیا ہیں؟ ا) Ctrl + S B) Ctrl + W C) Ctrl + P D) Ctrl + A" , "D) Ctrl + A"));
        arrayList.add(new ThreeItemModel("منتخب متن کے لئے جرات مندانہ شارٹ کٹ کیا ہیں؟ A) Ctrl + B) Ctrl + I C) Ctrl + Shift + B D) Ctrl + O", "A) Ctrl + B"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے تصنیف کے ل for شارٹ کٹ کیا ہیں؟" , "Ctrl + I" ));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے نیچے لکھے جانے والے شارٹ کٹ کیا ہیں؟" , "Ctrl + U"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے سبسکرپٹ کے لئے شارٹ کٹ کیا ہیں؟" , "Ctrl + ="));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے سپر اسکرپٹ کے شارٹ کٹ کیا ہیں؟" , "Ctrl + شفٹ + +"));
        arrayList.add(new ThreeItemModel("فونٹ ڈائیلاگ باکس کی نمائش کے ل the شارٹ کٹ کیا ہیں؟ A) Ctrl + Shift + P B) Ctrl + Shift + F C) Ctrl + D D) مذکورہ بالا سب", str));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے سائز میں اضافے کے ل shortc شارٹ کٹ کلید کیا ہے؟" , "Ctrl + Shift +>"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کے سائز کو کم کرنے کے لئے کیا شارٹ کٹ ہیں؟" , "Ctrl + شفٹ + <"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کو تبدیل کرنے کے لئے شارٹ کٹ کیا ہیں؟" , "شفٹ + ایف 3"));
        arrayList.add(new ThreeItemModel("منتخب متن کے تمام فارمیٹس کو صاف کرنے کے لئے کیا شارٹ کٹ ہیں؟" , "Ctrl + اسپیس بار"));
        arrayList.add(new ThreeItemModel("منتخب ٹیکسٹ فارمیٹنگ شارٹ کٹ کیا ہیں؟"  , "Ctrl + E" ));
        arrayList.add(new ThreeItemModel("منتخب متن کو دائیں سیدھ میں لانے کیلئے شارٹ کٹ کیا ہیں؟" , "Ctrl + R"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کو بائیں سیدھ میں لانے کیلئے شارٹ کٹ کیا ہیں؟" , "Ctrl + L"));
        arrayList.add(new ThreeItemModel("منتخب کردہ متن کو ایڈجسٹ کرنے کے لئے کون سے شارٹ کٹ ہیں؟" , "Ctrl + J"));
        arrayList.add(new ThreeItemModel("دستاویز میں الفاظ ڈھونڈنے کے لئے شارٹ کٹ کیا ہیں؟" , "Ctrl + F"));
        arrayList.add(new ThreeItemModel("دستاویز کی آخری کارروائی کو کالعدم کرنے کے لئے شارٹ کٹ کی" , "Ctrl + Z"));
        arrayList.add(new ThreeItemModel("کسی دستاویز میں ہائپر لنکس داخل کرنے کے لئے کیا شارٹ کٹ ہیں؟" , "Ctrl + K"));
        arrayList.add(new ThreeItemModel("آپ صفحے کے وقفے پر کون سی کلید دبارہے ہیں؟" , "Ctrl + Enter"));
        arrayList.add(new ThreeItemModel("دستاویز میں ہجے چیک شارٹ کٹ کیا ہیں؟" , "F7"));
        arrayList.add(new ThreeItemModel("دستاویز میں کسی لفظ کی جگہ لینے کے لئے شارٹ کٹ کیا ہیں؟" , "Ctrl + H"));
        arrayList.add(new ThreeItemModel("کیا آپ کاپی رائٹ کی علامت بنانے کے لئے شارٹ کٹ کی کو دبائیں؟" , "Alt + Ctrl + C"));
        arrayList.add(new ThreeItemModel("تو آخری عمل کو دہرائیں" , "Ctrl + ya"));
        arrayList.add(new ThreeItemModel("ورڈ میں ، میلنگ لسٹ _______ A) ڈیٹا شیٹ b) ڈیٹا سورس سی) ڈیٹا بیس لسٹ d) مندرجہ بالا میں سے کوئی بھی" , "b) ڈیٹا سورس"));
        arrayList.add(new ThreeItemModel("ایم ایس-ورڈ میکروز بنانے کے لئے کس زبان کا استعمال کرتا ہے؟ ا) بصری بنیادی بنیادی ب) رسائی سی) بصری سی ++ ڈی) سی ++" , "اے) بصری بنیادی"));
        arrayList.add(new ThreeItemModel("صفحہ واقفیت مندرجہ ذیل میں سے کونسا ہے؟ ا) زمین کی تزئین کی ب) پورٹریٹ سی) دونوں (اے) اور (بی) ڈی) مذکورہ بالا میں سے کوئی بھی نہیں" , "سی) دونوں (اے) اور (بی)"));


        return arrayList;
    }


}
