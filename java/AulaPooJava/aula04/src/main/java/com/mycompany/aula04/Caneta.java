/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author rafae
 */
public class Caneta {
    
    private String modelo;
    private float ponta;
    private  String cor;
    private  boolean tampada;
    ///construtor, memso nome da classe 
    public Caneta( String m, String c, float p){
        this.modelo = m;
        this.cor= c;
        this.setPonta(p);
        this.tampar();
        
                
        
    }
    
    public void status(){
        System.out.print("Sobre a caneta: ");
        System.out.println("O modelo da caneta é: "+  this.modelo);
        System.out.println("A ponta da caneta é: "+  this.ponta);
        System.out.println("A cor é: "+  this.cor);
        System.out.println("A ela esta tampada?: "+  this.tampada);
    }
    public String getModelo(){
        return this.modelo;
    } 
   public void setModelo(String m){
       this.modelo = m;
   }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
