package ee.sinchukov.menu;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class ActivityUpdate extends ActionBarActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_update);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        Toast.makeText(this, "Updating...", Toast.LENGTH_LONG).show();

/*
        Delay d = new Delay(7000);
        while(d.delayNotCompleted()){}
        updateCompleted();*/
    }



    public void updateCompleted(){
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "update completed!", Toast.LENGTH_LONG)
                .show();
    }


}