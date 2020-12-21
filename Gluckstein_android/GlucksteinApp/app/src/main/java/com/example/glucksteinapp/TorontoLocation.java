package com.example.glucksteinapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TorontoLocation extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    ImageView iv;
    public static Integer[] mThumbIds = {

            R.drawable.gta1,R.drawable.gta2,R.drawable.gta3,R.drawable.gta4

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toronto_location);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapTorontoFragment);
        mapFragment.getMapAsync(this);
        iv = (ImageView) findViewById(R.id.imageView);
        Runnable r = new Runnable(){
            int i = 0;
            public void run(){
                iv.setImageResource(mThumbIds[i]);
                i++;
                if(i >= mThumbIds.length){
                    i = 0;
                }
                iv.postDelayed(this, 3000); //set to go off again in 3 seconds.
            }
        };
        iv.postDelayed(r,1); // set first time for 3 seconds
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng toronto = new LatLng(43.656003, -79.383490);
        mMap.addMarker(new MarkerOptions().position(toronto).title("Gluckstein Toronto Firm"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(toronto));

        //mMap.animateCamera(CameraUpdateFactory.zoomIn());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(toronto, 17.0f));
        // mMap.animateCamera(CameraUpdateFactory.zoomTo(15), 10000, null);
    }

    public void btnCallClick(View view){
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:4163467909"));

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }
}