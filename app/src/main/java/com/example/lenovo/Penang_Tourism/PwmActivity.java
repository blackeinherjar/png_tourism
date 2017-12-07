package com.example.lenovo.Penang_Tourism;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lenovo on 5/12/2017.
 */

public class PwmActivity extends SpotListFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View act = inflater.inflate(R.layout.activity_spot_3, container);
        return act;
    }

}