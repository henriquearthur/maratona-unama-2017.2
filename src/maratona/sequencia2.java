/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona;

import java.util.Scanner;

/**
 *
 * @author bel.lab
 */
public class sequencia2 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                double numerador = 3.0;
                double denominador = 2.0;
                
                double soma = 1.0;
                
                while (numerador <= 39) {
                    soma += numerador / denominador;
                    
                    numerador += 2.0;
                    denominador *= 2.0;
                }

                System.out.printf("%.2f\n", soma);
                break;
            } catch (Exception e) {
                break;
            }
 
        }
    }
}
