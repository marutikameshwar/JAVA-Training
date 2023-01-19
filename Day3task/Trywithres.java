package Day3task;
import java.util.*;
public class Trywithres {
    public void multiply(){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
