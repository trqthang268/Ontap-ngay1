package baitapthuchanh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị của phần tử số "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
        }
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng :"+sum/n);
    }
}
