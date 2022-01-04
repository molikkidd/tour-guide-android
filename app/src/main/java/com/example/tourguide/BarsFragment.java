package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }
    public static ArrayList<Integer> companyList = new ArrayList<>(Arrays.asList(R.string.chandelier, R.string.commonwealth, R.string.frankies, R.string.goldstrike, R.string.hofbrauhaus, R.string.millennium, R.string.skybar, R.string.minusfive, R.string.parkonfremont,R.string.peppermill));
    public static ArrayList<Integer> costList = new ArrayList<>(Arrays.asList(R.string.high_cost, R.string.medium_cost, R.string.medium_cost, R.string.high_cost, R.string.high_cost, R.string.high_cost, R.string.high_cost, R.string.high_cost, R.string.medium_cost, R.string.medium_cost ));
    public static ArrayList<Integer> phoneNumberList = new ArrayList<>(Arrays.asList(R.string.phonenum1, R.string.phonenum2, R.string.phonenum3, R.string.phonenum4, R.string.phonenum5, R.string.phonenum6, R.string.phonenum7, R.string.phonenum8, R.string.phonenum9, R.string.phonenum10));
    public static ArrayList<Integer> imageList = new ArrayList<>(Arrays.asList(R.mipmap.chandelier_foreground, R.mipmap.commonwealth_foreground, R.mipmap.frankies_foreground, R.mipmap.goldspike_foreground,
            R.mipmap.hofbrahaus_foreground, R.mipmap.millenium_foreground, R.mipmap.skybar_foreground, R.mipmap.minusfive_foreground, R.mipmap.parkfremont_foreground, R.mipmap.peppermill_foreground));

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
            destinations.add(new Destination(newCompany, newCost, newPhoneNumber, newImage));
        }
        DestinationAdapter destinationAdapter = new DestinationAdapter(getActivity(), destinations, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(destinationAdapter);

        return rootView;
    }

}