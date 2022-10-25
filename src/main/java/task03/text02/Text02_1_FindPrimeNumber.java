package task03.text02;
import java.util.Scanner;

public class Text02_1_FindPrimeNumber {
    public static boolean FindPriNumber01(int number) {
        if (number <2)
            return false;
        else
            for (int index = 2; index < number; index++) {
                if (number % index == 0)
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个自然数：");
        int number=scanner.nextInt();
        System.out.println("比这个自然数小的质数如下：");
      for(int index=0;index<number;index++){
          if(FindPriNumber01(index)){
              System.out.print(" "+index);
          }
      }
    }


}




