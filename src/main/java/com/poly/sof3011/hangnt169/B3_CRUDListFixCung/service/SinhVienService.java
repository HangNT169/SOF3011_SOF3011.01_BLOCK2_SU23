package com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service;

import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.entity.SinhVien;

import java.util.List;

/**
 * @author hangnt
 */
public interface SinhVienService {

    List<SinhVien> getAll();

    void addSinhVien(SinhVien sinhVien);

    SinhVien detailSinhVien(String ma);

    void removeSinhVien(String ma);

    void updateSinhVien(SinhVien sinhVien,String ma);

}
