/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author HP
 */
public class NhanVat {

    private static int dem;
    private int id = ++dem;
    private String ten;
    private List<VatPham> vp;

    public NhanVat(String ten) {
        this.ten = ten;
        this.vp = new ArrayList<>();
    }

    public void themVp(VatPham... p) {
        this.vp.addAll(Arrays.asList(p));
    }

    public void hienThi() {
        System.out.printf("ID: %d\n", this.id);
        System.out.printf("Ten: %s\n", this.ten);
        System.out.printf("So vat pham an: %d\n", this.vp.size());
        this.vp.forEach(h -> h.hienThi());
    }

    public int demSoLuotChoi() {
//        int tong = 0;
//        for (VatPham v : this.vp) {
//            if (v instanceof VpTangLuotChoi) {
//                tong += ((VpTangLuotChoi) v).getSoLuotTang();
//            }
//        }
//        return tong;
        
        return this.vp.stream().filter(v -> v instanceof VpTangLuotChoi)
                .flatMapToInt(v -> IntStream.of(((VpTangLuotChoi) v).getSoLuotTang())).sum();
    }

    /**
     * @return the id
     */

    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the vp
     */
    public List<VatPham> getVp() {
        return vp;
    }

    /**
     * @param vp the vp to set
     */
    public void setVp(List<VatPham> vp) {
        this.vp = vp;
    }

}
