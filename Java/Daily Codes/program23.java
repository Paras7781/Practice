class Employee {

     static String companyName;

     static {
        companyName = "TCS Pvt Ltd";
        System.out.println("Static Block Executed: Company Initialized");
    }

     String empName;

    {
        System.out.println("Instance Block Executed: New Employee Created");
    }

    Employee(String name) {
        empName = name;
    }

    static void showCompany() {
        System.out.println("Company Name: " + companyName);
    }

    void showEmployee() {
        System.out.println("Employee Name: " + empName);
    }
}

class Main {
    public static void main(String[] args) {

        Employee.showCompany();

        System.out.println();

        Employee e1 = new Employee("Paras");
        Employee e2 = new Employee("Rahul");

        System.out.println();

        e1.showEmployee();
        e2.showEmployee();
    }
}
