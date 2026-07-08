import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        sc.close();
    }
}
