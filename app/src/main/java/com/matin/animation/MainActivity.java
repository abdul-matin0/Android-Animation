package com.matin.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageFrame;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageFrame = (ImageView) findViewById(R.id.imageView);

        if(imageFrame == null) throw new AssertionError();
        imageFrame.setBackgroundResource(R.drawable.animation);

        animationDrawable = (AnimationDrawable) imageFrame.getBackground();
        animationDrawable.start();
    }
}
