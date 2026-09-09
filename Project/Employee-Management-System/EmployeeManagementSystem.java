import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> e1 = new ArrayList<>();
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
                    displayEmployee();
                    break;
                case 3:
                    System.out.print("Enter employee id: ");
                    int checkId = sc.nextInt();
                    int foundEmployee = employeeFound(checkId);
                    if(foundEmployee != -1) {
                        searchEmployee(foundEmployee);
                    } else {
                        System.out.println("Employee not found");
                        System.out.println();
                    }
                    
                    break;
                case 4:
                    System.out.print("Enter employee id: ");
                    int updateId = sc.nextInt();
                    int employeeFound = employeeFound(updateId);
                    if(employeeFound != -1) {
                        updateEmployeeInfo(id, name, age, department, salary, employeeFound);
                    } else {
                        System.out.println("Employee not found");
                        System.out.println();
                    }
                    break;
                case 5:
                    int deleteId;
                    System.out.print("Enter employee id to delete details: ");
                    deleteId = sc.nextInt();
                    int employeeDelete = employeeFound(deleteId);
                    if(employeeDelete != -1) {
                        deleteEmployeeInfo(employeeDelete);
                    } else {
                        System.out.println("Employee does'nt exist");
                        System.out.println();
                    }
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
        e1.add(new Employee(id, name, age, department, salary));
        System.out.println("Employee Details addded successfully");
        System.out.println();
    }
    //2. Display employee
    static void displayEmployee() {
        for (int i = 0; i < e1.size(); i++) {
            e1.get(i).display();
        }
    }
    //3. Search an Employee
    static void searchEmployee(int checkId) {
            System.out.println("Employee Found!!");
            System.out.println("Employee ID: " + e1.get(checkId).getId()+ ", Employee name: " + e1.get(checkId).getName());
            System.out.println();
        }
    //4. Updating Employee Info
    static void updateEmployeeInfo(int id, String name, int age, String department, double salary, int updateId) {
            System.out.print("Enter employee id: ");
            e1.get(updateId).setId(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter employee name: ");
            e1.get(updateId).setName(sc.nextLine());
            System.out.print("Enter employee age: ");
            e1.get(updateId).setAge(sc.nextInt());
            sc.nextLine();
            System.out.print("Enter employee department: ");
            e1.get(updateId).setDepartment(sc.nextLine());
            System.out.print("Enter employee salary: ");
            e1.get(updateId).setSalary(sc.nextDouble());
            System.out.println("Employee details updated successfully");
            System.out.println();

    }
    // 5. Delete employee details
    static void deleteEmployeeInfo(int deleteId) {
        e1.remove(deleteId);
    }
    //Helper function ==> Checks whether employee exists or not
    static int employeeFound(int updateId) {
        for (int i = 0; i < e1.size(); i++) {
            if(updateId == e1.get(i).getId()) {
                return i;
            }
        }
        return -1;
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
        System.out.println("Employee ID: " + this.id + ", Name: " + this.name + ", Age: " + this.age + ", Department: " + this.department + ", Salary: " + this.salary);
    }
}