package com.example.varchasdream11.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.varchasdream11.MainActivity;
import com.example.varchasdream11.Matches.Sports;
import com.example.varchasdream11.R;
import com.example.varchasdream11.SignInActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DashboardFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DashboardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user!= null) {
//            Toast.makeText(this, user+"SIGNED IN", Toast.LENGTH_SHORT).show();
            String name = user.getDisplayName();
//            Toast.makeText(this, name+"", Toast.LENGTH_SHORT).show();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            TextView user_name = (TextView) root.findViewById(R.id.etName);
            user_name.setText(name);
            TextView mailid = (TextView) root.findViewById(R.id.etEmail);
            mailid.setText(email);
            Picasso.get().load(photoUrl).into((ImageView) root.findViewById(R.id.dashboardCardImg));
        }
        else{
            Intent intent = new Intent(getActivity(), SignInActivity.class);
            startActivity(intent);
        }
        return root;
    }
}