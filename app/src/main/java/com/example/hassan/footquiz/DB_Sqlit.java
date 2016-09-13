package com.example.hassan.footquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.util.ArrayList;

/**
 * Created by hassan on 6/18/16.
 */
public class DB_Sqlit extends SQLiteOpenHelper {

    public static final String DBname = "data.db";

    public DB_Sqlit(Context context) {
        super(context, DBname, null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table stable ( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, score TEXT) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS stable");
        onCreate(db);

    }

    public boolean inserData(String name, String score)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("score", score);
        long  result = db.insert("stable", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }



    public ArrayList getAllrecord(){
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery("select * from stable",null);

        res.moveToFirst();

        while (res.isAfterLast()==false){
            //arrayList.add(res.getString(res.getColumnIndex("NAME")));
            String t1 = res.getString(0);
            String t2 = res.getString(1);
            String t3 = res.getString(2);
            arrayList.add( t1 +" Name : "+ t2 + " - "+ t3);
            res.moveToNext();

        }
        return arrayList;
    }












    public boolean updateData(String id,String name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        db.update("stable",contentValues, "id= ?",new String[] {id});
        return true;
    }

    public Integer Delete(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("stable","id = ?",new String[]{id});
    }

}
