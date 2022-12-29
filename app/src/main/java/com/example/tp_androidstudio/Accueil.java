package com.example.tp_androidstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Scroller;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        setSupportActionBar((Toolbar) findViewById(R.id.menu));
    }

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_accueil);
            //1 - Configuring Toolbar
            this.configureToolbar();
        }

        @SuppressLint("ResourceType")
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            //2 - Inflate the menu and add it to the Toolbar
            getMenuInflater().inflate(1, menu);
            return true;
        }

        private void configureToolbar(){
            // Get the toolbar view inside the activity layout
            Toolbar toolbar = (Toolbar) findViewById(R.id.menu);
            // Sets the Toolbar
            setSupportActionBar(toolbar);
        }
    }

}