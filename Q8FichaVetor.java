//código feito por mim e revisado por IA.

import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[20]; // pares
        int[] v2 = new int[20]; // ímpares
        int[] v3 = new int[40]; // intercalado

        // Preenche v1 com pares
        System.out.println("Digite 20 números pares:");
        for (int i = 0; i < v1.length; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                v1[i] = num;
            } else {
                System.out.println("Esse não é par, digite outro.");
            
            }
        }

        // Preenche v2 com ímpares
        System.out.println("Digite 20 números ímpares:");
        for (int i = 0; i < v2.length; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                v2[i] = num;
            } else {
                System.out.println("Esse não é ímpar, digite outro.");
                
            }
        }

        // Intercalar no v3
        for (int i = 0; i < 20; i++) {
            v3[i * 2]     = v1[i]; // posições pares de v3
            v3[i * 2 + 1] = v2[i]; // posições ímpares de v3
        }

        // Mostrar v3
        System.out.print("Vetor intercalado: ");
        for (int n : v3) {
            System.out.print(n + " ");
        }
    }
}

