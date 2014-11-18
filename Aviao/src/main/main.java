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
        Civil a = new Multimotor();
        
        a.print();
        
        System.out.println("Adicione 5 mercadorias (por exemplo: Geladeira)");
        String aux;
        for(int i=0; i<5; i++){
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
        a.pousar();
        /*for(int index =0; index < a.getListaMercadorias().size(); index++){
            System.out.println(a.getListaMercadorias().get(index));
        }*/
    }
    
    public static void funcaoMilitar(){
        
    }
}
