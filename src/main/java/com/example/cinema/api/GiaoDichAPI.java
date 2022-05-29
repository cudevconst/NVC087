package com.example.cinema.api;

import com.example.cinema.dao.GiaoDichDAO;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "GiaoDichAPI", value = "/api/giao-dich/*")
public class GiaoDichAPI extends HttpServlet {
    GiaoDichDAO giaoDichDAO = new GiaoDichDAO();
    Gson gson = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Pattern pattern = Pattern.compile("api/giao-dich/(\\d++)$");
        Matcher matcher = pattern.matcher(request.getRequestURL());
        if(matcher.find()){
            out.println(gson.toJson(giaoDichDAO.getGiaoDichByIDUser(1)));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
