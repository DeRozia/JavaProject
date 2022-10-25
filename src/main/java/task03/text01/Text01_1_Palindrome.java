package task03.text01;
import java.util.Scanner;

public class Text01_1_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//创建输入对象
        System.out.println("请输入一段字符串：");
        String str=scanner.nextLine();//将输入字符串赋值str
        String palinStr="";//定义回文字符串

        char strArray[]=new char[str.length()];//创建一个字符串数组接受逐个字符
        for(int index=0;index<str.length();index++){
            strArray[index]=str.charAt(str.length()-index-1);//反向赋值
            palinStr+=strArray[index];//将字符连接成字符串
        }

        //判断新旧字符是否相等
        if(str.equals(palinStr))
            System.out.println("您输入的是一段回文字符串！");
        else
            System.out.println("您输入的不是一段回文字符串！");
    }
}
