import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void task1(int[] arr) {
        int res = 0, i = 0;
        for (; i < arr.length; i++)
            res += arr[i];
        System.out.println("Resut using \"for\": " + res);

        res = 0; i = 0;
        while (i < arr.length)
            res += arr[i++];
        System.out.println("Resut using \"while\": " + res);

        res = 0; i = 0;
        do {
            res += arr[i];
        } while (++i < arr.length);
        System.out.println("Resut using \"for\": " + res);
    }

    public static void task2(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void task3() {
        for (int i = 1; i <= 10; i++) {
            double num = 0;
            for (int j = 1; j <= i; j++)
                num += 1.0 / j;
            System.out.println("Number " + i + " of series is " + (double) Math.round(num * 1000) / 1000);
        }
    }

    public static int task4(int rec) {
        if (rec == 2)
            return 0;
        int random[] = new int[10];
        if (rec == 0)
            for (int i = 0; i < random.length; i++)
                random[i] = Math.round((float) (Math.random() - 0.5) * 1000000);
        else {
            Random rand = new Random();
            for (int i = 0; i < random.length; i++)
                random[i] = rand.nextInt();
        }

        System.out.println("Before sorting");
        for (int i = 0; i < random.length; i++)
            System.out.println(random[i]);

        Arrays.sort(random);

        System.out.println("After sorting");
        for (int i = 0; i < random.length; i++)
            System.out.println(random[i]);

        return task4(rec + 1);
    }

    public static void task5() {
        int num = 5;
        System.out.println(num + "! = " + facrotial(num));
    }

    public static int facrotial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        for (int i = 0; i < data.length; i++)
            data[i] = i * 10;
        System.out.println("Task #1");
        task1(data);
        System.out.println("Task #2");
        task2(args);
        System.out.println("Task #3");
        task3();
        System.out.println("Task #4");
        task4(0);
        System.out.println("Task #5");
        task5();
    }
}