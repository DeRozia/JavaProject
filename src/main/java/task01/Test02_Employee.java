package task01;

public class Test02_Employee {
    public String name;//定义姓名变量

    private double salary;//定义薪水变量
    //构建函数
    public Test02_Employee(String empName){
        name=empName;
    }
    //设置薪水函数
    public void setSalary(double empSalary){
        salary=empSalary;
    }
    //打印函数
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
