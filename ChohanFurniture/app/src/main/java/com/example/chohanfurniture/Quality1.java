package com.example.chohanfurniture;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class Quality1 extends AppCompatActivity {

    private ViewPager mSLideViewPager;
    private TextView[] mDots;
    LinearLayout mDotLayout;
    private Button nextbtn,button2;
    private ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quality1);
        nextbtn = findViewById(R.id.nextbtn);

        getSupportActionBar().hide();

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getitem(0) < 2){
                    mSLideViewPager.setCurrentItem(getitem(1),true);}

                else {

                    Intent i = new Intent(Quality1.this, WelcomeLogin.class);
                    startActivity(i);
                    finish();

                }
            }
        });



        mSLideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_layout);

        viewPagerAdapter = new ViewPagerAdapter(this);

        mSLideViewPager.setAdapter(viewPagerAdapter);

        setUpindicator(0);
        mSLideViewPager.addOnPageChangeListener(viewListener);

    }

    public void setUpindicator(int position){

        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0 ; i < mDots.length ; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.grey));
            mDotLayout.addView(mDots[i]);

        }

        mDots[position].setTextColor(getResources().getColor(R.color.black));

    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private int getitem(int i){

        return mSLideViewPager.getCurrentItem() + i;
    }


}