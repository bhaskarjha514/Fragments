package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    TextView tvDescription;
    ArrayList<String> description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescription);

        description = new ArrayList<String>();
        description.add("Item 1");
        description.add("Item 2");
        description.add("Item 3");
    }


    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(description.get(index));
    }

    @Override
    public void onListItemClick(ListView l, View v, int Position, long id) {

    }
}
