package com.example.presidentsgridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.fragment.app.Fragment;

public class GalleryFragment extends Fragment {

    private Integer[] images = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        GridView gridView = view.findViewById(R.id.gallery_grid_view);
        gridView.setAdapter(new ImageAdapter(getActivity(), images));

        gridView.setOnItemClickListener((parent, view1, position, id) -> {
            Intent intent = new Intent(getActivity(), FullScreenImageActivity.class);
            intent.putExtra("image", images[position]);
            startActivity(intent);
        });

        return view;
    }
}
