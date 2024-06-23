package java_overview;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ban kinh r: ");
        double r = scanner.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.println("Chi vi hinh tron la: " + chuVi);
        System.out.println("Dien tich hinh tron la: " + dienTich);
    }
}
