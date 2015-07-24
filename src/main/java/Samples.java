import java.util.ArrayList;
import java.util.List;

/**
 * Created by srajendran on 7/9/15.
 */
public class Samples {
    String a = new String("sam");
    String b = new String("sam");

    void testAdd(){
        List a = new ArrayList<Object>();
        a.add(2);
        a.add("sam");
        for(Object i : a){
            System.out.println(i);
        }
    }
    void test(){
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
    public static void main(String[] args) {
        Samples a = new Samples();
//        a.test();
        a.testAdd();

    }


}
