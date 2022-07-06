/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg2_0607;

import java.util.Scanner;

/**
 *2. Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números na tela.
Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.
 * @author 182200150
 */
public class Aula2_0607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        
        int valores[] = new int[5];
        int contador = 0, soma = 0;
        
        
        
        System.out.println("Insira 5 números inteiros");
        do {
            System.out.println("Informe o valor " + (contador + 1) + ":");
            valores[contador] = ler.nextInt();
            soma += valores[contador];
          contador += 1;  
        } while (contador < 5);
        
        
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + (i +1) + ": " + valores [i]);
        }
        
        
        
        
        
        
    }
    
}
