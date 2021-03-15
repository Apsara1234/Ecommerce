package com.example.ecommerce;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.ecommerce.Fragment.AccountFragment;
import com.example.ecommerce.Fragment.Homefragment;
import com.example.ecommerce.Fragment.MycartFragment;
import com.example.ecommerce.Fragment.Searchfragment;
import com.example.ecommerce.Fragment.WishlistFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class CryashopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryashop);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId()){
                    case R.id.navigation_home: fragment=new Homefragment();
                    break;
                    case R.id.navigation_search: fragment=new Searchfragment();
                        break;
                    case R.id.navigation_mycart: fragment=new MycartFragment();
                        break;
                    case R.id.navigation_account: fragment=new AccountFragment();
                        break;
                    case R.id.navigation_wishlist: fragment=new WishlistFragment();
                        break;
                    default:
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,fragment).commit();
                return true;
            }
        });


    }

}