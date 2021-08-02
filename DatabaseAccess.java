package com.icat.armaloft;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseAccess {
    public DatabaseOpenHelper openHelper0;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

    private DatabaseAccess(Context context){
        this.openHelper0= new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if (instance==null){
            instance=new DatabaseAccess(context);
        }
        return instance;
    }

    public String open(String name,Context context){
        try {
            openHelper0.createDataBase();
            openHelper0.openDataBase();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return openHelper0.getAddress(name,context);


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

   /* public String getAddress(String name){
        c=db.rawQuery("select Address from Armasheet1 where name= '"+name+"'", new String[]{});
        StringBuffer buffer= new StringBuffer();
        while (c.moveToNext()){
            String address= c.getString(0);
            buffer.append(""+address);

        }
        return buffer.toString();
    }*/




}
