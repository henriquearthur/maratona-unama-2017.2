package maratona;

import java.util.Scanner;

public class Maratona {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = 3;
                int d = 2;
                
                double soma = 0.0;
                
                while (n <= 39) {
                    soma += (n / d);
                    
                    n += 2;
                    d *= 2;
                }
                
                soma += 4;
                
                System.out.printf("%.2f\n", soma);
                break;
            } catch (Exception e) {
                break;
            }
        }
        
        System.out.println(System.currentTimeMillis() - inicio);
    }
    
}
