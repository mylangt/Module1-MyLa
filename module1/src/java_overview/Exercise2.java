package java_overview;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int numberDifference = a - b;
        int multiplication = a * b;
        double division = (double) a/b;

        System.out.println("Tổng là: " + sum);
        System.out.println("Hiệu là" + numberDifference);
        System.out.println("Tích là: " + multiplication);
        System.out.println("Thương là: " + division);



    }
}
