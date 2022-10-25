package task03.text02;
import java.util.Scanner;
import java.lang.Math;

public class Text02_3_FindPrimeNumber {

    public static boolean FindPriNumber02(int number) {
        int[]res=new int[20];res[0]=2;
        int count=1;
        if (number < 2)
            return false;
        else if(number==2)
            return true;
else
        for (int index = 0; index < count; index++) {
            if (number % res[index] == 0)
                return false;
        }
        res[count]=number;
        count++;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个自然数：");
        int number = scanner.nextInt();
        System.out.println("比这个自然数小的质数如下：");
        for (int index = 0; index < number; index++) {
            if (FindPriNumber02(index)) {
                System.out.print(" " + index);
            }
        }
    }
}
