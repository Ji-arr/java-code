public class App {

    public static void main(String[] args) throws Exception {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Element is at index " + BinarySearch(arr, 7));

        System.out.println("Element is at index " + binarySearchwithrec(arr,0 , arr.length-1,  8));

    }
    public static int BinarySearch(int arr[], int num){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid_ind = (start + end) / 2;
            int mid_value = arr[mid_ind];

            if(num == mid_value ){
                return mid_ind;
            }
            else if(num > mid_value ){
                start = mid_ind + 1;
            }
            else {
                end = mid_ind - 1;
            }
        }
        return -404;       
    }

    public static int binarySearchwithrec(int arr[], int s, int e, int num){

            //base case
            if(s > e){
                return -404;
            }
            
                int mid_ind = (s + e) / 2;
                int mid_value = arr[mid_ind];
                
                if(num == mid_value){
                    return mid_ind;
                }
                else if(num < mid_value){
                    return binarySearchwithrec(arr, s, mid_ind-1, num);
                }
                else {
                    return binarySearchwithrec(arr, mid_ind+1, e, num);
                }
   

        }
}
