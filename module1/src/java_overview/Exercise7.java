package java_overview;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("---------------- Bai 7A ----------------");
        int a = 1, b = 1;
        int c = a++ + b++; // a = 2, b = 2
        //  c = 1   + 1 = 2

        System.out.println("---------------- Bai 7B ----------------");
        int d = 1, e = 1;
        int f = d++ + ++e; // d = 2, e = 2
        //  f = 1   + 2 = 3

        System.out.println("---------------- Bai 7C ----------------");
        int g = 1, h = 1;
        int i = ++g + h++; //g = 2, h = 2
        //  i = 2   + 1 = 3

        System.out.println("---------------- Bai 7D ----------------");
        int j = 1, k = 1;
        int l = ++j + ++k; // j = 2, j = 2
        //  l = 2   + 2 = 4

        System.out.println("---------------- Bai 7E ----------------");
        int m = 1, n = 1;
        int o = m++ + n++ + m++ + n++; // m = 2 -> 3, n = 2 -> 3
        //  o = 1   + 1   + 2   + 2 = 6

        System.out.println("---------------- Bai 7F ----------------");
        int p = 1, q = 1;
        int r = ++p + ++q + p++ + q++; // p = 2 -> 3, q = 2 -> 3
        //  r = 2   + 2   + 2   + 2  =  8

        System.out.println("---------------- Bai 7G ----------------");
        int s = 1;
        int t = s++ + ++s - s-- - --s; // s = 2 -> 3 -> 2 -> 1
        //  t = 1   +  3  - 3   - 1  = 0

        System.out.println("---------------- Bai 7H ----------------");
        int u = 10;
        a += a++ + ++a;
        // a = a + a++ + ++a
        // a = 10 + 10 + 12 = 32

    }
}
