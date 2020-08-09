public class Fib {
    public static void main(String[] args) {
        // 经典的斐波拉契数列
        long a = 1;
        long b = 1;
        long c;
        int nums = 30; // 输出的个数

        for (int i=0; i<nums; i++) {
            c = a;
            System.out.print(a + " ");
            a = b;
            b = c + b;
        }

        System.out.println();
    }
}
