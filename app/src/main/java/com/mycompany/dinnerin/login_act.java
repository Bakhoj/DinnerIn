package com.mycompany.dinnerin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mycompany.dinnerin.data.Data;

public class login_act extends AppCompatActivity implements View.OnClickListener{

    Button but_facebook, but_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);

        but_facebook = (Button) findViewById(R.id.login_facebook);
        but_google = (Button) findViewById(R.id.login_google);

        but_facebook.setOnClickListener(this);
        but_google.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == but_facebook) {
            if(Data.TEST) Toast.makeText(this, "Facebook Pressed", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, main_act.class);
            this.startActivity(i);
        } else {
            if(Data.TEST) Toast.makeText(this, "Google Pressed", Toast.LENGTH_SHORT).show();
        }
    }
}
