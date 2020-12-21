package com.example.glucksteinapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnLocationClick(View view){
        PopupMenu popup = new PopupMenu(MainActivity.this, view);
        popup.setOnMenuItemClickListener(MainActivity.this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.niagra:
                startActivity(new Intent(this,NiagaraLocation.class));
                return true;

            case R.id.Ottowa:
                startActivity(new Intent(this,OttowaLocation.class));
                return true;

            case R.id.Toronto:
                startActivity(new Intent(this,TorontoLocation.class));
                return true;
            default:
                return false;
        }
    }

    public void goTo(View view){
        switch(view.getId()){
            case R.id.about_us:
                startActivity(new Intent(this, AboutUs.class));
                break;
            case R.id.expertise:
                startActivity(new Intent(MainActivity.this,Expertise.class));
                break;
            case R.id.news:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gluckstein.com/news-events/")));
                break;
            case R.id.resource1:
                startActivity(new Intent(this, Resource1.class));
                break;
            case R.id.resource2:
                startActivity(new Intent(this, Resource2.class));
                break;
            case R.id.resource3:
                startActivity(new Intent(this, Resource3.class));
                break;
            case R.id.team:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gluckstein.com/our-team/")));
                break;
            case R.id.podcast:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gluckstein.com/buttertorts-truly-canadian-legal-podcast-2/")));
                break;
            case R.id.btnLocation:
                btnLocationClick(view);
                break;
            case R.id.twitter:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/glucksteinlaw")));
                break;
            case R.id.instagram:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/glucksteinlawyers/")));
                break;
            case R.id.facebook:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/glucksteinlawyers/")));
                break;
            case R.id.youtube:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC24JLqRUX4qL4o5j7CRLsqQ")));
                break;
            case R.id.linkedin:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/gluckstein-personal-injury-lawyers/")));
                break;
        }
    }
}