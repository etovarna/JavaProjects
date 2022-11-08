/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

import java.util.ArrayList;

public class Supermarket {
    
    ArrayList<Product> products = new ArrayList<>();
    
    public Supermarket(){};
    
    public Supermarket(ArrayList<Product> products){
        this.products = products;
    }
    
    public void add(Product product){
        products.add(product);
    }
    
    public Product getProduct(Product product){
        int index = products.indexOf(product);        
        return products.get(index);
    }
    
}
