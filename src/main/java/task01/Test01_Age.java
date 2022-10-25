package task01;

public class Test01_Age {

    //年龄函数
    public void pupAge(){
        int age=0;
        age=age+7;
        System.out.println("你的年龄是："+age);
    }
    public static void main(String[] args) {
        Test01_Age test=new Test01_Age();//创建一个对象
        test.pupAge();//调用函数
    }
}
