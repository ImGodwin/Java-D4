package companystructure;

public class Employee {

    private double baseSalary;

    private int serialNum;
    private double salary;
    private double overtime;

    private Position positions;

    private Department departments;


    //constructor
    public Employee(int serialNum, Department departments)
    {
    this.serialNum = serialNum;
    this.departments = departments;
    this.salary = baseSalary;
    this.overtime = 30;
    this.positions = Position.WORKER;
    }



    public void Employee(int serialNum, double baseSalary)
    {
        this.serialNum = serialNum;
        this.baseSalary = 1000;
    }


    public void employeedata(int serialNum)
    {
        System.out.println("Employee num: " + " " + serialNum);
    }

    public void employeePosition(Position positions)
    {
        for (Position position : Position.values()){
            if(position == Position.WORKER){
                System.out.println("You have been promoted to the position of a: " + " " +  Position.EMPLOYEE);
                this.salary = 1.200;
            } else if (position.equals("EMPLOYEE"))
            {
                System.out.println("You have been promoted to the position of a: " + " " +  Position.EXECUTIVE);
                this.salary = 1.500;
            } else if (position.equals("EXECUTIVE"))
            {
                System.out.println("You have been promoted to the position of a: " + " " +  Position.MANAGER);
                this.salary = 2000;
            } else if (position.equals("MANAGER")) {
                System.out.println("You are the manager of this company: " + " " +  Position.MANAGER);
            }
        }

    }

    public static void salaryCalc(int salary)
    {
        System.out.println("Your salary is:" + " " + salary);

    }
    
    
    

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }


    public void setPositions(Position positions) {
        this.positions = positions;
    }


    public void setDepartments(Department departments) {
        this.departments = departments;
    }
}
