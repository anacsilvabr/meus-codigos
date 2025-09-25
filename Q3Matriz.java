// Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da
// linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz

public class Q3Mtriz {
    public static void main(String[] args) {
        
  int [][] m = new int [4][4];

        for(int i =0; i<m.length; i++){
            for(int j =0; j<m.length; j++){
                m[i][j] = i*j;
            }
        }
        for(int i =0; i < m.length; i++){
            for(int j =0; j <m.length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
