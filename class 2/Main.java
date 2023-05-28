public class Main {

    public static void main(String[] main) {
        
        // find min value in given array 

        /* we assume that array of first position as min val
        than loop it throght out array
        checck while looping throght loop if we find smaller than previous than update it
        check condition 
        at last print print the result
        
        */

        // int arr[] = {501, 555, 445, 55, 45, 05, 50};
        // int minVal = arr[0];

        // for (int i=0; i< arr.length; i++) {
        //     if(arr[i] < minVal){
        //         minVal = arr[i];
        //     }
        // }
        // System.out.println("minmium value is " + minVal);

        
        // find the maximum number in array;


        int arr1[] = {45, 108, 99, 4444, 420, 448, 1001, 2001};
        int maxVal = arr1[0];

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > maxVal){
                maxVal = arr1[i];
            }
        }
        System.out.println("max value is " + maxVal);
    }
}