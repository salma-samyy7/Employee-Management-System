import java.util.Scanner;

public class Main {
    final static String admin = "Salma samy";
    final static String password = "12345";


    public static void main(String[] args) {
        int choice;
        EmployeeManager em = new EmployeeManager();
        Scanner input = new Scanner(System.in);
        System.out.println("----------Employee Management System---------");
        System.out.println("Please Login");
        while (!verify(input)) {
            System.out.println("wrong username or password");
        }
        do {
            menu();
            System.out.print("please enter a choice: ");
            choice = input.nextInt();
            input.nextLine();
            process(choice,em,input);
        } while (choice != 6);

    }

    public static boolean verify(Scanner input) {
        System.out.println("Please Enter Your Username");
        String username = input.nextLine();
        System.out.println("Please Enter Your Password");
        String pass = input.nextLine();

        return username.equals(admin) && pass.equals(password);
    }

    public static void menu() {
        System.out.println("1-Add Employee");
        System.out.println("2-Delete Employee");
        System.out.println("3-Search Employee");
        System.out.println("4-Update Employee");
        System.out.println("5-view Employees");
        System.out.println("6-Exit");


    }

    public static void process(int choice,EmployeeManager em,Scanner input) {
        switch (choice) {
            case 1: {
                System.out.println("Enter Employee ID");
                int id = input.nextInt();
                System.out.println("Enter Employee Name");
                String name = input.next();
                System.out.println("Enter Employee Salary");
                int salary = input.nextInt();
                em.addEmployee(name, id, salary);

            }
            break;
            case 2: {
                System.out.println("Enter Employee ID");
                int id = input.nextInt();
                em.removeEmployee(id);

            }
            break;
            case 3: {
                System.out.println("Enter Employee ID");
                int id = input.nextInt();
                if (em.getById(id) != null) {
                    System.out.println("Employee found");
                    System.out.println(em.getById(id));
                } else {
                    System.out.println("Employee not found");
                }
            }
            break;
            case 4: {
                System.out.println("Enter Employee ID");
                int id = input.nextInt();
                System.out.println("Enter Employee Salary");
                int salary = input.nextInt();
                em.updateEmployee(salary,id);

            }
            break;
            case 5: {
                em.viewEmployees();
            }
            break;
            case 6: {
                System.out.println("Exiting...");

            }
            break;
            default:
                System.out.println("Invalid input");

        }
    }
}