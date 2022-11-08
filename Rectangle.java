/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejerciciosjava;

public class Rectangle extends Shapes {    
    
    public Rectangle (double base, double height){
        super(base, height);
    }
    
    @Override
    public double perimeter(){
        return (2*width+2*height);
    }
    
    @Override
    public double area(){
        return width * height;
    }
    
}
