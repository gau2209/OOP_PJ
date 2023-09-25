/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

/**
 *
 * @author HP
 */
public class VpTangMau extends VatPham{
    private static int dem;
    private int soMauTang;

    public VpTangMau(int soMauTang) {
        this.maVp = String.format("B%02d", ++ dem);
        this.soMauTang = soMauTang;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So luot tang mau: %d\n", this.soMauTang);
    }

  
    
    
    /**
     * @return the soMauTang
     */
    public int getSoMauTang() {
        return soMauTang;
    }

    /**
     * @param soMauTang the soMauTang to set
     */
    public void setSoMauTang(int soMauTang) {
        this.soMauTang = soMauTang;
    }
}
