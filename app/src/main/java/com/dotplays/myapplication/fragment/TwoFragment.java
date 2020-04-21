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

public class TwoFragment extends Fragment {
    public TextView getTvText2() {
        return tvText2;
    }

    public void setTvText2(TextView tvText2) {
        this.tvText2 = tvText2;
    }

    private TextView tvText2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        tvText2 = view.findViewById(R.id.tvText2);

        return view;
    }
}
