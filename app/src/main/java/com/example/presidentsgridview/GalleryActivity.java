package com.example.presidentsgridview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        GridView gridView = findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(this);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(GalleryActivity.this, FullScreenActivity.class);
            intent.putExtra("image_id", gridAdapter.getImageId(position));
            startActivity(intent);
        });
    }
}