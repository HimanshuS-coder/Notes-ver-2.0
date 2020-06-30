package com.example.noteme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slider extends AppCompatActivity {
    ViewPager viewPager;
    LinearLayout dots;

    TextView[] mdots;

    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        viewPager=(ViewPager) findViewById(R.id.viewPager);
        dots=(LinearLayout) findViewById(R.id.dots);

        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);

        addDotsIndicator();

    }

    public void addDotsIndicator (int position) {

        mdots = new TextView[3];

        for (int i=0; i<mdots.length; i++){

                mdots[i] =new TextView(this);
                mdots[i].setText(Html.fromHtml("&#8226",0));
                mdots[i].setTextSize(35);
                mdots[i].setTextColor(getResources().getColor(R.color.colorGreen));

                dots.addView(mdots[i]);
        }

        if (mdots.length > 0){
            mdots[position].setTextColor(getResources().getColor(R.color.colordarkgreen));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            addDotsIndicator(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}