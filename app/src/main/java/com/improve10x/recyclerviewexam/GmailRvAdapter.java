package com.improve10x.recyclerviewexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class GmailRvAdapter extends RecyclerView.Adapter<GmailRvViewHolder> {
    public GmailItems[] items;
    public GmailRvAdapter(GmailItems[] gmailItems){
        items = gmailItems;
    }
    @NonNull
    @Override
    public GmailRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gmail_items,parent,false);
        GmailRvViewHolder viewHolder = new GmailRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GmailRvViewHolder holder, int position) {
      GmailItems item = items[position];
      holder.contactNameTxt.setText(item.contactName);
      holder.descriptionTxt.setText(item.description);
      holder.timeAndDateTxt.setText(item.timeAndDate);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
