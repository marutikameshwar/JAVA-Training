package Day3task;

public class Multiplecatch {
    public void appendLength(String s){
        try{
            int l = s.length();
            System.out.println(s+l);
        }catch(NullPointerException e){
            System.out.println("null pointer exp");
            e.printStackTrace();

        }catch(Exception e){
            System.out.println("general exception ");
            e.printStackTrace();
        }
    }
}
