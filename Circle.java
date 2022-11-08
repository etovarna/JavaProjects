/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

public class Circle extends Shapes {
    
    public Circle (double radius){
        super(radius,radius);
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * width;
    }
    
    @Override
    public double area(){
        return Math.PI * Math.pow(width, 2);
    }
        
}
