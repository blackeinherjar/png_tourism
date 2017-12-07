package com.example.lenovo.Penang_Tourism;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Lenovo on 4/12/2017.
 */

public class SpotsLab {
    private static SpotsLab sSpotsLab;

    private List<Spots> mSpotss;

    public static SpotsLab get(Context context){
        if (sSpotsLab==null){
            sSpotsLab= new SpotsLab(context);
        }
        return sSpotsLab;
    }
    private SpotsLab (Context context){
        mSpotss=new ArrayList<>();
        for(int i =0; i<20;i++){
            if(i==0) {
                Spots spots = new Spots();
                spots.setTitle("Penang Hill");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }
            else if(i==1){
                Spots spots = new Spots();
                spots.setTitle("Penang Historical Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==2){
                Spots spots = new Spots();
                spots.setTitle("Penang War Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==3){
                Spots spots = new Spots();
                spots.setTitle("Escape");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==4){
                Spots spots = new Spots();
                spots.setTitle("Entopia");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==5){
                Spots spots = new Spots();
                spots.setTitle("Batu Ferringhi Beach");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==6){
                Spots spots = new Spots();
                spots.setTitle("The TOP Komtar");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==7){
                Spots spots = new Spots();
                spots.setTitle("Kek Lok Si");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==8){
                Spots spots = new Spots();
                spots.setTitle("Hilltop Temple");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==9){
                Spots spots = new Spots();
                spots.setTitle("Upside Down Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==10){
                Spots spots = new Spots();
                spots.setTitle("Penang National Park");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==11){
                Spots spots = new Spots();
                spots.setTitle("Khoo Kongsi");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==12){
                Spots spots = new Spots();
                spots.setTitle("Penang Botanic Garden");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==13){
                Spots spots = new Spots();
                spots.setTitle("Penang 3D Trick Art Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==14){
                Spots spots = new Spots();
                spots.setTitle("Penang State Musuem and Art Gallery");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==15){
                Spots spots = new Spots();
                spots.setTitle("Made in Penang Interactive Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==16){
                Spots spots = new Spots();
                spots.setTitle("Camera Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==17){
                Spots spots = new Spots();
                spots.setTitle("Wonderfood Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==18){
                Spots spots = new Spots();
                spots.setTitle("Ghost Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==19){
                Spots spots = new Spots();
                spots.setTitle("Penang Hill Owl Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }

            else if (i==20){
                Spots spots = new Spots();
                spots.setTitle("Dark Mansion-3D Glow in the Dark Museum");
                spots.setSolved(i % 2 == 0);
                mSpotss.add(spots);
            }
        }

    }

    public List<Spots> getSpotss() {
        return mSpotss;
    }

    public Spots getSpots(UUID id){
        for(Spots spots : mSpotss){
            if(spots.getId().equals(id)){
                return spots;
            }
        }
        return null;
    }

}
