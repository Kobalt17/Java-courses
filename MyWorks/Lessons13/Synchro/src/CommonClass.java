import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.06.2017.
 */
    public class CommonClass {


    private List<String> lisr = new ArrayList<>(20000);

    public synchronized void addItem(String str){
        lisr.add(str);
    }

    public synchronized int getSize(){
        return lisr.size();
    }
}
