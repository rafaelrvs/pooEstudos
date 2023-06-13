/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rafae
 */
public class Aula04 {

     public static void main(String[] args) {
        //criação do pobjeto
       Caneta c1 = new Caneta("nick", "rosa", 0.10f);
       c1.setModelo("BIC");
       c1.setPonta(0.5f);
       
       
       Caneta c2 = new Caneta("banana", "rosa", 0.10f);
       c2.status();
       
      
        
    }
}
