import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 19.06.2017.
 */
public class Started {

    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass("3"));
        list.add(new MyClass("1"));
        list.add(new MyClass("5"));
        list.add(new MyClass("2"));
        list.add(new MyClass("23"));

        Collections.sort(list, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.getS().compareTo(o2.getS());
            }
        });


        for (MyClass mc : list){
            System.out.println(mc.getS());
        }
    }
}
