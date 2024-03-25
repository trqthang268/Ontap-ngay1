package baitapthuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
//        nhập số phần tử của mảng (n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = Integer.parseInt(scanner.nextLine());
//        khai báo mảng
        int[] arr = new int[n];
//        nhập từng gía trị trong mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị của phần tử số " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        duyệt qua mảng khi gặp giá trị trùng lặp thì cập nhật
        while (true) {
            System.out.println("Nhập giá trị updateValue");
            int updateValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chỉ số phần tử cần cập nhật");
            int updateIndex = Integer.parseInt(scanner.nextLine());
            if (updateIndex > 0 && updateIndex < arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    if (i == updateIndex) {
                        arr[i] = updateValue;
                    }
                }
                break;
            }else {
                System.out.println("Nhập liệu sai, xin hãy nhập lại");
            }
        }
//        in kết quả
        System.out.println("Cập nhật thành công");
        System.out.println(Arrays.toString(arr));
    }
}
