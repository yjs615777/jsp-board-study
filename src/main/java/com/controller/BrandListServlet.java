package com.controller;

import com.model.BrandDAO;
import com.model.BrandDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/brands")
public class BrandListServlet extends HttpServlet {

    private final BrandDAO brandDAO = new BrandDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1) 데이터 조회
        List<BrandDTO> brands = brandDAO.findAll();

        // 2) JSP로 전달
        req.setAttribute("brands", brands);

        // 3) 화면으로 forward (URL 유지, request 유지)
        req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
    }
}
