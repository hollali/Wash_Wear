package com.example.wash_wear.auth;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.wash_wear.R;
import com.example.wash_wear.databinding.SignupScreenBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignupActivity extends AppCompatActivity {

    private SignupScreenBinding binding;
    private ProgressDialog loadingBar;
    private FirebaseAuth mAuth;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference usersRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // ---- Initialize View binding
        binding = SignupScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // ---- Initialize FirebaseAuth and Firestore references
        mAuth = FirebaseAuth.getInstance();
        usersRef = db.collection("Users");

        


    }
}