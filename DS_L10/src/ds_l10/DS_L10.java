/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l10;

/**
 *
 * @author Syaamil Faiq
 */
public class DS_L10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        int[] arr2 = {10,34,2,56,7,67,88,42};
        System.out.println("Initial Array: ");
        printArray(arr);
        System.out.println("\nAfter sorting: ");
        selectionSortSmallest(arr);
        printArray(arr);
        selectionSortLargest(arr);
        printArray(arr);
        
        System.out.println("\nQ4");
        System.out.println("Initial Array: ");
        printArray(arr2);
        System.out.println("\nAfter sorting: ");
        insertionSort(arr2);
        printArray(arr2);
    }
    
    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");
    }
    
    public static void selectionSortSmallest(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin = arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > arr[j]) {
                currentMin = arr[j];
                currentMinIndex = j;
                }
            }
            
            if (currentMinIndex != i) {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
    
    public static void selectionSortLargest(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMax = arr[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMax < arr[j]) {
                currentMax = arr[j];
                currentMaxIndex = j;
                }
            }
            
            if (currentMaxIndex != i) {
                arr[currentMaxIndex] = arr[i];
                arr[i] = currentMax;
            }
        }
    }
    
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currentElement = arr[i];
            int k;
            for(k=i-1;k>=0 && arr[k] > currentElement;k--){
                arr[k+1]=arr[k];
            }
            
            arr[k+1] = currentElement;
        }
    }
}
