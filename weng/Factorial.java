// 输入一个正整数，计算它的阶乘

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(">>> ");
        int number = in.nextInt();
        int number2 = number;
        int result = 1;
        while (number > 1) {
            result *= number;
            number -= 1;
        }
        System.out.println(result);

        // 如果用 for 循环实现？
        int result2 = 1;
        for (int i=1; i<=number2; i=i+1) {
            result2 *= i;
        }
        System.out.println(result2);
    }
}
