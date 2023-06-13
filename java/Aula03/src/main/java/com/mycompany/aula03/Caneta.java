/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;

/**
 *
 * @author rafae
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private  boolean tampada;
    
    public void status(){
        //this = nome do objeto que chamou, referencia ao proprio objeto que chamou
        
   
        System.out.println("Esta tampada? : " + this.tampada);
        System.out.println("Qual e o modelo ? : " + this.modelo);
        System.out.println("Ela qual é a ponta ? : " + this.ponta);
        System.out.println("Ela tem carga ? : " + this.carga);

    }
    
   public void escolha(){
            System.out.println("Você está escrevendo com a caneta "+ this.cor);
            this.status();
    }
    
    
    protected void rabiscar(){
        if (tampada == true ) {
           System.out.println("A caneta " +this.cor +" NÃO pode ficar tampada se quiser rabiscar");
        }
        else{
           System.out.println("Estou rabiscando");
           escolha();
            
        }
        
    }
    public void tampar(){
        this.tampada = true;
        
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
