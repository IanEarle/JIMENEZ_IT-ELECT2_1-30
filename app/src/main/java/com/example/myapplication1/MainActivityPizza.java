package com.example.myapplication1;


import android.content.res.Configuration;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import android.os.Bundle;

import com.example.myapplication1.FragmentDetails;
import com.example.myapplication1.FragmentMenu;

public class MainActivityPizza extends AppCompatActivity implements FragmentMenu.OnItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pizza);

        Log.d("DEBUG", getResources().getConfiguration().orientation + "");

        if (savedInstanceState == null) {
            FragmentMenu firstFragment = new FragmentMenu();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.flContainer, firstFragment);
            ft.commit();
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            FragmentDetails secondFragment = new FragmentDetails();
            Bundle args = new Bundle();
            args.putInt("position", 0);
            secondFragment.setArguments(args);
            FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
            ft2.add(R.id.flContainer2, secondFragment);
            ft2.commit();
        }
    }
        @Override
        public void onPizzaItemSelected(int position) {
            FragmentDetails secondFragment = new FragmentDetails();

            Bundle args = new Bundle();
            args.putInt("position", position);
            secondFragment.setArguments(args);


            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer2, secondFragment).commit();
            }
            else
            {
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer2, secondFragment).commit();
            }
    }
}