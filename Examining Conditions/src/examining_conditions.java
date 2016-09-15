
public class examining_conditions {

	public static void main(String[] args) {
		int num1 = 23455;
		int num2 = 45671;
		String result;
		
		result =(num1 % 2 != 0) ? "odd" : "even";
		System.out.println(num1 + " " + "is" + " " + result);
		
		result = (num2 % 2 != 0) ? "odd" : "even";
		System.out.println(num2 + " " + "is" + " " + result);
		

	}

}
