package com.rgbremote.euphoriawifi;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottomNavPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_nav);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment =null;
                            switch (item.getItemId()) {
                                case R.id.nav_home:
                                    selectedFragment=new HomeFragment();
                                    break;
                                case R.id.nav_schedule:
                                    selectedFragment=new ScheduleFragment();
                                    break;
                                case R.id.nav_settings:
                                    selectedFragment=new SettingsFragment();
                                    break;

                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                           selectedFragment ).commit();

                            return true;
                }
            };
}