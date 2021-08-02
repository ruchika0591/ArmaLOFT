package com.icat.armaloft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.text.method.ScrollingMovementMethod;

public class BookActivity extends AppCompatActivity {

    public EditText name;
    public Button query_button;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(), "data:"+bundle.getString("some"),Toast.LENGTH_SHORT ).show();
            }
        }



        name=findViewById(R.id.bookname);
        query_button= findViewById(R.id.query_book);
        result= findViewById(R.id.bookresult);

        query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatabaseAccess1 databaseAccess1=DatabaseAccess1.getInstance(getApplicationContext());
                String n=name.getText().toString();

                String title = databaseAccess1.open(n,getApplicationContext());

             //   String title= databaseAccess1.getBook(n);

                result.setText(title);
                result.setMovementMethod(new ScrollingMovementMethod());

                databaseAccess1.close();
            }
        });



    }
}