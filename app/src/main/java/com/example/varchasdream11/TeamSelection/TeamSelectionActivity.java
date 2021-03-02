package com.example.varchasdream11.TeamSelection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.varchasdream11.R;

public class TeamSelectionActivity extends AppCompatActivity {

    private String match_receiver_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_selection);

        match_receiver_id = getIntent().getExtras().get("match_id").toString();

        Toast.makeText(this, "match ID" + match_receiver_id, Toast.LENGTH_SHORT).show();
    }
}