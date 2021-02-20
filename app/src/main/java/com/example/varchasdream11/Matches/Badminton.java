package com.example.varchasdream11.Matches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.varchasdream11.databinding.ActivityBadmintonBinding;
import com.example.varchasdream11.databinding.ActivityBasketballBinding;

public class Badminton extends AppCompatActivity {
    ActivityBadmintonBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBadmintonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}