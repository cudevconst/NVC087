<%-- 
    Document   : dangnhap
    Created on : May 16, 2022, 8:26:30 AM
    Author     : cuong
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="static/css/dangnhap.css">
        
    </head>
    <body>
        <div class="body">
            <div class="login">
                <div class="dn_dk">
                    <button class="active dn">ĐĂNG NHẬP</button>
                    <button class="dk">ĐĂNG KÝ</button>
                </div>

                
                <div class="form_dn_dk">
                    
                    <form action="login" method="POST" class="login_form form">
                        <span style="color:red; font-size: 24px;">${message}</span>
                        <span class="block">Email</span>
                        <input type="text" name="email" id="email" placeholder="Email" class="block">
                        <span class="block">Mật khẩu</span>
                        <input type="text" name="passWord" id="passWord" placeholder="Mật khẩu" class="block">
                        <a href="#">Quên mật khẩu?</a>
                        <button onclick="testFunction()">Đăng nhập</button>
                    </form>
                </div>
                   
                
            </div>
        </div>
        <script src="view/js/dangnhap.js"></script>
    </body>
</html>
