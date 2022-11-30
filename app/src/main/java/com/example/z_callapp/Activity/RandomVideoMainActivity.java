package com.example.z_callapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.z_callapp.databinding.ActivityRandomVideoMainBinding;

public class RandomVideoMainActivity extends AppCompatActivity {
    ActivityRandomVideoMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRandomVideoMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}