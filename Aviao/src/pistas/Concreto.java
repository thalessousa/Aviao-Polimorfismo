/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistas;

import aviao.Aviao;
/**
 *
 * @author Yvan
 */
public class Concreto extends Pista{
    public void permitirPouso(Aviao a){
        if (a.getAltitude() < 4000){
            System.out.println("Pouso não autorizado. Altitude inicial muito baixa.");
            System.out.println("Aumentar altitude");
        }else{
            a.pousar();
        }
    }
}
