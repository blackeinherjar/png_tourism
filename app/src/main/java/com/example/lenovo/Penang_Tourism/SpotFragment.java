package com.example.lenovo.Penang_Tourism;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by Lenovo on 3/12/2017.
 */

public class SpotFragment extends Fragment {
    private Spots mSpots;
    private CheckBox mVisitedCheckBox;
    private Button mEnterButton;
    private Context mContext;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mSpots=new Spots();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_spot,container,false);

        mEnterButton=(Button)v.findViewById(R.id.button_enter);
        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (getId()) {
                    case 0: {
                        Intent intent = new Intent(mContext, HillActivity.class);
                        mContext.startActivity(intent);
                        break;
                                                    }
                    case 1: {
                      Intent intent = new Intent(mContext, PhmActivity.class);
                      mContext.startActivity(intent);
                        break;
                    }
                    case 2: {
                        Intent intent = new Intent(mContext, PwmActivity.class);
                        mContext.startActivity(intent);
                        break;
                                                    }

                    case 3: {
                        Intent intent = new Intent(mContext, Escape.class);
                        mContext.startActivity(intent);
                        break;
                    }
                    case 4: {
                        Intent intent = new Intent(mContext, Entopia.class);
                        mContext.startActivity(intent);
                        break;
                    }
                    case 5: {
                        Intent intent = new Intent(mContext, BatuFer.class);
                        mContext.startActivity(intent);
                        break;
                    }
                    case 6: {
                        Intent intent = new Intent(mContext, TOP.class);
                        mContext.startActivity(intent);
                        break;
                    }
                    case 7: {
                        Intent intent = new Intent(mContext, KekLok.class);
                        mContext.startActivity(intent);
                        break;
                    }
                }
            }
        });


                mVisitedCheckBox = (CheckBox) v.findViewById(R.id.spot_visited);
                mVisitedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //Set the spot's visited property
                        mSpots.setSolved(isChecked);
                    }
                });
                return v;
            }
        };



