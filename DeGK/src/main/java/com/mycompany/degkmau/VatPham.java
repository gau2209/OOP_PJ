/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

/**
 *
 * @author HP
 */
public class VatPham {
    protected String maVp;

   public void hienThi() {
       System.out.printf("Ma vat pham: %s\n", this.maVp);
   }

    
    /**
     * @return the maVp
     */
    public String getMaVp() {
        return maVp;
    }

    /**
     * @param maVp the maVp to set
     */
    public void setMaVp(String maVp) {
        this.maVp = maVp;
    }
    
    
}
