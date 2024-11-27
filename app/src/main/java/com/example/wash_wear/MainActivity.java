package com.example.wash_wear;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // ------ variables declaration
    private static int SPLASH_SCREEN_TIMER  = 5000;

    // ------ creating Hooks
    View firstLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine;
    // ------ Hooks for textViews
    TextView appName, tagline;
    // ------ Animation Hooks
    Animation topAnim, bottomAnim, middleAnim;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ------ making windows fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // ------ Calling the splash_screen layout
        setContentView(R.layout.splash_screen);

        // ------ Assigning hooks to view IDs
        firstLine  = findViewById(R.id.first_line);
        secondLine = findViewById(R.id.second_line);
        thirdLine  = findViewById(R.id.third_line);
        fourthLine = findViewById(R.id.fourth_line);
        fifthLine  = findViewById(R.id.fifth_line);
        sixthLine  = findViewById(R.id.sixth_line);

        // ------ Assigning hooks to textViews
        appName = findViewById(R.id.appName);
        tagline = findViewById(R.id.tagline);

        // ------ Assigning hooks to animations
        topAnim     = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim  = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnim  = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        // ------ Setting animations to views
        firstLine.setAnimation(topAnim);
        secondLine.setAnimation(topAnim);
        thirdLine.setAnimation(topAnim);
        fourthLine.setAnimation(topAnim);
        fifthLine.setAnimation(topAnim);
        sixthLine.setAnimation(topAnim);

        // ------ Setting animation to textViews
        appName.setAnimation(middleAnim);
        tagline.setAnimation(bottomAnim);

        // ------ Splash Screen Code to Call new Activity after 5 Seconds : layout navigation
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                // ---- Calling a new activity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_TIMER);


    }
}