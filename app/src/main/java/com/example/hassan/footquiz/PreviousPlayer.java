package com.example.hassan.footquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hassan on 5/30/16.
 */
public class PreviousPlayer extends Activity {

    DB_Sqlit db = new DB_Sqlit(this);

    EditText name, ID;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.previous_player);

        lst = (ListView)findViewById(R.id.listView);

        ShowData();

    }
    //  Show
    public void ShowData(){
        ArrayList<String> listDada = db.getAllrecord();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listDada);
        lst.setAdapter(arrayAdapter);
    }

}
