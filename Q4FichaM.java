public class Q4FichaM {
    public static void main(String[] args) {
        int [][]m = {
            {1,2,3,4},
            {5,6,7,8,},
            {9,10,11,12},
            
        };
        int linhaMaior=0;
        int colunaMaior= 0;
        int maior =  m[0][0];

        for(int i=0; i<4; i++){
            for(int j =0; j<4; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
    }
}
