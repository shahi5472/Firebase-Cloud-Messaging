package com.shahi.firebasefcmdemo;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database {
    public static void setAccessToken(String token) {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("tokens");
        databaseReference.child(String.valueOf(System.currentTimeMillis()))
                .setValue(token);
    }
}
