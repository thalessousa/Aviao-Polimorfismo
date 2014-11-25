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
public class Militar extends Aviao{
    protected int municao;
    protected int qtdBombas;
    protected boolean sobAtaque;
    
    public Militar(int numPassag, String modelo, int altitude, float horasVoo, 
                   float combustivel, int municao, int qtdBombas, boolean alerta,
                   boolean sobAtaque){
        super(numPassag, modelo, altitude, horasVoo, combustivel, alerta);
        setMunicao(municao);
        setBombas(qtdBombas);
        setSobAtaque(sobAtaque);
    }
    
    //Construtor que cria o avião Militar com parametros default de Aviao
    public Militar(int municao, int qtdBombas, boolean sobAtaque){
        setMunicao(municao);
        setBombas(qtdBombas);
        setSobAtaque(sobAtaque);
    }
    public Militar(){
        setMunicao(600);
        setBombas(5);
        setSobAtaque(false);
    }
    
    public final void setMunicao(int valor){
        if(valor > 10000 && valor < 0)
            System.out.println("Insira uma quantidade válida.");
        else
            this.municao = valor;
    }
    public final void setBombas(int valor){
        if(valor > 10 && valor < 0)
            System.out.println("Insira uma quantidade válida.");
        else
            this.qtdBombas = valor;
    }
    public final void setSobAtaque(boolean flag){
        this.sobAtaque = flag;
    }

    public int getMunicao() {
        return municao;
    }

    public int getQtdBombas() {
        return qtdBombas;
    }

    public boolean isSobAtaque() {
        return sobAtaque;
    }
    
    @Override
    public void print(){
            System.out.println("Este é um avião Militar");
        }
    
    public void atirar(){
        if(this.municao > 0){
            System.out.println("Seu aviao está em modo Burst Fire. Você gastou três balas.");
            this.municao -= 3;
        }
        else
            System.out.println("Munição insuficinte. Já ouviu falar de Kamikaze?");
        
    }
}
