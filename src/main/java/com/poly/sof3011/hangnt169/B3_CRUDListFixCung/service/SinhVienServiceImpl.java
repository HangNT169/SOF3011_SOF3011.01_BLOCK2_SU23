package com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service;

import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service.impl.SinhVienService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt
 */
public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> listSinhVien;
    // interface = new Class

    public SinhVienServiceImpl() {
        // add 5 phan tu vao list
        listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("PH1", "Vu Duc Trung", 23, "Ha Noi", true));
        listSinhVien.add(new SinhVien("PH2", "Vu Duc Manh", 23, "Ha Noi", true));
        listSinhVien.add(new SinhVien("PH3", "Vu Minh Manh", 23, "Ha Noi", true));
        listSinhVien.add(new SinhVien("PH4", "Vu Thi Van", 23, "Ha Noi", false));
        listSinhVien.add(new SinhVien("PH5", "Vu Thi Nguyet", 23, "Ha Noi", false));
    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    @Override
    public void addSinhVien(SinhVien sinhVien) {
        listSinhVien.add(sinhVien);
    }

    @Override
    public SinhVien detailSinhVien(String ma) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMssv().equalsIgnoreCase(ma)) {
                return sv;
            }
        }
        return null;
    }

    @Override
    public void removeSinhVien(String ma) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMssv().equalsIgnoreCase(ma)) {
                listSinhVien.remove(sv);
                break;
            }
        }
    }

    @Override
    public void updateSinhVien(SinhVien sinhVien, String ma) {
        for (int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMssv().equalsIgnoreCase(ma)) {
                listSinhVien.set(i, sinhVien);
                break;
            }
        }
    }
}
