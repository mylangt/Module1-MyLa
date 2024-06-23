package java_overview;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();

        System.out.print("Nhap so luong san pham: ");
        int soLuongSanPham = scanner.nextInt();

        System.out.print("Nhap don gia san pham: ");
        double giaSanPham = scanner.nextInt();

        double tienSanPham = soLuongSanPham * giaSanPham;

        double thueGTGT = tienSanPham * 0.1;

        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Tong tien san pham: " + tienSanPham);
        System.out.println("Thue VAT phai tra: " + thueGTGT);
    }
}
