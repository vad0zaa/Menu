package ee.sinchukov.menu;

/**
 * Created by vsinchuk on 5/23/2015.
 */
public class Delay {

    public volatile boolean notCompleted;
    private  Thread delayThread;

    Delay(){
        notCompleted =true;
    }

    public boolean delayNotCompleted(){
        return notCompleted;
    }

    public void makeDelay(final int delay){
        delayThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(delay);
                    notCompleted = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        delayThread.start();
    }
}
