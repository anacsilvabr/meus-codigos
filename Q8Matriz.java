//Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que
//transforme a matriz gerada numa matriz triangular inferior, ou seja,
//atribuindo zero a todos os elementos acima da diagonal principal. Imprima a
//matriz original e a matriz transformada
import java.util.Scanner;
public class Q8Matriz {
    public static void main(String[] args) {
        int [][] m = new int[4][4];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<m.length; i++){
            for(int j = 0; j<m.length; j++){
                System.out.println("Digite um número entre 1 e 20: "); 
             int numero = sc.nextInt();

              if(numero >= 1 && numero <= 20 ){
                    m[i][j] = numero;
                } else {
                    System.out.println("Digite SOMENTE entre 1 a 20: ");
                }  
            }
        }
            System.out.println("Matriz original: ");
        for(int i =0; i<m.length; i++){
            for(int j = 0; j<m.length; j++){
                System.out.println(m[i][j] + " ");
                    }
                    System.out.println();
            }
          
            System.out.println("Matriz triangular inferior: ");
          for(int i =0; i<m.length; i++){
            for(int j = 0; j<m.length; j++){
                if(j > i){
                    m[i][j] = 0;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();;
    }
}
