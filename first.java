
import java.util.*;
public class first{
    public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// a = a+b;
	    // b = a-b;
	    // a = a-b;
	    // System.out.println(a);	
	    // System.out.println(b);
		Employee emp = new Employee();
		emp.setData(121, "AK", 9999999);
		System.out.println(emp);
		Child c1 = new Child(100);
		c1.show();
		c1.addition();
		System.out.println("______________");
		Parent ref;
		ref = new Parent();
		ref.show();
		ref = new Child(90);
		ref.show();


		
	}
}
