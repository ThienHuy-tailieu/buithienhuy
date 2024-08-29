/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int chon = 5;
        QLCauThu qlcauthu=new QLCauThu();    
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========CHUONG TRINH QUAN LI SINH VIEN========");
            System.out.println("1.Khởi tạo một danh sách các cầu thủ cần quản lý");
            System.out.println("2.Thêm mới cầu thủ");
            System.out.println("3.Xuất thông tin danh sách cầu thủ");
            System.out.println("4.Tìm kiếm các cầu thủ có lương thực lãnh cao nhất.");
            System.out.println("5.Ket thuc");
            System.out.println("----------------------------------------------");
            System.out.print("Ban chon (1->5)");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    qlcauthu.inDS();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 5:
                    System.out.println("Goodbye. See you again");
                    break;
            }
        } while (chon != 5);
    }
}
