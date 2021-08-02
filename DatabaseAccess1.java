package com.icat.armaloft;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccess1 {
    public DatabaseOpenHelper1 openHelper1;
    private SQLiteDatabase db;
    private static DatabaseAccess1 instance;
    Cursor c = null;

    private DatabaseAccess1(Context context){
        this.openHelper1= new DatabaseOpenHelper1(context);
    }

    public static DatabaseAccess1 getInstance(Context context){
        if (instance==null){
            instance=new DatabaseAccess1(context);
        }
        return instance;
    }

    public String open(String name,Context context){
        try {
            openHelper1.createDataBase();
            openHelper1.openDataBase();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return openHelper1.getBook(name,context);

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
