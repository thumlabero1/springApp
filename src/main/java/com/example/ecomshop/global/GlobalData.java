package com.example.ecomshop.global;

import com.example.ecomshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
    public List<Product> getCart(){
        return cart;
    }
    public void setCart(List<Product> cart){
        GlobalData.cart = cart;
    }
}

