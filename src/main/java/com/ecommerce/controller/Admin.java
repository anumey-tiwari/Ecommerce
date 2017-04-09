/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.controller;

import com.ecommerce.service.Information;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anumey
 */
public class Admin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String company = request.getParameter("company");
        String quantity = request.getParameter("quantity");
        String product = request.getParameter("product");
        
        Information information = new Information();
        boolean updated = information.uploadInformation(name, price, company, quantity, product);
        request.setAttribute("result", updated);
        RequestDispatcher reqDis = request.getRequestDispatcher("/admin.jsp");
       
        System.out.println("updated  == "+updated);
        reqDis.forward(request, response);
        
    }


}
