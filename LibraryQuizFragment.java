package com.icat.armaloft;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LibraryQuizFragment extends Fragment{




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_libraryquiz,container,false);
        Button btnOpen = (Button) view.findViewById(R.id.quizBtn);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent( getActivity(), QuizActivity.class);
                in.putExtra("loading","Quiz");
                startActivity(in);
            }
        });
        return view;



    }

    }

