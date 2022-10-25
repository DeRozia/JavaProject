package task02.text02;

public class Text02_3_NarciNumber {
    public static void main(String[] args) {
        for (int number = 100; number < 1000; number++) {
            int hunPlace = number / 100;    //三位数百位
            int decade = number % 100 / 10; //三位数十位
            int unit = number % 100 % 10;   //三位数个位
        if(number==hunPlace*hunPlace*hunPlace+decade*decade*decade+unit*unit*unit) //判断水仙花数
            System.out.println(number);
        }
    }
}

