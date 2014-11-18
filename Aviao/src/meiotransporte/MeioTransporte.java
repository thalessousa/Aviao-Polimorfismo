/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meiotransporte;

/**
 *
 * @author Yvan
 */
public abstract class MeioTransporte {
    private int numeroPassageiros;
    
    public MeioTransporte(int n){
        setNumPassageiros(n);
    }
    
    public MeioTransporte(){
        setNumPassageiros(100);
    }
    
    public final void setNumPassageiros(int num){
        this.numeroPassageiros = num;
       }
    
    public final int getNumPassageiros(){
        return this.numeroPassageiros;
    }
    
}
