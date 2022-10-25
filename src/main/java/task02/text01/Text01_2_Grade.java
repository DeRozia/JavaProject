package task02.text01;
import java.util.Scanner;
public class Text01_2_Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该学生的成绩：");
        int stuGrade=scanner.nextInt();
        if(stuGrade>100&&stuGrade<0)
            System.out.println("输入错误");
        else if(stuGrade>60)
            System.out.println("合格");
        else
            System.out.println("不合格");
    }
}
