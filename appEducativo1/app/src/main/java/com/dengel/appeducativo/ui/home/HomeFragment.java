package com.dengel.appeducativo.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.dengel.appeducativo.R;


import org.imaginativeworld.whynotimagecarousel.CarouselItem;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        final TextView textView2 = root.findViewById(R.id.text_home_titulo_principal);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }

        });
        return root;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<CarouselItem> list = new ArrayList<>();
        ImageCarousel carousel = view.findViewById(R.id.carousel);

        //lineas de la libreria carrusel item

        list.add(
                new CarouselItem(
                        R.drawable.algebra,
                        ""
                )
        );
        list.add(
                new CarouselItem(
                        R.drawable.geometria,
                        ""
                )
        );
        list.add(new CarouselItem(
                R.drawable.trigonometria1,
                ""
        ));
        list.add(
                new CarouselItem(
                        R.drawable.literatura1,
                        ""
                )
        );
        list.add(
                new CarouselItem(
                        R.drawable.quimica,
                        ""
                )
        );
        list.add(
                new CarouselItem(
                        R.drawable.fisica,
                        ""
                )
        );
        carousel.addData(list);
    }

}
