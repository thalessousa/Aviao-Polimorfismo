/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import aviao.Aviao;
import aviao.Civil;
import aviao.Militar;
import aviao.Multimotor;
import aviao.Militar;
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
        System.out.println("Você quer construir seu própiro avião? (Se a resposta é não será construído um avião padrão)"
                + "\n1 - Sim\n2 - Não\n");
        int esc = input.nextInt();
        if (esc == 1){
            /*int numPassag, String modelo, int altitude, 
                  float horasVoo, float combustivel, int numAssentos, boolean alerta*/
            System.out.println("Insira o numero de passageiros para viagem: ");
            System.out.println("Insira o modelo do avião: ");
            System.out.println("Insira a altitude que o avião alcançará(km): ");
            System.out.println("Insira a estimativa de horas de voô: ");
            System.out.println("Insira a quantidade de combustível no avião(l): ");
            System.out.println("");
        }
        
        Civil a = new Multimotor();
        
        a.print();
        
        System.out.println("Adicione 2 mercadorias (por exemplo: Geladeira)");
        String aux;
        for(int i=0; i<2; i++){
            aux = input.nextLine();
            a.setListaMercadorias(aux);
        }
        System.out.println();
        a.voar();
        
        System.out.println();
        
        
        System.out.println("Quando estiver pronto para pousar, insira s minúsculo.");
        do{
            aux = input.nextLine();
        }while(!aux.equals("s"));
        Pista p = new Pista();        
        p.permitirPouso(a);
        /*for(int index =0; index < a.getListaMercadorias().size(); index++){
            System.out.println(a.getListaMercadorias().get(index));
        }*/
    }
    
    public static void funcaoMilitar(){
        Scanner input = new Scanner(System.in);
        String aux;
        Militar a = new Supersonico();
        
        a.print();
        
        /*System.out.println("Adicione 2 mercadorias (por exemplo: Geladeira)");
        
        for(int i=0; i<2; i++){
            aux = input.nextLine();
            a.setListaMercadorias(aux);
        }
        System.out.println();*/
        a.voar();
        
        System.out.println();
        
        
        System.out.println("Quando estiver pronto para pousar, insira s minúsculo.");
        do{
            aux = input.nextLine();
        }while(!aux.equals("s"));
        Pista p = new Pista();        
        p.permitirPouso(a);
    }
}
