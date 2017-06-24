/**
 * Created by user on 21.06.2017.
 */
public class Starter {

    public static void main(String[] args) throws InterruptedException {

        CommonClass cc = new CommonClass();

        for (int i = 0; i < 100; i++) {
            ListThread lt = new ListThread(cc);
            new Thread(lt).start();
        }


            Thread.sleep(2000);

        System.out.println(cc.getSize());


    }
}
