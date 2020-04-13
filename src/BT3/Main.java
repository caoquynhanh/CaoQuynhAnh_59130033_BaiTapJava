/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Asus
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // create sinh vien IT
        SinhVienIT it = new SinhVienIT("Tran Ba Duy", "CNTT", 6.5, 7,8 );
        // create sinh vien Biz
        SinhVienBiz biz = new SinhVienBiz("Nguyen Tung Son", "Biz", 7.5, 10);
        // create sinh vien poly tu sinh vien IT
        SinhVienPoly poly = new SinhVienIT("Bui Bao Chau", "CNTT", 4, 9, 7.5);

        // xuat thong tin sinh sinh
        it.xuat();
        System.out.println("diem: " + it.getDiem());
        System.out.println("hoc luc: " + it.getHocLuc());

        biz.xuat();
        System.out.println("diem: " + biz.getDiem());
        System.out.println("hoc luc: " + biz.getHocLuc());

        poly.xuat();
        System.out.println("diem: " + poly.getDiem());
        System.out.println("hoc luc: " + poly.getHocLuc());
    }
}
