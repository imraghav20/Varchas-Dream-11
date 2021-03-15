package com.example.varchasdream11.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.varchasdream11.Matches.Sports;
import com.example.varchasdream11.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContestFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContestFragment newInstance(String param1, String param2) {
        ContestFragment fragment = new ContestFragment();
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



        //CRICKET ACTIVITY INTENT -------------------------->
        View rootView = inflater.inflate(R.layout.fragment_contest, container, false);
        Button button2 = (Button) rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Cricket");
                startActivity(intent);
            }
        });

        //FOOTBALL ACTIVITY INTENT -------------------------->
        Button button3 = (Button) rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Football");
                startActivity(intent);
            }
        });

        //BASKETBALL ACTIVITY INTENT -------------------------->
        Button button6 = (Button) rootView.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Basketball");
                startActivity(intent);
            }
        });

        //BADMINTON ACTIVITY INTENT -------------------------->
        Button button7 = (Button) rootView.findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Badminton");
                startActivity(intent);
            }
        });

        //BADMINTON ACTIVITY INTENT -------------------------->
        Button button8 = (Button) rootView.findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Volleyball");
                startActivity(intent);
            }
        });

        Button button9 = (Button) rootView.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "LawnTennis");
                startActivity(intent);
            }
        });

        Button button10 = (Button) rootView.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "TableTennis");
                startActivity(intent);
            }
        });

        Button button11 = (Button) rootView.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Chess");
                startActivity(intent);
            }
        });

        Button button12 = (Button) rootView.findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Athletics");
                startActivity(intent);
            }
        });

        Button button13 = (Button) rootView.findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Kabaddi");
                startActivity(intent);
            }
        });

        Button button14 = (Button) rootView.findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "Valorant");
                startActivity(intent);
            }
        });

        Button button15 = (Button) rootView.findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sports.class);
                intent.putExtra("sports_name", "CSGO");
                startActivity(intent);
            }
        });

        return rootView;
    }
}