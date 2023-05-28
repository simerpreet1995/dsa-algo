
// solving this question using brute force technique

public class ReverseNumber {

    public static void main(String[] args) {

        // reverse given number of an array;

        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10 };

        // for(int i=arr.length-1; i >=0; i--){
        // System.out.print(arr[i] + " ");
        // }

        // make a new array
        // and reverse the looping
        // and store into it.

        int indexArr2 = 0;
        int arr2[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[indexArr2] = arr[i];
            indexArr2++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}