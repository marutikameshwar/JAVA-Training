package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class MyHashset {
    public static void main(String []args){
        hsset();
    }
    public static void hsset(){
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("one");
        set.add("one");
        set.add("one");
        System.out.println(set);
    }
}
