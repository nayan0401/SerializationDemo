package com.serializationdemo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = findViewById(R.id.edit_name);
        final EditText contact = findViewById(R.id.edit_contact);
        Button sendData = findViewById(R.id.btn_send);

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUserdata(name.getText().toString(), contact.getText().toString());
            }
        });

    }

    private void sendUserdata(String name, String contact) {

        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setContact(contact);

        Intent i = new Intent(getApplicationContext(), Activity2.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("serialize", userModel);
        i.putExtras(bundle);
        startActivity(i);

    }   // end of sendUserdata()

}