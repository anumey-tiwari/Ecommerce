/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.dao;

import com.ecommerce.dto.MemberDetailsDto;
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
public class MemberDetailsDao {
    
     public MemberDetailsDto getMemberDetais(String emailID) {
        MemberDetailsDto memberDetailsDto = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select memberID,password,emailID,admin from memberdetails where emailID='" 
                    + emailID+"'");
            System.out.println(rs.toString());
            if (rs.next()) {
                memberDetailsDto = new MemberDetailsDto();
                memberDetailsDto.setMemberID(rs.getLong("memberID"));
                memberDetailsDto.setPassword(rs.getString("password"));
                memberDetailsDto.setEmailId(rs.getString("emailID"));
                memberDetailsDto.setAdmin(rs.getBoolean("admin"));
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
        return memberDetailsDto;
    }
     
     
     public void insertMemberDetails(MemberDetailsDto memberDetailsDto){
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "vostro3550");
            stmt=con.prepareStatement("insert into(memberID,password,emailID,admin) memberDetails values"
                    + " (?,?,?,?)");
            int id  = 1;
            stmt.setLong(id++, memberDetailsDto.getMemberID());
            stmt.setString(id++, memberDetailsDto.getPassword());
            stmt.setString(id++, memberDetailsDto.getEmailId());
            stmt.setBoolean(id++, memberDetailsDto.isAdmin());
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
