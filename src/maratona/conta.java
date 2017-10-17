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
public class conta {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int c = sc.nextInt();
                int[] qtds = new int[c];
                
                for (int i = 0; i < c; i++) {
                    qtds[i] = sc.nextInt();
                }
                
                for (int i = 0; i < c; i++) {
                    if (qtds[i] % 2 == 0) {
                        System.out.println("0");
                    } else {
                        System.out.println("1");
                    }
                }

            } catch (Exception e) {
                break;
            }
        }
    }
}
