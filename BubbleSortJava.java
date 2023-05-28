import java.io.*;

class BSort{

    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i< n-1; i++){
            swapped = false;
            for(j = 0; j< n-i - 1; j++){
                if (arr[j] > arr[j + 1]){

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]= temp;
                    swapped = true;
                }
            }
        }
    }
    static void printArray(int arr[], int size){
        int i;
        for(i = 0; i< size ; i++){
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
    }



    public static void main(String args[]){
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        System.out.println("Pre sort: ");
        printArray(arr, n);
        System.out.println("Post sort: ");
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}