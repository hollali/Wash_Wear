package com.example.wash_wear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wash_wear.auth.SignupActivity;


public class LoginActivity extends AppCompatActivity {
    // ------ Referencing Widgets
    TextView CreateAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ------ making windows fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // ------ Calling the splash_screen layout
        setContentView(R.layout.login_layout);


        // ------ Layout Navigation Function ------- //
        // ---- Assigning object to id
        CreateAccount = findViewById(R.id.create_account);
        // ---- Creating an onclick function
        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // -- layout navigation to create account layout
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

    }


}