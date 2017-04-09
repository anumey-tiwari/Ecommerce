/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.service;

import com.ecommerce.dao.MemberDetailsDao;
import com.ecommerce.dto.MemberDetailsDto;

/**
 *
 * @author Anumey
 */
public class Authenticator {
    
    public boolean checkUser(String emailId,String password){
        boolean auth = false;
        
        MemberDetailsDao memberDetailsDao = new MemberDetailsDao();
        MemberDetailsDto memberDetailsDto = memberDetailsDao.getMemberDetais(emailId);
        System.out.println( memberDetailsDto.toString());
        if(memberDetailsDto != null){
            if(memberDetailsDto.getPassword().equals(password) && memberDetailsDto.isAdmin()){
                auth = true;
            }
        }
        return auth;
    }
}
