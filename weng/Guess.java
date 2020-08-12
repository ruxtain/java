import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 产生 1-100 随机数作为答案
        int answer = (int) (100 * Math.random() + 1);   
        int guess;
        int count = 0;
        
        do {
            System.out.print(">>> "); // 提示符
            count += 1;
            guess = in.nextInt(); // 不能写 int guess 因为是循环体，你不能重复定义，但是你可以改变值
            if (guess > answer) {
                System.out.println("Too big");
            }
            else if (guess < answer) {
                System.out.println("Too small");   
            }
            else {
                System.out.println("Bingo!");
                System.out.println("You guessed " + count + " times");
            }
        }
        while (guess != answer);
    }
}
