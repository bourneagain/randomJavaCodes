//import java.lang.management.OperatingSystemMXBean;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by srajendran on 6/24/15.
 */
public class Test {
    Map<String, String> cache;
    int aint;


    Test(){
        cache = new HashMap<String, String>();
        cache.put("1", "sama");
        cache.put("2", "sama");
        cache.put(null,"nulla");

    }



    void checkPassMethodToMethod(){

    }


    void checkArray(){

//        List a = new ArrayList<>();
        int[] a  = {1,2,3};
        Class b = a.getClass();
//        a.add(21);
        System.out.println(b.isArray());
//        System.out.println();

    }
    void checkInt(){
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        a++;
        System.out.println(a);
    }

    void checkFinal(){
        Test a;
        a = new Test();
        a.aint = 0;
        a.aint = 1;
        a = new Test();
        a.aint = 1;
        System.out.println(a.aint);

    }


    void checkHashCodeFinal(){
        String[] a = {"shyam", "sowbi"};
        for(final String str : a){
            System.out.println(System.identityHashCode(str));
        }
    }
    void checkEquals(){
        String a = new String("test");
        String b = new String("test");
        String c = "tests";
        String d = "tests";
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(c.equals(d));
        System.out.println(c==d);
    }

    void check2(List<String> names){
        TreeSet<String> name2s = new TreeSet<String>(names);
//        Collections.sort(name2s);
        for (String aa : name2s){
            System.out.println("names "  + aa);
            if (cache.get(aa) != null ){
                System.out.println("there for " + aa);
            }
        }
    }
    void check(){
    for(Map.Entry<String, String> entry : cache.entrySet()) {
            if ( entry.getKey().equals("sam")){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String args[]){
        Test a = new Test();
        a.checkHashCodeFinal();
//        a.checkFinal();
//        a.checkArray();
//        a.checkInt();
//        List<String> names = new ArrayList<>();
//        names.add("z");
//        names.add("a");
//        names.add("c");
//        names.add("ba");
//        names.add("ba");
////        names.add(null);
//        System.out.println(names.toString());
//        a.check2(names);
//        System.out.println(names.toString());
//        a.checkEquals();
    }
}
