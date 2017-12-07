package com.example.lenovo.Penang_Tourism;

import android.support.v4.app.Fragment;

/**
 * Created by Lenovo on 4/12/2017.
 */

public class SpotListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new SpotListFragment();
    }
}
