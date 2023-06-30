package com.poly.sof3011.hangnt169.B3_CRUDListFixCung.controller;

import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service.SinhVienServiceImpl;
import com.poly.sof3011.hangnt169.B3_CRUDListFixCung.service.impl.SinhVienService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hangnt
 */
@WebServlet(name = "SinhVienServlet", value = {
        "/sinh-vien/hien-thi", // GET
        "/sinh-vien/search",  // GET
        "/sinh-vien/remove",  // GET
        "/sinh-vien/detail",  // GET
        "/sinh-vien/view-update", // GET
        "/sinh-vien/update",   // POST
        "/sinh-vien/view-add",  // GET
        "/sinh-vien/add"     // POST
})
public class SinhVienServlet extends HttpServlet {

    private SinhVienService service = new SinhVienServiceImpl();
    // interface = new Class
    private List<SinhVien>lists = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            // lam chuc nang hien thi
            this.hienThiSinhVien(request,response);
        } else if (uri.contains("search")) {
            // lam chuc nang  search
            this.searchSinhVien(request,response);
        } else if (uri.contains("remove")) {
            // lam chuc nang remove
            this.removeSinhVien(request,response);
        } else if (uri.contains("detail")) {
            // lam chuc nang detail
            this.detailSinhVien(request,response);
        } else if (uri.contains("view-update")) {
            //lam chuc nang view-update
            this.viewUpdateSinhVien(request,response);
        } else if (uri.contains("view-add")) {
            // lam chuc nang view-add
            this.viewAddSinhVien(request,response);
        } else {
            this.hienThiSinhVien(request,response);
        }
    }

    private void viewAddSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void detailSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void removeSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void searchSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThiSinhVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        lists = service.getAll(); // se co 5 phan tu
        request.setAttribute("listSinhVien",lists);
        request.getRequestDispatcher("/buoi3/sinhviens.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("update")) {
            // lam chuc nang update
            this.updateSinhVien(request,response);
        } else if (uri.contains("add")) {
            //lam chuc nang add
            this.addSinhVien(request,response);
        } else {
            this.hienThiSinhVien(request,response);
        }
    }

    private void addSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateSinhVien(HttpServletRequest request, HttpServletResponse response) {
    }
}
