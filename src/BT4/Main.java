/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author Asus
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // qlChuyenXe obj
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

        // create chuyen xe noi thanh
        ChuyenXe xeNoiThanh1 = new ChuyenXeNoiThanh(1, "", "", 20000000, "", 20);
        ChuyenXe xeNoiThanh2 = new ChuyenXeNoiThanh(2, "", "", 21000000, "", 20);
        ChuyenXe xeNoiThanh3 = new ChuyenXeNoiThanh(3, "", "", 22000000, "", 20);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNoiThanh1);
        qlChuyenXe.themChuyenXe(xeNoiThanh2);
        qlChuyenXe.themChuyenXe(xeNoiThanh3);

        // create chuyen xe ngoai thanh
        ChuyenXe xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(4, "", "", 30000000, "", 1);
        ChuyenXe xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(5, "", "", 31000000, "", 1);
        ChuyenXe xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(6, "", "", 32000000, "", 1);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

        // in thong tin cac chuyen xe
        qlChuyenXe.inThongTin();

        // tong doanh thu xe noi thanh
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlChuyenXe.tongDoanhThuNoiThanh());

        // tong doanh thu xe ngoai thanh
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlChuyenXe.tongDoanhThuNgoaiThanh());

        // tong doanh thu
        System.out.printf("Tong doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());
    }
}
