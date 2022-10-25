package task03.text01;
import java.util.Scanner;
public class Text01_2_FindChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符:"); //输入字符
        char ch=scanner.nextLine().charAt(0);
        System.out.println("请输入一个字符串:");//输入字符串
        String str=scanner.nextLine();

        int index=0,number=0;
        //查找字符在字符串中最后出现的位置
        while(index<str.length()){
           if(str.charAt(index)==ch)
                number=index;
           index++;
        }
        if(number!=0)
        System.out.println("该字符在字符串中最后出现的位置是："+number);
        else
            System.out.println("Not Found");
    }
}
