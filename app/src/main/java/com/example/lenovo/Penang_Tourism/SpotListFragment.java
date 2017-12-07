package com.example.lenovo.Penang_Tourism;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by Lenovo on 4/12/2017.
 */

public class SpotListFragment extends Fragment {

    private RecyclerView mSpotRecyclerView;
    private SpotAdapter mAdapter;
    private Context mContext;
    private Button mEnterButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_spot_list,container,false);

        mSpotRecyclerView=(RecyclerView) view.
                findViewById(R.id.spot_recycler_view);
        mSpotRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;


    }

    private void updateUI(){
        SpotsLab spotsLab=SpotsLab.get(getActivity());

        List<Spots> spotss= spotsLab.getSpotss();

        mAdapter=new SpotAdapter(spotss);
        mSpotRecyclerView.setAdapter(mAdapter);
    }

    private class SpotHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{

        private TextView mTitleTextView;
        private CheckBox mVisitedCheckBox;

        private Spots mSpots;




        public void bindSpots(Spots spots){
            mSpots=spots;

            mTitleTextView.setText(mSpots.getTitle());
            mVisitedCheckBox.setChecked(mSpots.isSolved());


        }

        public SpotHolder(View itemView){
            super(itemView);

            itemView.setOnClickListener(this);

            mTitleTextView=(TextView) itemView.findViewById(R.id.list_item_spot_title_text_view);

            mVisitedCheckBox=(CheckBox)
                    itemView.findViewById(R.id.list_item_spot_visited_check_box);
            mEnterButton=(Button)itemView.findViewById(R.id.button_enter);

        }


        @Override
        public void onClick(View v){
            Toast.makeText(getActivity(),mSpots.getTitle()+ " Clicked!",Toast.LENGTH_SHORT)
                    .show();
        }
    }


    private class SpotAdapter extends RecyclerView.Adapter<SpotHolder>{
        private List<Spots> mSpotss;


        public SpotAdapter(List<Spots> spotss){
            mSpotss=spotss;
        }

        @Override
        public SpotHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(R.layout.list_item_spots,parent,false);
            return new SpotHolder(view);
        }
        @Override
        public void onBindViewHolder(SpotHolder holder,int position){
            Spots spots = mSpotss.get(position);
            holder.bindSpots(spots);
        }

        @Override
        public int getItemCount(){
            return mSpotss.size();
        }
    }
}
