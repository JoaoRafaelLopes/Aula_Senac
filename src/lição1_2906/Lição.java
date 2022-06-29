/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lição1_2906;

import java.util.Scanner;

/**
 *
 * @author 182200150
 */
public class Lição {

    /**
     * @param args the command line arguments
     * Crair agloritimo que guarde infromações:
     * nome, nota1, nota2, nota3, média
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int nAlunos, nNotas;
        
        //Cria matriz de notas
             float [][]notas = new float[15][4];
             //Cria vetor de alunos
             String[] alunos = new String[15];
             
             System.out.println(".: Notas de alunos :.");
             //Serve para percorrer as linhas
             for (int i = 0; i < 15; i++) {
                 System.out.println("Nome Aluno " + (i+1) + ":");
                 alunos[i] = ler.next();
                 System.out.println(".:Notas:. ");
                 //Serve para percorrer as colunas da Matriz
                 for (int j = 0; j < 3; j++) {
                     System.out.println("Nota " + (j+1) + ":");
                     notas[i][j] = ler.nextFloat();
                     //está fazendo a soma das três notas
                     notas[i][3] += notas [i][j];
                     
                 }
                //Média
                notas[i][3]= notas[i][3] /3;               
            
        }
                 //Mostrar resultado
                 System.out.println("\n .: Impressão :.\n");
                 for (int i = 0; i < 15; i++) {
                     System.out.println("\nAluno" + (i+1) + "i" + alunos[i]);
                     for (int j = 0; j < 3; j++) {
                         System.out.println("- Nota " + (j+1) + ":" + notas[i][j]);
                         
                     }
                      System.out.println("- Média: " + notas[i][3]);
                      System.out.println("---");
                     
                     
                     
        }
            
        }

        
        
        
    }
    

