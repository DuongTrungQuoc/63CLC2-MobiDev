package my.duancuoiki_foodapp.app;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import my.duancuoiki_foodapp.app.chefFoodPanel.ChefHomeFragment;
import my.duancuoiki_foodapp.app.chefFoodPanel.ChefOrderFragment;
import my.duancuoiki_foodapp.app.chefFoodPanel.ChefPendingOrderFragment;
import my.duancuoiki_foodapp.app.chefFoodPanel.ChefProfileFragment;
import my.duancuoiki_foodapp.app.customerFoodPanel.CustomerCartFragment;
import my.duancuoiki_foodapp.app.customerFoodPanel.CustomerHomeFragment;
import my.duancuoiki_foodapp.app.customerFoodPanel.CustomerOrdersFragment;
import my.duancuoiki_foodapp.app.customerFoodPanel.CustomerProfileFragment;
public class CustomerFoofPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_foof_panel_bottom_navigation);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

       Fragment fragment = null;
//        switch (item.getItemId()){
//            case R.id.cust_Home:
//                fragment=new CustomerHomeFragment();
//                break;
//        }
//        switch (item.getItemId()){
//            case R.id.cart:
//                fragment=new CustomerCartFragment();
//                break;
//        }
//        switch (item.getItemId()){
//            case R.id.cust_profile:
//                fragment=new CustomerProfileFragment();
//                break;
//        }
//        switch (item.getItemId()){
//            case R.id.Cust_order:
//                fragment=new CustomerOrdersFragment();
//                break;
//        }
//        switch (item.getItemId()){
//            case R.id.cart:
//                fragment=new CustomerCartFragment();
//                break;
//        }
        return loadcheffragment(fragment);

    }

    private boolean loadcheffragment(Fragment fragment) {

        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }
}