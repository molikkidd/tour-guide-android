package com.example.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class AltDestinationAdapter extends ArrayAdapter<Destination> {
    private int mColorResourceId;

    public AltDestinationAdapter(Activity context, ArrayList<Destination> destinations, int colorResourceId) {
        super(context, 0, destinations);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
            if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.alt_list_item, parent, false);
        }
        Destination currentDestination = getItem(position);

        TextView companyTextView = (TextView) listItemView.findViewById(R.id.company_textView_two);
            companyTextView.setText(currentDestination.getCompanyName());
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info_textView);
            infoTextView.setText(currentDestination.getInfo());
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_textView_two);
            phoneNumberTextView.setText(currentDestination.getPhoneNumber());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_two);
            if (currentDestination.getImageResourceId() != null ) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentDestination.getImageResourceId());
            // Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container_two);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
            textContainer.setBackgroundColor(color);
            return listItemView;
    }
}
