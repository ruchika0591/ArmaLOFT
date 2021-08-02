package com.icat.armaloft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LinkFragment extends Fragment{
    Button B1;
    public  LinkFragment(){}



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_links, container, false);


        Button ID62 = (Button) rootView.findViewById(R.id.ClickButton12);
        ID62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link1Fragment NAME = new Link1Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID72 = (Button) rootView.findViewById(R.id.ClickButton22);
        ID72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link2Fragment NAME = new Link2Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        Button ID28 = (Button) rootView.findViewById(R.id.ClickButton23);
        ID28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link3Fragment NAME = new Link3Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID29 = (Button) rootView.findViewById(R.id.ClickButton24);
        ID29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link4Fragment NAME = new Link4Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID30 = (Button) rootView.findViewById(R.id.ClickButton25);
        ID30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link5Fragment NAME = new Link5Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID31 = (Button) rootView.findViewById(R.id.ClickButton26);
        ID31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link6Fragment NAME = new Link6Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID32 = (Button) rootView.findViewById(R.id.ClickButton27);
        ID32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link7Fragment NAME = new Link7Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID33 = (Button) rootView.findViewById(R.id.ClickButton28);
        ID33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link8Fragment NAME = new Link8Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID34 = (Button) rootView.findViewById(R.id.ClickButton29);
        ID34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link9Fragment NAME = new Link9Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID35 = (Button) rootView.findViewById(R.id.ClickButton30);
        ID35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link10Fragment NAME = new Link10Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Button ID36 = (Button) rootView.findViewById(R.id.ClickButton31);
        ID36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Link11Fragment NAME = new Link11Fragment();
                fragmentTransaction.replace(R.id.fragment_container, NAME).addToBackStack(null);
                fragmentTransaction.commit();

            }
        });












        return rootView;

    }


}
