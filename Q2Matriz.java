//import java.util.Scanner;
public class Q2Matriz {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        int [][] m = new int [5][5];

        for(int i =0; i <m.length; i++){
            for(int j =0; j < m.length; j++){
                if(i == j){
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                    }
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
