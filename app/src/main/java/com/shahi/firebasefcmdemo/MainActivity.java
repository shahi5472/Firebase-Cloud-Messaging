package com.shahi.firebasefcmdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToken();
    }

    private void setupToken() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(task -> {
            Database.setAccessToken(task.getResult());
            Log.d("TAG", task.getResult());
        });
    }
}