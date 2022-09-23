package Day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnModifiedList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        System.out.println(list);

        Collections.unmodifiableList(list);

        list.add(15);

        System.out.println(list);
    }
}
