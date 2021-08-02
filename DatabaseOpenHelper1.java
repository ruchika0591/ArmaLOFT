package com.icat.armaloft;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseOpenHelper1 extends SQLiteOpenHelper {


    private static String DB_PATH = "";
    private SQLiteDatabase myDataBase;
    private final Context myContext;
    private SQLiteOpenHelper sqLiteOpenHelper;

    private static final String DATABASE_NAME="book.sqlite";
    private static final int DATABASE_VERSION=1;


    public DatabaseOpenHelper1(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.myContext = context;
        DB_PATH = myContext.getDatabasePath(DATABASE_NAME).getAbsolutePath()
                .toString();
    }



        public void createDataBase()
                throws IOException
        {

            boolean dbExist = checkDataBase();

            if (dbExist) {
                // do nothing - database already exist
            }
            else {
                // By calling this method and
                // the empty database will be
                // created into the default system
                // path of your application
                // so we are gonna be able
                // to overwrite that database
                // with our database.
                this.getWritableDatabase();
                try {
                    copyDataBase();
                }
                catch (IOException e) {
                    throw new Error(
                            "Error copying database");
                }
            }
        }
        // Check if the database already exist
        // to avoid re-copying the file each
        // time you open the application
        // return true if it exists
        // false if it doesn't.
        private boolean checkDataBase()
        {
            SQLiteDatabase checkDB = null;
            try {
                String myPath = DB_PATH;
                checkDB
                        = SQLiteDatabase
                        .openDatabase(
                                myPath, null,
                                SQLiteDatabase.OPEN_READONLY);
            }
            catch (SQLiteException e) {

                // database doesn't exist yet.
                Log.e("message", "" + e);
            }
            if (checkDB != null) {
                checkDB.close();
            }
            return checkDB != null;
        }

        /**
         * Copies your database from your
         * local assets-folder to the just
         * created empty database in the
         * system folder, from where it
         * can be accessed and handled.
         * This is done by transferring bytestream.
         * */
        private void copyDataBase()
                throws IOException
        {
            // Open your local db as the input stream
            InputStream myInput
                    = myContext.getAssets()
                    .open(DATABASE_NAME);

            // Path to the just created empty db
            String outFileName = DB_PATH;

            // Open the empty db as the output stream
            OutputStream myOutput
                    = new FileOutputStream(outFileName);

            // transfer bytes from the
            // inputfile to the outputfile
            byte[] buffer = new byte[1024];
            int length;
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }

            // Close the streams
            myOutput.flush();
            myOutput.close();
            myInput.close();
        }

        public void openDataBase()
                throws SQLException
        {
            // Open the database
            String myPath = DB_PATH;
            myDataBase = SQLiteDatabase
                    .openDatabase(
                            myPath, null,
                            SQLiteDatabase.OPEN_READONLY);
        }

        @Override
        public synchronized void close()
        {
            // close the database.
            if (myDataBase != null)
                myDataBase.close();
            super.close();
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            // It is an abstract method
            // but we define our own method here.
        }

        @Override
        public void onUpgrade(SQLiteDatabase db,
                              int oldVersion,
                              int newVersion)
        {
            // It is an abstract method which is
            // used to perform different task
            // based on the version of database.
        }

        public String getBook(String name,Context context){
            StringBuffer buffer= new StringBuffer();


            try
            {

                sqLiteOpenHelper
                        = new DatabaseOpenHelper1(context);
                SQLiteDatabase db
                        = sqLiteOpenHelper
                        .getWritableDatabase();



            Cursor c = null;
            c=db.rawQuery("select Title from books where Title like '%" + name + "%'", new String[]{});

            while (c.moveToNext()) {
                String title = c.getString(0);
                buffer.append("" + title+" is available"+"\n\n");
            }}
            catch(Exception e)
                {
                    Log.d("a", "getBook: "+e.getMessage());
                }


        return buffer.toString();
    }

}



