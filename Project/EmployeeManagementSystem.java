import java.util.Scanner;

public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static Employee e1;
    public static void main(String[] args) {

        System.out.println();
        System.out.println("\t Employee Management System");
        System.out.println("\t============================");
        System.out.println();
        System.out.println("Select the following option for any operations:-");
        System.out.println();
        int inp = 0;
        while (inp != 6) {
            
            System.out.println("1. Add new Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your input: ");

            inp = sc.nextInt();
            System.out.println();

            int id = 0;
            String name = null;
            int age = 0;
            String department = null;
            double salary = 0.0;

            

            switch (inp) {
                case 1:
                    employeeDetails(id, name, age, department, salary);
                    break;
                case 2:
                    e1.display(); //2. displaying employee details
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter employee id: ");
                    int checkId = sc.nextInt();
                    searchEmployee(checkId);
                    break;
                case 4:
                    updateEmployeeInfo(id, name, age, department, salary);
                    break;
                case 5:
                    int deleteId;
                    System.out.print("Enter employee id to delete details");
                    deleteId = sc.nextInt();
                    deleteEmployeeInfo(deleteId);
                    break;
                case 6: 
                    System.out.println("Thanks for visiting!!");
                    break;
                default:
                    System.out.println("Input valid number!!");
                    System.out.println();
                    
            }
        }
    }
    //1. Adding new Employee
    static void employeeDetails(int id, String name, int age, String department, double salary) {
        System.out.print("Enter employee id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee department: ");
        department = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        e1 = new Employee(id, name, age, department, salary);
        System.out.println("Employee Details addded successfully");
        System.out.println();
    }
    //3. Search an Employee
    static void searchEmployee(int checkId) {
        if(checkId == e1.getId()) {
            System.out.println("Employee Found!!");
            System.out.println("Employee name: " + e1.getName());
            System.out.println();
        } else {
            System.out.println("Employee not found");
            System.out.println();
        }
    }
    //4. Updating Employee Info
    static void updateEmployeeInfo(int id, String name, int age, String department, double salary) {
        System.out.print("Enter employee id: ");
        e1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter employee name: ");
        e1.setName(sc.nextLine());
        System.out.print("Enter employee age: ");
        e1.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter employee department: ");
        e1.setDepartment(sc.nextLine());
        System.out.print("Enter employee salary: ");
        e1.setSalary(sc.nextDouble());
        System.out.println("Employee details updated successfully");
        System.out.println();
    }
    // 5. Delete employee details
    static void deleteEmployeeInfo(int deleteId) {
        if(deleteId == e1.getId()) {
            e1.setId(0);
            e1.setName(null);
            e1.setAge(0);
            e1.setDepartment(null);
            e1.setSalary(0.0);
            System.out.println("Employee details deleted successfully");
            System.out.println();
        } else {
            System.out.println("This employee id does'nt exist");
            System.out.println();
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}