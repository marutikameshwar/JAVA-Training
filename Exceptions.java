public class Exceptions {
    public void division(int a,int b){
        try{
            int div = a/b;
            System.out.println(div);
        }catch(ArithmeticException ae){
            System.out.println("arthemrtic error "+ ae);

        }
        System.out.println("end of division");
    }
    public void justfun() throws InterruptedException,ClassNotFoundException{
        Class.forName("");
        System.out.println("just funnn");
        Thread.sleep(10000);
    }
}
