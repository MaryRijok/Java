package recursion;

public class task4 {
    public static int countNumbers(int k, int s, boolean isFirstDigit) {

        if (k == 0) return s == 0 ? 1 : 0;
        int count = 0;
        int start = isFirstDigit ? 1 : 0;
        for (int i = start; i <= 9; i++) {
            if (s >= i) {
                count += countNumbers(k - 1, s - i, false);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int k = 3;
        int s = 6;
        System.out.println(countNumbers(k, s, true));
    }
}

