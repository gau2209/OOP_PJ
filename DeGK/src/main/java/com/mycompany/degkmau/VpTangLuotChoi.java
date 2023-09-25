/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

/**
 *
 * @author HP
 */
public class VpTangLuotChoi extends VatPham{
    private static int dem;
    private int soLuotTang;

    public VpTangLuotChoi(int soLuotTang) {
        this.maVp = String.format("A%02d", ++dem);
        this.soLuotTang = soLuotTang;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So luot tang luot choi: %d\n", this.soLuotTang);
    }

    
    
    /**
     * @return the soLuotTang
     */
    public int getSoLuotTang() {
        return soLuotTang;
    }

    /**
     * @param soLuotTang the soLuotTang to set
     */
    public void setSoLuotTang(int soLuotTang) {
        this.soLuotTang = soLuotTang;
    }
    
    
}
