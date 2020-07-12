package zadania;

public class zadanie2 {
    public static void isPrimeNumber(int n) {
        boolean isPrime = true;
        if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        System.out.print("zadanie2 ");
        if (isPrime) {
            System.out.println(n + " Primary number");
        } else {
            System.out.println(n + " NOT a Primary number");
        }
    }
}


