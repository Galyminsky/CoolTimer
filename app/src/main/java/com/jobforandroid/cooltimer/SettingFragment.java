package com.jobforandroid.cooltimer;


import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;


public class SettingFragment  extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.timer_preferences);
    }
}
