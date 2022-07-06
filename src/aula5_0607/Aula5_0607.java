/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5_0607;

import java.util.Scanner;

/**
 *Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números pares, e outro somente para números ímpares.
Após, exiba os valores dos dois vetores na tela, em sequência.
Obs.: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto.
 * 
 */
public class Aula5_0607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int valores[][] = new int [10][2];
        
        
        System.out.println(" -Insira 10 numeros inteiros -");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "° numero: ");
            int valor = ler.nextInt();
            if(valor %2 == 0){
                //par
                valores[i][0] = valor;//par
                valores[i][1] = 0;//impar
            }else{
                //impar
                valores[i][1] = valor;//impar
                valores[i][0] = 0;//par
            }
            
                                 
                    }
        
        System.out.println("\n.: Lista de Valores:.");
        for (int i = 0; i < 10; i++) {
             System.out.printf("%6d%6s%6d | \n" , valores[i][0] , " | " , valores[i][1]);
        }
        
        
        
        
    }
    
}
