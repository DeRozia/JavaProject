package task02.text02;


public class Test02_1_AddOdd {
    public static int addNumber; //设为静态，用来记录和
    public static void main(String[] args) {

        for (int number = 1; number <= 100; number += 2) {
            int oddNumber = number;
            addNumber+=oddNumber;
        }
        System.out.println("100以内的奇数和为：" + addNumber);
    }
}
