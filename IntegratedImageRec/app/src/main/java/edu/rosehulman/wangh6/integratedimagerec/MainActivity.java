package edu.rosehulman.wangh6.integratedimagerec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends GolfBallDeliveryActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.action_next) {
//            Toast.makeText(this,"u clicked next",Toast.LENGTH_SHORT).show();
            mViewFlipper.showNext();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
