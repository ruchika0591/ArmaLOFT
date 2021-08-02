package com.icat.armaloft;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccess3 {
    public DatabaseOpenHelper3 openHelper3;
    private SQLiteDatabase db;
    private static DatabaseAccess3 instance;
    Cursor c = null;

    private DatabaseAccess3(Context context){
        this.openHelper3= new DatabaseOpenHelper3(context);
    }

    public static DatabaseAccess3 getInstance(Context context){
        if (instance==null){
            instance=new DatabaseAccess3(context);
        }
        return instance;
    }

    public String open(String name, Context context){
        try {
            openHelper3.createDataBase();
            openHelper3.openDataBase();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return openHelper3.getebooks(name,context);

       // return openHelper.getBook(name,context);


        /*try
        {
        this.db=openHelper.getWritableDatabase();}
        catch(Exception e) {
            Log.w("abc", "Error "+ e.getMessage() );
        }
*/

    }

    public void close(){
        if (db!=null){
            this.db.close();
        }
    }


/*
    public String getBook(String name)
    {
        return openHelper.getBook(name);
    }




    {
        StringBuffer buffer = new StringBuffer();

        try {
            c = db.rawQuery("select Title from books", new String[]{});
            while (c.moveToNext()) {
                String title = c.getString(0);
                buffer.append("" + title);

            }
        }
        catch(Exception e) {
            Log.d("s", "getBook: "+e.getMessage());

        }

        return buffer.toString();
    }*/


}
