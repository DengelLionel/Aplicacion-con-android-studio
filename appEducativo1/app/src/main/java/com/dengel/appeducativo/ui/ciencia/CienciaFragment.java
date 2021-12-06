package com.dengel.appeducativo.ui.ciencia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.dengel.appeducativo.R;
import com.dengel.appeducativo.ui.gallery.GalleryViewModel;

public class CienciaFragment extends Fragment {

    private CienciaViewModel CienciaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CienciaViewModel =
                new ViewModelProvider(this).get(CienciaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ciencia, container, false);
        final TextView textView = root.findViewById(R.id.text_ciencia);
        CienciaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RelativeLayout btnfisica= view.findViewById(R.id.fisicainicio);
        RelativeLayout btnquimica=view.findViewById(R.id.Quimicainicio);
        NavController navController=Navigation.findNavController(view);
        btnfisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_fisica);
            }
        });
        btnquimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_quimica);
            }
        });
    }
}