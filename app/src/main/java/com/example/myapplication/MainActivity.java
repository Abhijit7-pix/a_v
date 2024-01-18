package com.example.myapplication;



        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentTransaction;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.Toast;

        import com.example.myapplication.R;
        import com.example.myapplication.accountFragment;
        import com.example.myapplication.addFragment;
        import com.example.myapplication.homeFragment;
        import com.google.android.material.bottomnavigation.BottomNavigationView;

        import java.util.Map;


public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        img = findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.myapplication.MainActivity.this, Map.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId =item.getItemId();

        if(itemId == R.id.home){
            Toast.makeText(com.example.myapplication.MainActivity.this, "home clicked", Toast.LENGTH_SHORT).show();
            replaceFragment(new homeFragment());
            return true;
        }else if(itemId == R.id.add){
            Toast.makeText(com.example.myapplication.MainActivity.this, "Add clicked", Toast.LENGTH_SHORT).show();
            replaceFragment(new addFragment());
            return true;
        }else if(itemId == R.id.acc){
            Toast.makeText(com.example.myapplication.MainActivity.this, "Account clicked", Toast.LENGTH_SHORT).show();
            replaceFragment(new accountFragment());
            return true;
        }
        return false;
    }

    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentcontainer, fragment);
        transaction.commit();
    }}

