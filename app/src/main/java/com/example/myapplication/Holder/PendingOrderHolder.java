package com.example.myapplication.Holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class PendingOrderHolder extends RecyclerView.ViewHolder {

    public TextView pendingOrderId;

    public PendingOrderHolder(@NonNull View itemView) {
        super(itemView);

        this.pendingOrderId = itemView.findViewById(R.id.order_id);
    }
}
