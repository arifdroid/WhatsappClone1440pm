package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    private Button buttonSignOut;

    private Button buttonFindUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    buttonSignOut=findViewById(R.id.buttonSignOutMainPageId);
    buttonFindUser=findViewById(R.id.buttonFindUser);

    buttonSignOut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainPageActivity.this,LogInActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);



        }
    });

    buttonFindUser.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainPageActivity.this,UserActivity.class);
            startActivity(intent);
            finish();

        }
    });

    }
}
