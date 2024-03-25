package baitapthuchanh;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị cho phần tử số "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]){
                min = arr[i];
            }
            if (max > arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : "+max);
        System.out.println("Giá trị nhỏ nhất trong mảng là : "+min);

    }
}
