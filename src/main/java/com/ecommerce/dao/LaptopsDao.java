/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.dao;

import com.ecommerce.dto.LaptopsDto;
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
public class LaptopsDao {
     public LaptopsDto getLaptopsDetails(int productId) {
        LaptopsDto laptopsDto = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select productID,name,price,company,imgUrl,stockQuantity from laptops where productID="
                    + productId);
            if (rs.next()) {
                laptopsDto = new LaptopsDto();
                laptopsDto.setProductID(rs.getLong("productID"));
                laptopsDto.setName(rs.getString("name"));
                laptopsDto.setPrice(rs.getBigDecimal("price"));
                laptopsDto.setCompany(rs.getString("company"));
                laptopsDto.setImgUrl(rs.getString("imgUrl"));
                laptopsDto.setStockQantity(rs.getInt("stockQuantity"));
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
        return laptopsDto;
    }

    public void insertLaptopsDetails(LaptopsDto laptopsDto) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt = con.prepareStatement("insert into laptops (name,price,company,imgUrl,stockQuantity)  values"
                    + " (?,?,?,?,?)");
            int id = 1;
           stmt.setString(id++,laptopsDto.getName());
           stmt.setBigDecimal(id++,laptopsDto.getPrice());
           stmt.setString(id++, laptopsDto.getCompany());
           stmt.setString(id++, laptopsDto.getImgUrl());
           stmt.setInt(id++, laptopsDto.getStockQantity());
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
