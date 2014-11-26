/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviao;

/**
 *
 * @author Yvan
 */
public class Supersonico extends AviaoMilitar{
    private float maxSpeed;
    
    public Supersonico(int numPassag, String modelo, int altitude, float horasVoo, 
                   float combustivel, int municao, int qtdBombas, boolean alerta,
                   boolean sobAtaque, float maxSpeed){
        super(numPassag, modelo, altitude, horasVoo, combustivel, municao, qtdBombas, alerta,sobAtaque);
        setMaxSpeed(maxSpeed);
    }
    
    public Supersonico(){
        setMaxSpeed(1255);
    }
    
    public final void setMaxSpeed(float maxSpeed){
        if(maxSpeed < 2179)
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public void print(){
            System.out.println("Este é um Supersônico"
                    + "   \nNUMERO_DE_ASAS = 2;\n" +
            "Quantidade de aviões construídos: " + qtdAvioes +
            "\nModelo deste avião: " + modelo +
            "\nHoras de vôo programado: " + horasVoo +
            "\nCombustível atual: " + combustivel +
            "\nTurbulência: " + alerta +
            "\nAtitude: " + altitude + 
            "\nQuantidade de munição: " + municao + 
            "\nQuantidade de bombas: " + qtdBombas + "\n");
        }
}
