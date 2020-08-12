// 输入一个整数，然后拆开，每个数逆序输出

import java.util.Scanner;

public class DigitBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(">>> ");
        int number = in.nextInt();
        int mid;
        while (number != 0) {
            mid = number % 10;
            System.out.println(mid);
            number = (int)(number / 10); // 砍掉个位数
        }
    }
}
