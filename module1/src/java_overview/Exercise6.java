package java_overview;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bien so xe: ");
        int bienSoXe = scanner.nextInt();

        int sum = bienSoXe % 10;
        bienSoXe = bienSoXe / 10;

        sum = sum + bienSoXe % 10;
        bienSoXe = bienSoXe / 10;

        sum = sum + bienSoXe % 10;
        bienSoXe = bienSoXe / 10;

        sum = sum + bienSoXe % 10;
        bienSoXe = bienSoXe / 10;

        sum = sum + bienSoXe;

        int nutBienSoXe = sum % 10;

        System.out.println("Nut cua bien so xe: " + nutBienSoXe);
    }
}
