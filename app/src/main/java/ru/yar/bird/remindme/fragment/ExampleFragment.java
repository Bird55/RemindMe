package ru.yar.bird.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.yar.bird.remindme.R;

public class ExampleFragment extends Fragment{

    public static final int LAYOUT = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstanse() {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
