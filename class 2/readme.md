/*
 * Given an array - you have to find the maximum and minimum of it?
 * test case [2, 5, 1, 9, 7],  min - 1, max - 9
 * 
 */

public class Main {
   public static void main(String... args) {
        // initialize an array with variable as arr
        // assign minimum number to first index value - 2, minVal = arr[0] so, minval - 2
        // iterating over the array -> arr[1] = 5, check that if 5 < 2 or not, we will skip here
        // same way arr[2] =, 1 < 2, yes so update minVal = arr[1] i.e. 1
        //  similary do same thing til, the last index
        // print the minVal


        
        //int[] arr = { 2, 5, 1, 9, 7 }; // declaration and initialization at one line

        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 5;
        arr[2] = 10;
        arr[3] = 11;
        arr[4] = 7;

        int minVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println("Minimum value is : " + minVal);
   }

// 


}