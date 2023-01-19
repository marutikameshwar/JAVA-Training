package Day3task;

public class DivisionException {
    public void division(int a,int b){
        try{
            int ans = a/b;
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("inside finnally block");
        }

    }
}
