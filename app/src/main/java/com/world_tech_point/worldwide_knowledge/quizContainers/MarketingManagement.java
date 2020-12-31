package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class MarketingManagement {
    private Context context;

    public MarketingManagement(Context context) {
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


        arrayList.add(new ContentQuestionModel("Good customer service is an extended arm of"," Service marketing","Indirect marketing","Process marketing","Web marketing"," Service marketing"));
        arrayList.add(new ContentQuestionModel("A company’s ability to perform in one or more ways that competitors cannot or will not match is known as its","Attribute competition","Brand positioning","Brand image","Competitive advantage","Competitive advantage"));
        arrayList.add(new ContentQuestionModel("An audio or video advertising announcement usually presented on television, radio or in a movie theater is called","Publicity","Sponsorship","Banner","Creative","Publicity"));
        arrayList.add(new ContentQuestionModel("Electrical goods such as TVs, videos, stereo systems etc., used for home entertainment are known as","Green Goods","Red Goods","Blue Goods","Brown Goods","Brown Goods"));
        arrayList.add(new ContentQuestionModel("A very large market segment or wide collection of smaller segment is called","Niche market","Meta market","Mass market","Multi-Level Market","Mass market"));
        arrayList.add(new ContentQuestionModel("Customer retention can be ensured by","Offering freebies","Offering loans at low rates","Giving incentives","Personalized services","Personalized services"));
        arrayList.add(new ContentQuestionModel("The target group for a car loan is","All persons owning a car","A family with more than 2 members","Car garages","Car designers","A family with more than 2 members"));
        arrayList.add(new ContentQuestionModel("Standard marketing practices include","Unhealthy competition","Poaching","Lowering the selling price","Unhealthy discount schemes","Lowering the selling price"));
        arrayList.add(new ContentQuestionModel("Market segmentation means dividing","The marketing teams into small groups","The employees as per their grades","The products, as per their life cycle","The market, as per the tastes and needs of different groups","The market, as per the tastes and needs of different groups"));
        arrayList.add(new ContentQuestionModel("The process of discovering patterns and relationships using the available customer data to reveal what customers want and how they act is known as","Data warehousing"," Data base","Data mining","Data building","Data mining"));
        arrayList.add(new ContentQuestionModel("Telemarketing means","Internet marketing","Door-to-door contacts","Sending and receiving SMS","Marketing through telephone calls","Marketing through telephone calls"));
        arrayList.add(new ContentQuestionModel("Motivating customers to buy upgraded products when they had intended to buy something of lower value is known as","Cross selling","Upselling","Forward selling","Channel marketing","Upselling"));
        arrayList.add(new ContentQuestionModel("The modern marketing concept asserts that ‘marketing’ starts with the product idea and ends with","Production of quality product","Advertisement campaign","Customer satisfaction","Sale of the product","Customer satisfaction"));

        arrayList.add(new ContentQuestionModel("Good competition helps in","Improved customer service","More market share","Improved brand image","Reduced sales","Improved customer service"));
        arrayList.add(new ContentQuestionModel("The systematic gathering, recording and analyzing of data with respect to a particular market is known as","Marketing research","Market share","Market segmentation","Marketing research","Marketing research"));
        arrayList.add(new ContentQuestionModel("The most common source for leads generation for any company is","Audit guidelines","House magazines","Yellow pages","Dictionary","Yellow pages"));
        arrayList.add(new ContentQuestionModel("Marketing is required in banks due to","Increase in population","Globalisation","Government dictates","Computerisation","Globalisation"));
        arrayList.add(new ContentQuestionModel("Marketing is","A day-to-day function","A one-off affair","A means to earn extra income","A collective process","A collective process"));
        arrayList.add(new ContentQuestionModel("Quality needed by a good marketing staff are","Pushy","Perseverance","Politeness","Only (3) and (4)","Only (3) and (4)"));
        arrayList.add(new ContentQuestionModel("Marketing should be resorted","Only among rich persons","Only in crowded areas","Only among the poor","Depends on the product","Depends on the product"));
        arrayList.add(new ContentQuestionModel("HNI means","High income individual","Honest marketing staff","High network individual","Honest Neutral Individual","High network individual"));
        arrayList.add(new ContentQuestionModel("Marketing strategies means","Plan for effective marketing","Type of marketing style","Market demands","All of these","All of these"));
        arrayList.add(new ContentQuestionModel("Market plan is","An action plan for day-to-day marketing","Effective selling steps","Effective buying steps","A comprehensive document for marketing strategies","A comprehensive document for marketing strategies"));
        arrayList.add(new ContentQuestionModel("The meaning of digital marketing is","All of these","Selling digital goods"," Selling through internet","Selling calculators"," Selling through internet"));
        arrayList.add(new ContentQuestionModel("Target group means","All employees","Short-listed group","All the marketing staff","Sales representatives","Group of people likely to buy the identified product"));
        arrayList.add(new ContentQuestionModel("The target group for Home Loans are","Salaried person","Businessman","Professionals","All of these","All of these"));

        arrayList.add(new ContentQuestionModel("A situation in which consumer purchases are unplanned is called","Latent demand","Impulse buying","Unwholesome buying","Irregular demand","Impulse buying"));
        arrayList.add(new ContentQuestionModel("EMI is a marketing tool if _______________","It is very high","It is very low","It is fluctuating","It is increasing","It is very low"));
        arrayList.add(new ContentQuestionModel("Which one of the following may be classified as FMCG?","Printing machines","Tobacco products","Coin vending machines","Industrial Goods","Tobacco products"));
        arrayList.add(new ContentQuestionModel("Buyer resistance in a sales deal can be overcome by means of","Confusing sales talk","IT jargons","Perseverance","Arguing skills","Arguing skills"));
        arrayList.add(new ContentQuestionModel("Best, important and the central activity of a business is known as its","Product line","Nuclear activity","Core competency","Mainstay","Core competency"));
        arrayList.add(new ContentQuestionModel("The target group for home loans is","Tiles manufactures","Housing societies","Farmers’ societies","Individuals not owning any house","Individuals not owning any house"));
        arrayList.add(new ContentQuestionModel("Delivery channels means","Sales outlets","Product shelf-life","Courier person","Channel finance","Sales outlets"));
        arrayList.add(new ContentQuestionModel("Using a customer’s buying history to select them for related offers is known as","Marketing","Prospecting","Channel selling","Cross selling","Cross selling"));
        arrayList.add(new ContentQuestionModel("The concept of selling is different from marketing and aims at profit maximization through","Increasing sales volume of quality products","Satisfaction of customer needs","Solution of customer problem","Customer satisfaction","Increasing sales volume of quality products"));
        arrayList.add(new ContentQuestionModel("The segmentation of markets based on the gender of the customer is a type of","Socio cultural segmentation","Psychographic segmentation","Geographic segmentation","Demographic segmentation","Demographic segmentation"));
        arrayList.add(new ContentQuestionModel("Mass communication with customers or potential customers, usually through paid public media is known as","Publicity","Sales promotion","Advertising","Public relations","Advertising"));
        arrayList.add(new ContentQuestionModel("A ‘Call’ means","An internet terminology","Visiting a call center","Contacting a prospective customer","Attending to a complaint","Contacting a prospective customer"));
        arrayList.add(new ContentQuestionModel("‘Prospect’ means","Existing customers","A likely buyer","A religious leader","New targets to be achieved","A likely buyer"));
        arrayList.add(new ContentQuestionModel("KYC means","Know your Credits","Keep your Credit Card","Know your Cool","Keep your Customers","Keep your Credit Card"));
        arrayList.add(new ContentQuestionModel("The collective perceptions and impressions people have formed about an organization, its products and/or its services, is known as its","Brand value","Brand assets","Brand attribute","Brand image","Brand image"));


        arrayList.add(new ContentQuestionModel("One of the following is not required in a good sales person. Find the same","Sympathetic approach","Sympathetic approach","Perseverance","Persuasion skills","Sympathetic approach"));
        arrayList.add(new ContentQuestionModel("List of people who do not wish to receive telemarketing calls is","Do never call list","Do not call list","Do not dial list","Dare not call list","Do not call list"));
        arrayList.add(new ContentQuestionModel("Marketing of goods experimentally in several carefully selected areas before releasing them on a wide scale is known as","Sampling","Segmentation","Segregation","Test marketing","Test marketing"));
        arrayList.add(new ContentQuestionModel("Motivation in marketing means","Market size","Inspiring sales persons to sell more"," Inspiring sales person to talk more","Inspiring counter staff to talk more","Inspiring sales persons to sell more"));
        arrayList.add(new ContentQuestionModel("Setting price of a product based on the buyer’s perceptions of value rather than on the seller’s cost is known as"," Break even pricing","Target profit pricing","Cost plus pricing","Value based pricing","Value based pricing"));
        arrayList.add(new ContentQuestionModel("Which one of the following best describes the term ‘Negative Demand’?","Consumers begin to buy a product less frequently","Consumers do not at all buy a product","Consumers are unaware or uninterested in a product","Consumers dislike a product and may even pay to avoid it","Consumers dislike a product and may even pay to avoid it"));
        arrayList.add(new ContentQuestionModel("Leads for canvassing home loan accounts can be obtained from","Builders","Individuals building one’s own house","Brick manufacturers","Audit departments","Individuals building one’s own house"));
        arrayList.add(new ContentQuestionModel("Internet Banking can be popularized by way of","Reduced prices","Higher prices","Better technology","More ATMs","Better technology"));
        arrayList.add(new ContentQuestionModel("Uncertain outcomes involving the market for goods and services, such as the possibility of price declines or increases, changes in consumer preferences and/or changes in the nature of competition is called","Market risk","Market design","Market scope","Market outlook","Market risk"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("EMI একটি বিপণন সরঞ্জাম _______________", "এটি খুব উচ্চ", "এটি খুব কম", "এটি ওঠানামা করছে", "এটি বাড়ছে", "এটি খুব কম"));
        arrayList.add(new ContentQuestionModel("নীচের কোনটিকে এফএমসিজি হিসাবে শ্রেণিবদ্ধ করা যেতে পারে?", "মুদ্রণযন্ত্র", "তামাকজাত পণ্য", "কয়েন ভেন্ডিং মেশিন", "শিল্পজাতীয় জিনিস", "তামাকজাত পণ্য"));
        arrayList.add(new ContentQuestionModel("বিক্রয় চুক্তিতে ক্রেতার প্রতিরোধকে--এর মাধ্যমে কাটিয়ে উঠতে পারে", "যুক্তি দক্ষতা", "আইটি জারগনস", "অধ্যবসায়", "তর্ক করার দক্ষতা", "যুক্তি দক্ষতা"));
        arrayList.add(new ContentQuestionModel("ব্যবসায়ের সেরা, গুরুত্বপূর্ণ এবং কেন্দ্রীয় ক্রিয়াকলাপটি এর--হিসাবে পরিচিত", "পণ্য রেখা", "পারমাণবিক ক্রিয়াকলাপ", "মূল প্রতিযোগিতা", "মেনস্টে", "মূল প্রতিযোগিতা"));
        arrayList.add(new ContentQuestionModel("হোম loansণের জন্য লক্ষ্য দলটি হ'ল", "টাইলস উত্পাদন করে", "আবাসন সমিতিগুলি", "কৃষক সমিতি", "ব্যক্তিরা কোনও বাড়ির মালিক নন", "ব্যক্তিরা কোনও বাড়ির মালিক নন"));
        arrayList.add(new ContentQuestionModel("বিতরণ চ্যানেলগুলির অর্থ", "বিক্রয় আউটলেট", "পণ্য শেল্ফ-জীবন", "কুরিয়ার ব্যক্তি", "চ্যানেল ফিনান্স", "বিক্রয় আউটলেট"));
        arrayList.add(new ContentQuestionModel("কোনও গ্রাহকের ক্রয়ের ইতিহাস সম্পর্কিত অফারগুলির জন্য তাদের চয়ন করতে ব্যবহার করা--  হিসাবে পরিচিত", "বিপণন", "প্রত্যাশা", "চ্যানেল বিক্রয়", "ক্রস বিক্রয়", "ক্রস বিক্রয়"));
        arrayList.add(new ContentQuestionModel("বিক্রয় সম্পর্কিত ধারণা বিপণনের চেয়ে আলাদা এবং এর মাধ্যমে লাভ সর্বাধিকীকরণের লক্ষ্য", "মানের পণ্যগুলির ক্রমবর্ধমান বিক্রয়", "গ্রাহকের প্রয়োজনের সন্তুষ্টি", "গ্রাহকের সমস্যার সমাধান", "গ্রাহকের সন্তুষ্টি", "গ্রাহকের সন্তুষ্টি"));
        arrayList.add(new ContentQuestionModel("গ্রাহকের লিঙ্গের উপর ভিত্তি করে বাজারগুলির বিভাজন হ'ল এক প্রকার", "সামাজিক সাংস্কৃতিক বিভাজন", "মনোবিজ্ঞান বিভাগে", "ভৌগলিক বিভাজন", "জনতাত্ত্বিক বিভাজন", "জনতাত্ত্বিক বিভাজন"));
        arrayList.add(new ContentQuestionModel("গ্রাহকগণ বা সম্ভাব্য গ্রাহকদের সাথে গণসংযোগ, সাধারণত অর্থ প্রদানের গণমাধ্যমের মাধ্যমে--  হিসাবে পরিচিত", "প্রচার", "বিক্রয় প্রচার", "বিজ্ঞাপন", "জনসংযোগ", "বিজ্ঞাপন"));
        arrayList.add(new ContentQuestionModel("একটি  কল  এর অর্থ", "একটি ইন্টারনেট পরিভাষা", "একটি কল সেন্টার পরিদর্শন করা", "সম্ভাব্য গ্রাহকের সাথে যোগাযোগ করা", "কোনও অভিযোগে অংশ নেওয়া", "সম্ভাব্য গ্রাহকের সাথে যোগাযোগ করা"));
        arrayList.add(new ContentQuestionModel("সম্ভাবনার অর্থ", "বিদ্যমান গ্রাহক", "সম্ভাব্য ক্রেতা", "একজন ধর্মীয় নেতা", "নতুন লক্ষ্য অর্জন করা", "সম্ভাব্য ক্রেতা"));
        arrayList.add(new ContentQuestionModel("কেওয়াইসি এর অর্থ", "আপনার ক্রেডিটগুলি জানুন", "আপনার ক্রেডিট কার্ড রাখুন", "আপনার কুলটি জানুন", "আপনার গ্রাহকদের রাখুন", "আপনার ক্রেডিট কার্ড রাখুন"));
        arrayList.add(new ContentQuestionModel("একটি সংস্থা, এর পণ্য এবং / অথবা এর পরিষেবা সম্পর্কে লোকেরা যে সম্মিলিত ধারণা এবং ছাপ তৈরি করেছে, এটি--  হিসাবে পরিচিত ", "ব্র্যান্ড ভ্যালু", "ব্র্যান্ডের সম্পদ", "ব্র্যান্ড অ্যাট্রিবিউট", "ব্র্যান্ড ইমেজ", "ব্র্যান্ড ইমেজ"));//14
        arrayList.add(new ContentQuestionModel("ভাল গ্রাহক পরিষেবা হ'ল একটি প্রসারিত বাহু", "পরিষেবা বিপণন", "পরোক্ষ বিপণন", "প্রক্রিয়া বিপণন", "ওয়েব বিপণন", "পরিষেবা বিপণন"));
        arrayList.add(new ContentQuestionModel("প্রতিযোগিরা মেলে না বা মেলে না এমন এক বা একাধিক উপায়ে পারফর্ম করার দক্ষতা তার--  হিসাবে পরিচিত", "গুণাবলীর প্রতিযোগিতা", "ব্র্যান্ড পজিশনিং", "ব্র্যান্ড ইমেজ", "প্রতিযোগিতামূলক সুবিধা", "প্রতিযোগিতামূলক সুবিধা"));
        arrayList.add(new ContentQuestionModel("সাধারণত টেলিভিশন, রেডিওতে বা কোনও সিনেমা প্রেক্ষাগৃহে উপস্থাপিত একটি অডিও বা ভিডিও বিজ্ঞাপনী ঘোষণাকে--   বলা হয়", "প্রচার", "স্পনসরশিপ", "ব্যানার", "ক্রিয়েটিভ", "প্রচার"));
        arrayList.add(new ContentQuestionModel("বাড়ির বিনোদনের জন্য ব্যবহৃত টিভি, ভিডিও, স্টেরিও সিস্টেম ইত্যাদির মতো বৈদ্যুতিক পণ্যগুলি--  হিসাবে পরিচিত", "গ্রিন গুডস", "রেড গুডস", "ব্লু গুডস", "ব্রাউন গুডস", "ব্রাউন গুডস"));
        arrayList.add(new ContentQuestionModel("একটি খুব বড় মার্কেট সেগমেন্ট বা ছোট বিভাগের বিস্তৃত সংগ্রহকে বলা হয়", "কুলুঙ্গি বাজার", "মাস মার্কেট", "গণ বাজার", "মাল্টি-লেভেল মার্কেট", "মাস মার্কেট"));
        arrayList.add(new ContentQuestionModel(", বিনামূল্যে প্রদান", "কম দামে Offণ দেওয়া", "প্রণোদনা দেওয়া", "গ্রাহক ধরে রাখা", "ব্যক্তিগতকৃত পরিষেবা" ,"গ্রাহক ধরে রাখা"));
        arrayList.add(new ContentQuestionModel("গাড়ী loanণের জন্য লক্ষ্য দলটি হ'ল", "গাড়ীর মালিকানাধীন সমস্ত ব্যক্তি", "একাধিক সদস্যের পরিবার", "গাড়ির গ্যারেজ", "গাড়ি ডিজাইনার", "একাধিক সদস্যের পরিবার"));
        arrayList.add(new ContentQuestionModel("স্ট্যান্ডার্ড বিপণন অনুশীলনের মধ্যে রয়েছে", "অস্বাস্থ্যকর প্রতিযোগিতা", "শিকারী", "বিক্রয়মূল্য হ্রাস", "অস্বাস্থ্যকর ছাড়ের স্কিম", "বিক্রয়মূল্য হ্রাস"));//22
        arrayList.add(new ContentQuestionModel("মার্কেট বিভাজন মানে  ভাগ করা "," বিপণন দলকে ছোট ছোট দলে ভাগ করা "," তাদের গ্রেড অনুসারে কর্মচারী "," পণ্যগুলি তাদের জীবনচক্র অনুসারে ","বিভিন্ন গ্রুপের স্বাদ এবং প্রয়োজন অনুসারে বাজার" , "বিভিন্ন গ্রুপের স্বাদ এবং প্রয়োজন অনুসারে বাজার"));
        arrayList.add(new ContentQuestionModel("গ্রাহকরা কী চান এবং কীভাবে তারা কাজ করে তা প্রকাশ করার জন্য উপলভ্য গ্রাহক ডেটা ব্যবহার করে নিদর্শন এবং সম্পর্কগুলি আবিষ্কারের প্রক্রিয়া--  হিসাবে পরিচিত ", "ডেটা ওয়্যারহাউজিং", "ডেটা বেস", "ডেটা মাইনিং", "ডেটা বিল্ডিং", "ডেটা মাইনিং"));
        arrayList.add(new ContentQuestionModel("টেলিমার্কেটিং এর অর্থ", "ইন্টারনেট বিপণন", "ঘরে ঘরে যোগাযোগ", "এসএমএস পাঠানো এবং গ্রহণ করা", "টেলিফোন কলের মাধ্যমে বিপণন", "টেলিফোন কলের মাধ্যমে বিপণন"));
        arrayList.add(new ContentQuestionModel("গ্রাহকরা যখন নিম্ন মানের কিছু কেনার লক্ষ্য নিয়েছিল তখন তারা আপগ্রেড পণ্যগুলি কিনতে অনুপ্রাণিত করে", "ক্রস বিক্রয়", "উঁচু বিক্রয়", "ফরোয়ার্ড বিক্রয়", "চ্যানেল বিপণন", "উঁচু বিক্রয়"));
        arrayList.add(new ContentQuestionModel("আধুনিক বিপণন ধারণাটি দাবি করে যে‘ বিপণন ’পণ্য ধারণা দিয়ে শুরু হয় এবং--  দিয়ে শেষ হয় ", "মানের পণ্য উত্পাদন", "বিজ্ঞাপন প্রচার", "গ্রাহক সন্তুষ্টি", "পণ্য বিক্রয়", "গ্রাহক সন্তুষ্টি"));
        arrayList.add(new ContentQuestionModel("এমন পরিস্থিতিতে যেখানে গ্রাহক ক্রয় অপরিকল্পিত হয় তাকে--  বলা হয়", "প্রচ্ছন্ন চাহিদা", "ইমপালস ক্রয়", "অস্বাস্থ্যকর ক্রয়", "অনিয়মিত চাহিদা", "ইমপালস ক্রয়"));
        arrayList.add(new ContentQuestionModel("এমন পরিস্থিতিতে যেখানে গ্রাহক ক্রয় অপরিকল্পিত হয় তাকে", "প্রচ্ছন্ন চাহিদা", "ইমপালস ক্রয়", "অস্বাস্থ্যকর ক্রয়", "অনিয়মিত চাহিদা", "ইমপালস ক্রয়"));
        arrayList.add(new ContentQuestionModel("টেলিমার্কেটিং কলগুলি গ্রহণ করতে চান না তাদের তালিকা হ'ল", "কখনই তালিকায় কল করবেন না", "তালিকায় কল করবেন না", "তালিকাটি ডায়াল করবেন না", "কল তালিকায় সাহস নেই", "তালিকায় কল করবেন না"));
        arrayList.add(new ContentQuestionModel("বিস্তৃত আকারে ছাড়ার আগে বেশ কয়েকটি সাবধানে নির্বাচিত অঞ্চলগুলিতে পরীক্ষামূলকভাবে পণ্য বিপণন", "নমুনা", "বিভাগকরণ", "বিভাজন", "টেস্ট বিপণন", "টেস্ট বিপণন"));
        arrayList.add(new ContentQuestionModel("বিপণনের প্রেরণার অর্থ", "বাজারের আকার", "বিক্রয় ব্যক্তিদের বেশি বিক্রি করার জন্য অনুপ্রেরণা", "বিক্রয় ব্যক্তি আরও বেশি কথা বলার জন্য অনুপ্রেরণা", "কাউন্টার কর্মীদের আরও বেশি কথা বলার জন্য অনুপ্রেরণা", "বিক্রয় ব্যক্তিদের বেশি বিক্রি করার জন্য অনুপ্রেরণা"));
        arrayList.add(new ContentQuestionModel("বিক্রেতার দামের চেয়ে ক্রেতার মূল্য উপলব্ধির উপর ভিত্তি করে একটি পণ্যের মূল্য নির্ধারণ", "এমনকি ভাঙ্গা দাম ভাঙা", "টার্গেট লাভের মূল্য নির্ধারণ", "মূল্য প্লাস মূল্য নির্ধারণ", "মান ভিত্তিক মূল্য", "মান ভিত্তিক মূল্য"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে কোনটি 'নেতিবাচক চাহিদা  শব্দটিকে সবচেয়ে ভাল বর্ণনা করে? "," গ্রাহকরা কম ঘন ঘন পণ্য কিনতে শুরু করেন "," গ্রাহকরা কোনও পণ্যই কিনে না "," গ্রাহকরা কোনও পণ্য সম্পর্কে অবহিত বা আগ্রহী নন ", "গ্রাহকরা কোনও পণ্য অপছন্দ করেন এবং এটি এড়াতে এমনকি অর্থ প্রদানও করতে পারেন", "গ্রাহকরা কোনও পণ্য অপছন্দ করেন এবং এটি এড়াতে এমনকি অর্থ প্রদানও করতে পারেন"));
        arrayList.add(new ContentQuestionModel("হোম loanণ অ্যাকাউন্টে ক্যানভাসিং এর শীর্ষস্থানগুলি", "বিল্ডার", "ব্যক্তি নিজের বাড়ী তৈরি করে", "ইট প্রস্তুতকারী", "নিরীক্ষা বিভাগ", "ব্যক্তি নিজের বাড়ী তৈরি করে"));
        arrayList.add(new ContentQuestionModel("ইন্টারনেট ব্যাংকিং--  এর মাধ্যমে জনপ্রিয় করা যায়", "দাম কমানো", "উচ্চতর দাম", "আরও ভাল প্রযুক্তি", "আরও এটিএম", "আরও ভাল প্রযুক্তি"));
        arrayList.add(new ContentQuestionModel("পণ্য ও পরিষেবাদিগুলির জন্য বাজারের সাথে জড়িত অনিশ্চিত ফলাফলগুলি, যেমন দাম হ্রাস বা বৃদ্ধির সম্ভাবনা, গ্রাহকের পছন্দসমূহে পরিবর্তন এবং / অথবা প্রতিযোগিতার প্রকৃতির পরিবর্তনগুলি", "বাজারের ঝুঁকি", "মার্কেট ডিজাইন", "মার্কেট  নামে পরিচিত সুযোগ "," বাজারের দৃষ্টিভঙ্গি ","বাজারের ঝুঁকি"));
        arrayList.add(new ContentQuestionModel("ভাল প্রতিযোগিতা--  তে সহায়তা করে ", "উন্নত গ্রাহক পরিষেবা", "আরও বেশি শেয়ারের শেয়ার", "উন্নত ব্র্যান্ড চিত্র", "কমে বিক্রয়", "উন্নত গ্রাহক পরিষেবা"));
        arrayList.add(new ContentQuestionModel("নির্দিষ্ট বাজারের সাথে সম্পর্কিত পদ্ধতিগত সংগ্রহ, রেকর্ডিং এবং বিশ্লেষণকে--  হিসাবে পরিচিত", "বিপণন গবেষণা", "মার্কেট শেয়ার", "মার্কেটের বিভাজন", "বিপণন গবেষণা", "বিপণন গবেষণা" ));
        arrayList.add(new ContentQuestionModel("যে কোনও সংস্থার নেতৃত্ব জেনারেশনের সর্বাধিক সাধারণ উত্স হ'ল", "নিরীক্ষণের নির্দেশিকা", "হাউস ম্যাগাজিনগুলি", "হলুদ পৃষ্ঠা", "অভিধান", "হলুদ পৃষ্ঠা"));
        arrayList.add(new ContentQuestionModel("ব্যাংকগুলিতে বিপণন প্রয়োজন", "জনসংখ্যা বৃদ্ধি", "বিশ্বায়ন", "সরকার আদেশ দেয়","কম্পিউটারাইজেশন", "বিশ্বায়ন"));
        arrayList.add(new ContentQuestionModel("বিপণন হ'ল", "একটি প্রতিদিনের অনুষ্ঠান", "একটি একক ঘটনা", "অতিরিক্ত উপার্জনের অর্থ", "একটি সম্মিলিত প্রক্রিয়া", "একটি সম্মিলিত প্রক্রিয়া"));
        arrayList.add(new ContentQuestionModel("একজন ভালো বিপণন কর্মীদের প্রয়োজনীয় মানের হ'ল", "পুশি", "অধ্যবসায়", "ভদ্রতা", "কেবল (3) এবং (4)", "কেবল (3) এবং (4)"));
        arrayList.add(new ContentQuestionModel("বিপণন অবলম্বন করা উচিত", "কেবল ধনী ব্যক্তিদের মধ্যে", "কেবল জনাকীর্ণ অঞ্চলে", "কেবল দরিদ্রদের মধ্যে", "পণ্যের উপর নির্ভর করে", "পণ্যের উপর নির্ভর করে"));
        arrayList.add(new ContentQuestionModel("এইচএনআই এর অর্থ", "উচ্চ আয়ের ব্যক্তি", "সৎ মার্কেটিং স্টাফ", "হাই নেটওয়ার্ক স্বতন্ত্র ব্যক্তি", "আন্তরিক নিরপেক্ষ ব্যক্তি", "হাই নেটওয়ার্ক স্বতন্ত্র ব্যক্তি"));
        arrayList.add(new ContentQuestionModel("বিপণনের কৌশলগুলির অর্থ", "কার্যকর বিপণনের পরিকল্পনা", "বিপণনের স্টাইলের ধরণ", "বাজারের চাহিদা", "এই সমস্ত", "এই সমস্ত"));
        arrayList.add(new ContentQuestionModel("মার্কেট প্ল্যান হ'ল", "প্রতিদিনের বিপণনের জন্য একটি অ্যাকশন প্ল্যান", "কার্যকর বিক্রয় পদক্ষেপ", "কার্যকর কেনার পদক্ষেপ", "বিপণনের কৌশলগুলির জন্য একটি বিস্তৃত নথি", "বিপণনের কৌশলগুলির জন্য একটি বিস্তৃত নথি"));
        arrayList.add(new ContentQuestionModel("ডিজিটাল বিপণনের অর্থ হ'ল", "এই সমস্ত", "ডিজিটাল পণ্য বিক্রয়", "ইন্টারনেটের মাধ্যমে বিক্রয়", "ক্যালকুলেটর বিক্রয়", "ইন্টারনেটের মাধ্যমে বিক্রয়"));
        arrayList.add(new ContentQuestionModel("টার্গেট গ্রুপের অর্থ", "সমস্ত কর্মচারী", "সংক্ষিপ্ত তালিকাভুক্ত গোষ্ঠী", "সমস্ত বিপণন কর্মী", "বিক্রয় প্রতিনিধি", "সংক্ষিপ্ত তালিকাভুক্ত গোষ্ঠী"));
        arrayList.add(new ContentQuestionModel("হোম ansণের জন্য লক্ষ্য দল হ'ল", "বেতনভোগী ব্যক্তি", "ব্যবসায়ী", "পেশাদার", "এই সমস্ত", "এই সমস্ত"));


        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("ईएमआई एक विपणन उपकरण है यदि _______________", "यह बहुत अधिक है", "यह बहुत कम है", "यह उतार-चढ़ाव है", "यह बढ़ रहा है", "यह बहुत कम है"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसे FMCG के रूप में वर्गीकृत किया जा सकता है?", "प्रिंटिंग मशीन", "तंबाकू उत्पाद", "सिक्का वेंडिंग मशीन", "औद्योगिक सामान", "तंबाकू उत्पाद"));
        arrayList.add(new ContentQuestionModel("एक बिक्री सौदे में क्रेता प्रतिरोध को", "भ्रमित बिक्री की बात", "आईटी शब्दजाल", "दृढ़ता", "तर्क कौशल", "तर्क कौशल"));
        arrayList.add(new ContentQuestionModel("किसी व्यवसाय की सर्वश्रेष्ठ, महत्वपूर्ण और केंद्रीय गतिविधि को इसके", "उत्पाद लाइन", "परमाणु गतिविधि", "कोर योग्यता", "मुख्य आधार", "मुख्य आधार"));
        arrayList.add(new ContentQuestionModel("होम लोन के लिए टारगेट ग्रुप", "टाइल मैन्युफैक्चरिंग", "हाउसिंग सोसाइटीज़", "फ़ार्मर्स सोसाइटीज़", "किसी भी घर के मालिक नहीं हैं", "किसी भी घर के मालिक नहीं हैं"));
        arrayList.add(new ContentQuestionModel("वितरण चैनलों का अर्थ है", "बिक्री आउटलेट", "उत्पाद शेल्फ-जीवन", "कूरियर व्यक्ति", "चैनल वित्त", "बिक्री आउटलेट"));
        arrayList.add(new ContentQuestionModel("संबंधित ऑफ़र के लिए उन्हें चुनने के लिए ग्राहक की खरीदारी के इतिहास का उपयोग करना", "मार्केटिंग", "प्रॉस्पेक्टिंग", "चैनल बेचना", "क्रॉस सेलिंग", "क्रॉस सेलिंग"));
        arrayList.add(new ContentQuestionModel("बिक्री की अवधारणा विपणन से भिन्न है और अधिकतम गुणवत्ता वाले उत्पादों की बिक्री की मात्रा "," ग्राहकों की आवश्यकताओं की संतुष्टि "," ग्राहक समस्या का समाधान "," ग्राहक संतुष्टि "," बिक्री की मात्रा में वृद्धि "," ग्राहकों की आवश्यकताओं की संतुष्टि "));
        arrayList.add(new ContentQuestionModel("ग्राहकों के लिंग के आधार पर बाजारों का विभाजन एक प्रकार का है", "सामाजिक सांस्कृतिक विभाजन", "मनोवैज्ञानिक विभाजन", "भौगोलिक विभाजन", "जनसांख्यिकीय विभाजन", "जनसांख्यिकीय विभाजन"));
        arrayList.add(new ContentQuestionModel("ग्राहकों या संभावित ग्राहकों के साथ बड़े पैमाने पर संचार, आमतौर पर भुगतान किए गए सार्वजनिक मीडिया के माध्यम से जाना जाता है", "प्रचार", "बिक्री प्रचार", "विज्ञापन", "जनसंपर्क", "विज्ञापन"));
        arrayList.add(new ContentQuestionModel("ए 'कॉल' का अर्थ है", "एक इंटरनेट शब्दावली", "कॉल सेंटर का दौरा करना", "भावी ग्राहक से संपर्क करना", "शिकायत में शामिल होना", "भावी ग्राहक से संपर्क करना"));
        arrayList.add(new ContentQuestionModel("Isting प्रॉस्पेक्ट 'का अर्थ है", "मौजूदा ग्राहक", "एक संभावित खरीदार", "एक धार्मिक नेता", "प्राप्त करने के लिए नए लक्ष्य", "एक संभावित खरीदार"));
        arrayList.add(new ContentQuestionModel("केवाईसी का अर्थ है", "अपने क्रेडिट्स को जानें", "अपना क्रेडिट कार्ड रखें", "अपने कूल को जानें", "अपने ग्राहकों को रखें", "अपना क्रेडिट कार्ड रखें"));
        arrayList.add(new ContentQuestionModel("सामूहिक धारणाएं और छापें लोगों ने एक संगठन, उसके उत्पादों और / या उसकी सेवाओं के बारे में बनाई हैं, इसे इसके", "ब्रांड मूल्य", "ब्रांड संपत्ति", "ब्रांड विशेषता", "ब्रांड छवि", "ब्रांड छवि"));
        arrayList.add(new ContentQuestionModel("अच्छी ग्राहक सेवा", "सेवा विपणन", "अप्रत्यक्ष विपणन", "प्रक्रिया विपणन", "वेब मार्केटिंग", "सेवा विपणन"));
        arrayList.add(new ContentQuestionModel("एक कंपनी की क्षमता एक या एक से अधिक तरीकों से प्रदर्शन करने की जो प्रतियोगियों से मेल नहीं खाती या नहीं हो सकती है", "विशेषता प्रतिस्पर्धा", "ब्रांड पोजिशनिंग", "ब्रांड छवि", "प्रतिस्पर्धात्मक लाभ", "प्रतिस्पर्धात्मक लाभ"));
        arrayList.add(new ContentQuestionModel("एक ऑडियो या वीडियो विज्ञापन की घोषणा आमतौर पर टेलीविजन, रेडियो या फिल्म थियेटर में प्रस्तुत की जाती है", "प्रचार", "प्रायोजन", "बैनर", "रचनात्मक", "प्रचार"));
        arrayList.add(new ContentQuestionModel("घरेलू मनोरंजन के लिए उपयोग किए जाने वाले बिजली के सामान जैसे टीवी, वीडियो, स्टीरियो सिस्टम आदि", "ग्रीन गुड्स", "रेड गुड्स", "ब्लू गुड्स", "ब्राउन गुड्स", "ब्राउन गुड्स"));
        arrayList.add(new ContentQuestionModel("एक बहुत बड़े मार्केट सेगमेंट या छोटे सेगमेंट के वाइड कलेक्शन को", "निके मार्केट", "मेटा मार्केट", "मास मार्केट", "मल्टी-लेवल मार्केट", "मास मार्केट"));
        arrayList.add(new ContentQuestionModel("ग्राहक प्रतिधारण सुनिश्चित किया जा सकता है", "मुफ्त की पेशकश", "कम दरों पर ऋण की पेशकश", "प्रोत्साहन दे", "व्यक्तिगत सेवाएँ", "व्यक्तिगत सेवाएँ"));
        arrayList.add(new ContentQuestionModel("कार ऋण के लिए लक्ष्य समूह है", "सभी व्यक्ति एक कार के मालिक हैं", "2 से अधिक सदस्यों वाला परिवार", "कार गैरेज", "कार डिजाइनर", "2 से अधिक सदस्यों वाला परिवार"));
        arrayList.add(new ContentQuestionModel("मानक विपणन प्रथाओं में", "अस्वस्थ प्रतियोगिता", "अवैध शिकार", "विक्रय मूल्य कम करना", "अस्वास्थ्यकर छूट योजनाएं", "विक्रय मूल्य कम करना"));//22
        arrayList.add(new ContentQuestionModel("बाजार विभाजन का अर्थ है", "विपणन दल छोटे समूहों में", "कर्मचारी अपने ग्रेड के अनुसार", "उत्पाद, अपने जीवन चक्र के अनुसार", "बाजार, विभिन्न समूहों के स्वाद और जरूरतों के अनुसार" , "बाजार, विभिन्न समूहों के स्वाद और जरूरतों के अनुसार"));
        arrayList.add(new ContentQuestionModel("ग्राहक क्या चाहते हैं और कैसे कार्य करते हैं, यह बताने के लिए उपलब्ध ग्राहक डेटा का उपयोग करके पैटर्न और रिश्तों की खोज की प्रक्रिया", "डेटा वेयरहाउसिंग", "डेटा बेस", "डेटा माइनिंग", "डेटा बिल्डिंग", "डेटा माइनिंग"));
        arrayList.add(new ContentQuestionModel("टेलीमार्केटिंग का अर्थ है", "इंटरनेट मार्केटिंग", "डोर-टू-डोर संपर्क", "एसएमएस भेजना और प्राप्त करना", "टेलीफोन कॉल के माध्यम से विपणन", "टेलीफोन कॉल के माध्यम से विपणन"));//25
        arrayList.add(new ContentQuestionModel("ग्राहकों को उन्नत उत्पाद खरीदने के लिए प्रेरित करना जब उन्होंने कम मूल्य का कुछ खरीदने का इरादा किया था", "क्रॉस सेलिंग", "अपस्लिंग", "फॉरवर्ड सेलिंग", "चैनल मार्केटिंग", "अपस्लिंग"));
        arrayList.add(new ContentQuestionModel("आधुनिक विपणन अवधारणा का दावा है कि 'विपणन' उत्पाद विचार के साथ शुरू होता है ","और  गुणवत्ता उत्पाद का उत्पादन "," विज्ञापन अभियान ","ग्राहक संतुष्टि"," उत्पाद की बिक्री ","ग्राहक संतुष्टि"));
        arrayList.add(new ContentQuestionModel("ऐसी स्थिति जिसमें उपभोक्ता खरीद अनियोजित होती है", "अव्यक्त मांग", "आवेग की खरीद", "अप्रत्यक्ष खरीद", "अनियमित मांग", "आवेग की खरीद"));
        arrayList.add(new ContentQuestionModel("निम्न में से एक को अच्छी बिक्री वाले व्यक्ति में आवश्यक नहीं है। समान खोजें", "सहानुभूति दृष्टिकोण", "सहानुभूति दृष्टिकोण", "दृढ़ता", "अनुनय कौशल", "सहानुभूति दृष्टिकोण"));
        arrayList.add(new ContentQuestionModel("उन लोगों की सूची, जो टेलीफ़ोनिंग कॉल प्राप्त नहीं करना चाहते हैं", "कभी कॉल सूची न करें", "कॉल न करें सूची", "सूची को डायल न करें", "कॉल न करें सूची", "कभी कॉल सूची न करें"));
        arrayList.add(new ContentQuestionModel("व्यापक पैमाने पर जारी करने से पहले कई ध्यान से चयनित क्षेत्रों में प्रयोगात्मक रूप से माल का विपणन", "नमूनाकरण", "विभाजन", "अलगाव", "परीक्षण विपणन", "परीक्षण विपणन"));
        arrayList.add(new ContentQuestionModel("विपणन में प्रेरणा का अर्थ है", "बाजार का आकार", "बिक्री व्यक्तियों को और अधिक बेचने के लिए प्रेरित करना", "बिक्री व्यक्ति को अधिक बात करने के लिए प्रेरित करना", "काउंटर कर्मचारियों को और अधिक बात करने के लिए प्रेरित करना", "बिक्री व्यक्तियों को और अधिक बेचने के लिए प्रेरित करना"));
        arrayList.add(new ContentQuestionModel("विक्रेता की लागत के बजाय मूल्य के खरीदार की धारणाओं के आधार पर किसी उत्पाद का मूल्य निर्धारित करना", "ब्रेक इवन प्राइसिंग", "टार्गेट प्रॉफिट प्राइसिंग", "कॉस्ट प्लस प्राइसिंग", "मूल्य आधारित मूल्य निर्धारण", "मूल्य आधारित मूल्य निर्धारण"));
        arrayList.add(new ContentQuestionModel("निम्न में से कौन सा एक शब्द 'नकारात्मक मांग' का वर्णन करता है?", "उपभोक्ता एक उत्पाद को कम बार खरीदना शुरू करते हैं", "उपभोक्ता बिल्कुल एक उत्पाद नहीं खरीदते हैं", "उपभोक्ता किसी उत्पाद में अनजान या बिना रुकावट के हैं" ,"उपभोक्ता किसी उत्पाद को नापसंद करते हैं और इससे बचने के लिए भुगतान भी कर सकते हैं", "उपभोक्ता बिल्कुल एक उत्पाद नहीं खरीदते हैं"));
        arrayList.add(new ContentQuestionModel("होम लोन खातों को कैनवस करने के लिए लीड्स", "बिल्डर्स", "एक के खुद के घर बनाने वाले व्यक्तियों", "ईंट निर्माताओं", "ऑडिट विभागों", "एक के खुद के घर बनाने वाले व्यक्तियों"));
        arrayList.add(new ContentQuestionModel("इंटरनेट बैंकिंग को--  के माध्यम से लोकप्रिय बनाया जा सकता है।", "कम हुई कीमतें", "उच्च मूल्य", "बेहतर तकनीक", "अधिक एटीएम", "बेहतर तकनीक"));
        arrayList.add(new ContentQuestionModel("वस्तुओं और सेवाओं के लिए बाजार से जुड़े परिणामों का पता लगाना, जैसे कि मूल्य में गिरावट या वृद्धि की संभावना, उपभोक्ता वरीयताओं में बदलाव और / या प्रतियोगिता की प्रकृति में बदलाव", "बाजार जोखिम", "बाजार का डिजाइन", "बाजार  कहा जाता है। गुंजाइश "," बाजार दृष्टिकोण ","बाजार जोखिम"));
        arrayList.add(new ContentQuestionModel("अच्छी प्रतिस्पर्धा में मदद करता है", "बेहतर ग्राहक सेवा", "अधिक बाजार हिस्सेदारी", "बेहतर ब्रांड छवि", "कम हुई बिक्री", "बेहतर ग्राहक सेवा"));
        arrayList.add(new ContentQuestionModel("किसी विशेष बाज़ार के संबंध में डेटा का व्यवस्थित एकत्रीकरण, रिकॉर्डिंग और विश्लेषण", "मार्केटिंग रिसर्च", "मार्केट शेयर", "मार्केट सेगमेंटेशन", "मार्केटिंग रिसर्च", "मार्केटिंग रिसर्च"));
        arrayList.add(new ContentQuestionModel("किसी भी कंपनी के लिए लीड जनरेशन का सबसे आम स्रोत है", "ऑडिट दिशानिर्देश", "हाउस मैगज़ीन", "येलो पेज", "डिक्शनरी", "येलो पेज"));
        arrayList.add(new ContentQuestionModel("बैंकों में विपणन की आवश्यकता है", "जनसंख्या में वृद्धि", "वैश्वीकरण", "सरकार तय करती है", "कम्प्यूटरीकरण", "वैश्वीकरण"));
        arrayList.add(new ContentQuestionModel("मार्केटिंग" , "ए-डे-डे फंक्शन", "ए वन-ऑफ अफेयर", "ए का मतलब एक्स्ट्रा इनकम कमाने का", "ए कलेक्टिव प्रोसेस", "ए कलेक्टिव प्रोसेस"));
        arrayList.add(new ContentQuestionModel("एक अच्छे विपणन कर्मचारियों द्वारा आवश्यक गुणवत्ता", "पुष्य", "दृढ़ता", "विनम्रता", "केवल (3) और (4)", "केवल (3) और (4)"));
        arrayList.add(new ContentQuestionModel("विपणन का सहारा लिया जाना चाहिए", "केवल अमीर व्यक्तियों के बीच", "केवल भीड़ भरे क्षेत्रों में", "केवल गरीबों के बीच", "उत्पाद पर निर्भर करता है", "उत्पाद पर निर्भर करता है"));
        arrayList.add(new ContentQuestionModel("एचएनआई का अर्थ है", "उच्च आय वाले व्यक्ति", "ईमानदार विपणन कर्मचारी", "उच्च नेटवर्क व्यक्तिगत", "ईमानदार तटस्थ व्यक्ति", "उच्च नेटवर्क व्यक्तिगत"));
        arrayList.add(new ContentQuestionModel("विपणन रणनीतियों का अर्थ है", "प्रभावी विपणन की योजना", "विपणन शैली का प्रकार", "बाजार की मांग", "ये सभी", "ये सभी"));
        arrayList.add(new ContentQuestionModel("मार्केट प्लान है", "दिन-प्रतिदिन के विपणन के लिए एक कार्य योजना", "प्रभावी विक्रय चरण", "प्रभावी रूप से क्रय कदम", "विपणन रणनीतियों के लिए एक व्यापक दस्तावेज", "विपणन रणनीतियों के लिए एक व्यापक दस्तावेज"));
        arrayList.add(new ContentQuestionModel("डिजिटल मार्केटिंग का अर्थ है", "ये सभी", "डिजिटल सामान बेचना", "इंटरनेट के माध्यम से बेचना", "सेलिंग कैलकुलेटर", "इंटरनेट के माध्यम से बेचना"));
        arrayList.add(new ContentQuestionModel("डिजिटल मार्केटिंग का अर्थ है", "ये सभी", "डिजिटल सामान बेचना", "इंटरनेट के माध्यम से बेचना", "सेलिंग कैलकुलेटर", "इंटरनेट के माध्यम से बेचना"));
        arrayList.add(new ContentQuestionModel("होम लोन के लिए लक्ष्य समूह हैं", "वेतनभोगी व्यक्ति", "व्यवसायी", "पेशेवर", "ये सभी", "ये सभी"));



        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("EMI ایک مارکیٹنگ کا آلہ ہے اگر _______________","یہ بہت زیادہ ہے","یہ بہت کم ہے", "یہ اتار چڑھا is آرہا ہے", "یہ بڑھ رہا ہے","یہ بہت کم ہے"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کس کو ایف ایم سی جی کے طور پر درجہ بندی کیا جاسکتا ہے؟" , "پرنٹنگ مشینیں" , "تمباکو کی مصنوعات" , "سکے فروخت کرنے والی مشینیں"  , "صنعتی سامان","تمباکو کی مصنوعات"));
        arrayList.add(new ContentQuestionModel("فروخت کے معاہدے میں خریداروں کی مزاحمت پر" , "متنازعہ سیل ٹاک" , "آئی ٹی جرگان" , "دلیل مہارت" , "استدلال کی مہارت"  ,"دلیل مہارت"));//
        arrayList.add(new ContentQuestionModel("کسی کاروبار کی بہترین ، اہم اور مرکزی سرگرمی اس کی" , "مصنوعات کی لکیر" , "جوہری سرگرمی" , "بنیادی مہارت" , "مین اسٹے"   ,"بنیادی مہارت"));
        arrayList.add(new ContentQuestionModel("گھریلو قرضوں کا ہدف گروپ" , "ٹائلس تیار کرتا ہے" , "ہاؤسنگ سوسائٹی" , "فرد کسی گھر کے مالک نہیں ہیں" , "ایسے افراد جو کسی کے پاس مکان نہیں رکھتے ہیں" ,"فرد کسی گھر کے مالک نہیں ہیں"));
        arrayList.add(new ContentQuestionModel("ڈیلیوری چینلز کا مطلب ہے" , "سیلز آؤٹ لیٹس" , "فروخت کی دکانیں" , "کورئیر شخص" , "چینل فنانس","فروخت کی دکانیں"));
        arrayList.add(new ContentQuestionModel("کسی صارف کی خریداری کی تاریخ کو متعلقہ پیش کشوں کے ل select منتخب کرنے کے لئے انہیں" , "مارکیٹنگ" , "توقعات" , "کراس فروخت" , "کراس سیلنگ"  ,"کراس فروخت"));
        arrayList.add(new ContentQuestionModel("فروخت کا تصور مارکیٹنگ سے مختلف ہے اور اس کا مقصد منافع کو زیادہ سے زیادہ کرنا ہے" , "معیاری مصنوعات کی فروخت میں اضافہ" , " معیاری مصنوعات کی فروخت میں اضافہ " , "گاہک کی پریشانی کا حل" , "صارفین کا اطمینان"," معیاری مصنوعات کی فروخت میں اضافہ "));
        arrayList.add(new ContentQuestionModel("صارفین کی جنس پر مبنی منڈیوں کی تقسیم ایک قسم کی ہے" , "سوشیو کلچرل سیگمنٹ گیشن" , "صارفین کی جنس پر مبنی منڈیوں کی تقسیم ایک قسم کی ہے" , "جغرافیائی طبقہ" , "آبادیاتی تقسیم","صارفین کی جنس پر مبنی منڈیوں کی تقسیم ایک قسم کی ہے"));
        arrayList.add(new ContentQuestionModel("صارفین یا ممکنہ صارفین کے ساتھ بڑے پیمانے پر مواصلت ، عام طور پر بامعاوضہ عوامی میڈیا کے ذریعے" , "اشتہار بازی" , "سیلز پروموشن" , "ایڈورٹائزنگ" , "تعلقات عامہ" ,"اشتہار بازی"));
        arrayList.add(new ContentQuestionModel(" ممکنہ گاہک سے رابطہ کرنا "   ,"کا مطلب ہے" , "ایک انٹرنیٹ اصطلاح" , "شکایت میں شرکت" , "کسی ممکنہ گاہک سے رابطہ کرنا" , "شکایت میں شرکت"));
        arrayList.add(new ContentQuestionModel("  کا مطلب" , "ممکنہ خریدار" , "ایک ممکنہ خریدار" , "شکایت میں شرکت" , "نئے اہداف حاصل کرنے کے ہیں" ,"ممکنہ خریدار"));//12
        arrayList.add(new ContentQuestionModel("کے وائی سی کا مطلب ہے" , "اپنی کریڈٹ جانیں" , "اپنا کریڈٹ کارڈ رکھیں" , "اپنا ٹھنڈا جانیں" , "اپنے صارفین کو رکھیں","اپنا کریڈٹ کارڈ رکھیں"));
        arrayList.add(new ContentQuestionModel("لوگوں نے کسی تنظیم ، اس کی مصنوعات اور / یا اس کی خدمات کے بارے میں جو اجتماعی تاثرات اور تاثرات تشکیل دیے ہیں ، اسے" , "برانڈ ویلیو" , "برانڈ اثاثے" , "برانڈ وصف" , "برانڈ امیج"  ,"برانڈ امیج"));
        arrayList.add(new ContentQuestionModel("اچھی کسٹمر سروس" ,"کا ایک توسیع والا بازو ہے ","سروس مارکیٹنگ"," بالواسطہ مارکیٹنگ "," عمل کی مارکیٹنگ "  ,"سروس مارکیٹنگ"));//15
        arrayList.add(new ContentQuestionModel("ایک کمپنی کی ایک یا ایک سے زیادہ طریقوں سے کارکردگی کا مظاہرہ کرنے کی قابلیت جو حریف مقابلہ نہیں کرسکتے ہیں یا نہیں کرسکتے ہیں اسے" , "اوصافی مقابلہ" , "برانڈ پوزیشننگ" , "برانڈ امیج" , "مسابقتی فائدہ"   ,"مسابقتی فائدہ"));
        arrayList.add(new ContentQuestionModel("عام طور پر ٹیلی ویژن ، ریڈیو یا کسی فلم تھیٹر میں پیش کردہ آڈیو یا ویڈیو اشتہاری اعلان کو" , "تشہیر" , "کفالت" , "بینر" , "تخلیقی"  ,"تشہیر"));
        arrayList.add(new ContentQuestionModel("گھریلو تفریح ​​کے لئے استعمال ہونے والے برقی سامان جیسے ٹی وی ، ویڈیو ، سٹیریو سسٹم وغیرہ۔" , "گرین سامان" , "ریڈ سامان" , "بلیو سامان" , "براؤن سامان"  ,"براؤن سامان"));
        arrayList.add(new ContentQuestionModel("ایک بہت بڑا بازار طبقہ یا چھوٹے طبقے کا وسیع ذخیرہ" , "طاق منڈی" , "بڑے پیمانے پر مارکیٹ" , "بڑے پیمانے پر بازار" , "کثیر سطحی منڈی"      ,"بڑے پیمانے پر مارکیٹ"));//19
        arrayList.add(new ContentQuestionModel("، صارفین کو مفت کی پیش کش" , "کم شرح پر قرض کی پیش کش" , "مراعات دینا" , "ذاتی خدمات " , "صارفین کو برقرار رکھنے کو یقینی بنایا جاسکتا ہے۔,","ذاتی خدمات "));
        arrayList.add(new ContentQuestionModel("کار قرض کے ل for ٹارگٹ گروپ" , "کار کے مالک تمام افراد" , "ایسا خاندان جس میں 2 سے زیادہ ممبر ہوں" , "کار گیراج" , "کار ڈیزائنرز"  ,"ایسا خاندان جس میں 2 سے زیادہ ممبر ہوں"));//21
        arrayList.add(new ContentQuestionModel("معیاری مارکیٹنگ کے طریقوں میں" , "غیرصحت مند مقابلہ" , "غیر قانونی" , "فروخت کی قیمت کو کم کرنا" , "غیر صحت مند رعایت اسکیمیں" ,"فروخت کی قیمت کو کم کرنا"));
        arrayList.add(new ContentQuestionModel("مارکیٹ کی تقسیم کا مطلب تقسیم کرنا" ,"مختلف گروہوں کے ذوق اور ضروریات کے مطابق ، بازار" , "ملازمین اپنے درجات کے مطابق" , "مصنوعات ، اپنی زندگی کے مطابق" , "مارکیٹ ، مختلف گروپوں کے ذوق اور ضروریات کے مطابق","مختلف گروہوں کے ذوق اور ضروریات کے مطابق ، بازار"));
        arrayList.add(new ContentQuestionModel("دستیاب کسٹمر ڈیٹا کا استعمال کرتے ہوئے نمونوں اور تعلقات کو دریافت کرنے کا عمل یہ ظاہر کرنے کے لئے کہ صارفین کیا چاہتے ہیں اور وہ کس طرح کا عمل کرتے ہیں" , "اعداد و شمار کوجھنا" , "ڈیٹا بیس" , "ڈیٹا کان کنی" , "ڈیٹا بلڈنگ"  ,"اعداد و شمار کوجھنا"));
        arrayList.add(new ContentQuestionModel("ٹیلی مارکیٹنگ کا مطلب ہے" , "انٹرنیٹ مارکیٹنگ" , "دروازے سے رابطے" , "ایس ایم ایس بھیجنا اور وصول کرنا" , "ٹیلیفون کال کے ذریعے مارکیٹنگ" ,"ٹیلیفون کال کے ذریعے مارکیٹنگ"));//25
        arrayList.add(new ContentQuestionModel("صارفین کو اپ گریڈ شدہ مصنوعات خریدنے کے لئے ترغیب دینا جب انہوں نے کم قیمت میں سے کچھ خریدنے کا ارادہ کیا تھا" , "کراس سیلنگ" , "فروخت" , "فارورڈ سیلنگ" , "چینل مارکیٹنگ"   ,"فروخت"));
        arrayList.add(new ContentQuestionModel("جدید مارکیٹنگ کا تصور یہ دعوی کرتا ہے کہ’ مارکیٹنگ ‘مصنوعات کے خیال سے شروع ہوتی ہے اور" , "معیاری مصنوعات کی پیداوار" , "اشتہاری مہم" , "گاہکوں کی اطمینان" , "مصنوعات کی فروخت"   ,"گاہکوں کی اطمینان"));
        arrayList.add(new ContentQuestionModel("ایسی صورتحال جس میں صارفین کی خریداری کا منصوبہ بند نہ ہو اسے" , "دیر سے مانگ" , "تسلسل کی خریداری" , "غیرصحت مند خریداری" , "فاسد مطالبہ" ,"تسلسل کی خریداری"));
        arrayList.add(new ContentQuestionModel("اچھے سیل والے شخص میں درج ذیل میں سے کسی کی بھی ضرورت نہیں ہے۔ ایک ہی تلاش کریں", "ہمدردانہ نقطہ نظر", "ہمدردانہ نقطہ نظر", "استقامت", "قائل کرنے کی مہارت","ہمدردانہ نقطہ نظر"));
        arrayList.add(new ContentQuestionModel("ان لوگوں کی فہرست ہے جو ٹیلی مارکیٹنگ کالز وصول نہیں کرنا چاہتے ہیں ،" , "کبھی بھی فہرست پر کال نہ کریں" , "کال کی فہرست نہ بنو" , "فہرست ڈائل نہ کریں" , "کال کرنے کی ہمت نہیں ہے","کال کی فہرست نہ بنو"));//30
        arrayList.add(new ContentQuestionModel("سامان کو وسیع پیمانے پر جاری کرنے سے پہلے متعدد احتیاط سے منتخب کردہ علاقوں میں تجرباتی طور پر سامان کی مارکیٹنگ کو" , "نمونے لینے" , "تقسیم" , "علیحدگی" , "ٹیسٹ مارکیٹنگ"  ,"ٹیسٹ مارکیٹنگ"));
        arrayList.add(new ContentQuestionModel("مارکیٹنگ میں حوصلہ افزائی کا مطلب ہے" , "مارکیٹ کا سائز" , "فروخت کرنے والے افراد کو زیادہ فروخت کرنے کی ترغیب دیتے ہیں" ,"فروخت افراد کو زیادہ فروخت کرنے کی ترغیب دیتے ہیں" , "کاؤنٹر عملے کو زیادہ بات کرنے کے لئے متاثر کن","فروخت افراد کو زیادہ فروخت کرنے کی ترغیب دیتے ہیں"));
        arrayList.add(new ContentQuestionModel("بیچنے والے کی قیمت کے بجائے خریدار کے خیالات کی بنیاد پر کسی مصنوع کی قیمت طے کرنا" , "توڑ قیمت بھی مقرر کریں" , "ہدف منافع کی قیمتوں کا تعین" , "قیمت پر مبنی قیمت" , "قیمت پر مبنی قیمتوں"  ,"قیمت پر مبنی قیمت"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کونسا 'منفی مطالبہ' کی اصطلاح کو بہتر طور پر بیان کرتا ہے؟" , "صارفین کم بار ایک مصنوع خریدنا شروع کردیتے ہیں" , "صارفین بالکل بھی مصنوع نہیں خریدتے ہیں" , "صارفین کسی مصنوع میں بے خبر یا دلچسپی نہیں رکھتے ہیں" ,"صارفین کسی مصنوع کو ناپسند کرتے ہیں اور اس سے بچنے کے لئے ادائیگی بھی کر سکتے ہیں" ,"صارفین کسی مصنوع کو ناپسند کرتے ہیں اور اس سے بچنے کے لئے ادائیگی بھی کر سکتے ہیں" ));
        arrayList.add(new ContentQuestionModel("ہوم لون اکاؤنٹ کو چھپانے کے لیڈز" , "اپنے اپنے گھر کی تعمیر کرنے والے افراد" , "انفرادی افراد جو خود اپنا گھر بناتے ہیں" , "برک مینوفیکچررز" , "آڈٹ محکموں" ,"اپنے اپنے گھر کی تعمیر کرنے والے افراد"));//35
        arrayList.add(new ContentQuestionModel("انٹرنیٹ بینکنگ کو" , "قیمتوں میں کمی" , "  ٹکنالوجی" , "بہتر ٹیکنالوجی" , "مزید اے ٹی ایم",    "  ٹکنالوجی"));
        arrayList.add(new ContentQuestionModel("سامان اور خدمات کے لئے مارکیٹ میں شامل غیر یقینی نتائج ، جیسے قیمت میں کمی یا اضافے کا امکان ، صارفین کی ترجیحات میں بدلاؤ اور / یا مسابقت کی نوعیت میں بدلاؤ" , "مارکیٹ کا خطرہ", "مارکیٹ ڈیزائن" , "مارکیٹ دائرہ کار "," مارکیٹ آؤٹ لک ","مارکیٹ کا خطرہ"));
        arrayList.add(new ContentQuestionModel("اچھ competitionا مقابلہ"  , "بہتر صارف کی خدمت"  , "بہتر کسٹمر سروس" , "بہتر برانڈ کی شبیہہ" , "فروخت میں کمی" ,"بہتر کسٹمر سروس"));//38
        arrayList.add(new ContentQuestionModel("کسی خاص مارکیٹ کے سلسلے میں اعداد و شمار کی منظم اجتماع ، ریکارڈنگ اور تجزیہ" , "مارکیٹنگ ریسرچ" , "مارکیٹ شیئر" , "مارکیٹ کی تقسیم" , "مارکیٹنگ کی تحقیق" ,"مارکیٹنگ کی تحقیق"));
        arrayList.add(new ContentQuestionModel("کسی بھی کمپنی کے لئے لیڈز جنریشن کا سب سے عام ذریعہ" , "آڈٹ رہنما اصول" , "ہاؤس میگزین" , "پیلا صفحات" , "لغت" ,"پیلا صفحات"));
        arrayList.add(new ContentQuestionModel("بینکوں میں مارکیٹنگ کی ضرورت" , " کی وجہ سے ہے۔" , "عالمگیریت" , "حکومت کا حکم" , "کمپیوٹرائزیشن"," کی وجہ سے ہے۔"));//41
        arrayList.add(new ContentQuestionModel("مارکیٹنگ ہے" , "یومیہ روزہ کی تقریب" , "ایک دن سے متعلق معاملہ" , "اضافی آمدنی حاصل کرنے کا ایک ذریعہ" , "ایک اجتماعی عمل","ایک اجتماعی عمل"));
        arrayList.add(new ContentQuestionModel("اچھ marketingی مارکیٹنگ کے عملے کو مطلوبہ معیار" , "پشی" , "استقامت" , "شائستگی" , "صرف (3) اور (4) ","صرف (3) اور (4) "));//43
        arrayList.add(new ContentQuestionModel("مارکیٹنگ کا سہارا لیا جانا چاہئے" , "صرف امیر افراد میں ہی"  ,"صرف بھیڑ والے علاقوں میں" , "صرف غریبوں میں ہی" , "مصنوعات پر منحصر ہے","مصنوعات پر منحصر ہے"));
        arrayList.add(new ContentQuestionModel("HNI کا مطلب ہے" , "اعلی آمدنی والا فرد" , "ایماندار مارکیٹنگ عملہ" , "HNI کا مطلب ہے" , "غیرت مند غیر جانبدار فرد","HNI کا مطلب ہے"));
        arrayList.add(new ContentQuestionModel("مارکیٹنگ کی حکمت عملی کا مطلب ہے" , "موثر مارکیٹنگ کا منصوبہ" , "مارکیٹنگ کے انداز کی قسم" , "مارکیٹ کا مطالبہ" , "یہ سب","یہ سب"));
        arrayList.add(new ContentQuestionModel("مارکیٹ پلان" , "یومیہ مارکیٹنگ کے لئے ایک ایکشن پلان" , "فروخت کے موثر اقدامات" , "خریداری کے موثر اقدامات" , "مارکیٹنگ کی حکمت عملی کے لئے ایک جامع دستاویز","مارکیٹنگ کی حکمت عملی کے لئے ایک جامع دستاویز"));
        arrayList.add(new ContentQuestionModel("ڈیجیٹل مارکیٹنگ کے معنی" , "یہ سب" , "ڈیجیٹل سامان فروخت کرنا" , "انٹرنیٹ کے ذریعے فروخت" , "کیلکولیٹر فروخت کرنا"  ,"انٹرنیٹ کے ذریعے فروخت"));
        arrayList.add(new ContentQuestionModel("ٹارگٹ گروپ کا مطلب ہے" , "تمام ملازمین" , "شارٹ لسٹڈ گروپ" , "تمام مارکیٹنگ عملہ" , "سیلز کے نمائندے","تمام مارکیٹنگ عملہ"));
        arrayList.add(new ContentQuestionModel("گھریلو قرضوں کا ہدف گروپ" , "تنخواہ دار شخص" , "بزنس مین" , "پیشہ ور افراد" , "یہ سب","یہ سب"));


        return arrayList;


    }


}