package com.example.rishabh.planetmob;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;

public class Email extends AppCompatActivity {
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        dateView = findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month + 1, day);
    }

    public void buttonClick(View view) {
        EditText str1 = findViewById(R.id.ed_name);
        String chk1 = str1.getText().toString();

        EditText str2 = findViewById(R.id.ed_email);
        String chk2 = str2.getText().toString();

        EditText str3 = findViewById(R.id.ed_password);
        int chk3 = str3.getText().toString().length();

        EditText str4 = findViewById(R.id.ed_number);
        int chk4 = str4.getText().toString().length();


        if (chk1.equals("")) {
            Toast.makeText(getApplicationContext(), "Enter Name", Toast.LENGTH_SHORT).show();
        }
        else if (!chk2.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")) {
            Toast.makeText(getApplicationContext(), "Invalid Email ID", Toast.LENGTH_SHORT).show();
        }
        else if (chk3 < 8) {
            Toast.makeText(getApplicationContext(), "Password Too Short", Toast.LENGTH_SHORT).show();
        }
        else if (chk4 != 10) {
            Toast.makeText(getApplicationContext(), "Check Phone Number", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent myIntent = new Intent(Email.this, Home.class);
            Email.this.startActivity(myIntent);
        }
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    showDate(arg1, arg2 + 1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }
}

