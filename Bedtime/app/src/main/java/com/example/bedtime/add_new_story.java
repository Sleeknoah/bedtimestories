package com.example.bedtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class add_new_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_story);
    }

    public void openNewStoryTwo(View view) {
        Intent intent = new Intent(this, add_new_story2.class);
        startActivity(intent);
    }
}