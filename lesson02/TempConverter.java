import java.util.Scanner;

public class TempConverter{
    static final double FACTOR = 9.0 / 5.0; // 1.8
    static final double OFFSET = 32;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * FACTOR + OFFSET;

        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", (fahrenheit - OFFSET) * 5.0 / 9.0);        
        sc.close();
    }
}    


