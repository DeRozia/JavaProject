package task02.text01;
import java.util.Scanner;
public class Text01_4_Calendar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month =scanner.nextInt();
        System.out.println("请输入日期：");
        int day=scanner.nextInt();
        int days=(month-1)*30+day;
        switch(month){
            case 1:case 4: case 5:
                System.out.println("输入日期是2014年的第"+days+"天");break;
            case 3:
                days-=1;
                System.out.println("输入日期是2014年的第"+days+"天");break;
            case 2: case 6: case 7:
                days+=1;
                System.out.println("输入日期是2014年的第"+days+"天");break;
            case 8:
                days+=2;
                System.out.println("输入日期是2014年的第"+days+"天");break;
            case 9: case 10:
                days+=3;
                System.out.println("输入日期是2014年的第"+days+"天");break;
            case 11: case 12:
                days+=4;
                System.out.println("输入日期是2014年的第"+days+"天");break;
        }
    }
}
