/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.service;

import com.ecommerce.dao.BooksDao;
import com.ecommerce.dao.LaptopsDao;
import com.ecommerce.dto.BooksDto;
import com.ecommerce.dto.LaptopsDto;
import java.math.BigDecimal;

/**
 *
 * @author Anumey
 */
public class Information {
    
    public boolean uploadInformation(String name,String price,String company,String quantity,String product){
        boolean returnValue = false;
        if(product.equals("book")){
            BooksDao booksDao = new BooksDao();
            BooksDto booksDto = new BooksDto();
            booksDto.setCompany(company);
            booksDto.setImgUrl("yo");
            booksDto.setName(name);
            booksDto.setPrice(new BigDecimal(price));
            booksDto.setProductID(1);
            booksDto.setStockQantity(Integer.parseInt(quantity));
            booksDao.insertBooksDetails(booksDto);
            returnValue = true;
        }else if(product.equals("laptop")){
            LaptopsDao laptopsDao = new LaptopsDao();
            LaptopsDto laptopsDto = new LaptopsDto();
            laptopsDto.setCompany(company);
            laptopsDto.setImgUrl("yo");
            laptopsDto.setName(name);
            laptopsDto.setPrice(new BigDecimal(price));
            laptopsDto.setProductID(2);
            laptopsDto.setStockQantity(Integer.parseInt(quantity));
            laptopsDao.insertLaptopsDetails(laptopsDto);
            
            returnValue = true;
        }
        
        
        return returnValue;
        
    }
}
