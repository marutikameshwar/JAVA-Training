public class Employee {

    private int eid;
    private String name;
    private double salary;
    private Department department;

    public Employee() {
        System.out.println("default constructor");
    };

    public Employee(Department department) {
        this.department = department;
    }

    public void setData(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(eid + " " + name + " " + salary);
    }

    public String toString() {
        return eid + " " + name + " " + salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + eid;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (eid != other.eid)
            return false;
        return true;
    }
    // Hash code to avoid same sets
}
