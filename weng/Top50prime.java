// 从2开始，输出前50个素数

public class Top50prime {
    public static void main(String[] args) {
        int primeCnt = 0;        
        int prime = 2;
        while (primeCnt < 50) {
            prime ++;
            int is_prime = 1;
            for (int i=2; i<prime; i++) {
                if (prime % i == 0) {
                    is_prime = 0;
                }
            }
            if (is_prime == 1) {
                primeCnt ++;
                System.out.println(primeCnt + " " + prime);
            }
        }
    }
}
