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
public class bino {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = Integer.parseInt(sc.nextLine());
                String linha = sc.nextLine();
                String[] arr = linha.split(" ");
                
                int m2 = 0;
                int m3 = 0;
                int m4 = 0;
                int m5 = 0;
                
                for (int i = 0; i < n; i++) {
                    if (Integer.parseInt(arr[i]) % 2 == 0) {
                        m2++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 3 == 0) {
                        m3++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 4 == 0) {
                        m4++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 5 == 0) {
                        m5++;
                    }
                }
                
                System.out.println(m2 + " Multiplo(s) de 2");
                System.out.println(m3 + " Multiplo(s) de 3");
                System.out.println(m4 + " Multiplo(s) de 4");
                System.out.println(m5 + " Multiplo(s) de 5");
            } catch (Exception e) {
                break;
            }
        }
    }
}
