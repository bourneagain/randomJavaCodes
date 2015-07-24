import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by srajendran on 7/18/15.
 */
public class Entry {
    static void  checkStudent(){
        Student one = new Student(33, "shyam");
        Student two = new Student(28, "ashyam");
        List<Student> newlist = new ArrayList<Student>();
        newlist.add(one);
        newlist.add(two);
        Collections.sort(newlist);
        for (Student st : newlist){
            System.out.println(st.age);
        }
    }

    void checkStudentComparator(){
        StudentComparator one = new StudentComparator(33, "shyam");
        StudentComparator two = new StudentComparator(28, "ashyam");
        List<StudentComparator > newlist = new ArrayList<StudentComparator>();
        newlist.add(one);
        newlist.add(two);
        Collections.sort(newlist, new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                if (o1.age > o2.age) {
                    return -1;
                } else if (o1.age < o2.age) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (StudentComparator st : newlist){
            System.out.println(st.age);
        }
    }


    void checkPriorityQueue() {
        PriorityQueue<StudentComparator> pq = new PriorityQueue<StudentComparator>(10, new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        pq.add(new StudentComparator(10, "sama"));
        pq.add(new StudentComparator(1, "saasdma"));
        pq.add(new StudentComparator(200, "samasdasa"));
        int i = pq.size();
        while (i>0) {
            System.out.println(pq.poll().getAge());
            i--;
        }
        System.out.println(pq.size());


    }
    public static void main(String[] args) {
        Entry a = new Entry();
        a.checkPriorityQueue();
//        a.checkStudentComparator();
    }

}
