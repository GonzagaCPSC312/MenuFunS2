package com.sprint.gina.menufuns2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        // lets setup the back button (AKA home AKA up)
        // which is an arrow on the app bar that the user
        // can press to go to the "previous activity"
        // 2 options for what the previous activity could be
        // 1. the parent activity (set in AndroidManifest.xml)
        // android:parentActivityName=".MainActivity"
        // 2. the activity that started this activity
        // e.g. the activity under this one on the class stack
        // let's do a demo of #2

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // show the up arrow
        getSupportActionBar().setTitle("Add Item");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}