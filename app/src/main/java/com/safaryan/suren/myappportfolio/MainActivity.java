package com.safaryan.suren.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.Manifest.permission;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */
        return super.onOptionsItemSelected(item);
    }

    // Method for define pressed buttons
    public void launchApp(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        int message = 0;
        switch(view.getId()) {
            case R.id.buttonSpotify:
                message = R.string.spotify_pressed;
                break;
            case R.id.buttonScoresApp:
                message = R.string.scores_app_pressed;
                break;
            case R.id.buttonLibraryApp:
                message = R.string.library_app_pressed;
                break;
            case R.id.buttonBuiltItBigger:
                message = R.string.build_it_bigger_pressed;
                break;
            case R.id.buttonXYZ:
                message = R.string.xyz_pressed;
                break;
            case R.id.buttonCapstone:
                message = R.string.capstone_pressed;
                break;
        }
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
