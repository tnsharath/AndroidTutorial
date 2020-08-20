package com.runshaw.tutorials.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.runshaw.tutorials.NotesModel;
import com.runshaw.tutorials.R;
import com.runshaw.tutorials.adapter.NotesAdapter;
import com.runshaw.tutorials.data.DbHelper;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class NotesFragment extends Fragment {

    RecyclerView recyclerView;
    DbHelper dbHelper;
    NotesAdapter notesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_notes, container, false);

        recyclerView = root.findViewById(R.id.recyclerView);

        dbHelper = new DbHelper(getContext());
        notesAdapter = new NotesAdapter();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<NotesModel> notesModels = dbHelper.getNotes();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(notesAdapter);
        notesAdapter.setNotesModels(notesModels);

    }
}