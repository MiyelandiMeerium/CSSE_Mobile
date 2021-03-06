package com.example.myapplication.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import com.example.myapplication.R;
import com.example.myapplication.activity.MainScreen;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home_Delivery#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home_Delivery extends Fragment {

    private Button btn1;

    public Home_Delivery() {
        // Required empty public constructor
    }

    public static Home_Delivery newInstance(String param1, String param2) {
        Home_Delivery fragment = new Home_Delivery();


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
        View rootView = inflater.inflate(R.layout.fragment_home__delivery, container, false);

        btn1 = (Button)rootView.findViewById(R.id.goherebtn);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MainScreen()).addToBackStack(null).commit();

            }

        });



        return rootView;
    }
}