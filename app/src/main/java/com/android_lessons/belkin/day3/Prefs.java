package com.android_lessons.belkin.day3;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Belkin on 17.04.2015.
 */
public class Prefs extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
