import java.util.Scanner;
public class Q1Matriz {
    public static void main(String[] args) {
        int[][] m = new int [4][4];
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for(int i = 0; i<m.length; i++){
            for(int j =0; j <m.length; j++){
            System.out.println("Digite um valor: ");
            m[i][j] = sc.nextInt(); }
         }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] > 10){
                     contador++;
                }
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
          System.out.println("Existem " + contador + " números maiores que 10 na matriz.");
        sc.close();
    }
}
