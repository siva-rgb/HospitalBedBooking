package com.example.hospitalbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserBookingActivity extends AppCompatActivity {
    /**TODO: In this Activity user can view their booking Copy the exact code from order_layout.xml to booking_layout.xml
     *  copy the code of AdminUserProduct.java to complete the user view of their booking but there admin can view the booking of every user but
     *  here user can only view his own details
     *  check for the current user if the current user is found develop code so that this activity will show them booking details from firebase node
     *  and provide a button that save the user booking details as a pdf format
     */
    private Button booking;
    private String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_booking);
        booking=findViewById(R.id.booking);

    }

    @Override
    protected void onStart() {
        super.onStart();


    }


}