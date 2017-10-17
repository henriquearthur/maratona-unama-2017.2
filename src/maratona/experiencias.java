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
public class experiencias {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = Integer.parseInt(sc.nextLine());

                int total = 0;
                int coelhos = 0, ratos = 0, sapos = 0;

                for (int i = 0; i < n; i++) {
                    String linha = sc.nextLine();
                    String[] arr = linha.split(" ");
                    
                    int quantia = Integer.parseInt(arr[0]);
                    String tipo = arr[1];

                    if (tipo.equals("C")) {
                        coelhos += quantia;
                    } else if (tipo.equals("R")) {
                        ratos += quantia;
                    } else if (tipo.equals("S")) {
                        sapos += quantia;
                    }

                    total += quantia;
                }

                double percentCoelhos = (coelhos * 100.0) / total;
                double percentRatos = (ratos * 100.0) / total;
                double percentSapos = (sapos * 100.0) / total;

                System.out.println("Total: " + total + " cobaias");
                System.out.println("Total de coelhos: " + coelhos);
                System.out.println("Total de ratos: " + ratos);
                System.out.println("Total de sapos: " + sapos);
                System.out.printf("Percentual de coelhos: %.2f %%\n", percentCoelhos);
                System.out.printf("Percentual de ratos: %.2f %%\n", percentRatos);
                System.out.printf("Percentual de sapos: %.2f %%\n", percentSapos);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
