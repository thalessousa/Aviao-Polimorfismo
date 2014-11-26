/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Yvan
 */
public class Pessoa {
    protected String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(){
        this.nome = "Desconhecido";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
