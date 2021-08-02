package com.icat.armaloft;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Link10Fragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_link10,container,false);

        TextView text= (TextView)  view.findViewById(R.id.textView52);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text1= (TextView)  view.findViewById(R.id.textView53);
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2= (TextView)  view.findViewById(R.id.textView54);
        text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text3= (TextView)  view.findViewById(R.id.textView55);
        text3.setMovementMethod(LinkMovementMethod.getInstance());




        return view;
    }


}
