package com.example.presidentsgridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public class PresidentListFragment extends Fragment {

    private String[] presidents = {
            "Dr. Rajendra Prasad", "Dr. S. Radhakrishnan", "Dr. Zakir Husain",
            "Varahagiri Venkata Giri", "Fakhruddin Ali Ahmed", "Giani Zail Singh",
            "R. Venkataraman", "Dr. Shankar Dayal Sharma", "K. R. Narayanan",
            "Dr. A. P. J. Abdul Kalam", "Pratibha Patil", "Pranab Mukherjee"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_president_list, container, false);

        ListView listView = view.findViewById(R.id.presidents_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, presidents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedPresident = presidents[position];
                PresidentDetailsFragment detailsFragment = (PresidentDetailsFragment) getParentFragmentManager().findFragmentById(R.id.fragment_container_2);
                if (detailsFragment != null) {
                    detailsFragment.updateDetails(selectedPresident);
                }
            }
        });

        return view;
    }
}