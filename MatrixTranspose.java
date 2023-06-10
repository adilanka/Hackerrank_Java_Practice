import java.util.*;

public class Main {
    static void myMatrix(int matrix[][],int col,int row){
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input row size: ");
        int row = sc.nextInt();
        System.out.print("Input col size: ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Input the elements of matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        myMatrix(matrix, col, row);
        
    }
}
