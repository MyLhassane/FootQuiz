package com.example.hassan.footquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hassan on 5/30/16.
 */
public class NewPlayer extends Activity {

    DB_Sqlit db= new DB_Sqlit(this);

    EditText name, ID;
    TextView score;
    ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_player);

        name = (EditText)findViewById(R.id.inputNew);
        score = (TextView) findViewById(R.id.txtScore);
    }

    public void btn_add_data(View view) {

        String Name = name.getText().toString();

        String Score = score.getText().toString();

        Boolean result = db.inserData(Name, Score );

        if (result == true) {

            Intent i = new Intent(NewPlayer.this,Start.class);
//            i.putExtra(db.DBname,Name);
//            i.putExtra(db.DBname,Score);

//            Toast.makeText(NewPlayer.this, Name + "", Toast.LENGTH_SHORT).show();

            startActivity(i);

        }else {
            Toast.makeText(NewPlayer.this, "NO", Toast.LENGTH_SHORT).show();
        }
    }
}
