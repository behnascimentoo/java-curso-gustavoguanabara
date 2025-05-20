/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Beh
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2025 - nasc;
        if (i>=18) {
            System.out.println("Maior de idade com " + i + " anos!");
        } else {
            System.out.println("Menor de idade com " + i + " anos!");
        }
    }
    
}
