/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.controller;

import com.ecommerce.service.Authenticator;
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
public class SignIn extends HttpServlet {

    // for now only admin login is suported
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");

        System.err.println(" EMAILD == "+emailId +"password  == "+password);
        Authenticator authenticator = new Authenticator();
        boolean auth = authenticator.checkUser(emailId, password);
        if (auth) {
            RequestDispatcher reqDisp = req.getRequestDispatcher("admin.jsp");
            reqDisp.forward(req, res);
        } else {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("Sorry! unable to find you");
        }

    }
}
