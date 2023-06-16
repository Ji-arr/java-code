public class App {
    public static void main(String[] args) throws Exception {
        int [] arr = {1, 2, 4, 5, 101, 9, 10};
        int arrleng = arr.length;
        System.out.print("Unsorted array: ");
        print(arr);
        bubblesort_nestedforloop(arr, arrleng);
        System.out.println();
        System.out.print("Sorted array: ");
        print(arr);
    }

        //bubble sort using nested for loop
        private static void bubblesort_nestedforloop(int[] arr, int arrleng){
            boolean swapElem = true;


            int i, j;

            for(i = 0; swapElem && i < arrleng-1;i++){
                swapElem = false;
                for(j = 0; j < arrleng-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        swapElem = true;
                        swap(j, j+1, arr);
                    }
                }
            }   
            

        }

        //bubble sort using do-while loop
        private static void bubblesort_doWhile(int[] arr, int arrleng){
            boolean swapElem = true;

            int j;

            //do-while loop to sort array
            do{
                swapElem = false;
                for(j = 0; j < arrleng-1;j++){
                    if(arr[j] > arr[j+1]){
                        swapElem = true;
                        swap(j, j+1, arr);
                    }
                }
            }while(swapElem);

        }
    //swap elements
    private static void swap(int indexA, int indexB, int[] arr){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    //print every elements in the array
    private static void print(int [] arr){

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
