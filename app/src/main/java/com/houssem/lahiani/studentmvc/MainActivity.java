package com.houssem.lahiani.studentmvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

ListView ls;
ArrayList<Etudiant> values= new ArrayList<Etudiant>();
Etudiant e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=findViewById(R.id.lst);
        e=new Etudiant();
        e.setNom("Houssem Lahiani");
        e.setClasse("1 ere année");
        values.add(e);

        e=new Etudiant();
        e.setNom("Jack Michel");
        e.setClasse("2 ere année");
        values.add(e);

        e=new Etudiant();
        e.setNom("Wolrd Citizen");
        e.setClasse("3 ere année");
        values.add(e);


        CustomAdapter adapter=new CustomAdapter(MainActivity.this, values );

        ls.setAdapter(adapter);




    }
}