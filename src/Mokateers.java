public class Mokateers {
    private int employeeId;
    private Strinfg name;
    private long salary;

    public Mokateers(int employeeId, Strinfg name, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Strinfg getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void print(){
        System.out.println("Name: "+getName());
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("Salary: "+getSalary());
    }
}
