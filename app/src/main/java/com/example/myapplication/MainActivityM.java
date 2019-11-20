package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ensias_auth_library.FoxyAuth;
import com.example.ensias_auth_library.models.GameStat;
import com.example.myapplication.GameViews.StartingScreen;
import com.example.myapplication.GameViews.StartingScreenArabic;
import com.example.myapplication.GameViews.StartingScreenFrench;

import java.io.IOException;

public class MainActivityM extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FoxyAuth.emerge(this, Track.class);

    }


    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

}
