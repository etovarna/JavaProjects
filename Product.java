/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

public class Product {
    
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }

}
