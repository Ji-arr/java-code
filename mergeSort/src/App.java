import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i=0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After: ");
        printArray(numbers);
        System.exit(0);
    }
    private static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int middleIndex = inputLength / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[inputLength - middleIndex];

        for (int i = 0; i < middleIndex; i++){
            leftArray[i] = inputArray[i];
        }
        for (int i = middleIndex; i < inputLength; i++){
            rightArray[i - middleIndex] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge_elseif(inputArray, leftArray, rightArray);
    }

    // merge with triple while loop
    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while( i < leftSize && j < rightSize)
        {
            if(leftArray[i] <= rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            }
            else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftSize)
        {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightSize)
        {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // merge with while loop and if/else if statement.
    private static void merge_elseif(int[] inputArray, int[] leftArray, int[] rightArray){

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while( i < leftSize || j < rightSize){
            if( i < leftSize && j < rightSize){
                if(leftArray[i] <= rightArray[j]){
                    inputArray[k] = leftArray[i];
                    i++;
                }
                
                else {
                    inputArray[k] = rightArray[j];
                    j++;
                }
            k++;
            }

            else if(i < leftSize){
                inputArray[k] = leftArray[i];
                i++;
                k++;
            }
            else if(j < rightSize){
                inputArray[k] = rightArray[j];
                j++;
                k++;
            }

        }
    }

    private static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
