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
public class frase {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = Integer.parseInt(sc.nextLine());
                
                String saida = "";

                for (int i = 0; i < n; i++) {
                    String linha = sc.nextLine();

                    ArrayList<String> letras = new ArrayList<>();

                    for (int j = 0; j < linha.length(); j++) {
                        if (linha.charAt(j) != ',' && linha.charAt(j) != ' ') {
                            if (!letras.contains(String.valueOf(linha.charAt(j)))) {
                                letras.add(String.valueOf(linha.charAt(j)));
                            }
                        }
                    }
                    
                    if (letras.size() >= 26) {
                        saida += "frase completa\n";
                    } else if (letras.size() >= (26 / 2)) {
                        saida += "frase quase completa\n";
                    } else {
                        saida += "frase mal elaborada\n";
                    }
                }

                System.out.print(saida);
            } catch (Exception e) {
                break;
            }
        }
    }
}
