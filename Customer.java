public class Customer {
    private int cId;
    private String name;
    public Account account;
    public Customer (){
        account = new Account();
    }
    public int getcId() {
        return cId;
    }
    public String getName() {
        return name;
    }
    public Account getAccount() {
        return account;
    }
    public void setcId(int cId) {
        this.cId = cId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
