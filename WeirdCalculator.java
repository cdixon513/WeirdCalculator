import java.util.Scanner;

public class WeirdCalculator{
	public static void main(String[] args){
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Give me an integer: ");
		num1 = scanner.nextInt();
		System.out.print("Give me another integer: ");
		num2 = scanner.nextInt();

		System.out.printf("%15s", "Sum:");
		System.out.printf("%10d\n", num1 + num2);
		System.out.printf("%15s", "Difference:");
		System.out.printf("%10d\n", num1 - num2);
		System.out.printf("%15s", "Product:");
		System.out.printf("%10d\n", num1 * num2);
		System.out.printf("%15s", "Average:");
		System.out.printf("%10.2f\n", (num1 + num2)/2.0);
		System.out.printf("%15s", "Distance:");
		System.out.printf("%10d\n", Math.abs(num1 - num2));
		System.out.printf("%15s", "Max:");
		System.out.printf("%10d\n", Math.max(num1, num2));
		System.out.printf("%15s", "Min:");
		System.out.printf("%10d\n", Math.min(num1, num2));
	}
}