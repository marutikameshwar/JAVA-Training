package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String []args){
        MyArrayList();
    }
    public static void MyArrayList(){
        List<String> list = new ArrayList<String>();
        list.add("kaushik");
        list.add("anya");
        System.out.println(list);
        for(String name:list) System.out.println(name);
        // can be done by itetator 
        
        
    }
}
