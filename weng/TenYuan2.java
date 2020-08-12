// 用1角，2角，5角凑出10元的所有方式

public class TenYuan2 {
    public static void main(String[] args) {
        int total = 0;
        final int sum = 100; // 要凑的钱数（10元）
        int one;
        int cnt = 1;

        for (int five=0; 5*five<=sum; five++) {
            for (int two=0; 2*two<=sum; two++) {
                one = sum - 5 * five - 2 * two;
                if (one >= 0) {
                    System.out.println(cnt + " One: " + one + " + Two: " + two + " + Five: " + five);
                    cnt ++;
                }
            }
        }
    }
}
