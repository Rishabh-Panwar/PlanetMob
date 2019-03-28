package com.example.rishabh.planetmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class Phone_Dynamic extends AppCompatActivity {
    private Bundle extras;
    private TextView phone, description;
    private ImageView imageView;

    public void buttonClick6(View view) {
        Intent myIntent = new Intent(Phone_Dynamic.this, Notifications.class);
        Phone_Dynamic.this.startActivity(myIntent);
    }

    public void buttonClick7(View view) {
        Intent myIntent = new Intent(Phone_Dynamic.this, Home.class);
        Phone_Dynamic.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone__dynamic);
        extras = getIntent().getExtras();
        phone = findViewById(R.id.name1);
        imageView = (ImageView) findViewById(R.id.image1);
        description = (TextView) findViewById(R.id.phonedesc);
        switch (extras.getInt("phone")){
            case 1:
                phone.setText(getResources().getString(R.string.phone1));
                imageView.setImageResource(R.drawable.phone_1);
                description.setText(getResources().getString(R.string.pd1));
                break;
            case 2:
                phone.setText(getResources().getString(R.string.phone2));
                imageView.setImageResource(R.drawable.phone_1);
                description.setText(getResources().getString(R.string.pd2));
                break;
            case 3:
                phone.setText(getResources().getString(R.string.phone3));
                imageView.setImageResource(R.drawable.phone_1);
                description.setText(getResources().getString(R.string.pd3));
                break;
            case 4:
                phone.setText(getResources().getString(R.string.phone4));
                imageView.setImageResource(R.drawable.phone_1);
                description.setText(getResources().getString(R.string.pd4));
                break;
            case 5:
                phone.setText(getResources().getString(R.string.phone5));
                imageView.setImageResource(R.drawable.phone_1);
                description.setText(getResources().getString(R.string.pd5));
                break;
        }
    }
}
