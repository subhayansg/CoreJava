package Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        // Populate 2-D array
        int val = 1;
        for(int x=0; x<A.length; x++) {
            for(int y=0; y<A[1].length; y++) {
                A[x][y] = val++;
            }
        }
        // Print the elements of the array using for loop
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        // Print the elements of the array using foreach loop
        for(int x[]: A) {       // x[] is the reference which holds pointer to array of length 4
            for(int y: x) {     // print the elements in x[]
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("Length of 2-D array A: " + A.length);
    }
}
