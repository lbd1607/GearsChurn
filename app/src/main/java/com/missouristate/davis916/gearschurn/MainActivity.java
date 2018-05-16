package com.missouristate.davis916.gearschurn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Laura Davis CIS 262-902
 * 24 March 2018
 * This app simulates the movement of two gears when the smaller
 * top gear moves clockwise. The turning of the gears
 * is activated by a button click. 
 */

public class MainActivity extends Activity {
    private ImageView gear1Img;
    private ImageView gear2Img;

    private Gear gear1;
    private Gear gear2;

    private float currentDegree;
    private float degree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gear1Img = (ImageView) findViewById(R.id.imageView1);
        gear2Img = (ImageView) findViewById(R.id.imageView2);

        initializeGears();
    }//end onCreate()

    private void initializeGears(){
        //Gear 1 will move in a clockwise direction
        gear1 = new Gear();
        gear1.setStartDegree(0);
        gear1.setEndDegree(360);

        //Gear 2 will move in a counter-clockwise direction
        gear2 = new Gear();
        gear2.setStartDegree(0);
        gear2.setEndDegree(-360);
    }//end initializeGears

    public void animateGears(View view){
        final int DELAY = 1000;

        RotateAnimation ra1 = new RotateAnimation(gear1.getStartDegree(),
                gear1.getEndDegree(), Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        ra1.setDuration(DELAY);
        ra1.setFillAfter(true);
        gear1Img.startAnimation(ra1);

        RotateAnimation ra2 = new RotateAnimation(gear2.getStartDegree(),
                gear2.getEndDegree(), Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        ra2.setDuration(DELAY);
        ra2.setFillAfter(true);
        gear2Img.startAnimation(ra2);
    }//end animateGears

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }//end createOptionsMenu

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button,
        //as long as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }//end onOptionsItemSelected

}//end MainActivity
