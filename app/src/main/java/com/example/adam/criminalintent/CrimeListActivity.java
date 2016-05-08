package com.example.adam.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Adam on 2016-05-06.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
