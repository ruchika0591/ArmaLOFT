package com.icat.armaloft;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StandardActivity extends AppCompatActivity {

    public EditText name;
    public Button query_button;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(), "data:"+bundle.getString("some"),Toast.LENGTH_SHORT ).show();
            }
        }



        name=findViewById(R.id.standardname);
        query_button= findViewById(R.id.query_standard);
        result= findViewById(R.id.standardresult);

        query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatabaseAccess2 databaseAccess2=DatabaseAccess2.getInstance(getApplicationContext());
                String n=name.getText().toString();

                String title = databaseAccess2.open(n,getApplicationContext());

             //   String title= databaseAccess1.getBook(n);

                result.setText(title);

                result.setMovementMethod(new ScrollingMovementMethod());

                databaseAccess2.close();
            }
        });



    }
}