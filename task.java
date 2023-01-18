import java.util.*;



public class task {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Solve ans = new Solve();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(ans.maxOfthree(a,b,c));
        // ans.posorneg(a);
        // System.out.println(ans.checkPrime(a));
        int number = sc.nextInt();
        System.out.println(ans.checkPalimdrome(number));

        Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setData(101, "Kaushik", 999999);
		emp2.setData(101, "Anya", 999999);
		emp3.setData(101, "AK", 999999);

		Employee[] emp = new Employee[3];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;

		emp[0].display();

    }
}

class Solve{
    public int maxOfthree(int a,int b, int c){
        int d = Math.max(a,b);
        return Math.max(d,c);   
    }
    public void posorneg(int a){
        if (a > 0) System.out.println("Positive");
        else if (a < 0) System.out.println("Negitive");
        else System.out.println("Zero");
    }
    public boolean checkPrime (int a){
        boolean isPrime = true;
        for(int i = 2;i<a-1;i++){
            if (a%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public boolean checkPalimdrome(int a){
        String s = a + "";
        boolean isPalindrome = true;
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }   
    public int cube(int a){
        return a*a*a;
    }
}