/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

public abstract class Shapes {
    
    protected double width, height;
    
    public Shapes(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public abstract double perimeter();
    public abstract double area();
        
}
