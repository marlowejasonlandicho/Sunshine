package com.marlowelandicho.myappportfolio.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        List forecastList = new ArrayList<String>();
        forecastList.add("Today - Sunny - 88 / 63");
        forecastList.add("Tomorrow - Foggy - 70 / 46");
        forecastList.add("Wed - Cloudy - 72 / 63");
        forecastList.add("Thu - Rainy - 64 / 51");
        forecastList.add("Fri - Foggy - 70 / 46");
        forecastList.add("Sat - Sunny - 76 / 68");

        FragmentActivity fragmentActivity = getActivity();
        int listItemLayout = R.layout.list_item_layout;
        int listItemForecastTextView = R.id.list_item_forecast_textview;

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(fragmentActivity, listItemLayout, listItemForecastTextView, forecastList);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view_forecast);
        listView.setAdapter(arrayAdapter);



        return rootView;
    }



}
