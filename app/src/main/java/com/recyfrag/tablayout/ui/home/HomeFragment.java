package com.recyfrag.tablayout.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.recyfrag.tablayout.R;
import com.recyfrag.tablayout.adapter.ContactsAdapters;
import com.recyfrag.tablayout.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("bishal","981827389",R.drawable.jet));
        contactsList.add(new Contacts("rajeshdai","25252525",R.drawable.rajesh));
        contactsList.add(new Contacts("prabin","9849366",R.drawable.dahayang));
        contactsList.add(new Contacts("robinson","98143479",R.drawable.noimage));
        contactsList.add(new Contacts("himal","9856372",R.drawable.mount));

        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}