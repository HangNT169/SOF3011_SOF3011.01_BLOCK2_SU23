package com.poly.sof3011.hangnt169.B2_LamViecVoiForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DemoLogin", value = {"/login", "/ket-qua"})
public class DemoLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Truyen gia tri tu servlet => jsp
        // Tham so  dau tien => Ten bien ma muon hien thi o JSP
        // Tham so thu 2 => Gia tri muon truyen di . Co the la String, List, Object....
        request.setAttribute("n1", "Hello world");
        // c1: chuyen trang
        request.getRequestDispatcher("/buoi2/buoi2.jsp").forward(request, response);
        // C2: chuyen trang
//        response.sendRedirect("/buoi2/buoi2.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lay gia tri tu jsp => servlet
        String username = request.getParameter("uname");
        String password = request.getParameter("psw");
        // Truyen gia tri servlet => jsp
        request.setAttribute("u1", username);
        request.setAttribute("u3", password);
        // chuyen trang
        request.getRequestDispatcher("/buoi2/hien-thi-ket-qua.jsp").forward(request, response);
    }
}
