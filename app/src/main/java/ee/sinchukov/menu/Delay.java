package ee.sinchukov.menu;

import android.util.Log;

/**
 * Created by vsinchuk on 5/23/2015.
 */
public class Delay {

    public volatile boolean notCompleted;
    private  Thread delayThread;

    Delay(){
        notCompleted =true;
        Log.i("my app","Delay class object created");
    }

    public boolean delayNotCompleted(){
        return notCompleted;
    }

    public void makeDelay(final int delay){
        delayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i("my app","makeDelay method started");
                    Thread.sleep(delay);
                    notCompleted = false;
                    Log.i("my app","makeDelay method finished");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        delayThread.start();
    }
}
