package com.example.bottomnavacm;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Prizes extends Fragment {
    ListView simpleList;
    String[] listItem;
    View view;
    int flags[] = { R.drawable.acmlogo100,  R.drawable.acmlogo100,  R.drawable.acmlogo100,  R.drawable.acmlogo100,  R.drawable.acmlogo100, R.drawable.acmlogo100};
    @Nullable
   @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.prizes,null);
        simpleList = (ListView) view.findViewById(R.id.simpleListView);
        listItem = getResources().getStringArray(R.array.prizes_list);
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), listItem, flags);
        simpleList.setAdapter(customAdapter);
        return view;
   }
}
