package com.example.lenovo.Penang_Tourism;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class home_page extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new SpotFragment();
    }
}
