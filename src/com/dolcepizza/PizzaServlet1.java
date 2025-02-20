package com.dolcepizza;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class PizzaServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logique pour afficher la liste des pizzas
        response.setContentType("text/html");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Bienvenue chez DolcePizza!</h1>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Pizza Margherita</li>");
        response.getWriter().println("<li>Pizza Quattro Stagioni</li>");
        response.getWriter().println("<li>Pizza Napolitaine</li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("</body></html>");
    }
}
