import java.util.ArrayList;

public class EmployeeManager {
    ArrayList<Employee> employees;

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

    public void addEmployee(String name, int id, int salary) {
        if (getById(id) == null) {
            Employee employee = new Employee(name, id, salary);
            employees.add(employee);
            System.out.println("Employee added");
        } else {
            System.out.println("Employee already exists");
        }
    }

    public void removeEmployee(int id) {
        Employee employee = getById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee removed");
        } else {
            System.out.println("Employee not found");
        }


    }

    public void updateEmployee(int Salary, int id) {
        Employee employee = getById(id);
        if (employee != null) {
            employee.setSalary(Salary);
            System.out.println("Employee updated");
        } else {
            System.out.println("Employee not found");
        }

    }

    public void viewEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        if (employees.isEmpty()) {
            System.out.println("No employees found");
        }
    }


}
