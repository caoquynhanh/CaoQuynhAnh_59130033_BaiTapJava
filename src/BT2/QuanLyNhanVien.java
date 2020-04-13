/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Hai Tran Do
 */
public class QuanLyNhanVien implements IQuanLy{
    // danh sach nhan vien
  ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

  // implement methods
  @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };

  @Override
  public void inDS() {
    dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
  };
}
