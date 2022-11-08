/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

public class Triangle extends Shapes {
    
    private double side2;
    private double side3;
    
    public Triangle (double width, double height, double side2, double side3){
        super(width,height);
        this.side2 = side2;
        this.side3 = side3;
    }
      
    @Override
    public double perimeter(){
        return width + side2 + side3;
    }
    
    @Override
    public double area(){
        return (width*height)/2;
    }
    
}
