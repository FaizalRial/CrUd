package com.izol.caripom;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.izol.caripom.List_Activity;
import com.izol.caripom.R;
import com.izol.caripom.Data;

import java.util.List;

public class DataViewHolder extends RecyclerView.Adapter<DataViewHolder.MyViewHolder> {

    private List<Data> moviesList;
    private Activity mActivity;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout rl_layout;
        public TextView tv_nama, tv_jenis, tv_jam, tv_pertamax, tv_pertalite, tv_solar;

        public MyViewHolder(View view) {
            super(view);
            rl_layout = view.findViewById(R.id.rl_layout);
            tv_nama = view.findViewById(R.id.tv_nama);
            tv_jenis = view.findViewById(R.id.tv_jenis);
            tv_jam = view.findViewById(R.id.tv_jam);
            tv_pertamax = view.findViewById(R.id.tv_pertamax);
            tv_pertalite = view.findViewById(R.id.tv_pertalite);
            tv_solar = view.findViewById(R.id.tv_solar);

        }
    }

    public DataViewHolder(List<Data> moviesList, Activity activity) {this.moviesList = moviesList;}
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_request, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Data movie = moviesList.get(position);

        holder.tv_nama.setText(movie.getNama());
        holder.tv_jenis.setText(movie.getJenis());
        holder.tv_jam.setText(movie.getJam());
        holder.tv_pertamax.setText(movie.getPertamax());
        holder.tv_pertalite.setText(movie.getpertalite());
        holder.tv_solar.setText(movie.getSolar());

        holder.rl_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goDetail = new Intent(mActivity, List_Activity.class);
                goDetail.putExtra("Nama", movie.getNama());
                goDetail.putExtra("Jenis", movie.getJenis());
                goDetail.putExtra("Jam Operasional", movie.getJam());
                goDetail.putExtra("Pertamax", movie.getPertamax());
                goDetail.putExtra("Pertalite", movie.getpertalite());
                goDetail.putExtra("Solar", movie.getSolar());

                mActivity.startActivity(goDetail);


            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}
