package com.izol.caripom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onListData (View view) { startActivity(new Intent(MainActivity.this, List_Activity.class));}
    public void onPeta (View view) { startActivity(new Intent(MainActivity.this, MapsActivity.class));}
    public void onBantuan (View view) { startActivity(new Intent(MainActivity.this, Bantuan.class));}
    public void ondatabase_Activity (View view) { startActivity(new Intent(MainActivity.this, database_Activity.class));}
}
