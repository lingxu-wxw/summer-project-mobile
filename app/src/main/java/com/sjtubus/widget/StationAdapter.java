package com.sjtubus.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sjtubus.R;
import com.sjtubus.model.Station;

import java.util.ArrayList;
import java.util.List;

public class StationAdapter extends RecyclerView.Adapter<StationAdapter.ViewHolder> {
    private List<Station> stations;
    private Context context;

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView stationName;

        ViewHolder(View view){
            super(view);
            stationName = view.findViewById(R.id.shift_time);
        }
    }

    public void setDataList(List<Station> stations) {
        this.stations = stations;
        notifyDataSetChanged();
    }

    public StationAdapter(Context context){
        this.context = context;
        this.stations = new ArrayList<>();
    }

    @NonNull
    @Override
    public StationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shift, parent, false);
        return new StationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StationAdapter.ViewHolder holder, int position) {
        //Station station = stations.get(position);
        holder.stationName.setText(stations.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
