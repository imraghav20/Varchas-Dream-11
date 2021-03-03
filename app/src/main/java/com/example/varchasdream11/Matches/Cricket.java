package com.example.varchasdream11.Matches;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.varchasdream11.R;
import com.example.varchasdream11.TeamSelection.TeamSelectionActivity;
import com.example.varchasdream11.databinding.ActivityCricketBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


public class Cricket extends AppCompatActivity {

    private RecyclerView CricketRecyclerList;
    private DatabaseReference MatchRef;
    ActivityCricketBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCricketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MatchRef = FirebaseDatabase.getInstance().getReference().child("Users");

        CricketRecyclerList = (RecyclerView) findViewById(R.id.cricketRecyclerList);
        CricketRecyclerList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<Match> options = new FirebaseRecyclerOptions.Builder<Match>()
                .setQuery(MatchRef, Match.class)
                .build();
        

        FirebaseRecyclerAdapter<Match, MatchViewHolder> adapter = new FirebaseRecyclerAdapter<Match, MatchViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull MatchViewHolder holder, final int position, @NonNull Match model) {
                holder.team1Text.setText(model.getTeam1Name());
                holder.team2Text.setText(model.getTeam2Name());
                holder.matchTime.setText(model.getMatchTime());

                Picasso.get().load(model.getTeam1Image()).placeholder(R.drawable.cricket_logo_remastered).into(holder.team1Image);
                Picasso.get().load(model.getTeam2Image()).placeholder(R.drawable.cricket_logo_remastered).into(holder.team2Image);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String match_id = getRef(position).getKey();

                        Intent matchIntent = new Intent(Cricket.this, TeamSelectionActivity.class);
                        matchIntent.putExtra("match_id", match_id);
                        startActivity(matchIntent);
                    }
                });
            }

            @NonNull
            @Override
            public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.matches_sample, viewGroup, false);
                MatchViewHolder viewHolder = new MatchViewHolder(view);
                return viewHolder;
            }
        };

        CricketRecyclerList.setAdapter(adapter);
        adapter.startListening();
    }

    public static class MatchViewHolder extends RecyclerView.ViewHolder{

        TextView team1Text, team2Text, matchTime;
        ImageView team1Image, team2Image;

        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);

            matchTime = itemView.findViewById(R.id.matchTime);
            team1Text = itemView.findViewById(R.id.team1Text);
            team2Text = itemView.findViewById(R.id.team2Text);
            team1Image = itemView.findViewById(R.id.team1Image);
            team2Image = itemView.findViewById(R.id.team2Image);
        }
    }
}