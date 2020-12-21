package com.example.glucksteinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class Expertise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expertise);
        GridView gridView = (GridView)findViewById(R.id.expertiseGrid);
        expertiseAdapter booksAdapter = new expertiseAdapter(this, experts);
        gridView.setAdapter(booksAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Experts expert = experts[position];
                Intent intent=new Intent(getApplicationContext(),ExpertiseSelected.class);
                intent.putExtra("item",expert.getName());
                startActivity(intent);
                //startActivity(new Intent(Expertise.this,ExpertiseSelected.class));
            }
        });
    }

    private Experts[] experts = {
            new Experts(R.string.car_accidents,R.drawable.pic1),
            new Experts(R.string.medical_malpractice,R.drawable.pic2),
            new Experts(R.string.birth_injury,R.drawable.pic3),
            new Experts(R.string.wrongful_death,R.drawable.pic4),
            new Experts(R.string.brain_injury,R.drawable.pic5),
            new Experts(R.string.spinal_injury,R.drawable.pic6),
            new Experts(R.string.long_term_disability,R.drawable.pic7),
            new Experts(R.string.slip_and_falls,R.drawable.pic8),
            new Experts(R.string.product_liability,R.drawable.pic9),
            new Experts(R.string.class_actionMass_tort,R.drawable.pic10)
    };

}


