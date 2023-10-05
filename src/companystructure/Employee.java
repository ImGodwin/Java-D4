package companystructure;

public class Employee {

    private double baseSalary;

    private int serialNum;
    private double monthlysalary;
    private double overtime;

    private Position positions;

    private Department departments;


    //constructor
    public Employee(int serialNum){
        
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


    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    public void setPositions(Position positions) {
        this.positions = positions;
    }


    public void setDepartments(Department departments) {
        this.departments = departments;
    }
}
