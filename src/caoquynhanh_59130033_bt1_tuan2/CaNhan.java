/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caoquynhanh_59130033_bt1_tuan2;

/**
 *
 * @author Asus
 */
public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan() {
    }

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public abstract String HienThiTT();

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }
  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caoquynhanh_59130033_baitapjava;

import java.util.Scanner;

public class NhanVien {
    public String ten;
    public String diachi;
    public int tuoi;
    public float luong;
    public int tongsogiolam;
   
    
    public float getluong()
    {
        return luong;
    }
    public void setluong(float luong)
    {
    this.luong = luong;
     }
    public int gettuoi()
    {
        return tuoi;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public String getten()
    {
        return ten;
        
    }
    public void setten(String ten)
    {
    this.ten = ten;
    }
    public String getdiachi()
    {
    return diachi;
    
    }
    public void setdiachi(String diachi)
    {
    this.diachi= diachi;
    }
    public int settongsogiolam()
            {
            return tongsogiolam;
            }
    public void gettongsogiolam(int tongsogiolam)
    {
    this.tongsogiolam = tongsogiolam;
    }

    /**
     *
     */
    public  void thongtin()
    {
        Scanner nhap = new Scanner(System.in);
                System.out.println("Nhap ten");
                ten=nhap.nextline();
                System.out.println("Nhap tuoi");
                tuoi=nhap.nextint();
                System.out.println("Nhap dia chi");
                diachi = nhap.nextline();
                System.out.println("Nhap Dia chi");
    }
}
       update