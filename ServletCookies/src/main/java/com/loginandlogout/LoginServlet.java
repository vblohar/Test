package com.loginandlogout;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("link.html").include(request, response);

        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");

        if (password.equals("123")) {
            out.print("You are successfully looged in!");
            out.print("<br> Welcome " + name);
        } else {
            out.println("Sorry, Username or password error");
            request.getRequestDispatcher("login.html").include(request, response);
        }
        out.close();
    }
}
