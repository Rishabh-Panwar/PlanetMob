package com.example.rishabh.planetmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class PhoneList extends AppCompatActivity {

/*    public void buttonClick1(View view) {
        Intent myIntent = new Intent(PhoneList.this, Phone_Dynamic.class);
        PhoneList.this.startActivity(myIntent);
    }
    public void buttonClick2(View view) {
        Intent myIntent = new Intent(PhoneList.this, Phone_Dynamic.class);
        PhoneList.this.startActivity(myIntent);
    }
    public void buttonClick3(View view) {
        Intent myIntent = new Intent(PhoneList.this, Phone_Dynamic.class);
        PhoneList.this.startActivity(myIntent);
    }
    public void buttonClick4(View view) {
        Intent myIntent = new Intent(PhoneList.this, Phone_Dynamic.class);
        PhoneList.this.startActivity(myIntent);
    }
    public void buttonClick5(View view) {
        Intent myIntent = new Intent(PhoneList.this, Phone_Dynamic.class);
        PhoneList.this.startActivity(myIntent);
    }

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_list);

            ImageButton button6 = findViewById(R.id.imageButton1);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(PhoneList.this, Home.class);
                    PhoneList.this.startActivity(myIntent);
                }
            });

        ImageButton button5 = findViewById(R.id.image5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneList.this, Phone_Dynamic.class);
                intent.putExtra("phone", 1);
                startActivity(intent);
            }
        });
        ImageButton button4 = findViewById(R.id.image4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneList.this, Phone_Dynamic.class);
                intent.putExtra("phone", 2);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.image3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneList.this, Phone_Dynamic.class);
                intent.putExtra("phone", 3);
                startActivity(intent);
            }
        });
        ImageButton button2 = findViewById(R.id.image2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneList.this, Phone_Dynamic.class);
                intent.putExtra("phone", 4);
                startActivity(intent);
            }
        });
        ImageButton button1 = findViewById(R.id.image1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneList.this, Phone_Dynamic.class);
                intent.putExtra("phone", 5);
                startActivity(intent);
            }
        });
    }
}
