/*
* Rotate an array - either left or right, 12345 -> left 23451, right 51234
* Insert an element in array
* Delete an element from array
 */
public class ArrayOperations {
    static int[] rotateAnArray(int[] arr, String rotationType) {
        int len = arr.length;
        System.out.println("Type of rotation: " + rotationType);
        int[] rotatedArr = new int[len];
        if (rotationType.equals("left")) {
            rotatedArr[len - 1] = arr[0];
            for(int i = 1; i < len; i++) {
                rotatedArr[i - 1] = arr[i];
            }
        }
        else if (rotationType.equals("right")) {
            rotatedArr[0] = arr[len - 1];
            for (int i = 0; i < len - 1; i++) {
                rotatedArr[i + 1] = arr[i];
            }
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] arrN = {1,2,3,4,5};
        int[] rotatedArr = rotateAnArray(arrN, "right");
        System.out.println("The rotated array is: ");
        for(int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
