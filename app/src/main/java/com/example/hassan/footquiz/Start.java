package com.example.hassan.footquiz;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by hassan on 5/30/16.
 */
public class Start extends Activity {

    DB_Sqlit db= new DB_Sqlit(this);

    ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        // Welcome User

        TextView Welcome = (TextView) findViewById(R.id.txtWelcomeUser);
        TextView Score = (TextView) findViewById(R.id.txtScoreUser);

        SQLiteDatabase db;

        db = openOrCreateDatabase(
                "data.db"
                , SQLiteDatabase.CREATE_IF_NECESSARY
                , null
        );
        db.setVersion(3);

        Cursor cur = db.query("stable order by id desc limit 1",
                null, null, null, null, null, null);
        cur.moveToFirst();
        while (cur.isAfterLast() == false) {
            Welcome.append(cur.getString(1));
            Score.append(cur.getString(2));
            cur.moveToNext();
        }
        cur.close();






    ImageView coach = (ImageView)findViewById(R.id.icoach);

        coach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Start.this,Coach.class);
                startActivity(i);
            }
        });


        ImageView Player = (ImageView)findViewById(R.id.iplayer);

        Player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Start.this,Player.class);
                startActivity(i);
            }
        });


        ImageView International = (ImageView)findViewById(R.id.international);

        International.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Start.this,International.class);
                startActivity(i);
            }
        });


        ImageView National = (ImageView)findViewById(R.id.national);

        National.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Start.this,National.class);
                startActivity(i);
            }
        });

//


    }
}
