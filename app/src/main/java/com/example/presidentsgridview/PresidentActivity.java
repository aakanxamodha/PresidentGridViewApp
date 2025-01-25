package com.example.presidentsgridview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment listFragment = new PresidentListFragment();
        fragmentTransaction.replace(R.id.fragment_container_1, listFragment);

        Fragment detailsFragment = new PresidentDetailsFragment();
        fragmentTransaction.replace(R.id.fragment_container_2, detailsFragment);

        fragmentTransaction.commit();
    }
}