package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.synnapps.carouselview.CarouselView;

public class VendorprofileActivity extends AppCompatActivity {
    ViewFlipper v_flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendorprofile);

        int images[] = {R.drawable.facebooklogo, R.drawable.gmaillogo, R.drawable.arow, R.drawable.arrow2 };
        v_flipper=findViewById(R.id.V_flipper);

        //for loop

        for(int image:images){
            flipperImages(image);
        }

    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

         v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
         v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}