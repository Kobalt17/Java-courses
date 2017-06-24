import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.06.2017.
 */
public class ListThread implements Runnable {

   private CommonClass co;

    public ListThread(CommonClass co) {
        this.co = co;
    }

    @Override
    public void run() {

        for (int i=0; i < 100; i++){
            co.addItem(Math.round(Math.random()*100) + "");
        }
    }
}
