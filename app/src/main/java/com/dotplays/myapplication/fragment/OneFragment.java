package com.dotplays.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dotplays.myapplication.R;

public class OneFragment extends Fragment {

    private TextView tvText1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        tvText1 = view.findViewById(R.id.tvText2);
        tvText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TwoFragment twoFragment = (TwoFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment2);
                if (twoFragment != null) {
                    twoFragment.getTvText2().setText("HELLLO, i am your neighbour!!!");
                }
            }
        });

        return view;
    }
}
