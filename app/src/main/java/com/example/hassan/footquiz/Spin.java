package com.example.hassan.footquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by hassan on 5/30/16.
 */
public class Spin extends Activity {

    String name_carloancelotti   =   "Carlo Ancelotti";
    String name_diegosimeone     =   "Diego Simeone";
    String name_guardiola        =   "Guardiola";
    String name_joachimlow       =   "Joachim Low";
    String name_josemourinho     =   "Jose Mourinho";
    String name_jurgenklopp      =   "Jürgen Klopp";
    String name_luisenriquez     =   "Luis Henríquez";
    String name_shehata          =   "Shehata";
    String name_unayemri         =   "Unayemri";
    String name_vicentedelbosque =   "Vicente del Bosque";

    String img_carloancelotti   =   "Carlo Ancelotti";
    String img_diegosimeone     =   "Diego Simeone";
    String img_guardiola        =   "Guardiola";
    String img_joachimlow       =   "Joachim Low";
    String img_josemourinho     =   "Jose Mourinho";
    String img_jurgenklopp      =   "Jürgen Klopp";
    String img_luisenriquez     =   "Luis Henríquez";
    String img_shehata          =   "Shehata";
    String img_unayemri         =   "Unayemri";
    String img_vicentedelbosque =   "Vicente del Bosque";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coach);

        // todo Image

         ImageView img_spin = (ImageView) findViewById(R.id.img_spin);

        img_spin.setImageResource(R.drawable.spin);

        // todo Button

        Button btn_One = (Button)findViewById(R.id.btnOne);
        Button btn_Tow = (Button)findViewById(R.id.btnTow);
        Button btn_Tree = (Button)findViewById(R.id.btnTree);
        Button btn_Four = (Button)findViewById(R.id.btnFour);

        final ImageView img_row = (ImageView) findViewById(R.id.img_row);





        float toDegrees = new Random().nextFloat() * Integer.MAX_VALUE % 360;
        final Animation animRotate = new RotateAnimation(0, toDegrees, 50, 50);
        animRotate.setDuration(1000);
        animRotate.setRepeatCount(1);
        animRotate.setRepeatMode(Animation.REVERSE);

        img_spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_row.startAnimation(animRotate);
            }
        });


    }
}
