package com.world_tech_point.worldwide_knowledge;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);
    }

}