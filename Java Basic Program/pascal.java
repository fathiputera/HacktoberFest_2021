import java.util.Scanner;

class pascal{
    public static void main(String[] arg){
        
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = in.nextInt();
    int[][] arr = pascal1(n);
    System.out.println(arr);
    
    in.close();
    }

    private static int[][] pascal1(int n) {
        int[][] pt = new int[n][];
        for(int i=0; i<n; i++){
            pt[i] = new int[i+1];
            pt[i][0]= 1;
            for(int j=1; j<i; j++){
                pt[i][j] = pt[i-1][j-1]+pt[i-1][j];
                
            }
            pt[i][i] = 1;            
        }
      return pt;
    }
}