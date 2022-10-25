package task03.text02;
import java.util.Scanner;
import java.lang.Math;

public class Text02_2_FindPrimeNumber {
    static double squNumber=0.0;


    public static boolean FindPriNumber02(int number) {
        if (number < 2)
            return false;
        else
            squNumber=Math.sqrt(number);
        for (int index = 2; index < squNumber; index++) {
            if (number % index == 0)
                return false;
        }
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