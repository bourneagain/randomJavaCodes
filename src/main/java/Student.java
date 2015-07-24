/**
 * Created by srajendran on 7/18/15.
 */
public class Student implements Comparable {
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student check = (Student) o;
        if ( this.age > check.age ){
            return 1;
        } else if (this.age < check.age ) {
            return -1;
        } else {
            return 0;
        }

    }
}
