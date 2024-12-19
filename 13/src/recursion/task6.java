package recursion;

public class task6 {
    public static boolean isPrime(int n, int d) {

        if (d * d > n) return true;
        if (n % d == 0) return false;

        return isPrime(n, d + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(isPrime(n, 2) ? "YES" : "NO");
    }
}

