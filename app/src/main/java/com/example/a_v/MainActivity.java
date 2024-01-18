package com.example.a_v;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import frgments.Homefrag;

public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId =item.getItemId();

        if(itemId == R.id.home){
            Toast.makeText(MainActivity.this, "home clicked", Toast.LENGTH_SHORT).show();
            //replaceFragment(new Homefrag());
            return true;
        }else if(itemId == R.id.add){
            Toast.makeText(MainActivity.this, "Add clicked", Toast.LENGTH_SHORT).show();
            return true;
        }else if(itemId == R.id.acc){
            Toast.makeText(MainActivity.this, "Account clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentcontainer, fragment);
        transaction.commit();
    }}
