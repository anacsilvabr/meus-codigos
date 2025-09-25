//Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a
//coluna) do maior valor

import java.util.Scanner;
public class Q4Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int valorMaior = 0;
        int linhaMaior = 0;
        int colunaMior = 0;

        for(int i = 0; i<m.length; i++){
            for(int j =0; j< m.length; j++){
            m[i][j] =  sc.nextInt();
            }
        }
        for(int i = 0; i<m.length; i++){
            for(int j =0; j< m.length; j++){
                if(m[i][j] > valorMaior){
                    valorMaior = m[i][j];  
                    linhaMaior = i;
                    colunaMior = j;       
            }
        }
    }
         for(int i = 0; i<m.length; i++){
            for(int j =0; j< m.length; j++){
                System.out.print(m[i][j] + " ");
                
            }
        System.out.println();
    }
      System.out.println("O valor maior (" + valorMaior + ") está na linha " + linhaMaior + " e coluna " + colunaMior);
    sc.close();;
 }
}
