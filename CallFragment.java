package com.icat.armaloft;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;

public class CallFragment extends Fragment {
    public CallFragment() {
    }
    Button btnCall;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_call,container,false);

        View btnCall = (Button) rootView.findViewById(R.id.CallBtn);

        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                call();
            }
        });
        return rootView;

    }
    private void call() {

        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        call.setData(Uri.parse("tel:" + "91  9637095196"));
        startActivity(call);
    }


}