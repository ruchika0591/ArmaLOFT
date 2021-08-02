package com.icat.armaloft;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Book_standardFragment extends Fragment{




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_standard,container,false);

        Button btnOpen = (Button) view.findViewById(R.id.bookBtn);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent( getActivity(), BookActivity.class);
                in.putExtra("loading","Book database");
                startActivity(in);
            }
        });

        Button btnOpen2 = (Button) view.findViewById(R.id.ebookBtn);
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Intent in = new Intent(getActivity(), EBookActivity.class);
                    in.putExtra("loading", "eBook database");
                    startActivity(in);
                }
                catch (Exception e){
                    Log.d("TAG", "onClick: " + e.getMessage());
                }
            }
        });

        Button btnOpen1 = (Button) view.findViewById(R.id.standardBtn);
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent in = new Intent(getActivity(), StandardActivity.class);
                    in.putExtra("loading", "Standard database");
                    startActivity(in);
                }
                catch (Exception e)
                {
                    Log.d("TAG", "onClick: " + e.getMessage());
                }
            }
        });



        return view;



    }

    }

