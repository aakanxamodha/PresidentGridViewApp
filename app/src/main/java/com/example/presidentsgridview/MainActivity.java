package com.example.presidentsgridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPresidentActivity(View view) {
        Intent intent = new Intent(this, PresidentActivity.class);
        startActivity(intent);
    }
}
