package baitapthuchanh;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        nhập số phần tử n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = Integer.parseInt(scanner.nextLine());
//        khai báo mảng
        int[] arr = new int[n];
//        nhập gía trị findNumber , gía trị sum , gía trị từng phần tử trong mảng
        System.out.println("Nhập giá trị findNumber");
        int findNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị của phần tử số "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        duyệt mảng in chỉ số các phần tử = findNumber, cộng dồn với sum
        System.out.println("Chỉ số các phần tử bằng findNumber là ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber ){
                System.out.print(i+",");
                sum+=arr[i];
            }
        }
//        in kết quả
        System.out.println("\nTổng các phần tử có giá trị bằng giá trị findNumber là "+sum);
    }
}
