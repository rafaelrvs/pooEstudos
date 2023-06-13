/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03;

/**
 *
 * @author rafae
 */
public class Aula03 {

    public static void main(String[] args) {
        //criação do pobjeto
       Caneta c1 = new Caneta();
        c1.modelo ="BIC cristal";
        c1.cor = "azul";
       // c1.ponta = 0.5f; erro pos a classe é privada
        c1.carga=100; // como está dentro do metodo principal que usa a classe caneta
        //a alteração é permitida.
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
}
