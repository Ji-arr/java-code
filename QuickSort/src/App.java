import java.util.Random;

public class App {
    static String input; 
    public static void main(String[] args) throws Exception {

        Random r = new Random();
        int[] numbers = new int[1000000];

        //assign random int to array
        for (int i = 0; i < numbers.length; i++)
        
            {
                numbers[i] = r.nextInt(10000000);
            }

        
        System.out.println("Unsorted Array: ");
        printArray(numbers);
        quickSortWithRecursion( 0, numbers.length - 1, numbers);
 
        System.out.println("Sorted Array: ");
        printArray(numbers);
        System.exit(0);
    }

    static void quickSortWithRecursion(int low, int high, int[] arr) {
        if (low >= high) return;

        int left = low, right = high;
        /* 
        !! TO CHANGE PIVOT !! 
        //middle index as pivot
        int pivot = arr[(low+high)/2];
        
        //first element as pivot
        int pivot = arr[low];
        
  
        
        //random index as pivot
        Random rand= new Random();
        int random = rand.nextInt(high-low)+low;
        int pivot = arr[random];
       
        */

              //last element as pivot
              int pivot = arr[high];


        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left > right) break;

            swap(left, right, arr);
            left++;
            right--;
        }

        quickSortWithRecursion(low, right, arr);
        quickSortWithRecursion(left, high, arr);
    }
    
    //swap elements
    static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //print array of int 
    private static void printArray(int[] numbers)
    {
        for (int i = 0; i< numbers.length; i++)
        {
            System.out.print(" " + numbers[i]);
        }
        System.out.print("\n");
    }
}
