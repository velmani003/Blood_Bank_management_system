package com.blood_bank_management_system.blood_bank;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());

        pagerAdapter.addFragmet(new com.blood_bank_management_system.blood_bank.LoginFragment());
        pagerAdapter.addFragmet(new com.blood_bank_management_system.blood_bank.RegisterFragment());
        pagerAdapter.addFragmet(new com.blood_bank_management_system.blood_bank.homefragment());
        pagerAdapter.addFragmet(new com.blood_bank_management_system.blood_bank.hosregfragment());
        pagerAdapter.addFragmet(new com.blood_bank_management_system.blood_bank.volunregfragment());
        viewPager.setAdapter(pagerAdapter);
    }

    static class AuthenticationPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        void addFragmet(Fragment fragment) {
            fragmentList.add(fragment);
        }
    }
}
