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

public class Link1Fragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_links1,container,false);

        TextView text= (TextView)  view.findViewById(R.id.textView9);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text1= (TextView)  view.findViewById(R.id.textView10);
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2= (TextView)  view.findViewById(R.id.textView11);
        text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text3= (TextView)  view.findViewById(R.id.textView12);
        text3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text4= (TextView)  view.findViewById(R.id.textView13);
        text4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text5= (TextView)  view.findViewById(R.id.textView28);
        text5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text6= (TextView)  view.findViewById(R.id.textView29);
        text6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text7= (TextView)  view.findViewById(R.id.textView37);
        text7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text8= (TextView)  view.findViewById(R.id.textView38);
        text8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text9= (TextView)  view.findViewById(R.id.textView39);
        text9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text10= (TextView)  view.findViewById(R.id.textView40);
        text10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text11= (TextView)  view.findViewById(R.id.textView41);
        text11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text12= (TextView)  view.findViewById(R.id.textView42);
        text12.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text13= (TextView)  view.findViewById(R.id.textView43);
        text13.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text14= (TextView)  view.findViewById(R.id.textView44);
        text14.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text15= (TextView)  view.findViewById(R.id.textView45);
        text15.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text16= (TextView)  view.findViewById(R.id.textView46);
        text16.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text17= (TextView)  view.findViewById(R.id.textView47);
        text17.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text18= (TextView)  view.findViewById(R.id.textView48);
        text18.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text19= (TextView)  view.findViewById(R.id.textView49);
        text19.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text20= (TextView)  view.findViewById(R.id.textView50);
        text20.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text21= (TextView)  view.findViewById(R.id.textView51);
        text21.setMovementMethod(LinkMovementMethod.getInstance());



        return view;
    }


}
