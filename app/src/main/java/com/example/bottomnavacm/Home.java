package com.example.bottomnavacm;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Home extends Fragment {
    public int counter;
    Button button;

    TextView textView;
    View view, view2;

    @Nullable
    @Override

    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        setHasOptionsMenu(true);

        view = inflater.inflate(R.layout.home, null);
        button = (Button) view.findViewById(R.id.button);
        textView = (TextView) view.findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(86400000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        int seconds = (int) (millisUntilFinished / 1000) % 60;
                        int minutes = (int) ((millisUntilFinished / (1000 * 60)) % 60);
                        int hours = (int) ((millisUntilFinished / (1000 * 60 * 60)) % 24);
                        textView.setText(String.format("%d:%d:%d", hours, minutes, seconds));
                        if (hours >= 10)
                            textView.setText(String.format("%d:", hours));
                        else if (hours < 10)
                            textView.setText(String.format("0%d:", hours));
                        if (minutes >= 10)
                            textView.append(String.format("%d:", minutes));
                        else if (minutes < 10)
                            textView.append(String.format("0%d:", minutes));
                        if (seconds >= 10)
                            textView.append(String.format("%d", seconds));
                        else if (seconds < 10)
                            textView.append(String.format("0%d", seconds));

                    }

                    public void onFinish() {
                        textView.setText("done!");
                    }
                }.start();
            }
        });

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here

        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
        getActivity().setTitle("Home");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent intentone = new Intent(getActivity(), About.class);
                getActivity().startActivity(intentone);

                return (true);
            case R.id.exit:
                Intent intent = new Intent(getActivity(), Front.class);
                getActivity().startActivity(intent);
                return (true);

        }
        return (super.onOptionsItemSelected(item));
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//        return true;
//    }


}
