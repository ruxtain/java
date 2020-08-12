public class HundredPrime {
    public static void main(String[] args) {
        for (int n=2; n<=100; n++) {
            int is_prime = 1;
            for (int i=2; i<n; i++) {
                if (n % i == 0)
                    is_prime = 0;
            }
            if (is_prime == 1) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
