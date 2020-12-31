package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class FamousInventors {

    private Context context;

    public FamousInventors(Context context) {
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
         arrayList.add(new ContentQuestionModel("Who invented the telephone?","Alex Gregory Bell","Vladimir Barmin","Alexander Graham Bell","Alexander Grostjef Bell","Alexander Graham Bell"));
        arrayList.add(new ContentQuestionModel("Who invented the petrol-powered automobile?","Karl Benz","Ludwig Daimler","Karl Opel","Francois Peugeot","Karl Benz"));
        arrayList.add(new ContentQuestionModel("Who invented the first rocket-powered fighter aircraft, BI-1 (together with Aleksei Mihailovich Isaev)?","Nathan Klint","James Kold","Alexander Bereznyak","Georgy Beriev","Alexander Bereznyak"));
        arrayList.add(new ContentQuestionModel("Who invented the World Wide Web with Robert Cailliau?","Tim Bern-Lee","Tim Berners-Lee","Tom Lee","Timothy Bernards","Tim Berners-Lee"));
        arrayList.add(new ContentQuestionModel("Who invented the modern ballpoint pen?","Laszlo Neztjev","Gerd Binnig","Heinrich Rohrer","Laszlo Biro","Laszlo Biro"));
        arrayList.add(new ContentQuestionModel("Who invented the frozen food process?","Jay Heinz","Clarence Birdseye","Clay Greenbean","Mary Johnson","Clarence Birdseye"));
        arrayList.add(new ContentQuestionModel("Who invented the stereo?","Alan Blom","Carl Schneider","Alan Blumlein","Loege Phillips","Alan Blumlein"));
        arrayList.add(new ContentQuestionModel("Who invented the three-point seat belt?","Tuomo Koskinen","Nils Linder","Roland Ford","Nils Bohlin","Nils Bohlin"));
        arrayList.add(new ContentQuestionModel("Who invented the snowmobile?","Joseph Alpari","Joseph-Armand Bombardier","Arnold Brecker","Joseph-Armand Alsthom","Joseph-Armand Bombardier"));
        arrayList.add(new ContentQuestionModel("Who invented the Braille writing system?","Louis Braille","George de Bothezat","douard Branly","Satyendra Nath Bose","Louis Braille"));
        arrayList.add(new ContentQuestionModel("Who invented Cellophane?","Maria Christina Bruhn","Jacques E. Brandenberger","Bruno Brenner","Jacques Berger","Jacques E. Brandenberger"));
        arrayList.add(new ContentQuestionModel("Who invented the stereo?","Alan Blom","Carl Schneider","Loege Phillips","Alan Blumlein","Alan Blumlein"));
        arrayList.add(new ContentQuestionModel("Who invented the three-point seat belt?","Tuomo Koskinen","Nils Linder","Nils Bohlin","Roland Ford","Nils Bohlin"));
        arrayList.add(new ContentQuestionModel("Who invented the snowmobile?","Joseph Alpari","Joseph-Armand Bombardier","Arnold Brecker","Joseph-Armand Alsthom","Joseph-Armand Bombardier"));

        arrayList.add(new ContentQuestionModel("Who invented the wireless remote control?","Frank Nesso","Alexandre Alexeieff","Robert Adler","Ami Argand","Robert Adler"));
        arrayList.add(new ContentQuestionModel("Who invented the windshield wiper blade?","Mark Kemp","Donald Dwight","Vasily Andreyev","Mary Anderson","Vasily Andreyev"));
        arrayList.add(new ContentQuestionModel("Who invented canning (airtight food preservation)?","Nicolas Appert","Oleg Antonov"," Hermann Anschtz-Kaempfe","Genrich Altshuller","Nicolas Appert"));
        arrayList.add(new ContentQuestionModel("Who invented the FM radio?","Edward Henrik Armstrong","Louis Theroux","Adam Anter","Edwin Howard Armstrong","Edwin Howard Armstrong"));
        arrayList.add(new ContentQuestionModel("Who invented the waterbed?","Neil Arnott","Nelly Dickinson","Emma Holmstead","Carl Junggren","Neil Arnott"));
        arrayList.add(new ContentQuestionModel("Who invented the modern digital computer?","Zhores Alferov","William George Armstrong","Joseph Aspdin","John Vincent Atanasoff","John Vincent Atanasoff"));
        arrayList.add(new ContentQuestionModel("Who invented the Hovercraft?","Edward Cockerell","Lyan Mitterand","James Hover","Christopher Cockerell","Christopher Cockerell"));
        arrayList.add(new ContentQuestionModel("Who invented the Christmas card?","James Leighton","Sir Michael Coles","Sir Henry Cole","Peter Toole","Sir Henry Cole"));
        arrayList.add(new ContentQuestionModel("Who invented the revolver?","Anne Colt","Sig Sauer","Henrik Heuer","Samuel Colt","Samuel Colt"));
        arrayList.add(new ContentQuestionModel("Who invented the Electric stove?","Lloyd Copeland","Lewitt Klint","David Ferritt","Lloyd Groff Copeman","Lloyd Groff Copeman"));
        arrayList.add(new ContentQuestionModel("Who invented the piano?","Angelo Ferritto","Bartolomeo Cristofori","Davide Schmidt","Jugend Klint","Bartolomeo Cristofori"));
        arrayList.add(new ContentQuestionModel("Who invented the first steam-powered road vehicle?","Nicolas-Joseph Cugnot","Nicolas-Joseph Peugeot","Nicolas-Joseph Citroen","Joseph Seat","Nicolas-Joseph Cugnot"));
        arrayList.add(new ContentQuestionModel("Who invented the first artificial refrigerator?","Blake Miller","Miranda Gerber","William Cullen","Ligo Junos","William Cullen"));
        arrayList.add(new ContentQuestionModel("Who invented or is at least credited for inventing eyeglasses in 1284?","Leonardo da Vinci","Salvino D'Armate","Glenn Curtiss","Corradino D'Ascanio","Salvino D'Armate"));
        arrayList.add(new ContentQuestionModel("Who invented 3D holography?","Lee DeForest","Vasily Degtyaryov","Akinfiy Demidov","Yuri Nikolaevich Denisyuk","Yuri Nikolaevich Denisyuk"));
        arrayList.add(new ContentQuestionModel("Who invented the Thermos flask?","Charles Thermos","James Dewar","Aleksandr Dianin","Akinfiy Demidov","James Dewar"));
        arrayList.add(new ContentQuestionModel("Who invented the Ceiling fan and the electric sewing machine?","Roald Drie","James Hoover","Philip Swindle","Philip Diehl","Philip Diehl"));
        arrayList.add(new ContentQuestionModel("Who invented the Diesel engine?","Francois Petroleum","Rudolf Benz","Vin Diesel","Rudolf Diesel","Rudolf Diesel"));
        arrayList.add(new ContentQuestionModel("Who invented the Dolby noise-reduction system?","Timothy Loewe","Bunsuthar Bose","Ray Dolby","Ray Ban","Ray Dolby"));
        arrayList.add(new ContentQuestionModel("Who invented the ejection seat?","William H. Dobelle","Lee DeForest","William Kennedy Laurie Dickson","Anastase Dragomir","Anastase Dragomir"));


        arrayList.add(new ContentQuestionModel("Who invented the magnifying glass?","Roger Bacon","Tim Lettuce","Shawn Salt","Brian Butter","Roger Bacon"));
        arrayList.add(new ContentQuestionModel("Who invented the video game console?","Julius Henry","Ralph H. Baer","Tim Trelling","Arthur Windth","Ralph H. Baer"));
        arrayList.add(new ContentQuestionModel("Who invented the electromechanical television, electronic color television?","Helen Jones","Henrik Tuomala","John Logie Baird","Andrei Antsjejeff","John Logie Baird"));
        arrayList.add(new ContentQuestionModel("Who invented the gas turbine?","Roman Tsinov","John Weller","Jonathan Keller","John Barber","John Barber"));
        arrayList.add(new ContentQuestionModel("Who invented PVC?","Eugen Baumann","Eugen Schauman","Jurgen Boltz","Jurgen Neumann","Eugen Baumann"));
        arrayList.add(new ContentQuestionModel("Who invented the wind-up radio?","Dylan Jones","Nikolay Basov","Donat Banki","Trevor Baylis","Trevor Baylis"));
        arrayList.add(new ContentQuestionModel("Who invented the Chanel No. 5?","Earl Jones","Ernest Brighton","Ernest Beaux","Timothy G. Pender","Ernest Beaux"));
        arrayList.add(new ContentQuestionModel("Who invented the pH meter?","Muhammad ibn Jabir al-Harrani al-Battani","Francis Beaufort","Ulugh Beg","Arnold O. Beckman","Arnold O. Beckman"));

        arrayList.add(new ContentQuestionModel("Who invented the Braille writing system?","Louis Braille","George de Bothezat","douard Branly","Satyendra Nath Bose","Louis Braille"));
        arrayList.add(new ContentQuestionModel("Who invented Cellophane?","Maria Christina Bruhn","Jacques E. Brandenberger","Bruno Brenner","Jacques Berger","Jacques E. Brandenberger"));
        arrayList.add(new ContentQuestionModel("Who invented stainless steel?","Harry Brown","Harry Beard","Harry Beverly","Harry Brearley","Harry Brearley"));
        arrayList.add(new ContentQuestionModel("Who invented the automatic handgun?","John Moses Browning","John Colt","Carl Wesson","Angelo Beretta","John Moses Browning"));
        arrayList.add(new ContentQuestionModel("Who invented the lawnmower?","Edwin Beard Jones","John Actor","Ludwig Fors","Edwin Beard Budding","Edwin Beard Budding"));
        arrayList.add(new ContentQuestionModel("Who invented paper?","Juan de la Cierva","Xianjao Yian","Octave Chanute","C`ai Lun","C`ai Lun"));
        arrayList.add(new ContentQuestionModel("Who invented Nylon?","Wallace Carothers","Walton Kent","Leighton Reilly","Clian Ment","Wallace Carothers"));
        arrayList.add(new ContentQuestionModel("Who invented the dishwasher?","James Rent","Who invented Nylon?","Mary Whirlpool","Vitali Zanussi","Who invented Nylon?"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

          arrayList.add(new ContentQuestionModel("চ্যানেল নং 5 কে আবিষ্কার করেছেন?", "আর্ল জোনস", "আর্নেস্ট ব্রাইটন", "আর্নেস্ট বিউক্স", "টিমোথি জি পেন্ডার", "আর্নেস্ট বিউক্স"));
        arrayList.add(new ContentQuestionModel("পিএইচ মিটার কে আবিষ্কার করেছেন?", "মুহাম্মদ ইবনে জাবির আল-হরানানী আল-বাত্তানী", "ফ্রান্সিস বিউফোর্ট", "উলুগ বেগ", "আর্নল্ড ও। বেকম্যান", "আর্নল্ড ও। বেকম্যান"));
        arrayList.add(new ContentQuestionModel("টেলিফোনটি কে আবিষ্কার করেছিলেন?", "অ্যালেক্স গ্রেগরি বেল", "ভ্লাদিমির বারমিন", "আলেকজান্ডার গ্রাহাম বেল", "আলেকজান্ডার গ্রোস্টজিফ বেল", "আলেকজান্ডার গ্রাহাম বেল"));
        arrayList.add(new ContentQuestionModel("পেট্রোল চালিত অটোমোবাইল কে আবিষ্কার করেছেন?", "কার্ল বেনজ", "লুডভিগ ডেইমলার", "কার্ল ওপেল", "ফ্রাঙ্কোইস পিউজিট", "কার্ল বেনজ"));
        arrayList.add(new ContentQuestionModel("পেট্রোল চালিত অটোমোবাইল কে আবিষ্কার করেছেন?", "কার্ল বেনজ", "লুডভিগ ডেইমলার", "কার্ল ওপেল", "ফ্রাঙ্কোইস পিউজিট", "কার্ল বেনজ"));
        arrayList.add(new ContentQuestionModel("রবার্ট কিলিয়াউয়ের সাথে ওয়ার্ল্ড ওয়াইড ওয়েব কে আবিষ্কার করেছিলেন?", "টিম বার্ন-লি", "টিম বার্নার্স-লি", "টম লি", "টিমোথি বার্নার্ডস", "টিম বার্নার্স-লি"));
        arrayList.add(new ContentQuestionModel("আধুনিক বলপয়েন্ট কলম কে আবিষ্কার করেছেন?", "লাস্লোলো নেজতজেভ", "গার্ড বিনিনিগ", "হেনরিচ রোহের", "লাস্লোলো বিরো", "লাস্লোলো বিরো"));//19
        arrayList.add(new ContentQuestionModel("হিমশীতল খাদ্য প্রক্রিয়া কে আবিষ্কার করেছেন?", "জে হেইঞ্জ", "ক্লারেন্স বার্ডসেই", "ক্লে গ্রিনিবিন", "মেরি জনসন", "ক্লারেন্স বার্ডসেই"));
        arrayList.add(new ContentQuestionModel("স্টেরিও কে আবিষ্কার করেছেন?", "অ্যালান ব্লুমলিন", "কার্ল স্নাইডার", "অ্যালান ব্লুম্লেইন", "লোজে ফিলিপস", "অ্যালান ব্লুমলিন"));//21
        arrayList.add(new ContentQuestionModel("তিন পয়েন্টের আসন বেল্ট কে আবিষ্কার করেছিলেন?", "টুওমো কোসকিনেন", "নীল লিন্ডার", "রোল্যান্ড ফোর্ড", "নীল বোহলিন", "নীল বোহলিন"));
        arrayList.add(new ContentQuestionModel("স্নোমোবাইল কে আবিষ্কার করেছেন?", "জোসেফ আল্পারি", "জোসেফ-আরমান্ড বোম্বার্ডিয়ার", "আর্নল্ড ব্রেকার", "জোসেফ-আরমান্ড আলস্টম", "জোসেফ-আরমান্ড বোম্বার্ডিয়ার"));
        arrayList.add(new ContentQuestionModel("ব্রেইল রচনার ব্যবস্থা কে আবিষ্কার করেছিলেন?", "লুই ব্রেইল", "জর্জ ডি বোথেজাত", "ডুয়ার্ড ব্রানলি", "সত্যেন্দ্র নাথ বোস", "লুই ব্রেইল"));
        arrayList.add(new ContentQuestionModel("সেলোফেন কে আবিষ্কার করেছেন?", "মারিয়া ক্রিস্টিনা ব্রুহান", "জ্যাক ই ব্র্যান্ডেনবার্গার", "ব্রুনো ব্রেনার", "জ্যাক বার্গার", "জ্যাক ই ব্র্যান্ডেনবার্গার"));
        arrayList.add(new ContentQuestionModel("স্টেরিও কে আবিষ্কার করেছেন?", "অ্যালান ব্লুমলিন", "কার্ল স্নাইডার", "লোজে ফিলিপস", "অ্যালান ব্লুম্লেইন", "অ্যালান ব্লুমলিন"));//26
        arrayList.add(new ContentQuestionModel("তিন পয়েন্টের আসন বেল্ট কে আবিষ্কার করেছিলেন?", "তুওমো কোসকিনেন", "নীল লিন্ডার", "নীল বোহলিন", "রোল্যান্ড ফোর্ড", "নীল বোহলিন"));
        arrayList.add(new ContentQuestionModel("স্নোমোবাইল কে আবিষ্কার করেছেন?", "জোসেফ আল্পারি", "জোসেফ-আরমান্ড বোম্বার্ডিয়ার", "আর্নল্ড ব্রেকার", "জোসেফ-আরমান্ড আলস্টম", "জোসেফ-আরমান্ড বোম্বার্ডিয়ার"));

        arrayList.add(new ContentQuestionModel("ওয়্যারলেস রিমোট কন্ট্রোল কে আবিষ্কার করেছেন?", "ফ্র্যাঙ্ক নেসো", "আলেকজান্দ্রে আলেক্সিফ", "রবার্ট অ্যাডলার", "অমি আরগান্ড", "রবার্ট অ্যাডলার"));
        arrayList.add(new ContentQuestionModel("উইন্ডশীল্ড ওয়াইপার ব্লেড কে আবিষ্কার করেছিলেন?", "মার্ক কেম্প", "ডোনাল্ড ডুইট", "ভ্যাসিলি আন্দ্রেয়েভ", "মেরি অ্যান্ডারসন", "ভ্যাসিলি আন্দ্রেয়েভ"));
        arrayList.add(new ContentQuestionModel("ক্যানিং (এয়ারটাইট খাবার সংরক্ষণ) কে আবিষ্কার করেছিলেন?", "নিকোলাস অ্যাপের্ট", "ওলেগ আন্তোনভ", "হারম্যান আনস্ক্টজ-কেম্প্পে", "জেনরিচ আল্টশুলার", "নিকোলাস অ্যাপের্ট"));//3
        arrayList.add(new ContentQuestionModel("কে এফএম রেডিও আবিষ্কার করেছেন?", "এডওয়ার্ড হেনরিক আর্মস্ট্রং", "লুই থ্রোক্স", "অ্যাডাম আন্টার", "অ্যাডউইন হাওয়ার্ড আর্মস্ট্রং", "অ্যাডউইন হাওয়ার্ড আর্মস্ট্রং"));

        arrayList.add(new ContentQuestionModel("ক্রিসমাস কার্ড কে আবিষ্কার করেছেন?", "জেমস লেইটন", "স্যার মাইকেল কোলস", "স্যার হেনরি কোল", "পিটার টুল", "স্যার হেনরি কোল"));
        arrayList.add(new ContentQuestionModel("রিভলবারটি কে আবিষ্কার করেছিলেন?", "অ্যানি কোল্ট", "সিগ সাউর", "হেনরিক হিউয়ার", "স্যামুয়েল কোল্ট", "স্যামুয়েল কোল্ট"));
        arrayList.add(new ContentQuestionModel("বৈদ্যুতিক চুলা কে আবিষ্কার করেছেন?", "লয়েড কোপল্যান্ড", "লুইট ক্লিন্ট", "ডেভিড ফেরিট", "লয়েড গ্রোফ কোপম্যান", "লয়েড গ্রোফ কোপম্যান"));
        arrayList.add(new ContentQuestionModel("পিয়ানো কে আবিষ্কার করেছিলেন?", "অ্যাঞ্জেলো ফেরিটো", "বার্তোলোমিও ক্রিস্টোফোরি", "ডেভিড শ্মিড্ট", "জুগেন্ড ক্লিন্ট", "বার্তোলোমিও ক্রিস্টোফোরি"));
        arrayList.add(new ContentQuestionModel("প্রথম বাষ্প চালিত রাস্তা যানবাহনটি কে আবিষ্কার করেছিলেন?", "নিকোলাস-জোসেফ কুগনট", "নিকোলাস-জোসেফ পিউজিট", "নিকোলাস-জোসেফ সিট্রোইন", "জোসেফ আসন", "নিকোলাস-জোসেফ কুগনট"));
        arrayList.add(new ContentQuestionModel("প্রথম কৃত্রিম রেফ্রিজারেটর কে আবিষ্কার করেন?", "ব্লেক মিলার", "মিরান্ডা গারবার", "উইলিয়াম কালেন", "লিগো জুনোস", "উইলিয়াম কালেন"));
        arrayList.add(new ContentQuestionModel("1284 সালে চশমা আবিষ্কার করার জন্য কাকে আবিষ্কার করেছেন বা কমপক্ষে কৃতিত্ব দেওয়া হয়েছে?", "লিওনার্দো দা ভিঞ্চি", "সালভিনো ডি আর্মাতে", "গ্লেন কার্টিস", "করারাডিনো ডি আকাশানিও", "সালভিনো ডি আর্মাতে"));//44
        arrayList.add(new ContentQuestionModel("থ্রিডি হোলোগ্রাফি কে আবিষ্কার করেছেন?", "লি ডিফরেস্ট", "ভ্যাসিলি দেগটিয়ারভ", "আকিনফি ডেমিডভ", "ইউরি নিকোলাভিচ ডেনিসিউক", "ইউরি নিকোলাভিচ ডেনিসিউক"));
        arrayList.add(new ContentQuestionModel("থার্মস ফ্লাস্ক কে আবিষ্কার করেছিলেন?", "চার্লস থার্মোস", "জেমস দেওয়ার", "আলেক্সান্ডার ডায়ানিন", "আকিনফি ডেমিডভ", "জেমস দেওয়ার"));
        arrayList.add(new ContentQuestionModel("সিলিং ফ্যান এবং বৈদ্যুতিক সেলাই মেশিনটি কে আবিষ্কার করেছিলেন?", "রোল্ড ড্রি", "জেমস হুভার", "ফিলিপ সোয়ান্ডল", "ফিলিপ ডিহল", "ফিলিপ ডিহল"));
        arrayList.add(new ContentQuestionModel("ডিজেল ইঞ্জিন কে আবিষ্কার করেছেন?", "ফ্রাঙ্কোইস পেট্রোলিয়াম", "রুডলফ বেনজ", "ভিন ডিজেল", "রুডলফ ডিজেল", "রুডলফ ডিজেল"));
        arrayList.add(new ContentQuestionModel("ডলবি শব্দ-হ্রাস ব্যবস্থা কে আবিষ্কার করেছিলেন?", "টিমোথি লোয়েও", "বুনসুতর বোস", "রে ডলবি", "রে বান", "রে ডলবি"));
        arrayList.add(new ContentQuestionModel("ইজেকশন আসনটি কে আবিষ্কার করেছিলেন?", "উইলিয়াম এইচ। ডোবেল", "লি ডিফরেস্ট", "উইলিয়াম কেনেডি লরি ডিকসন", "অ্যানাস্টেজ ড্রাগোমির", "অ্যানাস্টেজ ড্রাগোমির"));


        arrayList.add(new ContentQuestionModel("ওয়াটারবেড কে আবিষ্কার করেছেন?", "নীল আরনট", "নেলি ডিকিনসন", "এমা হোলস্টেস্ট", "কার্ল জংগ্রেন", "নীল আরনট"));//5
        arrayList.add(new ContentQuestionModel("আধুনিক ডিজিটাল কম্পিউটার কে আবিষ্কার করেছেন?", "জোহরেস আলফেরভ", "উইলিয়াম জর্জ আর্মস্ট্রং", "জোসেফ এস্পদিন", "জন ভিনসেন্ট আতানাসোফ", "জন ভিনসেন্ট আতানাসোফ"));
        arrayList.add(new ContentQuestionModel("ম্যাগনিফাইং গ্লাস কে আবিষ্কার করেছেন?", "রজার বেকন", "টিম লেটুস", "শন সল্ট", "ব্রায়ান বাটার", "রজার বেকন"));
        arrayList.add(new ContentQuestionModel("ভিডিও গেম কনসোলটি আবিষ্কার করেন কে?", "জুলিয়াস হেনরি", "রাল্ফ এইচ বেয়ার", "টিম ট্রেলিং", "আর্থার উইন্ডথ", "রাল্ফ এইচ বেয়ার"));
        arrayList.add(new ContentQuestionModel("ইলেক্ট্রোমেকানিকাল টেলিভিশন, বৈদ্যুতিন রঙিন টেলিভিশন কে আবিষ্কার করেছেন?", "হেলেন জোন্স", "হেনরিক টুমালা", "জন লোগি বেয়ার্ড", "আন্দ্রে আন্টজেজেফ", "জন লোগি বেয়ার্ড"));
        arrayList.add(new ContentQuestionModel("গ্যাস টারবাইন কে আবিষ্কার করেছিলেন?", "রোমান সিনভ", "জন ওয়েলার", "জোনাথন কেলার", "জন বারবার", "জন বারবার"));
        arrayList.add(new ContentQuestionModel("কে পিভিসি আবিষ্কার করেছেন?", "ইউজেন বউমান", "ইউজেন শচামান", "জুরগান বল্টজ", "জুরগেন নিউমান", "ইউজেন বউমান"));
        arrayList.add(new ContentQuestionModel("উইন্ড-আপ রেডিওটি কে আবিষ্কার করেছিলেন?", "ডিলান জোন্স", "নিকোলায় বাসভ", "দোনাত বঙ্কি", "ট্রেভর বেলিস", "ট্রেভর বেলিস"));//12

        arrayList.add(new ContentQuestionModel("ব্রেইল রচনার ব্যবস্থা কে আবিষ্কার করেছিলেন?", "লুই ব্রেইল", "জর্জ ডি বোথেজাত", "ডুয়ার্ড ব্রানলি", "সত্যেন্দ্র নাথ বোস", "লুই ব্রেইল"));
        arrayList.add(new ContentQuestionModel("সেলোফেন কে আবিষ্কার করেছেন?", "মারিয়া ক্রিস্টিনা ব্রুহান", "জ্যাক ই ব্র্যান্ডেনবার্গার", "ব্রুনো ব্রেনার", "জ্যাক বার্গার", "জ্যাক ই ব্র্যান্ডেনবার্গার"));
        arrayList.add(new ContentQuestionModel("স্টেইনলেস স্টিল কে আবিষ্কার করেছেন?", "হ্যারি ব্রাউন", "হ্যারি দাড়ি", "হ্যারি বেভারলি", "হ্যারি ব্রেকার", "হ্যারি ব্রেকার"));//31
        arrayList.add(new ContentQuestionModel("স্বয়ংক্রিয় হ্যান্ডগানটি কে আবিষ্কার করেছেন?", "জন মূসা ব্রাউনিং", "জন কোল্ট", "কার্ল ওয়েসন", "অ্যাঞ্জেলো বেরেট্টা", "জন মূসা ব্রাউনিং"));
        arrayList.add(new ContentQuestionModel("আইনশক্তি কে আবিষ্কার করেছেন?", "এডউইন দাড়ি জোন্স", "জন অভিনেতা", "লুডভিগ ফর্স", "অ্যাডউইন দাড়ি বুডিং", "অ্যাডউইন দাড়ি বুডিং"));//33
        arrayList.add(new ContentQuestionModel("কাগজের আবিষ্কার কে?", "হুয়ানস সিআই এবং ভিএ", "এক্স ইয়ান গর্বিত ওয়াই ইয়ান", "অকটভ সি হনুত", "সিএইউ লুন", "সিএইউ লুন"));
        arrayList.add(new ContentQuestionModel("নাইলন কে আবিষ্কার করেছেন?", "ওয়ালেস ক্যারিয়ার্স", "ওয়ালটন কেন্ট", "লেইটন রেইলি", "ক্লিয়ান মেন্ট", "ওয়ালেস ক্যারিয়ার্স"));
        arrayList.add(new ContentQuestionModel("নাইলন কে আবিষ্কার করেছিলেন?", "জেমস ভাড়া", "--", "মেরি ভার্পুল", "ভিটালি জাণুসি", "জেমস ভাড়া"));
        arrayList.add(new ContentQuestionModel("হোভারক্রাফ্ট কে আবিষ্কার করেছিলেন?", "এডওয়ার্ড কোকরেল", "লায়ান মিটারেন্ড", "জেমস হোভার", "ক্রিস্টোফার কোকরেল", "ক্রিস্টোফার কোকরেল"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("वायरलेस रिमोट कंट्रोल का आविष्कार किसने किया?", "फ्रैंक नेसो", "एलेक्जेंड्रे एलेक्सेफ", "रॉबर्ट एडलर", "अमी अरगैंड", "रॉबर्ट एडलर"));
        arrayList.add(new ContentQuestionModel("किसने विंडशील्ड वाइपर ब्लेड का आविष्कार किया था?", "मार्क केम्प", "डोनाल्ड ड्वाइट", "वसीली आंद्रेयेव", "मैरी एंडरसन", "वसीली आंद्रेयेव"));
        arrayList.add(new ContentQuestionModel("कैनिंग (वायुरोधी खाद्य संरक्षण) का आविष्कार किसने किया?", "निकोलस अलर्ट", "ओलेग एंटोनोव", "हरमन एंस्ट्ज़्ज़-केम्पफे", "जेनरिक अल्टशुलर", "निकोलस अलर्ट"));//3
        arrayList.add(new ContentQuestionModel("एफएम रेडियो का आविष्कार किसने किया?", "एडवर्ड हेनरिक आर्मस्ट्रांग", "लुईस थेरॉक्स", "एडम एंटर", "एडविन हॉवर्ड आर्मस्ट्रांग", "एडविन हॉवर्ड आर्मस्ट्रांग"));
        arrayList.add(new ContentQuestionModel("जलविहीन का आविष्कार किसने किया?", "नील अर्नोट", "नेली डिकिंसन", "एम्मा होल्मस्टेड", "कार्ल जुंगग्रीन", "नील अर्नोट"));
        arrayList.add(new ContentQuestionModel("आधुनिक डिजिटल कंप्यूटर का आविष्कार किसने किया?", "ज़ोर्स अल्फेरोव", "विलियम जॉर्ज आर्मस्ट्रांग", "जोसेफ एस्पिन", "जॉन विंसेंट अटानासॉफ", "जॉन विंसेंट अटानासॉफ"));
        arrayList.add(new ContentQuestionModel("मैग्निफाइंग ग्लास का आविष्कार किसने किया?", "रोजर बेकन", "टिम लेटस", "शॉन सॉल्ट", "ब्रायन बटर", "रोजर बेकन"));
        arrayList.add(new ContentQuestionModel("वीडियो गेम कंसोल का आविष्कार किसने किया?", "जूलियस हेनरी", "राल्फ एच। बेयर", "टिम ट्रेलिंग", "आर्थर विंडथ", "राल्फ एच। बेयर"));
        arrayList.add(new ContentQuestionModel("इलेक्ट्रोमैकेनिकल टेलीविज़न, इलेक्ट्रॉनिक कलर टेलीविज़न का आविष्कार किसने किया?", "हेलेन जोन्स", "हेनरिक टूमला", "जॉन लोगी बेयर्ड", "आंद्रेई एंट्सजेफ", "जॉन लोगी बेयर्ड"));
        arrayList.add(new ContentQuestionModel("गैस टर्बाइन का आविष्कार किसने किया?", "रोमन त्सिनोव", "जॉन वेलर", "जोनाथन केलर", "जॉन बार्बर", "जॉन बार्बर"));
        arrayList.add(new ContentQuestionModel("किसने पीवीसी का आविष्कार किया?", "यूजेन बूमन", "यूजेन शूमैन", "जुर्गन बोल्ट्ज", "जुर्गन न्यूमैन", "यूजेन बूमन"));
        arrayList.add(new ContentQuestionModel("विंड-अप रेडियो का आविष्कार किसने किया?", "डायलन जोन्स", "निकोले बसोव", "डोनेट बांकी", "ट्रेवर बेलिस", "ट्रेवर बेलिस"));
        arrayList.add(new ContentQuestionModel("चैनल नंबर 5 का आविष्कार किसने किया?", "अर्ल जोन्स", "अर्नेस्ट ब्राइटन", "अर्नेस्ट बीक्स", "टिमोथी जी। पेंडर", "अर्नेस्ट बीक्स"));
        arrayList.add(new ContentQuestionModel("पीएच मीटर का आविष्कार किसने किया?", "मुहम्मद इब्न जाबिर अल-हरानी अल-बत्तानी", "फ्रांसिस बेउफोर्ट", "उलुग बेग", "अर्नोन ओ। बेकमैन", "अर्नोन ओ। बेकमैन"));//14
        arrayList.add(new ContentQuestionModel("टेलिफोन का आविष्कार किसने किया?", "एलेक्स ग्रेगरी बेल", "व्लादिमीर बर्मिन", "अलेक्जेंडर ग्राहम बेल", "अलेक्जेंडर ग्रॉस्ट्ज बेल", "अलेक्जेंडर ग्राहम बेल"));
        arrayList.add(new ContentQuestionModel("किसने पेट्रोल चालित ऑटोमोबाइल का आविष्कार किया?", "कार्ल बेंज", "लुडविग डेमलर", "कार्ल ओपल", "फ्रेंकोइस प्यूज़ो", "कार्ल बेंज"));
        arrayList.add(new ContentQuestionModel("किसने पहले रॉकेट-संचालित लड़ाकू विमान, बीआई -1 (अलेक्सी मिहेलोविच इसेव के साथ) का आविष्कार किया?", "नाथन क्लिंट", "जेम्स कोल्ड", "अलेक्जेंडर बेरेज़नीक", "जियोरी बेरीव", "अलेक्जेंडर बेरेज़नीक"));
        arrayList.add(new ContentQuestionModel("रॉबर्ट वाइड के साथ वर्ल्ड वाइड वेब का आविष्कार किसने किया?", "टिम बर्न-ली", "टिम बर्नर्स-ली", "टॉम ली", "टिमोथी बर्नार्ड्स", "टिम बर्नर्स-ली"));
        arrayList.add(new ContentQuestionModel("आधुनिक बॉलपॉइंट पेन का आविष्कार किसने किया?", "लास्ज़्लो नेस्तेजेव", "गर्ड बिनीग", "हेनरिक रोहरर", "लासज़्लो बिरो", "लासज़्लो बिरो"));//19
        arrayList.add(new ContentQuestionModel("किसने जमे हुए भोजन की प्रक्रिया का आविष्कार किया?", "जे हेंज", "क्लेरेंस बर्डसए", "क्ले ग्रीनबीन", "मैरी जॉनसन", "क्लेरेंस बर्डसए"));
        arrayList.add(new ContentQuestionModel("स्टीरियो का आविष्कार किसने किया?", "एलन ब्लॉम", "कार्ल श्नाइडर", "एलन ब्लमलिन", "लोइज फिलिप्स", "एलन ब्लमलिन"));
        arrayList.add(new ContentQuestionModel("थ्री-पॉइंट सीट बेल्ट का आविष्कार किसने किया?", "टुमो कोस्किनेन", "निल्स लिंडर", "रोलैंड फोर्ड", "निल्स बोह्लिन", "निल्स बोह्लिन"));
        arrayList.add(new ContentQuestionModel("स्नोमोबाइल का आविष्कार किसने किया?", "जोसेफ अल्पारी", "जोसेफ-आर्मंड बॉम्बार्डियर", "अर्नोल्ड ब्रेकर", "जोसेफ-आर्मंड एल्स्टहोम", "जोसेफ-आर्मंड बॉम्बार्डियर"));
        arrayList.add(new ContentQuestionModel("ब्रेल लेखन प्रणाली का आविष्कार किसने किया?", "लुई ब्रेल", "जॉर्ज डी बोथ्ज़ैट", "डोर ब्रानली", "सत्येंद्र नाथ बोस", "लुई ब्रेल"));
        arrayList.add(new ContentQuestionModel("सिलोफ़न का आविष्कार किसने किया?", "मारिया क्रिस्टीना ब्रुहन", "जैक्स ई। ब्रैंडेनबर्गर", "ब्रूनो ब्रेनर", "जैक्स बर्जर", "जैक्स ई। ब्रैंडेनबर्गर"));
        arrayList.add(new ContentQuestionModel("स्टीरियो का आविष्कार किसने किया?", "एलन ब्लॉम", "कार्ल श्नाइडर", "लोइग फिलिप्स", "एलन ब्लमलिन", "एलन ब्लमलिन"));
        arrayList.add(new ContentQuestionModel("थ्री-पॉइंट सीट बेल्ट का आविष्कार किसने किया?", "टुमो कोस्किनेन", "निल्स लिंडर", "निल्स बोह्लिन", "रोलैंड फोर्ड", "निल्स बोह्लिन"));
        arrayList.add(new ContentQuestionModel("स्नोमोबाइल का आविष्कार किसने किया?", "जोसेफ अल्पारी", "जोसेफ-आर्मंड बॉम्बार्डियर", "अर्नोल्ड ब्रेकर", "जोसेफ-आर्मंड एल्स्टहोम", "जोसेफ-आर्मंड बॉम्बार्डियर"));
        arrayList.add(new ContentQuestionModel("ब्रेल लेखन प्रणाली का आविष्कार किसने किया?", "लुई ब्रेल", "जॉर्ज डी बोथ्ज़ैट", "डोर ब्रानली", "सत्येंद्र नाथ बोस", "लुई ब्रेल"));
        arrayList.add(new ContentQuestionModel("सिलोफ़न का आविष्कार किसने किया?", "मारिया क्रिस्टीना ब्रुहन", "जैक्स ई। ब्रैंडेनबर्गर", "ब्रूनो ब्रेनर", "जैक्स बर्जर", "जैक्स ई। ब्रैंडेनबर्गर"));
        arrayList.add(new ContentQuestionModel("किसने स्टेनलेस स्टील का आविष्कार किया?", "हैरी ब्राउन", "हैरी बीयर्ड", "हैरी बेवर्ली", "हैरी ब्रियरली", "हैरी ब्रियरली"));
        arrayList.add(new ContentQuestionModel("स्वचालित हैंडगन का आविष्कार किसने किया?", "जॉन मूसा ब्राउनिंग", "जॉन कोल्ट", "कार्ल वेसन", "एंजेलो बेरेटा", "जॉन मूसा ब्राउनिंग"));
        arrayList.add(new ContentQuestionModel("कानूनविद का आविष्कार किसने किया?", "एडविन बियर्ड जोन्स", "जॉन एक्टर", "लुडविग फोर्स", "एडविन बियर्ड बडिंग", "एडविन बियर्ड बडिंग"));
        arrayList.add(new ContentQuestionModel("डब्ल्यूएचओ ने कागज का आविष्कार किया?", "जुआन के सीआई और वीए", "एक्स इयान गर्व वाई इयान", "ऑक्टेव सी हनुत", "सी` UN लुन", "सी` UN लुन"));
        arrayList.add(new ContentQuestionModel("नाइलॉन का आविष्कार किसने किया?", "वालेस कैरोल", "वाल्टन केंट", "लिटन रेली", "क्लियन मेंट", "वालेस कैरोल"));
        arrayList.add(new ContentQuestionModel("डिशवॉशर का आविष्कार किसने किया?", "जेम्स रेंट", "नायलॉन का आविष्कार किसने किया?", "मैरी व्हर्लपूल", "विटाली ज़ानुसी", "नायलॉन का आविष्कार किसने किया?"));//36
        arrayList.add(new ContentQuestionModel("हूवरक्राफ्ट का आविष्कार किसने किया?", "एडवर्ड कॉकरेल", "लेन मितरंड", "जेम्स होवर", "क्रिस्टोफर कॉकरेल", "क्रिस्टोफर कॉकरेल"));
        arrayList.add(new ContentQuestionModel("क्रिसमस कार्ड का आविष्कार किसने किया?", "जेम्स लिटन", "सर माइकल कोल्स", "सर हेनरी कोल", "पीटर टोल", "सर हेनरी कोल"));
        arrayList.add(new ContentQuestionModel("रिवॉल्वर का आविष्कार किसने किया?", "ऐनी कोल्ट", "सिग सॉयर", "हेनरिक ह्यूअर", "सैमुअल कोल्ट", "सैमुअल कोल्ट"));
        arrayList.add(new ContentQuestionModel("इलेक्ट्रिक स्टोव का आविष्कार किसने किया?", "लॉयड कोपलैंड", "लेविट क्लिंट", "डेविड फेरिट", "लॉयड ग्रॉफ कॉपमैन", "लॉयड ग्रॉफ कॉपमैन"));
        arrayList.add(new ContentQuestionModel("पियानो की खोज किसने की?", "एंजेलो फेरिटो", "बार्टोलोमो क्रिस्टोफ़ोरी", "डेविड श्मिट", "जुगेंड क्लिंट", "बार्टोलोमो क्रिस्टोफ़ोरी"));
        arrayList.add(new ContentQuestionModel("पहले स्टीम-संचालित सड़क वाहन का आविष्कार किसने किया?", "निकोलस-जोसेफ कग्नोट", "निकोलस-जोसेफ प्यूज़ो", "निकोलस-जोसेफ सिट्रोएन", "जोसेफ सीट", "निकोलस-जोसेफ कग्नोट"));//42
        arrayList.add(new ContentQuestionModel("पहले कृत्रिम रेफ्रिजरेटर का आविष्कार किसने किया?", "ब्लेक मिलर", "मिरांडा गेरबर", "विलियम कुलेन", "लिगो जुनोस", "विलियम कुलेन"));
        arrayList.add(new ContentQuestionModel("किसने आविष्कार किया या कम से कम 1284 में चश्मा का आविष्कार करने का श्रेय दिया जाता है?", "लियोनार्डो दा विंची", "साल्विनो डी'अरमेट", "ग्लेन कर्टिस", "कोराडिनो डी'एस्कैनियो", "साल्विनो डी'अरमेट"));
        arrayList.add(new ContentQuestionModel("3 डी होलोग्राफी का आविष्कार किसने किया?", "ली डेफॉरेस्ट", "वसीली डिग्यार्योव", "अकिंफि डेमिडोव", "यूरी निकोलाइच डेन्शुक", "यूरी निकोलाइच डेन्शुक"));//45
        arrayList.add(new ContentQuestionModel("थर्मस फ्लास्क का आविष्कार किसने किया?", "चार्ल्स थर्मस", "जेम्स देवर", "अलेक्सांद्र डायनिन", "अकिनफी डेमिडोव", "जेम्स देवर"));
        arrayList.add(new ContentQuestionModel("सीलिंग फैन और इलेक्ट्रिक सिलाई मशीन का आविष्कार किसने किया?", "रोआल्ड डीरी", "जेम्स हूवर", "फिलिप डाईहाल", "फिलिप डेथल", "फिलिप डाईहाल"));//47
        arrayList.add(new ContentQuestionModel("डीजल इंजन का आविष्कार किसने किया?", "फ्रैंकोइस पेट्रोलियम", "रुडोल्फ बेंज", "विन डीजल", "रुडोल्फ डीजल", "रुडोल्फ डीजल"));
        arrayList.add(new ContentQuestionModel("किसने डॉल्बी शोर कम करने वाली प्रणाली का आविष्कार किया?", "टिमोथी लोवे", "बंसुथर बोस", "रे डॉल्बी", "रे बान", "रे डॉल्बी"));
        arrayList.add(new ContentQuestionModel("इजेक्शन सीट का आविष्कार किसने किया?", "विलियम एच। डोबेल", "ली डेफोरेस्ट", "विलियम कैनेडी लॉरी डिक्सन", "अनास्टेस ड्रैगोमिर", "अनास्टेस ड्रैगोमिर"));


        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("وائرلیس ریموٹ کنٹرول کی ایجاد کس نے کی؟" , "فرینک نیسو" , "الیگزینڈری الیکسیف" , "رابرٹ ایڈلر" , "امی ارگنڈ","رابرٹ ایڈلر"));
        arrayList.add(new ContentQuestionModel("ونڈشیلڈ وائپر بلیڈ کی ایجاد کس نے کی؟" , "مارک کیمپ" , "ڈونلڈ ڈوائٹ" , "واسیلی آندریو" , "مریم اینڈرسن","واسیلی آندریو"));
        arrayList.add(new ContentQuestionModel("کیننگ (ہوائی جہاز سے متعلق کھانے کی بچت) کس نے ایجاد کی؟" , "نیکولاس اپریٹ" , "اولیگ انتونوف" , "ہرمن آنشٹز کیمپفی" , "جنریک الٹشولر","نیکولاس اپریٹ"));
        arrayList.add(new ContentQuestionModel("ایف ایم ریڈیو کس نے ایجاد کیا؟" , "ایڈورڈ ہنرک آرمسٹرونگ" ,"لوئس تھروکس" ,"ایڈم اینٹر" , "ایڈون ہاورڈ آرمسٹرونگ","ایڈون ہاورڈ آرمسٹرونگ"));
        arrayList.add(new ContentQuestionModel("واٹر بیڈ کی ایجاد کس نے کی؟" , "نیل ارنوٹ" , "نیلی ڈکنسن" , "ایما ہولمسٹڈ" ,"کارل جنگگرین","نیل ارنوٹ"));//5
        arrayList.add(new ContentQuestionModel("جدید ڈیجیٹل کمپیوٹر کس نے ایجاد کیا؟" , "زہورس الیروف" , "ولیم جارج آرمسٹرونگ" , "جوزف اسپڈین" , "جان ونسنٹ اتناساف","جان ونسنٹ اتناساف"));
        arrayList.add(new ContentQuestionModel("میگنفائنگ گلاس کس نے ایجاد کیا؟" , "راجر بیکن" , "ٹم لیٹش" , "شان نمک" , "برائن بٹر","راجر بیکن"));
        arrayList.add(new ContentQuestionModel("ویڈیو گیم کنسول کس نے ایجاد کیا؟" , "جولیس ہنری" , "رالف ایچ بیئر" , "ٹم ٹریلنگ" , "آرتھر ونڈتھ","رالف ایچ بیئر"));
        arrayList.add(new ContentQuestionModel("الیکٹرو مکینیکل ٹیلی ویژن ، الیکٹرانک کلر ٹیلیویژن کس نے ایجاد کیا؟" , "ہیلن جونز" , "ہنریک ٹومالا" , "جان لوگی بیرڈ" , "آندرے انٹسجیف","جان لوگی بیرڈ"));
        arrayList.add(new ContentQuestionModel("گیس کی ٹربائن کس نے ایجاد کی؟" , "رومن سوینوف", "جان ویلر" , "جوناتھن کیلر" , "جان نائی","جان نائی"));//10
        arrayList.add(new ContentQuestionModel("پیویسی کی ایجاد کس نے کی؟" , "یوجین بومن" , "یوجین شیومان" , "جورجین بولٹز" , "جورجن نیومن","یوجین بومن"));
        arrayList.add(new ContentQuestionModel("ونڈ اپ ریڈیو ایجاد کس نے کیا؟" , "ڈیلن جونز" , "نیکولائی باسوف" , "ڈونٹ بنکی", "ٹریور بیلیس","ٹریور بیلیس"));
        arrayList.add(new ContentQuestionModel("چینل نمبر 5 کس نے ایجاد کیا؟" , "ارل جونز" , "ارنسٹ Beaux" , "ارنسٹ بائوکس" , "ٹموتھی جی پیینڈر","ارنسٹ Beaux"));//13
        arrayList.add(new ContentQuestionModel("پییچ میٹر کی ایجاد کس نے کی؟" , "محمد ابن جبیر الحارانی البطانی" , "فرانسس بیفورٹ" , "اولوگ بیگ" , "آرنلڈ او بیک مین","آرنلڈ او بیک مین"));
        arrayList.add(new ContentQuestionModel("ٹیلیفون کی ایجاد کس نے کی؟" , "الیکس گریگوری بیل" , "ولادیمیر بیرمین" , "الیگزینڈر گراہم بیل" , "الیگزینڈر گروسٹجیف بیل","الیگزینڈر گراہم بیل"));
        arrayList.add(new ContentQuestionModel("پٹرول سے چلنے والی آٹوموبائل کس نے ایجاد کی؟" , "کارل بینز" , "لڈ وِگ ڈیملر" , "کارل اوپل" , "فرانکوئس پیوزو","کارل بینز"));
        arrayList.add(new ContentQuestionModel("راکٹ سے چلنے والا پہلا لڑاکا طیارہ ، BI-1 (الیسی میہیلوچ ایشیف کے ساتھ مل کر) کس نے ایجاد کیا؟" , "ناتھن کلنٹ" , "جیمز کولڈ" , "الیگزینڈر بیریزنیک" , "جارجی بیریو","الیگزینڈر بیریزنیک"));//17
        arrayList.add(new ContentQuestionModel("رابرٹ کیلیؤ کے ساتھ ورلڈ وائڈ ویب کی ایجاد کس نے کی؟" , "ٹم برن لی", "ٹم برنرز لی" , "ٹام لی" , "ٹموتھی برنارڈز","ٹم برنرز لی"));
        arrayList.add(new ContentQuestionModel("جدید بال پوائنٹ قلم کی ایجاد کس نے کی؟", "لسزلو نزتجیف" , "گیرڈ بنیگ" , "لاسزلو بیرو" , "لسزلو بیرو","لاسزلو بیرو"));//19
        arrayList.add(new ContentQuestionModel("منجمد کھانے کے عمل کو کس نے ایجاد کیا؟" , "جے ہینز" ,"کلیرنس برڈسی" , "کلے گرینین" , "مریم جانسن","کلیرنس برڈسی"));
        arrayList.add(new ContentQuestionModel("اس سٹیریو کی ایجاد کس نے کی؟" , "ایلن بلوم" , "کارل شنائیڈر" , "ایلن بلوملین" , "لوج فلپس","ایلن بلوملین"));
        arrayList.add(new ContentQuestionModel("تین نکاتی سیٹ بیلٹ کس نے ایجاد کیا؟" , "تونومو کوسکنین" , "نیلس لنڈر" , "رولینڈ فورڈ" , "نیلس بوہلن","نیلس بوہلن"));
        arrayList.add(new ContentQuestionModel("اسنو موبایل کی ایجاد کس نے کی؟" , "جوزف الپاری" , "جوزف-ارمند بمبارڈیئر" , "آرنلڈ بریکر" , "جوزف-ارمند الستھوم","جوزف-ارمند بمبارڈیئر"));
        arrayList.add(new ContentQuestionModel("بریل تحریری نظام کس نے ایجاد کیا؟" , "لوئس بریل" , "جارج ڈی بوٹیزات" , "ڈورارڈ برنلی" , "ستیندر ناتھ بوس","لوئس بریل"));
        arrayList.add(new ContentQuestionModel("سیلوفین کی ایجاد کس نے کی؟" ,"ماریہ کرسٹینا بروہن" , "جیکس ای برانڈنبرجر" ,"برونو برینر" , "جیک برجر","جیکس ای برانڈنبرجر"));//25
        arrayList.add(new ContentQuestionModel("اس سٹیریو کی ایجاد کس نے کی؟" , "ایلن بلوم" , "کارل شنائیڈر" , "لاؤج فلپس" , "ایلن بلوملین","ایلن بلوملین"));
        arrayList.add(new ContentQuestionModel("تین نکاتی سیٹ بیلٹ کس نے ایجاد کیا؟" ,"تونومو کوسکنین" ,"نیلس لنڈر" , "نیلس بوہلن" , "رولینڈ فورڈ","نیلس بوہلن"));
        arrayList.add(new ContentQuestionModel("اسنو موبایل کی ایجاد کس نے کی؟" , "جوزف الپاری", "جوزف-ارمند بمبارڈیئر" , "آرنلڈ بریکر" , "جوزف-ارمند الستھوم","جوزف-ارمند بمبارڈیئر"));
        arrayList.add(new ContentQuestionModel("بریل تحریری نظام کس نے ایجاد کیا؟", "لوئس بریل" , "جارج ڈی بوٹیزات" , "ڈورارڈ برنلی" ,"ستیندر ناتھ بوس","لوئس بریل"));
        arrayList.add(new ContentQuestionModel("سیلوفین کی ایجاد کس نے کی؟" ,"ماریہ کرسٹینا بروہن" , "جیکس ای برانڈنبرجر" , "برونو برینر" , "جیک برجر","جیکس ای برانڈنبرجر"));//30
        arrayList.add(new ContentQuestionModel("سٹینلیس سٹیل کی ایجاد کس نے کی؟" , "ہیری براؤن" , "ہیری داڑھی" , "ہیری بیورلی" , "ہیری بریلی","ہیری بریلی"));
        arrayList.add(new ContentQuestionModel("خودکار ہینڈگن کی ایجاد کس نے کی؟" ,"جان موسیٰ براؤننگ" , "جان کولٹ" , "کارل ویسن" , "انجیلو بیریٹا","جان موسیٰ براؤننگ"));
        arrayList.add(new ContentQuestionModel("قانون سازی کی ایجاد کس نے کی؟" , "ایڈون داڑھی جونز" , "جان اداکار" , "لڈ وِگ فرس", "ایڈون داڑھی بڈنگ","ایڈون داڑھی بڈنگ"));
        arrayList.add(new ContentQuestionModel("کاغذ ایجاد کس نے کیا؟" , "جوآن ڈی لا سیرووا" , "ژیانجاؤ ییان" , "اوکٹاوی چنوٹے" , "سیئ لون","ژیانجاؤ ییان"));//34
        arrayList.add(new ContentQuestionModel("نایلان کی ایجاد کس نے کی؟" , "والیس کیئرز" , "والٹن کینٹ" , "لیٹن ریلی" ,"کلیئن مینٹ","والیس کیئرز"));
        arrayList.add(new ContentQuestionModel("ڈش واشر کی ایجاد کس نے کی؟" , "جیمز کرایہ" , "نایلان کی ایجاد کس نے کی؟" , "مریم وائرلپول" , "ویٹیالی زانوسی","نایلان کی ایجاد کس نے کی؟"));//36
        arrayList.add(new ContentQuestionModel("ہوور کرافٹ کی ایجاد کس نے کی؟" , "ایڈورڈ کوکریل" , "لیان مٹیرینڈ" , "جیمز ہوور" , "کرسٹوفر کوکریل","کرسٹوفر کوکریل"));
        arrayList.add(new ContentQuestionModel("کرسمس کارڈ کس نے ایجاد کیا؟" , "جیمز لیٹن" , "سر مائیکل کول" , "سر ہنری کول" , "پیٹر ٹول","سر ہنری کول"));
        arrayList.add(new ContentQuestionModel("ریوالور کس نے ایجاد کیا؟" , "این کالٹ" , "سیموئل کولٹ" , "ہنریک ہیور" , "سیموئیل کولٹ","سیموئل کولٹ"));//39
        arrayList.add(new ContentQuestionModel("الیکٹرک چولہا کس نے ایجاد کیا؟", "لائیڈ کوپ لینڈ" , "لیوٹ کلنٹ" , "ڈیوڈ فریٹ" , "لائیڈ گرف کوپیمین","لائیڈ گرف کوپیمین"));
        arrayList.add(new ContentQuestionModel("پیانو کی ایجاد کس نے کی؟" , "انجیلو فیریٹو" , "بارٹولومیو کرسٹوفوری", "ڈیوڈ شمٹ" , "جینجینڈ کلنٹ","بارٹولومیو کرسٹوفوری"));
        arrayList.add(new ContentQuestionModel("بھاپ سے چلنے والی پہلی سڑک والی گاڑی کس نے ایجاد کی؟" ,"نکولس-جوزف کیگناٹ" , "نیکولاس-جوزف کیگنٹ" , "نکولس-جوزف سائٹروین" , "جوزف سیٹ" ,"نیکولاس-جوزف کیگنٹ"));//42
        arrayList.add(new ContentQuestionModel("پہلا مصنوعی ریفریجریٹر کس نے ایجاد کیا؟", "بلیک ملر" , "مرانڈا جربر" , "ولیم کولن" , "لیگو جونوس","ولیم کولن"));
        arrayList.add(new ContentQuestionModel("1284 میں چشمہ ایجاد کرنے کا کم سے کم کس نے ایجاد کیا یا اس کا سہرا لیا گیا؟" , "لیونارڈو ڈ ونچی" , "سالوینو ڈی آرمٹ" , "گلین کرٹیس" , "کرارڈینو ڈی آسکانیو","سالوینو ڈی آرمٹ"));
        arrayList.add(new ContentQuestionModel("تھری ڈی ہولوگرافی کس نے ایجاد کی؟", "لی ڈیفورسٹ" ,"واسیلی ڈگٹیاریف" , "آکینفی ڈیمیڈوف" , "یوری نیکولاویچ ڈینسیوک","یوری نیکولاویچ ڈینسیوک"));
        arrayList.add(new ContentQuestionModel("تھرموس فلاسک کس نے ایجاد کیا؟" , "چارلس تھرموس" , "جیمز دیور" , "الیگزینڈر ڈیانن" , "اکنفی ڈیمیڈوف","جیمز دیور"));
        arrayList.add(new ContentQuestionModel("سیلنگ فین اور الیکٹرک سلائی مشین کس نے ایجاد کی؟" , "روالڈ ڈری" , "جیمز ہوور" , "فلپ سوئینڈل" , "فلپ ڈیہل","فلپ ڈیہل"));
        arrayList.add(new ContentQuestionModel("ڈیزل انجن کس نے ایجاد کیا؟" , "فرانکوئس پٹرولیم", "روڈولف بینز" ,"وین ڈیزل" , "روڈولف ڈیزل","روڈولف ڈیزل"));
        arrayList.add(new ContentQuestionModel("ڈولبی شور کم کرنے والے نظام کی ایجاد کس نے کی؟" , "ٹموتھی لووی" , "بنسوتھر بوس" , "رے ڈولبی" , "رے بان","رے ڈولبی"));
        arrayList.add(new ContentQuestionModel("انکشافی نشست کس نے ایجاد کی؟" , "ولیم ایچ ڈوبل","لی ڈیفورسٹ" , "ولیم کینڈی لوری ڈیکسن" , "انستاسی ڈریگومیر","انستاسی ڈریگومیر"));



        return arrayList;


    }


}