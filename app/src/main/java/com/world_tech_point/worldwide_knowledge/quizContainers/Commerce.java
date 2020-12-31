package com.world_tech_point.worldwide_knowledge.quizContainers;

import android.content.Context;

import com.world_tech_point.worldwide_knowledge.LanguageName;
import com.world_tech_point.worldwide_knowledge.SaveLanguage;
import com.world_tech_point.worldwide_knowledge.services.ListItem;

import java.util.ArrayList;

public class Commerce {
    private Context context;

    public Commerce(Context context) {
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

       arrayList.add(new ContentQuestionModel("Among the following which is not an error of commission ?","Wrong totaling","Recording with wrong amount","Wrong posting","Escape from posting","Escape from posting"));
        arrayList.add(new ContentQuestionModel("The following particulars relate to manufacturing factory for the month of March 2008. Variable cost per unit Rs. 11; Fixed factory overhead Rs. 5,40,000; Fixed selling overhead Rs. 2,52,000; Variable selling cost Rs. 3; Sales Price per unit Rs. 20. Find out the Break-Even Point in rupees -","Rs. 26,40,000","Rs. 30,80,000","Rs. 25,20,000","Rs. 27,40,000","Rs. 25,20,000"));
        arrayList.add(new ContentQuestionModel("Calculate Return on Investment/ Return on Proprietor's fund. Gross profit of a firm is Rs. 3,20,000, Operating expenses Rs. 1,00,000, Taxes Rs. 20,000, Owner's fund Rs. 5,00,000, Debenture Interest Rs. 50,000 -","20%","30%","40%","50%","30%"));
        arrayList.add(new ContentQuestionModel("If the goods purchased are in transit, then the Journal Entry at the end of the period will be -","Goods in Transit A/c Dr. To Supplier's A/c","Goods in transit A/c Dr. To Purchases A/c","Stock A/c Dr. To Goods in Transit A/c","Supplier's A/c Dr. To Goods in Transit","Goods in transit A/c Dr. To Purchases A/c"));
        arrayList.add(new ContentQuestionModel("It is given that cost of stock is Rs. 100. However, its market price is Rs. 98 (buying) and Rs. 140 (selling). If the market price is interpreted as the replacement cost, then the stock should be valued at -","98","100","140","40","98"));
        arrayList.add(new ContentQuestionModel("Social Accounting means -","Accounting for social benefits and social costs","Accounting for Government Revenue & Govt. Cost","Accounting for private revenue and private cost","None of the above","Accounting for social benefits and social costs"));
        arrayList.add(new ContentQuestionModel("Recording of capital contributed by the owner as liability ensures the adherence of principle of","Consistency","Going concern","Separate entity","Materiality","Separate entity"));
        arrayList.add(new ContentQuestionModel("Indian Accounting Standard - 28 is related to -","Accounting for taxes on income","Financial Reporting of Interests in Joint Venture","Impairment of Assets","Provisions, Contingent Liabilities and Contingent Assets","Impairment of Assets"));
        arrayList.add(new ContentQuestionModel("Accounting for Intangible Assets are related to -","AS - 10","AS - 12","AS - 24","AS - 26","AS - 26"));
        arrayList.add(new ContentQuestionModel("P.K Sons purchased a machine on 1st October, 2003 at cost Rs. 2,70,000 and spent Rs. 30,000 on its installation. The firm written off depreciation 10% per annum on original cost every year. The books are closed on 31st March every year. The machine is sold on 30 September, 2006 for Rs. 1,90,000. How much amount will be transferred to P & L A/c as loss on sale of machinery ?","10,000","20,000","30,000","40,000","20,000"));
        arrayList.add(new ContentQuestionModel("Depletion method of depreciation is used in case of -","Cattle, Loose Tools, etc.","Mines, Quarries, etc.","Machinery, Building, etc.","Books","Mines, Quarries, etc."));
        arrayList.add(new ContentQuestionModel("R. G. Ltd. purchased machinery from K.G. Company for a book value of Rs. 4,00,000. The consideration was paid by issue of 10%. Debenture of Rs. 100 each at a discount of 20%. The debenture account will be credited by -","Rs. 4,00,000","Rs. 5,00,000","Rs. 3,20,000","Rs. 4,80,000","Rs. 4,00,000"));
        arrayList.add(new ContentQuestionModel("The balance appearing in the books of a company at the end of year were CRR A/c Rs. 50,000, Security Premium Rs. 5,000, Revaluation Reserve Rs. 20,000, P & L A/c (Dr) Rs. 10,000. Maximum amount available for distribution of Bonus Share will be -","Rs. 50,000","Rs. 55,000","Rs. 45,000","Rs. 57,000","Rs. 55,000"));
        arrayList.add(new ContentQuestionModel("As per Schedule VI of the Companies' Act, 1956, Forfeited Share Account will be -","Added to paid up capital","Added to capital reserve","Shown as a revenue reserve","Deducted from called up capital","Deducted from called up capital"));
        arrayList.add(new ContentQuestionModel("From the information given below, calculate Debt service coverage Ratio— Net profit after interest and Tax Rs. 40,000, Depreciation Rs. 5,000, Rate of Income Tax 50%, 10% Mortgage Debentures Rs. 60,000. Fixed Interest Charges Rs. 6,000, Debenture Redemption Fund Appropriation of Outstanding Debentures 10%.","4.06 times","5.06 times","6.06 times","7.06 times","4.06 times"));
        arrayList.add(new ContentQuestionModel("Current Ratio is 3.75, Acid Test Ratio is 1.25 Stock Rs. 3,75,000, calculate working capital.","Rs. 3,00,000","Rs. 4,00,000","Rs. 4,12,500","Rs. 4,25,000","Rs. 4,12,500"));
        arrayList.add(new ContentQuestionModel("According to ownership, Government Company means _________ share","Whose paid-up share capital's 48%, shares are owned by Government","Whose paid-up share capital's 49% shares are owned by Government","Whose paid-up share capital's 50% shares are owned by Government","Whose paid-up share capital's 51% shares are owned by Government","Whose paid-up share capital's 51% shares are owned by Government"));
        arrayList.add(new ContentQuestionModel("\"A company has a separate legal existence from its members.\" This principle was first laid down in case of -","Saloman Vs. Saloman & Co. Ltd. (1897)","Daimler Co. Ltd. Vs. Continental Tyre & Rubber Co. (1916)","State of U. P. Vs. Renu Sagar Power Co. (1991)","Santunu Roy Vs. Union of India (1989)","Saloman Vs. Saloman & Co. Ltd. (1897)"));
        arrayList.add(new ContentQuestionModel("To appoint new auditor in place of retiring auditor, to adopt the procedure, which section of Companies' Act, 1956 is applicable ?","223","225","224","226","225"));
        arrayList.add(new ContentQuestionModel("Which of the following have lien of Company Auditor ?","Books of Accounts of the Company","Vouchers of the Company","Auditor's working paper","All of the above","Auditor's working paper"));
        arrayList.add(new ContentQuestionModel("Audit adopted by banking company is -","Continuous Audit","Periodical Audit","Internal Audit","Balance Sheet Audit","Continuous Audit"));
        arrayList.add(new ContentQuestionModel("By whom from the following, auditor can be reappointed ?","Directors","Shareholders","Central Government","All of the above","All of the above"));

        arrayList.add(new ContentQuestionModel("Final accounts prepared in narrative style are in -","Horizontal form","Accounts form","Vertical form","None of the above","Vertical form"));
        arrayList.add(new ContentQuestionModel("The Branch of Accounting which is concerned with the processing and presenting data for decision making is known as -","Common Dollar Accounting","Social Accounting","Cost Accounting","Management Accounting","Management Accounting"));
        arrayList.add(new ContentQuestionModel("The object of 'Agenda' is to inform -","About the profitability and activity","About the progress of company","About the routine matters","About the matter in sequence to be discussed in the meeting","About the matter in sequence to be discussed in the meeting"));
        arrayList.add(new ContentQuestionModel("Contents of Marine Insurance include -","Insurance of Cargo only","Insurance of Hull only","Insurance of Cargo, Freight & Hull","Insurance of Freight only","Insurance of Cargo, Freight & Hull"));
        arrayList.add(new ContentQuestionModel("In order to reduce the risk of heavy insurance the insurer passes on some business to the other company, it is called -","Reinsurance","Double Insurance","Joint Insurance Policy","Separate Insurance","Reinsurance"));
        arrayList.add(new ContentQuestionModel("Fire Insurance is based on the principle of -","Utmost Good faith","Insurable Interest","Indemnity","Cooperation","Indemnity"));
        arrayList.add(new ContentQuestionModel("The Life Insurance in India was nationalized in the year -","1870","1956","1960","1966","1956"));
        arrayList.add(new ContentQuestionModel("Which is not a insurable risk ?","Accident Risk","Loss of Crops Risk","The Risk of Trading in New Market","The Risk of Sinking of a Ship","The Risk of Trading in New Market"));
        arrayList.add(new ContentQuestionModel("Final accounts prepared in narrative style are in -","None of the above","Accounts form","Horizontal form","Vertical form","Vertical form"));
        arrayList.add(new ContentQuestionModel("It is given that cost of stock is Rs. 100. However, its market price is Rs. 98 (buying) and Rs. 140 (selling). If the market price is interpreted as the replacement cost, then the stock should be valued at -","98","100","140","40","98"));
        arrayList.add(new ContentQuestionModel("To appoint new auditor in place of retiring auditor, to adopt the procedure, which section of Companies' Act, 1956 is applicable ?","223","225","224","226","225"));

        arrayList.add(new ContentQuestionModel("Auditor shall be punished with imprisonment for a maximum period of ____ under Section 539 for falsification in the books of accounts.","3 Years","5 Years","7 Years","9 Years","7 Years"));
        arrayList.add(new ContentQuestionModel("\"Auditor is not an insurer.\" In which of the following cases, the decision has been given ?","The Kingston Cotton Mills Co. Ltd. (1986)","London & General Bank (1895)","Allen Craig & Co. Ltd. (1934)","Irish Woollen Co. Ltd","London & General Bank (1895)"));
        arrayList.add(new ContentQuestionModel("The Section 80A of the Companies' Act is related with the redemption of -","Debentures","Redeemable preference shares","Irredeemable preference shares","None of the above","Irredeemable preference shares"));
        arrayList.add(new ContentQuestionModel("Company Auditor is responsible -","For directors","For shareholders","For public","For creditors","For shareholders"));
        arrayList.add(new ContentQuestionModel("In Balance Sheet, Audit Accounts are audited -","Monthly","Bi-monthly","Annually or half yearly","Quarterly","Annually or half yearly"));
        arrayList.add(new ContentQuestionModel("Verification includes -","Valuation","Existence","Ownership & Title","All of the above","All of the above"));
        arrayList.add(new ContentQuestionModel("Internal check means -","Checking of accounts by cashier","Checking of accounts by the Internal Auditor","Checking the work of one person by another automatically","Managerial control internally over the subordinates","Checking the work of one person by another automatically"));


        arrayList.add(new ContentQuestionModel("Average stock of firm is Rs. 80,000, the opening stock is Rs. 10,000 less than closing stock. Find opening stock.","Rs. 95,000","Rs. 85,000","Rs. 90,000","Rs. 75,000","Rs. 75,000"));
        arrayList.add(new ContentQuestionModel("Rate of Gross Profit on cost is 25%. Total sales is Rs. 1,00,000 and Average Stock is Rs. 1,60,000. Stock Turnover Ratio will be—","0.5 times","0.10 times","0.4 times","0.8 times","0.5 times"));
        arrayList.add(new ContentQuestionModel("If the current ratio is 2, current assets are worth Rs. 1,600, if current ratio is not allowed to fall below 1.5, how much additional can be borrowed by the company on the short term basis ?","Rs. 2,733","Rs. 800","Rs. 600","Rs. 400","Rs. 400"));
        arrayList.add(new ContentQuestionModel("Price earnings ratio is 83.33% and E.P.S. is Rs. 30. The market price of equity share will be -","Rs. 33.33","Rs. 66.67","Rs. 25","Rs. 20","Rs. 25"));
        arrayList.add(new ContentQuestionModel("Total sales is Rs. 7,60,000, cash sales Rs. 30,000 collection period is 25 days, debtors at Balance Sheet date will be -","Rs. 80,000","Rs. 70,000","Rs. 60,000","Rs. 50,000","Rs. 50,000"));
        arrayList.add(new ContentQuestionModel("The following data, relates to manufacturing company for the year 2006-07- Net Profit as per P & L A/c-Rs. 2,40,000; Depreciation-Rs. 80,000; Goodwill written-off-Rs. 40,000, Profit on Sale of Fixed Assets-Rs. 16,000, Proposed Dividend-Rs. 96,000. The fund from operation would be-","Rs. 4,40,000","Rs. 4,00,000","Rs. 6,40,000","None of the above","None of the above"));
        arrayList.add(new ContentQuestionModel("For the purpose of preparation of fund flow statement, fund means -","Total resources","Cash/bank balances","Current Assets","Working capital","Working capital"));
        arrayList.add(new ContentQuestionModel("Increase in fixed asset due to purchase is -","Source of fund","Fund from operation","Use of fund","None of the above","Use of fund"));
        arrayList.add(new ContentQuestionModel("In common size Balance Sheet analysis we evaluate -","Increase or decrease over two years is analyzed","Only increase over two years is analyzed","Only decrease over two years is analyzed","All assets and liabilities are expressed in terms of percentage of total","All assets and liabilities are expressed in terms of percentage of total"));
        arrayList.add(new ContentQuestionModel("According to Balance Sheet equation concept, the capital will be -","Capital = Liabilities - Assets","Capital = Fixed Assets - Current Assets","Capital = Assets - Liabilities","Capital = Assets + Liabilities","Capital = Assets - Liabilities"));


        return arrayList;

    }
    private ArrayList<ListItem> banglaList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("অভ্যন্তরীণ চেকের অর্থ -", "ক্যাশিয়ারের মাধ্যমে অ্যাকাউন্ট চেক করা", "অভ্যন্তরীণ নিরীক্ষক দ্বারা অ্যাকাউন্টসমূহের চেক করা", "কাজটি পরীক্ষা করা হচ্ছে  অন্য একজনের দ্বারা স্বয়ংক্রিয়ভাবে", "অধস্তনদের উপর অভ্যন্তরীণভাবে নিয়ন্ত্রণ নিয়ন্ত্রণ", "কাজটি পরীক্ষা করা হচ্ছে  অন্য একজনের দ্বারা স্বয়ংক্রিয়ভাবে"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিতগুলির মধ্যে যা কমিশনের ত্রুটি নয়?", "ভুল মোট", "ভুল পরিমাণের সাথে রেকর্ডিং", "ভুল পোস্টিং", "পোস্টিং থেকে পালানো", "পোস্টিং থেকে পালানো"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত বিবরণগুলি ২০০৮ সালের মার্চ মাসে উত্পাদন কারখানার সাথে সম্পর্কিত ইউনিট প্রতি পরিবর্তনীয় ব্যয় ১১,০০০ রুপি, ফিক্সড ফ্যাক্টরির ওভারহেড ৫,৪০,০০০ রুপি, ফিক্সড ওভারহেড ২,৫২,০০০ রুপি পরিবর্তনশীল বিক্রয় মূল্য প্রতি ইউনিটে প্রতি বিক্রয় মূল্য ২০ টাকা সন্ধান করুন  ", "২ 26,40,000", "30,80,000", "25,20,000", "27,40,000", "25,20,000"));
        arrayList.add(new ContentQuestionModel("বিনিয়োগকারীর তহবিলের বিনিয়োগের উপর রিটার্ন / রিটার্ন গণনা করুন a ফার্মের মোট মুনাফা ৩,২০,০০০ রুপি, পরিচালন ব্যয় ১,০০,০০০ টাকা, ট্যাক্স ২০,০০০ টাকা, মালিকের তহবিল ৫,০০,০০০ টাকা, entণগ্রহী সুদ ৫০,০০০ টাকা - "," 20% "," 30% "," 40% "," 50% "," 30% "));
        arrayList.add(new ContentQuestionModel("যদি ক্রয়কৃত পণ্যগুলি ট্রানজিটে হয় তবে পিরিয়ড শেষে জার্নাল এন্ট্রি হবে -", " ট্রানজিট এ / সি পণ্য ক্রয় এ / সি ", "ট্রানজিট এ / সি পণ্যগুলিতে ড। ট্রান্সজিট এ / সি "," স্টক এ / সি ড। টু মাল ইন ট্রানজিট এ / সি "," সরবরাহকারীর এ / সি ড। টু মাল ইন ইন ট্রানজিট "," ট্রানজিট এ / সি পণ্য ক্রয় এ / সি "));
        arrayList.add(new ContentQuestionModel("এটি দেওয়া হয় যে স্টকের ব্যয় হয় ১০০ রুপি However at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("সামাজিক হিসাবরক্ষণের অর্থ -", "সামাজিক সুবিধাগুলি এবং সামাজিক ব্যয়ের জন্য অ্যাকাউন্টিং", "সরকারী রাজস্ব এবং সরকারী ব্যয়ের জন্য অ্যাকাউন্টিং", "বেসরকারী রাজস্ব এবং ব্যক্তিগত ব্যয়ের জন্য অ্যাকাউন্টিং", "উপরের কিছুই নয়", "সামাজিক সুবিধাগুলি এবং সামাজিক ব্যয়ের জন্য অ্যাকাউন্টিং"));
        arrayList.add(new ContentQuestionModel("মালিক হিসাবে দায়বদ্ধতার হিসাবে অবদানের মূলধনের রেকর্ডিং", "ধারাবাহিকতা", "উদ্বেগের দিকে যাওয়া", "পৃথক সত্তা", "পদার্থ", "পৃথক সত্তা"));
        arrayList.add(new ContentQuestionModel("ভারতীয় অ্যাকাউন্টিং স্ট্যান্ডার্ড - 28 সম্পর্কিত সম্পর্কিত -", "আয়ের উপর ট্যাক্সের জন্য অ্যাকাউন্টিং", "জয়েন্ট ভেঞ্চারে আগ্রহের আর্থিক প্রতিবেদন", "সম্পদের দুর্বলতা  সম্পর্কিত", "বিধান, কন্টিনজেন্ট দায়বদ্ধতা এবং ক্রমাগত সম্পদ", "সম্পদের দুর্বলতা  সম্পর্কিত"));
        arrayList.add(new ContentQuestionModel("অদম্য সম্পদের জন্য অ্যাকাউন্টিং -", "এএস - 10", "এএস - 12", "এএস - 24", "এএস - 26  সম্পর্কিত", "এএস - 26  সম্পর্কিত"));//22
        arrayList.add(new ContentQuestionModel("পিকে সন্স ২০০১ সালের ১ লা অক্টোবর একটি মেশিন কিনে ২,70০,০০০ টাকা ব্যয় করে এবং এর প্রতিষ্ঠানের জন্য ৩০,০০০ রুপি ব্যয় করে। প্রতি বছর মূল ব্যয়ে ১০% অবমূল্যায়ন লেখা থাকে। বইগুলি প্রতি ৩১ শে মার্চ বন্ধ থাকে বছর। মেশিনটি ৩০ সেপ্টেম্বর, ২০০ on সালে ১,৯০,০০০ টাকায় বিক্রি হয়। যন্ত্রপাতি বিক্রয়ে লোকসানের পরিমাণে কত টাকা পি ও এলএ / সিতে স্থানান্তরিত হবে? "," 10,000 ","20,000"," 30,000 " , "40,000", "20,000"));//
        arrayList.add(new ContentQuestionModel("অবচয় মূল্য হ্রাস পদ্ধতি", "গবাদি পশু, আলগা সরঞ্জাম ইত্যাদি", "খনি, ক্যারি, ইত্যাদি", "যন্ত্রপাতি, বিল্ডিং, ইত্যাদি", "খনি  খনির ইত্যাদি  ক্ষেত্রে ব্যবহৃত হয় dep", "খনি  খনির ইত্যাদি  ক্ষেত্রে ব্যবহৃত হয় dep"));
        arrayList.add(new ContentQuestionModel("আরজি লিমিটেড ৪,০০,০০,০০০ টাকার বইয়ের মূল্যের জন্য কেজি কোম্পানির কাছ থেকে যন্ত্রপাতি কিনেছিল। 10% ইস্যু করে এই বিবেচনাটি প্রদান করা হয়েছিল। 20% ছাড়ে প্রতিটি প্রতি 100 ডলার ডিবেঞ্চার হবে। ডিবেঞ্চার অ্যাকাউন্ট জমা দেবে - "," ৪,০০,০০,০০০ "," ৫,০০,০০,০০০ রুপি "," ৩,২০,০০,০০০ "," ৪,৮০,০০,০০০ "," ৪,০০,০০,০০০ "));//25
        arrayList.add(new ContentQuestionModel("বছরের শেষের দিকে একটি সংস্থার বইগুলিতে যে পরিমাণ ভারসাম্য দেখা যায় তা হ'ল সিআরআর এ / সি রুপি ৫০,০০০, সিকিউরিটি প্রিমিয়াম 5000 টাকা, পুনর্নির্ধারণ রিজার্ভ 20,000 টাকা, পি এবং এলএ / সি (ডাঃ) 10,000 টাকা। সর্বাধিক পরিমাণ বোনাস শেয়ার বিতরণের জন্য পাওয়া যাবে - "," ৫০,০০০ টাকা "," ৫৫,০০০ "," ৪৫,০০০ "," ৫ 57,০০০ "," ৫৫,০০০ "));

        arrayList.add(new ContentQuestionModel("সাধারণ আকারের ব্যালেন্স শিট বিশ্লেষণ আমরা মূল্যায়ন করি -", "দুই বছরের মধ্যে বৃদ্ধি বা হ্রাস বিশ্লেষণ করা হয়", "কেবলমাত্র দুই বছরের বেশি বৃদ্ধি বিশ্লেষণ করা হয়", "কেবলমাত্র দুই বছরের বেশি হ্রাস বিশ্লেষণ করা হয়", "সমস্ত সম্পদ এবং দায়বদ্ধতা প্রকাশ করা হয় মোট শতাংশের শর্তাবলী", "সমস্ত সম্পদ এবং দায়বদ্ধতা প্রকাশ করা হয় মোট শতাংশের শর্তাবলী"));
        arrayList.add(new ContentQuestionModel("ব্যালেন্স শিট সমীকরণ ধারণা অনুযায়ী, মূলধনটি হবে -", "মূলধন = দায়বদ্ধতা - সম্পদ", "মূলধন = স্থায়ী সম্পদ - বর্তমান সম্পদ", " মূলধন = সম্পদ - দায়", "মূলধন = সম্পদ + দায়", " মূলধন = সম্পদ - দায়"));
        arrayList.add(new ContentQuestionModel("ব্যালেন্স শিট সমীকরণ ধারণা অনুযায়ী, মূলধনটি হবে -", "মূলধন = দায়বদ্ধতা - সম্পদ", "মূলধন = স্থায়ী সম্পদ - বর্তমান সম্পদ", "মূলধন = সম্পদ - দায়", "মূলধন = সম্পদ + দায়", "মূলধন = সম্পদ - দায়"));
        arrayList.add(new ContentQuestionModel("অ্যাকাউন্টিং শাখা যা সিদ্ধান্ত গ্রহণের জন্য ডেটা প্রসেসিং এবং উপস্থাপনের সাথে সম্পর্কিত --  হিসাবে পরিচিত"  ,"কমন ডলার অ্যাকাউন্টিং", "সামাজিক অ্যাকাউন্টিং", "মূল্য হিসাবরক্ষণ", "পরিচালনা অ্যাকাউন্টিং", "পরিচালনা অ্যাকাউন্টিং"));
        arrayList.add(new ContentQuestionModel("'এজেন্ডা'র উদ্দেশ্য হ'ল অবহিত করা -", "লাভজনকতা এবং ক্রিয়াকলাপ সম্পর্কে", "সংস্থার অগ্রগতি সম্পর্কে", "রুটিন বিষয়গুলি সম্পর্কে", "বৈঠকে ধারাবাহিকভাবে বিষয়টি সম্পর্কে আলোচনা করা", "বৈঠকে ধারাবাহিকভাবে বিষয়টি সম্পর্কে আলোচনা করা"));
        arrayList.add(new ContentQuestionModel("'এজেন্ডা'র উদ্দেশ্য হ'ল অবহিত করা -", "লাভজনকতা এবং ক্রিয়াকলাপ সম্পর্কে", "সংস্থার অগ্রগতি সম্পর্কে", "রুটিন বিষয়গুলি সম্পর্কে", "বৈঠকে ধারাবাহিকভাবে বিষয়টি সম্পর্কে আলোচনা করা", "বৈঠকে ধারাবাহিকভাবে বিষয়টি সম্পর্কে আলোচনা করা"));
        arrayList.add(new ContentQuestionModel("ভারী বীমাগুলির ঝুঁকি হ্রাস করার জন্য বীমাকারী কিছু সংস্থার কাছে অন্য সংস্থার কাছে যায়, তাকে বলা হয় -", "পুনঃ বীমা", "ডাবল বীমা", "যৌথ বীমা নীতি", "পৃথক বীমা", "পুনঃ বীমা"));
        arrayList.add(new ContentQuestionModel("ফায়ার ইন্স্যুরেন্স - এর নীতির উপর ভিত্তি করে তৈরি", "সর্বাত্মক বিশ্বাস", "বীমাযোগ্য আগ্রহ", "ক্ষতিপূরণ", "সহযোগিতা", "ক্ষতিপূরণ"));
        arrayList.add(new ContentQuestionModel("ভারতে জীবন বীমা বছরটি জাতীয়করণ করা হয়েছিল -", "1870", "1956", "1960", "1966", "1956"));
        arrayList.add(new ContentQuestionModel("কোনটি বীমাযোগ্য ঝুঁকি নয়?", "দুর্ঘটনার ঝুঁকি", "ফসলের ঝুঁকি", "নতুন বাজারে ব্যবসায়ের ঝুঁকি", "নতুন বাজারে ব্যবসায়ের ঝুঁকি", "নতুন বাজারে ব্যবসায়ের ঝুঁকি"  ));
        arrayList.add(new ContentQuestionModel("আখ্যান শৈলীতে প্রস্তুত চূড়ান্ত অ্যাকাউন্টগুলি হ'ল -", "উপরের কিছুই নয়", "অ্যাকাউন্ট ফর্ম", "অনুভূমিক ফর্ম", "উল্লম্ব ফর্ম", "উল্লম্ব ফর্ম"));
        arrayList.add(new ContentQuestionModel("এটি দেওয়া হয় যে স্টকের ব্যয় হয় ১০০ রুপি However at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("অবসর গ্রহণকারী নিরীক্ষকের স্থলে নতুন নিরীক্ষক নিয়োগ করা, পদ্ধতি অবলম্বন করার জন্য কোম্পানির আইন, ১৯৫6 এর কোন ধারাটি প্রযোজ্য?", "223", "225", "224", "226", "225"));


        arrayList.add(new ContentQuestionModel("মালিকানা অনুসারে, সরকারী সংস্থাটির অর্থ _________ শেয়ার", "যার পরিশোধিত শেয়ার মূলধন ৪৮%, শেয়ারগুলি সরকারের মালিকানাধীন", "যার পরিশোধিত শেয়ারের মূলধনের ৪৯% শেয়ার সরকারের মালিকানাধীন", "যার পরিশোধিত অংশ শেয়ার মূলধনের ৫০% শেয়ার সরকারের মালিকানাধীন "," যার পরিশোধিত শেয়ার মূলধনের ৫১% শেয়ার সরকারের মালিকানাধীন "," যার পরিশোধিত শেয়ার মূলধনের ৫১% শেয়ার সরকারের মালিকানাধীন "));
        arrayList.add(new ContentQuestionModel("একটি সংস্থার সদস্যদের থেকে আলাদা আইনী অস্তিত্ব রয়েছে।  এই নীতিটি প্রথমে "," সলোমান বনামের ক্ষেত্রে দেওয়া হয়েছিল। সালোমন অ্যান্ড কোং লিমিটেড (1897) "," ডেইমলার কোং লিঃ বনাম কন্টিনেন্টাল টায়ার অ্যান্ড রাবার কোং (১৯১16) "," স্টেট অফ ইউ। পি। ভি। রেনু সাগর পাওয়ার কো (1991) "," সন্তুনু রায় বনাম ইউনিয়ন অব ইন্ডিয়া (1989) "," সলোমান বনামের ক্ষেত্রে দেওয়া হয়েছিল। সালোমন অ্যান্ড কোং লিমিটেড (1897) "));
        arrayList.add(new ContentQuestionModel("অবসর গ্রহণকারী নিরীক্ষকের স্থলে নতুন নিরীক্ষক নিয়োগ করা, পদ্ধতি অবলম্বন করার জন্য কোম্পানির আইন, ১৯৫6 এর কোন ধারাটি প্রযোজ্য?", "223", "225", "224", "226", "225"));
        arrayList.add(new ContentQuestionModel("নিচের কোনটি কোম্পানির নিরীক্ষকের দায়বদ্ধ?", "কোম্পানির হিসাবের বই", "কোম্পানির ভাউচারস", "নিরীক্ষকের কার্যপত্রিকা", "উপরের সমস্ত", "নিরীক্ষকের কার্যপত্রিকা"));
        arrayList.add(new ContentQuestionModel("ব্যাংকিং সংস্থা কর্তৃক গৃহীত নিরীক্ষা হ'ল -", "ধারাবাহিক নিরীক্ষা", "সাময়িক নিরীক্ষা", "অভ্যন্তরীণ নিরীক্ষা", "ব্যালেন্স শীট নিরীক্ষা", "ধারাবাহিক নিরীক্ষা"));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত থেকে কাদের দ্বারা নিরীক্ষক পুনরায় নিযুক্ত হতে পারবেন?", "পরিচালক", "শেয়ারহোল্ডার", "কেন্দ্রীয় সরকার", "উপরের সমস্ত", "উপরের সমস্ত"));
        arrayList.add(new ContentQuestionModel("হিসাবের বইয়ে মিথ্যা অভিযোগের জন্য নিরীক্ষককে ৫৩৯ ধারা অনুসারে সর্বাধিক ____ অবধি কারাদন্ডে দণ্ডিত করা হবে।", "৩ বছর", "৫ বছর", "Years বছর", "৯ বছর", "Years বছর"));
        arrayList.add(new ContentQuestionModel("  নিরীক্ষক কোনও বীমাকারী নন। নিম্নলিখিত কোন ক্ষেত্রে সিদ্ধান্ত নেওয়া হয়েছে?", "কিংস্টন কটন মিলস কোং লিমিটেড (1986)", "লন্ডন এবং জেনারেল ব্যাংক (1895)", "অ্যালেন ক্রেগ অ্যান্ড কোং লিমিটেড (1934)", "আইরিশ উওলান কোং লিমিটেড", "লন্ডন এবং জেনারেল ব্যাংক (1895)"));
        arrayList.add(new ContentQuestionModel("সংস্থাগুলির আইনের ধারা 80 এ - -", "ডিবেঞ্চারস", "পুনঃনির্ধারনীয় অগ্রাধিকার শেয়ার", "অপরিবর্তনীয় অগ্রাধিকার শেয়ার", "উপরের কিছুই নয়", "অপরিবর্তনীয় অগ্রাধিকার শেয়ার"));
        arrayList.add(new ContentQuestionModel("সংস্থা নিরীক্ষক দায়বদ্ধ -", "পরিচালকগণের জন্য", "শেয়ারহোল্ডারদের জন্য", "জনসাধারণের জন্য", "পাওনাদারদের জন্য", "শেয়ারহোল্ডারদের জন্য"));
        arrayList.add(new ContentQuestionModel("ব্যালেন্স শীটে, নিরীক্ষণ অ্যাকাউন্টগুলি নিরীক্ষণ করা হয় -", "মাসিক", "দ্বি-মাসিক", "বার্ষিক বা অর্ধ বার্ষিক", "ত্রৈমাসিক", "বার্ষিক বা অর্ধ বার্ষিক"));
        arrayList.add(new ContentQuestionModel("যাচাইয়ের মধ্যে রয়েছে -", "মূল্যায়ন", "অস্তিত্ব", "মালিকানা এবং শিরোনাম", "উপরের সমস্ত", "উপরের সমস্ত"));


        arrayList.add(new ContentQuestionModel("কোম্পানির আইন, ১৯৫ Act এর তফসিল VI অনুসারে, বাজেয়াপ্ত শেয়ার অ্যাকাউন্ট হবে -", "পরিশোধিত মূলধন যোগ করা হবে", "মূলধন রিজার্ভে যুক্ত হয়েছে", "রাজস্ব রিজার্ভ হিসাবে দেখানো হয়েছে", "কল আপ মূলধন থেকে হ্রাস","কল আপ মূলধন থেকে হ্রাস"));
        arrayList.add(new ContentQuestionModel("নীচে দেওয়া তথ্য থেকে, serviceণ পরিষেবা কভারেজের অনুপাত গণনা করুন সুদের পরে নিট মুনাফা এবং ট্যাক্স ৪০,০০০, অবচয় ৫,০০০ টাকা, আয়করের হার ৫০%, ১০% বন্ধকী entণদাতা 60০,০০০ টাকা। স্থির সুদের চার্জ .,০০০, বকেয়া entণখেলাপি 10%। ,ণ পরিশোধের তহবিল বরাদ্দ 10%। "," 4.06 বার "," 5.06 বার "," 6.06 বার "," 7.06 বার "," 4.06 বার "));
        arrayList.add(new ContentQuestionModel("বর্তমান অনুপাতটি ৩.75৫, এসিড পরীক্ষার অনুপাতটি ১.২৫ স্টক ৩,75৫,০০০ টাকা, কার্যকারী মূলধন গণনা করুন।", "৩,০০,০০০", "৪,০০,০০,০০০", " 4,12,500 রুপি ", "Rs 4 4,25,000 "," 4,12,500 রুপি "));//
        arrayList.add(new ContentQuestionModel("ফার্মের গড় স্টক ৮০,০০০ রুপি, প্রারম্ভিক স্টক বন্ধ স্টকের তুলনায় 10,000 টাকা কম। খোলার স্টক সন্ধান করুন।", "95,000 রুপি", "85,000 রুপি", "90,000", " 75,000 টাকা "," 75,000 টাকা "));//
        arrayList.add(new ContentQuestionModel("ব্যয়ে মোট মুনাফার হার ২৫%। মোট বিক্রয় ১,০০,০০,০০০ এবং গড় স্টক ১,60০,০০০ টাকা। স্টক টার্নওভারের অনুপাত হবে -", "০.০ গুণ", "০.০১ গুণ", "০.৪ গুণ"," 0.5 বার "," 0.5 বার "));//
        arrayList.add(new ContentQuestionModel("যদি বর্তমান অনুপাত ২ হয়, বর্তমান সম্পদ ১,00০০ রুপির, যদি বর্তমান অনুপাত 1.5 এর নিচে নামতে না দেওয়া হয়, স্বল্প মেয়াদী ভিত্তিতে সংস্থার কতটা অতিরিক্ত beণ নেওয়া যায়?", "২, 2,৩৩", "800 রুপি", "600 টাকা", "400 টাকা", "400 টাকা"));//
        arrayList.add(new ContentQuestionModel("মূল্য আয়ের অনুপাত ৮৩.৩৩% এবং ইপিএস ৩০ টাকা। ইক্যুইটি শেয়ারের বাজার মূল্য হবে -", "৩৩.৩৩ রুপি", "রুপি 667. Rs7", " 25 টাকা ", "২০ টাকা", " 25 টাকা "));//33
        arrayList.add(new ContentQuestionModel("মোট বিক্রয় .,,০,০০০ টাকা, নগদ বিক্রয় 30,000 রুপি সংগ্রহের সময়কাল 25 দিন, ব্যালেন্স শিটের torsণখেলাপীরা হবেন -", "৮০,০০০ রুপি", "70০,০০০", ".০,০০০", " 50,000 রুপি "," 50,000 রুপি "));
        arrayList.add(new ContentQuestionModel("নিম্নলিখিত তথ্যগুলি, ২০০ 2006-০7 সালের জন্য উত্পাদনকারী সংস্থার সাথে সম্পর্কিত - পিএলএ / ল / সি-২,৪০,০০০ হিসাবে নিট মুনাফা; অবমূল্যায়ন-৮০,০০০ টাকা; সদিচ্ছার লিখিত ব্যয়-৪০,০০০, বিক্রয়ের উপর লাভ ফিক্সড অ্যাসেটস -১ 16,০০০, প্রস্তাবিত লভ্যাংশ -৯৯,০০০ টাকা। পরিচালনার তহবিলটি হবে - "," ৪,৪০,০০০ "," ৪,০০,০০০ "," .,৪০,০০০ "," উপরের কিছুই নয় "," উপরের কিছুই নয় ")); //35
        arrayList.add(new ContentQuestionModel("তহবিল প্রবাহ বিবরণী প্রস্তুতের উদ্দেশ্যে, তহবিলের অর্থ -", "মোট সম্পদ", "নগদ / ব্যাংক ব্যালেন্স", "বর্তমান সম্পদ", "কার্যকরী মূলধন", "কার্যকরী মূলধন"));
        arrayList.add(new ContentQuestionModel("ক্রয়ের কারণে স্থায়ী সম্পদে বৃদ্ধি হ'ল -", "তহবিলের উত্স", "পরিচালন থেকে তহবিল", "তহবিলের ব্যবহার", "উপরের কিছুই নয়", "তহবিলের ব্যবহার"));

        return arrayList;

    }
    private ArrayList<ListItem> hindiList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("स्वामित्व के अनुसार, सरकारी कंपनी का अर्थ है _________ शेयर", "जिसका भुगतान किया गया शेयर पूंजी का 48% है, शेयरों का स्वामित्व सरकार के पास है "," जिसकी भुगतान की गई शेयर पूंजी का 49% शेयर सरकार के स्वामित्व में हैं ", "जिसका भुगतान किया गया है शेयर कैपिटल के 50% शेयर सरकार के स्वामित्व में हैं "," जिसकी पेड-अप शेयर कैपिटल के 51% शेयर सरकार के स्वामित्व में हैं "," जिसकी पेड-अप शेयर कैपिटल के 51% शेयर सरकार के स्वामित्व में हैं "));
        arrayList.add(new ContentQuestionModel("एक संगठन के सदस्यों से एक अलग कानूनी इकाई है। यह सिद्धांत पहला सामन वी है।", "सैल्मन एंड कंपनी लिमिटेड (1897)", "डेमलर कंपनी लिमिटेड वी। कॉन्टिनेंटल टायर एंड रबर कंपनी (1916)" ,"बनाम। राज्य रेणु सागर पावर कंपनी (1991) "," संतनु रॉय बनाम भारत संघ (1989) ","सैल्मन एंड कंपनी लिमिटेड (1897)"));
        arrayList.add(new ContentQuestionModel("रिटायरिंग ऑडिटर के स्थान पर नए ऑडिटर को नियुक्त करना, प्रक्रिया को अपनाने के लिए, कंपनी अधिनियम, 1956 का कौन सा भाग लागू है?", "223", "225", "224", "226", "225"));
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसके पास कंपनी ऑडिटर का ग्रहणाधिकार है?", "कंपनी के खातों की पुस्तकें", "कंपनी के वाउचर", "ऑडिटर के काम के कागज", "उपरोक्त सभी", "ऑडिटर के काम के कागज"));
        arrayList.add(new ContentQuestionModel("बैंकिंग कंपनी द्वारा अपनाया गया ऑडिट -", "निरंतर ऑडिट", "आवधिक ऑडिट", "आंतरिक ऑडिट", "बैलेंस शीट ऑडिट", "निरंतर ऑडिट"));//
        arrayList.add(new ContentQuestionModel("निम्नलिखित में से किसके द्वारा, ऑडिटर को फिर से नियुक्त किया जा सकता है?", "डायरेक्टर्स", "शेयरहोल्डर्स", "केंद्र सरकार", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("लेखा परीक्षक को धारा 539 के तहत खातों की किताबों में फर्जीवाड़े के लिए ____ की अधिकतम अवधि के लिए कारावास की सजा दी जाएगी।", "3 साल", "5 साल", "7 साल", "9 साल", "7 साल"));
        arrayList.add(new ContentQuestionModel("ऑडिटर एक बीमाकर्ता नहीं है।  निम्नलिखित में से किस मामले में  निर्णय दिया गया है? "," द किंग्स्टन कॉटन मिल्स कंपनी लिमिटेड (1986) "," लंदन एंड जनरल बैंक (1895) "," एलन क्रेग एंड कंपनी लिमिटेड (1934) "," आयरिश वूलेन कंपनी लिमिटेड "," लंदन एंड जनरल बैंक (1895) "));
        arrayList.add(new ContentQuestionModel("कंपनी अधिनियम की धारा 80 ए - से छुटकारा से संबंधित है -", "डिबेंचर", "रिडीमेंबल प्रिफरेंस शेयर", "इरेडिजेबल शेयर", "उपरोक्त में से कोई नहीं", "इरेडिजेबल शेयर"));//9
        arrayList.add(new ContentQuestionModel("कंपनी ऑडिटर जिम्मेदार है -", "निर्देशकों के लिए", "शेयरधारकों के लिए", "जनता के लिए", "लेनदारों के लिए", "शेयरधारकों के लिए"));
        arrayList.add(new ContentQuestionModel("कंपनी ऑडिटर जिम्मेदार है -", "निर्देशकों के लिए", "शेयरधारकों के लिए", "जनता के लिए", "लेनदारों के लिए", "शेयरधारकों के लिए"));
        arrayList.add(new ContentQuestionModel("सत्यापन में शामिल हैं -", "मूल्यांकन", "अस्तित्व", "स्वामित्व और शीर्षक", "उपरोक्त सभी", "उपरोक्त सभी"));
        arrayList.add(new ContentQuestionModel("आंतरिक जांच का अर्थ है" , "कैशियर चेकिंग अकाउंट्स", "आंतरिक ऑडिटर चेकिंग अकाउंट्स", "एक व्यक्ति का काम स्वचालित रूप से दूसरे द्वारा जांचा जाता है", "आंतरिक अधीनस्थों पर आंतरिक नियंत्रण", "एक व्यक्ति का काम स्वचालित रूप से दूसरे द्वारा जांचा जाता है"));//
        arrayList.add(new ContentQuestionModel("निम्न में से जो कमीशन की त्रुटि नहीं है?", "गलत कुल", "गलत राशि के साथ रिकॉर्डिंग", "गलत पोस्टिंग", "पोस्टिंग से बच", "पोस्टिंग से बच"));//
        arrayList.add(new ContentQuestionModel("निम्नलिखित विवरण मार्च 2008 के महीने के लिए विनिर्माण कारखाने से संबंधित हैं। परिवर्तनीय लागत प्रति इकाई रु। 11; स्थिर ओवरहेड रु। 5,40,000; निश्चित विक्रय उपरि रु। 2,52,000; परिवर्तनीय विक्रय लागत रु। 3; बिक्री; प्रति यूनिट रु। 20. रुपये में ब्रेक-इवन पॉइंट का पता लगाएं - "," रु। 26,40,000 "," रु। 30,80,000 ","रु। 25,20,000"," रु। 27,40,000 ", "रु। 25,20,000"));//15
        arrayList.add(new ContentQuestionModel("प्रोपराइटर के फंड पर निवेश / रिटर्न पर गणना की गणना करें। एक फर्म का सकल लाभ रु। 3,20,000 है, परिचालन व्यय 1,00,000 रु।, कर 20,000 रु।, स्वामी का फण्ड 5,00,000 रु।, डिबेंचर ब्याज 50,000 रु। है। "," 20% "," 30% "," 40% "," 50% "," 30% "));
        arrayList.add(new ContentQuestionModel("यदि खरीदे गए सामान पारगमन में हैं, तो अवधि के अंत में जर्नल एंट्री होगी -", "ट्रांजिट ए / सी डॉ में माल आपूर्तिकर्ता के ए / सी", "ट्रांजिट ए / सी डॉ में सामान।  खरीद ए  सी "," सामान ए / सी डॉ को खरीद ए / सी "," आपूर्तिकर्ता के ए / सी डॉ को माल में पारगमन "," सामान ए / सी डॉ को खरीद ए / सी "));//17
        arrayList.add(new ContentQuestionModel("यह दिया गया है कि स्टॉक की लागत 100 रुपये है। हालांकि, इसकी बाजार कीमत 98 रुपये (खरीद) और रुपये (बिक्री) है। यदि बाजार मूल्य को प्रतिस्थापन लागत के रूप में व्याख्या की जाती है, तो स्टॉक का मूल्य होना चाहिए। at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("यह दिया गया है कि स्टॉक की लागत 100 रुपये है। हालांकि, इसकी बाजार कीमत 98 रुपये (खरीद) और रुपये (बिक्री) है। यदि बाजार मूल्य को प्रतिस्थापन लागत के रूप में व्याख्या की जाती है, तो स्टॉक का मूल्य होना चाहिए। at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("पूंजी की रिकॉर्डिंग मालिक द्वारा योगदान के रूप में देयता के सिद्धांत का पालन सुनिश्चित करता है", "संगति", "चिंता जा रही है", "अलग इकाई", "भौतिकता", "अलग इकाई"));
        arrayList.add(new ContentQuestionModel("पूंजी की रिकॉर्डिंग मालिक द्वारा योगदान के रूप में देयता के सिद्धांत का पालन सुनिश्चित करता है", "संगति", "चिंता जा रही है", "अलग इकाई", "भौतिकता", "अलग इकाई"));
        arrayList.add(new ContentQuestionModel("अमूर्त आस्तियों के लिए लेखांकन -", "एएस - 10", "एएस - 12", "एएस - 24", "एएस - 26", "एएस - 26"));
        arrayList.add(new ContentQuestionModel("पीके संस ने 1 अक्टूबर, 2003 को 2,70,000 रुपये की लागत पर एक मशीन खरीदी और इसकी स्थापना पर 30,000 रुपये खर्च किए। हर साल मूल लागत पर मूल्यह्रास 10% प्रतिवर्ष लिखी गई फर्म। किताबें 31 मार्च को बंद हो जाती हैं। वर्ष। मशीन 30 सितंबर, 2006 को 1,90,000 रुपये में बेची गई। मशीनरी की बिक्री पर नुकसान के रूप में पी एंड एलए / सी को कितनी राशि हस्तांतरित की जाएगी? "," 10,000 ","20,000"," 30,000 " , "40,000" ,"20,000"));//
        arrayList.add(new ContentQuestionModel("मूल्यह्रास की निक्षेपण विधि का उपयोग किया जाता है -", "कैटल, ढीले उपकरण, आदि।", "खान, खदान   आदि।", "मशीनरी, भवन, आदि।", "किताबें", "खान, खदान   आदि।"));//
        arrayList.add(new ContentQuestionModel("आरजी लिमिटेड ने 4,00,000 रुपये के बुक वैल्यू के लिए केजी कंपनी से मशीनरी खरीदी। 10% के इश्यू से इस पर ध्यान दिया गया। 20% की छूट पर 100 रुपये का डिबेंचर। डिबेंचर अकाउंट को क्रेडिट कर दिया जाएगा।    ","4,00,000 रुपये।"," 5,00,000 रुपये "," 3,20,000 रुपये "," 4,80,000 रुपये ","4,00,000 रुपये।"));//25
        arrayList.add(new ContentQuestionModel("वर्ष के अंत में एक कंपनी की पुस्तकों में प्रदर्शित शेष राशि सीआरआर ए / सी 50,000 रुपये, सुरक्षा प्रीमियम 5,000 रुपये, रिवॉल्यूशन रिजर्व 20,000 रुपये, पी एंड एलए / सी (डॉ) अधिकतम 10,000 रुपये थे। बोनस शेयर के वितरण के लिए उपलब्ध होगा - "," रु। 50,000 "," रु। 55,000 "," रु। 45,000 "," रु। 57,000 "," रु। 55,000 "));
        arrayList.add(new ContentQuestionModel("कंपनी अधिनियम, 1956 की अनुसूची VI के अनुसार, साझा शेयर खाता होगा -", "भुगतान की गई पूंजी में जोड़ा गया", "पूंजी आरक्षित में जोड़ा गया", " पूंजी कहा जाता है से घटाया ", "पूंजी कहे जाने से घटाया गया"," पूंजी कहा जाता है से घटाया "));//27
        arrayList.add(new ContentQuestionModel("नीचे दी गई जानकारी से, ऋण सेवा कवरेज अनुपात की गणना करें - ब्याज के बाद शुद्ध लाभ और कर 40,000 रु।, मूल्यह्रास रु। 5,000, आयकर की दर 50%, 10% बंधक ऋण रु। 60,000। निश्चित ब्याज शुल्क 6,000 रु। डिबेंचर रिडेम्पशन फंड विनियोजन डिबेंचर 10% का विनियोग। "," 4.06 बार "," 5.06 बार "," 6.06 बार "," 7.06 बार "," 4.06 बार "));
        arrayList.add(new ContentQuestionModel("वर्तमान अनुपात 3.75 है, एसिड टेस्ट अनुपात 1.25 स्टॉक रु। 3,75,000 है, कार्यशील पूंजी की गणना करें।", "रु। 3,00,000", "रु। 4,00,000", " रु। 4,12,500 ", "रु। । 4,25,000 "," रु। 4,12,500 "));//
        arrayList.add(new ContentQuestionModel("फर्म का औसत स्टॉक 80,000 रुपये है, शुरुआती स्टॉक बंद स्टॉक से 10,000 रुपये कम है। शुरुआती स्टॉक खोजें।", "95,000 रुपये "," 85,000 रुपये "," 90,000 रुपये "," 75,000 रु। "," 75,000 रु। "));//
        arrayList.add(new ContentQuestionModel("लागत पर सकल लाभ की दर 25% है। कुल बिक्री 1,00,000 रुपये और औसत स्टॉक 1,60,000 रुपये है। स्टॉक टर्नओवर अनुपात होगा -", " 0.5 गुना ", "0.10 गुना", "0.4" ," 0.8 गुना "," 0.5 गुना "));//
        arrayList.add(new ContentQuestionModel("यदि वर्तमान अनुपात 2 है, तो वर्तमान संपत्ति 1,600 रुपये है, यदि वर्तमान अनुपात 1.5 से नीचे गिरने की अनुमति नहीं है, तो कंपनी द्वारा अल्पावधि के आधार पर कितना अतिरिक्त उधार लिया जा सकता है?", "रु 2,733" , "रु। 800", "रु। 600", "रु। 400", "रु। 400"));
        arrayList.add(new ContentQuestionModel("मूल्य आय अनुपात 83.33% है और ईपीएस 30 रुपये है। इक्विटी शेयर का बाजार मूल्य होगा -", "33.33 रुपये", "रु 66.67", "  25 रु। ", "रु। 20","  25 रु। "));//33
        arrayList.add(new ContentQuestionModel("कुल बिक्री रु। 7,60,000 है, नकद बिक्री रु। 30,000 संग्रह अवधि 25 दिन है, बैलेंस शीट की तारीख में देनदार होंगे -", "रु। 80,000", "रु। 70,000", "रु। 60,000", "रु। 50,000", "रु। 50,000"));//
        arrayList.add(new ContentQuestionModel("निम्नलिखित डेटा, वर्ष 2006-07 के लिए विनिर्माण कंपनी से संबंधित है- पी एंड ला / सी-रु। 2,40,000 के अनुसार शुद्ध लाभ; मूल्यह्रास-रु। 80,000; सद्भावना लिखित-ऑफ-रु। 40,000, बिक्री के लिए लाभ। फिक्स्ड एसेट्स का रु। 16,000, प्रस्तावित लाभांश -96,000 रु। ऑपरेशन से मिलने वाला फंड होगा "," रु। 4,40,000", "रु। 4,00,000", "रु। 6,40,000", "कोई नहीं। उपरोक्त","कोई नहीं। उपरोक्त"));
        arrayList.add(new ContentQuestionModel("फंड फ्लो स्टेटमेंट की तैयारी के लिए, फंड का मतलब है -", "कुल संसाधन", "कैश / बैंक बैलेंस", "करंट एसेट्स", "वर्किंग कैपिटल", "वर्किंग कैपिटल"));
        arrayList.add(new ContentQuestionModel("खरीद के कारण अचल संपत्ति में वृद्धि है -", "फंड का स्रोत", "ऑपरेशन से फंड", "फंड का उपयोग", "उपरोक्त में से कोई नहीं", "फंड का उपयोग"));
        arrayList.add(new ContentQuestionModel("सामान्य आकार में बैलेंस शीट विश्लेषण हम मूल्यांकन करते हैं -", "दो वर्षों में वृद्धि या कमी का विश्लेषण किया जाता है", "केवल दो वर्षों में वृद्धि का विश्लेषण किया जाता है", "केवल दो वर्षों में कमी का विश्लेषण किया जाता है", "सभी संपत्ति और देनदारियों को व्यक्त किया जाता है  कुल के प्रतिशत के संदर्भ में","सभी संपत्ति और देनदारियों को व्यक्त किया जाता है  कुल के प्रतिशत के संदर्भ में"));
        arrayList.add(new ContentQuestionModel("बैलेंस शीट समीकरण अवधारणा के अनुसार, पूंजी होगी -", "पूंजी = देयताएं - परिसंपत्तियां", "पूंजी = निश्चित परिसंपत्तियां - वर्तमान परिसंपत्तियां", "पूंजी = संपत्ति - देयताएं", "पूंजी = परिसंपत्तियां + देयताएं", "पूंजी = संपत्ति - देयताएं"));//39
        arrayList.add(new ContentQuestionModel("कथा शैली में तैयार अंतिम खाते हैं -", "ऊर्ध्वाधर रूप", "लेखा प्रपत्र", "कार्यक्षेत्र रूप", "उपरोक्त में से कोई नहीं", "ऊर्ध्वाधर रूप"));//
        arrayList.add(new ContentQuestionModel("लेखांकन की वह शाखा जो निर्णय लेने के लिए प्रसंस्करण और डेटा प्रस्तुत करने से संबंधित है -", "सामान्य डॉलर लेखांकन", "सामाजिक लेखांकन", "लागत लेखांकन", "प्रबंधन लेखांकन", "प्रबंधन लेखांकन"));
        arrayList.add(new ContentQuestionModel("एजेंडा 'का उद्देश्य सूचित करना है -", "लाभप्रदता और गतिविधि के बारे में", "कंपनी की प्रगति के बारे में", "दिनचर्या के मामलों के बारे में", "बैठक में चर्चा के क्रम में इस मामले के बारे में", "बैठक में चर्चा के क्रम में इस मामले के बारे में"));//
        arrayList.add(new ContentQuestionModel("समुद्री बीमा की सामग्री में शामिल हैं -", "केवल कार्गो का बीमा", "केवल पतवार का बीमा", "बीमा का बीमा, माल ढुलाई और पतवार", "केवल भाड़े का बीमा", "बीमा का बीमा, माल ढुलाई और पतवार"));//43
        arrayList.add(new ContentQuestionModel("भारी बीमा के जोखिम को कम करने के लिए बीमाकर्ता किसी अन्य कंपनी के लिए कुछ व्यवसाय पर गुजरता है, इसे कहा जाता है -", "पुनर्बीमा", "दोहरा बीमा", "संयुक्त बीमा पॉलिसी", "अलग बीमा", "पुनर्बीमा"));
        arrayList.add(new ContentQuestionModel("अग्नि बीमा - के सिद्धांत पर आधारित है -", "परम सद्भाव", "बीमा योग्य ब्याज", "क्षतिपूर्ति", "सहयोग", "क्षतिपूर्ति"));
        arrayList.add(new ContentQuestionModel("भारतीय जीवन बीमा वर्ष में राष्ट्रीयकृत किया गया था -", "1870", "1956", "1960", "1966", "1956"));
        arrayList.add(new ContentQuestionModel("जो एक बीमा योग्य जोखिम नहीं है?", "दुर्घटना जोखिम", "फसल के जोखिम का नुकसान", "नए बाजार में व्यापार का जोखिम", "एक जहाज के डूबने का जोखिम", "नए बाजार में व्यापार का जोखिम"));
        arrayList.add(new ContentQuestionModel("कथा शैली में तैयार अंतिम खाते हैं -", "उपरोक्त में से कोई नहीं", "लेखा प्रपत्र", "क्षैतिज रूप", "ऊर्ध्वाधर रूप", "ऊर्ध्वाधर रूप"));
        arrayList.add(new ContentQuestionModel("यह दिया गया है कि स्टॉक की लागत 100 रुपये है। हालांकि, इसकी बाजार कीमत 98 रुपये (खरीद) और रुपये (बिक्री) है। यदि बाजार मूल्य को प्रतिस्थापन लागत के रूप में व्याख्या की जाती है, तो स्टॉक का मूल्य होना चाहिए। at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("रिटायरिंग ऑडिटर के स्थान पर नए ऑडिटर को नियुक्त करना, प्रक्रिया को अपनाने के लिए, कंपनी अधिनियम, 1956 का कौन सा भाग लागू है?", "223", "225", "224", "226", "225"));

        return arrayList;

    }
    private ArrayList<ListItem> urduList() {
        final ArrayList arrayList = new ArrayList();

        arrayList.add(new ContentQuestionModel("ملکیت کے مطابق گورنمنٹ کمپنی کا مطلب شیئر ہوتا ہے" , "جس کے ادائیگی شدہ حصص کیپٹل کا 48  حصص حکومت کی ملکیت ہوتا ہے" , "جس کے ادائیگی شدہ حصص کیپٹل کے 49 فیصد حصص حکومت کے پاس ہوتے ہیں" , "کس کے ادائیگی والے حصہ دارالحکومت کا ہوتا ہے؟ 50٪ حصص حکومت کی ملکیت ہیں "," جس کے ادائیگی شدہ حصص کیپٹل کے 51٪ حصص حکومت کے پاس ہیں ","جس کے ادائیگی شدہ حصص کیپٹل کے 49 فیصد حصص حکومت کے پاس ہوتے ہیں"));
        arrayList.add(new ContentQuestionModel("  ایک کمپنی اپنے ممبروں سے الگ قانونی وجود رکھتی ہے۔"  ,"صلوان بمقابلہ کی صورت میں پیش کیا گیا تھا۔ سالومان اینڈ کمپنی لمیٹڈ (1897)","    ڈیملر کمپنی لمیٹڈ بمقابلہ۔ کانٹنےنٹل ٹائر اینڈ ربڑ کمپنی (1916) "," ریاستہائے متحدہ امریکہ رینو ساگر پاور کمپنی (1991) "," سنتو رائے بمقابلہ۔ یونین آف انڈیا (1989) ","صلوان بمقابلہ کی صورت میں پیش کیا گیا تھا۔ سالومان اینڈ کمپنی لمیٹڈ (1897)"));
        arrayList.add(new ContentQuestionModel("ریٹائر ہونے والے آڈیٹر کی جگہ پر نیا آڈیٹر مقرر کرنا ، طریقہ کار اپنانے کے لئے ، کمپنیوں کے ایکٹ 1956 کا کون سا سیکشن لاگو ہے؟" , "223" , "225" , "224" , "226","225"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے کون سا کمپنی آڈیٹر کا حقدار ہے؟" , "کمپنی کے حساب کتاب" , "کمپنی کے واؤچرز" , "آڈیٹر کا ورکنگ پیپر" , "مذکورہ بالا سب","آڈیٹر کا ورکنگ پیپر"));
        arrayList.add(new ContentQuestionModel("بینکاری کمپنی کے ذریعہ اختیار کردہ آڈٹ ہے -" , "لگاتار آڈٹ" , "متواتر آڈٹ" , "اندرونی آڈٹ" , "بیلنس شیٹ آڈٹ" ,"لگاتار آڈٹ"));
        arrayList.add(new ContentQuestionModel("درج ذیل میں سے ، کس کے ذریعہ آڈیٹر کو دوبارہ تقرری کیا جاسکتا ہے؟" , "اوپر کا سارا" , "حصص یافتگان" , "مرکزی حکومت" , "مذکورہ بالا سب","اوپر کا سارا"));//6
        arrayList.add(new ContentQuestionModel("آڈیٹر کو دفعہ 539 کے تحت حساب کتاب کی کتابوں میں جعل سازی کے الزام میں زیادہ سے زیادہ ____ کی قید کی سزا ہوگی۔" , "3 سال" , "5 سال" , "7 سال" , "9 سال","7 سال"));
        arrayList.add(new ContentQuestionModel("آڈیٹر بیمہ دہندہ نہیں ہے۔ مندرجہ ذیل میں سے کس میں فیصلہ دیا گیا ہے؟" , "کنگسٹن کاٹن ملز کمپنی لمیٹڈ (1986)" , "لندن اینڈ جنرل بینک (1895)" , "ایلن کریگ اینڈ کمپنی۔ لمیٹڈ (1934) "," آئرش وولن کمپنی لمیٹڈ ","لندن اینڈ جنرل بینک (1895)"));//8
        arrayList.add(new ContentQuestionModel("کمپنیز ایکٹ کا سیکشن 80A" , "ڈیبینچرز" , "قابل ترجیحی حصص"  ," ناقابل ترجیحی ترجیحی حصص "," مذکورہ بالا میں سے کوئی بھی نہیں " ,"قابل ترجیحی حصص"));
        arrayList.add(new ContentQuestionModel("کمپنی آڈیٹر ذمہ دار ہے -" , "ڈائریکٹرز کے لئے" , "حصص یافتگان کے لئے" , "عوام کے لئے" , "قرض دہندگان کے لئے" ,"حصص یافتگان کے لئے"));
        arrayList.add(new ContentQuestionModel("بیلنس شیٹ میں ، آڈٹ اکاؤنٹس کا آڈٹ کیا جاتا ہے -" , "ماہانہ" , "دو ماہانہ" , "سالانہ یا نصف سالانہ" , "سہ ماہی","سالانہ یا نصف سالانہ"));
        arrayList.add(new ContentQuestionModel("توثیق میں شامل ہیں -" , "تشخیص" , "وجود" , "اوپر کا سارا" , "مذکورہ بالا سب","اوپر کا سارا"));
        arrayList.add(new ContentQuestionModel("داخلی جانچ پڑتال کا مطلب ہے -" , "کیشئیر کے ذریعہ اکاؤنٹس کی جانچ پڑتال" , "ایک شخص کے کام کو خود بخود دوسرے کے ذریعہ چیک کرنا" , "ایک دوسرے کے کام سے خود بخود دوسرے شخص کے کام کی جانچ پڑتال" , "ماتحت افراد پر داخلی طور پر انتظامی کنٹرول","ایک شخص کے کام کو خود بخود دوسرے کے ذریعہ چیک کرنا"));//13
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل میں سے جو کمیشن کی غلطی نہیں ہے؟" , "غلط کُل" , "غلط رقم کے ساتھ ریکارڈنگ" , "غلط پوسٹنگ" , "پوسٹنگ سے فرار","پوسٹنگ سے فرار"));
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل تفصیلات مارچ 2008 کے مہینے میں مینوفیکچرنگ فیکٹری سے متعلق ہیں۔ متغیر لاگت فی یونٹ 11 روپے؛ فکسڈ فیکٹری اوورہیڈ 5،40،000 روپے؛ فکسڈ اوور ہیڈ 2،52،000 روپے؛ متغیر فروخت کی قیمت 3 روپے؛ فروخت کی قیمت فی یونٹ 20 روپے۔ روپیوں میں بریک ایون پوائنٹ تلاش کریں - "," 26،40،000 روپے "," 30،80،000 روپے ","Rs. 25,20,000"," 27،40،000 ","Rs. 25,20,000"));
        arrayList.add(new ContentQuestionModel("پرائیوٹر کے فنڈ پر انوسٹمنٹ / ریٹرن پر ریٹرن کا حساب لگائیں۔ کسی فرم کا مجموعی منافع 3،20،000 روپے ، آپریٹنگ اخراجات 1،00،000 روپے ، ٹیکس 20،000 روپے ، مالک کا فنڈ 5،00،000 روپے ، ڈیبینچر سود 50،000 روپے ہے۔ "," 20٪ ","30%"," 40٪ "," 50٪ ","30%"));
        arrayList.add(new ContentQuestionModel("اگر خریدا گیا سامان ٹرانزٹ میں ہے ، تو مدت کے آخر میں جرنل انٹری ہوگی -" , "سامان برائے ٹرانزٹ A / c ڈاکٹر ٹو سپلائر کے A / c" , "سامان برائے ترسیل A / c ڈاکٹر ٹو۔ خریداری A / c ","ٹرانزٹ میں سامان A / c ڈاکٹر سے خریداری A / c"," فراہم کنندہ کا A / c ڈاکٹر سے سامان میں سامان ہے ","ٹرانزٹ میں سامان A / c ڈاکٹر سے خریداری A / c"));
        arrayList.add(new ContentQuestionModel("یہ دیا جاتا ہے کہ اسٹاک کی قیمت 100 روپے ہے۔ تاہم ، اس کی مارکیٹ قیمت 98 روپے (خرید) اور 140 روپیہ (فروخت) ہے۔ اگر مارکیٹ کی قیمت کو متبادل لاگت سے تعبیر کیا جائے تو اسٹاک کی قیمت لگانی چاہئے۔ at - "," 98 "," 100 "," 140 "," 40 "," 98 "));
        arrayList.add(new ContentQuestionModel("سوشل اکاؤنٹنگ کا مطلب ہے -" , "معاشرتی فوائد اور معاشرتی اخراجات کے ل Account اکاؤنٹنگ" , "گورنمنٹ ریونیو اینڈ گورنمنٹ لاگت کے لئے اکاؤنٹنگ" , "نجی محصول اور نجی لاگت کے لئے اکاؤنٹنگ" , "مذکورہ بالا میں سے کوئی بھی نہیں","معاشرتی فوائد اور معاشرتی اخراجات کا محاسب"));//19
        arrayList.add(new ContentQuestionModel("ذمہ داری بطور مالک کے تعاون سے دیئے گئے سرمائے کی ریکارڈنگ" ,"مستقل مزاجی" , "تشویش بڑھ رہی ہے" , "علیحدہ وجود" ,   " کے اصول کی پابندی کو یقینی بناتی ہے۔ ","علیحدہ وجود"));//20
        arrayList.add(new ContentQuestionModel("ہندوستانی اکاؤنٹنگ معیاری۔ 28 کا تعلق" , "آمدنی پر ٹیکسوں کے لing اکاؤنٹنگ" , "مشترکہ منصوبے میں دلچسپی کی مالی رپورٹنگ" , "اثاثوں کی خرابی" , "دفعات ، دستی ذمہ داریوں اور متوقع اثاثوں سے ہے۔","اثاثوں کی خرابی"));
        arrayList.add(new ContentQuestionModel("غیر منقولہ اثاثوں کے لئے اکاؤنٹنگ -" , "AS - 10" , "AS - 12" , "AS - 24" , "AS - 26" ,  "AS - 26"));
        arrayList.add(new ContentQuestionModel("پی کے سنز نے یکم اکتوبر 2003 کو ایک مشین خریدی جس میں 2،70،000 روپے لاگت آئی اور اس کی تنصیب پر 30،000 روپے خرچ ہوئے۔ ہر سال اصل قیمت پر 10 re فرسودگی کم تھی۔ کتابیں ہر سال 31 مارچ کو بند ہوتی ہیں یہ مشین 30 ستمبر ، 2006 کو 1،90،000 روپے میں فروخت کی گئی ہے۔ مشینری کی فروخت پر ہونے والے نقصان کے طور پر پی اینڈ ایل اے / سی کو کتنی رقم منتقل کی جائے گی؟ "," 10،000 ","20,000"," 30،000 ", "40،000","20,000"));//23
        arrayList.add(new ContentQuestionModel("پی کے سنز نے یکم اکتوبر 2003 کو ایک مشین خریدی جس میں 2،70،000 روپے لاگت آئی اور اس کی تنصیب پر 30،000 روپے خرچ ہوئے۔ ہر سال اصل قیمت پر 10 re فرسودگی کم تھی۔ کتابیں ہر سال 31 مارچ کو بند ہوتی ہیں یہ مشین 30 ستمبر ، 2006 کو 1،90،000 روپے میں فروخت کی گئی ہے۔ مشینری کی فروخت پر ہونے والے نقصان کے طور پر پی اینڈ ایل اے / سی کو کتنی رقم منتقل کی جائے گی؟ "," 10،000 ","20,000"," 30،000 ", "40،000","20,000"));
        arrayList.add(new ContentQuestionModel("آر جی لمیٹڈ نے کے جی کمپنی سے کتاب کی قیمت 4،00،000 روپے میں خریدی۔ 10 فیصد کے حساب سے یہ ادائیگی کی گئی۔ 20٪ کی چھوٹ پر 100 روپے کا ڈیبینچر۔ ڈیبینچر اکاؤنٹ کے ذریعے کریڈٹ ہوگا۔ - ","Rs. 4,00,000"," 5،00،000 روپے "," 3،20،000 روپے "," 4،80،000 روپے ","Rs. 4,00,000"));
        arrayList.add(new ContentQuestionModel("سال کے آخر میں کسی کمپنی کی کتابوں میں جو بیلنس نمودار ہوتا ہے وہ تھا CRR A / c 50،000 روپے ، سیکیورٹی پریمیم 5000 روپے ، بحالی ریزرو 20،000 روپے ، پی اینڈ ایل اے / سی (ڈاکٹر) 10،000 روپے۔ زیادہ سے زیادہ رقم بونس شیئر کی تقسیم کے لئے دستیاب "," 50،000 روپے ","Rs. 55,000"," 45،000 "," 57،000 روپے ","Rs. 55,000"));
        arrayList.add(new ContentQuestionModel("کمپنیوں کے ایکٹ 1956 کے شیڈول VI کے مطابق ، ضبط شیئر اکاؤنٹ ہوگا -" , "ادا شدہ سرمایہ میں اضافہ ہوا" , "کیپیٹل ریزرو میں شامل کیا گیا" , "محصولات کے ذخائر کے طور پر دکھایا گیا" , "نام نہاد سرمایے سے کٹوتی","نام نہاد سرمایے سے کٹوتی"));
        arrayList.add(new ContentQuestionModel("ذیل میں دی گئی معلومات سے ، ڈیبٹ سروس کوریج کا تناسب سود اور ٹیکس کے بعد منافع 40،000 روپے ، فرسودگی 5،000 روپے ، انکم ٹیکس کی شرح 50٪ ، 10 فیصد رہن ڈیبینچر 60،000 روپے کا حساب لگائیں۔ فکسڈ انٹرسٹ چارجز 6،000 روپے ، ڈیبینچر چھٹکارا فنڈ مختص ڈیبینچرز کو 10٪۔ ","4.06"," 5.06 بار "," 6.06 بار "," 7.06 بار ","4.06"));
        arrayList.add(new ContentQuestionModel("فرم کا اوسط اسٹاک 80،000 روپے ہے ، افتتاحی اسٹاک بند ہونے والے اسٹاک سے 10 ہزار روپے کم ہے۔ اوپننگ اسٹاک تلاش کریں۔" , "95،000 روپے" , "85،000 روپے" , "90،000 روپے" , "Rs. 75,000"  ,"Rs. 75,000"));
        arrayList.add(new ContentQuestionModel("فرم کا اوسط اسٹاک 80،000 روپے ہے ، افتتاحی اسٹاک بند ہونے والے اسٹاک سے 10 ہزار روپے کم ہے۔ اوپننگ اسٹاک تلاش کریں۔" , "95،000 روپے" , "85،000 روپے" , "90،000 روپے" , "Rs. 75,000" ,"Rs. 75,000"));
        arrayList.add(new ContentQuestionModel("لاگت پر مجموعی منافع کی شرح 25٪ ہے۔ کل فروخت 1،00،000 اور اوسط اسٹاک 1،60،000 روپے ہے۔ اسٹاک کاروبار کا تناسب -" , "0.5 گنا" , "0.10 گنا" , "0.4 گنا "," 0.8 اوقات ","0.5 گنا"));
        arrayList.add(new ContentQuestionModel("اگر موجودہ تناسب 2 ہے تو ، موجودہ اثاثوں کی مالیت 1،600 روپے ہے ، اگر موجودہ تناسب کو 1.5 سے نیچے آنے کی اجازت نہیں دی جاتی ہے تو ، مختصر مدت کی بنیاد پر کمپنی کتنا اضافی قرض لے سکتی ہے؟" , "Rs. 400" ,"800 روپے" , "600 روپے" , "400 روپے","Rs. 400"));
        arrayList.add(new ContentQuestionModel("قیمت کمانے کا تناسب 83.33٪ اور E.P.S. 30 روپے ہے۔ ایکویٹی حصص کی مارکیٹ قیمت" , "33.33" , "66.67 روپے" , "Rs. 25" , "20 روپے","Rs. 25"));
        arrayList.add(new ContentQuestionModel("کل فروخت 7،60،000 روپے ہے ، نقد فروخت 30،000 روپے جمع کرنے کا عرصہ 25 دن ہے ، بیلنس شیٹ کی تاریخ میں قرض دہندگان کی قیمت ہوگی -"  , "80،000 روپے"  , "Rs. 50,000" , "60،000 روپے" , " 50،000 روپ,","Rs. 50,000"));//34
        arrayList.add(new ContentQuestionModel("مندرجہ ذیل اعداد و شمار ، سال 2006-07 کے لئے مینوفیکچرنگ کمپنی سے متعلق ہیں۔ P & L / c-2،40،000 روپے کے مطابق خالص منافع re فرسودگی 80 80،000 ، خیر سگالی تحریری طور پر 40،000 ، فروخت پر منافع فکسڈ اثاثہ 16 16،000 ، مجوزہ ڈیویڈنڈ - 96،000 روپے۔ آپریشن سے ملنے والا فنڈ - "," 4،40،000 "," 4،00،000 روپے "," 6،40،000 "," کوئی نہیں اوپر "," 4،40،000 "));
        arrayList.add(new ContentQuestionModel("فنڈ فلو بیان کی تیاری کے مقصد کے لئے ، فنڈ کا مطلب ہے -" , "کل وسائل" , "کام چلانے کے لیے سرمایہ" , "موجودہ اثاثے" , "ورکنگ سرمایہ","کام چلانے کے لیے سرمایہ"));
        arrayList.add(new ContentQuestionModel("خریداری کی وجہ سے مقررہ اثاثہ میں اضافہ یہ ہے کہ -" ,"فنڈ کا ماخذ" , "فنڈ آف آپریشن" , "فنڈ کا استعمال" , "مذکورہ بالا کوئی بھی نہیں","فنڈ کا استعمال"));
        arrayList.add(new ContentQuestionModel("مشترکہ سائز میں بیلنس شیٹ تجزیہ جس کی ہم تشخیص کرتے ہیں -" , "دو سالوں میں اضافہ یا کمی کا تجزیہ کیا جاتا ہے" , "صرف دو سال سے زیادہ اضافہ کا تجزیہ کیا جاتا ہے" , "صرف دو سالوں میں کمی کا تجزیہ کیا جاتا ہے" , "تمام اثاثوں اور ذمہ داریوں کا اظہار کیا جاتا ہے۔ کل کی فیصد کے لحاظ سے ","صرف دو سالوں میں کمی کا تجزیہ کیا جاتا ہے"));
        arrayList.add(new ContentQuestionModel("بیلنس شیٹ مساوات کے تصور کے مطابق ، دارالحکومت ہو گا -" , "دارالحکومت = واجبات - اثاثے" , "دارالحکومت = فکسڈ اثاثے - موجودہ اثاثے" , "دارالحکومت = اثاثے - واجبات" , "دارالحکومت = اثاثہ + ذمہ داریاں","دارالحکومت = اثاثے - واجبات"));//39
        arrayList.add(new ContentQuestionModel("بیانیہ اسٹائل میں تیار کردہ حتمی اکاؤنٹس میں ہیں -" , "افقی شکل" , "اکاؤنٹس فارم" , "عمودی شکل" , "مذکورہ بالا میں سے کوئی بھی نہیں","عمودی شکل"));
        arrayList.add(new ContentQuestionModel("اکاؤنٹنگ کی برانچ جو فیصلہ سازی کے لئے ڈیٹا کو پروسیسنگ اور پیش کرنے سے متعلق ہے -" , "کامن ڈالر اکاؤنٹنگ" , "سوشل اکاؤنٹنگ" , "لاگت کا اکاؤنٹنگ" , "مینجمنٹ اکاؤنٹنگ","مینجمنٹ اکاؤنٹنگ"));
        arrayList.add(new ContentQuestionModel("'ایجنڈا' کا مقصد مطلع کرنا ہے -" , "منافع اور سرگرمی کے بارے میں" , "کمپنی کی پیشرفت کے بارے میں" , "معمول کے امور کے بارے میں" ,"اجلاس میں ترتیب وار معاملات کے بارے میں" ,"معمول کے امور کے بارے میں"));
        arrayList.add(new ContentQuestionModel("میرین انشورنس کے مشمولات میں شامل ہیں -" , "کارگو ، فریٹ اینڈ ہل کا انشورنس" , "صرف انشورنس آف ہل" , "انشورنس آف کارگو ، فریٹ اینڈ ہل" , "انشورنس صرف فریٹ","کارگو ، فریٹ اینڈ ہل کا انشورنس"));//43
        arrayList.add(new ContentQuestionModel("بھاری بیمہ کے خطرے کو کم کرنے کے ل the ، انشورنس کمپنی کسی کاروبار پر دوسری کمپنی کو منتقل کرتا ہے ، اسے کہا جاتا ہے -" , "انشورنس" , "ڈبل انشورنس" , "جوائنٹ انشورنس پالیسی" , "علیحدہ انشورنس","انشورنس"));
        arrayList.add(new ContentQuestionModel("فائر انشورنس -" , "انتہائی نیک نیتی" , "انشورنس دلچسپی" , "خسارہ" , "تعاون" ,"خسارہ"));//45
        arrayList.add(new ContentQuestionModel("ہندوستان میں لائف انشورنس سال میں قومی شکل دی گئی تھی -" , "1870" , "1956" , "1960" , "1966","1956"));
        arrayList.add(new ContentQuestionModel("کون سا بیمہ خطرہ نہیں ہے؟" , "ایکسیڈنٹ رسک" , "فصلوں کا خطرہ" , "نئی مارکیٹ میں تجارت کا خطرہ" , "بحری جہاز کو ڈوبنے کا خطرہ" ,"نئی مارکیٹ میں تجارت کا خطرہ"));
        arrayList.add(new ContentQuestionModel("بیانیہ اسٹائل میں تیار کردہ حتمی اکاؤنٹس میں ہیں -", "مذکورہ بالا میں سے کوئی بھی نہیں" , "اکاؤنٹس فارم" , "افقی شکل" , "عمودی شکل","عمودی شکل"));
        arrayList.add(new ContentQuestionModel("یہ دیا جاتا ہے کہ اسٹاک کی قیمت 100 روپے ہے۔ تاہم ، اس کی مارکیٹ قیمت 98 روپے (خرید) اور 140 روپیہ (فروخت) ہے۔ اگر مارکیٹ کی قیمت کو متبادل لاگت سے تعبیر کیا جائے تو اسٹاک کی قیمت لگانی چاہئے۔ at - ","98"," 100 "," 140 "," 40 ","98"));
        arrayList.add(new ContentQuestionModel("ریٹائر ہونے والے آڈیٹر کی جگہ پر نیا آڈیٹر مقرر کرنا ، طریقہ کار اپنانے کے لئے ، کمپنیوں کے ایکٹ 1956 کا کون سا سیکشن لاگو ہے؟", "223" , "225" , "224" , "226","225"));


        return arrayList;


    }


}