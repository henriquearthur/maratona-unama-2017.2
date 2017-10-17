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
public class muitotempo {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = sc.nextInt();
                int[] nums = new int[n];
                
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }
                
                for (int i = 0; i < nums.length; i++) {
                    int a = 2015 - nums[i];
                    
                    if (a < 0) {
                        System.out.println(Math.abs(a) + 1 + " A.C.");
                    } else if (a > 0) {
                        System.out.println(a + " D.C.");
                    } else if (a == 0) {
                        System.out.println("1 A.C.");
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
