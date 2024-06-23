package java_overview;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem Toan: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhap he so diem Toan: ");
        double heSoDiemToan = scanner.nextDouble();

        System.out.print("Nhap diem Ly: ");
        double diemLy = scanner.nextDouble();

        System.out.print("Nhap he so diem Ly: ");
        double heSoDiemLy = scanner.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double diemHoa = scanner.nextDouble();

        System.out.print("Nhap he so diem Hoa: ");
        double heSoDiemHoa = scanner.nextDouble();

        double diemTB = (diemToan * heSoDiemToan + diemLy * heSoDiemLy + diemHoa * heSoDiemHoa) / (heSoDiemHoa + heSoDiemLy + heSoDiemToan);

        System.out.println("Diem trung binh: " + diemTB);
    }
}
