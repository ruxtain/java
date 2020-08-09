public class Binary {
    public static void main(String[] args) {
        // 输入一个整数，转二进制显示

        // 先简单过一遍位运算
        // 7 = 111
        int i = 7;
        // 111 << 1 = 1110        
        println(i << 1); // 14
        // 111 >> 1 = 11
        println(i >> 1); // 3
        // 111 & 010 = 010
        println(i & 2); // 2
        // 101 | 10 = 111
        println(5 | 2); // 7

        // 正式开始
        int input = 1993; 

        for (int j=31; j>=1; j--) {
            if((input & (1 << j)) != 0) // 全零的时候肯定是0，但不全零的时候不一定是1哦
                print(1); 
            else {
                print(0);
            }
        }
        System.out.println();
    }


    public static void print(int i) {
        System.out.print(i);
    }

    public static void println(int i) {
        System.out.println(i);
    }
}
