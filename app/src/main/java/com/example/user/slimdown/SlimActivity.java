package com.example.user.slimdown;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Vector;

public class SlimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slim);

        List<Fragment> fragments = new Vector<>();
        fragments.add(Fragment.instantiate(this, CalculatorCalorie.class.getName()));
        fragments.add(Fragment.instantiate(this, TimerCrunches.class.getName()));
        fragments.add(Fragment.instantiate(this, CalorieFood.class.getName()));

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        final ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        pager.setAdapter(adapter);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener(){

             //used to changed the currecntly displayed fragment
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft){
            }
        };

        //set title to the action bar tabs
        actionBar.addTab(actionBar.newTab().setText("BMR Calculator").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Crunches Timer").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Food Calorie").setTabListener(tabListener));

        pager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });
    }
    }

