package com.example.varchasdream11.Matches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.varchasdream11.databinding.ActivityCricketBinding;
import com.example.varchasdream11.databinding.ActivityFootballBinding;

public class Football extends AppCompatActivity {
    ActivityFootballBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFootballBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}