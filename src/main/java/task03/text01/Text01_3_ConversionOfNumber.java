package task03.text01;
import java.util.Scanner;
public class Text01_3_ConversionOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个十六进制数字符串：");
        String numString =scanner.nextLine();//接收输入的十六进制数字符串
        int decimalNumber=0;//定义转换后的十进制数
        char[] charArray=new char[numString.length()];//定义字符数组,接收字符串逐个字符
        int[]numArray=new int[numString.length()];//定义整数数组,接收逐个字符转换的整数

        for(int index=0;index<numString.length();index++){
            charArray[index]=numString.charAt(index);//遍历接收逐个字符
            int number=charArray[index]+0;//将字符转换成ASCII码
            if(number>96)//判断字符是数字还是字母
            numArray[index]=10+(charArray[index]-'a');//字母字符转换为整数
            else
                numArray[index]=Integer.parseInt(""+charArray[index]);//数字字符转换为整数
            decimalNumber+=numArray[index]*Math.pow(16.0,(double)numString.length()-(double)index-1);//求和

        }
        System.out.println("对应的十进制数为："+decimalNumber);

    }
}
