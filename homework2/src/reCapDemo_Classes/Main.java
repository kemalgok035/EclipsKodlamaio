package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		int resultAdd = dortIslem.Add(3, 4);
		System.out.println(resultAdd);
		int resultSubtract = dortIslem.Subtract(3, 4);
		System.out.println(resultSubtract);
		int resultMultiply = dortIslem.Multiply(3, 4);
		System.out.println(resultMultiply);
		double resultDivide = dortIslem.Divide(3.0, 4.0);
		System.out.println(resultDivide);

	}

}
