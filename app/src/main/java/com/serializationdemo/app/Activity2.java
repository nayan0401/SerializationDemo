package com.serializationdemo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView data = findViewById(R.id.txt_userdata);
        UserModel model = (UserModel) getIntent().getSerializableExtra("serialize");

        data.setText("Name : " + model.getName()  + "\nContact : " + model.getContact());

    }
}