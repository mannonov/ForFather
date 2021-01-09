package uz.najottalim.forefather;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class ScientistRecyclerAdapter extends RecyclerView.Adapter<ScientistRecyclerAdapter.ViewHolder> {
        ArrayList<Scientist> scientists;
        ScientistItemClick scientistItemClick;

        public ScientistRecyclerAdapter(ArrayList<Scientist> scientists, ScientistItemClick scientistItemClick){
            this.scientists = scientists;
            this.scientistItemClick = scientistItemClick;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_scientist,parent,false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Scientist scientist = scientists.get(position);

        holder.nameAge.setText(scientist.nameAge);
        holder.description.setText(scientist.description);
        Picasso.get().load(scientist.url)
                .into(holder.photo);
        holder.urlMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scientistItemClick.OnClick(scientist);
            }
        });




    }

    @Override
    public int getItemCount() {
        return scientists.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder{
        ImageView photo;
        TextView nameAge;
        TextView description;
        Button urlMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            photo = itemView.findViewById(R.id.img_photo);
            nameAge = itemView.findViewById(R.id.txt_name_age);
            description = itemView.findViewById(R.id.txt_description);
            urlMore = itemView.findViewById(R.id.btn_more);

        }
    }










}
