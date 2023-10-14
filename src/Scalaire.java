import java.util.Scanner;

public class Scalaire {
    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int nMax = 10;
        System.out.print("Enter the maximum size of both of vector v1 and v2: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n>1 && n<nMax) {
            int result = 0;
            for (int i =0;i<n;i++){
                System.out.print("Enter the "+(i+1)+" value of v1: ");
                v1[i] = input.nextInt();
            }
            for (int i2 =0;i2<n;i2++){
                System.out.print("Enter the "+ (i2+1) +" value of v2: ");
                v2[i2] = input.nextInt();
            }
            for (int i3 =0;i3<n;i3++){
                result += v1[i3]*v2[i3];
            }
            System.out.print("Result is : "+ result);
        }
        else {
            System.out.print("Please enter the number between 1 and: "+ nMax);
        }

    }
}
