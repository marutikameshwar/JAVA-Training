public class Employee {
    
    private int eid;
    private String name;
    private double salary;
    private Department department;
    public Employee(){
        System.out.println("default constructor");
    };
    public Employee (Department department){
        this.department = department;
    }
    public void setData(int eid,String name,double salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }   
    public void display(){
        System.out.println(eid + " "+ name + " "+ salary);
    }
    public String toString(){
        return eid + " "+ name + " "+ salary;
    }
    public Department getDepartment() {
        return department;
    }

}
