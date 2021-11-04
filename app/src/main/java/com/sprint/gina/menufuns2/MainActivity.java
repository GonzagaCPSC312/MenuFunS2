package com.sprint.gina.menufuns2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we are going to add option items (AKA actions) to our app bar
        // steps
        // 1. define a menu xml file to represent MainActivity's menu items
        // 2. override a special callback method to inflate and set the menu xml file
        // 3. override a special callback method to we have code the executes
        // when the user clicks on one of our actions
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate main_menu.xml
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        switch(itemId) {
            case R.id.addMenuItem:
                // task: start a second activity
                Toast.makeText(this, "TODO: add item", Toast.LENGTH_SHORT).show();
                return true; // this event has been consumed/handled
            // task: finish other two cases
        }

        return super.onOptionsItemSelected(item);
    }
}