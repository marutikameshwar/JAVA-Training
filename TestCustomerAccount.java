public class TestCustomerAccount {
    public static void main(String [] args){
        Customer c1 = new Customer();
        c1.setcId(101);
        c1.setName("kaushik");
        Account a1 = new Account();
        a1.setData(12323123, 999999999);
        c1.setAccount(a1);
        System.out.println(c1);
    }
}
