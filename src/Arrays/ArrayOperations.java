package Arrays;

/*
* Rotate an array - either left or right, 12345 -> left 23451, right 51234
* Insert an element in array in a given location
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

    static int[] insertAnElementToArray(int[] arr, int insertTo, int val) {
        int[] insertedArray = new int[arr.length];
        for(int i = 0; i < insertTo; i++)
            insertedArray[i] = arr[i];
        for(int j = insertTo; j < 7; j++) {
            insertedArray[j + 1] = arr[j];
        }
        insertedArray[insertTo] = val;
        return insertedArray;
    }

    public static void main(String[] args) {
        int[] arrN = {1,2,3,4,5}; // use for rotation
        int[] arrN2 = new int[10];
        for(int i = 0; i < 6; i++) {   // Insert only 6 places, 4 places empty
            arrN2[i] = i + 1;
        } // Use for insertion and deletion
        int insertTo = 2;   // insert at index 2
        int deleteFrom = 2; // delete from index 2
        int val = 15;       // Insert or delete value
        int[] rotatedArr = rotateAnArray(arrN, "right");
        System.out.println("The rotated array is: ");
        for (int j : rotatedArr) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] afterInsert = insertAnElementToArray(arrN2, insertTo, val);
        System.out.println("The array before insertion is: ");
        for(int i: arrN2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The new array after insertion is: ");
        for(int i: afterInsert) {
            System.out.print(i + " ");
        }
    }
}
