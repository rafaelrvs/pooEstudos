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
        System.out.println("Esta tampada? : " + this.tampada);
        System.out.println("Qual e o modelo ? : " + this.modelo);
        System.out.println("Ela qual é a ponta ? : " + this.ponta);
        System.out.println("Ela tem carga ? : " + this.carga);
    }
    void rabiscar(){
        
    }
    void tampar(){
        
    }
    void destampar(){
        
    }
    
}
