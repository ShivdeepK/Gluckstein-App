package com.example.glucksteinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Resource1 extends AppCompatActivity {

    PDFView pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource1);

        pdf = (PDFView) findViewById(R.id.pdf);
        pdf.fromAsset("Children's.pdf").load();
    }
}