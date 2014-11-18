/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yvan
 */
public class Civil extends Aviao {
    private ArrayList<String> listaMercadorias = new ArrayList<>();
    private int numeroAssentos;
    
    public Civil (int numPassag, String modelo, int altitude, 
                  float horasVoo, float combustivel, int numAssentos, boolean alerta){
        
        super(numPassag, modelo, altitude, horasVoo, combustivel, alerta);
        setNumeroAssentos(numAssentos);
     
    }
    
    //Construtor que cria o avião Civil com parametros default de Aviao
    public Civil (int numAssentos){setNumeroAssentos(numAssentos);}
    
    public Civil (){
        setNumeroAssentos(150);
    }
   
    public final void setNumeroAssentos(int valor){
        if(valor > 300){
            System.out.println("Número muito alto de assentos. Adicionado um valor padrão de 150 assentos.");
        }
        else
            this.numeroAssentos = valor;
    }
    
    public final void setListaMercadorias(String obj){
        this.listaMercadorias.add(obj);
    }

    public ArrayList<String> getListaMercadorias() {
        return listaMercadorias;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }
    
    @Override
    public void print(){
            System.out.println("Este é um avião Civil");
        }
}
