package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Hello</title></head>");
        out.println("<body style='font-family: Arial; background-color:#f0f8ff; text-align:center;'>");
        out.println("<h1 style='color:blue;'>Hello from Maven Web App!</h1>");
        out.println("<p>This is a simple styled servlet running on Tomcat.</p>");
        out.println("</body></html>");
    }
}
