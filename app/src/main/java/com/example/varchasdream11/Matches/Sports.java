package com.example.varchasdream11.Matches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.varchasdream11.databinding.ActivityCricketBinding;

public class Cricket extends AppCompatActivity {
    ActivityCricketBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCricketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}