package com.example.presidentsgridview;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        ImageView imageView = findViewById(R.id.full_screen_image);
        int imageId = getIntent().getIntExtra("image_id", -1);

        if (imageId != -1) {
            imageView.setImageResource(imageId);
        }
    }
}