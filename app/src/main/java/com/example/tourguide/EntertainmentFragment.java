package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
        // Required empty public constructor
    }
    public static ArrayList<Integer> companyList = new ArrayList<>(Arrays.asList(R.string.blueman, R.string.davidcopper, R.string.jabbawockeez, R.string.shinlim, R.string.cirquedu, R.string.laughfactory, R.string.laughdark, R.string.mjevo, R.string.legendscon, R.string.crissangel));
    public static ArrayList<Integer> costList = new ArrayList<>(Arrays.asList(R.string.high_cost, R.string.high_cost, R.string.high_cost, R.string.free, R.string.free, R.string.free, R.string.free, R.string.medium_cost, R.string.free, R.string.free));
    public static ArrayList<Integer> phoneNumberList = new ArrayList<>(Arrays.asList(R.string.phonenum1, R.string.phonenum2, R.string.phonenum3, R.string.phonenum4, R.string.phonenum5, R.string.phonenum6, R.string.phonenum7, R.string.phonenum8, R.string.phonenum9, R.string.phonenum10));
    public static ArrayList<Integer> imageList = new ArrayList<>(Arrays.asList(R.mipmap.blueman_foreground, R.mipmap.davidcop_foreground, R.mipmap.jabawockeez_foreground, R.mipmap.shinlim_foreground,
            R.mipmap.cirquedusol_foreground, R.mipmap.laughfact_foreground, R.mipmap.laughadark_foreground, R.mipmap.mjevo_foreground, R.mipmap.legendscon_foreground, R.mipmap.crissangel_foreground));
    public static ArrayList<Integer> infoList = new ArrayList<>(Arrays.asList(R.string.blueman_info, R.string.davidcopper_info, R.string.jabawockeez_info, R.string.shinlim_info, R.string.cirquedu_info,
            R.string.laughfactory_info, R.string.laughdark_info, R.string.mjevo_info, R.string.legendscon_info, R.string.crissangel_info
    ));

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
        AltDestinationAdapter altDestinationAdapter = new AltDestinationAdapter(getActivity(), destinations, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(altDestinationAdapter);
        return rootView;
    }
}