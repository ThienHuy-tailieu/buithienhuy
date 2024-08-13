/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauTrucMang;

import static CauTrucMang.BaiTap17.nhapMang;
import static CauTrucMang.BaiTap17.timMin;
import static CauTrucMang.BaiTap17.tinhTb;
import static CauTrucMang.BaiTap17.xuatMang;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap19 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();

        a = new int[n];

        phatSinhMang(a);
        System.out.println("\nMang a:");
        xuatMang(a);

        sapXepTang(a);
        System.out.println("\nMang sau khi sap xep:");
        xuatMang(a);
        
        System.out.print("\nCho biet so nguyen x:");
        int x=sc.nextInt();
        System.out.print("\nCac phan tu la uoc so cua x:");
        lietKeUocSo(a,x);
    }
    public static void phatSinhMang(int[] a) {
        Random rd=new Random();
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]:");
            a[i] = rd.nextInt(100);
        }
    }
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static void sapXepTang(int[] a) {
        
    }
    public static void lietKeUocSo(int[] a,int x) {
        
    }
}
