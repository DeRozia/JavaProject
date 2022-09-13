package task01;

public class Test02_Employee {
    public String name;

    private double salary;

    public Test02_Employee(String empName){
        name=empName;
    }
    public void setSalary(double empSalary){
        salary=empSalary;
    }
    public void printEmp(){
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args) {
        Test02_Employee empOne=new Test02_Employee("Bubba");
        empOne.setSalary(10000.0);
        empOne.printEmp();
    }

}
