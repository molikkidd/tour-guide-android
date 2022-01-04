package com.example.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class OutdoorsFragment extends Fragment {

    public OutdoorsFragment() {
        // Required empty public constructor
    }
    public static ArrayList<Integer> companyList = new ArrayList<>(Arrays.asList(R.string.atv_co, R.string.flyboard_co, R.string.zipling_co, R.string.mountainbike_co, R.string.hiking_co, R.string.mountcharleston_co, R.string.stargaze_co, R.string.gokarts_co, R.string.goldstrike_co, R.string.cliffdiving_co));
    public static ArrayList<Integer> costList = new ArrayList<>(Arrays.asList(R.string.high_cost, R.string.high_cost, R.string.high_cost, R.string.free, R.string.free, R.string.free, R.string.free, R.string.medium_cost, R.string.free, R.string.free));
    public static ArrayList<Integer> phoneNumberList = new ArrayList<>(Arrays.asList(R.string.phonenum1, R.string.phonenum2, R.string.phonenum3, R.string.phonenum4, R.string.phonenum5, R.string.phonenum6, R.string.phonenum7, R.string.phonenum8, R.string.phonenum9, R.string.phonenum10));
    public static ArrayList<Integer> imageList = new ArrayList<>(Arrays.asList(R.mipmap.wicked_spoon_foreground, R.mipmap.bacchanal_foreground, R.mipmap.village_foreground, R.mipmap.wynn_foreground,
            R.mipmap.vicanthony_foreground, R.mipmap.hugos_foreground, R.mipmap.kabuto_foreground, R.mipmap.ferraro_foreground, R.mipmap.carols_foreground, R.mipmap.darlas_foreground));
    public static ArrayList<Integer> infoList = new ArrayList<>(Arrays.asList(R.string.atv_info, R.string.flyboard_info, R.string.zipling_info, R.string.mountainbike_info, R.string.hiking_info, R.string.mountcharleston_info, R.string.stargaze_info, R.string.gokarts_info, R.string.goldstrike_info, R.string.cliffdiving_info));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.destination_list, container, false);
        // Inflate the layout for this fragment
//      make an Array List and pass in the Word object
        final ArrayList<Destination> destinations = new ArrayList<Destination>();
        for (int i = 0; i < companyList.size(); i++) {
            Integer newCompany = companyList.get(i);
            Integer newCost = costList.get(i);
            Integer newPhoneNumber = phoneNumberList.get(i);
            Integer newImage = imageList.get(i);
            Integer newInfo = infoList.get(i);
            destinations.add(new Destination(newCompany, newCost, newPhoneNumber, newImage, newInfo));
        }
        AltDestinationAdapter altDestinationAdapter = new AltDestinationAdapter(getActivity(), destinations, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(altDestinationAdapter);
        return rootView;
    }
}