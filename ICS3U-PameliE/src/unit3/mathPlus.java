package unit3;

public class mathPlus {

	public static void mainMethod(String[] args) {

	}


	/**
	 * (Description)
	 * 
	 * @param x1 -> point 1 on x axis
	 * @param y1 -> point 1 on y axis
	 * @param x2 -> point 2 on x axis
	 * @param y2 -> point 2 on y axis
	 * @return -> distance between two points 
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		double answer = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return answer;
	}



	public static double hypotenuse(double a, double b) {
		double answer = Math.sqrt((Math.pow(a,  2)) + Math.pow(b,  2));
		return answer;

	}

	public static int numOfFactors(int num1, int num2, int counter) {
		num2 = num1/2;
		for (int i = 0; i < num2; i++){
			if ((num1 % i) == 0){
				counter++;
			}
			
		}
		return counter;

	}

	public static void isPrime(String[] args) {
		// TODO Auto-generated method stub
	}
}
