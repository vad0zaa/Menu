package ee.sinchukov.menu;

/**
 * Created by vsinchuk on 5/23/2015.
 */
public class Delay {
    private volatile boolean notCompleted;


    Delay(final int delay){
        notCompleted =true;

        Thread delayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                makeDelay(delay);
            }
        });
        delayThread.start();

    }

    public boolean delayNotCompleted(){
        return notCompleted;
    }


    void makeDelay(int delay){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        notCompleted = false;
    }
}
