/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulapoojava;

/**
 *
 * @author rafae
 */
public class AulaPooJava {

    public static void main(String[] args) {
       //criação do pobjeto
       Caneta c1 = new Caneta();
       c1.modelo = "bic Cristal";
       c1.cor = "azul";
       c1.ponta = 0.5f;
      // c1.tampada = false;
      c1.destampar();
       //c1.destampar();
       c1.carga = 50;
      
    
       
       //Criando um novo objeto
       Caneta c2 = new Caneta();
           c2.modelo = "bic cristal";
           c2.cor = "Vermelha";
           c2.ponta = 1.0f;
           c2.destampar();
           
 
        //   c1.rabiscar();
           c1.rabiscar();
           
       
       
       
       }
       
       
    }
    
    
    
    
    
}
