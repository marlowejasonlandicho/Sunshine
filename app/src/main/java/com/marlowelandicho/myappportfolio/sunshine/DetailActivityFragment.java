package com.marlowelandicho.myappportfolio.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);


        Intent intent = getActivity().getIntent();
        String message = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView textView = (TextView) rootView.findViewById(R.id.detail_text);


        textView.setTextSize(40);
        textView.setText(message);

//        textView.setText();
//        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
