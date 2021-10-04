package com.example.myapplication.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class DeliveyOrders1 extends Fragment {



    public DeliveyOrders1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DeliveyOrders1.
     */
    // TODO: Rename and change types and number of parameters
    public static com.example.myapplication.activity.DeliveyOrders1 newInstance(String param1, String param2) {
        com.example.myapplication.activity.DeliveyOrders1 fragment = new com.example.myapplication.activity.DeliveyOrders1();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delivey_orders1, container, false);
    }
}