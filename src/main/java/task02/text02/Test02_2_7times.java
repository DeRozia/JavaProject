package task02.text02;

public class Test02_2_7times {
    static int count = 0; //设为静态，用来计数
    static int addNumber=0; //设为静态，用来记录和
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if(number%7==0){
                addNumber+=number;
                count++;
            }
        }
        System.out.println("100以内7的倍数的整数的个数："+count);
        System.out.println("100以内7的倍数的整数总和："+addNumber);
    }
}