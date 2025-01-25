package com.example.presidentsgridview;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FullScreenImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        ImageView imageView = findViewById(R.id.fullscreen_image);
        int imageResource = getIntent().getIntExtra("image", -1);
        imageView.setImageResource(imageResource);
    }
}
