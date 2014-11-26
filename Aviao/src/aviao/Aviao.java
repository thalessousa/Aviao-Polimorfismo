/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviao;

import meiotransporte.MeioTransporte;
import interfaces.Voador;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Yvan
 */
public class Aviao extends MeioTransporte implements Voador{
       protected static final int NUMERO_DE_ASAS = 2;
       protected static int qtdAvioes = 0;
       protected String modelo;
       protected float horasVoo;
       protected float combustivel;
       protected boolean alerta;
       protected int altitude;
       protected boolean voando;
              
       public Aviao (int numPassag, String modelo, int altitude, 
                     float horasVoo, float combustivel, boolean alerta){
           super(numPassag);
           setAltitude(altitude);
           setHorasVoo(horasVoo);
           setCombustivel(combustivel);
           setAlerta(alerta);
           Aviao.qtdAvioes++;
           this.modelo = modelo;
           this.voando = false;
       }
       
       public Aviao(){
           setAltitude(10000);
           setHorasVoo(9);
           setCombustivel(15000);
           setAlerta(false);
           Aviao.qtdAvioes++;
           this.modelo = "Batplane";
           this.voando = false;
       }
       
       public final void setAltitude(int valor){
           if (valor > 37000){
               System.out.println("A não ser que você esteja quebrando o recorde do soviético Alexander Fedotov no avião MIG-25 'Foxbat', nenhum avião alcança tal altitude."
                       + " Adicionado um valor padrão de 10000 metros de altitude.");
               this.altitude = 10000;
           }
           else
               this.altitude = valor;
       }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    
       public final void setHorasVoo(float valor){
           if(valor > 15){
               System.out.println("WOW!!! Nem o avião com o maior tanque de combustível aguentaria tanto."
                       + " Adicionado valor padrão de 9 horas de vôo.");
               this.horasVoo = 9;
           }
           this.horasVoo = valor;
       }
       public final void setCombustivel(float valor){
           if (valor > 30000){
               System.out.println("Quantidade de combustível muito grande. Adicionado valor padrão de 15000 litros de combustível.");
               this.combustivel = 15000;
           }
           this.combustivel = valor;
       }
       
       public boolean isVoando() {
        return voando;
       }
       
       public final void setAlerta(boolean flag){
           this.alerta = flag;
       }

       public static int getNUMERO_DE_ASAS() {
            return NUMERO_DE_ASAS;
        }

       public static int getQtdAvioes() {
            return qtdAvioes;
        }

       public String getModelo() {
            return modelo;
        }

       public float getHorasVoo() {
            return horasVoo;
        }

       public float getCombustivel() {
            return combustivel;
        }

       public boolean isAlerta() {
            return alerta;
        }

       public int getAltitude() {
            return altitude;
        }       
       
       @Override
       public void voar(){
           setVoando(true);
           System.out.println("Verificando dados do avião.");
           for(int i = 0; i < 3; i++){
               System.out.print(". ");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           if (this.combustivel >= 3000){
               System.out.println("\nAviao apto para o vôo. Seu avião levantou vôo.");
               this.combustivel = this.combustivel - 2000;
           }
           else{
               Scanner input = new Scanner(System.in);
               System.out.println("\nAviao não está apto para vôo. Aceita reabastecer?[y/n]. P.S.: O minimo para o vôo é 3000 e seu avião tem só " + this.combustivel);
               String d = input.nextLine();
               if (d.equals("y")){
                   System.out.println("Insira a quantidade adicional ");
                   int aux = input.nextInt();
                   setCombustivel(this.combustivel+aux);
                   voar();
               }else{
                   setVoando(false);
               }
               
           }
       }
       
       public void pousar(){
           setVoando(false);
           System.out.println("Seu avião está pousando.");
           for(int i = 0; i < 3; i++){
               System.out.print(". ");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           System.out.println("\nSeu avião pousou com sucesso!!!");
       }
       
       public void print(){
           System.out.println("Este é um avião qualquer");
       }
        
       public static void qtdAvioes(){
           System.out.println("Você criou " + Aviao.qtdAvioes
                   + " aviões cada um com " + Aviao.NUMERO_DE_ASAS + " asas.");
       }
       
       public void reabastecer(int n){
           float aux;
           aux = getCombustivel() + n;
           setCombustivel(n);
       }
}