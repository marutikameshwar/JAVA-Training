package Day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
   public static void main(String []args){
        //myHashMap();
        myTreeMap();
   }

   public static void myHashMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        //Map<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(101,"pune");
        map.put(102,"chennai");
        map.put(103,"hyderabad");
        System.out.println(map);
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
   }
   public static void myTreeMap(){
        Map<Integer,String> treemap = new TreeMap<Integer,String>();

        treemap.put(101,"pune");
        treemap.put(102,"chennai");
        treemap.put(103,"hyderabad");
        treemap.put(102,"jabalpur");
        Set<Integer> set = treemap.keySet();
        for(Integer key : set){
            System.out.println(key+" "+treemap.get(key));
        }
        Map<Employee,String> empTree = new TreeMap<Employee,String>();
        


   }
    
}
