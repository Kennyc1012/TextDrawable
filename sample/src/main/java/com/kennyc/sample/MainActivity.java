package com.kennyc.sample;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.amulyakhare.textdrawable.TextDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = findViewById(R.id.test1);
        TextView tv2 = findViewById(R.id.test2);
        TextView tv3 = findViewById(R.id.test3);
        TextView tv4 = findViewById(R.id.test4);

        TextDrawable d1 = new TextDrawable.Builder()
                .setHeight(250)
                .setWidth(250)
                .setShape(TextDrawable.DRAWABLE_SHAPE_OVAL)
                .setText("A")
                .setColor(Color.BLUE)
                .build();

        tv1.setCompoundDrawablesWithIntrinsicBounds(d1, null, null, null);

        TextDrawable d2 = new TextDrawable.Builder()
                .setHeight(250)
                .setWidth(250)
                .setShape(TextDrawable.DRAWABLE_SHAPE_OVAL)
                .setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                .build();

        tv2.setCompoundDrawablesWithIntrinsicBounds(d2, null, null, null);

        TextDrawable d3 = new TextDrawable.Builder()
                .setHeight(250)
                .setWidth(250)
                .setShape(TextDrawable.DRAWABLE_SHAPE_RECT)
                .setText("A")
                .build();

        tv3.setCompoundDrawablesWithIntrinsicBounds(d3, null, null, null);

        TextDrawable d4 = new TextDrawable.Builder()
                .setHeight(250)
                .setWidth(250)
                .setShape(TextDrawable.DRAWABLE_SHAPE_RECT)
                .setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                .build();

        tv4.setCompoundDrawablesWithIntrinsicBounds(d4, null, null, null);
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
