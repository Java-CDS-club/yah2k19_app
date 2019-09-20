package com.example.bottomnavacm;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Agenda extends Fragment {
    ListView listView;
    TextView textView;
    String[] listItem;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.agenda, container, false);
        listView=(ListView) view.findViewById(R.id.listview);
        textView=(TextView) view.findViewById(R.id.textView);

        listItem = getResources().getStringArray(R.array.agenda_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, listItem);
        listView.setAdapter(adapter);
        return view;
    }
}
