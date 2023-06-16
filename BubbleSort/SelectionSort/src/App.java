public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {12, 3, 5, 6, 2, 4};
        int arrleng = arr.length;
        System.out.print("Unsorted Arr: ");
        printarr(arr);
        System.out.println();
        selectionsort_whileloop(arr, arrleng);
        System.out.print("Sorted Arr: ");
        printarr(arr);
        System.out.println();
    }

    private static void selectionsort_nestedforloop(int[] arr, int arrleng ){

        for (int i = 0; i < arrleng-1; i++){

            int min_index = i;

            for (int j = i + 1; j < arrleng; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            //swap elements
            swap(arr, i, min_index);
        }
    }

    private static void selectionsort_whileloop(int[] arr, int arrleng ){
        int i = 0;

        while(i < arrleng-1){
            //pointer to lowest element in the unsorted list
            int min_index = i;

            int j = i + 1;

                while( j < arrleng){
                    
                    if(arr[min_index] > arr[j]){
                        min_index = j;
                    }
                    
                    j++;
                }
                    //swap elements
                    swap(arr, i, min_index);
            i++;
        }
    }
    //swap func
    private static void swap(int[] arr, int indexI, int indexMin){
        int temp = arr[indexI]; 
        arr[indexI] = arr[indexMin];
        arr[indexMin] = temp;
    }

    //print every elements in the array
    private static void printarr(int [] arr){

        for(int i = 0; i < arr.length; i++){
            if(i < arr.length - 1 ){
                System.out.print(arr[i]+ ", ");
            }
            else{
                System.out.print(arr[i]);
            }

        }
    }
}