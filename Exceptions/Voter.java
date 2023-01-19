package Exceptions;

public class Voter {
    public void validateAge(int age){
        try{
            if(age > 18){

            }else{
                throw new AgeinvalidException("invalid age exception");
            }
        }catch(AgeinvalidException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void justFun(){
        System.out.println("just fun");
    }
}
