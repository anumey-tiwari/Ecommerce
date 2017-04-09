/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.dto;

import java.math.BigDecimal;

/**
 *
 * @author Anumey
 */
public abstract class ProductDto {

    private long productID;
    private String name;
    private BigDecimal price;
    private String company;
    private String imgUrl;
    private int stockQantity;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getStockQantity() {
        return stockQantity;
    }

    public void setStockQantity(int stockQantity) {
        this.stockQantity = stockQantity;
    }
    
    
}
