package com.example.bottomnavacm;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment=null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new Home();
                    break;
                case R.id.navigation_agenda:
                    fragment = new Agenda();
                    break;
                case R.id.navigation_food:
                    fragment = new Food();
                    break;
                case R.id.navigation_prizes:
                    fragment = new Prizes();
                    break;
                case R.id.navigation_faq:
                    fragment = new FAQs();
                    break;
            }
            return loadfragment(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadfragment(new Home());
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
private boolean loadfragment(Fragment fragment){
if (fragment!=null) {
    getSupportFragmentManager().beginTransaction().replace(R.id.message, fragment).commit();
    return true;
}
return false;

}
}
