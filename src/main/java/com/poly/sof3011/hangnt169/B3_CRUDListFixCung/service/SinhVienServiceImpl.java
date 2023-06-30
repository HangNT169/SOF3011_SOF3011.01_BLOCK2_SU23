package com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service;

import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service.impl.SinhVienService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt
 */
public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien>listSinhVien = new ArrayList<>();
    // interface = new Class

    public SinhVienServiceImpl() {
        // add 5 phan tu vao list

    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }
}
