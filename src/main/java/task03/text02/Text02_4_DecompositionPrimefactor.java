package task03.text02;
import java.util.Scanner;
import java.lang.Math;

public class Text02_4_DecompositionPrimefactor {
   public static void DecompositionPrimefactor(int number){
       int minPriNmuber=2;
       System.out.print(number+"=");
           while (number >= minPriNmuber) {
             if(minPriNmuber==number) {
                 System.out.print(number);
                 break;
             }
              else if (number % minPriNmuber == 0) {
                   System.out.print(minPriNmuber + "*");
                   number /= minPriNmuber;
               }
               else minPriNmuber++;
           }
       }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = scanner.nextInt();
        if (number==1)
            System.out.println("“1”质因数分解没有意义");
       else
           DecompositionPrimefactor(number);
    }
}
