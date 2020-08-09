public class Prime {
    public static void main(String[] args) {
        // 经典质数计算问题
        // 命令行给定一个输入，判断是否为质数
        if (args.length == 0) {
            System.out.println("Please input an integer.");
            return;
        };
        int input = Integer.parseInt(args[0]);
        if (input == 1) {
            System.out.println("Not a prime.");
            return;
        }
        for (int i=2; i<input; i++) {
            if (input % i == 0) {
                System.out.println("Not a prime.");
                return;
            }
        }
        System.out.println("It's a prime.");
    }
}
