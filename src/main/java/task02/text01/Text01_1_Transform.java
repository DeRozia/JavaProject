package task02.text01;
import java.util.Scanner;
public class Text01_1_Transform {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个小写字母：");
        char lowercase=scanner.next().charAt(0); //从控制台中接受输入的小写字母
        switch (lowercase){
            case'a':
                System.out.println("对应的大写字母是："+'A');//打印大写字母A
                break;
            case'b':
                System.out.println("对应的大写字母是："+'B'); //打印大写字母
                break;
            case'c':
                System.out.println("对应的大写字母是："+'C'); //打印大写字母C
                break;
            case'd':
                System.out.println("对应的大写字母是："+'D'); //打印大写字母D
                break;
            case'e':
                System.out.println("对应的大写字母是："+'E'); //打印大写字母E
                break;
            default:
                System.out.println("other"); //打印”other“
                break;

        }
    }
}
