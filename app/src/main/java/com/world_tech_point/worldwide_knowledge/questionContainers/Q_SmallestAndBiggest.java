package com.world_tech_point.worldwide_knowledge.questionContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.work_places.short_question.ThreeItemModel;

import java.util.ArrayList;
import java.util.List;

public class Q_SmallestAndBiggest {


    private Context context;
    public Q_SmallestAndBiggest(Context context) {
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
       arrayList.add(new ThreeItemModel("Biggest Palace", "The Vatican"));
        arrayList.add(new ThreeItemModel("Biggest Planet", "Venus"));
        arrayList.add(new ThreeItemModel("Brightest Star", "Sirius A"));
        arrayList.add(new ThreeItemModel("Biggest Telescope", "Mt. Palomar (USA)"));
        arrayList.add(new ThreeItemModel("Biggest Park", "Yellow Stone National Park"));
        arrayList.add(new ThreeItemModel("Biggest Ocean", "Pacific Ocean"));
        arrayList.add(new ThreeItemModel("Biggest desert", "Shara(South Africa)"));
        arrayList.add(new ThreeItemModel("Biggest lizard", "Kombo Dragons"));
        arrayList.add(new ThreeItemModel("Biggest reptile", "Saltwater Crocodile"));
        arrayList.add(new ThreeItemModel("Biggest Eggs", "Ostrich Eggs"));
        arrayList.add(new ThreeItemModel("Biggest bird", "African Ostrich"));
        arrayList.add(new ThreeItemModel("Biggest hotel", "Conral Hilton"));
        arrayList.add(new ThreeItemModel("Biggest water fall", "Guaira - Brazil"));
        arrayList.add(new ThreeItemModel("Biggest football stadium", "Marakana - Brazil"));
        arrayList.add(new ThreeItemModel("Biggest island", "GreenLand"));
        arrayList.add(new ThreeItemModel("Largest continent", "Asia"));
        arrayList.add(new ThreeItemModel("Largest ocean", "Pacific"));
        arrayList.add(new ThreeItemModel("Largest river", "Amazon"));
        arrayList.add(new ThreeItemModel("Largest river basin", "Amazon "));
        arrayList.add(new ThreeItemModel("Largest lake (salt water)", "Caspian sea"));
        arrayList.add(new ThreeItemModel("Largest lake (fresh water)", "Lake Superior (North America)"));
        arrayList.add(new ThreeItemModel("Largest artificial lake", "Lake Mead at Hoover Dam, (USA). Originally known as Boulder.."));
        arrayList.add(new ThreeItemModel("Largest bay", "Hudson Bay (North Canada)"));
        arrayList.add(new ThreeItemModel("Largest gulf", "Gulf of Mexico"));
        arrayList.add(new ThreeItemModel("Largest gorge", "Grand Canyon (USA)"));
        arrayList.add(new ThreeItemModel("Largest sea", "South China sea"));
        arrayList.add(new ThreeItemModel("Largest delta", "Sundarbans (India & Bangladesh)"));
        arrayList.add(new ThreeItemModel("Largest peninsula", "Arabia"));
        arrayList.add(new ThreeItemModel("Largest country (in area)", "Russia"));

        arrayList.add(new ThreeItemModel("Highest Lake", "Titicaca"));
        arrayList.add(new ThreeItemModel("Highest Mountain", "Range Himalaya"));
        arrayList.add(new ThreeItemModel("Highest Mountain Peak", "Mount Everest"));
        arrayList.add(new ThreeItemModel("Highest Waterfall", "Angel Falls"));
        arrayList.add(new ThreeItemModel("Highest Point", "Mount Everest"));
        arrayList.add(new ThreeItemModel("Plateau with highest Elevation", "Tibetan Plateau"));
        arrayList.add(new ThreeItemModel("Tallest Animal", "Giraffe"));
        arrayList.add(new ThreeItemModel("Tallest Tree", "Redwood"));
        arrayList.add(new ThreeItemModel("Tallest Building", "Burj Al-Khalifa"));
        arrayList.add(new ThreeItemModel("Highest Volcano", "Ojos del Salado, (Argentina) Chile"));
        arrayList.add(new ThreeItemModel("Which one is the deepest lake in the world", "Lake Baikal"));
        arrayList.add(new ThreeItemModel("Which one is the deepest river in the world", "The Congo River"));
        arrayList.add(new ThreeItemModel("Which one is the deepest Ocean in the world", "Pacific Ocean"));
        arrayList.add(new ThreeItemModel("Which is the deepest area in the Ocean", "Mariana Trench"));
        arrayList.add(new ThreeItemModel("Which one is the deepest artificial point on Earth", "The Kola Superdeep Borehoe SG-3"));
        arrayList.add(new ThreeItemModel("Deepest Gorge ", "Hells Canyon, Snake River, Idaho (7,900 feet deep)"));
        arrayList.add(new ThreeItemModel("Deepest Underwater Trench", "Mariana Trench"));
        arrayList.add(new ThreeItemModel("Biggest Cinema House", "Roxy, New York"));
        arrayList.add(new ThreeItemModel("Biggest Dome", "Gol Gumbaz (Bijapur), India"));
        arrayList.add(new ThreeItemModel("Biggest Library", "National Kiev Library, Moscow and Library of the Congress, Washington"));
        arrayList.add(new ThreeItemModel("Biggest Museum", "British Museum (London)"));

        arrayList.add(new ThreeItemModel("Largest country (in population)", "China"));
        arrayList.add(new ThreeItemModel("Largest temple", "Angkorwat (Cambodia)"));
        arrayList.add(new ThreeItemModel("Largest archipelago", "Indonesia"));
        arrayList.add(new ThreeItemModel("Largest airport", "King Khalid International Airport at Riyadh (Saudi Arabia)"));
        arrayList.add(new ThreeItemModel("Largest church", "St.Peter's Basilica, (Rome)"));
        arrayList.add(new ThreeItemModel("Largest mosque", "Sha Faisal Mosque (Islamabad)"));
        arrayList.add(new ThreeItemModel("Largest embassy", "Russian Embassy (Beijing)"));
        arrayList.add(new ThreeItemModel("Largest war plane", "Mirage (France)"));
        arrayList.add(new ThreeItemModel("Largest prison", "Kharkov (Russia)"));
        arrayList.add(new ThreeItemModel("Largest hotel", "MGM Grand Hotel and Casino, Las Vegas (USA)"));
        arrayList.add(new ThreeItemModel("Largest forest", "Coniferous Forests of Northern Russia"));
        arrayList.add(new ThreeItemModel("Largest stadium", "trahove(Czech Republic)"));
        arrayList.add(new ThreeItemModel("Largest library", "United States Library of Congress"));
        arrayList.add(new ThreeItemModel("Largest animal", "Blue whale"));
        arrayList.add(new ThreeItemModel("Largest land animal", "TheAfrican Bush Elephant"));
        arrayList.add(new ThreeItemModel("Largest town", "Mt. Isa (Queensland)"));
        arrayList.add(new ThreeItemModel("Largest palace", "Imperial Palace, Beijing"));
        arrayList.add(new ThreeItemModel("Largest park", "Wood Buffalo National Park (Canada)"));
        arrayList.add(new ThreeItemModel("Largest zoo", "Krugal National Park (South Africa)"));
        arrayList.add(new ThreeItemModel("Largest river island", "Majuli (Assam)"));
        arrayList.add(new ThreeItemModel("Longest river", "Nile (Egypt)"));
        arrayList.add(new ThreeItemModel("Longest road", "Pan American Highway"));
        arrayList.add(new ThreeItemModel("Longest railway platform", "Kharagpur, (West Bengal)"));
        arrayList.add(new ThreeItemModel("Longest dam", "Hirakud (Orissa)"));
        arrayList.add(new ThreeItemModel("Longest mountain range", "Andes (South America)"));
        arrayList.add(new ThreeItemModel("Longest railway tunnel", "Seikan Rail Tunnel (Japan)"));
        arrayList.add(new ThreeItemModel("Longest railway line", "Trans-Siberian railway (Russia)"));
        arrayList.add(new ThreeItemModel("Longest ship canal", "Suez Canal"));
        arrayList.add(new ThreeItemModel("Longest estuary", "Obeestuary (Russia)"));
        arrayList.add(new ThreeItemModel("Longest road tunnel", "St. Gothard road Tunnel (Switzerland)"));
        arrayList.add(new ThreeItemModel("Longest bridge", "Second Lake Pontchar- train Causeway"));
        arrayList.add(new ThreeItemModel("Longest fresh water lake", "Lake Tanganyika"));
        arrayList.add(new ThreeItemModel("Longest wall", "Great Wall of China"));
        arrayList.add(new ThreeItemModel("Longest non-stop train", "Flying Scotsman"));
        arrayList.add(new ThreeItemModel("Longest drought", "Atacama Desert (North Chile)"));
        arrayList.add(new ThreeItemModel("Longest snake", "Python"));
        arrayList.add(new ThreeItemModel("Longest dictionary", "Oxford English Dictionary"));
        arrayList.add(new ThreeItemModel("Longest Airport", "Dallas (USA)"));
        arrayList.add(new ThreeItemModel("Longest Railway Bridge", "Lower Zambezi (Africa)"));
        arrayList.add(new ThreeItemModel("Longest Throughfare", "Broadway (New York)"));
        arrayList.add(new ThreeItemModel("Longest Shipping Canal", "Baltic White Sea Canal"));
        arrayList.add(new ThreeItemModel("Longest day", "43637"));
        arrayList.add(new ThreeItemModel("Longest Beach", "Rio de Janerio (Brazil)"));
        arrayList.add(new ThreeItemModel("Longest Corridor", "Rameswaram Temple (India)"));
        arrayList.add(new ThreeItemModel("Longest Railway Line Trans", "Siberian Railway"));
        arrayList.add(new ThreeItemModel("Longest Swimming Canal", "English Canal"));
        arrayList.add(new ThreeItemModel("Longest non-stop train", "Flying Scotsman"));
        arrayList.add(new ThreeItemModel("Smallest Country", "Vatican City Size: 0.17 sq. mi. (0.44 km²)Rome, Italy -Europe"));
        arrayList.add(new ThreeItemModel("Smallest Continent", "Australia,312,2000 square miles"));
        arrayList.add(new ThreeItemModel("Shortest River", "The Roe, Montana, US, 200 feet long"));
        arrayList.add(new ThreeItemModel("Smallest Ocean", "Arctic Ocean, 5,427,000 square miles"));
        arrayList.add(new ThreeItemModel("Lowest Lake", "The Dead Sea, Israel-Jordan, surface of water 1,349 feet below sea"));
        arrayList.add(new ThreeItemModel("The lowest mountain range", "Buena Bhaile."));
        arrayList.add(new ThreeItemModel("Lowest Point on land", "The Dead Sea, Israel-Jordan, water surface 1,349 feet"));


        return arrayList;
    }

