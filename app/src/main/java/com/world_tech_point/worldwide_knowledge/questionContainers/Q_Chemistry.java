package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_Chemistry {

    private Context context;
    public Q_Chemistry(Context context) {
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
        arrayList.add(new ThreeItemModel("The purest form of iron is____\n\nA) wrought iron \t\t\t\tB) steel\nC) pig iron \t\t\t\t\t\t\t\t\t\tD) nickel steel\n", "A) wrought iron"));
        arrayList.add(new ThreeItemModel("Hydrogen bomb is based on the principle of ", "nuclear fusion"));
        String str = "D) Option 4";
        arrayList.add(new ThreeItemModel("Among the following the maximum covalent character is shown by the compound\n\n(1)MgCl2\n(2)FeCl2\n(3)SnCl2\n(4) AlCl3\n\nA) Option 1\t\tB) Option 2\nC) Option 3\t\tD) Option 4", str));
        arrayList.add(new ThreeItemModel("Which of the following is a non metal that remains liquid at room temperature  ?\n\nA) Chlorine\t\tB) Phosphorous\nC) Bromine\t\tD) Helium\n", "C) Bromine"));
        arrayList.add(new ThreeItemModel("Brass gets discoloured in air because of the presence of which of the following gases in air  ?\nA) Hydrogen sulphide\t\tB) Oxygen\nC) Nitrogen\t\tD) Carbon dioxide\n", "A) Hydrogen sulphide"));
        arrayList.add(new ThreeItemModel("Which one of the following is not a mixture\n\nA) air\t\tB) mercury\nC) milk\t\tD) cement\n", "B) mercury"));
        arrayList.add(new ThreeItemModel("Among the given nutrients, milk is a poor source of\n\nA) Calcium\t\tB) Protein\nC) Vitamin C\t\tD) Carbohydrates\n", "C) Vitamin C"));
      arrayList.add(new ThreeItemModel("Electron configuration of cobalt 2+?", "The s,p,d,f configuration for cobalt (Co) is 1s22s22p63s23p64s23d7, determined by the position of the element on the periodic table. The electron configuration for Cobalt at ground state would simply be Co: [Ar] 4s23d7."));
        arrayList.add(new ThreeItemModel("Which one of the following elements is essential for construction is nuclear reactors", "Zirconium"));
        arrayList.add(new ThreeItemModel("How many electrons are there in Na+\n\nA) 1\t\tB) 10\nC) 11\t\tD) 12", "B) 10"));
        arrayList.add(new ThreeItemModel("' Misch metal ' is widely used in manufacture of which of the following", "Cigarette lighters"));
        arrayList.add(new ThreeItemModel("A radioactive substance has a half life of four months, three-fourth of the substance would decay in", " 8 months"));
        arrayList.add(new ThreeItemModel("The isotopes of chlorine with mass number 35 and 37 exist in the ratio of", "3:1"));
        arrayList.add(new ThreeItemModel("Is C2 Paramagnetic or Diamagnetic?", "Diamagnetic"));
        arrayList.add(new ThreeItemModel("What is the oxidation number of sulfur in H2S?\n\nA) 2\t\tB) -2\nC) 1\t\tD) -1", "B) -2"));
        arrayList.add(new ThreeItemModel("Boron cannot form which one of the following anions?", "BF3−6"));
        arrayList.add(new ThreeItemModel("SI unit of equivalent conductance", "Siemens m2/equivalent"));
        arrayList.add(new ThreeItemModel("Name the Scientist who stated that matter can be converted into energy", "Einstein"));
        arrayList.add(new ThreeItemModel("When formaldehyde and potassium hydroxide are heated , we get ", "Methyl alcohol"));
        arrayList.add(new ThreeItemModel("A ‘breath test’ used by traffic police to check drunken driving uses ____?", "Potassium dichromatic-sulphuric acid"));
        arrayList.add(new ThreeItemModel("The enzyme that converts glucose to ethyl alcohol is", "Zymase"));
        arrayList.add(new ThreeItemModel("Cobalt - 60 is commonly used in radiation therapy because it emits", "gamma rays"));
        arrayList.add(new ThreeItemModel("' Yellow cake ' an item of smuggling across border s", "Uranium oxide"));
        arrayList.add(new ThreeItemModel("A mixture of sand and naphthalene can be separated by", "Sublimation"));
        arrayList.add(new ThreeItemModel("The M.K.S. system was first introduced by", "Giorgi"));
        arrayList.add(new ThreeItemModel("Which one of the following substances does not have a melting point", "glass"));
        arrayList.add(new ThreeItemModel("Sodium carbonate crystal lose water molecules this property is called", "efflorescence"));
        arrayList.add(new ThreeItemModel("What is the third most common gas found in the air we breathe ?", "Argon"));
        arrayList.add(new ThreeItemModel("Silver Mirror test is given by which one of the following compounds?\n\n1. Benzophenone\n\n2. Acetaldehyde\n\n3. Acetone\n\n4. Formaldehyde", "2 and 4"));
        arrayList.add(new ThreeItemModel("The absolute value of charge on electron was determined by\n\nA) J.J.Thomson\tB) R.A. Millikan\nC) Rutherford\tD) Chadwick", "B) R.A. Millikan"));
        arrayList.add(new ThreeItemModel("Which one of the following mixture is homogeneous", "methanol and water"));
        arrayList.add(new ThreeItemModel("The discovery of neutron became very late because", "it does not carry any charge"));
        arrayList.add(new ThreeItemModel("The entropy change involved in the isothermal reversible expansion of 2 moles of an ideal gas from a volume of 10 dm3 at 27°C is to a volume of 100 dm3", "38.3 J/ mole / K"));


        arrayList.add(new ThreeItemModel("What is the element present in urea", "C,O,N,H"));
        arrayList.add(new ThreeItemModel("Which one is not metal", "all of these"));
        arrayList.add(new ThreeItemModel("The electrochemical cell stops working after some time because ________", "Electrode potential of both electrodes equalizes"));
        arrayList.add(new ThreeItemModel("Temporary hardness is due to the presence of ", "calcium bicarbonate"));
        arrayList.add(new ThreeItemModel("The reduction potential of hydrogen half-cell will be negative if :\n\n(1) P(H2)= 2 atm and [H+] = 2.0 M\n(2) P(H2)= 1 atm and [H+] = 2.0 M\n(3) P(H2)= 1 atm and [H+] = 1.0 M\n(4) P(H2)= 2 atm and [H+] = 1.0 M\n\nA) Option 1\t\tB) Option 2\nC) Option 3\t\tD) Option 4", str));
        arrayList.add(new ThreeItemModel("Which one of the following elements is the poorest conductor of heat\n\nA) sodium\t\tB) lead\nC) zinc\t\tD) mercury", "B) lead"));
        arrayList.add(new ThreeItemModel("In nuclear reactor,Chain reaction is controlled by introducing", "cadmium rod"));
        arrayList.add(new ThreeItemModel("In known elements, the maximum number is of", "Metals"));
        arrayList.add(new ThreeItemModel("The credit for the discovery of transuranic element goes to", "Seaborg"));
        arrayList.add(new ThreeItemModel("Ethanol is converted into ethoxy ethane,", "by heating excess of ethanol with conc. H2SO4 at 140°C"));
        arrayList.add(new ThreeItemModel("Which one among the following is the heaviest\n\nA) 1 mole of water molecules \nB) 1 mole of ammonia molecules\nC) 1 mole of sodium atoms\nD) 1 mole of hydrogen molecules\n", "C) 1 mole of sodium atoms"));

        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
         arrayList.add(new ThreeItemModel("সোডিয়াম কার্বনেট স্ফটিক হারিয়ে যায় জলের অণুগুলিকে এই সম্পত্তি বলা হয়", "ফুলে"));
        arrayList.add(new ThreeItemModel("আমরা নিঃশ্বাসিত বাতাসে তৃতীয় সর্বাধিক সাধারণ গ্যাস কোনটি?", "আর্গন"));
        arrayList.add(new ThreeItemModel("রৌপ্য মিরর পরীক্ষা নীচের কোন যৌগ দ্বারা দেওয়া হয় বেনজোফোনোন অ্যাসিটালডিহাইড  অ্যাসিটোন ফর্মালডিহাইড", "2 এবং 4"));
        arrayList.add(new ThreeItemModel("বৈদ্যুতিনের উপর চার্জের নিখুঁত মান নির্ধারণ করা হয়েছিল  A) জে.জে. থমসন  টিবি) আর.এ. মিলিকান এনসি) রাদারফোর্ড  টিডি) চ্যাডউইক", "বি) আর.এ. মিলিকান"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত মিশ্রণের মধ্যে কোনটি সমজাতীয়", "মিথেনল এবং জল"));
        arrayList.add(new ThreeItemModel("নিউট্রনের আবিষ্কার খুব দেরিতে হয়ে যায় কারণ", "এটি কোনও চার্জ বহন করে না"));
        arrayList.add(new ThreeItemModel("10 ডিএম 3 এর পরিমাণ 27 ডিগ্রি সেন্টিগ্রেড থেকে আদর্শ গ্যাসের 2 টি মোলের আইসোথার্মাল রিভার্সিবল প্রসারণের সাথে জড়িত এন্ট্রপি পরিবর্তনটি 100 ডিএম 3 এর আয়তনে হয়", "38.3 জে / মোল / কে"));
        arrayList.add(new ThreeItemModel("কোবাল্ট 2+ এর ইলেক্ট্রন কনফিগারেশন?", "কোবাল্ট (Co) এর জন্য s, p, d, f কনফিগারেশনটি 1s22s22p63s23p64s23d7, পর্যায় সারণীতে উপাদানটির অবস্থান দ্বারা নির্ধারিত হয় ground স্থল অবস্থায় কোবাল্টের জন্য বৈদ্যুতিন কনফিগারেশনটি কেবলমাত্র সহ কো: [আর] 4 এস 23 ডি 7। "));
        arrayList.add(new ThreeItemModel("নিম্নোক্ত উপাদানগুলির মধ্যে কোনটি নির্মাণের জন্য প্রয়োজনীয় তা হ'ল পারমাণবিক চুল্লিগুলি", "জিরকনিয়াম"));
        arrayList.add(new ThreeItemModel("Na তে কতটি ইলেক্ট্রন রয়েছে? +  A) 1 B) 10 C) 11  tD) 12", "B) 10" ));
        arrayList.add(new ThreeItemModel("'দুর্বৃত্ত ধাতু' নীচের কোনটি তৈরিতে ব্যাপকভাবে ব্যবহৃত হয়", "সিগারেট লাইটার"));
        arrayList.add(new ThreeItemModel("একটি তেজস্ক্রিয় পদার্থের আয়ু চার মাস হয়, তিন ভাগের তিন ভাগ পদার্থ ক্ষয় হয়ে যায়", "8 মাস"));

        arrayList.add(new ThreeItemModel("লোহার সবচেয়ে শুদ্ধতম রূপ হল  রৌপ্য আয়রন ইস্পাত এনসি শূকর আয়রন নিকেল স্টিল "," এ) লোহা লোহা "));
        arrayList.add(new ThreeItemModel("হাইড্রোজেন বোমা", "পারমাণবিক ফিউশন এর নীতির উপর ভিত্তি করে তৈরি "));
        String str = "D) Option 4";
        arrayList.add(new ThreeItemModel("নিম্নোক্ত সর্বাধিক সম্মিলিত চরিত্রটি যৌগিক দ্বারা দেখানো হয়েছে   (1) এমজিসিএল  (2) FeCl2 (3) SnCl2  (4) AlCl3 A) বিকল্প 1tB ) বিকল্প 2 ) বিকল্প 3  বিকল্প 4 ", str));
        arrayList.add(new ThreeItemModel("নীচের কোনটি একটি অ ধাতব যা ঘরের তাপমাত্রায় তরল থেকে যায়?  ক্লোরিন    টিবি) ফসফরাস  এনসি) ব্রোমাইন  টিডি) হিলিয়াম ", "সি) ব্রোমাইন"));
        arrayList.add(new ThreeItemModel("পিতল বাতাসে নিম্নরূপ কোন গ্যাসের উপস্থিতির কারণে বাতাসে বর্ণহীন হয়ে যায়? হাইড্রোজেন সালফাইড  অক্সিজেন  এনসি) নাইট্রোজেন  টিডি) কার্বন ডাই অক্সাইড ", "এ) হাইড্রোজেন সালফাইড "));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি মিশ্রণ নয় A) বায়ু  পারদ  দুধ  সিমেন্ট ", "খ) পারদ"));
        arrayList.add(new ThreeItemModel("প্রদত্ত পুষ্টিগুলির মধ্যে, দুধ হ'ল  ক্যালসিয়াম  টিবি) প্রোটিন  এনসি) ভিটামিন সি  টি  টিডি) কার্বোহাইড্রেট ", "সি) ভিটামিন সি"));
        arrayList.add(new ThreeItemModel("বোরন নিম্নলিখিত কোন একটি অ্যানিয়ন গঠন করতে পারবেন না?", "বিএফ 3−6"));
        arrayList.add(new ThreeItemModel("সমমানের আচরণের এসআই ইউনিট", "সিমেন্স এম 2 / সমতুল্য"));
        arrayList.add(new ThreeItemModel("বিজ্ঞানীর নাম বলুন যিনি বলেছিলেন যে পদার্থকে শক্তিতে রূপান্তর করা যায়", "আইনস্টাইন"));
        arrayList.add(new ThreeItemModel("যখন ফর্মালডিহাইড এবং পটাসিয়াম হাইড্রোক্সাইড উত্তপ্ত হয়, তখন আমরা পাই", "মিথাইল অ্যালকোহল"));
        arrayList.add(new ThreeItemModel("মাতাল ড্রাইভিং চেক করতে ট্র্যাফিক পুলিশ ব্যবহৃত একটি শ্বাস পরীক্ষা ?", "পটাসিয়াম ডাইক্রোমেটিক-সালফিউরিক এসিড ব্যবহার করে"));
        arrayList.add(new ThreeItemModel("গ্লুকোজকে ইথাইল অ্যালকোহলে রূপান্তরিত করে এমন এনজাইম হ'ল", "জাইমেজ"));
        arrayList.add(new ThreeItemModel("কোবাল্ট - 60 সাধারণত বিকিরণ থেরাপিতে ব্যবহৃত হয় কারণ এটি নির্গত হয়", "গামা রশ্মি"));
        arrayList.add(new ThreeItemModel("'ইয়েলো কেক' সীমান্ত জুড়ে পাচারের একটি আইটেম", "ইউরেনিয়াম অক্সাইড"));
        arrayList.add(new ThreeItemModel("বালি এবং নেফথালিনের মিশ্রণটি পৃথক করা যায়", "পরমানন্দ"));
        arrayList.add(new ThreeItemModel("এম.কে.এস. সিস্টেম প্রথম চালু করেছিলেন", "জর্জি"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত পদার্থগুলির মধ্যে কোনটির গলনাঙ্ক নেই", "কাচ"));

        arrayList.add(new ThreeItemModel("35 এবং 37 এর ভর সংখ্যাযুক্ত ক্লোরিনের আইসোটোপগুলি", "3: 1 অনুপাতের মধ্যে বিদ্যমান"));
        arrayList.add(new ThreeItemModel("সি 2 প্যারাম্যাগনেটিক বা ডায়াম্যাগনেটিক?", "ডায়াম্যাগনেটিক"));
        arrayList.add(new ThreeItemModel("এইচ 2 এস-তে সালফারের জারণ সংখ্যা কত? A) 2 B) -2 C) 1 D) -1", "বি) -2"));
        arrayList.add(new ThreeItemModel("ইউরিয়ায় উপস্থিত উপাদানটি কী", "সি, ও, এন, এইচ"));
        arrayList.add(new ThreeItemModel("কোনটি ধাতব নয়", "এই সবগুলি"));
        arrayList.add(new ThreeItemModel("ইলেক্ট্রোকেমিক্যাল সেল কিছু সময়ের পরে কাজ করা বন্ধ করে দেয় কারণ ________", "উভয় ইলেক্ট্রোডের ইলেক্ট্রোড সম্ভাবনা সমান"));
        arrayList.add(new ThreeItemModel("সাময়িক কঠোরতা", "ক্যালসিয়াম বাইকার্বোনেট এর উপস্থিতির কারণে হয়"));
        arrayList.add(new ThreeItemModel("হাইড্রোজেন অর্ধকোষের হ্রাস সম্ভাবনা নেতিবাচক হবে যদি: (1) পি (এইচ 2) = 2 এটিএম এবং [এইচ +] = 2.0 এম  (2) পি (এইচ 2) = 1 এটিএম এবং [এইচ + ] = 2.0 এম  (3) পি (এইচ 2) = 1 এটিএম এবং [এইচ +] = 1.0 এম  (4) পি (এইচ 2) = 2 এটিএম এবং [এইচ +] = 1.0 এম A) বিকল্প 1 B) বিকল্প 2 C) বিকল্প 3 D) বিকল্প 4 ", str));
        arrayList.add(new ThreeItemModel("নিম্নলিখিত উপাদানগুলির মধ্যে কোনটি তাপের দরিদ্রতম কন্ডাক্টর A) সোডিয়াম B) সীসা C) দস্তা D) পারদ", "খ) সীসা"));
        arrayList.add(new ThreeItemModel("পারমাণবিক চুল্লিতে, চেইন বিক্রিয়া", "ক্যাডমিয়াম রড প্রবর্তন করে নিয়ন্ত্রণ করা হয়"));
        arrayList.add(new ThreeItemModel("পরিচিত উপাদানগুলিতে, সর্বাধিক সংখ্যা", "ধাতব"));
        arrayList.add(new ThreeItemModel("ট্রান্সআরানিক উপাদান আবিষ্কারের কৃতিত্ব", "সিবার্গ এ যায়"));
        arrayList.add(new ThreeItemModel("ইথানলকে ইথোকোল ইথেনে রূপান্তরিত করা হয়,", "সংক্ষিপ্ত পরিমাণে ইথানলের অতিরিক্ত গরম করে H 140 ডিগ্রি সেন্টিগ্রেডে H2SO4"));
        arrayList.add(new ThreeItemModel("নিম্নলিখিতগুলির মধ্যে কোনটি ভারীতম A) জলের অণুগুলির 1 তিল B) অ্যামোনিয়া অণুগুলির 1 তিল C) সোডিয়াম পরমাণুর 1 মোল D) হাইড্রোজেন অণুগুলির 1 তিল ", "সি) সোডিয়াম পরমাণুর 1 তিল "));

        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("मेथनॉल और पानी"," में से कौन सा मिश्रण सजातीय है "));
        arrayList.add(new ThreeItemModel("न्यूट्रॉन की खोज बहुत देर से हुई क्योंकि", "यह कोई शुल्क नहीं लेता है"));
        arrayList.add(new ThreeItemModel("27 डिग्री सेल्सियस पर 10 डीएम 3 की मात्रा से एक आदर्श गैस के 2 मोल के आइसोथर्मल प्रतिवर्ती विस्तार में शामिल एन्ट्रापी परिवर्तन 100 डीएम 3 की मात्रा के लिए है", "38.3 जे / मोल / के"));
        arrayList.add(new ThreeItemModel("कोबाल्ट का इलेक्ट्रॉन विन्यास 2+?", "कोबाल्ट (Co) के लिए s, p, d, f विन्यास 1s22s22p63s23p64s23d7 है, जो आवर्त सारणी पर तत्व की स्थिति से निर्धारित होता है। जमीनी अवस्था में कोबाल्ट के लिए इलेक्ट्रॉन विन्यास सरलता से होगा। Co: [Ar] 4s23d7"));
        arrayList.add(new ThreeItemModel("निम्नलिखित तत्वों में से कौन सा निर्माण परमाणु रिएक्टरों के लिए आवश्यक है", "ज़िरकोनियम"));
        arrayList.add(new ThreeItemModel("Na + में कितने इलेक्ट्रान हैं)B) 10 11 D) 12", "B) 10"));
        arrayList.add(new ThreeItemModel("मिस्च मेटल 'का व्यापक रूप से निम्न में से किसके निर्माण में उपयोग किया जाता है", "सिगरेट लाइटर"));
        arrayList.add(new ThreeItemModel("एक रेडियोधर्मी पदार्थ में चार महीने का आधा जीवन होता है, तीन-चौथाई पदार्थ में क्षय होगा", "8 महीने"));
        arrayList.add(new ThreeItemModel("बड़े पैमाने पर 35 और 37 के साथ क्लोरीन के समस्थानिक मौजूद हैं", "3: 1"));
        arrayList.add(new ThreeItemModel("C2 पैरामैग्नेटिक या डायमैगनेटिक है?", "डायमैग्नेटिक"));

        arrayList.add(new ThreeItemModel("लोहे का शुद्ध रूप  है) लोहे  B) स्टील ) पिग आयरन  निकल स्टील  "," ए) गढ़ा लोहा "));
        arrayList.add(new ThreeItemModel("हाइड्रोजन बम", "परमाणु संलयन के सिद्धांत पर आधारित है"));
        String str = "D) Option 4";
        arrayList.add(new ThreeItemModel("निम्नलिखित में से अधिकतम सहसंयोजक वर्ण यौगिक (1) MgCl2 (2) FeCl2  (3) SnCl2 (4) AlCl3 विकल्प 1 B द्वारा दिखाया गया है।  विकल्प 2  विकल्प 3 D) विकल्प 4 ", str));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन एक गैर धातु है जो कमरे के तापमान पर तरल रहता है? a) क्लोरीन B) फॉस्फोरस  ब्रोमीन D) हीलियम ", "C ब्रोमिन "));
        arrayList.add(new ThreeItemModel("हवा में निम्न गैसों में से किसकी उपस्थिति के कारण पीतल हवा में विघटित हो जाता है?  N) हाइड्रोजन सल्फाइड B) ऑक्सीजन ) नाइट्रोजन D) कार्बन डाइऑक्साइड ", "A) Hydrogen sulphide"));
        arrayList.add(new ThreeItemModel("निम्नलिखित में से कौन सा मिश्रण नहीं है ) वायु B) पारा ) दूध D) सीमेंट ", "B) पारा"));
        arrayList.add(new ThreeItemModel("दिए गए पोषक तत्वों में दूध  का एक खराब स्रोत है) कैल्शियम B) प्रोटीन ) विटामिन C D) कार्बोहाइड्रेट ", "C) विटामिन C"));
        arrayList.add(new ThreeItemModel("बोरॉन निम्नलिखित में से कौन सा आयन नहीं बना सकता है?", "BF3 6"));
        arrayList.add(new ThreeItemModel("बराबर आचरण की एसआई इकाई", "सीमेंस एम 2 / समकक्ष"));
        arrayList.add(new ThreeItemModel("उस वैज्ञानिक का नाम बताइए जिसने इस बात को ऊर्जा में परिवर्तित किया", "आइंस्टीन"));
        arrayList.add(new ThreeItemModel("जब फॉर्मेल्डिहाइड और पोटेशियम हाइड्रॉक्साइड गर्म होते हैं, तो हमें मिलता है", "मिथाइल अल्कोहल"));
        arrayList.add(new ThreeItemModel("ट्रैफिक पुलिस द्वारा ड्रंक ड्राइविंग उपयोगों की जांच के लिए ए dr सांस परीक्षण का उपयोग किया जाता है? "," पोटेशियम डाइक्रोमैटिक-सल्फ्यूरिक एसिड "));
        arrayList.add(new ThreeItemModel("एंजाइम जो ग्लूकोज को एथिल अल्कोहल में परिवर्तित करता है", "ज़ाइमेज़"));
        arrayList.add(new ThreeItemModel("कोबाल्ट - 60 आमतौर पर विकिरण चिकित्सा में उपयोग किया जाता है क्योंकि यह निकलता है", "गामा किरणें"));
        arrayList.add(new ThreeItemModel("येलो केक 'बॉर्डर पार तस्करी की वस्तु", "यूरेनियम ऑक्साइड"));
        arrayList.add(new ThreeItemModel("रेत और नेफ़थलीन का मिश्रण", "उच्च बनाने की क्रिया द्वारा अलग किया जा सकता है"));
        arrayList.add(new ThreeItemModel("एम.के.एस. प्रणाली को सबसे पहले", "जियोर्गी द्वारा शुरू किया गया था"));
        arrayList.add(new ThreeItemModel("सोडियम कार्बोनेट क्रिस्टल पानी के अणुओं को खो देते हैं, जिसे यह गुण कहा जाता है", "अपक्षरण"));
        arrayList.add(new ThreeItemModel("आर्गन"," हम हवा में पाई जाने वाली तीसरी सबसे आम गैस है? "));
        arrayList.add(new ThreeItemModel("सिल्वर मिरर टेस्ट निम्न में से किस यौगिक द्वारा दिया जाता है? 1। बेंजोफेनोन 2। एसिटाल्डिहाइड 3। एसीटोन 4। फॉर्मेल्डिहाइड", "2 और 4"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रॉन पर आवेश का पूर्ण मान  द्वारा निर्धारित किया गया था। जे। जे। थॉमसन B) आर.ए. मिलिकन C) रदरफोर्ड D) चाडविक", "बी) आर.ए. मिलिकन"));

        arrayList.add(new ThreeItemModel("H2S में सल्फर का ऑक्सीकरण संख्या क्या है? ) 2 B) -2 C) D) -1", "B) -2"));
        arrayList.add(new ThreeItemModel("यूरिया में मौजूद तत्व क्या है", "C, O, N, H"));
        arrayList.add(new ThreeItemModel("कौन सा धातु नहीं है", "ये सभी"));
        arrayList.add(new ThreeItemModel("इलेक्ट्रोकेमिकल सेल कुछ समय बाद काम करना बंद कर देता है क्योंकि ________", "दोनों इलेक्ट्रोड की इलेक्ट्रोड क्षमता बराबर होती है"));
        arrayList.add(new ThreeItemModel("अस्थाई कठोरता"," कैल्शियम बाइकार्बोनेट की उपस्थिति के कारण है"));
        arrayList.add(new ThreeItemModel("हाइड्रोजन आधा-सेल की कमी की क्षमता नकारात्मक होगी यदि:  (1) P (H2) = 2 atm और [H +] = 2.0 M (2) P (H2) = 1 atm और [H +] ] = 2.0 M  (3) P (H2) = 1 एटीएम और [H +] = 1.0 M (4) P (H2) = 2 एटीएम और [H +] = 1.0 M ) विकल्प 1 B) विकल्प 2 ) विकल्प 3 D) विकल्प 4 ", str));
        arrayList.add(new ThreeItemModel("निम्नलिखित तत्वों में से कौन सा तत्व गर्मी का सबसे खराब संचालक है ) सोडियम B) सीसा ) जिंक D) पारा", "B) लेड"));
        arrayList.add(new ThreeItemModel("परमाणु रिएक्टर में, चेन रिएक्शन को शुरू करके नियंत्रित किया जाता है", "कैडमियम रॉड"));
        arrayList.add(new ThreeItemModel("ज्ञात तत्वों में, अधिकतम संख्या", "धातु की है"));
        arrayList.add(new ThreeItemModel("ट्रांसजेनिक तत्व की खोज का श्रेय", "सीबोर्ग को जाता है"));
        arrayList.add(new ThreeItemModel("इथेनॉल को इथेनॉल में बदल दिया जाता है, "," कंघी के साथ इथेनॉल की अधिकता से गर्म करके। एच 2 एसओ 4 को 1 डिग्री सेल्सियस पर।"));
        arrayList.add(new ThreeItemModel("निम्न में से कौन सबसे भारी  है) 1 मोल पानी के अणु ) 1 अमोनिया के अणु C) सोडियम के 1 मोल परमाणु ) हाइड्रोजन अणुओं के 1 मोल", "C) सोडियम परमाणुओं का 1 मोल "));

        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("لوہے کی خالص ترین شکل ________ ہے) لوہا B) اسٹیل سی) سور آئرن ڈی) نکل اسٹیل" , "A) لوہا لوہے"));
        arrayList.add(new ThreeItemModel("ہائیڈروجن بم اس اصول پر مبنی ہے", "جوہری انشقاق"));
        String str = "D) Option 4";
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں زیادہ سے زیادہ ہم آہنگی والے کردار کو کمپاؤنڈ (1) ایم جی سی ایل 2 (2) FeCl2 (3) SnCl2 (4) AlCl3A) آپشن 1 B) آپشن 2 C) آپشن 3 D) آپشن 4 کے ذریعہ دکھایا گیا ہے", str));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا غیر دھات ہے جو کمرے کے درجہ حرارت پر مائع رہتا ہے؟ ا) کلورین بی) فاسفورس سی) برومین ڈی) ہیلیم" , "سی) برومین"));
        arrayList.add(new ThreeItemModel("پیتل ہوا میں مندرجہ ذیل میں سے کون سی گیسوں کی موجودگی کی وجہ سے ہوا میں رنگین ہو جاتا ہے؟ A) ہائیڈروجن سلفائیڈ B) آکسیجن سی) نائٹروجن ڈی) کاربن ڈائی آکسائیڈ" , "A) ہائیڈروجن سلفیڈ"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا مرکب نہیں ہے A) ہوا B) پارا C) دودھ D) سیمنٹ" , "B) پارا"));
        arrayList.add(new ThreeItemModel("دیئے گئے غذائی اجزاء میں ، دودھ A) کیلشیم بی) پروٹین سی) وٹامن سی ڈی) کاربوہائیڈریٹ" , "C) وٹامن سی"));
        arrayList.add(new ThreeItemModel("بورون مندرجہ ذیل میں سے کون سی anion تشکیل نہیں دے سکتا؟" , "BF3−6"));
        arrayList.add(new ThreeItemModel("مساوی طرز عمل کی ایس آئی یونٹ" , "سیمنز ایم 2 / برابر"));
        arrayList.add(new ThreeItemModel("سائنسدان کا نام بتائیں جس نے بتایا کہ مادہ کو توانائی میں تبدیل کیا جاسکتا ہے" , "آئن اسٹائن"));
        arrayList.add(new ThreeItemModel("جب فاریلڈہائڈ اور پوٹاشیم ہائیڈرو آکسائیڈ گرم ہوجاتا ہے تو ، ہمیں" , "میتھل الکحل" ));
        arrayList.add(new ThreeItemModel("جب فاریلڈہائڈ اور پوٹاشیم ہائیڈرو آکسائیڈ گرم ہوجاتا ہے تو ، ہمیں" , "میتھل الکحل"));
        arrayList.add(new ThreeItemModel("وہ انزائم جو گلوکوز کو ایتھیل الکحل میں تبدیل کرتا ہے ، وہ ہے" , "زیمز"));
        arrayList.add(new ThreeItemModel("کوبالٹ - 60 عام طور پر تابکاری تھراپی میں استعمال ہوتا ہے کیونکہ اس سے اخراج ہوتا ہے", "گاما کرنوں"));
        arrayList.add(new ThreeItemModel(" پیلے رنگ کا کیک سرحد کے اس پار اسمگلنگ کا ایک آئٹم "," یورینیم آکسائڈ "));
        arrayList.add(new ThreeItemModel("ریت اور نیفتلین کے مرکب کو الگ کیا جاسکتا ہے" , "سربلندی"));
        arrayList.add(new ThreeItemModel("ایم کے ایس سسٹم سب سے پہلے" ," کے ذریعہ متعارف کرایا گیا تھا"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا مادہ پگھلنے والا نقطہ نہیں رکھتا ہے" , "شیشہ"));
        arrayList.add(new ThreeItemModel("سوڈیم کاربونیٹ کرسٹل کھوئے ہوئے پانی کے انووں سے اس پراپرٹی کو" , " کہا جاتا ہے۔ "));
        arrayList.add(new ThreeItemModel("ہم جو ہوا میں سانس لیتے ہیں اس میں تیسرا عام گیس کون سی ہے؟" , "ارگون"));
        arrayList.add(new ThreeItemModel("سلور مرر ٹیسٹ مندرجہ ذیل مرکبات میں سے کسی کے ذریعہ دیا جاتا ہے؟ 1 بینزوفینون 2 ایکٹیلڈہائڈ 3 ایسیٹون 4 فارملڈہائڈ" , "2 اور 4"));
        arrayList.add(new ThreeItemModel("الیکٹران پر معاوضے کی مطلق قیمت کا تعین A) جے جے ٹامسن B) آر اے ملیکا سی) رودر فورڈ ڈی) چاڈوک" , "B) R.A. Millikan"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا مرکب یکساں ہے" , "میتھانول اور پانی"));
        arrayList.add(new ThreeItemModel("نیوٹران کی دریافت بہت دیر سے ہوگئی کیونکہ" , "اس میں کوئی معاوضہ نہیں ہے۔"));
        arrayList.add(new ThreeItemModel("10 ڈیم 3 کی مقدار سے 27 ڈگری سینٹی گریڈ تک ایک مثالی گیس کے 2 موروں کی آئوسوترمل الٹ اسبل توسیع میں شامل انٹروپی تبدیلی 100 dm3 کے حجم میں ہے" , "38.3 J / مول / K"));
        arrayList.add(new ThreeItemModel("کوبالٹ 2+ کی الیکٹران کنفیگریشن؟" , "کوبالٹ (Co) کے لئے s، p، d، f کنفگریشن 1s22s22p63s23p64s23d7 ہے جو متواتر ٹیبل پر عنصر کی پوزیشن کے ذریعہ طے ہوتا ہے۔ زمینی حالت میں کوبالٹ کے لئے الیکٹران کی تشکیل بس ہوگی be Co: [Ar] 4s23d7. "));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا عنصر تعمیر کے لئے ضروری ہے جوہری ری ایکٹر ہے" , "زرکونیم"));
        arrayList.add(new ThreeItemModel("Na + A) 1 B) 10 C) 11 D) 12 میں کتنے الیکٹران ہیں؟", "B) 10"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کسی کی تیاری میں مسچ دھات بڑے پیمانے پر استعمال ہوتی ہے", "سگریٹ لائٹر"));
        arrayList.add(new ThreeItemModel("ایک تابکار مادے کی چار ماہ کی نصف زندگی ہوتی ہے ، تین چوتھائی مادہ کشی ہوجاتا ہے" , "8 ماہ"));
        arrayList.add(new ThreeItemModel("بڑے پیمانے پر نمبر 35 اور 37 کے ساتھ کلورین کے آاسوٹوپس موجود ہیں", "3:1"));
        arrayList.add(new ThreeItemModel("کیا سی 2 پیراماگنیٹک ہے یا ڈایگمینیٹک؟" , "تشخیصی"));
        arrayList.add(new ThreeItemModel("H2S میں سلفر کی آکسیکرن کی تعداد کتنی ہے؟ A) 2 B) -2 C) 1 D) -1" , "B) -2"));
        arrayList.add(new ThreeItemModel("یوریا میں کون سا عنصر موجود ہے" , "C، O، N، H"));
        arrayList.add(new ThreeItemModel("کون سا دھات نہیں ہے" , "یہ سب"));
        arrayList.add(new ThreeItemModel("الیکٹرو کیمیکل سیل کچھ عرصے کے بعد کام کرنا چھوڑ دیتا ہے کیونکہ ________" , "دونوں الیکٹروڈ کی الیکٹروڈ صلاحیت برابر ہوجاتی ہے"));
        arrayList.add(new ThreeItemModel("ہائیڈروجن آدھے سیل میں کمی کی صلاحیت منفی ہوگی اگر (1) P (H2) = 2 atm اور [H +] = 2.0 M (2) P (H2) = 1 atm اور [H +] = 2.0 M (3) P (H2) = 1 atm اور [H +] = 1.0 M (4) P (H2) = 2 atm اور [H +] = 1.0 MA) آپشن 1 B) آپشن 2 C) آپشن 3 D) آپشن 4 ", str));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل عناصر میں سے کون سا گرمی A) کا غریب ترین کنڈکٹر ہے A) سوڈیم B) لیڈ سی) زنک D) پارا" , "B) سیسہ"));
        arrayList.add(new ThreeItemModel("ایٹمی ری ایکٹر میں ، سلسلہ ردعمل متعارف کروا کر کنٹرول کیا جاتا ہے", "کیڈیمیم چھڑی"));
        arrayList.add(new ThreeItemModel("معلوم عناصر میں ، زیادہ سے زیادہ تعداد" , "دھاتیں" ));
        arrayList.add(new ThreeItemModel("ٹرانزورنک عنصر کی دریافت کا سہرا جاتا ہے", "سیبرگ"));
        arrayList.add(new ThreeItemModel("ایتھنول اتینال میں تبدیل ہوجاتا ہے ،", "ایتھنول کی زیادتی کو حرارت سے گرم کرکے۔ H2SO4 140 ° C پر"));
        arrayList.add(new ThreeItemModel("مندرجہ ذیل میں سے کون سا سب سے بھاری A) پانی کے انووں کا 1 تل B) امونیا انو کا 1 تل سی) سوڈیم ایٹموں کا 1 تل D) ہائیڈروجن انووں کا 1 تل" , "C) سوڈیم ایٹموں کا 1 تل"));


        return arrayList;
    }


}
