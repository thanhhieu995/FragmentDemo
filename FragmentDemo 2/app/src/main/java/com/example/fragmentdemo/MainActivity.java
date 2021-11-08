package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CompanyAdapter.OnCompanyItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, new CompanyListFragment());
        ft.commit();
    }

    @Override
    public void onCompanyItemClick(Company company) {
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
       ft.replace(R.id.container, CompanyDetailFragment.newInstance(company));
       ft.addToBackStack(null);
       ft.commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}