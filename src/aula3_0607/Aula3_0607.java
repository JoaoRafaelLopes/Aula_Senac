/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3_0607;

import java.util.Scanner;

/**
 *
 * @author 182200150
 */
public class Aula3_0607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
        Scanner ler = new Scanner(System.in);
        
        String nomes[] = new String[5];
        int contador = 0;
        
        
        //Informar os nomes
        System.out.println("Informe 5 nomes: ");
        do {
            System.out.println("Entre com o " + (contador + 1) + "° nome: ");
            nomes [contador] = ler.next();
            contador += 1;
            
        } while (contador < 5);
        
        //Lista dos nomes
        System.out.println("Lista dos nomes: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+i) + "° nome: " + nomes[i]);           
        }
        
        //Lista inversa
        System.out.println("Nomes em ordem inversa: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println((i+i) + "° nome: " + nomes[i]);           
        }
    
        
    }
}

    
    

