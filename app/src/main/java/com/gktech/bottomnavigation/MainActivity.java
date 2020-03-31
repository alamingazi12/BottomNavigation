package com.gktech.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("method","on Create");
        bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 return true;
            }
        });

       setBudge();
    }

    private void setBudge() {
        BottomNavigationMenuView menuView= (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
        BottomNavigationItemView itemView= (BottomNavigationItemView) menuView.getChildAt(0);
        View view=LayoutInflater.from(MainActivity.this).inflate(R.layout.my_badge_example,menuView,false);
        TextView text= view.findViewById(R.id.badge_text);
        text.setText("12");
        itemView.addView(view);
    }

    @Override
    protected void onStart() {
        Log.d("method","onstart");
        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.d("method","on Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("method","on Pause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d("method","onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("method","Restart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.d("method","onStop");
        super.onStop();
    }
}
