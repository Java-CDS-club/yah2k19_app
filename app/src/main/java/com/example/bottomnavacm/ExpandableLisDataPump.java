package com.example.bottomnavacm;
//
//public class ExpandableLisDataPump {
//}



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableLisDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> qn1 = new ArrayList<String>();
        qn1.add("Any college-going student with a valid ID card. Engineering, Arts, doesn't matter! You'll have to register as a team though!");

        List<String> qn2 = new ArrayList<String>();
        qn2.add("Rs. 300 per person. We'll take care of all your meals & refreshments! You'll pay this only if you're selected for the on-site round. Online round is free of cost!");

        List<String> qn3 = new ArrayList<String>();
        qn3.add("Your college ID, your phone, laptop, chargers and any electronics you need. A change of clothes is also recommended along with sleeping equipment that you might want. It might get a little cold, so bring warm clothes or a blanket too.");

        List<String> qn4 = new ArrayList<String>();
        qn4.add("Drugs, alcohol, weapons of any kind. If you're unsure of it, ask us about it.");
        List<String> qn5 = new ArrayList<String>();
        qn5.add("You get to meet new people with similar interests, compete to win a massive prize, have opportunities to gain internships or jobs from some cool companies, an amazing learning experience, superb swag and some awesome memories. :)");
        List<String> qn6 = new ArrayList<String>();
        qn6.add("You can have a team of 1-3 members from the same or from different institutions. We recommend having a team with a mix of design and development skills. Don't want to be all code and no talk after all. :P");
        List<String> qn7 = new ArrayList<String>();
        qn7.add("Yes! This is an open hackathon. As long as you stay within the problem statement, you can make a webapp, a mobile app, a software, some data science project or basically anything!");
        List<String> qn8 = new ArrayList<String>();
        qn8.add("Of course! Obviously, your final product should be something original. But no harm in using something to help you achieve that.");
        List<String> qn9 = new ArrayList<String>();
        qn9.add("Our team will evaluate both your abstract to test your problem solving skills as well as your GitHub (Or GitLab or BitBucket or anything else). Based on a combination of both of these, we will shortlist teams.");
        List<String> qn10 = new ArrayList<String>();
        qn10.add("Registrations will close at 10 PM on 11th August. We will announce the shortlisted teams around 10 PM on 12th August. If selected, you'll be expected to make the payment before 14th August.");
        List<String> qn11 = new ArrayList<String>();
        qn11.add("Yes! You will have to bring your own laptops, chargers etc. We will of course provide you with a constant power supply and WiFi.");
        List<String> qn12 = new ArrayList<String>();
        qn12.add("You do! It's completely and fully yours. You can choose to make it open source, form a new company or go to the moon! It's up to YOU!");
        List<String> qn13 = new ArrayList<String>();
        qn13.add("We'll be providing you with lunch & dinner on day 1 and breakfast & lunch on day 2. We'll also have a stash of snacks available for everyone throughout the day. If you're still craving food, you can always visit the Ascendas Food Court. :)");
        List<String> qn14 = new ArrayList<String>();
        qn14.add("Our judges will be evaluating teams on the 3 I's - Innovation(Originality & Creativity of the idea), Implementation(Technical challenge & completeness of the project), and Impact(Business or Social Impact.)");




        expandableListDetail.put("Who can participate?", qn1);
        expandableListDetail.put("How much does it cost?", qn2);
        expandableListDetail.put("What should I bring?", qn3);
        expandableListDetail.put("What shouldn't I bring?", qn4);
        expandableListDetail.put("What do I get?", qn5);
        expandableListDetail.put("How big can my team be?", qn6);
        expandableListDetail.put("Can I build anything I want?", qn7);
        expandableListDetail.put("Can I use libraries or frameworks?", qn8);
        expandableListDetail.put("How will shortlisting be done?", qn9);
        expandableListDetail.put("When is the last date to register?", qn10);
        expandableListDetail.put("Should I bring my own laptop?", qn11);
        expandableListDetail.put("Who owns my final product?", qn12);
        expandableListDetail.put("What about food?", qn13);
        expandableListDetail.put("What is the judging criteria?", qn14);


        return expandableListDetail;
    }
}
