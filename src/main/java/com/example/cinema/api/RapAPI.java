package com.example.cinema.api;

import com.example.cinema.dao.RapDAO;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "RapAPI", value = "/api/rap/*")
@MultipartConfig
public class RapAPI extends HttpServlet {
    private RapDAO rapDAO = new RapDAO();
    private Gson gson = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Pattern pattern = Pattern.compile("api/rap/(\\d++)$");
        Matcher matcher = pattern.matcher(request.getRequestURL());
        if(matcher.find()){
            int id = Integer.parseInt(matcher.group(1));

            String json = gson.toJson(rapDAO.getRapByID(id));
            out.print(json);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
