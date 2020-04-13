/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Asus
 */
public class Main 
{
    public static void main(String[] args) {
    // create quan ly nhan vien object
    IQuanLy qlNhanVien = new QuanLyNhanVien();

    // create nhan vien
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Hoang Tuan Kien");
    nv1.setTuoi(31);
    nv1.setDiaChi("Ha Noi");
    nv1.setTienLuong(6000000);
    nv1.setTongGioLam(150);

    // create nhan vien
    NhanVien nv2 = new NhanVien();
    nv2.setTen("Nguyen Thai Son");
    nv2.setTuoi(23);
    nv2.setDiaChi("Quang Ninh");
    nv2.setTienLuong(7000000);
    nv2.setTongGioLam(300);

    // create nhan vien
    NhanVien nv3 = new NhanVien();
    nv3.setTen("Pham Thu Trang");
    nv3.setTuoi(22);
    nv3.setDiaChi("Ha Noi");
    nv3.setTienLuong(5000000);
    nv3.setTongGioLam(100);

    // create nhan vien
    NhanVien nv4 = new NhanVien();
    nv4.setTen("Nguyen Nam Thuong");
    nv4.setTuoi(23);
    nv4.setDiaChi("Thanh Hoa");
    nv4.setTienLuong(6500000);
    nv4.setTongGioLam(200);

    // create nhan vien
    NhanVien nv5 = new NhanVien();
    nv5.setTen("Hoang Thanh Loan");
    nv5.setTuoi(30);
    nv5.setDiaChi("Nam Dinh");
    nv5.setTienLuong(6500000);
    nv5.setTongGioLam(200);
  }
}
