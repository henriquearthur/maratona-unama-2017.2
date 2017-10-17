package maratona;

import java.util.Scanner;


public class encaixa {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = Integer.parseInt(sc.nextLine());

                String saida = "";

                for (int i = 0; i < n; i++) {
                    String linha = sc.nextLine();

                    String[] arr = linha.split(" ");

                    String a = arr[0];
                    String b = arr[1];

                    boolean encaixa;

                    if (b.length() > a.length()) {
                        encaixa = false;
                    } else {
                        int d = a.length() - b.length();
                        

                        if (a.substring(d).equals(b)) {
                            encaixa = true;
                        } else {
                            encaixa = false;
                        }
                    }

                    if (encaixa) {
                        saida += "encaixa\n";
                    } else {
                        saida += "nao encaixa\n";
                    }
                }

                System.out.print(saida);
            } catch (Exception e) {
                break;
            }
 
        }
    }
}
