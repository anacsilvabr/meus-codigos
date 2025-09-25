//Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são
//da forma:
//a. A[i][j] = 2i + 7j − 2, se i < j;
//b. A[i][j] = 3i 2 − 1, se i = j;
//c. A[i][j] = 4i 3 − 5j 2 + 1, se i > j

import java.util.Scanner;
public class Q6Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m = new int [10][10];

        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                if(i<j){
                    m[i][j] = 2* i + 7*j -2;
                } else if (i==j){
                    m[i][j] = (int) (3* Math.pow(i , 2) -1);
                } else if (i>j) {
                    m[i][j] = (int) (4* Math.pow(i,3)) - (int)                             (5 * Math.pow(j, 2)+1);
                }
                }
         }
         for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m.length; j++){
                System.out.print(m[i][j] + " ");
         }
         System.out.println();
        }
         sc.close();
        }
    }
    
