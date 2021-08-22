package com.example.recycler_cardviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recycler_cardviewexample.R;
import com.example.recycler_cardviewexample.entities.CardClassForAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {
    private List<CardClassForAdapter> cardClassForAdaptersList;
    private Context context;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public CardAdapter(List<CardClassForAdapter> cardClassForAdaptersList, Context context) {
        this.cardClassForAdaptersList = cardClassForAdaptersList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);

        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CardClassForAdapter classForAdapter = cardClassForAdaptersList.get( position );
        holder.imagemMain.setImageResource( classForAdapter.getImageResource() );
        holder.name.setText(classForAdapter.getName());
        holder.idade.setText(sdf.format( classForAdapter.getDate() ));
        holder.endereco.setText(classForAdapter.getEndereco());
    }

    @Override
    public int getItemCount() {
        return cardClassForAdaptersList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name, idade, endereco;
        private ImageView imagemMain;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtNameCard);
            idade = itemView.findViewById(R.id.txtIdadeCard);
            endereco = itemView.findViewById(R.id.txtEnderecoCard);
            imagemMain = itemView.findViewById(R.id.imageViewCard);

        }
    }
}
