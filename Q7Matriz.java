// Leia uma matriz de 3 x 3 elementos.
// Calcule a soma dos elementos que
// estão acima da diagonal principal,                   (i<j)
//dos elementos que estão abaixo da diagonal principal, (i>j)
// que estão na diagonal principal e                    (i==j)
// que estão na diagonal
// secundária                                       (i+j == n - 1)

public class Q7Matriz {
    public static void main(String[] args) {
        int [][] m = new int [3][3];
        int somaD1 = 0;
        int somaD2 = 0;
        int somaAcimaD = 0;
        int somaEmbaixoD = 0;
       
         for(int i =0; i < m.length; i++){
            for(int j =0; j < m.length; j++){
              if(j>i){
                somaAcimaD += m[i][j];
              }
            }
         }
         for(int i =0; i < m.length; i++){
            for(int j =0; j < m.length; j++){
              if(i>j){
               somaEmbaixoD += m[i][j];
              }
            }
        }
        for(int i =0; i < m.length; i++){
            for(int j =0; j < m.length; j++){
              if(i==j){
                somaD1 += m[i][j];
              }
            }
        }
        for(int i =0; i < m.length; i++){
            for(int j =0; j < m.length; j++){
              if(i+j == 3 -1){
                somaD2 += m[i][j];
              }
            }
        }
        for(int i =0; i < m.length; i++){
            for(int j =0; j < m.length; j++){
            System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
