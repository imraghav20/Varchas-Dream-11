package com.example.varchasdream11.TeamSelection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.varchasdream11.Matches.Match;
import com.example.varchasdream11.Matches.Sports;
import com.example.varchasdream11.R;
import com.example.varchasdream11.databinding.ActivitySportsBinding;
import com.example.varchasdream11.databinding.ActivityTeamSelectionBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.Calendar;
import java.util.Date;

public class TeamSelectionActivity extends AppCompatActivity {

    private String match_receiver_id;
    private RecyclerView Team1RecyclerList;
    private DatabaseReference Team1Ref;
    private String team1_name;
    ActivityTeamSelectionBinding binding;

    private RecyclerView Team2RecyclerList;
    private DatabaseReference Team2Ref;
    private String team2_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTeamSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        team1_name = getIntent().getExtras().get("team1Name").toString();
        team2_name = getIntent().getExtras().get("team2Name").toString();

        Team1Ref = FirebaseDatabase.getInstance().getReference().child("Players").child(team1_name);
        Team2Ref = FirebaseDatabase.getInstance().getReference().child("Players").child(team2_name);

        Team1RecyclerList = (RecyclerView) findViewById(R.id.team1RecyclerList);
        Team1RecyclerList.setLayoutManager(new LinearLayoutManager(this));

        Team2RecyclerList = (RecyclerView) findViewById(R.id.team2RecyclerList);
        Team2RecyclerList.setLayoutManager(new LinearLayoutManager(this));

        TextView team1 = (TextView)findViewById(R.id.textView5);
        team1.setText(team1_name);

        TextView team2 = (TextView)findViewById(R.id.textView7);
        team2.setText(team2_name);

        TextView team1render = (TextView)findViewById(R.id.textView8);
        team1render.setText(team1_name);

        TextView team2render = (TextView)findViewById(R.id.textView9);
        team2render.setText(team2_name);

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<Team> options1 = new FirebaseRecyclerOptions.Builder<Team>()
                .setQuery(Team1Ref, Team.class)
                .build();

        FirebaseRecyclerOptions<Team> options2 = new FirebaseRecyclerOptions.Builder<Team>()
                .setQuery(Team2Ref, Team.class)
                .build();

        FirebaseRecyclerAdapter<Team, TeamViewHolder> adapter1 = new FirebaseRecyclerAdapter<Team, TeamViewHolder>(options1) {
            @Override
            protected void onBindViewHolder(@NonNull final TeamViewHolder holder, final int position, @NonNull Team model) {
                holder.playerName.setText(model.getPlayerName());
//                holder.playerTeam.setText(model.getPlayerTeam());
                holder.playerCategory.setText(model.getPlayerCategory());
                holder.playerCredits.setText(model.getPlayerCredits());

                Picasso.get().load(model.getPlayerImage()).placeholder(R.drawable.cricket_logo_remastered).into(holder.playerImage);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TeamSelectionActivity.this, "Card is selected", Toast.LENGTH_SHORT).show();
//                        String match_id = getRef(position).getKey();
//
//                        Intent matchIntent = new Intent(Sports.this, TeamSelectionActivity.class);
//                        matchIntent.putExtra("match_id", match_id);
//                        startActivity(matchIntent);


                    }
                });
            }

            @NonNull
            @Override
            public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_card1, viewGroup, false);
                TeamViewHolder viewHolder = new TeamViewHolder(view);
                return viewHolder;
            }
        };

        FirebaseRecyclerAdapter<Team, TeamViewHolder> adapter2 = new FirebaseRecyclerAdapter<Team, TeamViewHolder>(options2) {
            @Override
            protected void onBindViewHolder(@NonNull final TeamViewHolder holder, final int position, @NonNull Team model) {
                holder.playerName.setText(model.getPlayerName());
                holder.playerCategory.setText(model.getPlayerCategory());
                holder.playerCredits.setText(model.getPlayerCredits());

                Picasso.get().load(model.getPlayerImage()).placeholder(R.drawable.cricket_logo_remastered).into(holder.playerImage);

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TeamSelectionActivity.this, "Card is selected", Toast.LENGTH_SHORT).show();
//                        String match_id = getRef(position).getKey();

//                        Intent matchIntent = new Intent(Sports.this, TeamSelectionActivity.class);
//                        matchIntent.putExtra("match_id", match_id);
//                        startActivity(matchIntent);


                    }
                });
            }

            @NonNull
            @Override
            public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_card, viewGroup, false);
                TeamViewHolder viewHolder = new TeamViewHolder(view);
                return viewHolder;
            }
        };

        Team1RecyclerList.setAdapter(adapter1);
        adapter1.startListening();

        Team2RecyclerList.setAdapter(adapter2);
        adapter2.startListening();
    }
    public static class TeamViewHolder extends RecyclerView.ViewHolder{

        TextView playerName, playerTeam, playerCategory, playerCredits;
        ImageView playerImage;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);

            playerName = itemView.findViewById(R.id.playerName);
            playerCategory = itemView.findViewById(R.id.playerCategory);
            playerCredits = itemView.findViewById(R.id.playerCredits);
            playerImage = itemView.findViewById(R.id.playerImage);
        }
    }
}