package com.example.hassan.footquiz;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hassan on 5/30/16.
 */
public class Coach  extends Activity {

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




//        final ImageView img_coach = (ImageView) findViewById(R.id.img_coach);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            img_coach.setImageDrawable(getDrawable(R.drawable.carloancelotti));
//        }


        // todo Button change color carlo Ancelotti

        final Button vbcarloAncelotti = (Button) findViewById(R.id.bcarloAncelotti);

        assert vbcarloAncelotti != null;
        vbcarloAncelotti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vbcarloAncelotti.setBackgroundColor(Color.GREEN);
            }
        });

        // find for any ware

        // fixme Button change color Diego Simeone

        final Button vbDiegoSimeone = (Button) findViewById(R.id.bDiegoSimeone);

        assert vbDiegoSimeone != null;
        vbDiegoSimeone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vbDiegoSimeone.setBackgroundColor(Color.RED);
                vbcarloAncelotti.setBackgroundColor(Color.YELLOW);
            }
        });

        //

        // Button change color Diego Simeone

        final Button vbGuardiola = (Button) findViewById(R.id.bGuardiola);

        assert vbGuardiola != null;
        vbGuardiola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vbGuardiola.setBackgroundColor(Color.RED);
                vbcarloAncelotti.setBackgroundColor(Color.YELLOW);
            }
        });

        //

        // Button change color Diego Simeone

        final Button vbjoachimLow = (Button) findViewById(R.id.bjoachimLow);

        assert vbjoachimLow != null;
        vbjoachimLow.setOnClickListener(new              View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vbjoachimLow.setBackgroundColor(Color.RED);
                vbjoachimLow.setBackgroundColor(Color.YELLOW);
            }
        });

        //

    }
}
