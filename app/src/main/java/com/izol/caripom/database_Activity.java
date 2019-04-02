package com.izol.caripom;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class database_Activity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    EditText text1;
    EditText text2;
    EditText text3;
    EditText text4;
    EditText text5;
    EditText text6;
    EditText text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_);
    }

    public void Click1(View view) {

//instansiasi edittext
       text1 = (EditText) findViewById(R.id.et_nama);
       text2 = (EditText) findViewById(R.id.et_jenis);
       text3 = (EditText) findViewById(R.id.et_jam);
       text4 = (EditText) findViewById(R.id.et_pertamax);
       text5 = (EditText) findViewById(R.id.et_pertalite);
       text6 = (EditText) findViewById(R.id.et_solar);
       text7 = (EditText) findViewById(R.id.edit7);
//instansiasi database firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();

//Referensi database yang dituju
        myRef = database.getReference("Data").child(text1.getText().toString());

//memberi nilai pada referensi yang dituju
        myRef.child("Jenis").setValue(text2.getText().toString());
        myRef.child("Jam Operasional").setValue(text3.getText().toString());
        myRef.child("Pertamax").setValue(text4.getText().toString());
        myRef.child("Pertalite").setValue(text5.getText().toString());
        myRef.child("Solar").setValue(text6.getText().toString());


        Toast.makeText(database_Activity.this,
                "Data Berhasil Ditambahkan",
                Toast.LENGTH_SHORT).show();
    }

    //Hapus user
    public void Click2(View view){
    //inisiasi database reference
    myRef = database.getReference("Data").child(text7.getText().toString());
    //hapus data
         myRef.removeValue();
        Toast.makeText(database_Activity.this,
                "Data Berhasil Dihapus",
                Toast.LENGTH_SHORT).show();
}
  }