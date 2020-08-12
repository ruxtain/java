// 用1角，2角，5角凑出10元的所有方式

public class TenYuan {
    public static void main(String[] args) {
        int total = 0;
        final int sum = 100; // 要凑的钱数（10元）
        int cnt = 1;

        for (int one=0; one<=sum; one++) {
            for (int two=0; 2*two<=sum; two++) {
                for (int five=0; 5*five<=sum; five++) {
                    total = 1 * one + 2 * two + 5 * five;
                    if (total == sum) {
                        System.out.println(cnt + " One: " + one + " + Two: " + two + " + Five: " + five);
                        cnt ++;
                    }
                }
            }
        }
    }
}
