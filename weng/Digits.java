public class Digits {
    public static void main(String[] args) {
        // 计算位数
        int i = 250032423;

        // 方法一:
        int d = 0;
        double rate = 1;
        while (rate >= 1) {
            rate = i / Math.pow(10, d+1);
            d += 1;
        }
        System.out.println(d);

        // 方法二:
        int j = i; // 复制这个数
        int d3 = 0;
        while (j >= 1) {
            j /= 10;
            d3 += 1; 
        }
        System.out.println(d3); 

        // 方法三:
        int boundary = 1;
        int d2 = 0;
        while (i > boundary) {
            d2 += 1; 
            boundary *= 10;
        }
        System.out.println(d2);
    }
}
