package com.example.glucksteinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Resource3 extends AppCompatActivity {

    PDFView pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource3);

        pdf = (PDFView) findViewById(R.id.pdf);
        pdf.fromAsset("neuro booklet 2018.pdf").load();
    }
}