package com.example.cinema.api;

import com.example.cinema.dao.GheDAO;
import com.google.gson.Gson;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "GheAPI", value = "/api/ghe/*")
@MultipartConfig
public class GheAPI extends HttpServlet {
    private GheDAO gheDAO = new GheDAO();
    private Gson gson = new Gson();

    /* url: http://localhost:8080/Cinema/api/ghe?suat-chieu=1*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        int idSuatChieu = Integer.parseInt(request.getParameter("suat-chieu"));
        out.print(gson.toJson(gheDAO.getGheByIDSuatChieu(idSuatChieu)));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        int idGhe = Integer.parseInt(request.getParameter("idGhe"));
        gheDAO.updateGhe(idGhe);
    }
}
