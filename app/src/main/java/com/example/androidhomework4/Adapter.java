package com.example.androidhomework4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.DataHolder> {


    private List<DataModel> list;

    public Adapter(List<DataModel> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title, titleMore;

        public DataHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_recyclerview);
            title = itemView.findViewById(R.id.textview);
            titleMore = itemView.findViewById(R.id.more_info);
        }

        public void onBind(DataModel dataModel) {
            imageView.setImageResource(dataModel.getImage());
            title.setText(dataModel.getTitle());

        }
    }
}
