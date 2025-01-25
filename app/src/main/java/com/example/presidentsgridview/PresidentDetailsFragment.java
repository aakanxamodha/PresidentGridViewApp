package com.example.presidentsgridview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PresidentDetailsFragment extends Fragment {

    private TextView nameTextView;
    private TextView periodTextView;
    private TextView qualificationTextView;
    private TextView experienceTextView;
    private TextView lifetimeTextView;
    private TextView achievementsTextView;
    private ImageView presidentImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_president_details, container, false);

        nameTextView = view.findViewById(R.id.president_name);
        periodTextView = view.findViewById(R.id.president_period);
        qualificationTextView = view.findViewById(R.id.president_qualification);
        experienceTextView = view.findViewById(R.id.president_experience);
        lifetimeTextView = view.findViewById(R.id.president_lifetime);
        achievementsTextView = view.findViewById(R.id.president_achievements);
        presidentImageView = view.findViewById(R.id.president_image);

        return view;
    }

    public void updateDetails(String presidentName) {
        if (presidentName.equals("Dr. Rajendra Prasad")) {
            nameTextView.setText("Dr. Rajendra Prasad");
            periodTextView.setText("1950 - 1962");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Lawyer, Politician");
            lifetimeTextView.setText("1884 - 1963");
            achievementsTextView.setText("First President of India.");
            presidentImageView.setImageResource(R.drawable.a);
        } else if (presidentName.equals("Dr. S. Radhakrishnan")) {
            nameTextView.setText("Dr. S. Radhakrishnan");
            periodTextView.setText("1962 - 1967");
            qualificationTextView.setText("MA");
            experienceTextView.setText("Teacher, Philosopher, Politician");
            lifetimeTextView.setText("1888 - 1975");
            achievementsTextView.setText("2nd President of India.");
            presidentImageView.setImageResource(R.drawable.b);
        } else if (presidentName.equals("Dr. Zakir Husain")) {
            nameTextView.setText("Dr. Zakir Husain");
            periodTextView.setText("1967 - 1969");
            qualificationTextView.setText("PhD");
            experienceTextView.setText("Educator, Politician");
            lifetimeTextView.setText("1897 - 1969");
            achievementsTextView.setText("First Muslim President of India.");
            presidentImageView.setImageResource(R.drawable.c);
        } else if (presidentName.equals("Varahagiri Venkata Giri")) {
            nameTextView.setText("Varahagiri Venkata Giri");
            periodTextView.setText("1969 - 1974");
            qualificationTextView.setText("BA, LLB");
            experienceTextView.setText("Lawyer, Politician");
            lifetimeTextView.setText("1894 - 1980");
            achievementsTextView.setText("Fourth President of India.");
            presidentImageView.setImageResource(R.drawable.d);
        } else if (presidentName.equals("Fakhruddin Ali Ahmed")) {
            nameTextView.setText("Fakhruddin Ali Ahmed");
            periodTextView.setText("1974 - 1977");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Politician, Lawmaker");
            lifetimeTextView.setText("1905 - 1977");
            achievementsTextView.setText("Fifth President of India.");
            presidentImageView.setImageResource(R.drawable.e);
        } else if (presidentName.equals("Giani Zail Singh")) {
            nameTextView.setText("Giani Zail Singh");
            periodTextView.setText("1982 - 1987");
            qualificationTextView.setText("Graduate");
            experienceTextView.setText("Politician, Journalist");
            lifetimeTextView.setText("1916 - 1994");
            achievementsTextView.setText("Seventh President of India.");
            presidentImageView.setImageResource(R.drawable.f);
        } else if (presidentName.equals("R. Venkataraman")) {
            nameTextView.setText("R. Venkataraman");
            periodTextView.setText("1987 - 1992");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Politician, Lawyer");
            lifetimeTextView.setText("1910 - 2009");
            achievementsTextView.setText("Eighth President of India.");
            presidentImageView.setImageResource(R.drawable.g);
        } else if (presidentName.equals("Dr. Shankar Dayal Sharma")) {
            nameTextView.setText("Dr. Shankar Dayal Sharma");
            periodTextView.setText("1992 - 1997");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Politician, Scholar");
            lifetimeTextView.setText("1918 - 1999");
            achievementsTextView.setText("Ninth President of India.");
            presidentImageView.setImageResource(R.drawable.h);
        } else if (presidentName.equals("K. R. Narayanan")) {
            nameTextView.setText("K. R. Narayanan");
            periodTextView.setText("1997 - 2002");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Diplomat, Politician");
            lifetimeTextView.setText("1920 - 2005");
            achievementsTextView.setText("Tenth President of India.");
            presidentImageView.setImageResource(R.drawable.i);
        } else if (presidentName.equals("Dr. A. P. J. Abdul Kalam")) {
            nameTextView.setText("Dr. A. P. J. Abdul Kalam");
            periodTextView.setText("2002 - 2007");
            qualificationTextView.setText("BSc, MSc, PhD");
            experienceTextView.setText("Scientist, Engineer");
            lifetimeTextView.setText("1931 - 2015");
            achievementsTextView.setText("Eleventh President of India.");
            presidentImageView.setImageResource(R.drawable.j);
        } else if (presidentName.equals("Pratibha Patil")) {
            nameTextView.setText("Pratibha Patil");
            periodTextView.setText("2007 - 2012");
            qualificationTextView.setText("BA, LLB");
            experienceTextView.setText("Politician, Social Worker");
            lifetimeTextView.setText("1934 - ");
            achievementsTextView.setText("First Woman President of India.");
            presidentImageView.setImageResource(R.drawable.k);
        } else if (presidentName.equals("Pranab Mukherjee")) {
            nameTextView.setText("Pranab Mukherjee");
            periodTextView.setText("2012 - 2017");
            qualificationTextView.setText("MA, LLB");
            experienceTextView.setText("Politician, Economist");
            lifetimeTextView.setText("1935 - ");
            achievementsTextView.setText("Thirteenth President of India.");
            presidentImageView.setImageResource(R.drawable.l);
        } else {
            nameTextView.setText("No details available");
            periodTextView.setText("");
            qualificationTextView.setText("");
            experienceTextView.setText("");
            lifetimeTextView.setText("");
            achievementsTextView.setText("");
            presidentImageView.setImageResource(0); // Clear the image
        }
    }
}