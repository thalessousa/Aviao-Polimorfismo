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
public class Terra extends Pista{
    public void permitirPouso(Aviao a){
        if (a.getAltitude() < 6000){
            System.out.println("Pouso não autorizado. Altitude inicial muito baixa.");
        }else{
            a.pousar();
        }
    }
}
