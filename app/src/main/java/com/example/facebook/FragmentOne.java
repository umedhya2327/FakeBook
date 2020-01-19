package com.example.facebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.facebook.R;

public class FragmentOne extends Fragment {
    //public static FragmentOne newInstance=null;
    public static FragmentOne newInstance(){
        FragmentOne fragmentOne=new FragmentOne();
        return fragmentOne;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container,false);
    }
}

