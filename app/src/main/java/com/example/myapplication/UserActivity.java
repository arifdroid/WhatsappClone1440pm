package com.example.myapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Contact> contactList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        populate();

        initializeRecycler();



    }

    private void populate() {
    contactList.add(new Contact("arif","018"));
        contactList.add(new Contact("arif","018"));
        contactList.add(new Contact("arif","018"));
        contactList.add(new Contact("arif","018"));
        contactList.add(new Contact("arif","018"));
        contactList.add(new Contact("arif","018"));

    }

    private void initializeRecycler() {

        recyclerView=findViewById(R.id.recyclerID);
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL,false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new CustomRecyclerAdapter(contactList);

        //we didnt set the adapter

        recyclerView.setAdapter(recyclerViewAdapter);



    }
}
