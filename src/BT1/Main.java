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
public class Main 
{
    public static void main(String[] args) 
    {
        // create nhan vien
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Hoang Tuan Kien");
        nv1.setTuoi(31);
        nv1.setDiaChi("Ha Noi");
        nv1.setTienLuong(6000000);
        nv1.setTongSoGioLam(150);
        
        // create nhan vien
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyen Thai Son");
        nv2.setTuoi(23);
        nv2.setDiaChi("Quang Ninh");
        nv2.setTienLuong(7000000);
        nv2.setTongSoGioLam(300);

        // in thong tin nhan vien
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    } 
}
