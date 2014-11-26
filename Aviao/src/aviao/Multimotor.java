/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yvan
 */
public class Multimotor extends AviaoCivil{
    private int qtdMotor;
    
    public Multimotor(int numPassag, String modelo, int altitude, 
                  float horasVoo, float combustivel, boolean alerta, int numAssentos, int qtdMotor){
        super(numPassag, modelo, altitude, horasVoo, combustivel,numAssentos, alerta);
        setQtdMotor(qtdMotor);
    }
    
    public Multimotor(int qtdMotor){
        setQtdMotor(qtdMotor);
    }
    
    public Multimotor(){
        setQtdMotor(2);
    }
    
    public final void setQtdMotor(int valor){
        if(valor > 4){
            System.out.println("Numero de motores muito alto. Adicionado valor padrão de 2 motores");
            this.qtdMotor = 2;
        }
        else
            this.qtdMotor = valor;
    }

    public int getQtdMotor() {
        return qtdMotor;
    }
    
    @Override
    public String toString(){
            return "Este é um Mono/Multimotor"
                    + "   \nNUMERO_DE_ASAS = 2;\n" +
                      "Quantidade de aviões construídos: " + qtdAvioes +
                      "\nModelo deste avião: " + modelo +
                      "\nHoras de vôo programado: " + horasVoo +
                      "\nCombustível atual: " + combustivel +
                      "\nTurbulência: " + alerta +
                      "\nAtitude: " + altitude + 
                      "\nQuantidade de motores: " + qtdMotor + "\n";
        }
    
    
    
}
