package com.example.amdcd;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MountAdapter extends RecyclerView.Adapter<MountAdapter.ViewHolder> {

    private List<MountPojo> list;
    public MountAdapter(List<MountPojo> list) { this.list = list; }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_mount, parent,false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView codename;
        TextView masl;

        public ViewHolder(View itemView) {
            super(itemView);
            picture  = (ImageView) itemView.findViewById(R.id.iv_picture);
            codename = (TextView) itemView.findViewById(R.id.tv_codename);
            masl     = (TextView) itemView.findViewById(R.id.tv_masl);
        }

        public void bind(final MountPojo item){
            picture.setImageResource(item.getPicture());
            codename.setText(item.getCodename() + "(" + item.getLocation() + ")");
            masl.setText(HeightObj.getDateString(item.getMasl()));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.SCREENSHOT, item.getScreenshot());
                    intent.putExtra(DetailActivity.DESCRIPTION, item.getDescription());
                    intent.putExtra(DetailActivity.NAMEDETAIL, item.getNamedetail());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
