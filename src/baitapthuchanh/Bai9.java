package baitapthuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
//        B1 : nhập số phần tử n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = Integer.parseInt(scanner.nextLine());
//        khởi tạo mảng
        int[] arr = new int[n];
//        nhập gía trị từng  phần tử vào mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị của phần tử số " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] newArr;
//        duyệt qua mảng gặp chỉ số trùng với delete index thì xóa
        while (true) {
            System.out.println("Nhập chỉ số phần tử cần xóa");
            int deleteIndex = Integer.parseInt(scanner.nextLine());
            newArr = new int[n - 1];
            int count = 0;
            if (deleteIndex > 0 && deleteIndex < arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    if (i != deleteIndex) {
                        newArr[count++] = arr[i];
                    }
                }
                break;
            } else {
                System.out.println("Nhập liệu sai, xin hãy nhập lại");
            }
        }
//        in kết quả
        System.out.println("Trước khi xóa " + Arrays.toString(arr));
        System.out.println("Sau khi xóa " + Arrays.toString(newArr));
    }
}
