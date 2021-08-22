package com.example.recycler_cardviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.recycler_cardviewexample.adapter.RecyclerAdapter;
import com.example.recycler_cardviewexample.entities.UserClassForAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<UserClassForAdapter> classForAdapters = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView();
    }


    public void recyclerView(){
        recyclerView = findViewById(R.id.rvMain);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager( layoutManager );
        addValueRecycler();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(classForAdapters, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter( recyclerAdapter );

    }

    public void addValueRecycler(){
        classForAdapters.add( new UserClassForAdapter("Gleibson", "Vendo o Jogo", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Mylena", "Indo as compras", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Paulo", "Jogando Domino", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Pedro", "Andando de Bicicleta", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Vitor", "Quebrando Parede", new Date()) );
        classForAdapters.add( new UserClassForAdapter("Anne", "Andando no bosque", new Date()) );

    }

}