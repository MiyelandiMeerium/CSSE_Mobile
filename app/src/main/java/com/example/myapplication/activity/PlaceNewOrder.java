package com.example.myapplication.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.R;
import androidx.fragment.app.Fragment;


public class PlaceNewOrder extends Fragment {

    private Button btn1,btn2;
    public PlaceNewOrder() {
        // Required empty public constructor
    }

    public static com.example.myapplication.activity.PlaceNewOrder newInstance(String param1, String param2) {
        com.example.myapplication.activity.PlaceNewOrder fragment = new com.example.myapplication.activity.PlaceNewOrder();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_place_new_order, container, false);

        btn1 = (Button)rootView.findViewById(R.id.additempagebtn);

        btn2 = (Button)rootView.findViewById(R.id.exitbtn2);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Order()).addToBackStack(null).commit();

            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MainScreen()).addToBackStack(null).commit();

            }

        });


        return rootView;
    }
}