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
public class Pista {
    private int comprimento;
    
    public Pista(int comprimento){
        this.comprimento = comprimento;
    }
    
    public Pista(){
        this.comprimento = 1800;
    }
    
    public void permitirPouso(Aviao a){
        if (a.getAltitude() < 5000){
            System.out.println("Pouso não autorizado. Altitude inicial muito baixa.");
        }else{
            a.pousar();
        }
    }
}
