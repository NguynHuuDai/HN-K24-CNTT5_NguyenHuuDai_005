package Cau1;

import java.util.Scanner;

public class Cau1_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap cau: ");
        String s = sc.nextLine();

        String kq = "";
        String tu = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                tu = tu + c;
            } else {
                for (int j = tu.length() - 1; j >= 0; j--) {
                    kq = kq + tu.charAt(j);
                }
                kq = kq + " ";
                tu = "";
            }
        }
        for (int j = tu.length() - 1; j >= 0; j--) {
            kq = kq + tu.charAt(j);
        }
        System.out.println(kq);
    }
}