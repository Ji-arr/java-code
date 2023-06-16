
public class App {
    public static void main(String[] args) throws Exception {
        int i = 10;
		System.out.println(addition(i));
    }
    static int addition(int a) {
		int sum = a + 5;
		if (sum == 50){
			return 0;
		}
		return sum;
	}
}
