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
        //this = nome do objeto que chamou, referencia ao proprio objeto que chamou
        
   
        System.out.println("Esta tampada? : " + this.tampada);
        System.out.println("Qual e o modelo ? : " + this.modelo);
        System.out.println("Ela qual é a ponta ? : " + this.ponta);
        System.out.println("Ela tem carga ? : " + this.carga);

    }
    
    void escolha(){
            System.out.println("Você está escrevendo com a caneta "+ this.cor);
            this.status();
    }
    
    
    void rabiscar(){
        if (tampada == true ) {
           System.out.println("A caneta " +this.cor +" NÃO pode ficar tampada se quiser rabiscar");
        }
        else{
           System.out.println("Estou rabiscando");
           escolha();
            
        }
        
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
    }
    
}
