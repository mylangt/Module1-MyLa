package java_overview;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBird = scanner.nextInt();

        int age = 2024 - yearOfBird;

        System.out.println("Tuổi của bạn là: " + age);
    }
}
