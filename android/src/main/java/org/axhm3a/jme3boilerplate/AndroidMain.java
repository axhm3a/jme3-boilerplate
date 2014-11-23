package org.axhm3a.jme3boilerplate;

import android.os.Bundle;
import com.jme3.app.AndroidHarness;

/**
 * Created by axhm3a on 23.11.14.
 */
public class AndroidMain extends AndroidHarness {
    public AndroidMain() {
        appClass = "org.axhm3a.jme3boilerplate.Main";
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
