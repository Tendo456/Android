package com.example.getpost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {

    TextView username,email,joined,id;
    UserResponse userResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        username  = findViewById(R.id.username);
        email  = findViewById(R.id.email);
        joined  = findViewById(R.id.joined);
        id = findViewById(R.id.id);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            userResponse = (UserResponse) intent.getSerializableExtra("data");

            String usernamedata = userResponse.getUsername();
            String useremail = userResponse.getEmail();
            String userjoined = userResponse.getDate_joined();
            int userid = userResponse.getId();


            username.setText(usernamedata);
            email.setText(useremail);
            joined.setText(userjoined);
            id.setText(String.valueOf(userid));
        }
    }
}