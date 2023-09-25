/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

/**
 *
 * @author HP
 */
public class Demo {
    public static void main(String[] args) {
        VatPham v1 = new VpTangLuotChoi(1);
        VatPham v2 = new VpTangLuotChoi(2);
        VatPham v3 = new VpTangMau(10);
        VatPham v4 = new VpTangMau(20);
        
        
        NhanVat n1 = new NhanVat("Doraemon");
        NhanVat n2 = new NhanVat("Nobita");
                
                
        QuanLyNhanVat ql = new QuanLyNhanVat();
        ql.themNhanVat(n1,n2);
        n2.themVp(v1,v3, v2);
        n1.themVp(v4);
//        n2.themVp(v2);
        
        ql.hienThi();
        
        System.out.println(ql.tongLuotChoi(1));
        
        System.out.println("=====");
        ql.sapXep();
        ql.hienThi();
    }
    
}
