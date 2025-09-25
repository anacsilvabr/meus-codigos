//Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma
//busca desse valor na matriz e, ao final, escrever a localização (linha e
//coluna) ou uma mensagem de “não encontrado"

import java.util.Scanner;
public class Q5Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[5][5];
        int colunaComValor = 0;
        int linhaComValor = 0;
        boolean encontrado = false;

        for(int i =0; i< m.length; i++){
            for(int j =0; j < m.length; j++){
                m[i][j] = sc.nextInt();
            }
        }
         System.out.println("Digite o valor que deseja buscar: ");
         int x = sc.nextInt();

        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m.length; j++){
                if(m[i][j] == x){
                    int temOValor = m[i][j];
                    linhaComValor = i;
                    colunaComValor = j;
                    encontrado = true;
                }
            }
        }
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m.length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        if(encontrado){ System.out.println("O valor X (" + x + ") está na linha " + linhaComValor + " e coluna " + colunaComValor);
    } else {
        System.out.println(" O valor (" + x + ") não foi encontrado ");
    }
        sc.close();
    }
}
