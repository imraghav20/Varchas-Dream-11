package com.example.varchasdream11.Matches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.varchasdream11.databinding.ActivityBasketballBinding;

public class Basketball extends AppCompatActivity {
    ActivityBasketballBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBasketballBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}