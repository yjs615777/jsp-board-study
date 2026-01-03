package com.controller;

import java.io.IOException;
import javax.servlet.ServletException; // Servlet 관련 기본 예외
import javax.servlet.annotation.WebServlet; // URL 매핑을 위한 어노테이션
import javax.servlet.http.HttpServlet; // HttpServlet을 상속받아 Servlet으로 동작
//HTTP 요청/응답 객체
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	
    	// 요청을 JSP로 전달 (URL은 바뀌지 않음)
        // WEB-INF 아래 JSP는 직접 접근 불가 → forward 필수
        req.getRequestDispatcher("/WEB-INF/views/home.jsp")
           .forward(req, resp);
    }
}
/*Servlet은 웹 요청(URL)을 받아서 자바 코드로 처리하고,
그 결과를 JSP(또는 JSON 등)로 넘겨주는 서버 쪽 프로그램.*/