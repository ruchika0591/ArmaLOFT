package com.icat.armaloft;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

//import com.example.armaloft1.ui.gallery.GalleryFragment;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.SliderView;

import java.io.InputStream;
import java.util.List;

public class MainActivity4 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    GoogleSignInClient mGoogleSignInClient;



    SliderView sliderView;
    List<ImageSliderModel> imageSliderModelList;



    private Button button;
    InputStream inputStream;

    String[] data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);




        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer= findViewById(R.id.drawer_layout);
        NavigationView navigationView= findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle( this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GalleryFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_homepg);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dictionary:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DictionaryFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_homepg:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GalleryFragment()).addToBackStack(null).commit();
                break;

            case R.id.nav_pic:
                Intent in2 = new Intent( this, PicsActivity.class);

                startActivity(in2);

                break;

            case R.id.nav_links:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LinkFragment()).addToBackStack(null).commit();
                break;

            case R.id.nav_csd:
                startActivity(new Intent(MainActivity4.this,CsdActivity.class));
                break;
            case R.id.nav_members:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MemberFragment()).addToBackStack(null).commit();
                break;

            case R.id.nav_books:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Book_standardFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_standards:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Book_standardFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_info:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutusFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_call:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CallFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_contactUs:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactUsFragment()).addToBackStack(null).commit();
                break;
            case R.id.nav_bday:
                startActivity(new Intent(MainActivity4.this,BdayActivity.class));
                 break;
            case R.id.nav_logout:
                mGoogleSignInClient.signOut()
                        .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                // ...
                                Toast.makeText(MainActivity4.this, "Signed Out", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MainActivity4.this,LoginActivity.class));
                                finish();
                            }
                        });
                break;

            case R.id.nav_share:
                Intent shareintent= new Intent();
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.icat.armaloft");
                shareintent.setType("text/plain");
                startActivity(Intent.createChooser(shareintent, "share via"));
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}