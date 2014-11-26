/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistas;

import interfaces.Iluminacao;
import aviao.Aviao;
/**
 *
 * @author Yvan
 */
public class Asfalto extends Pista implements Iluminacao{
    
    public void permitirPouso(Aviao a){
        if (a.getAltitude() < 3000){
            System.out.println("Pouso não autorizado. Altitude inicial muito baixa.");
        }else{
            a.pousar();
        }
    }
    
    @Override
    public void iluminar(){
        
    }
}
