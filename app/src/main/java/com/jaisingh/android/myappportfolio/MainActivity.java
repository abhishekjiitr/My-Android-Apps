package com.jaisingh.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSpotify(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Spotify App", Toast.LENGTH_SHORT).show();
    }

    public void launchScores(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
    }

    public void launchLibrary(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }

    public void launchBuilder(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void launchReader(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public void launchCapstone(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
    }
}

