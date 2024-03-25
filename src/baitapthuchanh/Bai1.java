package baitapthuchanh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gíá trị số "+i+1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
