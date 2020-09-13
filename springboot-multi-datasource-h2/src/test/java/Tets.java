import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baron
 * @date 2020/8/11 19:58
 */
public class Tets {


    @Test
    public void listremove(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);
    }
}
