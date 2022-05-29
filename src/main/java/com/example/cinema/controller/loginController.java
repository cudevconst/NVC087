/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cinema.controller;

import com.example.cinema.dao.UserDAO;
import com.example.cinema.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "loginController", urlPatterns = {"/login/*"})
public class loginController extends HttpServlet {

    UserDAO userDAO = new UserDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/dangnhap.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("email");
        String passWord = req.getParameter("passWord");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        User user = new User();
        user = userDAO.getUser(userName, passWord);
        System.out.println(userName + " " + passWord);
        if(user != null){
            session.setAttribute("user", user);
            resp.sendRedirect("trang-tru");
        }
        else{
            req.setAttribute("message", "Thông tin tài khoản hoặc mật khẩu không chính xác");
            req.getRequestDispatcher("view/dangnhap.jsp").forward(req, resp);
        }
        
        
        
    }
    

    
    
}
