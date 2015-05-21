package ee.sinchukov.menu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


public class ActivityUpdate extends ActionBarActivity {

    private ProgressBar  progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_update);


        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        //Toast.makeText(this, "Updating...", Toast.LENGTH_LONG)
          //      .show();


        // sdelat v otdelnom runnable !!!!
        // delay
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        progressBar.setVisibility(View.INVISIBLE);

        Toast.makeText(this, "Update completed!", Toast.LENGTH_LONG)
                .show();


    }


}
