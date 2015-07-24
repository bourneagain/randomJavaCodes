//import java.lang.management.OperatingSystemMXBean;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.simple.JSONValue;

/**
 * Created by srajendran on 6/24/15.
 */
public class Test   {
    Map<String, String> cache;
    int aint;


    Test(){
        cache = new HashMap<String, String>();
        cache.put("1", "sama");
        cache.put("2", "sama");
        cache.put(null,"nulla");

    }

    void checkJSON(){

        String str = "{(\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6700) {\"exclaim3\" 0, \"word\" 1, \"exclaim2\" 1, \"__acker\" 1, \"exclaim1\" 1}, (\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6702) {\"exclaim3\" 1, \"word\" 0, \"exclaim2\" 1, \"__acker\" 1, \"exclaim1\" 0}, (\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6701) {\"exclaim3\" 0, \"word\" 0, \"exclaim2\" 1, \"__acker\" 1, \"exclaim1\" 1}, (\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6703) {\"exclaim3\" 0, \"word\" 1, \"exclaim2\" 1, \"__acker\" 1, \"exclaim1\" 0}} {{\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6700} {\"jvm_gcCount\" 10.0, \"jvm_gcTime\" 281.0, \"heap_maxBytes\" 7.16177408E8, \"nonHeap_committedBytes\" 5.6532992E7, \"heap_initBytes\" 2.68435456E8, \"jvm_threadCount\" 34.0, \"nonHeap_usedBytes\" 5.53884E7, \"jvm_cpuUtil\" 0.3758919057368638, \"nonHeap_maxBytes\" -1.0, \"heap_committedBytes\" 3.07232768E8, \"nonHeap_initBytes\" 2555904.0, \"heap_usedBytes\" 2.0714768E7}, {\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6702} {\"jvm_gcCount\" 8.0, \"jvm_gcTime\" 270.0, \"heap_maxBytes\" 7.16177408E8, \"nonHeap_committedBytes\" 5.4042624E7, \"heap_initBytes\" 2.68435456E8, \"jvm_threadCount\" 32.0, \"nonHeap_usedBytes\" 5.2980432E7, \"jvm_cpuUtil\" 0.005608130217561334, \"nonHeap_maxBytes\" -1.0, \"heap_committedBytes\" 3.145728E8, \"nonHeap_initBytes\" 2555904.0, \"heap_usedBytes\" 1.35701344E8}, {\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6701} {\"jvm_gcCount\" 8.0, \"jvm_gcTime\" 270.0, \"heap_maxBytes\" 7.16177408E8, \"nonHeap_committedBytes\" 5.3870592E7, \"heap_initBytes\" 2.68435456E8, \"jvm_threadCount\" 32.0, \"nonHeap_usedBytes\" 5.2727312E7, \"jvm_cpuUtil\" 0.3190378387036529, \"nonHeap_maxBytes\" -1.0, \"heap_committedBytes\" 3.19291392E8, \"nonHeap_initBytes\" 2555904.0, \"heap_usedBytes\" 1.38464984E8}, {\"b1fb0a0f-d869-4e87-a1a1-57daa8d31d1b\" 6703} {\"jvm_gcCount\" 9.0, \"jvm_gcTime\" 288.0, \"heap_maxBytes\" 7.16177408E8, \"nonHeap_committedBytes\" 5.5353344E7, \"heap_initBytes\" 2.68435456E8, \"jvm_threadCount\" 32.0, \"nonHeap_usedBytes\" 5.4306728E7, \"jvm_cpuUtil\" 0.004610284774249232, \"nonHeap_maxBytes\" -1.0, \"heap_committedBytes\" 3.18767104E8, \"nonHeap_initBytes\" 2555904.0, \"heap_usedBytes\" 5.7841904E7}}";
//        System.out.println(str);
//        System.out.println(JSONValue.parse(str));
        System.out.println(JSONValue.toJSONString(str));

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
        a.checkJSON();
//        a.checkHashCodeFinal();
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
