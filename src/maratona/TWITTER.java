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
public class TWITTER {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                String t = sc.nextLine();
                if (t.length() <= 140) {
                    System.out.println("TWEET");
                } else {
                    System.out.println("MUTE");
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
