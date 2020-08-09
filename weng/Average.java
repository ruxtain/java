import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // 用户输入一系列数求平均
        // 遇到非数字后结束输入，输出平均数
        Scanner in = new Scanner(System.in);        
        int num;
        int count = 0;
        double total = 0;
        while (true) {
            try {
                System.out.print(">>> ");
                num = in.nextInt();
                count++;
                total += num;
            }
            catch (java.util.InputMismatchException e) {
                System.out.printf("average: %.2f\n", total/count); 
                break;
            }
        }
    }    
}
