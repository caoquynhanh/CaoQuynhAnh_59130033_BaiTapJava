/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Asus
 */
public class Main {
     public static void main(String[] args) {
        // create nhan vien
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Le Thi Thu Thuy");
        nv1.setTuoi(33);
        nv1.setDiaChi("Phu Yen");
        nv1.setTienLuong(6000000);
        nv1.setTongGioLam(200);
        
        // create nhan vien
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Le Thi Dep");
        nv2.setTuoi(44);
        nv2.setDiaChi("Phu Yen");
        nv2.setTienLuong(7000000);
        nv2.setTongGioLam(300);

        // in thong tin nhan vien
        System.out.print(nv1.getThongTin());
        System.out.print(nv2.getThongTin());
  } 
}
