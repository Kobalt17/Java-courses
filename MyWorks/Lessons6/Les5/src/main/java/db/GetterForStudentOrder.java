package db;

import domain.PersonAdult;
import domain.PersonChild;
import domain.StudentOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonsaburov on 06.03.17.
 */
public class GetterForStudentOrder
{
    public static List<StudentOrder> getStudentOrderList() {
        List<StudentOrder> result = new ArrayList<StudentOrder>();
        for(int i=0; i<3; i++) {
            result.add(getStudentOrder("Husband " + i, "Wife " + i, "Child " + i));
        }

        return result;
    }

    private static StudentOrder getStudentOrder(String hName, String wName, String cName) {
        PersonAdult h = new PersonAdult();
        h.setGivenName(hName);
        PersonAdult w = new PersonAdult();
        w.setGivenName(wName);
        PersonChild c = new PersonChild();
        c.setGivenName(cName);

        StudentOrder so = new StudentOrder(h, w, c);

        return so;
    }

}
