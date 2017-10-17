/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bel.lab
 */
public class fibonacci {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                ArrayList<Integer> l = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        l.add(0);
                    } else if (i == 1) {
                        l.add(1);
                    } else if (i == 2) {
                        l.add(1);
                    } else {
                        l.add(l.get(i - 1) + l.get(i - 2));
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (i == n - 1) {
                        System.out.print(l.get(i));
                    } else {
                        System.out.print(l.get(i) + " ");
                    }
                }
                
                System.out.println("");

            } catch (Exception e) {
                break;
            }
        }
    }
}
