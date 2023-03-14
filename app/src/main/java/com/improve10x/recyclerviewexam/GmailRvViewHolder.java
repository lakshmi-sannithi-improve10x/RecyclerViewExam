package com.improve10x.recyclerviewexam;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GmailRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView contactNameTxt;
    public TextView descriptionTxt;
    public TextView timeAndDateTxt;
    public GmailRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        contactNameTxt = itemView.findViewById(R.id.contactname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        timeAndDateTxt = itemView.findViewById(R.id.timeanddate_txt);
    }
}
