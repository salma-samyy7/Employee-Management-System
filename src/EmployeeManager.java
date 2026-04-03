import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees ;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    public void removeEmployee(int id)
    {
        Employee employee = getById(id);
        if(employee != null)
        {
            employees.remove(employee);
        }else{
            System.out.println("Employee not found");
        }


    }

    public void updateEmployee(int Salary,int id)
    {
        Employee employee = getById(id);
        if(employee != null)
        {
            employee.setSalary(Salary);
        }else {
            System.out.println("Employee not found");
        }

    }

    public void viewEmployees()
    {
       for (Employee employee : employees) {
           System.out.println(employee);
       }
       if(employees.isEmpty())
       {
           System.out.println("No employees found");
       }
    }


}
