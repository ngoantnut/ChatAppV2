package com.example.z_callapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.z_callapp.databinding.ActivityConnectingBinding;

public class ConnectingActivity extends AppCompatActivity {
    ActivityConnectingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConnectingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}