package com.example.materialdesign2.Part01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign2.Part01.model.Book;
import com.example.materialdesign2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PopularBookAdapter extends RecyclerView.Adapter<PopularBookAdapter.MyViewHolder> {

    Context context;
    List<Book> data;

    public PopularBookAdapter(Context context, List<Book> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_popular_book,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtName.setText( data.get(position).getName());
        holder.txtAuthor.setText( data.get(position).getAuthor());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.imgMain);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMain;
TextView txtName,txtAuthor;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMain = itemView.findViewById(R.id.img_main);
            txtName = itemView.findViewById(R.id.txt_name);
            txtAuthor = itemView.findViewById(R.id.txt_author);

        }
    }
}
