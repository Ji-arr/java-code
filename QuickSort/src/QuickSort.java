import java.util.Random;
import java.util.Arrays;

class QuickSort {
    /*

    //PIVOT = LAST ELEMENT
    int partition(int intArray[], int low, int high) { 

        int pivot = intArray[high];  
        int i = low; // smaller element index  

        for (int j=low; j < high; j++) { 
            // check if current element is less than or equal to pi 
            if (intArray[j] < pivot) { 
                // swap intArray[i] and intArray[j]
                swap(intArray, i++, j); 
            } 
        } 
   
        // swap intArray[i+1] and intArray[high] (or pi) 
        swap(intArray, i, high);
        return i; 
    }

     */ 

    // PIVOT = FIRST ELEMENT
    int partition(int arr[], int low, int high)
    {
        // First element as pivot
        int pivot = arr[low];
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    } 

    
    void swap(int intArray[], int indexA, int indexB) {
        int temp = intArray[indexA];
        intArray[indexA] = intArray[indexB];
        intArray[indexB] = temp;
    }
   
  //routine to sort the array partitions recursively
    void quick_sort(int intArray[], int low, int high) { 
        if (low < high) { 

            //partition the array around pi=>partitioning index and return pi
            int pivot = partition(intArray, low, high); 
  
            
            // sort each partition using recursive function 
            quick_sort(intArray, low, pivot-1); 
            quick_sort(intArray, pivot+1, high); 
        } 
    } 
}
 
class Main{
    public static void main(String[] args) {

        //initialize a numeric array, intArray
        Random r = new Random();
        int intArray[] = new int[100]; 
        int n = intArray.length; 

        for (int i=0; i < n;i++)
        {
            intArray[i] = r.nextInt(100);
        }
        
        //print the original array
        System.out.println("Original Array: " + Arrays.toString(intArray));

        //call quick_sort routine using QuickSort object
        QuickSort obj = new QuickSort(); 
        obj.quick_sort(intArray, 0, n-1); 
        
        //print the sorted array
        System.out.println("\nSorted Array: " + Arrays.toString(intArray)); 
    } 
}
