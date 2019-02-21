package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.InsideHolderCustom>{

    private ArrayList<Contact> contactListHere;

    public CustomRecyclerAdapter(ArrayList<Contact> contactList) {
        contactListHere=contactList;

    }

    @NonNull
    @Override
    public InsideHolderCustom onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //return null;

    View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_layout_for_finduser,viewGroup,false);

    ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    view.setLayoutParams(lp);
    return new InsideHolderCustom(view);

    }

    @Override
    public void onBindViewHolder(@NonNull InsideHolderCustom insideHolderCustom, int i) {

        insideHolderCustom.textViewNamee.setText(contactListHere.get(i).getNameContactClass());
        insideHolderCustom.textViewPhonee.setText(contactListHere.get(i).getPhoneContactClass());
    }

    @Override
    public int getItemCount() {
        return contactListHere.size();
    }


    public class InsideHolderCustom extends RecyclerView.ViewHolder{

        public TextView textViewNamee,textViewPhonee;

        public InsideHolderCustom(@NonNull View itemView) {

            super(itemView);

            textViewNamee = itemView.findViewById(R.id.textViewName);
            textViewPhonee = itemView.findViewById(R.id.textViewPhone);

        }
    }
}
