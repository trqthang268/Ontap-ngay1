package baitapthuchanh;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập giá trị cho phần từ ở vị trí [%-2d][%-2d]:",i,j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("");
        }

    }
}
