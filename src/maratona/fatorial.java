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
public class fatorial {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = sc.nextInt();
                int res = n;
                
                int i = 1;
                
                while ((n-i) > 1) {
                    res *= (n-i);
                    
                    i++;
                }
               
                System.out.println(res);
            } catch (Exception e) {
                break;
            }
        }
    }
}
