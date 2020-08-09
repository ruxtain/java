public class Interest {
    public static void main(String[] args) {
        // 一次性投入
        int year = 10;
        double rate = 0.3;
        double capital = 50000.0; 
        // 根据本金、利率和年数来计算最终总收入
        double total = capital * Math.pow(1 + rate, year);

        // 关于格式化输出 https://www.runoob.com/w3cnote/java-printf-formate-demo.html
        System.out.printf(
                "invest %.2f with an interest of %.2f%%, you'll get %.2f after %d years.\n",
                capital, rate * 100, total, year
            );

        // 每个月定投 5000，投10年，每个月收益1%
        int month = 10 * 12;
        double month_rate = 0.01;
        double month_capital = 5000;
        double total_capital = 0;
        for (int i=0; i<month; i++) {
            total_capital += (total_capital * month_rate + month_capital);
        }

        System.out.printf("%.2f\n", total_capital);
    }
}
