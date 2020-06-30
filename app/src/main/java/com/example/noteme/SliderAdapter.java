package com.example.noteme;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter (Context context) {

        this.context =context;
    }

    //Arrays
    public int[] slide_images ={

            R.drawable.easy_to_use,
            R.drawable.light_weight,
            R.drawable.minimal_design,

    };

    //Arrays for Headings

    public String[] slide_headings = {
            "Easy To Use",
            "Light Weight",
            "Minimal Design"
    };

    //Arrays for description

    public String[] slide_desc = {
            "With a simple user interface ,you can take notes straight on",
            "With a lite design you can save memory for more",
            "Note Me is designed for minimalism and for those who enjoy lite products"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    // instantiate is required for the slide effects
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageview = (ImageView) view.findViewById(R.id.slideImage);
        TextView slideHeading = (TextView) view.findViewById(R.id.slideHeading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slideDesc);

        slideImageview.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    // Now this method will stop right away when we reach the last image in the slider


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

            container.removeView((RelativeLayout)object);
    }
}
