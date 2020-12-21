package com.example.glucksteinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpertiseSelected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expertise_selected);

        Bundle extras=getIntent().getExtras();
        if (extras!=null) {
            int selected=extras.getInt("item");
            TextView et=(TextView)findViewById(R.id.multiTxt);
            TextView tv=(TextView)findViewById(R.id.txtViewTitle);
            switch(selected){
                case(R.string.car_accidents):
                    et.setText(R.string.car_accident_Text);
                    tv.setText(R.string.car_accidents);
                    tv.setBackgroundResource(R.drawable.pic_1);
                    break;
                case(R.string.medical_malpractice):
                    et.setText(R.string.medical_malpractice_Text);
                    tv.setText(R.string.medical_malpractice);
                    tv.setBackgroundResource(R.drawable.pic_2);
                    break;
                case(R.string.birth_injury):
                    et.setText(R.string.birth_injury_Text);
                    tv.setText(R.string.birth_injury);
                    tv.setBackgroundResource(R.drawable.pic_3);
                    break;
                case(R.string.wrongful_death):
                    et.setText(R.string.wrongful_death_Text);
                    tv.setText(R.string.wrongful_death);
                    tv.setBackgroundResource(R.drawable.pic_4);
                    break;
                case(R.string.brain_injury):
                    et.setText(R.string.brain_injury_Text);
                    tv.setText(R.string.brain_injury);
                    tv.setBackgroundResource(R.drawable.pic_5);
                    break;
                case(R.string.spinal_injury):
                    et.setText(R.string.spinal_injury_Text);
                    tv.setText(R.string.spinal_injury);
                    tv.setBackgroundResource(R.drawable.pic_6);
                    break;
                case(R.string.long_term_disability):
                    et.setText(R.string.long_term_disability_Text);
                    tv.setText(R.string.long_term_disability);
                    tv.setBackgroundResource(R.drawable.pic_7);
                    break;
                case(R.string.slip_and_falls):
                    et.setText(R.string.slip_and_falls_Text);
                    tv.setText(R.string.slip_and_falls);
                    tv.setBackgroundResource(R.drawable.pic_8);
                    break;
                case(R.string.product_liability):
                    et.setText(R.string.product_liability_Text);
                    tv.setText(R.string.product_liability);
                    tv.setBackgroundResource(R.drawable.pic_9);
                    break;
                case(R.string.class_actionMass_tort):
                    et.setText(R.string.class_actionMass_tort_Text);
                    tv.setText(R.string.class_actionMass_tort);
                    tv.setBackgroundResource(R.drawable.pic_10);
                    break;


            }
        }
    }
}