    private List<ThreeItemModel> bengali() {

        List<ThreeItemModel> arrayList = new ArrayList();
      arrayList.add(new ThreeItemModel("বৃহত্তম নদীর অববাহিকা", "অ্যামাজন"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম হ্রদ (নুনের জল)", "ক্যাস্পিয়ান সমুদ্র"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম হ্রদ (টাটকা জল)", "লেকের সুপিরিয়র (উত্তর আমেরিকা)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম কৃত্রিম হ্রদ", "হুভার ড্যামে লেকের মাড, (মার্কিন যুক্তরাষ্ট্র)। মূলত বোল্ডার নামে পরিচিত" ));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম বে", "হাডসন বে (উত্তর কানাডা)"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম উপসাগর", "মেক্সিকো উপসাগর"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ঘাট", "গ্র্যান্ড ক্যানিয়ন (মার্কিন যুক্তরাষ্ট্র)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম সমুদ্র", "দক্ষিণ চীন সমুদ্র"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ব-দ্বীপ", "সুন্দরবন (ভারত ও বাংলাদেশ)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম উপদ্বীপ", "আরব"));
        arrayList.add(new ThreeItemModel("বৃহত্তম দেশ (অঞ্চলে)", "রাশিয়া"));
        arrayList.add(new ThreeItemModel("বৃহত্তম দেশ (অঞ্চলে)", "রাশিয়া"));
        arrayList.add(new ThreeItemModel("বৃহত্তম মন্দির", "অ্যাংকোরওয়াত (কম্বোডিয়া)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম দ্বীপপুঞ্জ", "ইন্দোনেশিয়া"));
        arrayList.add(new ThreeItemModel("বৃহত্তম বিমানবন্দর", "রিয়াদে কিং খালিদ আন্তর্জাতিক বিমানবন্দর (সৌদি আরব)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম গির্জা", "সেন্ট পিটারের বেসিলিকা, (রোম)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম মসজিদ", "শা ফয়সাল মসজিদ (ইসলামাবাদ)"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চতম লেক", "টিটিকাচা"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চতম পর্বত", "রেঞ্জ হিমালয়"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চ পর্বতশৃঙ্গ", "এভারেস্ট"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চ জলপ্রপাত", "অ্যাঞ্জেল জলপ্রপাত"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চ পয়েন্ট", "মাউন্ট এভারেস্ট"));
        arrayList.add(new ThreeItemModel("সর্বোচ্চ উচ্চতা সহ মালভূমি", "তিব্বতি মালভূমি"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম প্রাণী", "জিরাফ"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম গাছ", "রেডউড"));
        arrayList.add(new ThreeItemModel("'বোল্ডিং লাচ",  "বুরজ খলিফা "));
        arrayList.add(new ThreeItemModel("সর্বোচ্চতম আগ্নেয়গিরি", "ওজোস দেল সালাদো, (আর্জেন্টিনা) চিলি"));
        arrayList.add(new ThreeItemModel("পৃথিবীর গভীরতম হ্রদ কোনটি", "বাইকাল লেক"));
        arrayList.add(new ThreeItemModel("পৃথিবীর গভীরতম নদী কোনটি", "কঙ্গো নদী"));
        arrayList.add(new ThreeItemModel("পৃথিবীর গভীরতম মহাসাগর কোনটি", "প্রশান্ত মহাসাগর"));
        arrayList.add(new ThreeItemModel("মহাসাগরের গভীরতম অঞ্চল", "মেরিয়ানা ট্রেঞ্চ"));
        arrayList.add(new ThreeItemModel("পৃথিবীর গভীরতম কৃত্রিম বিন্দু কোনটি", "দ্য কোলা সুপারদীপ বোরেহো এসজি -3"));
        arrayList.add(new ThreeItemModel("সবচেয়ে গভীর গর্জন", "হেলস ক্যানিয়ন, স্নেক রিভার, আইডাহো (7,900 ফুট গভীর)"));
        arrayList.add(new ThreeItemModel("গভীরতম আন্ডারওয়াটার ট্রেঞ্চ", "মারিয়ানা ট্রেঞ্চ"));
        arrayList.add(new ThreeItemModel("বৃহত্তম সিনেমা ঘর", "রক্সি, নিউ ইয়র্ক"));
        arrayList.add(new ThreeItemModel("বৃহত্তম গম্বুজ", "গোল গুমবাজ (বিজাপুর), ভারত"));
        arrayList.add(new ThreeItemModel("বৃহত্তম লাইব্রেরি", "জাতীয় কিয়েব গ্রন্থাগার, মস্কো এবং কংগ্রেসের লাইব্রেরি, ওয়াশিংটন"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম যাদুঘর", "ব্রিটিশ যাদুঘর (লন্ডন)"));
        arrayList.add(new ThreeItemModel("সবচেয়ে বড় প্রাসাদ", "দ্য ভ্যাটিকান"));
        arrayList.add(new ThreeItemModel("বৃহত্তম প্ল্যানেট", "শুক্র"));
        arrayList.add(new ThreeItemModel("উজ্জ্বল তারা", "সিরিয়াস এ"));
        arrayList.add(new ThreeItemModel("বৃহত্তম টেলিস্কোপ", "মাউন্ট পালোমার (মার্কিন যুক্তরাষ্ট্র)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম পার্ক", "হলুদ পাথর জাতীয় উদ্যান"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম মহাসাগর", "প্রশান্ত মহাসাগর"));
        arrayList.add(new ThreeItemModel("বৃহত্তম মরুভূমি", "শারা (দক্ষিণ আফ্রিকা)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম টিকটিকি", "কম্বো ড্রাগন"));
        arrayList.add(new ThreeItemModel("বৃহত্তম সরীসৃপ", "লবণাক্ত জলের কুমির"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ডিম", "অস্ট্রিচ ডিম"));
        arrayList.add(new ThreeItemModel("বৃহত্তম পাখি", "আফ্রিকান অস্ট্রিচ"));
        arrayList.add(new ThreeItemModel("বৃহত্তম হোটেল", "কনারাল হিল্টন"));
        arrayList.add(new ThreeItemModel("বৃহত্তম পানির পতন", "গুয়েরা - ব্রাজিল"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ফুটবল স্টেডিয়াম", "মারাকানা - ব্রাজিল"));
        arrayList.add(new ThreeItemModel("বৃহত্তম দ্বীপ", "গ্রিনল্যান্ড"));
        arrayList.add(new ThreeItemModel("বৃহত্তম মহাদেশ", "এশিয়া"));
        arrayList.add(new ThreeItemModel("বৃহত্তম সমুদ্র", "প্রশান্ত মহাসাগর"));
        arrayList.add(new ThreeItemModel("বৃহত্তম নদী", "অ্যামাজন"));


        arrayList.add(new ThreeItemModel("বৃহত্তম দূতাবাস", "রাশিয়ান দূতাবাস (বেইজিং)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম যুদ্ধ বিমান", "মেরাজ (ফ্রান্স)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম কারাগার", "খারকভ (রাশিয়া)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম হোটেল", "এমজিএম গ্র্যান্ড হোটেল এবং ক্যাসিনো, লাস ভেগাস (মার্কিন যুক্তরাষ্ট্র)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম বন", "উত্তর রাশিয়ার শত্রু বন"));
        arrayList.add(new ThreeItemModel("বৃহত্তম বন  উত্তর রাশিয়ার শত্রু বনLargest stadium", "trahove(Czech Republic)"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম গ্রন্থাগার", "মার্কিন যুক্তরাষ্ট্রের কংগ্রেস লাইব্রেরি"));
        arrayList.add(new ThreeItemModel("Largest animal", "Blue whale"));
        arrayList.add(new ThreeItemModel("বৃহত্তম ভূমির প্রাণী", "দ্য আফ্রিকান বুশ হাতি"));
        arrayList.add(new ThreeItemModel("বৃহত্তম শহর", "মাউন্ট ইসা (কুইন্সল্যান্ড)"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম প্রাসাদ", "ইম্পেরিয়াল প্রাসাদ, বেইজিং"));
        arrayList.add(new ThreeItemModel("বৃহত্তম পার্ক", "উড বাফেলো জাতীয় উদ্যান (কানাডা)"));
        arrayList.add(new ThreeItemModel("বৃহত্তমতম চিড়িয়াখানা", "ক্রুগাল জাতীয় উদ্যান (দক্ষিণ আফ্রিকা)"));
        arrayList.add(new ThreeItemModel("বৃহত্তম নদীর দ্বীপ", "মাজুলি (আসাম)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম নদী", "নীল (মিশর)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রাস্তা", "প্যান আমেরিকান হাইওয়ে"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রেলওয়ে প্ল্যাটফর্ম", "খড়গপুর, (পশ্চিমবঙ্গ)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম বাঁধ", "হিরাকুদ (উড়িষ্যা)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম পর্বতমালা", "অ্যান্ডিস (দক্ষিণ আমেরিকা)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রেলওয়ে টানেল", "সিকান রেল টানেল (জাপান)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রেলপথ", "ট্রান্স-সাইবেরিয়ান রেলপথ (রাশিয়া)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম শিপ খাল", "সুয়েজ খাল"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম মোহনা", "ওবিস্টুরি (রাশিয়া)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রোড টানেল", "সেন্ট গথার্ড রোড টানেল (সুইজারল্যান্ড)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম সেতু", "দ্বিতীয় লেকের পন্টচার-ট্রেন কোজওয়ে"));
        arrayList.add(new ThreeItemModel("Longest fresh water lake", "Lake Tanganyika"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম প্রাচীর", "চীনের গ্রেট ওয়াল"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম নন-স্টপ ট্রেন", "ফ্লাইং স্কটসম্যান"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম খরা", "আতাকামা মরুভূমি (উত্তর চিলি)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম সাপ", "পাইথন"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম অভিধান", "অক্সফোর্ড ইংরেজি অভিধান"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম বিমানবন্দর", "ডালাস (মার্কিন যুক্তরাষ্ট্র)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রেলওয়ে ব্রিজ", "লোয়ার জামবেজি (আফ্রিকা)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম থ্রোফের", "ব্রডওয়ে (নিউ ইয়র্ক)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম শিপিং খাল", "বাল্টিক হোয়াইট সাগর খাল"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম দিন", "43637"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম সৈকত", "রিও ডি জেনেরিও (ব্রাজিল)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম করিডোর", "রামেশ্বরম মন্দির (ভারত)"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম রেলওয়ে লাইন ট্রান্স", "সাইবেরিয়ান রেলপথ"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম সাঁতার খাল", "ইংলিশ খাল"));
        arrayList.add(new ThreeItemModel("দীর্ঘতম নন-স্টপ ট্রেন", "ফ্লাইং স্কটসম্যান"));
        arrayList.add(new ThreeItemModel("ক্ষুদ্রতম দেশ", "ভ্যাটিকান শহরের আকার: 0.17 বর্গ মাইল (0.44 কিমি) রোম, ইতালি-ইউরোপ"));
        arrayList.add(new ThreeItemModel("ক্ষুদ্রতম মহাদেশ", "অস্ট্রেলিয়া, 312,2000 বর্গমাইল"));
        arrayList.add(new ThreeItemModel("সবচেয়ে সংক্ষিপ্ত নদী", "দ্য রো, মন্টানা, মার্কিন যুক্তরাষ্ট্র, 200 ফুট দীর্ঘ"));
        arrayList.add(new ThreeItemModel("Smallest Ocean", "Arctic Ocean, 5,427,000 square miles"));
        arrayList.add(new ThreeItemModel("নিম্নতম হ্রদ", "মৃত সমুদ্র, ইস্রায়েল-জর্ডান, সমুদ্রের নীচে ১,34৩৯ ফুট পানির পৃষ্ঠ"));
        arrayList.add(new ThreeItemModel("সর্বনিম্ন পর্বতমালা", "বুয়েনা ভাইলে।"));
        arrayList.add(new ThreeItemModel("জমির সর্বনিম্ন পয়েন্ট", "মৃত সমুদ্র, ইস্রায়েল-জর্ডান, জলের পৃষ্ঠ 1,349 ফুট"));


        return arrayList;
    }

    private List<ThreeItemModel> hindi() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("सबसे ऊंची झील", "टिटिकाका"));
        arrayList.add(new ThreeItemModel("सबसे ऊंचा पर्वत", "रेंज हिमालय"));
        arrayList.add(new ThreeItemModel("सबसे ऊंची पर्वत चोटी", "माउंट एवरेस्ट"));
        arrayList.add(new ThreeItemModel("उच्चतम जलप्रपात", "एंजल जलप्रपात"));
        arrayList.add(new ThreeItemModel("उच्चतम बिंदु", "माउंट एवरेस्ट"));
        arrayList.add(new ThreeItemModel("उच्चतम ऊंचाई वाला पठार", "तिब्बती पठार"));
        arrayList.add(new ThreeItemModel("सबसे लंबा जानवर", "जिराफ़"));
        arrayList.add(new ThreeItemModel("टालस्ट ट्री", "रेडवुड"));
        arrayList.add(new ThreeItemModel("बोल्डिंग लैच", "खलीफा टॉवर"));
        arrayList.add(new ThreeItemModel("उच्चतम ज्वालामुखी", "ओजोस डेल सालाडो, (अर्जेंटीना) चिली"));
        arrayList.add(new ThreeItemModel("कौन सी दुनिया की सबसे गहरी झील है", "झील बैकाल"));
        arrayList.add(new ThreeItemModel("दुनिया की सबसे गहरी नदी कौन सी है", "द कांगो नदी"));
        arrayList.add(new ThreeItemModel("विश्व का सबसे गहरा महासागर कौन सा है", "प्रशांत महासागर"));
        arrayList.add(new ThreeItemModel("महासागर में सबसे गहरा क्षेत्र कौन सा है", "मारियाना ट्रेंच"));
        arrayList.add(new ThreeItemModel("कौन सा पृथ्वी पर सबसे गहरा कृत्रिम बिंदु है", "कोला सुपरदीप बोरहो एसजी 3"));
        arrayList.add(new ThreeItemModel("डीपेस्ट गॉर्ज", "हेल्स कैनियन, स्नेक रिवर, इडाहो (7,900 फीट गहरा)"));
        arrayList.add(new ThreeItemModel("डीपेस्ट गॉर्ज हेल्स कैनियन, स्नेक रिवर, इडाहो (7,900 फीट गहरा)Deepest Underwater Trench " , "Mariana Trench"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा सिनेमा घर", "रॉक्सी, न्यूयॉर्क"));
        arrayList.add(new ThreeItemModel("Biggest Dome", "Gol Gumbaz (Bijapur), India"));
        arrayList.add(new ThreeItemModel("Biggest Library", "National Kiev Library, Moscow and Library of the Congress, Washington"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा संग्रहालय", "ब्रिटिश संग्रहालय (लंदन)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा महल", "द वैटिकन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा ग्रह", "शुक्र"));
        arrayList.add(new ThreeItemModel("ब्राइटेस्ट स्टार", "सीरियस ए"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा टेलीस्कोप", "माउंट पालोमर (यूएसए)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पार्क", "येलो स्टोन नेशनल पार्क"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा महासागर", "प्रशांत महासागर"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा रेगिस्तान", "शर (दक्षिण अफ्रीका)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी छिपकली", "कोम्बो ड्रेगन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा सरीसृप", "खारे पानी का मगरमच्छ"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा अंडा", "शुतुरमुर्ग के अंडे"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पक्षी", "अफ्रीकी शुतुरमुर्ग"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा होटल", "कोनराल हिल्टन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पानी गिर", "गुएरा - ब्राजील"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा फुटबॉल स्टेडियम", "मरकाना - ब्राजील"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा द्वीप", "ग्रीनलैंड"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा महाद्वीप", "एशिया"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा महाद्वीप", "एशिया"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी नदी", "अमेज़न"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी नदी बेसिन", "अमेज़ॅन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी झील (खारे पानी)", "कैस्पियन सागर"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी झील (ताजा पानी)", "लेक सुपीरियर (उत्तरी अमेरिका)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी कृत्रिम झील", "हूवर डैम में झील मीड, (यूएसए)। मूल रूप से बोल्डर के रूप में जाना जाता है।"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा खाड़ी", "हडसन बे (उत्तरी कनाडा)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा खाड़ी", "मेक्सिको की खाड़ी"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा कण्ठ", "ग्रैंड कैनियन (यूएसए)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा डेल्टा", "सुंदरबन (भारत और बांग्लादेश)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा प्रायद्वीप", "अरब"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा देश (क्षेत्र में)", "रूस"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा देश (जनसंख्या में)", "चीन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा मंदिर", "अंगकोरवाट (कंबोडिया)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा द्वीपसमूह", "इंडोनेशिया"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा हवाई अड्डा", "किंग खालिद इंटरनेशनल एयरपोर्ट रियाद (सऊदी अरब)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा चर्च", "सेंटपिटर्स बेसिलिका, (रोम)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी मस्जिद", "शा फैसल मस्जिद (इस्लामाबाद)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा दूतावास", "रूसी दूतावास (बीजिंग)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा युद्ध विमान", "मिराज (फ्रांस)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी जेल", "खार्कोव (रूस)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा होटल", "एमजीएम ग्रांड होटल और कैसीनो, लास वेगास (यूएसए)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा जंगल", "उत्तरी रूस के शंकुधारी वन"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा स्टेडियम", "ट्रैवोव (चेक गणराज्य)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पुस्तकालय", "कांग्रेस का संयुक्त राज्य पुस्तकालय"));
        arrayList.add(new ThreeItemModel("Largest animal", "Blue whale"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा जानवर", "ब्लू व्हेल"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा शहर", "माउंट ईसा (क्वींसलैंड)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा महल", "इंपीरियल पैलेस, बीजिंग"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा पार्क", "वुड बफेलो नेशनल पार्क (कनाडा)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ा चिड़ियाघर", "क्रुगल नेशनल पार्क (दक्षिण अफ्रीका)"));
        arrayList.add(new ThreeItemModel("सबसे बड़ी नदी द्वीप", "माजुली (असम)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी नदी", "नील (मिस्र)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी सड़क", "पैन अमेरिकन हाईवे"));
        arrayList.add(new ThreeItemModel("सबसे लंबा रेलवे प्लेटफॉर्म", "खड़गपुर, (पश्चिम बंगाल)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा बांध", "हीराकुंड (उड़ीसा)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी पर्वत श्रृंखला", "एंडीज (दक्षिण अमेरिका)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी रेलवे सुरंग", "सिकन रेल सुरंग (जापान)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी रेलवे लाइन", "ट्रांस-साइबेरियन रेलवे (रूस)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी जहाज नहर", "स्वेज़ नहर"));
        arrayList.add(new ThreeItemModel("सबसे लंबे समय तक मुहाना", "ओबेस्ट्यूशेर (रूस)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी सड़क सुरंग", "सेंट गॉथर्ड रोड टनल (स्विट्जरलैंड)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा पुल", "दूसरा लेक पोंचर- ट्रेन सेतु"));
        arrayList.add(new ThreeItemModel("सबसे लंबी ताज़ी पानी की झील", "तांगानिका झील"));
        arrayList.add(new ThreeItemModel("सबसे लंबी दीवार", "चीन की महान दीवार"));
        arrayList.add(new ThreeItemModel("सबसे लंबी नॉन-स्टॉप ट्रेन", "फ्लाइंग स्कॉट्समैन"));
        arrayList.add(new ThreeItemModel("सबसे लंबा सूखा", "अटाकामा रेगिस्तान (उत्तरी चिली)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा सांप", "पायथन"));
        arrayList.add(new ThreeItemModel("सबसे लंबा शब्दकोश", "ऑक्सफोर्ड इंग्लिश डिक्शनरी"));
        arrayList.add(new ThreeItemModel("सबसे लंबा हवाई अड्डा", "डलास (यूएसए)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा रेलवे ब्रिज", "लोअर ज़म्बेजी (अफ्रीका)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा रेलवे ब्रिज", "लोअर ज़म्बेजी (अफ्रीका)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी शिपिंग नहर", "बाल्टिक व्हाइट सी नहर"));
        arrayList.add(new ThreeItemModel("सबसे लंबा दिन", "43637"));
        arrayList.add(new ThreeItemModel("सबसे लंबा समुद्र तट", "रियो डी जेनेरियो (ब्राजील)"));
        arrayList.add(new ThreeItemModel("सबसे लंबा कॉरिडोर", "रामेश्वरम मंदिर (भारत)"));
        arrayList.add(new ThreeItemModel("सबसे लंबी रेलवे लाइन ट्रांस", "साइबेरियन रेलवे"));
        arrayList.add(new ThreeItemModel("सबसे लंबी तैराकी नहर", "अंग्रेजी नहर"));
        arrayList.add(new ThreeItemModel("Longest non-stop train", "Flying Scotsman"));
        arrayList.add(new ThreeItemModel("सबसे छोटा देश", "वेटिकन सिटी का आकार: 0.17 वर्ग मील। (0.44 किमी²) रोम, इटली -इरोपे"));
        arrayList.add(new ThreeItemModel("सबसे छोटा महाद्वीप", "ऑस्ट्रेलिया, 312,2000 वर्ग मील"));
        arrayList.add(new ThreeItemModel("सबसे छोटी नदी", "द रो, मोंटाना, यूएस, 200 फीट लंबी"));
        arrayList.add(new ThreeItemModel("सबसे छोटा महासागर", "आर्कटिक महासागर, 5,427,000 वर्ग मील"));
        arrayList.add(new ThreeItemModel("सबसे नीची झील", "द डेड सी, इज़राइल-जॉर्डन, समुद्र की 1,349 फीट नीचे पानी की सतह"));
        arrayList.add(new ThreeItemModel("सबसे कम पर्वत श्रृंखला", "बुएना भइले।"));
        arrayList.add(new ThreeItemModel("भूमि पर सबसे निचला बिंदु", "द डेड सी, इज़राइल-जॉर्डन, पानी की सतह 1,349 फीट"));


        return arrayList;
    }

    private List<ThreeItemModel> urdu() {

        List<ThreeItemModel> arrayList = new ArrayList();
        arrayList.add(new ThreeItemModel("بلند ترین جھیل" , "ٹائٹیکا"));
        arrayList.add(new ThreeItemModel("بلند ترین پہاڑ" , "حد درجہ ہمالیہ"));
        arrayList.add(new ThreeItemModel("بلند ترین پہاڑی چوٹی" , "ماؤنٹ ایورسٹ"));
        arrayList.add(new ThreeItemModel("اعلی ترین آبشار" , "فرشتہ آبشار"));
        arrayList.add(new ThreeItemModel("اعلی ترین نقطہ" , "ماؤنٹ ایورسٹ"));
        arrayList.add(new ThreeItemModel("اعلی ترین نقطہ" , "ماؤنٹ ایورسٹ"));
        arrayList.add(new ThreeItemModel("قد آور جانور" , "جراف"));
        arrayList.add(new ThreeItemModel("قد آور درخت" , "ریڈ ووڈ"));
        arrayList.add(new ThreeItemModel(" خلیفہ ٹاور","بولڈنگ لیچ"));
        arrayList.add(new ThreeItemModel("اعلی ترین آتش فشاں" , "اوجوس ڈیل سلادو ، (ارجنٹائن) چلی"));
        arrayList.add(new ThreeItemModel("دنیا کی سب سے گہری جھیل کون سا ہے" , "جھیل بیکال"));
        arrayList.add(new ThreeItemModel("کون سا ایک دنیا کا سب سے گہرا دریا ہے" , "کانگو دریائے"));
        arrayList.add(new ThreeItemModel("دنیا کا سب سے گہرا بحر کون سا ہے؟", "بحر اوقیانوس"));
        arrayList.add(new ThreeItemModel("بحر ہند کا سب سے گہرا علاقہ کون سا ہے" , "ماریانا کھائی"));
        arrayList.add(new ThreeItemModel("کون سا کون سا زمین کا سب سے گہرا مصنوعی نقطہ ہے" , "کولا سوپردیپ بورہوے SG-3"));
        arrayList.add(new ThreeItemModel("سب سے گھاٹی" , "ہیلس وادی ، سانپ ندی ، اڈاہو (7،900 فٹ گہرائی)"));
        arrayList.add(new ThreeItemModel("پانی کے اندر سب سے گہری کھائی" , "ماریانا کھائی"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سنیما گھر" , "Roxy ، نیو یارک"));
        arrayList.add(new ThreeItemModel("سب سے بڑا گنبد" , "گول گمباز (بیجاپور) ، ہندوستان"));
        arrayList.add(new ThreeItemModel("سب سے بڑی لائبریری" , "نیشنل کیف لائبریری ، ماسکو اور لائبریری آف دی کانگریس ، واشنگٹن"));
        arrayList.add(new ThreeItemModel("سب سے بڑا میوزیم" , "برٹش میوزیم (لندن)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا محل" , "ویٹیکن"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سیارہ" , "وینس"));
        arrayList.add(new ThreeItemModel("روشن ترین ستارہ" , "سیریاس اے"));
        arrayList.add(new ThreeItemModel("سب سے بڑا دوربین" , "ماؤنٹ پالومر (USA)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا پارک" , "پیلا پتھر نیشنل پارک"));
        arrayList.add(new ThreeItemModel("سب سے بڑا اوقیانوس" , "بحر الکاہل"));
        arrayList.add(new ThreeItemModel("سب سے بڑا صحرا" , "شارا (جنوبی افریقہ)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا چھپکلی" , "کومبو ڈریگن"));
        arrayList.add(new ThreeItemModel("سب سے بڑا رینگنے والا جانور" , "نمکین مگرمچرچھ"));
        arrayList.add(new ThreeItemModel("سب سے بڑے انڈے" , "شوترمرگ انڈے"));
        arrayList.add(new ThreeItemModel("سب سے بڑا پرندہ" , "افریقی شوترمرگ"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ہوٹل" , "کونرل ہلٹن"));
        arrayList.add(new ThreeItemModel("پانی کا سب سے بڑا زوال" , "گویرا - برازیل"));
        arrayList.add(new ThreeItemModel("سب سے بڑا فٹ بال اسٹیڈیم" , "ماراکانا - برازیل"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جزیرہ" , "گرین لینڈ"));
        arrayList.add(new ThreeItemModel("سب سے بڑا براعظم" , "ایشیا"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سمندر" , "پیسیفک"));
        arrayList.add(new ThreeItemModel("سب سے بڑا دریا" , "ایمیزون"));
        arrayList.add(new ThreeItemModel("سب سے بڑا دریا بیسن" , "ایمیزون"));
        arrayList.add(new ThreeItemModel("سب سے بڑی جھیل (نمکین پانی)" , "کیسپین سمندر"));
        arrayList.add(new ThreeItemModel("سب سے بڑی جھیل (میٹھا پانی)" , "جھیل سپیریئر (شمالی امریکہ)"));
        arrayList.add(new ThreeItemModel("سب سے بڑی مصنوعی جھیل" , "ہوور ڈیم میں جھیل کا گوشت ، (امریکہ)۔ اصل میں بولڈر کے نام سے جانا جاتا ہے۔"));
        arrayList.add(new ThreeItemModel("سب سے بڑی خلیج" , "ہڈسن بے (شمالی کینیڈا)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا خلیج" , "خلیج میکسیکو"));
        arrayList.add(new ThreeItemModel("سب سے بڑی گھاٹی" , "گرینڈ وادی (USA)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سمندر" , "جنوبی چین کا سمندر"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ڈیلٹا" , "سندربن (ہندوستان اور بنگلہ دیش)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جزیرہ نما" , "عربیہ"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ملک (علاقہ میں)" , "روس"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ملک (آبادی میں)" , "چین"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ہیکل" , "انگकोरواٹ (کمبوڈیا)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جزیرہ نما" , "انڈونیشیا"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ہوائی اڈ "   , "شاہ خالد بین الاقوامی ہوائی اڈ Ri ریاض (سعودی عرب)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا چرچ" , "سینٹ پیٹر کی باسیلیکا ، (روم)"));
        arrayList.add(new ThreeItemModel("سب سے بڑی مسجد" , "شا فیصل مسجد (اسلام آباد)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا سفارت خانہ" , "روسی سفارت خانہ (بیجنگ)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جنگی طیارہ", "میرج (فرانس)"));
        arrayList.add(new ThreeItemModel("سب سے بڑی جیل" , "خارکوف (روس)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا ہوٹل" , "ایم جی ایم گرینڈ ہوٹل اور کیسینو ، لاس ویگاس (USA)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا جنگل" , "شمالی روس کا مخروط جنگلات"));
        arrayList.add(new ThreeItemModel("سب سے بڑا اسٹیڈیم" , "ٹراہو (جمہوریہ چیک)"));
        arrayList.add(new ThreeItemModel("سب سے بڑی لائبریری" , "ریاستہائے متحدہ کی لائبریری آف کانگریس"));
        arrayList.add(new ThreeItemModel("    سب سے بڑا جانور     بلیو وہیل Largest land animal", "دی افریکن بش ہاتھی"));
        arrayList.add(new ThreeItemModel("سب سے بڑا شہر" , "ماؤنٹ عیسیٰ (کوئینز لینڈ)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا محل" , "امپیریل پیلس ، بیجنگ"));
        arrayList.add(new ThreeItemModel("سب سے بڑا پارک" , "ووڈ بھینس نیشنل پارک (کینیڈا)"));
        arrayList.add(new ThreeItemModel("سب سے بڑا چڑیا گھر" , "کروگل نیشنل پارک (جنوبی افریقہ)"));
        arrayList.add(new ThreeItemModel("دریا کا سب سے بڑا جزیرہ" , "ماجولی (آسام)"));
        arrayList.add(new ThreeItemModel("سب سے طویل دریا" , "نیل (مصر)"));
        arrayList.add(new ThreeItemModel("سب سے طویل سڑک" , "پین امریکن ہائی وے"));
        arrayList.add(new ThreeItemModel("سب سے طویل ریلوے پلیٹ فارم" , "کھڑگ پور ، (مغربی بنگال)"));
        arrayList.add(new ThreeItemModel("سب سے طویل ڈیم","" ));
        arrayList.add(new ThreeItemModel("سب سے طویل پہاڑی سلسلے" , "اینڈیس (جنوبی امریکہ)"));
        arrayList.add(new ThreeItemModel("سب سے طویل ریلوے سرنگ" , "سیکن ریل سرنگ (جاپان)"));
        arrayList.add(new ThreeItemModel("سب سے طویل ریلوے لائن" , "ٹرانس سائبرین ریلوے (روس)"));
        arrayList.add(new ThreeItemModel("سب سے طویل جہاز کی نہر" , "سوئز نہر"));
        arrayList.add(new ThreeItemModel("اب تک کا سب سے طویل راستہ" , "آبروشی (روس)"));
        arrayList.add(new ThreeItemModel("سب سے طویل سڑک کی سرنگ" , "سینٹ گوتھرڈ روڈ سرنگ (سوئٹزرلینڈ)"));
        arrayList.add(new ThreeItemModel("سب سے طویل پل" , "دوسرا جھیل پونچر - ٹرین کازے"));
        arrayList.add(new ThreeItemModel("تازہ ترین تازہ پانی کی جھیل" , "جھیل تانگانیکا"));
        arrayList.add(new ThreeItemModel("سب سے طویل دیوار"  , "چین کی عظیم دیوار"));
        arrayList.add(new ThreeItemModel("سب سے طویل نان اسٹاپ ٹرین" , "فلائنگ اسکاٹسمین"));
        arrayList.add(new ThreeItemModel("سب سے طویل خشک سالی" , "صحر At اتاکما (شمالی چلی)"));
        arrayList.add(new ThreeItemModel("سب سے طویل سانپ" , "ازگر"));
        arrayList.add(new ThreeItemModel("طویل ترین لغت" ,"آکسفورڈ انگریزی ڈکشنری"));
        arrayList.add(new ThreeItemModel("سب سے طویل ہوائی اڈ Airportہ" ,"ڈلاس (USA)"));
        arrayList.add(new ThreeItemModel("سب سے طویل ریلوے برج" , "زیریں زامبیزی (افریقہ)"));
        arrayList.add(new ThreeItemModel("سب سے طویل وسعت" , "براڈوے (نیویارک)"));
        arrayList.add(new ThreeItemModel("طویل ترین جہاز رانی نہر", "بالٹک وائٹ سی کینال"));
        arrayList.add(new ThreeItemModel("سب سے طویل دن" , "43637"));
        arrayList.add(new ThreeItemModel("سب سے طویل بیچ" ,"ریو ڈی جنیرو (برازیل)"));
        arrayList.add(new ThreeItemModel("سب سے طویل راہداری" , "رامیسرم مندر (ہندوستان)"));
        arrayList.add(new ThreeItemModel("سب سے طویل ریلوے لائن ٹرانس", "سائبرین ریلوے"));
        arrayList.add(new ThreeItemModel("سب سے طویل تیراکی نہر" , "انگریزی کینال"));
        arrayList.add(new ThreeItemModel("سب سے طویل نان اسٹاپ ٹرین" , "فلائنگ اسکاٹسمین"));
        arrayList.add(new ThreeItemModel("سب سے چھوٹا ملک" , "ویٹیکن سٹی سائز: 0.17 مربع میل. (0.44 کلومیٹر) روم ، اٹلی-یورپ"));
        arrayList.add(new ThreeItemModel("سب سے چھوٹا براعظم" , "آسٹریلیا ، 312،2000 مربع میل"));
        arrayList.add(new ThreeItemModel("مختصر ترین دریا" , "دی رو ، مونٹانا ، امریکہ ، 200 فٹ لمبا"));
        arrayList.add(new ThreeItemModel("سب سے چھوٹا ساقیان" , "آرکٹک اوقیانوس ، 5،427،000 مربع میل"));
        arrayList.add(new ThreeItemModel("سب سے کم جھیل" , "بحیرہ مردار ، اسرائیل-اردن ، پانی کی سطح سمندر سے 1،349 فٹ نیچے ہے"));
        arrayList.add(new ThreeItemModel("سب سے کم پہاڑی سلسلے" , "بونا بھائیل۔"));
        arrayList.add(new ThreeItemModel("زمین پر سب سے کم مقام" ,"بحیرہ مردار ، اسرائیل-اردن ، پانی کی سطح 1،349 فٹ"));


        return arrayList;
    }



}
