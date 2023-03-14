package com.improve10x.recyclerviewexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GmailActivity extends AppCompatActivity {
    public GmailItems[] gmailItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
    }

    private void initViews() {
        gmailItems = new GmailItems[6];

        gmailItems[0] = new GmailItems();
        gmailItems[0].imageUrl = "sample";
        gmailItems[0].contactName = "Lisa Paik";
        gmailItems[0].description = "Volunteering at the Lakestone student art..." +
                "Hi Julia! Thank you for your interest in volun...";
        gmailItems[0].timeAndDate = "3.43PM";

        gmailItems[1] = new GmailItems();
        gmailItems[1].imageUrl = "sample";
        gmailItems[1].contactName = "Elena Casarosa";
        gmailItems[1].description = "Portrait special" +
                "We'd likme to announce a holiday portrait spe...";
        gmailItems[1].timeAndDate = "11.24AM";

        gmailItems[2] = new GmailItems();
        gmailItems[2].imageUrl = "sample";
        gmailItems[2].contactName = "Medium Daily Digest";
        gmailItems[2].description = "*7 Drawings to make you feel better.publi..." +
                "Medium Daily Digest Get Medium for iOS or...";
        gmailItems[2].timeAndDate = "6.30AM";

        gmailItems[3] = new GmailItems();
        gmailItems[3].imageUrl = "sample";
        gmailItems[3].contactName = "Grace Ellington";
        gmailItems[3].description = "Volunteer opportunity" +
                "I would like to inform you of a volunteer op...";
        gmailItems[3].timeAndDate = "Nov 19";

        gmailItems[4] = new GmailItems();
        gmailItems[4].imageUrl = "sample";
        gmailItems[4].contactName = "Henri Rousseau";
        gmailItems[4].description = "Niagra fails pictures" +
                "Julia,Here are the pictures of Nigara Falls y...";
        gmailItems[4].timeAndDate = "@Nov 19";

        gmailItems[5] = new GmailItems();
        gmailItems[5].imageUrl = "sample";
        gmailItems[5].contactName = "Lisa Paik";
        gmailItems[5].description = "Lakestone student art exbihition" +
                "you're invited to Lakestone's annual studen...";
        gmailItems[5].timeAndDate = "Nov 19";

    }
}