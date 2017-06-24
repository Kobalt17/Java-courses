import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19.06.2017.
 */
public class Started {

    public static void main(String[] args) throws InterruptedException {

        List<MyRunnable> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MyRunnable mt = new MyRunnable("Name" + i);
            Thread t = new Thread(mt);
            t.start();
            list.add(mt);
        }

        Thread.sleep(2000);

        for (MyRunnable mt : list) {
            mt.StopThread();
        }

        annonExample();
    }


    private static void annonExample() {
        Thread t = new Thread() {
            @Override
            public void run() {

                System.out.println("Annonimus");
            }

        };
        t.start();
    }
}
