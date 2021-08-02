package com.icat.armaloft;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
//import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;
import com.smarteist.autoimageslider.SliderView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    SliderView sliderView;
    List<ImageSliderModel>imageSliderModelList;



    private Button button;
    InputStream inputStream;

    String[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        //Viewf

        imageSliderModelList= new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

        imageSliderModelList.add(new ImageSliderModel(R.drawable.bg3));

        imageSliderModelList.add(new ImageSliderModel(R.drawable.bg3));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.bg3));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.bg3));

        sliderView.setSliderAdapter(new ImageSliderAdapter(this,imageSliderModelList));






        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        //TextView txt = findViewById(R.id.text);
        // txt.setSelected(true);
        /*inputStream = getResources().openRawResource(R.raw.appdemo2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null)
            {
                data=csvLine.split(",");
                try{

                    //Log.e("Data ",""+data[0]) ;
                    Log.e("Data ","  "+data[0]+"  "+data[1]+"  "+data[2]) ;

                }catch (Exception e){
                    Log.e("Problem",e.toString());
                }
            }
        }
        catch (IOException ex) {
            throw new RuntimeException("Error in reading CSV file: "+ex);
        }*/
    }

    public void openActivity2(){
        Intent intent= new Intent(this,MainActivity2.class);
        startActivity(intent);
    }






    public void DRDO(View view){
        openUrl("https://drdolibrary.in/#/home");

    }
    public void desidoc(View view){
        openUrl("https://publications.drdo.gov.in/ojs/index.php/djlit");

    }public void rac(View view){
        openUrl("https://rac.gov.in/index.php?lang=en&id=0");

    }


    public void openUrl(String url) {
        Uri uri= Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }


}