package ee.sinchukov.menu;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

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
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(this,ActivitySettings.class);
            startActivity(settingsIntent);
            return true;

        }

        if (id == R.id.go_to_activity2) {

            Intent activity2Intent = new Intent(this,Activity2.class);
            startActivity(activity2Intent);
            return true;
        }

        if (id == R.id.go_to_activity3) {

            Intent activity3Intent = new Intent(this,Activity3.class);
            startActivity(activity3Intent);
            return true;
        }

        if (id == R.id.action_update) {

            Intent updateIntent = new Intent(this,ActivityUpdate.class);
            startActivity(updateIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
