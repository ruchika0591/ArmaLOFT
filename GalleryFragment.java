package com.icat.armaloft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.icat.armaloft.R;


public class GalleryFragment extends Fragment {
    Button B1;
    public  GalleryFragment(){}



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);


        Button ID = (Button) rootView.findViewById(R.id.ClickButton);
        ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                DictionaryFragment NAME = new DictionaryFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID1 = (Button) rootView.findViewById(R.id.ClickButton1);
        ID1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AboutusFragment NAME1 = new AboutusFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME1).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        Button ID2 = (Button) rootView.findViewById(R.id.ClickButton2);
        ID2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                LinkFragment NAME2 = new LinkFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME2).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        Button ID6 = (Button) rootView.findViewById(R.id.ClickButton6);
        ID6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Book_standardFragment NAME6 = new Book_standardFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME6).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID3 = (Button) rootView.findViewById(R.id.ClickButton3);
        ID3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DirectorFragment NAME3 = new DirectorFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME3).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        Button ID4 = (Button) rootView.findViewById(R.id.ClickButton4);
        ID4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                MemberFragment NAME4 = new MemberFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME4).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        Button ID5 = (Button) rootView.findViewById(R.id.ClickButton5);
        ID5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ExhibitionFragment NAME5 = new ExhibitionFragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME5).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });









        return rootView;
    }
}