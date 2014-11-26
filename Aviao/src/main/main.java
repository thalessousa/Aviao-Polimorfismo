/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import aviao.Aviao;
import aviao.AviaoCivil;
import aviao.AviaoMilitar;
import aviao.Multimotor;
import aviao.AviaoMilitar;
import aviao.Supersonico;
import pistas.Pista;
import java.util.Scanner;
/**
 *
 * @author Yvan
 */
public class main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um tipo de aviao: ");
        System.out.println("1- Civil\n2- Militar");
        int esc = input.nextInt();
        switch(esc){
            case 1:
                funcaoCivil();
                break;
            case 2:
                funcaoMilitar();
        }
    }
    
    public static void funcaoCivil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Contrua seu avião");
        
            int respPassag, respAlt, respAssentos;
            float respHoras, respComb;
            String respModelo;
            System.out.println("Insira o numero de passageiros para viagem: ");
            respPassag = input.nextInt();
            System.out.println("Insira o modelo do avião: ");
            respModelo = input.nextLine();
            System.out.println("Insira a altitude que o avião alcançará(km): ");
            respAlt = input.nextInt();
            System.out.println("Insira a estimativa de horas de voô: ");
            respHoras = input.nextFloat();
            System.out.println("Insira a quantidade de combustível no avião(l): ");
            respComb = input.nextFloat();
            System.out.println("Insira a quantidade de assentos: ");
            respAssentos = input.nextInt();
            
            AviaoCivil aviao = new Multimotor(respPassag, respModelo, respAlt, respHoras, respComb, false, respAssentos, 2);
            Multimotor a = null;
            
            if (aviao instanceof Multimotor){
                a = (Multimotor) aviao;
            }
       
        System.out.println(a);
        
        System.out.println("Adicione 2 mercadorias (por exemplo: Geladeira)");
        String aux;
        for(int i=0; i<3; i++){
            aux = input.nextLine();
            a.setListaMercadorias(aux);
        }
        System.out.println();
        a.voar();
        
        System.out.println();
        
        
        if(a.isVoando()){
            System.out.println("Quando estiver pronto para pousar, insira s minúsculo.");
            do{
                aux = input.nextLine();
            }while(!aux.equals("s"));
            Pista p = new Pista();
            p.permitirPouso(a);
        }
    }
    
    public static void funcaoMilitar(){
        Scanner input = new Scanner(System.in);
        String aux;
        
        /*int numPassag, String modelo, int altitude, float horasVoo, 
                   float combustivel, int municao, int qtdBombas, boolean alerta,
                   boolean sobAtaque, float maxSpeed*/
        
            int respPassag, respAlt, respAssentos, respMunicao, respBombas;
            float respHoras, respComb, respMaxSpeed;
            String respModelo;
            System.out.println("Insira a quantidade de pilotos para viagem: ");
            respPassag = input.nextInt();
            System.out.println("Insira o modelo do avião: ");
            respModelo = input.nextLine();
            System.out.println("Insira a altitude que o avião alcançará(km): ");
            respAlt = input.nextInt();
            System.out.println("Insira a estimativa de horas de voô: ");
            respHoras = input.nextFloat();
            System.out.println("Insira a quantidade de combustível no avião(l): ");
            respComb = input.nextFloat();
            System.out.println("Insira a quantidade de assentos: ");
            respAssentos = input.nextInt();
            System.out.println("Insira a quantidade de municao: ");
            respMunicao = input.nextInt();
            System.out.println("Insira a quantidade de bombas: ");
            respBombas = input.nextInt();
            System.out.println("Insira a velociade máxima deste avião(km/h): ");
            respMaxSpeed = input.nextFloat();
        
        AviaoMilitar a = new Supersonico(respPassag, respModelo, respAlt, respHoras, respComb, respMunicao, respBombas, false, false, respMaxSpeed);
        
        System.out.println(a);
        
        a.voar();
        
        System.out.println();
        
        if(a.isVoando()){
            System.out.println("Quando estiver pronto para pousar, insira s minúsculo.");
            do{
                aux = input.nextLine();
            }while(!aux.equals("s"));
            Pista p = new Pista();
            p.permitirPouso(a);
        }
    }
}
