package com.shivam.newslatest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.Collection;

public class padapter extends RecyclerView.Adapter<padapter.viewholder> {
    private user[] data;
    private Context context;
    public padapter(Collection<user> data, Context context){
      this.data= data.toArray(new user[0]);
      this.context=context;
    }
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.design,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        user title=data[position];
        holder.tv.setText(title.getTitle());
       // Glide.with(holder.img.getContext()).load(title.getAvatar_url()).into(holder.img);
    }


    @Override
    public int getItemCount() {

        return data.length;
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView img;
        public viewholder(@NonNull View itemView) {

            super(itemView);
            tv=itemView.findViewById(R.id.txt);
            img=itemView.findViewById(R.id.img);

        }
    }
}
