package Cau1;

import java.util.Scanner;

public class Cau1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        if (s == null || s.length() == 0) {
            System.out.println(s);
            return;
        }
        
        String kq = "";
        int dem = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                dem++;
            } else {
                kq = kq + s.charAt(i - 1) + dem;
                dem = 1;
            }
        }
        kq = kq + s.charAt(s.length() - 1) + dem;
        if (kq.length() >= s.length()) {
            System.out.println("Ket qua: " + s);
        } else {
            System.out.println("Ket qua: " + kq);
        }
    }
}

