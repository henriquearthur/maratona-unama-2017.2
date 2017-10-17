package maratona;

import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int[] pares = new int[5];
                int[] impares = new int[5];

                int paresN = 0, imparesN = 0;

                int indicePar = 0;
                int indiceImpar = 0;
                
                String saida = "";

                for (int i = 0; i < 15; i++) {
                    int numero = sc.nextInt();

                    if (numero % 2 == 0) {
                        if (paresN == 5) {
                            for (int j = 0; j < 5; j++) {
                                saida += String.format("par[%d] = %d\n", j, pares[j]);
                            }

                            pares = new int[5];
                            indicePar = 0;
                        }

                        pares[indicePar] = numero;
                        paresN++;
                        indicePar++;
                    } else {

                        if (imparesN == 5) {
                            for (int j = 0; j < 5; j++) {
                                saida += String.format("impar[%d] = %d\n", j, impares[j]);
                            }

                            impares = new int[5];
                            indiceImpar = 0;
                        }

                        impares[indiceImpar] = numero;
                        imparesN++;
                        indiceImpar++;
                    }
                }
                
                System.out.print(saida);

                for (int i = 0; i < 5; i++) {
                    if (impares[i] != 0) {
                        System.out.printf("impar[%d] = %d\n", i, impares[i]);
                    }
                }

                for (int i = 0; i < 5; i++) {
                    if (pares[i] != 0) {
                        System.out.printf("par[%d] = %d\n", i, pares[i]);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

        }
    }
}
