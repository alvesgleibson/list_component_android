package com.example.recycler_cardviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import com.example.recycler_cardviewexample.adapter.CardAdapter;
import com.example.recycler_cardviewexample.adapter.RecyclerAdapter;
import com.example.recycler_cardviewexample.entities.CardClassForAdapter;
import com.example.recycler_cardviewexample.entities.UserClassForAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<UserClassForAdapter> classForAdapters = new ArrayList<>();
    private List<CardClassForAdapter> cardClassForAdapterList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void recyclerShow(View view){
        recyclerView();
    }

    public void cardViewV(View view){

        cardShooo();

    }

    public void cardShooo(){
        addValueCard();
        exe( );
        CardAdapter cardAdapter = new CardAdapter(cardClassForAdapterList, this);
        recyclerView.setAdapter( cardAdapter );

    }

    public void recyclerView( ){

        addValueRecycler();
        exe();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(classForAdapters, this);
        recyclerView.setAdapter( recyclerAdapter );


    }

    public void addValueCard(){
        cardClassForAdapterList.clear();
        cardClassForAdapterList.add( new CardClassForAdapter("Gleibson Alves", "Av. Jose Pereira de Amorin", new Date(), R.drawable.imagem1) );
        cardClassForAdapterList.add( new CardClassForAdapter("Mylena Alves", "Av. Rosa e silva", new Date(), R.drawable.imagem2) );
        cardClassForAdapterList.add( new CardClassForAdapter("Pedro Antunes", "Rua Tururu", new Date(), R.drawable.imagem3) );
        cardClassForAdapterList.add( new CardClassForAdapter("Walner Silva", "Av. Central", new Date(), R.drawable.imagem4) );


    }


    public void addValueRecycler(){
        classForAdapters.clear();
        classForAdapters.add( new UserClassForAdapter("Gleibson", "Vendo o Jogo", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Mylena", "Indo as compras", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Paulo", "Jogando Domino", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Pedro", "Andando de Bicicleta", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Vitor", "Quebrando Parede", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Anne", "Andando no bosque", new Date()) );
    }

    public void exe(){

        recyclerView = findViewById(R.id.rvMain);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize(true);

    }
}

