package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, info;
    Button upBtn;
    TextView uptext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.nameEdit);
        email = (EditText) findViewById(R.id.emailEdit);
        info = (EditText) findViewById(R.id.adressEdit);
        uptext = (TextView) findViewById(R.id.textId);
        upBtn = (Button) findViewById(R.id.updateBtn);

        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String names = name.getText().toString();
                String emails = email.getText().toString();
                String adress = info.getText().toString();


                uptext.setText("Name : " + names + "\nEmail : " + emails + "\nAddress : " + adress);


            }
        });
    }
}