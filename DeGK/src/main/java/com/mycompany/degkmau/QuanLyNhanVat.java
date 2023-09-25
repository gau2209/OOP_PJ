/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.degkmau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class QuanLyNhanVat {
    private List<NhanVat> nv = new ArrayList<>();

    public void themNhanVat (NhanVat... a) {
        this.nv.addAll(Arrays.asList(a));
    }
    
    public void hienThi() {
        this.nv.forEach(h -> h.hienThi());
    }
    
    public int tongLuotChoi(int maNv) {
        NhanVat n = this.nv.stream().filter(h -> h.getId() == maNv).findFirst().get();
        return n.demSoLuotChoi();
    }
    
    public void sapXep() {
         this.nv.sort((n1, n2) -> -(n1.getVp().size() - n2.getVp().size()));
         
    }
    
    /**
     * @return the nv
     */
    public List<NhanVat> getNv() {
        return nv;
    }

    /**
     * @param nv the nv to set
     */
    public void setNv(List<NhanVat> nv) {
        this.nv = nv;
    }
    
    
}
