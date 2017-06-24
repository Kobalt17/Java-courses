/**
 * Created by user on 19.06.2017.
 */
public class MyRunnable implements Runnable {

    private String threadname;
    private volatile boolean running = true;

    public MyRunnable(String threadname) {
        this.threadname = threadname;
    }

    public String getThreadname() {

        return threadname;
    }

    public void setThreadname(String threadname) {
        this.threadname = threadname;
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello:" + threadname);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void StopThread() {
        running = false;
    }


    public void setRunning(boolean running) {
        this.running = running;
    }
}