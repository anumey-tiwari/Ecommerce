/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.dao;

import com.ecommerce.dto.BooksDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anumey
 */
public class BooksDao {

    public BooksDto getBooksDetails(int productId) {
        BooksDto booksDto = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select productID,name,price,company,imgUrl,stockQuantity from books where productID="
                    + productId);
            if (rs.next()) {
                booksDto = new BooksDto();
                booksDto.setProductID(rs.getLong("productID"));
                booksDto.setName(rs.getString("name"));
                booksDto.setPrice(rs.getBigDecimal("price"));
                booksDto.setCompany(rs.getString("company"));
                booksDto.setImgUrl(rs.getString("imgUrl"));
                booksDto.setStockQantity(rs.getInt("stockQuantity"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return booksDto;
    }

    public void insertBooksDetails(BooksDto booksDto) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt = con.prepareStatement("insert into books(name,price,company,imgUrl,stockQuantity)  values"
                    + " (?,?,?,?,?)");
            int id = 1;
           stmt.setString(id++,booksDto.getName());
           stmt.setBigDecimal(id++,booksDto.getPrice());
           stmt.setString(id++, booksDto.getCompany());
           stmt.setString(id++, booksDto.getImgUrl());
           stmt.setInt(id++, booksDto.getStockQantity());
            stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
