package praktice_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        int kob = a * b * c;
        double aos = (a + b + c) / 3d;
        System.out.println(a+ " + "+b+" + "+c+" = "+ sum);
        System.out.println(a+ " * "+b+" * "+c+" = "+ kob);
        System.out.println("("+a+ " + "+b+" + "+c+") / 3 = "+ aos);

    }
}
