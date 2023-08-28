package com.fatma.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fatma.landmarkbook.databinding.ActivityDetailBinding;

public class Detail extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();



        LandMark selectLanMark=(LandMark)intent.getSerializableExtra("landmark");


        binding.nameText.setText(selectLanMark.name);
        binding.countryText.setText(selectLanMark.country);
        binding.imageView.setImageResource(selectLanMark.image);
    }
}