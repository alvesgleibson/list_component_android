package com.example.recycler_cardviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recycler_cardviewexample.R;
import com.example.recycler_cardviewexample.entities.UserClassForAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<UserClassForAdapter> classForAdapters;
    private Context context;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public RecyclerAdapter(List<UserClassForAdapter> classForAdapters, Context context) {
        this.classForAdapters = classForAdapters;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false );

        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        UserClassForAdapter ucfa = classForAdapters.get( position );

        holder.txtNameHolder.setText( ucfa.getName() );
        holder.txtDateHolder.setText( sdf.format(ucfa.getDateContact()) );
        holder.txtObsHolder.setText( ucfa.getObs() );

    }

    @Override
    public int getItemCount() {
        return classForAdapters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       private TextView txtNameHolder, txtDateHolder, txtObsHolder;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNameHolder = itemView.findViewById(R.id.txtName);
            txtDateHolder = itemView.findViewById(R.id.txtDate);
            txtObsHolder = itemView.findViewById(R.id.txtObs);

        }
    }
}
