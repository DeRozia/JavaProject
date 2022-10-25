package task02.text03;

import java.util.Scanner;

public class Test03_1_Random {
    public static void main(String[] args) {
        //创建一个二位数随机数数组
        int[] array;
        array=new int[11];
        for(int count=0;count< array.length-1;count++){
            int data=(int)(Math.random()*90+10);
            array[count]=data;
          //text
            // System.out.println(array[count]);
        }
        //任意输入一个数
        Scanner scanner=new Scanner(System.in);
        System.out.println("请随机输入一个两位数：");
        array[array.length-1]= scanner.nextInt();
        for(int row=0;row< array.length-1;row++){
            for(int column=0;column<array.length-row-1;column++)
            if(array[column]>array[column+1]){
                int temp=0;
                temp=array[column];
                array[column]=array[column+1];
                array[column+1]=temp;
            }
        }
        //  打印数组
        System.out.println("十一位数组从小到大次序排列为：");
        for(int count=0;count< array.length;count++){
            System.out.println(array[count]);
        }
    }
}
