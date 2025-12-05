package writeAJavaProject;

import java.util.Scanner;

public class BMI_Calculator_U_S_Customary_Units_Adult {

	public static void main(String[] args) {
		
		System.out.println("Please enter the feet (ft) value in your height...");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		System.out.println(num1);

		System.out.println("Please enter the inches (in) value in your height...");
		double num2 = scanner.nextDouble();
		System.out.println(num2);

		System.out.println("Please enter your weight in pounds (lbs)...");
		double num3 = scanner.nextDouble();
		System.out.println(num3);

		double totalInches = (num1 * 12) + num2;

		double bmi = (num3 / (totalInches * totalInches) * 703);
		System.out.println("Your body mass index (BMI) is: " + bmi);
		
		if (bmi <= 18.4) {
			System.out.println("Your BMI Category is: Underweight (i.e. BMI Range Below 18.5)");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Your BMI Category is: Healthy Weight (i.e. BMI Range 18.5 to 24.9)");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("Your BMI Category is: Overweight (i.e. BMI Range 25.0 to 29.9)");
		} else {
			System.out.println("Your BMI Category is: Obesity (i.e. BMI Range 30.0 or greater)");
		}

	}

}
