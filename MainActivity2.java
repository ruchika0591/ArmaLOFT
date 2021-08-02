package com.icat.armaloft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public EditText name;
    public Button query_button;
    public TextView result_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(), "data:"+bundle.getString("some"),Toast.LENGTH_SHORT ).show();
            }
        }



        name=findViewById(R.id.name);
        query_button= findViewById(R.id.query_button);
        result_address= findViewById(R.id.result);

        query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
                String n=name.getText().toString();

                String title = databaseAccess.open(n,getApplicationContext());

                //   String title= databaseAccess1.getBook(n);

                result_address.setText(title);
                result_address.setMovementMethod(new ScrollingMovementMethod());

                databaseAccess.close();
            }
        });



    }
}