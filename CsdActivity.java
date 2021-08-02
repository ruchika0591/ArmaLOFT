package com.icat.armaloft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CsdActivity extends AppCompatActivity {

    TextView txtMarquee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csd);



        // casting of textview
        txtMarquee = (TextView) findViewById(R.id.marqueeText);

        // Now we will call setSelected() method
        // and pass boolean value as true
        txtMarquee.setSelected(true);


        Button button =findViewById(R.id.csdBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent( CsdActivity.this, PdfActivity.class);

                startActivity(in2);
            }
        });

    }
    public void browser(View view){
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://afd.csdindia.gov.in/"));

        startActivity(browser);

    }
}