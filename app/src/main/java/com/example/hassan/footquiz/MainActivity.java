package com.example.hassan.footquiz;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btnNewPlayer, btnLastPlayer, btnPreviousPlayers;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            btnNewPlayer = (Button)findViewById(R.id.btnNewPlayer);

            btnNewPlayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(MainActivity.this,NewPlayer.class);
                    startActivity(i);

                }
            });


            btnLastPlayer = (Button)findViewById(R.id.btnLastPlayer);

            btnLastPlayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,LastPlayer.class);
                    startActivity(i);
                }
            });


            btnPreviousPlayers = (Button)findViewById(R.id.btnPreviousPlayers);

            btnPreviousPlayers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,PreviousPlayer.class);
                    startActivity(i);
                }
            });


//


        }
}