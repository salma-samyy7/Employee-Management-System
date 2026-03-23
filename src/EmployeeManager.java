import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees ;

    public EmployeeManager(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }

}
