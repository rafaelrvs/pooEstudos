/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapoojava;

/**
 *
 * @author rafae
 */
public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        //this = autoreferencia, quem chamou status = this
        System.out.println("uma caneta: " + this.cor);
    }
    void rabiscar(){
        
    }
    void tampar(){
        
    }
    void destampar(){
        
    }
    
}
