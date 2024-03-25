package baitapthuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
//        nhập số phần tử của mảng n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử");
        int n = Integer.parseInt(scanner.nextLine());
//        khai báo mảng
        int[] arr = new int[n];
//        nhập giá trị phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập gía trị của phần tử số " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
//        tạo 1 mảng mới
        int[] newArr;
        while (true) {
            System.out.println("Nhập giá trị updateValue");
            int updateValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chỉ số phần tử cần cập nhật");
            int updateIndex = Integer.parseInt(scanner.nextLine());
            if (updateIndex > 0 && updateIndex < n) {
                newArr = new int[n + 1];
                int count = 0;
                for (int i = 0; i < newArr.length; i++) {
//                    sao chép giá trị ở mảng cũ sang mảng mới
                    if (i != updateIndex) {
                        newArr[i] = arr[count++];
                    } else {
//                        gán giá trị mới vào vị trí đã chọn
                        newArr[i] = updateValue;
                    }
                }
                break;
            } else {
                System.out.println("Nhập lại giá trị updateValue và updateIndex");
            }
        }
//        gán mảng mới vào mảng cũ
        arr = newArr;
//        in kết quả
        System.out.println("Cập nhật thành công");
        System.out.println(Arrays.toString(arr));
    }
}
