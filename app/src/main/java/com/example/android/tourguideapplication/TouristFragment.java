package com.example.android.tourguideapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristFragment extends Fragment {


    public TouristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.obudu, R.string.obudu_address, R.drawable.obudu));
        locations.add(new Location(R.string.tinapa, R.string.tinapa_address, R.drawable.tinapa));
        locations.add(new Location(R.string.carnival, R.string.carnival_address, R.drawable.carnival));
        locations.add(new Location(R.string.park, R.string.park_address,R.drawable.park));
        locations.add(new Location(R.string.museum, R.string.museum_address, R.drawable.museum));
        locations.add(new Location(R.string.tortuga, R.string.tortuga_address, R.drawable.tortuga));
        locations.add(new Location(R.string.bassey, R.string.bassey_address, R.drawable.bassey));
        locations.add(new Location(R.string.kwafalls, R.string.kwafalls_address, R.drawable.kwafalls));
        locations.add(new Location(R.string.slessor, R.string.slessor_address, R.drawable.slessor));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_tourist);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
