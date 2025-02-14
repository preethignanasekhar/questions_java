
// 5.Check whether a number is a prime number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 1) {
            System.out.println("not a prime number "+n);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not a prime number "+n);
            }
        }
        System.out.println("prime number " +n);
    }
}
