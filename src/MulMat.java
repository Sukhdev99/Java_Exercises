import java.util.Scanner;

public class MulMat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of column of 1st matrice: ");
        int c_mat1 = input.nextInt();
        System.out.print("Enter the number of rows of 1st matrice: ");
        int r_mat1 = input.nextInt();
        System.out.print("Enter the number of column of 2nd matrice: ");
        int c_mat2 = input.nextInt();
        System.out.print("Enter the number of rows of 2nd matrice: ");
        int r_mat2 = input.nextInt();
        double[][] mat1 = new double[r_mat1][c_mat1];
        double[][] mat2 = new double[r_mat2][c_mat2];
        double[][] result = new double[r_mat2][c_mat2];
        if (c_mat1 == r_mat2){
            for (int i =0 ;i<r_mat1;i++){
                for (int i2=0; i2<c_mat1;i2++){
                    System.out.print("M1["+(i+1)+","+(i2+1)+"] =");
                    mat1[i][i2]= input.nextDouble();
                }

            }
            for (int j =0 ;j<r_mat2;j++){
                for (int j2=0; j2<c_mat2;j2++){
                    System.out.print("M2["+(j+1)+","+(j2+1)+"] =");
                    mat2[j][j2]= input.nextDouble();
                }

            }

            for (int w=0;w<r_mat1;w++){
                for (int w2=0;w2<c_mat2;w2++) {
                    for (int w3 = 0; w3 < c_mat1; w3++) {
                        result[w][w2] += mat1[w][w3] * mat2[w3][w2];
                    }

                }
            }
            System.out.print("Result:\n");
            for (int z=0;z<r_mat1;z++){
                for (int z2=0;z2<c_mat2;z2++){
                    System.out.print(result[z][z2] + " ");
                }
                System.out.println();
            }
        }

        else {
            System.out.print("Number of columns of 1st matrice and rows of 2nd matrice must be same. ");
        }

    }
}