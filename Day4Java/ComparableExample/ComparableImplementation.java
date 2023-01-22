package Day4Java.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

public class ComparableImplementation {
    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "kaushik", 23));
        al.add(new Student(106, "appani", 27));
        al.add(new Student(105, "anya", 21));

        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
