import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        
        try{
            //prompt user for input
            System.out.print("Input Lower Limit: "); 
            //store user input
            int lower = s.nextInt();                       
            System.out.print("Input Upper Limit: ");
            int upper = s.nextInt();

            //validate inputs
            if (lower > upper) {
                s.close();

                //throw arithmetic error
                throw new ArithmeticException("Lower limit must be less than Upper limit"); 
            }

            //store value from a function using return type
            int summation_ = summation_notation(lower, upper);    

            System.out.println("Summation: " + summation_);
            s.close();     

        }catch(Exception e) {
            //throw error if input is invalid
            System.out.println("invalid input!");
            System.out.println(e);
        }
    }

    //function or method for logic; return the summation
    public static int summation_notation(int lower, int upper){
        int sum = 0; 
            for (int i = lower; i <= upper; i++) {
                sum += i+i;
            }
        return sum;
    }
   
}
