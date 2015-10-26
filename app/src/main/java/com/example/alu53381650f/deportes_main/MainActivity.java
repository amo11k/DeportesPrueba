package com.example.alu53381650f.deportes_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Deporte> deportes = new ArrayList<>();
        deportes.add(new Deporte("Futbol", R.mipmap.futbol));
        deportes.add(new Deporte("Basquet", R.mipmap.baloncesto));
        deportes.add(new Deporte("Beisbol", R.mipmap.beisbol));
        deportes.add(new Deporte("Ciclismo", R.mipmap.ciclismo));
        deportes.add(new Deporte("Tenis", R.mipmap.tenis));
        deportes.add(new Deporte("Natacion", R.mipmap.natacion));
        deportes.add(new Deporte("Hipica", R.mipmap.hipica));
        deportes.add(new Deporte("Golf", R.mipmap.golf));
        deportes.add(new Deporte("Pinpon", R.mipmap.pinpon));

        DeporteAdapter adapter = new DeporteAdapter(MainActivity.this, deportes);

        ListView list = (ListView) findViewById(R.id.listView);

        list.setAdapter(adapter);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
